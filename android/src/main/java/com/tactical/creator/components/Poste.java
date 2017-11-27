package com.tactical.creator.components;

import android.graphics.Canvas;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;

import android.graphics.Bitmap;

import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.facebook.react.uimanager.ThemedReactContext;
import com.tactical.creator.utis.CustomAnimation;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigDecimal;

/**
 * Created by macmini on 13/11/2017.
 */

public class Poste {
    private  CustomAnimation CustomAnimation = new CustomAnimation();
    int[] auxColor;

    public static final float WIDTH = 50.000000f;
    public static final float HEIGHT = 50.000000f;


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

    public void create(ThemedReactContext context, RelativeLayout base_svg, JSONObject player, Integer screenHeight, Integer screenWidth, Integer velocity, float[] lastPosition) {
        try {

            float scale = 1;
            scale = BigDecimal.valueOf(player.getDouble("scale")).floatValue();

            int realWidth = (int) (40 * scale);
            int realHeight = (int) (65 * scale);

            Bitmap b = Bitmap.createBitmap((int) realWidth, (int) realHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(b);

            //This code is for testing img background width and height
//            Paint paint = new Paint();
//            paint.setStyle(Paint.Style.FILL);
//            paint.setColor(Color.RED);
//            canvas.drawPaint(paint);
//            //END

            init();
            canvas.save();
            canvas.scale(realWidth / WIDTH, realHeight / HEIGHT);
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
            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"),false);
            paint_2.setARGB(auxColor[0],auxColor[1],auxColor[2],auxColor[3]);

            path_0.moveTo(4.900000f, 47.599998f);
            path_0.cubicTo(7.606195f, 47.599998f, 9.800000f, 48.137257f, 9.800000f, 48.799999f);
            path_0.cubicTo(9.800000f, 49.462742f, 7.606195f, 50.000000f, 4.900000f, 50.000000f);
            path_0.cubicTo(2.193805f, 50.000000f, 0.000000f, 49.462742f, 0.000000f, 48.799999f);
            path_0.cubicTo(0.000000f, 48.137257f, 2.193805f, 47.599998f, 4.900000f, 47.599998f);
            path_0.close();

            canvas.drawPath(path_0, paint_2);
            canvas.restore();
            canvas.save();
            paint_3.reset();
            paint_3.set(paint_0);
            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"),false);
            paint_3.setARGB(auxColor[0],auxColor[1],auxColor[2],auxColor[3]);
            path_1.reset();
            path_1.moveTo(3.200000f, 0.000000f);
            path_1.lineTo(6.600000f, 0.000000f);
            path_1.lineTo(6.600000f, 48.799999f);
            path_1.lineTo(3.200000f, 48.799999f);
            path_1.lineTo(3.200000f, 0.000000f);
            path_1.close();

            canvas.drawPath(path_1, paint_3);
            canvas.restore();
            canvas.save();
            paint_4.reset();
            paint_4.set(paint_0);
            paint_4.setColor(0xffffffff);
            path_2.reset();
            path_2.moveTo(3.200000f, 2.900000f);
            path_2.lineTo(6.600000f, 2.900000f);
            path_2.lineTo(6.600000f, 7.600000f);
            path_2.lineTo(3.200000f, 7.600000f);
            path_2.lineTo(3.200000f, 2.900000f);
            path_2.close();

            canvas.drawPath(path_2, paint_4);
            canvas.restore();
            canvas.save();
            paint_5.reset();
            paint_5.set(paint_0);
            paint_5.setColor(0xffffffff);
            path_3.reset();
            path_3.moveTo(3.200000f, 10.700000f);
            path_3.lineTo(6.600000f, 10.700000f);
            path_3.lineTo(6.600000f, 15.400000f);
            path_3.lineTo(3.200000f, 15.400000f);
            path_3.lineTo(3.200000f, 10.700000f);
            path_3.close();
            canvas.drawPath(path_3, paint_5);
            canvas.restore();
            ImageView myImage = new ImageView(context);
            myImage.setImageBitmap(b);
            myImage.setX(CustomAnimation.convertDpToPixels(((lastPosition[0] * screenWidth) / 906), context));
            myImage.setY(CustomAnimation.convertDpToPixels(((lastPosition[1] * screenHeight) / 577), context));
            myImage.setRotation(lastPosition[2]);
            base_svg.addView(myImage);

//            need to inforce the pivot for some reason
            myImage.setPivotX(0.0f);
            myImage.setPivotY(0.0f);

            JSONObject lineAnima = player.getJSONObject("lineAnima");
            JSONArray arrayPosition = lineAnima.optJSONArray("data");

            CustomAnimation.justDoIt(context, myImage, arrayPosition, screenHeight, screenWidth, velocity, (float) player.getInt("rotation"), (CustomAnimation.convertDpToPixels(2.0f, context) * scale), (CustomAnimation.convertDpToPixels(0.0f, context) * scale));

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

}
