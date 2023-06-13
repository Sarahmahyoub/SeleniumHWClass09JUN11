package HWCLASS09;

import Utlis.CommonMethods;

import java.io.IOException;

public class ScreenShotMethodTest extends CommonMethods {

    public static void main(String[] args) throws IOException {

        String url = "http://www.facebook.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        String path="C:\\Users\\User\\IdeaProjects\\SELENIUMHWCLASS09JUN11\\screenShot\\facebookScreenshot.png";
        screenShot(path);

    }
}
