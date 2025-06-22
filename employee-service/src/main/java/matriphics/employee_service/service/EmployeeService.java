package matriphics.employee_service.service;

import matriphics.employee_service.dto.APIResponseDTO;
import matriphics.employee_service.dto.Employeedto;

public interface EmployeeService {
    Employeedto saveEmployee(Employeedto employeeDto);
    APIResponseDTO getById(Long id);
}
