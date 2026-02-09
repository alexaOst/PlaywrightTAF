package org.tests;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LaunchBrowser {

    public static void main(String[] args) {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions()
                        .setHeadless(false) // run in headed mode
                        .setSlowMo(100) // slow down operations by 100ms
        );
        Page page = browser.newPage();

        page.navigate("https://aqa-complexapp.onrender.com/");
        System.out.println(page.title());


        page.waitForTimeout(5000); // wait for 5 seconds to see the page

//        page.close();
//        playwright.close(); // kill the session and close the browser


    }
}
