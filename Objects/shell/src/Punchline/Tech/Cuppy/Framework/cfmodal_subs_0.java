package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cfmodal_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (cfmodal) ","cfmodal",13,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "cfmodal","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 48;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="ModalBgPane.PrefWidth = Width";
Debug.ShouldStop(131072);
__ref.getField(false,"_modalbgpane").runMethod(true,"setPrefWidth",_width);
 BA.debugLineNum = 51;BA.debugLine="ModalBgPane.PrefHeight =  Height";
Debug.ShouldStop(262144);
__ref.getField(false,"_modalbgpane").runMethod(true,"setPrefHeight",_height);
 BA.debugLineNum = 53;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
Debug.ShouldStop(1048576);
cfmodal.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_Resize"))),(Object)((_width)),(Object)((_height)));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 29;BA.debugLine="Private fx As JFX";
cfmodal._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cfmodal._fx);
 //BA.debugLineNum = 30;BA.debugLine="Private mEventName As String 'ignore";
cfmodal._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",cfmodal._meventname);
 //BA.debugLineNum = 31;BA.debugLine="Private mCallBack As Object 'ignore";
cfmodal._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",cfmodal._mcallback);
 //BA.debugLineNum = 32;BA.debugLine="Private mBase As Pane";
cfmodal._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",cfmodal._mbase);
 //BA.debugLineNum = 33;BA.debugLine="Public ModalPane As Pane";
cfmodal._modalpane = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_modalpane",cfmodal._modalpane);
 //BA.debugLineNum = 34;BA.debugLine="Public ModalBgPane As Pane";
cfmodal._modalbgpane = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_modalbgpane",cfmodal._modalbgpane);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (cfmodal) ","cfmodal",13,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "cfmodal","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 42;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="mBase = Base";
Debug.ShouldStop(1024);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 44;BA.debugLine="mBase.LoadLayout(\"CFModalUI\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("CFModalUI")));
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
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (cfmodal) ","cfmodal",13,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "cfmodal","getbase", __ref);}
 BA.debugLineNum = 57;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Return mBase";
