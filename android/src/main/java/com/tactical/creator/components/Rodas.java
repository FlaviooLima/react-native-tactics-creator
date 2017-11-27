package com.tactical.creator.components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
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

public class Rodas {
    private com.tactical.creator.utis.CustomAnimation CustomAnimation = new CustomAnimation();
    int[] auxColor;

    public static final float WIDTH = 80.000000f;
    public static final float HEIGHT = 80.000000f;


    private boolean inited;
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



    private void init() {
        if (inited) return;
        inited = true;
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


    }

    public void create(ThemedReactContext context, RelativeLayout base_svg, JSONObject player, Integer screenHeight, Integer screenWidth, Integer velocity, float[] lastPosition) {
        try {
            float scale = 1;
            scale = BigDecimal.valueOf(player.getDouble("scale")).floatValue();

            int realWidth = (int) (80 * scale);
            int realHeight = (int) (90 * scale);

            Bitmap b  = Bitmap.createBitmap((int) realWidth, (int) realHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(b);

            init();
            canvas.save();
            canvas.scale(realWidth / WIDTH, realHeight / HEIGHT);

            paint_1.reset();
            paint_1.setFlags(Paint.ANTI_ALIAS_FLAG | Paint.DEV_KERN_TEXT_FLAG | Paint.SUBPIXEL_TEXT_FLAG);
            paint_1.setStyle(Paint.Style.STROKE);
            paint_1.setTypeface(Typeface.DEFAULT);
            paint_1.setStrokeWidth(1.000000f);
            paint_1.setStrokeCap(Paint.Cap.BUTT);
            paint_1.setStrokeJoin(Paint.Join.MITER);
            paint_1.setStrokeMiter(4.000000f);
            paint_1.setPathEffect(null);
            paint_1.setTextSize(16.000000f);
            paint_1.setTypeface(typeface_0);
            paint_1.setStrikeThruText(false);
            paint_1.setUnderlineText(false);



            canvas.save();
            paint_2.reset();
            paint_2.set(paint_1);
            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"),false);
            paint_2.setARGB(auxColor[0],auxColor[1],auxColor[2],auxColor[3]);
            paint_2.setStrokeWidth(2.000000f);
            paint_2.setStrokeMiter(10.000000f);
            path_0.reset();
            path_0.moveTo(11.500000f, 47.299999f);
            path_0.cubicTo(17.022848f, 47.299999f, 21.500000f, 51.777153f, 21.500000f, 57.299999f);
            path_0.cubicTo(21.500000f, 62.822845f, 17.022848f, 67.300003f, 11.500000f, 67.300003f);
            path_0.cubicTo(5.977152f, 67.300003f, 1.500000f, 62.822845f, 1.500000f, 57.299999f);
            path_0.cubicTo(1.500000f, 51.777153f, 5.977152f, 47.299999f, 11.500000f, 47.299999f);
            path_0.close();


            canvas.drawPath(path_0, paint_2);
            canvas.restore();
            canvas.save();
            paint_3.reset();
            paint_3.set(paint_1);
            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"),false);
            paint_3.setARGB(auxColor[0],auxColor[1],auxColor[2],auxColor[3]);
            paint_3.setStrokeWidth(2.000000f);
            paint_3.setStrokeMiter(10.000000f);
            path_1.reset();
            path_1.moveTo(11.500000f, 24.100002f);
            path_1.cubicTo(17.022848f, 24.100002f, 21.500000f, 28.577154f, 21.500000f, 34.100002f);
            path_1.cubicTo(21.500000f, 39.622849f, 17.022848f, 44.100002f, 11.500000f, 44.100002f);
            path_1.cubicTo(5.977152f, 44.100002f, 1.500000f, 39.622849f, 1.500000f, 34.100002f);
            path_1.cubicTo(1.500000f, 28.577154f, 5.977152f, 24.100002f, 11.500000f, 24.100002f);
            path_1.close();




            canvas.drawPath(path_1, paint_3);
            canvas.restore();
            canvas.save();
            paint_4.reset();
            paint_4.set(paint_1);
            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"),false);
            paint_4.setARGB(auxColor[0],auxColor[1],auxColor[2],auxColor[3]);
            paint_4.setStrokeWidth(2.000000f);
            paint_4.setStrokeMiter(10.000000f);
            path_2.reset();
            path_2.moveTo(11.500000f, 1.000000f);
            path_2.cubicTo(17.022848f, 1.000000f, 21.500000f, 5.477152f, 21.500000f, 11.000000f);
            path_2.cubicTo(21.500000f, 16.522848f, 17.022848f, 21.000000f, 11.500000f, 21.000000f);
            path_2.cubicTo(5.977152f, 21.000000f, 1.500000f, 16.522848f, 1.500000f, 11.000000f);
            path_2.cubicTo(1.500000f, 5.477152f, 5.977152f, 1.000000f, 11.500000f, 1.000000f);
            path_2.close();




            canvas.drawPath(path_2, paint_4);
            canvas.restore();
            canvas.save();
            paint_5.reset();
            paint_5.set(paint_1);
            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"),false);
            paint_5.setARGB(auxColor[0],auxColor[1],auxColor[2],auxColor[3]);
            paint_5.setStrokeWidth(2.000000f);
            paint_5.setStrokeMiter(10.000000f);
            path_3.reset();
            path_3.moveTo(32.100002f, 59.000000f);
            path_3.cubicTo(37.622849f, 59.000000f, 42.100002f, 63.477154f, 42.100002f, 69.000000f);
            path_3.cubicTo(42.100002f, 74.522850f, 37.622849f, 79.000000f, 32.100002f, 79.000000f);
            path_3.cubicTo(26.577154f, 79.000000f, 22.100002f, 74.522850f, 22.100002f, 69.000000f);
            path_3.cubicTo(22.100002f, 63.477154f, 26.577154f, 59.000000f, 32.100002f, 59.000000f);
            path_3.close();




            canvas.drawPath(path_3, paint_5);
            canvas.restore();
            canvas.save();
            paint_6.reset();
            paint_6.set(paint_1);
            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"),false);
            paint_6.setARGB(auxColor[0],auxColor[1],auxColor[2],auxColor[3]);
            paint_6.setStrokeWidth(2.000000f);
            paint_6.setStrokeMiter(10.000000f);
            path_4.reset();
            path_4.moveTo(32.100002f, 35.900002f);
            path_4.cubicTo(37.622849f, 35.900002f, 42.100002f, 40.377155f, 42.100002f, 45.900002f);
            path_4.cubicTo(42.100002f, 51.422848f, 37.622849f, 55.900002f, 32.100002f, 55.900002f);
            path_4.cubicTo(26.577154f, 55.900002f, 22.100002f, 51.422848f, 22.100002f, 45.900002f);
            path_4.cubicTo(22.100002f, 40.377155f, 26.577154f, 35.900002f, 32.100002f, 35.900002f);
            path_4.close();




            canvas.drawPath(path_4, paint_6);
            canvas.restore();
            canvas.save();
            paint_7.reset();
            paint_7.set(paint_1);
            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"),false);
            paint_7.setARGB(auxColor[0],auxColor[1],auxColor[2],auxColor[3]);
            paint_7.setStrokeWidth(2.000000f);
            paint_7.setStrokeMiter(10.000000f);
            path_5.reset();
            path_5.moveTo(32.100002f, 12.700001f);
            path_5.cubicTo(37.622849f, 12.700001f, 42.100002f, 17.177153f, 42.100002f, 22.700001f);
            path_5.cubicTo(42.100002f, 28.222849f, 37.622849f, 32.700001f, 32.100002f, 32.700001f);
            path_5.cubicTo(26.577154f, 32.700001f, 22.100002f, 28.222849f, 22.100002f, 22.700001f);
            path_5.cubicTo(22.100002f, 17.177153f, 26.577154f, 12.700001f, 32.100002f, 12.700001f);
            path_5.close();
            canvas.drawPath(path_5, paint_7);
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

            CustomAnimation.justDoIt(context, myImage, arrayPosition, screenHeight, screenWidth, velocity, (float) player.getInt("rotation"), (CustomAnimation.convertDpToPixels(0.0f,context) * scale),(CustomAnimation.convertDpToPixels(1.0f,context) * scale));

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

}
