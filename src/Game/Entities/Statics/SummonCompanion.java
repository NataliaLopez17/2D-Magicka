package Game.Entities.Statics;

import Game.Entities.Creatures.companion;
import Game.Items.Item;
import Game.Tiles.Tile;
import Resources.Images;
import Worlds.BaseWorld;
import Main.Handler;

import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * Created by Elemental on 1/2/2017.
 */
public class SummonCompanion extends StaticEntity {

    private File audioFile;
    private AudioInputStream audioStream;
    private AudioFormat format;
    private DataLine.Info info;
    private Clip audioClip;
    public static int summon = 0;

    public SummonCompanion(Handler handler, float x, float y) {
        super(handler, x, y, 32, 32);

        bounds.x=0;
        bounds.y=0;
        bounds.width = 64;
        bounds.height = 64;
        health=2;

        try {
            audioFile = new File("res/music/Pickaxe.wav"); //change to the star wav
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
        g.drawImage(Images.summonCompanion,(int)(x-handler.getGameCamera().getxOffset()),(int)(y-handler.getGameCamera().getyOffset()),width,height,null);

    }

    @Override
    public void die() {
    	summon++;
    }
}
