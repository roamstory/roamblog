package net.helloworld;

public class WebServerLauncher {
	public static void main(String[] args) throws Exception {
//        String webappDirLocation = "webapp/";
//        Tomcat tomcat = new Tomcat();
//        tomcat.setPort(8080);
//        Connector connector = tomcat.getConnector();
//        connector.setURIEncoding("UTF-8");
//        StandardContext ctx = (StandardContext) tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
        
        
        // Declare an alternative location for your "WEB-INF/classes" dir
        // Servlet 3.0 어노테이션 작동
        // 참고 : http://stackoverflow.com/questions/11669507/embedded-tomcat-7-servlet-3-0-annotations-not-working
//        File additionWebInfClasses = new File("target/classes");
//        WebResourceRoot resources = new StandardRoot(ctx);
//        resources.addPreResources(new DirResourceSet(resources, "/WEB-INF/classes", additionWebInfClasses.getAbsolutePath(), "/"));
//        ctx.setResources(resources);
//  
//        tomcat.start();
//        tomcat.getServer().await();
	}
}
