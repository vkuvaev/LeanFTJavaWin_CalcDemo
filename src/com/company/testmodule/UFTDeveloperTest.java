package com.company.testmodule;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;
import com.hp.lft.sdk.stdwin.*;
import com.company.testmodule.AppModel;
import unittesting.*;

public class UFTDeveloperTest extends UnitTestClassBase {

    public UFTDeveloperTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new UFTDeveloperTest();
        globalSetup(UFTDeveloperTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws GeneralLeanFtException {

        Window calculatorWindow = Desktop.describe(Window.class, new WindowDescription.Builder()
                .childWindow(false)
                .ownedWindow(false)
                .windowClassRegExp("CalcFrame")
                .windowTitleRegExp("Calculator").build());

        calculatorWindow.click();

        Button buttonClear = Desktop.describe(Window.class, new WindowDescription.Builder()
                .childWindow(false)
                .ownedWindow(false)
                .windowClassRegExp("CalcFrame")
                .windowTitleRegExp("Calculator").build())
                .describe(Button.class, new ButtonDescription.Builder()
                        .nativeClass("Button")
                        .text("")
                        .windowId(81).build());
        buttonClear.click();

        Button button1 = Desktop.describe(Window.class, new WindowDescription.Builder()
                .childWindow(false)
                .ownedWindow(false)
                .windowClassRegExp("CalcFrame")
                .windowTitleRegExp("Calculator").build())
                .describe(Button.class, new ButtonDescription.Builder()
                        .nativeClass("Button")
                        .text("")
                        .windowId(131).build());
        button1.click();

        Button buttonPlus = Desktop.describe(Window.class, new WindowDescription.Builder()
                .childWindow(false)
                .ownedWindow(false)
                .windowClassRegExp("CalcFrame")
                .windowTitleRegExp("Calculator").build())
                .describe(Button.class, new ButtonDescription.Builder()
                        .nativeClass("Button")
                        .text("")
                        .windowId(93).build());
        buttonPlus.click();
        button1.click();

        Button buttonEqualSign = Desktop.describe(Window.class, new WindowDescription.Builder()
                .childWindow(false)
                .ownedWindow(false)
                .windowClassRegExp("CalcFrame")
                .windowTitleRegExp("Calculator").build())
                .describe(Button.class, new ButtonDescription.Builder()
                        .nativeClass("Button")
                        .text("")
                        .windowId(121).build());
        buttonEqualSign.click();




      //  AppModel TM = new AppModel(Desktop.describe(Window.class, new WindowDescription.Builder()
      //          .nativeClass("CalcFrame")
       //         .windowClassRegExp("CalcFrame")
       //         .windowTitleRegExp("Calculator").build()));
     //   TM.CalculatorWindow().highlight();
      //  TM.CalculatorWindow().ButtonClear().click();
      //  TM.CalculatorWindow().Button1().click();
      //  TM.CalculatorWindow().ButtonPlus().click();
      //  TM.CalculatorWindow().Button1().click();
       // TM.CalculatorWindow().ButtonEq().click();
    }

}