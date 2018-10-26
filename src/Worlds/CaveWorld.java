package Worlds;
import Game.Entities.Creatures.NewEnemy;
import Game.Entities.Creatures.Player;
import Game.Entities.Statics.Door;
import Main.Handler;

/**
 * Created by Elemental on 2/10/2017.
 */
public class CaveWorld extends BaseWorld{
    private BaseWorld world1;
    private BaseWorld TheCoreWorld;

    public CaveWorld(Handler handler, String path, Player player) {
        super(handler,path,player);
        world1 = new BaseWorld(handler,"res/Maps/map1.map",player);
        TheCoreWorld = new BaseWorld(handler,"res/Maps/caveMap.map",player);
        
        entityManager.addEntity(new Door(handler, 100, 0, world1));
        entityManager.addEntity(new Door(handler, 100, 0, TheCoreWorld));
        entityManager.addEntity(new NewEnemy(handler, 1200, 400));

    }


}