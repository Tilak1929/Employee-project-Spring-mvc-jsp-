
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

 pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Insert title here</title>

<link rel="stylesheet"

 href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">

<script

 src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.min.js"></script>

<script

 src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

</head>

<body>

 <div class="container">

  <div class="card">

   <div class="card-header bg-primary text-white text-center">

    <h3>WELCOME TO BOOK DETAILS PAGE</h3>

   </div>



   <div class="card-body">

    <form action="book">

     Book Id: <input type="text" name="id" class="form-control" style="width:25%" /><br/> 

     <input type="submit"

      value="Search" class="btn btn-success"/>

    </form>

   </div>

   <hr />

   <div class="card-body">

    <label>Book Id : </label> ${book.bookId} <br /> 

    <label>Book Name : </label> ${book.bookName}<br />

    <label>Book Price: </label> ${book.bookPrice}<br />

     <label>Book Author:</label> ${book.bookAuthor}<br />

    <label>Book PageNumber:</label> ${book.pageNumber}<br />

   </div>

   <div class="card-footer bg-info text-white">

    <h3>${message}</h3>

   </div>

  </div>

 </div>

</body>

</html>