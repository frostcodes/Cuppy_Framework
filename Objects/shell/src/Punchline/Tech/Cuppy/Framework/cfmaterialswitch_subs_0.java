package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cfmaterialswitch_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (cfmaterialswitch) ","cfmaterialswitch",21,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "cfmaterialswitch","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 72;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(128);
 BA.debugLineNum = 74;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
Debug.ShouldStop(512);
cfmaterialswitch.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_Resize"))),(Object)((_width)),(Object)((_height)));
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Checked (cfmaterialswitch) ","cfmaterialswitch",21,__ref.getField(false, "ba"),__ref,169);
if (RapidSub.canDelegate("checked")) { return __ref.runUserSub(false, "cfmaterialswitch","checked", __ref);}
 BA.debugLineNum = 169;BA.debugLine="Public Sub Checked As Boolean";
Debug.ShouldStop(256);
 BA.debugLineNum = 171;BA.debugLine="Return SwitchBtn.Left = 23";
Debug.ShouldStop(1024);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(false,"_switchbtn").runMethod(true,"getLeft"),BA.numberCast(double.class, 23)));
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
cfmaterialswitch._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cfmaterialswitch._fx);
 //BA.debugLineNum = 16;BA.debugLine="Private mEventName As String 'ignore";
cfmaterialswitch._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",cfmaterialswitch._meventname);
 //BA.debugLineNum = 17;BA.debugLine="Private mCallBack As Object 'ignore";
cfmaterialswitch._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",cfmaterialswitch._mcallback);
 //BA.debugLineNum = 18;BA.debugLine="Private mBase As Pane";
cfmaterialswitch._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",cfmaterialswitch._mbase);
 //BA.debugLineNum = 20;BA.debugLine="Public SwitchBtn As Pane";
cfmaterialswitch._switchbtn = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_switchbtn",cfmaterialswitch._switchbtn);
 //BA.debugLineNum = 21;BA.debugLine="Public SwitchPane As Pane";
cfmaterialswitch._switchpane = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_switchpane",cfmaterialswitch._switchpane);
 //BA.debugLineNum = 24;BA.debugLine="Public UNCHECKED_STATE As Int = 0";
cfmaterialswitch._unchecked_state = BA.numberCast(int.class, 0);__ref.setField("_unchecked_state",cfmaterialswitch._unchecked_state);
 //BA.debugLineNum = 25;BA.debugLine="Public CHECKED_STATE As Int = 1";
cfmaterialswitch._checked_state = BA.numberCast(int.class, 1);__ref.setField("_checked_state",cfmaterialswitch._checked_state);
 //BA.debugLineNum = 26;BA.debugLine="Public INDETERMINATE_STATE As Int = 2";
cfmaterialswitch._indeterminate_state = BA.numberCast(int.class, 2);__ref.setField("_indeterminate_state",cfmaterialswitch._indeterminate_state);
 //BA.debugLineNum = 29;BA.debugLine="Private FirstTime As Boolean = False";
cfmaterialswitch._firsttime = cfmaterialswitch.__c.getField(true,"False");__ref.setField("_firsttime",cfmaterialswitch._firsttime);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (cfmaterialswitch) ","cfmaterialswitch",21,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "cfmaterialswitch","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _checkedstate = RemoteObject.createImmutable("");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 38;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="mBase = Base";
Debug.ShouldStop(64);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 40;BA.debugLine="mBase.LoadLayout(\"CFMaterialSwitchesUI\")";
Debug.ShouldStop(128);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("CFMaterialSwitchesUI")));
 BA.debugLineNum = 42;BA.debugLine="setCheckedColor(CFStyleManager.DefaultTheme.Get(\"";
Debug.ShouldStop(512);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialswitch.class, "_setcheckedcolor",(Object)(BA.ObjectToString(cfmaterialswitch._cfstylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("primary")))))));
 BA.debugLineNum = 46;BA.debugLine="Dim checkedState As String = Props.Get(\"CheckedSt";
Debug.ShouldStop(8192);
_checkedstate = BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CheckedState")))));Debug.locals.put("checkedState", _checkedstate);Debug.locals.put("checkedState", _checkedstate);
 BA.debugLineNum = 50;BA.debugLine="If checkedState = \"UNCHECKED\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_checkedstate,BA.ObjectToString("UNCHECKED"))) { 
 BA.debugLineNum = 52;BA.debugLine="setCheckState(UNCHECKED_STATE)";
