package com.trello.qa.tests;

import com.trello.qa.manager.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardCreationTests extends TestBase {
  @Test
  public void testBoardCreation() throws InterruptedException {
    int beforeCreation = app.getBoardHelper().getPersnalBoardsCount();
    app.getBoardHelper().clickOnPlusButtonOnHeader();
    app.getBoardHelper().selectCreateBoardFromDropDown();
    app.getBoardHelper().fillBoardCreationForm("qa21", "descr qa 21");
    app.getBoardHelper().confirmBoardCreation();
    app.getBoardHelper().returnToHomePage();

    int afterCreation = app.getBoardHelper().getPersnalBoardsCount();

    Assert.assertEquals(afterCreation, beforeCreation + 1);
  }


}
