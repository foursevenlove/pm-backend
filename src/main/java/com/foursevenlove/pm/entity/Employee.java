package com.foursevenlove.pm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
@TableName("employee")
public class Employee extends Model<Employee> {
    @TableField("id")
    private Integer id;

    @TableField("name")
    private String name;

    @TableField("gender")
    private String gender;

    @TableField("birthday")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date birthday;

    @TableField("idCard")
    private String idCard;

    @TableField("wedlock")
    private String wedlock;

    @TableField("nationId")
    private Integer nationId;

    @TableField("nativePlace")
    private String nativePlace;

    @TableField("politicId")
    private Integer politicId;

    @TableField("email")
    private String email;

    @TableField("phone")
    private String phone;

    @TableField("address")
    private String address;

    @TableField("departmentId")
    private Integer departmentId;

    @TableField("jobLevelId")
    private Integer jobLevelId;

    @TableField("posId")
    private Integer posId;

    @TableField("engageForm")
    private String engageForm;

    @TableField("tiptopDegree")
    private String tiptopDegree;

    @TableField("specialty")
    private String specialty;

    @TableField("school")
    private String school;

    @TableField("beginDate")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date beginDate;

    @TableField("workState")
    private String workState;

    @TableField("workID")
    private String workID;

    @TableField("contractTerm")
    private Double contractTerm;

    @TableField("conversionTime")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date conversionTime;

    @TableField("notWorkDate")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date notWorkDate;

    @TableField("beginContract")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date beginContract;

    @TableField("endContract")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "Asia/Shanghai")
    private Date endContract;

    @TableField("workAge")
    private Integer workAge;

    @TableField("nation")
    private String nation;

    @TableField("politicsstatus")
    private String politicsstatus;

    @TableField("department")
    private String department;

    @TableField("jobLevel")
    private String jobLevel;

    @TableField("position")
    private String position;

    @TableField("salary")
    private String salary;

    @TableField("deleted")
    @TableLogic
    private Integer deleted;

}