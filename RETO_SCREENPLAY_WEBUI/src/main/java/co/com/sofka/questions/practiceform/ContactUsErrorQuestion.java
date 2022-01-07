package co.com.sofka.questions.practiceform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.practiceform.PracticeFormContactUs.ERROR_MESSAGE;


public class ContactUsErrorQuestion implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return (ERROR_MESSAGE.resolveFor(actor).containsOnlyText("The message cannot be blank."));

    }
    public static ContactUsErrorQuestion contactUsErrorQuestionn(){
        return new ContactUsErrorQuestion();
    }
}
