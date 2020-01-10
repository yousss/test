package commonLibs;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import commonLibsInterfaces.IDropDownControls;

public class DropDownControls implements IDropDownControls{

	public void selectViaVisibleText(WebElement element, String visibleText) throws Exception {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
		
	}

	public void selectViaValue(WebElement element, String value) throws Exception {
		Select select = new Select(element);
		select.selectByValue(value);
		
	}

	public void selectViaIndex(WebElement element, int index) throws Exception {
		Select select = new Select(element);
		select.selectByIndex(index);
		
	}

	public boolean isMultiple(WebElement element) throws Exception {
		Select select = new Select(element);
		
		return select.isMultiple();
	}

	public List<WebElement> getAllOption(WebElement element) throws Exception {
		Select select = new Select(element);
		return select.getOptions();
	}

	public List<WebElement> getAllSelectedOption(WebElement element) throws Exception {
		Select select = new Select(element);
		return select.getAllSelectedOptions();
	}

	public WebElement getFirlstSelectedOption(WebElement element) throws Exception {
		Select select = new Select(element);
		
		return select.getFirstSelectedOption();
	}

	

}
