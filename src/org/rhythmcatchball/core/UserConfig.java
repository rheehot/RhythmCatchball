package org.rhythmcatchball.core;

public class UserConfig {
	float confVolume;
	int[] confResolu = new int[2];
	int[] confKey1Set = new int[4];	
	int[] confKey2Set = new int[4];	
	
	public UserConfig() {
		confVolume = 0.8f;
		
		confResolu[0] = 1280;
		confResolu[1] = 720;
		//Player1 key값 초기설정
		confKey1Set[Key.LOW.getIndex()] = 68;
		confKey1Set[Key.MIDDLE.getIndex()] = 83;
		confKey1Set[Key.HIGH.getIndex()] = 65;
		confKey1Set[Key.RECEIVE.getIndex()] = 32;
		
		//Player2 key값 초기설정
		confKey2Set[Key.LOW.getIndex()] = 37;
		confKey2Set[Key.MIDDLE.getIndex()] = 40;
		confKey2Set[Key.HIGH.getIndex()] = 39;
		confKey2Set[Key.RECEIVE.getIndex()] = 16;
	}
	
	//일단 만들어놓고 나중에 변경
	public void setVolume(float tmp) { confVolume = tmp; }
	public float getVolume() { return confVolume; }

	public void setResolusion(int width, int height) {
		confResolu[0] = width;
		confResolu[1] = height;
	}
	public int getResWidth() {return confResolu[0];}
	public int getResHeight() {return confResolu[1];}

	public int[] getKey1Set() {return confKey1Set;}
	public int[] getKey2Set() {return confKey2Set;}
	
	public void copy(UserConfig userConfigCopy) {
		if (userConfigCopy == null) return;
		confVolume = userConfigCopy.confVolume;
		int[][] targetList = {confResolu, confKey1Set, confKey2Set};
		int[][] copyList = {userConfigCopy.confResolu, userConfigCopy.confKey1Set, userConfigCopy.confKey2Set};

		int j = 0;
		for(int i = 0; i < targetList.length; i++) {
			for(j = 0; j < targetList[i].length; j++)
				targetList[i][j] = copyList[i][j];
		}
	}
}
