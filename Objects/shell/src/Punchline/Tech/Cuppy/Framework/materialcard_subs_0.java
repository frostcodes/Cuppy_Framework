package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class materialcard_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (materialcard) ","materialcard",24,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "materialcard","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 26;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 28;BA.debugLine="InnerCard.PrefWidth = Width";
Debug.ShouldStop(134217728);
__ref.getField(false,"_innercard").runMethod(true,"setPrefWidth",_width);
 BA.debugLineNum = 29;BA.debugLine="InnerCard.PrefHeight = Height";
Debug.ShouldStop(268435456);
__ref.getField(false,"_innercard").runMethod(true,"setPrefHeight",_height);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
materialcard._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",materialcard._fx);
 //BA.debugLineNum = 7;BA.debugLine="Private mEventName As String 'ignore";
materialcard._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",materialcard._meventname);
 //BA.debugLineNum = 8;BA.debugLine="Private mCallBack As Object 'ignore";
materialcard._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",materialcard._mcallback);
 //BA.debugLineNum = 9;BA.debugLine="Private mBase As Pane";
materialcard._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",materialcard._mbase);
 //BA.debugLineNum = 10;BA.debugLine="Public InnerCard As Pane";
materialcard._innercard = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_innercard",materialcard._innercard);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (materialcard) ","materialcard",24,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "materialcard","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 18;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="mBase = Base";
Debug.ShouldStop(262144);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 20;BA.debugLine="mBase.LoadLayout(\"CardLayout\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("CardLayout")));
 BA.debugLineNum = 22;BA.debugLine="setBorder(StyleManager.DefaultTheme.Get(\"divider\"";
Debug.ShouldStop(2097152);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materialcard.class, "_setborder",(Object)(BA.ObjectToString(materialcard._stylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("divider")))))),(Object)(BA.numberCast(int.class, 1)));
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
		Debug.PushSubsStack("GetBase (materialcard) ","materialcard",24,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "materialcard","getbase", __ref);}
 BA.debugLineNum = 33;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="Return mBase";
Debug.ShouldStop(2);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Initialize (materialcard) ","materialcard",24,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "materialcard","initialize", __ref, _ba, _callback, _eventname);}
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
		Debug.PushSubsStack("removeEffects (materialcard) ","materialcard",24,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "materialcard","removeeffects", __ref);}
 BA.debugLineNum = 74;BA.debugLine="Public Sub removeEffects()";
Debug.ShouldStop(512);
 BA.debugLineNum = 76;BA.debugLine="ControlsUtils.removePaneEffect(InnerCard)";
Debug.ShouldStop(2048);
materialcard._controlsutils.runVoidMethod ("_removepaneeffect",(Object)(__ref.getField(false,"_innercard")));
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
		Debug.PushSubsStack("SetBg (materialcard) ","materialcard",24,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "materialcard","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 41;BA.debugLine="Public Sub SetBg(color As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="CSSUtils.SetStyleProperty( InnerCard, \"-fx-backgr";
Debug.ShouldStop(1024);
materialcard._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innercard").getObject()),(Object)(BA.ObjectToString("-fx-background-color")),(Object)(_color));
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
public static RemoteObject  _setborder(RemoteObject __ref,RemoteObject _color,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("setBorder (materialcard) ","materialcard",24,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "materialcard","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 53;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="ControlsUtils.setPaneBorder(InnerCard, color, wid";
Debug.ShouldStop(4194304);
materialcard._controlsutils.runVoidMethod ("_setpaneborder",(Object)(__ref.getField(false,"_innercard")),(Object)(_color),(Object)(_width));
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
public static RemoteObject  _setborderradius(RemoteObject __ref,RemoteObject _radius) throws Exception{
try {
		Debug.PushSubsStack("setBorderRadius (materialcard) ","materialcard",24,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "materialcard","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 61;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 63;BA.debugLine="ControlsUtils.setPaneBorderRadius(InnerCard, radi";
Debug.ShouldStop(1073741824);
materialcard._controlsutils.runVoidMethod ("_setpaneborderradius",(Object)(__ref.getField(false,"_innercard")),(Object)(_radius));
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
		Debug.PushSubsStack("setPaneEffect (materialcard) ","materialcard",24,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("setpaneeffect")) { return __ref.runUserSub(false, "materialcard","setpaneeffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 68;BA.debugLine="Public Sub setPaneEffect(effect As String)";
Debug.ShouldStop(8);
 BA.debugLineNum = 70;BA.debugLine="ControlsUtils.setPaneEffect(InnerCard, effect)";
Debug.ShouldStop(32);
materialcard._controlsutils.runVoidMethod ("_setpaneeffect",(Object)(__ref.getField(false,"_innercard")),(Object)(_effect));
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
		Debug.PushSubsStack("setRotationX (materialcard) ","materialcard",24,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("setrotationx")) { return __ref.runUserSub(false, "materialcard","setrotationx", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 47;BA.debugLine="Public Sub setRotationX(angle As Float)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 49;BA.debugLine="ControlsUtils.setPaneRotationX(InnerCard, angle)";
Debug.ShouldStop(65536);
materialcard._controlsutils.runVoidMethod ("_setpanerotationx",(Object)(__ref.getField(false,"_innercard")),(Object)(_angle));
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}