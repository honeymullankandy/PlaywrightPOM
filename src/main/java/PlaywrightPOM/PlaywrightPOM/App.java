package PlaywrightPOM.PlaywrightPOM;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.nio.file.Paths;
import java.util.*;

public class App {
  public static void main(String[] args) {
    
    	Playwright playwright = Playwright.create();
      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
        .setHeadless(false));
      BrowserContext context = browser.newContext();
      Page page = context.newPage();
      context.tracing().start(new Tracing.StartOptions()
    		  .setScreenshots(true)
    		  .setSnapshots(true)
    		  .setSources(true));
      page.navigate("https://academy.naveenautomationlabs.com/");
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Login")).click();
      page.frameLocator("#microfe-popup-login").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Continue with Google")).click();
      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Email or phone")).click();
      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Email or phone")).click();
      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Email or phone")).fill("honey.jayaraj");
      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Email or phone")).press("CapsLock");
      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Email or phone")).press("CapsLock");
      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Email or phone")).fill("honey.jayaraj@gmail.com");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next")).click();
      context.tracing().stop(new Tracing.StopOptions()
    		  .setPath(Paths.get("trace.zip")));
    
  }
}
    

