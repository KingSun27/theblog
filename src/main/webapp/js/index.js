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

            for(var i = 0; i<data.length;i++){
                title =  $("<b></b>").text(data[i].title);
                content =  $("<i></i>").text(data[i].content);
                $("#text-start").after(title,"<br>",content,"<br>");

            }
        }
    });
});
