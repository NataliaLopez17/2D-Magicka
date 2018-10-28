package Game.Tiles;

import Resources.Images;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Elemental on 1/1/2017.
 */

public class Tile {

    //statics

    public static Tile[] tiles = new Tile[256];
    public static Tile grassTile = new GrassTile(1);
    public static Tile graarockTile = new RockTile(Images.blocks[3],3);
    public static Tile dirtrockTile = new RockTile(Images.blocks[12],12);
    public static Tile dirtTile = new DirtTile(2);
    public static Tile upperleftTile = new BorderTile(Images.blocks[4],4);
    public static Tile upperrightTile = new BorderTile(Images.blocks[5],5);
    public static Tile lowerleftTile = new BorderTile(Images.blocks[6],6);
    public static Tile lowerrightTile = new BorderTile(Images.blocks[7],7);
    public static Tile leftwallTile = new BorderTile(Images.blocks[8],8);
    public static Tile rightwallTile = new BorderTile(Images.blocks[9],9);
    public static Tile topwallTile = new BorderTile(Images.blocks[10],10);
    public static Tile lowerwallTile = new BorderTile(Images.blocks[11],11);
    
//    public static Tile doorTile = new BorderTile(Images.newWorld[0],0); // not used
    public static Tile otherDoorTile = new WalkableDoorTile(1); //used
    public static Tile upperRailingTile = new UpperRailingTile(Images.newWorld[2],2);
//    public static Tile lowerRailingTile = new BorderTile(Images.newWorld[3],3);// not used
    public static Tile bridgeTile = new BridgeTile(4);
//    public static Tile firstStiltsTile = new BorderTile(Images.newWorld[5],5); //not used
    public static Tile secondStiltsTile = new SecondStiltsTile(Images.newWorld[6],6);
//    public static Tile poleTile = new BorderTile(Images.newWorld[7],7);//not used
    public static Tile laserTile = new LaserTile(Images.newWorld[8],8);
    public static Tile bluePlataformTile = new BluePlataformTile(9);
    public static Tile blackPlataformTile = new ThirdWorldBorderTile(Images.newWorld[10],10);
    public static Tile wallTile = new WallTile(Images.newWorld[11],11);
    public static Tile rightCornerWallTile = new RightCornerWallTile(Images.newWorld[12],12);
    public static Tile leftCornerWallTile = new LeftCornerWallTile(Images.newWorld[13],13);
//    public static Tile moreFloorsTile = new BorderTile(Images.newWorld[14],14);//not used
    public static Tile lowerWallTile = new LowerWallTile(Images.newWorld[15],15);
    public static Tile wallPanelsTile = new WallPanelsTile(Images.newWorld[16],16);
    public static Tile moreWallPanelsTile = new MoreWallPanelsTile(Images.newWorld[17],17);
    public static Tile glassTile = new GlassTile(Images.newWorld[18],18);
    public static Tile horizontalGlassTile = new HorizontalGlassTile(Images.newWorld[19],19);
    public static Tile wallWithLasersTile = new WallWithLasersTile(Images.newWorld[20],20);
    public static Tile whiteBlockTile = new WhiteBlockTile(Images.newWorld[21],21);
    public static Tile upArrowTile = new UpArrowTile(22);
    public static Tile leftArrowTile = new LeftArrowTile(23);
    public static Tile blueBlockTile = new BlueBlockTile(24);
    public static Tile blackBlockWithBlueCenterTile = new BlackBlockWithBlueCenterTile(25);
    public static Tile redBlockTile = new RedBlockTile(26);
    public static Tile blackBlockWithRedCenterTile = new BlackBlockWithRedCenterTile(27);
    
    
    
    //CLASS
    
    protected BufferedImage texture;
    protected final int id;
    public static final int TILEWIDTH =64 ,TILEHEIGHT = 64;


    public Tile(BufferedImage texture, int id){

        this.texture=texture;
        this.id=id;

        tiles[id] = this;

    }

    public void tick(){

    }

    public void render(Graphics g, int x, int y){
        g.drawImage(texture,x,y,TILEWIDTH,TILEHEIGHT,null);


    }

    public boolean isSolid(){
        return false;
    }

    public int getId() {
        return id;
    }
}
