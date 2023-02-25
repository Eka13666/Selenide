import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class GitSelenideTests {

  @BeforeAll
  static void beforeAll() {
    Configuration.browserSize = "1920x1080";
    Configuration.holdBrowserOpen = true;
  }
  @Test
  void searchJUnit5Example() {
    open("https://github.com/selenide/selenide");
    $("#wiki-tab").click();
    $(".Box-row.wiki-more-pages-link").$("button").click();
    $(byText("SoftAssertions")).click();
    $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
  }

  @Test
  void hoverTest() {

    open("https://github.com");
    $(withText("Solutions")).hover();
    $(withTagAndText("a", "Enterprise")).click();
    $(".enterprise-hero").shouldHave(text("Build like the best"));

  }

  @Test
  void dragAndDropTest() {

        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
      }
    }

