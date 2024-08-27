//package core;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import io.qameta.allure.Allure;
//import org.junit.jupiter.api.extension.ExtensionContext;
//import org.junit.jupiter.api.extension.TestWatcher;
//import org.openqa.selenium.WebDriver;
//
//import java.util.Optional;
//
//import static core.BaseSeleniumTest.driver;
//
//public class TestListener implements TestWatcher {
//    // используем эту конструкцию если driver private non static
//    // Object instance = context.getRequiredTestInstance();
//    // WebDriver driver = instance.getClass().getDeclaredField("driver").get(instance);
//    @Override
//    public void testFailed(ExtensionContext context, Throwable cause) {
//        Allure.getLifecycle().addAttachment(
//                "screenshot", "image/png", "png",
//                ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)
//        );
//        driver.close();
//        driver.quit();
//    }
//    @Override
//    public void testSuccessful(ExtensionContext context) {
//        Allure.getLifecycle().addAttachment(
//                "screenshot", "image/png", "png",
//                ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)
//        );
//        driver.close();
//        driver.quit();
//    }
//    @Override
//    public void testAborted(ExtensionContext context, Throwable cause) {
//        Allure.getLifecycle().addAttachment(
//                "screenshot", "image/png", "png",
//                ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)
//        );
//        driver.close();
//        driver.quit();
//    }
//    @Override
//    public void testDisabled(ExtensionContext context, Optional<String> reason) {
//        Allure.getLifecycle().addAttachment(
//                "screenshot", "image/png", "png",
//                ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)
//        );
//        driver.close();
//        driver.quit();
//    }
//}
