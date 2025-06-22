package matriphics.employee_service.service.impl;

import lombok.AllArgsConstructor;
import matriphics.employee_service.dto.APIResponseDTO;
import matriphics.employee_service.dto.DepartmentDto;
import matriphics.employee_service.dto.Employeedto;
import matriphics.employee_service.dto.Organizationdto;
import matriphics.employee_service.entity.Employee;
import matriphics.employee_service.mapper.EmployeeMapper;
import matriphics.employee_service.repository.EmployeeRepository;
import matriphics.employee_service.service.APIClient;
import matriphics.employee_service.service.APIClient2;
import matriphics.employee_service.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
//import org.springframework.web.reactive.function.client.WebClient;

@Service
@AllArgsConstructor
public class EmployeeServiceimpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
//    private RestTemplate restTemplate;
//    private WebClient webClient;
    private APIClient apiClient;
    private APIClient2 apiClient2;

    @Override
    public Employeedto saveEmployee(Employeedto employeeDto) {
        Employee employee= EmployeeMapper.maptoEmployee(employeeDto);

        Employee saved=employeeRepository.save(employee);

        return EmployeeMapper.maptoEmployeedto(saved);
    }

    @Override
    public APIResponseDTO getById(Long id) {
        Employee employee=employeeRepository.findById(id).get();

//        ResponseEntity<DepartmentDto> responseEntity=restTemplate.getForEntity("http://localhost:8081/api/departments/"+employee.getDepartmentCode(), DepartmentDto.class);
//
//DepartmentDto departmentDto=responseEntity.getBody();

DepartmentDto departmentDto=apiClient.getDepartment(employee.getDepartmentCode());

        Organizationdto organization=apiClient2.getOrganization(employee.getOrganizationCode());




        Employeedto employeedto= EmployeeMapper.maptoEmployeedto(employee);

        APIResponseDTO apiResponseDTO=new APIResponseDTO();
        apiResponseDTO.setEmployee(employeedto);
        apiResponseDTO.setDepartment(departmentDto);
apiResponseDTO.setOrganization(organization);
        return apiResponseDTO;


    }
}
