package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestSuite
{
    protected static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","src/test/java/drivers/chromedriver.exe");

        //Open Chrome Browser.
        driver = new ChromeDriver();

        //Implicit Time setup.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Maximize Chrome Window.
        driver.manage().window().maximize();

        //Driver to Type URL.
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Click on Username and sendKeys.
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        //Click on Password and sendKeys.
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");

        //Click on login button.
        driver.findElement(By.id("btnLogin")).click();

        //Click on Assign Leave.
        driver.findElement(By.xpath("//div/a[@href=\"/index.php/leave/assignLeave\"]")).click();

        //Click on Employee Name and click.
        //driver.findElement(By.xpath("//input[@id='assignleave_txtEmployee_empId']")).click();

        //click on Employee Name & send keys.
        //driver.findElement(By.xpath("//input[@id='assignleave_txtEmployee_empId']")).sendKeys("Peter Mac Anderson");

        //Click on Leave Type
        driver.findElement(By.xpath("//select[@id='assignleave_txtLeaveType']")).findElement(By.xpath("//select[@id='assignleave_txtLeaveType']/option[5]")).click();

        //click on From Date Field & click.
        driver.findElement(By.id("assignleave_txtFromDate")).click();

        //click on From Date & send Keys.
        driver.findElement(By.id("assignleave_txtFromDate")).sendKeys("2022-09-12");

        //click on to Leave  Balance blank space.
        driver.findElement(By.id("assignleave_leaveBalance")).click();

        //Click on To Date & click.
        driver.findElement(By.id("assignleave_txtToDate")).clear();

        //click on To Date & send keys.
        driver.findElement(By.id("assignleave_txtToDate")).sendKeys("2022-09-19");

        driver.findElement(By.id("assignleave_leaveBalance")).click();

        //click on Comment & send Keys.
        driver.findElement(By.id("assignleave_txtComment")).sendKeys("You don't have much holidays left. Would you like unpaid leave?");

        //click on assign button.
        driver.findElement(By.id("assignBtn")).click();



    }









}
