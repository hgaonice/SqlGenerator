package com.zccs.sql_generator.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author gaoh
 * @version 1.0
 * @date 2019/7/11 14:15
 * 文件表
 */
@Data
@Entity
@Table(name = "papers")
public class PapersModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String objId;

    private String objType;

    private String fileName;

    private String fileType;

    private Integer fileSize;

    private String fileUrl;

    private String filePath;

    private String suffixName;

    private Date createDate;

    private String reserve1;

    private String reserve2;

    private String reserve3;


}