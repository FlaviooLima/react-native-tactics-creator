package com.tactical.creator.components;

import com.tactical.creator.utis.*;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.facebook.react.uimanager.ThemedReactContext;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.Keyframe;
import com.nineoldandroids.animation.ObjectAnimator;
import com.nineoldandroids.animation.PropertyValuesHolder;
import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.util.Property;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by macmini on 13/10/2017.
 */


public class PlayerFront {

    public float scaleWIDTH = 0.30f;
    public float scaleHEIGHT = 0.30f;
    public float WIDTH = 70;
    public float HEIGHT = 70;
    public int iterador = 0;

    private boolean inited;
    private Paint paint_0;
    private Typeface typeface_0;
    private Paint paint_2;
    private Path path_0;
    private Paint paint_3;
    private Path path_1;
    private Paint paint_4;
    private Path path_2;
    private Paint paint_5;
    private Path path_3;

    private ThemedReactContext context;
    private Bitmap b;
    private RelativeLayout base_svg;
    private CheckFastRotation CheckFastRotation = new CheckFastRotation();


    private void init() {
        if (inited) return;
        inited = true;
        paint_0 = new Paint();
        typeface_0 = Typeface.create(Typeface.SANS_SERIF, 0);
        paint_2 = new Paint();
        path_0 = new Path();
        paint_3 = new Paint();
        path_1 = new Path();
        paint_4 = new Paint();
        path_2 = new Path();
        paint_5 = new Paint();
        path_3 = new Path();
    }


