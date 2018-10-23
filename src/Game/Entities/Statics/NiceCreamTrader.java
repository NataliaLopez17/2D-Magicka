package Game.Entities.Statics;

import Game.Entities.Creatures.Player;
import Main.Handler;
import Resources.Images;
import Game.Items.Item;
import java.awt.*;
/**
 * Created by Elemental on 2/2/2017.
 */

public class NiceCreamTrader extends StaticEntity {

	private Rectangle ir = new Rectangle();
	public Boolean EP = false;
	public int moneyCount = Item.moneyBagItem.getCount();
	public int keyCount = Item.keyItem.getCount();

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
		System.out.println(moneyCount);
		System.out.println(keyCount);





	}

	private void checkForPlayer(Graphics g, Player p) {
		Rectangle pr = p.getCollisionBounds(0,0);


		if(ir.contains(pr) && !EP){
			Font stringfont = new Font("SansSerif", Font.PLAIN, 20);
			g.setFont(stringfont);
			g.setColor(Color.WHITE);
			g.drawImage(Images.E,(int)(810-handler.getGameCamera().getxOffset()),(int)(y-handler.getGameCamera().getyOffset()),30,30,null);
			g.drawImage(Images.tradeBox,(int)(920-handler.getGameCamera().getxOffset()),(int)(y-handler.getGameCamera().getyOffset()),300,100,null);
			g.drawString(String.valueOf(Item.moneyBagItem.getCount() + "/3"), (int)(1060-handler.getGameCamera().getxOffset()),(int)(75-handler.getGameCamera().getyOffset()));
			g.drawString(String.valueOf(Item.keyItem.getCount() + "/1"), (int)(1165-handler.getGameCamera().getxOffset()),(int)(75-handler.getGameCamera().getyOffset()));

			if(handler.getKeyManager().attbut) {
				g.drawString(String.valueOf((Item.moneyBagItem.getCount() - moneyCount) + "/3"), (int)(1060-handler.getGameCamera().getxOffset()),(int)(75-handler.getGameCamera().getyOffset()));
				
				
				g.drawString(String.valueOf((Item.keyItem.getCount() - keyCount) + "/1"), (int)(1165-handler.getGameCamera().getxOffset()),(int)(75-handler.getGameCamera().getyOffset()));
				
			}


			else if(ir.contains(pr) && EP){
				g.drawImage(Images.EP,(int)(810-handler.getGameCamera().getxOffset()),(int)(y-handler.getGameCamera().getyOffset()),30,30,null);
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

