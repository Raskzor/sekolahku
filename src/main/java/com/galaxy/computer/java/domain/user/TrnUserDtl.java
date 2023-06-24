package com.galaxy.computer.java.domain.user;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Computer Galaxy
 */
@Table(name = "TRN_USER_DTL")
@Entity
public class TrnUserDtl implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "user_dtl_id", sequenceName = "SEQ_TRN_USER_DTL")
    @Column(name = "user_dtl_id", nullable = false, length = 5)
    private Long user_dtl_id;
    @Column(name = "user_id", nullable = false, length = 5)
    private Long user_id;
    @Column(name = "address", nullable = false, length = 8000)
    private String address;
    @Column(name = "created_date", nullable = false)
    private Date createdDate;
    @Column(name = "created_by", nullable = false, length = 100)
    private String createdBy;
    @Column(name = "last_updated_date")
    private Date lastUpdateDate;
    @Column(name = "last_updated_by", length = 100)
    private String lastUpdatedBy;
}
