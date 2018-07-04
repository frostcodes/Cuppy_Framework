package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class materialradiobox_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (materialradiobox) ","materialradiobox",21,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "materialradiobox","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 43;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(1024);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkboxpane_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("CheckboxPane_MousePressed (materialradiobox) ","materialradiobox",21,__ref.getField(false, "ba"),__ref,141);
if (RapidSub.canDelegate("checkboxpane_mousepressed")) { return __ref.runUserSub(false, "materialradiobox","checkboxpane_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 141;BA.debugLine="Private Sub CheckboxPane_MousePressed (EventData A";
Debug.ShouldStop(4096);
 BA.debugLineNum = 143;BA.debugLine="If Not(checked) Or IsIndeterminate Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(".",materialradiobox.__c.runMethod(true,"Not",(Object)(__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materialradiobox.class, "_checked")))) || RemoteObject.solveBoolean(".",__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materialradiobox.class, "_isindeterminate"))) { 
 BA.debugLineNum = 145;BA.debugLine="setCheckState(CHECKED_STATE)";
Debug.ShouldStop(65536);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materialradiobox.class, "_setcheckstate",(Object)(__ref.getField(true,"_checked_state")));
 }else {
 BA.debugLineNum = 149;BA.debugLine="setCheckState(UNCHECKED_STATE)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materialradiobox.class, "_setcheckstate",(Object)(__ref.getField(true,"_unchecked_state")));
 };
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("checked (materialradiobox) ","materialradiobox",21,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("checked")) { return __ref.runUserSub(false, "materialradiobox","checked", __ref);}
 BA.debugLineNum = 129;BA.debugLine="Public Sub checked As Boolean";
Debug.ShouldStop(1);
 BA.debugLineNum = 131;BA.debugLine="Return CheckedPane.Visible";
Debug.ShouldStop(4);
if (true) return __ref.getField(false,"_checkedpane").runMethod(true,"getVisible");
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
materialradiobox._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",materialradiobox._fx);
 //BA.debugLineNum = 10;BA.debugLine="Private mEventName As String 'ignore";
materialradiobox._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",materialradiobox._meventname);
 //BA.debugLineNum = 11;BA.debugLine="Private mCallBack As Object 'ignore";
materialradiobox._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",materialradiobox._mcallback);
 //BA.debugLineNum = 12;BA.debugLine="Private mBase As Pane";
materialradiobox._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",materialradiobox._mbase);
 //BA.debugLineNum = 14;BA.debugLine="Public CheckboxPane As Pane";
materialradiobox._checkboxpane = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_checkboxpane",materialradiobox._checkboxpane);
 //BA.debugLineNum = 15;BA.debugLine="Public CheckedPane As Pane";
materialradiobox._checkedpane = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_checkedpane",materialradiobox._checkedpane);
 //BA.debugLineNum = 18;BA.debugLine="Public CHECKED_STATE As Int = 0";
materialradiobox._checked_state = BA.numberCast(int.class, 0);__ref.setField("_checked_state",materialradiobox._checked_state);
 //BA.debugLineNum = 19;BA.debugLine="Public UNCHECKED_STATE As Int = 1";
materialradiobox._unchecked_state = BA.numberCast(int.class, 1);__ref.setField("_unchecked_state",materialradiobox._unchecked_state);
 //BA.debugLineNum = 20;BA.debugLine="Public INDETERMINATE_STATE As Int = 2";
materialradiobox._indeterminate_state = BA.numberCast(int.class, 2);__ref.setField("_indeterminate_state",materialradiobox._indeterminate_state);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (materialradiobox) ","materialradiobox",21,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "materialradiobox","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 29;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="mBase = Base";
Debug.ShouldStop(536870912);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 31;BA.debugLine="mBase.LoadLayout(\"MaterialRadioBoxLayout\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MaterialRadioBoxLayout")));
 BA.debugLineNum = 34;BA.debugLine="setBorder(StyleManager.DefaultTheme.Get(\"divider\"";
Debug.ShouldStop(2);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materialradiobox.class, "_setborder",(Object)(BA.ObjectToString(materialradiobox._stylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("divider")))))),(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 36;BA.debugLine="setCheckedColor(StyleManager.DefaultTheme.Get(\"pr";
Debug.ShouldStop(8);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materialradiobox.class, "_setcheckedcolor",(Object)(BA.ObjectToString(materialradiobox._stylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("primary")))))));
 BA.debugLineNum = 39;BA.debugLine="setCheckState(UNCHECKED_STATE) 'set initial value";
Debug.ShouldStop(64);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materialradiobox.class, "_setcheckstate",(Object)(__ref.getField(true,"_unchecked_state")));
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
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (materialradiobox) ","materialradiobox",21,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "materialradiobox","getbase", __ref);}
 BA.debugLineNum = 47;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Return mBase";
Debug.ShouldStop(32768);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Initialize (materialradiobox) ","materialradiobox",21,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "materialradiobox","initialize", __ref, _ba, _callback, _eventname);}
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
		Debug.PushSubsStack("IsIndeterminate (materialradiobox) ","materialradiobox",21,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("isindeterminate")) { return __ref.runUserSub(false, "materialradiobox","isindeterminate", __ref);}
 BA.debugLineNum = 135;BA.debugLine="Public Sub IsIndeterminate As Boolean";
Debug.ShouldStop(64);
 BA.debugLineNum = 137;BA.debugLine="Return CheckedPane.Alpha = \"0.6\"";
Debug.ShouldStop(256);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(false,"_checkedpane").runMethod(true,"getAlpha"),BA.numberCast(double.class, "0.6")));
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("removeEffects (materialradiobox) ","materialradiobox",21,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "materialradiobox","removeeffects", __ref);}
 BA.debugLineNum = 85;BA.debugLine="Public Sub removeEffects()";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 87;BA.debugLine="ControlsUtils.removePaneEffect(CheckboxPane)";
