package com.idee.pizza.web;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class HelloWorld extends WebPage {
	
	private static final long serialVersionUID = 1L;

	public HelloWorld() {
        add(new Label("message", "Hello World!"));
    }
}


