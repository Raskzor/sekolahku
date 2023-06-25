package com.galaxy.computer.java.domain.user;


import com.galaxy.computer.java.domain.vo.UserRegisterVO;
import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Computer Galaxy
 */
@Table(name = "MST_USER")
@Entity
@Getter
public class MstUser implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="user_id", sequenceName = "SEQ_MST_USER")
    @Column(name = "user_id", nullable = false, length = 5, unique = true)
    private Long userId;
    @Column(name = "username", nullable = false, length = 100, unique = true)
    private String username;
    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;
    @Column(name = "last_name", length = 100)
    private String lastName;
    @Column(name = "email", length = 255, unique = true)
    private String email;
    @Column(name = "no_phone", length = 15, unique = true)
    private String noPhone;
    @Column(name = "user_type", length = 2)
    private String userType;
    @Column(name = "password", nullable = false, length = 1000)
    private String password;
    @Column(name = "created_date", nullable = false)
    private Date createdDate;
    @Column(name = "created_by", nullable = false, length = 100)
    private String createdBy;
    @Column(name = "last_updated_date")
    private Date lastUpdateDate;
    @Column(name = "last_updated_by", length = 100)
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
