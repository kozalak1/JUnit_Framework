package JUnit_Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test_SecondExample {


    WebDriver driver;
    // @Test
    // @Before
    // @After
    // @BeforeClass
    // @AfterClass

    // artık if-else kullanmayacagız onun yerine Assert Classından methodlar kullanacaz.
    // Bu methodlar ile expected ve actual degerleri ya da durumları karsılastırırız

    // artık main method kullanmayacagız ; onun yerine @Test notasyonu kullanacagız

    @Before
    public void ayarlarYap () {
    // bu method a genelde setUp adı verilir
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    public void testExample1 () {

        System.out.println("test Example1 calisti");
    }

    @Test
    public void testExample2(){
        int actualYas = 61;
        int emeklilikYas = 65;

        Assert.assertNotEquals(actualYas, emeklilikYas);
        Assert.assertFalse(actualYas>emeklilikYas);
        System.out.println("test Example2 calisti");
    }


    @After
    public void ortaligiTopla (){
        driver.close();
    } // bu method a genelde teardown adı verilir
}

