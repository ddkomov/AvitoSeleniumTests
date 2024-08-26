package avito;

import core.BaseSeleniumTest;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Owner;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.rules.TestRule;
import org.junit.runners.model.Statement;

public class AvitoTest extends BaseSeleniumTest {

    @Rule
    public RetryRule rule = new RetryRule(3);

    @Issue(value = "T-1")
    @DisplayName("Проверка копирайта на главной странице")
    @Description("Сравнение текста элемента копирайта на главной странице с ожидаемым")
    @Owner(value = "Комов Дмитрий")
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
