package page;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Assert;

import map.RegisterMap;

public class RegisterPage {
	RegisterMap registerMap = new RegisterMap();
	
	public RegisterPage validaTitulo(String titulo) {
		Assert.assertEquals(titulo, registerMap.titulo.getText());
		return this;
	}
	
	public RegisterPage setFirstName(String firstName) {
		registerMap.firstName.sendKeys(firstName);
		return this;
	}
	
	public void setLastName(String lastName) {
		registerMap.lastName.sendKeys(lastName);
	}
	
	public void setEndereco(String endereco) {
		registerMap.endereco.sendKeys(endereco);
	}
	
	public void setEmail(String email) {
		registerMap.email.sendKeys(email);
	}
	
	public void setTelefone(String telefone) {
		registerMap.telefone.sendKeys(telefone);
	}
	
	public void validaTelefone(String telefone) {
		Assert.assertEquals(telefone, registerMap.telefone.getValue());
	}
	
	public void clickGenero(String genero) {
		registerMap.genero.clickElementValue(genero);
	}
	
	public void clickHobbie(String hobbie) {
		registerMap.hobbie.clickElementValue(hobbie);
	}
	
	public void setFile(String file) {
		registerMap.file.sendKeys(file);
	}
	
	public void validaLogo(String
								   logo) {
		String[] _logo = registerMap.logo.getAttribute("src").split("/");
		assertEquals(logo, _logo[_logo.length -1]);
	}
	
	public void selecionaSkill(String skill) {
		registerMap.skills.selectText(skill);
	}
	
	public void selecionaSkills(String skill) {
		registerMap.skills.click();
		registerMap.optSkills.clickElementValue(skill);
		registerMap.skills.click();
	}
	
	public void selecionaLanguages(List<String> listLanguages) {
		registerMap.languages.click();



		for (String language : listLanguages) {
			registerMap.optLanguages.clickElementText(language);
		}
		registerMap.titulo.click();
		
	}
	
	public void selecionaCountry(String country) {
		registerMap.country.selectText(country);
	}
	
	public void selecionaCountryDois(String country) {
		registerMap.countryDois.selectText(country);
	}
	
	public void selecionaYear(String year) {
		registerMap.year.selectText(year);
	}
	
	public void selecionaMonth(String month) {
		registerMap.month.selectText(month);
	}
	
	public void selecionaDay(String day) {
		registerMap.day.selectText(day);
	}
	
	public void setPassword(String password) {
		registerMap.password.sendKeys(password);
	}
	
	public void setCofirmPassword(String password) {
		registerMap.confirmPassword.sendKeys(password);
	}
	
	public void clickSubmit() {
		registerMap.submit.click();
	}
	
	
	
}
