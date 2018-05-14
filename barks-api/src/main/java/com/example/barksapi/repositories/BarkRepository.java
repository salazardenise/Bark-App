package com.example.barksapi.repositories;

import com.example.barksapi.models.Bark;
import org.springframework.data.repository.CrudRepository;

public interface BarkRepository extends CrudRepository<Bark, Long> {
}
