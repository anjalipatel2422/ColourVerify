package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks
{
    BrowserManager browserManager = new BrowserManager();

    @Before
    public void openBrowser()
    {
        browserManager.setBrowser();
    }

    @After
    public void closeBrowser()
    {
        // browserManager.closeBrowser();
    }
}
