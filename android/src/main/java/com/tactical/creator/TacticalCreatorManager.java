package com.tactical.creator;

import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.tactical.creator.components.PlayerFront;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class TacticalCreatorManager extends SimpleViewManager<View> {

    private LinearLayout slide_bar, control_bar;
    private ThemedReactContext mContext;
    private View view;
    private Button button_play, button_pause, button_1x, button_2x, button_4x;
    private ImageView field_lines_image;
    private Boolean isPlaying;
    private int velocity, slidePosition, screenWidth, screenHeight;
    private JSONArray sourceArray;
    private RelativeLayout base_svg;


    @Override
    public String getName() {
        return "TacticalCreator";
    }


    @Override
    public View createViewInstance(ThemedReactContext context) {
        mContext = context;
        view = LayoutInflater.from(context).inflate(R.layout.activity_tactical_creator_view, null);

        base_svg = (RelativeLayout) view.findViewById(R.id.base_svg);
        button_play = (Button) view.findViewById(R.id.button_play);
        button_pause = (Button) view.findViewById(R.id.button_pause);
        button_1x = (Button) view.findViewById(R.id.button_1x);
        button_2x = (Button) view.findViewById(R.id.button_2x);
        button_4x = (Button) view.findViewById(R.id.button_4x);

        field_lines_image = (ImageView) view.findViewById(R.id.field_lines_image);

        InitializeComponent();
        return view;
    }

    private void InitializeComponent() {
        button_play.setOnClickListener(play());
        button_pause.setOnClickListener(pause());

        button_1x.setOnClickListener(velocitiy1());
        button_2x.setOnClickListener(velocitiy2());
        button_4x.setOnClickListener(velocitiy4());

        velocity = 1000;
        slidePosition = 1;
    }

    private void render() {
        try {
            JSONObject slide = sourceArray.getJSONObject(slidePosition);

//          Players
            JSONArray playerExercises = slide.getJSONArray("playerExercises");
            for (int i = 0; i < playerExercises.length(); i++) {
                JSONObject player = playerExercises.getJSONObject(i);

                switch (player.getInt("type")) {
                    case 1:
                        (new PlayerFront()).create(mContext, base_svg, player, screenHeight, screenWidth, velocity);
                        break;
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }



    public View.OnClickListener play() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_play.setVisibility(View.GONE);
                button_pause.setVisibility(View.VISIBLE);
                isPlaying = true;
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
            }
        };
    }

    public View.OnClickListener velocitiy1() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                velocity = 1000;
                button_1x.setBackgroundColor(Color.parseColor("#16ad8b"));
                button_2x.setBackgroundColor(Color.parseColor("#2e2e2e"));
                button_4x.setBackgroundColor(Color.parseColor("#2e2e2e"));
//                teste to delete
                slidePosition = 1;
                render();
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
//                teste to delete
                slidePosition = 0;
                render();
            }
        };
    }

    public View.OnClickListener velocitiy4() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                velocity = 4000;
                button_1x.setBackgroundColor(Color.parseColor("#2e2e2e"));
                button_2x.setBackgroundColor(Color.parseColor("#2e2e2e"));
                button_4x.setBackgroundColor(Color.parseColor("#16ad8b"));
            }
        };
    }


    @ReactProp(name = "src")
    public void setSrcImage(View view, String source) {

        switch (source) {
            case "field-bg-complete":
                field_lines_image.setImageResource(R.drawable.field_bg_complete);
                break;
            case "field-bg-half":
                field_lines_image.setImageResource(R.drawable.field_bg_half);
                break;
            case "field-bg-half2":
                field_lines_image.setImageResource(R.drawable.field_bg_half2);
                break;
            case "field-bg-rectangle":
                field_lines_image.setImageResource(R.drawable.field_bg_rectangle);
                break;
            case "field-bg-rectangle2":
                field_lines_image.setImageResource(R.drawable.field_bg_rectangle2);
                break;
            case "field-bg-rectangle3":
                field_lines_image.setImageResource(R.drawable.field_bg_rectangle3);
                break;
            case "field-bg-rectangle4":
                field_lines_image.setImageResource(R.drawable.field_bg_rectangle4);
                break;
            case "field-bg-rectangle6":
                field_lines_image.setImageResource(R.drawable.field_bg_rectangle6);
                break;
            case "field-bg-square":
                field_lines_image.setImageResource(R.drawable.field_bg_square);
                break;
            case "field-bg-triangle":
                field_lines_image.setImageResource(R.drawable.field_bg_triangle);
                break;
            case "field-bg-circle":
                field_lines_image.setImageResource(R.drawable.field_bg_circle);
                break;
            case "false":
                break;
        }

    }

    @ReactProp(name = "data")
    public void setScreenHeight(View view, String source) {
        try {
            JSONObject auxObject = new JSONObject(source);
            sourceArray = auxObject.getJSONArray("preparedData");
            screenWidth = auxObject.getInt("widthOriginalDevice");
            screenHeight = auxObject.getInt("heightOriginalDevice");
            render();
        } catch (JSONException e) {
            e.printStackTrace();
//            Log.e("FLAVIO", "Failed TO RECIEVE DATA");
        }
    }

}
