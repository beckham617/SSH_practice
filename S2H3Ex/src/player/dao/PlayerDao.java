package player.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import player.model.Player;
/**
 * <p>Class description goes here.</p>
 * 
 * @see    java.lang.Object
 * @author xttao3@isoftstone.com
 */
public class PlayerDao {
   
    public void storePlayer(Player player) {
    	Configuration cfg=new Configuration().configure();
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session se=sf.openSession();
    	Transaction tx=se.beginTransaction();  		
    	
    	System.out.println("hibernate初始化完成，事务开启!");
    	System.out.println("player的name是"+player.getName());
    	
    	se.save(player);	
    	
    	tx.commit();
    	se.close();
    	
    	System.out.println("增加成功！");
    }
    
   public void queryPlayer(Player player) {
    	Configuration cfg=new Configuration().configure();
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session se=sf.openSession();
    	Transaction tx=se.beginTransaction();
    	
    	HttpServletRequest request = ServletActionContext.getRequest(); 
		HttpSession session = request.getSession();
    	
		System.out.println("hibernate初始化完成，事务开启!");
		System.out.println("player的name是"+player.getName());
		
		String name=player.getName();
		
    	Query query = se.createQuery("from Player as wowplayer where name = '"+name+"'");
    	
    	List list=query.list();
   	
    	session.setAttribute("session",list);
    	
        tx.commit();
        se.close();
        
        System.out.println("查询成功！");
    }
    
   	public void updatePlayer(Player player) {
   		Configuration cfg=new Configuration().configure();
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session se=sf.openSession();
    	Transaction tx=se.beginTransaction();
    	
    	System.out.println("hibernate初始化完成，事务开启!");
		System.out.println("player的id是"+player.getId());
		
		Query query= se.createQuery("update Player as wowplayer set id='"+player.getId()+"',level='"+player.getLevel()+"',race='"+player.getRace()+"',profession='"+player.getProfession()+"' where name ='"+player.getName()+"'");
    	query.executeUpdate();
			
    	tx.commit();
    	se.close();
    	
    	System.out.println("更新成功！");
		
   	}
   
    public void removePlayer(Player player) {
    	Configuration cfg=new Configuration().configure();
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session se=sf.openSession();
    	Transaction tx=se.beginTransaction();
    	
    	System.out.println("hibernate初始化完成，事务开启!");
		System.out.println("player的name是"+player.getName());
		
		se.delete(player);
		tx.commit();
    	se.close();
    	
    	System.out.println("删除成功！");
    }

}