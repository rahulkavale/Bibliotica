import org.junit.Assert;
import org.junit.Test;
public class PersonRegisterTest {
    PersonRegister register;
    @Test
     public void testAddPerson(){
       register=new PersonRegister();
        Person Raj=new Person("Raj","111-1111","Raj");
        register.addPerson(Raj);
        Person raj=new Person("Raj","111-1111","Raj");
        Assert.assertEquals(raj, register.getPersonObject("111-1111"));
    }
    @Test
    public void testPersonExists(){
        register=new PersonRegister();
        Person Raj=new Person("Raj","111-1111","Raj");
        register.addPerson(Raj);
        Person raj=new Person("Raj","111-1111","Raj");
        Assert.assertEquals(raj, register.getPersonObject("111-1111"));
    }
    @Test
    public void testPersonNotExists(){
        register=new PersonRegister();
        Person Raj=new Person("Rajesh","111-1111","Rajesh");
        register.addPerson(Raj);
        Person raj=new Person("Raj","111-1111","Raj");
        Assert.assertFalse(raj.equals(register.getPersonObject("111-1111")));
    }
    @Test
    public void testAddBookForAPerson(){
        register=new PersonRegister();
        Person raj =new Person("Rajesh","111-1111","Rajesh");
        register.addPerson(raj);
        Rack rack=new Rack();
        //code to be added
    }
}
