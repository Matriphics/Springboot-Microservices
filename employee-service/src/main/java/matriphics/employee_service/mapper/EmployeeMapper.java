package matriphics.employee_service.mapper;

import matriphics.employee_service.dto.Employeedto;
import matriphics.employee_service.entity.Employee;

public class EmployeeMapper {

    public static Employeedto maptoEmployeedto(Employee employee){

        return new Employeedto(employee.getId(), employee.getFirstName(),
                employee.getLastName(), employee.getEmail(), employee.getDepartmentCode(),
                employee.getOrganizationCode());

    }
    public static Employee maptoEmployee(Employeedto employeedto){
        return new Employee(employeedto.getId(), employeedto.getFirstName()
                , employeedto.getLastName(), employeedto.getEmail(), employeedto.getDepartmentCode(),employeedto.getOrganizationCode());
    }
}
