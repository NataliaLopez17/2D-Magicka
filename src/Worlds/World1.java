package Worlds;

import Game.Entities.Creatures.Player;
import Game.Entities.Creatures.SkelyEnemy;
import Game.Entities.Statics.*;
import Main.Handler;
import Game.Entities.Statics.Laptop;

/**
 * Created by Elemental on 1/2/2017.
 */
public class World1 extends BaseWorld{

    private Handler handler;
    public static BaseWorld caveWorld;

    public World1(Handler handler, String path, Player player){
        super(handler,path,player);
        this.handler = handler;
        caveWorld = new CaveWorld(handler,"res/Maps/caveMap.map",player);

        entityManager.addEntity(new Tree(handler, 100, 250));
        entityManager.addEntity(new Rock(handler, 100, 450));
        entityManager.addEntity(new Tree(handler, 533, 276));
        entityManager.addEntity(new Rock(handler, 684, 1370));
        entityManager.addEntity(new Tree(handler, 765, 888));
        entityManager.addEntity(new Rock(handler, 88, 1345));
        entityManager.addEntity(new Tree(handler, 77, 700));
        entityManager.addEntity(new Rock(handler, 700, 83));
        entityManager.addEntity(new Door(handler, 100, 0,caveWorld));
        entityManager.addEntity(new SkelyEnemy(handler, 1250, 500));
        entityManager.addEntity(new Laptop(handler, 270, 270));
        entityManager.addEntity(new Laptop(handler, 900, 380));
        entityManager.addEntity(new Laptop(handler, 190, 560));
        entityManager.addEntity(new Laptop(handler, 888, 1000));
        entityManager.addEntity(new Laptop(handler, 500, 1200));
        entityManager.addEntity(new Laptop(handler, 1000, 150));
        entityManager.addEntity(new Laptop(handler, 1500, 1370));
        entityManager.addEntity(new Laptop(handler, 730, 600));

        entityManager.getPlayer().setX(spawnX);
        entityManager.getPlayer().setY(spawnY);
    }

}