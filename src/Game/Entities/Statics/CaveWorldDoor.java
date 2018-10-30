package Game.Entities.Statics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import Game.Entities.Creatures.Player;
import Game.Entities.Creatures.UndyneEnemy;
import Main.Handler;
import Resources.Images;
import Worlds.BaseWorld;
import Worlds.TheCoreWorld;

/**
 * Created by Elemental on 2/2/2017.
 */

public class CaveWorldDoor extends StaticEntity {

	private Rectangle ir = new Rectangle();
	public Boolean EP = false;
	public static boolean hello;

	private BaseWorld world;

	public CaveWorldDoor(Handler handler, float x, float y,BaseWorld world) {
		super(handler, 120, y, 140, 100);
		this.world=world;
		health=10000000;
		bounds.x=0;
		bounds.y=0;
		bounds.width = 115;
		bounds.height = 115;

		ir.width = bounds.width;
		ir.height = bounds.height;
		int irx=(int)(bounds.x-handler.getGameCamera().getxOffset()+x);
		int iry= (int)(bounds.y-handler.getGameCamera().getyOffset()+height);
		ir.y=iry;
		ir.x=irx;
	}

	@Override
	public void tick() {

		if(isBeinghurt()){
			setHealth(10000000);
		}

		if(handler.getKeyManager().attbut){
			EP=true;
			

		}else if(!handler.getKeyManager().attbut){
			EP=false;
		}

	}
	@Override
	public void render(Graphics g) {
		if (UndyneEnemy.count >= 1) {
			g.drawImage(Images.door,(int)(x-handler.getGameCamera().getxOffset()),(int)(y-handler.getGameCamera().getyOffset()),width,height,null);

			g.setColor(Color.black);
			checkForPlayer(g, handler.getWorld().getEntityManager().getPlayer());
		}

	}

	private void checkForPlayer(Graphics g, Player p) {
		Rectangle pr = p.getCollisionBounds(0,0);

		if(ir.contains(pr) && !EP){
			g.drawImage(Images.E,(int) x+width,(int) y+10,32,32,null);
		}else if(ir.contains(pr) && EP){
			g.drawImage(Images.EP,(int) x+width,(int) y+10,32,32,null);
			handler.getWorld().getEntityManager().getPlayer().setX(600);
			handler.getWorld().getEntityManager().getPlayer().setY(1100);
			handler.setWorld(world);
			hello = true;
			
		}


	}

	@Override
	public void die() {

	}
}
