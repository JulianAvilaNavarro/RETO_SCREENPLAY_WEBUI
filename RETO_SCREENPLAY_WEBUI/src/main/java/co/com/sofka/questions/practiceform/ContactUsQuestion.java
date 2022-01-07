package co.com.sofka.questions.practiceform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.sofka.userinterfaces.practiceform.PracticeFormContactUs.VALIDATION_MESSAGE;

public class ContactUsQuestion implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return (VALIDATION_MESSAGE.resolveFor(actor).containsOnlyText("Your message has been successfully sent to our team."));

    }
    public static ContactUsQuestion contactUsQuestion(){
        return new ContactUsQuestion();
    }
}
