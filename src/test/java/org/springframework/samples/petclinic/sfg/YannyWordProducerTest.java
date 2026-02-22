package org.springframework.samples.petclinic.sfg;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.config.BaseConfig;
import org.springframework.samples.petclinic.config.YannyConfig;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("base-test")
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