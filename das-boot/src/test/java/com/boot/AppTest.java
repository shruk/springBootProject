package com.boot;

import static org.junit.Assert.assertEquals;

import com.boot.controller.HomeController;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        HomeController hc=new HomeController();
        String result=hc.home();
        assertEquals(result, "Home controller return this by spring boot!!");
    }
}
