package controller;

import com.sun.deploy.net.HttpResponse;
import dao.MobileCrowdTestingDAO;
import model.CrowdTester;
import model.Role;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.MobileCrowdTestingService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Sheeban on 11/6/2015.
 */

@Controller
public class MobileCrowdTestingController {

    @Autowired
    private MobileCrowdTestingService mobileCrowdTestingService;

    @RequestMapping(value = "/registerUser/MobileCrowdTesting.htm")
    public ModelAndView checkUser(@ModelAttribute (value = "user") User user,
                                  HttpServletRequest httpServletRequest, HttpServletResponse httpResponse) {

        ModelAndView modelAndView = new ModelAndView();
        String firstName = httpServletRequest.getParameter("firstName");
        String lastName = httpServletRequest.getParameter("lastName");
        String phone = httpServletRequest.getParameter("phone");
        String password = httpServletRequest.getParameter("password");
        String email = httpServletRequest.getParameter("email");
        String type = httpServletRequest.getParameter("userType");
        String userName= httpServletRequest.getParameter("userName");

        Role role = new Role();
        user = new User(userName,password,firstName,lastName,email,phone,role);
        if(type.equals("tester")){
            role.setRoleName(type);
            CrowdTester crowdTester  = new CrowdTester();
            crowdTester.setUser(user);
        }else if(type.equals("provider")) {
            role.setRoleName(type);
        }else {
            role.setRoleName(type);
        }

        mobileCrowdTestingService.createUser(user);

        return modelAndView;
    }

}
