import com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class BestContributerToSelenide {
    @Test
    void solntsevSould() {
        open("https://www.github.com/selenide/selenide");
        $(".BorderGrid").$(byText("Contributors")).ancestor(".BorderGrid-row")
                .$$("ul li").first().hover();
        $$(".Popover .Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));

    }
}

