package service;

import dao.MobileCrowdTestingDAO;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
}
