package com.pet.tools;

import com.sun.net.ssl.internal.ssl.Provider;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.security.Security;
import java.util.Date;
import java.util.Properties;


public class MailSender {

    private static MimeMessage message;
    public static String checknum;

    public static void main(String[] args) throws MessagingException {
        checknum = DB.getRandomNumbers();
        Security.addProvider(new Provider());
        final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
        //163邮箱服务器
        String smtpHost="smtp.163.com";
        //邮箱用户名，即163账号
        final String username = "y15770703509@163.com";
        //邮箱授权码
        final String password = "vae519520yh";
        //要发送到的邮箱
        String to = args[0];
        //自己的邮箱
        String from = "y15770703509@163.com";
        Transport transport;

        Properties props = new Properties();
        props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.port", "994");
        props.setProperty("mail.smtp.socketFactory.port", "994");
        props.setProperty("mail.smtp.auth", "true");
        props.put("mail.smtp.host",smtpHost);
        props.put("mail.smtp.username", username);
        props.put("mail.smtp.password", password);
        Session session = Session.getDefaultInstance(props,  new Authenticator() {
            //身份认证
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        InternetAddress[] addresses = {new InternetAddress(to)};
        message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.setRecipients(Message.RecipientType.TO,addresses);
        //邮件标题
        message.setSubject("注册验证");
        message.setSentDate(new Date());
        message.setText(checknum);
        transport = session.getTransport("smtp");
        transport.connect(smtpHost, username, password);
        transport.send(message);
        System.out.println("验证发送成功");
    }
}