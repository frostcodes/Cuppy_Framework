package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cfmetrocircletogglebutton_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (cfmetrocircletogglebutton) ","cfmetrocircletogglebutton",22,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "cfmetrocircletogglebutton","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 59;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 61;BA.debugLine="ToggleButton.PrefHeight = Width";
Debug.ShouldStop(268435456);
__ref.getField(false,"_togglebutton").runMethod(true,"setPrefHeight",_width);
 BA.debugLineNum = 62;BA.debugLine="ToggleButton.PrefWidth = Width";
Debug.ShouldStop(536870912);
__ref.getField(false,"_togglebutton").runMethod(true,"setPrefWidth",_width);
 BA.debugLineNum = 64;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
Debug.ShouldStop(-2147483648);
cfmetrocircletogglebutton.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_Resize"))),(Object)((_width)),(Object)((_height)));
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Checked (cfmetrocircletogglebutton) ","cfmetrocircletogglebutton",22,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("checked")) { return __ref.runUserSub(false, "cfmetrocircletogglebutton","checked", __ref);}
 BA.debugLineNum = 150;BA.debugLine="Public Sub Checked As Boolean";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 152;BA.debugLine="Return CheckedStatus";
Debug.ShouldStop(8388608);
if (true) return __ref.getField(true,"_checkedstatus");
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private fx As JFX";
cfmetrocircletogglebutton._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cfmetrocircletogglebutton._fx);
 //BA.debugLineNum = 16;BA.debugLine="Private mEventName As String 'ignore";
cfmetrocircletogglebutton._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",cfmetrocircletogglebutton._meventname);
 //BA.debugLineNum = 17;BA.debugLine="Private mCallBack As Object 'ignore";
cfmetrocircletogglebutton._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",cfmetrocircletogglebutton._mcallback);
 //BA.debugLineNum = 18;BA.debugLine="Private mBase As Pane";
cfmetrocircletogglebutton._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",cfmetrocircletogglebutton._mbase);
 //BA.debugLineNum = 21;BA.debugLine="Public CHECKED_STATE As Int = 1";
cfmetrocircletogglebutton._checked_state = BA.numberCast(int.class, 1);__ref.setField("_checked_state",cfmetrocircletogglebutton._checked_state);
 //BA.debugLineNum = 22;BA.debugLine="Public UNCHECKED_STATE As Int = 0";
cfmetrocircletogglebutton._unchecked_state = BA.numberCast(int.class, 0);__ref.setField("_unchecked_state",cfmetrocircletogglebutton._unchecked_state);
 //BA.debugLineNum = 24;BA.debugLine="Private CheckedStatus As Boolean = False";
cfmetrocircletogglebutton._checkedstatus = cfmetrocircletogglebutton.__c.getField(true,"False");__ref.setField("_checkedstatus",cfmetrocircletogglebutton._checkedstatus);
 //BA.debugLineNum = 25;BA.debugLine="Public ToggleButton As Label";
cfmetrocircletogglebutton._togglebutton = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_togglebutton",cfmetrocircletogglebutton._togglebutton);
 //BA.debugLineNum = 28;BA.debugLine="Private FirstTime As Boolean = False";
cfmetrocircletogglebutton._firsttime = cfmetrocircletogglebutton.__c.getField(true,"False");__ref.setField("_firsttime",cfmetrocircletogglebutton._firsttime);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (cfmetrocircletogglebutton) ","cfmetrocircletogglebutton",22,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "cfmetrocircletogglebutton","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _checkedstate = RemoteObject.createImmutable("");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 37;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="mBase = Base";
Debug.ShouldStop(32);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 39;BA.debugLine="mBase.LoadLayout(\"CFMetroCircleToggleButtonUI\")";
Debug.ShouldStop(64);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("CFMetroCircleToggleButtonUI")));
 BA.debugLineNum = 43;BA.debugLine="Dim checkedState As String = Props.Get(\"CheckedSt";
Debug.ShouldStop(1024);
_checkedstate = BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CheckedState")))));Debug.locals.put("checkedState", _checkedstate);Debug.locals.put("checkedState", _checkedstate);
 BA.debugLineNum = 47;BA.debugLine="If checkedState = \"UNCHECKED\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_checkedstate,BA.ObjectToString("UNCHECKED"))) { 
 BA.debugLineNum = 49;BA.debugLine="SetCheckState(UNCHECKED_STATE)";
