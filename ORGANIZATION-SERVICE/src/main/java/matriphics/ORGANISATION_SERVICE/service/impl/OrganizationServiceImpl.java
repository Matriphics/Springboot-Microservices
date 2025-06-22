package matriphics.ORGANISATION_SERVICE.service.impl;

import lombok.AllArgsConstructor;
import matriphics.ORGANISATION_SERVICE.dto.Organizationdto;
import matriphics.ORGANISATION_SERVICE.entity.Organization;
import matriphics.ORGANISATION_SERVICE.mapper.OrganizationMapper;
import matriphics.ORGANISATION_SERVICE.repository.OrganizationRepository;
import matriphics.ORGANISATION_SERVICE.service.OrganizationService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {
    private OrganizationRepository organizationRepository;
    @Override
    public Organizationdto createOrganization(Organizationdto organizationdto) {
        Organization organization= OrganizationMapper.maptOrganization(organizationdto);
        Organization saved=organizationRepository.save(organization);

        return OrganizationMapper.mapTodto(saved);
    }

    @Override
    public Organizationdto getById(String organizationCode) {
        Organization organization=organizationRepository.findByOrganizationCode(organizationCode);
        return OrganizationMapper.mapTodto(organization);
    }
}
