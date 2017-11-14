import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ButtonHandler extends KeyAdapter {

    public ButtonHandler(){
        System.out.println(" Button handler initialised! ");
    }
    public void keyPressed(KeyEvent key){

            switch (key.getKeyCode()){
                case KeyEvent.VK_UP:
                    Instances.player.setUp(true);
                        break;
                case KeyEvent.VK_DOWN:
                    Instances.player.setDown(true);
                        break;
                case KeyEvent.VK_LEFT:
                    Instances.player.setLeft(true);
                        break;
                case KeyEvent.VK_RIGHT:
                    Instances.player.setRight(true);
                        break;
            }
    }
    public void keyReleased(KeyEvent key){

            switch (key.getKeyCode()){
                case KeyEvent.VK_UP:
                    Instances.player.setUp(false);
                    System.out.println(" Released Up! ");
                        break;
                case KeyEvent.VK_DOWN:
                    Instances.player.setDown(false);
                    System.out.println(" Released Down! ");
                        break;
                case KeyEvent.VK_LEFT:
                    Instances.player.setLeft(false);
                    System.out.println(" Released Left! ");
                        break;
                case KeyEvent.VK_RIGHT;
                    Instances.player.setRight(false);
                    System.out.println(" Released Right! ");
                        break;
            }

    }
    public void keyTyped(KeyEvent arg0){
    }


}
