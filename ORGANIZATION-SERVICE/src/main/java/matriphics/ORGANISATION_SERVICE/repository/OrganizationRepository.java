package matriphics.ORGANISATION_SERVICE.repository;

import  matriphics.ORGANISATION_SERVICE.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    Organization findByOrganizationCode(String organizationCode);
}