public class LoginUiHelper extends ScenarioSteps {
	
	transient LoginPage loginPage;
	
	/**
	 * Login to application
	 * @author Manoj
	 * @param userName : input to enter
	 * @param passWord : input to enter
	 */
	public void loginToApplication(String userName,String passWord) {
		System.setProperty ("webdriver.chrome.driver",".\\chromedriver.exe" );
		driver = new ChromeDriver();
		String url = Serenity.get("URL");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		loginPage.clickSignin();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginPage.enterEmail(userName);
		loginPage.enterPassWord(passWord);
		loginPage.clickSignin();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	
	/**
	 * verify Login to application
	 * @author Manoj
	 *
	 */
	public void verifyLogin() {
		assertThat(loginPage.getHeader().contains("Pull requests"));
	}
	
	/**
	 * navigate to Signup
	 * @author Manoj
	 *
	 */
	public void navigateToSignUp() {
		System.setProperty ("webdriver.chrome.driver",".\\chromedriver.exe" );
		driver = new ChromeDriver();
		String url = Serenity.get("URL");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		loginPage.clickSignUp();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		assertThat(loginPage.getHeader().contains("Create your account"));
		loginPage.enterEmail("Username");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		boolean data = loginPage.elementEnalbleOrDissable();
		if (data) {
			Log.info("Element is enabled");
		} else {
			Log.info("Element is disabled");
		}
		loginPage.clickSignin();
		WebElement element = getDriver().findElement(By.xpath("//*[contains(text(),'Forgot')]"));
		element.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		loginPage.enterEmail("m.ie");
		WebElement element = getDriver().findElement(By.xpath("//*[contains(text(),'Send password')]"));
		element.click();
	}
	
	/**
	 * verify Login to application
	 * @author Manoj
	 *
	 */
	public void userIsAbleToVerifyErrorScenarios() {
		assertThat(loginPage.getHeader().contains("That address is not a verified primary email"));
	}
}