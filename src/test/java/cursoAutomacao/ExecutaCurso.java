package cursoAutomacao;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import core.Driver;
import page.RegisterPage;

public class ExecutaCurso {
	RegisterPage registerPage = new RegisterPage();
	public void test1(){
		System.out.println("teste 1");
	}
	
	
	public void validoSoma() {
		int _soma = soma(10, 5);
		Assert.assertEquals(15, _soma);
	}
		
	@Test
	public void preencheFormulario() {
		registerPage.validaTitulo("Register");
		registerPage.setFirstName("Adam");
		registerPage.setLastName("Luchini");
		registerPage.setEndereco("Rua Mauro");
		registerPage.setEmail("automacaoTurma4@gmail.com");
		registerPage.setTelefone("1145215422");
		registerPage.validaTelefone("1145215422");
		registerPage.clickGenero("Male");
		registerPage.clickHobbie("Movies");
		registerPage.clickHobbie("Hockey");
		String caminhoArquivo = System.getProperty("user.dir")+"\\files\\teste.jpg";
		registerPage.setFile(caminhoArquivo);
		registerPage.validaLogo("original.png");
		
		List<String> languages = new ArrayList<String>();
		languages.add("Portuguese");
		languages.add("English");
		registerPage.selecionaLanguages(languages);
		registerPage.selecionaSkills("Java");
		registerPage.selecionaCountry("Brazil");
		registerPage.selecionaCountryDois("Australia");
		registerPage.selecionaYear("1988");
		registerPage.selecionaMonth("October");
		registerPage.selecionaDay("12");
		registerPage.setPassword("Teste123");
		registerPage.setCofirmPassword("Teste123");
		registerPage.clickSubmit();
		Driver.aguardaTempo(3000);
		
	}
		
		
	
	@Before
	public void abreNavegador() {
		Driver.setDriver("http://demo.automationtesting.in/Register.html");
	}
	
	@After
	public void fechaNavegador() {
		//Driver.getDriver().quit();
	}
	
	public int soma(int a, int b) {
		int soma = a + b;
		return soma;
	}
}
