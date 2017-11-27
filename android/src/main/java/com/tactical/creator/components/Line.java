package com.tactical.creator.components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.tactical.creator.utis.CustomAnimation;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by macmini on 14/11/2017.
 */

public class Line {
    private com.tactical.creator.utis.CustomAnimation CustomAnimation = new CustomAnimation();
    int[] auxColor;

    private Paint paint = new Paint();
    private Paint paintWhite = new Paint();
    private Path pathLine = new Path();

    public void create(Canvas canvas, ThemedReactContext context, RelativeLayout base_svg, JSONObject player, Integer screenHeight, Integer screenWidth) {
        try {

            JSONArray data = player.getJSONArray("data");
            pathLine.reset();
            pathLine.moveTo(CustomAnimation.convertDpToPixels(((data.getInt(0) * screenWidth) / 906), context), CustomAnimation.convertDpToPixels(((data.getInt(1) * screenHeight) / 577), context));

            for (int i = 2; i < data.length(); i += 2) {
                pathLine.lineTo(CustomAnimation.convertDpToPixels(((data.getInt(i) * screenWidth) / 906), context), CustomAnimation.convertDpToPixels(((data.getInt(i + 1) * screenHeight) / 577), context));
            }


            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"), false);
            paintWhite.setARGB(auxColor[0], auxColor[1], auxColor[2], auxColor[3]);
            paintWhite.setAntiAlias(true);
            paintWhite.setStrokeWidth(player.getInt("lineThickness"));
            paintWhite.setStyle(Paint.Style.STROKE);
            paint.set(paintWhite);

            if (player.getInt("typeLine") == 1 || player.getInt("typeLine") == 3) {
                paintWhite.setPathEffect(new DashPathEffect(new float[]{10, 8}, 0));
            }


            if (player.getBoolean("ArrowLeft")) {
////                Path[] arrayPathLeft = drawArrow(context, CustomAnimation.convertDpToPixels(((data.getInt(2) * screenWidth) / 906), context), CustomAnimation.convertDpToPixels(((data.getInt(3) * screenHeight) / 577), context), CustomAnimation.convertDpToPixels(((data.getInt(0) * screenWidth) / 906), context), CustomAnimation.convertDpToPixels(((data.getInt(1) * screenHeight) / 577), context));
//                Path[] arrayPathLeft = drawArrow(context, (CustomAnimation.convertDpToPixels(data.getInt(2), context)* screenWidth /906), (CustomAnimation.convertDpToPixels(data.getInt(3), context)* screenHeight/ 577), (CustomAnimation.convertDpToPixels(data.getInt(0), context)* screenWidth /906), (CustomAnimation.convertDpToPixels(data.getInt(1), context)* screenHeight / 577));
//                canvas.drawPath(arrayPathLeft[0], paint);
//                canvas.drawPath(arrayPathLeft[1], paint);


                Path arrayPathLeft = drawArrow2(data, context, screenWidth, screenHeight, true,  player.getInt("typeLine"));
                canvas.drawPath(arrayPathLeft, paint);
            }
            if (player.getBoolean("ArrowRight")) {

//                Path[] arrayPathRight = drawArrow(context, CustomAnimation.convertDpToPixels(((data.getInt((data.length() - 9)) * screenWidth) / 906), context), CustomAnimation.convertDpToPixels(((data.getInt((data.length() - 8)) * screenHeight) / 577), context), CustomAnimation.convertDpToPixels(((data.getInt((data.length() - 2)) * screenWidth) / 906), context), CustomAnimation.convertDpToPixels(((data.getInt((data.length() - 1)) * screenHeight) / 577), context));
////                Path[] arrayPathRight = drawArrow(context, CustomAnimation.convertDpToPixels(((data.getInt((data.length() - 4)) * screenWidth) / 906), context), CustomAnimation.convertDpToPixels(((data.getInt((data.length() - 3)) * screenHeight) / 577), context), CustomAnimation.convertDpToPixels(((data.getInt((data.length() - 2)) * screenWidth) / 906), context), CustomAnimation.convertDpToPixels(((data.getInt((data.length() - 1)) * screenHeight) / 577), context));
////                Path[] arrayPathRight = drawArrow(context, (CustomAnimation.convertDpToPixels(data.getInt(data.length()-4), context)* screenWidth /906), (CustomAnimation.convertDpToPixels(data.getInt(data.length()-3), context)* screenHeight/ 577), (CustomAnimation.convertDpToPixels(data.getInt(data.length()-2), context)* screenWidth /906), (CustomAnimation.convertDpToPixels(data.getInt(data.length()-1), context)* screenHeight / 577));
//                canvas.drawPath(arrayPathRight[0], paint);
//                canvas.drawPath(arrayPathRight[1], paint);
//
                Path arrayPathRight = drawArrow2(data, context, screenWidth, screenHeight, false,  player.getInt("typeLine"));
                canvas.drawPath(arrayPathRight, paint);


            }

            canvas.save();
            canvas.drawPath(pathLine, paintWhite);
            canvas.restore();


        } catch (JSONException e) {
            Log.e("FLAVIO2", "EstourouLine: ");
            Log.e("FLAVIO", e.getMessage());
            e.printStackTrace();
        }
    }