Debug.ShouldStop(524288);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialswitch.class, "_setcheckstate",(Object)(__ref.getField(true,"_unchecked_state")));
 }else 
{ BA.debugLineNum = 54;BA.debugLine="else If checkedState = \"CHECKED\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_checkedstate,BA.ObjectToString("CHECKED"))) { 
 BA.debugLineNum = 56;BA.debugLine="setCheckState(CHECKED_STATE)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialswitch.class, "_setcheckstate",(Object)(__ref.getField(true,"_checked_state")));
 }else 
{ BA.debugLineNum = 58;BA.debugLine="else If checkedState = \"INDETERMINATE\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_checkedstate,BA.ObjectToString("INDETERMINATE"))) { 
 BA.debugLineNum = 60;BA.debugLine="SetCheckState(INDETERMINATE_STATE)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialswitch.class, "_setcheckstate",(Object)(__ref.getField(true,"_indeterminate_state")));
 }}}
;
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("GetBase (cfmaterialswitch) ","cfmaterialswitch",21,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "cfmaterialswitch","getbase", __ref);}
 BA.debugLineNum = 78;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="Return mBase";
Debug.ShouldStop(16384);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Initialize (cfmaterialswitch) ","cfmaterialswitch",21,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cfmaterialswitch","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 33;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(2);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 35;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(4);
__ref.setField ("_mcallback",_callback);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isindeterminate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsIndeterminate (cfmaterialswitch) ","cfmaterialswitch",21,__ref.getField(false, "ba"),__ref,175);
if (RapidSub.canDelegate("isindeterminate")) { return __ref.runUserSub(false, "cfmaterialswitch","isindeterminate", __ref);}
 BA.debugLineNum = 175;BA.debugLine="Public Sub IsIndeterminate As Boolean";
Debug.ShouldStop(16384);
 BA.debugLineNum = 177;BA.debugLine="Return SwitchBtn.Alpha = \"0.6\"";
