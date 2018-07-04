package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class appbar_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (appbar) ","appbar",17,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "appbar","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 27;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
appbar._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",appbar._fx);
 //BA.debugLineNum = 7;BA.debugLine="Private mEventName As String 'ignore";
appbar._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",appbar._meventname);
 //BA.debugLineNum = 8;BA.debugLine="Private mCallBack As Object 'ignore";
appbar._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",appbar._mcallback);
 //BA.debugLineNum = 9;BA.debugLine="Private mBase As Pane";
appbar._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",appbar._mbase);
 //BA.debugLineNum = 10;BA.debugLine="Private Label1 As Label";
appbar._label1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_label1",appbar._label1);
 //BA.debugLineNum = 11;BA.debugLine="Public InnerPane As Pane";
appbar._innerpane = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_innerpane",appbar._innerpane);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (appbar) ","appbar",17,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "appbar","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 19;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="mBase = Base";
Debug.ShouldStop(524288);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 21;BA.debugLine="mBase.LoadLayout(\"AppBarLayout\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("AppBarLayout")));
 BA.debugLineNum = 23;BA.debugLine="SetBg(StyleManager.DefaultTheme.Get(\"primary\"))";
Debug.ShouldStop(4194304);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.appbar.class, "_setbg",(Object)(BA.ObjectToString(appbar._stylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("primary")))))));
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
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (appbar) ","appbar",17,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "appbar","getbase", __ref);}
 BA.debugLineNum = 31;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Return mBase";
Debug.ShouldStop(-2147483648);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Initialize (appbar) ","appbar",17,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "appbar","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(16384);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 16;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(32768);
__ref.setField ("_mcallback",_callback);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("removeEffects (appbar) ","appbar",17,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "appbar","removeeffects", __ref);}
 BA.debugLineNum = 74;BA.debugLine="Public Sub removeEffects()";
Debug.ShouldStop(512);
 BA.debugLineNum = 76;BA.debugLine="ControlsUtils.removeEffect(Label1)";
Debug.ShouldStop(2048);
appbar._controlsutils.runVoidMethod ("_removeeffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_label1").getObject()));
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
		Debug.PushSubsStack("SetBg (appbar) ","appbar",17,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "appbar","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 41;BA.debugLine="Public Sub SetBg(color As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="CSSUtils.SetStyleProperty( Label1, \"-fx-backgroun";
Debug.ShouldStop(1024);
appbar._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_label1").getObject()),(Object)(BA.ObjectToString("-fx-background-color")),(Object)(_color));
 BA.debugLineNum = 44;BA.debugLine="CSSUtils.SetStyleProperty( InnerPane, \"-fx-backgr";
Debug.ShouldStop(2048);
appbar._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerpane").getObject()),(Object)(BA.ObjectToString("-fx-background-color")),(Object)(_color));
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
		Debug.PushSubsStack("setBorder (appbar) ","appbar",17,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "appbar","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 55;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 57;BA.debugLine="ControlsUtils.setBorder(Label1, color, width)";
Debug.ShouldStop(16777216);
appbar._controlsutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_label1").getObject()),(Object)(_color),(Object)(_width));
 BA.debugLineNum = 58;BA.debugLine="ControlsUtils.setPaneBorder(InnerPane, color, wi";
Debug.ShouldStop(33554432);
appbar._controlsutils.runVoidMethod ("_setpaneborder",(Object)(__ref.getField(false,"_innerpane")),(Object)(_color),(Object)(_width));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setBorderRadius (appbar) ","appbar",17,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "appbar","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 62;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="ControlsUtils.setBorderRadius(Label1, radius)";
Debug.ShouldStop(1073741824);
appbar._controlsutils.runVoidMethod ("_setborderradius",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_label1").getObject()),(Object)(_radius));
 BA.debugLineNum = 64;BA.debugLine="ControlsUtils.setPaneBorderRadius(InnerPane, radi";
Debug.ShouldStop(-2147483648);
appbar._controlsutils.runVoidMethod ("_setpaneborderradius",(Object)(__ref.getField(false,"_innerpane")),(Object)(_radius));
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
public static RemoteObject  _setpaneeffect(RemoteObject __ref,RemoteObject _effect) throws Exception{
try {
		Debug.PushSubsStack("setPaneEffect (appbar) ","appbar",17,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("setpaneeffect")) { return __ref.runUserSub(false, "appbar","setpaneeffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 68;BA.debugLine="Public Sub setPaneEffect(effect As String)";
Debug.ShouldStop(8);
 BA.debugLineNum = 70;BA.debugLine="ControlsUtils.setEffect(Label1, effect)";
Debug.ShouldStop(32);
appbar._controlsutils.runVoidMethod ("_seteffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_label1").getObject()),(Object)(_effect));
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
		Debug.PushSubsStack("setRotationX (appbar) ","appbar",17,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("setrotationx")) { return __ref.runUserSub(false, "appbar","setrotationx", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 48;BA.debugLine="Public Sub setRotationX(angle As Float)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="ControlsUtils.setRotationX(Label1, angle) 'rotate";
Debug.ShouldStop(131072);
appbar._controlsutils.runVoidMethod ("_setrotationx",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_label1").getObject()),(Object)(_angle));
 BA.debugLineNum = 51;BA.debugLine="ControlsUtils.setPaneRotationX(InnerPane , angle)";
Debug.ShouldStop(262144);
appbar._controlsutils.runVoidMethod ("_setpanerotationx",(Object)(__ref.getField(false,"_innerpane")),(Object)(_angle));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}