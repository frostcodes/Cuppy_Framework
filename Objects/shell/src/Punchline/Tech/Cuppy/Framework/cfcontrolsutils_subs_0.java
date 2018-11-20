package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cfcontrolsutils_subs_0 {


public static RemoteObject  _addcontroltooltip(RemoteObject _controlobj,RemoteObject _msg) throws Exception{
try {
		Debug.PushSubsStack("AddControlToolTip (cfcontrolsutils) ","cfcontrolsutils",12,cfcontrolsutils.ba,cfcontrolsutils.mostCurrent,99);
if (RapidSub.canDelegate("addcontroltooltip")) { return Punchline.Tech.Cuppy.Framework.cfcontrolsutils.remoteMe.runUserSub(false, "cfcontrolsutils","addcontroltooltip", _controlobj, _msg);}
RemoteObject _jotooltip = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jotooltip2 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("ControlObj", _controlobj);
Debug.locals.put("msg", _msg);
 BA.debugLineNum = 99;BA.debugLine="Public Sub AddControlToolTip(ControlObj As Node, m";
Debug.ShouldStop(4);
 BA.debugLineNum = 101;BA.debugLine="Dim joToolTip As JavaObject";
Debug.ShouldStop(16);
_jotooltip = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("joToolTip", _jotooltip);
 BA.debugLineNum = 102;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
Debug.ShouldStop(32);
_jotooltip2 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jotooltip2 = _jotooltip.runMethod(false,"InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.control.Tooltip")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_msg)})));Debug.locals.put("joToolTip2", _jotooltip2);Debug.locals.put("joToolTip2", _jotooltip2);
 BA.debugLineNum = 103;BA.debugLine="joToolTip.RunMethod(\"install\", Array(ControlObj,";
Debug.ShouldStop(64);
_jotooltip.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("install")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_controlobj.getObject()),(_jotooltip2.getObject())})));
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
public static RemoteObject  _addimageviewtooltip(RemoteObject _controlobj,RemoteObject _msg) throws Exception{
try {
		Debug.PushSubsStack("AddImageViewToolTip (cfcontrolsutils) ","cfcontrolsutils",12,cfcontrolsutils.ba,cfcontrolsutils.mostCurrent,76);
if (RapidSub.canDelegate("addimageviewtooltip")) { return Punchline.Tech.Cuppy.Framework.cfcontrolsutils.remoteMe.runUserSub(false, "cfcontrolsutils","addimageviewtooltip", _controlobj, _msg);}
RemoteObject _jotooltip = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jotooltip2 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("ControlObj", _controlobj);
Debug.locals.put("msg", _msg);
 BA.debugLineNum = 76;BA.debugLine="Public Sub AddImageViewToolTip(ControlObj As Image";
Debug.ShouldStop(2048);
 BA.debugLineNum = 78;BA.debugLine="Dim joToolTip As JavaObject";
Debug.ShouldStop(8192);
_jotooltip = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("joToolTip", _jotooltip);
 BA.debugLineNum = 79;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
Debug.ShouldStop(16384);
_jotooltip2 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jotooltip2 = _jotooltip.runMethod(false,"InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.control.Tooltip")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_msg)})));Debug.locals.put("joToolTip2", _jotooltip2);Debug.locals.put("joToolTip2", _jotooltip2);
 BA.debugLineNum = 81;BA.debugLine="joToolTip.RunMethod(\"install\", Array(ControlObj,";
Debug.ShouldStop(65536);
_jotooltip.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("install")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_controlobj.getObject()),(_jotooltip2.getObject())})));
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
public static RemoteObject  _addpanetooltip(RemoteObject _panelobj,RemoteObject _msg) throws Exception{
try {
		Debug.PushSubsStack("AddPaneToolTip (cfcontrolsutils) ","cfcontrolsutils",12,cfcontrolsutils.ba,cfcontrolsutils.mostCurrent,122);
if (RapidSub.canDelegate("addpanetooltip")) { return Punchline.Tech.Cuppy.Framework.cfcontrolsutils.remoteMe.runUserSub(false, "cfcontrolsutils","addpanetooltip", _panelobj, _msg);}
RemoteObject _jotooltip = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jotooltip2 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("PanelObj", _panelobj);
Debug.locals.put("msg", _msg);
 BA.debugLineNum = 122;BA.debugLine="Public Sub AddPaneToolTip(PanelObj As Pane, msg As";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 124;BA.debugLine="Dim joToolTip As JavaObject";
Debug.ShouldStop(134217728);
_jotooltip = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("joToolTip", _jotooltip);
 BA.debugLineNum = 125;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
Debug.ShouldStop(268435456);
_jotooltip2 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jotooltip2 = _jotooltip.runMethod(false,"InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.control.Tooltip")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_msg)})));Debug.locals.put("joToolTip2", _jotooltip2);Debug.locals.put("joToolTip2", _jotooltip2);
 BA.debugLineNum = 126;BA.debugLine="joToolTip.RunMethod(\"install\", Array(PanelObj, jo";
