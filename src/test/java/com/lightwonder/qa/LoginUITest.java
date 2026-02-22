package com.lightwonder.qa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUITest {

    @Test(groups = "smoke")
    public void verifyLoginPageTtitle() {
        System.out.println("Executing Kiran's smoke UI  Test");
        Assert.assertTrue(true);

    }

}
