package com.epam.REST;

//import com.epam.SOAPService.domain.Mail;
//import com.epam.SOAPService.service.MailServiceImpl;
//import com.google.gson.Gson;
//import org.apache.log4j.Logger;
//
//import javax.ws.rs.*;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//
//@Path("/mailService")
public class MailServiceREST {
//    private static final Logger LOG = Logger.getLogger(MailServiceREST.class);
//    private Gson gson;
//    private MailServiceImpl mailServiceImpl;
//
//    public MailServiceREST(Gson gson, MailServiceImpl mailServiceImpl) {
//        gson = new Gson();
//        mailServiceImpl = new MailServiceImpl();
//    }
//
//    @GET
//    @Path("/getAllMails")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response getAll() {
//        return Response.ok(gson.toJson(mailServiceImpl.getAllLetters())).build();
//    }
//
//    @GET
//    @Path("/getAllMailsBySubject")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response getAllMailBySubject(@FormParam("subject") String subject) {
//        return Response.ok(gson.toJson(mailServiceImpl.getAllBySubject(subject))).build();
//    }
//
//    @GET
//    @Path("/getMailById")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response getMailById(@FormParam("id") Integer id){
//        return Response.ok(gson.toJson(mailServiceImpl.getMailById(id))).build();
//    }
//
//    @POST
//    @Path("/addMail")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response addMail(@FormParam("mail") Mail mail) {
//        return Response.ok(gson.toJson(mailServiceImpl.addMail(mail))).build();
//    }
//
//    @DELETE
//    @Path("/deleteMail")
//    @Produces(MediaType.APPLICATION_JSON)
//    public  Response deleteMail(@FormParam("id") Integer id){
//        return Response.ok(gson.toJson(mailServiceImpl.deleteMail(id))).build();
//    }
}
