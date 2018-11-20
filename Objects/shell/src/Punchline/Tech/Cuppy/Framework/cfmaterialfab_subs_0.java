package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cfmaterialfab_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (cfmaterialfab) ","cfmaterialfab",17,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "cfmaterialfab","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 40;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(128);
 BA.debugLineNum = 43;BA.debugLine="FAB_Btn.PrefWidth = Width";
Debug.ShouldStop(1024);
__ref.getField(false,"_fab_btn").runMethod(true,"setPrefWidth",_width);
 BA.debugLineNum = 44;BA.debugLine="FAB_Btn.PrefHeight = Width";
Debug.ShouldStop(2048);
__ref.getField(false,"_fab_btn").runMethod(true,"setPrefHeight",_width);
 BA.debugLineNum = 45;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
Debug.ShouldStop(4096);
cfmaterialfab.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_Resize"))),(Object)((_width)),(Object)((_height)));
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
 //BA.debugLineNum = 17;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private fx As JFX";
cfmaterialfab._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cfmaterialfab._fx);
 //BA.debugLineNum = 19;BA.debugLine="Private mEventName As String 'ignore";
cfmaterialfab._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",cfmaterialfab._meventname);
 //BA.debugLineNum = 20;BA.debugLine="Private mCallBack As Object 'ignore";
cfmaterialfab._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",cfmaterialfab._mcallback);
 //BA.debugLineNum = 21;BA.debugLine="Private mBase As Pane";
cfmaterialfab._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",cfmaterialfab._mbase);
 //BA.debugLineNum = 22;BA.debugLine="Public FAB_Btn As Label";
cfmaterialfab._fab_btn = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_fab_btn",cfmaterialfab._fab_btn);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (cfmaterialfab) ","cfmaterialfab",17,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "cfmaterialfab","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 30;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="mBase = Base";
Debug.ShouldStop(1073741824);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 32;BA.debugLine="mBase.LoadLayout(\"CFMaterialFABUI\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("CFMaterialFABUI")));
 BA.debugLineNum = 35;BA.debugLine="setBg(CFStyleManager.DefaultTheme.Get(\"accent\"))";
Debug.ShouldStop(4);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialfab.class, "_setbg",(Object)(BA.ObjectToString(cfmaterialfab._cfstylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("accent")))))));
 BA.debugLineNum = 36;BA.debugLine="FAB_Btn.MouseCursor = fx.Cursors.HAND";
