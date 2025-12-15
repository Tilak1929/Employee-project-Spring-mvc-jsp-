
<%@page isELIgnored="false"%>

<html>

 <head>

  <title>Document</title>

  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">

 <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.min.js"></script>

 <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

 </head>

 <body>

 <div class="container">

  <div class="card">

  <div class="card-header bg-primary text-white text-center">

    <h3>WELCOME TO Employee REGISTER PAGE </h3>

   </div>

 <div class="card-body"> 

 <form action="save" method="POST">

<a href="${pageContext.request.contextPath}/book/search" class="btn btn-warning">Search</a>



  <pre>

  

  Name  : <input type="text" name="empName" class="form-control"/>
  salary: <input type="text" name="empSal" class="form-control"/>
  designation: <input type="text" name="designation" class="form-control"/>
  company_name: <input type="text" name="companyName" class="form-control"/>

   <button type="submit" class="btn btn-success">save</button>

   </pre>

 </form>

 </div>

 <div class="card-footer bg-info text-white">

    <h3> ${message} </h3> 

   </div>

 

</div>

</div>

 </body>

</html>
