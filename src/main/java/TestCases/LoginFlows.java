package TestCases;

import General.Main;
import PageObjects.LoginObjects;
import org.testng.annotations.Test;

public class LoginFlows extends Main
{
    //declare/initialize variables and objects
    static LoginObjects log;
    //Login Variables
    static String email             = "sonia.ali@venturedive.com";
    static String pwd               = "test123abc";
    static String Invalidemail      = "soniaaa.ali@venturedive.com";
    //Sign Up Variabes
    static String famName           = "Test Family";
    static String deviceName        = "Test1";
    static String SignUpEmail       = "testt@test.com";
    static String SignUpPwd    = "test123abc";
    static String SignUpConfirmPwd  = "test123abc";



     //Test Case for login
    @Test
     public static void login_VerifyUserCanLoginIntoApp()  throws InterruptedException
     {
         log  = new LoginObjects();
         log.clickSignIn();
         log.enterEmail(email);
         Thread.sleep(3000);
         log.enterPassword(pwd);
         Thread.sleep(2000);
         log.clickSignIn();
         Thread.sleep(2000);
         log.checkBtn();
         log.checkFamily("Sonia's Family");
     }

    @Test
    public static void login_VerifyUserCanNotLoginIntoApp()  throws InterruptedException
    {
       log  = new LoginObjects();
        log.clickSignIn();
        log.enterEmail(Invalidemail);
        Thread.sleep(2000);
        log.enterPassword(pwd);
        Thread.sleep(2000);
        log.clickSignIn();
        Thread.sleep(2000);
        log.checkLoginBtn();
    }

    @Test
    public static void VerifyUserCanCreateNetwork()  throws InterruptedException
    {
        log  = new LoginObjects();
        log.clickCreateFamilyNetwork();
        log.enterFamilyNameSignUp(famName);
        Thread.sleep(2000);
        log.enterDeviceNickNameSignUp(deviceName);
        Thread.sleep(2000);
        log.enterEmail(SignUpEmail);
        Thread.sleep(2000);
        log.enterPasswordSignUp(SignUpPwd);
        Thread.sleep(2000);
        log.enterConfirmPasswordSignUp(SignUpConfirmPwd);
        Thread.sleep(2000);
        log.clickSignIn();
    }

    @Test
    public static void VerifyUserSelectDownTimeInterval()  throws InterruptedException{
        log  = new LoginObjects();
        log.clickSignIn();
        log.enterEmail(email);
        Thread.sleep(3000);
        log.enterPassword(pwd);
        Thread.sleep(2000);
        log.clickSignIn();
        Thread.sleep(2000);
        log.clickDeviceName();
    }

}