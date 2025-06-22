package matriphics.employee_service.controller;

import lombok.AllArgsConstructor;
import matriphics.employee_service.dto.APIResponseDTO;
import matriphics.employee_service.dto.Employeedto;
import matriphics.employee_service.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    // Build Save Employee REST API
    @PostMapping
    public ResponseEntity<Employeedto> saveEmployee(@RequestBody Employeedto employeeDto){
        Employeedto savedEmployee = employeeService.saveEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }


    @GetMapping("/{id}")
    public ResponseEntity<APIResponseDTO> getEmployee(@PathVariable("id") Long employeeId){
        APIResponseDTO apiResponseDto = employeeService.getById(employeeId);
        return new ResponseEntity<>(apiResponseDto, HttpStatus.OK);
    }
}