package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cfmaterialdivider_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (cfmaterialdivider) ","cfmaterialdivider",11,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "cfmaterialdivider","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 40;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(128);
 BA.debugLineNum = 42;BA.debugLine="line.PrefWidth = Width";
Debug.ShouldStop(512);
__ref.getField(false,"_line").runMethod(true,"setPrefWidth",_width);
 BA.debugLineNum = 43;BA.debugLine="line.PrefHeight = Height";
Debug.ShouldStop(1024);
__ref.getField(false,"_line").runMethod(true,"setPrefHeight",_height);
 BA.debugLineNum = 45;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize";
Debug.ShouldStop(4096);
cfmaterialdivider.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_Resize"))),(Object)((_width)),(Object)((_height)));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private fx As JFX";
cfmaterialdivider._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cfmaterialdivider._fx);
 //BA.debugLineNum = 13;BA.debugLine="Private mEventName As String 'ignore";
cfmaterialdivider._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",cfmaterialdivider._meventname);
 //BA.debugLineNum = 14;BA.debugLine="Private mCallBack As Object 'ignore";
cfmaterialdivider._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",cfmaterialdivider._mcallback);
 //BA.debugLineNum = 15;BA.debugLine="Private mBase As Pane";
cfmaterialdivider._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",cfmaterialdivider._mbase);
 //BA.debugLineNum = 16;BA.debugLine="Public line As Pane";
cfmaterialdivider._line = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_line",cfmaterialdivider._line);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (cfmaterialdivider) ","cfmaterialdivider",11,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "cfmaterialdivider","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 30;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="mBase = Base";
Debug.ShouldStop(1073741824);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 32;BA.debugLine="mBase.LoadLayout(\"CFMaterialDividerUI\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("CFMaterialDividerUI")));
 BA.debugLineNum = 34;BA.debugLine="SetBg(CFStyleManager.DefaultTheme.Get(\"divider\"))";
Debug.ShouldStop(2);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialdivider.class, "_setbg",(Object)(BA.ObjectToString(cfmaterialdivider._cfstylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("divider")))))));
 BA.debugLineNum = 38;BA.debugLine="End  Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("GetBase (cfmaterialdivider) ","cfmaterialdivider",11,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "cfmaterialdivider","getbase", __ref);}
 BA.debugLineNum = 49;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="Return mBase";
Debug.ShouldStop(131072);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getthickness(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getThickness (cfmaterialdivider) ","cfmaterialdivider",11,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("getthickness")) { return __ref.runUserSub(false, "cfmaterialdivider","getthickness", __ref);}
 BA.debugLineNum = 106;BA.debugLine="Public Sub getThickness() As Double";
Debug.ShouldStop(512);
 BA.debugLineNum = 108;BA.debugLine="Return line.PrefHeight";
Debug.ShouldStop(2048);
if (true) return __ref.getField(false,"_line").runMethod(true,"getPrefHeight");
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Initialize (cfmaterialdivider) ","cfmaterialdivider",11,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cfmaterialdivider","initialize", __ref, _ba, _callback, _eventname);}
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
public static RemoteObject  _removeeffects(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RemoveEffects (cfmaterialdivider) ","cfmaterialdivider",11,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "cfmaterialdivider","removeeffects", __ref);}
 BA.debugLineNum = 89;BA.debugLine="Public Sub RemoveEffects()";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 91;BA.debugLine="CFControlsUtils.RemoveEffect(line)";
Debug.ShouldStop(67108864);
cfmaterialdivider._cfcontrolsutils.runVoidMethod ("_removeeffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_line").getObject()));
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
public static RemoteObject  _setbg(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setBg (cfmaterialdivider) ","cfmaterialdivider",11,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "cfmaterialdivider","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 58;BA.debugLine="Public Sub setBg(color As String)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 60;BA.debugLine="CFControlsUtils.SetBG(line, color)";
Debug.ShouldStop(134217728);
cfmaterialdivider._cfcontrolsutils.runVoidMethod ("_setbg",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_line").getObject()),(Object)(_color));
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
public static RemoteObject  _setborder(RemoteObject __ref,RemoteObject _color,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("setBorder (cfmaterialdivider) ","cfmaterialdivider",11,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "cfmaterialdivider","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 71;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(64);
 BA.debugLineNum = 73;BA.debugLine="CFControlsUtils.SetBorder(line, color, width)";
Debug.ShouldStop(256);
cfmaterialdivider._cfcontrolsutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_line").getObject()),(Object)(_color),(Object)(_width));
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
public static RemoteObject  _setborderradius(RemoteObject __ref,RemoteObject _radius) throws Exception{
try {
		Debug.PushSubsStack("setBorderRadius (cfmaterialdivider) ","cfmaterialdivider",11,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "cfmaterialdivider","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 77;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 79;BA.debugLine="CFControlsUtils.SetBorderRadius(line, radius)";
Debug.ShouldStop(16384);
cfmaterialdivider._cfcontrolsutils.runVoidMethod ("_setborderradius",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_line").getObject()),(Object)(_radius));
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
public static RemoteObject  _seteffect(RemoteObject __ref,RemoteObject _effect) throws Exception{
try {
		Debug.PushSubsStack("setEffect (cfmaterialdivider) ","cfmaterialdivider",11,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("seteffect")) { return __ref.runUserSub(false, "cfmaterialdivider","seteffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 83;BA.debugLine="Public Sub setEffect(effect As String)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 85;BA.debugLine="CFControlsUtils.SetEffect(line, effect)";
Debug.ShouldStop(1048576);
cfmaterialdivider._cfcontrolsutils.runVoidMethod ("_seteffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_line").getObject()),(Object)(_effect));
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
public static RemoteObject  _setthickness(RemoteObject __ref,RemoteObject _size) throws Exception{
try {
		Debug.PushSubsStack("setThickness (cfmaterialdivider) ","cfmaterialdivider",11,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("setthickness")) { return __ref.runUserSub(false, "cfmaterialdivider","setthickness", __ref, _size);}
Debug.locals.put("size", _size);
 BA.debugLineNum = 99;BA.debugLine="Public Sub setThickness(size As Double)";
Debug.ShouldStop(4);
 BA.debugLineNum = 102;BA.debugLine="mBase.PrefHeight =  size";
Debug.ShouldStop(32);
__ref.getField(false,"_mbase").runMethod(true,"setPrefHeight",_size);
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}