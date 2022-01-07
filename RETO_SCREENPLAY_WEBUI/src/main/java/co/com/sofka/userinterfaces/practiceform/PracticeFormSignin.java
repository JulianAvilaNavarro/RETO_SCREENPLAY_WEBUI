package co.com.sofka.userinterfaces.practiceform;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.*;

public class PracticeFormSignin extends PageObject {


    public static final Target SIGNIN = Target
            .the("Sign in")
            .located(className("header_user_info"));

    public static final Target EMAIL= Target
            .the("Email for login")
            .located(id("email"));
    public static final Target PASSWORD_LOGIN= Target
            .the("Password for login")
            .located(id("passwd"));

    public static final Target CREATE_ACOUNT_EMAIL= Target
            .the("CREATE AN ACCOUNT")
            .located(id("email_create"));

    public static final Target CREATE_ACOUNT_BUTTON = Target
            .the("CREATE AN ACCOUNT NETX")
            .located(xpath("//*[@id=\"SubmitCreate\"]/span"));

    public static final Target LOGIN_BUTTON = Target
            .the("Button for login")
            .located(id("SubmitLogin"));

    public static final Target MR= Target
            .the("MISTER")
            .located(id("id_gender1"));

    public static final Target MRS = Target
            .the("MISSES")
            .located(id("id_gender2"));

    public static final Target CUSTOMER_FIRST_NAME = Target
            .the("Customer Name")
            .located(id("customer_firstname"));

    public static final Target CUSTOMER_LAST_NAME = Target
            .the("Customer LastName")
            .located(id("customer_lastname"));

    public static final Target PASSWORD = Target
            .the("The password")
            .located(id("passwd"));

    public static final Target DAYBIRD= Target
            .the("Day bird")
            .located(cssSelector("#days :nth-child(11)"));

    public static final Target MONTHBIRD= Target
            .the("Month Bird")
            .located(cssSelector("#months :nth-child(2)"));
    public static final Target YEARBIRD= Target
            .the("Year Bird")
            .located(cssSelector("#years :nth-child(24)"));

    public static final Target NEWSLETTER= Target
            .the("Newsletter")
            .located(id("uniform-newsletter"));

    public static final Target INFO= Target
            .the("Additional Info")
            .located(id("uniform-optin"));

    public static final Target FIRTS_NAME= Target
            .the("First Name")
            .located(id("firstname"));

    public static final Target LAST_NAME= Target
            .the("Last Name")
            .located(id("lastname"));


    public static final Target COMPANY= Target
            .the("Company nam")
            .located(id("company"));

    public static final Target ADDRESS= Target
            .the("Address")
            .located(id("address1"));

    public static final Target CITY= Target
            .the("City")
            .located(id("city"));

    public static final Target STATE= Target
            .the("State")
            .located(cssSelector("#id_state :nth-child(11)"));

    public static final Target POSTCODE= Target
            .the("Postal code")
            .located(id("postcode"));

    public static final Target COUNTRY= Target
            .the("Country name")
            .located(id("id_country"));

    public static final Target ADDITIONAL_INFO= Target
            .the("Additional Info")
            .located(id("other"));

    public static final Target PHONE= Target
            .the("PHONE")
            .located(id("phone"));


    public static final Target MOBILE_PHONE= Target
            .the("Mobile Phone")
            .located(id("phone_mobile"));



    public static final Target ALIAS= Target
            .the("address alias")
            .located(id("alias"));


    public static final Target SUBMIT_ACCOUNT_BUTTON= Target
            .the("Submit button")
            .located(id("submitAccount"));






    //For validations

    public static final Target VALIDATION_MESSAGE = Target
            .the("Message to validation")
            .located(cssSelector(".account :nth-child(1)"));


    public static final Target FAIL_MESSAGE = Target
            .the("Message to validation")
            .located(xpath("//*[@id=\"center_column\"]/div[1]/ol/li"));




}
