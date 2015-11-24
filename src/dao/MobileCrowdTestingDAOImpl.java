package dao;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import jdk.nashorn.internal.ir.annotations.Immutable;
import model.Category;
import model.Status;
import model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Sheeban on 11/7/2015.
 */

@Repository
public class MobileCrowdTestingDAOImpl implements MobileCrowdTestingDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void createUser(User user){
        user = entityManager.merge(user);
        System.out.print(user);
    }

    @Transactional
    public Map<String,String> userNameVsPassword(){
        List<String> userNames = (List<String>) entityManager.createQuery("select u.userName from User as u");
        List<String> passwords = (List<String>) entityManager.createQuery("select u.password from User as u");
        Map<String,String> map = new HashMap<>();
        for(int i=0;i<userNames.size();i++) {
            map.put(userNames.get(i), passwords.get(i));
        }
        return map;
    }

    @Override
    @Transactional
    public void createCategories(List<Category> categoryList) {
        for(Category c: categoryList){
            entityManager.merge(c);
        }
    }

    @Override
    @Transactional
    public void createStatuses(List<Status> statusList) {
        for(Status s: statusList){
            entityManager.merge(s);
        }
    }


}
