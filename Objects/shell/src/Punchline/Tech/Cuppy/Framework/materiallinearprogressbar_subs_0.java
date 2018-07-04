package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class materiallinearprogressbar_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (materiallinearprogressbar) ","materiallinearprogressbar",22,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "materiallinearprogressbar","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 35;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="ProgressPane.PrefWidth = Width";
Debug.ShouldStop(16);
__ref.getField(false,"_progresspane").runMethod(true,"setPrefWidth",_width);
 BA.debugLineNum = 38;BA.debugLine="ProgressPane.PrefHeight = Height";
Debug.ShouldStop(32);
__ref.getField(false,"_progresspane").runMethod(true,"setPrefHeight",_height);
 BA.debugLineNum = 39;BA.debugLine="ProgressBar.PrefHeight = Height";
Debug.ShouldStop(64);
__ref.getField(false,"_progressbar").runMethod(true,"setPrefHeight",_height);
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private fx As JFX";
materiallinearprogressbar._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",materiallinearprogressbar._fx);
 //BA.debugLineNum = 13;BA.debugLine="Private mEventName As String 'ignore";
materiallinearprogressbar._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",materiallinearprogressbar._meventname);
 //BA.debugLineNum = 14;BA.debugLine="Private mCallBack As Object 'ignore";
materiallinearprogressbar._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",materiallinearprogressbar._mcallback);
 //BA.debugLineNum = 15;BA.debugLine="Private mBase As Pane";
materiallinearprogressbar._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",materiallinearprogressbar._mbase);
 //BA.debugLineNum = 16;BA.debugLine="Public ProgressBar As Pane";
materiallinearprogressbar._progressbar = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_progressbar",materiallinearprogressbar._progressbar);
 //BA.debugLineNum = 17;BA.debugLine="Public ProgressPane As Pane";
materiallinearprogressbar._progresspane = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_progresspane",materiallinearprogressbar._progresspane);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (materiallinearprogressbar) ","materiallinearprogressbar",22,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "materiallinearprogressbar","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 25;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="mBase = Base";
Debug.ShouldStop(33554432);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 27;BA.debugLine="mBase.LoadLayout(\"MaterialLinearProgressBar\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MaterialLinearProgressBar")));
 BA.debugLineNum = 29;BA.debugLine="SetBg(StyleManager.DefaultTheme.Get(\"divider\"))";
Debug.ShouldStop(268435456);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materiallinearprogressbar.class, "_setbg",(Object)(BA.ObjectToString(materiallinearprogressbar._stylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("divider")))))));
 BA.debugLineNum = 30;BA.debugLine="setProgressColor(StyleManager.DefaultTheme.Get(\"p";
Debug.ShouldStop(536870912);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materiallinearprogressbar.class, "_setprogresscolor",(Object)(BA.ObjectToString(materiallinearprogressbar._stylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("primary")))))));
 BA.debugLineNum = 31;BA.debugLine="progress(30) 'set initial value";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materiallinearprogressbar.class, "_progress",(Object)(BA.numberCast(int.class, 30)));
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("GetBase (materiallinearprogressbar) ","materiallinearprogressbar",22,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "materiallinearprogressbar","getbase", __ref);}
 BA.debugLineNum = 43;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="Return mBase";
Debug.ShouldStop(2048);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Initialize (materiallinearprogressbar) ","materiallinearprogressbar",22,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "materiallinearprogressbar","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(1048576);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 22;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(2097152);
__ref.setField ("_mcallback",_callback);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _progress(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("progress (materiallinearprogressbar) ","materiallinearprogressbar",22,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("progress")) { return __ref.runUserSub(false, "materiallinearprogressbar","progress", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 95;BA.debugLine="Public Sub progress(value As Int)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 97;BA.debugLine="If value >= 100 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("g",_value,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 98;BA.debugLine="value = 100";
Debug.ShouldStop(2);
_value = BA.numberCast(int.class, 100);Debug.locals.put("value", _value);
 BA.debugLineNum = 101;BA.debugLine="CallSub(mCallBack, mEventName & \"_ProgressFinish";
Debug.ShouldStop(16);
materiallinearprogressbar.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_ProgressFinished"))));
 };
 BA.debugLineNum = 105;BA.debugLine="ProgressBar.SetLayoutAnimated(400, 0 ,0 ,(value /";
Debug.ShouldStop(256);
__ref.getField(false,"_progressbar").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 400)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_value,RemoteObject.createImmutable(100)}, "/",0, 0)),__ref.getField(false,"_mbase").runMethod(true,"getPrefWidth")}, "*",0, 0)),(Object)(__ref.getField(false,"_mbase").runMethod(true,"getPrefHeight")));
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("removeEffects (materiallinearprogressbar) ","materiallinearprogressbar",22,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "materiallinearprogressbar","removeeffects", __ref);}
 BA.debugLineNum = 81;BA.debugLine="Public Sub removeEffects()";
