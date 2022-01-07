package co.com.sofka.stepdefinition.practiceform;

import co.com.sofka.models.practiceform.PracticeFormModelSignin;
import co.com.sofka.stepdefinition.Setup;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import java.util.Locale;

import static co.com.sofka.questions.practiceform.SigninFailQuestion.signinFailQuestion;
import static co.com.sofka.questions.practiceform.SigninQuestion.signinQuestion;
import static co.com.sofka.task.OpenLandingPage.openLandingPage;
import static co.com.sofka.task.practiceform.BrowseToSignin.browseToSignin;
import static co.com.sofka.task.practiceform.FillSigninFailLogin.fillSigninFailLogin;
import static co.com.sofka.task.practiceform.FillSigninInfoForm.fillSigninInfoForm;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class PracticeFormStepDefinitionSignIn extends Setup {
    private static final Logger LOGGER = Logger.getLogger(PracticeFormStepDefinitionSignIn.class);
    private static final String ACTOR_NAME = "Julian";
    PracticeFormModelSignin practiceFormModelSignin;
    private PracticeFormModelSignin register;
    private PracticeFormModelSignin login;
    ////////// Scenario 1//////////////////
    @Given("el cliente se encuentra en la pagina de inicio para registrarse")
    public void elClienteSeEncuentraEnLaPaginaDeInicioParaRegistrarse() {
        try {
            LOGGER.info("Se inicializa las configuraciones");
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage()
        );}catch (Exception e){
            LOGGER.info("Error en la configuración");
        }

    }

    @When("el cliente ingresa la informacion necesaria para el registro en la pagina web")
    public void elClienteIngresaLaInformacionNecesariaParaElRegistroEnLaPaginaWeb() {
        try {
            LOGGER.info("Se realiza envia la informacion para los campos requeridos para registro");
        registerdata();
        theActorInTheSpotlight().attemptsTo(
                browseToSignin(),
                fillSigninInfoForm()
                        .withEmail(register.getEmail())
                        .andCustomerFirstName(register.getCustomerFirstName())
                        .andCustomerLastName(register.getCustomerLastName())
                        .andPassword(register.getPassword())
                        .andDayBird(register.getDayBird())
                        .andMonthBird(register.getMonthBird())
                        .andYearBird(register.getYearBird())
                        .andFirstName(register.getFirstName())
                        .andLastName(register.getLastName())
                        .andCompany(register.getCompany())
                        .andAddress(register.getAddress())
                        .andCity(register.getCity())
                        .andState(register.getState())
                        .andPostalcode(register.getPostalcode())
                        .andAditionalinfo(register.getAditionalinfo())
                        .andHomephone(register.getHomephone())
                        .andMobilephone(register.getMobilephone())
                        .andAddressalias(register.getAddressalias())

        );
        }catch (Exception e){
            LOGGER.info("Error en el envío de la informacion del registro");
        }
    }

    @Then("el cliente vera el mensaje de  confirmacion del registro exitoso en la pagina")
    public void elClienteVeraElMensajeDeConfirmacionDelRegistroExitosoEnLaPagina() {
        try {
            LOGGER.info("Se realiza la validación del usuario creado");
        theActorInTheSpotlight().should(
                seeThat(
                        signinQuestion(),equalTo(register.getCustomerFirstName()+" "+ register.getCustomerLastName())
                )
        );}catch (Exception e){
            LOGGER.info("Error en la validacion de usuario");}

    }

    @Given("el cliente se encuentra en la pagina de inicio para logearse")
    public void elClienteSeEncuentraEnLaPaginaDeInicioParaLogearse() {
        try {
            LOGGER.info("Se inicializa las configuraciones");
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage());
        }catch (Exception e){
            LOGGER.info("Error en la configuración");
        }
    }

    @When("el cliente ingresa su informacion para el ingreso a la pagina")
    public void elClienteIngresaSuInformacionParaElIngresoALaPagina() {
        try {
            LOGGER.info("Se  envia la informacion para los campos requeridos para el logeo");
        logindata();
        theActorInTheSpotlight().attemptsTo(
                browseToSignin(),
                fillSigninFailLogin()
                        .withEmail(login.getEmail())
                        .andPassword(login.getPassword())

        );}catch (Exception e){
            LOGGER.info("Error en el envío de la informacion para logeo");}

    }

    @Then("el cliente  debera ver que ha recibido el mensaje de que no esta registrado en la pagina")
    public void elClienteDeberaVerQueHaRecibidoElMensajeDeQueNoEstaRegistradoEnLaPagina() {
        try {
            LOGGER.info("Se realiza la validación del login fallico");
        theActorInTheSpotlight().should(
                seeThat(
                        signinFailQuestion(),equalTo(true)
                )
        );}catch (Exception e){
            LOGGER.info("Error en la validacion del login fallido");}
    }

    public void registerdata() {
        Faker usFaker = new Faker(new Locale("en-US"));
        register = new PracticeFormModelSignin();
        String name=usFaker.name().firstName();
        String lastName=usFaker.name().lastName();
        register.setCustomerFirstName(name);
        register.setCustomerLastName(lastName);
        register.setEmail(name+lastName+"@gmol.com");
        register.setCustomerFirstName(name);
        register.setCustomerLastName(lastName);
        register.setPassword(usFaker.bothify("######"));
        register.setDayBird("12");
        register.setMonthBird("March");
        register.setYearBird("1994");
        register.setFirstName(name);
        register.setLastName(lastName);
        register.setCompany(usFaker.company().name());
        register.setAddress(usFaker.address().fullAddress());
        register.setCity("Ibague");
        register.setState("Florida");
        register.setPostalcode("00000");
        register.setAditionalinfo(usFaker.backToTheFuture().character());
        register.setHomephone("0602656416");
        register.setMobilephone(usFaker.phoneNumber().cellPhone());
        register.setAddressalias(usFaker.animal().name());

    }

    public void logindata() {
        Faker usFaker = new Faker(new Locale("en-US"));
        login = new PracticeFormModelSignin();
        String animal=usFaker.animal().name();
        String lastName=usFaker.name().lastName();
        login.setEmail(animal+lastName+"@gmol.com");
        login.setPassword(usFaker.bothify("######"));


    }


}
