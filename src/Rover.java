/**
 * Created with IntelliJ IDEA.
 * User: apple
 * Date: 12-12-15
 * Time: 下午8:57
 * To change this template use File | Settings | File Templates.
 */
public class Rover {
    private final String N = "N";
    private final String S = "S";
    private final String W = "W";
    private final String E = "E";
    private int x;
    private int y;
    private String direction;
    private int terminalX;
    private int terminalY;
    private String terminalDirection;
    private boolean beyondState;

    Rover(int x,int y,String direction){
        this.x = x;
        this.y = y;
        this.direction = direction;
        beyondState = false;
    }

    boolean getState(){
        return beyondState;
    }

    int getX(){
        return x;
    }

    int getY(){
        return y;
    }

    String getDirection(){
        return direction;
    }

    void setTerminalX(int x){
        this.terminalX =x;
    }

    void setTerminalY(int y){
        this.terminalY = y;
    }

    void setTerminalDirection(String direction){
        this.terminalDirection = direction;
    }

    int getTerminalX(){
        return this.terminalX;
    }

    int getTerminalY(){
        return this.terminalY;

    }

    String getTerminalDirection(){
        return this.terminalDirection;
    }

    boolean move(String instruction,PlateauMap pMap){
        if(instruction==null||instruction.length()<=0){
            return false;
        }
        int currentX = getX();
        int currentY = getY();
        String currentDirection = getDirection();
        for (int i = 0; i < instruction.length(); i++){
            if(currentDirection == N){
                if(instruction.charAt(i) == 'L')
                    currentDirection = W;
                else if(instruction.charAt(i) == 'R')
                    currentDirection = E;
                else{
                    if(pMap.inMap(currentX,currentY+1))
                        currentY+=1;
                    else {
                        beyondState = true;
                        System.out.println("beyond north boundary");
                        break;
                    }
                  }
                }

            else if(currentDirection == S){
                if(instruction.charAt(i) == 'L')
                    currentDirection = E;
                else if(instruction.charAt(i) == 'R')
                    currentDirection = W;
                else {
                    if(pMap.inMap(currentX,currentY-1))
                        currentY-=1;
                    else {
                        beyondState = true;
                        System.out.println("beyond south boundary");
                        break;
                    }
                }
            }

            else if(currentDirection == W){
                if(instruction.charAt(i) == 'L')
                    currentDirection = S;
                else if(instruction.charAt(i) == 'R')
                    currentDirection = N;
                else{
                    if(pMap.inMap(currentX-1,currentY))
                        currentX-=1;
                    else {
                        beyondState = true;
                        System.out.println("beyond west boundary");
                        break;
                    }
                }
            }
            else{
                if(instruction.charAt(i) == 'L')
                    currentDirection = N;
                else if(instruction.charAt(i) == 'R')
                    currentDirection = S;
                else
                {
                    if(pMap.inMap(currentX+1,currentY))
                        currentX+=1;
                    else {
                        beyondState = true;
                        System.out.println("beyond east boundary");
                        break;
                    }
                }
            }


        }
             setTerminalStatus(currentX,currentY,currentDirection);
             return true;


    }

    void setTerminalStatus(int x,int y,String direction) {
        setTerminalX(x);
        setTerminalY(y);
        setTerminalDirection(direction);
    }
}

