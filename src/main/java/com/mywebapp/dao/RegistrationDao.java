package com.mywebapp.dao;

import com.mywebapp.model.Member;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.Date;


public class RegistrationDao {

    public void registerUser(String firstName, String lastName, String email, String userName, String password) {
        try {

            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();

            Member member = new Member();

            member.setFirstName(firstName);
            member.setLastName(lastName);
            member.setEmail(email);
            member.setUserName(userName);
            member.setUserPassword(password);
            member.setRegistrationDate(new Date());
            session.save(member);
            transaction.commit();

        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            System.out.println("error");
        }

    }
}
