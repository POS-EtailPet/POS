package stepdefinations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.DeleteProducts;
import com.pages.ImportInventory;
import com.pages.ImportsProducts;
import com.pages.LoginPage;
import com.pages.ProductListTables;
import com.pages.SwitchToPOS;
import com.pages.SwitchToStore;

import cucumberAutomation.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinition {
	public WebDriver driver;
	LoginPage l;
	SwitchToPOS STP;
	SwitchToStore STR;
	ImportsProducts IP;
	ProductListTables PLT;
	ImportInventory Inv;
	DeleteProducts DP;

	@Given("^Launch the web application$")
	public void launch_the_web_application() throws Throwable {
		Base base = new Base();
		driver = base.getDriver();
	}

	@Then("^Login Screen$")
	public void login_screen() throws Throwable {
		driver.get("https://etailadmin:pwd@123@beta-etailplus.dev.etailpet.com/retailer/dash/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		l = new LoginPage(driver);
		l.enter_username().sendKeys("qa@etailpet.com");
		l.enterpassword().sendKeys("qaETP*");
		l.clicksignIn().click();

	}

	@Then("^Switch to POS and click on the manage catalog$")
	public void switch_to_pos() throws Throwable {
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		SwitchToPOS s = new SwitchToPOS(driver);
		Thread.sleep(8000);
		// s.switchtoPOS().click();
		Thread.sleep(8000);
		Select select = new Select(driver.findElement(By.id("dashboard-toggle")));
		Thread.sleep(8000);
		select.selectByValue("etailplus");
		Thread.sleep(8000);
		s.selectManagerOrder().click();
		Thread.sleep(8000);
		s.selectmyproduct().click();
	}

	@Then("^Switch to the automation store$")
	public void switch_to_the_automation_store() throws Throwable {
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		SwitchToStore store = new SwitchToStore(driver);
		Select se = new Select(store.switchToStore());
		se.selectByVisibleText("Automation Testing Store (ID:16)");
		store.submit().click();
	}

	@And("^Click on IMPORT UPDATE PRODUCTS$")
	public void Click_on_IMPORT_UPDATE_PRODUCTS() throws Throwable {
//		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
//		ImportsProducts IP = new ImportsProducts(driver);
//		Thread.sleep(5000);
//		IP.ClickImport().click();
//		Thread.sleep(5000);
	}

	@And("^Click on Download GET SAMPLE EXCEL FILE$")
	public void click_on_download_get_sample_excel_file1() throws Throwable {
//		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
//		ImportsProducts IP = new ImportsProducts(driver);
//		IP.downloadExcel().click();
//		//driver.findElement(By.xpath("//a[text()='Get Sample Excel']")).click();
	}

	@Then("Check Sample Excel File")
	public void check_sample_excel_file() {
//		String filepath = "C:\\Users\\WIN-010\\Downloads";
//
//		String fileName = "Public Products Import Template (2).xlsx";
//
//		File targetFile = new File(fileName,filepath);
//
//		if(!targetFile.exists())
//		{
//			System.out.println("File is verified");
//		}
//		else
//		{
//			System.out.println("file not downloaded");
//		}

	}

	@When("Put Data on the Excel")
	public void put_data_on_the_excel() throws IOException {
//		XSSFWorkbook workbook = new XSSFWorkbook();
//		XSSFSheet spreadsheet = workbook.createSheet("Import");
//		XSSFRow row;
//		Map<String, Object[]> productData= new TreeMap<String, Object[]>();
//		productData.put("0", new Object[]{"upc	max_item_per_cart",	"price", "show_on_website",	"delivery_methods",	"stores	is_taxable", "remove_product", 
//				"is_astro_points_eligible", "dil", "reorder_type", "is_shelf_tag","custom_field_one","custom_field_two"});
//		productData.put("1", new Object[] {"210000051834",	"2","19","Yes", "PICKUP","16","Yes"," ","Yes","","","","",""});		
//		productData.put("2", new Object[] {"210000054700",	"2","20","Yes", "PICKUP","16","Yes"," ","Yes","","","","",""});	
//		productData.put("3", new Object[] {"210000047845",	"2","22","Yes", "PICKUP","16","Yes"," ","Yes","","","","",""});	
//
//		Set<String> KeyId = productData.keySet();
//		int rowid=0;
//		for (String key : KeyId)
//		{
//			row= spreadsheet.createRow(rowid);
//			Object[] objectArr =  productData.get(key);
//			int cellid=0;
//
//			for(Object object : objectArr) 
//			{
//				Cell cell = row.createCell(cellid++);
//				cell.setCellValue((String)object);
//			}
//
//		}
//		FileOutputStream out = new FileOutputStream(new File("C:\\Users\\WIN-010\\Downloads\\Public Products Import Template (2).xlsx")); 
//		workbook.write(out);
//		out.close();

	}

	@Then("Upload SAMPLE EXCEL FILE")
	public void Upload_SAMPLE_EXCEL_FILE() throws InterruptedException, IOException, AWTException {
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		Robot robot = new Robot();
		ImportsProducts IP = new ImportsProducts(driver);
		IP.ClickImport().click();
		IP.UploadExcel().click();
		robot.setAutoDelay(8000);
		StringSelection stringSelection = new StringSelection("C:\\Users\\WIN-010\\Downloads\\Public Products Import Template (3)");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		robot.setAutoDelay(8000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(8000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("ProducList uploaded Successfully");
	}

	@Then("Check all the Test the Details of products")
	public void check_all_the_test_the_details_of_products() throws IOException {
		driver.manage().timeouts().implicitlyWait(8000,TimeUnit.SECONDS);
		driver.navigate().refresh();
		ProductListTables prodList= new ProductListTables(driver);
        List<WebElement> allHeaderOfTable = driver.findElements(By.xpath("//*[@id='wrapper']/div[2]/div/div[3]/div/div/div[3]/table/thead"));
        System.out.println("the Header of the Table " +allHeaderOfTable.size());
        WebElement importedProduct = driver.findElement(By.xpath("//*[@id='prod_itm_3258']"));
     
        List<WebElement> rows = driver.findElements(By.xpath("//table//tbody/tr"));
         for(WebElement row: rows) 
        {
          
        	if (row.equals(importedProduct))
        	{
        		System.out.println("Product imported Successfully");
        		
        	}
        }
 

	}

	@Then("Click on IMPORT PRODUCT INVENTORY")
	public void Click_on_IMPORT_PRODUCT_INVENTORY() throws AWTException, InterruptedException {
		ImportInventory iv = new  ImportInventory(driver);
		Thread.sleep(5000);
		iv.Importinventory().click();
		Thread.sleep(5000);
		iv.exportSample().click();
		Thread.sleep(5000);
		iv.uploadExcelforinventory().click();
		Thread.sleep(8000);
		Robot robot = new Robot();
		robot.setAutoDelay(8000);
		StringSelection stringSelection = new StringSelection("C:\\Users\\WIN-010\\Downloads\\Product Inventory QOH Import Template (1)");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		robot.setAutoDelay(8000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(8000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	@And("Test the Details")
	public void Test_the_Details() {

	}

	@Then("Delete the new product to retest")
	public void Delete_the_new_product_to_retest() throws InterruptedException {

		String productID = "prod_itm_3231";
		Thread.sleep(8000);
		driver.findElement(By.xpath("//tbody/tr[@id='" + productID + "']/td[1]/div[1]")).click();
		DeleteProducts deleteProducts = new DeleteProducts(driver);
		deleteProducts.ClickOnBatchAction().click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id='product_search_dash']/div[3]/div[3]/div/div/div[5]/div[1]/div/label"))).click();
		WebElement saveRemoveProduct = driver.findElement(By.xpath("//input[@id='batch-action-save']"));
		Thread.sleep(8000);
		saveRemoveProduct.click();
		Thread.sleep(8000);
		System.out.println("Product Removed");
		driver.quit();

	}

}
