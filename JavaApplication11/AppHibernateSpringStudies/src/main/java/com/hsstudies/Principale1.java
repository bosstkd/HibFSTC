/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hsstudies;

import com.hsstudies.apps.Adresse;
import com.hsstudies.apps.Client;
import com.hsstudies.apps.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Amine
 */
public class Principale1 {
    public static void main(String[] args){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            List<Client> cltLst = session.createQuery("from Client").list();
            System.out.println("-------------------");
            for(Client clt:cltLst){
                System.out.println("Client: "+clt.getId()+" "+clt.getNom()+"\n  "+clt.getAdresse());
            }
            
            tx.commit();
           
        } catch (Exception e) {
            tx.rollback();
            throw e;
        }
        
        
    }
}
