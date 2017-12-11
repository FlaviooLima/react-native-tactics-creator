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

public class Bandeira {
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



    private void init() {
        if (inited) return;
        inited = true;
        paint_0 = new Paint();
        typeface_0 = Typeface.create(Typeface.SANS_SERIF, 0);

        paint_2 = new Paint();
        path_0 = new Path();

        paint_3 = new Paint();
        path_1 = new Path();


    }


    public void create(ThemedReactContext context, RelativeLayout base_svg, JSONObject player, Integer screenHeight, Integer screenWidth, Integer velocity, float[] lastPosition) {
        try {
            float scale = 1;

            scale = BigDecimal.valueOf(player.getDouble("scale")).floatValue();


            int  baseSizeWidth  = 70*screenWidth/1000;
            int  baseSizeHeight = 100*screenHeight/1000;

            int realWidth = (int) (baseSizeWidth * scale);
            int realHeight = (int) (baseSizeHeight * scale);

//            int realWidth = (int) (40 * scale);
//            int realHeight = (int) (50 * scale);

            Bitmap b = Bitmap.createBitmap((int) realWidth, (int) realHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(b);


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
            path_0.moveTo(21.500000f, 13.600000f);
            path_0.cubicTo(15.200000f, 10.400001f, 8.300000f, 16.800001f, 2.000000f, 13.600000f);
            path_0.cubicTo(2.000000f, 11.400001f, 2.000000f, -0.900000f, 2.000000f, 0.800000f);
            path_0.cubicTo(6.600000f, 4.200000f, 15.800000f, -2.200000f, 21.500000f, 0.800000f);
            path_0.cubicTo(21.500000f, 4.400000f, 21.500000f, 12.500000f, 21.500000f, 13.600000f);
            path_0.close();


            path_0.setFillType(Path.FillType.WINDING);
            canvas.drawPath(path_0, paint_2);
            canvas.restore();
            canvas.save();
            paint_3.reset();
            paint_3.set(paint_0);
            paint_3.setColor(0xffffffff);
            path_1.reset();
            path_1.moveTo(0.000000f, 0.200000f);
            path_1.lineTo(2.100000f, 0.200000f);
            path_1.lineTo(2.100000f, 50.000000f);
            path_1.lineTo(0.000000f, 50.000000f);
            path_1.lineTo(0.000000f, 0.200000f);
            path_1.close();

            canvas.drawPath(path_1, paint_3);
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

//            CustomAnimation.justDoIt(context, myImage, arrayPosition, screenHeight, screenWidth, velocity, (float) player.getInt("rotation"), (CustomAnimation.convertDpToPixels(0.0f,context) * scale),(CustomAnimation.convertDpToPixels(2.0f,context) * scale));
            CustomAnimation.justDoIt(context, myImage, arrayPosition, screenHeight, screenWidth, velocity, (float) player.getInt("rotation"), (CustomAnimation.convertDpToPixels(0.0f,context) * scale),(CustomAnimation.convertDpToPixels(0.0f,context) * scale));



        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
