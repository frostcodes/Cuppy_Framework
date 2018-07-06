package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class metrotogglebutton_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (metrotogglebutton) ","metrotogglebutton",29,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "metrotogglebutton","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 36;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="ToggleButton.PrefHeight = Height";
Debug.ShouldStop(32);
__ref.getField(false,"_togglebutton").runMethod(true,"setPrefHeight",_height);
 BA.debugLineNum = 39;BA.debugLine="ToggleButton.PrefWidth = Width";
Debug.ShouldStop(64);
__ref.getField(false,"_togglebutton").runMethod(true,"setPrefWidth",_width);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("checked (metrotogglebutton) ","metrotogglebutton",29,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("checked")) { return __ref.runUserSub(false, "metrotogglebutton","checked", __ref);}
 BA.debugLineNum = 117;BA.debugLine="Public Sub checked As Boolean";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 119;BA.debugLine="Return CheckedStatus";
Debug.ShouldStop(4194304);
if (true) return __ref.getField(true,"_checkedstatus");
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
metrotogglebutton._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",metrotogglebutton._fx);
 //BA.debugLineNum = 10;BA.debugLine="Private mEventName As String 'ignore";
metrotogglebutton._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",metrotogglebutton._meventname);
 //BA.debugLineNum = 11;BA.debugLine="Private mCallBack As Object 'ignore";
metrotogglebutton._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",metrotogglebutton._mcallback);
 //BA.debugLineNum = 12;BA.debugLine="Private mBase As Pane";
metrotogglebutton._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",metrotogglebutton._mbase);
 //BA.debugLineNum = 15;BA.debugLine="Public CHECKED_STATE As Int = 0";
metrotogglebutton._checked_state = BA.numberCast(int.class, 0);__ref.setField("_checked_state",metrotogglebutton._checked_state);
 //BA.debugLineNum = 16;BA.debugLine="Public UNCHECKED_STATE As Int = 1";
metrotogglebutton._unchecked_state = BA.numberCast(int.class, 1);__ref.setField("_unchecked_state",metrotogglebutton._unchecked_state);
 //BA.debugLineNum = 18;BA.debugLine="Private CheckedStatus As Boolean = False";
metrotogglebutton._checkedstatus = metrotogglebutton.__c.getField(true,"False");__ref.setField("_checkedstatus",metrotogglebutton._checkedstatus);
 //BA.debugLineNum = 19;BA.debugLine="Public ToggleButton As Label";
metrotogglebutton._togglebutton = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_togglebutton",metrotogglebutton._togglebutton);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (metrotogglebutton) ","metrotogglebutton",29,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "metrotogglebutton","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 27;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="mBase = Base";
Debug.ShouldStop(134217728);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 29;BA.debugLine="mBase.LoadLayout(\"MetroToggleButton\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MetroToggleButton")));
 BA.debugLineNum = 32;BA.debugLine="setCheckState(UNCHECKED_STATE) 'set initial value";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.metrotogglebutton.class, "_setcheckstate",(Object)(__ref.getField(true,"_unchecked_state")));
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
		Debug.PushSubsStack("GetBase (metrotogglebutton) ","metrotogglebutton",29,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "metrotogglebutton","getbase", __ref);}
 BA.debugLineNum = 43;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="Return mBase";
Debug.ShouldStop(2048);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Initialize (metrotogglebutton) ","metrotogglebutton",29,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "metrotogglebutton","initialize", __ref, _ba, _callback, _eventname);}
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
		Debug.PushSubsStack("removeEffects (metrotogglebutton) ","metrotogglebutton",29,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "metrotogglebutton","removeeffects", __ref);}
 BA.debugLineNum = 81;BA.debugLine="Public Sub removeEffects()";
Debug.ShouldStop(65536);
 BA.debugLineNum = 83;BA.debugLine="ControlsUtils.removeEffect(ToggleButton)";
