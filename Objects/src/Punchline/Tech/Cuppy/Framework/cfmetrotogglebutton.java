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
public anywheresoftware.b4j.objects.JFX _vvvvvvvvvvvvvvvvvvv1 = null;
public String _vvvvvvvvvvvvvvvvvvv2 = "";
public Object _vvvvvvvvvvvvvvvvvvv3 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _vvvvvvvvvvvvvvvvvvv4 = null;
public int _checked_state = 0;
public int _unchecked_state = 0;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
public anywheresoftware.b4j.objects.LabelWrapper _togglebutton = null;
public boolean _vvvvvvvvvvvvvvvvvvvvvv7 = false;
public b4j.example.cssutils _vvvvvvvvvvvvvvvvvvv5 = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _vvvvvvvvvvvvvvvvvvv6 = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _vvvvvvvvvvvvvvvvvvv7 = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _vvvvvvvvvvvvvvvvvvv0 = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _vvvvvvvvvvvvvvvvvvvv1 = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _vvvvvvvvvvvvvvvvvvvv2 = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _vvvvvvvvvvvvvvvvvvvv3 = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _vvvvvvvvvvvvvvvvvvvv5 = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _vvvvvvvvvvvvvvvvvvvv6 = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _vvvvvvvvvvvvvvvvvvvv7 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 63;BA.debugLine="ToggleButton.PrefHeight = Height";
_togglebutton.setPrefHeight(_height);
 //BA.debugLineNum = 64;BA.debugLine="ToggleButton.PrefWidth = Width";
_togglebutton.setPrefWidth(_width);
 //BA.debugLineNum = 66;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,_vvvvvvvvvvvvvvvvvvv3,_vvvvvvvvvvvvvvvvvvv2+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public boolean  _vvvvvvvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Public Sub Checked As Boolean";
 //BA.debugLineNum = 153;BA.debugLine="Return CheckedStatus";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvv5;
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return false;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private fx As JFX";
_vvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 16;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvvvvvv2 = "";
 //BA.debugLineNum = 17;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvvvvvv3 = new Object();
 //BA.debugLineNum = 18;BA.debugLine="Private mBase As Pane";
_vvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Public CHECKED_STATE As Int = 1";
_checked_state = (int) (1);
 //BA.debugLineNum = 22;BA.debugLine="Public UNCHECKED_STATE As Int = 0";
_unchecked_state = (int) (0);
 //BA.debugLineNum = 24;BA.debugLine="Private CheckedStatus As Boolean = False";
_vvvvvvvvvvvvvvvvvvvvvvvvv5 = __c.False;
 //BA.debugLineNum = 25;BA.debugLine="Public ToggleButton As Label";
_togglebutton = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private FirstTime As Boolean = False";
_vvvvvvvvvvvvvvvvvvvvvv7 = __c.False;
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
String _checkedstate = "";
 //BA.debugLineNum = 37;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 38;BA.debugLine="mBase = Base";
_vvvvvvvvvvvvvvvvvvv4 = _base;
 //BA.debugLineNum = 39;BA.debugLine="mBase.LoadLayout(\"CFMetroToggleButtonUI\")";
_vvvvvvvvvvvvvvvvvvv4.LoadLayout(ba,"CFMetroToggleButtonUI");
 //BA.debugLineNum = 42;BA.debugLine="SetCheckState(UNCHECKED_STATE) 'set initial value";
_setvvvvvvvvvvvvvvvvvvvvvv6(_unchecked_state);
 //BA.debugLineNum = 45;BA.debugLine="Dim checkedState As String = Props.Get(\"CheckedSt";
_checkedstate = BA.ObjectToString(_props.Get((Object)("CheckedState")));
 //BA.debugLineNum = 49;BA.debugLine="If checkedState = \"UNCHECKED\" Then";