    public void create(ThemedReactContext context, RelativeLayout base_svg, JSONObject player, final Integer screenHeight, final Integer screenWidth, Integer velocity) {
        try {
            this.context = context;
            this.base_svg = base_svg;

            float scale = BigDecimal.valueOf(player.getDouble("scale")).floatValue();

            scaleHEIGHT = scaleHEIGHT * scale;
            scaleWIDTH = scaleWIDTH * scale;

            WIDTH = WIDTH * scale;
            HEIGHT = HEIGHT * scale;

            b = Bitmap.createBitmap((int) WIDTH, (int) HEIGHT, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(b);

            //This code is for testing img background width and height
//            Paint paint = new Paint();
//            Path path = new Path();
//            paint.setStyle(Paint.Style.FILL);
////            paint.setColor(Color.RED);
//            paint.setColor(Color.TRANSPARENT);
//            canvas.drawPaint(paint);
            //END

            init();
            canvas.save();
            canvas.scale(scaleWIDTH, scaleHEIGHT);
            paint_0.reset();
            paint_0.setFlags(Paint.ANTI_ALIAS_FLAG | Paint.DEV_KERN_TEXT_FLAG | Paint.SUBPIXEL_TEXT_FLAG);
            paint_0.setStyle(Paint.Style.FILL);
            paint_0.setTypeface(Typeface.DEFAULT);
            paint_0.setColor(0xff000000);
            paint_0.setTextSize(16.000000f);
            paint_0.setTypeface(typeface_0);
            paint_0.setStrikeThruText(false);
            paint_0.setUnderlineText(false);
            canvas.save();
            paint_2.reset();
            paint_2.set(paint_0);
            paint_2.setColor(Color.parseColor("#" + Integer.toHexString(player.getInt("color"))));
            path_0.reset();
            path_0.moveTo(125.000000f, 714.700012f);
            path_0.cubicTo(204.000000f, 675.200012f, 173.600006f, 706.299988f, 270.500000f, 665.900024f);
            path_0.cubicTo(274.899994f, 664.100037f, 287.799988f, 659.600037f, 291.899994f, 657.900024f);
            path_0.cubicTo(353.699982f, 700.300049f, 419.600006f, 728.500000f, 500.200012f, 728.500000f);
            path_0.cubicTo(580.100037f, 728.500000f, 648.600037f, 702.700012f, 710.100037f, 661.000000f);
            path_0.cubicTo(714.700012f, 662.900024f, 724.900024f, 666.400024f, 729.800049f, 668.500000f);
            path_0.cubicTo(826.700073f, 708.900024f, 796.300049f, 675.200012f, 875.300049f, 714.700012f);
            path_0.cubicTo(1000.100037f, 777.100037f, 1000.100037f, 947.100037f, 1000.100037f, 947.100037f);
            path_0.lineTo(499.500000f, 947.100037f);
            path_0.lineTo(0.200000f, 947.100037f);
            path_0.cubicTo(0.200000f, 947.000000f, 0.200000f, 777.100037f, 125.000000f, 714.700012f);
            path_0.close();
            path_0.setFillType(Path.FillType.WINDING);
            canvas.scale(scaleWIDTH, scaleHEIGHT);
            canvas.drawPath(path_0, paint_2);
            canvas.restore();
            canvas.save();
            paint_3.reset();
            paint_3.set(paint_0);
            paint_3.setColor(0xff054366);
            path_1.reset();
            path_1.moveTo(610.000000f, 642.799988f);
            path_1.lineTo(390.500000f, 641.899963f);
            path_1.cubicTo(390.500000f, 641.899963f, 378.299988f, 621.599976f, 292.000000f, 657.799988f);
            path_1.cubicTo(353.799988f, 700.200012f, 471.100006f, 865.700012f, 500.299988f, 865.700012f);
            path_1.cubicTo(529.399963f, 865.700012f, 648.700012f, 702.700012f, 710.200012f, 661.000000f);
            path_1.cubicTo(625.200012f, 625.200012f, 610.000000f, 642.799988f, 610.000000f, 642.799988f);
            path_1.close();
            path_1.setFillType(Path.FillType.WINDING);
            canvas.scale(scaleWIDTH, scaleHEIGHT);
            canvas.drawPath(path_1, paint_3);
            canvas.restore();
            canvas.save();
            paint_4.reset();
            paint_4.set(paint_0);
            paint_4.setColor(0xfff1c699);
            path_2.reset();
            path_2.moveTo(585.600037f, 124.000000f);
            path_2.cubicTo(608.900024f, 145.699997f, 634.300049f, 162.800003f, 671.900024f, 167.500000f);
            path_2.cubicTo(672.600037f, 171.300003f, 679.300049f, 190.399994f, 679.700012f, 194.199997f);
            path_2.cubicTo(681.700012f, 214.699997f, 679.299988f, 235.899994f, 673.700012f, 278.799988f);
            path_2.cubicTo(701.400024f, 273.000000f, 689.500000f, 337.199982f, 688.299988f, 357.699982f);
            path_2.cubicTo(687.000000f, 378.999969f, 679.500000f, 412.399994f, 656.700012f, 405.799988f);
            path_2.cubicTo(645.400024f, 493.299988f, 609.100037f, 521.200012f, 609.100037f, 521.200012f);
            path_2.lineTo(610.000061f, 614.200012f);
            path_2.cubicTo(610.000061f, 614.200012f, 603.700073f, 615.400024f, 688.700073f, 651.200012f);
            path_2.cubicTo(627.200012f, 692.799988f, 529.400024f, 837.000000f, 500.200012f, 837.000000f);
            path_2.cubicTo(471.100006f, 837.000000f, 375.100006f, 691.000000f, 313.200012f, 648.700012f);
            path_2.cubicTo(399.500000f, 612.500000f, 390.400024f, 613.200012f, 390.400024f, 613.200012f);
            path_2.lineTo(391.300018f, 520.700012f);
            path_2.cubicTo(391.300018f, 520.700012f, 355.000031f, 493.000000f, 343.700012f, 405.500000f);
            path_2.cubicTo(321.000000f, 412.100006f, 313.400024f, 378.799988f, 312.100006f, 357.500000f);
            path_2.cubicTo(310.800018f, 337.000000f, 298.700012f, 272.899994f, 326.399994f, 278.600006f);
            path_2.cubicTo(320.699982f, 235.800003f, 318.399994f, 210.800003f, 320.399994f, 190.300003f);
            path_2.cubicTo(320.899994f, 185.300003f, 326.199982f, 169.500000f, 327.100006f, 164.500000f);
            path_2.cubicTo(350.500000f, 168.000000f, 368.700012f, 167.000000f, 394.500000f, 167.000000f);
            path_2.cubicTo(471.399994f, 167.100006f, 540.000000f, 150.300003f, 585.600037f, 124.000000f);
            path_2.close();
            path_2.setFillType(Path.FillType.WINDING);
            canvas.scale(scaleWIDTH, scaleHEIGHT);
            canvas.drawPath(path_2, paint_4);
            canvas.restore();
            canvas.save();
            paint_5.reset();
            paint_5.set(paint_0);
            paint_5.setColor(0xff754d25);
            path_3.reset();
            path_3.moveTo(499.500000f, 53.100002f);
            path_3.cubicTo(517.900024f, 54.100002f, 535.099976f, 57.200001f, 551.200012f, 62.000004f);
            path_3.cubicTo(584.200012f, 71.800003f, 611.799988f, 88.800003f, 633.100037f, 109.800003f);
            path_3.cubicTo(658.000061f, 134.300003f, 674.100037f, 164.100006f, 679.700012f, 194.200012f);
            path_3.cubicTo(642.100037f, 189.500015f, 609.000000f, 174.500015f, 585.600037f, 152.800018f);
            path_3.cubicTo(540.000000f, 179.000000f, 471.399994f, 195.800003f, 394.600006f, 195.800003f);
            path_3.cubicTo(368.800018f, 195.800003f, 343.899994f, 193.900009f, 320.500000f, 190.400009f);
            path_3.cubicTo(332.600006f, 123.400002f, 383.399994f, 58.200001f, 499.500000f, 53.100002f);
            path_3.close();
            path_3.setFillType(Path.FillType.WINDING);
            canvas.scale(scaleWIDTH, scaleHEIGHT);
            canvas.drawPath(path_3, paint_5);
            canvas.restore();

            final ImageView myImage = new ImageView(context);
            myImage.setImageBitmap(b);
            base_svg.addView(myImage);

            iterador = 0;

            JSONObject lineAnima = player.getJSONObject("lineAnima");
            final JSONArray arrayPosition = lineAnima.optJSONArray("data");


            doAnimations(myImage, arrayPosition, screenHeight, screenWidth, velocity, (float) player.getInt("rotation"));

//            FALTA ANIMATIONS, ROTATION
//            Log.e("FLAVIO", "AQUI VAI FICAR");
//            Log.e("FLAVIO", String.valueOf(player));

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void doAnimations(ImageView myImage, JSONArray arrayPosition, Integer screenHeight, Integer screenWidth, Integer velocity, float rotation) {
        try {
//            TODO: do this for just one position array

            List<Keyframe> kfx = new ArrayList<Keyframe>();
            List<Keyframe> kfy = new ArrayList<Keyframe>();
            List<Keyframe> kfrotation = new ArrayList<Keyframe>();
            float x1, y1;
            float[] toRotation = CheckFastRotation.doMath(myImage.getRotation(), rotation);
            float stepFractions = (float) (0.99 / arrayPosition.length());
            float fraction = stepFractions;

            iterador = 0;

//           Add's initial keyframe for x and y
            kfx.add(Keyframe.ofFloat(0f, convertDpToPixels(((arrayPosition.getInt(iterador) * screenWidth) / 906), context)));
            kfy.add(Keyframe.ofFloat(0f, convertDpToPixels(((arrayPosition.getInt(iterador + 1) * screenHeight) / 577), context)));

            iterador = iterador + 2;

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

//           Add's final keyframe for x and y
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
            rotationAnim.setStartDelay(4000);
            rotationAnim.start();
            Log.e("FLAVIO", "Comecou Animacoes");

            new android.os.Handler().postDelayed(
                    new Runnable() {
                        public void run() {
                            Log.e("FLAVIO", "ACABOU Animacoes");
                        }
                    },
                    (velocity + 4000));

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static int convertDpToPixels(float dp, Context context) {
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());
        return px;
    }

}
