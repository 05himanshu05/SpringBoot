package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.repository.JournalEntryRepository;
import net.engineeringdigest.journalApp.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    @Autowired
    JournalEntryService journalEntryService;
    @GetMapping
    public List<JournalEntry> getAll () {
        return journalEntryService.getAll();
    }

    @PostMapping
    public String createEntry (@RequestBody JournalEntry myEntry) {
        journalEntryService.saveEntry(myEntry);
        return "Data Entered Correctly";
    }

    @GetMapping("id/{myId}")
    public Object getJournalEntryById (@PathVariable Long myId) {
        return journalEntryService.getById(myId);
    }

    @GetMapping("/all")
    public List<JournalEntry> getJournalEntryById () {
        return journalEntryService.getAll();


    }

    @DeleteMapping("id/{myId}")
    public String removeJournalEntryById (@PathVariable Long myId) {
        journalEntryService.deleteEntry(Math.toIntExact(myId));
        return "Entry Deleted for ID = " +myId;
    }

    @PutMapping("id/{myId}")
    public String updateJournalEntryById (@PathVariable Long myId,@RequestBody JournalEntry myEntry) {
        journalEntryService.updateEntry(myId,myEntry);
        return "entry updated";
    }

}
