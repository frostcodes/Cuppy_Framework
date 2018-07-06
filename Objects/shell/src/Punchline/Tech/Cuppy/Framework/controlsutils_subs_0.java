package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class controlsutils_subs_0 {


public static RemoteObject  _addcontroltooltip(RemoteObject _controlobj,RemoteObject _msg) throws Exception{
try {
		Debug.PushSubsStack("addControlToolTip (controlsutils) ","controlsutils",16,controlsutils.ba,controlsutils.mostCurrent,138);
if (RapidSub.canDelegate("addcontroltooltip")) { return Punchline.Tech.Cuppy.Framework.controlsutils.remoteMe.runUserSub(false, "controlsutils","addcontroltooltip", _controlobj, _msg);}
RemoteObject _jotooltip = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jotooltip2 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("ControlObj", _controlobj);
Debug.locals.put("msg", _msg);
 BA.debugLineNum = 138;BA.debugLine="Public Sub addControlToolTip(ControlObj As Control";
Debug.ShouldStop(512);
 BA.debugLineNum = 140;BA.debugLine="Dim joToolTip As JavaObject";
Debug.ShouldStop(2048);
_jotooltip = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("joToolTip", _jotooltip);
 BA.debugLineNum = 141;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
Debug.ShouldStop(4096);
_jotooltip2 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jotooltip2 = _jotooltip.runMethod(false,"InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.control.Tooltip")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_msg)})));Debug.locals.put("joToolTip2", _jotooltip2);Debug.locals.put("joToolTip2", _jotooltip2);
 BA.debugLineNum = 142;BA.debugLine="joToolTip.RunMethod(\"install\", Array(ControlOb";
Debug.ShouldStop(8192);
_jotooltip.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("install")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_controlobj.getObject()),(_jotooltip2.getObject())})));
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addimageviewtooltip(RemoteObject _controlobj,RemoteObject _msg) throws Exception{
try {
		Debug.PushSubsStack("addImageViewToolTip (controlsutils) ","controlsutils",16,controlsutils.ba,controlsutils.mostCurrent,114);
if (RapidSub.canDelegate("addimageviewtooltip")) { return Punchline.Tech.Cuppy.Framework.controlsutils.remoteMe.runUserSub(false, "controlsutils","addimageviewtooltip", _controlobj, _msg);}
RemoteObject _jotooltip = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jotooltip2 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("ControlObj", _controlobj);
Debug.locals.put("msg", _msg);
 BA.debugLineNum = 114;BA.debugLine="Public Sub addImageViewToolTip(ControlObj As Image";
Debug.ShouldStop(131072);
 BA.debugLineNum = 116;BA.debugLine="Dim joToolTip As JavaObject";
Debug.ShouldStop(524288);
_jotooltip = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("joToolTip", _jotooltip);
 BA.debugLineNum = 117;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
Debug.ShouldStop(1048576);
_jotooltip2 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jotooltip2 = _jotooltip.runMethod(false,"InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.control.Tooltip")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_msg)})));Debug.locals.put("joToolTip2", _jotooltip2);Debug.locals.put("joToolTip2", _jotooltip2);
 BA.debugLineNum = 119;BA.debugLine="joToolTip.RunMethod(\"install\", Array(ControlObj,";
