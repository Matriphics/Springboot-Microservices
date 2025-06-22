package matriphics.employee_service.service;

import matriphics.employee_service.dto.Organizationdto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ORGANIZATION-SERVICE", url = "http://localhost:8083")
public interface APIClient2 {
    @GetMapping("/api/organizations/{organization-code}")
    Organizationdto getOrganization(@PathVariable("organization-code") String organizationCode);
}
