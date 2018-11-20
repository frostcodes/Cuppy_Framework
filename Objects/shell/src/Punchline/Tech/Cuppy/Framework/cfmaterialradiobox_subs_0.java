package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cfmaterialradiobox_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (cfmaterialradiobox) ","cfmaterialradiobox",19,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "cfmaterialradiobox","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 68;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(8);
 BA.debugLineNum = 70;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize";
Debug.ShouldStop(32);
cfmaterialradiobox.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_Resize"))),(Object)((_width)),(Object)((_height)));
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
public static RemoteObject  _checkboxpane_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("CheckboxPane_MousePressed (cfmaterialradiobox) ","cfmaterialradiobox",19,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("checkboxpane_mousepressed")) { return __ref.runUserSub(false, "cfmaterialradiobox","checkboxpane_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 170;BA.debugLine="Private Sub CheckboxPane_MousePressed (EventData A";
Debug.ShouldStop(512);
 BA.debugLineNum = 172;BA.debugLine="CheckboxPane.RequestFocus 'set focus";
Debug.ShouldStop(2048);
__ref.getField(false,"_checkboxpane").runVoidMethod ("RequestFocus");
 BA.debugLineNum = 174;BA.debugLine="If Not(Checked) Or IsIndeterminate Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(".",cfmaterialradiobox.__c.runMethod(true,"Not",(Object)(__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialradiobox.class, "_checked")))) || RemoteObject.solveBoolean(".",__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialradiobox.class, "_isindeterminate"))) { 
 BA.debugLineNum = 176;BA.debugLine="SetCheckState(CHECKED_STATE)";
Debug.ShouldStop(32768);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialradiobox.class, "_setcheckstate",(Object)(__ref.getField(true,"_checked_state")));
 }else {
 BA.debugLineNum = 180;BA.debugLine="SetCheckState(UNCHECKED_STATE)";
Debug.ShouldStop(524288);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialradiobox.class, "_setcheckstate",(Object)(__ref.getField(true,"_unchecked_state")));
 };
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Checked (cfmaterialradiobox) ","cfmaterialradiobox",19,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("checked")) { return __ref.runUserSub(false, "cfmaterialradiobox","checked", __ref);}
 BA.debugLineNum = 158;BA.debugLine="Public Sub Checked As Boolean";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 160;BA.debugLine="Return CheckedPane.Visible";
Debug.ShouldStop(-2147483648);
if (true) return __ref.getField(false,"_checkedpane").runMethod(true,"getVisible");
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private fx As JFX";
cfmaterialradiobox._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cfmaterialradiobox._fx);
 //BA.debugLineNum = 16;BA.debugLine="Private mEventName As String 'ignore";
cfmaterialradiobox._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",cfmaterialradiobox._meventname);
 //BA.debugLineNum = 17;BA.debugLine="Private mCallBack As Object 'ignore";
cfmaterialradiobox._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",cfmaterialradiobox._mcallback);
 //BA.debugLineNum = 18;BA.debugLine="Private mBase As Pane";
cfmaterialradiobox._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",cfmaterialradiobox._mbase);
 //BA.debugLineNum = 20;BA.debugLine="Public CheckboxPane As Pane";
cfmaterialradiobox._checkboxpane = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_checkboxpane",cfmaterialradiobox._checkboxpane);
 //BA.debugLineNum = 21;BA.debugLine="Public CheckedPane As Pane";
cfmaterialradiobox._checkedpane = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_checkedpane",cfmaterialradiobox._checkedpane);
 //BA.debugLineNum = 24;BA.debugLine="Public UNCHECKED_STATE As Int = 0";
cfmaterialradiobox._unchecked_state = BA.numberCast(int.class, 0);__ref.setField("_unchecked_state",cfmaterialradiobox._unchecked_state);
 //BA.debugLineNum = 25;BA.debugLine="Public CHECKED_STATE As Int = 1";
cfmaterialradiobox._checked_state = BA.numberCast(int.class, 1);__ref.setField("_checked_state",cfmaterialradiobox._checked_state);
 //BA.debugLineNum = 26;BA.debugLine="Public INDETERMINATE_STATE As Int = 2";
cfmaterialradiobox._indeterminate_state = BA.numberCast(int.class, 2);__ref.setField("_indeterminate_state",cfmaterialradiobox._indeterminate_state);
 //BA.debugLineNum = 29;BA.debugLine="Private FirstTime As Boolean = False";
cfmaterialradiobox._firsttime = cfmaterialradiobox.__c.getField(true,"False");__ref.setField("_firsttime",cfmaterialradiobox._firsttime);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (cfmaterialradiobox) ","cfmaterialradiobox",19,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "cfmaterialradiobox","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _checkedstate = RemoteObject.createImmutable("");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 37;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="mBase = Base";
Debug.ShouldStop(32);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 39;BA.debugLine="mBase.LoadLayout(\"CFMaterialRadioBoxUI\")";
Debug.ShouldStop(64);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("CFMaterialRadioBoxUI")));
 BA.debugLineNum = 42;BA.debugLine="setBorder(CFStyleManager.DefaultTheme.Get(\"divide";