Debug.ShouldStop(4194304);
_jotooltip.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("install")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_controlobj.getObject()),(_jotooltip2.getObject())})));
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
public static RemoteObject  _addpanetooltip(RemoteObject _panelobj,RemoteObject _msg) throws Exception{
try {
		Debug.PushSubsStack("addPaneToolTip (controlsutils) ","controlsutils",16,controlsutils.ba,controlsutils.mostCurrent,161);
if (RapidSub.canDelegate("addpanetooltip")) { return Punchline.Tech.Cuppy.Framework.controlsutils.remoteMe.runUserSub(false, "controlsutils","addpanetooltip", _panelobj, _msg);}
RemoteObject _jotooltip = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jotooltip2 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("PanelObj", _panelobj);
Debug.locals.put("msg", _msg);
 BA.debugLineNum = 161;BA.debugLine="Public Sub addPaneToolTip(PanelObj As Pane, msg As";
Debug.ShouldStop(1);
 BA.debugLineNum = 163;BA.debugLine="Dim joToolTip As JavaObject";
Debug.ShouldStop(4);
_jotooltip = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("joToolTip", _jotooltip);
 BA.debugLineNum = 164;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
Debug.ShouldStop(8);
_jotooltip2 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jotooltip2 = _jotooltip.runMethod(false,"InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.control.Tooltip")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_msg)})));Debug.locals.put("joToolTip2", _jotooltip2);Debug.locals.put("joToolTip2", _jotooltip2);
 BA.debugLineNum = 165;BA.debugLine="joToolTip.RunMethod(\"install\", Array(PanelObj, jo";
Debug.ShouldStop(16);
_jotooltip.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("install")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_panelobj.getObject()),(_jotooltip2.getObject())})));
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbg(RemoteObject _controlobj) throws Exception{
try {
		Debug.PushSubsStack("getBG (controlsutils) ","controlsutils",16,controlsutils.ba,controlsutils.mostCurrent,103);
if (RapidSub.canDelegate("getbg")) { return Punchline.Tech.Cuppy.Framework.controlsutils.remoteMe.runUserSub(false, "controlsutils","getbg", _controlobj);}
Debug.locals.put("controlObj", _controlobj);
 BA.debugLineNum = 103;BA.debugLine="Public Sub getBG(controlObj As Control) As String";
Debug.ShouldStop(64);
 BA.debugLineNum = 105;BA.debugLine="Return CSSUtils.GetStyleProperty(controlObj, \"-fx";
Debug.ShouldStop(256);
if (true) return controlsutils._cssutils.runMethod(true,"_getstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _controlobj.getObject()),(Object)(RemoteObject.createImmutable("-fx-background-color")));
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
public static RemoteObject  _getpanebg(RemoteObject _paneobj) throws Exception{
try {
		Debug.PushSubsStack("getPaneBG (controlsutils) ","controlsutils",16,controlsutils.ba,controlsutils.mostCurrent,97);
if (RapidSub.canDelegate("getpanebg")) { return Punchline.Tech.Cuppy.Framework.controlsutils.remoteMe.runUserSub(false, "controlsutils","getpanebg", _paneobj);}
Debug.locals.put("PaneObj", _paneobj);
 BA.debugLineNum = 97;BA.debugLine="Public Sub getPaneBG(PaneObj As Pane) As String";
Debug.ShouldStop(1);
 BA.debugLineNum = 99;BA.debugLine="Return CSSUtils.GetStyleProperty(PaneObj, \"-fx-ba";
Debug.ShouldStop(4);
if (true) return controlsutils._cssutils.runMethod(true,"_getstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _paneobj.getObject()),(Object)(RemoteObject.createImmutable("-fx-background-color")));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
controlsutils._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _removecontroltooltip(RemoteObject _controlobj) throws Exception{
try {
		Debug.PushSubsStack("removeControlToolTip (controlsutils) ","controlsutils",16,controlsutils.ba,controlsutils.mostCurrent,149);
if (RapidSub.canDelegate("removecontroltooltip")) { return Punchline.Tech.Cuppy.Framework.controlsutils.remoteMe.runUserSub(false, "controlsutils","removecontroltooltip", _controlobj);}
RemoteObject _jotooltip = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jotooltip2 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("ControlObj", _controlobj);
 BA.debugLineNum = 149;BA.debugLine="Public Sub removeControlToolTip(ControlObj As Cont";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 151;BA.debugLine="Dim joToolTip As JavaObject";
Debug.ShouldStop(4194304);
_jotooltip = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("joToolTip", _jotooltip);
 BA.debugLineNum = 152;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
Debug.ShouldStop(8388608);
_jotooltip2 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jotooltip2 = _jotooltip.runMethod(false,"InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.control.Tooltip")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable(""))})));Debug.locals.put("joToolTip2", _jotooltip2);Debug.locals.put("joToolTip2", _jotooltip2);
 BA.debugLineNum = 154;BA.debugLine="joToolTip.RunMethod(\"uninstall\", Array(ControlObj";
Debug.ShouldStop(33554432);
_jotooltip.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("uninstall")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_controlobj.getObject()),(_jotooltip2.getObject())})));
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeeffect(RemoteObject _controlobj) throws Exception{
try {
		Debug.PushSubsStack("removeEffect (controlsutils) ","controlsutils",16,controlsutils.ba,controlsutils.mostCurrent,62);
if (RapidSub.canDelegate("removeeffect")) { return Punchline.Tech.Cuppy.Framework.controlsutils.remoteMe.runUserSub(false, "controlsutils","removeeffect", _controlobj);}
Debug.locals.put("controlObj", _controlobj);
 BA.debugLineNum = 62;BA.debugLine="Public Sub removeEffect(controlObj As Control)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 64;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-effect";
Debug.ShouldStop(-2147483648);
controlsutils._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _controlobj.getObject()),(Object)(BA.ObjectToString("-fx-effect")),(Object)(RemoteObject.createImmutable("none")));
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
public static RemoteObject  _removeimageviewtooltip(RemoteObject _controlobj) throws Exception{
try {
		Debug.PushSubsStack("removeImageViewToolTip (controlsutils) ","controlsutils",16,controlsutils.ba,controlsutils.mostCurrent,126);
if (RapidSub.canDelegate("removeimageviewtooltip")) { return Punchline.Tech.Cuppy.Framework.controlsutils.remoteMe.runUserSub(false, "controlsutils","removeimageviewtooltip", _controlobj);}
RemoteObject _jotooltip = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jotooltip2 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("ControlObj", _controlobj);
 BA.debugLineNum = 126;BA.debugLine="Public Sub removeImageViewToolTip(ControlObj As Im";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 128;BA.debugLine="Dim joToolTip As JavaObject";
Debug.ShouldStop(-2147483648);
_jotooltip = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("joToolTip", _jotooltip);
 BA.debugLineNum = 129;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initi";
Debug.ShouldStop(1);
_jotooltip2 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jotooltip2 = _jotooltip.runMethod(false,"InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.control.Tooltip")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable(""))})));Debug.locals.put("joToolTip2", _jotooltip2);Debug.locals.put("joToolTip2", _jotooltip2);
 BA.debugLineNum = 131;BA.debugLine="joToolTip.RunMethod(\"uninstall\", Array(ControlOb";
