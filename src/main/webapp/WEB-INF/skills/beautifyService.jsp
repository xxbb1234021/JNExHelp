<%@ page language="java" contentType="text/html;charset=GBK" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=GBK">
<title>IT</title>
</head>
<body>

<s:form action="beautifyServiceAction">
<s:submit value="��һ��" method="switchSkill"/>
<s:checkboxlist name="beautifyServiceName" label="��ѡ�����Ƴ������ݼ��ܻ�֪ʶ" 
	labelposition="top"
	list="beautifyServiceList"
	value="selectedBeautifyServiceValues"
/>
	<s:submit value="�ύ"></s:submit>
</s:form>
</body>
</html>