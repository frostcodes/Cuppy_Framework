package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class modal_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (modal) ","modal",14,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "modal","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 31;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="ModalBgPane.PrefWidth = Width";
Debug.ShouldStop(1);
__ref.getField(false,"_modalbgpane").runMethod(true,"setPrefWidth",_width);
 BA.debugLineNum = 34;BA.debugLine="ModalBgPane.PrefHeight =  Height";
Debug.ShouldStop(2);
__ref.getField(false,"_modalbgpane").runMethod(true,"setPrefHeight",_height);
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private fx As JFX";
modal._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",modal._fx);
 //BA.debugLineNum = 11;BA.debugLine="Private mEventName As String 'ignore";
modal._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",modal._meventname);
 //BA.debugLineNum = 12;BA.debugLine="Private mCallBack As Object 'ignore";
modal._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",modal._mcallback);
 //BA.debugLineNum = 13;BA.debugLine="Private mBase As Pane";
modal._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",modal._mbase);
 //BA.debugLineNum = 14;BA.debugLine="Public ModalPane As Pane";
modal._modalpane = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_modalpane",modal._modalpane);
 //BA.debugLineNum = 15;BA.debugLine="Public ModalBgPane As Pane";
modal._modalbgpane = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_modalbgpane",modal._modalbgpane);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (modal) ","modal",14,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "modal","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 23;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="mBase = Base";
Debug.ShouldStop(8388608);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 25;BA.debugLine="mBase.LoadLayout(\"ModalLayout\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ModalLayout")));
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
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (modal) ","modal",14,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "modal","getbase", __ref);}
 BA.debugLineNum = 38;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Return mBase";
Debug.ShouldStop(64);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Initialize (modal) ","modal",14,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "modal","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(262144);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 20;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(524288);
__ref.setField ("_mcallback",_callback);
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _modalbgpane_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("ModalBgPane_MousePressed (modal) ","modal",14,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("modalbgpane_mousepressed")) { return __ref.runUserSub(false, "modal","modalbgpane_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 101;BA.debugLine="Sub ModalBgPane_MousePressed (EventData As MouseEv";
Debug.ShouldStop(16);
 BA.debugLineNum = 103;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ModalBG";
Debug.ShouldStop(64);
modal.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_ModalBGPressed"))),(Object)((_eventdata)));
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
public static RemoteObject  _modalpane_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("ModalPane_MousePressed (modal) ","modal",14,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("modalpane_mousepressed")) { return __ref.runUserSub(false, "modal","modalpane_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 107;BA.debugLine="Sub ModalPane_MousePressed (EventData As MouseEven";
Debug.ShouldStop(1024);
 BA.debugLineNum = 109;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ModalPr";
Debug.ShouldStop(4096);
modal.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_ModalPressed"))),(Object)((_eventdata)));
 BA.debugLineNum = 111;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("removeEffects (modal) ","modal",14,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "modal","removeeffects", __ref);}
 BA.debugLineNum = 78;BA.debugLine="Public Sub removeEffects()";
Debug.ShouldStop(8192);
 BA.debugLineNum = 80;BA.debugLine="ControlsUtils.removePaneEffect(ModalPane)";
Debug.ShouldStop(32768);
modal._controlsutils.runVoidMethod ("_removepaneeffect",(Object)(__ref.getField(false,"_modalpane")));
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("SetBg (modal) ","modal",14,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "modal","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 46;BA.debugLine="Public Sub SetBg(color As String)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 48;BA.debugLine="ControlsUtils.setPaneBG( ModalPane, color)";
Debug.ShouldStop(32768);
modal._controlsutils.runVoidMethod ("_setpanebg",(Object)(__ref.getField(false,"_modalpane")),(Object)(_color));
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
public static RemoteObject  _setborder(RemoteObject __ref,RemoteObject _color,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("setBorder (modal) ","modal",14,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "modal","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 58;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 60;BA.debugLine="ControlsUtils.setPaneBorder(ModalPane, color, wid";
Debug.ShouldStop(134217728);
modal._controlsutils.runVoidMethod ("_setpaneborder",(Object)(__ref.getField(false,"_modalpane")),(Object)(_color),(Object)(_width));
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("setBorderRadius (modal) ","modal",14,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "modal","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 65;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(1);
 BA.debugLineNum = 67;BA.debugLine="ControlsUtils.setPaneBorderRadius(ModalPane, radi";
Debug.ShouldStop(4);
modal._controlsutils.runVoidMethod ("_setpaneborderradius",(Object)(__ref.getField(false,"_modalpane")),(Object)(_radius));
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("setEffect (modal) ","modal",14,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("seteffect")) { return __ref.runUserSub(false, "modal","seteffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 72;BA.debugLine="Public Sub setEffect(effect As String)";
Debug.ShouldStop(128);
 BA.debugLineNum = 74;BA.debugLine="ControlsUtils.setPaneEffect(ModalPane, effect)";
Debug.ShouldStop(512);
modal._controlsutils.runVoidMethod ("_setpaneeffect",(Object)(__ref.getField(false,"_modalpane")),(Object)(_effect));
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
public static RemoteObject  _setrotationx(RemoteObject __ref,RemoteObject _angle) throws Exception{
try {
		Debug.PushSubsStack("setRotationX (modal) ","modal",14,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("setrotationx")) { return __ref.runUserSub(false, "modal","setrotationx", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 52;BA.debugLine="Public Sub setRotationX(angle As Float)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 54;BA.debugLine="ControlsUtils.setPaneRotationX(ModalPane, angle)";
Debug.ShouldStop(2097152);
modal._controlsutils.runVoidMethod ("_setpanerotationx",(Object)(__ref.getField(false,"_modalpane")),(Object)(_angle));
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
public static RemoteObject  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("show (modal) ","modal",14,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "modal","show", __ref);}
RemoteObject _parent = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
 BA.debugLineNum = 88;BA.debugLine="Public Sub show";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 90;BA.debugLine="Dim Parent As Pane = GetBase.Parent";
Debug.ShouldStop(33554432);
_parent = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_parent.setObject(__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.modal.class, "_getbase").runMethod(false,"getParent").getObject());Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 92;BA.debugLine="ModalBgPane.Visible = True";
Debug.ShouldStop(134217728);
__ref.getField(false,"_modalbgpane").runMethod(true,"setVisible",modal.__c.getField(true,"True"));
 BA.debugLineNum = 93;BA.debugLine="ModalPane.Visible = True";
Debug.ShouldStop(268435456);
__ref.getField(false,"_modalpane").runMethod(true,"setVisible",modal.__c.getField(true,"True"));
 BA.debugLineNum = 95;BA.debugLine="mBase.SetLayoutAnimated(300, 0 , 0,  Parent.Width";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mbase").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_parent.runMethod(true,"getWidth")),(Object)(_parent.runMethod(true,"getHeight")));
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
}