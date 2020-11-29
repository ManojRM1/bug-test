public class LoginUiSteps {
	
	@Steps(shared = true)
	LoginUiHelper loginUiHelper;
	
	/**
	 * To login Git
	 *
	 * @author Manoj
	 * @param userName : input to enter
	 * @param passWord : input to enter
	 */
	@Given("User login to application with Valid {sting} and {sting}")
	public void userLoginToApplication(String userName, String passWord) {
		loginUiHelper.loginToApplication(userName,passWord);
	}
	
	/**
	 * To login Git
	 *
	 * @author Manoj
	 */
	@Given("^User is able to verify scenario for login$")
	public void userIsAbleToVerifyLogin() {
		loginUiHelper.verifyLogin();
	}
	
	/**
	 * To login Git
	 *
	 * @author Manoj
	 */
	@Given("^User login to application with invalid credentials$")
	public void userLoginToApplicationWithInvalidCredentials() {
		loginUiHelper.verifyLogin();
	}
	
	/**
	 * To login Git
	 *
	 * @author Manoj
	 */
	@Given("^User is able to verify error scenarios in the application$")
	public void userIsAbleToVerifyErrorScenarios() {
		loginUiHelper.verifyLogin();
	}
}