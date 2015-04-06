package com.github.hindmasj.mybooz;


/** Tests for the {@ref BoozDose} class.
 * 
 * Copyright SJ Hindmarch 2015
 */
public class BoozDose{
    public static final float ETHANOL_DENSITY=0.789f;
    public static final int MILLS_PER_UNIT=10;
    public static final int CALS_PER_GRAM=7;

    private final float quantity;
    private final float strength;

    /** Factory method to create a new dose given the quantity in millimetres
     * and the strength in percent by volume.
     */
    public static BoozDose dose(float quantity,float strength){
	return new BoozDose(quantity,strength);
    }

    private BoozDose(float quantity,float strength){
	this.quantity=quantity;
	this.strength=strength;
    }

    /** Return number of alcohol units in dose. One unit is 10ml of pure
     * alcohol. See https://en.wikipedia.org/wiki/Unit_of_alcohol
     */
    public float units(){
	float alcohol=quantity*strength/100f;
	return alcohol/MILLS_PER_UNIT;
    }

    /** Return number of calories in alcoholic does. Controversial
     * assumption is that 1g of ethanol contains 7 kCal, but this is affected
     * by (1) alcohol is not completely metabolised in the body, so not
     * all 7 kCal is available, and (2) most alcoholic drinks also contain
     * some sugars. 
     * https://en.wikipedia.org/wiki/Ethanol */
    public float calories(){
	float alcohol=quantity*strength/100f;
	float mass=alcohol*ETHANOL_DENSITY;
	return mass*CALS_PER_GRAM;
    }
}
