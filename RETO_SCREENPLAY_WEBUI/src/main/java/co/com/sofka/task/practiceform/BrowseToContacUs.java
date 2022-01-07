package co.com.sofka.task.practiceform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.practiceform.PracticeFormContactUs.CONTACTUS;


public class BrowseToContacUs implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CONTACTUS),
                Click.on(CONTACTUS)
        );
    }

    public static BrowseToContacUs browseToContacUs(){
        return new BrowseToContacUs();
    }
}