Debug.ShouldStop(8);
__ref.getField(false,"_fab_btn").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx").getField(false,"Cursors").getField(false,"HAND"));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("FAB_Btn_MouseEntered (cfmaterialfab) ","cfmaterialfab",17,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("fab_btn_mouseentered")) { return __ref.runUserSub(false, "cfmaterialfab","fab_btn_mouseentered", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 122;BA.debugLine="Private Sub FAB_Btn_MouseEntered (EventData As Mou";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 124;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEn";
Debug.ShouldStop(134217728);
cfmaterialfab.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MouseEntered"))),(Object)((_eventdata)));
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
public static RemoteObject  _fab_btn_mouseexited(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("FAB_Btn_MouseExited (cfmaterialfab) ","cfmaterialfab",17,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("fab_btn_mouseexited")) { return __ref.runUserSub(false, "cfmaterialfab","fab_btn_mouseexited", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 128;BA.debugLine="Private Sub FAB_Btn_MouseExited (EventData As Mous";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 130;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEx";
Debug.ShouldStop(2);
cfmaterialfab.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MouseExited"))),(Object)((_eventdata)));
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
public static RemoteObject  _fab_btn_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("FAB_Btn_MousePressed (cfmaterialfab) ","cfmaterialfab",17,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("fab_btn_mousepressed")) { return __ref.runUserSub(false, "cfmaterialfab","fab_btn_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 114;BA.debugLine="Private Sub FAB_Btn_MousePressed (EventData As Mou";
Debug.ShouldStop(131072);
 BA.debugLineNum = 116;BA.debugLine="FAB_Btn.RequestFocus 'set focus";
Debug.ShouldStop(524288);
__ref.getField(false,"_fab_btn").runVoidMethod ("RequestFocus");
 BA.debugLineNum = 118;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MousePr";
Debug.ShouldStop(2097152);
cfmaterialfab.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MousePressed"))),(Object)((_eventdata)));
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
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (cfmaterialfab) ","cfmaterialfab",17,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "cfmaterialfab","getbase", __ref);}
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
public static RemoteObject  _geticon(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getIcon (cfmaterialfab) ","cfmaterialfab",17,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("geticon")) { return __ref.runUserSub(false, "cfmaterialfab","geticon", __ref);}
 BA.debugLineNum = 105;BA.debugLine="Public Sub getIcon As String";
Debug.ShouldStop(256);
 BA.debugLineNum = 107;BA.debugLine="Return FAB_Btn.Text";
Debug.ShouldStop(1024);
if (true) return __ref.getField(false,"_fab_btn").runMethod(true,"getText");
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Initialize (cfmaterialfab) ","cfmaterialfab",17,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cfmaterialfab","initialize", __ref, _ba, _callback, _eventname);}
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
		Debug.PushSubsStack("RemoveEffects (cfmaterialfab) ","cfmaterialfab",17,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "cfmaterialfab","removeeffects", __ref);}
 BA.debugLineNum = 83;BA.debugLine="Public Sub RemoveEffects()";
Debug.ShouldStop(262144);
 BA.debugLineNum = 85;BA.debugLine="CFControlsUtils.removeEffect(FAB_Btn)";
Debug.ShouldStop(1048576);
cfmaterialfab._cfcontrolsutils.runVoidMethod ("_removeeffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_fab_btn").getObject()));
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
		Debug.PushSubsStack("setBg (cfmaterialfab) ","cfmaterialfab",17,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "cfmaterialfab","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 58;BA.debugLine="Public Sub setBg(color As String)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 60;BA.debugLine="CFControlsUtils.SetBG( FAB_Btn, color)";
Debug.ShouldStop(134217728);
cfmaterialfab._cfcontrolsutils.runVoidMethod ("_setbg",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_fab_btn").getObject()),(Object)(_color));
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
		Debug.PushSubsStack("setBorder (cfmaterialfab) ","cfmaterialfab",17,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "cfmaterialfab","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 64;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 66;BA.debugLine="CFControlsUtils.setBorder(FAB_Btn, color, width)";
Debug.ShouldStop(2);
cfmaterialfab._cfcontrolsutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_fab_btn").getObject()),(Object)(_color),(Object)(_width));
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
public static RemoteObject  _setborderradius(RemoteObject __ref,RemoteObject _radius) throws Exception{
try {
		Debug.PushSubsStack("setBorderRadius (cfmaterialfab) ","cfmaterialfab",17,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "cfmaterialfab","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 70;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(32);
 BA.debugLineNum = 72;BA.debugLine="CFControlsUtils.setBorderRadius(FAB_Btn, radius)";
Debug.ShouldStop(128);
cfmaterialfab._cfcontrolsutils.runVoidMethod ("_setborderradius",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_fab_btn").getObject()),(Object)(_radius));
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
		Debug.PushSubsStack("setEffect (cfmaterialfab) ","cfmaterialfab",17,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("seteffect")) { return __ref.runUserSub(false, "cfmaterialfab","seteffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 77;BA.debugLine="Public Sub setEffect(effect As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 79;BA.debugLine="CFControlsUtils.setEffect(FAB_Btn, effect)";
Debug.ShouldStop(16384);
cfmaterialfab._cfcontrolsutils.runVoidMethod ("_seteffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_fab_btn").getObject()),(Object)(_effect));
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
public static RemoteObject  _seticon(RemoteObject __ref,RemoteObject _icontext) throws Exception{
try {
		Debug.PushSubsStack("setIcon (cfmaterialfab) ","cfmaterialfab",17,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("seticon")) { return __ref.runUserSub(false, "cfmaterialfab","seticon", __ref, _icontext);}
Debug.locals.put("IconText", _icontext);
 BA.debugLineNum = 99;BA.debugLine="Public Sub setIcon(IconText As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 101;BA.debugLine="FAB_Btn.Text = IconText";
Debug.ShouldStop(16);
__ref.getField(false,"_fab_btn").runMethod(true,"setText",_icontext);
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("setRotation (cfmaterialfab) ","cfmaterialfab",17,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("setrotation")) { return __ref.runUserSub(false, "cfmaterialfab","setrotation", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 89;BA.debugLine="Public Sub setRotation(angle As Float)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 91;BA.debugLine="CFControlsUtils.setRotation(FAB_Btn, angle) 'rota";
Debug.ShouldStop(67108864);
cfmaterialfab._cfcontrolsutils.runVoidMethod ("_setrotation",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_fab_btn").getObject()),(Object)(_angle));
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
}