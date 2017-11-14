import static java.lang.Thread.*;

public class Game implements Runnable {
    Draw drawing = new Draw();
    @Override

        public void run(){
            while(true){
                Instances.player.update();
                drawing.render();
                try {Thread.sleep(10);} catch (InterruptedException e) {e.printStackTrace();}
            }
    }
}
