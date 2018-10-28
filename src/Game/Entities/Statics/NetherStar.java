package Game.Entities.Statics;

import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import Game.Items.Item;
import Main.Handler;
import Resources.Images;

/**
 * Created by Elemental on 1/2/2017.
 */
public class NetherStar extends StaticEntity {

//	help please
    private File audioFile;
    private AudioInputStream audioStream;
    private AudioFormat format;
    private DataLine.Info info;
    private Clip audioClip;
    private Random randint;

    public NetherStar(Handler handler, float x, float y) {
        super(handler, x, y, 32, 32);

        bounds.x=0;
        bounds.y=0;
        bounds.width = 64;
        bounds.height = 64;
        health=2;

        try {
            audioFile = new File("res/music/OHjp_EESacg.wav");
            audioStream = AudioSystem.getAudioInputStream(audioFile);
            format = audioStream.getFormat();
            info = new DataLine.Info(Clip.class, format);
            audioClip = (Clip) AudioSystem.getLine(info);
            audioClip.open(audioStream);



        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void tick() {
        if(isBeinghurt()){
            audioClip.start();
            audioClip.loop(1);
        }
        if(!isBeinghurt() && !handler.getKeyManager().attbut){
            audioClip.stop();
        }
        if(!isActive()){
            audioClip.stop();

        }

    }

    @Override
    public void render(Graphics g) {
        renderLife(g);
        g.drawImage(Images.netherStar,(int)(x-handler.getGameCamera().getxOffset()),(int)(y-handler.getGameCamera().getyOffset()),width,height,null);

    }

    @Override
    public void die() {
    	if (handler.getWorld().getEntityManager().getPlayer().health2.isPickedUp() == true) {
    		handler.getWorld().getEntityManager().getPlayer().setHealth(75);
    	}
        randint=new Random();
        handler.getWorld().getItemManager().addItem(Item.healthpotion.createNew((int)x + bounds.x + (randint.nextInt(32) -32),(int)y + bounds.y +(randint.nextInt(32) -32),(randint.nextInt(3) +1)));
        

    }
}
