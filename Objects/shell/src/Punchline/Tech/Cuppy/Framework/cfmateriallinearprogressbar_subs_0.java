package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cfmateriallinearprogressbar_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (cfmateriallinearprogressbar) ","cfmateriallinearprogressbar",23,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "cfmateriallinearprogressbar","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 53;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="ProgressPane.PrefWidth = Width";
Debug.ShouldStop(4194304);
__ref.getField(false,"_progresspane").runMethod(true,"setPrefWidth",_width);
 BA.debugLineNum = 56;BA.debugLine="ProgressPane.PrefHeight = Height";
Debug.ShouldStop(8388608);
__ref.getField(false,"_progresspane").runMethod(true,"setPrefHeight",_height);
 BA.debugLineNum = 57;BA.debugLine="ProgressBar.PrefHeight = Height";
Debug.ShouldStop(16777216);
__ref.getField(false,"_progressbar").runMethod(true,"setPrefHeight",_height);
 BA.debugLineNum = 59;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
Debug.ShouldStop(67108864);
cfmateriallinearprogressbar.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_Resize"))),(Object)((_width)),(Object)((_height)));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 29;BA.debugLine="Private fx As JFX";
cfmateriallinearprogressbar._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cfmateriallinearprogressbar._fx);
 //BA.debugLineNum = 30;BA.debugLine="Private mEventName As String 'ignore";
cfmateriallinearprogressbar._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",cfmateriallinearprogressbar._meventname);
 //BA.debugLineNum = 31;BA.debugLine="Private mCallBack As Object 'ignore";
cfmateriallinearprogressbar._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",cfmateriallinearprogressbar._mcallback);
 //BA.debugLineNum = 32;BA.debugLine="Private mBase As Pane";
cfmateriallinearprogressbar._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",cfmateriallinearprogressbar._mbase);
 //BA.debugLineNum = 33;BA.debugLine="Public ProgressBar As Pane";
cfmateriallinearprogressbar._progressbar = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_progressbar",cfmateriallinearprogressbar._progressbar);
 //BA.debugLineNum = 34;BA.debugLine="Public ProgressPane As Pane";
cfmateriallinearprogressbar._progresspane = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_progresspane",cfmateriallinearprogressbar._progresspane);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (cfmateriallinearprogressbar) ","cfmateriallinearprogressbar",23,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "cfmateriallinearprogressbar","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 42;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="mBase = Base";
Debug.ShouldStop(1024);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 44;BA.debugLine="mBase.LoadLayout(\"CFMaterialLinearProgressBarUI\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("CFMaterialLinearProgressBarUI")));
 BA.debugLineNum = 46;BA.debugLine="SetBg(CFStyleManager.DefaultTheme.Get(\"divider\"))";
Debug.ShouldStop(8192);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmateriallinearprogressbar.class, "_setbg",(Object)(BA.ObjectToString(cfmateriallinearprogressbar._cfstylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("divider")))))));
 BA.debugLineNum = 47;BA.debugLine="setProgressColor(CFStyleManager.DefaultTheme.Get(";
Debug.ShouldStop(16384);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmateriallinearprogressbar.class, "_setprogresscolor",(Object)(BA.ObjectToString(cfmateriallinearprogressbar._cfstylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("primary")))))));
 BA.debugLineNum = 49;BA.debugLine="setProgress(Props.Get(\"Progress\")) 'set initial p";
