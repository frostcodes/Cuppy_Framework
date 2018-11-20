package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cfmaterialcard_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (cfmaterialcard) ","cfmaterialcard",24,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "cfmaterialcard","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 38;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="InnerCard.PrefWidth = Width";
Debug.ShouldStop(128);
__ref.getField(false,"_innercard").runMethod(true,"setPrefWidth",_width);
 BA.debugLineNum = 41;BA.debugLine="InnerCard.PrefHeight = Height";
Debug.ShouldStop(256);
__ref.getField(false,"_innercard").runMethod(true,"setPrefHeight",_height);
 BA.debugLineNum = 43;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
Debug.ShouldStop(1024);
cfmaterialcard.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_Resize"))),(Object)((_width)),(Object)((_height)));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private fx As JFX";
cfmaterialcard._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cfmaterialcard._fx);
 //BA.debugLineNum = 19;BA.debugLine="Private mEventName As String 'ignore";
cfmaterialcard._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",cfmaterialcard._meventname);
 //BA.debugLineNum = 20;BA.debugLine="Private mCallBack As Object 'ignore";
cfmaterialcard._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",cfmaterialcard._mcallback);
 //BA.debugLineNum = 21;BA.debugLine="Private mBase As Pane";
cfmaterialcard._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",cfmaterialcard._mbase);
 //BA.debugLineNum = 22;BA.debugLine="Public InnerCard As Pane";
cfmaterialcard._innercard = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_innercard",cfmaterialcard._innercard);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (cfmaterialcard) ","cfmaterialcard",24,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "cfmaterialcard","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 30;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="mBase = Base";
Debug.ShouldStop(1073741824);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 32;BA.debugLine="mBase.LoadLayout(\"CFMaterialCardUI\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("CFMaterialCardUI")));
 BA.debugLineNum = 34;BA.debugLine="SetBorder(CFStyleManager.DefaultTheme.Get(\"divide";
Debug.ShouldStop(2);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialcard.class, "_setborder",(Object)(BA.ObjectToString(cfmaterialcard._cfstylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("divider")))))),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("GetBase (cfmaterialcard) ","cfmaterialcard",24,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "cfmaterialcard","getbase", __ref);}
 BA.debugLineNum = 47;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Return mBase";
