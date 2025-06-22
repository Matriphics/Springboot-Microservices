package matriphics.department_service.service.impl;

import lombok.AllArgsConstructor;
import matriphics.department_service.dto.DepartmentDto;
import matriphics.department_service.entity.Department;
import matriphics.department_service.mapper.DepartmentMapper;
import matriphics.department_service.repository.DepartmentRepository;
import matriphics.department_service.service.DepartmentService;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class DepartmentServiceimpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        Department department = DepartmentMapper.mapToDepartment(departmentDto);

        Department savedDepartment = departmentRepository.save(department);

        DepartmentDto savedDepartmentDto = DepartmentMapper.mapToDepartmentDto(savedDepartment);

        return savedDepartmentDto;
    }


    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {
        Department department=departmentRepository.findDepartmentByDepartmentCode(departmentCode);
        return DepartmentMapper.mapToDepartmentDto(department);
    }

}
