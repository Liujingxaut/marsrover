/**
 * Created with IntelliJ IDEA.
 * User: apple
 * Date: 12-12-15
 * Time: 下午10:15
 * To change this template use File | Settings | File Templates.
 */
import junit.framework.TestSuite;
public class MarsRoverTest extends junit.framework.TestCase{
    public static TestSuite suite(){
        TestSuite suite = new TestSuite();
        suite.addTestSuite(PlateauMapTest.class);
        suite.addTestSuite(RoverTest.class);
        return suite;
    }




}
