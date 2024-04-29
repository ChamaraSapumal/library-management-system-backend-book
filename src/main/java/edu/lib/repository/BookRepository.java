package edu.lib.repository;

import edu.lib.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookEntity,Long> {
}
