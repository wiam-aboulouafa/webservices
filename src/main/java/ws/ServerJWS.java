package ws;

import javax.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        String url ="http://0.0.0.0:8787/";
        Endpoint.publish(url, new Banqueservice());
        System.out.println("Web service deploye sur "+url );
    }
}
