package Worlds;
import Game.Entities.Creatures.Player;
import Game.Entities.Statics.Door;
import Main.Handler;

/**
 * Created by Elemental on 2/10/2017.
 */
public class CaveWorld extends BaseWorld{
    private Handler handler;
    private Player player;
    private BaseWorld world1;

    public CaveWorld(Handler handler, String path, Player player) {
        super(handler,path,player);
        this.handler = handler;
        this.player=player;
        world1 = new BaseWorld(handler,"res/Maps/map1.map",player);
        
        entityManager.addEntity(new Door(handler, 100, 0, world1));

    }


}