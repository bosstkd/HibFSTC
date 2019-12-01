/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hsstudies;

import com.hsstudies.apps.Client;
import com.hsstudies.apps.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Amine
 */
public class Principale {
    public static void main(String[] args){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx=null;
        try {
            Client monClient = new Client();
            monClient.setNom("Amine");
            tx = session.beginTransaction();
            session.save(monClient);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            throw e;
        }finally{
            session.close();
        }
    }
}
