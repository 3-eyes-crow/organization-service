package cn.v2it.organizationservice.services;

import cn.v2it.organizationservice.model.Organization;
import cn.v2it.organizationservice.repository.OrganizationRepository;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @Author: xqq
 * @Date: 2019/4/12 15:54
 * @Description:
 */
@Service
public class OrganizationService {

    @Autowired
    private OrganizationRepository repository;

    public Organization getOrg(String organizationId) {
        return repository.findById(organizationId).orElse(null);
    }

    public void saveOrg(Organization org) {
        org.setId(UUID.randomUUID().toString());
        repository.save(org);
    }

    public void updateOrg(Organization org) {
        repository.save(org);
    }
    public void deleteOrg(Organization org) {
        repository.delete(org);
    }
}
