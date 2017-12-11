package com.tactical.creator.components;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.tactical.creator.utis.*;
import com.facebook.react.uimanager.ThemedReactContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigDecimal;

public class Baliza {
    int[] auxColor;

    private CustomAnimation CustomAnimation = new CustomAnimation();

    public static final float WIDTH = 1000.000000f;
    public static final float HEIGHT = 456.000000f;


    private boolean inited;
    private Paint paint_0;
    private Paint paint_1;
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

    private Paint paint_11;
    private Path path_9;


    private Paint paint_12;
    private Path path_10;

    private Paint paint_13;
    private Path path_11;

    private Paint paint_14;
    private Path path_12;

    private Paint paint_15;
    private Path path_13;

    private Paint paint_16;
    private Path path_14;

    private Paint paint_17;
    private Path path_15;

    private Paint paint_18;
    private Path path_16;

    private Paint paint_19;
    private Path path_17;

    private Paint paint_20;
    private Path path_18;

    private Paint paint_21;
    private Path path_19;

    private Paint paint_22;
    private Path path_20;

    private Paint paint_23;
    private Path path_21;

    private Paint paint_24;
    private Path path_22;

    private Paint paint_25;
    private Path path_23;

    private Paint paint_26;
    private Path path_24;

    private Paint paint_27;
    private Path path_25;

    private Paint paint_28;
    private Path path_26;

    private Paint paint_29;
    private Path path_27;

    private Paint paint_30;
    private Path path_28;

    private Paint paint_31;
    private Path path_29;

    private Paint paint_32;
    private Path path_30;

    private Paint paint_33;
    private Path path_31;


    private Paint paint_34;
    private Path path_32;


    private Paint paint_35;
    private Path path_33;

    private Paint paint_36;
    private Path path_34;

    private Paint paint_37;
    private Path path_35;

    private Paint paint_38;
    private Path path_36;



