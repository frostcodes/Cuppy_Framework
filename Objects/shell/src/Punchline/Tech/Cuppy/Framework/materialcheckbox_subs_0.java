package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class materialcheckbox_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (materialcheckbox) ","materialcheckbox",20,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "materialcheckbox","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 41;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="CheckboxPane.PrefWidth = Width";
Debug.ShouldStop(1024);
__ref.getField(false,"_checkboxpane").runMethod(true,"setPrefWidth",_width);
 BA.debugLineNum = 44;BA.debugLine="CheckedLabel.PrefWidth = Width";
Debug.ShouldStop(2048);
__ref.getField(false,"_checkedlabel").runMethod(true,"setPrefWidth",_width);
 BA.debugLineNum = 46;BA.debugLine="CheckboxPane.PrefHeight = Height";
Debug.ShouldStop(8192);
__ref.getField(false,"_checkboxpane").runMethod(true,"setPrefHeight",_height);
 BA.debugLineNum = 47;BA.debugLine="CheckedLabel.PrefHeight = Height";
Debug.ShouldStop(16384);
__ref.getField(false,"_checkedlabel").runMethod(true,"setPrefHeight",_height);
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
public static RemoteObject  _checkboxpane_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("CheckboxPane_MousePressed (materialcheckbox) ","materialcheckbox",20,__ref.getField(false, "ba"),__ref,146);
if (RapidSub.canDelegate("checkboxpane_mousepressed")) { return __ref.runUserSub(false, "materialcheckbox","checkboxpane_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 146;BA.debugLine="Private Sub CheckboxPane_MousePressed (EventData A";
Debug.ShouldStop(131072);
 BA.debugLineNum = 148;BA.debugLine="If Not(checked) Or IsIndeterminate Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(".",materialcheckbox.__c.runMethod(true,"Not",(Object)(__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materialcheckbox.class, "_checked")))) || RemoteObject.solveBoolean(".",__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materialcheckbox.class, "_isindeterminate"))) { 
 BA.debugLineNum = 150;BA.debugLine="setCheckState(CHECKED_STATE)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materialcheckbox.class, "_setcheckstate",(Object)(__ref.getField(true,"_checked_state")));
 }else {
 BA.debugLineNum = 154;BA.debugLine="setCheckState(UNCHECKED_STATE)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materialcheckbox.class, "_setcheckstate",(Object)(__ref.getField(true,"_unchecked_state")));
 };
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checked(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("checked (materialcheckbox) ","materialcheckbox",20,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("checked")) { return __ref.runUserSub(false, "materialcheckbox","checked", __ref);}
 BA.debugLineNum = 127;BA.debugLine="Public Sub checked As Boolean";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 129;BA.debugLine="Return CheckedLabel.Visible";
Debug.ShouldStop(1);
if (true) return __ref.getField(false,"_checkedlabel").runMethod(true,"getVisible");
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private fx As JFX";
materialcheckbox._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",materialcheckbox._fx);
 //BA.debugLineNum = 10;BA.debugLine="Private mEventName As String 'ignore";
materialcheckbox._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",materialcheckbox._meventname);
 //BA.debugLineNum = 11;BA.debugLine="Private mCallBack As Object 'ignore";
materialcheckbox._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",materialcheckbox._mcallback);
 //BA.debugLineNum = 12;BA.debugLine="Private mBase As Pane";
materialcheckbox._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",materialcheckbox._mbase);
 //BA.debugLineNum = 14;BA.debugLine="Public CheckedLabel As Label";
materialcheckbox._checkedlabel = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_checkedlabel",materialcheckbox._checkedlabel);
 //BA.debugLineNum = 15;BA.debugLine="Public CheckboxPane As Pane";
materialcheckbox._checkboxpane = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_checkboxpane",materialcheckbox._checkboxpane);
 //BA.debugLineNum = 18;BA.debugLine="Public CHECKED_STATE As Int = 0";
materialcheckbox._checked_state = BA.numberCast(int.class, 0);__ref.setField("_checked_state",materialcheckbox._checked_state);
 //BA.debugLineNum = 19;BA.debugLine="Public UNCHECKED_STATE As Int = 1";
materialcheckbox._unchecked_state = BA.numberCast(int.class, 1);__ref.setField("_unchecked_state",materialcheckbox._unchecked_state);
 //BA.debugLineNum = 20;BA.debugLine="Public INDETERMINATE_STATE As Int = 2";
materialcheckbox._indeterminate_state = BA.numberCast(int.class, 2);__ref.setField("_indeterminate_state",materialcheckbox._indeterminate_state);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (materialcheckbox) ","materialcheckbox",20,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "materialcheckbox","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 29;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="mBase = Base";
Debug.ShouldStop(536870912);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 31;BA.debugLine="mBase.LoadLayout(\"MaterialCheckboxLayout\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MaterialCheckboxLayout")));
 BA.debugLineNum = 33;BA.debugLine="setBorder(StyleManager.DefaultTheme.Get(\"divider\"";
