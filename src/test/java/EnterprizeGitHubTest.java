import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class EnterprizeGitHubTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1900x1080";
        Configuration.holdBrowserOpen = false;
        Configuration.pageLoadStrategy = "eager";
    }
    @Test
    void testEnterprizeByHover() {
        open("https://github.com");
        $$("li.HeaderMenu-item").findBy(text("Solutions")).hover();
        $$("a.HeaderMenu-dropdown-link").findBy(text("Enterprise")).click();
        $(withText("Build like the best")).shouldBe(Condition.visible);



    }

}
