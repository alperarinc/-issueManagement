package com.issuesManagement.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created arinc 08.04.2022.
 */

@Entity
@Table(name="issue")
@Data//Otomatik Getter Setter yapıyor. Data haline getiriyor
@EqualsAndHashCode
@NoArgsConstructor//Boş bir class olmasına gerek olmuyor. Burada yapılıyor
@AllArgsConstructor//field yapmamıza gerek kalmıyor.Burada yapılıyor
@ToString//Bu nesnenin ToStaring halini yaratıyor
public class Issue extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "details",length = 4000)
    private String details;

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "ıssuestatus")
    @Enumerated(EnumType.STRING)
    private IssueStatus issueStatus;

    @Column(name = "assignee_user_id")
    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    private User assignee;
}
