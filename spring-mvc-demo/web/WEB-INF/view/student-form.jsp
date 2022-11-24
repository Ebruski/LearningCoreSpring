<%--
  Created by IntelliJ IDEA.
  User: Ebruphiho.Obigba
  Date: 19/11/2022
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<head>
    <title>Student Registration Form</title>
</head>
<body>

    <form:form action="processForm" modelAttribute="student">
        First name: <form:input path="firstName" />

        <br><br>

        Last name: <form:input path="lastName" />

        <br><br>
        
        <form:select path="country">
            <form:options items="${student.countryOptions}" />

<%--            <form:option value="France" label="France" />--%>
<%--            <form:option value="Germany" label="Germany" />--%>
<%--            <form:option value="India" label="India" />--%>
        </form:select>
        
        <br><br>

        Favorite Language:

        Java <form:radiobutton path="favoriteLanguage" value="Java" />
        C# <form:radiobutton path="favoriteLanguage" value="C#" />
        PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
        Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />

        <br><br>

        Operating Systems:

        Linux <form:checkbox path="operatingSystems" value="Linux" />
        Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
        MS Windows <form:checkbox path="operatingSystems" value="MS Window" />

        <br><br>

        <input type="submit" value="Submit" />

    </form:form>

</body>
</html>
