package com.project.repository;

import com.project.model.Parent;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ParentRepository extends ReactiveMongoRepository<Parent, String> {

  Flux<Parent> findByFullName(String fullName);

  Mono<Parent> findBynumberDocument(String numberDocument);

}
