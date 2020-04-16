<%@ include file = "../common/headerr.jspf" %>
<%@ include file = "../common/navigation.jspf" %>

	<div class="container">
		<form action="/login.do" method="post">
		Enter Your Name <input type="text" name="name"> Password <input type="password" name="password">
		<input type=submit value=Login>
		</form>

	</div>

<%@ include file = "../common/footer.jspf" %>		



