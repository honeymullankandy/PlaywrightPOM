package PlaywrightPOM.PlaywrightPOM;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ShadowDom {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			Playwright playwright = Playwright.create();
			Browser br = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));	
			Page p1=br.newPage();
			p1.navigate("https://www.amazon.in/");
			List<String>link=p1.locator("a:visible").allTextContents();
			link.forEach(name->System.out.print(name));
	}

}
