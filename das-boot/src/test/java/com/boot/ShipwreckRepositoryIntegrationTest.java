package com.boot;

import java.util.List;
import com.boot.model.*;
import com.boot.repository.ShipwreckRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class ShipwreckRepositoryIntegrationTest{

@Autowired
private ShipwreckRepository shipwreckRepository;


    @Test
    public void testFindAll(){
    List<Shipwreck> wrecks=shipwreckRepository.findAll();
    assertThat(wrecks.size(),is(greaterThanOrEqualTo(0)));
}

}