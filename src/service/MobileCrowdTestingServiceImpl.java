package service;

import com.google.common.collect.Lists;
import dao.MobileCrowdTestingDAO;
import model.Category;
import model.Status;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by Sheeban on 11/6/2015.
 */

@Component
public class MobileCrowdTestingServiceImpl implements MobileCrowdTestingService {

    @Autowired
    private MobileCrowdTestingDAO mobileCrowdTestingDAO;

    @Override
    public Boolean createUser(User user) {
        mobileCrowdTestingDAO.createUser(user);
        return null;
    }

    @Override
    public Map<String, String> userNameVsPassword() {
        return mobileCrowdTestingDAO.userNameVsPassword();
    }

    @Override
    public void createAllCategories() {
        List<Category> categoryList =
                Lists.newArrayList(new Category("Bussiness"),new Category("Entertainment"),
                        new Category("Healtcare"), new Category("Music"));

        mobileCrowdTestingDAO.createCategories(categoryList);
    }

    @Override
    public void createAllStatus() {
        List<Status> statusList =
                Lists.newArrayList(new Status("New"),new Status("Ongoing"),new Status("Closed"));

        mobileCrowdTestingDAO.createStatuses(statusList);
    }
}
