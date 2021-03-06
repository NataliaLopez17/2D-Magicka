package Game.GameStates;

import java.awt.Graphics;

import Main.Handler;
import Resources.Images;
import UI.ClickListlener;
import UI.UIImageButton;
import UI.UIManager;

/**
 * Created by Elemental on 12/10/2016.
 */
public class GameBeatenState extends State {

    private UIManager uiManager;

    public GameBeatenState(Handler handler) {
        super(handler);
        uiManager = new UIManager(handler);
        handler.getMouseManager().setUimanager(uiManager);


        uiManager.addObjects(new UIImageButton(75, 400, 128, 64, Images.butstart, new ClickListlener() {
            @Override
            public void onClick() {
                handler.getMouseManager().setUimanager(null);
                handler.getGame().reStart();
                State.setState(handler.getGame().menuState);
            }
        }));
    }

    @Override
    public void tick() {
        handler.getMouseManager().setUimanager(uiManager);
        uiManager.tick();

        // Temporarily just go directly to the GameState, skip the menu state!
        //handler.getMouseManager().setUimanager(null);
        //State.setState(handler.getGame().gameState);
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Images.gameBeat,0,0,800,600,null);
        uiManager.Render(g);

    }


}
