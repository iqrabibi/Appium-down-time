package PageObjects;

import General.webDriverFactory;
import org.testng.Assert;

public class LoginObjects
{
    //Declare and Initialize variables
    private String bySignInId               = "com.downtime.androidapp:id/buttonSignIn";
    private String byEmailId                = "com.downtime.androidapp:id/textInputEditTextEmail";
    private String byPassword               = "com.downtime.androidapp:id/textInputEditTextPassword";
    public String byBtnID                   = "com.downtime.androidapp:id/toolbarMyDevices";
    public String byFamilyClass             = "android.widget.TextView";
    public String CreateNetworkID           = "com.downtime.androidapp:id/buttonCreateFamilyNetwork";
    public String FamilyName                = "com.downtime.androidapp:id/textInputEditTextFamilyName";
    public String deviceNickName            = "com.downtime.androidapp:id/textInputEditTextDeviceNick";
    public String SignUpPassword            = "com.downtime.androidapp:id/textInputEditTextPassword";
    public String SignUpConfirmPassword     = "com.downtime.androidapp:id/textInputEditTextConfirmPassword";
    public String DeviceXPath               = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView";

    //Click on LogIn Button
    public void clickSignIn() throws InterruptedException
    {
        webDriverFactory.getDriver().findElementById(bySignInId).click();
        Thread.sleep(2000);
    }
    //Enter Email
    public void enterEmail(String email)
    {
        webDriverFactory.getDriver().findElementById(byEmailId).setValue(email);
    }

    //Enter Password
    public void enterPassword(String pwd)
    {
        webDriverFactory.getDriver().findElementById(byPassword).setValue(pwd);
    }

    //Check if Add New Device Button exists
    public void checkBtn() throws InterruptedException
    {
        Thread.sleep(2000);
        Boolean BtnTextView = webDriverFactory.getDriver().findElementById(byBtnID).isDisplayed();
        Assert.assertTrue(BtnTextView);
    }

    //Check if the Family name exists
    public void checkFamily(String actualText) throws InterruptedException
    {
        Thread.sleep(2000);
        String FamilyTextView = webDriverFactory.getDriver().findElementByClassName(byFamilyClass).getText();
        Assert.assertEquals(actualText, FamilyTextView, "Sonia's Family");
    }

    public void checkEnterCredential(String actualText) throws InterruptedException
    {
        Thread.sleep(2000);
        String CredentialTextView = webDriverFactory.getDriver().findElementByClassName(byFamilyClass).getText();
        Assert.assertEquals(actualText, CredentialTextView, "Enter your credentials");
    }

    public void checkLoginBtn() throws InterruptedException
    {
        Thread.sleep(2000);
        Boolean LoginBtnTextView = webDriverFactory.getDriver().findElementById(bySignInId).isDisplayed();
        Assert.assertTrue(LoginBtnTextView);
    }

    public void clickCreateFamilyNetwork() throws InterruptedException
    {
        webDriverFactory.getDriver().findElementById(CreateNetworkID).click();
        Thread.sleep(2000);
    }

    public void enterFamilyNameSignUp(String familyname)
    {
        webDriverFactory.getDriver().findElementById(FamilyName).setValue(familyname);
    }

    public void enterDeviceNickNameSignUp(String devicenickname)
    {
        webDriverFactory.getDriver().findElementById(deviceNickName).setValue(devicenickname);
    }

    public void enterPasswordSignUp(String spwd)
    {
        webDriverFactory.getDriver().findElementById(SignUpPassword).setValue(spwd);
    }

    public void enterConfirmPasswordSignUp(String cpwd)
    {
        webDriverFactory.getDriver().findElementById(SignUpConfirmPassword).setValue(cpwd);
    }

    public void clickDeviceName()
    {
        webDriverFactory.getDriver().findElementById(DeviceXPath).click();
    }
}


