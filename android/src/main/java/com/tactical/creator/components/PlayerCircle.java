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

import com.facebook.react.uimanager.ThemedReactContext;
import com.tactical.creator.utis.CustomAnimation;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigDecimal;

public class PlayerCircle {
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

    private CustomAnimation CustomAnimation = new CustomAnimation();

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
    }


    public void create(ThemedReactContext context, RelativeLayout base_svg, JSONObject player, Integer screenHeight, Integer screenWidth, Integer velocity, float[] lastPosition) {
        try {
            float scale = 1;
            scale = BigDecimal.valueOf(player.getDouble("scale")).floatValue();


            int realWidth = (int) (40 * scale);
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
            paint_0.setColor(0xff000000);
            paint_0.setTextSize(16.000000f);
            paint_0.setTypeface(typeface_0);
            paint_0.setStrikeThruText(false);
            paint_0.setUnderlineText(false);

            canvas.save();
            paint_2.reset();
            paint_2.set(paint_0);
            paint_2.setColor(0xffffffff);
            path_0.reset();
            path_0.moveTo(500.000000f, 92.000000f);
            path_0.cubicTo(725.332153f, 92.000000f, 908.000000f, 274.667816f, 908.000000f, 500.000000f);
            path_0.cubicTo(908.000000f, 725.332153f, 725.332153f, 908.000000f, 500.000000f, 908.000000f);
            path_0.cubicTo(274.667816f, 908.000000f, 92.000000f, 725.332153f, 92.000000f, 500.000000f);
            path_0.cubicTo(92.000000f, 274.667816f, 274.667816f, 92.000000f, 500.000000f, 92.000000f);
            path_0.close();

            canvas.drawPath(path_0, paint_2);
            canvas.restore();
            canvas.save();
            paint_3.reset();
            paint_3.set(paint_0);
            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"),false);
            paint_3.setARGB(auxColor[0],auxColor[1],auxColor[2],auxColor[3]);
            path_1.reset();
            path_1.moveTo(500.000000f, 165.500000f);
            path_1.cubicTo(684.739258f, 165.500000f, 834.500000f, 315.260742f, 834.500000f, 500.000000f);
            path_1.cubicTo(834.500000f, 684.739258f, 684.739258f, 834.500000f, 500.000000f, 834.500000f);
            path_1.cubicTo(315.260742f, 834.500000f, 165.500000f, 684.739258f, 165.500000f, 500.000000f);
            path_1.cubicTo(165.500000f, 315.260742f, 315.260742f, 165.500000f, 500.000000f, 165.500000f);
            path_1.close();

            canvas.drawPath(path_1, paint_3);
            canvas.restore();
            canvas.save();
            paint_4.reset();
            paint_4.set(paint_0);
            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"),false);
            paint_4.setARGB(auxColor[0],auxColor[1],auxColor[2],auxColor[3]);
            path_2.reset();
            path_2.moveTo(500.000000f, 0.000000f);
            path_2.cubicTo(223.900009f, 0.000000f, 0.000000f, 223.900009f, 0.000000f, 500.000000f);
            path_2.cubicTo(0.000000f, 776.099976f, 223.900009f, 1000.000000f, 500.000000f, 1000.000000f);
            path_2.cubicTo(776.099976f, 1000.000000f, 1000.000000f, 776.099976f, 1000.000000f, 500.000000f);
            path_2.cubicTo(1000.000000f, 223.900024f, 776.100037f, 0.000000f, 500.000000f, 0.000000f);
            path_2.close();
            path_2.moveTo(500.000000f, 898.000000f);
            path_2.cubicTo(280.200012f, 898.000000f, 102.000000f, 719.799988f, 102.000000f, 500.000000f);
            path_2.cubicTo(102.000000f, 280.200012f, 280.200012f, 102.000000f, 500.000000f, 102.000000f);
            path_2.cubicTo(719.799988f, 102.000000f, 898.000000f, 280.200012f, 898.000000f, 500.000000f);
            path_2.cubicTo(898.000000f, 719.799988f, 719.799988f, 898.000000f, 500.000000f, 898.000000f);
            path_2.close();

            path_2.setFillType(Path.FillType.WINDING);
            canvas.drawPath(path_2, paint_4);

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


            CustomAnimation.justDoIt(context, myImage, arrayPosition, screenHeight, screenWidth, velocity, (float) player.getInt("rotation"), (CustomAnimation.convertDpToPixels(2.0f,context) * scale),(CustomAnimation.convertDpToPixels(1.0f,context) * scale));


        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
