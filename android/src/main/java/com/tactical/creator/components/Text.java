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

import android.util.TypedValue;
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


    public void create(Canvas canvas, ThemedReactContext context,  JSONObject player, Integer screenHeight, Integer screenWidth, RelativeLayout base_svg) {
        try {

//            float posX;
//            float posY;
//
//            Paint paintWhite = new Paint();
//
//
//            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"), false);
//            paintWhite.setARGB(auxColor[0], auxColor[1], auxColor[2], auxColor[3]);
//            paintWhite.setAntiAlias(true);
//            paintWhite.setStrokeWidth(20);
//            paintWhite.setStyle(Paint.Style.STROKE);
//
//            canvas.save();
//            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"), false);
//
//            LinearLayout layout = new LinearLayout(context);
//            TextView textView = new TextView(context);
//            textView.setVisibility(View.VISIBLE);
//            textView.setText(player.getString("text"));
//            textView.setTextColor(Color.argb(auxColor[0], auxColor[1], auxColor[2], auxColor[3]));
//            textView.setPivotX(0);
//            textView.setPivotY(0);
////            textView.setTextSize(CustomAnimation.convertDpToPixels(4, context)* (float)player.getDouble("scale"));
//            textView.setTextSize( (testeWIDTH *screenWidth/1000) * (float)player.getDouble("scale"));
//            textView.setRotation((float) player.getDouble("rotation"));
//
//
//            layout.addView(textView);
////            int heighttTeste = player.getInt("height");
////            int widthTeste =  player.getInt("width");
//            int heighttTeste = ((player.getInt("height") * screenHeight) / 577);
//            int widthTeste =   ((player.getInt("width") * screenWidth) / 906);
//            layout.measure(widthTeste,heighttTeste);
//            layout.layout(0, 0,widthTeste,heighttTeste);
//
//            posX = ((player.getInt("x") * screenWidth) / 906);
//            posY = ((player.getInt("y") * screenHeight) / 577);
//
////            posX = CustomAnimation.convertDpToPixels(((player.getInt("x") * screenWidth) / 906), context);
////            posY = CustomAnimation.convertDpToPixels(((player.getInt("y") * screenHeight) / 577), context);
////
////            posX += (player.getInt("scale")*CustomAnimation.convertDpToPixels(((30 * screenWidth) / 906), context))/CustomAnimation.convertDpToPixels(2.96f,context);
////            posY += (player.getInt("scale")*CustomAnimation.convertDpToPixels(((30 * screenHeight) / 577), context))/CustomAnimation.convertDpToPixels(2.96f,context);
//
//            canvas.translate(posX,posY);
//            layout.draw(canvas);
//            canvas.restore();



//TESTE 2
//            int heighttTeste = ((player.getInt("height") * screenHeight) / 577);
//            int widthTeste =   ((player.getInt("width") * screenWidth) / 906);
//
//            canvas.save();
//            LinearLayout layout = new LinearLayout(context);
//            TextView textView = new TextView(context);
//            textView.setVisibility(View.VISIBLE);
//            textView.setText(player.getString("text"));
////            textView.setWidth(widthTeste);
//            textView.setBackgroundColor(Color.YELLOW);
//            textView.setPivotX(0);
//            textView.setPivotY(0);
//            textView.setTextSize( (testeWIDTH *screenWidth/1000) * (float) player.getDouble("scale"));
////            textView.setTextSize( (testeWIDTH * (float) player.getDouble("scale")));
//
//            heighttTeste =(int) (heighttTeste * player.getDouble("scale"));
//            widthTeste =(int) (widthTeste * player.getDouble("scale"));
//            textView.setWidth(widthTeste);
//            textView.setHeight(heighttTeste);
//
//            layout.addView(textView);
//            layout.measure(widthTeste, heighttTeste);
//            layout.layout(0, 0, widthTeste, heighttTeste);
//            layout.setBackgroundColor(Color.BLUE);
//
//            float posX = ((player.getInt("x") * screenWidth) / 906);
//            float posY = ((player.getInt("y") * screenHeight) / 577);
//            // To place the text view somewhere specific:  x
//            canvas.translate(posX, posY);
//            layout.draw(canvas);
//            canvas.restore();


            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(LinearLayout.VERTICAL);
//            linearLayout.setOrientation(LinearLayout.HORIZONTAL);


            TextView textView = new TextView(context);
            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"), false);
            textView.setTextColor(Color.argb(auxColor[0], auxColor[1], auxColor[2], auxColor[3]));
            textView.setText(player.getString("text"));
//            textView.setTextSize(CustomAnimation.convertDpToPixels(4, context)* (float)player.getDouble("scale"));
//          textView.setTextSize( (testeWIDTH *screesnWidth/1000) * (float)player.getDouble("scale"));
//            textView.setTextSize(TypedValue.COMPLEX_UNIT_PX,CustomAnimation.convertDpToPixels(4, context)* (float)player.getDouble("scale"));
            textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, ((20 *screenWidth/1000) * (float)player.getDouble("scale")));
          textView.setRotation((float) player.getDouble("rotation"));

            linearLayout.addView(textView);
            float posX = ((player.getInt("x") * screenWidth) / 906);
            float posY = ((player.getInt("y") * screenHeight) / 577);
            posX+= (player.getDouble("scale")*16)/2.96;
            posY+= (player.getDouble("scale")*8)/2.96;
            linearLayout.setX(posX);
            linearLayout.setY(posY);
            base_svg.addView(linearLayout);


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
