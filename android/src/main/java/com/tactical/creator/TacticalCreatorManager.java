package com.tactical.creator;

import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;


public class TacticalCreatorManager extends SimpleViewManager<View> {

    private LinearLayout slide_bar, control_bar;
    private ThemedReactContext mContext;
    private View view;
    private Button button_play, button_pause, button_1x, button_2x, button_4x;
    private Boolean isPlaying;
    private int velocity;


    @Override
    public String getName() {
        return "TacticalCreator";
    }


    @Override
    public View createViewInstance(ThemedReactContext context) {
        mContext = context;
        view = LayoutInflater.from(context).inflate(R.layout.activity_tactical_creator_view, null);

        button_play = (Button) view.findViewById(R.id.button_play);
        button_pause = (Button) view.findViewById(R.id.button_pause);
        button_1x = (Button) view.findViewById(R.id.button_1x);
        button_2x = (Button) view.findViewById(R.id.button_2x);
        button_4x = (Button) view.findViewById(R.id.button_4x);

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
    }


    public View.OnClickListener play() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("TAG", "asdasdasdasdasd PLAY FLAVIO");
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
                Log.e("TAG", "asdasdasdasdasd PAUSE FLAVIO");
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
                Log.e("TAG", "asdasdasdasdasd Velocity 1000 FLAVIO");
                velocity = 1000;
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
                Log.e("TAG", "asdasdasdasdasd Velocity 1000 FLAVIO");
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
                Log.e("TAG", "asdasdasdasdasd Velocity 1000 FLAVIO");
                velocity = 4000;
                button_1x.setBackgroundColor(Color.parseColor("#2e2e2e"));
                button_2x.setBackgroundColor(Color.parseColor("#2e2e2e"));
                button_4x.setBackgroundColor(Color.parseColor("#16ad8b"));
            }
        };
    }

    //dados para renderizar,

    @ReactProp(name = "src")
    public void setSrcImage(View view, String source) {
        Log.e("TAG", "Source Props: "+ source);
//        if (source !== "false"){
//        //set background image
//        }
    }


}