Debug.ShouldStop(4);
_jotooltip.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("uninstall")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_controlobj.getObject()),(_jotooltip2.getObject())})));
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removepaneeffect(RemoteObject _paneobj) throws Exception{
try {
		Debug.PushSubsStack("removePaneEffect (controlsutils) ","controlsutils",16,controlsutils.ba,controlsutils.mostCurrent,56);
if (RapidSub.canDelegate("removepaneeffect")) { return Punchline.Tech.Cuppy.Framework.controlsutils.remoteMe.runUserSub(false, "controlsutils","removepaneeffect", _paneobj);}
Debug.locals.put("PaneObj", _paneobj);
 BA.debugLineNum = 56;BA.debugLine="Public Sub removePaneEffect(PaneObj As Pane)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 58;BA.debugLine="CSSUtils.SetStyleProperty(PaneObj, \"-fx-effect\" ,";
Debug.ShouldStop(33554432);
controlsutils._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _paneobj.getObject()),(Object)(BA.ObjectToString("-fx-effect")),(Object)(RemoteObject.createImmutable("none")));
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
public static RemoteObject  _removepanetooltip(RemoteObject _panelobj) throws Exception{
try {
		Debug.PushSubsStack("removePaneToolTip (controlsutils) ","controlsutils",16,controlsutils.ba,controlsutils.mostCurrent,172);
if (RapidSub.canDelegate("removepanetooltip")) { return Punchline.Tech.Cuppy.Framework.controlsutils.remoteMe.runUserSub(false, "controlsutils","removepanetooltip", _panelobj);}
RemoteObject _jotooltip = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jotooltip2 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("PanelObj", _panelobj);
 BA.debugLineNum = 172;BA.debugLine="Public Sub removePaneToolTip(PanelObj As Pane)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 174;BA.debugLine="Dim joToolTip As JavaObject";
Debug.ShouldStop(8192);
_jotooltip = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("joToolTip", _jotooltip);
 BA.debugLineNum = 175;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
Debug.ShouldStop(16384);
_jotooltip2 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jotooltip2 = _jotooltip.runMethod(false,"InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.control.Tooltip")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable(""))})));Debug.locals.put("joToolTip2", _jotooltip2);Debug.locals.put("joToolTip2", _jotooltip2);
 BA.debugLineNum = 177;BA.debugLine="joToolTip.RunMethod(\"uninstall\", Array(PanelObj,";