Debug.ShouldStop(65536);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(false,"_switchbtn").runMethod(true,"getAlpha"),BA.numberCast(double.class, "0.6")));
 BA.debugLineNum = 179;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeeffects(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RemoveEffects (cfmaterialswitch) ","cfmaterialswitch",21,__ref.getField(false, "ba"),__ref,116);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "cfmaterialswitch","removeeffects", __ref);}
 BA.debugLineNum = 116;BA.debugLine="Public Sub RemoveEffects()";
Debug.ShouldStop(524288);
 BA.debugLineNum = 118;BA.debugLine="CFControlsUtils.RemoveEffect(SwitchPane)";
Debug.ShouldStop(2097152);
cfmaterialswitch._cfcontrolsutils.runVoidMethod ("_removeeffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_switchpane").getObject()));
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("setBg (cfmaterialswitch) ","cfmaterialswitch",21,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "cfmaterialswitch","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 86;BA.debugLine="Public Sub setBg(color As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 88;BA.debugLine="CFControlsUtils.SetBG( SwitchPane, color)";
Debug.ShouldStop(8388608);
cfmaterialswitch._cfcontrolsutils.runVoidMethod ("_setbg",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_switchpane").getObject()),(Object)(_color));
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("setBorder (cfmaterialswitch) ","cfmaterialswitch",21,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "cfmaterialswitch","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 98;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(2);
 BA.debugLineNum = 100;BA.debugLine="CFControlsUtils.SetBorder(SwitchPane, color, widt";
Debug.ShouldStop(8);
cfmaterialswitch._cfcontrolsutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_switchpane").getObject()),(Object)(_color),(Object)(_width));
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("setBorderRadius (cfmaterialswitch) ","cfmaterialswitch",21,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "cfmaterialswitch","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 104;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(128);
 BA.debugLineNum = 106;BA.debugLine="CFControlsUtils.SetBorderRadius(SwitchPane, radiu";
Debug.ShouldStop(512);
cfmaterialswitch._cfcontrolsutils.runVoidMethod ("_setborderradius",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_switchpane").getObject()),(Object)(_radius));
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcheckedcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setCheckedColor (cfmaterialswitch) ","cfmaterialswitch",21,__ref.getField(false, "ba"),__ref,124);
if (RapidSub.canDelegate("setcheckedcolor")) { return __ref.runUserSub(false, "cfmaterialswitch","setcheckedcolor", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 124;BA.debugLine="Public Sub setCheckedColor(color As String)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 126;BA.debugLine="CFControlsUtils.SetBG( SwitchBtn, color)";
Debug.ShouldStop(536870912);
cfmaterialswitch._cfcontrolsutils.runVoidMethod ("_setbg",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_switchbtn").getObject()),(Object)(_color));
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("setCheckState (cfmaterialswitch) ","cfmaterialswitch",21,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("setcheckstate")) { return __ref.runUserSub(false, "cfmaterialswitch","setcheckstate", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 130;BA.debugLine="Public Sub setCheckState(value As Int)";
Debug.ShouldStop(2);
 BA.debugLineNum = 132;BA.debugLine="If value = UNCHECKED_STATE Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_value,BA.numberCast(double.class, __ref.getField(true,"_unchecked_state")))) { 
 BA.debugLineNum = 134;BA.debugLine="SwitchBtn.SetLayoutAnimated(200 , 10, SwitchBtn.";
Debug.ShouldStop(32);
__ref.getField(false,"_switchbtn").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(double.class, 10)),(Object)(__ref.getField(false,"_switchbtn").runMethod(true,"getTop")),(Object)(__ref.getField(false,"_switchbtn").runMethod(true,"getPrefWidth")),(Object)(__ref.getField(false,"_switchbtn").runMethod(true,"getPrefHeight")));
 BA.debugLineNum = 135;BA.debugLine="SwitchPane.SetAlphaAnimated(200, 1 )";
Debug.ShouldStop(64);
__ref.getField(false,"_switchpane").runVoidMethod ("SetAlphaAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(double.class, 1)));
 BA.debugLineNum = 136;BA.debugLine="setBg(CFStyleManager.DefaultTheme.Get(\"divider\")";
Debug.ShouldStop(128);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialswitch.class, "_setbg",(Object)(BA.ObjectToString(cfmaterialswitch._cfstylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("divider")))))));
 }else 
{ BA.debugLineNum = 138;BA.debugLine="Else if value = CHECKED_STATE Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_value,BA.numberCast(double.class, __ref.getField(true,"_checked_state")))) { 
 BA.debugLineNum = 141;BA.debugLine="SwitchPane.SetAlphaAnimated(200, 0.6 )";
Debug.ShouldStop(4096);
__ref.getField(false,"_switchpane").runVoidMethod ("SetAlphaAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(double.class, 0.6)));
 BA.debugLineNum = 142;BA.debugLine="setBg(CFControlsUtils.GetBG(SwitchBtn))";
Debug.ShouldStop(8192);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialswitch.class, "_setbg",(Object)(cfmaterialswitch._cfcontrolsutils.runMethod(true,"_getbg",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_switchbtn").getObject()))));
 BA.debugLineNum = 144;BA.debugLine="SwitchBtn.SetLayoutAnimated(200 , 23 , SwitchBtn";
Debug.ShouldStop(32768);
__ref.getField(false,"_switchbtn").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(double.class, 23)),(Object)(__ref.getField(false,"_switchbtn").runMethod(true,"getTop")),(Object)(__ref.getField(false,"_switchbtn").runMethod(true,"getPrefWidth")),(Object)(__ref.getField(false,"_switchbtn").runMethod(true,"getPrefWidth")));
 }else {
 BA.debugLineNum = 149;BA.debugLine="SwitchBtn.SetLayoutAnimated(200 , 23 , SwitchBtn";
Debug.ShouldStop(1048576);
__ref.getField(false,"_switchbtn").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(double.class, 23)),(Object)(__ref.getField(false,"_switchbtn").runMethod(true,"getTop")),(Object)(__ref.getField(false,"_switchbtn").runMethod(true,"getPrefWidth")),(Object)(__ref.getField(false,"_switchbtn").runMethod(true,"getPrefWidth")));
 BA.debugLineNum = 150;BA.debugLine="SwitchPane.SetAlphaAnimated(200, 1 )";
Debug.ShouldStop(2097152);
__ref.getField(false,"_switchpane").runVoidMethod ("SetAlphaAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(double.class, 1)));
 BA.debugLineNum = 151;BA.debugLine="setBg(CFStyleManager.DefaultTheme.Get(\"divider\")";
Debug.ShouldStop(4194304);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialswitch.class, "_setbg",(Object)(BA.ObjectToString(cfmaterialswitch._cfstylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("divider")))))));
 }}
