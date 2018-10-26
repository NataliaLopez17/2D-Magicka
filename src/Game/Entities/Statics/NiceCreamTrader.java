package Game.Entities.Statics;

import Game.Entities.Creatures.Player;
import Main.Handler;
import Resources.Images;
import Game.Items.Item;
import java.awt.event.KeyEvent;
import java.awt.*;
/**
 * Created by Elemental on 2/2/2017.
 */

public class NiceCreamTrader extends StaticEntity {

	private Rectangle ir = new Rectangle();
	public Boolean EP = false;
	public int moneyCount = Item.moneyBagItem.getCount();
	public int keyCount = Item.keyItem.getCount();
	public int ccount = 0;
	public int ccount2 = 0;
	public static int COUNTER;

	public int ex = 0;
	public int way = 0;


	public NiceCreamTrader(Handler handler, float x, float y) {
		super(handler, x, y, 100, 120);
		health=10000000;
		bounds.x=0;
		bounds.y=0;
		bounds.width = 110;
		bounds.height = 110;

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
		g.drawImage(Images.niceCreamTrader,(int)(x-handler.getGameCamera().getxOffset()),(int)(y-handler.getGameCamera().getyOffset()),width,height,null);
		checkForPlayer(g, handler.getWorld().getEntityManager().getPlayer());
		moneyCount = moneyCount - 1;
		keyCount = keyCount - 1;
	}

	private void checkForPlayer(Graphics g, Player p) {
		Rectangle pr = p.getCollisionBounds(0,0);


		if(ir.contains(pr) && !EP){
			Font stringfont = new Font("SansSerif", Font.PLAIN, 20);
			g.setFont(stringfont);
			g.setColor(Color.WHITE);
			g.drawImage(Images.L,(int)(780-handler.getGameCamera().getxOffset()),(int)(y-handler.getGameCamera().getyOffset()),30,30,null);
			g.drawImage(Images.tradeBox,(int)(920-handler.getGameCamera().getxOffset()),(int)(y-handler.getGameCamera().getyOffset()),300,100,null);

			if (ccount == 0)
				g.drawString("0/3", (int)(1060-handler.getGameCamera().getxOffset()),(int)(75-handler.getGameCamera().getyOffset()));

			if (ccount2 == 0)
				g.drawString(String.valueOf("0/1"), (int)(1165-handler.getGameCamera().getxOffset()),(int)(75-handler.getGameCamera().getyOffset()));

			for (Item i : handler.getWorld().getEntityManager().getPlayer().getInventory().getInventoryItems()) {
				if (i.getName() == "Money Bag") {
					ccount = 1;
					g.drawString(String.valueOf(i.getCount() + "/3"), (int)(1060-handler.getGameCamera().getxOffset()),(int)(75-handler.getGameCamera().getyOffset()));
				}

				if (i.getName() == "KeyItem") {
					ccount2 = 1;
					g.drawString(String.valueOf(Item.keyItem.getCount() + "/1"), (int)(1165-handler.getGameCamera().getxOffset()),(int)(75-handler.getGameCamera().getyOffset()));
				}

				else {
					continue;
				}
			}

			if(handler.getKeyManager().keyJustPressed(KeyEvent.VK_L)) {

				for (Item j : handler.getWorld().getEntityManager().getPlayer().getInventory().getInventoryItems()) {

					if (j.getName() == "Money Bag") {
						if (j.getCount() >= 3)
							ex = 1;

					}
					if (j.getName() == "KeyItem") {
						if (j.getCount() >= 1)
							way = 1;
					}
					if( ex == 1 && way == 1) {
						ccount = 0;
						ccount2 = 0;
						COUNTER = 1;
						Item.moneyBagItem.setCount(Item.moneyBagItem.getCount() - 3);
						Item.keyItem.setCount(Item.keyItem.getCount() - 1); //remember to remove item from inventory?
						break;

					}
				}
			}




			if(handler.getKeyManager().attbut) {
				g.drawString(String.valueOf((Item.moneyBagItem.getCount() - moneyCount) + "/3"), (int)(1060-handler.getGameCamera().getxOffset()),(int)(75-handler.getGameCamera().getyOffset()));


				g.drawString(String.valueOf((Item.keyItem.getCount() - keyCount) + "/1"), (int)(1165-handler.getGameCamera().getxOffset()),(int)(75-handler.getGameCamera().getyOffset()));

			}


			else if(ir.contains(pr) && EP){
				g.drawImage(Images.LP,(int)(780-handler.getGameCamera().getxOffset()),(int)(y-handler.getGameCamera().getyOffset()),30,30,null);
				g.drawImage(Images.tradeBox,(int)(920-handler.getGameCamera().getxOffset()),(int)(y-handler.getGameCamera().getyOffset()),300,100,null);


				if(handler.getKeyManager().attbut) {
					g.drawString(String.valueOf((Item.moneyBagItem.getCount() - moneyCount) + "/3"), (int)(1060-handler.getGameCamera().getxOffset()),(int)(75-handler.getGameCamera().getyOffset()));
					g.drawString(String.valueOf((Item.keyItem.getCount() - keyCount) + "/1"), (int)(1165-handler.getGameCamera().getxOffset()),(int)(75-handler.getGameCamera().getyOffset()));

				}
			}
		}
	}

	@Override
	public void die() {

	}
}