Debug.ShouldStop(33554432);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _hide(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Hide (cfmodal) ","cfmodal",13,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("hide")) { __ref.runUserSub(false, "cfmodal","hide", __ref); return;}
ResumableSub_Hide rsub = new ResumableSub_Hide(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Hide extends BA.ResumableSub {
public ResumableSub_Hide(Punchline.Tech.Cuppy.Framework.cfmodal parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
Punchline.Tech.Cuppy.Framework.cfmodal parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Hide (cfmodal) ","cfmodal",13,__ref.getField(false, "ba"),__ref,121);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 123;BA.debugLine="mBase.SetAlphaAnimated(300, 0)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_mbase").runVoidMethod ("SetAlphaAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 125;BA.debugLine="Wait For mBase_AnimationCompleted";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","mbase_animationcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 127;BA.debugLine="ModalBgPane.Visible = False";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_modalbgpane").runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 128;BA.debugLine="ModalPane.Visible = False";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_modalpane").runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 130;BA.debugLine="mBase.SetSize(0, 0)";
Debug.ShouldStop(2);
__ref.getField(false,"_mbase").runVoidMethod ("SetSize",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 131;BA.debugLine="mBase.Enabled = False";
Debug.ShouldStop(4);
__ref.getField(false,"_mbase").runMethod(true,"setEnabled",parent.__c.getField(true,"False"));
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _mbase_animationcompleted(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cfmodal) ","cfmodal",13,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cfmodal","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 37;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(32);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 39;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(64);
__ref.setField ("_mcallback",_callback);
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
public static RemoteObject  _modalbgpane_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("ModalBgPane_MousePressed (cfmodal) ","cfmodal",13,__ref.getField(false, "ba"),__ref,137);
if (RapidSub.canDelegate("modalbgpane_mousepressed")) { return __ref.runUserSub(false, "cfmodal","modalbgpane_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 137;BA.debugLine="Private Sub ModalBgPane_MousePressed (EventData As";
Debug.ShouldStop(256);
 BA.debugLineNum = 139;BA.debugLine="ModalPane.RequestFocus 'set focus";
Debug.ShouldStop(1024);
__ref.getField(false,"_modalpane").runVoidMethod ("RequestFocus");
 BA.debugLineNum = 141;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ModalBG";
Debug.ShouldStop(4096);
cfmodal.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_ModalBGPressed"))),(Object)((_eventdata)));
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _modalbgpane_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("ModalBgPane_Resize (cfmodal) ","cfmodal",13,__ref.getField(false, "ba"),__ref,159);
if (RapidSub.canDelegate("modalbgpane_resize")) { return __ref.runUserSub(false, "cfmodal","modalbgpane_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 159;BA.debugLine="Sub ModalBgPane_Resize (Width As Double, Height As";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 161;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_ModalBg";
Debug.ShouldStop(1);
cfmodal.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_ModalBgPaneResize"))),(Object)((_width)),(Object)((_height)));
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("ModalPane_MousePressed (cfmodal) ","cfmodal",13,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("modalpane_mousepressed")) { return __ref.runUserSub(false, "cfmodal","modalpane_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 145;BA.debugLine="Private Sub ModalPane_MousePressed (EventData As M";
Debug.ShouldStop(65536);
 BA.debugLineNum = 147;BA.debugLine="ModalPane.RequestFocus 'set focus";
Debug.ShouldStop(262144);
__ref.getField(false,"_modalpane").runVoidMethod ("RequestFocus");
 BA.debugLineNum = 149;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ModalPr";
Debug.ShouldStop(1048576);
cfmodal.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_ModalPressed"))),(Object)((_eventdata)));
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _modalpane_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("ModalPane_Resize (cfmodal) ","cfmodal",13,__ref.getField(false, "ba"),__ref,153);
if (RapidSub.canDelegate("modalpane_resize")) { return __ref.runUserSub(false, "cfmodal","modalpane_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 153;BA.debugLine="Sub ModalPane_Resize (Width As Double, Height As D";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 155;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_ModalPa";
Debug.ShouldStop(67108864);
cfmodal.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_ModalPaneResize"))),(Object)((_width)),(Object)((_height)));
 BA.debugLineNum = 157;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("RemoveEffects (cfmodal) ","cfmodal",13,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "cfmodal","removeeffects", __ref);}
 BA.debugLineNum = 97;BA.debugLine="Public Sub RemoveEffects()";
Debug.ShouldStop(1);
 BA.debugLineNum = 99;BA.debugLine="CFControlsUtils.RemoveEffect(ModalPane)";
Debug.ShouldStop(4);
cfmodal._cfcontrolsutils.runVoidMethod ("_removeeffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_modalpane").getObject()));
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
public static RemoteObject  _setbg(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setBg (cfmodal) ","cfmodal",13,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "cfmodal","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 65;BA.debugLine="Public Sub setBg(color As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 67;BA.debugLine="CFControlsUtils.setBG( ModalPane, color)";
Debug.ShouldStop(4);
cfmodal._cfcontrolsutils.runVoidMethod ("_setbg",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_modalpane").getObject()),(Object)(_color));
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
public static RemoteObject  _setborder(RemoteObject __ref,RemoteObject _color,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("setBorder (cfmodal) ","cfmodal",13,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "cfmodal","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 77;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(4096);
 BA.debugLineNum = 79;BA.debugLine="CFControlsUtils.setBorder(ModalPane, color, width";
Debug.ShouldStop(16384);
cfmodal._cfcontrolsutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_modalpane").getObject()),(Object)(_color),(Object)(_width));
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
public static RemoteObject  _setborderradius(RemoteObject __ref,RemoteObject _radius) throws Exception{
try {
		Debug.PushSubsStack("setBorderRadius (cfmodal) ","cfmodal",13,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "cfmodal","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 84;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 86;BA.debugLine="CFControlsUtils.setBorderRadius(ModalPane, radius";
Debug.ShouldStop(2097152);
cfmodal._cfcontrolsutils.runVoidMethod ("_setborderradius",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_modalpane").getObject()),(Object)(_radius));
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
public static RemoteObject  _seteffect(RemoteObject __ref,RemoteObject _effect) throws Exception{
try {
		Debug.PushSubsStack("setEffect (cfmodal) ","cfmodal",13,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("seteffect")) { return __ref.runUserSub(false, "cfmodal","seteffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 91;BA.debugLine="Public Sub setEffect(effect As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 93;BA.debugLine="CFControlsUtils.setEffect(ModalPane, effect)";
Debug.ShouldStop(268435456);
cfmodal._cfcontrolsutils.runVoidMethod ("_seteffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_modalpane").getObject()),(Object)(_effect));
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("setRotation (cfmodal) ","cfmodal",13,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("setrotation")) { return __ref.runUserSub(false, "cfmodal","setrotation", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 71;BA.debugLine="Public Sub setRotation(angle As Float)";
Debug.ShouldStop(64);
 BA.debugLineNum = 73;BA.debugLine="CFControlsUtils.setRotation(ModalPane, angle) 'ro";
Debug.ShouldStop(256);
cfmodal._cfcontrolsutils.runVoidMethod ("_setrotation",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_modalpane").getObject()),(Object)(_angle));
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
public static RemoteObject  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (cfmodal) ","cfmodal",13,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "cfmodal","show", __ref);}
RemoteObject _parent = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
 BA.debugLineNum = 107;BA.debugLine="Public Sub Show";
Debug.ShouldStop(1024);
 BA.debugLineNum = 109;BA.debugLine="Dim Parent As Pane = GetBase.Parent";
Debug.ShouldStop(4096);
_parent = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_parent.setObject(__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmodal.class, "_getbase").runMethod(false,"getParent").getObject());Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 111;BA.debugLine="mBase.Enabled = True";
Debug.ShouldStop(16384);
__ref.getField(false,"_mbase").runMethod(true,"setEnabled",cfmodal.__c.getField(true,"True"));
 BA.debugLineNum = 112;BA.debugLine="mBase.Alpha = 1";
Debug.ShouldStop(32768);
__ref.getField(false,"_mbase").runMethod(true,"setAlpha",BA.numberCast(double.class, 1));
 BA.debugLineNum = 114;BA.debugLine="ModalBgPane.Visible = True";
Debug.ShouldStop(131072);
__ref.getField(false,"_modalbgpane").runMethod(true,"setVisible",cfmodal.__c.getField(true,"True"));
 BA.debugLineNum = 115;BA.debugLine="ModalPane.Visible = True";
Debug.ShouldStop(262144);
__ref.getField(false,"_modalpane").runMethod(true,"setVisible",cfmodal.__c.getField(true,"True"));
 BA.debugLineNum = 117;BA.debugLine="mBase.SetLayoutAnimated(300, 0 , 0,  Parent.Width";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mbase").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(_parent.runMethod(true,"getWidth")),(Object)(_parent.runMethod(true,"getHeight")));
 BA.debugLineNum = 119;BA.debugLine="End Sub";
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