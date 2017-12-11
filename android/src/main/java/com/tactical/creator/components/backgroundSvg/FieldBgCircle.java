package com.tactical.creator.components.backgroundSvg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.util.Log;
import android.widget.ImageView;


public class FieldBgCircle {

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
            path_0.moveTo(453.000000f, 54.900002f);
            path_0.cubicTo(484.500000f, 54.900002f, 515.099976f, 61.100002f, 543.900024f, 73.300003f);
            path_0.cubicTo(571.700012f, 85.100006f, 596.700012f, 101.900002f, 618.100037f, 123.400009f);
            path_0.cubicTo(639.600037f, 144.900009f, 656.400024f, 169.800018f, 668.200012f, 197.600006f);
            path_0.cubicTo(680.400024f, 226.400009f, 686.600037f, 257.000000f, 686.600037f, 288.500000f);
            path_0.cubicTo(686.600037f, 320.000000f, 680.400024f, 350.600006f, 668.200012f, 379.399994f);
            path_0.cubicTo(656.400024f, 407.199982f, 639.600037f, 432.199982f, 618.100037f, 453.600006f);
            path_0.cubicTo(596.600037f, 475.100006f, 571.700012f, 491.899994f, 543.900024f, 503.700012f);
            path_0.cubicTo(515.100037f, 515.900024f, 484.500031f, 522.100037f, 453.000031f, 522.100037f);
            path_0.cubicTo(421.500031f, 522.100037f, 390.900024f, 515.900024f, 362.100037f, 503.700043f);
            path_0.cubicTo(334.300049f, 491.900055f, 309.300049f, 475.100037f, 287.900024f, 453.600037f);
            path_0.cubicTo(266.400024f, 432.100037f, 249.600021f, 407.200043f, 237.800018f, 379.400024f);
            path_0.cubicTo(225.600021f, 350.600037f, 219.400024f, 320.000031f, 219.400024f, 288.500031f);
            path_0.cubicTo(219.400024f, 257.000031f, 225.600021f, 226.400024f, 237.800018f, 197.600037f);
            path_0.cubicTo(249.600021f, 169.800034f, 266.400024f, 144.800034f, 287.900024f, 123.400032f);
            path_0.cubicTo(309.400024f, 101.900032f, 334.300018f, 85.100037f, 362.100037f, 73.300034f);
            path_0.cubicTo(390.899994f, 61.100002f, 421.500000f, 54.900002f, 453.000000f, 54.900002f);
            path_0.moveTo(453.000000f, 53.500000f);
            path_0.cubicTo(323.200012f, 53.500000f, 218.000000f, 158.700012f, 218.000000f, 288.500000f);
            path_0.cubicTo(218.000000f, 418.299988f, 323.200012f, 523.500000f, 453.000000f, 523.500000f);
            path_0.cubicTo(582.799988f, 523.500000f, 688.000000f, 418.299988f, 688.000000f, 288.500000f);
            path_0.cubicTo(688.000000f, 158.700012f, 582.799988f, 53.500000f, 453.000000f, 53.500000f);
            path_0.lineTo(453.000000f, 53.500000f);
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
