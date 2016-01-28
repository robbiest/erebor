package com.mkyong.common;

import org.hibernate.Session;
import com.mkyong.persistence.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        Stock stock = new Stock();
        
        stock.setStockCode("4715");
        stock.setStockName("GENM");
        
        Stock stock2 = new Stock();
        
        stock2.setStockCode("47152");
        stock2.setStockName("GENM2");
        
        session.save(stock);
        session.save(stock2);
        session.getTransaction().commit();
        System.out.println("main: finish");
    }
}