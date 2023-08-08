package POJO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
@JsonInclude(value =JsonInclude.Include.NON_NULL)
public class Student {
    private int id;
    private String name;
    private String mail;
}
