package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cfmaterialsquarefab_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (cfmaterialsquarefab) ","cfmaterialsquarefab",20,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "cfmaterialsquarefab","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 38;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(32);
 BA.debugLineNum = 41;BA.debugLine="FAB_Btn.PrefWidth = Width";
Debug.ShouldStop(256);
__ref.getField(false,"_fab_btn").runMethod(true,"setPrefWidth",_width);
 BA.debugLineNum = 42;BA.debugLine="FAB_Btn.PrefHeight = Width";
Debug.ShouldStop(512);
__ref.getField(false,"_fab_btn").runMethod(true,"setPrefHeight",_width);
 BA.debugLineNum = 44;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
Debug.ShouldStop(2048);
cfmaterialsquarefab.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_Resize"))),(Object)((_width)),(Object)((_height)));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private fx As JFX";
cfmaterialsquarefab._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cfmaterialsquarefab._fx);
 //BA.debugLineNum = 18;BA.debugLine="Private mEventName As String 'ignore";
cfmaterialsquarefab._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",cfmaterialsquarefab._meventname);
 //BA.debugLineNum = 19;BA.debugLine="Private mCallBack As Object 'ignore";
cfmaterialsquarefab._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",cfmaterialsquarefab._mcallback);
 //BA.debugLineNum = 20;BA.debugLine="Private mBase As Pane";
cfmaterialsquarefab._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",cfmaterialsquarefab._mbase);
 //BA.debugLineNum = 21;BA.debugLine="Public FAB_Btn As Label";
cfmaterialsquarefab._fab_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_fab_btn",cfmaterialsquarefab._fab_btn);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (cfmaterialsquarefab) ","cfmaterialsquarefab",20,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "cfmaterialsquarefab","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 29;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="mBase = Base";
Debug.ShouldStop(536870912);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 31;BA.debugLine="mBase.LoadLayout(\"CFMaterialSquareFABUI\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("CFMaterialSquareFABUI")));
 BA.debugLineNum = 33;BA.debugLine="SetBg(CFStyleManager.DefaultTheme.Get(\"accent\"))";
Debug.ShouldStop(1);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialsquarefab.class, "_setbg",(Object)(BA.ObjectToString(cfmaterialsquarefab._cfstylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("accent")))))));
 BA.debugLineNum = 34;BA.debugLine="setRotation(135) 'rotate by default";
