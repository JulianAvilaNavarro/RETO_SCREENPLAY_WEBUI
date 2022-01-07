package co.com.sofka.questions.practiceform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.practiceform.PracticeFormSignin.FAIL_MESSAGE;


public class SigninFailQuestion implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return (FAIL_MESSAGE.resolveFor(actor).containsOnlyText("Authentication failed."));

    }
    public static SigninFailQuestion signinFailQuestion(){
        return new SigninFailQuestion();
    }
}
