package com.testrunner;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.Baseclass;
import com.helper.DataReaderManager;
import com.projectobjectmanager.Projectobjectmanager;

public class Testrunner extends Baseclass{
	public static WebDriver driver;
	public static void main(String[] args) throws IOException{
		driver=browserLaunch("chrome");
		urlLaunch(DataReaderManager.getInstanceDRM().getInstanceDR().getPropertyUrl());
		Projectobjectmanager pom=new Projectobjectmanager(driver);
		driver.manage().window().maximize();
//		pom.getInstanceCA().getCreateAcbtn().click();
//		pom.getInstanceCA().getFirstName().sendKeys("Klisha");
//		pom.getInstanceCA().getLastName().sendKeys("kat");
//		pom.getInstanceCA().getEmailAddress().sendKeys("pavithra.s@gmail.com");
//		pom.getInstanceCA().getPassword().sendKeys("Kl1sh@kat");
//		pom.getInstanceCA().getPassConfirm().sendKeys("Kl1sh@kat");
//		pom.getInstanceCA().getCreateBtn().click();
		WebDriverWait wait= new WebDriverWait(driver, 10);
		pom.getInstanceSI().getSignin().click();
		pom.getInstanceSI().getEmail().sendKeys(DataReaderManager.
				getInstanceDRM().getInstanceDR().gerPropertyUsername());
		pom.getInstanceSI().getPass().sendKeys(DataReaderManager.
				getInstanceDRM().getInstanceDR().getPropertyPassword());
		pom.getInstanceSI().getSigninBtn().click();
		actionMoveTo("moveto",pom.getInstanceMen().getMen());
		actionMoveTo("moveto",pom.getInstanceMen().getTops());
		actionMoveTo("moveto",pom.getInstanceMen().getTees());
		actionMoveTo("click",pom.getInstanceMen().getTees());
		clickElement(pom.getInstanceMentee().getTees());
		clickElement(pom.getInstanceOrderpage().getSizeXs());
		clickElement(pom.getInstanceOrderpage().getColorB());
		pom.getInstanceOrderpage().getQty().clear();
		sendKeys(pom.getInstanceOrderpage().getQty(),"2");
		clickElement(pom.getInstanceOrderpage().getCart());
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class=\"action showcart\"]/span[@class=\"counter qty\"]")));
		clickElement(pom.getInstanceOrderpage().getMyCart());
		clickElement(pom.getInstanceOrderpage().getCheckoutBtn());
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"customer-email\"]")));
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		sendKeys(pom.getInstanceShippage().getEmail(),"pavithra.s@gmail.com");
//		sendKeys(pom.getInstanceShippage().getfName(),"Klisha");
//		sendKeys(pom.getInstanceShippage().getlName(),"Kat");
//		sendKeys(pom.getInstanceShippage().getCompany(),"KlishaKat");
//		sendKeys(pom.getInstanceShippage().getStreet0(),"2/3-martin street");
//		sendKeys(pom.getInstanceShippage().getStreet1(),"2/3-martin street");
//		sendKeys(pom.getInstanceShippage().getStreet2(),"2/3-martin street");
//		sendKeys(pom.getInstanceShippage().getCity(),"voila");
//		selectElements("visbletext",pom.getInstanceShippage().getRegion(),"New York");
//		sendKeys(pom.getInstanceShippage().getPostcode(),"10009");
//		selectElements("visbletext",pom.getInstanceShippage().getCountry(),"United States");
//		sendKeys(pom.getInstanceShippage().getPh(),"2126886262");
		clickElement(pom.getInstanceShippage().getRadio1());
		clickElement(pom.getInstanceShippage().getNext());
//		
	}
}