Debug.ShouldStop(65536);
 BA.debugLineNum = 83;BA.debugLine="ControlsUtils.removePaneEffect(ProgressPane)";
Debug.ShouldStop(262144);
materiallinearprogressbar._controlsutils.runVoidMethod ("_removepaneeffect",(Object)(__ref.getField(false,"_progresspane")));
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("SetBg (materiallinearprogressbar) ","materiallinearprogressbar",22,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "materiallinearprogressbar","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 51;BA.debugLine="Public Sub SetBg(color As String)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 53;BA.debugLine="CSSUtils.SetStyleProperty( ProgressPane, \"-fx-bac";
Debug.ShouldStop(1048576);
materiallinearprogressbar._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_progresspane").getObject()),(Object)(BA.ObjectToString("-fx-background-color")),(Object)(_color));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("setBorder (materiallinearprogressbar) ","materiallinearprogressbar",22,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "materiallinearprogressbar","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 63;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 65;BA.debugLine="ControlsUtils.setPaneBorder(ProgressPane, color,";
Debug.ShouldStop(1);
materiallinearprogressbar._controlsutils.runVoidMethod ("_setpaneborder",(Object)(__ref.getField(false,"_progresspane")),(Object)(_color),(Object)(_width));
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
public static RemoteObject  _setborderradius(RemoteObject __ref,RemoteObject _radius) throws Exception{
try {
		Debug.PushSubsStack("setBorderRadius (materiallinearprogressbar) ","materiallinearprogressbar",22,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "materiallinearprogressbar","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 69;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(16);
 BA.debugLineNum = 71;BA.debugLine="ControlsUtils.setPaneBorderRadius(ProgressPane, r";
Debug.ShouldStop(64);
materiallinearprogressbar._controlsutils.runVoidMethod ("_setpaneborderradius",(Object)(__ref.getField(false,"_progresspane")),(Object)(_radius));
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("setPaneEffect (materiallinearprogressbar) ","materiallinearprogressbar",22,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("setpaneeffect")) { return __ref.runUserSub(false, "materiallinearprogressbar","setpaneeffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 75;BA.debugLine="Public Sub setPaneEffect(effect As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 77;BA.debugLine="ControlsUtils.setPaneEffect(ProgressPane, effect)";
Debug.ShouldStop(4096);
materiallinearprogressbar._controlsutils.runVoidMethod ("_setpaneeffect",(Object)(__ref.getField(false,"_progresspane")),(Object)(_effect));
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setprogresscolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setProgressColor (materiallinearprogressbar) ","materiallinearprogressbar",22,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("setprogresscolor")) { return __ref.runUserSub(false, "materiallinearprogressbar","setprogresscolor", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 89;BA.debugLine="Public Sub setProgressColor(color As String)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 91;BA.debugLine="CSSUtils.SetStyleProperty( ProgressBar, \"-fx-back";
Debug.ShouldStop(67108864);
materiallinearprogressbar._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_progressbar").getObject()),(Object)(BA.ObjectToString("-fx-background-color")),(Object)(_color));
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("setRotationX (materiallinearprogressbar) ","materiallinearprogressbar",22,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("setrotationx")) { return __ref.runUserSub(false, "materiallinearprogressbar","setrotationx", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 57;BA.debugLine="Public Sub setRotationX(angle As Float)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 59;BA.debugLine="ControlsUtils.setPaneRotationX(ProgressPane, angl";
Debug.ShouldStop(67108864);
materiallinearprogressbar._controlsutils.runVoidMethod ("_setpanerotationx",(Object)(__ref.getField(false,"_progresspane")),(Object)(_angle));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}