Debug.ShouldStop(536870912);
_jotooltip.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("install")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_panelobj.getObject()),(_jotooltip2.getObject())})));
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _configuretooltip(RemoteObject _opendelay,RemoteObject _visibleduration,RemoteObject _closedelay) throws Exception{
try {
		Debug.PushSubsStack("ConfigureTooltip (cfcontrolsutils) ","cfcontrolsutils",12,cfcontrolsutils.ba,cfcontrolsutils.mostCurrent,161);
if (RapidSub.canDelegate("configuretooltip")) { return Punchline.Tech.Cuppy.Framework.cfcontrolsutils.remoteMe.runUserSub(false, "cfcontrolsutils","configuretooltip", _opendelay, _visibleduration, _closedelay);}
RemoteObject _mejo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _classshortname = RemoteObject.createImmutable("");
RemoteObject _modjo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("OpenDelay", _opendelay);
Debug.locals.put("VisibleDuration", _visibleduration);
Debug.locals.put("CloseDelay", _closedelay);
 BA.debugLineNum = 161;BA.debugLine="Public Sub ConfigureTooltip(OpenDelay As Long,Visi";
Debug.ShouldStop(1);
 BA.debugLineNum = 163;BA.debugLine="Dim MEJO As JavaObject = Me";
Debug.ShouldStop(4);
_mejo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_mejo.setObject(cfcontrolsutils.getObject());Debug.locals.put("MEJO", _mejo);
 BA.debugLineNum = 164;BA.debugLine="Dim ClassShortName As String = MEJO.RunMethod(\"to";
Debug.ShouldStop(8);
_classshortname = BA.ObjectToString(_mejo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("toString")),(Object)((cfcontrolsutils.__c.getField(false,"Null")))));Debug.locals.put("ClassShortName", _classshortname);Debug.locals.put("ClassShortName", _classshortname);
 BA.debugLineNum = 165;BA.debugLine="ClassShortName = ClassShortName.SubString(ClassSh";
Debug.ShouldStop(16);
_classshortname = _classshortname.runMethod(true,"substring",(Object)(_classshortname.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable(".")))));Debug.locals.put("ClassShortName", _classshortname);
 BA.debugLineNum = 166;BA.debugLine="Dim ModJO As JavaObject";
Debug.ShouldStop(32);
_modjo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("ModJO", _modjo);
 BA.debugLineNum = 167;BA.debugLine="ModJO.InitializeStatic(CFAppUtility.GetPackageNam";