Debug.ShouldStop(65536);
_jotooltip.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("uninstall")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_panelobj.getObject()),(_jotooltip2.getObject())})));
 BA.debugLineNum = 179;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbg(RemoteObject _controlobj,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setBG (controlsutils) ","controlsutils",16,controlsutils.ba,controlsutils.mostCurrent,78);
if (RapidSub.canDelegate("setbg")) { return Punchline.Tech.Cuppy.Framework.controlsutils.remoteMe.runUserSub(false, "controlsutils","setbg", _controlobj, _color);}
Debug.locals.put("controlObj", _controlobj);
Debug.locals.put("color", _color);
 BA.debugLineNum = 78;BA.debugLine="Public Sub setBG(controlObj As Control, color As S";
Debug.ShouldStop(8192);
 BA.debugLineNum = 80;BA.debugLine="CSSUtils.SetStyleProperty( controlObj, \"-fx-backg";
Debug.ShouldStop(32768);
controlsutils._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _controlobj.getObject()),(Object)(BA.ObjectToString("-fx-background-color")),(Object)(_color));
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
public static RemoteObject  _setborder(RemoteObject _controlobj,RemoteObject _color,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("setBorder (controlsutils) ","controlsutils",16,controlsutils.ba,controlsutils.mostCurrent,14);
if (RapidSub.canDelegate("setborder")) { return Punchline.Tech.Cuppy.Framework.controlsutils.remoteMe.runUserSub(false, "controlsutils","setborder", _controlobj, _color, _width);}
Debug.locals.put("controlObj", _controlobj);
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 14;BA.debugLine="Public Sub setBorder(controlObj As Control, color";
Debug.ShouldStop(8192);
 BA.debugLineNum = 16;BA.debugLine="CSSUtils.SetStyleProperty( controlObj, \"-fx-borde";
Debug.ShouldStop(32768);
controlsutils._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _controlobj.getObject()),(Object)(BA.ObjectToString("-fx-border-color")),(Object)(_color));
 BA.debugLineNum = 17;BA.debugLine="CSSUtils.SetStyleProperty (controlObj, \"-fx-borde";
