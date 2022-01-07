package co.com.sofka.userinterfaces.practiceform;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.*;

public class PracticeFormContactUs extends PageObject {

    public static final Target CONTACTUS = Target
            .the("Contact us")
            .located(id("contact-link"));

    public static final Target SIGNIN = Target
            .the("Sign in")
            .located(className("header_user_info"));

    public static final Target SUBJECT_HEADING = Target
            .the("Subject Heading")
            .located(id("uniform-id_contact"));

    public static final Target WEB_MASTER = Target
            .the("Subject Heading option")
            .located(xpath("//*[@id=\"id_contact\"]/option[3]"));
    public static final Target CUSTOMER_SERVICE= Target
            .the("Subject Heading option")
            .located(xpath("//*[@id=\"id_contact\"]/option[2]"));

    public static final Target EMAIL = Target
            .the("Email address")
            .located(id("email"));

    public static final Target ORDER_REFERENCE = Target
            .the("Order reference")
            .located(id("id_order"));

    public static final Target MESSAGE = Target
            .the("Message")
            .located(id("message"));

    public static final Target BUTTON_SEND_MESSAGE = Target
            .the("Button sutmit message")
            .located(id("submitMessage"));


    //For validations

    public static final Target VALIDATION_MESSAGE= Target
            .the("comfirm message  send")
            .located(xpath("//*[@id=\"center_column\"]/p"));

    public static final Target ERROR_MESSAGE= Target
            .the("Error send Message ")
            //.located(xpath("//*[@id=\"center_column\"]/div/ol/li/text()"));
            .located(xpath("//*[@id=\"center_column\"]/div/ol"));





}
