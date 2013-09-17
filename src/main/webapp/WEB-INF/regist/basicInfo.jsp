<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

	<script src="js/jquery.js" type="text/javascript" ></script>
	<script type="text/javascript">
	$(document).ready(function(){    
		var region = $("#region");
		var city = $("#city");
		var area = $("#area");
		var street = $("#street");
		var cityUrl = "/JNExHelp/city/selectCity.action";
		var regionUrl = "/JNExHelp/city/selectRegion.action";
		var areaUrl = "/JNExHelp/city/selectArea.action";
		var streetUrl = "/JNExHelp/city/selectStreet.action";
		
		$.post(regionUrl,{code:"region"},function(data){
			
			var dataObj=eval("("+data+")");     
		    $.each(dataObj,function(index,item){     
			    var tempOption = document.createElement("option");     
			    tempOption.value = item.cityId;     
			    tempOption.innerHTML  = item.cityName;     
			    region.append(tempOption);   
			});
		},"json");
	
		region.change(function(){     
			city.empty();     
			var params={regionCode:$('#region option:selected').val()};
			
			$.post(cityUrl,params,function(data){     
			  var dataObj=eval("("+data+")");   
			  
			  $.each(dataObj,function(index,item){     
			    var tempOption = document.createElement("option");     
			    tempOption.value = item.cityId;     
			    tempOption.innerHTML  = item.cityName;     
			    city.append(tempOption);     
			    }); 
			  
			  },"json");     
		}); 
		
		city.change(function(){     
			area.empty();     
			var params={cityCode:$('#city option:selected').val()};
			
			$.post(areaUrl,params,function(data){     
			  var dataObj=eval("("+data+")");   
			  
			  $.each(dataObj,function(index,item){     
			    var tempOption = document.createElement("option");     
			    tempOption.value = item.cityId;     
			    tempOption.innerHTML  = item.cityName;     
			    area.append(tempOption);     
			    }); 
			  
			  },"json");     
		}); 
		
		area.change(function(){     
			street.empty();     
			var params={areaCode:$('#area option:selected').val()};
			
			$.post(streetUrl,params,function(data){     
			  var dataObj=eval("("+data+")");   
			  
			  $.each(dataObj,function(index,item){     
			    var tempOption = document.createElement("option");     
			    tempOption.value = item.cityId;     
			    tempOption.innerHTML  = item.cityName;     
			    street.append(tempOption);     
			    }); 
			  
			  },"json");     
		}); 
	});
	
	</script>
</head>
<body>

	<form method="post" action="/JNExHelp/basicInfoAction.action">
	    <div>
	    <select id="region" name="region">
	    		<option value="">请选择行政区</option>
	    </select>    
		<select id="city" name="city">    
	               <option value="">请选择城市</option>    
	       	</select>    
	 	<select id="area" name="area">    
	            <option value="">请选择区域</option>    
	        </select> 
	   	<select id="street" name="street">    
	            <option value="">请选择位置</option>    
	        </select>       
	    </div>
	    <p/>
	    <div>
	    	邮箱: <input id="email" name="email" type="text"/>
	    </div>
	    <p/>
	    <div>
	    	用户名: <input id="userName" name="userName" type="text"/>
	    </div>
	    <p/>
	    <div>
	    	密码：<input id="passwd" name="passwd" type="password"/>
	    </div>
	    <p/>
	    <div>
	    	再次输入密码:<input id="confirmPasswd" name="confirmPasswd" type="password"/>
	    </div>
	    <p/>
	    <div>
	    	性别：<input id="male" name="gender" type="radio">男
	    	<input id="female" name="gender" type="radio">女
	    </div>
	    <p/>
	    <div>
			出生年月：<select id="year" name="year">
				<option value="1998">1998</option>
			</select>年
			<select id="month" name="month">
				<option value="01">01</option>
			</select>月
			<select id="day" name="day">
				<option value="01">01</option>
			</select>日	    
	    </div>
		<p>
		<div>
			职业:<input id="career" name="career" type="text"/>
		</div>
	    <input type="submit" value="submit"> 
    </form> 
  
</body>
</html>