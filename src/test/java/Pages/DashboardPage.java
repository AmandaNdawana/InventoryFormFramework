package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]")
    WebElement Learn;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div")
    WebElement LearnDropdown;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]")
    WebElement LearningMaterials;

    public void clickLearn(){
        Learn.click();
    }

    public void verifyLearnDropDown(){
        LearnDropdown.isDisplayed();
    }
    public void clickLearningMaterial(){

        LearningMaterials.click();
    }
}
