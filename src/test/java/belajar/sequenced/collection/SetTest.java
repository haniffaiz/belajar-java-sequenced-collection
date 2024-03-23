package belajar.sequenced.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.SequencedSet;
import java.util.TreeSet;

public class SetTest {

    @Test
    void set() {

        SequencedSet<String> set = new TreeSet<>();
        set.add("Hanif");
        set.add("Faiz");
        set.add("Hidayat");

        Assertions.assertEquals("Faiz",set.getFirst());
        Assertions.assertEquals("Hidayat",set.getLast());

        SequencedSet<String> reversed = set.reversed();

        Assertions.assertEquals("Faiz",reversed.getLast());
        Assertions.assertEquals("Hidayat",reversed.getFirst());

        String value = set.removeFirst();
        Assertions.assertEquals("Faiz",value);

        value = set.removeFirst();
        Assertions.assertEquals("Hanif",value);

    }
}
