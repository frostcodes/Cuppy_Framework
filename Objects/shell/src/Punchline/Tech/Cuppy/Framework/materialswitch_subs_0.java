package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class materialswitch_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (materialswitch) ","materialswitch",28,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "materialswitch","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 46;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(8192);
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("checked (materialswitch) ","materialswitch",28,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("checked")) { return __ref.runUserSub(false, "materialswitch","checked", __ref);}
 BA.debugLineNum = 134;BA.debugLine="Public Sub checked As Boolean";
Debug.ShouldStop(32);
 BA.debugLineNum = 136;BA.debugLine="Return SwitchBtn.Left = 23";
Debug.ShouldStop(128);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(false,"_switchbtn").runMethod(true,"getLeft"),BA.numberCast(double.class, 23)));
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
materialswitch._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",materialswitch._fx);
 //BA.debugLineNum = 10;BA.debugLine="Private mEventName As String 'ignore";
materialswitch._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",materialswitch._meventname);
 //BA.debugLineNum = 11;BA.debugLine="Private mCallBack As Object 'ignore";
materialswitch._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",materialswitch._mcallback);
 //BA.debugLineNum = 12;BA.debugLine="Private mBase As Pane";
materialswitch._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",materialswitch._mbase);
 //BA.debugLineNum = 14;BA.debugLine="Public SwitchBtn As Pane";
materialswitch._switchbtn = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_switchbtn",materialswitch._switchbtn);
 //BA.debugLineNum = 15;BA.debugLine="Public SwitchPane As Pane";
materialswitch._switchpane = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_switchpane",materialswitch._switchpane);
 //BA.debugLineNum = 18;BA.debugLine="Public CHECKED_STATE As Int = 0";
materialswitch._checked_state = BA.numberCast(int.class, 0);__ref.setField("_checked_state",materialswitch._checked_state);
 //BA.debugLineNum = 19;BA.debugLine="Public UNCHECKED_STATE As Int = 1";
materialswitch._unchecked_state = BA.numberCast(int.class, 1);__ref.setField("_unchecked_state",materialswitch._unchecked_state);
 //BA.debugLineNum = 20;BA.debugLine="Public INDETERMINATE_STATE As Int = 2";
materialswitch._indeterminate_state = BA.numberCast(int.class, 2);__ref.setField("_indeterminate_state",materialswitch._indeterminate_state);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (materialswitch) ","materialswitch",28,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "materialswitch","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 29;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="mBase = Base";
Debug.ShouldStop(536870912);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 31;BA.debugLine="mBase.LoadLayout(\"MaterialSwitchesLayout\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MaterialSwitchesLayout")));
 BA.debugLineNum = 33;BA.debugLine="setCheckedColor(StyleManager.DefaultTheme.Get(\"pr";
Debug.ShouldStop(1);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materialswitch.class, "_setcheckedcolor",(Object)(BA.ObjectToString(materialswitch._stylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("primary")))))));
 BA.debugLineNum = 36;BA.debugLine="setCheckState(UNCHECKED_STATE) 'set initial value";
Debug.ShouldStop(8);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materialswitch.class, "_setcheckstate",(Object)(__ref.getField(true,"_unchecked_state")));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("GetBase (materialswitch) ","materialswitch",28,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "materialswitch","getbase", __ref);}
 BA.debugLineNum = 52;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="Return mBase";
Debug.ShouldStop(1048576);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Initialize (materialswitch) ","materialswitch",28,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "materialswitch","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(16777216);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 26;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(33554432);
__ref.setField ("_mcallback",_callback);
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("IsIndeterminate (materialswitch) ","materialswitch",28,__ref.getField(false, "ba"),__ref,140);
if (RapidSub.canDelegate("isindeterminate")) { return __ref.runUserSub(false, "materialswitch","isindeterminate", __ref);}
 BA.debugLineNum = 140;BA.debugLine="Public Sub IsIndeterminate As Boolean";
Debug.ShouldStop(2048);
 BA.debugLineNum = 142;BA.debugLine="Return SwitchBtn.Alpha = \"0.6\"";
Debug.ShouldStop(8192);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(false,"_switchbtn").runMethod(true,"getAlpha"),BA.numberCast(double.class, "0.6")));
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("removeEffects (materialswitch) ","materialswitch",28,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "materialswitch","removeeffects", __ref);}
 BA.debugLineNum = 90;BA.debugLine="Public Sub removeEffects()";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 92;BA.debugLine="ControlsUtils.removePaneEffect(SwitchPane)";
