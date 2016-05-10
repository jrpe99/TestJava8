package com.jrpe.java8.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class ArchiveHandler {

    private Map<String, Archive> archives = new HashMap<>();
    public Optional<Archive> get(String name) {
        return Optional.ofNullable(archives.get(name));
    }

    public void set(Archive a) {
        this.archives.put(a.getName(), a);
    }
}