Debug.ShouldStop(4194304);
materialradiobox._controlsutils.runVoidMethod ("_removepaneeffect",(Object)(__ref.getField(false,"_checkboxpane")));
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("SetBg (materialradiobox) ","materialradiobox",21,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "materialradiobox","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 55;BA.debugLine="Public Sub SetBg(color As String)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 57;BA.debugLine="CSSUtils.SetStyleProperty( CheckboxPane, \"-fx-bac";
Debug.ShouldStop(16777216);
materialradiobox._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_checkboxpane").getObject()),(Object)(BA.ObjectToString("-fx-background-color")),(Object)(_color));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("setBorder (materialradiobox) ","materialradiobox",21,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "materialradiobox","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 67;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(4);
 BA.debugLineNum = 69;BA.debugLine="ControlsUtils.setPaneBorder(CheckboxPane, color,";
Debug.ShouldStop(16);
materialradiobox._controlsutils.runVoidMethod ("_setpaneborder",(Object)(__ref.getField(false,"_checkboxpane")),(Object)(_color),(Object)(_width));
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("setBorderRadius (materialradiobox) ","materialradiobox",21,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "materialradiobox","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 73;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(256);
 BA.debugLineNum = 75;BA.debugLine="ControlsUtils.setPaneBorderRadius(CheckboxPane, r";
Debug.ShouldStop(1024);
materialradiobox._controlsutils.runVoidMethod ("_setpaneborderradius",(Object)(__ref.getField(false,"_checkboxpane")),(Object)(_radius));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("setCheckedColor (materialradiobox) ","materialradiobox",21,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("setcheckedcolor")) { return __ref.runUserSub(false, "materialradiobox","setcheckedcolor", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 93;BA.debugLine="Public Sub setCheckedColor(color As String)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 95;BA.debugLine="CSSUtils.SetStyleProperty( CheckedPane, \"-fx-back";
Debug.ShouldStop(1073741824);
materialradiobox._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_checkedpane").getObject()),(Object)(BA.ObjectToString("-fx-background-color")),(Object)(_color));
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("setCheckState (materialradiobox) ","materialradiobox",21,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("setcheckstate")) { return __ref.runUserSub(false, "materialradiobox","setcheckstate", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 99;BA.debugLine="Public Sub setCheckState(value As Int)";
Debug.ShouldStop(4);
 BA.debugLineNum = 101;BA.debugLine="If value = UNCHECKED_STATE Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_value,BA.numberCast(double.class, __ref.getField(true,"_unchecked_state")))) { 
 BA.debugLineNum = 103;BA.debugLine="CheckedPane.Visible = False";
Debug.ShouldStop(64);
__ref.getField(false,"_checkedpane").runMethod(true,"setVisible",materialradiobox.__c.getField(true,"False"));
 BA.debugLineNum = 104;BA.debugLine="CheckedPane.SetAlphaAnimated(300, 0 )";
Debug.ShouldStop(128);
__ref.getField(false,"_checkedpane").runVoidMethod ("SetAlphaAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(double.class, 0)));
 }else 
{ BA.debugLineNum = 108;BA.debugLine="Else if value = CHECKED_STATE Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_value,BA.numberCast(double.class, __ref.getField(true,"_checked_state")))) { 
 BA.debugLineNum = 110;BA.debugLine="CheckedPane.Visible = True";
Debug.ShouldStop(8192);
__ref.getField(false,"_checkedpane").runMethod(true,"setVisible",materialradiobox.__c.getField(true,"True"));
 BA.debugLineNum = 111;BA.debugLine="CheckedPane.SetAlphaAnimated(300, 1 )";
Debug.ShouldStop(16384);
__ref.getField(false,"_checkedpane").runVoidMethod ("SetAlphaAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(double.class, 1)));
 }else {
 BA.debugLineNum = 117;BA.debugLine="CheckedPane.SetAlphaAnimated(300, 0.6 )";
Debug.ShouldStop(1048576);
__ref.getField(false,"_checkedpane").runVoidMethod ("SetAlphaAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(double.class, 0.6)));
 BA.debugLineNum = 118;BA.debugLine="CheckedPane.Visible = True";
Debug.ShouldStop(2097152);
__ref.getField(false,"_checkedpane").runMethod(true,"setVisible",materialradiobox.__c.getField(true,"True"));
 }}
;
 BA.debugLineNum = 125;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checked";
Debug.ShouldStop(268435456);
materialradiobox.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_CheckedChanged"))),(Object)((_value)));
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("setPaneEffect (materialradiobox) ","materialradiobox",21,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("setpaneeffect")) { return __ref.runUserSub(false, "materialradiobox","setpaneeffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 79;BA.debugLine="Public Sub setPaneEffect(effect As String)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 81;BA.debugLine="ControlsUtils.setPaneEffect(CheckboxPane, effect)";
Debug.ShouldStop(65536);
materialradiobox._controlsutils.runVoidMethod ("_setpaneeffect",(Object)(__ref.getField(false,"_checkboxpane")),(Object)(_effect));
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("setRotationX (materialradiobox) ","materialradiobox",21,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("setrotationx")) { return __ref.runUserSub(false, "materialradiobox","setrotationx", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 61;BA.debugLine="Public Sub setRotationX(angle As Float)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 63;BA.debugLine="ControlsUtils.setPaneRotationX(CheckboxPane, angl";
Debug.ShouldStop(1073741824);
materialradiobox._controlsutils.runVoidMethod ("_setpanerotationx",(Object)(__ref.getField(false,"_checkboxpane")),(Object)(_angle));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}