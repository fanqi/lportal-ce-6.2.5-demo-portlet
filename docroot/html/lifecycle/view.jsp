<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<portlet:defineObjects />

This is the
<b>Lifecycle</b>
portlet in View mode.
<br>

<portlet:renderURL var="viewURL" />
<a href="<%=viewURL%>">viewURL</a>
<br>
<portlet:actionURL var="actionURL" name="doAction"></portlet:actionURL>
<a href="<%=actionURL%>">actionURL</a>
<br>
<portlet:resourceURL var="resourceURL" />
<a href="<%=resourceURL%>">resourceURL</a>
<br>