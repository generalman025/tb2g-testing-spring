package org.springframework.samples.petclinic.sfg;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig({BaseConfig.class, YannyConfig.class})
class YannyWordProducerTest {
    @Autowired
    private WordProducer wordProducer;

    @Test
    void getWord() {
        String word = wordProducer.getWord();

        assertEquals("Yanny", word);
    }
}