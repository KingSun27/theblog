# theblog
目标是做一个博客&计划表  
用于巩固开发技能，以及用于安排自己的生活进度。  
添加spring-boot-devtools进行热更新  
使用spring-cache管理缓存，由于实现是基于 proxy 的 spring aop，所以内部调用会失效。
使用application.yml代替application.properties,这两个都是spring支持的配置文件格式，但是yml明显更清晰。
使用 spring: main: banner-mode: "off"可以关闭banner，在classpath路径添加banner.txt可以替换banner。


参考：
https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/
粗略的看到了2.4.6明天继续

