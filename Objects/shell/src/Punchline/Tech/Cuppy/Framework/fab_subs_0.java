package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class fab_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (fab) ","fab",23,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "fab","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 24;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 27;BA.debugLine="FAB_Btn.PrefWidth = Width";
Debug.ShouldStop(67108864);
__ref.getField(false,"_fab_btn").runMethod(true,"setPrefWidth",_width);
 BA.debugLineNum = 28;BA.debugLine="FAB_Btn.PrefHeight = Width";
Debug.ShouldStop(134217728);
__ref.getField(false,"_fab_btn").runMethod(true,"setPrefHeight",_width);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private fx As JFX";
fab._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",fab._fx);
 //BA.debugLineNum = 6;BA.debugLine="Private mEventName As String 'ignore";
fab._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",fab._meventname);
 //BA.debugLineNum = 7;BA.debugLine="Private mCallBack As Object 'ignore";
fab._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",fab._mcallback);
 //BA.debugLineNum = 8;BA.debugLine="Private mBase As Pane";
fab._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",fab._mbase);
 //BA.debugLineNum = 9;BA.debugLine="Public FAB_Btn As Label";
fab._fab_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_fab_btn",fab._fab_btn);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (fab) ","fab",23,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "fab","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 17;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="mBase = Base";
Debug.ShouldStop(131072);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 19;BA.debugLine="mBase.LoadLayout(\"FABLayout\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("FABLayout")));
 BA.debugLineNum = 21;BA.debugLine="SetBg(StyleManager.DefaultTheme.Get(\"accent\"))";
Debug.ShouldStop(1048576);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.fab.class, "_setbg",(Object)(BA.ObjectToString(fab._stylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("accent")))))));
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fab_btn_focuschanged(RemoteObject __ref,RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("FAB_Btn_FocusChanged (fab) ","fab",23,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("fab_btn_focuschanged")) { return __ref.runUserSub(false, "fab","fab_btn_focuschanged", __ref, _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 112;BA.debugLine="Sub FAB_Btn_FocusChanged (HasFocus As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fab_btn_mousemoved(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("FAB_Btn_MouseMoved (fab) ","fab",23,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("fab_btn_mousemoved")) { return __ref.runUserSub(false, "fab","fab_btn_mousemoved", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 83;BA.debugLine="Sub FAB_Btn_MouseMoved (EventData As MouseEvent)";
Debug.ShouldStop(262144);
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
public static RemoteObject  _fab_btn_mousereleased(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("FAB_Btn_MouseReleased (fab) ","fab",23,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("fab_btn_mousereleased")) { return __ref.runUserSub(false, "fab","fab_btn_mousereleased", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 89;BA.debugLine="Sub FAB_Btn_MouseReleased (EventData As MouseEvent";
Debug.ShouldStop(16777216);
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
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (fab) ","fab",23,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "fab","getbase", __ref);}
 BA.debugLineNum = 32;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="Return mBase";
Debug.ShouldStop(1);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Initialize (fab) ","fab",23,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "fab","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(4096);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 14;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(8192);
__ref.setField ("_mcallback",_callback);
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("removeEffects (fab) ","fab",23,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "fab","removeeffects", __ref);}
 BA.debugLineNum = 66;BA.debugLine="Public Sub removeEffects()";
Debug.ShouldStop(2);
 BA.debugLineNum = 68;BA.debugLine="ControlsUtils.removeEffect(FAB_Btn)";
Debug.ShouldStop(8);
fab._controlsutils.runVoidMethod ("_removeeffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_fab_btn").getObject()));
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
public static RemoteObject  _setbg(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("SetBg (fab) ","fab",23,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "fab","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 41;BA.debugLine="Public Sub SetBg(color As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="CSSUtils.SetStyleProperty( FAB_Btn, \"-fx-backgrou";
Debug.ShouldStop(1024);
fab._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_fab_btn").getObject()),(Object)(BA.ObjectToString("-fx-background-color")),(Object)(_color));
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
		Debug.PushSubsStack("setBorder (fab) ","fab",23,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "fab","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 47;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(16384);
 BA.debugLineNum = 49;BA.debugLine="ControlsUtils.setBorder(FAB_Btn, color, width)";
Debug.ShouldStop(65536);
fab._controlsutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_fab_btn").getObject()),(Object)(_color),(Object)(_width));
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
public static RemoteObject  _setborderradius(RemoteObject __ref,RemoteObject _radius) throws Exception{
try {
		Debug.PushSubsStack("setBorderRadius (fab) ","fab",23,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "fab","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 53;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="ControlsUtils.setBorderRadius(FAB_Btn, radius)";
Debug.ShouldStop(4194304);
fab._controlsutils.runVoidMethod ("_setborderradius",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_fab_btn").getObject()),(Object)(_radius));
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
public static RemoteObject  _setpaneeffect(RemoteObject __ref,RemoteObject _effect) throws Exception{
try {
		Debug.PushSubsStack("setPaneEffect (fab) ","fab",23,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("setpaneeffect")) { return __ref.runUserSub(false, "fab","setpaneeffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 60;BA.debugLine="Public Sub setPaneEffect(effect As String)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 62;BA.debugLine="ControlsUtils.setEffect(FAB_Btn, effect)";
Debug.ShouldStop(536870912);
fab._controlsutils.runVoidMethod ("_seteffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_fab_btn").getObject()),(Object)(_effect));
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
public static RemoteObject  _setrotationx(RemoteObject __ref,RemoteObject _angle) throws Exception{
try {
		Debug.PushSubsStack("setRotationX (fab) ","fab",23,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("setrotationx")) { return __ref.runUserSub(false, "fab","setrotationx", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 72;BA.debugLine="Public Sub setRotationX(angle As Float)";
Debug.ShouldStop(128);
 BA.debugLineNum = 74;BA.debugLine="ControlsUtils.setRotationX(FAB_Btn, angle) 'rotat";
Debug.ShouldStop(512);
fab._controlsutils.runVoidMethod ("_setrotationx",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_fab_btn").getObject()),(Object)(_angle));
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
}