import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

fun main(args: Array<String>) {

    System.setProperty("webdriver.chrome.driver", "/Users/work/Applications/selenium/chromedriver")
    val driver = ChromeDriver()

    driver.get("")
}