Debug.ShouldStop(32768);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Initialize (cfmaterialcard) ","cfmaterialcard",24,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cfmaterialcard","initialize", __ref, _ba, _callback, _eventname);}
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
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _innercard_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("InnerCard_MouseClicked (cfmaterialcard) ","cfmaterialcard",24,__ref.getField(false, "ba"),__ref,116);
if (RapidSub.canDelegate("innercard_mouseclicked")) { return __ref.runUserSub(false, "cfmaterialcard","innercard_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 116;BA.debugLine="Private Sub InnerCard_MouseClicked (EventData As M";
Debug.ShouldStop(524288);
 BA.debugLineNum = 118;BA.debugLine="InnerCard.RequestFocus 'set focus";
Debug.ShouldStop(2097152);
__ref.getField(false,"_innercard").runVoidMethod ("RequestFocus");
 BA.debugLineNum = 119;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseCl";
Debug.ShouldStop(4194304);
cfmaterialcard.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MouseClicked"))),(Object)((_eventdata)));
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
public static RemoteObject  _innercard_mouseentered(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("InnerCard_MouseEntered (cfmaterialcard) ","cfmaterialcard",24,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("innercard_mouseentered")) { return __ref.runUserSub(false, "cfmaterialcard","innercard_mouseentered", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 104;BA.debugLine="Private Sub InnerCard_MouseEntered (EventData As M";
Debug.ShouldStop(128);
 BA.debugLineNum = 106;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEn";
Debug.ShouldStop(512);
cfmaterialcard.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MouseEntered"))),(Object)((_eventdata)));
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _innercard_mouseexited(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("InnerCard_MouseExited (cfmaterialcard) ","cfmaterialcard",24,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("innercard_mouseexited")) { return __ref.runUserSub(false, "cfmaterialcard","innercard_mouseexited", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 110;BA.debugLine="Private Sub InnerCard_MouseExited (EventData As Mo";
Debug.ShouldStop(8192);
 BA.debugLineNum = 112;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEx";
Debug.ShouldStop(32768);
cfmaterialcard.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MouseExited"))),(Object)((_eventdata)));
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _innercard_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("InnerCard_Touch (cfmaterialcard) ","cfmaterialcard",24,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("innercard_touch")) { return __ref.runUserSub(false, "cfmaterialcard","innercard_touch", __ref, _action, _x, _y);}
RemoteObject _points = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 93;BA.debugLine="Private Sub InnerCard_Touch (Action As Int, X As F";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 95;BA.debugLine="Dim Points As Map";
Debug.ShouldStop(1073741824);
_points = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Points", _points);
 BA.debugLineNum = 96;BA.debugLine="Points.Initialize";
Debug.ShouldStop(-2147483648);
_points.runVoidMethod ("Initialize");
 BA.debugLineNum = 97;BA.debugLine="Points.Put(\"X\", X )";
Debug.ShouldStop(1);
_points.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("X"))),(Object)((_x)));
 BA.debugLineNum = 98;BA.debugLine="Points.Put(\"Y\", Y )";
Debug.ShouldStop(2);
_points.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Y"))),(Object)((_y)));
 BA.debugLineNum = 100;BA.debugLine="CallSubDelayed3( mCallBack, mEventName & \"_Touch\"";
Debug.ShouldStop(8);
cfmaterialcard.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_Touch"))),(Object)((_action)),(Object)((_points)));
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("RemoveEffects (cfmaterialcard) ","cfmaterialcard",24,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "cfmaterialcard","removeeffects", __ref);}
 BA.debugLineNum = 85;BA.debugLine="Public Sub RemoveEffects()";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 87;BA.debugLine="CFControlsUtils.removeEffect(InnerCard)";
Debug.ShouldStop(4194304);
cfmaterialcard._cfcontrolsutils.runVoidMethod ("_removeeffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innercard").getObject()));
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
public static RemoteObject  _setbg(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setBg (cfmaterialcard) ","cfmaterialcard",24,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "cfmaterialcard","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 55;BA.debugLine="Public Sub setBg(color As String)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 57;BA.debugLine="CFControlsUtils.SetBG( InnerCard, color)";
Debug.ShouldStop(16777216);
cfmaterialcard._cfcontrolsutils.runVoidMethod ("_setbg",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innercard").getObject()),(Object)(_color));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("setBorder (cfmaterialcard) ","cfmaterialcard",24,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "cfmaterialcard","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 67;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(4);
 BA.debugLineNum = 69;BA.debugLine="CFControlsUtils.setBorder(InnerCard, color, width";
Debug.ShouldStop(16);
cfmaterialcard._cfcontrolsutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innercard").getObject()),(Object)(_color),(Object)(_width));
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("setBorderRadius (cfmaterialcard) ","cfmaterialcard",24,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "cfmaterialcard","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 73;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(256);
 BA.debugLineNum = 75;BA.debugLine="CFControlsUtils.setBorderRadius(InnerCard, radius";
Debug.ShouldStop(1024);
cfmaterialcard._cfcontrolsutils.runVoidMethod ("_setborderradius",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innercard").getObject()),(Object)(_radius));
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
public static RemoteObject  _seteffect(RemoteObject __ref,RemoteObject _effect) throws Exception{
try {
		Debug.PushSubsStack("setEffect (cfmaterialcard) ","cfmaterialcard",24,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("seteffect")) { return __ref.runUserSub(false, "cfmaterialcard","seteffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 79;BA.debugLine="Public Sub setEffect(effect As String)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 81;BA.debugLine="CFControlsUtils.setEffect(InnerCard, effect)";
Debug.ShouldStop(65536);
cfmaterialcard._cfcontrolsutils.runVoidMethod ("_seteffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innercard").getObject()),(Object)(_effect));
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("setRotation (cfmaterialcard) ","cfmaterialcard",24,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("setrotation")) { return __ref.runUserSub(false, "cfmaterialcard","setrotation", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 61;BA.debugLine="Public Sub setRotation(angle As Float)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 63;BA.debugLine="CFControlsUtils.setRotation(InnerCard, angle) 'ro";
Debug.ShouldStop(1073741824);
cfmaterialcard._cfcontrolsutils.runVoidMethod ("_setrotation",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innercard").getObject()),(Object)(_angle));
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
}