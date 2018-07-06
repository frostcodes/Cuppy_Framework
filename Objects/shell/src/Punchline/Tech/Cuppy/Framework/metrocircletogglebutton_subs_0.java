package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class metrocircletogglebutton_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (metrocircletogglebutton) ","metrocircletogglebutton",7,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "metrocircletogglebutton","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 36;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(8);
 BA.debugLineNum = 40;BA.debugLine="ToggleButton.PrefHeight = Width";
Debug.ShouldStop(128);
__ref.getField(false,"_togglebutton").runMethod(true,"setPrefHeight",_width);
 BA.debugLineNum = 41;BA.debugLine="ToggleButton.PrefWidth = Width";
Debug.ShouldStop(256);
__ref.getField(false,"_togglebutton").runMethod(true,"setPrefWidth",_width);
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checked(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("checked (metrocircletogglebutton) ","metrocircletogglebutton",7,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("checked")) { return __ref.runUserSub(false, "metrocircletogglebutton","checked", __ref);}
 BA.debugLineNum = 119;BA.debugLine="Public Sub checked As Boolean";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 121;BA.debugLine="Return CheckedStatus";
Debug.ShouldStop(16777216);
if (true) return __ref.getField(true,"_checkedstatus");
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private fx As JFX";
metrocircletogglebutton._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",metrocircletogglebutton._fx);
 //BA.debugLineNum = 10;BA.debugLine="Private mEventName As String 'ignore";
metrocircletogglebutton._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",metrocircletogglebutton._meventname);
 //BA.debugLineNum = 11;BA.debugLine="Private mCallBack As Object 'ignore";
metrocircletogglebutton._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",metrocircletogglebutton._mcallback);
 //BA.debugLineNum = 12;BA.debugLine="Private mBase As Pane";
metrocircletogglebutton._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",metrocircletogglebutton._mbase);
 //BA.debugLineNum = 15;BA.debugLine="Public CHECKED_STATE As Int = 0";
metrocircletogglebutton._checked_state = BA.numberCast(int.class, 0);__ref.setField("_checked_state",metrocircletogglebutton._checked_state);
 //BA.debugLineNum = 16;BA.debugLine="Public UNCHECKED_STATE As Int = 1";
metrocircletogglebutton._unchecked_state = BA.numberCast(int.class, 1);__ref.setField("_unchecked_state",metrocircletogglebutton._unchecked_state);
 //BA.debugLineNum = 18;BA.debugLine="Private CheckedStatus As Boolean = False";
metrocircletogglebutton._checkedstatus = metrocircletogglebutton.__c.getField(true,"False");__ref.setField("_checkedstatus",metrocircletogglebutton._checkedstatus);
 //BA.debugLineNum = 19;BA.debugLine="Public ToggleButton As Label";
metrocircletogglebutton._togglebutton = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_togglebutton",metrocircletogglebutton._togglebutton);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (metrocircletogglebutton) ","metrocircletogglebutton",7,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "metrocircletogglebutton","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 27;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="mBase = Base";
Debug.ShouldStop(134217728);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 29;BA.debugLine="mBase.LoadLayout(\"MetroCircleToggleButtonUI\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MetroCircleToggleButtonUI")));
 BA.debugLineNum = 32;BA.debugLine="setCheckState(UNCHECKED_STATE) 'set initial value";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.metrocircletogglebutton.class, "_setcheckstate",(Object)(__ref.getField(true,"_unchecked_state")));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (metrocircletogglebutton) ","metrocircletogglebutton",7,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "metrocircletogglebutton","getbase", __ref);}
 BA.debugLineNum = 45;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="Return mBase";
Debug.ShouldStop(8192);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (metrocircletogglebutton) ","metrocircletogglebutton",7,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "metrocircletogglebutton","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(4194304);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 24;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(8388608);
__ref.setField ("_mcallback",_callback);
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeeffects(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("removeEffects (metrocircletogglebutton) ","metrocircletogglebutton",7,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "metrocircletogglebutton","removeeffects", __ref);}
 BA.debugLineNum = 83;BA.debugLine="Public Sub removeEffects()";
Debug.ShouldStop(262144);
 BA.debugLineNum = 85;BA.debugLine="ControlsUtils.removeEffect(ToggleButton)";
