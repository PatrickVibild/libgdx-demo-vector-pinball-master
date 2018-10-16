package com.dozingcatsoftware.bouncy.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.dozingcatsoftware.bouncy.Bouncy;

public class DesktopLauncher {
	public static void main (String[] arg) {
		//here is a comment that was not int he original software.
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Vector Pinball";
        config.width = 480;

        config.height = 800;
		new LwjglApplication(new Bouncy(), config);
	}
}
