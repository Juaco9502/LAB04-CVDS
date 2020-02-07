package hangman.model;



public interface GameScore {

/**
	* @pre  Tener el conteo correcto.
	* @pos Calcular el puntaje del juego.
	* @param correctCount intentos exitosos.
	* @param incorrectCount intentos incorrectos.
	* @throws GameScoreException.
	* @return El puntaje. 
*/

	public int calculateScore(int correctCount, int incorrectCount);

}
