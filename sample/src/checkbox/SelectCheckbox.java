package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCheckbox {

	public static void main(String[] args) throws InterruptedException
	 { 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("smartphone");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]")).click();	
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("rohitchoudhary7610@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Rohit@123");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		Thread.sleep(3000);
		
		driver.get("https://www.amazon.in/s?k=neckband&crid=27S92Z524SFGK&sprefix=neeck%2Caps%2C261&ref=nb_sb_ss_inft-rank-pairwise-override-in-t3_2_5");
		driver.findElement(By.xpath("//*[@id=\"p_90/6741118031\"]/span/a/div/label/i")).click();
		driver.findElement(By.xpath("//*[@id=\"p_n_is_cod_eligible/4931671031\"]/span/a/div/label/i")).click();
		Thread.sleep(3000);
		
	}

}
