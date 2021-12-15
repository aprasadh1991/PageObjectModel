package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;


public class GenericWrappers extends Reporting implements Wrappers{
	
	public RemoteWebDriver driver;
	
	public static Properties prop ;
	
	public void loadObjects() {
		 prop = new Properties();
		try {
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	public void unloadObjectts() {
		prop=null;
	}
	
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				 driver = new ChromeDriver();	
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				 driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("internet explorer")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
			 driver = new InternetExplorerDriver();	
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			//System.out.println("The given browser "+browser+" has launched with the given url "+url+" successfully");
			reportStep("The given browser " +browser+ " has launched with the given url " +url+ " successfully", "pass");
		 }  catch ( SessionNotCreatedException  e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser "+browser+" has not launched due to session not create error");
			reportStep("The browser "+browser+" has not launched due to session not create error", "fail");
		} catch ( InvalidArgumentException e) {
			// TODO: handle exception
			//System.err.println("The browser"+browser+" has not launched due to URL doesn't contain any http/https");
			reportStep("The browser"+browser+" has not launched due to URL doesn't contain any http", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("the browser"+browser+" has not launched due to unknown error");
			reportStep("The browser " +browser+ " has not launched due to unknown error", "Fail");	
		}
		
	}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The Element with id " +idValue+ " is entered with data " +data);
			reportStep("The Element with id " +idValue+ " is entered with data " +data, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with id " +idValue+ " is not found in DOM");
			reportStep("The Element with id " +idValue+ " is not found in DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element with id " +idValue+ " is not visible in the application");
			reportStep("The Element with id " +idValue+ " is not visible in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with id " +idValue+ " is not Intractable");
			reportStep("The Element with id " +idValue+ " is not Intractable", "Fail");
		} catch (StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with id " +idValue+ " is not stable in the application");
			reportStep("The Element with id " +idValue+ " is not stable in the application", "Fail");
		} catch (WebDriverException e) {
			//System.err.println("The Element with id " +idValue+ " is not entered with date " +data);
			reportStep("The Element with id " +idValue+ " is not entered with date " +data  ,"Fail");
		} 
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The Element with Name " +nameValue+ " is entered with data " +data);
			reportStep("The Element with Name " +nameValue+ " is entered with data " +data, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element with name " +nameValue+ " is not found in the DOM");
			reportStep("The Element with name " +nameValue+ " is not found in the DOM ", "Fail");
		} catch(ElementNotVisibleException e) {
			//System.err.println("The Element with Name " +nameValue+ " is not visible in the application");
			reportStep("The Element with Name " +nameValue+ " is not visible in the application", "Fail");
		} catch(ElementNotInteractableException e) {
			//System.err.println("The Element with Name " +nameValue+ " is not Intractable");
			reportStep("The Element with Name " +nameValue+ " is not Intractable", "Fail");
		} catch(StaleElementReferenceException e) {
			//System.err.println("The Element with name " +nameValue+ " is not stable in the application");
			reportStep("The Element with name " +nameValue+ " is not stable in the application", "Fail");
		}  catch(WebDriverException e) {
			//System.err.println("The Element with name " +nameValue+ " is not entered with the name"+data);
			reportStep("The Element with name " +nameValue+ " is not entered with the name " +data, "Fail");
		}
		
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The Element XpathValue " +xpathValue+ " is entered with data"+data);
			reportStep("The Element XpathValue " +xpathValue+ " is entered with data " +data, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element Xpathvalue " +xpathValue+ " is not found in the DOM");
			reportStep("The Element Xpathvalue " +xpathValue+ " is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element XpathValu " +xpathValue+ " is not visible in the Application");
			reportStep("The Element XpathValu " +xpathValue+ " is not visible in the Application", "Fail");
		} catch(ElementNotInteractableException e) {
			//System.err.println("The Element XpathValue " +xpathValue+ " is not intractable");
			reportStep("The Element XpathValue " +xpathValue+ " is not intractable", "Fail");
		} catch(StaleElementReferenceException e) {
			//System.err.println("The Element XpathValue " +xpathValue+ " is not stable");
			reportStep("The Element XpathValue " +xpathValue+ " is not stable", "Fail");
		} catch(WebDriverException e) {
			//System.err.println("The Element XpathValue " +xpathValue+ " is not entered with the xpathValue"+xpathValue);
			reportStep("The Element XpathValue " +xpathValue+ " is not entered with the xpathValue" +xpathValue, "Fail");
		}               
		}
	

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		
		try {
			String actualTitle = driver.getTitle();
			if(actualTitle.equals(title)) {
				//System.out.println("The title of the page " +title+ " is matched with expected title " +title);
				reportStep("The title of the page " +title+ " is matched with expected title " +title, "Pass");
			} else {
				//System.out.println("The title of the page " +title+ " is not matched with the expected title " +title);
				reportStep("The title of the page " +title+ " is not matched with the expected title", "Fail");
			} 
			} catch (NoSuchElementException e) {
				//System.err.println("The Element for the title " +title+ " is not found in the Dom");
				reportStep("The Element for the title " +title+ " is not found in the Dom", "Fail");
			} catch (ElementNotVisibleException e) {
				//System.err.println("The Element for the title " +title+ " is not visible in the Application");
				reportStep("The Element for the title " +title+ " is not visible in the Application", "Fail");
			} catch (ElementNotInteractableException e) {
				//System.err.println("The Element for the title " +title+ " is not intractable in the application");
				reportStep("The Element for the title " +title+ " is not intractable in the application", "Fail");
			} catch (StaleElementReferenceException e) {
				//System.err.println("The Element for the title " +title+ " is not stable in the Application");
				reportStep("The Element for the title " +title+ " is not stable in the Application", "Fail");
			}catch (WebDriverException e) {
			// TODO Auto-generated catch block
				//System.err.println("The title of the page " +title+ " is not verified due to unknown error");
				reportStep("The title of the page " +title+ " is not verified due to unknown error", "Fail");
		}
		
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementById(id).getText();
			if(actualText.equals(text)) {
				//System.out.println("The Elemet with id " +id+ " is holding"+actualText+"is verified with the expected text " +text);
				reportStep("The Elemet with id " +id+ " is holding " +actualText+ "is verified with the expected text " +text, "Pass");
			}else {
				//System.out.println("The Element with id " +id+ " is holding"+actualText+"is not verified with the expected text " +text);
				reportStep("The Element with id " +id+ " is holding "+actualText+ "is not verified with the expected text " +text, "Fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element id " +id+ " is not found in the DOM");
			reportStep("The Element id " +id+ " is not found in the DOM", "Fail");
		} catch(ElementNotVisibleException e) {
			//System.err.println("The Element id " +id+ " is not visible in the Application");
			reportStep("The Element id " +id+ " is not visible in the Appliction", "Fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The Element id " +id+ " is not Intractable in the application");
			reportStep("The Element id " +id+ " is not interactable in the Application", "Fail");
		} catch(StaleElementReferenceException e ) {
			//System.err.println("The Element id " +id+ " is not stable in the Application");
			reportStep("The Element id " +id+ " is not stable in the Application", "Fail");
		} catch(WebDriverException e) {
			//System.err.println("The text of the id " +id+ " is not verified due to unknown error");
			reportStep("The text of the id " +id+ " is not verified due to unknown erro", "Fail");
		}
		
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if(actualText.equals(text)) {
				//System.out.println("The Element with xpath " +xpath+ " is holding the actualtext " +actualText+ " is verified with the expected text " +text);
				reportStep("The Element with xpath " +xpath+ " is holding the actualtext " +actualText+ " is verified with the expected text " +text, "Pass");
			}else {
				//System.out.println("The Element with xpath " +xpath+ " is not holding the actual " +actualText+ " is not verified with the expected text " +text);
				reportStep("The Element with xpath " +xpath+ " is not holding the actual " +actualText+ " is not verified with the expected text " +text, "Fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element Xpath " +xpath+ " is not found in the DOM");
			reportStep("The Element Xpath " +xpath+ " is not found in the DOM", "Fail");
		} catch(ElementNotVisibleException e ) {
			//System.err.println("The Element Xpath " +xpath+ " is not visible in the application");
			reportStep("The Element Xpath " +xpath+ " is not visible in the application", "Fail");
		} catch(ElementNotInteractableException e) {
			//System.err.println("The Element Xpath " +xpath+" is not intractable in the application");
			reportStep("The Element Xpath " +xpath+" is not interactable in the application", "Fail");
		} catch(StaleElementReferenceException e ) {
			//System.err.println("The Element Xpath " +xpath+ " is not stable in the application");
			reportStep("The Element Xpath " +xpath+ " is not stable in the applicatio", "Fail");
		} catch(WebDriverException e ) {
			//System.err.println("The Element of Xpath " +xpath+ " is not verified due to unknown error");
			reportStep("The Element of Xpath " +xpath+ " is not verified due to unknow error", "Fail");
		}
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText =	driver.findElementByXPath(xpath).getText();
			if(actualText.equals(text)) {
				//System.out.println("The Element with Xpath " +xpath+ " is holding the actualtext " +actualText+ " is matched with the expected text"+text);
				reportStep("The Element with Xpath " +xpath+ " is holding the actualtext " +actualText+ " is matched with the expected text" +text, "Pass");
			}else {
				//System.out.println("The Element with Xpath " +xpath+ " is not holding the actualtext " +actualText+ " is not verified with the expected text"+text);
				reportStep("The Element with Xpath " +xpath+ " is not holding the actualtext " +actualText+ " is not verified with the expected text" +text, "Fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element Xpath " +xpath+ " is not found in the Dom");
			reportStep("The Element Xpath " +xpath+ " is not found in the Dom", "Fail");
		} catch(ElementNotVisibleException e ) {
			//System.err.println("The Element Xpath " +xpath+ " is not Visible in the Application");
			reportStep("The Element Xpath " +xpath+ " is not Visible in the Application", "Fail");
		} catch(ElementNotInteractableException e) {
			//System.err.println("The Element Xpath " +xpath+ " is not Interactable in the Application");
			reportStep("The Element Xpath " +xpath+ " is not Interactable in the Applicatio", "Fail");
		} catch(StaleElementReferenceException e ) {
			//System.err.println("The Element Xpath " +xpath+ " is not stable in the Application");
			reportStep("The Element Xpath " +xpath+ " is not stable in the Application", "Fail");
		} catch(WebDriverException e ) {
			//System.err.println("The Element Xpath " +xpath+ " is not verified due to unknown error");
			reportStep("The Element Xpath " +xpath+ " is not verified due to unknown error", "Fail");
		}
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		
			try {
				driver.findElementById(id).click();
				//System.out.println("The Element id " +id+ " is clicked");
				reportStep("The Element id " +id+ " is clicked", "Pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The Element id " +id+ " is not found in the Dom");
				reportStep("The Element id " +id+ " is not found in the Dom", "Fail");
			} catch(ElementNotVisibleException e) {
				//System.err.println("The Element id " +id+ " is not visible in the application");
				reportStep("The Element id " +id+ " is not visible in the application", "Fail");
			} catch(ElementClickInterceptedException e) {
				//System.err.println("The Element id " +id+ " is not Clickable due to unknown error");
				reportStep("The Element id " +id+ " is not Clickable due to unknown error", "Fail");
			} catch(ElementNotInteractableException e) {
				//System.err.println("The Element id " +id+ " is not Interactable in the application");
				reportStep("The Element id " +id+ " is not Intractable in the applicatio", "Fail");
			} catch(StaleElementReferenceException e) {
				//System.err.println("The Element id " +id+ " is not stable in the application");
				reportStep("The Element id " +id+ " is not stable in the application", "Fail");
			} catch(WebDriverException e ) {
				//System.err.println("The Element Clickby " +id+ " click is not performed due to unknown error");
				reportStep("The Element Clickby " +id+ " click is not performed due to unknown erro", "Fail");
			}			
			}
		

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		
			try {
				driver.findElementByClassName(classVal).click();
				//System.out.println("The Element ClassName " +classVal+ " is clickable");
				reportStep("The Element ClassName " +classVal+ " is clickable", "Pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The Element ClassName " +classVal+ " is not found in the DOM");
				reportStep("The Element ClassName " +classVal+ " is not found in the DOM", "Fail");
			} catch(ElementNotVisibleException e) {
				//System.err.println("The Element ClassName " +classVal+ " is not visible in the application");
				reportStep("The Element ClassName " +classVal+ " is not visible in the application", "Fail");
			} catch(ElementClickInterceptedException e) {
				//System.err.println("The Element ClassName " +classVal+ " is not Clickable in the application");
				reportStep("The Element ClassName " +classVal+ " is not Clickable in the application", "Fail");
			} catch(ElementNotInteractableException e ) {
				//System.err.println("The Element Class Name " +classVal+ " is not Intractable in the application");
				reportStep("The Element Class Name " +classVal+ " is not Intractable in the application", "Fail");
			} catch(StaleElementReferenceException e) {
				//System.err.println("The Element ClassName " +classVal+ " is not stable in the application");
				reportStep("The Element ClassName " +classVal+ " is not stable in the application", "Fail");
			} catch(WebDriverException e) {
				//System.err.println("The element ClassName " +classVal+ " click is not performed due to unknown error");
				reportStep("The element ClassName " +classVal+ " click is not performed due to unknown error", "Fail");
			}
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByName(name).click();
			//System.out.println("The Element Name " +name+ " is clicked");
			reportStep("The Element Name " +name+ " is clicked", "Pass");
		} catch ( NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element Name " +name+ " is not found in the DOM");
			reportStep("The Element Name " +name+ " is not found in the DOM", "Fail");
		} catch(ElementNotVisibleException e) {
			//System.err.println("The Element Name " +name+ " is not visible in the application");
			reportStep("The Element Name " +name+ " is not visible in the application", "Fail");
		} catch(ElementClickInterceptedException e) {
			//System.err.println("The Element Name " +name+ " is not clickable due to target element obscuration");
			reportStep("The Element Name " +name+ " is not clickable due to target element obscuration", "Fail");
		} catch(ElementNotInteractableException e) {
			//System.err.println("The Element Name "+name+ "is Present in the DOM but not intractable");
			reportStep("The Element Name "+name+ "is Present in the DOM but not interactable", "Fail");
		} catch(StaleElementReferenceException e) {
			//System.err.println("The Element Name"+name+"is not stable in the application");
			reportStep("The Element Name"+name+"is not stable in the application", "Fail");
		} catch(WebDriverException e) {
			//System.err.println("The Element ClassName"+name+"click is not performed due to unknown error");
			reportStep("The Element ClassName"+name+"click is not performend due to unknown erro", "Fail");
		}	
	}
	

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The Element Link Text " +name+ " is clicked");
			reportStep("The Element Link Text " +name+ " is clicked", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element LinkText " +name+ " is not found in the DOM" );
			reportStep("The Element LinkText " +name+ " is not found in the DOM", "Fail");
		} catch(ElementNotVisibleException e) {
			//System.err.println("The Element LinkText " +name+ " is not visible in the application");
			reportStep("The Element LinkText " +name+ " is not visible in the application", "Fail");
		} catch(ElementClickInterceptedException e) {
			//System.err.println("The Element LinkText " +name+ " is not clicked due to target element obscuration ");
			reportStep("The Element LinkText " +name+ " is not clicked due to target element obscuration ", "Fail");
		} catch(ElementNotInteractableException e) {
			//System.err.println("The Element LinkText " +name+ " is not interactable in the application");
			reportStep("The Element LinkText " +name+ " is not interactable in the application", "Fail");
		} catch(StaleElementReferenceException e) {
			//System.err.println("The Element Link Text " +name+ " is not stable in the application");
			reportStep("The Element Link Text " +name+ " is not stable in the application", "Fail");
		} catch(WebDriverException e) {
			//System.err.println("The Element Link Text " +name+ "click is not performed due to unknown error");
			reportStep("The Element Link Text " +name+ "click is not performed due to unknown error", "Fail");
		}
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name);
			//System.out.println("The Element LinkText " +name+ " is clicked");
			reportStep("The Element LinkText " +name+ " is clicke", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element LinkText " +name+ " is not found in the DOM");
			reportStep("The Element LinkText " +name+ " is not found in the DOM", "Fail");
		} catch(ElementClickInterceptedException e) {
			//System.err.println("The Element LinkText " +name+ " is not clicked due the target element obscuration");
			reportStep("The Element LinkText " +name+ " is not clicked due the targer element obscuration", "Fail");
		} catch(ElementNotVisibleException e) {
			//System.err.println("The Element LinkText " +name+ " is not visible in the application ");
			reportStep("The Element LinkText " +name+ " is not visible in the application ", "Fail");
		} catch(ElementNotInteractableException e) {
			//System.err.println("The Element LinkText" +name+ " is not interactable in the application");
			reportStep("The Element LinkText" +name+ " is not interactable in the application", "Fail");
		} catch(StaleElementReferenceException e) {
			//System.err.println("The Element LinkText " +name+ " is not stable in the application");
			reportStep("The Element LinkText " +name+ " is not stable in the application", "Fail");
		} catch(WebDriverException e ) {
			//System.err.println("The Element LinkText " +name+ " click is not perfromed due to unknown error");
			reportStep("The Element LinkText " +name+ " click is not perfromed due to unknown error", "Fail");
		}
	}

	public void clickByXpath(String... xpath) {
		// TODO Auto-generated method stub
		
		String xpathVal = null;
		try {
			
			if(xpath[0].contains("$option$")) {
				xpathVal=xpath[0].replace("$option$", xpath[1]);
			}else {
				xpathVal=xpath[0];
			}
			
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The Element XpathValue " +xpathVal+ " is found and clicked");
			reportStep("The Element XpathValue " +xpathVal+ " is found and clicked", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element XpathValue " +xpathVal+ " is not found in the DOM");
			reportStep("The Element XpathValue " +xpathVal+ " is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element XpathValue " +xpathVal+ " is not visible in the application");
			reportStep("The Element XpathValue " +xpathVal+ " is not visible in the applicatio", "Fail");
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The Element XpathValue " +xpathVal+ " is not clicked due to target element obscuration");
			reportStep("The Element XpathValue " +xpathVal+" is not clicked due to target element obscuration", "Fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The Element XpathValue " +xpathVal+ " is not interactable in the application");
			reportStep("The Element XpathValue " +xpathVal+ " is not interactable in the application", "Fail");
		} catch(StaleElementReferenceException e) {
			//System.err.println("The Element XpathValue " +xpathVal+ " is not stable in the application");
			reportStep("The Element XpathValue " +xpathVal+ " is not stable in the application", "Fail");
		} catch(WebDriverException e ){
			//System.err.println("The Element XpathValue " +xpathVal+ " click is not performed due to unknown error");
			reportStep("The Element XpathValue " +xpathVal+ " click is not performed due to unknown error", "Fail");
		}
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The Element XpathValue " +xpathVal+ " is found and clicked");
			reportStep("The Element XpathValue " +xpathVal+ " is found and clicked", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element XpathValue " +xpathVal+ " is not found in the DOM");
			reportStep("The Element XpathValue " +xpathVal+ " is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element XpathValue " +xpathVal+ " is not visible in the application");
			reportStep("The Element XpathValue " +xpathVal+ " is not visible in the application", "Fail");
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The Element XpathValue " +xpathVal+ " is not clicked due to target element obscuration");
			reportStep("The Element XpathValue " +xpathVal+ " is not clicked due to target element obscuratio", "Fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The Element XpathValue " +xpathVal+ " is not interactable in the application");
			reportStep("The Element XpathValue " +xpathVal+ " is not interactable in the application", "Fail");
		} catch(StaleElementReferenceException e) {
			//System.err.println("The Element XpathValue " +xpathVal+ " is not stable in the application");
			reportStep("The Element XpathValue " +xpathVal+ " is not stable in the application", "Fail");
		} catch(WebDriverException e ){
			//System.err.println("The Element XpathValue " +xpathVal+ " click is not performed due to unknown error");
			reportStep("The Element XpathValue " +xpathVal+ " click is not performed due to unknown erro", "Fail");
		}
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String actualText = null;
		try {
			 actualText=driver.findElementById(idVal).getText();
			//System.out.println("The text in given element " +idVal+ " is " +actualText);
			 reportStep("The text in given element " +idVal+ " is " +actualText, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element Id " +idVal+ " is not found in the DOM");
			reportStep("The Element Id " +idVal+ " is not found in the DOM", "Fail");
		} catch(ElementNotVisibleException e) {
			//System.err.println("The Element Id " +idVal+ " is not visible in the application");
			reportStep("The Element Id " +idVal+ " is not visible in the applicatio", "Fail");
		} catch(ElementNotInteractableException e) {
			//System.out.println("The Element Id " +idVal+ " is not interactable");
			reportStep("The Element Id " +idVal+ " is not interactable", "Fail");
		} catch(StaleElementReferenceException e) {
			//System.err.println("The Element id " +idVal+ " is not stable in the application");
			reportStep("The Element id " +idVal+ " is not stable in the application", "Fail");
		} catch(WebDriverException e) {
			//System.err.println("The Element id" +idVal+ " is not get due to unknown error");
			reportStep("The Element id" +idVal+ " is not get due to unknown erro", "Fail");
		}
		return actualText;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String newText = null;
		try {
			newText = driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The Text in the given xpath " +xpathVal+ " is" +newText);
			reportStep("The Text in the given xpath " +xpathVal+ " is" +newText, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.out.println("The Element xpath " +xpathVal+ " is not found in the dom");
			reportStep("The Element xpath " +xpathVal+ " is not found in the dom", "Fail");
		} catch(ElementNotVisibleException e) {
			//System.err.println("The Element xpath " +xpathVal+ " is not visible in the application");
			reportStep("The Element xpath " +xpathVal+ " is not visible in the application", "Fail");
		} catch(ElementNotInteractableException e) {
			//System.err.println("The Element xpath " +xpathVal+ " is not interactable in the application");
			reportStep("The Element xpath " +xpathVal+ " is not interactable in the applicatio", "Fail");
		} catch(StaleElementReferenceException e) {
			//System.err.println("The Element xpath " +xpathVal+ " is not stable in the application");
			reportStep("The Element xpath " +xpathVal+ " is not stable in the application", "Fail");			
		} catch(WebDriverException e) {
			//System.err.println("The Element xpath " +xpathVal+ " is not get due to unknown error");
			reportStep("The Element xpath " +xpathVal+ " is not get due to unknown error", "Fail");
		}
		return newText;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement sel=driver.findElementById(id);
			Select obj = new Select(sel);
			obj.selectByVisibleText(value);
			//System.out.println("The Element with id " +id+ " with dropdown option value " +value+ " is selected successfully");
			reportStep("The Element with id " +id+ " with dropdown option value " +value+ " is selected successfully", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.out.println("The Element Id " +id+ "is not found in the dom");
			reportStep("The Element Id " +id+ "is not found in the dom", "Fail");
		} catch(ElementNotVisibleException e) {
			//System.err.println("The Element id " +id+ " is not visible in the application");
			reportStep("The Element id " +id+ " is not visible in the application", "Fail");
		} catch(ElementNotSelectableException e) {
			//System.err.println("The Element id " +id+ " is not selectable in the application");
			reportStep("The Element id " +id+ " is not selectable in the application", "Fail");
		} catch(ElementNotInteractableException e) {
			//System.err.println("The Element id " +id+ "is not interactable in the application");
			reportStep("The Element id " +id+ "is not interactable in the application", "Fail");
		} catch(StaleElementReferenceException e) {
			//System.err.println("The Element id " +id+ " is not stable in the application");
			reportStep("The Element id " +id+ " is not stable in the application", "Fail");
		} catch(WebDriverException e) {
			//System.err.println("The Element id " +id+ " is not selectable due to unknown error");
			reportStep("The Element id " +id+ " is not selectable due to unknown error", "Fail");
		}
	}

	public void selectIndexbyXpath(String Xpath, int value) {
		
		try {
			WebElement sel= driver.findElementByXPath(Xpath);
			Select obj = new Select(sel);
			obj.selectByIndex(value);
			//System.out.println("The Element Xpath " +Xpath+ " is Selected with Value " +value+ " Sucessfully");
			reportStep("The Element Xpath " +Xpath+ " is Selected with Value " +value+ " Sucessfully", "Pass");
		} catch (NoSuchSessionException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element Xpath " +Xpath+ " is not found in the DOM");;
			reportStep("The Element Xpath " +Xpath+ " is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element Xpath " +Xpath+ " is not visible in the application");
			reportStep("The Element Xpath " +Xpath+ " is not visible in the application", "Fail");
		} catch (ElementNotSelectableException e) {
			//System.err.println("The Element xpath " +Xpath+ " is not selectable in the application");
			reportStep("The Element xpath " +Xpath+ " is not selectable in the application", "Fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The Element Xpath " +Xpath+ " is not interactable in the application");
			reportStep("The Element Xpath " +Xpath+ " is not interactable in the application", "Fail");
		} catch(StaleElementReferenceException e ) {
			//System.err.println("The Element Xpath " +Xpath+ " is not stable in the application");
			reportStep("The Element Xpath " +Xpath+ " is not stable in the application", "Fail");
		} catch(WebDriverException e) {
			//System.err.println("The Element Xpath " +Xpath+ " is not selectable due to unknown error");
			reportStep("The Element Xpath " +Xpath+ " is not selectable due to unknown error", "Fail");
		}	
		
	}
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement sel = driver.findElementById(id);
			Select obj = new Select(sel);
			obj.selectByIndex(value);
			//System.out.println("The Element Id " +id+ " with dropdown option by index value "+value+"is selected successfully ");
			reportStep("The Element Id " +id+ " with dropdown option by index value "+value+"is selected successfully", "Fail");
		} 	catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.out.println("The Element Id " +id+ " is not found in the dom");
			reportStep("The Element Id " +id+ " is not found in the dom", "Fail");
		} catch(ElementNotVisibleException e) {
			//System.err.println("The Element id " +id+ " is not visible in the application");
			reportStep("The Element id " +id+ " is not visible in the application", "Fail");
		} catch(ElementNotSelectableException e) {
			//System.err.println("The Element id " +id+ " is not selectable in the application");
			reportStep("The Element id " +id+ " is not selectable in the application", "Fail");
		} catch(ElementNotInteractableException e) {
			//System.err.println("The Element id " +id+ " is not interactable in the application");
			reportStep("The Element id " +id+ " is not interactable in the applicatio", "Fail");
		} catch(StaleElementReferenceException e) {
			//System.err.println("The Element id " +id+ " is not stable in the application");
			reportStep("The Element id " +id+ " is not stable in the application", "Fail");
		} catch(WebDriverException e) {
			//System.err.println("The Element id " +id+ " is not get due to unknown error");
			reportStep("The Element id " +id+ " is not get due to unknown error", "Fail");
		}	
		}
	

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allwinIds = driver.getWindowHandles();
			for(String eachwinid : allwinIds) {
				driver.switchTo().window(eachwinid);
				break;
			}
			//System.out.println("The Window is sucessfully switched");
			reportStep("The Window is sucessfully switched", "Pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("No such Window is found to switch ");
			reportStep("No such Window is found to switch ", "Fail");
		}catch (NoSuchSessionException e) {
			// TODO: handle exception
			//System.err.println("No Such Session is created to switch");
			reportStep("No Such Session is created to switc", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Unable to switch to parent window due to unknown error");
			reportStep("Unable to switch to parent window due to unknown error", "Fail");
		}catch (Throwable e) {
			// TODO: handle exception
			//System.err.println("Unable to switch to last window due to unknown java error");
			reportStep("Unable to switch to last window due to unknown java err", "Fail");
		}
		
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allWinIds = driver.getWindowHandles();
			for(String eachWinId : allWinIds)
			{
				driver.switchTo().window(eachWinId);
			}
			//System.out.println("Successfully switched to last window");
			reportStep("Successfully switched to last window", "Pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("No such Window is found to switch ");
			reportStep("No such Window is found to switch ", "Fail");
		} catch (SessionNotCreatedException e) {
			// TODO: handle exception
			//System.err.println("Session is not created due to unknown error");
			reportStep("Session is not created due to unknown error", "Fail");
		} catch (NoSuchSessionException e) {
			// TODO: handle exception
			System.err.println("No Such Session is created to switch");
			reportStep("No Such Session is created to switc", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Unable to switch to last window due to unknown error");
			reportStep("Unable to switch to last window due to unknown error", "Fail");
		} catch (Throwable e) {
			// TODO: handle exception
			//System.err.println("Unable to switch to last window due to unknown java error");
			reportStep("Unable to switch to last window due to unknown java error", "Fail");
		} 
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//System.out.println("Successfully accepted the alert");
			reportStep("Successfully accepted the alert", "Pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("No Such Alert is present to accept");
			reportStep("No Such Alert is present to accept", "Fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("Unable to handle the alert");
			reportStep("Unable to handle the aler", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Unable to handle the alert due to unknown error");
			reportStep("Unable to handle the alert due to unknown error", "Fail");
		}
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("Successfully dismissed the alert");
			reportStep("Successfully dismissed the alert", "Pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("No Such Alert is present to dismiss");
			reportStep("No Such Alert is present to dismiss", "Fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("Unable to handle the alert");
			reportStep("Unable to handle the alert", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Unable to handle the alert due to unknown error");
			reportStep("Unable to handle the alert due to unknown error", "Fail");
		}
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String gettext = null;
		try {
			gettext = driver.switchTo().alert().getText();
			//System.out.println("Successfully got the text from alert -"+gettext);
			reportStep("Successfully got the text from alert " +gettext, "Pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("No Such Alert is present to dismiss");
			reportStep("No Such Alert is present to dismiss", "Fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("Unable to handle the alert");
			reportStep("Unable to handle the alert", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Unable to handle the alert due to unknown error");
			reportStep("Unable to handle the alert due to unknown error", "Fail");
		}
		return gettext;
	}

	public long takeSnap() {
		// TODO Auto-generated method stub
		
		long number=0;
		
		try {
			
			number = (long) (Math.floor(Math.random()*100000000)+1000000); 
			
			File tmp = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./reports/screenshots/"+number+".png");
			FileUtils.copyFile(tmp, dest);
			//System.out.println("ScreenShot Captured");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//System.err.println("Error found in Screenshot file Storage or transfer");
			reportStep("Error found in Screenshot file Storage or transfer", "Fail");
		}catch (Throwable e) {
			// TODO: handle exception
			//System.err.println("Unable to take screenshot due to unknown error");
			reportStep("Unable to take screenshot due to unknown error", "Fail");
		}
		return number;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println("The recent active browser is closed successfully");
			reportStep("The recent active browser is closed successfully", "Pass", false);
		} catch (WebDriverException e) {
			//System.err.println("Active browser got closed due to unknown error");
			reportStep("Active browser got closed due to unknown error", "Fail", false);
		} 
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println("All the browsers are closed successfully");
			reportStep("All the browsers are closed successfully", "Pass", false);
		} catch (WebDriverException e) {
			//System.err.println("Unable to close browsers due to unknown error");
			reportStep("Unable to close browsers due to unknown error", "Fail", false);
		} 
	}

	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}public void pageDown() {
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
			//System.out.println("The page is scrolled down sucessfully ");
			reportStep("The page is scrolled down sucessfully ", "Pass");
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("Unable to Scroll page");
			reportStep("Unable to Scroll page", "Fail");
		}
	}
	public void compareText(String actualText, String newText) {
		
		try {
			if(actualText.equals(newText))
				//System.out.println("The ActualText" +actualText+ "and the newText" +newText+ "are similar");
				reportStep("The ActualText" +actualText+ "and the newText" +newText+ "are similar", "Pass");
			else {
				//System.err.println("The ActualText" +actualText+ "and the newText" +newText+ "are not similar");
				reportStep("The ActualText" +actualText+ "and the newText" +newText+ "are not similar", "Fail");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element" +actualText+"is not found in the DOM");
			reportStep("The Element" +actualText+"is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element"+actualText+ "is not visible in the applicaiton");
			reportStep("The Element"+actualText+ "is not visible in the applicaiton", "Fail");
		} catch(ElementNotInteractableException e) {
			//System.err.println("The Element" +actualText+"is not interactbale in the application");
			reportStep("The Element" +actualText+"is not interactbale in the application", "Fail");
		} catch(StaleElementReferenceException e) {
			//System.err.println("The Element" +actualText+ "and" +newText+"is not stable in the application");
			reportStep("The Element" +actualText+ "and" +newText+"is not stable in the application", "Fail");
		} catch(WebDriverException e){
			//System.err.println("The Element" +actualText+ "and" +newText+"is not verified due to unknown error");
			reportStep("The Element" +actualText+ "and" +newText+"is not verified due to unknown error", "Fail");
		}		
	}

		public void mouseHoverbyXpath(String xpath) {
			try {
				Actions actions = new Actions(driver);
				WebElement obj = driver.findElementByXPath(xpath);
				actions.moveToElement(obj).perform();
				//System.out.println("Successfully mouseHovered the xpath"+xpath);
				reportStep("Successfully mouseHovered the xpath " +xpath, "Pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The xpath" +xpath+ "is not found in the DOM to perform MouseHover");
				reportStep("The xpath" +xpath+ "is not found in the DOM to perform MouseHover", "Fail");
			} catch(ElementNotVisibleException e) {
				//System.err.println("The Xpath" +xpath+ "is not visible in the application");
				reportStep("The Xpath" +xpath+ "is not visible in the application", "Fail");
			} catch(StaleElementReferenceException e) {
				//System.err.println("The xpath"+xpath+"is not stable in the application");
				reportStep("The xpath"+xpath+"is not stable in the application", "Fail");
			} catch(WebDriverException e) {
				//System.err.println("Unable to perform mousehover"+xpath+"due to unknown error");
				reportStep("Unable to perform mousehover"+xpath+"due to unknown error", "Fail");
			}
		}

		public void selectIndexByXpath(String Xpath, int value) {
			// TODO Auto-generated method stub
			try {
				WebElement sel = driver.findElementByXPath(Xpath);
				Select obj = new Select(sel);
				obj.selectByIndex(value);
				//System.out.println("The Element xpath " +Xpath+ " with dropdown is selected sucessfully by value" +value);
				reportStep("The Element xpath " +Xpath+ " with dropdown is selected sucessfully by value" +value, "Pass");
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The Element xpath "+Xpath+ "is not found in the DOM");
				reportStep("The Element xpath "+Xpath+ "is not found in the DOM", "Fail");
			} catch (ElementNotVisibleException e) {
				//System.err.println("The Element xpath "+Xpath+ "is not visbile in the Application");
				reportStep("The Element xpath "+Xpath+ "is not visbile in the Application", "Fail");
			} catch (ElementNotSelectableException e) {
				//System.err.println("The Element xpath "+Xpath+ "is not selectable from the Application");
				reportStep("The Element xpath "+Xpath+ "is not selectable from the Applicatio", "Fail");
			} catch (ElementNotInteractableException e) {
				//System.err.println("The Element xpath" +Xpath+ "is not Interactable in the Application");
				reportStep("The Element xpath" +Xpath+ "is not Interactable in the Application", "Fail");
			} catch (WebDriverException e) {
				//System.err.println("Unable to select given Value option " +value+ "with dropdown due to unknown error");
				reportStep("Unable to select given Value option " +value+ "with dropdown due to unknown erro", "Fail");
			}
		}

		
	
       
	public void selectValuebyXpath(String Xpath, String value) {
	// TODO Auto-generated method stub
	try {
		WebElement sel = driver.findElementByXPath(Xpath);
		Select obj = new Select(sel);
		obj.selectByValue(value);
		//System.out.println("The Element xpath " +Xpath+ " with dropdown is selected sucessfully by value" +value);
		reportStep("The Element xpath " +Xpath+ " with dropdown is selected sucessfully by value" +value, "Pass");
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The Element xpath " +Xpath+ "is not found in the DOM");
		reportStep("The Element xpath " +Xpath+ "is not found in the DOM", "Fail");
	} catch (ElementNotVisibleException e) {
		//System.err.println("The Element xpath " +Xpath+ "is not visbile in the Application");
		reportStep("The Element xpath " +Xpath+ "is not visbile in the Application", "Fail");
	} catch (ElementNotSelectableException e) {
		//System.err.println("The Element xpath " +Xpath+ "is not selectable from the Application");
		reportStep("The Element xpath " +Xpath+ "is not selectable from the Application", "Fail");
	} catch (ElementNotInteractableException e) {
		//System.err.println("The Element xpath" + Xpath+ "is not Interactable in the Application");
		reportStep("The Element xpath" + Xpath+ "is not Interactable in the Application", "Fail");
	} catch (WebDriverException e) {
		//System.err.println("Unable to select given Value option " +value+ "with dropdown due to unknown error");
		reportStep("Unable to select given Value option " +value+ "with dropdown due to unknown error", "Fail");
	}
}

	public void selectVisibleTextbyXpath(String Xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement sel = driver.findElementByXPath(Xpath);
			Select obj = new Select(sel);
			obj.selectByVisibleText(value);
			//System.out.println("The Element Xpath " +Xpath+ "with dropdown is selected successfully by value " +value);
			reportStep("The Element Xpath " +Xpath+ "with dropdown is selected successfully by value " +value, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The Element xpath " +Xpath+ "is not found in the DOM");
			reportStep("The Element xpath " +Xpath+ "is not found in the DOM", "Fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element xpath " +Xpath+ "is not Visible in the Application");
			reportStep("The Element xpath " +Xpath+ "is not Visible in the Application", "Fail");
		} catch(ElementNotSelectableException e) {
			//System.err.println("The Element xpath " +Xpath+ "is not Selectable in the Application");
			reportStep("The Element xpath " +Xpath+ "is not Selectable in the Application", "Fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The Element Xpath " +Xpath+ "is not Interactable in the Application");
			reportStep("The Element Xpath " +Xpath+ "is not Interactable in the Application", "Fail");
		} catch (WebDriverException e) {
			//System.err.println("Unable to select given Value option " +value+ "with dropdown due to unknown error");
			reportStep("Unable to select given option " +value+ " with dropdown due to unknown error", "Fail");
		}
	}
	@Override
	public void selectbyXpath(String Xpath, int value) {
		// TODO Auto-generated method stub
		
	}
	

	

	
}
		
	

	
		

	
		
	

