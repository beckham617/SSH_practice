package com.liliang.player.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.liliang.player.po.Player;
/**
 * <p>Class description goes here.</p>
 * 
 * @see    java.lang.Object
 * @author xttao3@isoftstone.com
 */
public class PlayerDAO {
   
    public void storePlayer(Player player) {
    	Configuration cfg=new Configuration().configure();
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session se=sf.openSession();
    	Transaction tx=se.beginTransaction();  		
    
    	
    	se.save(player);	
    	
    	tx.commit();
    	se.close();
    	
    }
    
   public void queryPlayer(Player player) {
    	Configuration cfg=new Configuration().configure();
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session se=sf.openSession();
    	Transaction tx=se.beginTransaction();
    	
    	HttpServletRequest request = ServletActionContext.getRequest(); 
		HttpSession session = request.getSession();
    	
		
		String name=player.getName();
		
    	Query query = se.createQuery("from Player as wowplayer where name = '"+name+"'");
    	
    	List list=query.list();
   	
    	session.setAttribute("session",list);
    	
        tx.commit();
        se.close();
        
    }
    
   	public void updatePlayer(Player player) {
   		Configuration cfg=new Configuration().configure();
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session se=sf.openSession();
    	Transaction tx=se.beginTransaction();
    	
		
		Query query= se.createQuery("update Player as wowplayer set id='"+player.getId()+"',level='"+player.getLevel()+"',race='"+player.getRace()+"',profession='"+player.getProfession()+"' where name ='"+player.getName()+"'");
    	query.executeUpdate();
			
    	tx.commit();
    	se.close();
    	
		
   	}
   
    public void removePlayer(Player player) {
    	Configuration cfg=new Configuration().configure();
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session se=sf.openSession();
    	Transaction tx=se.beginTransaction();
    	
		
		se.delete(player);
		tx.commit();
    	se.close();
    	
    }

}