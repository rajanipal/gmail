package gmail;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class login {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();

        d.get("http://www.gmail.com/");
        
        //id
        d.findElement(By.id("identifierId")).sendKeys("rajani.1993pal@gmail.com");
        d.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
        d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        
        //pwd
        d.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Rajanipal@1905");
        d.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(Keys.ENTER);
        d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        
        //compose
        d.findElement(By.xpath("//*[@id=\":kc\"]/div/div")).click();
        d.findElement(By.xpath("//*[@id=\":q3\"]")).sendKeys("shikhamaini.27@gmail.com");
        d.findElement(By.xpath("//*[@id=\":q3\"]")).sendKeys(Keys.ENTER);
        d.findElement(By.xpath("//*[@id=\":pl\"]")).sendKeys("hello");
        d.findElement(By.xpath("//*[@id=\":pl\"]")).sendKeys(Keys.ENTER);
        
        d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        //file attachment
        //d.findElement(By.xpath("//*[@id=\":rb\"]")).sendKeys("C:\\Users\\HP\\Desktop\\New folder\\file.txt");
        //WebElement element= d.findElement(By.name("Desktop"));
        //element.sendKeys("C:\\Users\\HP\\Desktop\\New folder\\file.txt");
        //WebElement el = d.findElement("Deskto
        //Actions act =new Actions(d);
	    //act.moveToElement(el).build().perform();
		

	}

}
