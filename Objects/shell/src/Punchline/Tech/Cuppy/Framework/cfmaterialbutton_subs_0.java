package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cfmaterialbutton_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (cfmaterialbutton) ","cfmaterialbutton",18,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "cfmaterialbutton","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 44;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(2048);
 BA.debugLineNum = 46;BA.debugLine="InnerButton.PrefWidth = Width";
Debug.ShouldStop(8192);
__ref.getField(false,"_innerbutton").runMethod(true,"setPrefWidth",_width);
 BA.debugLineNum = 47;BA.debugLine="InnerButton.PrefHeight =  Height";
Debug.ShouldStop(16384);
__ref.getField(false,"_innerbutton").runMethod(true,"setPrefHeight",_height);
 BA.debugLineNum = 49;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
Debug.ShouldStop(65536);
cfmaterialbutton.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_Resize"))),(Object)((_width)),(Object)((_height)));
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
cfmaterialbutton._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cfmaterialbutton._fx);
 //BA.debugLineNum = 19;BA.debugLine="Private mEventName As String 'ignore";
cfmaterialbutton._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",cfmaterialbutton._meventname);
 //BA.debugLineNum = 20;BA.debugLine="Private mCallBack As Object 'ignore";
cfmaterialbutton._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",cfmaterialbutton._mcallback);
 //BA.debugLineNum = 21;BA.debugLine="Private mBase As Pane";
cfmaterialbutton._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",cfmaterialbutton._mbase);
 //BA.debugLineNum = 22;BA.debugLine="Public InnerButton As Button";
cfmaterialbutton._innerbutton = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_innerbutton",cfmaterialbutton._innerbutton);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (cfmaterialbutton) ","cfmaterialbutton",18,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "cfmaterialbutton","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 31;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="mBase = Base";
Debug.ShouldStop(1);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 34;BA.debugLine="mBase.LoadLayout(\"CFMaterialButtonUI\")";
Debug.ShouldStop(2);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("CFMaterialButtonUI")));
 BA.debugLineNum = 36;BA.debugLine="setBg(CFStyleManager.DefaultTheme.Get(\"accent\"))";
Debug.ShouldStop(8);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialbutton.class, "_setbg",(Object)(BA.ObjectToString(cfmaterialbutton._cfstylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("accent")))))));
 BA.debugLineNum = 37;BA.debugLine="InnerButton.Font = CFStyleManager.FONT_REGULAR_FO";
Debug.ShouldStop(16);
__ref.getField(false,"_innerbutton").runMethod(false,"setFont",cfmaterialbutton._cfstylemanager._font_regular_font);
 BA.debugLineNum = 38;BA.debugLine="InnerButton.MouseCursor = fx.Cursors.HAND";
Debug.ShouldStop(32);
__ref.getField(false,"_innerbutton").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx").getField(false,"Cursors").getField(false,"HAND"));
 BA.debugLineNum = 40;BA.debugLine="setText(Props.Get(\"Text\"))";
