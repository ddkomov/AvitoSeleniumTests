package avito;

import core.BaseSeleniumTest;

import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Owner;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;

// почему-то не работает через TestListener скриншоты, пришлось реализовать в аннотации @After
//@ExtendWith(TestListener.class)
public class AvitoTest extends BaseSeleniumTest {

    @Rule
    public RetryRule rule = new RetryRule(2);

    @Issue(value = "T-1")
    @Description("Сравнение текста элемента копирайта на главной странице с ожидаемым")
    @Owner(value = "Комов Дмитрий")
    @DisplayName("Проверка копирайта на главной странице")
    @Test
    public void testCopyrightText() {
        MainPage mainPage = new MainPage();
        mainPage.checkCopyrightText();
    }

    @Issue(value = "T-2")
    @Description("Проверка страницы 'рекомендательные технологии' и наличие тайтла, почты, правил ранжирования")
    @Owner(value = "Комов Дмитрий")
    @DisplayName("Проверка страницы рекомендательных технологий")
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
