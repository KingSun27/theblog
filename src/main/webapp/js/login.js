/**
 * Created by yangjin on 09/10/2017.
 */

$("#loginButton").click(function(){
	 $.ajax({
	        type: "POST",
	        url: "/theBlog/auth/login",
	        data: $('#loginForm').serialize(),
	        dataType: "json",
	        success: function(data){
	        	if(data.code == 0){
					console.log('登录成功');
					window.location.href = 'index.html';//跳转到首页
				}else{
					popup({
						title: "提示",
						level: 'normal',
						msg: data.message
					});

				}
	        },
	        error: function(data){
	        	$("#error").alert()

	        }
	 
	    });
});