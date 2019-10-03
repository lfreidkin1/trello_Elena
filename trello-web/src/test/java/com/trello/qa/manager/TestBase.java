package com.trello.qa.manager;

import com.trello.qa.manager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.*;


public class TestBase {



  protected static ApplicationManager app = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));
  @BeforeMethod
  public void isOnHomePage() {
    if (!app.boardHelper.isTherePersonalBoards()) {
      app.boardHelper.returnToHomePage();
    }
  }

  @BeforeSuite
  public void setUp() {
    app.init();
  }

  @AfterSuite
  public void tearDown() {
    app.stop();
  }

}
