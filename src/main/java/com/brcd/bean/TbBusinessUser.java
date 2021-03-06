package com.brcd.bean;


import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Data
public class TbBusinessUser {
    private String businessUid;

    private String affiliationAgent;

    private String businessUserType;

    private String manageName;

    private String businessUsername;

    private String legalPeopleName;

    private String legalPeopleIdentityCard;

    private String contactPeople;

    private String contactPhone;

    private String contactMail;

    private String servicePhone;

    private String manageAddress;

    private Integer manageProvince;

    private Integer manageCity;

    private Integer manageDistrict;

    private String businessLicenseNo;

    private String registerAddress;

    private String identityCardFront;

    private String identityCardReverse;

    private String identityCardHand;

    private String bankCardFront;

    private String businessLicensePicture;

    private String doorPicture;

    private String registerLicensePicture;

    private String password;

    private Integer businessUserStatus;

    private Date startTime;

    private Date endTime;

    private String businessUserKey;

    private  TbAgent tbAgent;

    private  TbBusiness tbBusiness;

    private TbBankcardInfo tbBankcardInfo;


//    private String passWord;

    private volatile MultipartFile identityCardFrontImg;

    private volatile MultipartFile identityCardReverseImg;

    private volatile MultipartFile identityCardHandImg;

    private volatile MultipartFile bankCardFrontImg;

    private volatile MultipartFile businessLicensePictureImg;

    private volatile MultipartFile doorPictureImg;

    private volatile MultipartFile registerLicensePictureImg;



    private String password;




}