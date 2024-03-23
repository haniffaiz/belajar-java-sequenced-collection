package belajar.sequenced.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.SequencedCollection;

public class CollectionTest {

    @Test
    void collection() {

        SequencedCollection<String>  list = new ArrayList<>();
        list.addLast("Hidayat");
        list.addFirst("Faiz");
        list.addFirst("Hanif");

        Assertions.assertEquals(List.of("Hanif","Faiz","Hidayat"), list);

        Assertions.assertEquals("Hanif",list.getFirst());
        Assertions.assertEquals("Hidayat",list.getLast());

        SequencedCollection<String> reversed = list.reversed();
        Assertions.assertEquals(List.of("Hidayat","Faiz","Hanif"), reversed);

        String value = list.removeFirst();
        Assertions.assertEquals("Hanif",value);
        Assertions.assertEquals("Faiz",list.getFirst());

        value = list.removeLast();
        Assertions.assertEquals("Hidayat",value);
        Assertions.assertEquals("Faiz",list.getLast());

    }
}
