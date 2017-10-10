package com.tactical.creator;

import android.view.View;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;


public class TacticalCreatorManager extends  SimpleViewManager<View>  {

  private ThemedReactContext mContext;
  private View view;

  @Override
  public String getName() {
    return "TacticalCreator";
  }

  @Override
  public View createViewInstance(ThemedReactContext context){
    // Create a view here
    // https://facebook.github.io/react-native/docs/native-components-android.html#2-implement-method-createviewinstance
    mContext = context;
    view = new View(context);
    view.setBackgroundColor(0xFF00FF00);
    return view;
  }

  @ReactProp(name = "exampleProp")
  public void setExampleProp(View view, String prop) {
    // Set properties from React onto your native component via a setter method
    // https://facebook.github.io/react-native/docs/native-components-android.html#3-expose-view-property-setters-using-reactprop-or-reactpropgroup-annotation
  }
}
