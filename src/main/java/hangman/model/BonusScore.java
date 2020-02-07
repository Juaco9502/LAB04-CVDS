package hangman.model;


public class BonusScore implements GameScore {
	public int puntaje = 0;    
/**
	* @pre Inicia en 0 puntos.
	* @pos por cada letra incorrecta se penaliza con 5 puntos,cada letra correcta se bonifica con 10 puntos - el puntaje minimo es 0.
	* @param correctCount intentos exitosos.
	* @param incorrectCount intentos incorrectos.
	* @throws InvalidScoreException puntaje menor a 0. 
	* @return El puntaje.
*/
	public int calculateScore(int correctCount, int incorrectCount) {
		this.puntaje += 10*correctCount;
		this.puntaje -= 5*incorrectCount;
		if (puntaje < 0) {
			puntaje = 0;
		}
			return puntaje;		
	}

}
