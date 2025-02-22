package com.jntu.business;

import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jntu.main.MyrestUrl;

@Service
@EnableAutoConfiguration
@Component
public class ComfirmSeats {
	@Autowired
	MyrestUrl resturl;

	@SuppressWarnings("unchecked")
	public ArrayList<Integer> confirm(HttpSession session) {
		RestTemplate restcall = new RestTemplate();
		return restcall.getForObject(resturl.geturl() + "Confirm_allotement_rest/" + session.getAttribute("code"),
				ArrayList.class);
	}
}
