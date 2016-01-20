package com.mkyong.endpoint;
 
import javax.xml.ws.Endpoint;
import com.mkyong.ws.ServerInfo;

//Endpoint publisher
public class WsPublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:8887/ws/server", new ServerInfo());
	   
	   System.out.println("Service is published!");
    }
 
}