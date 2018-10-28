package Game.Tiles;

import java.awt.image.BufferedImage;

/**
 * Created by Elemental on 1/2/2017.
 */
public class LaserTile extends Tile {

    public LaserTile(BufferedImage texture, int id) {
            super(texture, id);
    }
    @Override
    public boolean isSolid(){
        return true;
    }
}