Debug.ShouldStop(65536);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton.class, "_setcheckstate",(Object)(__ref.getField(true,"_unchecked_state")));
 }else 
{ BA.debugLineNum = 51;BA.debugLine="else If checkedState = \"CHECKED\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_checkedstate,BA.ObjectToString("CHECKED"))) { 
 BA.debugLineNum = 53;BA.debugLine="SetCheckState(CHECKED_STATE)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton.class, "_setcheckstate",(Object)(__ref.getField(true,"_checked_state")));
 }}
;
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
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (cfmetrocircletogglebutton) ","cfmetrocircletogglebutton",22,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "cfmetrocircletogglebutton","getbase", __ref);}
 BA.debugLineNum = 68;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="Return mBase";
Debug.ShouldStop(16);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Initialize (cfmetrocircletogglebutton) ","cfmetrocircletogglebutton",22,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cfmetrocircletogglebutton","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 32;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(1);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 34;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(2);
__ref.setField ("_mcallback",_callback);
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("RemoveEffects (cfmetrocircletogglebutton) ","cfmetrocircletogglebutton",22,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "cfmetrocircletogglebutton","removeeffects", __ref);}
 BA.debugLineNum = 106;BA.debugLine="Public Sub RemoveEffects()";
Debug.ShouldStop(512);
 BA.debugLineNum = 108;BA.debugLine="CFControlsUtils.removeEffect(ToggleButton)";
