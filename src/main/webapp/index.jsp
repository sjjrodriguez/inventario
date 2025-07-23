<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html"
      xmlns:p="http://primefaces.org/ui">
<h:head>
    <title>Inventario</title>
</h:head>
<h:body>
    <h1>Gestión de Productos</h1>

    <h:form>
        <p:inputText value="#{productoBean.nombre}" placeholder="Nombre del producto" />
        <p:inputText value="#{productoBean.precio}" placeholder="Precio" />
        <p:commandButton value="Guardar" action="#{productoBean.guardarProducto}" update="@form" />
    </h:form>
</h:body>
</html>
