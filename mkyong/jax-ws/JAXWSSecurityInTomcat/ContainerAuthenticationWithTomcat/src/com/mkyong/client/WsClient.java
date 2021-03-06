package com.mkyong.client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

import com.mkyong.ws.UserProfile;

public class WsClient{

        //can't parse wsdl "http://localhost:8080/WebServiceExample/user.wsdl" directly
	//save it as local file, and parse it
	private static final String WS_URL = "file:d://user.wsdl";
		
	public static void main(String[] args) throws Exception {
	   
	URL url = new URL(WS_URL);
        QName qname = new QName("http://ws.mkyong.com/", "UserProfileImplService");

        Service service = Service.create(url, qname);
        UserProfile port = service.getPort(UserProfile.class);
        
        //add username and password for container authentication
        BindingProvider bp = (BindingProvider) port;
        bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "mkyong");
        bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "123456");

        System.out.println(port.getUserName());
       
    }

}