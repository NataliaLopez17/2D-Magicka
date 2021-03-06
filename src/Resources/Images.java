package Resources;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * Created by Elemental on 12/19/2016.
 */
public class Images {

    private static final int width = 32, height = 32;
    private static final int Bwidth = 64, Bheight = 64;
    private static final int Rwidth = 56, Rheight = 93;
    private static final int Fwidth = 512, Fheight = 197;

    public static BufferedImage[] blocks;
    public static BufferedImage[] newWorld;
    public static BufferedImage[] theNewCore;
    
    public static BufferedImage[] player_right;
    public static BufferedImage[] player_left;
    public static BufferedImage[] player_front;
    public static BufferedImage[] player_back;
    public static BufferedImage[] mettaton_front;
    public static BufferedImage[] mettaton_back;
    public static BufferedImage[] mettaton_left;
    public static BufferedImage[] mettaton_right;
    public static BufferedImage[] SkelyEnemy_right;
    public static BufferedImage[] SkelyEnemy_left;
    public static BufferedImage[] SkelyEnemy_front;
    public static BufferedImage[] SkelyEnemy_back;
    public static BufferedImage[] NewEnemy_back;
    public static BufferedImage[] NewEnemy_front;
    public static BufferedImage[] NewEnemy_right;
    public static BufferedImage[] NewEnemy_left;
    public static BufferedImage[] companion_left;
    public static BufferedImage[] companion_right;
    public static BufferedImage[] companion_front;
    public static BufferedImage[] companion_back;
    
    public static BufferedImage[] butstart;
    public static BufferedImage[] particleSmoke;
    public static BufferedImage[] items;
    public static BufferedImage[] numbers;
    public static BufferedImage inventory;
    public static BufferedImage title;
    public static BufferedImage door;
    public static BufferedImage E;
    public static BufferedImage EP;
    public static BufferedImage L;
    public static BufferedImage LP;
    public static BufferedImage Pause;
    public static BufferedImage gameOver;
    public static BufferedImage[] Resume;
    public static BufferedImage[] BTitle;
    public static BufferedImage[] Runes;
    public static ImageIcon icon;
    public static BufferedImage[] FireBallLeft;
    public static BufferedImage[] FireBallRight;
    public static BufferedImage[] FireBallUp;
    public static BufferedImage[] FireBallDown;
    public static BufferedImage loading;
    public static BufferedImage spellGUI;
    public static BufferedImage moneyBag;
	public static BufferedImage healthpotion;
	public static BufferedImage laptopObject;
	public static BufferedImage keyItem;
	public static BufferedImage niceCreamTrader;
	public static BufferedImage tradeBox;
	public static BufferedImage companionItem;
	public static BufferedImage netherStar;
	public static BufferedImage gameBeat;

