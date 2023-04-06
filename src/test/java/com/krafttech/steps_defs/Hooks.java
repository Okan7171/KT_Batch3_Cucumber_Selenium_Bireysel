package com.krafttech.steps_defs;

import com.krafttech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        System.out.println("\tThis is coming from Before method");
    }

    @After
    public void tearDown(Scenario scenario){
        System.out.println("\tThis is coming from After method");

        if (scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        Driver.closeDriver();
    }

    @Before ("@db")
    public void setUpDB(){
        System.out.println("\tConnecting DB");
    }
    @After ("@db")
    public void tearDownDB(){
        System.out.println("\tDisconnecting DB");
    }


}
