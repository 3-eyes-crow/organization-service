package cn.v2it.organizationservice.controller;

import cn.v2it.organizationservice.model.Organization;
import cn.v2it.organizationservice.services.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: xqq
 * @Date: 2019/4/12 15:45
 * @Description:
 */
@RestController
@RequestMapping(value = "v1/organizations")
public class OrganizationServiceController {

    @Autowired
    private OrganizationService service;

    @GetMapping(value = "/{organizationId}")
    public Organization getOrganization(@PathVariable("organizationId") String organizationId) {
        return service.getOrg(organizationId);
    }

    @PutMapping(value = "/{organizationId}")
    public void updateOrganization(@PathVariable("organizationId") String orgId, @RequestBody Organization org) {
        service.updateOrg(org);
    }

    @PostMapping(value = "/{organizationId}")
    public void saveOrganization(@RequestBody Organization org) {
        service.saveOrg(org);
    }

    @DeleteMapping(value = "/{organizationId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOrganization(@RequestBody Organization org){
        service.deleteOrg(org);
    }
}