Debug.ShouldStop(64);
_modjo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.concat(cfcontrolsutils._cfapputility.runMethod(true,"_getpackagename",(Object)(cfcontrolsutils.getObject())),_classshortname)));
 BA.debugLineNum = 169;BA.debugLine="If ModJO.RunMethod(\"setTooltipTimers\",Array(OpenD";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_modjo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("setTooltipTimers")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_opendelay),(_visibleduration),(_closedelay)}))),(cfcontrolsutils.__c.getField(true,"False")))) { 
 BA.debugLineNum = 170;BA.debugLine="Log($\"*******${CRLF}Tooltip Configuration failed";
Debug.ShouldStop(512);
cfcontrolsutils.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("*******"),cfcontrolsutils.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((cfcontrolsutils.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("Tooltip Configuration failed"),cfcontrolsutils.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((cfcontrolsutils.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("*******")))));
 };
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
public static RemoteObject  _getbg(RemoteObject _controlobj) throws Exception{
try {
		Debug.PushSubsStack("GetBG (cfcontrolsutils) ","cfcontrolsutils",12,cfcontrolsutils.ba,cfcontrolsutils.mostCurrent,65);
if (RapidSub.canDelegate("getbg")) { return Punchline.Tech.Cuppy.Framework.cfcontrolsutils.remoteMe.runUserSub(false, "cfcontrolsutils","getbg", _controlobj);}
Debug.locals.put("controlObj", _controlobj);
 BA.debugLineNum = 65;BA.debugLine="Public Sub GetBG(controlObj As Node) As String";
Debug.ShouldStop(1);
 BA.debugLineNum = 67;BA.debugLine="Return CSSUtils.GetStyleProperty(controlObj, \"-fx";
Debug.ShouldStop(4);
if (true) return cfcontrolsutils._cssutils.runMethod(true,"_getstyleproperty",(Object)(_controlobj),(Object)(RemoteObject.createImmutable("-fx-background-color")));
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
cfcontrolsutils._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _removecontroltooltip(RemoteObject _controlobj) throws Exception{
try {
		Debug.PushSubsStack("RemoveControlToolTip (cfcontrolsutils) ","cfcontrolsutils",12,cfcontrolsutils.ba,cfcontrolsutils.mostCurrent,110);
if (RapidSub.canDelegate("removecontroltooltip")) { return Punchline.Tech.Cuppy.Framework.cfcontrolsutils.remoteMe.runUserSub(false, "cfcontrolsutils","removecontroltooltip", _controlobj);}
RemoteObject _jotooltip = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jotooltip2 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("ControlObj", _controlobj);
 BA.debugLineNum = 110;BA.debugLine="Public Sub RemoveControlToolTip(ControlObj As Node";
Debug.ShouldStop(8192);
 BA.debugLineNum = 112;BA.debugLine="Dim joToolTip As JavaObject";
Debug.ShouldStop(32768);
_jotooltip = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("joToolTip", _jotooltip);
 BA.debugLineNum = 113;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
Debug.ShouldStop(65536);
_jotooltip2 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jotooltip2 = _jotooltip.runMethod(false,"InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.control.Tooltip")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable(""))})));Debug.locals.put("joToolTip2", _jotooltip2);Debug.locals.put("joToolTip2", _jotooltip2);
 BA.debugLineNum = 115;BA.debugLine="joToolTip.RunMethod(\"uninstall\", Array(ControlObj";
Debug.ShouldStop(262144);
_jotooltip.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("uninstall")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_controlobj.getObject()),(_jotooltip2.getObject())})));
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("RemoveEffect (cfcontrolsutils) ","cfcontrolsutils",12,cfcontrolsutils.ba,cfcontrolsutils.mostCurrent,36);
if (RapidSub.canDelegate("removeeffect")) { return Punchline.Tech.Cuppy.Framework.cfcontrolsutils.remoteMe.runUserSub(false, "cfcontrolsutils","removeeffect", _controlobj);}
Debug.locals.put("controlObj", _controlobj);
 BA.debugLineNum = 36;BA.debugLine="Public Sub RemoveEffect(controlObj As Node)";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-effect";
Debug.ShouldStop(32);
cfcontrolsutils._cssutils.runVoidMethod ("_setstyleproperty",(Object)(_controlobj),(Object)(BA.ObjectToString("-fx-effect")),(Object)(RemoteObject.createImmutable("none")));
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
public static RemoteObject  _removeimageviewtooltip(RemoteObject _controlobj) throws Exception{
try {
		Debug.PushSubsStack("RemoveImageViewToolTip (cfcontrolsutils) ","cfcontrolsutils",12,cfcontrolsutils.ba,cfcontrolsutils.mostCurrent,88);
if (RapidSub.canDelegate("removeimageviewtooltip")) { return Punchline.Tech.Cuppy.Framework.cfcontrolsutils.remoteMe.runUserSub(false, "cfcontrolsutils","removeimageviewtooltip", _controlobj);}
RemoteObject _jotooltip = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jotooltip2 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("ControlObj", _controlobj);
 BA.debugLineNum = 88;BA.debugLine="Public Sub RemoveImageViewToolTip(ControlObj As Im";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 90;BA.debugLine="Dim joToolTip As JavaObject";
Debug.ShouldStop(33554432);
_jotooltip = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("joToolTip", _jotooltip);
 BA.debugLineNum = 91;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initi";
Debug.ShouldStop(67108864);
_jotooltip2 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jotooltip2 = _jotooltip.runMethod(false,"InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.control.Tooltip")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable(""))})));Debug.locals.put("joToolTip2", _jotooltip2);Debug.locals.put("joToolTip2", _jotooltip2);
 BA.debugLineNum = 92;BA.debugLine="joToolTip.RunMethod(\"uninstall\", Array(ControlObj";