    public Images() {

        SpriteSheet newsheet = new SpriteSheet(Images.loadImage("/Sheets/SpriteSheet.png"));
        SpriteSheet numsheet = new SpriteSheet(Images.loadImage("/Sheets/numsheet.png"));
        SpriteSheet runesheet = new SpriteSheet(Images.loadImage("/Sheets/runes.png"));
        SpriteSheet FireBallsheet = new SpriteSheet(Images.loadImage("/Sheets/FireBall.png"));
        SpriteSheet FireBallRightsheet = new SpriteSheet(Images.loadImage("/Sheets/FireBallRight.png"));
        SpriteSheet FireBallUpsheet = new SpriteSheet(Images.loadImage("/Sheets/FireBallUp.png"));
        SpriteSheet FireBallDownsheet = new SpriteSheet(Images.loadImage("/Sheets/FireBallDown.png"));
        SpriteSheet NewEnemy = new SpriteSheet(Images.loadImage("/Sheets/Undyne.png"));
        SpriteSheet Sans = new SpriteSheet(Images.loadImage("/Sheets/companion.png"));
        SpriteSheet thirdWorld = new SpriteSheet(Images.loadImage("/Sheets/thirdWorld.png"));
        SpriteSheet moreThirdWorld = new SpriteSheet(Images.loadImage("/Sheets/thirdWorldmore.png"));
        SpriteSheet MettatonEx = new SpriteSheet(Images.loadImage("/Sheets/MettatonEx.png"));
        SpriteSheet newCore = new SpriteSheet(Images.loadImage("/Sheets/textures third world.png"));


        blocks = new BufferedImage[16];
        newWorld = new BufferedImage[29];
        theNewCore = new BufferedImage[35];

        player_left = new BufferedImage[4];
        player_right = new BufferedImage[4];
        player_front = new BufferedImage[4];
        player_back = new BufferedImage[4];
        
        mettaton_left = new BufferedImage[4];
        mettaton_right = new BufferedImage[4];
        mettaton_front = new BufferedImage[4];
        mettaton_back = new BufferedImage[4];
        
        SkelyEnemy_left = new BufferedImage[4];
        SkelyEnemy_right = new BufferedImage[4];
        SkelyEnemy_front = new BufferedImage[4];
        SkelyEnemy_back = new BufferedImage[4];
        
        NewEnemy_left = new BufferedImage[4];
        NewEnemy_right = new BufferedImage[4];
        NewEnemy_front = new BufferedImage[4];
        NewEnemy_back = new BufferedImage[4];
        
        companion_left = new BufferedImage[4];
        companion_right = new BufferedImage[4];
        companion_front = new BufferedImage[4];
        companion_back = new BufferedImage[4];

        butstart = new BufferedImage[3];
        particleSmoke = new BufferedImage[3];
        items = new BufferedImage[3];
        
        numbers = new BufferedImage[21];
        Resume = new BufferedImage[2];
        BTitle = new BufferedImage[2];
        Runes = new BufferedImage[36];

        FireBallLeft = new BufferedImage[6];
        FireBallRight = new BufferedImage[6];
        FireBallUp = new BufferedImage[6];
        FireBallDown = new BufferedImage[6];




        try {

            loading = ImageIO.read(getClass().getResourceAsStream("/Sheets/loading.png"));
            spellGUI = ImageIO.read(getClass().getResourceAsStream("/Sheets/SpellGUI.png"));
            moneyBag = ImageIO.read(getClass().getResourceAsStream("/Sheets/moneyBag.png"));
            healthpotion = ImageIO.read(getClass().getResourceAsStream("/Sheets/healthPotion.png"));
            laptopObject = ImageIO.read(getClass().getResourceAsStream("/Sheets/newObject.png")); 
            keyItem = ImageIO.read(getClass().getResourceAsStream("/Sheets/key.png"));
            niceCreamTrader = ImageIO.read(getClass().getResourceAsStream("/Sheets/niceCreamGuy.png"));
            tradeBox = ImageIO.read(getClass().getResourceAsStream("/Sheets/undertale_box.png"));
            companionItem = ImageIO.read(getClass().getResourceAsStream("/Sheets/companionItem.png"));
            netherStar = ImageIO.read(getClass().getResourceAsStream("/Sheets/nether_star.png"));
            
            inventory = ImageIO.read(getClass().getResourceAsStream("/Sheets/guit.png"));
            title = ImageIO.read(getClass().getResourceAsStream("/Sheets/start screen.png"));
            gameBeat = ImageIO.read(getClass().getResourceAsStream("/Sheets/game beat screen.png"));
            door = ImageIO.read(getClass().getResourceAsStream("/Sheets/Door.png"));
            E = ImageIO.read(getClass().getResourceAsStream("/Buttons/E.png"));
            EP = ImageIO.read(getClass().getResourceAsStream("/Buttons/EP.png"));
            L = ImageIO.read(getClass().getResourceAsStream("/Buttons/L.png"));
            LP = ImageIO.read(getClass().getResourceAsStream("/Buttons/LP.png"));
            Pause = ImageIO.read(getClass().getResourceAsStream("/Buttons/Pause.png"));
            Resume[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/Resume.png"));
            Resume[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/ResumeP.png"));
            BTitle[0] = ImageIO.read(getClass().getResourceAsStream("/Buttons/BTitle.png"));
            BTitle[1] = ImageIO.read(getClass().getResourceAsStream("/Buttons/BTitleP.png"));

            //icon
            icon = new ImageIcon(runesheet.crop(Rwidth*1,Rheight*0,Rwidth,Rheight));

            //fireball left
            FireBallLeft[0]= FireBallsheet.crop(Fwidth*0,Fheight*0,Fwidth,Fheight);
            FireBallLeft[1]= FireBallsheet.crop(Fwidth*1,Fheight*0,Fwidth,Fheight);
            FireBallLeft[2]= FireBallsheet.crop(Fwidth*2,Fheight*0,Fwidth,Fheight);
            FireBallLeft[3]= FireBallsheet.crop(Fwidth*0,Fheight*1,Fwidth,Fheight);
            FireBallLeft[4]= FireBallsheet.crop(Fwidth*1,Fheight*1,Fwidth,Fheight);
            FireBallLeft[5]= FireBallsheet.crop(Fwidth*2,Fheight*1,Fwidth,Fheight);

            //fireball right
            FireBallRight[0]= FireBallRightsheet.crop(Fwidth*0,Fheight*0,Fwidth,Fheight);
            FireBallRight[1]= FireBallRightsheet.crop(Fwidth*1,Fheight*0,Fwidth,Fheight);
            FireBallRight[2]= FireBallRightsheet.crop(Fwidth*2,Fheight*0,Fwidth,Fheight);
            FireBallRight[3]= FireBallRightsheet.crop(Fwidth*0,Fheight*1,Fwidth,Fheight);
            FireBallRight[4]= FireBallRightsheet.crop(Fwidth*1,Fheight*1,Fwidth,Fheight);
            FireBallRight[5]= FireBallRightsheet.crop(Fwidth*2,Fheight*1,Fwidth,Fheight);

            //fireball up
            FireBallUp[0]= FireBallUpsheet.crop(Fheight*1,Fwidth*0,Fheight,Fwidth);
            FireBallUp[1]= FireBallUpsheet.crop(Fheight*1,Fwidth*1,Fheight,Fwidth);
            FireBallUp[2]= FireBallUpsheet.crop(Fheight*1,Fwidth*2,Fheight,Fwidth);
            FireBallUp[3]= FireBallUpsheet.crop(Fheight*0,Fwidth*0,Fheight,Fwidth);
            FireBallUp[4]= FireBallUpsheet.crop(Fheight*0,Fwidth*1,Fheight,Fwidth);
            FireBallUp[5]= FireBallUpsheet.crop(Fheight*0,Fwidth*2,Fheight,Fwidth);

            //fireball down
            FireBallDown[0]= FireBallDownsheet.crop(Fheight*1,Fwidth*0,Fheight,Fwidth);
            FireBallDown[1]= FireBallDownsheet.crop(Fheight*1,Fwidth*1,Fheight,Fwidth);
            FireBallDown[2]= FireBallDownsheet.crop(Fheight*1,Fwidth*2,Fheight,Fwidth);
            FireBallDown[3]= FireBallDownsheet.crop(Fheight*0,Fwidth*0,Fheight,Fwidth);
            FireBallDown[4]= FireBallDownsheet.crop(Fheight*0,Fwidth*1,Fheight,Fwidth);
            FireBallDown[5]= FireBallDownsheet.crop(Fheight*0,Fwidth*2,Fheight,Fwidth);

            Runes[0]= runesheet.crop(Rwidth*0,Rheight*0,Rwidth,Rheight);//Runes
            Runes[1]= runesheet.crop(Rwidth*1,Rheight*0,Rwidth,Rheight);
            Runes[2]= runesheet.crop(Rwidth*2,Rheight*0,Rwidth,Rheight);
            Runes[3]= runesheet.crop(Rwidth*3,Rheight*0,Rwidth,Rheight);
            Runes[4]= runesheet.crop(Rwidth*4,Rheight*0,Rwidth,Rheight);
            Runes[5]= runesheet.crop(Rwidth*5,Rheight*0,Rwidth,Rheight);
            Runes[6]= runesheet.crop(Rwidth*6,Rheight*0,Rwidth,Rheight);
            Runes[7]= runesheet.crop(Rwidth*7,Rheight*0,Rwidth,Rheight);


            blocks[0] = ImageIO.read(getClass().getResourceAsStream("/Blocks/Slime.png"));

            butstart[0]= newsheet.crop(11,422,93,34);//normbut
            butstart[1]= newsheet.crop(11,456,93,33);//hoverbut
            butstart[2]= newsheet.crop(11,489,93,32);//clickbut

            particleSmoke[0]= newsheet.crop(111,397,18,38);
            particleSmoke[1]= newsheet.crop(129,399,20,35);
            particleSmoke[2]= newsheet.crop(154,400,20,35);
            
            items[0]= newsheet.crop(114,448,30,24);//log
           
            numbers[1]= numsheet.crop(17,15,17,22);
            numbers[2]= numsheet.crop(64,16,14,19);
            numbers[3]= numsheet.crop(110,16,14,19);
            numbers[4]= numsheet.crop(154,17,15,19);
            numbers[5]= numsheet.crop(19,61,13,20);
            numbers[6]= numsheet.crop(64,61,14,20);
            numbers[7]= numsheet.crop(110,62,14,19);
            numbers[8]= numsheet.crop(156,61,13,20);
            numbers[9]= numsheet.crop(19,107,13,20);
            numbers[10]= numsheet.crop(60,107,24,20);
            numbers[11]= numsheet.crop(107,107,20,19);
            numbers[12]= numsheet.crop(151,107,23,19);
            numbers[13]= numsheet.crop(14,152,23,20);
            numbers[14]= numsheet.crop(60,152,23,20);
            numbers[15]= numsheet.crop(105,153,24,20);
            numbers[16]= numsheet.crop(151,153,23,20);
            numbers[17]= numsheet.crop(14,198,24,20);
            numbers[18]= numsheet.crop(60,198,23,20);
            numbers[19]= numsheet.crop(106,198,23,21);
            numbers[20]= numsheet.crop(149,198,28,20);


            //block images,array index is equal to block id
            blocks[1] = newsheet.crop(0,324,Bwidth,Bheight);//grass
            blocks[2] = newsheet.crop(67,260,Bwidth,Bheight);//dirt
            blocks[3] = newsheet.crop(67,324,Bwidth,Bheight);//dirtrock
            blocks[4] = newsheet.crop(0,0,Bwidth,Bheight);//uppperleft
            blocks[5] = newsheet.crop(67,0,Bwidth,Bheight);//upperright
            blocks[6] = newsheet.crop(67,65,Bwidth,Bheight);//lowerleft
            blocks[7] = newsheet.crop(0,65,Bwidth,Bheight);//lowerright
            blocks[8] = newsheet.crop(0,195,Bwidth,Bheight);//leftwall
            blocks[9] = newsheet.crop(67,195,Bwidth,Bheight);//rightwall
            blocks[10] = newsheet.crop(0,130,Bwidth,Bheight);//topwall
            blocks[11] = newsheet.crop(67,130,Bwidth,Bheight);//lowerwall
            blocks[12] = newsheet.crop(0,260,Bwidth,Bheight);//mossyrock
            blocks[13] = newsheet.crop(176,0,Bwidth,Bheight*2);//tree
            blocks[14] = newsheet.crop(174,410,78,74);//rock
            blocks[15] = ImageIO.read(getClass().getResourceAsStream("/Sheets/pack.png"));
            
            
            //third World images
            newWorld[28] = thirdWorld.crop(60, 0, 35, 35);//blue plataform
            newWorld[21] = thirdWorld.crop(0, 0, 35, 35);//black plataform
            newWorld[19] = thirdWorld.crop(141, 221, 15, 15);//glass
            newWorld[20] = thirdWorld.crop(319, 20, 40, 40);//wall with laser
            newWorld[24] = moreThirdWorld.crop(321, 80, width, height);//blue block
            newWorld[25] = moreThirdWorld.crop(382, 100, width, height);//black block with blue center
            newWorld[26] = moreThirdWorld.crop(321, 160, width, height);//red block
            newWorld[27] = moreThirdWorld.crop(382, 180, width, height);//black block with red center
            
            theNewCore[29] = newCore.crop(224, 32, width, height);//yellow block
            theNewCore[30] = newCore.crop(289, 32, width, height);//green block
            theNewCore[31] = newCore.crop(65, 128, width, height);//white block
            theNewCore[32] = newCore.crop(0, 128, width, height);//light grey block
            theNewCore[33] = newCore.crop(33, 224, width, height);//black block
            theNewCore[34] = newCore.crop(64, 224, width, height);//charcoal grey block
            
            
            //player anim
            player_front[0]=newsheet.crop(132,131,width,height);
            player_front[1]=newsheet.crop(164,131,width,height);
            player_front[2]=newsheet.crop(196,131,width,height);
            player_front[3]=newsheet.crop(228,131,28,height);

            player_left[0]=newsheet.crop(132,163,width,height);
            player_left[1]=newsheet.crop(164,163,width,height);
            player_left[2]=newsheet.crop(196,163,width,height);
            player_left[3]=newsheet.crop(228,163,28,height);

            player_right[0]=newsheet.crop(132,195,width,height);
            player_right[1]=newsheet.crop(164,195,width,height);
            player_right[2]=newsheet.crop(196,195,width,height);
            player_right[3]=newsheet.crop(228,195,28,height);

            player_back[0]=newsheet.crop(132,227,width,height);
            player_back[1]=newsheet.crop(164,227,width,height);
            player_back[2]=newsheet.crop(196,227,width,height);
            player_back[3]=newsheet.crop(228,227,28,height);
            

            //Skely enemy anim
            SkelyEnemy_front[0]=newsheet.crop(132,131+130,width,height);
            SkelyEnemy_front[1]=newsheet.crop(164,131+130,width,height);
            SkelyEnemy_front[2]=newsheet.crop(196,131+130,width,height);
            SkelyEnemy_front[3]=newsheet.crop(228,131+130,28,height);

            SkelyEnemy_left[0]=newsheet.crop(132,163+130,width,height);
            SkelyEnemy_left[1]=newsheet.crop(164,163+130,width,height);
            SkelyEnemy_left[2]=newsheet.crop(196,163+130,width,height);
            SkelyEnemy_left[3]=newsheet.crop(228,163+130,28,height);

            SkelyEnemy_right[0]=newsheet.crop(132,195+130,width,height);
            SkelyEnemy_right[1]=newsheet.crop(164,195+130,width,height);
            SkelyEnemy_right[2]=newsheet.crop(196,195+130,width,height);
            SkelyEnemy_right[3]=newsheet.crop(228,195+130,28,height);

            SkelyEnemy_back[0]=newsheet.crop(132,227+130,width,height);
            SkelyEnemy_back[1]=newsheet.crop(164,227+130,width,height);
            SkelyEnemy_back[2]=newsheet.crop(196,227+130,width,height);
            SkelyEnemy_back[3]=newsheet.crop(228,227+130,28,height);
            
            //NewEnemy Animation
            NewEnemy_front[0]=NewEnemy.crop(0,1782,width + 4,height + 25);
            NewEnemy_front[1]=NewEnemy.crop(37,1782,width + 4,height + 25);
            NewEnemy_front[2]=NewEnemy.crop(74,1782,width + 4,height + 25);
            NewEnemy_front[3]=NewEnemy.crop(110,1782,28 + 4,height + 25);
            
            NewEnemy_left[0]=NewEnemy.crop(0,1860,width - 2,height + 25);
            NewEnemy_left[1]=NewEnemy.crop(32,1860,width - 2,height + 25);
            NewEnemy_left[2]=NewEnemy.crop(66,1860,width - 2,height + 25);
            NewEnemy_left[3]=NewEnemy.crop(95,1860,width - 2,height + 25);
            
            NewEnemy_right[0]=NewEnemy.crop(0,1932,width - 2,height + 25);
            NewEnemy_right[1]=NewEnemy.crop(32,1932,width - 2,height + 25);
            NewEnemy_right[2]=NewEnemy.crop(66,1932,width - 2,height + 25);
            NewEnemy_right[3]=NewEnemy.crop(95,1932,width - 2,height + 25);
            
            NewEnemy_back[0]=NewEnemy.crop(0,2005,width + 4,height + 25);
            NewEnemy_back[1]=NewEnemy.crop(37,2005,width + 4,height + 25);
            NewEnemy_back[2]=NewEnemy.crop(74,2005,width + 4,height + 25);
            NewEnemy_back[3]=NewEnemy.crop(110,2005,28 + 4,height + 25);
            
            //companion animation
            companion_front[0] = Sans.crop(0, 20, width-3, height);
            companion_front[1] = Sans.crop(31, 20, width-3, height);
            companion_front[2] = Sans.crop(60, 20, width-3, height);
            companion_front[3] = Sans.crop(86, 20, width-3, height);

            companion_left[0] = Sans.crop(0, 71, width-8, height);
            companion_left[1] = Sans.crop(25, 71, width-8, height);
            companion_left[2] = Sans.crop(47, 71, width-8, height);
            companion_left[3] = Sans.crop(70, 71, width-8, height);
            
            companion_right[0] = Sans.crop(0, 122, width-8, height);
            companion_right[1] = Sans.crop(25, 122, width-8, height);
            companion_right[2] = Sans.crop(47, 122, width-8, height);
            companion_right[3] = Sans.crop(70, 122, width-8, height);
            
            companion_back[0] = Sans.crop(0, 173, width-3, height);
            companion_back[1] = Sans.crop(31, 173, width-3, height);
            companion_back[2] = Sans.crop(60, 173, width-3, height);
            companion_back[3] = Sans.crop(86, 173, width-3, height );
            
            //final boss animation
            mettaton_front[0] = MettatonEx.crop(0, 184, width + 8, height+23);
            mettaton_front[1] = MettatonEx.crop(49, 184, width + 8, height+23);
            mettaton_front[2] = MettatonEx.crop(90, 184, width + 8, height+23);
            mettaton_front[3] = MettatonEx.crop(137, 184, width + 8, height+23);
            
            mettaton_back[0] = MettatonEx.crop(183, 184, width + 8, height+23);
            mettaton_back[1] = MettatonEx.crop(230, 184, width + 8, height+23);
            mettaton_back[2] = MettatonEx.crop(267, 184, width + 8, height+23);
            mettaton_back[3] = MettatonEx.crop(313, 184, width + 8, height+23);
            
            mettaton_right[0] = MettatonEx.crop(133, 122, width - 5, height+23);
            mettaton_right[1] = MettatonEx.crop(165, 122, width - 5, height+23);
            mettaton_right[2] = MettatonEx.crop(194, 122, width - 5, height+23);
            mettaton_right[3] = MettatonEx.crop(222, 122, width - 5, height+23);
            
            mettaton_left[0] = MettatonEx.crop(0, 122, width - 5, height+23);
            mettaton_left[1] = MettatonEx.crop(30, 122, width - 5, height+23);
            mettaton_left[2] = MettatonEx.crop(63, 122, width - 5, height+23);
            mettaton_left[3] = MettatonEx.crop(93, 122, width - 5, height+23);
            
           
        } 
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static BufferedImage loadImage(String path) {
        try {
            return ImageIO.read(Images.class.getResourceAsStream(path));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }



}