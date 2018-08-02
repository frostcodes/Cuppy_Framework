package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmetrotogglebutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmetrotogglebutton", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.cfmetrotogglebutton.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _mbase = null;
public int _checked_state = 0;
public int _unchecked_state = 0;
public boolean _checkedstatus = false;
public anywheresoftware.b4j.objects.LabelWrapper _togglebutton = null;
public b4j.example.cssutils _cssutils = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public Punchline.Tech.Cuppy.Framework.cfanimationmanager _cfanimationmanager = null;
public Punchline.Tech.Cuppy.Framework.cflicensemanager _cflicensemanager = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public Punchline.Tech.Cuppy.Framework.cfhtmlutility _cfhtmlutility = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 38;BA.debugLine="ToggleButton.PrefHeight = Height";
_togglebutton.setPrefHeight(_height);
 //BA.debugLineNum = 39;BA.debugLine="ToggleButton.PrefWidth = Width";
_togglebutton.setPrefWidth(_width);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public boolean  _checked() throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Public Sub checked As Boolean";
 //BA.debugLineNum = 119;BA.debugLine="Return CheckedStatus";
if (true) return _checkedstatus;
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return false;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 10;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 11;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 12;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Public CHECKED_STATE As Int = 0";
_checked_state = (int) (0);
 //BA.debugLineNum = 16;BA.debugLine="Public UNCHECKED_STATE As Int = 1";
_unchecked_state = (int) (1);
 //BA.debugLineNum = 18;BA.debugLine="Private CheckedStatus As Boolean = False";
_checkedstatus = __c.False;
 //BA.debugLineNum = 19;BA.debugLine="Public ToggleButton As Label";
_togglebutton = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 28;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 29;BA.debugLine="mBase.LoadLayout(\"CFMetroToggleButtonUI\")";
_mbase.LoadLayout(ba,"CFMetroToggleButtonUI");
 //BA.debugLineNum = 32;BA.debugLine="setCheckState(UNCHECKED_STATE) 'set initial value";
_setcheckstate(_unchecked_state);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 44;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 23;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 24;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Public Sub removeEffects()";
 //BA.debugLineNum = 83;BA.debugLine="CFControlsUtils.removeEffect(ToggleButton)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_togglebutton.getObject())));
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public String  _setbg(String _color) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 53;BA.debugLine="CFControlsUtils.setBG(ToggleButton, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_togglebutton.getObject())),_color);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 65;BA.debugLine="CFControlsUtils.setBorder(ToggleButton, color, wi";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_togglebutton.getObject())),_color,_width);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 71;BA.debugLine="CFControlsUtils.setBorderRadius(ToggleButton, rad";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_togglebutton.getObject())),_radius);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public String  _setcheckstate(int _value) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Public Sub setCheckState(value As Int)";
 //BA.debugLineNum = 91;BA.debugLine="If value = UNCHECKED_STATE Then";
if (_value==_unchecked_state) { 
 //BA.debugLineNum = 93;BA.debugLine="SetBg(\"white\")";
_setbg("white");
 //BA.debugLineNum = 94;BA.debugLine="setBorder(\"#D6D6D6\", 2)";
_setborder("#D6D6D6",(int) (2));
 //BA.debugLineNum = 96;BA.debugLine="ToggleButton.TextColor = fx.Colors.RGB(91, 91, 9";
_togglebutton.setTextColor((javafx.scene.paint.Paint)(_fx.Colors.RGB((int) (91),(int) (91),(int) (91))));
 //BA.debugLineNum = 98;BA.debugLine="CheckedStatus = False";
_checkedstatus = __c.False;
 }else if(_value==_checked_state) { 
 //BA.debugLineNum = 103;BA.debugLine="setBorder(\"#2EA9DE\", 2)";
_setborder("#2EA9DE",(int) (2));
 //BA.debugLineNum = 104;BA.debugLine="SetBg(\"rgb(65, 177, 225 )\")";
_setbg("rgb(65, 177, 225 )");
 //BA.debugLineNum = 106;BA.debugLine="ToggleButton.TextColor = fx.Colors.White";
_togglebutton.setTextColor(_fx.Colors.White);
 //BA.debugLineNum = 108;BA.debugLine="CheckedStatus = True";
_checkedstatus = __c.True;
 };
 //BA.debugLineNum = 113;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checked";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_CheckedChanged",(Object)(_value));
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public String  _setpaneeffect(String _effect) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Public Sub setPaneEffect(effect As String)";
 //BA.debugLineNum = 77;BA.debugLine="CFControlsUtils.setEffect(ToggleButton, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_togglebutton.getObject())),_effect);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(float _angle) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Public Sub setRotationX(angle As Float)";
 //BA.debugLineNum = 59;BA.debugLine="CFControlsUtils.setRotationX(ToggleButton, angle)";
_cfcontrolsutils._setrotationx((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_togglebutton.getObject())),_angle);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public String  _togglebutton_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub ToggleButton_MousePressed (EventData As MouseE";
 //BA.debugLineNum = 125;BA.debugLine="If Not(checked) Then";
if (__c.Not(_checked())) { 
 //BA.debugLineNum = 127;BA.debugLine="setCheckState(CHECKED_STATE)";
_setcheckstate(_checked_state);
 }else {
 //BA.debugLineNum = 131;BA.debugLine="setCheckState(UNCHECKED_STATE)";
_setcheckstate(_unchecked_state);
 };
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
