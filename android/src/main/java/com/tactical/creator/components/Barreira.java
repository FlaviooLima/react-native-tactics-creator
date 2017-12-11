package com.tactical.creator.components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.facebook.react.uimanager.ThemedReactContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigDecimal;
import com.tactical.creator.utis.CustomAnimation;

/**
 * Created by macmini on 13/11/2017.
 */

public class Barreira {
    int[] auxColor;

    private CustomAnimation CustomAnimation = new CustomAnimation();



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

    private Paint paint_6;
    private Path path_4;

    private Paint paint_7;
    private Path path_5;

    private Paint paint_8;
    private Path path_6;

    private Paint paint_9;
    private Path path_7;

    private Paint paint_10;
    private Path path_8;



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

        paint_6 = new Paint();
        path_4 = new Path();

        paint_7 = new Paint();
        path_5 = new Path();

        paint_8 = new Paint();
        path_6 = new Path();

        paint_9 = new Paint();
        path_7 = new Path();

        paint_10 = new Paint();
        path_8 = new Path();


    }





    public void create(ThemedReactContext context, RelativeLayout base_svg, JSONObject player, Integer screenHeight, Integer screenWidth, Integer velocity, float[] lastPosition) {
        try {
            float scale = 1;
            scale = BigDecimal.valueOf(player.getDouble("scale")).floatValue();


            int  baseSizeWidth  = 60*screenWidth/1000;
            int  baseSizeHeight = 100*screenHeight/1000;

            int realWidth = (int) (baseSizeWidth * scale);
            int realHeight = (int) (baseSizeHeight * scale);



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

            path_0.reset();
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
            path_3.moveTo(3.200000f, 16.800001f);
            path_3.lineTo(6.600000f, 16.800001f);
            path_3.lineTo(6.600000f, 21.500002f);
            path_3.lineTo(3.200000f, 21.500002f);
            path_3.lineTo(3.200000f, 16.800001f);
            path_3.close();




            canvas.drawPath(path_3, paint_5);
            canvas.restore();
            canvas.save();
            paint_6.reset();
            paint_6.set(paint_0);
            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"),false);
            paint_6.setARGB(auxColor[0],auxColor[1],auxColor[2],auxColor[3]);
            path_4.reset();
            path_4.moveTo(41.500000f, 47.599998f);
            path_4.cubicTo(44.206196f, 47.599998f, 46.400002f, 48.137257f, 46.400002f, 48.799999f);
            path_4.cubicTo(46.400002f, 49.462742f, 44.206196f, 50.000000f, 41.500000f, 50.000000f);
            path_4.cubicTo(38.793804f, 50.000000f, 36.599998f, 49.462742f, 36.599998f, 48.799999f);
            path_4.cubicTo(36.599998f, 48.137257f, 38.793804f, 47.599998f, 41.500000f, 47.599998f);
            path_4.close();




            canvas.drawPath(path_4, paint_6);
            canvas.restore();
            canvas.save();
            paint_7.reset();
            paint_7.set(paint_0);
            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"),false);
            paint_7.setARGB(auxColor[0],auxColor[1],auxColor[2],auxColor[3]);
            path_5.reset();
            path_5.moveTo(39.799999f, 0.000000f);
            path_5.lineTo(43.200001f, 0.000000f);
            path_5.lineTo(43.200001f, 48.799999f);
            path_5.lineTo(39.799999f, 48.799999f);
            path_5.lineTo(39.799999f, 0.000000f);
            path_5.close();




            canvas.drawPath(path_5, paint_7);
            canvas.restore();
            canvas.save();
            paint_8.reset();
            paint_8.set(paint_0);
            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"),false);
            paint_8.setARGB(auxColor[0],auxColor[1],auxColor[2],auxColor[3]);
            path_6.reset();
            path_6.moveTo(4.900000f, 10.600000f);
            path_6.lineTo(41.500004f, 10.600000f);
            path_6.lineTo(41.500004f, 14.000000f);
            path_6.lineTo(4.900000f, 14.000000f);
            path_6.lineTo(4.900000f, 10.600000f);
            path_6.close();




            canvas.drawPath(path_6, paint_8);
            canvas.restore();
            canvas.save();
            paint_9.reset();
            paint_9.set(paint_0);
            paint_9.setColor(0xffffffff);
            path_7.reset();
            path_7.moveTo(39.799999f, 2.900000f);
            path_7.lineTo(43.200001f, 2.900000f);
            path_7.lineTo(43.200001f, 7.600000f);
            path_7.lineTo(39.799999f, 7.600000f);
            path_7.lineTo(39.799999f, 2.900000f);
            path_7.close();




            canvas.drawPath(path_7, paint_9);
            canvas.restore();
            canvas.save();
            paint_10.reset();
            paint_10.set(paint_0);
            paint_10.setColor(0xffffffff);
            path_8.reset();
            path_8.moveTo(39.799999f, 16.800001f);
            path_8.lineTo(43.200001f, 16.800001f);
            path_8.lineTo(43.200001f, 21.500002f);
            path_8.lineTo(39.799999f, 21.500002f);
            path_8.lineTo(39.799999f, 16.800001f);
            path_8.close();
            canvas.drawPath(path_8, paint_10);
            canvas.restore();




            ImageView myImage = new ImageView(context);
            myImage.setImageBitmap(b);
            myImage.setX(lastPosition[0]);
            myImage.setY(lastPosition[1]);

            myImage.setRotation(lastPosition[2]);
            base_svg.addView(myImage);

//            need to inforce the pivot for some reason
            myImage.setPivotX(0.0f);
            myImage.setPivotY(0.0f);

            JSONObject lineAnima = player.getJSONObject("lineAnima");
            JSONArray arrayPosition = lineAnima.optJSONArray("data");

            CustomAnimation.justDoIt(context, myImage, arrayPosition, screenHeight, screenWidth, velocity, (float) player.getInt("rotation"), (CustomAnimation.convertDpToPixels(0.0f,context) * scale),(CustomAnimation.convertDpToPixels(0.0f,context) * scale));



        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
