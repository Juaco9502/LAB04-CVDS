package hangman.model;


public class OriginalScore implements GameScore {
	public int puntaje = 100;    
/**
	* @pre Inicia en 100 puntos.
	* @pos por cada letra incorrecta se penaliza con 10 puntos, el puntaje minimo es 0.
	* @param correctCount intentos exitosos.
	* @param incorrectCount intentos incorrectos.
	* @throws InvalidScoreException puntaje menor a 0. 
	* @return El puntaje.
*/
	public int calculateScore(int correctCount, int incorrectCount) {
		puntaje -= 10*incorrectCount;
		if (puntaje < 0) {
			puntaje = 0;
		}
			return puntaje ;		
	}

}
