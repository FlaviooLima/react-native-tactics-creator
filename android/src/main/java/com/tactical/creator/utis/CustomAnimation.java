package com.tactical.creator.utis;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.TypedValue;
import android.widget.ImageView;

import com.facebook.react.uimanager.ThemedReactContext;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by macmini on 06/11/2017.
 */

public class CustomAnimation {


    public void justDoIt(ThemedReactContext context, ImageView myImage, JSONArray arrayPosition, Integer screenHeight, Integer screenWidth, Integer velocity, float rotation) {
        try {
            List<Keyframe> kfx = new ArrayList<Keyframe>();
            List<Keyframe> kfy = new ArrayList<Keyframe>();
            List<Keyframe> kfrotation = new ArrayList<Keyframe>();

            float x1, y1;
            float[] toRotation = doMathForRotation(myImage.getRotation(), rotation);
            float stepFractions = (float) (0.99 / (arrayPosition.length() / 2));
            float fraction = stepFractions;
            int iterador = (arrayPosition.length() > 2) ? 0 : 2;


//            TODO: getting the x and y is not working, we have

            kfx.add(Keyframe.ofFloat(0f, myImage.getX()));
            kfy.add(Keyframe.ofFloat(0f, myImage.getY()));

            while (iterador < arrayPosition.length()) {
                x1 = ((arrayPosition.getInt(iterador) * screenWidth) / 906);
                y1 = ((arrayPosition.getInt(iterador + 1) * screenHeight) / 577);

                x1 = convertDpToPixels(x1, context);
                y1 = convertDpToPixels(y1, context);

                kfx.add(Keyframe.ofFloat(fraction, x1));
                kfy.add(Keyframe.ofFloat(fraction, y1));

                fraction += stepFractions;

                iterador = iterador + 2;
            }

//          Add's final keyframe for x and y
            kfx.add(Keyframe.ofFloat(1f, convertDpToPixels(((arrayPosition.getInt(arrayPosition.length() - 2) * screenWidth) / 906), context)));
            kfy.add(Keyframe.ofFloat(1f, convertDpToPixels(((arrayPosition.getInt(arrayPosition.length() - 1) * screenHeight) / 577), context)));


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

    public static int convertDpToPixels(float dp, Context context) {
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());
        return px;
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

}
