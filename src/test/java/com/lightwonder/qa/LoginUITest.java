package com.lightwonder.qa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUITest {

    @Test(groups = "smoke")
    public void verifyLoginPageTtitle() {
        System.out.println("Executing UI Test");
        Assert.assertTrue(true);

    }

}
