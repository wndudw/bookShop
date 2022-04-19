package com.book.domain;

import java.util.Date;

public class BookKoVO {
/*create table book_ko (
koNum int not null, #상품번호
koName varchar(50) not null, #상품이름
cateCode varchar(50) not null, #카테고리
bookPrice int not null, 
bookcount int null, #수량
bookDes varchar(500) null, #설명
bookImg varchar(200) null, #이미지
bookDate timestamp default now(),
primary key(koNum)
);*/
	
	private int koNum;
	private String koName;
	private String cateCode;
	private int bookPrice;
	private int bookCount;
	private String bookDes;
	private String bookImg;
	private Date bookDate;
	
	
	public int getKoNum() {
		return koNum;
	}
	public void setKoNum(int koNum) {
		this.koNum = koNum;
	}
	public String getKoName() {
		return koName;
	}
	public void setKoName(String koName) {
		this.koName = koName;
	}
	public String getCateCode() {
		return cateCode;
	}
	public void setCateCode(String cateCode) {
		this.cateCode = cateCode;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public int getBookCount() {
		return bookCount;
	}
	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}
	public String getBookDes() {
		return bookDes;
	}
	public void setBookDes(String bookDes) {
		this.bookDes = bookDes;
	}
	public String getBookImg() {
		return bookImg;
	}
	public void setBookImg(String bookImg) {
		this.bookImg = bookImg;
	}
	public Date getBookDate() {
		return bookDate;
	}
	public void setBookDate(Date bookDate) {
		this.bookDate = bookDate;
	}
	
}
