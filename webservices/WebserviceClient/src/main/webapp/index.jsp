<%@page import="dxc.WebserviceDemo.Hello"%>
<%@page import="dxc.WebserviceDemo.HelloService"%>
<%@page import="dxc.WebserviceDemo.HelloServiceLocator"%>
<html>
<body>
    <h2>Jersey RESTful Web Application!</h2>
    <p><a href="webapi/myresource">Jersey resource</a>
    <p>Visit <a href="http://jersey.java.net">Project Jersey website</a>
    for more information on Jersey!
    
    <%
    	HelloServiceLocator locator=new HelloServiceLocator();
    	Hello proxy = locator.getHello();
    	out.println(proxy.sayHello());
    %>
</body>
</html>
