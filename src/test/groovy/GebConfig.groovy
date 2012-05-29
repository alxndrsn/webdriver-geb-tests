import org.openqa.selenium.remote.*

baseUrl = 'http://localhost:1234/'

reportsDir = "target/geb-reports"

driver = {
	// Ask for a JavaScript-enabled browser
	def driver
	if(System.properties.firfox == 'true') {
		driver = new org.openqa.selenium.firefox.FirefoxDriver()
	} else {
		DesiredCapabilities capabilities = new DesiredCapabilities()
		capabilities.javascriptEnabled = true
		driver = new RemoteWebDriver(new URL(baseUrl), capabilities)
		actualCapabilities = ((RemoteWebDriver) driver).getCapabilities();
		assert actualCapabilities.javascriptEnabled
	}
	return driver
}

