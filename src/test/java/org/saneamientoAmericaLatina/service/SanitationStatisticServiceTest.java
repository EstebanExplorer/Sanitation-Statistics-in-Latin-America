/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.saneamientoAmericaLatina.service;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author estebanh
 */
public class SanitationStatisticServiceTest {
    private static final Logger logger = LoggerFactory.getLogger( SanitationStatisticServiceTest.class);
    


    @Test
    public void testAverageWaterAccess() {
        logger.info( "test promedio accesoAgua");
        SanitationStatisticService instance = new SanitationStatisticServiceImpl();
        Double expResult = null;
        Double result = instance.averageWaterAccess();
        assertEquals(expResult, result);
     
    }

    @Test
    public void testCountryGreaterAccessWater() {
        logger.info( "test país con mayor acceso agua");
        SanitationStatisticService instance = new SanitationStatisticServiceImpl();
        String expResult = "";
        String result = instance.countryGreaterAccessWater();
        assertEquals(expResult, result);
 
    }

    @Test
    public void testMedianPopulation() {
        logger.info( "test población media");
        SanitationStatisticService instance = new SanitationStatisticServiceImpl();
        Double expResult = null;
        Double result = instance.medianPopulation();
        assertEquals(expResult, result);
       
    }

    @Test
    public void testAveragePopulationAffectedByDrought() {
        logger.info( "test Población promedio afectada por la sequia");
        
        SanitationStatisticService instance = new SanitationStatisticServiceImpl();
        Double expResult = null;
        Double result = instance.averagePopulationAffectedByDrought();
        assertEquals(expResult, result);
       
    }

    @Test
    public void testVarianceAffectedPopulationDroughts() {
        logger.info( "test varianza Poblacion afectada Sequias");
        Double averagePopulationAffectedByDrought = null;
        SanitationStatisticService instance = new SanitationStatisticServiceImpl();
        Double expResult = null;
        Double result = instance.varianceAffectedPopulationDroughts(averagePopulationAffectedByDrought);
        assertEquals(expResult, result);
    }

    @Test
    public void testSortData() {
        logger.info( "test mmetodo ordenar datos");
        System.out.println("sortData");
        ArrayList<Integer> list = null;
        SanitationStatisticService instance = new SanitationStatisticServiceImpl();
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = instance.sortData(list);
        assertEquals(expResult, result);
 
    }

    public class SanitationStatisticServiceImpl implements SanitationStatisticService {

        public Double averageWaterAccess() {
            return null;
        }

        public String countryGreaterAccessWater() {
            return "";
        }

        public Double medianPopulation() {
            return null;
        }

        public Double averagePopulationAffectedByDrought() {
            return null;
        }

        public Double varianceAffectedPopulationDroughts(Double averagePopulationAffectedByDrought) {
            return null;
        }

        public ArrayList<Integer> sortData(ArrayList<Integer> list) {
            return null;
        }
    }
    
}
