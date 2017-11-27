package com.tactical.creator.components;


import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.facebook.react.uimanager.ThemedReactContext;
import com.tactical.creator.utis.CustomAnimation;


import org.json.JSONArray;
import org.json.JSONObject;



/**
 * Created by macmini on 14/11/2017.
 */

public class Text {
    private com.tactical.creator.utis.CustomAnimation CustomAnimation = new CustomAnimation();
    int[] auxColor;


    public void create(Canvas canvas, ThemedReactContext context,  JSONObject player, Integer screenHeight, Integer screenWidth) {
        try {

            float posX;
            float posY;

            Paint paintWhite = new Paint();


            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"), false);
            paintWhite.setARGB(auxColor[0], auxColor[1], auxColor[2], auxColor[3]);
            paintWhite.setAntiAlias(true);
            paintWhite.setStrokeWidth(20);
            paintWhite.setStyle(Paint.Style.STROKE);

            canvas.save();
            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"), false);

            LinearLayout layout = new LinearLayout(context);
            TextView textView = new TextView(context);
            textView.setVisibility(View.VISIBLE);
            textView.setText(player.getString("text"));
            textView.setTextColor(Color.argb(auxColor[0], auxColor[1], auxColor[2], auxColor[3]));
            textView.setPivotX(0);
            textView.setPivotY(0);
            textView.setTextSize(CustomAnimation.convertDpToPixels(4, context)* (float)player.getDouble("scale"));
            textView.setRotation((float) player.getDouble("rotation"));


            layout.addView(textView);
            int heighttTeste = player.getInt("height");
            int widthTeste =  player.getInt("width");
            layout.measure(widthTeste,heighttTeste);
            layout.layout(0, 0,widthTeste,heighttTeste);

            posX = CustomAnimation.convertDpToPixels(((player.getInt("x") * screenWidth) / 906), context);
            posY = CustomAnimation.convertDpToPixels(((player.getInt("y") * screenHeight) / 577), context);

            posX += (player.getInt("scale")*CustomAnimation.convertDpToPixels(((30 * screenWidth) / 906), context))/CustomAnimation.convertDpToPixels(2.96f,context);
            posY += (player.getInt("scale")*CustomAnimation.convertDpToPixels(((30 * screenHeight) / 577), context))/CustomAnimation.convertDpToPixels(2.96f,context);

            canvas.translate(posX,posY);
            layout.draw(canvas);
            canvas.restore();

        } catch (Exception e) {
            e.printStackTrace();

        }

    }
//
//    private void addTextViewOnCanvas(Canvas canvas,ThemedReactContext _context ) {
//
//        LinearLayout layout = new LinearLayout(_context);
//        TextView textView = new TextView(_context);
//        textView.setVisibility(View.VISIBLE);
//        textView.setText("Hello Multiline text world .............");
//        textView.setWidth(canvas.getWidth() - 100);
//        textView.setBackgroundColor(Color.YELLOW);
//        textView.setPivotX(0);
//        textView.setPivotY(0);
//        textView.setRotation(90F);
//        layout.addView(textView);
//        layout.measure(canvas.getWidth(), canvas.getHeight());
//        layout.layout(0, 0, canvas.getWidth(), canvas.getHeight());
//
//        // To place the text view somewhere specific:
//        canvas.translate(200, 200);
//        layout.draw(canvas);
//
//    }
}
