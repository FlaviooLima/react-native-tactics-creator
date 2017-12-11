package com.tactical.creator.components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.util.Log;
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

public class Ball {
    private com.tactical.creator.utis.CustomAnimation CustomAnimation = new CustomAnimation();
    int[] auxColor;

    public static final float WIDTH = 20.000000f;
    public static final float HEIGHT = 20.000000f;

    private boolean inited;
    private Paint paint_0;
    private Typeface typeface_0;


    private Paint paint_2;
    private Path path_0;

    private Path path_1;



    private void init() {
        if (inited) return;
        inited = true;
        paint_0 = new Paint();
        typeface_0 = Typeface.create(Typeface.SANS_SERIF, 0);

        paint_2 = new Paint();
        path_0 = new Path();

        path_1 = new Path();
    }

    public void create(ThemedReactContext context, RelativeLayout base_svg, JSONObject player, Integer screenHeight, Integer screenWidth, Integer velocity, float[] lastPosition) {
        try {
            float scale = 1;
            scale = BigDecimal.valueOf(player.getDouble("scale")).floatValue();

            int  baseSizeWidth  = 25*screenWidth/1000;
            int  baseSizeHeight = 40*screenHeight/1000;

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
//            paint_0.setColor(0xff000000);
            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"),false);
            paint_0.setARGB(auxColor[0],auxColor[1],auxColor[2],auxColor[3]);

            paint_0.setTextSize(16.000000f);
            paint_0.setTypeface(typeface_0);
            paint_0.setStrikeThruText(false);
            paint_0.setUnderlineText(false);
            canvas.save();
            paint_2.reset();
            paint_2.set(paint_0);
            paint_2.setColor(0xffffffff);
            path_0.reset();
            path_0.moveTo(10.000000f, 0.000000f);
            path_0.cubicTo(15.522848f, 0.000000f, 20.000000f, 4.477152f, 20.000000f, 10.000000f);
            path_0.cubicTo(20.000000f, 15.522848f, 15.522848f, 20.000000f, 10.000000f, 20.000000f);
            path_0.cubicTo(4.477152f, 20.000000f, 0.000000f, 15.522848f, 0.000000f, 10.000000f);
            path_0.cubicTo(0.000000f, 4.477152f, 4.477152f, 0.000000f, 10.000000f, 0.000000f);
            path_0.close();
            canvas.drawPath(path_0, paint_2);
            canvas.restore();
            canvas.save();
            path_1.reset();
            path_1.moveTo(19.200001f, 6.100000f);
            path_1.cubicTo(18.700001f, 4.900000f, 18.000000f, 3.800000f, 17.100000f, 2.900000f);
            path_1.cubicTo(16.200001f, 2.000000f, 15.100000f, 1.300000f, 13.900001f, 0.800000f);
            path_1.cubicTo(12.700000f, 0.300000f, 11.400001f, 0.000000f, 10.000000f, 0.000000f);
            path_1.cubicTo(8.599999f, 0.000000f, 7.300000f, 0.300000f, 6.100000f, 0.800000f);
            path_1.cubicTo(5.800000f, 0.900000f, 5.500000f, 1.100000f, 5.200000f, 1.200000f);
            path_1.cubicTo(5.100000f, 1.200000f, 5.100000f, 1.200000f, 5.000000f, 1.300000f);
            path_1.cubicTo(5.000000f, 1.300000f, 5.000000f, 1.300000f, 5.000000f, 1.300000f);
            path_1.cubicTo(4.300001f, 1.700000f, 3.600000f, 2.300000f, 2.900000f, 2.900000f);
            path_1.cubicTo(2.000000f, 3.800000f, 1.300000f, 4.900000f, 0.800000f, 6.100000f);
            path_1.cubicTo(0.300000f, 7.300000f, 0.000000f, 8.600000f, 0.000000f, 10.000000f);
            path_1.cubicTo(0.000000f, 11.400000f, 0.300000f, 12.700000f, 0.800000f, 13.900000f);
            path_1.cubicTo(1.200000f, 14.799999f, 1.700000f, 15.599999f, 2.200000f, 16.299999f);
            path_1.cubicTo(2.300000f, 16.400000f, 2.400000f, 16.500000f, 2.400000f, 16.599998f);
            path_1.cubicTo(2.600000f, 16.799999f, 2.700000f, 16.999998f, 2.900000f, 17.099998f);
            path_1.cubicTo(3.800000f, 17.999998f, 4.900000f, 18.699999f, 6.100000f, 19.199999f);
            path_1.cubicTo(7.300000f, 19.700001f, 8.600000f, 20.000000f, 10.000000f, 20.000000f);
            path_1.cubicTo(11.400000f, 20.000000f, 12.700000f, 19.700001f, 13.900000f, 19.200001f);
            path_1.cubicTo(15.099999f, 18.700001f, 16.199999f, 18.000000f, 17.100000f, 17.100000f);
            path_1.cubicTo(18.000000f, 16.200001f, 18.700001f, 15.100000f, 19.200001f, 13.900001f);
            path_1.cubicTo(19.700001f, 12.700001f, 20.000000f, 11.400001f, 20.000000f, 10.000000f);
            path_1.cubicTo(20.000000f, 8.599999f, 19.700001f, 7.300000f, 19.200001f, 6.100000f);
            path_1.close();
            path_1.moveTo(16.100000f, 17.400000f);
            path_1.cubicTo(12.600000f, 19.199999f, 10.400000f, 18.799999f, 10.300000f, 18.699999f);
            path_1.cubicTo(10.200000f, 18.400000f, 9.900001f, 17.799999f, 9.800000f, 17.400000f);
            path_1.cubicTo(10.200000f, 17.299999f, 11.400001f, 16.699999f, 12.900001f, 14.500000f);
            path_1.cubicTo(12.900001f, 14.500000f, 12.900001f, 14.500000f, 12.900001f, 14.500000f);
            path_1.cubicTo(13.100000f, 14.500000f, 13.300000f, 14.500000f, 13.600000f, 14.500000f);
            path_1.cubicTo(14.500000f, 14.500000f, 15.600000f, 14.400000f, 16.100000f, 14.200000f);
            path_1.cubicTo(16.100000f, 14.200000f, 16.100000f, 14.200000f, 16.100000f, 14.200000f);
            path_1.cubicTo(16.600000f, 15.099999f, 16.800001f, 16.100000f, 16.800001f, 16.299999f);
            path_1.cubicTo(16.600000f, 16.700001f, 16.200001f, 17.200001f, 16.100000f, 17.400000f);
            path_1.close();
            path_1.moveTo(4.800000f, 11.900001f);
            path_1.lineTo(7.300000f, 9.400001f);
            path_1.cubicTo(7.300000f, 9.400001f, 7.300000f, 9.400001f, 7.400000f, 9.400001f);
            path_1.cubicTo(7.400000f, 9.400001f, 10.800000f, 10.500001f, 11.800000f, 10.800000f);
            path_1.cubicTo(11.800000f, 10.800000f, 11.800000f, 10.800000f, 11.900001f, 10.800000f);
            path_1.cubicTo(11.900001f, 10.800000f, 11.900001f, 10.800000f, 11.900001f, 10.800000f);
            path_1.lineTo(12.700001f, 14.100000f);
            path_1.cubicTo(12.700001f, 14.100000f, 12.700001f, 14.200001f, 12.600000f, 14.300000f);
            path_1.cubicTo(10.900001f, 16.700001f, 9.600000f, 17.100000f, 9.500000f, 17.100000f);
            path_1.cubicTo(9.500000f, 17.100000f, 9.500000f, 17.100000f, 9.500000f, 17.100000f);
            path_1.cubicTo(9.500000f, 17.100000f, 9.400000f, 17.100000f, 9.400000f, 17.100000f);
            path_1.cubicTo(7.900000f, 17.100000f, 6.400000f, 16.300001f, 5.900000f, 15.900001f);
            path_1.cubicTo(5.900000f, 15.900001f, 5.800000f, 15.800000f, 5.800000f, 15.800000f);
            path_1.cubicTo(5.800000f, 15.800000f, 4.700000f, 14.300000f, 4.800000f, 12.000000f);
            path_1.cubicTo(4.800000f, 12.000000f, 4.800000f, 11.900001f, 4.800000f, 11.900001f);
            path_1.close();
            path_1.moveTo(5.100000f, 1.600000f);
            path_1.cubicTo(5.100000f, 1.600000f, 5.100000f, 1.600000f, 5.100000f, 1.600000f);
            path_1.cubicTo(5.100000f, 1.600000f, 5.200000f, 1.600000f, 5.100000f, 1.600000f);
            path_1.cubicTo(7.600000f, 0.300000f, 9.400000f, 1.200000f, 9.500000f, 1.300000f);
            path_1.cubicTo(9.500000f, 1.300000f, 9.500000f, 1.300000f, 9.500000f, 1.300000f);
            path_1.lineTo(9.800000f, 2.600000f);
            path_1.cubicTo(7.800000f, 3.500000f, 6.500000f, 5.300000f, 6.500000f, 5.400000f);
            path_1.cubicTo(6.500000f, 5.400000f, 6.500000f, 5.400000f, 6.500000f, 5.400000f);
            path_1.cubicTo(6.300000f, 5.400000f, 6.000000f, 5.300000f, 5.600000f, 5.300000f);
            path_1.cubicTo(4.900000f, 5.400000f, 4.000000f, 5.500000f, 3.300000f, 5.900000f);
            path_1.cubicTo(3.200000f, 5.700000f, 3.000000f, 4.600000f, 3.300000f, 3.600000f);
            path_1.cubicTo(3.500000f, 3.300000f, 4.000000f, 2.600000f, 4.500000f, 2.000000f);
            path_1.cubicTo(4.500000f, 2.000000f, 4.500000f, 2.000000f, 4.500000f, 2.000000f);
            path_1.cubicTo(4.600000f, 1.900000f, 4.900000f, 1.800000f, 5.100000f, 1.600000f);
            path_1.close();
            path_1.moveTo(14.700000f, 8.300000f);
            path_1.cubicTo(13.900000f, 8.800000f, 12.400000f, 10.200000f, 12.000000f, 10.600000f);
            path_1.cubicTo(12.000000f, 10.600000f, 12.000000f, 10.600000f, 12.000000f, 10.600000f);
            path_1.cubicTo(11.000000f, 10.200001f, 7.600000f, 9.200001f, 7.600000f, 9.200001f);
            path_1.cubicTo(7.600000f, 9.200001f, 7.600000f, 9.200001f, 7.500000f, 9.200001f);
            path_1.lineTo(6.700000f, 5.800000f);
            path_1.cubicTo(6.700000f, 5.800000f, 6.700000f, 5.700000f, 6.800000f, 5.600000f);
            path_1.cubicTo(6.800000f, 5.600000f, 8.200000f, 3.700000f, 10.100000f, 2.800000f);
            path_1.cubicTo(10.100000f, 2.800000f, 10.100000f, 2.800000f, 10.100000f, 2.800000f);
            path_1.cubicTo(10.500000f, 2.800000f, 11.900001f, 2.900000f, 13.800000f, 4.100000f);
            path_1.cubicTo(13.800000f, 4.100000f, 13.800000f, 4.100000f, 13.800000f, 4.100000f);
            path_1.cubicTo(14.900001f, 6.600000f, 14.700000f, 8.200000f, 14.700000f, 8.300000f);
            path_1.cubicTo(14.600000f, 8.200000f, 14.600000f, 8.300000f, 14.700000f, 8.300000f);
            path_1.close();
            path_1.moveTo(17.300001f, 10.100000f);
            path_1.cubicTo(17.300001f, 10.100000f, 17.300001f, 10.100000f, 17.300001f, 10.100000f);
            path_1.cubicTo(16.700001f, 9.300000f, 15.600001f, 8.500000f, 14.900002f, 8.300000f);
            path_1.cubicTo(14.900002f, 8.300000f, 14.900002f, 8.300000f, 14.900002f, 8.300000f);
            path_1.cubicTo(14.900002f, 8.200000f, 15.100001f, 6.600000f, 13.900002f, 4.100000f);
            path_1.cubicTo(14.100001f, 4.000000f, 14.300001f, 3.800000f, 14.500002f, 3.700000f);
            path_1.cubicTo(14.700002f, 3.500000f, 15.000002f, 3.400000f, 15.200002f, 3.200000f);
            path_1.cubicTo(15.700002f, 3.500000f, 18.000002f, 4.800000f, 18.900002f, 7.400000f);
            path_1.cubicTo(18.900002f, 7.400000f, 18.900002f, 7.400000f, 18.900002f, 7.400000f);
            path_1.cubicTo(18.900002f, 7.700000f, 18.900002f, 8.300000f, 18.900002f, 8.700000f);
            path_1.cubicTo(18.900002f, 8.700000f, 18.900002f, 8.700000f, 18.900002f, 8.700000f);
            path_1.cubicTo(18.700001f, 9.600000f, 17.700001f, 10.100000f, 17.300001f, 10.100000f);
            path_1.close();
            path_1.moveTo(10.000000f, 0.300000f);
            path_1.cubicTo(14.200001f, 0.300000f, 17.799999f, 3.000000f, 19.100000f, 6.700000f);
            path_1.cubicTo(18.500000f, 5.400000f, 17.600000f, 4.500000f, 16.900000f, 3.900000f);
            path_1.cubicTo(16.100000f, 3.200000f, 15.400000f, 2.900000f, 15.299999f, 2.800000f);
            path_1.cubicTo(14.799999f, 2.000000f, 13.199999f, 0.600000f, 11.199999f, 0.600000f);
            path_1.cubicTo(10.599998f, 0.600000f, 10.099998f, 0.700000f, 9.499999f, 0.900000f);
            path_1.cubicTo(9.499999f, 0.900000f, 9.499999f, 0.900000f, 9.499999f, 0.900000f);
            path_1.cubicTo(9.600000f, 1.000000f, 8.800000f, 0.600000f, 7.500000f, 0.600000f);
            path_1.cubicTo(8.300000f, 0.400000f, 9.100000f, 0.300000f, 10.000000f, 0.300000f);
            path_1.close();
            path_1.moveTo(2.300000f, 4.100000f);
            path_1.cubicTo(2.300000f, 4.100000f, 2.300000f, 4.100000f, 2.300000f, 4.100000f);
            path_1.cubicTo(2.300000f, 4.100000f, 2.300000f, 4.100000f, 2.300000f, 4.100000f);
            path_1.cubicTo(2.500000f, 4.000000f, 2.700000f, 4.000000f, 2.900000f, 3.900000f);
            path_1.cubicTo(2.700000f, 5.000000f, 2.900000f, 6.000000f, 3.000000f, 6.100000f);
            path_1.cubicTo(3.000000f, 6.100000f, 3.000000f, 6.200000f, 3.000000f, 6.200000f);
            path_1.cubicTo(2.500000f, 7.000000f, 2.100000f, 8.400001f, 2.000000f, 9.700000f);
            path_1.cubicTo(2.000000f, 9.700000f, 2.000000f, 9.700000f, 2.000000f, 9.700000f);
            path_1.cubicTo(1.400000f, 10.000000f, 0.800000f, 10.599999f, 0.600000f, 10.900000f);
            path_1.cubicTo(0.500000f, 10.799999f, 0.400000f, 10.700000f, 0.400000f, 10.599999f);
            path_1.cubicTo(0.400000f, 10.599999f, 0.400000f, 10.599999f, 0.400000f, 10.499999f);
            path_1.cubicTo(0.400000f, 10.299999f, 0.400000f, 10.099999f, 0.400000f, 9.999999f);
            path_1.cubicTo(0.300000f, 7.800000f, 1.000000f, 5.700000f, 2.300000f, 4.100000f);
            path_1.close();
            path_1.moveTo(0.600000f, 12.500000f);
            path_1.cubicTo(0.600000f, 12.500000f, 0.600000f, 11.800000f, 0.700000f, 11.300000f);
            path_1.cubicTo(0.800000f, 11.100000f, 1.400000f, 10.300000f, 2.100000f, 10.000000f);
            path_1.cubicTo(2.100000f, 10.000000f, 2.100000f, 10.000000f, 2.100000f, 10.000000f);
            path_1.cubicTo(2.500000f, 10.500000f, 3.700000f, 11.500000f, 4.400000f, 12.000000f);
            path_1.cubicTo(4.400000f, 12.000000f, 4.400000f, 12.100000f, 4.400000f, 12.100000f);
            path_1.cubicTo(4.300000f, 14.200001f, 5.200000f, 15.700001f, 5.400000f, 16.100000f);
            path_1.cubicTo(5.200000f, 16.300001f, 4.700000f, 16.800001f, 4.400000f, 17.000000f);
            path_1.cubicTo(4.300000f, 17.000000f, 4.300000f, 17.000000f, 4.200000f, 17.000000f);
            path_1.cubicTo(4.000000f, 17.000000f, 3.400000f, 16.900000f, 2.500000f, 16.299999f);
            path_1.cubicTo(1.600000f, 15.299999f, 1.000000f, 13.999999f, 0.600000f, 12.699999f);
            path_1.cubicTo(0.600000f, 12.600000f, 0.600000f, 12.500000f, 0.600000f, 12.500000f);
            path_1.close();
            path_1.moveTo(4.200000f, 17.300001f);
            path_1.cubicTo(4.300000f, 17.300001f, 4.300000f, 17.300001f, 4.400000f, 17.300001f);
            path_1.cubicTo(4.700000f, 17.700001f, 5.300000f, 18.500002f, 5.400000f, 18.600000f);
            path_1.cubicTo(4.700000f, 18.200001f, 4.000000f, 17.700001f, 3.400000f, 17.100000f);
            path_1.cubicTo(3.700000f, 17.200001f, 4.000000f, 17.300001f, 4.200000f, 17.300001f);
            path_1.close();
            path_1.moveTo(10.000000f, 19.700001f);
            path_1.cubicTo(9.400000f, 19.700001f, 8.900000f, 19.700001f, 8.300000f, 19.600000f);
            path_1.cubicTo(9.000000f, 19.500000f, 9.800000f, 19.300001f, 10.100000f, 19.100000f);
            path_1.cubicTo(10.100000f, 19.100000f, 10.100000f, 19.100000f, 10.100000f, 19.100000f);
            path_1.cubicTo(10.100000f, 19.100000f, 10.500000f, 19.200001f, 11.000000f, 19.200001f);
            path_1.cubicTo(11.900000f, 19.200001f, 13.300000f, 19.000000f, 15.100000f, 18.200001f);
            path_1.cubicTo(13.700000f, 19.200001f, 11.900001f, 19.700001f, 10.000000f, 19.700001f);
            path_1.close();
            path_1.moveTo(17.600000f, 16.000000f);
            path_1.cubicTo(17.600000f, 16.000000f, 17.600000f, 16.000000f, 17.600000f, 16.000000f);
            path_1.cubicTo(17.400000f, 16.100000f, 17.200001f, 16.100000f, 17.000000f, 16.200001f);
            path_1.cubicTo(16.900000f, 15.800001f, 16.799999f, 14.900001f, 16.299999f, 14.100000f);
            path_1.cubicTo(16.299999f, 14.100000f, 16.299999f, 14.100000f, 16.299999f, 14.000000f);
            path_1.cubicTo(17.299999f, 12.100000f, 17.299999f, 11.400000f, 17.400000f, 10.500000f);
            path_1.cubicTo(17.400000f, 10.500000f, 17.400000f, 10.400000f, 17.400000f, 10.400000f);
            path_1.cubicTo(17.900000f, 10.400000f, 18.799999f, 9.900000f, 19.299999f, 9.000000f);
            path_1.cubicTo(19.500000f, 9.400000f, 19.699999f, 9.900000f, 19.699999f, 9.900000f);
            path_1.cubicTo(19.699999f, 9.900000f, 19.699999f, 10.000000f, 19.699999f, 10.000000f);
            path_1.cubicTo(19.700001f, 12.300000f, 18.900000f, 14.400001f, 17.600000f, 16.000000f);
            path_1.close();
            path_1.setFillType(Path.FillType.WINDING);
            canvas.drawPath(path_1, paint_0);
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
