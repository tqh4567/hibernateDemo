package tqh.domain;

import java.util.HashSet;
import java.util.Set;

public class Customer {
	
	/*
	 * CREATE TABLE `cst_customer` (
	  `cust_id` BIGINT(32) NOT NULL AUTO_INCREMENT COMMENT '瀹㈡埛缂栧彿(涓婚敭)',
	  `cust_name` VARCHAR(32) NOT NULL COMMENT '瀹㈡埛鍚嶇О(鍏徃鍚嶇О)',
	  `cust_source` VARCHAR(32) DEFAULT NULL COMMENT '瀹㈡埛淇℃伅鏉ユ簮',
	  `cust_industry` VARCHAR(32) DEFAULT NULL COMMENT '瀹㈡埛鎵�灞炶涓�',
	  `cust_level` VARCHAR(32) DEFAULT NULL COMMENT '瀹㈡埛绾у埆',
	  `cust_linkman` VARCHAR(64) DEFAULT NULL COMMENT '鑱旂郴浜�',
	  `cust_phone` VARCHAR(64) DEFAULT NULL COMMENT '鍥哄畾鐢佃瘽',
	  `cust_mobile` VARCHAR(16) DEFAULT NULL COMMENT '绉诲姩鐢佃瘽',
	  PRIMARY KEY (`cust_id`)
	) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
	 */
	private Long cust_id;
	
	private String cust_name;
	private String cust_source;
	private String cust_industry;
	private String cust_level;
	private String cust_linkman;
	private String cust_phone;
	private String cust_mobile;
	public Set<LinkMan> getLinkMans=new HashSet<LinkMan>();
	public Set<LinkMan> getGetLinkMans() {
		return getLinkMans;
	}
	public void setGetLinkMans(Set<LinkMan> getLinkMans) {
		this.getLinkMans = getLinkMans;
	}
	public Long getCust_id() {
		return cust_id;
	}
	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCust_source() {
		return cust_source;
	}
	public void setCust_source(String cust_source) {
		this.cust_source = cust_source;
	}
	public String getCust_industry() {
		return cust_industry;
	}
	public void setCust_industry(String cust_industry) {
		this.cust_industry = cust_industry;
	}
	public String getCust_level() {
		return cust_level;
	}
	public void setCust_level(String cust_level) {
		this.cust_level = cust_level;
	}
	public String getCust_linkman() {
		return cust_linkman;
	}
	public void setCust_linkman(String cust_linkman) {
		this.cust_linkman = cust_linkman;
	}
	public String getCust_phone() {
		return cust_phone;
	}
	public void setCust_phone(String cust_phone) {
		this.cust_phone = cust_phone;
	}
	public String getCust_mobile() {
		return cust_mobile;
	}
	public void setCust_mobile(String cust_mobile) {
		this.cust_mobile = cust_mobile;
	}
	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", cust_name=" + cust_name + "]";
	}
	
	
	

}
