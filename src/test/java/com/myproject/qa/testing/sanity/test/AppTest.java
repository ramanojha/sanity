package com.myproject.qa.testing.sanity.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.myproject.qa.testing.framework.selenium.BaseWebDriver;

public class AppTest extends BaseWebDriver 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        Assert.assertTrue( true );
    }
}
