package dao;

import model.Status;
import model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Sheeban on 11/7/2015.
 */

@Repository
public class MobileCrowdTestingDAOImpl implements MobileCrowdTestingDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void createUser(User user){
        entityManager.persist(user);
    }
}
