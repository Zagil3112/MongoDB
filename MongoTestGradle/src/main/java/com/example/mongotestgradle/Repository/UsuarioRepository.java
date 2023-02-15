package com.example.mongotestgradle.Repository;

import com.example.mongotestgradle.Document.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, Serializable> {


}
