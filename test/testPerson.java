import org.junit.Test;
import junit.framework.Assert;

/**
 * Created by IntelliJ IDEA.
 * User: rahulkav
 * Date: 7/15/12
 * Time: 11:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class testPerson {
    @Test
    public void personEqualityDifferentPerson(){
    person manmohan=new person("Manmohan",1);
    person michel=new person("Michel",2);
    Assert.assertFalse(manmohan.equals(michel));
    }
    @Test
    public void personEqualitySamePerson(){
        person manmohan=new person("Manmohan",1);
        person manmohanSecond=new person("Manmohan",1);
        Assert.assertTrue(manmohan.equals(manmohanSecond));
    }
}
