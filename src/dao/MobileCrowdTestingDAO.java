package dao;

import model.Category;
import model.Status;
import model.User;

import java.util.List;
import java.util.Map;

/**
 * Created by Sheeban on 11/7/2015.
 */
public interface MobileCrowdTestingDAO {
    public void createUser(User user);

    public Map<String,String> userNameVsPassword();

    void createCategories(List<Category> categoryList);

    void createStatuses(List<Status> statusList);
}
