package com.epam.SOAPService.DAO;

import com.epam.SOAPService.domain.Mail;
import org.apache.log4j.Logger;

import java.util.ArrayList;


public class MailDAO {
    private static ArrayList<Mail> mailMessages;
    private static final Logger LOG = Logger.getLogger(MailDAO.class);

    public MailDAO() {
        initialListOfLetters();
    }

    private void initialListOfLetters() {
        mailMessages = new ArrayList<Mail>();
        mailMessages.add(new Mail(0, "olena@gmail.com", "Auto", "Hello! Have a nice day!"));
        mailMessages.add(new Mail(1, "lviv@gmail.com", "Auto", "Hello! Have a nice day!"));
        mailMessages.add(new Mail(2, "epam@gmail.com", "Auto", "Hello! Have a nice day!"));
        mailMessages.add(new Mail(3, "mariia@gmail.com", "Auto", "Hello! Have a nice day!"));

    }

    private boolean isValidMail(Mail mail) {
        if (mail != null) {
            LOG.info("Validation mail");
            return true;
        }
        return false;
    }

    public boolean add(Mail mail) {
        if (isValidMail(mail)) {
            if (getMailById(mail.getId()) != null) {
                delete(mail.getId());
            }
            mailMessages.add(mail);
            LOG.info("Aded new mail");
            return true;
        }
        LOG.info("Doesn`t add new mail");
        return false;
    }

    public ArrayList<Mail> getAllLetters() {
        return mailMessages;
    }

    public boolean delete(int id) {
        for (Mail letter : mailMessages) {
            if (letter.getId() == id) {
                mailMessages.remove(letter);
                LOG.info("Deleted mail with id " + id);
                return true;
            }
        }
        LOG.info("Doesn`t deleted mail with id " + id);
        return false;
    }

    public Mail getMailById(Integer id) {
        for (Mail mail : mailMessages) {
            if (mail.getId() == id) {
                LOG.info("get Mails by id " + id);
                return mail;
            }
        }
        return null;
    }

    public ArrayList<Mail> getAllBySubject(String subject) {
        ArrayList<Mail> list = new ArrayList<>();
        for (Mail letter : mailMessages) {
            if (letter.getSubject().equals(subject)) {
                list.add(letter);
            }
        }
        LOG.info("Get mails by Subject");
        return list;
    }
}

