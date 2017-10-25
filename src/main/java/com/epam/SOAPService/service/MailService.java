package com.epam.SOAPService.service;

import com.epam.SOAPService.domain.Mail;
import com.epam.SOAPService.response.MailWSResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface MailService {
    @WebMethod()
    MailWSResponse getAllLetters();

    @WebMethod()
    MailWSResponse getAllBySubject(@WebParam(partName ="subject")String subject);

    @WebMethod()
    MailWSResponse getMailById(@WebParam(partName ="id")Integer id);
    @WebMethod()
    MailWSResponse deleteMail(
            @WebParam(partName ="id") Integer id);
    @WebMethod()
    MailWSResponse addMail(
            @WebParam(partName ="newLetter")Mail mail);

}