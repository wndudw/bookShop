package com.book.domain;

public class CategoryVO {

	/*create table book_category(
cateName varchar(20) not null,
cateCode varchar(30) not null,
cateCodeRef varchar(30) null, #상위카테고리가 무엇인지 가르키는 코드
primary key(cateCode),
foreign key(cateCodeRef) references book_category(cateCode)
);*/
	
	private String cateName;
	private String cateCode;
	private String cateCodeRef;
	private int level;
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getCateName() {
		return cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	public String getCateCode() {
		return cateCode;
	}
	public void setCateCode(String cateCode) {
		this.cateCode = cateCode;
	}
	public String getCateCodeRef() {
		return cateCodeRef;
	}
	public void setCateCodeRef(String cateCodeRef) {
		this.cateCodeRef = cateCodeRef;
	}
	
	
}
