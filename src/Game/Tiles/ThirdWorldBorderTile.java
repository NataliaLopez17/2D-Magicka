package Game.Tiles;

import java.awt.image.BufferedImage;

/**
 * Created by Elemental on 1/2/2017.
 */
public class ThirdWorldBorderTile extends Tile {

    public ThirdWorldBorderTile(BufferedImage texture, int id) {
            super(texture, id);
    }
    @Override
    public boolean isSolid(){
        return true;
    }
}
