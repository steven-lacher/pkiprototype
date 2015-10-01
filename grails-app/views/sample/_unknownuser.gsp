<h2>I don't know you yet... <B>${certfirst}</B></h2>

But your certificate tells me the following:<br>
<g:form name="newUser">
    <label>First Name: </label>
    <g:field type="text" name="firstName" readonly="readonly" value="${certfirst}"/><br>
    <label>Last Name: </label>
    <g:field type="text" name="lastName" readonly="readonly" value="${certlast}"/><br>
    <label>Email Address: </label>
    <g:field type="text" name="emailAddress" readonly="readonly" value="${certmail}"/><br>
    <br>
    <g:actionSubmit value="Save" action="createUser"/>
</g:form>

