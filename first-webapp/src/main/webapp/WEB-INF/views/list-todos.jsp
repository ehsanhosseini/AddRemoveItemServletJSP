<%@ include file = "../common/headerr.jspf" %>
<%@ include file = "../common/navigation.jspf" %>

	
	<div class="container">
		<H1>Welcome ${Name}</H1> 
		
		
		<table class="table table-striped">
		<caption>Here are your list to do</caption>
			<thead>
				<th>Description</th>
				<th>Category</th>
				<th>Action</th>
			</thead>
			
			<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
				 	<td>${todo.name}</td>
					<td>${todo.category}</td>
					<td><a class="btn btn-danger" href="/delete-todo.do?todo=${todo.name}&category=${todo.category}">Delete</a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>


		<a class="btn btn-success" href="add-todo.do">Add New Courses</a>
	</div>

<%@ include file = "../common/footer.jspf" %>

