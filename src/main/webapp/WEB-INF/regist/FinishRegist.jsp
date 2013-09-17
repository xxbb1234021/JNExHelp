<%@ page language="java" contentType="text/html;charset=GBK" pageEncoding="GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=GBK">
<title>IT</title>
</head>
<body>

<form action="/JNExHelp/finishRegistAction.action">
手机号码：<input id="phoneNo" name="phoneNo" type="text"/><p/>
QQ：<input id="qq" name="qq" type="text"/><p/>
MSN:<input id="msn" name="msn" type="text"/><p/>
<input type="file" Name="imgfile" id="imgfile"/><p/>
<input type="submit" value="完成"/>
</form>
</body>
</html>