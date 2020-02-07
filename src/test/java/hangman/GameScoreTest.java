package hangman;
import org.junit.Assert;
import org.junit.Test;

import hangman.model.*;

public class GameScoreTest {
	
	/**
	 * OriginalScore 
	 * Inicia en 100 puntos**
	 * El puntaje minimo debe ser 0 **
	 * Si se tiene 10 > errores su puntaje es 0 **
	 * Se penaliza con 10 puntos con cada letra incorrecta **
	 * No se bonifican las letras correctas *
	 */	
	@Test 
	public void originalScoreIniciaEn100Puntos() {
		OriginalScore prueba = new OriginalScore();
		int puntaje = prueba.calculateScore(0,0);
		Assert.assertEquals(100, puntaje);
	}

	@Test 
	public void originalScorePuntajeMinimo0() {
		OriginalScore prueba = new OriginalScore();
		int puntaje = prueba.calculateScore(0,999999);
		Assert.assertEquals(0, puntaje);
	}
	
	@Test
	public void originalScoreLimites() {
		int limiteIzq, limite, limiteDer;
		OriginalScore prueba = new OriginalScore();
		limiteIzq  = prueba.calculateScore(0, 9);
		Assert.assertEquals(10, limiteIzq);
		limite  = prueba.calculateScore(0, 10);
		Assert.assertEquals(0, limite);
		limiteDer  = prueba.calculateScore(0, 11);
		Assert.assertEquals(0, limiteDer);
	}

	@Test
	public void originalScoreNoBonificaLetrasCorrectas() {
		OriginalScore prueba = new OriginalScore();
		int puntaje  = prueba.calculateScore(10, 0);
		Assert.assertEquals(100, puntaje);
		int puntaje2  = prueba.calculateScore(10, 1);
		Assert.assertEquals(90, puntaje2);
	}

	
	/**
	 * BonusScore
	 * Inicia en 0 puntos**
	 * El puntaje minimo debe ser 0 **
	 * Si las letras incorrectas y las letras correctas son iguales el bonusScore debe ser la mitad de los puntos ganados **
	 * Si las letras incorrectas son el doble o mayor a las letras correctas el bonusScore debe ser 0 **
	 * Si las letras correctas son mayor a las letras incorrectas el bonusScore debe ser mayor a 0 ** 
	 */	
	
	@Test
	public void bonusScoreCorrectasEIncorrectasIguales() {
		BonusScore prueba = new BonusScore();		
		int puntaje = prueba.calculateScore(10, 10);
		Assert.assertEquals(50, puntaje);
	}
	
	@Test  
        public void bonusScorePuntajeMinimo0() {
		BonusScore prueba = new BonusScore();
		int puntaje  = prueba.calculateScore(1,999999);
		Assert.assertEquals(0, puntaje);
		
	}

	@Test 
        public void bonusScoreCorrectasMayorAIncorrectas(){
		BonusScore prueba = new BonusScore();
		int puntaje  = prueba.calculateScore(5, 2);
		Assert.assertEquals(40, puntaje);
	}
	
	
	
	@Test
	public void bonusScoreIniciaEn0Puntos() {
		BonusScore prueba = new BonusScore();
		int puntaje = prueba.calculateScore(0, 0);
		Assert.assertEquals(0, puntaje);
	}
	

	/**
	 * PowerBonusScore
	 * Inicia en 0 puntos**
	 * El puntaje minimo debe ser 0 **
	 * Si las letras correctas son mayor a 0 o de lo contrario seria 0 el PowerBonusScore **
	 * Al bonificar, el maximo debe ser 500 puntos **
	 * La sumatoria donde i = 1 hasta n para las letras correctas, es maximo 3 . Por que en caso de ser 4 , da 780 y supera los 500 puntos **
	 */
	@Test
	public void PowerBonusScoreCalculo() {
		PowerScore puntaje = new PowerScore();		
		int valor1  = puntaje.calculateScore(3, 0);
		Assert.assertEquals(155, valor1);
		
		int valor2 = puntaje.calculateScore(0, 999999);
		Assert.assertEquals(0, valor2);
		
		int valor3  = puntaje.calculateScore(10, 1);
		Assert.assertEquals(500, valor3);
		
		int valor4  = puntaje.calculateScore(3,1);
		Assert.assertEquals(147, valor4);
	}
	
	@Test
	public void valorInicialPower() {
		PowerScore prueba = new PowerScore();
		int puntaje = prueba.calculateScore(0, 0);
		Assert.assertEquals(0, puntaje);
	}
	
}