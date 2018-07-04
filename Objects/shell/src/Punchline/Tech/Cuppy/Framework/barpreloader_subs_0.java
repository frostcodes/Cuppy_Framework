package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class barpreloader_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (barpreloader) ","barpreloader",9,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "barpreloader","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 54;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
barpreloader._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",barpreloader._fx);
 //BA.debugLineNum = 9;BA.debugLine="Private mEventName As String 'ignore";
barpreloader._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",barpreloader._meventname);
 //BA.debugLineNum = 10;BA.debugLine="Private mCallBack As Object 'ignore";
barpreloader._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",barpreloader._mcallback);
 //BA.debugLineNum = 11;BA.debugLine="Private mBase As Pane";
barpreloader._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",barpreloader._mbase);
 //BA.debugLineNum = 13;BA.debugLine="Private timer1 As Timer";
barpreloader._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_timer1",barpreloader._timer1);
 //BA.debugLineNum = 14;BA.debugLine="Private timer2 As Timer";
barpreloader._timer2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_timer2",barpreloader._timer2);
 //BA.debugLineNum = 15;BA.debugLine="Private timer3 As Timer";
barpreloader._timer3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_timer3",barpreloader._timer3);
 //BA.debugLineNum = 18;BA.debugLine="Private Pane1 As Pane";
barpreloader._pane1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_pane1",barpreloader._pane1);
 //BA.debugLineNum = 19;BA.debugLine="Private Pane2 As Pane";
barpreloader._pane2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_pane2",barpreloader._pane2);
 //BA.debugLineNum = 20;BA.debugLine="Private Pane3 As Pane";
barpreloader._pane3 = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_pane3",barpreloader._pane3);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (barpreloader) ","barpreloader",9,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "barpreloader","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 33;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="mBase = Base";
Debug.ShouldStop(2);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 35;BA.debugLine="mBase.LoadLayout(\"BarPreLoaderUI\")";
Debug.ShouldStop(4);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("BarPreLoaderUI")));
 BA.debugLineNum = 41;BA.debugLine="timer1.Initialize(\"Timer1\", 400)";
Debug.ShouldStop(256);
__ref.getField(false,"_timer1").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Timer1")),(Object)(BA.numberCast(long.class, 400)));
 BA.debugLineNum = 42;BA.debugLine="timer1.Enabled = True";
Debug.ShouldStop(512);
__ref.getField(false,"_timer1").runMethod(true,"setEnabled",barpreloader.__c.getField(true,"True"));
 BA.debugLineNum = 44;BA.debugLine="timer2.Initialize(\"Timer2\", 400)";
Debug.ShouldStop(2048);
__ref.getField(false,"_timer2").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Timer2")),(Object)(BA.numberCast(long.class, 400)));
 BA.debugLineNum = 45;BA.debugLine="timer2.Enabled = True";
Debug.ShouldStop(4096);
__ref.getField(false,"_timer2").runMethod(true,"setEnabled",barpreloader.__c.getField(true,"True"));
 BA.debugLineNum = 48;BA.debugLine="timer3.Initialize(\"Timer3\", 400)";
Debug.ShouldStop(32768);
__ref.getField(false,"_timer3").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Timer3")),(Object)(BA.numberCast(long.class, 400)));
 BA.debugLineNum = 49;BA.debugLine="timer3.Enabled = True";
Debug.ShouldStop(65536);
__ref.getField(false,"_timer3").runMethod(true,"setEnabled",barpreloader.__c.getField(true,"True"));
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
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (barpreloader) ","barpreloader",9,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "barpreloader","getbase", __ref);}
 BA.debugLineNum = 58;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="Return mBase";
Debug.ShouldStop(67108864);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Initialize (barpreloader) ","barpreloader",9,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "barpreloader","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 25;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(33554432);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 27;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(67108864);
__ref.setField ("_mcallback",_callback);
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
public static RemoteObject  _removeeffects(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("removeEffects (barpreloader) ","barpreloader",9,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "barpreloader","removeeffects", __ref);}
 BA.debugLineNum = 134;BA.debugLine="Public Sub removeEffects()";
