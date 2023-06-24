package com.galaxy.computer.java.domain;


import com.galaxy.computer.java.domain.vo.UserRegisterVO;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Computer Galaxy
 */
@Table(name = "MST_USER")
@Entity
public class MstUser implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="user_id", sequenceName = "SEQ_MST_USER")
    @Column(name = "user_id", nullable = false)
    private Long userId;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "no_phone")
    private String noPhone;
    @Column(name = "user_type")
    private String userType;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "created_date", nullable = false)
    private Date createdDate;
    @Column(name = "created_by", nullable = false)
    private String createdBy;
    @Column(name = "last_updated_date")
    private Date lastUpdateDate;
    @Column(name = "last_updated_by")
    private String lastUpdatedBy;


    public MstUser(){}
    public MstUser(UserRegisterVO userRegisterVO) {
        this.username = userRegisterVO.getUserName();
        this.firstName = userRegisterVO.getFirstName();
        this.lastName = userRegisterVO.getLastName();
        this.email = userRegisterVO.getEmail();
        this.noPhone = userRegisterVO.getNoPhone();
        this.password = userRegisterVO.getPassword();
        this.createdDate = new Date();
        this.createdBy = userRegisterVO.getUserLogin();
    }
}
