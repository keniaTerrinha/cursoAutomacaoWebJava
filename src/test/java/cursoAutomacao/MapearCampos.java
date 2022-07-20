package cursoAutomacao;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.Driver;
import core.Element;
import enums.ByValue;

public class MapearCampos {
	@Test
	public void coletaCampos() {
		Driver.setDriver("http://demo.automationtesting.in/Register.html");
		WebElement section = Driver.getDriver().findElement(By.id("section"));
		exibeMapsInput(section, "input");
		exibeMapsInput(section, "select");
		exibeMapsInput(section, "button");
	}
	
	public void exibeMapsInput(WebElement form, String tagHtml) {
		List<WebElement> listElements = form.findElements(By.cssSelector(tagHtml));
		for (WebElement element : listElements) {
			if (!element.getAttribute("id").equals("")) {
				String id = element.getAttribute("id");
				String idTratado = id.toLowerCase().replace(" ", "");
				String map = "public Element "+idTratado+" = new Element(\""+id+"\", ByValue.id)";
				System.out.println(map);
			}else if (!element.getAttribute("ng-model").equals("")) {
				String ngModel = element.getAttribute("ng-model");
				String ngModelTratado = ngModel.toLowerCase().replace(" ", "");
				String map = "public Element "+ngModelTratado+" = new Element(\"//input[@ng-model='"+ngModel+"']\", ByValue.xpath);";
				System.out.println(map);
			}
		}
	}
	
}
