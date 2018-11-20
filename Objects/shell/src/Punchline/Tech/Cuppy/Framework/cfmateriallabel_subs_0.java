package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cfmateriallabel_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (cfmateriallabel) ","cfmateriallabel",15,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "cfmateriallabel","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 38;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="InnerLabel.PrefWidth = Width";
Debug.ShouldStop(128);
__ref.getField(false,"_innerlabel").runMethod(true,"setPrefWidth",_width);
 BA.debugLineNum = 41;BA.debugLine="InnerLabel.PrefHeight =  Height";
Debug.ShouldStop(256);
__ref.getField(false,"_innerlabel").runMethod(true,"setPrefHeight",_height);
 BA.debugLineNum = 43;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
Debug.ShouldStop(1024);
cfmateriallabel.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_Resize"))),(Object)((_width)),(Object)((_height)));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 14;BA.debugLine="Private fx As JFX";
cfmateriallabel._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cfmateriallabel._fx);
 //BA.debugLineNum = 15;BA.debugLine="Private mEventName As String 'ignore";
cfmateriallabel._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",cfmateriallabel._meventname);
 //BA.debugLineNum = 16;BA.debugLine="Private mCallBack As Object 'ignore";
cfmateriallabel._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",cfmateriallabel._mcallback);
 //BA.debugLineNum = 17;BA.debugLine="Private mBase As Pane";
cfmateriallabel._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",cfmateriallabel._mbase);
 //BA.debugLineNum = 18;BA.debugLine="Public InnerLabel As Label";
cfmateriallabel._innerlabel = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_innerlabel",cfmateriallabel._innerlabel);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (cfmateriallabel) ","cfmateriallabel",15,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "cfmateriallabel","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 26;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="mBase = Base";
Debug.ShouldStop(67108864);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 28;BA.debugLine="mBase.LoadLayout(\"CFMaterialLabelUI\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("CFMaterialLabelUI")));
 BA.debugLineNum = 31;BA.debugLine="SetTextColor(CFStyleManager.DefaultTheme.Get(\"pri";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmateriallabel.class, "_settextcolor",(Object)(BA.ObjectToString(cfmateriallabel._cfstylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("primary_text")))))));
 BA.debugLineNum = 32;BA.debugLine="InnerLabel.Font = CFStyleManager.SelectFont(\"Ligh";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_innerlabel").runMethod(false,"setFont",cfmateriallabel._cfstylemanager.runMethod(false,"_selectfont",(Object)(BA.ObjectToString("Light")),(Object)(BA.numberCast(double.class, 12))));
 BA.debugLineNum = 35;BA.debugLine="setText(Props.Get(\"Text\"))";
