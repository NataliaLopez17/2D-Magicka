package Worlds;
import Game.Entities.Creatures.Player;
import Game.Entities.Creatures.UndyneEnemy;
import Game.Entities.Statics.CaveWorldDoor;
import Main.Handler;

/**
 * Created by Elemental on 2/10/2017.
 */
public class CaveWorld extends BaseWorld{
	
    public static BaseWorld theCoreWorld;

    public CaveWorld(Handler handler, String path, Player player) {
        super(handler,path,player);
        
        theCoreWorld = new TheCoreWorld(handler,"res/Maps/map1.map",player);
        
        entityManager.addEntity(new CaveWorldDoor(handler, 100, 0, theCoreWorld));
        entityManager.addEntity(new UndyneEnemy(handler, 1200, 400));
       

    }


}