package map;

import core.Element;
import enums.ByValue;

public class RegisterMap {
	public Element titulo = new Element("h2", ByValue.css);
	//public Element firstName = new Element("//input[@ng-model='FirstName']", ByValue.xpath);
	public Element firstName = new Element("input", ByValue.css, 0);
	public Element lastName = new Element("//input[@placeholder='Last Name']", ByValue.xpath);
	public Element endereco = new Element("textarea", ByValue.css);
	public Element email = new Element("//input[@ng-model='EmailAdress']", ByValue.xpath);
	public Element telefone = new Element("//input[@ng-model='Phone']", ByValue.xpath);
	public Element genero = new Element("//input[@ng-model='radiovalue']", ByValue.xpath);
	public Element hobbie = new Element("//input[@type='checkbox']", ByValue.xpath);
	public Element file = new Element("imagesrc", ByValue.id);
	public Element logo = new Element("a > img", ByValue.css);
	public Element skills = new Element("Skills", ByValue.id);
	public Element optSkills = new Element("#Skills > option", ByValue.css);
	public Element languages = new Element("msdd", ByValue.id);
	public Element optLanguages = new Element("li.ng-scope > a", ByValue.css);
	public Element country = new Element("countries", ByValue.id);
	public Element countryDois = new Element("country", ByValue.id);
	public Element year = new Element("yearbox", ByValue.id);
	public Element month = new Element("//select[@ng-model='monthbox']", ByValue.xpath);
	public Element day = new Element("daybox", ByValue.id);
	public Element password = new Element("firstpassword", ByValue.id);
	public Element confirmPassword = new Element("secondpassword", ByValue.id);
	public Element
			submit = new Element("submitbtn", ByValue.id);
	

	
}