Debug.ShouldStop(134217728);
_jotooltip.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("uninstall")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_controlobj.getObject()),(_jotooltip2.getObject())})));
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("RemovePaneToolTip (cfcontrolsutils) ","cfcontrolsutils",12,cfcontrolsutils.ba,cfcontrolsutils.mostCurrent,133);
if (RapidSub.canDelegate("removepanetooltip")) { return Punchline.Tech.Cuppy.Framework.cfcontrolsutils.remoteMe.runUserSub(false, "cfcontrolsutils","removepanetooltip", _panelobj);}
RemoteObject _jotooltip = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jotooltip2 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("PanelObj", _panelobj);
 BA.debugLineNum = 133;BA.debugLine="Public Sub RemovePaneToolTip(PanelObj As Pane)";
Debug.ShouldStop(16);
 BA.debugLineNum = 135;BA.debugLine="Dim joToolTip As JavaObject";
Debug.ShouldStop(64);
_jotooltip = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("joToolTip", _jotooltip);
 BA.debugLineNum = 136;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
Debug.ShouldStop(128);
_jotooltip2 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jotooltip2 = _jotooltip.runMethod(false,"InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.control.Tooltip")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable(""))})));Debug.locals.put("joToolTip2", _jotooltip2);Debug.locals.put("joToolTip2", _jotooltip2);
 BA.debugLineNum = 138;BA.debugLine="joToolTip.RunMethod(\"uninstall\", Array(PanelObj,";
Debug.ShouldStop(512);
_jotooltip.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("uninstall")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_panelobj.getObject()),(_jotooltip2.getObject())})));
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("setBG (cfcontrolsutils) ","cfcontrolsutils",12,cfcontrolsutils.ba,cfcontrolsutils.mostCurrent,43);
if (RapidSub.canDelegate("setbg")) { return Punchline.Tech.Cuppy.Framework.cfcontrolsutils.remoteMe.runUserSub(false, "cfcontrolsutils","setbg", _controlobj, _color);}
Debug.locals.put("controlObj", _controlobj);
Debug.locals.put("color", _color);
 BA.debugLineNum = 43;BA.debugLine="Public Sub setBG(controlObj As Node, color As Stri";
Debug.ShouldStop(1024);
 BA.debugLineNum = 45;BA.debugLine="CSSUtils.SetStyleProperty( controlObj, \"-fx-backg";