Debug.ShouldStop(65536);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmateriallinearprogressbar.class, "_setprogress",(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Progress")))))));
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
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (cfmateriallinearprogressbar) ","cfmateriallinearprogressbar",23,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "cfmateriallinearprogressbar","getbase", __ref);}
 BA.debugLineNum = 63;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="Return mBase";
Debug.ShouldStop(-2147483648);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getprogress(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getProgress (cfmateriallinearprogressbar) ","cfmateriallinearprogressbar",23,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("getprogress")) { return __ref.runUserSub(false, "cfmateriallinearprogressbar","getprogress", __ref);}
 BA.debugLineNum = 129;BA.debugLine="Public Sub getProgress()  As Int";
Debug.ShouldStop(1);
 BA.debugLineNum = 131;BA.debugLine="Return (ProgressBar.PrefWidth / mBase.PrefWidth )";
Debug.ShouldStop(4);
if (true) return BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_progressbar").runMethod(true,"getPrefWidth"),__ref.getField(false,"_mbase").runMethod(true,"getPrefWidth")}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0));
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Initialize (cfmateriallinearprogressbar) ","cfmateriallinearprogressbar",23,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cfmateriallinearprogressbar","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 37;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(32);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 39;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(64);
__ref.setField ("_mcallback",_callback);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("RemoveEffects (cfmateriallinearprogressbar) ","cfmateriallinearprogressbar",23,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "cfmateriallinearprogressbar","removeeffects", __ref);}
 BA.debugLineNum = 101;BA.debugLine="Public Sub RemoveEffects()";
Debug.ShouldStop(16);
 BA.debugLineNum = 103;BA.debugLine="CFControlsUtils.RemoveEffect(ProgressPane)";
Debug.ShouldStop(64);
cfmateriallinearprogressbar._cfcontrolsutils.runVoidMethod ("_removeeffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_progresspane").getObject()));
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("setBg (cfmateriallinearprogressbar) ","cfmateriallinearprogressbar",23,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "cfmateriallinearprogressbar","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 71;BA.debugLine="Public Sub setBg(color As String)";
Debug.ShouldStop(64);
 BA.debugLineNum = 73;BA.debugLine="CFControlsUtils.SetBG( ProgressPane, color)";
Debug.ShouldStop(256);
cfmateriallinearprogressbar._cfcontrolsutils.runVoidMethod ("_setbg",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_progresspane").getObject()),(Object)(_color));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("setBorder (cfmateriallinearprogressbar) ","cfmateriallinearprogressbar",23,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "cfmateriallinearprogressbar","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 83;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(262144);
 BA.debugLineNum = 85;BA.debugLine="CFControlsUtils.SetBorder(ProgressPane, color, wi";
Debug.ShouldStop(1048576);
cfmateriallinearprogressbar._cfcontrolsutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_progresspane").getObject()),(Object)(_color),(Object)(_width));
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
public static RemoteObject  _setborderradius(RemoteObject __ref,RemoteObject _radius) throws Exception{
try {
		Debug.PushSubsStack("setBorderRadius (cfmateriallinearprogressbar) ","cfmateriallinearprogressbar",23,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "cfmateriallinearprogressbar","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 89;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 91;BA.debugLine="CFControlsUtils.SetBorderRadius(ProgressPane, rad";
Debug.ShouldStop(67108864);
cfmateriallinearprogressbar._cfcontrolsutils.runVoidMethod ("_setborderradius",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_progresspane").getObject()),(Object)(_radius));
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
public static RemoteObject  _seteffect(RemoteObject __ref,RemoteObject _effect) throws Exception{
try {
		Debug.PushSubsStack("setEffect (cfmateriallinearprogressbar) ","cfmateriallinearprogressbar",23,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("seteffect")) { return __ref.runUserSub(false, "cfmateriallinearprogressbar","seteffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 95;BA.debugLine="Public Sub setEffect(effect As String)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 97;BA.debugLine="CFControlsUtils.SetEffect(ProgressPane, effect)";
Debug.ShouldStop(1);
cfmateriallinearprogressbar._cfcontrolsutils.runVoidMethod ("_seteffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_progresspane").getObject()),(Object)(_effect));
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setprogress(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setProgress (cfmateriallinearprogressbar) ","cfmateriallinearprogressbar",23,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("setprogress")) { return __ref.runUserSub(false, "cfmateriallinearprogressbar","setprogress", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 115;BA.debugLine="Public Sub setProgress(value As Int)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 117;BA.debugLine="If value >= 100 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("g",_value,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 118;BA.debugLine="value = 100";
Debug.ShouldStop(2097152);
_value = BA.numberCast(int.class, 100);Debug.locals.put("value", _value);
 BA.debugLineNum = 121;BA.debugLine="CallSub(mCallBack, mEventName & \"_ProgressFinish";
Debug.ShouldStop(16777216);
cfmateriallinearprogressbar.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_ProgressFinished"))));
 };
 BA.debugLineNum = 125;BA.debugLine="ProgressBar.SetLayoutAnimated(400, 0 ,0 , (value";
Debug.ShouldStop(268435456);
__ref.getField(false,"_progressbar").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 400)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_value,RemoteObject.createImmutable(100)}, "/",0, 0)),__ref.getField(false,"_mbase").runMethod(true,"getPrefWidth")}, "*",0, 0)),(Object)(__ref.getField(false,"_mbase").runMethod(true,"getPrefHeight")));
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
public static RemoteObject  _setprogresscolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setProgressColor (cfmateriallinearprogressbar) ","cfmateriallinearprogressbar",23,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("setprogresscolor")) { return __ref.runUserSub(false, "cfmateriallinearprogressbar","setprogresscolor", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 109;BA.debugLine="Public Sub setProgressColor(color As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 111;BA.debugLine="CFControlsUtils.SetBG( ProgressBar, color)";
Debug.ShouldStop(16384);
cfmateriallinearprogressbar._cfcontrolsutils.runVoidMethod ("_setbg",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_progressbar").getObject()),(Object)(_color));
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("setRotation (cfmateriallinearprogressbar) ","cfmateriallinearprogressbar",23,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("setrotation")) { return __ref.runUserSub(false, "cfmateriallinearprogressbar","setrotation", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 77;BA.debugLine="Public Sub setRotation(angle As Float)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 79;BA.debugLine="CFControlsUtils.SetRotation(ProgressPane, angle)";
Debug.ShouldStop(16384);
cfmateriallinearprogressbar._cfcontrolsutils.runVoidMethod ("_setrotation",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_progresspane").getObject()),(Object)(_angle));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}