package service;

import model.User;

import java.util.Map;

/**
 * Created by Sheeban on 11/6/2015.
 */
public interface MobileCrowdTestingService {

    public Boolean createUser(User user);

    public Map<String, String> userNameVsPassword();

    public void createAllCategories();

    public void createAllStatus();
}