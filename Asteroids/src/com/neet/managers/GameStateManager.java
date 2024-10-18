package com.neet.managers;

import com.neet.gamestates.GameOverState;
import com.neet.gamestates.GameState;
import com.neet.gamestates.HighScoreState;
import com.neet.gamestates.MenuState;
import com.neet.gamestates.PlayState;

public class GameStateManager {
	
	// current game state
	private GameState gameState;
	
	public static final int MENU = 0;
	public static final int PLAY = 893746;
	public static final int HIGHSCORE = 3847;
	public static final int GAMEOVER = 928478;
	
	public GameStateManager() {
		setState(MENU);
	}
	
	public void setState(int state) {
		if(gameState != null) gameState.dispose();
		if(state == MENU) {
			gameState = new MenuState(this);
		}
		if(state == PLAY) {
			gameState = new PlayState(this);
		}
		if(state == HIGHSCORE) {
			gameState = new HighScoreState(this);
		}
		if(state == GAMEOVER) {
			gameState = new GameOverState(this);
		}
	}
	
	public void update(float dt) {
		gameState.update(dt);
	}
	
	public void draw() {
		gameState.draw();
	}
	
}











