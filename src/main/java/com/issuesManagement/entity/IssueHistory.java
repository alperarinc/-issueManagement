package com.issuesManagement.entity;

import lombok.*;
import javax.persistence.*;
import java.sql.Date;

/**
 * Created arinc 08.04.2022.
 */

@Entity
@Table(name = "issue_histroy")
@Data//Otomatik Getter Setter yapıyor. Data haline getiriyor
@EqualsAndHashCode
@NoArgsConstructor//Boş bir class olmasına gerek olmuyor. Burada yapılıyor
@AllArgsConstructor//field yapmamıza gerek kalmıyor.Burada yapılıyor
@ToString//Bu nesnenin ToStaring halini yaratıyor
public class IssueHistory extends BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "issue_id")
    private Issue issue;

    @Column(name = "description", length = 1000)
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date")
    private Date date;

    @Column(name = "issue_status")
    @Enumerated(EnumType.STRING)
    private IssueStatus issueStatus;

    @JoinColumn(name = "assignee_user_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private User assignee;


}
