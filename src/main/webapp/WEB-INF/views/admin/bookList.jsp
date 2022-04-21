<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!doctype html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<div id="nav">
	<%@ include file="adminHeader.jsp"%>
</div>
</head>
<body>
<div>
	<h1>제품등록</h1>
</div>

<form role="form" method="post" autocomplete="off">
 
 <label>1차 분류</label>
 <select class="category1">
  <option value="">전체</option>
 </select>
 
 <label>2차 분류</label>
 <select class="category2">
  <option value="">전체</option>
 </select>
 
</form>

<script>
// 컨트롤러에서 데이터 받기
var jsonData = JSON.parse('${category}');
console.log(jsonData);

var cate1Arr = new Array();
var cate1Obj = new Object();

// 1차 분류 셀렉트 박스에 삽입할 데이터 준비
for(var i = 0; i < jsonData.length; i++) {
 
 if(jsonData[i].level == "1") {
  cate1Obj = new Object();  //초기화
  cate1Obj.cateCode = jsonData[i].cateCode;
  cate1Obj.cateName = jsonData[i].cateName;
  cate1Arr.push(cate1Obj);
 }
}

// 1차 분류 셀렉트 박스에 데이터 삽입
var cate1Select = $("select.category1")

for(var i = 0; i < cate1Arr.length; i++) {
 cate1Select.append("<option value='" + cate1Arr[i].cateCode + "'>"
      + cate1Arr[i].cateName + "</option>"); 
}

//2차분류 처리
$(document).on("change","select.category1",function(){

	var cate2Arr = new Array();
	var cate2Obj = new Object();

	for(var i=0; i<jsonData.length; i++){
			if(jsonData[i].level == "2"){
				 cate2Obj = new Object();
				 cate2Obj.cateCode = jsonData[i].cateCode;
				 cate2Obj.cateName = jsonData[i].cateName;
				 cate2Obj.cateCodeRef = jsonData[i].cateCodeRef;

				 cate2Arr.push(cate2Obj);
				}
		}

	var cate2Select = $("select.category2")

	/*
	for(var i=0; i<cate2Select.length; i++){
		cate2Select.append("<option value='" + cate2Arr[i].cateCode + "'>" + cate2Arr[i].cateName + "</option>");
		}
	*/

	cate2Select.children().remove();

	$("option:selected", this).each(function(){

		var selectVal = $(this).val();
		cate2Select.append("<option value=''>전체</option>");

		for(var i=0; i<cate2Arr.length; i++){
			if(selectVal == cate2Arr[i].cateCodeRef){
				cate2Select.append("<option value='" + cate2Arr[i].cateCode + "'>" + cate2Arr[i].cateName + "</option>");
				}
			}

		});
});

</script>
</body>
</html>