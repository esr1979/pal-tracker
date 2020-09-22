package io.pivotal.pal.tracker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InMemoryTimeEntryRepository implements TimeEntryRepository {

    private HashMap<Long, TimeEntry> timeEntrys = new HashMap<>();
    private long currentId = 1L;

    @Override
    public TimeEntry create(TimeEntry timeEntry) {
        Long id = currentId++;

        TimeEntry newTimeEntry = new TimeEntry(
                id,
                timeEntry.getProjectId(),
                timeEntry.getUserId(),
                timeEntry.getDate(),
                timeEntry.getHours()
        );

        timeEntrys.put(id, newTimeEntry);
        return newTimeEntry;
    }

    @Override
    public TimeEntry find(long id) {
        return timeEntrys.get(id);
    }

    @Override
    public List<TimeEntry> list() {
        ArrayList listita = new ArrayList(this.timeEntrys.values());
        return listita;
    }

    @Override
    public TimeEntry update(long id, TimeEntry timeEntry) {

        if (timeEntrys.get(id) != null){

        TimeEntry updatedEntry = new TimeEntry(
                id,
                timeEntry.getProjectId(),
                timeEntry.getUserId(),
                timeEntry.getDate(),
                timeEntry.getHours()
        );

       timeEntrys.replace(id, updatedEntry);
       return updatedEntry;}
        else {
            return null;
        }
    }

    @Override
    public void delete(long id) {
        timeEntrys.remove(id);
    }
}
