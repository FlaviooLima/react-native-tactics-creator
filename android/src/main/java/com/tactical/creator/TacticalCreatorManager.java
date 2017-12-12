package com.tactical.creator;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewManager;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

import com.tactical.creator.components.*;
import com.tactical.creator.components.backgroundSvg.*;
import com.tactical.creator.utis.CustomAnimation;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class TacticalCreatorManager extends SimpleViewManager<View> {

    private ThemedReactContext mContext;
    private View rootView;
    private Button button_play, button_pause, button_1x, button_2x, button_4x;
    private ImageView field_lines_image,field_image;
    private Boolean isPlaying;
    private int velocity, slidePosition, screenWidth, screenHeight,screenFieldWidth, screenFieldHeight;
    private JSONArray sourceArray;
    private RelativeLayout base_svg;
    private LinearLayout scrollViewLinearLayout;
    private Button lastSelectSlideButton;
    private Handler handler;
    private ScrollView scrollViewSlideBar;
    //    para apagar
    public float testeScaleWIDTH;
    public float testeScaleHEIGHT;
    public int testeWIDTH;
    public int testeHEIGHT;


    @Override
    public String getName() {
        return "TacticalCreator";
    }


    @Override
    public View createViewInstance(ThemedReactContext context) {
        mContext = context;
        rootView = LayoutInflater.from(context).inflate(R.layout.activity_tactical_creator_view, null);

        base_svg = (RelativeLayout) rootView.findViewById(R.id.base_svg);
        button_play = (Button) rootView.findViewById(R.id.button_play);
        button_pause = (Button) rootView.findViewById(R.id.button_pause);
        button_1x = (Button) rootView.findViewById(R.id.button_1x);
        button_2x = (Button) rootView.findViewById(R.id.button_2x);
        button_4x = (Button) rootView.findViewById(R.id.button_4x);

        scrollViewLinearLayout = (LinearLayout) rootView.findViewById(R.id.scrollViewLinearLayout);
        scrollViewSlideBar = (ScrollView) rootView.findViewById(R.id.scrollViewSlideBar);

        field_lines_image = (ImageView) rootView.findViewById(R.id.field_lines_image);
        field_image = (ImageView) rootView.findViewById(R.id.field_image);

        InitializeComponent();
        return rootView;
    }

    //                                   InitializeComponent
    // ######################################################################################
    // #
    // #  Function: InitializeComponent()
    // #  Objective: This is where we initialize some variabels
    // #
    // ######################################################################################

    private void InitializeComponent() {
        button_play.setOnClickListener(play());
        button_pause.setOnClickListener(pause());

        button_1x.setOnClickListener(velocitiy1());
        button_2x.setOnClickListener(velocitiy2());
        button_4x.setOnClickListener(velocitiy4());

        velocity = 4000;
        slidePosition = 0;

        handler = new Handler();
    }


    //                                   render
    // ######################################################################################
    // #
    // #  Function: render()
    // #  Objective: This is where we prepare some visuals that are dependent of information coming from react-native
    // #
    // ######################################################################################

    public void render(String typeFieldImage) {
        try {
            for (int i = 0; i < sourceArray.length(); i++) {

                Button myButton = (Button) LayoutInflater.from(mContext).inflate(R.layout.button_array_animation_sequence, scrollViewLinearLayout, false);
                if (slidePosition == i) {
                    lastSelectSlideButton = myButton;
                    myButton.setBackgroundColor(Color.parseColor("#16ad8b"));
                }
                myButton.setText("" + (i + 1));
                setOnClickSlideButtons(myButton, i);

                scrollViewLinearLayout.addView(myButton);
            }

//          set campfield  and objects base  Size

            WindowManager wm = (WindowManager) mContext.getSystemService(mContext.WINDOW_SERVICE);
            Display display = wm.getDefaultDisplay();
            DisplayMetrics metrics = new DisplayMetrics();
            display.getMetrics(metrics);
            Point size = new Point();
            display.getRealSize(size);

            float width = (float)(metrics.widthPixels-(metrics.widthPixels*0.40));
            float height = ((577f/906f)*width);

            screenWidth = (int) width;
            screenHeight = (int) height;
            screenFieldWidth = (int) width;
            screenFieldHeight = (int) height;

            base_svg.getLayoutParams().width =(int) width;
            base_svg.getLayoutParams().height = (int) height;

            setSrcImage(typeFieldImage);

            renderObjects();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //                                   renderObjects
    // ######################################################################################
    // #
    // #  Function: renderObjects()
    // #  Objective: This is where we render all elements of field (Players, balls, etc...)
    // #  TODO: Create The rest of things to display in field
    // #
    // ######################################################################################

    public void renderObjects() {

        final ArrayList<View> childToRemove = new ArrayList<View>();

        for (int aux = 1; aux < base_svg.getChildCount(); aux++) {
            childToRemove.add(base_svg.getChildAt(aux));
        }


        try {
            JSONObject slide = sourceArray.getJSONObject(slidePosition);

            if (slide.has("playerExercises")) {
                JSONArray playerExercises = slide.getJSONArray("playerExercises");
                for (int i = 0; i < playerExercises.length(); i++) {
                    JSONObject player = playerExercises.getJSONObject(i);

                    switch (player.getInt("type")) {
                        case 0:
                            (new PlayerCircle()).create(mContext, base_svg, player, screenHeight, screenWidth, velocity, getElementLastPosition("playerExercises", i));
                            break;
                        case 1:
                            (new PlayerFront()).create(mContext, base_svg, player, screenHeight, screenWidth, velocity, getElementLastPosition("playerExercises", i));
                            break;
                        case 2:
                            (new PlayerTop()).create(mContext, base_svg, player, screenHeight, screenWidth, velocity, getElementLastPosition("playerExercises", i));
                            break;
                        case 3:
                            (new PlayerArrow()).create(mContext, base_svg, player, screenHeight, screenWidth, velocity, getElementLastPosition("playerExercises", i));
                            break;
                    }
                }

            }


            if (slide.has("objectsField")) {

                JSONArray objectsField = slide.getJSONArray("objectsField");
                for (int i = 0; i < objectsField.length(); i++) {
                    JSONObject object = objectsField.getJSONObject(i);
                    switch (object.getInt("type")) {
                        case 11:
                            (new Rede()).create(mContext, base_svg, object, screenHeight, screenWidth, velocity, getElementLastPosition("objectsField", i));
                            break;
                        case 10:
                            (new BalizaCircular()).create(mContext, base_svg, object, screenHeight, screenWidth, velocity, getElementLastPosition("objectsField", i));
                            break;
                        case 9:
                            (new Baliza2()).create(mContext, base_svg, object, screenHeight, screenWidth, velocity, getElementLastPosition("objectsField", i));
                            break;
                        case 8:
                            (new Pessoa()).create(mContext, base_svg, object, screenHeight, screenWidth, velocity, getElementLastPosition("objectsField", i));
                            break;
                        case 7:
                            (new Poste()).create(mContext, base_svg, object, screenHeight, screenWidth, velocity, getElementLastPosition("objectsField", i));
                            break;
                        case 6:
                            (new Barreira()).create(mContext, base_svg, object, screenHeight, screenWidth, velocity, getElementLastPosition("objectsField", i));
                            break;
                        case 5:
                            (new Bandeira()).create(mContext, base_svg, object, screenHeight, screenWidth, velocity, getElementLastPosition("objectsField", i));
                            break;
                        case 4:
                            (new Rodas()).create(mContext, base_svg, object, screenHeight, screenWidth, velocity, getElementLastPosition("objectsField", i));
                            break;
                        case 3:
                            (new Escada()).create(mContext, base_svg, object, screenHeight, screenWidth, velocity, getElementLastPosition("objectsField", i));
                            break;
                        case 2:
                            (new Prato()).create(mContext, base_svg, object, screenHeight, screenWidth, velocity, getElementLastPosition("objectsField", i));
                            break;
                        case 1:
                            (new Cone()).create(mContext, base_svg, object, screenHeight, screenWidth, velocity, getElementLastPosition("objectsField", i));
                            break;
                        case 0:
                            (new Ball()).create(mContext, base_svg, object, screenHeight, screenWidth, velocity, getElementLastPosition("objectsField", i));
                            break;
                    }
                }
            }


            if (slide.has("FigGeo")) {
                JSONArray FigGeo = slide.getJSONArray("FigGeo");
                for (int i = 0; i < FigGeo.length(); i++) {
                    JSONObject object = FigGeo.getJSONObject(i);
                    switch (object.getInt("typeFig")) {
                        case 4:
                            (new Polygon()).create(mContext, base_svg, object, screenHeight, screenWidth, false, 5);
                            break;
                        case 3:
                            (new Triangles()).create(mContext, base_svg, object, screenHeight, screenWidth);
                            break;
                        case 2:
                            (new Rectangle()).create(mContext, base_svg, object, screenHeight, screenWidth);
                            break;
                        case 1:
                            (new Ellipses()).create(mContext, base_svg, object, screenHeight, screenWidth);
                            break;
                        default:
                            (new Polygon()).create(mContext, base_svg, object, screenHeight, screenWidth, true, 6);
                            break;
                    }
                }
            }

            //TODO: linhas estao a fazer um drop de perfomance
            if (slide.has("lines")) {
                JSONArray lines = slide.getJSONArray("lines");
                Bitmap b = Bitmap.createBitmap((int) CustomAnimation.convertDpToPixels(screenWidth, mContext), (int) CustomAnimation.convertDpToPixels(screenHeight, mContext), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(b);
                for (int i = 0; i < lines.length(); i++) {
                    JSONObject object = lines.getJSONObject(i);
                    (new Line()).create(canvas, mContext, base_svg, object, screenHeight, screenWidth);
                }
                ImageView myImage = new ImageView(mContext);
                myImage.setImageBitmap(b);
                myImage.setPivotX(0.0f);
                myImage.setPivotY(0.0f);
                myImage.setX(0);
                myImage.setY(0);
                base_svg.addView(myImage);
            }


            if (slide.has("ball")) {
                JSONArray ball = slide.getJSONArray("ball");
                for (int i = 0; i < ball.length(); i++) {
                    JSONObject object = ball.getJSONObject(i);
                    (new Ball()).create(mContext, base_svg, object, screenHeight, screenWidth, velocity, getElementLastPosition("objectsField", i));
                }
            }


            if (slide.has("textObjectsField")) {
                JSONArray textObjectsField = slide.getJSONArray("textObjectsField");
                Bitmap b = Bitmap.createBitmap((int) screenWidth, (int) screenHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(b);
                for (int i = 0; i < textObjectsField.length(); i++) {
                    JSONObject object = textObjectsField.getJSONObject(i);
                    (new Text()).create(canvas, mContext,  object, screenHeight, screenWidth, base_svg);
                }
                ImageView myImage = new ImageView(mContext);
                myImage.setImageBitmap(b);
                myImage.setX(0);
                myImage.setY(0);
                base_svg.addView(myImage);
            }


//          Completelly re draw all elements
            base_svg.post(measureAndLayout);

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    for (int auxiliar = 0; auxiliar < childToRemove.size(); auxiliar++) {
                        base_svg.removeView(childToRemove.get(auxiliar));
                    }
                    childToRemove.clear();
                }
            }, 3);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private float[] getElementLastPosition(String typeOfElemt, int position) throws JSONException {
        float[] whatReturn = new float[]{0.0f, 0.0f, 0.0f};
        int slidePositionCopy = slidePosition;

        if (sourceArray.length() > 1) {
            if ((slidePositionCopy - 1) == -1) {
                slidePositionCopy = sourceArray.length() - 1;
            } else {
                slidePositionCopy -= 1;
            }

            switch (typeOfElemt) {
                case "playerExercises":
                    JSONObject slide = sourceArray.getJSONObject(slidePositionCopy);
                    JSONArray playerExercises = slide.getJSONArray("playerExercises");
                    JSONObject player = playerExercises.getJSONObject(position);
                    JSONObject lineAnima = player.getJSONObject("lineAnima");
                    JSONArray data = lineAnima.optJSONArray("data");
                    whatReturn = new float[]{(int) ((Float.parseFloat(data.getString((data.length() - 2))) * screenWidth) / 906), (int) (( Float.parseFloat(data.getString((data.length() - 1))) * screenHeight) / 577) , Float.parseFloat(player.getString("rotation"))};
                    break;
                case "objectsField":
                    JSONObject slide2 = sourceArray.getJSONObject(slidePositionCopy);
                    JSONArray objectsField = slide2.getJSONArray("objectsField");
                    JSONObject object = objectsField.getJSONObject(position);
                    JSONObject lineAnimaObject = object.getJSONObject("lineAnima");
                    JSONArray data2 = lineAnimaObject.optJSONArray("data");
                    whatReturn = new float[]{(int) ((Float.parseFloat(data2.getString((data2.length() - 2))) * screenWidth) / 906), (int) (( Float.parseFloat(data2.getString((data2.length() - 1))) * screenHeight) / 577) , Float.parseFloat(object.getString("rotation"))};
                    break;
            }
        }

        return whatReturn;
    }


    //                                   sequenceButtonManager
    // ######################################################################################
    // #
    // # function: sequenceButtonManager()
    // #  Objective: This function set the buttons in the sequence Array enable or disable to touch
    // #
    // ######################################################################################

    private void sequenceButtonManager(Boolean setEnabled) {
        for (int i = 0; i < scrollViewLinearLayout.getChildCount(); i++) {
            Button btn = (Button) scrollViewLinearLayout.getChildAt(i);
            btn.setEnabled(setEnabled);
        }
    }

    //                                   playManager
    // ######################################################################################
    // #
    // # function: playManager()
    // #  Objective: This function makes the cycle happen of when play is true
    // #
    // ######################################################################################

    public void playManager() {

        lastSelectSlideButton.setBackgroundColor(Color.parseColor("#2e2e2e"));

        if (slidePosition >= (sourceArray.length() - 1)) {
            slidePosition = 0;
        } else {
            slidePosition += 1;
        }

        lastSelectSlideButton = (Button) scrollViewLinearLayout.getChildAt(slidePosition);
        lastSelectSlideButton.setBackgroundColor(Color.parseColor("#16ad8b"));

        scrollViewSlideBar.post(new Runnable() {
            @Override
            public void run() {
                scrollViewSlideBar.smoothScrollTo(0, (int) lastSelectSlideButton.getY());
            }
        });
        renderObjects();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                playManager();
            }
        }, velocity);
    }

    //                                   OnClickListener
    // ######################################################################################
    // #
    // #  Group of Listners
    // #  Objective: This are static listeners used in the component.
    // #
    // ######################################################################################
    public View.OnClickListener play() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_play.setVisibility(View.GONE);
                button_pause.setVisibility(View.VISIBLE);
                isPlaying = true;
                sequenceButtonManager(false);
                playManager();
            }
        };
    }

    public View.OnClickListener pause() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_pause.setVisibility(View.GONE);
                button_play.setVisibility(View.VISIBLE);
                isPlaying = false;
                sequenceButtonManager(true);
                handler.removeCallbacksAndMessages(null);
            }
        };
    }

    public View.OnClickListener velocitiy1() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                velocity = 4000;
                button_1x.setBackgroundColor(Color.parseColor("#16ad8b"));
                button_2x.setBackgroundColor(Color.parseColor("#2e2e2e"));
                button_4x.setBackgroundColor(Color.parseColor("#2e2e2e"));
            }
        };
    }

    public View.OnClickListener velocitiy2() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                velocity = 2000;
                button_1x.setBackgroundColor(Color.parseColor("#2e2e2e"));
                button_2x.setBackgroundColor(Color.parseColor("#16ad8b"));
                button_4x.setBackgroundColor(Color.parseColor("#2e2e2e"));
            }
        };
    }

    public View.OnClickListener velocitiy4() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                velocity = 1000;
                button_1x.setBackgroundColor(Color.parseColor("#2e2e2e"));
                button_2x.setBackgroundColor(Color.parseColor("#2e2e2e"));
                button_4x.setBackgroundColor(Color.parseColor("#16ad8b"));
            }
        };
    }


    //                                   setOnClickSlideButtons
    // ######################################################################################
    // #
    // #  Function: setOnClickSlideButtons()
    // #  Objective: This is used to set Listener to all buttons that are used to change slide
    // #
    // ######################################################################################

    private void setOnClickSlideButtons(final Button btn, final int slideNumber) {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lastSelectSlideButton.setBackgroundColor(Color.parseColor("#2e2e2e"));
                lastSelectSlideButton = btn;
                btn.setBackgroundColor(Color.parseColor("#16ad8b"));

                slidePosition = slideNumber;
                renderObjects();
            }
        });
    }


    //                                   measureAndLayout
    // ######################################################################################
    // #
    // #  runnable: post(measureAndLayout)
    // #  Objective: This is used to  force a redraw of all the view, that react dont let us render
    // #
    // ######################################################################################

    private final Runnable measureAndLayout = new Runnable() {
        @Override
        public void run() {
            base_svg.measure(
                    View.MeasureSpec.makeMeasureSpec(base_svg.getWidth(), View.MeasureSpec.EXACTLY),
                    View.MeasureSpec.makeMeasureSpec(base_svg.getHeight(), View.MeasureSpec.EXACTLY));
            base_svg.layout(base_svg.getLeft(), base_svg.getTop(), base_svg.getRight(), base_svg.getBottom());
        }
    };

    private final Runnable measureAndLayoutForPhoto = new Runnable() {
        @Override
        public void run() {
            rootView.measure(
                    View.MeasureSpec.makeMeasureSpec(rootView.getWidth(), View.MeasureSpec.EXACTLY),
                    View.MeasureSpec.makeMeasureSpec(rootView.getHeight(), View.MeasureSpec.EXACTLY));
            rootView.layout(rootView.getLeft(), rootView.getTop(), rootView.getRight(), rootView.getBottom());
        }
    };






    //                                   Props From React
    // ######################################################################################
    // #
    // #  Objective: This is where we recieve all the props from react native
    // #
    // ######################################################################################

    public void setSrcImage(String source) {
        switch (source) {
            case "field-bg-complete":
                (new FieldBgComplete()).create(field_lines_image,   screenFieldHeight,  screenFieldWidth);
                break;
            case "field-bg-half":
                (new FieldBgHalf()).create(field_lines_image,   screenFieldHeight,  screenFieldWidth);
                break;
            case "field-bg-half2":
                (new FieldBgHalf2()).create(field_lines_image,   screenFieldHeight,  screenFieldWidth);
                break;
            case "field-bg-rectangle":
                (new FieldBgRectangle()).create(field_lines_image,   screenFieldHeight,  screenFieldWidth);
                break;
            case "field-bg-rectangle2":
                (new FieldBgRectangle2()).create(field_lines_image,   screenFieldHeight,  screenFieldWidth);
                break;
            case "field-bg-rectangle3":
                (new FieldBgRectangle3()).create(field_lines_image,   screenFieldHeight,  screenFieldWidth);
                break;
            case "field-bg-rectangle4":
                (new FieldBgRectangle4()).create(field_lines_image,   screenFieldHeight,  screenFieldWidth);
                break;
            case "field-bg-rectangle6":
                (new FieldBgRectangle6()).create(field_lines_image, screenFieldHeight,  screenFieldWidth);
                break;
            case "field-bg-square":
                (new FieldBgSquare()).create(field_lines_image, screenFieldHeight,  screenFieldWidth);
                break;
            case "field-bg-triangle":
                (new FieldBgTriangle()).create(field_lines_image, screenFieldHeight,  screenFieldWidth);
                break;
            case "field-bg-circle":
                (new FieldBgCircle()).create(field_lines_image, screenFieldHeight,  screenFieldWidth);
                break;
            case "false":
                break;
        }
    }

    @ReactProp(name = "data")
    public void setData(View view, String source) {
        try {

            JSONObject auxObject = new JSONObject(source);
            sourceArray = auxObject.getJSONArray("preparedData");

            if(auxObject.getBoolean("deleteView")){
                ((ViewManager)rootView.getParent()).removeView(rootView);
                handler.removeCallbacksAndMessages(null);
            }




            if(auxObject.getBoolean("takingPhotos")){
                rootView.findViewById(R.id.control_bar).setVisibility(View.GONE);
                rootView.findViewById(R.id.slide_bar).setVisibility(View.GONE);
                rootView.post(measureAndLayoutForPhoto);
            }





            render(auxObject.getString("typeFieldImage"));

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}





