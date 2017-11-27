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
import com.tactical.creator.utis.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigDecimal;

public class PlayerTop {
    int[] auxColor;

    private CustomAnimation CustomAnimation = new CustomAnimation();


    public static final float WIDTH = 1000.000000f;
    public static final float HEIGHT = 1000.000000f;

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

    }


    public void create(ThemedReactContext context, RelativeLayout base_svg, JSONObject player, Integer screenHeight, Integer screenWidth, Integer velocity, float[] lastPosition) {

        try {
            float scale = 1;
            scale = BigDecimal.valueOf(player.getDouble("scale")).floatValue();

            int realWidth = (int) (35 * scale);
            int realHeight = (int) (35 * scale);

            Bitmap b = Bitmap.createBitmap((int) realWidth, (int) realHeight, Bitmap.Config.ARGB_8888);
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
            paint_2.set(paint_0);
            paint_2.setColor(0xff010101);
            path_0.reset();
            path_0.moveTo(741.100037f, 773.200012f);
            path_0.cubicTo(756.100037f, 799.500000f, 745.400024f, 919.600037f, 709.400024f, 926.700012f);
            path_0.cubicTo(673.400024f, 933.799988f, 629.200012f, 891.799988f, 610.600037f, 832.900024f);
            path_0.cubicTo(592.100037f, 774.000000f, 608.800049f, 753.200012f, 642.300049f, 713.400024f);
            path_0.cubicTo(675.900024f, 673.600037f, 726.100037f, 746.900024f, 741.100037f, 773.200012f);
            path_0.close();

            path_0.setFillType(Path.FillType.WINDING);
            canvas.drawPath(path_0, paint_2);
            canvas.restore();
            canvas.save();
            paint_3.reset();
            paint_3.set(paint_0);
            paint_3.setColor(0xff010101);
            path_1.reset();
            path_1.moveTo(262.000000f, 773.200012f);
            path_1.cubicTo(247.000000f, 799.500000f, 257.700012f, 919.600037f, 293.700012f, 926.700012f);
            path_1.cubicTo(329.700012f, 933.799988f, 373.900024f, 891.799988f, 392.500000f, 832.900024f);
            path_1.cubicTo(411.000000f, 774.000000f, 394.299988f, 753.200012f, 360.799988f, 713.400024f);
            path_1.cubicTo(327.200012f, 673.600037f, 277.000000f, 746.900024f, 262.000000f, 773.200012f);
            path_1.close();

            path_1.setFillType(Path.FillType.WINDING);
            canvas.drawPath(path_1, paint_3);
            canvas.restore();
            canvas.save();
            paint_4.reset();
            paint_4.set(paint_0);
            paint_4.setColor(0xfff1c699);
            path_2.reset();
            path_2.moveTo(772.100037f, 756.299988f);
            path_2.cubicTo(772.100037f, 756.299988f, 766.000061f, 826.299988f, 772.100037f, 846.500000f);
            path_2.cubicTo(778.200012f, 866.700012f, 778.000061f, 868.099976f, 797.100037f, 880.299988f);
            path_2.cubicTo(816.200012f, 892.500000f, 841.700012f, 880.500000f, 859.700012f, 870.299988f);
            path_2.cubicTo(877.700012f, 860.099976f, 903.500000f, 818.299988f, 903.500000f, 818.299988f);
            path_2.lineTo(772.100037f, 756.299988f);
            path_2.close();

            path_2.setFillType(Path.FillType.WINDING);
            canvas.drawPath(path_2, paint_4);
            canvas.restore();
            canvas.save();
            paint_5.reset();
            paint_5.set(paint_0);
            paint_5.setColor(0xfff1c699);
            path_3.reset();
            path_3.moveTo(224.600006f, 756.299988f);
            path_3.cubicTo(224.600006f, 756.299988f, 230.700012f, 826.299988f, 224.600006f, 846.500000f);
            path_3.cubicTo(218.500000f, 866.700012f, 218.700012f, 868.099976f, 199.600006f, 880.299988f);
            path_3.cubicTo(180.500000f, 892.500000f, 155.000000f, 880.500000f, 137.000000f, 870.299988f);
            path_3.cubicTo(119.000000f, 860.099976f, 93.199997f, 818.299988f, 93.199997f, 818.299988f);
            path_3.lineTo(224.600006f, 756.299988f);
            path_3.close();

            path_3.setFillType(Path.FillType.WINDING);
            canvas.drawPath(path_3, paint_5);
            canvas.restore();
            canvas.save();
            paint_6.reset();
            paint_6.set(paint_0);
            auxColor = CustomAnimation.getColorIntAsColor(player.getInt("color"), false);
            paint_6.setARGB(auxColor[0], auxColor[1], auxColor[2], auxColor[3]);

            path_4.reset();
            path_4.moveTo(8.900001f, 371.300018f);
            path_4.cubicTo(143.500000f, 239.699997f, 343.000000f, 198.800003f, 343.000000f, 198.800003f);
            path_4.cubicTo(343.000000f, 198.800003f, 435.399994f, 174.400009f, 660.500000f, 208.900009f);
            path_4.cubicTo(885.599976f, 243.400009f, 965.599976f, 342.300018f, 987.500000f, 365.200012f);
            path_4.cubicTo(1009.400024f, 388.100006f, 996.000000f, 453.500000f, 996.000000f, 521.300049f);
            path_4.cubicTo(996.000000f, 589.100098f, 900.299988f, 838.799988f, 895.400024f, 852.000000f);
            path_4.cubicTo(890.600037f, 865.200012f, 875.800049f, 862.599976f, 860.800049f, 865.200012f);
            path_4.cubicTo(821.300049f, 872.799988f, 765.200073f, 830.200012f, 758.600037f, 814.500000f);
            path_4.cubicTo(752.000061f, 798.799988f, 754.200012f, 786.299988f, 758.600037f, 771.299988f);
            path_4.cubicTo(763.000061f, 756.299988f, 771.800049f, 751.299988f, 780.000061f, 746.899963f);
            path_4.cubicTo(788.200073f, 742.499939f, 789.800049f, 713.299988f, 775.100037f, 731.899963f);
            path_4.cubicTo(682.700012f, 850.199951f, 499.700043f, 865.199951f, 499.700043f, 865.199951f);
            path_4.cubicTo(499.700043f, 865.199951f, 322.399994f, 847.700012f, 225.500000f, 730.000000f);
            path_4.cubicTo(191.300003f, 711.200012f, 215.800003f, 745.000000f, 215.800003f, 745.000000f);
            path_4.cubicTo(215.800003f, 745.000000f, 232.800003f, 766.299988f, 240.600006f, 776.900024f);
            path_4.cubicTo(248.400009f, 787.500000f, 245.900009f, 797.900024f, 239.000000f, 812.600037f);
            path_4.cubicTo(226.399994f, 836.400024f, 157.100006f, 864.300049f, 143.399994f, 865.200012f);
            path_4.cubicTo(129.699997f, 866.100037f, 115.799995f, 853.799988f, 102.999992f, 844.600037f);
            path_4.cubicTo(49.500000f, 806.400024f, 0.000000f, 560.900024f, 0.000000f, 508.300018f);
            path_4.cubicTo(0.000000f, 455.700012f, 0.000000f, 389.399994f, 8.900001f, 371.300018f);
            path_4.close();

            path_4.setFillType(Path.FillType.WINDING);
            canvas.drawPath(path_4, paint_6);
            canvas.restore();
            canvas.save();
            paint_7.reset();
            paint_7.set(paint_1);
            paint_7.setColor(0xffffffff);
            paint_7.setStrokeWidth(0.500000f);
            paint_7.setStrokeMiter(10.000000f);
            path_5.reset();
            path_5.moveTo(293.899994f, 833.000000f);
            path_5.lineTo(334.899994f, 846.799988f);

            canvas.drawPath(path_5, paint_7);
            canvas.restore();
            canvas.save();
            paint_8.reset();
            paint_8.set(paint_1);
            paint_8.setColor(0xffffffff);
            paint_8.setStrokeWidth(0.500000f);
            paint_8.setStrokeMiter(10.000000f);
            path_6.reset();
            path_6.moveTo(294.600006f, 848.100037f);
            path_6.lineTo(335.700012f, 861.799988f);

            canvas.drawPath(path_6, paint_8);
            canvas.restore();
            canvas.save();
            paint_9.reset();
            paint_9.set(paint_1);
            paint_9.setColor(0xffffffff);
            paint_9.setStrokeWidth(0.500000f);
            paint_9.setStrokeMiter(10.000000f);
            path_7.reset();
            path_7.moveTo(295.300018f, 863.100037f);
            path_7.lineTo(336.399994f, 876.799988f);

            canvas.drawPath(path_7, paint_9);
            canvas.restore();
            canvas.save();
            paint_10.reset();
            paint_10.set(paint_1);
            paint_10.setColor(0xffffffff);
            paint_10.setStrokeWidth(0.500000f);
            paint_10.setStrokeMiter(10.000000f);
            path_8.reset();
            path_8.moveTo(712.100037f, 833.000000f);
            path_8.lineTo(671.000000f, 846.799988f);

            canvas.drawPath(path_8, paint_10);
            canvas.restore();
            canvas.save();
            paint_11.reset();
            paint_11.set(paint_1);
            paint_11.setColor(0xffffffff);
            paint_11.setStrokeWidth(0.500000f);
            paint_11.setStrokeMiter(10.000000f);
            path_9.reset();
            path_9.moveTo(711.400024f, 848.100037f);
            path_9.lineTo(670.299988f, 861.799988f);

            canvas.drawPath(path_9, paint_11);
            canvas.restore();
            canvas.save();
            paint_12.reset();
            paint_12.set(paint_1);
            paint_12.setColor(0xffffffff);
            paint_12.setStrokeWidth(0.500000f);
            paint_12.setStrokeMiter(10.000000f);
            path_10.reset();
            path_10.moveTo(710.700012f, 863.100037f);
            path_10.lineTo(669.600037f, 876.799988f);

            canvas.drawPath(path_10, paint_12);
            canvas.restore();
            canvas.save();
            paint_13.reset();
            paint_13.set(paint_0);
            paint_13.setColor(0xff054366);
            path_11.reset();
            path_11.moveTo(296.200012f, 321.000000f);
            path_11.cubicTo(296.200012f, 578.000000f, 465.000000f, 783.500000f, 503.400024f, 783.500000f);
            path_11.cubicTo(541.800049f, 783.500000f, 710.700012f, 578.000000f, 710.700012f, 321.000000f);
            path_11.lineTo(296.200012f, 321.000000f);
            path_11.close();

            path_11.setFillType(Path.FillType.WINDING);
            canvas.drawPath(path_11, paint_13);
            canvas.restore();
            canvas.save();
            paint_14.reset();
            paint_14.set(paint_0);
            paint_14.setColor(0xffcc9c71);
            path_12.reset();
            path_12.moveTo(321.200012f, 350.000000f);
            path_12.cubicTo(321.200012f, 578.000000f, 469.600037f, 756.700012f, 503.400024f, 756.700012f);
            path_12.cubicTo(537.200012f, 756.700012f, 685.700012f, 578.000000f, 685.700012f, 350.000000f);
            path_12.lineTo(321.200012f, 350.000000f);
            path_12.close();

            path_12.setFillType(Path.FillType.WINDING);
            canvas.drawPath(path_12, paint_14);
            canvas.restore();
            canvas.save();
            paint_15.reset();
            paint_15.set(paint_0);
            paint_15.setColor(0xfff1c699);
            path_13.reset();
            path_13.moveTo(310.700012f, 505.399994f);
            path_13.cubicTo(322.500000f, 544.799988f, 371.300018f, 618.200012f, 438.200012f, 645.200012f);
            path_13.cubicTo(445.100006f, 648.000000f, 451.200012f, 652.500000f, 455.400024f, 658.500000f);
            path_13.cubicTo(499.900024f, 734.900024f, 534.400024f, 659.500000f, 534.400024f, 659.500000f);
            path_13.cubicTo(534.400024f, 659.500000f, 546.300049f, 648.500000f, 554.100037f, 646.000000f);
            path_13.cubicTo(616.000061f, 626.200012f, 667.800049f, 565.799988f, 692.200073f, 520.900024f);
            path_13.cubicTo(705.700073f, 496.100037f, 677.900085f, 423.000031f, 649.800049f, 423.800018f);
            path_13.lineTo(365.500031f, 432.100006f);
            path_13.cubicTo(341.300018f, 433.000000f, 303.800018f, 482.300018f, 310.700012f, 505.399994f);
            path_13.close();

            path_13.setFillType(Path.FillType.WINDING);
            canvas.drawPath(path_13, paint_15);
            canvas.restore();
            canvas.save();
            paint_16.reset();
            paint_16.set(paint_0);
            paint_16.setColor(0xff754d25);
            path_14.reset();
            path_14.moveTo(614.299988f, 510.200012f);
            path_14.cubicTo(641.500000f, 530.299988f, 667.099976f, 527.299988f, 692.200012f, 521.000000f);
            path_14.cubicTo(730.100037f, 473.399994f, 753.299988f, 411.299988f, 753.299988f, 343.000000f);
            path_14.cubicTo(753.299988f, 193.599991f, 643.099976f, 72.500000f, 507.199982f, 72.500000f);
            path_14.cubicTo(371.299988f, 72.500000f, 261.100006f, 193.600006f, 261.100006f, 343.000000f);
            path_14.cubicTo(261.100006f, 404.000000f, 279.700012f, 460.100006f, 310.700012f, 505.400024f);
            path_14.cubicTo(383.800018f, 566.600037f, 496.399994f, 618.200012f, 614.299988f, 510.200012f);
            path_14.close();

            path_14.setFillType(Path.FillType.WINDING);
            canvas.drawPath(path_14, paint_16);

            canvas.restore();


            ImageView myImage = new ImageView(context);
            myImage.setImageBitmap(b);
            myImage.setX(CustomAnimation.convertDpToPixels(((lastPosition[0] * screenWidth) / 906), context));
            myImage.setY(CustomAnimation.convertDpToPixels(((lastPosition[1] * screenHeight) / 577), context));
            myImage.setRotation(lastPosition[2]);
            base_svg.addView(myImage);

//      need to inforce the pivot for some reason
            myImage.setPivotX(0.0f);
            myImage.setPivotY(0.0f);

            JSONObject lineAnima = player.getJSONObject("lineAnima");
            JSONArray arrayPosition = lineAnima.optJSONArray("data");

            CustomAnimation.justDoIt(context, myImage, arrayPosition, screenHeight, screenWidth, velocity, (float) player.getInt("rotation"), (CustomAnimation.convertDpToPixels(0.0f, context) * scale), (CustomAnimation.convertDpToPixels(0.0f, context) * scale));

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
