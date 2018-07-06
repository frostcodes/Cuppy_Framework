package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class divider_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (divider) ","divider",12,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "divider","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 39;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="line.PrefWidth = Width";
Debug.ShouldStop(256);
__ref.getField(false,"_line").runMethod(true,"setPrefWidth",_width);
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private fx As JFX";
divider._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",divider._fx);
 //BA.debugLineNum = 9;BA.debugLine="Private mEventName As String 'ignore";
divider._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",divider._meventname);
 //BA.debugLineNum = 10;BA.debugLine="Private mCallBack As Object 'ignore";
divider._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",divider._mcallback);
 //BA.debugLineNum = 11;BA.debugLine="Private mBase As Pane";
divider._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",divider._mbase);
 //BA.debugLineNum = 12;BA.debugLine="Public line As Pane";
divider._line = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_line",divider._line);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (divider) ","divider",12,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "divider","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 20;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="mBase = Base";
Debug.ShouldStop(1048576);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 22;BA.debugLine="mBase.LoadLayout(\"DividerLayout\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DividerLayout")));
 BA.debugLineNum = 24;BA.debugLine="SetBg(StyleManager.DefaultTheme.Get(\"divider\"))";
Debug.ShouldStop(8388608);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.divider.class, "_setbg",(Object)(BA.ObjectToString(divider._stylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("divider")))))));
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("GetBase (divider) ","divider",12,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "divider","getbase", __ref);}
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
public static RemoteObject  _getsize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSize (divider) ","divider",12,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("getsize")) { return __ref.runUserSub(false, "divider","getsize", __ref);}
 BA.debugLineNum = 102;BA.debugLine="Public Sub getSize() As Double";
Debug.ShouldStop(32);
 BA.debugLineNum = 104;BA.debugLine="Return line.PrefHeight";
Debug.ShouldStop(128);
if (true) return __ref.getField(false,"_line").runMethod(true,"getPrefHeight");
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (divider) ","divider",12,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "divider","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(32768);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 17;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(65536);
__ref.setField ("_mcallback",_callback);
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("removeEffects (divider) ","divider",12,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "divider","removeeffects", __ref);}
 BA.debugLineNum = 86;BA.debugLine="Public Sub removeEffects()";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 88;BA.debugLine="ControlsUtils.removePaneEffect(line)";
Debug.ShouldStop(8388608);
divider._controlsutils.runVoidMethod ("_removepaneeffect",(Object)(__ref.getField(false,"_line")));
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
public static RemoteObject  _setbg(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("SetBg (divider) ","divider",12,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "divider","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 54;BA.debugLine="Public Sub SetBg(color As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 56;BA.debugLine="CSSUtils.SetStyleProperty( line, \"-fx-background-";
Debug.ShouldStop(8388608);
divider._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_line").getObject()),(Object)(BA.ObjectToString("-fx-background-color")),(Object)(_color));
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
public static RemoteObject  _setborder(RemoteObject __ref,RemoteObject _color,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("setBorder (divider) ","divider",12,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "divider","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 66;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(2);
 BA.debugLineNum = 68;BA.debugLine="ControlsUtils.setPaneBorder(line, color, width)";
Debug.ShouldStop(8);
divider._controlsutils.runVoidMethod ("_setpaneborder",(Object)(__ref.getField(false,"_line")),(Object)(_color),(Object)(_width));
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
public static RemoteObject  _setborderradius(RemoteObject __ref,RemoteObject _radius) throws Exception{
try {
		Debug.PushSubsStack("setBorderRadius (divider) ","divider",12,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "divider","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 73;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(256);
 BA.debugLineNum = 75;BA.debugLine="ControlsUtils.setPaneBorderRadius(line, radius)";
Debug.ShouldStop(1024);
divider._controlsutils.runVoidMethod ("_setpaneborderradius",(Object)(__ref.getField(false,"_line")),(Object)(_radius));
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
public static RemoteObject  _setpaneeffect(RemoteObject __ref,RemoteObject _effect) throws Exception{
try {
		Debug.PushSubsStack("setPaneEffect (divider) ","divider",12,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("setpaneeffect")) { return __ref.runUserSub(false, "divider","setpaneeffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 80;BA.debugLine="Public Sub setPaneEffect(effect As String)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 82;BA.debugLine="ControlsUtils.setPaneEffect(line, effect)";
Debug.ShouldStop(131072);
divider._controlsutils.runVoidMethod ("_setpaneeffect",(Object)(__ref.getField(false,"_line")),(Object)(_effect));
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("setRotationX (divider) ","divider",12,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("setrotationx")) { return __ref.runUserSub(false, "divider","setrotationx", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 60;BA.debugLine="Public Sub setRotationX(angle As Float)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 62;BA.debugLine="ControlsUtils.setPaneRotationX(line, angle) 'rota";
Debug.ShouldStop(536870912);
divider._controlsutils.runVoidMethod ("_setpanerotationx",(Object)(__ref.getField(false,"_line")),(Object)(_angle));
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
public static RemoteObject  _setsize(RemoteObject __ref,RemoteObject _sizex) throws Exception{
try {
		Debug.PushSubsStack("setSize (divider) ","divider",12,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("setsize")) { return __ref.runUserSub(false, "divider","setsize", __ref, _sizex);}
Debug.locals.put("sizeX", _sizex);
 BA.debugLineNum = 96;BA.debugLine="Public Sub setSize(sizeX As Int)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 98;BA.debugLine="line.PrefHeight =  sizeX";
Debug.ShouldStop(2);
__ref.getField(false,"_line").runMethod(true,"setPrefHeight",BA.numberCast(double.class, _sizex));
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}