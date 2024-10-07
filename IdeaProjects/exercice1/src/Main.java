/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.rphstudio.codingdojo.students;


import fr.rphstudio.codingdojo.game.Pod;
import fr.rphstudio.codingdojo.game.PodPlugIn;

import java.awt.geom.Arc2D;

import static java.lang.Math.pow;

/**
 *
 * @author Romuald GRIGNON
 */
public class Student96 extends PodPlugIn {


    public Student96(Pod p){
        super(p);
    }

    //-------------------------------------------------------
    // DECLARE YOUR OWN VARIABLES AND FUNCTIONS HERE




    boolean batteryEmpty = false  ;
    int chargincheck = 0 ;

    // END OF VARIABLES/FUNCTIONS AREA
    //-------------------------------------------------------
    public float distanceBetweenPositions(float X1 , float Y1 ,float X2 ,float Y2){
        return sqrt (  ((X1-X2 )*(X1-X2 )) + (Y1-Y2 )*(X1-X2 ) );
    }

    public float angCheckPointfonct(float checkPointY, float shipY, float checkPointX, float shipX){
        float test = atan2(checkPointY - shipY, checkPointX - shipX) - getShipAngle();
        if (test > 180){
            test = test - 360;
        }
        else if (test < -180) {
            test = test + 360;
        }
        return test;
    }

    public float angleChargingPoint(float chargePointY , float shipY , float chargePointX , float shipX){
        float test = atan2(chargePointY - shipY, chargePointY - shipX) - getShipAngle();
        if (test > 180){
            test = test - 360;
        }
        else if (test < -180) {
            test = test + 360;
        }
        return test;

    };



    @Override
    public void process(int delta)
    {
        //-------------------------------------------------------
        // WRITE YOUR OWN CODE HERE



        setPlayerName("tac");
        selectShip(1);
        setPlayerColor(255,255,255,255);

        //moveAndRecharge(0.75f, 20, 85);

        float battery = getShipBatteryLevel();
        float shipX= getShipPositionX();
        float shipY= getShipPositionY();
        float checkPointX = getCheckPointX(getNextCheckPointIndex());
        float checkPointY = getCheckPointY(getNextCheckPointIndex());
        float chargePointX = getCheckPointX(chargincheck);
        float chargePointY = getCheckPointY(chargincheck);
        //float angleCheckPoint = atan2(checkPointY - shipY, checkPointX - shipX) - getShipAngle();
        //float angleChargingPoint = atan2(chargePointY - shipY  , chargePointX - shipX) - getShipAngle();
        float charge = angCheckPointfonct(checkPointY,shipY, checkPointX, shipX);

       /* if (  > 180) {
            angleCheckPoint = angleCheckPoint - 360;
        } else if (angleCheckPoint < -180) {
            angleCheckPoint = angleCheckPoint + 360;
        }

        if (angleChargingPoint > 180) {
            angleChargingPoint = angleChargingPoint - 360;
        } else if (angleChargingPoint < -180) {
            angleChargingPoint = angleChargingPoint + 360;
        }*/

        for (int i = 0 ; i < getNbRaceCheckPoints(); i++){
            if (isCheckPointCharging(i)){
                chargincheck=i;
            }
        }
        if (battery<=20) {
            batteryEmpty = true;}
        else if (battery >= 80) {
            batteryEmpty = false;
        }

        if(batteryEmpty){
            //moveToFirstChargingCheckPoint(0.8f);
            //turnTowardFirstChargingCheckPoint();
            //turnTowardPosition(getCheckPointX(chargincheck), getCheckPointY(chargincheck));
            //turnToAngle(angleCharginPoint);
            turn(angleChargingPoint(chargePointY,shipY, chargePointX, shipX) );
            accelerateOrBrake(0.7f);
        }
        else  {

            //moveToNextCheckPoint(0.8f);
            //turnTowardNextCheckPoint();
            //turnTowardPosition(getCheckPointX(getNextCheckPointIndex()),getCheckPointY(getNextCheckPointIndex()));
            //turnToAngle(angleCheckPoint);
            turn(charge);
            accelerateOrBrake(0.6f);
        }

    }

    //moveToNextCheckPoint(0.8f);
    //turnTowardNextCheckPoint();
    //accelerateOrBrake(0.8f);

    // END OF CODE AREA
    //-------------------------------------------------------
}