Debug.ShouldStop(1);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materialcheckbox.class, "_setborder",(Object)(BA.ObjectToString(materialcheckbox._stylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("divider")))))),(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 34;BA.debugLine="setCheckedColor(StyleManager.DefaultTheme.Get(\"pr";
Debug.ShouldStop(2);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materialcheckbox.class, "_setcheckedcolor",(Object)(BA.ObjectToString(materialcheckbox._stylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("primary")))))));
 BA.debugLineNum = 37;BA.debugLine="setCheckState(UNCHECKED_STATE) 'set initial value";
Debug.ShouldStop(16);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.materialcheckbox.class, "_setcheckstate",(Object)(__ref.getField(true,"_unchecked_state")));
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
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (materialcheckbox) ","materialcheckbox",20,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "materialcheckbox","getbase", __ref);}
 BA.debugLineNum = 51;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="Return mBase";
Debug.ShouldStop(524288);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Initialize (materialcheckbox) ","materialcheckbox",20,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "materialcheckbox","initialize", __ref, _ba, _callback, _eventname);}
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
public static RemoteObject  _isindeterminate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsIndeterminate (materialcheckbox) ","materialcheckbox",20,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("isindeterminate")) { return __ref.runUserSub(false, "materialcheckbox","isindeterminate", __ref);}
 BA.debugLineNum = 133;BA.debugLine="Public Sub IsIndeterminate As Boolean";
Debug.ShouldStop(16);
 BA.debugLineNum = 135;BA.debugLine="Return CheckedLabel.Alpha = \"0.6\"";
Debug.ShouldStop(64);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(false,"_checkedlabel").runMethod(true,"getAlpha"),BA.numberCast(double.class, "0.6")));
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeeffects(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("removeEffects (materialcheckbox) ","materialcheckbox",20,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "materialcheckbox","removeeffects", __ref);}
 BA.debugLineNum = 89;BA.debugLine="Public Sub removeEffects()";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 91;BA.debugLine="ControlsUtils.removePaneEffect(CheckboxPane)";
