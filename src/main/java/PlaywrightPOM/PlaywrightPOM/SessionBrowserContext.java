package PlaywrightPOM.PlaywrightPOM;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserContext;

public class SessionBrowserContext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stubPlaywright playwright = Playwright.create();
		Playwright playwright = Playwright.create();
		Browser br = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext brc= br.newContext();
		Page p1=brc.newPage();
		p1.navigate("http://facebook.com");
		System.out.println(p1.title());
		BrowserContext brc2= br.newContext();
		Page p2=brc2.newPage();
		p2.navigate("http://google.com");
		System.out.println(p2.title());
		p1.close();
		brc.close();
		p2.close();
		brc2.close();

	}

}
