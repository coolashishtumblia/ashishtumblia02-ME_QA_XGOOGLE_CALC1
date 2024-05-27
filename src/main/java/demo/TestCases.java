package demo;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");

        WebDriverManager.chromedriver().timeout(30).setup();
        ChromeOptions options = new ChromeOptions();
        LoggingPreferences logs = new LoggingPreferences();

        // Set log level and type
        logs.enable(LogType.BROWSER, Level.ALL);
        logs.enable(LogType.DRIVER, Level.ALL);
        options.setCapability("goog:loggingPrefs", logs);

        // Set path for log file
        System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "chromedriver.log");

        driver = new ChromeDriver(options);

        // Set browser to maximize and wait
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01(){
        System.out.println("Start Test case: testCase01");
        driver.get("https://www.google.com");
        String url=driver.getCurrentUrl();
        WebElement search=driver.findElement(By.id("APjFqb"));
        search.sendKeys("calculator");
        WebElement searchButton=driver.findElement(By.className("gNO89b"));
        searchButton.click();
        WebElement initialDisplay=driver.findElement(By.xpath("//span[@id='cwos']"));
        String s=initialDisplay.getText();
        if(s.equals("0") && url.contains("google")){
            System.out.println("TestCase01: PASSED");
        }
        else{
            System.out.println("TestCase01: FAILED");
        }
        System.out.println("end Test case: testCase01");
    }

    public  void testCase02(){
        System.out.println("Start Test case: testCase02");
        driver.get("https://www.google.com");
        WebElement search=driver.findElement(By.id("APjFqb"));
        search.sendKeys("calculator");
        WebElement searchButton=driver.findElement(By.className("gNO89b"));
        searchButton.click();
        WebElement Num1=driver.findElement(By.xpath("//div[@class='XRsWPe AOvabd' and text()='5']"));
        Num1.click();
        WebElement plus=driver.findElement(By.xpath("//div[@aria-label='plus']"));
        plus.click();
        WebElement Num2=driver.findElement(By.xpath("//div[@class='XRsWPe AOvabd' and text()='7']"));
        Num2.click();
        WebElement equalButton=driver.findElement(By.xpath("//div[@aria-label='equals']"));
        equalButton.click();
        WebElement  check=driver.findElement(By.xpath("//span[@class='qv3Wpe']"));
        String sum=check.getText();
        WebElement clear=driver.findElement(By.xpath("//div[@aria-label='all clear']"));
        clear.click();
        Num1=driver.findElement(By.xpath("//div[@class='XRsWPe AOvabd' and text()='1']"));
        Num1.click();
        Num1=driver.findElement(By.xpath("//div[@class='XRsWPe AOvabd' and text()='5']"));
        Num1.click();
        WebElement minus=driver.findElement(By.xpath("//div[@aria-label='minus']"));
        minus.click();
        Num2=driver.findElement(By.xpath("//div[@class='XRsWPe AOvabd' and text()='8']"));
        Num2.click();
        equalButton=driver.findElement(By.xpath("//div[@aria-label='equals']"));
        equalButton.click();
        WebElement  verify=driver.findElement(By.xpath("//span[@class='qv3Wpe']"));
        String sub=verify.getText();
        if(sum.equals("12") && sub.equals("7")){
            System.out.println("TestCase02: PASSED");
        }
        else{
            System.out.println("TestCase02: FAILED");
        }
        System.out.println("end Test case: testCase02");
    }

    public  void testCase03(){
        System.out.println("Start Test case: testCase03");
        driver.get("https://www.google.com");
        WebElement search=driver.findElement(By.id("APjFqb"));
        search.sendKeys("calculator");
        WebElement searchButton=driver.findElement(By.className("gNO89b"));
        searchButton.click();
        WebElement Num1=driver.findElement(By.xpath("//div[@class='XRsWPe AOvabd' and text()='1']"));
        Num1.click();
         Num1=driver.findElement(By.xpath("//div[@class='XRsWPe AOvabd' and text()='0']"));
        Num1.click();
        WebElement multiply=driver.findElement(By.xpath("//div[@aria-label='multiply']"));
        multiply.click();
        WebElement Num2=driver.findElement(By.xpath("//div[@class='XRsWPe AOvabd' and text()='3']"));
        Num2.click();
        WebElement equalButton=driver.findElement(By.xpath("//div[@aria-label='equals']"));
        equalButton.click();
        WebElement Display=driver.findElement(By.xpath("//span[@id='cwos']"));
        String s1=Display.getText();
        WebElement clear=driver.findElement(By.xpath("//div[@aria-label='all clear']"));
        clear.click();
        Display=driver.findElement(By.xpath("//span[@id='cwos']"));
        String s=Display.getText();
        if(s1.equals("30") && s.equals("0")){
            System.out.println("TestCase03: PASSED");
        }
        else{
            System.out.println("TestCase03: FAILED");
        }
        System.out.println("end Test case: testCase03");
    }

    public  void testCase04(){
        System.out.println("Start Test case: testCase04");
        driver.get("https://www.google.com");
        WebElement search=driver.findElement(By.id("APjFqb"));
        search.sendKeys("calculator");
        WebElement searchButton=driver.findElement(By.className("gNO89b"));
        searchButton.click();
        WebElement Num1=driver.findElement(By.xpath("//div[@class='XRsWPe AOvabd' and text()='2']"));
        Num1.click();
         Num1=driver.findElement(By.xpath("//div[@class='XRsWPe AOvabd' and text()='0']"));
        Num1.click();
        WebElement divide=driver.findElement(By.xpath("//div[@aria-label='divide']"));
        divide.click();
        WebElement Num2=driver.findElement(By.xpath("//div[@class='XRsWPe AOvabd' and text()='4']"));
        Num2.click();
        WebElement equalButton=driver.findElement(By.xpath("//div[@aria-label='equals']"));
        equalButton.click();
        WebElement Display=driver.findElement(By.xpath("//span[@id='cwos']"));
        String s=Display.getText();
        if(s.equals("5")){
            System.out.println("TestCase04: PASSED");
        }
        else{
            System.out.println("TestCase04: FAILED");
        }
        System.out.println("end Test case: testCase04");
    }


}