;
 BA.debugLineNum = 155;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(67108864);
if (__ref.getField(true,"_firsttime").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 158;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checke";
Debug.ShouldStop(536870912);
cfmaterialswitch.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_CheckedChanged"))),(Object)((_value)));
 }else {
 BA.debugLineNum = 162;BA.debugLine="FirstTime = True";
Debug.ShouldStop(2);
__ref.setField ("_firsttime",cfmaterialswitch.__c.getField(true,"True"));
 };
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("setEffect (cfmaterialswitch) ","cfmaterialswitch",21,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("seteffect")) { return __ref.runUserSub(false, "cfmaterialswitch","seteffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 110;BA.debugLine="Public Sub setEffect(effect As String)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 112;BA.debugLine="CFControlsUtils.SetEffect(SwitchPane, effect)";
Debug.ShouldStop(32768);
cfmaterialswitch._cfcontrolsutils.runVoidMethod ("_seteffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_switchpane").getObject()),(Object)(_effect));
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("setRotation (cfmaterialswitch) ","cfmaterialswitch",21,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("setrotation")) { return __ref.runUserSub(false, "cfmaterialswitch","setrotation", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 92;BA.debugLine="Public Sub setRotation(angle As Float)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 94;BA.debugLine="CFControlsUtils.SetRotation(SwitchPane, angle) 'r";
Debug.ShouldStop(536870912);
cfmaterialswitch._cfcontrolsutils.runVoidMethod ("_setrotation",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_switchpane").getObject()),(Object)(_angle));
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _switchbtn_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("SwitchBtn_MousePressed (cfmaterialswitch) ","cfmaterialswitch",21,__ref.getField(false, "ba"),__ref,197);
if (RapidSub.canDelegate("switchbtn_mousepressed")) { return __ref.runUserSub(false, "cfmaterialswitch","switchbtn_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 197;BA.debugLine="Private Sub SwitchBtn_MousePressed (EventData As M";
Debug.ShouldStop(16);
 BA.debugLineNum = 199;BA.debugLine="CallSub2(Me , \"SwitchPane_MousePressed\", EventDat";
Debug.ShouldStop(64);
cfmaterialswitch.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("SwitchPane_MousePressed")),(Object)((_eventdata)));
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _switchpane_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("SwitchPane_MousePressed (cfmaterialswitch) ","cfmaterialswitch",21,__ref.getField(false, "ba"),__ref,181);
if (RapidSub.canDelegate("switchpane_mousepressed")) { return __ref.runUserSub(false, "cfmaterialswitch","switchpane_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 181;BA.debugLine="Private Sub SwitchPane_MousePressed (EventData As";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 183;BA.debugLine="SwitchBtn.RequestFocus 'set focus";
Debug.ShouldStop(4194304);
__ref.getField(false,"_switchbtn").runVoidMethod ("RequestFocus");
 BA.debugLineNum = 185;BA.debugLine="If Not(Checked) Or IsIndeterminate Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(".",cfmaterialswitch.__c.runMethod(true,"Not",(Object)(__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialswitch.class, "_checked")))) || RemoteObject.solveBoolean(".",__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialswitch.class, "_isindeterminate"))) { 
 BA.debugLineNum = 187;BA.debugLine="SetCheckState(CHECKED_STATE)";
Debug.ShouldStop(67108864);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialswitch.class, "_setcheckstate",(Object)(__ref.getField(true,"_checked_state")));
 }else {
 BA.debugLineNum = 191;BA.debugLine="SetCheckState(UNCHECKED_STATE)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialswitch.class, "_setcheckstate",(Object)(__ref.getField(true,"_unchecked_state")));
 };
 BA.debugLineNum = 195;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}