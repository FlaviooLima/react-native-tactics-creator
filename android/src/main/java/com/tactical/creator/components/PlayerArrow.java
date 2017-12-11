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
import com.tactical.creator.utis.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigDecimal;

public class PlayerArrow {

    private CustomAnimation CustomAnimation = new CustomAnimation();
    int[] auxColor;

    public static final float WIDTH = 1000.000000f;
    public static final float HEIGHT = 1000.000000f;

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


            int  baseSizeWidth  = 44*screenWidth/1000;
            int  baseSizeHeight = 70*screenHeight/1000;

            int realWidth = (int) (baseSizeWidth * scale);
            int realHeight = (int) (baseSizeHeight * scale);



            Bitmap b  = Bitmap.createBitmap((int) realWidth, (int) realHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(b);

//            //This code is for testing img background width and height
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
            path_0.moveTo(1000.000000f, 500.000000f);
            path_0.lineTo(613.299988f, 836.700012f);
            path_0.lineTo(613.299988f, 163.300003f);
            path_0.close();
            path_0.setFillType(Path.FillType.WINDING);

            canvas.drawPath(path_0, paint_2);
            canvas.restore();
            canvas.save();
            paint_3.reset();
            paint_3.set(paint_0);
//
            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"),false);
            paint_3.setARGB(auxColor[0],auxColor[1],auxColor[2],auxColor[3]);

            path_1.reset();
            path_1.moveTo(400.000000f, 100.000000f);
            path_1.cubicTo(620.913940f, 100.000000f, 800.000000f, 279.086090f, 800.000000f, 500.000000f);
            path_1.cubicTo(800.000000f, 720.913940f, 620.913940f, 900.000000f, 400.000000f, 900.000000f);
            path_1.cubicTo(179.086090f, 900.000000f, 0.000000f, 720.913940f, 0.000000f, 500.000000f);
            path_1.cubicTo(0.000000f, 279.086090f, 179.086090f, 100.000000f, 400.000000f, 100.000000f);
            path_1.close();

            canvas.drawPath(path_1, paint_3);
            canvas.restore();
            canvas.save();
            paint_4.reset();
            paint_4.set(paint_0);
            paint_4.setColor(0xffffffff);
            path_2.reset();
            path_2.moveTo(400.000000f, 140.000000f);
            path_2.cubicTo(598.822510f, 140.000000f, 760.000000f, 301.177490f, 760.000000f, 500.000000f);
            path_2.cubicTo(760.000000f, 698.822510f, 598.822510f, 860.000000f, 400.000000f, 860.000000f);
            path_2.cubicTo(201.177475f, 860.000000f, 40.000000f, 698.822510f, 40.000000f, 500.000000f);
            path_2.cubicTo(40.000000f, 301.177490f, 201.177475f, 140.000000f, 400.000000f, 140.000000f);
            path_2.close();

            canvas.drawPath(path_2, paint_4);
            canvas.restore();
            canvas.save();
            paint_5.reset();
            paint_5.set(paint_0);
            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"),false);
            paint_5.setARGB(auxColor[0],auxColor[1],auxColor[2],auxColor[3]);
            path_3.reset();
            path_3.moveTo(400.000000f, 200.000000f);
            path_3.cubicTo(565.685425f, 200.000000f, 700.000000f, 334.314575f, 700.000000f, 500.000000f);
            path_3.cubicTo(700.000000f, 665.685425f, 565.685425f, 800.000000f, 400.000000f, 800.000000f);
            path_3.cubicTo(234.314560f, 800.000000f, 100.000000f, 665.685425f, 100.000000f, 500.000000f);
            path_3.cubicTo(100.000000f, 334.314575f, 234.314560f, 200.000000f, 400.000000f, 200.000000f);
            path_3.close();
            canvas.drawPath(path_3, paint_5);
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
