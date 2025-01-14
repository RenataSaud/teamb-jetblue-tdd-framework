package pages_Sprint_2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import java.time.Duration;

public class Flights_C {
    private WebDriverWait wait;

    public Flights_C() {
        PageFactory.initElements(Driver.getDriver(), this);
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    }

    @FindBy(xpath = "/html[1]/body[1]/jb-app[1]/main[1]/jb-basic-template[1]/jb-renderer-template[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[2]/jb-renderer-template[1]/jb-tab-component-container[1]/div[1]/jb-tabs[1]/section[1]/div[1]/jb-tab-panel[1]/div[1]/jb-renderer-template[1]/dot-booker-air[1]/div[1]/dot-booker-air-v2[1]/form[1]/div[1]/div[2]/dot-city-pair-selector[1]/div[1]/jb-form-field-container[1]/dot-city-selector[1]/jb-autocomplete[1]/div[1]/jb-type-ahead-input[1]/input[1]")
    private WebElement from;

    @FindBy(xpath = "/html[1]/body[1]/jb-app[1]/main[1]/jb-basic-template[1]/jb-renderer-template[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[2]/jb-renderer-template[1]/jb-tab-component-container[1]/div[1]/jb-tabs[1]/section[1]/div[1]/jb-tab-panel[1]/div[1]/jb-renderer-template[1]/dot-booker-air[1]/div[1]/dot-booker-air-v2[1]/form[1]/div[1]/div[2]/dot-city-pair-selector[1]/div[1]/jb-form-field-container[2]/dot-city-selector[1]/jb-autocomplete[1]/div[1]/jb-type-ahead-input[1]/input[1]")
    private WebElement to;

    @FindBy(xpath = "/html[1]/body[1]/jb-app[1]/main[1]/jb-basic-template[1]/jb-renderer-template[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[2]/jb-renderer-template[1]/jb-tab-component-container[1]/div[1]/jb-tabs[1]/section[1]/div[1]/jb-tab-panel[1]/div[1]/jb-renderer-template[1]/dot-booker-air[1]/div[1]/dot-booker-air-v2[1]/form[1]/div[1]/div[2]/div[1]/dot-date-range-picker[1]/jb-date-picker[1]/div[1]/jb-form-field-container[1]/jb-date-picker-input[1]/div[1]/input[1]")
    private WebElement dateDepart;

    @FindBy(xpath = "/html[1]/body[1]/jb-app[1]/main[1]/jb-basic-template[1]/jb-renderer-template[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[2]/jb-renderer-template[1]/jb-tab-component-container[1]/div[1]/jb-tabs[1]/section[1]/div[1]/jb-tab-panel[1]/div[1]/jb-renderer-template[1]/dot-booker-air[1]/div[1]/dot-booker-air-v2[1]/form[1]/div[1]/div[2]/div[1]/dot-date-range-picker[1]/jb-date-picker[1]/div[1]/jb-form-field-container[2]/jb-date-picker-input[1]/div[1]/input[1]")
    private WebElement dateReturn;

    @FindBy(xpath = "(//span[@class='no-wrap ng-star-inserted'])[1]")
    private WebElement search;

    public void getFrom(String from) {
        wait.until(ExpectedConditions.elementToBeClickable(this.from)).click();
        this.from.sendKeys(from);
        this.from.sendKeys(Keys.ENTER);
    }

    public void getTo(String to) {
        wait.until(ExpectedConditions.elementToBeClickable(this.to)).sendKeys(to,Keys.ENTER);
        this.to.sendKeys(Keys.TAB);

    }

    public void getDateDepart(String depart) {
        wait.until(ExpectedConditions.elementToBeClickable(this.dateDepart)).sendKeys(depart);
        this.dateDepart.sendKeys(Keys.ENTER);
    }

    public void getDateReturn(String reTurn) {
        wait.until(ExpectedConditions.elementToBeClickable(this.dateReturn)).sendKeys(reTurn);
    }

    public void getSearch() {
        wait.until(ExpectedConditions.elementToBeClickable(this.search)).click();
    }
}