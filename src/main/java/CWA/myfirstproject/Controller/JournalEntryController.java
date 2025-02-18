package CWA.myfirstproject.Controller;

import CWA.myfirstproject.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    private Map<Long, JournalEntry> JouranlEntries = new HashMap<>();

    @GetMapping
    public List<JournalEntry> getall() {
        return new ArrayList<>(JouranlEntries.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myentry) {
        JouranlEntries.put(myentry.getId(), myentry);
        return true;
    }

    @GetMapping("/id/{myid}")
    public JournalEntry getJournalEntrybyid(@PathVariable long myid) {
        return JouranlEntries.get(myid);
    }

    @DeleteMapping("/id/{myid}")
    public JournalEntry deletebyid(@PathVariable Long myid) {
        return JouranlEntries.remove(myid);
    }

    @PutMapping("/id/{id}")
    public JournalEntry updatebyid(@PathVariable Long id, @RequestBody JournalEntry myentry) {
        return JouranlEntries.put(id, myentry);
    }
}