Debug.ShouldStop(262144);
metrotogglebutton._controlsutils.runVoidMethod ("_removeeffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_togglebutton").getObject()));
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("SetBg (metrotogglebutton) ","metrotogglebutton",29,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "metrotogglebutton","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 51;BA.debugLine="Public Sub SetBg(color As String)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 53;BA.debugLine="ControlsUtils.setBG(ToggleButton, color)";
Debug.ShouldStop(1048576);
metrotogglebutton._controlsutils.runVoidMethod ("_setbg",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_togglebutton").getObject()),(Object)(_color));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("setBorder (metrotogglebutton) ","metrotogglebutton",29,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "metrotogglebutton","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 63;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 65;BA.debugLine="ControlsUtils.setBorder(ToggleButton, color, widt";
Debug.ShouldStop(1);
metrotogglebutton._controlsutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_togglebutton").getObject()),(Object)(_color),(Object)(_width));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("setBorderRadius (metrotogglebutton) ","metrotogglebutton",29,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "metrotogglebutton","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 69;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(16);
 BA.debugLineNum = 71;BA.debugLine="ControlsUtils.setBorderRadius(ToggleButton, radiu";
Debug.ShouldStop(64);
metrotogglebutton._controlsutils.runVoidMethod ("_setborderradius",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_togglebutton").getObject()),(Object)(_radius));
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("setCheckState (metrotogglebutton) ","metrotogglebutton",29,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("setcheckstate")) { return __ref.runUserSub(false, "metrotogglebutton","setcheckstate", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 89;BA.debugLine="Public Sub setCheckState(value As Int)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 91;BA.debugLine="If value = UNCHECKED_STATE Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_value,BA.numberCast(double.class, __ref.getField(true,"_unchecked_state")))) { 
 BA.debugLineNum = 93;BA.debugLine="SetBg(\"white\")";
Debug.ShouldStop(268435456);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.metrotogglebutton.class, "_setbg",(Object)(RemoteObject.createImmutable("white")));
 BA.debugLineNum = 94;BA.debugLine="setBorder(\"#D6D6D6\", 2)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.metrotogglebutton.class, "_setborder",(Object)(BA.ObjectToString("#D6D6D6")),(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 96;BA.debugLine="ToggleButton.TextColor = fx.Colors.RGB(91, 91, 9";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_togglebutton").runMethod(false,"setTextColor",(__ref.getField(false,"_fx").getField(false,"Colors").runMethod(false,"RGB",(Object)(BA.numberCast(int.class, 91)),(Object)(BA.numberCast(int.class, 91)),(Object)(BA.numberCast(int.class, 91)))));
 BA.debugLineNum = 98;BA.debugLine="CheckedStatus = False";
Debug.ShouldStop(2);
__ref.setField ("_checkedstatus",metrotogglebutton.__c.getField(true,"False"));
 }else 
{ BA.debugLineNum = 100;BA.debugLine="Else if value = CHECKED_STATE Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_value,BA.numberCast(double.class, __ref.getField(true,"_checked_state")))) { 
 BA.debugLineNum = 103;BA.debugLine="setBorder(\"#2EA9DE\", 2)";
Debug.ShouldStop(64);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.metrotogglebutton.class, "_setborder",(Object)(BA.ObjectToString("#2EA9DE")),(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 104;BA.debugLine="SetBg(\"rgb(65, 177, 225 )\")";
Debug.ShouldStop(128);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.metrotogglebutton.class, "_setbg",(Object)(RemoteObject.createImmutable("rgb(65, 177, 225 )")));
 BA.debugLineNum = 106;BA.debugLine="ToggleButton.TextColor = fx.Colors.White";
Debug.ShouldStop(512);
__ref.getField(false,"_togglebutton").runMethod(false,"setTextColor",__ref.getField(false,"_fx").getField(false,"Colors").getField(false,"White"));
 BA.debugLineNum = 108;BA.debugLine="CheckedStatus = True";
Debug.ShouldStop(2048);
__ref.setField ("_checkedstatus",metrotogglebutton.__c.getField(true,"True"));
 }}
;
 BA.debugLineNum = 113;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checked";
Debug.ShouldStop(65536);
metrotogglebutton.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_CheckedChanged"))),(Object)((_value)));
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("setPaneEffect (metrotogglebutton) ","metrotogglebutton",29,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("setpaneeffect")) { return __ref.runUserSub(false, "metrotogglebutton","setpaneeffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 75;BA.debugLine="Public Sub setPaneEffect(effect As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 77;BA.debugLine="ControlsUtils.setEffect(ToggleButton, effect)";
Debug.ShouldStop(4096);
metrotogglebutton._controlsutils.runVoidMethod ("_seteffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_togglebutton").getObject()),(Object)(_effect));
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("setRotationX (metrotogglebutton) ","metrotogglebutton",29,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("setrotationx")) { return __ref.runUserSub(false, "metrotogglebutton","setrotationx", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 57;BA.debugLine="Public Sub setRotationX(angle As Float)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 59;BA.debugLine="ControlsUtils.setRotationX(ToggleButton, angle) '";
Debug.ShouldStop(67108864);
metrotogglebutton._controlsutils.runVoidMethod ("_setrotationx",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_togglebutton").getObject()),(Object)(_angle));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("ToggleButton_MousePressed (metrotogglebutton) ","metrotogglebutton",29,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("togglebutton_mousepressed")) { return __ref.runUserSub(false, "metrotogglebutton","togglebutton_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 123;BA.debugLine="Sub ToggleButton_MousePressed (EventData As MouseE";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 125;BA.debugLine="If Not(checked) Then";
Debug.ShouldStop(268435456);
if (metrotogglebutton.__c.runMethod(true,"Not",(Object)(__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.metrotogglebutton.class, "_checked"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 127;BA.debugLine="setCheckState(CHECKED_STATE)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.metrotogglebutton.class, "_setcheckstate",(Object)(__ref.getField(true,"_checked_state")));
 }else {
 BA.debugLineNum = 131;BA.debugLine="setCheckState(UNCHECKED_STATE)";
Debug.ShouldStop(4);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.metrotogglebutton.class, "_setcheckstate",(Object)(__ref.getField(true,"_unchecked_state")));
 };
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}