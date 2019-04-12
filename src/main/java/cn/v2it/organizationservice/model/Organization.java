package cn.v2it.organizationservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author: xqq
 * @Date: 2019/4/12 15:46
 * @Description:
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Organization {
    @Id
    @Column(name = "organization_id", nullable = false)
    private String id;

    private String name;

    private String contactName;

    private String contactEmail;

    private String contactPhone;
}
