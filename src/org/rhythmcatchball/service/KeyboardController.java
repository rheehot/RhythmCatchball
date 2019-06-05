package org.rhythmcatchball.service;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import org.rhythmcatchball.core.Key;
import org.rhythmcatchball.gameplay.Player;

public class KeyboardController implements Controller, KeyListener {
	public Player player;
	public int[] keyval = new int[4];
	
	public KeyboardController() {
		//추후 구현 
	}
	
	//player설정 
	public void setPlayer(Player playertoset) {
		this.player = playertoset;
	}

	//누른 키에 대해 작동 
	public void keyTyped(KeyEvent e) {
		int keyCode = e.getKeyCode();
		System.out.println("keyCode = "+keyCode);
		if(keyCode == keyval[Key.LOW.getIndex()]) {
			player.readyToThrow(0);
		}
		if (keyCode == keyval[Key.MIDDLE.getIndex()]) {
			player.readyToThrow(1);
		}
		if(keyCode == keyval[Key.HIGH.getIndex()]) {
			player.readyToThrow(2);
		}
		if(keyCode == keyval[Key.RECEIVE.getIndex()]) {
			player.catchOnce();
		}
	}
	

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		System.out.println("keyCode = "+keyCode);
		if(keyCode == keyval[Key.LOW.getIndex()]) {
			player.readyToThrow(0);
		}
		if (keyCode == keyval[Key.MIDDLE.getIndex()]) {
			player.readyToThrow(1);
		}
		if(keyCode == keyval[Key.HIGH.getIndex()]) {
			player.readyToThrow(2);
		}
		if(keyCode == keyval[Key.RECEIVE.getIndex()]) {
			player.catchOnce();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public Player getPlayer() {
		return player;
	}

	@Override
	public boolean catchCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update(int beatcount) {
		// TODO Auto-generated method stub
		
	}
}
