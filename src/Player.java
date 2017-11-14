public class Player {
    //variables which we will use
    private int x, y;
    private boolean left, right, up, down;

    public void update(){
        //In this function we will do the required checking and updates
    }
    //These 4 functions are able to set the direction
    public void setLeft(boolean newLeft){
        left = newLeft;
    }public void setUp (boolean newUp){
        up = newUp;
    }public void setDown (boolean newDown){
        down = newDown;
    }public void setRight ( boolean newRight){
        right = newRight;
    }
    //This function will return X as an int
    public int getX(){
        return x;
    }
    //And this function will return Y as an int
    public int getY(){
        return y;
    }

}
