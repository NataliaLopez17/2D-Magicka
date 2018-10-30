package Game.GameStates;

import Game.Entities.Creatures.Player;
import Main.Handler;
import Worlds.BaseWorld;
import Worlds.CaveWorld;
import Worlds.TheCoreWorld;
import Worlds.World1;
import Inputs.KeyManager;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Elemental on 12/10/2016.
 */
public class GameState extends State {
	public static boolean World11 = true;
	public static boolean World22 = false;


	public GameState(Handler handler){
		super(handler);
		Player player = new Player(handler, 100, 100);
		BaseWorld world = new World1(handler, "res/Maps/map1.map", player);
		handler.setWorld(world);
		handler.getWorld().getEntityManager().setPlayer(player);
	}


	@Override
	public void tick() {
		handler.getWorld().tick();
		if (handler.getKeyManager().keyJustPressed(KeyEvent.VK_TAB) && World11 == true) {
			handler.setWorld(World1.caveWorld);
			World11 = false;
			World22 = true;
		}
		
	}
	@Override
	public void render(Graphics g) {
		handler.getWorld().render(g);


	}

}