Debug.ShouldStop(65536);
controlsutils._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _controlobj.getObject()),(Object)(BA.ObjectToString("-fx-border-width")),(Object)(BA.NumberToString(_width)));
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
public static RemoteObject  _setborderradius(RemoteObject _controlobj,RemoteObject _radius) throws Exception{
try {
		Debug.PushSubsStack("setBorderRadius (controlsutils) ","controlsutils",16,controlsutils.ba,controlsutils.mostCurrent,35);
if (RapidSub.canDelegate("setborderradius")) { return Punchline.Tech.Cuppy.Framework.controlsutils.remoteMe.runUserSub(false, "controlsutils","setborderradius", _controlobj, _radius);}
Debug.locals.put("controlObj", _controlobj);
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 35;BA.debugLine="Public Sub setBorderRadius(controlObj As Control,";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-border";
Debug.ShouldStop(16);
controlsutils._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _controlobj.getObject()),(Object)(BA.ObjectToString("-fx-border-radius")),(Object)(BA.NumberToString(_radius)));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seteffect(RemoteObject _controlobj,RemoteObject _effect) throws Exception{
try {
		Debug.PushSubsStack("setEffect (controlsutils) ","controlsutils",16,controlsutils.ba,controlsutils.mostCurrent,47);
if (RapidSub.canDelegate("seteffect")) { return Punchline.Tech.Cuppy.Framework.controlsutils.remoteMe.runUserSub(false, "controlsutils","seteffect", _controlobj, _effect);}
Debug.locals.put("controlObj", _controlobj);
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 47;BA.debugLine="Public Sub setEffect(controlObj As Control, effect";
Debug.ShouldStop(16384);
 BA.debugLineNum = 49;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-effect";
Debug.ShouldStop(65536);
controlsutils._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _controlobj.getObject()),(Object)(BA.ObjectToString("-fx-effect")),(Object)(_effect));
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
public static RemoteObject  _setpanebg(RemoteObject _paneobj,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setPaneBG (controlsutils) ","controlsutils",16,controlsutils.ba,controlsutils.mostCurrent,71);
if (RapidSub.canDelegate("setpanebg")) { return Punchline.Tech.Cuppy.Framework.controlsutils.remoteMe.runUserSub(false, "controlsutils","setpanebg", _paneobj, _color);}
Debug.locals.put("PaneObj", _paneobj);
Debug.locals.put("color", _color);
 BA.debugLineNum = 71;BA.debugLine="Public Sub setPaneBG(PaneObj As Pane, color As Str";
Debug.ShouldStop(64);
 BA.debugLineNum = 73;BA.debugLine="CSSUtils.SetStyleProperty( PaneObj, \"-fx-backgrou";
Debug.ShouldStop(256);
controlsutils._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _paneobj.getObject()),(Object)(BA.ObjectToString("-fx-background-color")),(Object)(_color));
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
public static RemoteObject  _setpaneborder(RemoteObject _paneobj,RemoteObject _color,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("setPaneBorder (controlsutils) ","controlsutils",16,controlsutils.ba,controlsutils.mostCurrent,21);
if (RapidSub.canDelegate("setpaneborder")) { return Punchline.Tech.Cuppy.Framework.controlsutils.remoteMe.runUserSub(false, "controlsutils","setpaneborder", _paneobj, _color, _width);}
Debug.locals.put("PaneObj", _paneobj);
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 21;BA.debugLine="Public Sub setPaneBorder(PaneObj As Pane, color As";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 23;BA.debugLine="CSSUtils.SetStyleProperty( PaneObj, \"-fx-border-c";
Debug.ShouldStop(4194304);
controlsutils._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _paneobj.getObject()),(Object)(BA.ObjectToString("-fx-border-color")),(Object)(_color));
 BA.debugLineNum = 24;BA.debugLine="CSSUtils.SetStyleProperty (PaneObj, \"-fx-border-w";
