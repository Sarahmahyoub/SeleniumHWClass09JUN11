package Utlis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");

        WebElement userName= driver.findElement(By.cssSelector(" input[id='txtUsername']"));
        userName.sendKeys("Admin");

        WebElement loginButton= driver.findElement(By.cssSelector("input[id='btnLogin']"));
        loginButton.click();

        String msg=driver.findElement(By.cssSelector("span[id='spanMessage']")).getText();

        System.out.println(msg);

        if (msg.equals("Password cannot be empty")){
            System.out.println("The message is correct");

        }else{

            System.out.println("The message is incorrect");
        }

    }
}