Debug.ShouldStop(2);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialsquarefab.class, "_setrotation",(Object)(BA.numberCast(float.class, 135)));
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
public static RemoteObject  _fab_btn_mouseentered(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("FAB_Btn_MouseEntered (cfmaterialsquarefab) ","cfmaterialsquarefab",20,__ref.getField(false, "ba"),__ref,116);
if (RapidSub.canDelegate("fab_btn_mouseentered")) { return __ref.runUserSub(false, "cfmaterialsquarefab","fab_btn_mouseentered", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 116;BA.debugLine="Private Sub FAB_Btn_MouseEntered (EventData As Mou";
Debug.ShouldStop(524288);
 BA.debugLineNum = 118;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEn";
Debug.ShouldStop(2097152);
cfmaterialsquarefab.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MouseEntered"))),(Object)((_eventdata)));
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fab_btn_mouseexited(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("FAB_Btn_MouseExited (cfmaterialsquarefab) ","cfmaterialsquarefab",20,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("fab_btn_mouseexited")) { return __ref.runUserSub(false, "cfmaterialsquarefab","fab_btn_mouseexited", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 122;BA.debugLine="Private Sub FAB_Btn_MouseExited (EventData As Mous";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 124;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEx";
Debug.ShouldStop(134217728);
cfmaterialsquarefab.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MouseExited"))),(Object)((_eventdata)));
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fab_btn_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("FAB_Btn_MousePressed (cfmaterialsquarefab) ","cfmaterialsquarefab",20,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("fab_btn_mousepressed")) { return __ref.runUserSub(false, "cfmaterialsquarefab","fab_btn_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 108;BA.debugLine="Private Sub FAB_Btn_MousePressed (EventData As Mou";
Debug.ShouldStop(2048);
 BA.debugLineNum = 110;BA.debugLine="FAB_Btn.RequestFocus 'set focus";
Debug.ShouldStop(8192);
__ref.getField(false,"_fab_btn").runVoidMethod ("RequestFocus");
 BA.debugLineNum = 112;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MousePr";
Debug.ShouldStop(32768);
cfmaterialsquarefab.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MousePressed"))),(Object)((_eventdata)));
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
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (cfmaterialsquarefab) ","cfmaterialsquarefab",20,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "cfmaterialsquarefab","getbase", __ref);}
 BA.debugLineNum = 48;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Return mBase";
Debug.ShouldStop(65536);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _geticon(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getIcon (cfmaterialsquarefab) ","cfmaterialsquarefab",20,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("geticon")) { return __ref.runUserSub(false, "cfmaterialsquarefab","geticon", __ref);}
 BA.debugLineNum = 102;BA.debugLine="Public Sub getIcon As String";
Debug.ShouldStop(32);
 BA.debugLineNum = 104;BA.debugLine="Return FAB_Btn.Text";
Debug.ShouldStop(128);
if (true) return __ref.getField(false,"_fab_btn").runMethod(true,"getText");
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cfmaterialsquarefab) ","cfmaterialsquarefab",20,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cfmaterialsquarefab","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(16777216);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 26;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(33554432);
__ref.setField ("_mcallback",_callback);
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("RemoveEffects (cfmaterialsquarefab) ","cfmaterialsquarefab",20,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "cfmaterialsquarefab","removeeffects", __ref);}
 BA.debugLineNum = 88;BA.debugLine="Public Sub RemoveEffects()";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 90;BA.debugLine="CFControlsUtils.removeEffect(FAB_Btn)";
Debug.ShouldStop(33554432);
cfmaterialsquarefab._cfcontrolsutils.runVoidMethod ("_removeeffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_fab_btn").getObject()));
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
public static RemoteObject  _setbg(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setBg (cfmaterialsquarefab) ","cfmaterialsquarefab",20,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "cfmaterialsquarefab","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 56;BA.debugLine="Public Sub setBg(color As String)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 58;BA.debugLine="CFControlsUtils.SetBG( FAB_Btn, color)";
Debug.ShouldStop(33554432);
cfmaterialsquarefab._cfcontrolsutils.runVoidMethod ("_setbg",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_fab_btn").getObject()),(Object)(_color));
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
public static RemoteObject  _setborder(RemoteObject __ref,RemoteObject _color,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("setBorder (cfmaterialsquarefab) ","cfmaterialsquarefab",20,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "cfmaterialsquarefab","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 68;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(8);
 BA.debugLineNum = 70;BA.debugLine="CFControlsUtils.setBorder(FAB_Btn, color, width)";
Debug.ShouldStop(32);
cfmaterialsquarefab._cfcontrolsutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_fab_btn").getObject()),(Object)(_color),(Object)(_width));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("setBorderRadius (cfmaterialsquarefab) ","cfmaterialsquarefab",20,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "cfmaterialsquarefab","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 75;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 77;BA.debugLine="CFControlsUtils.setBorderRadius(FAB_Btn, radius)";
Debug.ShouldStop(4096);
cfmaterialsquarefab._cfcontrolsutils.runVoidMethod ("_setborderradius",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_fab_btn").getObject()),(Object)(_radius));
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
public static RemoteObject  _seteffect(RemoteObject __ref,RemoteObject _effect) throws Exception{
try {
		Debug.PushSubsStack("setEffect (cfmaterialsquarefab) ","cfmaterialsquarefab",20,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("seteffect")) { return __ref.runUserSub(false, "cfmaterialsquarefab","seteffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 82;BA.debugLine="Public Sub setEffect(effect As String)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 84;BA.debugLine="CFControlsUtils.setEffect(FAB_Btn, effect)";
Debug.ShouldStop(524288);
cfmaterialsquarefab._cfcontrolsutils.runVoidMethod ("_seteffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_fab_btn").getObject()),(Object)(_effect));
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seticon(RemoteObject __ref,RemoteObject _icontext) throws Exception{
try {
		Debug.PushSubsStack("setIcon (cfmaterialsquarefab) ","cfmaterialsquarefab",20,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("seticon")) { return __ref.runUserSub(false, "cfmaterialsquarefab","seticon", __ref, _icontext);}
Debug.locals.put("IconText", _icontext);
 BA.debugLineNum = 96;BA.debugLine="Public Sub setIcon(IconText As String)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 98;BA.debugLine="FAB_Btn.Text = IconText";
Debug.ShouldStop(2);
__ref.getField(false,"_fab_btn").runMethod(true,"setText",_icontext);
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
public static RemoteObject  _setrotation(RemoteObject __ref,RemoteObject _angle) throws Exception{
try {
		Debug.PushSubsStack("setRotation (cfmaterialsquarefab) ","cfmaterialsquarefab",20,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("setrotation")) { return __ref.runUserSub(false, "cfmaterialsquarefab","setrotation", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 62;BA.debugLine="Public Sub setRotation(angle As Float)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 64;BA.debugLine="CFControlsUtils.setRotation(FAB_Btn, angle) 'rota";
Debug.ShouldStop(-2147483648);
cfmaterialsquarefab._cfcontrolsutils.runVoidMethod ("_setrotation",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_fab_btn").getObject()),(Object)(_angle));
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
}