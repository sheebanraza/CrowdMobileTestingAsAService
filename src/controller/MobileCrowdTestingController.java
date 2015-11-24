package controller;

import com.google.common.collect.Collections2;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import model.User;
import org.hibernate.annotations.Immutable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.MobileCrowdTestingService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Sheeban on 11/6/2015.
 */

@Controller
public class MobileCrowdTestingController {

    @Autowired
    private MobileCrowdTestingService mobileCrowdTestingService;

    @RequestMapping(value = "/registerUser/MobileCrowdTesting.htm")
    public ModelAndView registerUser(@ModelAttribute (value = "user") User user,
                                  HttpServletRequest httpServletRequest, HttpServletResponse httpResponse) {

        ModelAndView modelAndView = new ModelAndView();
        String firstName = httpServletRequest.getParameter("firstName");
        String lastName = httpServletRequest.getParameter("lastName");
        String phone = httpServletRequest.getParameter("phone");
        String password = httpServletRequest.getParameter("password");
        String email = httpServletRequest.getParameter("email");
        String type = httpServletRequest.getParameter("userType");
        String userName= httpServletRequest.getParameter("userName");

        user = new User(userName,password,firstName,lastName,email,phone);
        if(type.equals("T")){
            user.setRole(type);
        }else if(type.equals("A")) {
            user.setRole(type);
        }else {
            user.setRole(type);
        }

        mobileCrowdTestingService.createUser(user);

        return modelAndView;
    }

    @RequestMapping(value = "/checkUser/MobileCrowdTesting.htm")
    public ModelAndView checkUser(@ModelAttribute (value = "user") User user,
                                  HttpServletRequest httpServletRequest, HttpServletResponse httpResponse) {
        ModelAndView modelAndView = new ModelAndView();
        String userEmail = httpServletRequest.getParameter("userName");
        String password = httpServletRequest.getParameter("password");
        Map<String,String> userEmailVsPassword = mobileCrowdTestingService.userNameVsPassword();
        if(!Iterables.contains(ImmutableList.of(userEmailVsPassword.keySet()),user)){
            String u = "User does not exists";
        }else{
            if(password.equals(userEmailVsPassword.get(userEmail))){
                //modelAndView.setView();
                System.out.print("In.....");
            }else {
                String u = "Pass Wrong";
            }
        }

        return modelAndView;

    }



}
