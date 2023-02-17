package SuiteTests;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("Demostración Prueba dos clases")

@SelectClasses({ 
	SuiteClases.CalculadoraMultiplicaTest.class, 
	SuiteClases.CalculadoraSumaTest.class 
	})

public class PruebaClases {

}
