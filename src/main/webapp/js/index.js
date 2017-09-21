/**
 * Created by yangjin on 17/09/2017.
 */
$(function(){

    $.ajax({
        type: "GET",
        url: "/blog",
        data: {},
        dataType: "json",
        success: function(data){
            var title;
            var content;
            var viewdetails= "<a class='btn' href='#'>View details »</a>";
            for(var i = 0; i<data.length;i++){
                title =  $("<h2></h2>").text(data[i].title);
                content =  $("<p></p>").text(data[i].content);
                $("#text-start").after(title,
                		content,viewdetails
                );

            }
        }
    });
});

$("#pushNewBlog").click(function(){
	 $.ajax({
	        type: "POST",
	        url: "/blog",
	        data: $('#newBlogForm').serialize(),
	        dataType: "json",
	        success: function(data){
	        	$('#writeNewModel').modal('hide')

	        }
	    });
});