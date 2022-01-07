package co.com.sofka.task.practiceform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.practiceform.PracticeFormSignin.*;

public class FillSigninFailLogin implements Task {
    private String email;
    private String password;


    public FillSigninFailLogin withEmail(String email) {
        this.email = email;
        return this;
    }
    public FillSigninFailLogin andPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(SIGNIN),
                Click.on(SIGNIN),
                Enter.theValue(email).into(EMAIL),
                Enter.theValue(password).into(PASSWORD_LOGIN),
                Click.on(LOGIN_BUTTON)

        );
    }
    public static FillSigninFailLogin fillSigninFailLogin(){
        return new FillSigninFailLogin();
    }

}
