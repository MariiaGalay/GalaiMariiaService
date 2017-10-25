package com.epam.SOAPService.service;

import javax.xml.ws.WebFault;

@WebFault
public class MailWedFault extends Exception {
    private static final long serialVersionUID = 1L;
}