Debug.ShouldStop(134217728);
materialswitch._controlsutils.runVoidMethod ("_removepaneeffect",(Object)(__ref.getField(false,"_switchpane")));
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("SetBg (materialswitch) ","materialswitch",28,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "materialswitch","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 60;BA.debugLine="Public Sub SetBg(color As String)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 62;BA.debugLine="CSSUtils.SetStyleProperty( SwitchPane, \"-fx-backg";
Debug.ShouldStop(536870912);
materialswitch._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_switchpane").getObject()),(Object)(BA.ObjectToString("-fx-background-color")),(Object)(_color));
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("setBorder (materialswitch) ","materialswitch",28,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "materialswitch","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 72;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(128);
 BA.debugLineNum = 74;BA.debugLine="ControlsUtils.setPaneBorder(SwitchPane, color, wi";
Debug.ShouldStop(512);
materialswitch._controlsutils.runVoidMethod ("_setpaneborder",(Object)(__ref.getField(false,"_switchpane")),(Object)(_color),(Object)(_width));
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
public static RemoteObject  _setborderradius(RemoteObject __ref,RemoteObject _radius) throws Exception{
try {
		Debug.PushSubsStack("setBorderRadius (materialswitch) ","materialswitch",28,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "materialswitch","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 78;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 80;BA.debugLine="ControlsUtils.setPaneBorderRadius(SwitchPane, rad";
Debug.ShouldStop(32768);
materialswitch._controlsutils.runVoidMethod ("_setpaneborderradius",(Object)(__ref.getField(false,"_switchpane")),(Object)(_radius));
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("setCheckedColor (materialswitch) ","materialswitch",28,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("setcheckedcolor")) { return __ref.runUserSub(false, "materialswitch","setcheckedcolor", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 98;BA.debugLine="Public Sub setCheckedColor(color As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 100;BA.debugLine="CSSUtils.SetStyleProperty( SwitchBtn, \"-fx-backgr";
Debug.ShouldStop(8);
materialswitch._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_switchbtn").getObject()),(Object)(BA.ObjectToString("-fx-background-color")),(Object)(_color));
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
public static RemoteObject  _setcheckstate(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setCheckState (materialswitch) ","materialswitch",28,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("setcheckstate")) { return __ref.runUserSub(false, "materialswitch","setcheckstate", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 104;BA.debugLine="Public Sub setCheckState(value As Int)";
Debug.ShouldStop(128);
 BA.debugLineNum = 106;BA.debugLine="If value = UNCHECKED_STATE Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_value,BA.numberCast(double.class, __ref.getField(true,"_unchecked_state")))) { 
 BA.debugLineNum = 108;BA.debugLine="SwitchBtn.SetLayoutAnimated(200 , 10, SwitchBtn";
Debug.ShouldStop(2048);
__ref.getField(false,"_switchbtn").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(double.class, 10)),(Object)(__ref.getField(false,"_switchbtn").runMethod(true,"getTop")),(Object)(__ref.getField(false,"_switchbtn").runMethod(true,"getPrefWidth")),(Object)(__ref.getField(false,"_switchbtn").runMethod(true,"getPrefHeight")));
 BA.debugLineNum = 109;BA.debugLine="SwitchPane.SetAlphaAnimated(200, 1 )";
Debug.ShouldStop(4096);
__ref.getField(false,"_switchpane").runVoidMethod ("SetAlphaAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(double.class, 1)));
 BA.debugLineNum = 110;BA.debugLine="SetBg(StyleManager.DefaultTheme.Get(\"divider\"))";
Debug.ShouldStop(8192);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materialswitch.class, "_setbg",(Object)(BA.ObjectToString(materialswitch._stylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("divider")))))));
 }else 
{ BA.debugLineNum = 112;BA.debugLine="Else if value = CHECKED_STATE Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_value,BA.numberCast(double.class, __ref.getField(true,"_checked_state")))) { 
 BA.debugLineNum = 115;BA.debugLine="SwitchPane.SetAlphaAnimated(200, 0.6 )";
Debug.ShouldStop(262144);
__ref.getField(false,"_switchpane").runVoidMethod ("SetAlphaAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(double.class, 0.6)));
 BA.debugLineNum = 116;BA.debugLine="SetBg(ControlsUtils.getPaneBG(SwitchBtn))";
Debug.ShouldStop(524288);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materialswitch.class, "_setbg",(Object)(materialswitch._controlsutils.runMethod(true,"_getpanebg",(Object)(__ref.getField(false,"_switchbtn")))));
 BA.debugLineNum = 118;BA.debugLine="SwitchBtn.SetLayoutAnimated(200 , 23 , SwitchBtn";
Debug.ShouldStop(2097152);
__ref.getField(false,"_switchbtn").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(double.class, 23)),(Object)(__ref.getField(false,"_switchbtn").runMethod(true,"getTop")),(Object)(__ref.getField(false,"_switchbtn").runMethod(true,"getPrefWidth")),(Object)(__ref.getField(false,"_switchbtn").runMethod(true,"getPrefWidth")));
 }else {
 BA.debugLineNum = 123;BA.debugLine="SwitchBtn.SetLayoutAnimated(200 , 23 , SwitchBtn";
Debug.ShouldStop(67108864);
__ref.getField(false,"_switchbtn").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(double.class, 23)),(Object)(__ref.getField(false,"_switchbtn").runMethod(true,"getTop")),(Object)(__ref.getField(false,"_switchbtn").runMethod(true,"getPrefWidth")),(Object)(__ref.getField(false,"_switchbtn").runMethod(true,"getPrefWidth")));
 BA.debugLineNum = 124;BA.debugLine="SwitchPane.SetAlphaAnimated(200, 1 )";
Debug.ShouldStop(134217728);
__ref.getField(false,"_switchpane").runVoidMethod ("SetAlphaAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(double.class, 1)));
 BA.debugLineNum = 125;BA.debugLine="SetBg(StyleManager.DefaultTheme.Get(\"divider\"))";
Debug.ShouldStop(268435456);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materialswitch.class, "_setbg",(Object)(BA.ObjectToString(materialswitch._stylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("divider")))))));
 }}
