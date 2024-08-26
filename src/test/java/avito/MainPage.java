package avito;

import core.BaseSeleniumPage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseSeleniumPage {
    private static final String URL = "https://avito.ru";
    private static final String COMPANY = "© ООО «КЕХ еКоммерц» 2007–2024.";


    @FindBy(xpath = "//input[@placeholder='Поиск по объявлениям']")
    private WebElement searchInput;

    @FindBy(xpath = "//span[@class='desktop-9uhrzn']")
    private WebElement searchButton;

    @FindBy(xpath = "//button[@class='desktop-lqkwz0']")
    private WebElement allCategoriesButton;

    @FindBy(xpath = "//ul[@class='index-root-UPfze']//a[text()='рекомендательные технологии']")
    private WebElement recommendTechnologyButton;

    @FindBy(xpath = "//*[contains(text(),'© ООО «КЕХ еКоммерц» 2007–2024.')]")
    private WebElement copyright;

    public MainPage() {
        driver.get(URL);
        PageFactory.initElements(driver, this);
    }

    public void checkCopyrightText() {
        Assert.assertEquals(copyright.getText(), COMPANY);
    }

    public void clickRecommendTechnologyButton() {
        recommendTechnologyButton.click();
    }

    public void clickSearchButton() {
        searchInput.sendKeys();
        searchButton.click();
    }
}
