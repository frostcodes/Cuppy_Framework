package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class materiallabel_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (materiallabel) ","materiallabel",10,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "materiallabel","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 30;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 32;BA.debugLine="InnerLabel.PrefWidth = Width";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_innerlabel").runMethod(true,"setPrefWidth",_width);
 BA.debugLineNum = 33;BA.debugLine="InnerLabel.PrefHeight =  Height";
Debug.ShouldStop(1);
__ref.getField(false,"_innerlabel").runMethod(true,"setPrefHeight",_height);
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
materiallabel._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",materiallabel._fx);
 //BA.debugLineNum = 9;BA.debugLine="Private mEventName As String 'ignore";
materiallabel._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",materiallabel._meventname);
 //BA.debugLineNum = 10;BA.debugLine="Private mCallBack As Object 'ignore";
materiallabel._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",materiallabel._mcallback);
 //BA.debugLineNum = 11;BA.debugLine="Private mBase As Pane";
materiallabel._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",materiallabel._mbase);
 //BA.debugLineNum = 12;BA.debugLine="Public InnerLabel As Label";
materiallabel._innerlabel = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_innerlabel",materiallabel._innerlabel);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (materiallabel) ","materiallabel",10,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "materiallabel","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 20;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="mBase = Base";
Debug.ShouldStop(1048576);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 22;BA.debugLine="mBase.LoadLayout(\"MaterialLabelLayout\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MaterialLabelLayout")));
 BA.debugLineNum = 25;BA.debugLine="setTextColor(StyleManager.DefaultTheme.Get(\"prima";
Debug.ShouldStop(16777216);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materiallabel.class, "_settextcolor",(Object)(BA.ObjectToString(materiallabel._stylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("primary_text")))))));
 BA.debugLineNum = 26;BA.debugLine="InnerLabel.Font = StyleManager.SelectFont(\"Light\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_innerlabel").runMethod(false,"setFont",materiallabel._stylemanager.runMethod(false,"_selectfont",(Object)(BA.ObjectToString("Light")),(Object)(BA.numberCast(double.class, 12))));
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
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (materiallabel) ","materiallabel",10,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "materiallabel","getbase", __ref);}
 BA.debugLineNum = 37;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="Return mBase";
Debug.ShouldStop(32);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Initialize (materiallabel) ","materiallabel",10,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "materiallabel","initialize", __ref, _ba, _callback, _eventname);}
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
public static RemoteObject  _innerlabel_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("InnerLabel_MousePressed (materiallabel) ","materiallabel",10,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("innerlabel_mousepressed")) { return __ref.runUserSub(false, "materiallabel","innerlabel_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 92;BA.debugLine="Public Sub InnerLabel_MousePressed (EventData As M";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 94;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MousePr";
Debug.ShouldStop(536870912);
materiallabel.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MousePressed"))),(Object)((_eventdata)));
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("removeEffects (materiallabel) ","materiallabel",10,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "materiallabel","removeeffects", __ref);}
 BA.debugLineNum = 83;BA.debugLine="Public Sub removeEffects()";
Debug.ShouldStop(262144);
 BA.debugLineNum = 85;BA.debugLine="ControlsUtils.removeEffect(InnerLabel)";
Debug.ShouldStop(1048576);
materiallabel._controlsutils.runVoidMethod ("_removeeffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_innerlabel").getObject()));
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
public static RemoteObject  _setbg(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("SetBg (materiallabel) ","materiallabel",10,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "materiallabel","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 45;BA.debugLine="Public Sub SetBg(color As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 47;BA.debugLine="ControlsUtils.SetBg( InnerLabel, color)";
Debug.ShouldStop(16384);
materiallabel._controlsutils.runVoidMethod ("_setbg",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_innerlabel").getObject()),(Object)(_color));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("setBorder (materiallabel) ","materiallabel",10,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "materiallabel","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 63;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 65;BA.debugLine="ControlsUtils.setBorder(InnerLabel, color, width)";
Debug.ShouldStop(1);
materiallabel._controlsutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_innerlabel").getObject()),(Object)(_color),(Object)(_width));
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
		Debug.PushSubsStack("setBorderRadius (materiallabel) ","materiallabel",10,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "materiallabel","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 70;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(32);
 BA.debugLineNum = 72;BA.debugLine="ControlsUtils.setBorderRadius(InnerLabel, radius)";
Debug.ShouldStop(128);
materiallabel._controlsutils.runVoidMethod ("_setborderradius",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_innerlabel").getObject()),(Object)(_radius));
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
public static RemoteObject  _seteffect(RemoteObject __ref,RemoteObject _effect) throws Exception{
try {
		Debug.PushSubsStack("setEffect (materiallabel) ","materiallabel",10,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("seteffect")) { return __ref.runUserSub(false, "materiallabel","seteffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 77;BA.debugLine="Public Sub setEffect(effect As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 79;BA.debugLine="ControlsUtils.setEffect(InnerLabel, effect)";
Debug.ShouldStop(16384);
materiallabel._controlsutils.runVoidMethod ("_seteffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_innerlabel").getObject()),(Object)(_effect));
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
public static RemoteObject  _setrotationx(RemoteObject __ref,RemoteObject _angle) throws Exception{
try {
		Debug.PushSubsStack("setRotationX (materiallabel) ","materiallabel",10,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("setrotationx")) { return __ref.runUserSub(false, "materiallabel","setrotationx", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 57;BA.debugLine="Public Sub setRotationX(angle As Float)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 59;BA.debugLine="ControlsUtils.setRotationX(InnerLabel, angle) 'ro";
Debug.ShouldStop(67108864);
materiallabel._controlsutils.runVoidMethod ("_setrotationx",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_innerlabel").getObject()),(Object)(_angle));
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
public static RemoteObject  _settextcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setTextColor (materiallabel) ","materiallabel",10,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("settextcolor")) { return __ref.runUserSub(false, "materiallabel","settextcolor", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 51;BA.debugLine="Public Sub setTextColor(color As String)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 53;BA.debugLine="ControlsUtils.setTextColor (InnerLabel, color)";
Debug.ShouldStop(1048576);
materiallabel._controlsutils.runVoidMethod ("_settextcolor",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), __ref.getField(false,"_innerlabel").getObject()),(Object)(_color));
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
}