Debug.ShouldStop(512);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialradiobox.class, "_setborder",(Object)(BA.ObjectToString(cfmaterialradiobox._cfstylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("divider")))))),(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 44;BA.debugLine="setCheckedColor(CFStyleManager.DefaultTheme.Get(\"";
Debug.ShouldStop(2048);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialradiobox.class, "_setcheckedcolor",(Object)(BA.ObjectToString(cfmaterialradiobox._cfstylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("primary")))))));
 BA.debugLineNum = 48;BA.debugLine="Dim checkedState As String = Props.Get(\"CheckedSt";
Debug.ShouldStop(32768);
_checkedstate = BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CheckedState")))));Debug.locals.put("checkedState", _checkedstate);Debug.locals.put("checkedState", _checkedstate);
 BA.debugLineNum = 52;BA.debugLine="If checkedState = \"UNCHECKED\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_checkedstate,BA.ObjectToString("UNCHECKED"))) { 
 BA.debugLineNum = 54;BA.debugLine="setCheckState(UNCHECKED_STATE)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialradiobox.class, "_setcheckstate",(Object)(__ref.getField(true,"_unchecked_state")));
 }else 
{ BA.debugLineNum = 56;BA.debugLine="else If checkedState = \"CHECKED\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_checkedstate,BA.ObjectToString("CHECKED"))) { 
 BA.debugLineNum = 58;BA.debugLine="setCheckState(CHECKED_STATE)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialradiobox.class, "_setcheckstate",(Object)(__ref.getField(true,"_checked_state")));
 }else 
{ BA.debugLineNum = 60;BA.debugLine="else If checkedState = \"INDETERMINATE\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_checkedstate,BA.ObjectToString("INDETERMINATE"))) { 
 BA.debugLineNum = 62;BA.debugLine="setCheckState(INDETERMINATE_STATE)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialradiobox.class, "_setcheckstate",(Object)(__ref.getField(true,"_indeterminate_state")));
 }}}
;
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
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (cfmaterialradiobox) ","cfmaterialradiobox",19,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "cfmaterialradiobox","getbase", __ref);}
 BA.debugLineNum = 74;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="Return mBase";
Debug.ShouldStop(1024);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Initialize (cfmaterialradiobox) ","cfmaterialradiobox",19,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cfmaterialradiobox","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 32;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(1);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 34;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(2);
__ref.setField ("_mcallback",_callback);
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
public static RemoteObject  _isindeterminate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsIndeterminate (cfmaterialradiobox) ","cfmaterialradiobox",19,__ref.getField(false, "ba"),__ref,164);
if (RapidSub.canDelegate("isindeterminate")) { return __ref.runUserSub(false, "cfmaterialradiobox","isindeterminate", __ref);}
 BA.debugLineNum = 164;BA.debugLine="Public Sub IsIndeterminate As Boolean";
Debug.ShouldStop(8);
 BA.debugLineNum = 166;BA.debugLine="Return CheckedPane.Alpha = \"0.6\"";
Debug.ShouldStop(32);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(false,"_checkedpane").runMethod(true,"getAlpha"),BA.numberCast(double.class, "0.6")));
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("RemoveEffects (cfmaterialradiobox) ","cfmaterialradiobox",19,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "cfmaterialradiobox","removeeffects", __ref);}
 BA.debugLineNum = 112;BA.debugLine="Public Sub RemoveEffects()";
Debug.ShouldStop(32768);
 BA.debugLineNum = 114;BA.debugLine="CFControlsUtils.RemoveEffect(CheckboxPane)";
