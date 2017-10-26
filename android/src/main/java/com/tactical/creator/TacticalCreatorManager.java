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
import com.tactical.creator.components.*;

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

        velocity = 4000;
        slidePosition = 2;
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
//            String teste = "{\"preparedData\":[{\"playerExercises\":[{\"x\":60,\"rotation\":0,\"tTeam\":-1,\"y\":58,\"text\":\"\",\"playerName\":\"\",\"subs\":false,\"player_id\":0,\"color\":15219258,\"playerNumber\":0,\"lineAnima\":{\"tTeam\":-1,\"text\":\"\",\"type\":1,\"color\":15219258,\"rotation\":0,\"scale\":0.8,\"data\":[60,58]},\"scale\":0.8,\"type\":1}]},{\"playerExercises\":[{\"x\":79,\"rotation\":0,\"tTeam\":-1,\"y\":464,\"text\":\"\",\"playerName\":\"\",\"subs\":false,\"player_id\":0,\"color\":15219258,\"playerNumber\":0,\"lineAnima\":{\"color\":15219258,\"ArrowRight\":false,\"data\":[60,58,61,58,62,58,63,58,64,58,66,57,68,57,71,56,74,55,79,55,84,54,89,54,96,53,103,53,110,53,118,52,124,52,129,52,134,52,138,52,139,52,141,51,143,51,144,51,146,51,148,51,151,51,154,50,158,50,162,50,166,50,170,50,174,50,178,50,183,50,188,50,192,51,199,51,205,51,212,51,220,52,228,52,235,53,243,53,250,54,257,54,264,55,271,56,278,56,286,56,295,57,302,57,310,57,317,57,324,58,332,58,338,58,345,58,352,59,358,59,363,60,369,60,374,61,380,61,385,61,390,61,396,62,401,62,406,62,410,62,416,63,422,63,429,63,435,64,441,64,449,64,456,64,462,64,470,64,477,64,484,64,490,64,495,64,500,64,506,63,510,62,515,62,521,61,526,61,531,61,536,61,541,61,546,60,550,60,554,60,558,61,563,61,566,61,571,61,576,61,582,61,589,62,597,62,605,63,615,63,623,64,632,64,640,64,649,64,658,64,668,64,677,65,686,65,692,65,698,65,702,65,706,65,708,64,711,64,712,64,713,64,714,64,715,65,716,65,717,65,718,65,719,66,720,66,721,66,721,67,722,67,724,68,726,70,729,72,732,73,735,75,737,77,739,77,740,77,741,78,742,79,744,80,745,81,746,82,747,83,748,83,749,84,749,85,750,85,751,86,752,86,752,87,753,88,754,89,754,90,755,91,755,92,756,93,756,94,756,95,756,96,757,97,757,98,757,100,757,101,757,102,757,104,757,105,757,106,757,108,757,110,757,111,756,113,756,115,755,118,755,120,754,122,753,124,753,126,752,128,751,130,750,131,749,133,748,135,746,137,745,139,744,140,742,142,740,144,738,147,735,149,734,150,732,152,731,153,729,154,728,155,726,156,725,157,723,158,720,160,718,161,715,163,712,165,709,167,706,168,703,170,701,172,699,173,696,174,694,175,692,176,690,176,688,178,685,178,681,179,677,180,672,181,668,182,664,183,660,185,656,186,652,187,646,188,642,189,638,189,633,190,627,190,622,191,617,192,612,192,607,193,601,193,595,194,590,195,585,195,580,195,575,196,570,196,564,196,557,195,548,195,542,194,535,194,531,194,525,194,519,193,514,193,509,193,503,192,497,191,489,190,480,189,471,188,463,187,456,187,449,186,441,185,436,185,430,185,424,185,418,184,412,183,405,183,399,182,392,181,385,181,378,180,372,180,367,179,360,179,353,179,346,178,339,177,331,176,325,175,319,174,313,174,307,173,301,173,296,173,291,173,285,173,279,172,274,172,268,172,262,172,256,172,250,172,236,171,232,170,226,170,221,169,215,169,210,168,205,168,202,168,199,168,196,168,194,168,191,168,189,168,186,168,182,168,178,168,173,168,169,168,164,168,162,168,159,168,155,169,153,169,152,169,149,169,147,169,144,169,142,169,139,169,136,169,134,169,132,169,131,169,130,169,128,169,127,169,126,169,125,170,124,170,122,170,121,170,120,171,118,171,115,172,113,173,110,174,107,175,103,177,100,178,97,179,94,181,90,182,86,184,82,186,79,187,76,189,74,190,72,192,70,193,69,194,67,196,66,197,66,198,65,199,64,200,64,201,63,202,63,203,63,204,63,205,63,206,63,207,62,208,62,209,62,211,62,212,63,214,63,216,63,218,64,219,64,220,64,222,64,223,65,225,65,227,66,228,67,229,68,231,68,233,69,234,71,237,72,239,74,242,77,243,79,246,81,248,84,249,87,251,90,254,94,257,100,261,105,263,110,267,114,271,120,274,124,277,130,281,134,283,139,286,150,292,157,295,163,298,169,300,175,303,182,305,190,307,198,309,206,312,214,313,222,313,230,314,237,315,243,317,250,318,257,319,263,320,270,321,277,323,284,324,291,325,298,325,307,326,316,327,325,329,332,330,340,331,348,333,356,334,365,335,373,335,381,335,390,335,399,335,408,335,415,335,424,335,431,335,440,335,451,335,461,335,473,334,484,334,495,333,506,332,515,332,523,332,531,332,539,332,547,332,556,332,564,332,573,332,581,332,591,331,599,330,605,330,612,330,617,329,623,329,629,329,634,329,640,329,646,329,652,329,657,330,661,331,664,331,667,332,674,335,678,336,682,338,684,340,687,341,691,344,694,346,697,349,700,351,703,354,705,356,707,358,708,360,711,363,712,365,714,368,716,371,717,373,718,374,719,377,720,379,722,383,723,385,724,388,725,390,725,392,726,394,726,396,727,398,727,399,727,401,728,403,728,405,729,406,729,409,729,410,729,412,729,414,728,415,727,417,727,419,726,421,724,423,723,426,721,429,719,432,717,434,715,438,713,441,710,444,706,449,702,453,699,458,695,462,691,466,686,470,682,472,678,475,673,477,668,479,663,481,659,483,655,485,652,486,648,488,644,490,639,492,635,493,630,495,624,496,619,497,612,497,605,498,596,499,588,500,579,500,570,500,532,501,522,501,282,482,275,480,270,478,265,477,260,476,255,474,251,473,244,472,239,471,233,471,220,470,213,469,207,469,201,468,195,467,190,466,184,464,178,464,172,463,166,462,161,462,155,461,150,461,145,461,140,461,136,461,133,461,130,460,127,460,125,460,124,460,123,459,122,459,121,459,119,459,118,459,117,459,116,459,115,459,114,459,113,459,112,459,111,459,110,459,109,459,107,459,106,459,104,459,103,459,101,460,100,460,99,460,97,460,96,461,95,461,94,461,93,461,92,461,91,461,90,461,89,461,88,461,87,462,86,462,85,462,84,462,83,463,82,463,80,463,80,464,79,464],\"ArrowLeft\":false,\"lineThickness\":2,\"typeLine\":2,\"commands\":[1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2],\"tTeam\":-1,\"text\":\"\",\"type\":1,\"rotation\":0,\"scale\":0.8},\"scale\":0.8,\"type\":1}]}],\"widthOriginalDevice\":379,\"heightOriginalDevice\":250}";

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
