package com.salf.service;

import com.salf.dao.UserAddNewsDao;
import com.salf.entity.News;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
public class UserAddNewsServiceImp implements UserAddNewsService {
    @Autowired
    private UserAddNewsDao userAddNewsDao;

    public UserAddNewsDao getUserAddNewsDao() {
        return userAddNewsDao;
    }

    public void setUserAddNewsDao(UserAddNewsDao userAddNewsDao) {
        this.userAddNewsDao = userAddNewsDao;
    }

    public void useraddnews(int id, String title, String date, MultipartFile addFile, HttpServletRequest request, String main) {

            //获取存的路径
            String path = request.getSession().getServletContext().getRealPath("/");
            //IO 写入位置
            File file = new File(path);

            String webappsPath = file.getParent();

            File uploadPath = new File(webappsPath + "/vido");
            if(!uploadPath.exists()) uploadPath.mkdir();

            String oldname = addFile.getOriginalFilename();
            String[] split = oldname.split(".");

            String lastname = FilenameUtils.getExtension(oldname);

            UUID uuid = UUID.randomUUID();
            String newname = uuid.toString();
            String newnames = newname + "." +lastname;

            try {
                addFile.transferTo(new File(uploadPath.getPath(),newnames));
            } catch (IOException e) {
                e.printStackTrace();
            }

           /* Album al = new Album();
            al.setDownPath(uploadPath.getPath()+ "/" + newname);
            al.setId(newname);
            al.setParent_id(id);
            al.setTittle(name+split[1]);
            al.setSize("120 MB");*/

            News news = new News();
            news.setTitle(title);
            news.setMain(main);
            news.setDate(date);
            news.setImg_src(uploadPath.getPath()+ "/" + newname);

            userAddNewsDao.add(news);

        }

}
