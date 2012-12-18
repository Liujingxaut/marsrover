/**
 * Created with IntelliJ IDEA.
 * User: apple
 * Date: 12-12-14
 * Time: 下午5:06
 * @author 刘静
 * To change this template use File | Settings | File Templates.
 */
public class PlateauMap {
    static final int lowerLeftX = 0;
    static final int lowerLeftY = 0;
    private int upperRightX;
    private int upperRightY;

    PlateauMap(int x, int y){
        this.upperRightX = x;
        this.upperRightY = y;
    }
    int getLowerLeftX(){
        return lowerLeftX;
    }

    int getLowerLeftY(){
        return lowerLeftY;
    }

    int getUpperRightX(){
        return upperRightX;
    }

    int getUpperRightY(){
        return upperRightY;
    }

    boolean inMap(int x,int y){
        if(x<lowerLeftX||x>upperRightX)
            return false;
        else if(y<lowerLeftY||y>upperRightY)
            return false;
        else
            return true;
    }

}