Debug.ShouldStop(67108864);
materialcheckbox._controlsutils.runVoidMethod ("_removepaneeffect",(Object)(__ref.getField(false,"_checkboxpane")));
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
		Debug.PushSubsStack("SetBg (materialcheckbox) ","materialcheckbox",20,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "materialcheckbox","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 59;BA.debugLine="Public Sub SetBg(color As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 61;BA.debugLine="CSSUtils.SetStyleProperty( CheckboxPane, \"-fx-bac";
Debug.ShouldStop(268435456);
materialcheckbox._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_checkboxpane").getObject()),(Object)(BA.ObjectToString("-fx-background-color")),(Object)(_color));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("setBorder (materialcheckbox) ","materialcheckbox",20,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "materialcheckbox","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 71;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(64);
 BA.debugLineNum = 73;BA.debugLine="ControlsUtils.setPaneBorder(CheckboxPane, color,";
Debug.ShouldStop(256);
materialcheckbox._controlsutils.runVoidMethod ("_setpaneborder",(Object)(__ref.getField(false,"_checkboxpane")),(Object)(_color),(Object)(_width));
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
		Debug.PushSubsStack("setBorderRadius (materialcheckbox) ","materialcheckbox",20,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "materialcheckbox","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 77;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 79;BA.debugLine="ControlsUtils.setPaneBorderRadius(CheckboxPane, r";
Debug.ShouldStop(16384);
materialcheckbox._controlsutils.runVoidMethod ("_setpaneborderradius",(Object)(__ref.getField(false,"_checkboxpane")),(Object)(_radius));
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
public static RemoteObject  _setcheckedcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setCheckedColor (materialcheckbox) ","materialcheckbox",20,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("setcheckedcolor")) { return __ref.runUserSub(false, "materialcheckbox","setcheckedcolor", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 97;BA.debugLine="Public Sub setCheckedColor(color As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 99;BA.debugLine="CSSUtils.SetStyleProperty( CheckedLabel, \"-fx-bac";
Debug.ShouldStop(4);
materialcheckbox._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_checkedlabel").getObject()),(Object)(BA.ObjectToString("-fx-background-color")),(Object)(_color));
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
public static RemoteObject  _setcheckstate(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setCheckState (materialcheckbox) ","materialcheckbox",20,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("setcheckstate")) { return __ref.runUserSub(false, "materialcheckbox","setcheckstate", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 103;BA.debugLine="Public Sub setCheckState(value As Int)";
Debug.ShouldStop(64);
 BA.debugLineNum = 105;BA.debugLine="If value = UNCHECKED_STATE Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_value,BA.numberCast(double.class, __ref.getField(true,"_unchecked_state")))) { 
 BA.debugLineNum = 107;BA.debugLine="CheckedLabel.Visible = False";
Debug.ShouldStop(1024);
__ref.getField(false,"_checkedlabel").runMethod(true,"setVisible",materialcheckbox.__c.getField(true,"False"));
 BA.debugLineNum = 108;BA.debugLine="CheckedLabel.SetAlphaAnimated(300, 0 )";
Debug.ShouldStop(2048);
__ref.getField(false,"_checkedlabel").runVoidMethod ("SetAlphaAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(double.class, 0)));
 }else 
{ BA.debugLineNum = 110;BA.debugLine="Else if value = CHECKED_STATE Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_value,BA.numberCast(double.class, __ref.getField(true,"_checked_state")))) { 
 BA.debugLineNum = 112;BA.debugLine="CheckedLabel.Visible = True";
Debug.ShouldStop(32768);
__ref.getField(false,"_checkedlabel").runMethod(true,"setVisible",materialcheckbox.__c.getField(true,"True"));
 BA.debugLineNum = 113;BA.debugLine="CheckedLabel.SetAlphaAnimated(300, 1 )";
Debug.ShouldStop(65536);
__ref.getField(false,"_checkedlabel").runVoidMethod ("SetAlphaAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(double.class, 1)));
 }else {
 BA.debugLineNum = 117;BA.debugLine="CheckedLabel.SetAlphaAnimated(300, 0.6 )";
Debug.ShouldStop(1048576);
__ref.getField(false,"_checkedlabel").runVoidMethod ("SetAlphaAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(double.class, 0.6)));
 BA.debugLineNum = 118;BA.debugLine="CheckedLabel.Visible = True";
Debug.ShouldStop(2097152);
__ref.getField(false,"_checkedlabel").runMethod(true,"setVisible",materialcheckbox.__c.getField(true,"True"));
 }}
;
 BA.debugLineNum = 123;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checke";
Debug.ShouldStop(67108864);
materialcheckbox.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_CheckedChanged"))),(Object)((_value)));
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seticon(RemoteObject __ref,RemoteObject _iconcode) throws Exception{
try {
		Debug.PushSubsStack("setIcon (materialcheckbox) ","materialcheckbox",20,__ref.getField(false, "ba"),__ref,140);
if (RapidSub.canDelegate("seticon")) { return __ref.runUserSub(false, "materialcheckbox","seticon", __ref, _iconcode);}
Debug.locals.put("iconCode", _iconcode);
 BA.debugLineNum = 140;BA.debugLine="Public Sub setIcon(iconCode As Int)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 142;BA.debugLine="CheckedLabel.Text = Chr(iconCode)";
Debug.ShouldStop(8192);
__ref.getField(false,"_checkedlabel").runMethod(true,"setText",BA.ObjectToString(materialcheckbox.__c.runMethod(true,"Chr",(Object)(_iconcode))));
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
public static RemoteObject  _setpaneeffect(RemoteObject __ref,RemoteObject _effect) throws Exception{
try {
		Debug.PushSubsStack("setPaneEffect (materialcheckbox) ","materialcheckbox",20,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("setpaneeffect")) { return __ref.runUserSub(false, "materialcheckbox","setpaneeffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 83;BA.debugLine="Public Sub setPaneEffect(effect As String)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 85;BA.debugLine="ControlsUtils.setPaneEffect(CheckboxPane, effect)";
Debug.ShouldStop(1048576);
materialcheckbox._controlsutils.runVoidMethod ("_setpaneeffect",(Object)(__ref.getField(false,"_checkboxpane")),(Object)(_effect));
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
public static RemoteObject  _setrotationx(RemoteObject __ref,RemoteObject _angle) throws Exception{
try {
		Debug.PushSubsStack("setRotationX (materialcheckbox) ","materialcheckbox",20,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("setrotationx")) { return __ref.runUserSub(false, "materialcheckbox","setrotationx", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 65;BA.debugLine="Public Sub setRotationX(angle As Float)";
Debug.ShouldStop(1);
 BA.debugLineNum = 67;BA.debugLine="ControlsUtils.setPaneRotationX(CheckboxPane, angl";
Debug.ShouldStop(4);
materialcheckbox._controlsutils.runVoidMethod ("_setpanerotationx",(Object)(__ref.getField(false,"_checkboxpane")),(Object)(_angle));
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
}