package com.epam.SOAPService;
import com.epam.SOAPService.service.MailServiceImpl;

import javax.xml.ws.*;

public class main {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:4444/service/mailservice", new MailServiceImpl());
        System.out.println("SOAP service started");
    }
}
