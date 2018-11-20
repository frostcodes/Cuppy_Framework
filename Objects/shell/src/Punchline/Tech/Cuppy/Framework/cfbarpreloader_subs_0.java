package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cfbarpreloader_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (cfbarpreloader) ","cfbarpreloader",9,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "cfbarpreloader","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 70;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(32);
 BA.debugLineNum = 72;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
Debug.ShouldStop(128);
cfbarpreloader.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_Resize"))),(Object)((_width)),(Object)((_height)));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 30;BA.debugLine="Private fx As JFX";
cfbarpreloader._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cfbarpreloader._fx);
 //BA.debugLineNum = 31;BA.debugLine="Private mEventName As String 'ignore";
cfbarpreloader._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",cfbarpreloader._meventname);
 //BA.debugLineNum = 32;BA.debugLine="Private mCallBack As Object 'ignore";
cfbarpreloader._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",cfbarpreloader._mcallback);
 //BA.debugLineNum = 33;BA.debugLine="Private mBase As Pane";
cfbarpreloader._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",cfbarpreloader._mbase);
 //BA.debugLineNum = 34;BA.debugLine="Private timer1 As Timer";
cfbarpreloader._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_timer1",cfbarpreloader._timer1);
 //BA.debugLineNum = 35;BA.debugLine="Private timer2 As Timer";
cfbarpreloader._timer2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_timer2",cfbarpreloader._timer2);
 //BA.debugLineNum = 36;BA.debugLine="Private timer3 As Timer";
cfbarpreloader._timer3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_timer3",cfbarpreloader._timer3);
 //BA.debugLineNum = 38;BA.debugLine="Private Pane1 As Pane";
cfbarpreloader._pane1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_pane1",cfbarpreloader._pane1);
 //BA.debugLineNum = 39;BA.debugLine="Private Pane2 As Pane";
cfbarpreloader._pane2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_pane2",cfbarpreloader._pane2);
 //BA.debugLineNum = 40;BA.debugLine="Private Pane3 As Pane";
cfbarpreloader._pane3 = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_pane3",cfbarpreloader._pane3);
 //BA.debugLineNum = 41;BA.debugLine="Private AnimationTime As Int = 400";
cfbarpreloader._animationtime = BA.numberCast(int.class, 400);__ref.setField("_animationtime",cfbarpreloader._animationtime);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (cfbarpreloader) ","cfbarpreloader",9,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "cfbarpreloader","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 52;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="mBase = Base";
Debug.ShouldStop(1048576);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 54;BA.debugLine="mBase.LoadLayout(\"CFBarPreLoaderUI\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("CFBarPreLoaderUI")));
 BA.debugLineNum = 60;BA.debugLine="setAnimationTime(Props.get(\"AnimationTime\"))";
Debug.ShouldStop(134217728);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfbarpreloader.class, "_setanimationtime",(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("AnimationTime")))))));
 BA.debugLineNum = 62;BA.debugLine="timer1.Initialize(\"Timer1\", AnimationTime)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_timer1").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Timer1")),(Object)(BA.numberCast(long.class, __ref.getField(true,"_animationtime"))));
 BA.debugLineNum = 63;BA.debugLine="timer2.Initialize(\"Timer2\", AnimationTime)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_timer2").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Timer2")),(Object)(BA.numberCast(long.class, __ref.getField(true,"_animationtime"))));
 BA.debugLineNum = 64;BA.debugLine="timer3.Initialize(\"Timer3\", AnimationTime)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_timer3").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Timer3")),(Object)(BA.numberCast(long.class, __ref.getField(true,"_animationtime"))));
 BA.debugLineNum = 66;BA.debugLine="Start";
