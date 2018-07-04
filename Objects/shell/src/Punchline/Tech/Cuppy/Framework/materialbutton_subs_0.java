package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class materialbutton_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (materialbutton) ","materialbutton",11,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "materialbutton","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 28;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="InnerButton.PrefWidth = Width";
Debug.ShouldStop(536870912);
__ref.getField(false,"_innerbutton").runMethod(true,"setPrefWidth",_width);
 BA.debugLineNum = 31;BA.debugLine="InnerButton.PrefHeight =  Height";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_innerbutton").runMethod(true,"setPrefHeight",_height);
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private fx As JFX";
materialbutton._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",materialbutton._fx);
 //BA.debugLineNum = 9;BA.debugLine="Private mEventName As String 'ignore";
materialbutton._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",materialbutton._meventname);
 //BA.debugLineNum = 10;BA.debugLine="Private mCallBack As Object 'ignore";
materialbutton._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",materialbutton._mcallback);
 //BA.debugLineNum = 11;BA.debugLine="Private mBase As Pane";
materialbutton._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",materialbutton._mbase);
 //BA.debugLineNum = 12;BA.debugLine="Public InnerButton As Button";
materialbutton._innerbutton = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_innerbutton",materialbutton._innerbutton);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (materialbutton) ","materialbutton",11,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "materialbutton","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 20;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="mBase = Base";
Debug.ShouldStop(1048576);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 22;BA.debugLine="mBase.LoadLayout(\"MaterialButtonLayout\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MaterialButtonLayout")));
 BA.debugLineNum = 24;BA.debugLine="SetBg(StyleManager.DefaultTheme.Get(\"accent\"))";
Debug.ShouldStop(8388608);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materialbutton.class, "_setbg",(Object)(BA.ObjectToString(materialbutton._stylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("accent")))))));
 BA.debugLineNum = 25;BA.debugLine="InnerButton.Font = StyleManager.DefaultFont";
Debug.ShouldStop(16777216);
__ref.getField(false,"_innerbutton").runMethod(false,"setFont",materialbutton._stylemanager._defaultfont);
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("GetBase (materialbutton) ","materialbutton",11,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "materialbutton","getbase", __ref);}
 BA.debugLineNum = 35;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Return mBase";
Debug.ShouldStop(8);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Initialize (materialbutton) ","materialbutton",11,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "materialbutton","initialize", __ref, _ba, _callback, _eventname);}
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
public static RemoteObject  _innerbutton_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("InnerButton_MousePressed (materialbutton) ","materialbutton",11,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("innerbutton_mousepressed")) { return __ref.runUserSub(false, "materialbutton","innerbutton_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 84;BA.debugLine="Public Sub InnerButton_MousePressed (EventData As";
Debug.ShouldStop(524288);
 BA.debugLineNum = 86;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MousePr";
Debug.ShouldStop(2097152);
materialbutton.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MousePressed"))),(Object)((_eventdata)));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("removeEffects (materialbutton) ","materialbutton",11,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "materialbutton","removeeffects", __ref);}
 BA.debugLineNum = 75;BA.debugLine="Public Sub removeEffects()";
Debug.ShouldStop(1024);
 BA.debugLineNum = 77;BA.debugLine="ControlsUtils.removeEffect(InnerButton)";
Debug.ShouldStop(4096);
materialbutton._controlsutils.runVoidMethod ("_removeeffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_innerbutton").getObject()));
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
public static RemoteObject  _setbg(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("SetBg (materialbutton) ","materialbutton",11,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "materialbutton","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 43;BA.debugLine="Public Sub SetBg(color As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 45;BA.debugLine="CSSUtils.SetStyleProperty( InnerButton, \"-fx-back";
Debug.ShouldStop(4096);
materialbutton._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerbutton").getObject()),(Object)(BA.ObjectToString("-fx-background-color")),(Object)(_color));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("setBorder (materialbutton) ","materialbutton",11,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "materialbutton","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 55;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 57;BA.debugLine="ControlsUtils.setBorder(InnerButton, color, width";
Debug.ShouldStop(16777216);
materialbutton._controlsutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_innerbutton").getObject()),(Object)(_color),(Object)(_width));
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
public static RemoteObject  _setborderradius(RemoteObject __ref,RemoteObject _radius) throws Exception{
try {
		Debug.PushSubsStack("setBorderRadius (materialbutton) ","materialbutton",11,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "materialbutton","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 62;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 64;BA.debugLine="ControlsUtils.setBorderRadius(InnerButton, radius";
Debug.ShouldStop(-2147483648);
materialbutton._controlsutils.runVoidMethod ("_setborderradius",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_innerbutton").getObject()),(Object)(_radius));
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
public static RemoteObject  _seteffect(RemoteObject __ref,RemoteObject _effect) throws Exception{
try {
		Debug.PushSubsStack("setEffect (materialbutton) ","materialbutton",11,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("seteffect")) { return __ref.runUserSub(false, "materialbutton","seteffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 69;BA.debugLine="Public Sub setEffect(effect As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 71;BA.debugLine="ControlsUtils.setEffect(InnerButton, effect)";
Debug.ShouldStop(64);
materialbutton._controlsutils.runVoidMethod ("_seteffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_innerbutton").getObject()),(Object)(_effect));
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
public static RemoteObject  _setrotationx(RemoteObject __ref,RemoteObject _angle) throws Exception{
try {
		Debug.PushSubsStack("setRotationX (materialbutton) ","materialbutton",11,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("setrotationx")) { return __ref.runUserSub(false, "materialbutton","setrotationx", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 49;BA.debugLine="Public Sub setRotationX(angle As Float)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 51;BA.debugLine="ControlsUtils.setRotationX(InnerButton, angle) 'r";
Debug.ShouldStop(262144);
materialbutton._controlsutils.runVoidMethod ("_setrotationx",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_innerbutton").getObject()),(Object)(_angle));
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