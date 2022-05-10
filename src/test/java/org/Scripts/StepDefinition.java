package org.Scripts;



import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class StepDefinition extends BaseClass

{
	public AppiumDriver<WebElement> driver;
	public static DesiredCapabilities cap;

	@Given("user is on Splash Screen")
	public void user_is_on_Splash_Screen() throws MalformedURLException, InterruptedException {
		cap = new DesiredCapabilities();
//		cap.setCapability("no",true);
//      cap.setCapability("newCommandTimeout", 100000);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "LZL7QK8PBU7DEEM7");
		cap.setCapability(MobileCapabilityType.UDID, "LZL7QK8PBU7DEEM7");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		cap.setCapability(MobileCapabilityType.APP, "D:\\Apk\\Pepul_Development.apk");
		cap.setCapability(MobileCapabilityType.NO_RESET,"true");
     	cap.setCapability(MobileCapabilityType.FULL_RESET,"false"); 
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

//	@When("user Swipes the Screen and Click on Get Started Button")
//	public void user_Swipes_the_Screen_and_Click_on_Get_Started_Button() throws InterruptedException {
//		Thread.sleep(5000);
//		WebElement panel = driver.findElement(By.xpath("//*[@class='android.widget.LinearLayout']"));
//
//		SwipeScreen(panel, driver);
//		SwipeScreen(panel, driver);
//		Thread.sleep(5000);
//		WebElement Click = driver.findElement(By.xpath("//*[@text='GET STARTED']"));
//		Click.click();
//		Thread.sleep(3000);
//	}

	@When("user should enter the {string}")
	public void user_should_enter_the(String string) throws Exception {
		WebElement mobilenumber = driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
		mobilenumber.sendKeys(string);
		Thread.sleep(3000);
	}

	@When("user should click the Toggle Button to Accept the Terms and Conditions")
	public void user_should_click_the_Toggle_Button_to_Accept_the_Terms_and_Conditions() throws Exception {
		WebElement Click1 = driver.findElement(By.xpath("//*[@class='android.widget.Switch']"));
		//Click1.click();
		//Thread.sleep(3000);
	}

	@When("user should click the Get OTP Button")
	public void user_should_click_the_Get_OTP_Button() throws InterruptedException {
		WebElement GetOTP = driver.findElement(By.xpath("//*[@text='Get OTP']"));
		GetOTP.click(); 
		
		
		//Thread.sleep(5000);
		//WebElement Okay = driver.findElement(By.xpath("//*[@text='OKAY']"));
		//Okay.click();
		
		Thread.sleep(5000);
		}

	@When("user is on OTP Screen Click on Allow Button")
	public void user_is_on_OTP_Screen_Click_on_Allow_Button() throws InterruptedException {
		Thread.sleep(5000);
		WebElement Allow = driver.findElement(By.xpath("//*[@text='Allow']"));
		Allow.click();
		Thread.sleep(5000);
	}

//	@When("user is on UserName Screen and  Enter {string}")
//	public void user_is_on_UserName_Screen_and_Enter(String string2) throws InterruptedException {
//		Thread.sleep(5000);
////		WebElement username = driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
////		username.sendKeys(string2);
//	}
//
//	@When("user should click on Next Button")
//	public void user_should_click_on_Next_Button() throws InterruptedException {
////		WebElement Next = driver.findElement(By.xpath("//*[@text='Next']"));
////		Next.click();
////		Thread.sleep(3000);
//	}

//	@When("if the User Gives the Same user name popup will appear and click on okay Button")
//	public void if_the_User_Gives_the_Same_user_name_popup_will_appear_and_click_on_okay_Button()
//			throws InterruptedException {
//		WebElement Ok = driver.findElement(By.xpath("//*[@text='OKAY']"));
//		Ok.click();
//		Thread.sleep(3000);
//	}

	@When("user should select the Profile picture and Click on okay Button")
	public void user_should_select_the_Profile_picture_and_Click_on_okay_Button() throws InterruptedException {
		WebElement Addpic = driver.findElement(By.xpath("//*[@class='android.widget.ImageView']"));
		Addpic.click();
		Thread.sleep(5000);
		WebElement Align= driver.findElement(By.xpath("//*[@text='2015-09-08 18.02.08.jpg']"));
		Align.click();
		Thread.sleep(3000);
//		WebElement Select= driver.findElement(By.xpath("//*[@elementid='00000000-0000-1082-ffff-ffff0000064a']"));
//		Select.click();
//		WebElement Selectpic= driver.findElement(By.xpath("//*[@class='android.widget.TextView']"));
//		Selectpic.click();
		
		
		WebElement Croppic= driver.findElement(By.xpath("//*[@text='CROP']"));
	    Croppic.click();
	    Thread.sleep(2000);
	    WebElement NxtBtn= driver.findElement(By.xpath("//*[@class='android.view.View']"));
	    NxtBtn.click();
	    Thread.sleep(9000);
	    WebElement panel = driver.findElement(By.xpath("//*[@class='android.view.ViewGroup']"));
//    	ScrollDown(panel , driver);
//    	ScrollDown(panel , driver);
    	ScrollUp(panel , driver);
    	Thread.sleep(10000);
    	//ScrollUp(panel , driver);
	    //WebElement SelectStory= driver.findElement(By.xpath("//*[@class='android.widget.ImageView']"));
	    //SelectStory.click(); 
	    //Thread.sleep(6000);
	    //WebElement Select1= driver.findElement(By.xpath("//*[@class='android.widget.ImageView']"));
	    //Select1.click();
	}
	@When("user should tap on Profile Pic and Enter the {string} and {string}")
	    public void user_should_tap_on_Profile_Pic_and_Enter_the_and(String string, String string2) throws InterruptedException {
	    	
	    	WebElement Menu= driver.findElement(By.xpath("//*[@class='android.widget.ImageView']"));
	    	Menu.click();   
	    	Thread.sleep(3000);
	    	WebElement Profile= driver.findElement(By.xpath("//*[@class='android.view.View']"));
	    	Profile.click();
	    	Thread.sleep(3000);
	    	WebElement Follower = driver.findElement(By.xpath("//*[@text='Followers']"));
	    	Follower.click();
	    	Thread.sleep(3000);
	    	WebElement Following = driver.findElement(By.xpath("//*[@text='Following']"));
	    	Following.click(); 
	    	Thread.sleep(3000);
	    	WebElement EditProfile = driver.findElement(By.xpath("//*[@text='Edit Profile']"));
	    	EditProfile.click();
	    	Thread.sleep(3000);
	    	
	    	WebElement FirstName = driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
	    	FirstName.sendKeys(string);
	    	Thread.sleep(3000);
            WebElement panel = driver.findElement(By.xpath("//*[@class='android.widget.LinearLayout']"));
	    	ScrollDown(panel , driver);
	    	WebElement LastName = driver.findElement(By.xpath("(//*[@class='android.widget.EditText'])[1]"));
//	    	LastName.click();
	    	LastName.sendKeys(string2);
	    	Thread.sleep(3000);
	    	
	}
	    	    
	    	@When("user should Enter the Date {string} Month {string} and Year {string}")
	    	public void user_should_Enter_the_Date_Month_and_Year(String string3, String string4, String string5) throws InterruptedException {
	    	

	    	WebElement Date = driver.findElement(By.xpath("//*[@text='1900-01-01']"));
	    	Date.click();
	    	
	    	
//	    	WebElement DateScroll = driver.findElement(By.xpath("//*[@text='01']"));
//	    	//DateScroll.click();
//	    	ScrollUp(DateScroll , driver);
//	    	ScrollUp(DateScroll , driver);
//	    	ScrollUp(DateScroll , driver);
//	    	ScrollUp(DateScroll , driver);
//	    	ScrollUp(DateScroll , driver);
//	    	ScrollUp(DateScroll , driver);
//	    	WebElement MonthScroll = driver.findElement(By.xpath("(//*[@class='android.widget.NumberPicker'])[1]"));
//	    	//MonthScroll.click();
//	    	ScrollUp(MonthScroll , driver);
//	    	ScrollUp(MonthScroll , driver);
//	    	ScrollUp(MonthScroll , driver);
//	    	//WebElement YearScroll = driver.findElement(By.xpath("(//*[@class='android.widget.NumberPicker'])[2]"));
//	    	//YearScroll.click();
//	    	
//	    	
//	    	//WebElement DateTxt = driver.findElement(By.xpath("//*[@text='01']"));
//	    	//DateTxt.click();
////	    	
////	    	Thread.sleep(2000);
////	    	DateTxt.sendKeys(string3);
////	    	
////	    	WebElement MonthTxt = driver.findElement(By.xpath("//*[@text='Jan']"));
////	    	//MonthTxt.click();
////	    	
////	    	Thread.sleep(2000);
////	    	MonthTxt.sendKeys(string4);
//	    	WebElement YearTxt = driver.findElement(By.xpath("//*[@text='1900']"));
//	    	YearTxt.click();
//	    	
//	    	Thread.sleep(2000);
//	    	YearTxt.sendKeys("1999");
//	    		Thread.sleep(2000);
	    	WebElement DoneBtn = driver.findElement(By.xpath("//*[@text='DONE']"));
	    	DoneBtn.click();
	    	Thread.sleep(3000);	
	    	WebElement Gender = driver.findElement(By.xpath("//*[@text='Female']"));
		   	Gender.click();
		   	WebElement SelectGender = driver.findElement(By.xpath("//*[@class='android.widget.CheckedTextView']"));
		   	SelectGender.click();
		   	WebElement SaveBtn = driver.findElement(By.xpath("//*[@class='android.widget.Button']"));
	    	SaveBtn.click();
	    	Thread.sleep(3000);	 
	    	WebElement DoneBtn1 = driver.findElement(By.xpath("//*[@text='DONE']"));
	    	DoneBtn1.click();
	    	Thread.sleep(1000);
	    	WebElement PepulIcon = driver.findElement(By.xpath("//*[@class='android.widget.LinearLayout']"));
	    	SwipeRight(PepulIcon , driver);
	    	WebElement Menu = driver.findElement(By.xpath("//*[@class='android.widget.ImageView']"));
	    	Menu.click();
	    	Thread.sleep(6000);
	    	WebElement Swipe= driver.findElement(By.xpath("//*[@class='android.view.ViewGroup']"));
	    	ScrollUp(Swipe , driver);
	    	Thread.sleep(3000);
	    	//ScrollUp(panel , driver);
//	    	WebElement MenuIcon = driver.findElement(By.xpath("//*[@class='android.widget.ImageView']"));
//	    	MenuIcon.click();
//	    	Thread.sleep(1000);
//	    	WebElement ScrollUp = driver.findElement(By.xpath("//*[@class='android.widget.ImageView']"));
//	    	ScrollUp(ScrollUp , driver);
//	    	Thread.sleep(1000);
	    	WebElement Settings = driver.findElement(By.xpath("//*[@class='android.widget.ImageView']"));
	    	Settings.click();
	    	Thread.sleep(3000);
	    	WebElement Logout = driver.findElement(By.xpath("//*[@text='Logout']"));
	    	Logout.click();
	    	Thread.sleep(3000);
	    	WebElement Yes = driver.findElement(By.xpath("//*[@text='Yes']"));
	    	Yes.click();
	    	Thread.sleep(1000);
	    	
	    	
	    	}
	    	
	    	@When("User is on Trending Screen")
	    	public void user_is_on_Trending_Screen() throws InterruptedException {
	    		WebElement PhotoPost = driver.findElement(By.xpath(""));
		    	PhotoPost.click();
		    	Thread.sleep(3000);  
		    	WebElement HeartIcon = driver.findElement(By.xpath(""));
		    	HeartIcon.click();
		    	Thread.sleep(3000);
		    	WebElement CommentIcon = driver.findElement(By.xpath(""));
		    	CommentIcon.click();
		    	Thread.sleep(3000);
		    	WebElement SelectEmoji = driver.findElement(By.xpath(""));
		    	SelectEmoji.click();
		    	Thread.sleep(3000);
		    	WebElement WriteaMessage = driver.findElement(By.xpath(""));
		    	WriteaMessage.click();
		    	WriteaMessage.sendKeys();
		    	Thread.sleep(3000);
		    	WebElement SendButton = driver.findElement(By.xpath(""));
		    	SendButton.click();
		    	Thread.sleep(3000);
		    	WebElement Comments = driver.findElement(By.xpath(""));
		    	ScrollUp(Comments , driver);
		    	Thread.sleep(3000);
		    	WebElement Like = driver.findElement(By.xpath(""));
		    	Like.click();
		    	Thread.sleep(3000);
		    	WebElement SelectSticker = driver.findElement(By.xpath(""));
		    	SelectSticker.click();
		    	Thread.sleep(3000);
		    	WebElement SelectedSticker = driver.findElement(By.xpath(""));
		    	SelectedSticker.click();
		    	Thread.sleep(3000);
		    	WebElement Ellipsis = driver.findElement(By.xpath(""));
		    	Ellipsis.click();
		    	Thread.sleep(3000);
		    	WebElement Edit = driver.findElement(By.xpath(""));
		    	Edit.click();
		    	Thread.sleep(3000);
		    	WebElement TaponTextField = driver.findElement(By.xpath(""));
		    	TaponTextField.click();
		    	Thread.sleep(3000);
		    	WebElement Save = driver.findElement(By.xpath(""));
		    	Save.click();
		    	Thread.sleep(3000);
		    	WebElement Okay = driver.findElement(By.xpath(""));
		    	Okay.click();
		    	Thread.sleep(3000);
		    	Ellipsis.click();
		    	Thread.sleep(3000);
		    	WebElement Copy = driver.findElement(By.xpath(""));
		    	Copy.click();
		    	Thread.sleep(3000);
		    	Ellipsis.click();
		    	Thread.sleep(3000);
		    	WebElement Close = driver.findElement(By.xpath(""));
		    	Close.click();
		    	Thread.sleep(3000);
		    	Ellipsis.click();
		    	Thread.sleep(3000);
		    	WebElement Delete = driver.findElement(By.xpath(""));
		    	Delete.click();
		    	
		    	Thread.sleep(3000);
		    	
	    	}

	    	@When("User Click on any Post")
	    	public void user_Click_on_any_Post() {
	    	    
	    	}

	    	@When("User Should Click on Profile Picture")
	    	public void user_Should_Click_on_Profile_Picture() {
	    	    
	    	}

	    	@When("User Should Click on Categories")
	    	public void user_Should_Click_on_Categories() {
	    	    
	    	}

	    	@Then("User Should Close the App")
	    	public void user_Should_Close_the_App() {
	    	   
	    	}

	    	@Then("user should Move to Trending Screen")
	    	public void user_should_Move_to_Trending_Screen() {
	    	   
	    	}
	@Then("user should close the App")
	public void user_should_close_the_App() throws InterruptedException {
	Thread.sleep(6000);
		driver.quit();
	}

}
