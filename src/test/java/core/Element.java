package core;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import enums.ByValue;

public class Element {

	private String map;
	private ByValue by;
	private Integer posicao;

	public Element(String map, ByValue _by) {
		this.map = map;
		by = _by;
	}
	
	public Element(String map, ByValue _by, Integer _posicao) {
		this.map = map;
		by = _by;
		posicao = _posicao;
	}
	
	public WebElement getElement(By by) {
		if (posicao == null) {
			return Driver.getDriver().findElement(by);
		}else {
			return Driver.getDriver().findElements(by).get(posicao);
		}
	}

	public WebElement createElement() {
		WebElement element = null;
		switch (by) {
		case id:
			element = getElement(By.id(map));			
			break;
		case xpath:
			element = getElement(By.xpath(map));
			break;
		case css:
			element = getElement(By.cssSelector(map));
			break;
		case linkText:
			element = getElement(By.linkText(map));
			break;
		case name:
			element = getElement(By.name(map));
			break;

		default:
			break;
		}

		return element;
	}

	public List<WebElement> createElements() {
		List<WebElement> elements = new ArrayList<WebElement>();
		switch (by) {
		case id:
			elements = Driver.getDriver().findElements(By.id(map));
			break;
		case css:
			elements = Driver.getDriver().findElements(By.cssSelector(map));
			break;
		case linkText:
			elements = Driver.getDriver().findElements(By.linkText(map));
			break;
		case name:
			elements = Driver.getDriver().findElements(By.name(map));
			break;
		case xpath:
			elements = Driver.getDriver().findElements(By.xpath(map));
			break;
		default:
			break;
		}
		return elements;
	}
	
	public void clickElementValue(String valor) {
		for (WebElement webElement : createElements()) {
			if (webElement.getAttribute("value").equals(valor)) {
				webElement.click();
				break;
			}
		}
	}
	
	public void clickElementText(String valor) {
		for (WebElement webElement : createElements()) {
			if (webElement.getText().equals(valor)) {
				webElement.click();
				break;
			}
		}
	}
	
	public void click() {
		createElement().click();
	}

	public String getText() {
		return createElement().getText();
	}

	public void sendKeys(CharSequence value) {
		createElement().sendKeys(value);
	}

	public String getValue() {
		return createElement().getAttribute("value");
		
	}

	public String getAttribute(String atributo) {
		return createElement().getAttribute(atributo);
	}
	
	public void selectText(String value) {
		Select select = new Select(createElement());
		select.selectByVisibleText(value);
	}
		

}
