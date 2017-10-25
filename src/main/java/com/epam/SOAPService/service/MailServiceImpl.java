package com.epam.SOAPService.service;

import com.epam.SOAPService.DAO.MailDAO;
import com.epam.SOAPService.domain.Mail;
import com.epam.SOAPService.response.MailWSResponse;
import com.epam.SOAPService.response.MailWSStatus;

import org.apache.log4j.Logger;

import javax.jws.WebService;

@WebService(endpointInterface = "com.epam.SOAPService.service.MailService")
public class MailServiceImpl implements MailService {
    private static final Logger LOG = Logger.getLogger(MailServiceImpl.class);

    private MailDAO mailDao;

    public MailServiceImpl() {
        mailDao = new MailDAO();
    }

    @Override
    public MailWSResponse getAllLetters() {
        Object[] results = mailDao.getAllLetters().toArray();
        if (results.length != 0) {
            return MailWSResponse.success(MailWSStatus.GET_ALL_MAIL_MSG, results);
        }
        return MailWSResponse.fault(MailWSStatus.NO_MAIL_MSG);
    }

    @Override
    public MailWSResponse getAllBySubject(String subject) {
        Object[] results = mailDao.getAllBySubject(subject).toArray();
        if (results.length != 0) {
            return MailWSResponse.success(MailWSStatus.GET_MAIL_BY_SUBJECT_MSG, results);
        }
        return MailWSResponse.fault(MailWSStatus.NO_SUCH_SUBJECT_MSG);
    }

    @Override
    public MailWSResponse getMailById(Integer id) {
        Mail result = mailDao.getMailById(id);
        if (result != null) {
            return MailWSResponse.success(MailWSStatus.GET_MAIL_BY_ID_MSG, result);
        }
        return MailWSResponse.fault(MailWSStatus.NO_SUCH_MAIL_MSG);
    }

    @Override
    public MailWSResponse deleteMail(Integer id) {
        boolean result = mailDao.delete(id);

        if (result) {
            return MailWSResponse.success(MailWSStatus.DELETE_MAIL_MSG, result);
        }

        return MailWSResponse.fault(MailWSStatus.NO_DELETE_MAIL_MSG);
    }

    @Override
    public MailWSResponse addMail(Mail mail) {
        boolean result = mailDao.add(mail);
        if (result) {
            return MailWSResponse.success(MailWSStatus.ADD_NEW_MAIL_MSG, result);
        }
        return MailWSResponse.fault(MailWSStatus.NOT_CORRECT_ARGUMENTS_MSG);
    }
}
