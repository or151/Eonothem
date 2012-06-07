package com.idee.pizza.web;

import org.apache.wicket.protocol.http.WebApplication;

public class PizzaApplication extends WebApplication{
    public PizzaApplication() {
    }

    /**
     * @see org.apache.wicket.Application#getHomePage()
     */
    @Override
    public Class<HelloWorld> getHomePage() {
        return HelloWorld.class;
    }
}
