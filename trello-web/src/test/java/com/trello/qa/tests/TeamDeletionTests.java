package com.trello.qa.tests;

import com.trello.qa.manager.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TeamDeletionTests extends TestBase {
  @BeforeMethod
  public void preconditions()
  {
    if (!app.getTeamHelper().isTeamsPresent())
    {
      app.getTeamHelper().createTeam();
    }
  }
  @Test
  public void deleteTeamFromLeftNavMenu() throws InterruptedException {

    int before = app.getTeamHelper().getTeamsCount();

      app.getTeamHelper().clickOnFirstTeam();
      app.getTeamHelper().openSettings();
      app.getTeamHelper().deleteTeam();
      app.getTeamHelper().returnToHomePage();
      app.getTeamHelper().refreshPage();

    int after = app.getTeamHelper().getTeamsCount();
    Assert.assertEquals(after, before - 1);


  }


}
