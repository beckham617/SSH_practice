package player.action;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import player.dao.PlayerDao;
import player.model.Player;

import com.opensymphony.xwork2.ActionSupport;
/**
 * <p>Class description goes here.</p>
 * 
 * 
 * @see    java.lang.Object
 * @author xttao3@isoftstone.com
 */
public class PlayerAction extends ActionSupport {
    private static final long serialVersionUID = 1872316812305356L;
    
    private PlayerDao dao=new PlayerDao();
       
    private String id;
    private String name;
    private int level;
    private String race;
    private String profession;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	
	
	
	public int removeno;
	public int updateno;
	public int getRemoveno(){
		return removeno;
	}	
	public void setRemoveno(int removeno){
		this.removeno=removeno;
	}
	public int getUpdateno() {
		return updateno;
	}
	public void setUpdateno(int updateno) {
		this.updateno = updateno;
	}
	
	
	Player player=new Player();
    
	public String store() {
    	
    	System.out.println("能够调用store方法！");
    	
    	player.setId(getId());
    	player.setName(getName());
    	player.setLevel(getLevel());
    	player.setRace(getRace());
    	player.setProfession(getProfession());
    	
    	if(player.getId()==null){
    		System.out.println("player是空值");
    	}
        else{
        	System.out.println("player的id是"+player.getId()+" player的name是"+player.getName()+" player的level是"+player.getLevel()+" player的race是"+player.getRace()+" player的profession是"+player.getProfession());
        }
        
    	dao.storePlayer(player);
        
        return SUCCESS;
    }
	
	public String list() {
		
		player.setName(getName());
		
		System.out.println("能够调用list方法！");
		System.out.println("player的name是"+player.getName());
		
		dao.queryPlayer(player);
    	
		return SUCCESS;
    }
	
	public String update() {
		
		player.setId(getId());
    	player.setName(getName());
    	player.setLevel(getLevel());
    	player.setRace(getRace());
    	player.setProfession(getProfession());
    	
		System.out.println("能够调用update方法！");
		System.out.println("player的id是"+player.getId()+"  player的name是"+player.getName());
		  	
		dao.updatePlayer(player);
    	
		return SUCCESS;
    }
    
	public String remove() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		List list=(List)session.getAttribute("session");
		player=(Player)list.get(removeno);
		
		System.out.println("能够调用delete方法！");
		System.out.println("player的name是"+player.getName());
		
		dao.removePlayer(player);
    	
		return SUCCESS;
    }
	
}