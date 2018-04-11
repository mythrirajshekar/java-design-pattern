package com.ecu.seng6245.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import com.ecu.seng6245.model.User;
import com.ecu.seng6245.model.Singleton;
import java.util.*;

public class HelloWorldController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ModelAndView model = new ModelAndView("HelloWorldPageView");
		
		User user1 = new User();
		user1.setFirstName("Mark");
		user1.setLastName("Hills");

		User user2 = new User();
		user2.setFirstName("Mythri");
		user2.setLastName("Bangalore Rajashekar");

		List<User> users = new ArrayList<User>();

		users.add(user1);
		users.add(user2);

		model.addObject("users", users);

		// instantiating Singleton class with variable x
        Singleton x = Singleton.getInstance();
 
        // instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();

        String initialContent = x.content;

        model.addObject("singletonString", initialContent);

        // changing variable of instance x
        x.content = (x.content).toUpperCase();

        model.addObject("singletonStringX", x.content);
        model.addObject("singletonStringY", y.content);



		return model;
	}

}