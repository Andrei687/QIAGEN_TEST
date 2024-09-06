package setup;

import dataprovider.envVariables;
import org.openqa.selenium.WebDriver;

public class BaseClass {

    public WebDriver driver;
    public envVariables vars = new envVariables();
    public String loginPageURL = vars.loginPage;

}