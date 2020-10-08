package guru.springframework.repositories.reactive;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import guru.springframework.domain.Recipe;

/**
 * Created by tairovich_jr on Oct 08, 2020
 */
public interface RecipeReactiveRepository extends ReactiveMongoRepository<Recipe, String> {

}
