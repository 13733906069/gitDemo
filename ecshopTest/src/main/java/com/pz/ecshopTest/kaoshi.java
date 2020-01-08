package com.pz.ecshopTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class kaoshi {
	WebDriver driver;
	Navigation navigation;

	@BeforeMethod
	public void BeforeMethod() {
		System.setProperty("webdriver.gecko.driver", "d:\\browserDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		navigation = driver.navigate();
	}
	@Test
	public void login() throws InterruptedException {
		driver.get("http://192.168.29.29/ecshop");
		WebElement loginbut = driver.findElement(By.cssSelector("img[src='themes/default/images/bnt_log.gif']"));
		loginbut.click();
		WebElement username = driver.findElement(By.cssSelector("input[name='username']"));
		username.sendKeys("123456");
		WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
		password.sendKeys("123456");
		WebElement submit = driver.findElement(By.cssSelector("input[name=submit]"));
		submit.click();
		Thread.sleep(5000);
		Assert.assertTrue(driver.getPageSource().contains("退"));
		WebElement shangpin = driver.findElement(By.cssSelector("img[src='images/200905/thumb_img/9_thumb_G_1241511871555.jpg'"));
		shangpin.click();
		WebElement gouwuche = driver.findElement(By.cssSelector("img[src='themes/default/images/bnt_cat.gif']"));
		gouwuche.click();
		Thread.sleep(1500);
		WebElement jiesuan = driver.findElement(By.cssSelector("img[src='themes/default/images/checkout.gif']"));
		jiesuan.click();
		Thread.sleep(1500);
		
		/*WebElement guojia = driver.findElement(By.cssSelector("#selCountries_0"));
		Select s=new Select(guojia);
		s.selectByIndex(1);
		WebElement shengfen = driver.findElement(By.cssSelector("#selProvinces_0"));
		Select ss=new Select(shengfen);
		ss.selectByIndex(5);
		WebElement city = driver.findElement(By.cssSelector("#selCities_0"));
		Select sss=new Select(city);
		sss.selectByIndex(2);
		WebElement citys = driver.findElement(By.cssSelector("#selDistricts_0"));
		Select ssss=new Select(citys);
		ssss.selectByIndex(2);
		WebElement name = driver.findElement(By.cssSelector("#consignee_0"));
		name.sendKeys("zdf");
		WebElement dizhi = driver.findElement(By.cssSelector("#address_0"));
		dizhi.sendKeys("test");
		WebElement bianma = driver.findElement(By.cssSelector("#zipcode_0"));
		bianma.sendKeys("123456");
		WebElement phone = driver.findElement(By.cssSelector("#tel_0"));
		phone.sendKeys("13733906069");
		WebElement mobile = driver.findElement(By.cssSelector("#mobile_0"));
		mobile.sendKeys("123456789");
		WebElement jianzhu = driver.findElement(By.cssSelector("#sign_building_0"));
		jianzhu.sendKeys("123123");
		WebElement best_time_0 = driver.findElement(By.cssSelector("#best_time_0"));
		best_time_0.sendKeys("123123");
		WebElement tijiao = driver.findElement(By.cssSelector("input[class=bnt_blue_2]"));
		tijiao.click();
		Thread.sleep(1000);*/
		
		WebElement type = driver.findElement(By.xpath("//input[@name='shipping'][@value=5]"));
		type.click();
		WebElement money = driver.findElement(By.xpath("//input[@name='payment'][@value=1]"));
		money.click();
		WebElement tijiaos = driver.findElement(By.cssSelector("input[src='themes/default/images/bnt_subOrder.gif'"));
		tijiaos.click();
		//
	}
	
	
}