Debug.ShouldStop(32);
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("SetBg (barpreloader) ","barpreloader",9,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "barpreloader","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 96;BA.debugLine="Public Sub SetBg(color As String)";
Debug.ShouldStop(-2147483648);
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
public static RemoteObject  _setborder(RemoteObject __ref,RemoteObject _color,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("setBorder (barpreloader) ","barpreloader",9,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "barpreloader","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 114;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(131072);
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("setBorderRadius (barpreloader) ","barpreloader",9,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "barpreloader","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 121;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 125;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setEffect (barpreloader) ","barpreloader",9,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("seteffect")) { return __ref.runUserSub(false, "barpreloader","seteffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 128;BA.debugLine="Public Sub setEffect(effect As String)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("setRotationX (barpreloader) ","barpreloader",9,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("setrotationx")) { return __ref.runUserSub(false, "barpreloader","setrotationx", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 108;BA.debugLine="Public Sub setRotationX(angle As Float)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setTextColor (barpreloader) ","barpreloader",9,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("settextcolor")) { return __ref.runUserSub(false, "barpreloader","settextcolor", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 102;BA.debugLine="Public Sub setTextColor(color As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("Timer1_Tick (barpreloader) ","barpreloader",9,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("timer1_tick")) { return __ref.runUserSub(false, "barpreloader","timer1_tick", __ref);}
RemoteObject _height = RemoteObject.createImmutable(0);
 BA.debugLineNum = 67;BA.debugLine="Sub Timer1_Tick";
Debug.ShouldStop(4);
 BA.debugLineNum = 70;BA.debugLine="Dim height As Int = ( Rnd(30, 100) / 100 ) *  mBa";
Debug.ShouldStop(32);
_height = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {barpreloader.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 100))),RemoteObject.createImmutable(100)}, "/",0, 0)),__ref.getField(false,"_mbase").runMethod(true,"getPrefHeight")}, "*",0, 0));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 72;BA.debugLine="Pane1.SetLayoutAnimated( 300 , Pane1.Left, Pane1.";
Debug.ShouldStop(128);
__ref.getField(false,"_pane1").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(__ref.getField(false,"_pane1").runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_pane1").runMethod(true,"getTop")),(Object)(__ref.getField(false,"_pane1").runMethod(true,"getPrefWidth")),(Object)(BA.numberCast(double.class, _height)));
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
public static RemoteObject  _timer2_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Timer2_Tick (barpreloader) ","barpreloader",9,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("timer2_tick")) { return __ref.runUserSub(false, "barpreloader","timer2_tick", __ref);}
RemoteObject _height = RemoteObject.createImmutable(0);
 BA.debugLineNum = 76;BA.debugLine="Sub Timer2_Tick";
Debug.ShouldStop(2048);
 BA.debugLineNum = 78;BA.debugLine="Dim height As Int = ( Rnd(30, 100) / 100  ) *  mB";
Debug.ShouldStop(8192);
_height = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {barpreloader.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 100))),RemoteObject.createImmutable(100)}, "/",0, 0)),__ref.getField(false,"_mbase").runMethod(true,"getPrefHeight")}, "*",0, 0));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 82;BA.debugLine="Pane2.SetLayoutAnimated(300 , Pane2.Left, Pane2.T";
Debug.ShouldStop(131072);
__ref.getField(false,"_pane2").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(__ref.getField(false,"_pane2").runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_pane2").runMethod(true,"getTop")),(Object)(__ref.getField(false,"_pane2").runMethod(true,"getPrefWidth")),(Object)(BA.numberCast(double.class, _height)));
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
public static RemoteObject  _timer3_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Timer3_Tick (barpreloader) ","barpreloader",9,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("timer3_tick")) { return __ref.runUserSub(false, "barpreloader","timer3_tick", __ref);}
RemoteObject _height = RemoteObject.createImmutable(0);
 BA.debugLineNum = 86;BA.debugLine="Sub Timer3_Tick";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 88;BA.debugLine="Dim height As Int =(  Rnd(30, 100) /100 ) *  mBas";
Debug.ShouldStop(8388608);
_height = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {barpreloader.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 100))),RemoteObject.createImmutable(100)}, "/",0, 0)),__ref.getField(false,"_mbase").runMethod(true,"getPrefHeight")}, "*",0, 0));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 90;BA.debugLine="Pane3.SetLayoutAnimated(300 , Pane3.Left, Pane3.T";
Debug.ShouldStop(33554432);
__ref.getField(false,"_pane3").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(__ref.getField(false,"_pane3").runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_pane3").runMethod(true,"getTop")),(Object)(__ref.getField(false,"_pane3").runMethod(true,"getPrefWidth")),(Object)(BA.numberCast(double.class, _height)));
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}