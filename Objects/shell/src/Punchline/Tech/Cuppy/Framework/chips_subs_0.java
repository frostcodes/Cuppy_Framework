package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class chips_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (chips) ","chips",25,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "chips","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 29;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="InnerPane.PrefWidth = Width";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_innerpane").runMethod(true,"setPrefWidth",_width);
 BA.debugLineNum = 32;BA.debugLine="InnerPane.PrefHeight =  Height";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_innerpane").runMethod(true,"setPrefHeight",_height);
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private fx As JFX";
chips._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",chips._fx);
 //BA.debugLineNum = 7;BA.debugLine="Private mEventName As String 'ignore";
chips._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",chips._meventname);
 //BA.debugLineNum = 8;BA.debugLine="Private mCallBack As Object 'ignore";
chips._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",chips._mcallback);
 //BA.debugLineNum = 9;BA.debugLine="Private mBase As Pane";
chips._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",chips._mbase);
 //BA.debugLineNum = 11;BA.debugLine="Public InnerButtonPane As Pane";
chips._innerbuttonpane = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_innerbuttonpane",chips._innerbuttonpane);
 //BA.debugLineNum = 12;BA.debugLine="Public InnerLabel As Label";
chips._innerlabel = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_innerlabel",chips._innerlabel);
 //BA.debugLineNum = 13;BA.debugLine="Public InnerPane As Pane";
chips._innerpane = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_innerpane",chips._innerpane);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (chips) ","chips",25,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "chips","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 21;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="mBase = Base";
Debug.ShouldStop(2097152);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 23;BA.debugLine="mBase.LoadLayout(\"ChipsLayout\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ChipsLayout")));
 BA.debugLineNum = 25;BA.debugLine="SetBg(StyleManager.DefaultTheme.Get(\"accent\"))";
Debug.ShouldStop(16777216);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.chips.class, "_setbg",(Object)(BA.ObjectToString(chips._stylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("accent")))))));
 BA.debugLineNum = 26;BA.debugLine="InnerLabel.Font = StyleManager.SelectFont(\"Thin\",";
Debug.ShouldStop(33554432);
__ref.getField(false,"_innerlabel").runMethod(false,"setFont",chips._stylemanager.runMethod(false,"_selectfont",(Object)(BA.ObjectToString("Thin")),(Object)(BA.numberCast(double.class, 12))));
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
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (chips) ","chips",25,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "chips","getbase", __ref);}
 BA.debugLineNum = 36;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Return mBase";
Debug.ShouldStop(16);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 38;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (chips) ","chips",25,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "chips","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(65536);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 18;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(131072);
__ref.setField ("_mcallback",_callback);
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("removeEffects (chips) ","chips",25,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "chips","removeeffects", __ref);}
 BA.debugLineNum = 76;BA.debugLine="Public Sub removeEffects()";
Debug.ShouldStop(2048);
 BA.debugLineNum = 78;BA.debugLine="ControlsUtils.removePaneEffect(InnerPane)";
Debug.ShouldStop(8192);
chips._controlsutils.runVoidMethod ("_removepaneeffect",(Object)(__ref.getField(false,"_innerpane")));
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
public static RemoteObject  _setbg(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("SetBg (chips) ","chips",25,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "chips","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 40;BA.debugLine="Public Sub SetBg(color As String)";
Debug.ShouldStop(128);
 BA.debugLineNum = 42;BA.debugLine="CSSUtils.SetStyleProperty( InnerPane, \"-fx-backgr";
Debug.ShouldStop(512);
chips._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerpane").getObject()),(Object)(BA.ObjectToString("-fx-background-color")),(Object)(_color));
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
public static RemoteObject  _setborder(RemoteObject __ref,RemoteObject _color,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("setBorder (chips) ","chips",25,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "chips","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 56;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 58;BA.debugLine="ControlsUtils.setPaneBorder(InnerPane, color, wid";
Debug.ShouldStop(33554432);
chips._controlsutils.runVoidMethod ("_setpaneborder",(Object)(__ref.getField(false,"_innerpane")),(Object)(_color),(Object)(_width));
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
		Debug.PushSubsStack("setBorderRadius (chips) ","chips",25,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "chips","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 63;BA.debugLine="Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 65;BA.debugLine="ControlsUtils.setPaneBorderRadius(InnerPane, radi";
Debug.ShouldStop(1);
chips._controlsutils.runVoidMethod ("_setpaneborderradius",(Object)(__ref.getField(false,"_innerpane")),(Object)(_radius));
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
public static RemoteObject  _setpaneeffect(RemoteObject __ref,RemoteObject _effect) throws Exception{
try {
		Debug.PushSubsStack("setPaneEffect (chips) ","chips",25,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("setpaneeffect")) { return __ref.runUserSub(false, "chips","setpaneeffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 70;BA.debugLine="Public Sub setPaneEffect(effect As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 72;BA.debugLine="ControlsUtils.setPaneEffect(InnerPane, effect)";
Debug.ShouldStop(128);
chips._controlsutils.runVoidMethod ("_setpaneeffect",(Object)(__ref.getField(false,"_innerpane")),(Object)(_effect));
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("setRotationX (chips) ","chips",25,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("setrotationx")) { return __ref.runUserSub(false, "chips","setrotationx", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 50;BA.debugLine="Public Sub setRotationX(angle As Float)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 52;BA.debugLine="ControlsUtils.setPaneRotationX(InnerPane, angle)";
Debug.ShouldStop(524288);
chips._controlsutils.runVoidMethod ("_setpanerotationx",(Object)(__ref.getField(false,"_innerpane")),(Object)(_angle));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}