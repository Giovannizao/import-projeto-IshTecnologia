package runner;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class Executa  {
		
		 WebDriver driver;
		
		@Test
		public void abrirNavegador() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			
			// Iniciar Cadastro
			
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("roberto26312@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
			
			
			
			//driver.findElement(By.xpath("//span[text()='checked']")).click();		
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='customer_firstname']")).click();
			driver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys("Roberto Machado");
			driver.findElement(By.xpath("//*[@id='customer_lastname']")).sendKeys("Silva");
			driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("roberto456789");
			driver.findElement(By.xpath("//*[@id='days']")).sendKeys("5");
			driver.findElement(By.xpath("//*[@id='months']")).sendKeys("March");
			driver.findElement(By.xpath("//*[@id='years']")).sendKeys("1995");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='newsletter']")).click();
			driver.findElement(By.xpath("//*[@id=\"optin\"]")).click();
		    driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Roberto Machado");
			driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Silva");
			driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("Microsoft");
			driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Avenida Presidente Juscelino Kubitscheck"); 
			driver.findElement(By.xpath("//*[@id=\"id_state\"]")).sendKeys("Alaska");
			driver.findElement(By.xpath("//*[@id=\"postcode\"]")).sendKeys("99501");
			driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("Apartamento");
			driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Colorado Springs");
			driver.findElement(By.xpath("//*[@id=\"id_state\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"id_state\"]")).sendKeys("80829");
			driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("2526-8090");
			driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")).sendKeys("(11) 96323-2593");
			driver.findElement(By.xpath("//*[@id=\"alias\"]")).sendKeys("Manitou Springs");
			driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click(); 
			
			//Cadastro Finalizado
			
			
			
			
			
			//Efetuar Login
			
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("roberto2626@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("roberto456789");
			driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click(); 
			
			System.out.println("******** TESTE FINALIZADO ********");
			
		}

		public void escrever(String texto, By elementos) {
			
		driver.findElement(elementos).sendKeys(texto);
		
		}
	}

