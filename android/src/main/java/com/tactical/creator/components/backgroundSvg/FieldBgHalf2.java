package com.tactical.creator.components.backgroundSvg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.util.Log;
import android.widget.ImageView;



public class FieldBgHalf2 {

    public static final float WIDTH = 906.000000f;
    public static final float HEIGHT = 577.000000f;

    private boolean inited;
    private Paint paint_0;
    private Typeface typeface_0;


    private Path path_0;

    private Path path_1;



    private void init() {
        if (inited) return;
        inited = true;
        paint_0 = new Paint();
        typeface_0 = Typeface.create(Typeface.SANS_SERIF, 0);

        path_0 = new Path();

        path_1 = new Path();


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
            path_0.moveTo(385.800018f, 538.200012f);
            path_0.lineTo(385.800018f, 567.400024f);
            path_0.lineTo(518.200012f, 567.400024f);
            path_0.lineTo(518.200012f, 538.200012f);
            path_0.lineTo(895.000000f, 538.200012f);
            path_0.lineTo(895.000000f, 538.200012f);
            path_0.lineTo(895.000000f, 514.700012f);
            path_0.lineTo(895.000000f, 23.000000f);
            path_0.lineTo(895.000000f, 21.400000f);
            path_0.lineTo(895.000000f, -77.300003f);
            path_0.lineTo(539.700012f, -77.300003f);
            path_0.cubicTo(516.299988f, -97.900002f, 485.700012f, -110.400009f, 452.000000f, -110.400009f);
            path_0.cubicTo(418.299988f, -110.400009f, 387.700012f, -97.900009f, 364.299988f, -77.300003f);
            path_0.lineTo(9.000000f, -77.300003f);
            path_0.lineTo(9.000000f, 21.400002f);
            path_0.lineTo(9.000000f, 23.000000f);
            path_0.lineTo(9.000000f, 514.700012f);
            path_0.lineTo(9.000000f, 538.200012f);
            path_0.lineTo(9.000000f, 538.200012f);
            path_0.lineTo(385.800018f, 538.200012f);
            path_0.close();
            path_0.moveTo(705.299988f, 332.300018f);
            path_0.lineTo(705.299988f, 536.600037f);
            path_0.lineTo(581.799988f, 536.600037f);
            path_0.lineTo(581.799988f, 430.800018f);
            path_0.lineTo(322.200012f, 430.800018f);
            path_0.lineTo(322.200012f, 536.600037f);
            path_0.lineTo(198.699997f, 536.600037f);
            path_0.lineTo(198.699997f, 332.300018f);
            path_0.lineTo(705.299988f, 332.300018f);
            path_0.close();
            path_0.moveTo(580.200012f, 536.600037f);
            path_0.lineTo(518.200012f, 536.600037f);
            path_0.lineTo(518.200012f, 536.100037f);
            path_0.lineTo(385.800018f, 536.100037f);
            path_0.lineTo(385.800018f, 536.600037f);
            path_0.lineTo(323.800018f, 536.600037f);
            path_0.lineTo(323.800018f, 432.399994f);
            path_0.lineTo(580.200012f, 432.399994f);
            path_0.lineTo(580.200012f, 536.600037f);
            path_0.lineTo(580.200012f, 536.600037f);
            path_0.close();
            path_0.moveTo(516.600037f, 565.799988f);
            path_0.lineTo(387.399994f, 565.799988f);
            path_0.lineTo(387.399994f, 538.200012f);
            path_0.lineTo(516.700012f, 538.200012f);
            path_0.lineTo(516.700012f, 565.799988f);
            path_0.lineTo(516.600037f, 565.799988f);
            path_0.close();
            path_0.moveTo(873.200012f, 536.600037f);
            path_0.cubicTo(874.000000f, 525.800049f, 882.600037f, 517.100037f, 893.500000f, 516.300049f);
            path_0.lineTo(893.500000f, 536.600037f);
            path_0.lineTo(873.200012f, 536.600037f);
            path_0.close();
            path_0.moveTo(893.400024f, -75.700005f);
            path_0.lineTo(893.400024f, 21.399994f);
            path_0.lineTo(584.600037f, 21.399994f);
            path_0.cubicTo(584.400024f, -17.100006f, 567.800049f, -51.700005f, 541.400024f, -75.700005f);
            path_0.lineTo(893.400024f, -75.700005f);
            path_0.close();
            path_0.moveTo(448.399994f, 23.000000f);
            path_0.cubicTo(448.799988f, 24.600000f, 450.199982f, 25.900000f, 452.000000f, 25.900000f);
            path_0.cubicTo(453.800018f, 25.900000f, 455.200012f, 24.699999f, 455.600006f, 23.000000f);
            path_0.lineTo(583.000000f, 23.000000f);
            path_0.cubicTo(582.900024f, 40.400002f, 579.400024f, 57.299999f, 572.700012f, 73.199997f);
            path_0.cubicTo(566.100037f, 88.799995f, 556.700012f, 102.799995f, 544.600037f, 114.899994f);
            path_0.cubicTo(532.500061f, 126.999992f, 518.600037f, 136.399994f, 502.900024f, 143.000000f);
            path_0.cubicTo(486.700012f, 149.800003f, 469.600037f, 153.300003f, 451.900024f, 153.300003f);
            path_0.cubicTo(434.200012f, 153.300003f, 417.000031f, 149.800003f, 400.900024f, 143.000000f);
            path_0.cubicTo(385.300018f, 136.399994f, 371.300018f, 127.000000f, 359.200012f, 114.900002f);
            path_0.cubicTo(347.100006f, 102.800003f, 337.700012f, 88.900002f, 331.100006f, 73.199997f);
            path_0.cubicTo(324.500000f, 57.299995f, 321.100006f, 40.399998f, 321.000000f, 22.999996f);
            path_0.lineTo(448.399994f, 22.999996f);
            path_0.close();
            path_0.moveTo(455.600006f, 21.400000f);
            path_0.cubicTo(455.200012f, 19.799999f, 453.800018f, 18.500000f, 452.000000f, 18.500000f);
            path_0.cubicTo(450.199982f, 18.500000f, 448.799988f, 19.700001f, 448.399994f, 21.400000f);
            path_0.lineTo(321.000000f, 21.400000f);
            path_0.cubicTo(321.100006f, 4.000000f, 324.600006f, -12.900000f, 331.299988f, -28.800001f);
            path_0.cubicTo(337.899994f, -44.400002f, 347.299988f, -58.400002f, 359.399994f, -70.500000f);
            path_0.cubicTo(361.199982f, -72.300003f, 363.100006f, -74.099998f, 365.000000f, -75.800003f);
            path_0.lineTo(539.099976f, -75.800003f);
            path_0.cubicTo(541.000000f, -74.100006f, 542.899963f, -72.400002f, 544.699951f, -70.500000f);
            path_0.cubicTo(556.699951f, -58.500000f, 566.199951f, -44.500000f, 572.799927f, -28.799999f);
            path_0.cubicTo(579.500000f, -12.900001f, 582.900024f, 4.000000f, 583.000000f, 21.400000f);
            path_0.lineTo(455.600006f, 21.400000f);
            path_0.close();
            path_0.moveTo(401.000000f, -98.500000f);
            path_0.cubicTo(417.200012f, -105.300003f, 434.299988f, -108.800003f, 452.000000f, -108.800003f);
            path_0.cubicTo(469.700012f, -108.800003f, 486.899994f, -105.300003f, 503.000000f, -98.500000f);
            path_0.cubicTo(515.500000f, -93.199997f, 527.000000f, -86.099998f, 537.299988f, -77.199997f);
            path_0.lineTo(366.700012f, -77.199997f);
            path_0.cubicTo(377.000000f, -86.099998f, 388.500000f, -93.200005f, 401.000000f, -98.500000f);
            path_0.close();
            path_0.moveTo(10.600000f, -75.700005f);
            path_0.lineTo(362.600006f, -75.700005f);
            path_0.cubicTo(336.200012f, -51.600006f, 319.600006f, -17.000004f, 319.399994f, 21.399994f);
            path_0.lineTo(10.600000f, 21.399994f);
            path_0.lineTo(10.600000f, -75.700005f);
            path_0.close();
            path_0.moveTo(10.600000f, 23.000000f);
            path_0.lineTo(319.400024f, 23.000000f);
            path_0.cubicTo(319.800018f, 95.900002f, 379.000000f, 154.800003f, 452.000000f, 154.800003f);
            path_0.cubicTo(525.000000f, 154.800003f, 584.200012f, 95.900002f, 584.600037f, 23.000000f);
            path_0.lineTo(893.400024f, 23.000000f);
            path_0.lineTo(893.400024f, 514.800049f);
            path_0.cubicTo(881.700012f, 515.600037f, 872.300049f, 524.900024f, 871.600037f, 536.600037f);
            path_0.lineTo(706.900024f, 536.600037f);
            path_0.lineTo(706.900024f, 330.800018f);
            path_0.lineTo(545.600037f, 330.800018f);
            path_0.cubicTo(529.800049f, 294.700012f, 493.900024f, 269.400024f, 452.000031f, 269.400024f);
            path_0.cubicTo(410.100037f, 269.400024f, 374.200012f, 294.700012f, 358.400024f, 330.800018f);
            path_0.lineTo(197.100006f, 330.800018f);
            path_0.lineTo(197.100006f, 536.700012f);
            path_0.lineTo(32.400002f, 536.700012f);
            path_0.cubicTo(31.600002f, 525.000000f, 22.300001f, 515.600037f, 10.600000f, 514.900024f);
            path_0.cubicTo(10.600000f, 514.900024f, 10.600000f, 23.000000f, 10.600000f, 23.000000f);
            path_0.close();
            path_0.moveTo(360.300018f, 330.300018f);
            path_0.cubicTo(368.000031f, 313.200012f, 380.200012f, 298.700012f, 395.800018f, 288.100006f);
            path_0.cubicTo(412.400024f, 276.800018f, 431.900024f, 270.899994f, 452.000031f, 270.899994f);
            path_0.cubicTo(472.100037f, 270.899994f, 491.600037f, 276.899994f, 508.200043f, 288.100006f);
            path_0.cubicTo(523.800049f, 298.700012f, 536.000061f, 313.200012f, 543.700073f, 330.300018f);
            path_0.lineTo(360.300018f, 330.300018f);
            path_0.close();
            path_0.moveTo(10.600000f, 536.600037f);
            path_0.lineTo(10.600000f, 516.300049f);
            path_0.cubicTo(21.400002f, 517.100037f, 30.100000f, 525.700073f, 30.900002f, 536.600037f);
            path_0.lineTo(10.600000f, 536.600037f);
            path_0.close();




            path_0.setFillType(Path.FillType.WINDING);
            canvas.drawPath(path_0, paint_0);
            canvas.restore();
            canvas.save();
            path_1.reset();
            path_1.moveTo(452.000000f, 379.500000f);
            path_1.cubicTo(453.988220f, 379.500000f, 455.600006f, 381.111786f, 455.600006f, 383.100006f);
            path_1.cubicTo(455.600006f, 385.088226f, 453.988220f, 386.700012f, 452.000000f, 386.700012f);
            path_1.cubicTo(450.011780f, 386.700012f, 448.399994f, 385.088226f, 448.399994f, 383.100006f);
            path_1.cubicTo(448.399994f, 381.111786f, 450.011780f, 379.500000f, 452.000000f, 379.500000f);
            path_1.close();




            canvas.drawPath(path_1, paint_0);
            canvas.restore();


            field_lines_image.setImageBitmap(b);
            field_lines_image.getLayoutParams().height = screenFieldHeight;
            field_lines_image.getLayoutParams().width = screenFieldWidth;


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
