package com.galaxy.computer.java.domain.user;

import com.galaxy.computer.java.domain.vo.ParameterVO;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Computer Galaxy
 */
@Table(name = "MST_STATUS_USER_TYPE")
@Entity
public class MstStatusUserType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "user_type_id", sequenceName = "SEQ_MST_STATUS_USER_TYPE")
    @Column(name = "user_type_id", nullable = false, length = 5, unique = true)
    private Long userTypeId;
    @Column(name = "user_type_desc", nullable = false, length = 1000, unique = true)
    private String userTypeDesc;
    @Column(name = "is_active", nullable = false, length = 1)
    private int isActive;
    @Column(name = "created_date", nullable = false)
    private Date createdDate;
    @Column(name = "created_by", nullable = false, length = 100)
    private String createdBy;
    @Column(name = "last_updated_date")
    private Date lastUpdateDate;
    @Column(name = "last_updated_by", length = 100)
    private String lastUpdatedBy;


    private MstStatusUserType(){}
    public MstStatusUserType(ParameterVO parameterVO) {
        this.userTypeDesc = parameterVO.getParamDesc();
        this.isActive = parameterVO.getIsActive();
        this.createdBy = parameterVO.getUserLogin();
        this.createdDate = new Date();
    }
}
