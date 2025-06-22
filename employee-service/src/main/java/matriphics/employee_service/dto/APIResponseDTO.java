package matriphics.employee_service.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class APIResponseDTO {
    private Employeedto employee;
    private DepartmentDto department;
    private Organizationdto organization;

}