<%@ page language="java" contentType="text/html;charset=GBK" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=GBK">
<title>IT</title>
</head>
<body>

<s:form action="legalServiceAction">
<s:submit value="换一组" method="switchSkill"/>
<s:checkboxlist name="legalServiceName" label="请选择您善长的法律技能或知识" 
	labelposition="top"
	list="legalServiceList"
	value="selectedLegalServiceValues"
/>
	<s:submit value="上一步" method="prePage"/><s:submit value="提交"/>
</s:form>
</body>
</html>