$(function(){
	var url = "http://localhost:8080/query/news";
	$.post(url, function(data){
		var jsonData = eval(data);
		var l1 = "";
		var l2 = "";
        for (var i = 0; i < jsonData.length; i++) {
        	if(i%2 != 0){
        		l1 = "<li id='news-four-one-nei'/><p class='nei-one-a'><strong>" + jsonData[i].title + "</strong> <span>2017.7.26</span></p><p class='nei-one-b'>" + jsonData[i].main + "</p></li>";
        		$("#new").append(l1);
        	}else{
        		l2 = "<li id='news-four-one-nei'/><p class='nei-one-a'><strong>" + jsonData[i].title + "</strong> <span>2017.7.26</span></p><p class='nei-one-b'>" + jsonData[i].main + "</p></li>";
        		$("#news").append(l2);
       		 }
        }
	},"json");
})