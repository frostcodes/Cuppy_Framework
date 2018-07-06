package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class squarefab_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (squarefab) ","squarefab",18,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "squarefab","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 26;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 29;BA.debugLine="FAB_Btn.PrefWidth = Width";
Debug.ShouldStop(268435456);
__ref.getField(false,"_fab_btn").runMethod(true,"setPrefWidth",_width);
 BA.debugLineNum = 30;BA.debugLine="FAB_Btn.PrefHeight = Width";
Debug.ShouldStop(536870912);
__ref.getField(false,"_fab_btn").runMethod(true,"setPrefHeight",_width);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private fx As JFX";
squarefab._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",squarefab._fx);
 //BA.debugLineNum = 7;BA.debugLine="Private mEventName As String 'ignore";
squarefab._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",squarefab._meventname);
 //BA.debugLineNum = 8;BA.debugLine="Private mCallBack As Object 'ignore";
squarefab._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",squarefab._mcallback);
 //BA.debugLineNum = 9;BA.debugLine="Private mBase As Pane";
squarefab._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",squarefab._mbase);
 //BA.debugLineNum = 10;BA.debugLine="Public FAB_Btn As Label";
squarefab._fab_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_fab_btn",squarefab._fab_btn);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (squarefab) ","squarefab",18,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "squarefab","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 18;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="mBase = Base";
Debug.ShouldStop(262144);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 20;BA.debugLine="mBase.LoadLayout(\"SquareFABLayout\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SquareFABLayout")));
 BA.debugLineNum = 22;BA.debugLine="SetBg(StyleManager.DefaultTheme.Get(\"accent\"))";
Debug.ShouldStop(2097152);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.squarefab.class, "_setbg",(Object)(BA.ObjectToString(squarefab._stylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("accent")))))));
 BA.debugLineNum = 23;BA.debugLine="setRotationX(135) 'rotate by default";
Debug.ShouldStop(4194304);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.squarefab.class, "_setrotationx",(Object)(BA.numberCast(float.class, 135)));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("GetBase (squarefab) ","squarefab",18,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "squarefab","getbase", __ref);}
 BA.debugLineNum = 34;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Return mBase";
Debug.ShouldStop(4);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("Initialize (squarefab) ","squarefab",18,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "squarefab","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(8192);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 15;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(16384);
__ref.setField ("_mcallback",_callback);
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("removeEffects (squarefab) ","squarefab",18,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "squarefab","removeeffects", __ref);}
 BA.debugLineNum = 74;BA.debugLine="Public Sub removeEffects()";
Debug.ShouldStop(512);
 BA.debugLineNum = 76;BA.debugLine="ControlsUtils.removeEffect(FAB_Btn)";
Debug.ShouldStop(2048);
squarefab._controlsutils.runVoidMethod ("_removeeffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_fab_btn").getObject()));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetBg (squarefab) ","squarefab",18,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "squarefab","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 42;BA.debugLine="Public Sub SetBg(color As String)";
Debug.ShouldStop(512);
 BA.debugLineNum = 44;BA.debugLine="CSSUtils.SetStyleProperty( FAB_Btn, \"-fx-backgrou";
Debug.ShouldStop(2048);
squarefab._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_fab_btn").getObject()),(Object)(BA.ObjectToString("-fx-background-color")),(Object)(_color));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("setBorder (squarefab) ","squarefab",18,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "squarefab","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 54;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 56;BA.debugLine="ControlsUtils.setBorder(FAB_Btn, color, width)";
Debug.ShouldStop(8388608);
squarefab._controlsutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_fab_btn").getObject()),(Object)(_color),(Object)(_width));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("setBorderRadius (squarefab) ","squarefab",18,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "squarefab","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 61;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 63;BA.debugLine="ControlsUtils.setBorderRadius(FAB_Btn, radius)";
Debug.ShouldStop(1073741824);
squarefab._controlsutils.runVoidMethod ("_setborderradius",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_fab_btn").getObject()),(Object)(_radius));
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
public static RemoteObject  _setpaneeffect(RemoteObject __ref,RemoteObject _effect) throws Exception{
try {
		Debug.PushSubsStack("setPaneEffect (squarefab) ","squarefab",18,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("setpaneeffect")) { return __ref.runUserSub(false, "squarefab","setpaneeffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 68;BA.debugLine="Public Sub setPaneEffect(effect As String)";
Debug.ShouldStop(8);
 BA.debugLineNum = 70;BA.debugLine="ControlsUtils.setEffect(FAB_Btn, effect)";
Debug.ShouldStop(32);
squarefab._controlsutils.runVoidMethod ("_seteffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_fab_btn").getObject()),(Object)(_effect));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("setRotationX (squarefab) ","squarefab",18,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("setrotationx")) { return __ref.runUserSub(false, "squarefab","setrotationx", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 48;BA.debugLine="Public Sub setRotationX(angle As Float)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="ControlsUtils.setRotationX(FAB_Btn, angle) 'rotat";
Debug.ShouldStop(131072);
squarefab._controlsutils.runVoidMethod ("_setrotationx",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_fab_btn").getObject()),(Object)(_angle));
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}