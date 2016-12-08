package leiloesmvn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsuariosSystemTest {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.google.com");
		WebElement textField = driver.findElement(By.name("q"));
		textField.sendKeys("teste");
		textField.submit();
	}
}
