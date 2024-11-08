package PlaywrightPOM.PlaywrightPOM;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Tracing;

public class element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    	Playwright playwright = Playwright.create();
		 Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
			        .setHeadless(false));
			      BrowserContext context = browser.newContext();
			      Page page = context.newPage();
		          //page.navigate("https://academy.naveenautomationlabs.com/");
			      page.navigate("https://www.orangehrm.com/en/orangehrm-30-day-trial");
			      
		         // page.locator("text=Demo Site").click();
		         //  page.locator("text=Login").first().click();
		          Locator l= page.locator("//select[@name='Country']/option");
		          List <String>names=l.allTextContents();
		          names.forEach(value->System.out.print(value));

	}

}