    private void init() {
        if (inited) return;
        inited = true;
        paint_0 = new Paint();
        paint_1 = new Paint();
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

        paint_11 = new Paint();
        path_9 = new Path();


        paint_12 = new Paint();
        path_10 = new Path();

        paint_13 = new Paint();
        path_11 = new Path();

        paint_14 = new Paint();
        path_12 = new Path();

        paint_15 = new Paint();
        path_13 = new Path();

        paint_16 = new Paint();
        path_14 = new Path();

        paint_17 = new Paint();
        path_15 = new Path();

        paint_18 = new Paint();
        path_16 = new Path();

        paint_19 = new Paint();
        path_17 = new Path();

        paint_20 = new Paint();
        path_18 = new Path();

        paint_21 = new Paint();
        path_19 = new Path();

        paint_22 = new Paint();
        path_20 = new Path();

        paint_23 = new Paint();
        path_21 = new Path();

        paint_24 = new Paint();
        path_22 = new Path();

        paint_25 = new Paint();
        path_23 = new Path();

        paint_26 = new Paint();
        path_24 = new Path();

        paint_27 = new Paint();
        path_25 = new Path();

        paint_28 = new Paint();
        path_26 = new Path();

        paint_29 = new Paint();
        path_27 = new Path();

        paint_30 = new Paint();
        path_28 = new Path();

        paint_31 = new Paint();
        path_29 = new Path();

        paint_32 = new Paint();
        path_30 = new Path();

        paint_33 = new Paint();
        path_31 = new Path();


        paint_34 = new Paint();
        path_32 = new Path();


        paint_35 = new Paint();
        path_33 = new Path();

        paint_36 = new Paint();
        path_34 = new Path();

        paint_37 = new Paint();
        path_35 = new Path();

        paint_38 = new Paint();
        path_36 = new Path();


    }
    public void create(ThemedReactContext context, RelativeLayout base_svg, JSONObject player, Integer screenHeight, Integer screenWidth, Integer velocity, float[] lastPosition,  float testeScaleWIDTH, float testeScaleHEIGHT, Integer testeWIDTH, Integer testeHEIGHT) {
        try {

            float scale = 1;
            scale = BigDecimal.valueOf(player.getDouble("scale")).floatValue();

            int realWidth = (int) (85 * scale);
            int realHeight = (int) (40 * scale);


            Bitmap b  = Bitmap.createBitmap((int) realWidth, (int) realHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(b);


            init();
            canvas.save();
            canvas.scale(realWidth / WIDTH, realHeight / HEIGHT);
            paint_0.reset();
            paint_0.setFlags(Paint.ANTI_ALIAS_FLAG | Paint.DEV_KERN_TEXT_FLAG | Paint.SUBPIXEL_TEXT_FLAG);
            paint_0.setStyle(Paint.Style.FILL);
            paint_0.setTypeface(Typeface.DEFAULT);
            paint_1.reset();
            paint_1.setFlags(Paint.ANTI_ALIAS_FLAG | Paint.DEV_KERN_TEXT_FLAG | Paint.SUBPIXEL_TEXT_FLAG);
            paint_1.setStyle(Paint.Style.STROKE);
            paint_1.setTypeface(Typeface.DEFAULT);
            paint_0.setColor(0xff000000);
            paint_1.setStrokeWidth(1.000000f);
            paint_1.setStrokeCap(Paint.Cap.BUTT);
            paint_1.setStrokeJoin(Paint.Join.MITER);
            paint_1.setStrokeMiter(4.000000f);
            paint_1.setPathEffect(null);
            paint_0.setTextSize(16.000000f);
            paint_1.setTextSize(16.000000f);
            paint_0.setTypeface(typeface_0);
            paint_1.setTypeface(typeface_0);
            paint_0.setStrikeThruText(false);
            paint_0.setUnderlineText(false);
            paint_1.setStrikeThruText(false);
            paint_1.setUnderlineText(false);


            canvas.save();
            paint_2.reset();
            paint_2.set(paint_1);
            paint_2.setColor(0xffd1d2d3);
            paint_2.setStrokeWidth(4.000000f);
            paint_2.setStrokeMiter(10.000000f);
            path_0.reset();
            path_0.moveTo(19.400000f, 452.899994f);
            path_0.lineTo(980.600037f, 452.899994f);


            canvas.drawPath(path_0, paint_2);
            canvas.restore();
            canvas.save();
            paint_3.reset();
            paint_3.set(paint_1);
            paint_3.setColor(0xffd1d2d3);
            paint_3.setStrokeWidth(4.000000f);
            paint_3.setStrokeMiter(10.000000f);
            path_1.reset();
            path_1.moveTo(19.400000f, 406.600006f);
            path_1.lineTo(980.600037f, 406.600006f);


            canvas.drawPath(path_1, paint_3);
            canvas.restore();
            canvas.save();
            paint_4.reset();
            paint_4.set(paint_1);
            paint_4.setColor(0xffd1d2d3);
            paint_4.setStrokeWidth(4.000000f);
            paint_4.setStrokeMiter(10.000000f);
            path_2.reset();
            path_2.moveTo(19.400000f, 360.399994f);
            path_2.lineTo(980.600037f, 360.399994f);


            canvas.drawPath(path_2, paint_4);
            canvas.restore();
            canvas.save();
            paint_5.reset();
            paint_5.set(paint_1);
            paint_5.setColor(0xffd1d2d3);
            paint_5.setStrokeWidth(4.000000f);
            paint_5.setStrokeMiter(10.000000f);
            path_3.reset();
            path_3.moveTo(19.400000f, 314.200012f);
            path_3.lineTo(980.600037f, 314.200012f);


            canvas.drawPath(path_3, paint_5);
            canvas.restore();
            canvas.save();
            paint_6.reset();
            paint_6.set(paint_1);
            paint_6.setColor(0xffd1d2d3);
            paint_6.setStrokeWidth(4.000000f);
            paint_6.setStrokeMiter(10.000000f);
            path_4.reset();
            path_4.moveTo(19.400000f, 267.899994f);
            path_4.lineTo(980.600037f, 267.899994f);


            canvas.drawPath(path_4, paint_6);
            canvas.restore();
            canvas.save();
            paint_7.reset();
            paint_7.set(paint_1);
            paint_7.setColor(0xffd1d2d3);
            paint_7.setStrokeWidth(4.000000f);
            paint_7.setStrokeMiter(10.000000f);
            path_5.reset();
            path_5.moveTo(19.400000f, 221.699997f);
            path_5.lineTo(980.600037f, 221.699997f);


            canvas.drawPath(path_5, paint_7);
            canvas.restore();
            canvas.save();
            paint_8.reset();
            paint_8.set(paint_1);
            paint_8.setColor(0xffd1d2d3);
            paint_8.setStrokeWidth(4.000000f);
            paint_8.setStrokeMiter(10.000000f);
            path_6.reset();
            path_6.moveTo(19.400000f, 175.400009f);
            path_6.lineTo(980.600037f, 175.400009f);


            canvas.drawPath(path_6, paint_8);
            canvas.restore();
            canvas.save();
            paint_9.reset();
            paint_9.set(paint_1);
            paint_9.setColor(0xffd1d2d3);
            paint_9.setStrokeWidth(4.000000f);
            paint_9.setStrokeMiter(10.000000f);
            path_7.reset();
            path_7.moveTo(19.400000f, 129.199997f);
            path_7.lineTo(980.600037f, 129.199997f);


            canvas.drawPath(path_7, paint_9);
            canvas.restore();
            canvas.save();
            paint_10.reset();
            paint_10.set(paint_1);
            paint_10.setColor(0xffd1d2d3);
            paint_10.setStrokeWidth(4.000000f);
            paint_10.setStrokeMiter(10.000000f);
            path_8.reset();
            path_8.moveTo(19.400000f, 83.000000f);
            path_8.lineTo(980.600037f, 83.000000f);


            canvas.drawPath(path_8, paint_10);
            canvas.restore();
            canvas.save();
            paint_11.reset();
            paint_11.set(paint_1);
            paint_11.setColor(0xffd1d2d3);
            paint_11.setStrokeWidth(4.000000f);
            paint_11.setStrokeMiter(10.000000f);
            path_9.reset();
            path_9.moveTo(19.400000f, 36.700001f);
            path_9.lineTo(980.600037f, 36.700001f);


            canvas.drawPath(path_9, paint_11);
            canvas.restore();


            canvas.save();
            paint_12.reset();
            paint_12.set(paint_1);
            paint_12.setColor(0xffd1d2d3);
            paint_12.setStrokeWidth(4.000000f);
            paint_12.setStrokeMiter(10.000000f);
            path_10.reset();
            path_10.moveTo(19.400000f, 36.700001f);
            path_10.lineTo(19.400000f, 452.899994f);


            canvas.drawPath(path_10, paint_12);
            canvas.restore();
            canvas.save();
            paint_13.reset();
            paint_13.set(paint_1);
            paint_13.setColor(0xffd1d2d3);
            paint_13.setStrokeWidth(4.000000f);
            paint_13.setStrokeMiter(10.000000f);
            path_11.reset();
            path_11.moveTo(65.200005f, 36.700001f);
            path_11.lineTo(65.200005f, 452.899994f);


            canvas.drawPath(path_11, paint_13);
            canvas.restore();
            canvas.save();
            paint_14.reset();
            paint_14.set(paint_1);
            paint_14.setColor(0xffd1d2d3);
            paint_14.setStrokeWidth(4.000000f);
            paint_14.setStrokeMiter(10.000000f);
            path_12.reset();
            path_12.moveTo(110.900002f, 36.700001f);
            path_12.lineTo(110.900002f, 452.899994f);


            canvas.drawPath(path_12, paint_14);
            canvas.restore();
            canvas.save();
            paint_15.reset();
            paint_15.set(paint_1);
            paint_15.setColor(0xffd1d2d3);
            paint_15.setStrokeWidth(4.000000f);
            paint_15.setStrokeMiter(10.000000f);
            path_13.reset();
            path_13.moveTo(156.699997f, 36.700001f);
            path_13.lineTo(156.699997f, 452.899994f);


            canvas.drawPath(path_13, paint_15);
            canvas.restore();
            canvas.save();
            paint_16.reset();
            paint_16.set(paint_1);
            paint_16.setColor(0xffd1d2d3);
            paint_16.setStrokeWidth(4.000000f);
            paint_16.setStrokeMiter(10.000000f);
            path_14.reset();
            path_14.moveTo(202.500000f, 36.700001f);
            path_14.lineTo(202.500000f, 452.899994f);


            canvas.drawPath(path_14, paint_16);
            canvas.restore();
            canvas.save();
            paint_17.reset();
            paint_17.set(paint_1);
            paint_17.setColor(0xffd1d2d3);
            paint_17.setStrokeWidth(4.000000f);
            paint_17.setStrokeMiter(10.000000f);
            path_15.reset();
            path_15.moveTo(248.300003f, 36.700001f);
            path_15.lineTo(248.300003f, 452.899994f);


            canvas.drawPath(path_15, paint_17);
            canvas.restore();
            canvas.save();
            paint_18.reset();
            paint_18.set(paint_1);
            paint_18.setColor(0xffd1d2d3);
            paint_18.setStrokeWidth(4.000000f);
            paint_18.setStrokeMiter(10.000000f);
            path_16.reset();
            path_16.moveTo(294.000000f, 36.700001f);
            path_16.lineTo(294.000000f, 452.899994f);


            canvas.drawPath(path_16, paint_18);
            canvas.restore();
            canvas.save();
            paint_19.reset();
            paint_19.set(paint_1);
            paint_19.setColor(0xffd1d2d3);
            paint_19.setStrokeWidth(4.000000f);
            paint_19.setStrokeMiter(10.000000f);
            path_17.reset();
            path_17.moveTo(339.800018f, 36.700001f);
            path_17.lineTo(339.800018f, 452.899994f);


            canvas.drawPath(path_17, paint_19);
            canvas.restore();
            canvas.save();
            paint_20.reset();
            paint_20.set(paint_1);
            paint_20.setColor(0xffd1d2d3);
            paint_20.setStrokeWidth(4.000000f);
            paint_20.setStrokeMiter(10.000000f);
            path_18.reset();
            path_18.moveTo(385.600006f, 36.700001f);
            path_18.lineTo(385.600006f, 452.899994f);


            canvas.drawPath(path_18, paint_20);
            canvas.restore();
            canvas.save();
            paint_21.reset();
            paint_21.set(paint_1);
            paint_21.setColor(0xffd1d2d3);
            paint_21.setStrokeWidth(4.000000f);
            paint_21.setStrokeMiter(10.000000f);
            path_19.reset();
            path_19.moveTo(431.300018f, 36.700001f);
            path_19.lineTo(431.300018f, 452.899994f);


            canvas.drawPath(path_19, paint_21);
            canvas.restore();
            canvas.save();
            paint_22.reset();
            paint_22.set(paint_1);
            paint_22.setColor(0xffd1d2d3);
            paint_22.setStrokeWidth(4.000000f);
            paint_22.setStrokeMiter(10.000000f);
            path_20.reset();
            path_20.moveTo(477.100006f, 36.700001f);
            path_20.lineTo(477.100006f, 452.899994f);


            canvas.drawPath(path_20, paint_22);
            canvas.restore();
            canvas.save();
            paint_23.reset();
            paint_23.set(paint_1);
            paint_23.setColor(0xffd1d2d3);
            paint_23.setStrokeWidth(4.000000f);
            paint_23.setStrokeMiter(10.000000f);
            path_21.reset();
            path_21.moveTo(522.900024f, 36.700001f);
            path_21.lineTo(522.900024f, 452.899994f);


            canvas.drawPath(path_21, paint_23);
            canvas.restore();
            canvas.save();
            paint_24.reset();
            paint_24.set(paint_1);
            paint_24.setColor(0xffd1d2d3);
            paint_24.setStrokeWidth(4.000000f);
            paint_24.setStrokeMiter(10.000000f);
            path_22.reset();
            path_22.moveTo(568.700012f, 36.700001f);
            path_22.lineTo(568.700012f, 452.899994f);


            canvas.drawPath(path_22, paint_24);
            canvas.restore();
            canvas.save();
            paint_25.reset();
            paint_25.set(paint_1);
            paint_25.setColor(0xffd1d2d3);
            paint_25.setStrokeWidth(4.000000f);
            paint_25.setStrokeMiter(10.000000f);
            path_23.reset();
            path_23.moveTo(614.400024f, 36.700001f);
            path_23.lineTo(614.400024f, 452.899994f);


            canvas.drawPath(path_23, paint_25);
            canvas.restore();
            canvas.save();
            paint_26.reset();
            paint_26.set(paint_1);
            paint_26.setColor(0xffd1d2d3);
            paint_26.setStrokeWidth(4.000000f);
            paint_26.setStrokeMiter(10.000000f);
            path_24.reset();
            path_24.moveTo(660.200012f, 36.700001f);
            path_24.lineTo(660.200012f, 452.899994f);


            canvas.drawPath(path_24, paint_26);
            canvas.restore();
            canvas.save();
            paint_27.reset();
            paint_27.set(paint_1);
            paint_27.setColor(0xffd1d2d3);
            paint_27.setStrokeWidth(4.000000f);
            paint_27.setStrokeMiter(10.000000f);
            path_25.reset();
            path_25.moveTo(706.000000f, 36.700001f);
            path_25.lineTo(706.000000f, 452.899994f);


            canvas.drawPath(path_25, paint_27);
            canvas.restore();
            canvas.save();
            paint_28.reset();
            paint_28.set(paint_1);
            paint_28.setColor(0xffd1d2d3);
            paint_28.setStrokeWidth(4.000000f);
            paint_28.setStrokeMiter(10.000000f);
            path_26.reset();
            path_26.moveTo(751.700012f, 36.700001f);
            path_26.lineTo(751.700012f, 452.899994f);


            canvas.drawPath(path_26, paint_28);
            canvas.restore();
            canvas.save();
            paint_29.reset();
            paint_29.set(paint_1);
            paint_29.setColor(0xffd1d2d3);
            paint_29.setStrokeWidth(4.000000f);
            paint_29.setStrokeMiter(10.000000f);
            path_27.reset();
            path_27.moveTo(797.500000f, 36.700001f);
            path_27.lineTo(797.500000f, 452.899994f);


            canvas.drawPath(path_27, paint_29);
            canvas.restore();
            canvas.save();
            paint_30.reset();
            paint_30.set(paint_1);
            paint_30.setColor(0xffd1d2d3);
            paint_30.setStrokeWidth(4.000000f);
            paint_30.setStrokeMiter(10.000000f);
            path_28.reset();
            path_28.moveTo(843.299988f, 36.700001f);
            path_28.lineTo(843.299988f, 452.899994f);


            canvas.drawPath(path_28, paint_30);
            canvas.restore();
            canvas.save();
            paint_31.reset();
            paint_31.set(paint_1);
            paint_31.setColor(0xffd1d2d3);
            paint_31.setStrokeWidth(4.000000f);
            paint_31.setStrokeMiter(10.000000f);
            path_29.reset();
            path_29.moveTo(889.100037f, 36.700001f);
            path_29.lineTo(889.100037f, 452.899994f);


            canvas.drawPath(path_29, paint_31);
            canvas.restore();
            canvas.save();
            paint_32.reset();
            paint_32.set(paint_1);
            paint_32.setColor(0xffd1d2d3);
            paint_32.setStrokeWidth(4.000000f);
            paint_32.setStrokeMiter(10.000000f);
            path_30.reset();
            path_30.moveTo(934.799988f, 36.700001f);
            path_30.lineTo(934.799988f, 452.899994f);


            canvas.drawPath(path_30, paint_32);
            canvas.restore();
            canvas.save();
            paint_33.reset();
            paint_33.set(paint_1);
            paint_33.setColor(0xffd1d2d3);
            paint_33.setStrokeWidth(4.000000f);
            paint_33.setStrokeMiter(10.000000f);
            path_31.reset();
            path_31.moveTo(980.600037f, 36.700001f);
            path_31.lineTo(980.600037f, 452.899994f);


            canvas.drawPath(path_31, paint_33);
            canvas.restore();


            canvas.save();
            paint_34.reset();
            paint_34.set(paint_0);
            paint_34.setColor(0xffffffff);
            path_32.reset();
            path_32.moveTo(1000.000000f, 454.300018f);
            path_32.lineTo(961.200012f, 454.300018f);
            path_32.lineTo(961.200012f, 76.099998f);
            path_32.cubicTo(961.200012f, 56.500000f, 945.299988f, 40.499996f, 925.600037f, 40.499996f);
            path_32.lineTo(74.300003f, 40.499996f);
            path_32.cubicTo(54.700005f, 40.499996f, 38.700001f, 56.399998f, 38.700001f, 76.099998f);
            path_32.lineTo(38.700001f, 454.300018f);
            path_32.lineTo(0.000000f, 454.300018f);
            path_32.lineTo(0.000000f, 76.099998f);
            path_32.cubicTo(0.000000f, 35.099998f, 33.299999f, 1.799995f, 74.300003f, 1.799995f);
            path_32.lineTo(925.599976f, 1.799995f);
            path_32.cubicTo(966.599976f, 1.799995f, 999.899963f, 35.099995f, 999.899963f, 76.099998f);
            path_32.lineTo(999.899963f, 454.300018f);
            path_32.lineTo(1000.000000f, 454.300018f);
            path_32.close();


            path_32.setFillType(Path.FillType.WINDING);
            canvas.drawPath(path_32, paint_34);
            canvas.restore();


            canvas.save();
            paint_35.reset();
            paint_35.set(paint_0);
            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"),false);
            paint_35.setARGB(auxColor[0],auxColor[1],auxColor[2],auxColor[3]);

            path_33.reset();
            path_33.moveTo(961.200012f, 117.000000f);
            path_33.lineTo(1000.000000f, 117.000000f);
            path_33.lineTo(1000.000000f, 176.500000f);
            path_33.lineTo(961.200012f, 176.500000f);
            path_33.lineTo(961.200012f, 117.000000f);
            path_33.close();


            canvas.drawPath(path_33, paint_35);
            canvas.restore();
            canvas.save();
            paint_36.reset();
            paint_36.set(paint_0);
            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"),false);
            paint_36.setARGB(auxColor[0],auxColor[1],auxColor[2],auxColor[3]);
            path_34.reset();
            path_34.moveTo(0.000000f, 117.000000f);
            path_34.lineTo(38.799999f, 117.000000f);
            path_34.lineTo(38.799999f, 176.500000f);
            path_34.lineTo(0.000000f, 176.500000f);
            path_34.lineTo(0.000000f, 117.000000f);
            path_34.close();


            canvas.drawPath(path_34, paint_36);
            canvas.restore();
            canvas.save();
            paint_37.reset();
            paint_37.set(paint_0);

            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"),false);
            paint_37.setARGB(auxColor[0],auxColor[1],auxColor[2],auxColor[3]);
            path_35.reset();
            path_35.moveTo(961.200012f, 394.800018f);
            path_35.lineTo(1000.000000f, 394.800018f);
            path_35.lineTo(1000.000000f, 454.300018f);
            path_35.lineTo(961.200012f, 454.300018f);
            path_35.lineTo(961.200012f, 394.800018f);
            path_35.close();


            canvas.drawPath(path_35, paint_37);
            canvas.restore();
            canvas.save();
            paint_38.reset();
            paint_38.set(paint_0);
            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"),false);
            paint_38.setARGB(auxColor[0],auxColor[1],auxColor[2],auxColor[3]);
            path_36.reset();
            path_36.moveTo(0.000000f, 394.800018f);
            path_36.lineTo(38.799999f, 394.800018f);
            path_36.lineTo(38.799999f, 454.300018f);
            path_36.lineTo(0.000000f, 454.300018f);
            path_36.lineTo(0.000000f, 394.800018f);
            path_36.close();


            canvas.drawPath(path_36, paint_38);
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

            CustomAnimation.justDoIt(context, myImage, arrayPosition, screenHeight, screenWidth, velocity, (float) player.getInt("rotation"), (CustomAnimation.convertDpToPixels(0.0f,context) * scale),(CustomAnimation.convertDpToPixels(1.0f,context) * scale));

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
