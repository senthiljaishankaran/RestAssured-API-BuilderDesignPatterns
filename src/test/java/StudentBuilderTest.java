import POJO.BuilderClassWithAnnotation;
import POJO.Employee;
import POJO.Student;
import POJO.StudentBuilder;
import org.testng.annotations.Test;

/*
Builder Design Pattern
1. Used when a class should be immutable
2. Increases readability of the code
3. No need to input all the values that are initialized in the constructor

Methods of Making a Builder Pattern
1. Creating a Separate builder class
2. Creating a static inner class ie.. builder class inside a class
 */
public class StudentBuilderTest {
    // First method to implement builder pattern
    // Creating a separate builder class
    @Test
    public void buildTest(){
        Student student=StudentBuilder.builder().setId(2)
                .and()
                .setName("Senthil")
                .with()
                .build().
                perform();
        System.out.println(student);
    }
    // Second method to implement builder pattern
    // Creating a Static inner class
    @Test
    public void builderTest(){
        Employee employee= Employee.EmployeeBuilder.builder().setId(1).setName("Senthil").build();
        System.out.println(employee);
    }
    // Third Method using the Annotation of Builder
    @Test
    public void BuilderTestAnnotation(){
        BuilderClassWithAnnotation builderClassWithAnnotation= BuilderClassWithAnnotation.perform().setCarName("M3").setCarBrand("BMW").build();
        System.out.println(builderClassWithAnnotation);
    }
}
