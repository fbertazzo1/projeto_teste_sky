package homepage;

//import org.junit.Test;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;   

import base.BaseTests;

public class HomePageTests extends BaseTests{  
	
	@Test	
	public void testValidarPagina () {  
		carregarPaginaInicial();		
	}
	@Test
	public void testClicarProgramacao () {	
		homePage.clicarProgramacao();
	}
}
