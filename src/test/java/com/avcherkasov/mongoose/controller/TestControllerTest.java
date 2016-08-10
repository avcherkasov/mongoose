package com.avcherkasov.mongoose.controller;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class TestControllerTest {

    @Mock
    TestController test;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetTest() throws Exception {
        String message = "test";
        when(test.test()).thenReturn(message);
        assertEquals(message, test.test());
    }

}
