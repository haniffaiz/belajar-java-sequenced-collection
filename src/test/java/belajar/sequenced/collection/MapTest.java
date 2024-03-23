package belajar.sequenced.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.SequencedMap;
import java.util.TreeMap;

public class MapTest {

    @Test
    void map() {
        //diurutkan
        SequencedMap<String, String> map = new TreeMap<>();
        map.put("c", "Hanif");
        map.put("b", "Faiz");
        map.put("a", "Hidayat");


        Assertions.assertEquals("Hidayat",map.firstEntry().getValue());
        Assertions.assertEquals("Hanif",map.lastEntry().getValue());

        SequencedMap<String, String> reversed = map.reversed();
        Assertions.assertEquals("Hidayat",reversed.lastEntry().getValue());
        Assertions.assertEquals("Hanif",reversed.firstEntry().getValue());

    }

    @Test
    void linkedMap() {
        //tidak urut
        SequencedMap<String, String> map = new LinkedHashMap<>();
        map.putFirst("a", "Hanif");
        map.putFirst("b", "Faiz");
        map.putFirst("c", "Hidayat");

        Assertions.assertEquals("Hidayat", map.firstEntry().getValue());
        Assertions.assertEquals("Hanif", map.lastEntry().getValue());
    }
}
