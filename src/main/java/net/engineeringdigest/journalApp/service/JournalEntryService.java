package net.engineeringdigest.journalApp.service;


import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.enums.Titles;
import net.engineeringdigest.journalApp.repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public List<JournalEntry> getAll() {
        return journalEntryRepository.findAll();
    }

    public void saveEntry(JournalEntry journalEntry) {
        journalEntryRepository.save(journalEntry);
    }

    public Optional<JournalEntry> getById(Long id) {
        Optional<JournalEntry> byId = journalEntryRepository.findById(Math.toIntExact(id));
        return byId;

    }

    public void deleteEntry(Integer id) {
        journalEntryRepository.deleteById(id);
    }

    public void updateEntry(Long id,JournalEntry journalEntry) {
        Optional<JournalEntry> currentValues = journalEntryRepository.findById(Math.toIntExact(id));
        currentValues.get().setFirstName(journalEntry.getFirstName());
        currentValues.get().setLastName(journalEntry.getLastName());
        currentValues.get().setTitle(String.valueOf(journalEntry.getTitle()));
        journalEntryRepository.save(currentValues.get());
    }
}
