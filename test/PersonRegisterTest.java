import org.junit.Assert;
import org.junit.Test;
public class PersonRegisterTest {
    PersonRegister register;
    @Test
     public void testAddPerson(){
       register=new PersonRegister();
        Person Raj=new Person("Raj",1);
        register.addPerson(Raj);
        Person raj=new Person("Raj",1);
        Assert.assertEquals(raj, register.getPersonObject(1));
    }
    @Test
    public void testPersonExists(){
        register=new PersonRegister();
        Person Raj=new Person("Raj",1);
        register.addPerson(Raj);
        Person raj=new Person("Raj",1);
        Assert.assertEquals(raj, register.getPersonObject(1));
    }
    @Test
    public void testPersonNotExists(){
        register=new PersonRegister();
        Person Raj=new Person("Rajesh",1);
        register.addPerson(Raj);
        Person raj=new Person("Raj",1);
        Assert.assertFalse(raj.equals(register.getPersonObject(1)));
    }
    @Test
    public void testAddBookForAPerson(){
        register=new PersonRegister();
        Person raj =new Person("Rajesh",1);
        register.addPerson(raj);
        Rack rack=new Rack();
        //code to be added
    }
}
