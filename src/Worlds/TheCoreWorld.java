package Worlds;
import Game.Entities.Creatures.MettatonEx;
import Game.Entities.Creatures.Player;
import Game.Entities.Statics.Laptop;
import Game.Entities.Statics.NetherStar;
import Main.Handler;

/**
 * Created by Elemental on 2/10/2017.
 */
public class TheCoreWorld extends BaseWorld{
    private Handler handler;
    private Player player;
    public static int stopFollowingMeSans;
    

    public TheCoreWorld(Handler handler, String path, Player player) {
        super(handler,path,player);
        this.handler = handler;
        this.player=player;
        

        entityManager.addEntity(new MettatonEx(handler, 1200, 400));
        entityManager.addEntity(new NetherStar(handler, 750, 1200));
        entityManager.addEntity(new NetherStar(handler, 350, 1200));
        entityManager.addEntity(new NetherStar(handler, 450, 1200));
        entityManager.addEntity(new NetherStar(handler, 800, 1200));
        entityManager.addEntity(new NetherStar(handler, 700, 1200));
        entityManager.addEntity(new NetherStar(handler, 600, 1200));
        entityManager.addEntity(new NetherStar(handler, 500, 1200));
       
        
	
    }

}