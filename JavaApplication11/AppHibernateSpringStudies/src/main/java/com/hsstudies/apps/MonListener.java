/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hsstudies.apps;

import org.hibernate.HibernateException;
import org.hibernate.event.spi.LoadEvent;
import org.hibernate.event.spi.LoadEventListener;

/**
 *
 * @author Amine
 */
public class MonListener implements LoadEventListener{

    @Override
    public void onLoad(LoadEvent le, LoadType lt) throws HibernateException {
        System.out.println("Entité charger sur le listener: "+le.getEntityId());
    }
    
}
