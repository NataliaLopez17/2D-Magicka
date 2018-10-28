package Game.Tiles;

import java.awt.image.BufferedImage;

/**
 * Created by Elemental on 1/2/2017.
 */
public class UpperRailingTile extends Tile {

    public UpperRailingTile(BufferedImage texture, int id) {
            super(texture, id);
    }
    @Override
    public boolean isSolid(){
        return true;
    }
}
