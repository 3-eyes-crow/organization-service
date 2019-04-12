package cn.v2it.organizationservice.repository;

import cn.v2it.organizationservice.model.Organization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: xqq
 * @Date: 2019/4/12 15:48
 * @Description:
 */
@Repository
public interface OrganizationRepository extends CrudRepository<Organization, String> {
}
