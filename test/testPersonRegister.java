import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: rahulkav
 * Date: 7/15/12
 * Time: 10:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class testPersonRegister {
    PersonRegister register;
    @Test
     public void testAddPerson(){
       register=new PersonRegister();
        person Raj=new person("Raj",1);
        register.addPerson(Raj);
        person raj=new person("Raj",1);
        Assert.assertEquals(raj, register.getPersonObject(1));
    }
    @Test
    public void testPersonExists(){
        register=new PersonRegister();
        person Raj=new person("Raj",1);
        register.addPerson(Raj);
        person raj=new person("Raj",1);
        Assert.assertEquals(raj, register.getPersonObject(1));
    }
    @Test
    public void testPersonNotExists(){
        register=new PersonRegister();
        person Raj=new person("Rajesh",1);
        register.addPerson(Raj);
        person raj=new person("Raj",1);
        Assert.assertFalse(raj.equals(register.getPersonObject(1)));
    }
    @Test
    public void testAddBookForAPerson(){
        register=new PersonRegister();
        person Raj=new person("Rajesh",1);
        register.addPerson(Raj);
        Rack rack=new Rack();
        //code to be added
    }
}