    private Path[] drawArrow(ThemedReactContext context, float ax, float ay, float bx, float by) {
        Path arrow1 = new Path();
        Path arrow2 = new Path();

        float abx, aby, ab, cx, cy, dx, dy, ex, ey;
        float size = CustomAnimation.convertDpToPixels(8, context);
        float ratio = CustomAnimation.convertDpToPixels(1, context);
//        float size = 12, ratio = 2;

        abx = bx - ax;
        aby = by - ay;
        ab = (float) Math.sqrt((abx * abx + aby * aby));


//        Log.e("FLAVIO2", "Everything0: " + bx + " -- " + ax);
//        Log.e("FLAVIO2", "Everything1: " + by + " -- " + ay);
//        Log.e("FLAVIO2", "Everything2: " + abx + " -- " + ab);
//        Log.e("FLAVIO2", "Everything3: " + aby + " -- " + ab);

        cx = bx - size * abx / ab;
        cy = by - size * aby / ab;

        Log.e("FLAVIO2", "-----------------------------------");
        Log.e("FLAVIO2", "Everything1: " + cx + " =" + bx + " - " + size + " * " + abx + " / " + ab);
        Log.e("FLAVIO2", "Everything2: " + cy + " =" + by + " - " + size + " * " + aby + " / " + ab);


//        Log.e("FLAVIO2", "Everything: "+bx +" - "+ size +" * "+ abx +" / "+ ab+" == "+cx);
//        Log.e("FLAVIO2", "Everything: "+by +"-"+ size +"*"+ aby +"/"+ ab+"== "+cy);
//        Log.e("FLAVIO2", "Everything: "+abx+" -- "+aby+" -- "+ab+" -- "+by);

        dx = cx + (by - cy) / ratio;
        dy = cy + (cx - bx) / ratio;
        ex = cx - (by - cy) / ratio;
        ey = cy - (cx - bx) / ratio;


        arrow1.moveTo(bx, by);
        arrow1.lineTo(dx, dy);
//Log.e("FLAVIO2", "Arrow1: "+bx+" -- "+by+" -- "+dx+" -- "+dy);
//Log.e("FLAVIO2", "Arrow2: "+ex+" -- "+ey+" -- "+bx+" -- "+by);

        arrow2.moveTo(ex, ey);
        arrow2.lineTo(bx, by);

        return new Path[]{arrow1, arrow2};
    }

    private Path drawArrow2(JSONArray pList, ThemedReactContext context, int screenWidth, int screenHeight, boolean left, int typeLine) {
        float dx, dy;
        PointF p1, p2;
        PointF pstart = new PointF();
        PointF pfinal = new PointF();
        Path auxPath = new Path();

        try {

            if (pList.length() > 0) {
                if (left) {

                    pfinal.set((CustomAnimation.convertDpToPixels(pList.getInt(0), context) * screenWidth / 906), (CustomAnimation.convertDpToPixels(pList.getInt(1), context) * screenHeight / 577));
                    if (pList.length() == 4) {
                        pstart.set((CustomAnimation.convertDpToPixels(pList.getInt(2), context) * screenWidth / 906), (CustomAnimation.convertDpToPixels(pList.getInt(3), context) * screenHeight / 577));
                    } else {
                        pstart.set((CustomAnimation.convertDpToPixels(pList.getInt(6), context) * screenWidth / 906), (CustomAnimation.convertDpToPixels(pList.getInt(7), context) * screenHeight / 577));
                    }

                } else {

                    pfinal.set((CustomAnimation.convertDpToPixels(pList.getInt(pList.length() - 2), context) * screenWidth / 906), (CustomAnimation.convertDpToPixels(pList.getInt(pList.length() - 1), context) * screenHeight / 577));
                    pstart.set((CustomAnimation.convertDpToPixels(pList.getInt(pList.length() - 4), context) * screenWidth / 906), (CustomAnimation.convertDpToPixels(pList.getInt(pList.length() - 3), context) * screenHeight / 577));

                    if (typeLine == 2 || typeLine == 3) {
                        if (pList.length() >= 12) {

//                            pstart.set((CustomAnimation.convertDpToPixels(pList.getInt(pList.length() - 6), context) * screenWidth / 906), (CustomAnimation.convertDpToPixels(pList.getInt(pList.length() - 7), context) * screenHeight / 577));
                            pstart.set((CustomAnimation.convertDpToPixels(pList.getInt(pList.length() - 8), context) * screenWidth / 906), (CustomAnimation.convertDpToPixels(pList.getInt(pList.length() - 9), context) * screenHeight / 577));
//                            pfinal.set((CustomAnimation.convertDpToPixels(pList.getInt(pList.length() - 8), context) * screenWidth / 906), (CustomAnimation.convertDpToPixels(pList.getInt(pList.length() - 9), context) * screenHeight / 577));
//                            pfinal.set((CustomAnimation.convertDpToPixels(pList.getInt(pList.length() - 9), context) * screenWidth / 906), (CustomAnimation.convertDpToPixels(pList.getInt(pList.length() - 8), context) * screenHeight / 577));

//                            posX = pList.getInt((pList.length() - 9));
//                            posY = pList.getInt((pList.length() - 8));
                        }
                    }

                }


                dx = pfinal.x - pstart.x;
                dy = pfinal.y - pstart.y;

                float length = (float) Math.sqrt(dx * dx + dy * dy);

                float unitDx = dx / length;
                float unitDy = dy / length;

                final int arrowSize = 10;

                p1 = new PointF(
                        (float) (pfinal.x - unitDx * arrowSize - unitDy * arrowSize),
                        (float) (pfinal.y - unitDy * arrowSize + unitDx * arrowSize));

                p2 = new PointF(
                        (float) (pfinal.x - unitDx * arrowSize + unitDy * arrowSize),
                        (float) (pfinal.y - unitDy * arrowSize - unitDx * arrowSize));

                auxPath.moveTo(pfinal.x, pfinal.y);
                auxPath.lineTo(p1.x, p1.y);
                auxPath.moveTo(pfinal.x, pfinal.y);
                auxPath.lineTo(p2.x, p2.y);

                auxPath.close();
            }

            return auxPath;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return new Path();
    }

}