Debug.ShouldStop(4096);
cfcontrolsutils._cssutils.runVoidMethod ("_setstyleproperty",(Object)(_controlobj),(Object)(BA.ObjectToString("-fx-background-color")),(Object)(_color));
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
public static RemoteObject  _setborder(RemoteObject _controlobj,RemoteObject _color,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("setBorder (cfcontrolsutils) ","cfcontrolsutils",12,cfcontrolsutils.ba,cfcontrolsutils.mostCurrent,14);
if (RapidSub.canDelegate("setborder")) { return Punchline.Tech.Cuppy.Framework.cfcontrolsutils.remoteMe.runUserSub(false, "cfcontrolsutils","setborder", _controlobj, _color, _width);}
Debug.locals.put("controlObj", _controlobj);
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 14;BA.debugLine="Public Sub setBorder(controlObj As Node, color As";
Debug.ShouldStop(8192);
 BA.debugLineNum = 16;BA.debugLine="CSSUtils.SetStyleProperty( controlObj, \"-fx-borde";
Debug.ShouldStop(32768);
cfcontrolsutils._cssutils.runVoidMethod ("_setstyleproperty",(Object)(_controlobj),(Object)(BA.ObjectToString("-fx-border-color")),(Object)(_color));
 BA.debugLineNum = 17;BA.debugLine="CSSUtils.SetStyleProperty (controlObj, \"-fx-borde";
Debug.ShouldStop(65536);
cfcontrolsutils._cssutils.runVoidMethod ("_setstyleproperty",(Object)(_controlobj),(Object)(BA.ObjectToString("-fx-border-width")),(Object)(BA.NumberToString(_width)));
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
		Debug.PushSubsStack("setBorderRadius (cfcontrolsutils) ","cfcontrolsutils",12,cfcontrolsutils.ba,cfcontrolsutils.mostCurrent,22);
if (RapidSub.canDelegate("setborderradius")) { return Punchline.Tech.Cuppy.Framework.cfcontrolsutils.remoteMe.runUserSub(false, "cfcontrolsutils","setborderradius", _controlobj, _radius);}
Debug.locals.put("controlObj", _controlobj);
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 22;BA.debugLine="Public Sub setBorderRadius(controlObj As Node, rad";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 24;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-border";
Debug.ShouldStop(8388608);
cfcontrolsutils._cssutils.runVoidMethod ("_setstyleproperty",(Object)(_controlobj),(Object)(BA.ObjectToString("-fx-border-radius")),(Object)(BA.NumberToString(_radius)));
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
public static RemoteObject  _seteffect(RemoteObject _controlobj,RemoteObject _effect) throws Exception{
try {
		Debug.PushSubsStack("setEffect (cfcontrolsutils) ","cfcontrolsutils",12,cfcontrolsutils.ba,cfcontrolsutils.mostCurrent,29);
if (RapidSub.canDelegate("seteffect")) { return Punchline.Tech.Cuppy.Framework.cfcontrolsutils.remoteMe.runUserSub(false, "cfcontrolsutils","seteffect", _controlobj, _effect);}
Debug.locals.put("controlObj", _controlobj);
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 29;BA.debugLine="Public Sub setEffect(controlObj As Node, effect As";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-effect";
Debug.ShouldStop(1073741824);
cfcontrolsutils._cssutils.runVoidMethod ("_setstyleproperty",(Object)(_controlobj),(Object)(BA.ObjectToString("-fx-effect")),(Object)(_effect));
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
public static RemoteObject  _setrotation(RemoteObject _controlobj,RemoteObject _angle) throws Exception{
try {
		Debug.PushSubsStack("setRotation (cfcontrolsutils) ","cfcontrolsutils",12,cfcontrolsutils.ba,cfcontrolsutils.mostCurrent,7);
if (RapidSub.canDelegate("setrotation")) { return Punchline.Tech.Cuppy.Framework.cfcontrolsutils.remoteMe.runUserSub(false, "cfcontrolsutils","setrotation", _controlobj, _angle);}
Debug.locals.put("controlObj", _controlobj);
Debug.locals.put("Angle", _angle);
 BA.debugLineNum = 7;BA.debugLine="Public Sub setRotation(controlObj As Node, Angle A";
Debug.ShouldStop(64);
 BA.debugLineNum = 9;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-rotate";
Debug.ShouldStop(256);
cfcontrolsutils._cssutils.runVoidMethod ("_setstyleproperty",(Object)(_controlobj),(Object)(BA.ObjectToString("-fx-rotate")),(Object)(BA.NumberToString(_angle)));
 BA.debugLineNum = 11;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("setTextColor (cfcontrolsutils) ","cfcontrolsutils",12,cfcontrolsutils.ba,cfcontrolsutils.mostCurrent,50);
if (RapidSub.canDelegate("settextcolor")) { return Punchline.Tech.Cuppy.Framework.cfcontrolsutils.remoteMe.runUserSub(false, "cfcontrolsutils","settextcolor", _controlobj, _color);}
Debug.locals.put("controlObj", _controlobj);
Debug.locals.put("color", _color);
 BA.debugLineNum = 50;BA.debugLine="Public Sub setTextColor(controlObj As Node, color";
Debug.ShouldStop(131072);
 BA.debugLineNum = 52;BA.debugLine="CSSUtils.SetStyleProperty(controlObj,\"-fx-text-fi";
Debug.ShouldStop(524288);
cfcontrolsutils._cssutils.runVoidMethod ("_setstyleproperty",(Object)(_controlobj),(Object)(BA.ObjectToString("-fx-text-fill")),(Object)(_color));
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