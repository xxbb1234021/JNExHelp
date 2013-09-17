<%@ page language="java" contentType="text/html;charset=GBK" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=GBK">
<title>IT</title>
</head>
<body>

<s:form action="homeRepairServiceAction">
<s:submit value="换一组" method="switchSkill"/>
<s:checkboxlist name="homeRepairServiceName" label="请选择您善长的生活技能或知识" 
	labelposition="top"
	list="homeRepairServiceList"
	value="selectedHomeRepairServiceValues"
/>
	<s:submit value="上一步" method="prePage"/><s:submit value="提交"/>
</s:form>
</body>
</html>