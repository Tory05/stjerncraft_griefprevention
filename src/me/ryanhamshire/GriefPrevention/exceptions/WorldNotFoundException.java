package me.ryanhamshire.GriefPrevention.exceptions;

public class WorldNotFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6166086706700100939L;
	
	public String worldName;
	
	public WorldNotFoundException(String string) {
		super("World not found: \"" + string + "\"");
		worldName = string;
	}

}
