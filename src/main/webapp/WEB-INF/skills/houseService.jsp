<%@ page language="java" contentType="text/html;charset=GBK" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=GBK">
<title>IT</title>
</head>
<body>

<s:form action="houseServiceAction">
<s:submit value="��һ��" method="switchSkill"/>
<s:checkboxlist name="houseServiceName" label="��ѡ�����Ƴ��ķ�����Դ��֪ʶ" 
	labelposition="top"
	list="houseServiceList"
	value="selectedHouseServiceValues"
/>
	<s:submit value="��һ��" method="prePage"/><s:submit value="�ύ"/>
</s:form>
</body>
</html>