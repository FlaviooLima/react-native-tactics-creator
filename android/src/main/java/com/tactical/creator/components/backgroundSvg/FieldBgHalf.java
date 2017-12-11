package com.tactical.creator.components.backgroundSvg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.util.Log;
import android.widget.ImageView;

public class FieldBgHalf {

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
            path_0.moveTo(519.200012f, 39.799999f);
            path_0.lineTo(519.200012f, 10.600000f);
            path_0.lineTo(386.800018f, 10.600000f);
            path_0.lineTo(386.800018f, 39.800003f);
            path_0.lineTo(10.000000f, 39.800003f);
            path_0.lineTo(10.000000f, 39.800003f);
            path_0.lineTo(10.000000f, 63.300003f);
            path_0.lineTo(10.000000f, 555.000000f);
            path_0.lineTo(10.000000f, 556.599976f);
            path_0.lineTo(10.000000f, 655.299988f);
            path_0.lineTo(365.300018f, 655.299988f);
            path_0.cubicTo(388.700012f, 675.899963f, 419.300018f, 688.399963f, 453.000031f, 688.399963f);
            path_0.cubicTo(486.700043f, 688.399963f, 517.300049f, 675.899963f, 540.700012f, 655.299988f);
            path_0.lineTo(896.000000f, 655.299988f);
            path_0.lineTo(896.000000f, 556.599976f);
            path_0.lineTo(896.000000f, 555.000000f);
            path_0.lineTo(896.000000f, 63.299999f);
            path_0.lineTo(896.000000f, 39.799999f);
            path_0.lineTo(896.000000f, 39.799999f);
            path_0.lineTo(519.200012f, 39.799999f);
            path_0.close();
            path_0.moveTo(199.699997f, 245.699997f);
            path_0.lineTo(199.699997f, 41.400002f);
            path_0.lineTo(323.200012f, 41.400002f);
            path_0.lineTo(323.200012f, 147.200012f);
            path_0.lineTo(582.700012f, 147.200012f);
            path_0.lineTo(582.700012f, 41.400002f);
            path_0.lineTo(706.200012f, 41.400002f);
            path_0.lineTo(706.200012f, 245.700012f);
            path_0.lineTo(199.699997f, 245.699997f);
            path_0.lineTo(199.699997f, 245.699997f);
            path_0.close();
            path_0.moveTo(324.800018f, 41.400002f);
            path_0.lineTo(386.800018f, 41.400002f);
            path_0.lineTo(386.800018f, 41.900002f);
            path_0.lineTo(519.200012f, 41.900002f);
            path_0.lineTo(519.200012f, 41.400002f);
            path_0.lineTo(581.200012f, 41.400002f);
            path_0.lineTo(581.200012f, 145.600006f);
            path_0.lineTo(324.800018f, 145.600006f);
            path_0.lineTo(324.800018f, 41.400002f);
            path_0.close();
            path_0.moveTo(388.399994f, 12.200000f);
            path_0.lineTo(517.700012f, 12.200000f);
            path_0.lineTo(517.700012f, 39.799999f);
            path_0.lineTo(388.399994f, 39.799999f);
            path_0.lineTo(388.399994f, 12.200000f);
            path_0.close();
            path_0.moveTo(31.800001f, 41.400002f);
            path_0.cubicTo(31.000000f, 52.200001f, 22.400000f, 60.900002f, 11.500000f, 61.700001f);
            path_0.lineTo(11.500000f, 41.400002f);
            path_0.lineTo(31.800001f, 41.400002f);
            path_0.close();
            path_0.moveTo(11.600000f, 653.700012f);
            path_0.lineTo(11.600000f, 556.600037f);
            path_0.lineTo(320.400024f, 556.600037f);
            path_0.cubicTo(320.600037f, 595.100037f, 337.200012f, 629.700012f, 363.600037f, 653.700012f);
            path_0.lineTo(11.600000f, 653.700012f);
            path_0.close();
            path_0.moveTo(456.600006f, 555.000000f);
            path_0.cubicTo(456.200012f, 553.400024f, 454.800018f, 552.099976f, 453.000000f, 552.099976f);
            path_0.cubicTo(451.199982f, 552.099976f, 449.799988f, 553.299988f, 449.399994f, 555.000000f);
            path_0.lineTo(322.000000f, 555.000000f);
            path_0.cubicTo(322.100006f, 537.599976f, 325.600006f, 520.700012f, 332.299988f, 504.799988f);
            path_0.cubicTo(338.899994f, 489.199982f, 348.299988f, 475.199982f, 360.399994f, 463.099976f);
            path_0.cubicTo(372.500000f, 450.999969f, 386.399994f, 441.599976f, 402.100006f, 434.999969f);
            path_0.cubicTo(418.300018f, 428.199982f, 435.399994f, 424.699982f, 453.100006f, 424.699982f);
            path_0.cubicTo(470.800018f, 424.699982f, 488.000000f, 428.199982f, 504.100006f, 434.999969f);
            path_0.cubicTo(519.700012f, 441.599976f, 533.700012f, 450.999969f, 545.799988f, 463.099976f);
            path_0.cubicTo(557.899963f, 475.199982f, 567.299988f, 489.099976f, 573.899963f, 504.799988f);
            path_0.cubicTo(580.599976f, 520.700012f, 584.099976f, 537.599976f, 584.199951f, 555.000000f);
            path_0.lineTo(456.600006f, 555.000000f);
            path_0.close();
            path_0.moveTo(449.399994f, 556.600037f);
            path_0.cubicTo(449.799988f, 558.200012f, 451.199982f, 559.500061f, 453.000000f, 559.500061f);
            path_0.cubicTo(454.800018f, 559.500061f, 456.200012f, 558.300049f, 456.600006f, 556.600037f);
            path_0.lineTo(584.000000f, 556.600037f);
            path_0.cubicTo(583.900024f, 574.000061f, 580.400024f, 590.900024f, 573.700012f, 606.800049f);
            path_0.cubicTo(567.100037f, 622.400024f, 557.700012f, 636.400024f, 545.600037f, 648.500061f);
            path_0.cubicTo(543.800049f, 650.300049f, 541.900024f, 652.100037f, 540.000061f, 653.800049f);
            path_0.lineTo(365.899994f, 653.800049f);
            path_0.cubicTo(364.000000f, 652.100037f, 362.100006f, 650.400024f, 360.299988f, 648.500061f);
            path_0.cubicTo(348.299988f, 636.500061f, 338.799988f, 622.500061f, 332.199982f, 606.800049f);
            path_0.cubicTo(325.499969f, 590.900024f, 321.999969f, 574.000061f, 321.899994f, 556.600037f);
            path_0.lineTo(449.399994f, 556.600037f);
            path_0.close();
            path_0.moveTo(504.000000f, 676.500000f);
            path_0.cubicTo(487.799988f, 683.299988f, 470.700012f, 686.799988f, 453.000000f, 686.799988f);
            path_0.cubicTo(435.299988f, 686.799988f, 418.100006f, 683.299988f, 402.000000f, 676.500000f);
            path_0.cubicTo(389.500000f, 671.200012f, 378.000000f, 664.099976f, 367.700012f, 655.200012f);
            path_0.lineTo(538.300049f, 655.200012f);
            path_0.cubicTo(528.000000f, 664.100037f, 516.500000f, 671.200012f, 504.000000f, 676.500000f);
            path_0.close();
            path_0.moveTo(894.400024f, 653.700012f);
            path_0.lineTo(542.400024f, 653.700012f);
            path_0.cubicTo(568.800049f, 629.600037f, 585.400024f, 595.000000f, 585.600037f, 556.600037f);
            path_0.lineTo(894.400024f, 556.600037f);
            path_0.lineTo(894.400024f, 653.700012f);
            path_0.close();
            path_0.moveTo(894.400024f, 555.000000f);
            path_0.lineTo(585.600037f, 555.000000f);
            path_0.cubicTo(585.200012f, 482.100006f, 526.000000f, 423.200012f, 453.000000f, 423.200012f);
            path_0.cubicTo(380.000000f, 423.200012f, 320.800018f, 482.100006f, 320.399994f, 555.000000f);
            path_0.lineTo(11.600000f, 555.000000f);
            path_0.lineTo(11.600000f, 63.200001f);
            path_0.cubicTo(23.299999f, 62.400002f, 32.700001f, 53.099998f, 33.400002f, 41.400002f);
            path_0.lineTo(198.100006f, 41.400002f);
            path_0.lineTo(198.100006f, 247.300018f);
            path_0.lineTo(359.400024f, 247.300018f);
            path_0.cubicTo(375.200012f, 283.400024f, 411.100037f, 308.700012f, 453.000031f, 308.700012f);
            path_0.cubicTo(494.900024f, 308.700012f, 530.800049f, 283.400024f, 546.600037f, 247.300018f);
            path_0.lineTo(707.900024f, 247.300018f);
            path_0.lineTo(707.900024f, 41.400002f);
            path_0.lineTo(872.600037f, 41.400002f);
            path_0.cubicTo(873.400024f, 53.100002f, 882.700012f, 62.500000f, 894.400024f, 63.200005f);
            path_0.lineTo(894.400024f, 555.000000f);
            path_0.close();
            path_0.moveTo(544.700012f, 247.699997f);
            path_0.cubicTo(537.000000f, 264.799988f, 524.799988f, 279.299988f, 509.200012f, 289.899994f);
            path_0.cubicTo(492.600006f, 301.199982f, 473.100006f, 307.100006f, 453.000000f, 307.100006f);
            path_0.cubicTo(432.899994f, 307.100006f, 413.399994f, 301.100006f, 396.799988f, 289.899994f);
            path_0.cubicTo(381.199982f, 279.299988f, 369.000000f, 264.799988f, 361.299988f, 247.699997f);
            path_0.lineTo(544.700012f, 247.699997f);
            path_0.close();
            path_0.moveTo(894.400024f, 41.400002f);
            path_0.lineTo(894.400024f, 61.700005f);
            path_0.cubicTo(883.600037f, 60.900005f, 874.900024f, 52.300003f, 874.100037f, 41.400002f);
            path_0.lineTo(894.400024f, 41.400002f);
            path_0.close();




            path_0.setFillType(Path.FillType.WINDING);
            canvas.drawPath(path_0, paint_0);
            canvas.restore();
            canvas.save();
            path_1.reset();
            path_1.moveTo(453.000000f, 191.300003f);
            path_1.cubicTo(454.988220f, 191.300003f, 456.600006f, 192.911789f, 456.600006f, 194.900009f);
            path_1.cubicTo(456.600006f, 196.888229f, 454.988220f, 198.500015f, 453.000000f, 198.500015f);
            path_1.cubicTo(451.011780f, 198.500015f, 449.399994f, 196.888229f, 449.399994f, 194.900009f);
            path_1.cubicTo(449.399994f, 192.911789f, 451.011780f, 191.300003f, 453.000000f, 191.300003f);
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
