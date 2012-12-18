/**
 * Created with IntelliJ IDEA.
 * User: apple
 * Date: 12-12-15
 * Time: 下午10:14
 * To change this template use File | Settings | File Templates.
 */
public class MarsRover {
    public static void main(String args[]) {
        System.out.println("5 5");
        System.out.println("1 2 N");
        System.out.println("LMLMLMLMM");
        System.out.println("3 3 E");
        System.out.println("MMRMMRMRRM");


        PlateauMap pMap = new PlateauMap(5,5);
        Rover rover1 =new Rover(1,2,"N");
        if(pMap.inMap(rover1.getX(),rover1.getY())){
            rover1.move("LMLMLMLMM",pMap);
            if(rover1.getState() == false)
            System.out.println(rover1.getTerminalX()+" "+ rover1.getTerminalY()+" " + rover1.getTerminalDirection());
        }
        else
            System.out.println("cannot land");

        Rover rover2 = new Rover(3,3,"E");
        if(pMap.inMap(rover2.getX(),rover2.getY())){
            rover2.move("MMRMMRMRRM",pMap);
            if(rover2.getState() == false)
            System.out.println(rover2.getTerminalX()+" "+ rover2.getTerminalY()+" " + rover2.getTerminalDirection());
        }
        else
            System.out.println("cannot land");


    }

}
