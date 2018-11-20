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
public anywheresoftware.b4j.objects.JFX _vvvvvvvvvvvvvvvvvvv7 = null;
public String _vvvvvvvvvvvvvvvvvvv0 = "";
public Object _vvvvvvvvvvvvvvvvvvvv1 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _vvvvvvvvvvvvvvvvvvvv2 = null;
public int _checked_state = 0;
public int _unchecked_state = 0;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
public anywheresoftware.b4j.objects.LabelWrapper _togglebutton = null;
public boolean _vvvvvvvvvvvvvvvvvvvvvvv5 = false;
public b4j.example.cssutils _vvvvvvvvvvvvvvvvvvvv3 = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _vvvvvvvvvvvvvvvvvvvv4 = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _vvvvvvvvvvvvvvvvvvvv5 = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _vvvvvvvvvvvvvvvvvvvv6 = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _vvvvvvvvvvvvvvvvvvvv7 = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _vvvvvvvvvvvvvvvvvvvv0 = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _vvvvvvvvvvvvvvvvvvvvv1 = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _vvvvvvvvvvvvvvvvvvvvv3 = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _vvvvvvvvvvvvvvvvvvvvv4 = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _vvvvvvvvvvvvvvvvvvvvv5 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 61;BA.debugLine="ToggleButton.PrefHeight = Width";
_togglebutton.setPrefHeight(_width);
 //BA.debugLineNum = 62;BA.debugLine="ToggleButton.PrefWidth = Width";
_togglebutton.setPrefWidth(_width);
 //BA.debugLineNum = 64;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,_vvvvvvvvvvvvvvvvvvvv1,_vvvvvvvvvvvvvvvvvvv0+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public boolean  _vvvvvvvvvvvvvvvvvvvvvv7() throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Public Sub Checked As Boolean";
 //BA.debugLineNum = 152;BA.debugLine="Return CheckedStatus";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvv3;
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return false;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private fx As JFX";
_vvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 16;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvvvvvv0 = "";
 //BA.debugLineNum = 17;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvvvvvvv1 = new Object();
 //BA.debugLineNum = 18;BA.debugLine="Private mBase As Pane";
_vvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Public CHECKED_STATE As Int = 1";
_checked_state = (int) (1);
 //BA.debugLineNum = 22;BA.debugLine="Public UNCHECKED_STATE As Int = 0";
_unchecked_state = (int) (0);
 //BA.debugLineNum = 24;BA.debugLine="Private CheckedStatus As Boolean = False";
_vvvvvvvvvvvvvvvvvvvvvvvvvv3 = __c.False;
 //BA.debugLineNum = 25;BA.debugLine="Public ToggleButton As Label";
_togglebutton = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private FirstTime As Boolean = False";
_vvvvvvvvvvvvvvvvvvvvvvv5 = __c.False;
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
String _checkedstate = "";
 //BA.debugLineNum = 37;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 38;BA.debugLine="mBase = Base";
_vvvvvvvvvvvvvvvvvvvv2 = _base;
 //BA.debugLineNum = 39;BA.debugLine="mBase.LoadLayout(\"CFMetroCircleToggleButtonUI\")";
_vvvvvvvvvvvvvvvvvvvv2.LoadLayout(ba,"CFMetroCircleToggleButtonUI");
 //BA.debugLineNum = 43;BA.debugLine="Dim checkedState As String = Props.Get(\"CheckedSt";
_checkedstate = BA.ObjectToString(_props.Get((Object)("CheckedState")));
 //BA.debugLineNum = 47;BA.debugLine="If checkedState = \"UNCHECKED\" Then";
if ((_checkedstate).equals("UNCHECKED")) { 
 //BA.debugLineNum = 49;BA.debugLine="SetCheckState(UNCHECKED_STATE)";
_setvvvvvvvvvvvvvvvvvvvvvvv4(_unchecked_state);
 }else if((_checkedstate).equals("CHECKED")) { 
 //BA.debugLineNum = 53;BA.debugLine="SetCheckState(CHECKED_STATE)";
_setvvvvvvvvvvvvvvvvvvvvvvv4(_checked_state);
 };
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _vvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 69;BA.debugLine="Return mBase";
if (true) return _vvvvvvvvvvvvvvvvvvvv2;
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 32;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 33;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvvvvvv0 = _eventname;
 //BA.debugLineNum = 34;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvvvvvvv1 = _callback;
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvv7() throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 108;BA.debugLine="CFControlsUtils.removeEffect(ToggleButton)";
_vvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvv2((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_togglebutton.getObject())));
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv0(String _color) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Public Sub setBg(color As String)";
 //BA.debugLineNum = 78;BA.debugLine="CFControlsUtils.setBG(ToggleButton, color)";
_vvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvv5((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_togglebutton.getObject())),_color);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvv6(String _color,int _width) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 90;BA.debugLine="CFControlsUtils.setBorder(ToggleButton, color, wi";
_vvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvv6((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_togglebutton.getObject())),_color,_width);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv1(int _radius) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 96;BA.debugLine="CFControlsUtils.setBorderRadius(ToggleButton, rad";
_vvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvv0((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_togglebutton.getObject())),_radius);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvv4(int _value) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Public Sub setCheckState(value As Int)";
 //BA.debugLineNum = 116;BA.debugLine="If value = UNCHECKED_STATE Then";
if (_value==_unchecked_state) { 
 //BA.debugLineNum = 118;BA.debugLine="SetBg(\"white\")";
_setvvvvvvvvvvvvvvvvvv0("white");
 //BA.debugLineNum = 119;BA.debugLine="SetBorder(\"#D6D6D6\", 2)";
_vvvvvvvvvvvv6("#D6D6D6",(int) (2));
 //BA.debugLineNum = 121;BA.debugLine="ToggleButton.TextColor = fx.Colors.RGB(91, 91, 9";
_togglebutton.setTextColor((javafx.scene.paint.Paint)(_vvvvvvvvvvvvvvvvvvv7.Colors.RGB((int) (91),(int) (91),(int) (91))));
 //BA.debugLineNum = 123;BA.debugLine="CheckedStatus = False";
_vvvvvvvvvvvvvvvvvvvvvvvvvv3 = __c.False;
 }else if(_value==_checked_state) { 
 //BA.debugLineNum = 128;BA.debugLine="SetBorder(\"#2EA9DE\", 2)";
_vvvvvvvvvvvv6("#2EA9DE",(int) (2));
 //BA.debugLineNum = 129;BA.debugLine="SetBg(\"rgb(65, 177, 225 )\")";
_setvvvvvvvvvvvvvvvvvv0("rgb(65, 177, 225 )");
 //BA.debugLineNum = 131;BA.debugLine="ToggleButton.TextColor = fx.Colors.White";
_togglebutton.setTextColor(_vvvvvvvvvvvvvvvvvvv7.Colors.White);
 //BA.debugLineNum = 133;BA.debugLine="CheckedStatus = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvv3 = __c.True;
 };
 //BA.debugLineNum = 137;BA.debugLine="If FirstTime Then";
if (_vvvvvvvvvvvvvvvvvvvvvvv5) { 
 //BA.debugLineNum = 140;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checke";
__c.CallSubDelayed2(ba,_vvvvvvvvvvvvvvvvvvvv1,_vvvvvvvvvvvvvvvvvvv0+"_CheckedChanged",(Object)(_value));
 }else {
 //BA.debugLineNum = 144;BA.debugLine="FirstTime = True";
_vvvvvvvvvvvvvvvvvvvvvvv5 = __c.True;
 };
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv2(String _effect) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Public Sub setEffect(effect As String)";
 //BA.debugLineNum = 102;BA.debugLine="CFControlsUtils.setEffect(ToggleButton, effect)";
_vvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvvv2((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_togglebutton.getObject())),_effect);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv6(float _angle) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Public Sub setRotation(angle As Float)";
 //BA.debugLineNum = 84;BA.debugLine="CFControlsUtils.setRotation(ToggleButton, angle)";
_vvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvvv3((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_togglebutton.getObject())),_angle);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public String  _togglebutton_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Private Sub ToggleButton_MousePressed (EventData A";
 //BA.debugLineNum = 158;BA.debugLine="ToggleButton.RequestFocus 'set focus";
_togglebutton.RequestFocus();
 //BA.debugLineNum = 160;BA.debugLine="If Not(Checked) Then";
if (__c.Not(_vvvvvvvvvvvvvvvvvvvvvv7())) { 
 //BA.debugLineNum = 162;BA.debugLine="SetCheckState(CHECKED_STATE)";
_setvvvvvvvvvvvvvvvvvvvvvvv4(_checked_state);
 }else {
 //BA.debugLineNum = 166;BA.debugLine="SetCheckState(UNCHECKED_STATE)";
_setvvvvvvvvvvvvvvvvvvvvvvv4(_unchecked_state);
 };
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