Debug.ShouldStop(131072);
cfmaterialradiobox._cfcontrolsutils.runVoidMethod ("_removeeffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_checkboxpane").getObject()));
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("setBg (cfmaterialradiobox) ","cfmaterialradiobox",19,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "cfmaterialradiobox","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 82;BA.debugLine="Public Sub setBg(color As String)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 84;BA.debugLine="CFControlsUtils.SetBG( CheckboxPane, color)";
Debug.ShouldStop(524288);
cfmaterialradiobox._cfcontrolsutils.runVoidMethod ("_setbg",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_checkboxpane").getObject()),(Object)(_color));
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
public static RemoteObject  _setborder(RemoteObject __ref,RemoteObject _color,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("setBorder (cfmaterialradiobox) ","cfmaterialradiobox",19,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "cfmaterialradiobox","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 94;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 96;BA.debugLine="CFControlsUtils.SetBorder(CheckboxPane, color, wi";
Debug.ShouldStop(-2147483648);
cfmaterialradiobox._cfcontrolsutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_checkboxpane").getObject()),(Object)(_color),(Object)(_width));
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("setBorderRadius (cfmaterialradiobox) ","cfmaterialradiobox",19,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "cfmaterialradiobox","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 100;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(8);
 BA.debugLineNum = 102;BA.debugLine="CFControlsUtils.SetBorderRadius(CheckboxPane, rad";
Debug.ShouldStop(32);
cfmaterialradiobox._cfcontrolsutils.runVoidMethod ("_setborderradius",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_checkboxpane").getObject()),(Object)(_radius));
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
public static RemoteObject  _setcheckedcolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setCheckedColor (cfmaterialradiobox) ","cfmaterialradiobox",19,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("setcheckedcolor")) { return __ref.runUserSub(false, "cfmaterialradiobox","setcheckedcolor", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 120;BA.debugLine="Public Sub setCheckedColor(color As String)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 122;BA.debugLine="CFControlsUtils.SetBG( CheckedPane, color)";
Debug.ShouldStop(33554432);
cfmaterialradiobox._cfcontrolsutils.runVoidMethod ("_setbg",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_checkedpane").getObject()),(Object)(_color));
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
public static RemoteObject  _setcheckstate(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setCheckState (cfmaterialradiobox) ","cfmaterialradiobox",19,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("setcheckstate")) { return __ref.runUserSub(false, "cfmaterialradiobox","setcheckstate", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 126;BA.debugLine="Public Sub setCheckState(value As Int)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 128;BA.debugLine="If value = UNCHECKED_STATE Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_value,BA.numberCast(double.class, __ref.getField(true,"_unchecked_state")))) { 
 BA.debugLineNum = 130;BA.debugLine="CheckedPane.Visible = False";
Debug.ShouldStop(2);
__ref.getField(false,"_checkedpane").runMethod(true,"setVisible",cfmaterialradiobox.__c.getField(true,"False"));
 BA.debugLineNum = 131;BA.debugLine="CheckedPane.SetAlphaAnimated(300, 0 )";
Debug.ShouldStop(4);
__ref.getField(false,"_checkedpane").runVoidMethod ("SetAlphaAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(double.class, 0)));
 }else 
{ BA.debugLineNum = 133;BA.debugLine="Else if value = CHECKED_STATE Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_value,BA.numberCast(double.class, __ref.getField(true,"_checked_state")))) { 
 BA.debugLineNum = 135;BA.debugLine="CheckedPane.Visible = True";
Debug.ShouldStop(64);
__ref.getField(false,"_checkedpane").runMethod(true,"setVisible",cfmaterialradiobox.__c.getField(true,"True"));
 BA.debugLineNum = 136;BA.debugLine="CheckedPane.SetAlphaAnimated(300, 1 )";
Debug.ShouldStop(128);
__ref.getField(false,"_checkedpane").runVoidMethod ("SetAlphaAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(double.class, 1)));
 }else {
 BA.debugLineNum = 140;BA.debugLine="CheckedPane.SetAlphaAnimated(300, 0.6 )";
Debug.ShouldStop(2048);
__ref.getField(false,"_checkedpane").runVoidMethod ("SetAlphaAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(double.class, 0.6)));
 BA.debugLineNum = 141;BA.debugLine="CheckedPane.Visible = True";
Debug.ShouldStop(4096);
__ref.getField(false,"_checkedpane").runMethod(true,"setVisible",cfmaterialradiobox.__c.getField(true,"True"));
 }}
;
 BA.debugLineNum = 145;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(65536);
if (__ref.getField(true,"_firsttime").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 148;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checke";
Debug.ShouldStop(524288);
cfmaterialradiobox.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_CheckedChanged"))),(Object)((_value)));
 }else {
 BA.debugLineNum = 152;BA.debugLine="FirstTime = True";
Debug.ShouldStop(8388608);
__ref.setField ("_firsttime",cfmaterialradiobox.__c.getField(true,"True"));
 };
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
public static RemoteObject  _seteffect(RemoteObject __ref,RemoteObject _effect) throws Exception{
try {
		Debug.PushSubsStack("setEffect (cfmaterialradiobox) ","cfmaterialradiobox",19,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("seteffect")) { return __ref.runUserSub(false, "cfmaterialradiobox","seteffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 106;BA.debugLine="Public Sub setEffect(effect As String)";
Debug.ShouldStop(512);
 BA.debugLineNum = 108;BA.debugLine="CFControlsUtils.SetEffect(CheckboxPane, effect)";
Debug.ShouldStop(2048);
cfmaterialradiobox._cfcontrolsutils.runVoidMethod ("_seteffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_checkboxpane").getObject()),(Object)(_effect));
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("setRotation (cfmaterialradiobox) ","cfmaterialradiobox",19,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("setrotation")) { return __ref.runUserSub(false, "cfmaterialradiobox","setrotation", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 88;BA.debugLine="Public Sub setRotation(angle As Float)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 90;BA.debugLine="CFControlsUtils.SetRotation(CheckboxPane, angle)";
Debug.ShouldStop(33554432);
cfmaterialradiobox._cfcontrolsutils.runVoidMethod ("_setrotation",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_checkboxpane").getObject()),(Object)(_angle));
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
}