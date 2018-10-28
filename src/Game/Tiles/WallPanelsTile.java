package Game.Tiles;

import java.awt.image.BufferedImage;

/**
 * Created by Elemental on 1/1/2017.
 */
public class WallPanelsTile extends Tile {
    public WallPanelsTile(BufferedImage texture,int id) {
        super(texture, id);

    }

    @Override
    public boolean isSolid(){
        return true;
    }
}
