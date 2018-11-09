package ll.user;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.util.ResolverUtil.Test;

public class UserDAO {
	
	private SessionFactory sf;
	
	public UserDAO(SessionFactory sf1){
		this.sf=sf1;
	}
	
	public  void insert(User user){
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		se.save(user);	
		tx.commit();
		se.close();
		System.out.println("新增成功！");
	}
	
	public void query(User user){
		final Log log=LogFactory.getLog(Test.class);
		
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		    
		Query query = se.createQuery("FROM User as user");
        List users = query.list();
        for(Iterator iter=users.iterator();iter.hasNext();){
        	user=(User)iter.next();
        	log.info("["+user.getId()+"]"+"[username:"+user.getUsername()+"]"+"[password:"+user.getPassword()+"]");
        } 
        tx.commit();
        se.close();
        System.out.println("查询成功！");
	}
	
	public void update(User user){
		final Log log=LogFactory.getLog(Test.class);
		
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		
		user=(User)se.load(User.class,new Integer(1));
		log.info("原始信息:["+user.getId()+"]"+"["+user.getUsername()+"]"+"["+user.getPassword()+"]");
		user.setUsername("Kael'Thas");
		user.setPassword("beckham617");
		
		se.save(user);
		tx.commit();
		
		User newUser=(User)se.load(User.class,new Integer(1));
		log.info("更新后信息:["+user.getId()+"]"+"["+user.getUsername()+"]"+"["+user.getPassword()+"]");
		se.close();
		System.out.println("更新成功！");
	}	
}
