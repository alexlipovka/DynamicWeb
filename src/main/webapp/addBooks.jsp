<%@page import="ua.com.foxminded.dynamicweb.AddBooksDatabase"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add your books to bd</h1>
	<body>
    <form action="/my-handling-form-page" method="post">
      <ul>
       <label for="id">id:</label>
          <input type="integer" id="id" name="books.id">
       <label for="name">Book title:</label>
          <input type="text" id="name" name="user_name">
    
      <button type="submit">add book</button>
    
      </ul>
    </form>
  </body>

<p><a href="index.jsp">Go to List of Books</a></p>
</body>
</html>