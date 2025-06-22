package matriphics.ORGANISATION_SERVICE.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import matriphics.ORGANISATION_SERVICE.dto.Organizationdto;
import matriphics.ORGANISATION_SERVICE.service.OrganizationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/organizations")
@AllArgsConstructor
public class OrganizationController {
    private OrganizationService organizationService;

    @PostMapping("/create")
    public ResponseEntity<Organizationdto> createOrganization(@RequestBody Organizationdto organizationdto){
        return new ResponseEntity<>(organizationService.createOrganization(organizationdto), HttpStatus.CREATED);
    }
    @GetMapping("/{organizationCode}")
    public ResponseEntity<Organizationdto> getById(@PathVariable("organizationCode")String organizationCode){
        return new ResponseEntity<>(organizationService.getById(organizationCode),HttpStatus.OK);
    }
}
