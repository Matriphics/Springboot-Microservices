package matriphics.ORGANISATION_SERVICE.service;

import matriphics.ORGANISATION_SERVICE.dto.Organizationdto;

public interface OrganizationService {
    Organizationdto createOrganization(Organizationdto organizationdto);
    Organizationdto getById(String organizationCode);
}
