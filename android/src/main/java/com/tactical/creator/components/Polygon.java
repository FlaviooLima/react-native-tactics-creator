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
import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigDecimal;

/**
 * Created by macmini on 14/11/2017.
 */

public class Polygon {
    private com.tactical.creator.utis.CustomAnimation CustomAnimation = new CustomAnimation();
    int[] auxColor;

    private Path path_0 = new Path();
    private Paint paint = new Paint();
    private Paint paintWhite = new Paint();

    public void create(ThemedReactContext context, RelativeLayout base_svg, JSONObject player, Integer screenHeight, Integer screenWidth, boolean bool, int sides) {
        try {

            float scale = 1;
            scale = BigDecimal.valueOf(player.getDouble("scale")).floatValue();


            float   testeWidth = CustomAnimation.convertDpToPixels(((player.getInt("width") * screenWidth) / 906), context);
            float   testeHeifht = CustomAnimation.convertDpToPixels(((player.getInt("height") * screenHeight) / 577), context);


            int realWidth = (int) (testeWidth * scale);
            int realHeight = (int) (testeHeifht * scale);

            Bitmap b = Bitmap.createBitmap((int) realWidth, (int) realHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(b);
            canvas.save();


            if (player.getBoolean("isFill")) {
                auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"), true);
                paint.setARGB(auxColor[0], auxColor[1], auxColor[2], auxColor[3]);
                paint.setAntiAlias(true);

                paintWhite.setColor(Color.WHITE);
                paintWhite.setAntiAlias(true);
                paintWhite.setStrokeWidth(player.getInt("strokeWeight"));
                paintWhite.setStyle(Paint.Style.STROKE);
            } else {
                paint.setARGB(0, 0, 0, 0);
                paint.setAntiAlias(true);

                auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"), true);
                paintWhite.setARGB(auxColor[0], auxColor[1], auxColor[2], auxColor[3]);
                paintWhite.setAntiAlias(true);
                paintWhite.setStrokeWidth(player.getInt("strokeWeight"));
                paintWhite.setStyle(Paint.Style.STROKE);

            }

            path_0.reset();

            double rotation = (!bool) ? -Math.PI / 2 : 0;
            rotation = (float) rotation;
            float angle = (float) (2 * Math.PI) / sides;
            float radiusX = realWidth / 2;
            float radiusY = realHeight / 2;
            float pxb = (float) (Math.cos(rotation) * radiusX) + 0 + radiusX;
            float pyb = (float) (Math.sin(rotation) * radiusY) + 0 + radiusY;

            path_0.moveTo(pxb, pyb);

            for (int it = 1; it <= sides; it++) {
                pxb = (float) (Math.cos((angle * it) + rotation) * radiusX) + 0 + radiusX;
                pyb = (float) (Math.sin((angle * it) + rotation) * radiusY) + 0 + radiusY;
                path_0.lineTo(pxb, pyb);
            }
            path_0.close();

            canvas.drawPath(path_0, paint);
            canvas.drawPath(path_0, paintWhite);
            canvas.restore();

            ImageView myImage = new ImageView(context);
            myImage.setImageBitmap(b);
            myImage.setPivotX(0.0f);
            myImage.setPivotY(0.0f);

            myImage.setX(CustomAnimation.convertDpToPixels(((player.getInt("x") * screenWidth) / 906), context));
            myImage.setY(CustomAnimation.convertDpToPixels(((player.getInt("y") * screenHeight) / 577), context));

            myImage.setRotation((CustomAnimation.doMathForRotation(myImage.getRotation(),(float)player.getDouble("rotation")))[1]);
            base_svg.addView(myImage);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
