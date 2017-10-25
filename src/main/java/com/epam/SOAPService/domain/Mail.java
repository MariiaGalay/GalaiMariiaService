package com.epam.SOAPService.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "mail")
public class Mail {
    public Mail() {
    }

    private Integer id;
    private String email;
    private String subject;
    private String body;

    public Mail(Integer id,String email, String subject, String body) {
        this.id = id;
        this.email = email;
        this.subject = subject;
        this.body = body;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
