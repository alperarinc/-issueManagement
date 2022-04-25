package com.issuesManagement.entity;

import lombok.*;

import javax.persistence.*;

/**
 * Created arinc 08.04.2022.
 */


@Entity
@Table(name = "project")
@Data//Otomatik Getter Setter yapıyor. Data haline getiriyor
@EqualsAndHashCode
@NoArgsConstructor//Boş bir class olmasına gerek olmuyor. Burada yapılıyor
@AllArgsConstructor//field yapmamıza gerek kalmıyor.Burada yapılıyor
@ToString//Bu nesnenin ToStaring halini yaratıyor
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "project_code")
    private String projectCode;

    @Column(name = "project_name", length = 100)
    private String projectName;

    @JoinColumn(name = "manager_user_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private User manager;

}
