package co.com.sofka.task.practiceform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.Wait;


import static co.com.sofka.userinterfaces.practiceform.PracticeFormSignin.*;
import static co.com.sofka.userinterfaces.practiceform.PracticeFormSignin.SIGNIN;

public class FillSigninInfoForm implements Task {
    private String email;
    private String customerFirstName;
    private String customerLastName;
    private String gender;
    private String password;
    private String dayBird;
    private String monthBird;
    private String yearBird;
    private String firstName;
    private String lastName;
    private String company;
    private String address;
    private String city;
    private String state;
    private String postalcode;
    private String country;
    private String aditionalinfo;
    private String homephone;
    private String mobilephone;
    private String addressalias;

    public FillSigninInfoForm withEmail(String email) {
        this.email = email;
        return this;
    }

    public FillSigninInfoForm andCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
        return this;
    }

    public FillSigninInfoForm andCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
        return this;
    }

    public FillSigninInfoForm andGender(String gender) {
        this.gender = gender;
        return this;
    }
    public FillSigninInfoForm andPassword(String password) {
        this.password = password;
        return this;
    }

    public FillSigninInfoForm andDayBird(String dayBird) {
        this.dayBird = dayBird;
        return this;
    }

    public FillSigninInfoForm andMonthBird(String monthBird) {
        this.monthBird = monthBird;
        return this;
    }
    public FillSigninInfoForm andYearBird(String yearBird) {
        this.yearBird = yearBird;
        return this;
    }

    public FillSigninInfoForm andFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public FillSigninInfoForm andLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public FillSigninInfoForm andCompany(String company) {
        this.company = company;
        return this;
    }

    public FillSigninInfoForm andAddress(String address) {
        this.address = address;
        return this;
    }

    public FillSigninInfoForm andCity(String city) {
        this.city = city;
        return this;
    }
    public FillSigninInfoForm andState(String state) {
        this.state = state;
        return this;
    }

    public FillSigninInfoForm andPostalcode(String postalcode) {
        this.postalcode = postalcode;
        return this;
    }

    public FillSigninInfoForm andCountry(String country) {
        this.country = country;
        return this;
    }


    public FillSigninInfoForm andAditionalinfo(String aditionalinfo) {
        this.aditionalinfo = aditionalinfo;
        return this;
    }

    public FillSigninInfoForm andHomephone(String homephone) {
        this.homephone = homephone;
        return this;
    }

    public FillSigninInfoForm andMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
        return this;
    }

    public FillSigninInfoForm andAddressalias(String addressalias) {
        this.addressalias = addressalias;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(SIGNIN),
                Click.on(SIGNIN),
                Enter.theValue(email).into(CREATE_ACOUNT_EMAIL),
                Scroll.to(CREATE_ACOUNT_BUTTON),
                Click.on(CREATE_ACOUNT_BUTTON),
                Click.on(MR),
                Scroll.to(CUSTOMER_FIRST_NAME),
                Enter.theValue(customerFirstName).into(CUSTOMER_FIRST_NAME),
                Enter.theValue(customerLastName).into(CUSTOMER_LAST_NAME),
                Scroll.to(PASSWORD),
                Enter.theValue(password).into(PASSWORD),
                Click.on(DAYBIRD),
                Click.on(MONTHBIRD),
                Click.on(YEARBIRD),
                Scroll.to(NEWSLETTER),
                Click.on(NEWSLETTER),
                Click.on(ADDITIONAL_INFO),
                Enter.theValue(firstName).into(FIRTS_NAME),
                Enter.theValue(lastName).into(LAST_NAME),
                Enter.theValue(company).into(COMPANY),
                Enter.theValue(address).into(ADDRESS),
                Enter.theValue(city).into(CITY),
                Click.on(STATE),
                Scroll.to(POSTCODE),
                Enter.theValue(postalcode).into(POSTCODE),
                Enter.theValue(aditionalinfo).into(ADDITIONAL_INFO),
                Enter.theValue(homephone).into(PHONE),
                Enter.theValue(mobilephone).into(MOBILE_PHONE),
                Enter.theValue(addressalias).into(ALIAS),
                Scroll.to(SUBMIT_ACCOUNT_BUTTON),
                Click.on(SUBMIT_ACCOUNT_BUTTON)
        );
    }

    public static FillSigninInfoForm fillSigninInfoForm(){
        return new FillSigninInfoForm();
    }
}
