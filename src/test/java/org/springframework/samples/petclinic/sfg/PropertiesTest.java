package org.springframework.samples.petclinic.sfg;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestPropertySource("classpath:yanny.properties")
//@SpringJUnitConfig(classes = {PropertiesTest.Config.class})
public class PropertiesTest {

//    @Configuration
//    static class Config {
//        @Bean
//        public WordProducer wordProducer() {
//            return new PropertiesWordProducer();
//        }
//
//        @Bean
//        HearingInterpreter hearingInterpreter(WordProducer wordProducer) {
//            return new HearingInterpreter(wordProducer);
//        }
//    }
//
//    @Autowired
//    HearingInterpreter hearingInterpreter;
//
//    @Test
//    void whatIHeard() {
//        String world = hearingInterpreter.whatIHeard();
//
//        assertEquals("YNN", world);
//    }
}
