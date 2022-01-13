/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

import Business.DeliveryMan.DeliveryMan;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Pratik Gawand
 */
public class UltilityHelper {

    public static boolean isValid(String email) {
        try {
            String emailFormate = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\."
                    + "[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";

            Pattern p = Pattern.compile(emailFormate);
            if (email == null) {
                return false;
            }
            return p.matcher(email).matches();
        } catch (Exception e) {
            System.out.println("Error in parsing email" + e.getMessage());

        }
        return false;

    }

    public static void sendEmail(String messageStr, String subject, String email) {
        if (isValid(email)) {
            String fromEmail = "donationecosystem@gmail.com";
            String emailPassword = "Aed@12345678";

            Properties properties = new Properties();
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", "587");

            Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(fromEmail, emailPassword);
                }
            });

            try {
                MimeMessage message = new MimeMessage(session);
                message.setFrom(new InternetAddress(fromEmail));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
                message.addRecipient(Message.RecipientType.BCC, new InternetAddress(fromEmail));
                message.setSubject(subject);
                message.setText(messageStr);
                Transport.send(message);
            } catch (Exception ex) {
                System.out.println("Error in sending email" + ex.getMessage());
            }
        }

    }
}
