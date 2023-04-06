package com.krafttech.steps_defs.steps_defs;

import com.krafttech.steps_defs.pages.DashboardPage;
import com.krafttech.steps_defs.pages.OverviewPage;
import io.cucumber.java.en.When;

public class Profile_StepDefs {

    @When("User should go to my profile with {string}")
    public void user_should_go_to_my_profile_with(String tabName) {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule(tabName,"My Profile");
    }

    @When("User should navigate to {string}")
    public void user_should_navigate_to(String tabName) {
        OverviewPage overviewPage = new OverviewPage();
        overviewPage.tapOnTab(tabName);
    }

}
