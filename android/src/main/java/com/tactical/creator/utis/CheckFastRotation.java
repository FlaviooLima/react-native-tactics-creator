package com.tactical.creator.utis;


import android.util.Log;

/**
 * Created by macmini on 13/10/2017.
 */


public class CheckFastRotation {

    public float[] doMath(float from, float to) {

        float angleF = from;
        float angleT = to;
        float angleFrom = 0.0f;
        float angleTo = 0.0f;


        if (angleF != angleT) {
            if (angleF < 0) {
                angleF = 360 + angleF;
            }
            if (angleT < 0) {
                angleT = 360 + angleT;
            }

            float Diff = angleF - angleT;
            Diff = Math.abs(Diff);
            if (angleF < angleT) {

                if (Diff < 180) {
                    angleFrom = angleF;
                    angleTo = angleT;
                } else {
                    angleFrom = angleF;
                    angleTo = -(360 - angleT);
                }
            } else {
                if (Diff < 180) {
                    angleFrom = angleF;
                    angleTo = angleT;
                } else {
                    angleFrom = -(360 - angleF);
                    angleTo = angleT;
                }
            }
        } else {
            angleFrom = from;
            angleTo = to;
        }

        return new float[]{angleFrom, angleTo};
    }
}
