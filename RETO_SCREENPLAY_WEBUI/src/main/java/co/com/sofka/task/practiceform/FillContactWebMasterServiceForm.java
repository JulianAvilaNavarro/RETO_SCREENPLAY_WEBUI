package co.com.sofka.task.practiceform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.practiceform.PracticeFormContactUs.*;


public class FillContactWebMasterServiceForm implements Task {

    private String email;
    private String order_reference;
    private String message;

    public FillContactWebMasterServiceForm withEmail(String email) {
        this.email = email;
        return this;
    }

    public FillContactWebMasterServiceForm andOrder_reference(String order_reference) {
        this.order_reference = order_reference;
        return this;
    }

    public FillContactWebMasterServiceForm andMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(SUBJECT_HEADING),
                Click.on(SUBJECT_HEADING),
                Scroll.to(WEB_MASTER),
                Click.on(WEB_MASTER),
                Scroll.to(EMAIL),
                Enter.theValue(email).into(EMAIL),
                Scroll.to(ORDER_REFERENCE),
                Enter.theValue(order_reference).into(ORDER_REFERENCE),
                Scroll.to(BUTTON_SEND_MESSAGE),
                Click.on(BUTTON_SEND_MESSAGE),
                Scroll.to(ERROR_MESSAGE)
        );
    }

    public static FillContactWebMasterServiceForm fillContactWebMasterServiceForm(){
        return new FillContactWebMasterServiceForm();
    }
}
