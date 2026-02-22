package org.springframework.samples.petclinic.web;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.samples.petclinic.model.Vet;
import org.springframework.samples.petclinic.model.Vets;
import org.springframework.samples.petclinic.service.ClinicService;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
class VetControllerTest {

    @InjectMocks
    VetController vetController;

    @Mock
    ClinicService clinicService;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(vetController).build();
    }

    @Test
    void testControllerShowVetList() throws Exception {
        mockMvc.perform(get("/vets.html"))
                .andExpect(status().isOk())
                .andExpect(view().name("vets/vetList"))
                .andExpect(model().attributeExists("vets"));
    }

    @Test
    void showVetList() {
        // Given
        Map<String, Object> model = new HashMap<>();
        given(clinicService.findVets()).willReturn(List.of(new Vet()));

        // When
        String view = vetController.showVetList(model);

        // Then
        then(clinicService).should().findVets();
        assertEquals("vets/vetList", view);
    }

    @Test
    void showResourcesVetList() {
        // Given
        Map<String, Object> model = new HashMap<>();
        given(clinicService.findVets()).willReturn(List.of(new Vet(), new Vet()));

        // When
        Vets vets = vetController.showResourcesVetList();

        // Then
        then(clinicService).should().findVets();
        assertThat(vets).isNotNull();
    }
}