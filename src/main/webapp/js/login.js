/**
 * Created by yangjin on 09/10/2017.
 */

$("#pushNewBlog").click(function(){
	 $.ajax({
	        type: "POST",
	        url: "/blog",
	        data: $('#loginForm').serialize(),
	        dataType: "json",
	        success: function(data){
	        	
	        },
	        error: function(data){
	        	$("#error").alert()

	        }
	 
	    });
});