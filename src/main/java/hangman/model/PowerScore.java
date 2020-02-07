package hangman.model;


public class PowerScore implements GameScore { 
/**
	* @pre Inicia en 0 puntos.
	* @pos por cada letra incorrecta se penaliza con 8 puntos,La $i-ésima$ letra correcta se bonifica con $5^i$, el puntaje minimo es 0 y el puntaje maximo es 500.
	* @param correctCount intentos exitosos.
	* @param incorrectCount intentos incorrectos.
	* @throws InvalidScoreException puntaje menor a 0. 
	* @return El puntaje.
*/
	public int calculateScore(int correctCount, int incorrectCount) {
		int puntaje=0;
		puntaje -= 8*incorrectCount;
		for (int i = 1; i <= correctCount;i++){
			puntaje += Math.pow(5,i);
		}
		if (puntaje < 0) {
			puntaje = 0;
		}
		else if (puntaje >= 500) {
			puntaje = 500;
		}
		return puntaje ;
	}

}
