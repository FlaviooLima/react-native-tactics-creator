package com.tactical.creator.components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.facebook.react.uimanager.ThemedReactContext;
import com.tactical.creator.utis.CustomAnimation;

import org.json.JSONArray;
import org.json.JSONObject;

import java.math.BigDecimal;

/**
 * Created by macmini on 14/11/2017.
 */

public class Cone {
    private com.tactical.creator.utis.CustomAnimation CustomAnimation = new CustomAnimation();
    int[] auxColor;

    public static final float WIDTH = 25.000000f;
    public static final float HEIGHT = 25.000000f;

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


    }
    public void create(ThemedReactContext context, RelativeLayout base_svg, JSONObject player, Integer screenHeight, Integer screenWidth, Integer velocity, float[] lastPosition) {
        try {
            float scale = 1;
            scale = BigDecimal.valueOf(player.getDouble("scale")).floatValue();

            int  baseSizeWidth  = 30*screenWidth/1000;
            int  baseSizeHeight = 50*screenHeight/1000;

            int realWidth = (int) (baseSizeWidth * scale);
            int realHeight = (int) (baseSizeHeight * scale);


            Bitmap b  = Bitmap.createBitmap((int) realWidth, (int) realHeight, Bitmap.Config.ARGB_8888);
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
            path_0.moveTo(16.800001f, 13.000000f);
            path_0.lineTo(15.600000f, 9.200000f);
            path_0.lineTo(11.500000f, 9.200000f);
            path_0.lineTo(7.500000f, 9.200000f);
            path_0.lineTo(6.300000f, 13.000000f);
            path_0.lineTo(11.500000f, 13.000000f);
            path_0.close();
            path_0.setFillType(Path.FillType.WINDING);

            canvas.drawPath(path_0, paint_2);
            canvas.restore();
            canvas.save();
            paint_3.reset();
            paint_3.set(paint_0);
            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"),false);
            paint_3.setARGB(auxColor[0],auxColor[1],auxColor[2],auxColor[3]);

            path_1.reset();
            path_1.moveTo(8.700000f, 4.900000f);
            path_1.lineTo(11.500000f, 4.900000f);
            path_1.lineTo(14.300000f, 4.900000f);
            path_1.lineTo(13.200000f, 1.400000f);
            path_1.cubicTo(13.200000f, 0.600000f, 12.400001f, 0.000000f, 11.500000f, 0.000000f);
            path_1.cubicTo(10.700000f, 0.000000f, 10.000000f, 0.500000f, 9.800000f, 1.200000f);
            path_1.lineTo(9.800000f, 1.200000f);
            path_1.lineTo(9.800000f, 1.300000f);
            path_1.cubicTo(9.800000f, 1.300000f, 9.800000f, 1.300000f, 9.800000f, 1.300000f);
            path_1.lineTo(8.700000f, 4.900000f);
            path_1.close();

            path_1.setFillType(Path.FillType.WINDING);
            canvas.drawPath(path_1, paint_3);
            canvas.restore();
            canvas.save();
            paint_4.reset();
            paint_4.set(paint_0);
            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"),false);
            paint_4.setARGB(auxColor[0],auxColor[1],auxColor[2],auxColor[3]);
            path_2.reset();
            path_2.moveTo(21.100000f, 21.000000f);
            path_2.lineTo(19.200001f, 21.000000f);
            path_2.lineTo(18.000000f, 17.200001f);
            path_2.lineTo(11.500000f, 17.200001f);
            path_2.lineTo(5.100000f, 17.200001f);
            path_2.lineTo(3.900000f, 21.000000f);
            path_2.lineTo(2.000000f, 21.000000f);
            path_2.cubicTo(0.900000f, 21.000000f, 0.000000f, 21.900000f, 0.000000f, 23.000000f);
            path_2.cubicTo(0.000000f, 24.100000f, 0.900000f, 25.000000f, 2.000000f, 25.000000f);
            path_2.lineTo(5.300000f, 25.000000f);
            path_2.lineTo(11.500000f, 25.000000f);
            path_2.lineTo(17.700001f, 25.000000f);
            path_2.lineTo(21.000000f, 25.000000f);
            path_2.cubicTo(22.100000f, 25.000000f, 23.000000f, 24.100000f, 23.000000f, 23.000000f);
            path_2.cubicTo(23.100000f, 21.900000f, 22.200001f, 21.000000f, 21.100000f, 21.000000f);
            path_2.close();

            path_2.setFillType(Path.FillType.WINDING);
            canvas.drawPath(path_2, paint_4);
            canvas.restore();
            canvas.save();
            paint_5.reset();
            paint_5.set(paint_0);
            paint_5.setColor(0xffffffff);
            path_3.reset();
            path_3.moveTo(18.000000f, 17.200001f);
            path_3.lineTo(16.800001f, 13.000000f);
            path_3.lineTo(6.300000f, 13.000000f);
            path_3.lineTo(5.100000f, 17.200001f);
            path_3.close();
            path_3.setFillType(Path.FillType.WINDING);

            canvas.drawPath(path_3, paint_5);
            canvas.restore();
            canvas.save();
            paint_6.reset();
            paint_6.set(paint_0);
            paint_6.setColor(0xffffffff);
            path_4.reset();
            path_4.moveTo(15.600000f, 9.200000f);
            path_4.lineTo(14.400001f, 4.900000f);
            path_4.lineTo(8.700000f, 4.900000f);
            path_4.lineTo(7.500000f, 9.200000f);
            path_4.close();
            path_4.setFillType(Path.FillType.WINDING);
            canvas.drawPath(path_4, paint_6);
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

        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}
