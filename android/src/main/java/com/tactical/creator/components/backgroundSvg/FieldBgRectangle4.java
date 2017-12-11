package com.tactical.creator.components.backgroundSvg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.util.Log;
import android.widget.ImageView;


public class FieldBgRectangle4 {

    public static final float WIDTH = 906.000000f;
    public static final float HEIGHT = 577.000000f;

    private boolean inited;
    private Paint paint_0;
    private Typeface typeface_0;


    private Path path_0;


    private void init() {
        if (inited) return;
        inited = true;
        paint_0 = new Paint();
        typeface_0 = Typeface.create(Typeface.SANS_SERIF, 0);

        path_0 = new Path();

    }


    public void create(ImageView field_lines_image, Integer screenFieldHeight, Integer screenFieldWidth) {

        try {
            Bitmap b = Bitmap.createBitmap((int) screenFieldWidth, (int) screenFieldHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(b);


            init();
            canvas.save();
            canvas.scale(screenFieldWidth / WIDTH, screenFieldHeight / HEIGHT);
            paint_0.reset();
            paint_0.setFlags(Paint.ANTI_ALIAS_FLAG | Paint.DEV_KERN_TEXT_FLAG | Paint.SUBPIXEL_TEXT_FLAG);
            paint_0.setStyle(Paint.Style.FILL);
            paint_0.setTypeface(Typeface.DEFAULT);
            paint_0.setColor(0xFFFFFFFF);
            paint_0.setTextSize(16.000000f);
            paint_0.setTypeface(typeface_0);
            paint_0.setStrikeThruText(false);
            paint_0.setUnderlineText(false);



            canvas.save();
            path_0.reset();
            path_0.moveTo(453.700012f, 10.700000f);
            path_0.lineTo(452.200012f, 10.700000f);
            path_0.lineTo(36.200012f, 10.700000f);
            path_0.lineTo(36.200012f, 287.700012f);
            path_0.lineTo(36.200012f, 289.200012f);
            path_0.lineTo(36.200012f, 566.200012f);
            path_0.lineTo(452.200012f, 566.200012f);
            path_0.lineTo(453.700012f, 566.200012f);
            path_0.lineTo(869.700012f, 566.200012f);
            path_0.lineTo(869.700012f, 289.200012f);
            path_0.lineTo(869.700012f, 287.700012f);
            path_0.lineTo(869.700012f, 10.700012f);
            path_0.lineTo(453.700012f, 10.700000f);
            path_0.lineTo(453.700012f, 10.700000f);
            path_0.close();
            path_0.moveTo(37.700001f, 12.200000f);
            path_0.lineTo(452.200012f, 12.200000f);
            path_0.lineTo(452.200012f, 287.700012f);
            path_0.lineTo(37.700001f, 287.700012f);
            path_0.lineTo(37.700001f, 12.200000f);
            path_0.close();
            path_0.moveTo(452.300018f, 564.799988f);
            path_0.lineTo(37.700001f, 564.799988f);
            path_0.lineTo(37.700001f, 289.200012f);
            path_0.lineTo(452.200012f, 289.200012f);
            path_0.lineTo(452.300018f, 564.799988f);
            path_0.lineTo(452.300018f, 564.799988f);
            path_0.close();
            path_0.moveTo(868.299988f, 564.799988f);
            path_0.lineTo(453.700012f, 564.799988f);
            path_0.lineTo(453.700012f, 289.200012f);
            path_0.lineTo(868.200012f, 289.200012f);
            path_0.lineTo(868.299988f, 564.799988f);
            path_0.lineTo(868.299988f, 564.799988f);
            path_0.close();
            path_0.moveTo(453.700012f, 287.800018f);
            path_0.lineTo(453.700012f, 12.200000f);
            path_0.lineTo(868.200012f, 12.200000f);
            path_0.lineTo(868.200012f, 287.700012f);
            path_0.lineTo(453.700012f, 287.800018f);
            path_0.lineTo(453.700012f, 287.800018f);
            path_0.close();




            path_0.setFillType(Path.FillType.WINDING);
            canvas.drawPath(path_0, paint_0);
            canvas.restore();


            field_lines_image.setImageBitmap(b);
            field_lines_image.getLayoutParams().height = screenFieldHeight;
            field_lines_image.getLayoutParams().width = screenFieldWidth;


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