if ((_checkedstate).equals("UNCHECKED")) { 
 //BA.debugLineNum = 51;BA.debugLine="SetCheckState(UNCHECKED_STATE)";
_setvvvvvvvvvvvvvvvvvvvvvv6(_unchecked_state);
 }else if((_checkedstate).equals("CHECKED")) { 
 //BA.debugLineNum = 55;BA.debugLine="SetCheckState(CHECKED_STATE)";
_setvvvvvvvvvvvvvvvvvvvvvv6(_checked_state);
 };
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _vvvvvvvvvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 71;BA.debugLine="Return mBase";
if (true) return _vvvvvvvvvvvvvvvvvvv4;
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 32;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 33;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvvvvvv2 = _eventname;
 //BA.debugLineNum = 34;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvvvvvv3 = _callback;
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 110;BA.debugLine="CFControlsUtils.removeEffect(ToggleButton)";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvv2((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_togglebutton.getObject())));
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv2(String _color) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Public Sub setBg(color As String)";
 //BA.debugLineNum = 80;BA.debugLine="CFControlsUtils.setBG(ToggleButton, color)";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvv5((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_togglebutton.getObject())),_color);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvv6(String _color,int _width) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 92;BA.debugLine="CFControlsUtils.setBorder(ToggleButton, color, wi";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvv6((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_togglebutton.getObject())),_color,_width);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv3(int _radius) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 98;BA.debugLine="CFControlsUtils.setBorderRadius(ToggleButton, rad";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvv0((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_togglebutton.getObject())),_radius);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvv6(int _value) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Public Sub setCheckState(value As Int)";
 //BA.debugLineNum = 118;BA.debugLine="If value = UNCHECKED_STATE Then";
if (_value==_unchecked_state) { 
 //BA.debugLineNum = 120;BA.debugLine="SetBg(\"white\")";
_setvvvvvvvvvvvvvvvvvv2("white");
 //BA.debugLineNum = 121;BA.debugLine="SetBorder(\"#D6D6D6\", 2)";
_vvvvvvvvvvvv6("#D6D6D6",(int) (2));
 //BA.debugLineNum = 123;BA.debugLine="ToggleButton.TextColor = fx.Colors.RGB(91, 91, 9";
_togglebutton.setTextColor((javafx.scene.paint.Paint)(_vvvvvvvvvvvvvvvvvvv1.Colors.RGB((int) (91),(int) (91),(int) (91))));
 //BA.debugLineNum = 125;BA.debugLine="CheckedStatus = False";
_vvvvvvvvvvvvvvvvvvvvvvvvv5 = __c.False;
 }else if(_value==_checked_state) { 
 //BA.debugLineNum = 130;BA.debugLine="SetBorder(\"#2EA9DE\", 2)";
_vvvvvvvvvvvv6("#2EA9DE",(int) (2));
 //BA.debugLineNum = 131;BA.debugLine="SetBg(\"rgb(65, 177, 225 )\")";
_setvvvvvvvvvvvvvvvvvv2("rgb(65, 177, 225 )");
 //BA.debugLineNum = 133;BA.debugLine="ToggleButton.TextColor = fx.Colors.White";
_togglebutton.setTextColor(_vvvvvvvvvvvvvvvvvvv1.Colors.White);
 //BA.debugLineNum = 135;BA.debugLine="CheckedStatus = True";
_vvvvvvvvvvvvvvvvvvvvvvvvv5 = __c.True;
 };
 //BA.debugLineNum = 139;BA.debugLine="If FirstTime Then";
if (_vvvvvvvvvvvvvvvvvvvvvv7) { 
 //BA.debugLineNum = 142;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checke";
__c.CallSubDelayed2(ba,_vvvvvvvvvvvvvvvvvvv3,_vvvvvvvvvvvvvvvvvvv2+"_CheckedChanged",(Object)(_value));
 }else {
 //BA.debugLineNum = 146;BA.debugLine="FirstTime = True";
_vvvvvvvvvvvvvvvvvvvvvv7 = __c.True;
 };
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv4(String _effect) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Public Sub setEffect(effect As String)";
 //BA.debugLineNum = 104;BA.debugLine="CFControlsUtils.setEffect(ToggleButton, effect)";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvvv2((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_togglebutton.getObject())),_effect);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv0(float _angle) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Public Sub setRotation(angle As Float)";
 //BA.debugLineNum = 86;BA.debugLine="CFControlsUtils.setRotation(ToggleButton, angle)";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvvv3((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_togglebutton.getObject())),_angle);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public String  _togglebutton_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Private Sub ToggleButton_MousePressed (EventData A";
 //BA.debugLineNum = 159;BA.debugLine="ToggleButton.RequestFocus 'set focus";
_togglebutton.RequestFocus();
 //BA.debugLineNum = 161;BA.debugLine="If Not(Checked) Then";
if (__c.Not(_vvvvvvvvvvvvvvvvvvvvvv1())) { 
 //BA.debugLineNum = 163;BA.debugLine="SetCheckState(CHECKED_STATE)";
_setvvvvvvvvvvvvvvvvvvvvvv6(_checked_state);
 }else {
 //BA.debugLineNum = 167;BA.debugLine="SetCheckState(UNCHECKED_STATE)";
_setvvvvvvvvvvvvvvvvvvvvvv6(_unchecked_state);
 };
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
