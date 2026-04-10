package Tests;

import Pages.DashboardPage;
import Utils.ReadFromFile;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

@Test
public class InventoryFormTests extends Base {

    public void verifyHomePageIsDisplayed() {
        homePage.verifyHomePageIsDisplayed();
        takeScreenshots.takeSnapShots(driver, "HomePageScreenshot");
    }

    @Test(dependsOnMethods = "verifyHomePageIsDisplayed")
    public void clickLoginButton() {
        homePage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginButton")
    public void verifyLoginHeading(){
        loginPage.verifyLoginPageIsDisplayed();
        takeScreenshots.takeSnapShots(driver, "LoginPageScreenshot");
    }

    @Test(dependsOnMethods = "clickLoginButton")
    public void userEnterEmail() throws InterruptedException {
        Thread.sleep(2000);
        loginPage.enterEmail(ReadFromFile.email);
    }

    @Test(dependsOnMethods = "userEnterEmail")
    public void userEnterPassword() throws InterruptedException {
        Thread.sleep(2000);
        loginPage.enterPassword(ReadFromFile.password);
    }

    @Test(dependsOnMethods = "userEnterPassword")
    public void userClicksLoginButton() throws InterruptedException {
        Thread.sleep(2000);
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "userClicksLoginButton")
    public void userClicksLearn() throws InterruptedException {
        Thread.sleep(2000);
        dashboardPage.clickLearn();

    }

    @Test (dependsOnMethods = "userClicksLearn")
    public void LearningDropDown() throws InterruptedException {
        Thread.sleep(2000);
        dashboardPage.verifyLearnDropDown();
    }

    @Test(dependsOnMethods = "LearningDropDown")
    public void userClicksLearningMaterial() throws InterruptedException {
        Thread.sleep(2000);
        dashboardPage.clickLearningMaterial();
    }

    @Test(dependsOnMethods = "userClicksLearningMaterial")
    public void userClicksWebAutomationAdvance() throws InterruptedException {
        Thread.sleep(2000);
        inventoryForm.clickWebAutomationAdvance();
        takeScreenshots.takeSnapShots(driver, "AdvancedTabScreenshot");
    }

    @Test(dependsOnMethods = "userClicksWebAutomationAdvance")
    public void userSelectDevice() throws InterruptedException {
        Thread.sleep(2000);
        inventoryForm.selectDevice();
    }

    @Test(dependsOnMethods = "userSelectDevice")
    public void userSelectBrand()  {
        inventoryForm.selectBrand();
    }

    @Test(dependsOnMethods = "userSelectDevice")
    public void userSelectStorage()  {
        inventoryForm.selectStorage();
    }

    @Test(dependsOnMethods = "userSelectStorage")
    public void userSelectColor()  {
        inventoryForm.selectColor();
    }
    @Test(dependsOnMethods = "userSelectColor")
    public void userEnterQuantity() {
        inventoryForm.enterQuantity("2");
    }

    @Test(dependsOnMethods = "userEnterQuantity")
    public void userEnterAddress() {
        inventoryForm.enterAddress("123 Test Street");
    }

    @Test(dependsOnMethods = "userEnterAddress")
    public void userClicksNext()  {
        inventoryForm.clickNextButton();
    }

    @Test(dependsOnMethods = "userClicksNext")
    public void userSelectShipping()  {
        inventoryForm.clickShippingMethod();
    }

    @Test(dependsOnMethods = "userSelectShipping")
    public void userSelectWarranty()  {
        inventoryForm.clickWarranty();
    }

    @Test(dependsOnMethods = "userSelectWarranty")
    public void userEnterDiscount()  {
        inventoryForm.enterDiscount("SAVE10");
    }

    @Test(dependsOnMethods = "userEnterDiscount")
    public void userApplyDiscount()  {
        inventoryForm.applyDiscount();
    }

    @Test(dependsOnMethods = "userApplyDiscount")
    public void userConfirmPurchase()  {
        inventoryForm.clickConfirm();
    }

    @Test(dependsOnMethods = "userConfirmPurchase")
    public void userClickInvoice() throws InterruptedException {
        Thread.sleep(5000);
        inventoryForm.clickViewInvoice();
        takeScreenshots.takeSnapShots(driver, "InvoiceScreenshot");
    }


    @Test(dependsOnMethods = "userClickInvoice")
    public void userClickInvoicePdf() throws InterruptedException {
        Thread.sleep(5000);
        inventoryForm.clickViewInvoicePdf();
    }

//      @AfterTest
//      public void closeBrowser(){
//          driver.quit();
//      }
}
