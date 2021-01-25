package com.example.week2homework.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.week2homework.model.Message;

@Controller
public class MyController {
	@RequestMapping("/index")
	public String home(@RequestParam(name="name") String name, Model model) {
		model.addAttribute("name", name);
		return "index";
	}
	
	@RequestMapping("/message")
	public String messages(Model model) {
		// HARDCODING STUFF TO FOLLOW
		// CREATE ARRAYLIST OF MESSAGES
		List<Message> messages = new ArrayList<Message>();
		// HARDCODE CONTENT TO 3 MESSAGE OBJECTS
		Message message1 = new Message(1, "President 1", "Joe Biden");
		Message message2 = new Message(2, "President 2", "Donald Trump");
		Message message3 = new Message(3, "President 3", "Barack Obama");
		// ADD 3 MESSAGE OBJECT TO THE ARRAYLIS
		messages.add(message1);
		messages.add(message2);
		messages.add(message3);
		
		model.addAttribute("messages", messages);
		return "messagelist";
	}

}
