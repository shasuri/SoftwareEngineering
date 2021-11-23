package refactoring.explainingvariable.before;

public class WebServer {
	public void run(String platform, String browser, int resize) {

		final boolean isMacOS = platform.trim().toUpperCase().indexOf("MAC") > -1;
		final boolean isIEBrowser = browser.trim().toUpperCase().indexOf("IE") > -1;
		final boolean isResized = resize > 0;

		if (isMacOS && isIEBrowser && isResized) {
			// do something
		}
	}

}
