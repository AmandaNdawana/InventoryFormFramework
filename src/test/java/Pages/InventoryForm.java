package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static Utils.BrowserFactory.driver;

public class InventoryForm {
    @FindBy(xpath = "//*[@id=\"tab-btn-web\"]/span[2]")
    WebElement WebAutomationAdvance;

    @FindBy(xpath = "//*[@id=\"deviceType\"]/option[2]")
    WebElement DeviceType;

    @FindBy(xpath = "//*[@id=\"brand\"]/option[2]")
    WebElement Brand;

    @FindBy(id = "storage-128GB")
    WebElement Storage;

    @FindBy(xpath = "//*[@id=\"color\"]/option[4]")
    WebElement ColorBlue;

    @FindBy(id = "quantity")
    WebElement Quantity;

    @FindBy(id = "address")
    WebElement Address;

    @FindBy(id = "inventory-next-btn")
    WebElement NextButton;

    @FindBy(id = "shipping-express")
    WebElement ShippingMethod;

    @FindBy(id = "warranty-1yr")
    WebElement Warranty;

    @FindBy(id = "discount-code")
    WebElement Discount;

    @FindBy(id = "apply-discount-btn")
    WebElement ApplyDiscount;

    @FindBy(id = "purchase-device-btn")
    WebElement ConfirmPurchase;

    @FindBy(id = "view-history-btn")
    WebElement ViewInvoice;

    @FindBy(xpath = "//button[contains(text(), 'View')]")
    WebElement ViewInvoicePdf;

    public void clickWebAutomationAdvance(){
        WebAutomationAdvance.click();
    }

    public void selectDevice(){
        DeviceType.click();
    }

    public void selectBrand(){
        Brand.click();
    }

    public void selectStorage(){
        Storage.click();
    }

    public void selectColor(){
        ColorBlue.click();
    }
    public void enterQuantity(String quantity){
        Quantity.sendKeys(quantity);
    }

    public void enterAddress(String address){
        Address.sendKeys(address);
    }

    public void clickNextButton(){
        NextButton.click();
    }

    public void clickShippingMethod(){
        ShippingMethod.click();
    }

    public void clickWarranty(){
        Warranty.click();
    }

    public void enterDiscount(String discount){
        Discount.sendKeys(discount);
    }

    public void applyDiscount(){
        ApplyDiscount.click();
    }

    public void clickConfirm(){
        ConfirmPurchase.click();
    }
    public void clickViewInvoice(){
        ViewInvoice.click();
    }

    public void clickViewInvoicePdf(){
        ViewInvoicePdf.click();
    }


}

