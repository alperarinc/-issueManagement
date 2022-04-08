package com.issuesManagement.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
//ORM serializable (diske yazmayı veya network üzerinde taşınmasını sağlıyor)
import java.util.Date;

/**
 * Created arinc 08.04.2022.
 */

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity implements Serializable {

    @Column(name="create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    @Column(name="created_by",length = 100)
    private String createdBy;

    @Column(name="update_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;

    @Column(name="update_by",length = 100)
    private String updateBy;

    @Column(name="status")
    private boolean status;


}
