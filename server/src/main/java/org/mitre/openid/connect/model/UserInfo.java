package org.mitre.openid.connect.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="userinfo")
@NamedQueries({
	@NamedQuery(name="UserInfo.getAll", query = "select u from UserInfo u")
})
public class UserInfo {
	
	private String userId;	
	private String name;	
	private String givenName;	
	private String familyName;	
	private String middleName;	
	private String nickname;	
	private String profile;
	private String picture;	
	private String website;
	private String email;
	private Boolean verified;
	private String gender;
	private String zoneinfo;
	private String locale;
	private String phoneNumber;
	private Address address;
	private String updatedTime;
	
	
	/**
	 * @return the userId
	 */
	@Id
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the name
	 */
	@Basic
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the givenName
	 */
	@Basic
	public String getGivenName() {
		return givenName;
	}
	/**
	 * @param givenName the givenName to set
	 */
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	/**
	 * @return the familyName
	 */
	@Basic
	public String getFamilyName() {
		return familyName;
	}
	/**
	 * @param familyName the familyName to set
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	/**
	 * @return the middleName
	 */
	@Basic
	public String getMiddleName() {
		return middleName;
	}
	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	/**
	 * @return the nickname
	 */
	@Basic
	public String getNickname() {
		return nickname;
	}
	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * @return the profile
	 */
	@Basic
	public String getProfile() {
		return profile;
	}
	/**
	 * @param profile the profile to set
	 */
	public void setProfile(String profile) {
		this.profile = profile;
	}
	/**
	 * @return the picture
	 */
	@Basic
	public String getPicture() {
		return picture;
	}
	/**
	 * @param picture the picture to set
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}
	/**
	 * @return the website
	 */
	@Basic
	public String getWebsite() {
		return website;
	}
	/**
	 * @param website the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}
	/**
	 * @return the email
	 */
	@Basic
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the verified
	 */
	@Basic
	public Boolean getVerified() {
		return verified;
	}
	/**
	 * @param verified the verified to set
	 */
	public void setVerified(Boolean verified) {
		this.verified = verified;
	}
	/**
	 * @return the gender
	 */
	@Basic
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the zoneinfo
	 */
	@Basic
	public String getZoneinfo() {
		return zoneinfo;
	}
	/**
	 * @param zoneinfo the zoneinfo to set
	 */
	public void setZoneinfo(String zoneinfo) {
		this.zoneinfo = zoneinfo;
	}
	/**
	 * @return the locale
	 */
	@Basic
	public String getLocale() {
		return locale;
	}
	/**
	 * @param locale the locale to set
	 */
	public void setLocale(String locale) {
		this.locale = locale;
	}
	/**
	 * @return the phoneNumber
	 */
	@Basic
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the address
	 */
	@OneToOne
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/**
	 * @return the updatedTime
	 */
	@Basic
	public String getUpdatedTime() {
		return updatedTime;
	}
	/**
	 * @param updatedTime the updatedTime to set
	 */
	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}
	
}