Debug.ShouldStop(128);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialbutton.class, "_settext",(Object)(BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Text")))))));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("GetBase (cfmaterialbutton) ","cfmaterialbutton",18,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "cfmaterialbutton","getbase", __ref);}
 BA.debugLineNum = 53;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="Return mBase";
Debug.ShouldStop(2097152);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettext(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getText (cfmaterialbutton) ","cfmaterialbutton",18,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("gettext")) { return __ref.runUserSub(false, "cfmaterialbutton","gettext", __ref);}
 BA.debugLineNum = 107;BA.debugLine="Public Sub getText() As String";
Debug.ShouldStop(1024);
 BA.debugLineNum = 109;BA.debugLine="Return InnerButton.Text";
Debug.ShouldStop(4096);
if (true) return __ref.getField(false,"_innerbutton").runMethod(true,"getText");
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cfmaterialbutton) ","cfmaterialbutton",18,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cfmaterialbutton","initialize", __ref, _ba, _callback, _eventname);}
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
public static RemoteObject  _innerbutton_mouseentered(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("InnerButton_MouseEntered (cfmaterialbutton) ","cfmaterialbutton",18,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("innerbutton_mouseentered")) { return __ref.runUserSub(false, "cfmaterialbutton","innerbutton_mouseentered", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 120;BA.debugLine="Private Sub InnerButton_MouseEntered (EventData As";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 122;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEn";
Debug.ShouldStop(33554432);
cfmaterialbutton.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MouseEntered"))),(Object)((_eventdata)));
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _innerbutton_mouseexited(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("InnerButton_MouseExited (cfmaterialbutton) ","cfmaterialbutton",18,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("innerbutton_mouseexited")) { return __ref.runUserSub(false, "cfmaterialbutton","innerbutton_mouseexited", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 126;BA.debugLine="Private Sub InnerButton_MouseExited (EventData As";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 128;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEx";
Debug.ShouldStop(-2147483648);
cfmaterialbutton.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MouseExited"))),(Object)((_eventdata)));
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("InnerButton_MousePressed (cfmaterialbutton) ","cfmaterialbutton",18,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("innerbutton_mousepressed")) { return __ref.runUserSub(false, "cfmaterialbutton","innerbutton_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 113;BA.debugLine="Private Sub InnerButton_MousePressed (EventData As";
Debug.ShouldStop(65536);
 BA.debugLineNum = 115;BA.debugLine="InnerButton.RequestFocus 'set focus";
Debug.ShouldStop(262144);
__ref.getField(false,"_innerbutton").runVoidMethod ("RequestFocus");
 BA.debugLineNum = 116;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MousePr";
Debug.ShouldStop(524288);
cfmaterialbutton.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MousePressed"))),(Object)((_eventdata)));
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("RemoveEffects (cfmaterialbutton) ","cfmaterialbutton",18,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "cfmaterialbutton","removeeffects", __ref);}
 BA.debugLineNum = 93;BA.debugLine="Public Sub RemoveEffects()";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 95;BA.debugLine="CFControlsUtils.removeEffect(InnerButton)";
Debug.ShouldStop(1073741824);
cfmaterialbutton._cfcontrolsutils.runVoidMethod ("_removeeffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerbutton").getObject()));
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
public static RemoteObject  _setbg(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setBg (cfmaterialbutton) ","cfmaterialbutton",18,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "cfmaterialbutton","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 61;BA.debugLine="Public Sub setBg(color As String)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 63;BA.debugLine="CFControlsUtils.SetBG( InnerButton, color)";
Debug.ShouldStop(1073741824);
cfmaterialbutton._cfcontrolsutils.runVoidMethod ("_setbg",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerbutton").getObject()),(Object)(_color));
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
public static RemoteObject  _setborder(RemoteObject __ref,RemoteObject _color,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("setBorder (cfmaterialbutton) ","cfmaterialbutton",18,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "cfmaterialbutton","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 73;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(256);
 BA.debugLineNum = 75;BA.debugLine="CFControlsUtils.setBorder(InnerButton, color, wid";
Debug.ShouldStop(1024);
cfmaterialbutton._cfcontrolsutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerbutton").getObject()),(Object)(_color),(Object)(_width));
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
public static RemoteObject  _setborderradius(RemoteObject __ref,RemoteObject _radius) throws Exception{
try {
		Debug.PushSubsStack("setBorderRadius (cfmaterialbutton) ","cfmaterialbutton",18,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "cfmaterialbutton","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 80;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 82;BA.debugLine="CFControlsUtils.setBorderRadius(InnerButton, radi";
Debug.ShouldStop(131072);
cfmaterialbutton._cfcontrolsutils.runVoidMethod ("_setborderradius",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerbutton").getObject()),(Object)(_radius));
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("setEffect (cfmaterialbutton) ","cfmaterialbutton",18,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("seteffect")) { return __ref.runUserSub(false, "cfmaterialbutton","seteffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 87;BA.debugLine="Public Sub setEffect(effect As String)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 89;BA.debugLine="CFControlsUtils.setEffect(InnerButton, effect)";
Debug.ShouldStop(16777216);
cfmaterialbutton._cfcontrolsutils.runVoidMethod ("_seteffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerbutton").getObject()),(Object)(_effect));
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("setRotation (cfmaterialbutton) ","cfmaterialbutton",18,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("setrotation")) { return __ref.runUserSub(false, "cfmaterialbutton","setrotation", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 67;BA.debugLine="Public Sub setRotation(angle As Float)";
Debug.ShouldStop(4);
 BA.debugLineNum = 69;BA.debugLine="CFControlsUtils.setRotation(InnerButton, angle) '";
Debug.ShouldStop(16);
cfmaterialbutton._cfcontrolsutils.runVoidMethod ("_setrotation",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerbutton").getObject()),(Object)(_angle));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("setText (cfmaterialbutton) ","cfmaterialbutton",18,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "cfmaterialbutton","settext", __ref, _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 101;BA.debugLine="Public Sub setText(text As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 103;BA.debugLine="InnerButton.Text = text";
Debug.ShouldStop(64);
__ref.getField(false,"_innerbutton").runMethod(true,"setText",_text);
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
}