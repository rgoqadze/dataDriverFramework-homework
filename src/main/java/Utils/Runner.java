package Utils;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class Runner {
    @BeforeMethod
    public void Configuration() {
        Configuration.timeout = 2000;
        Configuration.browser = "Chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.reopenBrowserOnFail = true;
        open("https://demoqa.com/");
    }
}
