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
import com.tactical.creator.utis.CustomAnimation;

import org.json.JSONArray;
import org.json.JSONObject;

import java.math.BigDecimal;

/**
 * Created by macmini on 08/11/2017.
 */

public class BalizaCircular {
    int[] auxColor;

    public static final float WIDTH = 1000.000000f;
    public static final float HEIGHT = 537.299988f;

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

    private CustomAnimation CustomAnimation = new CustomAnimation();

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

    }

    public void create(ThemedReactContext context, RelativeLayout base_svg, JSONObject player, Integer screenHeight, Integer screenWidth, Integer velocity, float[] lastPosition) {

        try {
            float scale = 1;
            scale = BigDecimal.valueOf(player.getDouble("scale")).floatValue();

            int realWidth = (int) (50 * scale);
            int realHeight = (int) (25 * scale);

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
            path_0.moveTo(951.000000f, 537.299988f);

            canvas.drawPath(path_0, paint_2);
            canvas.restore();
            canvas.save();
            paint_3.reset();
            paint_3.set(paint_1);
            paint_3.setColor(0xffd1d2d3);
            paint_3.setStrokeWidth(4.000000f);
            paint_3.setStrokeMiter(10.000000f);
            path_1.reset();
            path_1.moveTo(29.000000f, 448.300018f);
            path_1.lineTo(951.000000f, 448.300018f);

            canvas.drawPath(path_1, paint_3);
            canvas.restore();
            canvas.save();
            paint_4.reset();
            paint_4.set(paint_1);
            paint_4.setColor(0xffd1d2d3);
            paint_4.setStrokeWidth(4.000000f);
            paint_4.setStrokeMiter(10.000000f);
            path_2.reset();
            path_2.moveTo(38.400002f, 359.300018f);
            path_2.lineTo(951.000000f, 359.300018f);

            canvas.drawPath(path_2, paint_4);
            canvas.restore();
            canvas.save();
            paint_5.reset();
            paint_5.set(paint_1);
            paint_5.setColor(0xffd1d2d3);
            paint_5.setStrokeWidth(4.000000f);
            paint_5.setStrokeMiter(10.000000f);
            path_3.reset();
            path_3.moveTo(88.800003f, 270.300018f);
            path_3.lineTo(900.600037f, 270.300018f);

            canvas.drawPath(path_3, paint_5);
            canvas.restore();
            canvas.save();
            paint_6.reset();
            paint_6.set(paint_1);
            paint_6.setColor(0xffd1d2d3);
            paint_6.setStrokeWidth(4.000000f);
            paint_6.setStrokeMiter(10.000000f);
            path_4.reset();
            path_4.moveTo(169.000000f, 181.300003f);
            path_4.lineTo(852.400024f, 181.300003f);

            canvas.drawPath(path_4, paint_6);
            canvas.restore();
            canvas.save();
            paint_7.reset();
            paint_7.set(paint_1);
            paint_7.setColor(0xffd1d2d3);
            paint_7.setStrokeWidth(4.000000f);
            paint_7.setStrokeMiter(10.000000f);
            path_5.reset();
            path_5.moveTo(262.300018f, 92.300003f);
            path_5.lineTo(738.200012f, 92.300003f);

            canvas.drawPath(path_5, paint_7);
            canvas.restore();
            canvas.save();
            paint_8.reset();
            paint_8.set(paint_1);
            paint_8.setColor(0xffd1d2d3);
            paint_8.setStrokeWidth(4.000000f);
            paint_8.setStrokeMiter(10.000000f);
            path_6.reset();
            path_6.moveTo(147.600006f, 156.600006f);
            path_6.lineTo(147.600006f, 537.299988f);

            canvas.drawPath(path_6, paint_8);
            canvas.restore();
            canvas.save();
            paint_9.reset();
            paint_9.set(paint_1);
            paint_9.setColor(0xffd1d2d3);
            paint_9.setStrokeWidth(4.000000f);
            paint_9.setStrokeMiter(10.000000f);
            path_7.reset();
            path_7.moveTo(235.699997f, 109.800003f);
            path_7.lineTo(235.699997f, 537.299988f);

            canvas.drawPath(path_7, paint_9);
            canvas.restore();
            canvas.save();
            paint_10.reset();
            paint_10.set(paint_1);
            paint_10.setColor(0xffd1d2d3);
            paint_10.setStrokeWidth(4.000000f);
            paint_10.setStrokeMiter(10.000000f);
            path_8.reset();
            path_8.moveTo(323.800018f, 55.799999f);
            path_8.lineTo(323.800018f, 537.299988f);

            canvas.drawPath(path_8, paint_10);
            canvas.restore();
            canvas.save();
            paint_11.reset();
            paint_11.set(paint_1);
            paint_11.setColor(0xffd1d2d3);
            paint_11.setStrokeWidth(4.000000f);
            paint_11.setStrokeMiter(10.000000f);
            path_9.reset();
            path_9.moveTo(411.899994f, 55.799999f);
            path_9.lineTo(411.899994f, 537.299988f);

            canvas.drawPath(path_9, paint_11);
            canvas.restore();
            canvas.save();
            paint_12.reset();
            paint_12.set(paint_1);
            paint_12.setColor(0xffd1d2d3);
            paint_12.setStrokeWidth(4.000000f);
            paint_12.setStrokeMiter(10.000000f);
            path_10.reset();
            path_10.moveTo(500.000000f, 55.799999f);
            path_10.lineTo(500.000000f, 537.299988f);

            canvas.drawPath(path_10, paint_12);
            canvas.restore();
            canvas.save();
            paint_13.reset();
            paint_13.set(paint_1);
            paint_13.setColor(0xffd1d2d3);
            paint_13.setStrokeWidth(4.000000f);
            paint_13.setStrokeMiter(10.000000f);
            path_11.reset();
            path_11.moveTo(588.100037f, 55.799999f);
            path_11.lineTo(588.100037f, 537.299988f);

            canvas.drawPath(path_11, paint_13);
            canvas.restore();
            canvas.save();
            paint_14.reset();
            paint_14.set(paint_1);
            paint_14.setColor(0xffd1d2d3);
            paint_14.setStrokeWidth(4.000000f);
            paint_14.setStrokeMiter(10.000000f);
            path_12.reset();
            path_12.moveTo(676.200012f, 55.799999f);
            path_12.lineTo(676.200012f, 537.299988f);

            canvas.drawPath(path_12, paint_14);
            canvas.restore();
            canvas.save();
            paint_15.reset();
            paint_15.set(paint_1);
            paint_15.setColor(0xffd1d2d3);
            paint_15.setStrokeWidth(4.000000f);
            paint_15.setStrokeMiter(10.000000f);
            path_13.reset();
            path_13.moveTo(764.299988f, 117.400002f);
            path_13.lineTo(764.299988f, 537.299988f);

            canvas.drawPath(path_13, paint_15);
            canvas.restore();
            canvas.save();
            paint_16.reset();
            paint_16.set(paint_1);
            paint_16.setColor(0xffd1d2d3);
            paint_16.setStrokeWidth(4.000000f);
            paint_16.setStrokeMiter(10.000000f);
            path_14.reset();
            path_14.moveTo(852.400024f, 173.400009f);
            path_14.lineTo(852.400024f, 537.299988f);

            canvas.drawPath(path_14, paint_16);
            canvas.restore();
            canvas.save();
            paint_17.reset();
            paint_17.set(paint_0);
            paint_17.setColor(0xffffffff);
            path_15.reset();
            path_15.moveTo(962.700012f, 537.299988f);
            path_15.lineTo(37.299999f, 537.299988f);
            path_15.cubicTo(16.700001f, 537.299988f, 0.000000f, 520.600037f, 0.000000f, 499.899994f);
            path_15.cubicTo(0.000000f, 432.399994f, 13.200000f, 366.899994f, 39.299999f, 305.299988f);
            path_15.cubicTo(64.500000f, 245.799988f, 100.500000f, 192.299988f, 146.399994f, 146.399979f);
            path_15.cubicTo(192.299988f, 100.499969f, 245.799988f, 64.399979f, 305.299988f, 39.299980f);
            path_15.cubicTo(367.000000f, 13.200000f, 432.399994f, 0.000000f, 499.899994f, 0.000000f);
            path_15.cubicTo(567.400024f, 0.000000f, 632.900024f, 13.200000f, 694.500000f, 39.299999f);
            path_15.cubicTo(754.000000f, 64.500000f, 807.500000f, 100.500000f, 853.400024f, 146.399994f);
            path_15.cubicTo(899.300049f, 192.299988f, 935.400024f, 245.799988f, 960.500000f, 305.299988f);
            path_15.cubicTo(986.599976f, 367.000000f, 999.799988f, 432.500000f, 999.799988f, 499.899994f);
            path_15.cubicTo(1000.000000f, 520.600037f, 983.299988f, 537.299988f, 962.700012f, 537.299988f);
            path_15.close();
            path_15.moveTo(76.300003f, 462.600006f);
            path_15.lineTo(923.799988f, 462.600006f);
            path_15.cubicTo(915.200012f, 363.100006f, 872.299988f, 270.600006f, 800.799988f, 199.200012f);
            path_15.cubicTo(720.400024f, 118.800003f, 613.600037f, 74.599998f, 500.000000f, 74.599998f);
            path_15.cubicTo(386.399963f, 74.599998f, 279.599976f, 118.800003f, 199.199982f, 199.199997f);
            path_15.cubicTo(127.800003f, 270.600006f, 84.900002f, 363.100006f, 76.300003f, 462.600006f);
            path_15.close();

            path_15.setFillType(Path.FillType.WINDING);
            canvas.drawPath(path_15, paint_17);
            canvas.restore();

            canvas.save();
            paint_18.reset();
            paint_18.set(paint_0);
            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"),false);
            paint_18.setARGB(auxColor[0],auxColor[1],auxColor[2],auxColor[3]);
            path_16.reset();
            path_16.moveTo(923.700012f, 462.600006f);
            path_16.lineTo(843.100037f, 462.600006f);
            path_16.lineTo(843.100037f, 537.299988f);
            path_16.lineTo(962.600037f, 537.299988f);
            path_16.cubicTo(983.200012f, 537.299988f, 999.900024f, 520.599976f, 999.900024f, 500.000000f);
            path_16.cubicTo(999.900024f, 455.100006f, 994.000000f, 411.100006f, 982.500000f, 368.599976f);
            path_16.lineTo(904.700012f, 368.599976f);
            path_16.cubicTo(914.500000f, 398.800018f, 921.000000f, 430.300018f, 923.700012f, 462.600006f);
            path_16.close();
            path_16.setFillType(Path.FillType.WINDING);
            canvas.drawPath(path_16, paint_18);
            canvas.restore();
            canvas.save();
            paint_19.reset();
            paint_19.set(paint_0);
            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"),false);
            paint_19.setARGB(auxColor[0],auxColor[1],auxColor[2],auxColor[3]);
            path_17.reset();
            path_17.moveTo(76.300003f, 462.600006f);
            path_17.lineTo(156.899994f, 462.600006f);
            path_17.lineTo(156.899994f, 537.299988f);
            path_17.lineTo(37.299999f, 537.299988f);
            path_17.cubicTo(16.700001f, 537.299988f, 0.000000f, 520.600037f, 0.000000f, 499.899994f);
            path_17.cubicTo(0.000000f, 455.000000f, 5.900000f, 411.000000f, 17.400000f, 368.500000f);
            path_17.lineTo(95.200005f, 368.500000f);
            path_17.cubicTo(85.500000f, 398.800018f, 79.000000f, 430.300018f, 76.300003f, 462.600006f);
            path_17.close();
            path_17.setFillType(Path.FillType.WINDING);
            canvas.drawPath(path_17, paint_19);
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

            CustomAnimation.justDoIt(context, myImage, arrayPosition, screenHeight, screenWidth, velocity, (float) player.getInt("rotation"), (CustomAnimation.convertDpToPixels(0.0f,context) * scale),(CustomAnimation.convertDpToPixels(0.0f,context) * scale));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