Debug.ShouldStop(4);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmateriallabel.class, "_settext",(Object)(BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Text")))))));
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
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (cfmateriallabel) ","cfmateriallabel",15,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "cfmateriallabel","getbase", __ref);}
 BA.debugLineNum = 47;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Return mBase";
Debug.ShouldStop(32768);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("getText (cfmateriallabel) ","cfmateriallabel",15,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("gettext")) { return __ref.runUserSub(false, "cfmateriallabel","gettext", __ref);}
 BA.debugLineNum = 107;BA.debugLine="Public Sub getText() As String";
Debug.ShouldStop(1024);
 BA.debugLineNum = 109;BA.debugLine="Return InnerLabel.Text";
Debug.ShouldStop(4096);
if (true) return __ref.getField(false,"_innerlabel").runMethod(true,"getText");
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
		Debug.PushSubsStack("Initialize (cfmateriallabel) ","cfmateriallabel",15,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cfmateriallabel","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(2097152);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 23;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(4194304);
__ref.setField ("_mcallback",_callback);
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("InnerLabel_MousePressed (cfmateriallabel) ","cfmateriallabel",15,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("innerlabel_mousepressed")) { return __ref.runUserSub(false, "cfmateriallabel","innerlabel_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 114;BA.debugLine="Private Sub InnerLabel_MousePressed (EventData As";
Debug.ShouldStop(131072);
 BA.debugLineNum = 116;BA.debugLine="InnerLabel.RequestFocus 'set focus";
Debug.ShouldStop(524288);
__ref.getField(false,"_innerlabel").runVoidMethod ("RequestFocus");
 BA.debugLineNum = 117;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MousePr";
Debug.ShouldStop(1048576);
cfmateriallabel.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MousePressed"))),(Object)((_eventdata)));
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
public static RemoteObject  _removeeffects(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RemoveEffects (cfmateriallabel) ","cfmateriallabel",15,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "cfmateriallabel","removeeffects", __ref);}
 BA.debugLineNum = 92;BA.debugLine="Public Sub RemoveEffects()";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 94;BA.debugLine="CFControlsUtils.removeEffect(InnerLabel)";
Debug.ShouldStop(536870912);
cfmateriallabel._cfcontrolsutils.runVoidMethod ("_removeeffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerlabel").getObject()));
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
public static RemoteObject  _setbg(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setBg (cfmateriallabel) ","cfmateriallabel",15,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "cfmateriallabel","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 55;BA.debugLine="Public Sub setBg(color As String)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 57;BA.debugLine="CFControlsUtils.SetBg( InnerLabel, color)";
Debug.ShouldStop(16777216);
cfmateriallabel._cfcontrolsutils.runVoidMethod ("_setbg",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerlabel").getObject()),(Object)(_color));
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
public static RemoteObject  _setborder(RemoteObject __ref,RemoteObject _color,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("setBorder (cfmateriallabel) ","cfmateriallabel",15,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "cfmateriallabel","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 73;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(256);
 BA.debugLineNum = 75;BA.debugLine="CFControlsUtils.setBorder(InnerLabel, color, widt";
Debug.ShouldStop(1024);
cfmateriallabel._cfcontrolsutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerlabel").getObject()),(Object)(_color),(Object)(_width));
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
		Debug.PushSubsStack("setBorderRadius (cfmateriallabel) ","cfmateriallabel",15,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "cfmateriallabel","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 79;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 81;BA.debugLine="CFControlsUtils.setBorderRadius(InnerLabel, radiu";
Debug.ShouldStop(65536);
cfmateriallabel._cfcontrolsutils.runVoidMethod ("_setborderradius",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerlabel").getObject()),(Object)(_radius));
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
public static RemoteObject  _seteffect(RemoteObject __ref,RemoteObject _effect) throws Exception{
try {
		Debug.PushSubsStack("setEffect (cfmateriallabel) ","cfmateriallabel",15,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("seteffect")) { return __ref.runUserSub(false, "cfmateriallabel","seteffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 86;BA.debugLine="Public Sub setEffect(effect As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 88;BA.debugLine="CFControlsUtils.setEffect(InnerLabel, effect)";
Debug.ShouldStop(8388608);
cfmateriallabel._cfcontrolsutils.runVoidMethod ("_seteffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerlabel").getObject()),(Object)(_effect));
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("setRotation (cfmateriallabel) ","cfmateriallabel",15,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("setrotation")) { return __ref.runUserSub(false, "cfmateriallabel","setrotation", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 67;BA.debugLine="Public Sub setRotation(angle As Float)";
Debug.ShouldStop(4);
 BA.debugLineNum = 69;BA.debugLine="CFControlsUtils.setRotation(InnerLabel, angle) 'r";
Debug.ShouldStop(16);
cfmateriallabel._cfcontrolsutils.runVoidMethod ("_setrotation",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerlabel").getObject()),(Object)(_angle));
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
		Debug.PushSubsStack("setText (cfmateriallabel) ","cfmateriallabel",15,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "cfmateriallabel","settext", __ref, _text);}
Debug.locals.put("Text", _text);
 BA.debugLineNum = 101;BA.debugLine="Public Sub setText(Text As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 103;BA.debugLine="InnerLabel.Text = Text";
Debug.ShouldStop(64);
__ref.getField(false,"_innerlabel").runMethod(true,"setText",_text);
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
public static RemoteObject  _settextcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setTextColor (cfmateriallabel) ","cfmateriallabel",15,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("settextcolor")) { return __ref.runUserSub(false, "cfmateriallabel","settextcolor", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 61;BA.debugLine="Public Sub setTextColor(color As String)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 63;BA.debugLine="CFControlsUtils.setTextColor (InnerLabel, color)";
Debug.ShouldStop(1073741824);
cfmateriallabel._cfcontrolsutils.runVoidMethod ("_settextcolor",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerlabel").getObject()),(Object)(_color));
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
}