/**
 * Created with IntelliJ IDEA.
 * User: apple
 * Date: 12-12-14
 * Time: 下午7:16
 * To change this template use File | Settings | File Templates.
 */
public class PlateauMapTest extends junit.framework.TestCase{
    private PlateauMap pMap;

    public void setUp(){
        pMap = new PlateauMap(5,5);
    }

    public void testCreate(){
        assertEquals(0,pMap.getLowerLeftX());
        assertEquals(0,pMap.getLowerLeftY());
        assertEquals(5,pMap.getUpperRightX());
        assertEquals(5,pMap.getUpperRightY());

    }

    public void testCrossBorder(){
        assertEquals(false,pMap.inMap(6,6));
        assertEquals(true,pMap.inMap(2,3));

    }




}
