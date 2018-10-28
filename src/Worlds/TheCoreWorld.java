package Worlds;
import Game.Entities.Creatures.UndyneEnemy;
import Game.Entities.Creatures.MettatonEx;
import Game.Entities.Creatures.Player;
import Game.Entities.Creatures.SansCompanion;
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
        
        	

    }

}