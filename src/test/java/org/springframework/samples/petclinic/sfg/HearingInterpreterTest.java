package org.springframework.samples.petclinic.sfg;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.config.BaseConfig;
import org.springframework.samples.petclinic.config.YannyConfig;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("base-test")
@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = {BaseConfig.class, LaurelConfig.class})
@ContextConfiguration(classes = {BaseConfig.class, YannyConfig.class})
class HearingInterpreterTest {

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    void whatIHeard() {
        String word = hearingInterpreter.whatIHeard();

//        assertEquals("Laurel", word);
        assertEquals("Yanny", word);
    }
}