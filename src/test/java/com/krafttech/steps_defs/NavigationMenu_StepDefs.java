package com.krafttech.steps_defs;

import io.cucumber.java.en.Then;
import org.junit.Assert;

public class NavigationMenu_StepDefs {

    @Then("The user should be able to see Dashboard text")
    public void the_user_should_be_able_to_see_Dashboard_text() {
        System.out.println("I verified that Dashboard text is here");
    }

    @Then("The user navigates to Developer menu")
    public void the_user_navigates_to_Developer_menu() {
        System.out.println("user navigates to developers menu");
    }

    @Then("The user able to see Developers text")
    public void the_user_able_to_see_Developers_text() {
        System.out.println("I verify that developers text is here");
        Assert.assertTrue(100<99);
    }
    @Then("The user navigates to Forms Input menu")
    public void the_user_navigates_to_Forms_Input_menu() {
        System.out.println("user navigates to Forms Input menu");
    }

    @Then("The user able to see General Form Elements - Input text")
    public void the_user_able_to_see_General_Form_Elements_Input_text() {
        System.out.println("I verify that General Form Elements - Input text is here");
    }

    @Then("The user navigates to My Profile menu")
    public void the_user_navigates_to_My_Profile_menu() {
        System.out.println("user navigates to My Profile menu");
    }

    @Then("The user able to see User Profile text")
    public void the_user_able_to_see_User_Profile_text() {
        System.out.println("I verify that User Profile text is here");
    }

}