Debug.ShouldStop(8388608);
controlsutils._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _paneobj.getObject()),(Object)(BA.ObjectToString("-fx-border-width")),(Object)(BA.NumberToString(_width)));
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
public static RemoteObject  _setpaneborderradius(RemoteObject _paneobj,RemoteObject _radius) throws Exception{
try {
		Debug.PushSubsStack("setPaneBorderRadius (controlsutils) ","controlsutils",16,controlsutils.ba,controlsutils.mostCurrent,28);
if (RapidSub.canDelegate("setpaneborderradius")) { return Punchline.Tech.Cuppy.Framework.controlsutils.remoteMe.runUserSub(false, "controlsutils","setpaneborderradius", _paneobj, _radius);}
Debug.locals.put("PaneObj", _paneobj);
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 28;BA.debugLine="Public Sub setPaneBorderRadius(PaneObj As Pane, ra";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="CSSUtils.SetStyleProperty(PaneObj,\"-fx-border-rad";
Debug.ShouldStop(536870912);
controlsutils._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _paneobj.getObject()),(Object)(BA.ObjectToString("-fx-border-radius")),(Object)(BA.NumberToString(_radius)));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpaneeffect(RemoteObject _paneobj,RemoteObject _effect) throws Exception{
try {
		Debug.PushSubsStack("setPaneEffect (controlsutils) ","controlsutils",16,controlsutils.ba,controlsutils.mostCurrent,41);
if (RapidSub.canDelegate("setpaneeffect")) { return Punchline.Tech.Cuppy.Framework.controlsutils.remoteMe.runUserSub(false, "controlsutils","setpaneeffect", _paneobj, _effect);}
Debug.locals.put("PaneObj", _paneobj);
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 41;BA.debugLine="Public Sub setPaneEffect(PaneObj As Pane, effect A";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="CSSUtils.SetStyleProperty(PaneObj, \"-fx-effect\" ,";
Debug.ShouldStop(1024);
controlsutils._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _paneobj.getObject()),(Object)(BA.ObjectToString("-fx-effect")),(Object)(_effect));
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
public static RemoteObject  _setpanerotationx(RemoteObject _paneobj,RemoteObject _angle) throws Exception{
try {
		Debug.PushSubsStack("setPaneRotationX (controlsutils) ","controlsutils",16,controlsutils.ba,controlsutils.mostCurrent,10);
if (RapidSub.canDelegate("setpanerotationx")) { return Punchline.Tech.Cuppy.Framework.controlsutils.remoteMe.runUserSub(false, "controlsutils","setpanerotationx", _paneobj, _angle);}
Debug.locals.put("PaneObj", _paneobj);
Debug.locals.put("Angle", _angle);
 BA.debugLineNum = 10;BA.debugLine="Public Sub setPaneRotationX(PaneObj As Pane, Angle";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="CSSUtils.SetStyleProperty(PaneObj, \"-fx-rotate\",";
Debug.ShouldStop(1024);
controlsutils._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _paneobj.getObject()),(Object)(BA.ObjectToString("-fx-rotate")),(Object)(BA.NumberToString(_angle)));
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrotationx(RemoteObject _controlobj,RemoteObject _angle) throws Exception{
try {
		Debug.PushSubsStack("setRotationX (controlsutils) ","controlsutils",16,controlsutils.ba,controlsutils.mostCurrent,6);
if (RapidSub.canDelegate("setrotationx")) { return Punchline.Tech.Cuppy.Framework.controlsutils.remoteMe.runUserSub(false, "controlsutils","setrotationx", _controlobj, _angle);}
Debug.locals.put("controlObj", _controlobj);
Debug.locals.put("Angle", _angle);
 BA.debugLineNum = 6;BA.debugLine="Public Sub setRotationX(controlObj As Control, Ang";
Debug.ShouldStop(32);
 BA.debugLineNum = 7;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-rotate";
Debug.ShouldStop(64);
controlsutils._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _controlobj.getObject()),(Object)(BA.ObjectToString("-fx-rotate")),(Object)(BA.NumberToString(_angle)));
 BA.debugLineNum = 8;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextcolor(RemoteObject _controlobj,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setTextColor (controlsutils) ","controlsutils",16,controlsutils.ba,controlsutils.mostCurrent,85);
if (RapidSub.canDelegate("settextcolor")) { return Punchline.Tech.Cuppy.Framework.controlsutils.remoteMe.runUserSub(false, "controlsutils","settextcolor", _controlobj, _color);}
Debug.locals.put("controlObj", _controlobj);
Debug.locals.put("color", _color);
 BA.debugLineNum = 85;BA.debugLine="Public Sub setTextColor(controlObj As Control, col";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 87;BA.debugLine="CSSUtils.SetStyleProperty(controlObj,\"-fx-text-fi";
Debug.ShouldStop(4194304);
controlsutils._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _controlobj.getObject()),(Object)(BA.ObjectToString("-fx-text-fill")),(Object)(_color));
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
}