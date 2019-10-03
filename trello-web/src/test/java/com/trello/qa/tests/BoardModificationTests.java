package com.trello.qa.tests;

import com.trello.qa.manager.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardModificationTests extends TestBase {

    @Test
public void boardRenameTest() throws InterruptedException {
    app.getBoardHelper().clickOnFirstPrivateBoard();
   app.getBoardHelper().editBoard();
    app.getBoardHelper().renameBoard("jkl4");
    app.getBoardHelper().returnToHomePage();
app.getBoardHelper().clickOnFirstPrivateBoard();

    }



}
