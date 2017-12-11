package com.tactical.creator.utis;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;

import android.widget.ImageView;


import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.ThemedReactContext;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by macmini on 06/11/2017.
 */

public class CustomAnimation {

    public void justDoIt(ThemedReactContext context, ImageView myImage, JSONArray arrayPosition, Integer screenHeight, Integer screenWidth, Integer velocity, float rotation, double adjustX, double adjustY) {
        try {
            List<Keyframe> kfx = new ArrayList<Keyframe>();
            List<Keyframe> kfy = new ArrayList<Keyframe>();
            List<Keyframe> kfrotation = new ArrayList<Keyframe>();

            float x1, y1;
            float[] toRotation = doMathForRotation(myImage.getRotation(), rotation);
            float stepFractions = (float) (0.99 / (arrayPosition.length() / 2));
            float fraction = stepFractions;
            int iterador = (arrayPosition.length() > 2) ? 0 : 2;

            kfx.add(Keyframe.ofFloat(0f, myImage.getX()));
            kfy.add(Keyframe.ofFloat(0f, myImage.getY()));

            while (iterador < arrayPosition.length()) {
                x1 = ((arrayPosition.getInt(iterador) * screenWidth) / 906);
                y1 = ((arrayPosition.getInt(iterador + 1) * screenHeight) / 577);

                kfx.add(Keyframe.ofFloat(fraction, x1));
                kfy.add(Keyframe.ofFloat(fraction, y1));

                fraction += stepFractions;

                iterador = iterador + 2;
            }

//            add the final position in to the array
            kfx.add(Keyframe.ofFloat(1f,(float) (adjustX + ((arrayPosition.getInt(arrayPosition.length() - 2) * screenWidth) / 906))));
            kfy.add(Keyframe.ofFloat(1f, (float) (adjustY +  ((arrayPosition.getInt(arrayPosition.length() - 1) * screenHeight) / 577))));

//           Add's  keyframe for rotation
            kfrotation.add(Keyframe.ofFloat(0.5f, toRotation[0]));
            kfrotation.add(Keyframe.ofFloat(1f, toRotation[1]));


//           transform  keyframes
            PropertyValuesHolder pvhX = PropertyValuesHolder.ofKeyframe("x", kfx.toArray(new Keyframe[0]));
            PropertyValuesHolder pvhY = PropertyValuesHolder.ofKeyframe("y", kfy.toArray(new Keyframe[0]));
            PropertyValuesHolder pvhRotation = PropertyValuesHolder.ofKeyframe("rotation", kfrotation.toArray(new Keyframe[0]));

            ObjectAnimator rotationAnim = ObjectAnimator.ofPropertyValuesHolder(myImage, pvhX, pvhY, pvhRotation);

            rotationAnim.setDuration(velocity);
            rotationAnim.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static int convertDpToPixels(float dp, Context context) {
//        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());
//        return px;
//    }


    public static float convertDpToPixels(float dp, Context context){

////        another mehtod of px to dp
//        float mScale = DisplayMetricsHolder.getWindowDisplayMetrics().density;
//        float x = dp*mScale;
//        return x ;
//import com.facebook.react.uimanager.DisplayMetricsHolder;


        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        float px = dp * ((float)metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
        return px;
    }


    public static float convertPixelsToDp(float px, Context context){
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        float dp = px / ((float)metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
        return dp;
    }

    public float[] doMathForRotation(float from, float to) {

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


    public int[] getColorIntAsColor (int color, Boolean polygno){
        int[] c = new int[]{255,0,0,0};
        int R, G, B;

        if (color>0) {
            B= color % 256;
            G = (color / 256) % 256;
            R = ((color / 256) / 256) % 256;

            R = Math.round(R);
            G = Math.round(G);
            B = Math.round(B);

            if (!polygno) {
                c[0]=255;
                c[1]=R;
                c[2]=G;
                c[3]=B;
            }else {
                c[0]=130;
                c[1]=R;
                c[2]=G;
                c[3]=B;
            }
        }

        return c;
    }

}
