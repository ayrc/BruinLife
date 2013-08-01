package com.example.bruinlife;

import java.io.IOException;

import org.jsoup.*;
import org.jsoup.helper.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class Parser {

	final static String url = "http://menu.ha.ucla.edu/foodpro/default.asp";
	Document mainMenu = null;
	public boolean fail = false;
	public Parser() {
		try {
			mainMenu = Jsoup.connect(url).get();
		} catch (IOException e) {
			fail = true; //use to tell app connection failed
		}
	}
	
	void parse()
	{
		//...yay
	}
}
