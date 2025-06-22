package matriphics.ORGANISATION_SERVICE.mapper;

import matriphics.ORGANISATION_SERVICE.dto.Organizationdto;
import matriphics.ORGANISATION_SERVICE.entity.Organization;

public class OrganizationMapper {
    public static Organizationdto mapTodto(Organization organization){
        return new Organizationdto(organization.getId(),
                organization.getOrganizationName(),
                organization.getOrganizationDescription(), organization.getOrganizationCode(), organization.getCreatedDate());
    }
    public static Organization maptOrganization(Organizationdto organizationdto){
        return new Organization(organizationdto.getId(), organizationdto.getOrganizationName(), organizationdto.getOrganizationDescription(), organizationdto.getOrganizationCode(), organizationdto.getCreatedDate());
    }
}
