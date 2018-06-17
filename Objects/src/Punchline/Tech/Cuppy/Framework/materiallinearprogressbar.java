package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class materiallinearprogressbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.materiallinearprogressbar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.materiallinearprogressbar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _mbase = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _progressbar = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _progresspane = null;
public b4j.example.cssutils _cssutils = null;
public Punchline.Tech.Cuppy.Framework.configs _configs = null;
public Punchline.Tech.Cuppy.Framework.componentsmanager _componentsmanager = null;
public Punchline.Tech.Cuppy.Framework.stylemanager _stylemanager = null;
public Punchline.Tech.Cuppy.Framework.controlsutils _controlsutils = null;
public Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 35;BA.debugLine="ProgressPane.PrefWidth = Width";
_progresspane.setPrefWidth(_width);
 //BA.debugLineNum = 36;BA.debugLine="ProgressPane.PrefHeight = Height";
_progresspane.setPrefHeight(_height);
 //BA.debugLineNum = 37;BA.debugLine="ProgressBar.PrefHeight = Height";
_progressbar.setPrefHeight(_height);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 11;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 12;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 13;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Public ProgressBar As Pane";
_progressbar = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Public ProgressPane As Pane";
_progresspane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 24;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 25;BA.debugLine="mBase.LoadLayout(\"MaterialLinearProgressBar\")";
_mbase.LoadLayout(ba,"MaterialLinearProgressBar");
 //BA.debugLineNum = 27;BA.debugLine="SetBg(StyleManager.DefaultTheme.Get(\"divider\"))";
_setbg(BA.ObjectToString(_stylemanager._defaulttheme.Get((Object)("divider"))));
 //BA.debugLineNum = 28;BA.debugLine="setProgressColor(StyleManager.DefaultTheme.Get(\"p";
_setprogresscolor(BA.ObjectToString(_stylemanager._defaulttheme.Get((Object)("primary"))));
 //BA.debugLineNum = 29;BA.debugLine="progress(30) 'set initial value";
_progress((int) (30));
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 42;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 19;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 20;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public String  _progress(int _value) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Public Sub progress(value As Int)";
 //BA.debugLineNum = 95;BA.debugLine="If value >= 100 Then";
if (_value>=100) { 
 //BA.debugLineNum = 96;BA.debugLine="value = 100";
_value = (int) (100);
 //BA.debugLineNum = 99;BA.debugLine="CallSub(mCallBack, mEventName & \"_ProgressFinish";
__c.CallSubNew(ba,_mcallback,_meventname+"_ProgressFinished");
 };
 //BA.debugLineNum = 103;BA.debugLine="ProgressBar.SetLayoutAnimated(400, 0 ,0 ,(value /";
_progressbar.SetLayoutAnimated((int) (400),0,0,(_value/(double)100)*_mbase.getPrefWidth(),_mbase.getPrefHeight());
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Public Sub removeEffects()";
 //BA.debugLineNum = 81;BA.debugLine="ControlsUtils.removePaneEffect(ProgressPane)";
_controlsutils._removepaneeffect(_progresspane);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public String  _setbg(String _color) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 51;BA.debugLine="CSSUtils.SetStyleProperty( ProgressPane, \"-fx-bac";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_progresspane.getObject())),"-fx-background-color",_color);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 63;BA.debugLine="ControlsUtils.setPaneBorder(ProgressPane, color,";
_controlsutils._setpaneborder(_progresspane,_color,_width);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 69;BA.debugLine="ControlsUtils.setPaneBorderRadius(ProgressPane, r";
_controlsutils._setpaneborderradius(_progresspane,_radius);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public String  _setpaneeffect(String _effect) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Public Sub setPaneEffect(effect As String)";
 //BA.debugLineNum = 75;BA.debugLine="ControlsUtils.setPaneEffect(ProgressPane, effect)";
_controlsutils._setpaneeffect(_progresspane,_effect);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public String  _setprogresscolor(String _color) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Public Sub setProgressColor(color As String)";
 //BA.debugLineNum = 89;BA.debugLine="CSSUtils.SetStyleProperty( ProgressBar, \"-fx-back";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_progressbar.getObject())),"-fx-background-color",_color);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(float _angle) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Public Sub setRotationX(angle As Float)";
 //BA.debugLineNum = 57;BA.debugLine="ControlsUtils.setPaneRotationX(ProgressPane, angl";
_controlsutils._setpanerotationx(_progresspane,_angle);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
