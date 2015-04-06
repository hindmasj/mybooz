package com.github.hindmasj.mybooz;

import org.junit.*;
import static org.junit.Assert.*;

/** Tests for the {@ref BoozDose} class.
 * 
 * Copyright SJ Hindmarch 2015
 */
public class TestBoozDose{

    @Test
    public void tenMlOfPureAlcoholIsOneUnit(){
	BoozDose dose=BoozDose.dose(10.0f,100.0f);
	assertNotNull(dose);
	assertEquals(1.0f,dose.units(),0.01f);
    }

    @Test
    public void oneGramOfPureAlcoholContainsSevenCalories(){
	/* Density of ethanol is 0.789 g/cm3. */
	float quantity=1/0.789f;
	BoozDose dose=BoozDose.dose(quantity,100.0f);
	assertEquals(7.0f,dose.calories(),0.01f);
    }
}