;
 BA.debugLineNum = 130;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checked";
Debug.ShouldStop(2);
materialswitch.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_CheckedChanged"))),(Object)((_value)));
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("setPaneEffect (materialswitch) ","materialswitch",28,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("setpaneeffect")) { return __ref.runUserSub(false, "materialswitch","setpaneeffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 84;BA.debugLine="Public Sub setPaneEffect(effect As String)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 86;BA.debugLine="ControlsUtils.setPaneEffect(SwitchPane, effect)";
Debug.ShouldStop(2097152);
materialswitch._controlsutils.runVoidMethod ("_setpaneeffect",(Object)(__ref.getField(false,"_switchpane")),(Object)(_effect));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("setRotationX (materialswitch) ","materialswitch",28,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("setrotationx")) { return __ref.runUserSub(false, "materialswitch","setrotationx", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 66;BA.debugLine="Public Sub setRotationX(angle As Float)";
Debug.ShouldStop(2);
 BA.debugLineNum = 68;BA.debugLine="ControlsUtils.setPaneRotationX(SwitchPane, angle)";
Debug.ShouldStop(8);
materialswitch._controlsutils.runVoidMethod ("_setpanerotationx",(Object)(__ref.getField(false,"_switchpane")),(Object)(_angle));
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
public static RemoteObject  _switchbtn_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("SwitchBtn_MousePressed (materialswitch) ","materialswitch",28,__ref.getField(false, "ba"),__ref,161);
if (RapidSub.canDelegate("switchbtn_mousepressed")) { return __ref.runUserSub(false, "materialswitch","switchbtn_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 161;BA.debugLine="Sub SwitchBtn_MousePressed (EventData As MouseEven";
Debug.ShouldStop(1);
 BA.debugLineNum = 163;BA.debugLine="CallSub2(Me , \"SwitchPane_MousePressed\", EventDat";
Debug.ShouldStop(4);
materialswitch.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("SwitchPane_MousePressed")),(Object)((_eventdata)));
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("SwitchPane_MousePressed (materialswitch) ","materialswitch",28,__ref.getField(false, "ba"),__ref,146);
if (RapidSub.canDelegate("switchpane_mousepressed")) { return __ref.runUserSub(false, "materialswitch","switchpane_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 146;BA.debugLine="Private Sub SwitchPane_MousePressed (EventData As";
Debug.ShouldStop(131072);
 BA.debugLineNum = 148;BA.debugLine="If Not(checked) Or IsIndeterminate Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(".",materialswitch.__c.runMethod(true,"Not",(Object)(__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materialswitch.class, "_checked")))) || RemoteObject.solveBoolean(".",__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materialswitch.class, "_isindeterminate"))) { 
 BA.debugLineNum = 150;BA.debugLine="setCheckState(CHECKED_STATE)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materialswitch.class, "_setcheckstate",(Object)(__ref.getField(true,"_checked_state")));
 }else {
 BA.debugLineNum = 154;BA.debugLine="setCheckState(UNCHECKED_STATE)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materialswitch.class, "_setcheckstate",(Object)(__ref.getField(true,"_unchecked_state")));
 };
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}