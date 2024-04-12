package br.com.fiap.revisaocp22tdspg.resource;

import org.springframework.http.ResponseEntity;

import java.util.Collection;

public interface ResourceDTO <Request, Response>{

    ResponseEntity <Collection<Response>> findAll();

    ResponseEntity <Collection<Response>> findById(Long id);

    ResponseEntity <Collection<Response>> save(Request r);
}
