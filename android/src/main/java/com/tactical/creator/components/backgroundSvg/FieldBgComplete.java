package com.tactical.creator.components.backgroundSvg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.util.Log;
import android.widget.ImageView;


public class FieldBgComplete {

    public static final float WIDTH = 906.000000f;
    public static final float HEIGHT = 577.000000f;


    private boolean inited;
    private Paint paint_0;
    private Typeface typeface_0;


    private Path path_0;

    private Path path_1;

    private Path path_2;



    private void init() {
        if (inited) return;
        inited = true;
        paint_0 = new Paint();
        typeface_0 = Typeface.create(Typeface.SANS_SERIF, 0);

        path_0 = new Path();

        path_1 = new Path();

        path_2 = new Path();


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
            path_0.moveTo(896.000000f, 250.900009f);
            path_0.lineTo(868.200012f, 250.900009f);
            path_0.lineTo(868.200012f, 201.100006f);
            path_0.lineTo(868.200012f, 118.100006f);
            path_0.lineTo(868.200012f, 29.100006f);
            path_0.lineTo(868.200012f, 12.100006f);
            path_0.lineTo(851.100037f, 12.100006f);
            path_0.lineTo(453.700012f, 12.100006f);
            path_0.lineTo(452.200012f, 12.100006f);
            path_0.lineTo(54.900002f, 12.100006f);
            path_0.lineTo(37.799999f, 12.100006f);
            path_0.lineTo(37.799999f, 29.200006f);
            path_0.lineTo(37.799999f, 118.000000f);
            path_0.lineTo(37.799999f, 201.000000f);
            path_0.lineTo(37.799999f, 250.800003f);
            path_0.lineTo(10.000000f, 250.800003f);
            path_0.lineTo(10.000000f, 326.000000f);
            path_0.lineTo(37.800003f, 326.000000f);
            path_0.lineTo(37.800003f, 375.799988f);
            path_0.lineTo(37.800003f, 458.799988f);
            path_0.lineTo(37.800003f, 547.700012f);
            path_0.lineTo(37.800003f, 564.799988f);
            path_0.lineTo(54.900002f, 564.799988f);
            path_0.lineTo(452.200012f, 564.799988f);
            path_0.lineTo(453.700012f, 564.799988f);
            path_0.lineTo(851.000000f, 564.799988f);
            path_0.lineTo(868.099976f, 564.799988f);
            path_0.lineTo(868.099976f, 547.700012f);
            path_0.lineTo(868.099976f, 459.000000f);
            path_0.lineTo(868.099976f, 376.000000f);
            path_0.lineTo(868.099976f, 326.200012f);
            path_0.lineTo(896.000000f, 326.200012f);
            path_0.lineTo(896.000000f, 250.900009f);
            path_0.close();
            path_0.moveTo(866.700012f, 13.500000f);
            path_0.lineTo(866.700012f, 27.600000f);
            path_0.cubicTo(859.200012f, 26.900000f, 853.299988f, 21.000000f, 852.600037f, 13.500000f);
            path_0.lineTo(866.700012f, 13.500000f);
            path_0.close();
            path_0.moveTo(452.300018f, 285.200012f);
            path_0.cubicTo(450.800018f, 285.500000f, 449.600006f, 286.900024f, 449.600006f, 288.500000f);
            path_0.cubicTo(449.600006f, 290.099976f, 450.800018f, 291.500000f, 452.300018f, 291.799988f);
            path_0.lineTo(452.300018f, 377.299988f);
            path_0.cubicTo(440.600006f, 377.199982f, 429.200012f, 374.899994f, 418.400024f, 370.299988f);
            path_0.cubicTo(407.800018f, 365.799988f, 398.300018f, 359.399994f, 390.100037f, 351.199982f);
            path_0.cubicTo(381.900055f, 342.999969f, 375.500031f, 333.499969f, 371.000031f, 322.899994f);
            path_0.cubicTo(366.400024f, 311.899994f, 364.000031f, 300.299988f, 364.000031f, 288.299988f);
            path_0.cubicTo(364.000031f, 276.299988f, 366.400024f, 264.699982f, 371.000031f, 253.699982f);
            path_0.cubicTo(375.500031f, 243.099976f, 381.900024f, 233.599976f, 390.100037f, 225.399979f);
            path_0.cubicTo(398.300049f, 217.199982f, 407.800049f, 210.799973f, 418.400024f, 206.299973f);
            path_0.cubicTo(429.100037f, 201.799973f, 440.500031f, 199.399979f, 452.300018f, 199.299973f);
            path_0.lineTo(452.300018f, 285.200012f);
            path_0.close();
            path_0.moveTo(453.700012f, 291.800018f);
            path_0.cubicTo(455.200012f, 291.500031f, 456.400024f, 290.100006f, 456.400024f, 288.500031f);
            path_0.cubicTo(456.400024f, 286.900055f, 455.200012f, 285.500031f, 453.700012f, 285.200043f);
            path_0.lineTo(453.700012f, 199.700043f);
            path_0.cubicTo(465.400024f, 199.800049f, 476.800018f, 202.100037f, 487.600006f, 206.700043f);
            path_0.cubicTo(498.200012f, 211.200043f, 507.700012f, 217.600037f, 515.900024f, 225.800049f);
            path_0.cubicTo(524.100037f, 234.000061f, 530.500000f, 243.500046f, 535.000000f, 254.100052f);
            path_0.cubicTo(539.599976f, 265.100037f, 542.000000f, 276.700043f, 542.000000f, 288.700043f);
            path_0.cubicTo(542.000000f, 300.700043f, 539.599976f, 312.300049f, 535.000000f, 323.300049f);
            path_0.cubicTo(530.500000f, 333.900055f, 524.099976f, 343.400055f, 515.900024f, 351.600037f);
            path_0.cubicTo(507.700073f, 359.800018f, 498.200012f, 366.200043f, 487.600037f, 370.700043f);
            path_0.cubicTo(476.900024f, 375.200043f, 465.500031f, 377.600037f, 453.700043f, 377.700043f);
            path_0.lineTo(453.700012f, 291.800018f);
            path_0.lineTo(453.700012f, 291.800018f);
            path_0.close();
            path_0.moveTo(39.299999f, 13.500000f);
            path_0.lineTo(53.400002f, 13.500000f);
            path_0.cubicTo(52.700001f, 21.000000f, 46.800003f, 26.900002f, 39.300003f, 27.600000f);
            path_0.cubicTo(39.299999f, 27.600000f, 39.299999f, 13.500000f, 39.299999f, 13.500000f);
            path_0.close();
            path_0.moveTo(11.500000f, 324.600006f);
            path_0.lineTo(11.500000f, 252.300003f);
            path_0.lineTo(37.900002f, 252.300003f);
            path_0.lineTo(37.900002f, 324.600006f);
            path_0.lineTo(11.500000f, 324.600006f);
            path_0.close();
            path_0.moveTo(39.299999f, 250.900009f);
            path_0.lineTo(39.299999f, 202.500000f);
            path_0.lineTo(112.600006f, 202.500000f);
            path_0.lineTo(112.600006f, 374.400024f);
            path_0.lineTo(39.299999f, 374.400024f);
            path_0.lineTo(39.299999f, 326.000000f);
            path_0.lineTo(39.299999f, 250.900009f);
            path_0.close();
            path_0.moveTo(114.000000f, 375.899994f);
            path_0.lineTo(114.000000f, 201.100006f);
            path_0.lineTo(39.299999f, 201.100006f);
            path_0.lineTo(39.299999f, 119.500008f);
            path_0.lineTo(181.900009f, 119.500008f);
            path_0.lineTo(181.900009f, 457.500000f);
            path_0.lineTo(39.299999f, 457.500000f);
            path_0.lineTo(39.299999f, 375.899994f);
            path_0.lineTo(114.000000f, 375.899994f);
            path_0.close();
            path_0.moveTo(39.299999f, 563.500000f);
            path_0.lineTo(39.299999f, 549.400024f);
            path_0.cubicTo(46.799999f, 550.100037f, 52.700001f, 556.000000f, 53.400002f, 563.500000f);
            path_0.lineTo(39.299999f, 563.500000f);
            path_0.close();
            path_0.moveTo(54.900002f, 563.500000f);
            path_0.cubicTo(54.200001f, 555.200012f, 47.600002f, 548.599976f, 39.300003f, 547.900024f);
            path_0.lineTo(39.300003f, 458.900024f);
            path_0.lineTo(183.400009f, 458.900024f);
            path_0.lineTo(183.400009f, 348.900024f);
            path_0.cubicTo(206.400009f, 338.500031f, 222.500015f, 315.400024f, 222.500015f, 288.500031f);
            path_0.cubicTo(222.500015f, 261.600037f, 206.500015f, 238.400024f, 183.400009f, 228.100037f);
            path_0.lineTo(183.400009f, 118.000000f);
            path_0.lineTo(39.299999f, 118.000000f);
            path_0.lineTo(39.299999f, 29.000000f);
            path_0.cubicTo(47.599998f, 28.299999f, 54.200001f, 21.700001f, 54.900002f, 13.400000f);
            path_0.lineTo(452.299988f, 13.400000f);
            path_0.lineTo(452.299988f, 198.000000f);
            path_0.cubicTo(402.699982f, 198.399994f, 362.699982f, 238.699997f, 362.699982f, 288.299988f);
            path_0.cubicTo(362.699982f, 337.899963f, 402.799988f, 378.299988f, 452.299988f, 378.599976f);
            path_0.lineTo(452.299988f, 563.199951f);
            path_0.lineTo(54.900002f, 563.199951f);
            path_0.lineTo(54.900002f, 563.500000f);
            path_0.close();
            path_0.moveTo(183.500000f, 347.300018f);
            path_0.lineTo(183.500000f, 229.699997f);
            path_0.cubicTo(194.199997f, 234.699997f, 203.300003f, 242.399994f, 210.000000f, 252.300003f);
            path_0.cubicTo(217.199997f, 263.000000f, 221.100006f, 275.500000f, 221.100006f, 288.500000f);
            path_0.cubicTo(221.100006f, 301.500000f, 217.300003f, 314.000000f, 210.000000f, 324.700012f);
            path_0.cubicTo(203.300003f, 334.600006f, 194.199997f, 342.399994f, 183.500000f, 347.300018f);
            path_0.close();
            path_0.moveTo(866.700012f, 563.500000f);
            path_0.lineTo(852.600037f, 563.500000f);
            path_0.cubicTo(853.300049f, 556.000000f, 859.200012f, 550.099976f, 866.700012f, 549.400024f);
            path_0.lineTo(866.700012f, 563.500000f);
            path_0.close();
            path_0.moveTo(866.700012f, 547.900024f);
            path_0.cubicTo(858.400024f, 548.600037f, 851.799988f, 555.200012f, 851.100037f, 563.500000f);
            path_0.lineTo(453.700012f, 563.500000f);
            path_0.lineTo(453.700012f, 378.800018f);
            path_0.cubicTo(503.300018f, 378.400024f, 543.299988f, 338.100006f, 543.299988f, 288.500000f);
            path_0.cubicTo(543.299988f, 238.899994f, 503.199982f, 198.500000f, 453.699982f, 198.199997f);
            path_0.lineTo(453.699982f, 13.500000f);
            path_0.lineTo(851.099976f, 13.500000f);
            path_0.cubicTo(851.799988f, 21.799999f, 858.399963f, 28.400002f, 866.699951f, 29.100000f);
            path_0.lineTo(866.699951f, 118.099998f);
            path_0.lineTo(722.600037f, 118.099998f);
            path_0.lineTo(722.600037f, 228.199997f);
            path_0.cubicTo(699.700012f, 238.599991f, 683.800049f, 261.700012f, 683.800049f, 288.500000f);
            path_0.cubicTo(683.800049f, 315.299988f, 699.700073f, 338.399994f, 722.600037f, 348.799988f);
            path_0.lineTo(722.600037f, 459.000000f);
            path_0.lineTo(866.700073f, 459.000000f);
            path_0.lineTo(866.700012f, 547.900024f);
            path_0.lineTo(866.700012f, 547.900024f);
            path_0.close();
            path_0.moveTo(722.600037f, 347.200012f);
            path_0.cubicTo(712.000061f, 342.200012f, 702.900024f, 334.500000f, 696.300049f, 324.700012f);
            path_0.cubicTo(689.100037f, 314.000000f, 685.200073f, 301.500000f, 685.200073f, 288.500000f);
            path_0.cubicTo(685.200073f, 275.500000f, 689.000061f, 263.000000f, 696.300049f, 252.300003f);
            path_0.cubicTo(702.900024f, 242.500000f, 712.000061f, 234.800003f, 722.600037f, 229.800003f);
            path_0.lineTo(722.600037f, 347.200012f);
            path_0.close();
            path_0.moveTo(866.700012f, 457.500000f);
            path_0.lineTo(724.100037f, 457.500000f);
            path_0.lineTo(724.100037f, 349.500000f);
            path_0.cubicTo(724.200012f, 349.500000f, 724.200012f, 349.600006f, 724.300049f, 349.600006f);
            path_0.lineTo(724.300049f, 227.400009f);
            path_0.cubicTo(724.200073f, 227.400009f, 724.200073f, 227.500015f, 724.100037f, 227.500015f);
            path_0.lineTo(724.100037f, 119.500015f);
            path_0.lineTo(866.700073f, 119.500015f);
            path_0.lineTo(866.700073f, 201.100006f);
            path_0.lineTo(792.000000f, 201.100006f);
            path_0.lineTo(792.000000f, 376.000000f);
            path_0.lineTo(866.700012f, 376.000000f);
            path_0.lineTo(866.700012f, 457.500000f);
            path_0.close();
            path_0.moveTo(866.700012f, 374.500000f);
            path_0.lineTo(793.400024f, 374.500000f);
            path_0.lineTo(793.400024f, 202.500000f);
            path_0.lineTo(866.700012f, 202.500000f);
            path_0.lineTo(866.700012f, 250.899994f);
            path_0.lineTo(866.700012f, 326.100006f);
            path_0.lineTo(866.700012f, 374.500000f);
            path_0.close();
            path_0.moveTo(894.500000f, 324.600006f);
            path_0.lineTo(868.099976f, 324.600006f);
            path_0.lineTo(868.099976f, 252.300003f);
            path_0.lineTo(894.500000f, 252.300003f);
            path_0.lineTo(894.500000f, 324.600006f);
            path_0.close();




            path_0.setFillType(Path.FillType.WINDING);
            canvas.drawPath(path_0, paint_0);
            canvas.restore();
            canvas.save();
            path_1.reset();
            path_1.moveTo(759.700012f, 285.100006f);
            path_1.cubicTo(761.577759f, 285.100006f, 763.100037f, 286.622223f, 763.100037f, 288.500000f);
            path_1.cubicTo(763.100037f, 290.377777f, 761.577759f, 291.899994f, 759.700012f, 291.899994f);
            path_1.cubicTo(757.822266f, 291.899994f, 756.299988f, 290.377777f, 756.299988f, 288.500000f);
            path_1.cubicTo(756.299988f, 286.622223f, 757.822266f, 285.100006f, 759.700012f, 285.100006f);
            path_1.close();




            canvas.drawPath(path_1, paint_0);
            canvas.restore();
            canvas.save();
            path_2.reset();
            path_2.moveTo(146.100006f, 285.100006f);
            path_2.cubicTo(147.977768f, 285.100006f, 149.500000f, 286.622223f, 149.500000f, 288.500000f);
            path_2.cubicTo(149.500000f, 290.377777f, 147.977768f, 291.899994f, 146.100006f, 291.899994f);
            path_2.cubicTo(144.222244f, 291.899994f, 142.700012f, 290.377777f, 142.700012f, 288.500000f);
            path_2.cubicTo(142.700012f, 286.622223f, 144.222244f, 285.100006f, 146.100006f, 285.100006f);
            path_2.close();




            canvas.drawPath(path_2, paint_0);
            canvas.restore();



            field_lines_image.setImageBitmap(b);
            field_lines_image.getLayoutParams().height = screenFieldHeight;
            field_lines_image.getLayoutParams().width = screenFieldWidth;


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
