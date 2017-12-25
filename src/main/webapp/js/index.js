/**
 * Created by yangjin on 17/09/2017.
 */
$(function(){
//展示首页的博客列表
    $.ajax({
        type: "GET",
        url: "/theBlog/blog",
        data: {},
        dataType: "json",
        success: function(data){
            var title;
            var content;
            var viewdetails= "<a class='btn' href='#'>View details »</a>";
            var editView= "<a class='btn' href='#'>operate </a>";
            var deleteButton = "<a class='btn' href='#'>delete</a>";

            for(var i = 0; i<data.length;i++){
                title =  $("<h2></h2>").text(data[i].title);
                content =  $("<p></p>").text(data[i].content);
                $("#text-start").after(title,
                		content,viewdetails,editView,deleteButton
                );

            }
        }
    });
});

$("#pushNewBlog").click(function(){
	 $.ajax({
	        type: "POST",
	        url: "/theBlog/blog",
	        data: $('#newBlogForm').serialize(),
	        dataType: "json",
	        success: function(data){
	        	$('#writeNewModel').modal('hide')
	        },
	        error: function(data){
	        	$("#error").alert()

	        }
	 
	    });
});
