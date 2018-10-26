package Worlds;
import Game.Entities.Creatures.NewEnemy;
import Game.Entities.Creatures.Player;
import Game.Entities.Creatures.companion;
import Game.Entities.Statics.Door;
import Main.Handler;

/**
 * Created by Elemental on 2/10/2017.
 */
public class TheCoreWorld extends BaseWorld{
    private Handler handler;
    private Player player;
    public static BaseWorld CaveWorld;

    public TheCoreWorld(Handler handler, String path, Player player) {
        super(handler,path,player);
        this.handler = handler;
        this.player=player;
        CaveWorld = new BaseWorld(handler,"res/Maps/third World map.map",player);
        
        entityManager.addEntity(new Door(handler, 100, 0, CaveWorld));
        entityManager.addEntity(new NewEnemy(handler, 1200, 400));
        entityManager.addEntity(new companion(handler, 100, 30));

    }


}