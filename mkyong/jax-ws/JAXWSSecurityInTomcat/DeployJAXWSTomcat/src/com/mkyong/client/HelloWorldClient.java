package com.mkyong.client;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import com.mkyong.ws.HelloWorld;
import java.util.Map;

public class HelloWorldClient{
	
	static {
	    //for localhost testing only
	    javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
	    new javax.net.ssl.HostnameVerifier(){

	        public boolean verify(String hostname,
	                javax.net.ssl.SSLSession sslSession) {
	            if (hostname.equals("localhost")) {
	                return true;
	            }
	            return false;
	        }
	    });
	}
	
	public static void main(String[] args) throws Exception {
	   
		
		
		
		try {        
		    final String username = "robbie";
		    final String password = "password";
		    Authenticator.setDefault(new Authenticator() {
		        @Override
		        protected PasswordAuthentication getPasswordAuthentication() {
		            return new PasswordAuthentication(
		                    username,
		                    password.toCharArray());
		        }
		    });	
		    URL url = new URL("https://localhost:8443/DeployJAXWSTomcat/hello?wsdl");
	
	        //1st argument service URI, refer to wsdl document above
			//2nd argument is service name, refer to wsdl document above
	        QName qname = new QName("http://ws.mkyong.com/", "HelloWorldImplService");
	
	        Service service = Service.create(url, qname);
	
	        HelloWorld hello = service.getPort(HelloWorld.class);
	
	        Map<String, Object> requestContext = ((BindingProvider) hello).getRequestContext();
	        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url.toString());
	        requestContext.put(BindingProvider.USERNAME_PROPERTY, username);
	        requestContext.put(BindingProvider.PASSWORD_PROPERTY, password);
	        System.out.println(hello.getHelloWorldAsString());
		} catch (Exception e) {
        	System.err.println(e);
		}
    }

}