/**
 * Created with IntelliJ IDEA.
 * User: apple
 * Date: 12-12-15
 * Time: 下午8:40
 * To change this template use File | Settings | File Templates.
 */
public class RoverTest extends junit.framework.TestCase{
    private Rover rover1;
    private Rover rover2;
    private PlateauMap pMap;

    public void setUp(){
        rover1 = new Rover(1,2,"N");
        rover2 = new Rover(3,3,"E");
        pMap = new PlateauMap(5,5);
    }

    public void testCreate(){
        assertEquals(1,rover1.getX());
        assertEquals(2,rover1.getY());
        assertEquals("N",rover1.getDirection());
    }

    public void testRoverLand(){
        assertEquals(true,pMap.inMap(rover1.getX(),rover1.getY()));
        assertEquals(true,pMap.inMap(rover2.getX(),rover2.getY()));
    }

    public void testMove(){
        rover1.move("LMLMLMLMM",pMap);
        assertEquals(1,rover1.getTerminalX());
        assertEquals(3,rover1.getTerminalY());
        assertEquals("N",rover1.getTerminalDirection());

        rover2.move("MMRMMRMRRM",pMap);
        assertEquals(5,rover2.getTerminalX());
        assertEquals(1,rover2.getTerminalY());
        assertEquals("E",rover2.getTerminalDirection());
    }

}
