/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.setup.guice;
import com.google.inject.*;

import hangman.model.English;

/**
 *
 * @author 2106913
 */

import hangman.model.French;
import hangman.model.OriginalScore;
import hangman.model.GameScore;
import hangman.model.Language;
import hangman.model.dictionary.HangmanDictionary;
import hangman.model.dictionary.FrenchDictionaryDataSource;
import hangman.view.HangmanNoviolentoPanel;
import hangman.view.HangmanPanel;

public class HangmanFactoryServices extends com.google.inject.AbstractModule {

    @Override
    protected void configure() {
        /* Guice dependency injection */
        // bind(Interface.class).to(Concrete.class);
	bind(GameScore.class).to(OriginalScore.class);
	bind(HangmanDictionary.class).to(FrenchDictionaryDataSource.class);
	bind(HangmanPanel.class).to(HangmanNoviolentoPanel.class);
	
    }

}
