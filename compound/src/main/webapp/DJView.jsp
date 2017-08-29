<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="beatModel" scope="request" class="djview.model.BeatModel" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DJ View</title>
</head>
<body>
<h1>DJ View</h1>
Beats per minutes = <jsp:getProperty property="beatModel" name="BPM" />
<br />
<hr>
<br />

<form method="post" action="DJView">
BPM: <input type=text name="bpm"
			value="<jsp:getProperty name='beatModel' property='BPM' />">
&nbsp;

<input type="submit" name="set" value="set"><br />
<input type="submit" name="decrease" value="<<">
<input type="submit" name="increase" value=">>"><br />
<input type="submit" name="on" value="on">
<input type="submit" name="off" value="off"><br />
</form>

</body>
</html>