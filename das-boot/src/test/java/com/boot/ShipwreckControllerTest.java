package com.boot;

//import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import com.boot.controller.ShipwreckController;
import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ShipwreckControllerTest 
{
    @InjectMocks
    private ShipwreckController sc;

    @Mock
    private ShipwreckRepository ShipwreckRepository;

    @Before
    public void init(){
        //mockito will check mock objs for dependencies here
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testShipwreckGet()
    {   Shipwreck sw=new Shipwreck();
        sw.setId(1l);
        //mock repository behavior
        when(ShipwreckRepository.findOne(1L)).thenReturn(sw);


        Shipwreck wreck =sc.get(1L);
        verify(ShipwreckRepository).findOne(1l);
       // assertEquals(1l, wreck.getId().longValue());
       //using hamcrest for better assertions
       assertThat(wreck.getId(),is(1l));
        
    }
}
