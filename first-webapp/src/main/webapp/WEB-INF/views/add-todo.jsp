<%@ include file = "../common/headerr.jspf" %>
<%@ include file = "../common/navigation.jspf" %>

	<div class="container">
		

		<form action="/add-todo.do" method="post">
			<fieldset class="form-group">
				<label>Course Description</label>
				<input  name = "todo" type = "text" class="form-control"> <br>
			</fieldset >
		
			<fieldset class="form-group">
				<label>Course Category</label>
				<input  name = "category" type = "text" class="form-control"><br>
			</fieldset>
		
		<input  name = "add" type = "submit" class="btn btn-success" value = "Add">
		</form>
		
		
	</div>

<%@ include file = "../common/footer.jspf" %>	


