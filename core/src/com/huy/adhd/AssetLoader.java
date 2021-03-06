package com.huy.adhd;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

public class AssetLoader {

	// IMAGES
	private static Texture menuButton;
	// drag&drop
	private static Texture square;
	private static Texture square2;

	// FONTS
	private static FreeTypeFontGenerator TIMES_SQ;

	public static void initResources() {
		loadImages();
		loadFonts();
	}

	private static void loadImages() {
		menuButton = new Texture(Gdx.files.internal("images/menuButton.png"));
		square = new Texture(Gdx.files.internal("images/square.png"));
		square2 = new Texture(Gdx.files.internal("images/square2.png"));
	}

	private static void loadFonts() {
		TIMES_SQ = new FreeTypeFontGenerator(
				Gdx.files.internal("fonts/TIMES_SQ.TTF"));
	}

	public static Texture getMenuButton() {
		return menuButton;
	}

	public static Texture getSquare() {
		return square;
	}

	public static Texture getSquare2() {
		return square2;
	}
	
	public static FreeTypeFontGenerator getTIMES_SQFont (){
		return TIMES_SQ;
	}
}
