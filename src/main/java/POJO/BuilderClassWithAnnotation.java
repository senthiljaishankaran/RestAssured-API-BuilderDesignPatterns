package POJO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@Builder(setterPrefix = "set",builderMethodName = "perform")
public class BuilderClassWithAnnotation {
    private int carId;
    private String carName;
    private String carBrand;
}
