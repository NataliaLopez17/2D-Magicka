package Main;

import Inputs.KeyManager;
import Resources.GameCamera;
import Inputs.MouseManager;
import Worlds.World;

/**
 * Created by Elemental on 1/1/2017.
 */
public class Handler {

    private Game game;
    private World world;

    public Handler(Game game){
        this.game = game;
    }

    public GameCamera getGameCamera(){
        return game.getGameCamera();
    }

    public KeyManager getKeyManager(){
        return game.getKeyManager();
    }

    public MouseManager getMouseManager(){
        return game.getMouseManager();
    }

    public int getWidth(){
        return game.getWidth();
    }

    public int getHeight(){
        return game.getHeight();
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }


}