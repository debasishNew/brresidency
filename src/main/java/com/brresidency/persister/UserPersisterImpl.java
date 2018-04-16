package com.brresidency.persister;

import java.util.List;


import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brresidency.model.User;


@Transactional 
@Repository
public class UserPersisterImpl extends AbstractDAO implements IUserPersister {

	private static final Logger log = Logger.getLogger(UserPersisterImpl.class);
	
	/*@Autowired
	HibernateTemplate ht;*/
	
	/*private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }*/
    
	public String getUserName(){
		log.info("entering userpersister getUserName()");
		return "Debasish From Persister";
	}
	
	public int saveUser(User user){
		int userId=(Integer) getSession().save(user);
		log.info("new user saved with ID"+userId);
		return userId;
	}
	/*public int saveUser(User user){
		return (Integer)ht.save(user);
		
	}*/
	

    @SuppressWarnings("unchecked")
	public List<User> findAllUsers() {
    	log.info("entering findAllUsers() persisterImpl");
        Criteria criteria = getSession().createCriteria(User.class);
        List<User> userList=criteria.list();
        log.info("all user list obtained from database"+userList);
        //return (List<User>) criteria.list();
        return userList;
    }
}
