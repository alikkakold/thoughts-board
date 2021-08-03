package ru.alikka.posts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.alikka.posts.models.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {
}
