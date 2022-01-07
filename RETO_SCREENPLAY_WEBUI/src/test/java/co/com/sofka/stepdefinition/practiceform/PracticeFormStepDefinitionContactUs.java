package co.com.sofka.stepdefinition.practiceform;

import co.com.sofka.models.practiceform.PracticeFormModelContactUs;
import co.com.sofka.stepdefinition.Setup;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import java.util.Locale;

import static co.com.sofka.questions.practiceform.ContactUsErrorQuestion.contactUsErrorQuestionn;
import static co.com.sofka.questions.practiceform.ContactUsQuestion.contactUsQuestion;
import static co.com.sofka.task.OpenLandingPage.openLandingPage;
import static co.com.sofka.task.practiceform.BrowseToContacUs.browseToContacUs;
import static co.com.sofka.task.practiceform.FillContactUsCustomerServiceForm.fillContactUsCustomerServiceForm;
import static co.com.sofka.task.practiceform.FillContactWebMasterServiceForm.fillContactWebMasterServiceForm;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class PracticeFormStepDefinitionContactUs extends Setup {
    private static final Logger LOGGER = Logger.getLogger(PracticeFormStepDefinitionContactUs.class);
    private static final String ACTOR_NAME = "Julian";
    PracticeFormModelContactUs practiceFormModelContactUs;
    private PracticeFormModelContactUs messgeok;
    ////////// Scenario 1//////////////////

    @Given("el cliente se encuentra en la pagina de inicio para escribir a servicio al cliente")
    public void elClienteSeEncuentraEnLaPaginaDeInicioParaEscribirAServicioAlCliente() {
        try {
            LOGGER.info("Se inicializa las configuraciones");
            actorSetupTheBrowser(ACTOR_NAME);
            theActorInTheSpotlight().wasAbleTo(
                    openLandingPage()
            );
        }catch (Exception e){
            LOGGER.info("Error en la configuración");
        }

    }

    @When("el cliente realizara envia un mensaje para conocer ofertas adicionales")
    public void elClienteRealizaraEnviaUnMensajeParaConocerOfertasAdicionales() {
        try {
            LOGGER.info("Se realiza envia la informacion para los campos requeridos");
        messasender();
        theActorInTheSpotlight().attemptsTo(
                browseToContacUs(),
                fillContactUsCustomerServiceForm()
                        .withEmail(messgeok.getEmail())
                        .andOrder_reference(messgeok.getOrderreference())
                        .andMessage(messgeok.getMessage())
        );}catch (Exception e){
            LOGGER.info("Error en el envío de la informacion");
        }

    }

    @Then("el cliente  debera ver que ha recibido el mensaje de confirmacion de confirmacion consulta a servicio al cliente")
    public void elClienteDeberaVerQueHaRecibidoElMensajeDeConfirmacionDeConfirmacionConsultaAServicioAlCliente() {
        try {
            LOGGER.info("Se realiza la validación del envio de la informacion");
        theActorInTheSpotlight().should(
                seeThat(
                        contactUsQuestion(),equalTo(true)
                )
        );}catch (Exception e){
            LOGGER.info("Error en la validacion");}
    }
    ////////// Scenario 2 //////////////////
    @Given("el cliente se encuentra en la pagina de inicio para escribir al administrador")
    public void elClienteSeEncuentraEnLaPaginaDeInicioParaEscribirAlAdministrador() {
        try {
            LOGGER.info("Se inicializa las configuraciones");
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage()
        );  }catch (Exception e){
            LOGGER.info("Error en la configuración");
        }

    }

    @When("el cliente realizara el proceso para enviar un mensaje vacio")
    public void elClienteRealizaraElProcesoParaEnviarUnMensajeVacio() {
        try {
            LOGGER.info("Se realiza envia la informacion para los campos requeridos");
        messasender();
        theActorInTheSpotlight().attemptsTo(
                browseToContacUs(),
                fillContactWebMasterServiceForm()
                        .withEmail(messgeok.getEmail())
                        .andOrder_reference(messgeok.getOrderreference())
        );}catch (Exception e){
            LOGGER.info("Error en el envío de la informacion");
        }

    }

    @Then("el cliente  debera ver que ha recibido el mensaje de error")
    public void elClienteDeberaVerQueHaRecibidoElMensajeDeError() {
        try {
            LOGGER.info("Se realiza la validación del envio de la informacion");
        theActorInTheSpotlight().should(
                seeThat(
                        contactUsErrorQuestionn(),equalTo(true)
                )
        );}catch (Exception e){
            LOGGER.info("Error en la validacion");}

    }

    private void messasender() {
        messgeok = new PracticeFormModelContactUs();
        Faker usFaker = new Faker(new Locale("en-US"));
        String name=usFaker.name().firstName();
        String lastName=usFaker.name().lastName();
        messgeok.setEmail(name+lastName+"@gmol.com");
        messgeok.setOrderreference(usFaker.bothify("###???"));
        messgeok.setMessage("Quiero conocer nuevas ofertas");
    }



}
