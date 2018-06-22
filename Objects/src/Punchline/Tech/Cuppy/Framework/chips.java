package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class chips extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.chips", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.chips.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _mbase = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _innerbuttonpane = null;
public anywheresoftware.b4j.objects.LabelWrapper _innerlabel = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _innerpane = null;
public b4j.example.cssutils _cssutils = null;
public Punchline.Tech.Cuppy.Framework.configs _configs = null;
public Punchline.Tech.Cuppy.Framework.componentsmanager _componentsmanager = null;
public Punchline.Tech.Cuppy.Framework.stylemanager _stylemanager = null;
public Punchline.Tech.Cuppy.Framework.controlsutils _controlsutils = null;
public Punchline.Tech.Cuppy.Framework.stringutility _stringutility = null;
public Punchline.Tech.Cuppy.Framework.cuppyglobals _cuppyglobals = null;
public Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public Punchline.Tech.Cuppy.Framework.fileutility _fileutility = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 31;BA.debugLine="InnerPane.PrefWidth = Width";
_innerpane.setPrefWidth(_width);
 //BA.debugLineNum = 32;BA.debugLine="InnerPane.PrefHeight =  Height";
_innerpane.setPrefHeight(_height);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 7;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 8;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Public InnerButtonPane As Pane";
_innerbuttonpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Public InnerLabel As Label";
_innerlabel = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Public InnerPane As Pane";
_innerpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 22;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 23;BA.debugLine="mBase.LoadLayout(\"ChipsLayout\")";
_mbase.LoadLayout(ba,"ChipsLayout");
 //BA.debugLineNum = 25;BA.debugLine="SetBg(StyleManager.DefaultTheme.Get(\"accent\"))";
_setbg(BA.ObjectToString(_stylemanager._defaulttheme.Get((Object)("accent"))));
 //BA.debugLineNum = 26;BA.debugLine="InnerLabel.Font = StyleManager.SelectFont(\"Thin\",";
_innerlabel.setFont(_stylemanager._selectfont("Thin",12));
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 37;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 17;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 18;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Public Sub removeEffects()";
 //BA.debugLineNum = 78;BA.debugLine="ControlsUtils.removePaneEffect(InnerPane)";
_controlsutils._removepaneeffect(_innerpane);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _setbg(String _color) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 42;BA.debugLine="CSSUtils.SetStyleProperty( InnerPane, \"-fx-backgr";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerpane.getObject())),"-fx-background-color",_color);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 58;BA.debugLine="ControlsUtils.setPaneBorder(InnerPane, color, wid";
_controlsutils._setpaneborder(_innerpane,_color,_width);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 65;BA.debugLine="ControlsUtils.setPaneBorderRadius(InnerPane, radi";
_controlsutils._setpaneborderradius(_innerpane,_radius);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public String  _setpaneeffect(String _effect) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Public Sub setPaneEffect(effect As String)";
 //BA.debugLineNum = 72;BA.debugLine="ControlsUtils.setPaneEffect(InnerPane, effect)";
_controlsutils._setpaneeffect(_innerpane,_effect);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(float _angle) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Public Sub setRotationX(angle As Float)";
 //BA.debugLineNum = 52;BA.debugLine="ControlsUtils.setPaneRotationX(InnerPane, angle)";
_controlsutils._setpanerotationx(_innerpane,_angle);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
