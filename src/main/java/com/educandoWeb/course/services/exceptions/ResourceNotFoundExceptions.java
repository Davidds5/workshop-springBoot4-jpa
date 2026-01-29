package com.educandoWeb.course.services.exceptions;

public class ResourceNotFoundExceptions extends RuntimeException{

    public ResourceNotFoundExceptions(Object id){
        super("Resource Not Found. ID " + id);
    }
}