Debug.ShouldStop(2);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfbarpreloader.class, "_start");
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enabletimers(RemoteObject __ref,RemoteObject _enabled) throws Exception{
try {
		Debug.PushSubsStack("EnableTimers (cfbarpreloader) ","cfbarpreloader",9,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("enabletimers")) { return __ref.runUserSub(false, "cfbarpreloader","enabletimers", __ref, _enabled);}
Debug.locals.put("enabled", _enabled);
 BA.debugLineNum = 151;BA.debugLine="Private Sub EnableTimers(enabled As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 153;BA.debugLine="timer1.Enabled =  enabled";
Debug.ShouldStop(16777216);
__ref.getField(false,"_timer1").runMethod(true,"setEnabled",_enabled);
 BA.debugLineNum = 154;BA.debugLine="timer2.Enabled =  enabled";
Debug.ShouldStop(33554432);
__ref.getField(false,"_timer2").runMethod(true,"setEnabled",_enabled);
 BA.debugLineNum = 155;BA.debugLine="timer3.Enabled =  enabled";
Debug.ShouldStop(67108864);
__ref.getField(false,"_timer3").runMethod(true,"setEnabled",_enabled);
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getanimationtime(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getAnimationTime (cfbarpreloader) ","cfbarpreloader",9,__ref.getField(false, "ba"),__ref,196);
if (RapidSub.canDelegate("getanimationtime")) { return __ref.runUserSub(false, "cfbarpreloader","getanimationtime", __ref);}
 BA.debugLineNum = 196;BA.debugLine="Public Sub getAnimationTime As Int";
Debug.ShouldStop(8);
 BA.debugLineNum = 198;BA.debugLine="Return AnimationTime";
Debug.ShouldStop(32);
if (true) return __ref.getField(true,"_animationtime");
 BA.debugLineNum = 200;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (cfbarpreloader) ","cfbarpreloader",9,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "cfbarpreloader","getbase", __ref);}
 BA.debugLineNum = 76;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="Return mBase";
Debug.ShouldStop(4096);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Initialize (cfbarpreloader) ","cfbarpreloader",9,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cfbarpreloader","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 45;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(4096);
 BA.debugLineNum = 47;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(16384);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 48;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(32768);
__ref.setField ("_mcallback",_callback);
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
public static RemoteObject  _setanimationtime(RemoteObject __ref,RemoteObject _timeinms) throws Exception{
try {
		Debug.PushSubsStack("setAnimationTime (cfbarpreloader) ","cfbarpreloader",9,__ref.getField(false, "ba"),__ref,177);
if (RapidSub.canDelegate("setanimationtime")) { return __ref.runUserSub(false, "cfbarpreloader","setanimationtime", __ref, _timeinms);}
Debug.locals.put("TimeInMS", _timeinms);
 BA.debugLineNum = 177;BA.debugLine="Public Sub setAnimationTime(TimeInMS As Int)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 179;BA.debugLine="If  TimeInMS > 5000 Or TimeInMS < 100 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_timeinms,BA.numberCast(double.class, 5000)) || RemoteObject.solveBoolean("<",_timeinms,BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 181;BA.debugLine="LogError($\"Bar Preloader Animation Time can't be";
Debug.ShouldStop(1048576);
cfbarpreloader.__c.runVoidMethod ("LogError",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Bar Preloader Animation Time can't be \n"),RemoteObject.createImmutable("		greater than 5000 or less  than 100. Reseting time to 400 MS")))));
 BA.debugLineNum = 184;BA.debugLine="AnimationTime = 400";
Debug.ShouldStop(8388608);
__ref.setField ("_animationtime",BA.numberCast(int.class, 400));
 }else {
 BA.debugLineNum = 188;BA.debugLine="AnimationTime = TimeInMS";
Debug.ShouldStop(134217728);
__ref.setField ("_animationtime",_timeinms);
 };
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _start(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Start (cfbarpreloader) ","cfbarpreloader",9,__ref.getField(false, "ba"),__ref,160);
if (RapidSub.canDelegate("start")) { return __ref.runUserSub(false, "cfbarpreloader","start", __ref);}
 BA.debugLineNum = 160;BA.debugLine="Public Sub Start()";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 162;BA.debugLine="EnableTimers(True)";
Debug.ShouldStop(2);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfbarpreloader.class, "_enabletimers",(Object)(cfbarpreloader.__c.getField(true,"True")));
 BA.debugLineNum = 163;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Animatio";
Debug.ShouldStop(4);
cfbarpreloader.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_AnimationStarted"))));
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
public static RemoteObject  _stop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Stop (cfbarpreloader) ","cfbarpreloader",9,__ref.getField(false, "ba"),__ref,168);
if (RapidSub.canDelegate("stop")) { return __ref.runUserSub(false, "cfbarpreloader","stop", __ref);}
 BA.debugLineNum = 168;BA.debugLine="Public Sub Stop()";
Debug.ShouldStop(128);
 BA.debugLineNum = 170;BA.debugLine="EnableTimers(False)";
Debug.ShouldStop(512);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfbarpreloader.class, "_enabletimers",(Object)(cfbarpreloader.__c.getField(true,"False")));
 BA.debugLineNum = 171;BA.debugLine="CallSubDelayed( mCallBack, mEventName & \"_Animati";
Debug.ShouldStop(1024);
cfbarpreloader.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_AnimationStopped"))));
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timer1_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Timer1_Tick (cfbarpreloader) ","cfbarpreloader",9,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("timer1_tick")) { return __ref.runUserSub(false, "cfbarpreloader","timer1_tick", __ref);}
RemoteObject _height = RemoteObject.createImmutable(0);
 BA.debugLineNum = 82;BA.debugLine="Private Sub Timer1_Tick";
Debug.ShouldStop(131072);
 BA.debugLineNum = 85;BA.debugLine="Dim height As Int = (Rnd(30, 100) / 100 ) *  mBas";
Debug.ShouldStop(1048576);
_height = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {cfbarpreloader.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 100))),RemoteObject.createImmutable(100)}, "/",0, 0)),__ref.getField(false,"_mbase").runMethod(true,"getPrefHeight")}, "*",0, 0));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 87;BA.debugLine="Pane1.SetLayoutAnimated( 300 , Pane1.Left, Pane1.";
Debug.ShouldStop(4194304);
__ref.getField(false,"_pane1").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(__ref.getField(false,"_pane1").runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_pane1").runMethod(true,"getTop")),(Object)(__ref.getField(false,"_pane1").runMethod(true,"getPrefWidth")),(Object)(BA.numberCast(double.class, _height)));
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
public static RemoteObject  _timer2_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Timer2_Tick (cfbarpreloader) ","cfbarpreloader",9,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("timer2_tick")) { return __ref.runUserSub(false, "cfbarpreloader","timer2_tick", __ref);}
RemoteObject _height = RemoteObject.createImmutable(0);
 BA.debugLineNum = 91;BA.debugLine="Private Sub Timer2_Tick";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 93;BA.debugLine="Dim height As Int = (Rnd(30, 100) / 100  ) *  mBa";
Debug.ShouldStop(268435456);
_height = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {cfbarpreloader.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 100))),RemoteObject.createImmutable(100)}, "/",0, 0)),__ref.getField(false,"_mbase").runMethod(true,"getPrefHeight")}, "*",0, 0));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 95;BA.debugLine="Pane2.SetLayoutAnimated(300 , Pane2.Left, Pane2.T";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_pane2").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(__ref.getField(false,"_pane2").runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_pane2").runMethod(true,"getTop")),(Object)(__ref.getField(false,"_pane2").runMethod(true,"getPrefWidth")),(Object)(BA.numberCast(double.class, _height)));
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
public static RemoteObject  _timer3_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Timer3_Tick (cfbarpreloader) ","cfbarpreloader",9,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("timer3_tick")) { return __ref.runUserSub(false, "cfbarpreloader","timer3_tick", __ref);}
RemoteObject _height = RemoteObject.createImmutable(0);
 BA.debugLineNum = 99;BA.debugLine="Private Sub Timer3_Tick";
Debug.ShouldStop(4);
 BA.debugLineNum = 101;BA.debugLine="Dim height As Int = (Rnd(30, 100) /100 ) *  mBase";
Debug.ShouldStop(16);
_height = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {cfbarpreloader.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 100))),RemoteObject.createImmutable(100)}, "/",0, 0)),__ref.getField(false,"_mbase").runMethod(true,"getPrefHeight")}, "*",0, 0));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 103;BA.debugLine="Pane3.SetLayoutAnimated(300 , Pane3.Left, Pane3.T";
Debug.ShouldStop(64);
__ref.getField(false,"_pane3").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(__ref.getField(false,"_pane3").runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_pane3").runMethod(true,"getTop")),(Object)(__ref.getField(false,"_pane3").runMethod(true,"getPrefWidth")),(Object)(BA.numberCast(double.class, _height)));
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
}