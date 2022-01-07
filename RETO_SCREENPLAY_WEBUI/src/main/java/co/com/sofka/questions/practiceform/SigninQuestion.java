package co.com.sofka.questions.practiceform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.practiceform.PracticeFormSignin.VALIDATION_MESSAGE;


public class SigninQuestion implements Question {



    @Override
    public Object answeredBy(Actor actor) {
        return VALIDATION_MESSAGE.resolveFor(actor).getText();

    }
    public static SigninQuestion signinQuestion(){
        return new SigninQuestion();
    }
}
