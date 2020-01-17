package com.lqf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * java代码通过selenium操作chromedriver
 */
public class SpiderTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",SpiderTest.class.getClassLoader().getResource("chromedriver.exe").getPath());

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com/");

        WebElement kw = webDriver.findElement(By.id("kw"));
        kw.sendKeys("selenium");

        WebElement bdBtn = webDriver.findElement(By.id("su"));
        bdBtn.click();

    }


}
