package POJO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Employee {
    private int id;
    private String name;
    private String department;
    public static class EmployeeBuilder{
        private int id;
        private String name;
        private String department;

        public EmployeeBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setDepartment(String department) {
            this.department = department;
            return this;
        }
        public static EmployeeBuilder builder(){
            return new EmployeeBuilder();
        }
        public Employee build(){
            return new Employee(this.id,this.name,this.department);
        }
    }
}
