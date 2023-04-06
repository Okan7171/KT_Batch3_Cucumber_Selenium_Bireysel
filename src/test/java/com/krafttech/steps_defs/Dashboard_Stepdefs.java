package com.krafttech.steps_defs;

import com.krafttech.pages.DashboardPage;
import com.krafttech.pages.LoginPage;
import com.krafttech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class Dashboard_Stepdefs {

    @Then("Validate all tabs are on the page")
    public void validate_all_tabs_are_on_the_page(List<String> tabNames) {
        DashboardPage dashboardPage = new DashboardPage();
        List<String> expected = tabNames;
        List<String> actual = BrowserUtils.getElementsText(dashboardPage.menuList);
        Assert.assertEquals(expected,actual);
        BrowserUtils.waitFor(5);
        System.out.println("tabNames = " + tabNames);
        System.out.println("actual = " + actual);
    }

    @Then("Enter credentials and validate that user is on the home page")
    public void enter_credentials_and_validate_that_user_is_on_the_home_page(Map<String, String> map) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(
            map.get("userEmail"),
            map.get("password")
        );
        BrowserUtils.waitFor(3);
        String expected = map.get("name");
        String actual = loginPage.getAccountName();
        Assert.assertEquals(expected,actual);
    }

    @Then("Verify that {string} is visible on the dashboard")
    public void verify_that_is_visible_on_the_dashboard(String name) {
        DashboardPage dashboardPage = new DashboardPage();
        String expectedName = name;
        String actualName = dashboardPage.getAccountName();
        Assert.assertEquals(expectedName,actualName);
    }

    @When("Go to {string} and {string}")
    public void go_to_and(String tab, String module) {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule(tab, module);
    }

    @Then("Verify that {string} and {string} and {string}")
    public void verify_that_and_and(String string, String string2, String string3) {
        DashboardPage dashboardPage = new DashboardPage();
        String expected1 = string;
        String expected2 = string2;
        String expected3 = string3;
        String actual1 = dashboardPage.firstTitle.getText();
        String actual2 = dashboardPage.secondTitle.getText();
        String actual3 = dashboardPage.thirdTitle.getText();
        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);
        Assert.assertEquals(expected3,actual3);
    }
}