Debug.ShouldStop(1048576);
metrocircletogglebutton._controlsutils.runVoidMethod ("_removeeffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_togglebutton").getObject()));
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbg(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("SetBg (metrocircletogglebutton) ","metrocircletogglebutton",7,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "metrocircletogglebutton","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 53;BA.debugLine="Public Sub SetBg(color As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="ControlsUtils.setBG(ToggleButton, color)";
Debug.ShouldStop(4194304);
metrocircletogglebutton._controlsutils.runVoidMethod ("_setbg",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_togglebutton").getObject()),(Object)(_color));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setborder(RemoteObject __ref,RemoteObject _color,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("setBorder (metrocircletogglebutton) ","metrocircletogglebutton",7,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "metrocircletogglebutton","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 65;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(1);
 BA.debugLineNum = 67;BA.debugLine="ControlsUtils.setBorder(ToggleButton, color, widt";
Debug.ShouldStop(4);
metrocircletogglebutton._controlsutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_togglebutton").getObject()),(Object)(_color),(Object)(_width));
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setborderradius(RemoteObject __ref,RemoteObject _radius) throws Exception{
try {
		Debug.PushSubsStack("setBorderRadius (metrocircletogglebutton) ","metrocircletogglebutton",7,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "metrocircletogglebutton","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 71;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(64);
 BA.debugLineNum = 73;BA.debugLine="ControlsUtils.setBorderRadius(ToggleButton, radiu";
Debug.ShouldStop(256);
metrocircletogglebutton._controlsutils.runVoidMethod ("_setborderradius",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_togglebutton").getObject()),(Object)(_radius));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcheckstate(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setCheckState (metrocircletogglebutton) ","metrocircletogglebutton",7,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("setcheckstate")) { return __ref.runUserSub(false, "metrocircletogglebutton","setcheckstate", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 91;BA.debugLine="Public Sub setCheckState(value As Int)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 93;BA.debugLine="If value = UNCHECKED_STATE Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_value,BA.numberCast(double.class, __ref.getField(true,"_unchecked_state")))) { 
 BA.debugLineNum = 95;BA.debugLine="SetBg(\"white\")";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.metrocircletogglebutton.class, "_setbg",(Object)(RemoteObject.createImmutable("white")));
 BA.debugLineNum = 96;BA.debugLine="setBorder(\"#D6D6D6\", 2)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.metrocircletogglebutton.class, "_setborder",(Object)(BA.ObjectToString("#D6D6D6")),(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 98;BA.debugLine="ToggleButton.TextColor = fx.Colors.RGB(91, 91, 9";
Debug.ShouldStop(2);
__ref.getField(false,"_togglebutton").runMethod(false,"setTextColor",(__ref.getField(false,"_fx").getField(false,"Colors").runMethod(false,"RGB",(Object)(BA.numberCast(int.class, 91)),(Object)(BA.numberCast(int.class, 91)),(Object)(BA.numberCast(int.class, 91)))));
 BA.debugLineNum = 100;BA.debugLine="CheckedStatus = False";
Debug.ShouldStop(8);
__ref.setField ("_checkedstatus",metrocircletogglebutton.__c.getField(true,"False"));
 }else 
{ BA.debugLineNum = 102;BA.debugLine="Else if value = CHECKED_STATE Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_value,BA.numberCast(double.class, __ref.getField(true,"_checked_state")))) { 
 BA.debugLineNum = 105;BA.debugLine="setBorder(\"#2EA9DE\", 2)";
Debug.ShouldStop(256);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.metrocircletogglebutton.class, "_setborder",(Object)(BA.ObjectToString("#2EA9DE")),(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 106;BA.debugLine="SetBg(\"rgb(65, 177, 225 )\")";
Debug.ShouldStop(512);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.metrocircletogglebutton.class, "_setbg",(Object)(RemoteObject.createImmutable("rgb(65, 177, 225 )")));
 BA.debugLineNum = 108;BA.debugLine="ToggleButton.TextColor = fx.Colors.White";
Debug.ShouldStop(2048);
__ref.getField(false,"_togglebutton").runMethod(false,"setTextColor",__ref.getField(false,"_fx").getField(false,"Colors").getField(false,"White"));
 BA.debugLineNum = 110;BA.debugLine="CheckedStatus = True";
Debug.ShouldStop(8192);
__ref.setField ("_checkedstatus",metrocircletogglebutton.__c.getField(true,"True"));
 }}
;
 BA.debugLineNum = 115;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checked";
Debug.ShouldStop(262144);
metrocircletogglebutton.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_CheckedChanged"))),(Object)((_value)));
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpaneeffect(RemoteObject __ref,RemoteObject _effect) throws Exception{
try {
		Debug.PushSubsStack("setPaneEffect (metrocircletogglebutton) ","metrocircletogglebutton",7,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("setpaneeffect")) { return __ref.runUserSub(false, "metrocircletogglebutton","setpaneeffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 77;BA.debugLine="Public Sub setPaneEffect(effect As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 79;BA.debugLine="ControlsUtils.setEffect(ToggleButton, effect)";
Debug.ShouldStop(16384);
metrocircletogglebutton._controlsutils.runVoidMethod ("_seteffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_togglebutton").getObject()),(Object)(_effect));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrotationx(RemoteObject __ref,RemoteObject _angle) throws Exception{
try {
		Debug.PushSubsStack("setRotationX (metrocircletogglebutton) ","metrocircletogglebutton",7,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("setrotationx")) { return __ref.runUserSub(false, "metrocircletogglebutton","setrotationx", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 59;BA.debugLine="Public Sub setRotationX(angle As Float)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 61;BA.debugLine="ControlsUtils.setRotationX(ToggleButton, angle) '";
Debug.ShouldStop(268435456);
metrocircletogglebutton._controlsutils.runVoidMethod ("_setrotationx",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_togglebutton").getObject()),(Object)(_angle));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _togglebutton_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("ToggleButton_MousePressed (metrocircletogglebutton) ","metrocircletogglebutton",7,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("togglebutton_mousepressed")) { return __ref.runUserSub(false, "metrocircletogglebutton","togglebutton_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 125;BA.debugLine="Sub ToggleButton_MousePressed (EventData As MouseE";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 127;BA.debugLine="If Not(checked) Then";
Debug.ShouldStop(1073741824);
if (metrocircletogglebutton.__c.runMethod(true,"Not",(Object)(__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.metrocircletogglebutton.class, "_checked"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 129;BA.debugLine="setCheckState(CHECKED_STATE)";
Debug.ShouldStop(1);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.metrocircletogglebutton.class, "_setcheckstate",(Object)(__ref.getField(true,"_checked_state")));
 }else {
 BA.debugLineNum = 133;BA.debugLine="setCheckState(UNCHECKED_STATE)";
Debug.ShouldStop(16);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.metrocircletogglebutton.class, "_setcheckstate",(Object)(__ref.getField(true,"_unchecked_state")));
 };
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}