package hangman.model;


public class BonusScore implements GameScore {   
/**
	* @pre Inicia en 0 puntos.
	* @pos por cada letra incorrecta se penaliza con 5 puntos,cada letra correcta se bonifica con 10 puntos - el puntaje minimo es 0.
	* @param correctCount intentos exitosos.
	* @param incorrectCount intentos incorrectos.
	* @throws InvalidScoreException puntaje menor a 0. 
	* @return El puntaje.
*/
	public int calculateScore(int correctCount, int incorrectCount) {
		return 0;		
	}

}
