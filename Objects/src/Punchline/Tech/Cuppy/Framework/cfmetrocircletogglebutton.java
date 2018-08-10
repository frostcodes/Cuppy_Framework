package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmetrocircletogglebutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _vvvvvvvvvvvvvvvv2 = null;
public String _vvvvvvvvvvvvvvvvvvv3 = "";
public Object _vvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _vvvvvvvvvvvvvvvvvvv5 = null;
public int _checked_state = 0;
public int _unchecked_state = 0;
public boolean _vvvvvvvvvvvvvvvvvvv6 = false;
public anywheresoftware.b4j.objects.LabelWrapper _togglebutton = null;
public b4j.example.cssutils _vvvvvvvvvvvvvvvv3 = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _vvvvvvvvvvvvvvvv4 = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _vvvvvvvvvvvvvvvv5 = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _vvvvvvvvvvvvvvvv6 = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _vvvvvvvvvvvvvvvv7 = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _vvvvvvvvvvvvvvvv0 = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _vvvvvvvvvvvvvvvvv1 = null;
public Punchline.Tech.Cuppy.Framework.cfanimationmanager _vvvvvvvvvvvvvvvvv2 = null;
public Punchline.Tech.Cuppy.Framework.cflicensemanager _vvvvvvvvvvvvvvvvv3 = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _vvvvvvvvvvvvvvvvv4 = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _vvvvvvvvvvvvvvvvv5 = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _vvvvvvvvvvvvvvvvv6 = null;
public Punchline.Tech.Cuppy.Framework.cfhtmlutility _vvvvvvvvvvvvvvvvv7 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 43;BA.debugLine="ToggleButton.PrefHeight = Width";
_togglebutton.setPrefHeight(_width);
 //BA.debugLineNum = 44;BA.debugLine="ToggleButton.PrefWidth = Width";
_togglebutton.setPrefWidth(_width);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public boolean  _vvvvvvvvvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Public Sub checked As Boolean";
 //BA.debugLineNum = 124;BA.debugLine="Return CheckedStatus";
if (true) return _vvvvvvvvvvvvvvvvvvv6;
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return false;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private fx As JFX";
_vvvvvvvvvvvvvvvv2 = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 13;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvvvvvv3 = "";
 //BA.debugLineNum = 14;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvvvvvv4 = new Object();
 //BA.debugLineNum = 15;BA.debugLine="Private mBase As Pane";
_vvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Public CHECKED_STATE As Int = 1";
_checked_state = (int) (1);
 //BA.debugLineNum = 19;BA.debugLine="Public UNCHECKED_STATE As Int = 0";
_unchecked_state = (int) (0);
 //BA.debugLineNum = 21;BA.debugLine="Private CheckedStatus As Boolean = False";
_vvvvvvvvvvvvvvvvvvv6 = __c.False;
 //BA.debugLineNum = 22;BA.debugLine="Public ToggleButton As Label";
_togglebutton = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 31;BA.debugLine="mBase = Base";
_vvvvvvvvvvvvvvvvvvv5 = _base;
 //BA.debugLineNum = 32;BA.debugLine="mBase.LoadLayout(\"CFMetroCircleToggleButtonUI\")";
_vvvvvvvvvvvvvvvvvvv5.LoadLayout(ba,"CFMetroCircleToggleButtonUI");
 //BA.debugLineNum = 35;BA.debugLine="setCheckState(UNCHECKED_STATE) 'set initial value";
_setvvvvvvvvvvvvvvvvvv0(_unchecked_state);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _vvvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 49;BA.debugLine="Return mBase";
if (true) return _vvvvvvvvvvvvvvvvvvv5;
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 25;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 26;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvvvvvv3 = _eventname;
 //BA.debugLineNum = 27;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvvvvvv4 = _callback;
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Public Sub removeEffects()";
 //BA.debugLineNum = 88;BA.debugLine="CFControlsUtils.removeEffect(ToggleButton)";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvv3((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_togglebutton.getObject())));
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvv7(String _color) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 58;BA.debugLine="CFControlsUtils.setBG(ToggleButton, color)";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvv7((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_togglebutton.getObject())),_color);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvv0(String _color,int _width) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 70;BA.debugLine="CFControlsUtils.setBorder(ToggleButton, color, wi";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvv0((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_togglebutton.getObject())),_color,_width);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv6(int _radius) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 76;BA.debugLine="CFControlsUtils.setBorderRadius(ToggleButton, rad";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvv1((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_togglebutton.getObject())),_radius);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv0(int _value) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Public Sub setCheckState(value As Int)";
 //BA.debugLineNum = 96;BA.debugLine="If value = UNCHECKED_STATE Then";
if (_value==_unchecked_state) { 
 //BA.debugLineNum = 98;BA.debugLine="SetBg(\"white\")";
_vvvvvvvvvvvvvv7("white");
 //BA.debugLineNum = 99;BA.debugLine="setBorder(\"#D6D6D6\", 2)";
_vvvvvvvvvvvvvv0("#D6D6D6",(int) (2));
 //BA.debugLineNum = 101;BA.debugLine="ToggleButton.TextColor = fx.Colors.RGB(91, 91, 9";
_togglebutton.setTextColor((javafx.scene.paint.Paint)(_vvvvvvvvvvvvvvvv2.Colors.RGB((int) (91),(int) (91),(int) (91))));
 //BA.debugLineNum = 103;BA.debugLine="CheckedStatus = False";
_vvvvvvvvvvvvvvvvvvv6 = __c.False;
 }else if(_value==_checked_state) { 
 //BA.debugLineNum = 108;BA.debugLine="setBorder(\"#2EA9DE\", 2)";
_vvvvvvvvvvvvvv0("#2EA9DE",(int) (2));
 //BA.debugLineNum = 109;BA.debugLine="SetBg(\"rgb(65, 177, 225 )\")";
_vvvvvvvvvvvvvv7("rgb(65, 177, 225 )");
 //BA.debugLineNum = 111;BA.debugLine="ToggleButton.TextColor = fx.Colors.White";
_togglebutton.setTextColor(_vvvvvvvvvvvvvvvv2.Colors.White);
 //BA.debugLineNum = 113;BA.debugLine="CheckedStatus = True";
_vvvvvvvvvvvvvvvvvvv6 = __c.True;
 };
 //BA.debugLineNum = 118;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checked";
__c.CallSubDelayed2(ba,_vvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvv3+"_CheckedChanged",(Object)(_value));
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv1(String _effect) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Public Sub setPaneEffect(effect As String)";
 //BA.debugLineNum = 82;BA.debugLine="CFControlsUtils.setEffect(ToggleButton, effect)";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvv2((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_togglebutton.getObject())),_effect);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv2(float _angle) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Public Sub setRotationX(angle As Float)";
 //BA.debugLineNum = 64;BA.debugLine="CFControlsUtils.setRotationX(ToggleButton, angle)";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvv0((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_togglebutton.getObject())),_angle);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public String  _togglebutton_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub ToggleButton_MousePressed (EventData As MouseE";
 //BA.debugLineNum = 130;BA.debugLine="If Not(checked) Then";
if (__c.Not(_vvvvvvvvvvvvvvvvv0())) { 
 //BA.debugLineNum = 132;BA.debugLine="setCheckState(CHECKED_STATE)";
_setvvvvvvvvvvvvvvvvvv0(_checked_state);
 }else {
 //BA.debugLineNum = 136;BA.debugLine="setCheckState(UNCHECKED_STATE)";
_setvvvvvvvvvvvvvvvvvv0(_unchecked_state);
 };
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
