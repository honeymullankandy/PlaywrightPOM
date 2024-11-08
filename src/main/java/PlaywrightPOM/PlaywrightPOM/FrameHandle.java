package PlaywrightPOM.PlaywrightPOM;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FrameHandle {
	public static void main(String[] args) {
	Playwright playwright = Playwright.create();
	Browser br = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));	
	Page p1=br.newPage();
	p1.navigate("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");

	p1.locator("img[title='Vehicle-Registration-Forms-and-Examples']").click();

	p1.frameLocator("//iframe[contains(@id,'frame-one')]").locator("#RESULT_TextField-8")
			.fill("Naveen Automation");

}
}
