package avito;

import core.BaseSeleniumTest;
import org.junit.Test;

public class AvitoTest extends BaseSeleniumTest {


    /**
     * Проверка наличия копирайта на главной странице
     **/
    @Test
    public void testCopyrightText() {
        MainPage mainPage = new MainPage();
        mainPage.checkCopyrightText();
    }
    /**
     * Проверка страницы "рекомендательные технологии" и наличие тайтла, почты, правил ранжирования
     **/
    @Test
    public void testRecommendTechnologyPage() {
        MainPage mainPage = new MainPage();
        mainPage.clickRecommendTechnologyButton();
        RecTechnologiesPage recTechnologiesPage = new RecTechnologiesPage();
        recTechnologiesPage.recTechnologiesPageTitleCheck();
        recTechnologiesPage.recTechnologiesPageCheckEMail();
        recTechnologiesPage.recTechnologiesPageRulesClick();
        recTechnologiesPage.checkRankingAdsTitle();
    }
    
}
