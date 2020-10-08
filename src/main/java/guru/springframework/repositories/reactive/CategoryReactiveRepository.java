package guru.springframework.repositories.reactive;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import guru.springframework.domain.Category;
import reactor.core.publisher.Mono;

/**
 * Created by tairovich_jr on Oct 08, 2020
 */
public interface CategoryReactiveRepository extends ReactiveMongoRepository<Category, String> {

	 Mono<Category> findByDescription(String description);
}
