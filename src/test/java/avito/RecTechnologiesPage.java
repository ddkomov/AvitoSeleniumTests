package avito;

import core.BaseSeleniumPage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecTechnologiesPage extends BaseSeleniumPage {
    private final static String RECPAGE_TITLE = "Правила применения рекомендательных технологий на Авито";
    private final static String RECPAGE_EMAIL = "connect@avito.ru";
    private final static String RANKING_ADS_TITLE = "Как формируется поиск объявлений на Авито";

    @FindBy(xpath = "//div[@class='normalizer-normalizer-poB8S']")
    private WebElement recTechnologiesTitle;

    @FindBy(xpath = "//a[text()='ранжирование']")
    private WebElement recTechnologiesRules;

    @FindBy(xpath = "//a[@href='mailto:connect@avito.ru']")
    private WebElement recTechnologiesEMail;

    @FindBy(xpath = "//div[@class='normalizer-normalizer-VDFWJ avito-b2b-title-for-nav']")
    private WebElement rankingAdsTitle;

    public RecTechnologiesPage() {
        PageFactory.initElements(driver, this);
    }

    public void recTechnologiesPageTitleCheck() {
        Assert.assertEquals(recTechnologiesTitle.getText(), RECPAGE_TITLE);
    }

    public void recTechnologiesPageCheckEMail() {
        Assert.assertEquals(recTechnologiesEMail.getText(), RECPAGE_EMAIL);
    }

    public void recTechnologiesPageRulesClick() {
        recTechnologiesRules.click();
    }

    public void checkRankingAdsTitle() {
        Assert.assertTrue(rankingAdsTitle.getText().contains(RANKING_ADS_TITLE));
    }
}
