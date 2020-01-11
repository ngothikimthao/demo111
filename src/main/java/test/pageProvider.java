package test;

import org.openqa.selenium.support.PageFactory;
import pages.cucumberLoginPage;
import pages.welcomeUserNamePage;
import runner.TestRunner;

public class pageProvider {
    private static loginPage login;
    private static cucumberLoginPage cucumberLogin;
    private static welcomeUserNamePage welcomePage;

    public  static loginPage getLogin(){
        if (login == null){
            login = PageFactory.initElements(TestRunner.driver, loginPage.class);
        }
        return login;
    }

    public  static cucumberLoginPage getCucumberLoginTest(){
        if (cucumberLogin == null){
            cucumberLogin = PageFactory.initElements(TestRunner.driver, cucumberLoginPage.class);
        }
        return cucumberLogin;
    }

    public  static welcomeUserNamePage getWelcomePage(){
        if (welcomePage == null){
            welcomePage = PageFactory.initElements(TestRunner.driver, welcomeUserNamePage.class);
        }
       return welcomePage;
    }
}
