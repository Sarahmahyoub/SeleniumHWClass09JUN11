package Utlis;

import java.io.IOException;

public class test5 extends CommonMethods{

    public static void main(String[] args) throws IOException {

        String url = "http://www.facebook.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);


        String path="C:\\Users\\User\\IdeaProjects\\SYNTAX-Batch16\\screenShot\\facebookScreenshot.png";
        screenShot(path);

    }
}
