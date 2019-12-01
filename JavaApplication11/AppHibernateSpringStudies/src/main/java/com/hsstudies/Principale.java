/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hsstudies;

import com.hsstudies.apps.Client;
import com.hsstudies.apps.Adresse;
import com.hsstudies.apps.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Amine
 */
public class Principale {
    public static void main(String[] args){
       // Session session = HibernateUtil.getSessionFactory().openSession();
       Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        System.out.println("Etat session: "+session.isOpen());
        Transaction tx=null;
        try {
            Client monClient = new Client();
            String[] strTab = {"Amine","Mohammed", "Mahmoudi", "Yassine", "Hamza", "Ilyess", "Amar"};
            monClient.setNom(strTab[(int)(Math.random() * 7)]);
            
            
            String[] villeTab = {"ElTarf","Annaba", "Paris", "Lyon", "Alger", "Oran", "Constantine"};
            String[] codePostalTab = {"36000","23000", "75000", "72000", "16000", "31000", "25000"};
            String[] complementCedexTab = {"38","38", "01", "04", "21", "28", "29"};
            String[] ligne1Tab = {"test","Mohammed 1", "Mahmoudi 2", "Yassine 3", "Hamza 4", "Ilyess 5", "Amar 6"};
            String[] ligne2Tab = {"test 3","Mohammed 2", "Mahmoudi 4", "Yassine 9", "Hamza 8", "Ilyess 10", "Amar 12"};
            String[] ligne3Tab = {"test 51","Mohammed 6", "Mahmoudi 12", "Yassine 27", "Hamza 24", "Ilyess 30", "Amar 36"};
            Adresse adr = new Adresse(villeTab[(int)(Math.random() * 7)],
                                      codePostalTab[(int)(Math.random() * 7)],
                                      complementCedexTab[(int)(Math.random() * 7)],
                                      ligne1Tab[(int)(Math.random() * 7)],
                                      ligne2Tab[(int)(Math.random() * 7)],
                                      ligne3Tab[(int)(Math.random() * 7)]);
           
            monClient.setAdresse(adr);
            
            tx = session.beginTransaction();
            
            session.save(adr);
            session.save(monClient);
            
            tx.commit();
           
            
        } catch (Exception e) {
            tx.rollback();
            throw e;
        }
        
        /*
        finally{
            session.close();
        }
        */
        System.out.println("Etat session: "+session.isOpen());
    }
}
