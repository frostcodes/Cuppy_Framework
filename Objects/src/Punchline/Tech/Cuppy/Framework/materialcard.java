package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class materialcard extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.materialcard", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.materialcard.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _mbase = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _innercard = null;
public b4j.example.cssutils _cssutils = null;
public Punchline.Tech.Cuppy.Framework.configs _configs = null;
public Punchline.Tech.Cuppy.Framework.componentsmanager _componentsmanager = null;
public Punchline.Tech.Cuppy.Framework.stylemanager _stylemanager = null;
public Punchline.Tech.Cuppy.Framework.controlsutils _controlsutils = null;
public Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 26;BA.debugLine="InnerCard.PrefWidth = Width";
_innercard.setPrefWidth(_width);
 //BA.debugLineNum = 27;BA.debugLine="InnerCard.PrefHeight = Height";
_innercard.setPrefHeight(_height);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 5;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 6;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 7;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Public InnerCard As Pane";
_innercard = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 17;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 18;BA.debugLine="mBase.LoadLayout(\"CardLayout\")";
_mbase.LoadLayout(ba,"CardLayout");
 //BA.debugLineNum = 20;BA.debugLine="setBorder(StyleManager.DefaultTheme.Get(\"divider\"";
_setborder(BA.ObjectToString(_stylemanager._defaulttheme.Get((Object)("divider"))),(int) (1));
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 32;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 12;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 13;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Public Sub removeEffects()";
 //BA.debugLineNum = 70;BA.debugLine="ControlsUtils.removePaneEffect(InnerCard)";
_controlsutils._removepaneeffect(_innercard);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public String  _setbg(String _color) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 37;BA.debugLine="CSSUtils.SetStyleProperty( InnerCard, \"-fx-backgr";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innercard.getObject())),"-fx-background-color",_color);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 49;BA.debugLine="ControlsUtils.setPaneBorder(InnerCard, color, wid";
_controlsutils._setpaneborder(_innercard,_color,_width);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 57;BA.debugLine="ControlsUtils.setPaneBorderRadius(InnerCard, radi";
_controlsutils._setpaneborderradius(_innercard,_radius);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public String  _setpaneeffect(String _effect) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Public Sub setPaneEffect(effect As String)";
 //BA.debugLineNum = 64;BA.debugLine="ControlsUtils.setPaneEffect(InnerCard, effect)";
_controlsutils._setpaneeffect(_innercard,_effect);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(float _angle) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Public Sub setRotationX(angle As Float)";
 //BA.debugLineNum = 43;BA.debugLine="ControlsUtils.setPaneRotationX(InnerCard, angle)";
_controlsutils._setpanerotationx(_innercard,_angle);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}