package net.engineeringdigest.journalApp.repository;


import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JournalEntryRepository extends JpaRepository<JournalEntry,Integer> {

}
