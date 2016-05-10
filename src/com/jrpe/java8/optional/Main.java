package com.jrpe.java8.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        ArchiveHandler ah = new ArchiveHandler();
        ah.set(new Archive("A1"));
        ah.set(new Archive("A2"));
        ah.set(new Archive("A4"));

        Optional<Archive> archive = ah.get("A3");
        archive.ifPresent(a -> {
            System.out.format("Archive: " + a.getName());
        });
        archive = ah.get("A4");
        archive.ifPresent(a -> {
            System.out.format("Archive: " + a.getName());
        });

    }
}