Debug.ShouldStop(2048);
cfmetrocircletogglebutton._cfcontrolsutils.runVoidMethod ("_removeeffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_togglebutton").getObject()));
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("setBg (cfmetrocircletogglebutton) ","cfmetrocircletogglebutton",22,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "cfmetrocircletogglebutton","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 76;BA.debugLine="Public Sub setBg(color As String)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 78;BA.debugLine="CFControlsUtils.setBG(ToggleButton, color)";
Debug.ShouldStop(8192);
cfmetrocircletogglebutton._cfcontrolsutils.runVoidMethod ("_setbg",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_togglebutton").getObject()),(Object)(_color));
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("setBorder (cfmetrocircletogglebutton) ","cfmetrocircletogglebutton",22,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "cfmetrocircletogglebutton","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 88;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 90;BA.debugLine="CFControlsUtils.setBorder(ToggleButton, color, wi";
Debug.ShouldStop(33554432);
cfmetrocircletogglebutton._cfcontrolsutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_togglebutton").getObject()),(Object)(_color),(Object)(_width));
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("setBorderRadius (cfmetrocircletogglebutton) ","cfmetrocircletogglebutton",22,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "cfmetrocircletogglebutton","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 94;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 96;BA.debugLine="CFControlsUtils.setBorderRadius(ToggleButton, rad";
Debug.ShouldStop(-2147483648);
cfmetrocircletogglebutton._cfcontrolsutils.runVoidMethod ("_setborderradius",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_togglebutton").getObject()),(Object)(_radius));
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("setCheckState (cfmetrocircletogglebutton) ","cfmetrocircletogglebutton",22,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("setcheckstate")) { return __ref.runUserSub(false, "cfmetrocircletogglebutton","setcheckstate", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 114;BA.debugLine="Public Sub setCheckState(value As Int)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 116;BA.debugLine="If value = UNCHECKED_STATE Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_value,BA.numberCast(double.class, __ref.getField(true,"_unchecked_state")))) { 
 BA.debugLineNum = 118;BA.debugLine="SetBg(\"white\")";
Debug.ShouldStop(2097152);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton.class, "_setbg",(Object)(RemoteObject.createImmutable("white")));
 BA.debugLineNum = 119;BA.debugLine="SetBorder(\"#D6D6D6\", 2)";
Debug.ShouldStop(4194304);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton.class, "_setborder",(Object)(BA.ObjectToString("#D6D6D6")),(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 121;BA.debugLine="ToggleButton.TextColor = fx.Colors.RGB(91, 91, 9";
Debug.ShouldStop(16777216);
__ref.getField(false,"_togglebutton").runMethod(false,"setTextColor",(__ref.getField(false,"_fx").getField(false,"Colors").runMethod(false,"RGB",(Object)(BA.numberCast(int.class, 91)),(Object)(BA.numberCast(int.class, 91)),(Object)(BA.numberCast(int.class, 91)))));
 BA.debugLineNum = 123;BA.debugLine="CheckedStatus = False";
Debug.ShouldStop(67108864);
__ref.setField ("_checkedstatus",cfmetrocircletogglebutton.__c.getField(true,"False"));
 }else 
{ BA.debugLineNum = 125;BA.debugLine="Else if value = CHECKED_STATE Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_value,BA.numberCast(double.class, __ref.getField(true,"_checked_state")))) { 
 BA.debugLineNum = 128;BA.debugLine="SetBorder(\"#2EA9DE\", 2)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton.class, "_setborder",(Object)(BA.ObjectToString("#2EA9DE")),(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 129;BA.debugLine="SetBg(\"rgb(65, 177, 225 )\")";
Debug.ShouldStop(1);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton.class, "_setbg",(Object)(RemoteObject.createImmutable("rgb(65, 177, 225 )")));
 BA.debugLineNum = 131;BA.debugLine="ToggleButton.TextColor = fx.Colors.White";
Debug.ShouldStop(4);
__ref.getField(false,"_togglebutton").runMethod(false,"setTextColor",__ref.getField(false,"_fx").getField(false,"Colors").getField(false,"White"));
 BA.debugLineNum = 133;BA.debugLine="CheckedStatus = True";
Debug.ShouldStop(16);
__ref.setField ("_checkedstatus",cfmetrocircletogglebutton.__c.getField(true,"True"));
 }}
;
 BA.debugLineNum = 137;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(256);
if (__ref.getField(true,"_firsttime").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 140;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checke";
Debug.ShouldStop(2048);
cfmetrocircletogglebutton.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_CheckedChanged"))),(Object)((_value)));
 }else {
 BA.debugLineNum = 144;BA.debugLine="FirstTime = True";
Debug.ShouldStop(32768);
__ref.setField ("_firsttime",cfmetrocircletogglebutton.__c.getField(true,"True"));
 };
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seteffect(RemoteObject __ref,RemoteObject _effect) throws Exception{
try {
		Debug.PushSubsStack("setEffect (cfmetrocircletogglebutton) ","cfmetrocircletogglebutton",22,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("seteffect")) { return __ref.runUserSub(false, "cfmetrocircletogglebutton","seteffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 100;BA.debugLine="Public Sub setEffect(effect As String)";
Debug.ShouldStop(8);
 BA.debugLineNum = 102;BA.debugLine="CFControlsUtils.setEffect(ToggleButton, effect)";
Debug.ShouldStop(32);
cfmetrocircletogglebutton._cfcontrolsutils.runVoidMethod ("_seteffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_togglebutton").getObject()),(Object)(_effect));
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrotation(RemoteObject __ref,RemoteObject _angle) throws Exception{
try {
		Debug.PushSubsStack("setRotation (cfmetrocircletogglebutton) ","cfmetrocircletogglebutton",22,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("setrotation")) { return __ref.runUserSub(false, "cfmetrocircletogglebutton","setrotation", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 82;BA.debugLine="Public Sub setRotation(angle As Float)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 84;BA.debugLine="CFControlsUtils.setRotation(ToggleButton, angle)";
Debug.ShouldStop(524288);
cfmetrocircletogglebutton._cfcontrolsutils.runVoidMethod ("_setrotation",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_togglebutton").getObject()),(Object)(_angle));
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("ToggleButton_MousePressed (cfmetrocircletogglebutton) ","cfmetrocircletogglebutton",22,__ref.getField(false, "ba"),__ref,156);
if (RapidSub.canDelegate("togglebutton_mousepressed")) { return __ref.runUserSub(false, "cfmetrocircletogglebutton","togglebutton_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 156;BA.debugLine="Private Sub ToggleButton_MousePressed (EventData A";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 158;BA.debugLine="ToggleButton.RequestFocus 'set focus";
Debug.ShouldStop(536870912);
__ref.getField(false,"_togglebutton").runVoidMethod ("RequestFocus");
 BA.debugLineNum = 160;BA.debugLine="If Not(Checked) Then";
Debug.ShouldStop(-2147483648);
if (cfmetrocircletogglebutton.__c.runMethod(true,"Not",(Object)(__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton.class, "_checked"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 162;BA.debugLine="SetCheckState(CHECKED_STATE)";
Debug.ShouldStop(2);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton.class, "_setcheckstate",(Object)(__ref.getField(true,"_checked_state")));
 }else {
 BA.debugLineNum = 166;BA.debugLine="SetCheckState(UNCHECKED_STATE)";
Debug.ShouldStop(32);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton.class, "_setcheckstate",(Object)(__ref.getField(true,"_unchecked_state")));
 };
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}