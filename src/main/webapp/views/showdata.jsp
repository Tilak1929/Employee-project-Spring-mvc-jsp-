<%@page isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<!DOCTYPE html>

<html>

<head>

<title>Employee Information</title>

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

        <h3>EMPLOYEE DETAILS PAGE</h3>

      </div>
    <div class="card">

   <form action="search">

     Book Id: <input type="text" name="id" class="form-control" style="width:25%" /><br/> 

     <input type="submit"

      value="search" class="btn btn-success"/>
  </div>
  <br>
 
    </form>
     <form action="all" method="get">
   <input type="submit"

      value="all" class="btn btn-success" style="width:25%"/>
      </form>
    <%String msg=(String)request.getAttribute("msg"); %>
    <% if(msg.equals("all")){%>

      <div class="card-body">

      <a href="${pageContext.request.contextPath}/employee/register" class="btn btn-warning">Register</a>

        <table class="table table-hover">

          <tr class="bg-info text-white">







            <th>ID</th>

            <th>Name</th>

            <th>Salary</th>

            <th>OPERATIONS</th>



          </tr>

          <tr>

            <c:forEach var="ob" items="${emp}">

                          <tr>

              <td>${ob.empId}</td>

              <td>${ob.empName}</td>

              <td>${ob.empSal}</td>

              <td>

              <%-- <a href="/employee/delete?empId=${ob.empId}" class="btn btn-danger">DELETE</a> |

              <a href="/employee/edit?empId=${ob.empId}" class="btn btn-warning">EDIT</a> --%>

               <a href="/employee/delete/${ob.empId}" 

               class="btn btn-danger">DELETE</a> |

              <a href="/employee/edit/${ob.empId}" 

              class="btn btn-warning">EDIT</a> 

            </td>

                        </tr>

            </c:forEach>

          </tr>





        </table>

      </div>
      <%}else{ %>
       <div class="card-body">

      <a href="${pageContext.request.contextPath}/employee/register" class="btn btn-warning">Register</a>

        <table class="table table-hover">

          <tr class="bg-info text-white">







            <th>ID</th>

            <th>Name</th>

            <th>Salary</th>

            <th>OPERATIONS</th>



          </tr>

          <tr>

          

                          <tr>

              <td>${emp.empId}</td>

              <td>${emp.empName}</td>

              <td>${emp.empSal}</td>

              <td>

              <%-- <a href="/employee/delete?empId=${ob.empId}" class="btn btn-danger">DELETE</a> |

              <a href="/employee/edit?empId=${ob.empId}" class="btn btn-warning">EDIT</a> --%>

               <a href="/employee/delete/${emp.empId}" 

               class="btn btn-danger">DELETE</a> |

              <a href="/employee/edit/${emp.empId}" 

              class="btn btn-warning">EDIT</a> 

            </td>

                        </tr>

       

          </tr>





        </table>

      </div>
      <%} %>

    </div>

  </div>

</body>

</html>