public class LoginPage extends BasePage {

	@FindBy(xpath = "//*[@name='login']")
	private WebElementFacade userNameField;
	
	@FindBy(xpath = "//*[@name='password']")
	private WebElementFacade passwordField;
	
	/**
	 * To click signin
	 *
	 * @author Manoj
	 * 
	 */
	public void clickSignin() {
		WebElement element = getDriver().findElement(By.xpath("//*[@href='/login']"));
		element.click();
	}
	
	/**
	 * To enter username
	 *
	 * @author Manoj
	 * @param userName : userName
	 */
	public void enterEmail(String userName) {
		WebElement element = getDriver().findElement(By.xpath(userNameField));
		element.sendKeys(userName);
	}
	
	/**
	 * To enter password
	 *
	 * @author Manoj
	 * @param Password : Password
	 */
	public void enterPassWord(String password) {
		WebElement element = getDriver().findElement(By.xpath(passwordField));
		element.sendKeys(password);
	}
	
	/**
	 * To get text
	 *
	 * @author Manoj
	 * @return String
	 */
	public String getHeader() {
		WebElement element = getDriver().findElement(By.xpath("//*[contains(text(),'Pull')]"));
		String headerText = element.getText();
		return headerText;
	}
	
	/**
	 * To click signup
	 *
	 * @author Manoj
	 * 
	 */
	public void clickSignUp() {
		WebElement element = getDriver().findElement(By.xpath("//*[@href='/join']"));
		element.click();
	}
	
	/**
	 * To get text
	 *
	 * @author Manoj
	 * @return String
	 */
	public String getHeader1() {
		WebElement element = getDriver().findElement(By.xpath("//div[contains(text(),'Join GitHub')]/following::h1"));
		String headerText = element.getText();
		return headerText;
	}
	
	/**
	 * To check enable of field
	 *
	 * @author Manoj
	 * @return String Value Return from String
	 */
	public boolean elementEnalbleOrDissable() throws AppException {
		WebElement element = getDriver().findElement(By.xpath("//*[@id='user_login']"));
		return element.isEnabled();
	}
	
	/**
	 * To get text
	 *
	 * @author Manoj
	 * @return String
	 */
	public String getHeader2() {
		WebElement element = getDriver().findElement(By.xpath("//*[contains(text(),'Reset')]/following::div[1]"));
		String headerText = element.getText();
		return headerText;
	}
}
