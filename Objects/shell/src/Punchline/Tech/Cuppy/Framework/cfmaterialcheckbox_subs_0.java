package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cfmaterialcheckbox_subs_0 {


public static RemoteObject  _addtoparent(RemoteObject __ref,RemoteObject _parent,RemoteObject _left,RemoteObject _top,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("AddToParent (cfmaterialcheckbox) ","cfmaterialcheckbox",8,__ref.getField(false, "ba"),__ref,197);
if (RapidSub.canDelegate("addtoparent")) { return __ref.runUserSub(false, "cfmaterialcheckbox","addtoparent", __ref, _parent, _left, _top, _width, _height);}
Debug.locals.put("Parent", _parent);
Debug.locals.put("Left", _left);
Debug.locals.put("Top", _top);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 197;BA.debugLine="Public Sub AddToParent(Parent As Pane, Left As Int";
Debug.ShouldStop(16);
 BA.debugLineNum = 199;BA.debugLine="mBase.Initialize(\"mBase\")";
Debug.ShouldStop(64);
__ref.getField(false,"_mbase").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mBase")));
 BA.debugLineNum = 200;BA.debugLine="Parent.AddNode(mBase, Left, Top, Width, Height)";
Debug.ShouldStop(128);
_parent.runVoidMethod ("AddNode",(Object)((__ref.getField(false,"_mbase").getObject())),(Object)(BA.numberCast(double.class, _left)),(Object)(BA.numberCast(double.class, _top)),(Object)(BA.numberCast(double.class, _width)),(Object)(BA.numberCast(double.class, _height)));
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (cfmaterialcheckbox) ","cfmaterialcheckbox",8,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "cfmaterialcheckbox","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 81;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(65536);
 BA.debugLineNum = 83;BA.debugLine="CheckboxPane.PrefWidth = Width";
Debug.ShouldStop(262144);
__ref.getField(false,"_checkboxpane").runMethod(true,"setPrefWidth",_width);
 BA.debugLineNum = 84;BA.debugLine="CheckedLabel.PrefWidth = Width";
Debug.ShouldStop(524288);
__ref.getField(false,"_checkedlabel").runMethod(true,"setPrefWidth",_width);
 BA.debugLineNum = 86;BA.debugLine="CheckboxPane.PrefHeight = Height";
Debug.ShouldStop(2097152);
__ref.getField(false,"_checkboxpane").runMethod(true,"setPrefHeight",_height);
 BA.debugLineNum = 87;BA.debugLine="CheckedLabel.PrefHeight = Height";
Debug.ShouldStop(4194304);
__ref.getField(false,"_checkedlabel").runMethod(true,"setPrefHeight",_height);
 BA.debugLineNum = 89;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
Debug.ShouldStop(16777216);
cfmaterialcheckbox.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_Resize"))),(Object)((_width)),(Object)((_height)));
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
public static RemoteObject  _checkboxpane_mouseentered(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("CheckboxPane_MouseEntered (cfmaterialcheckbox) ","cfmaterialcheckbox",8,__ref.getField(false, "ba"),__ref,220);
if (RapidSub.canDelegate("checkboxpane_mouseentered")) { return __ref.runUserSub(false, "cfmaterialcheckbox","checkboxpane_mouseentered", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 220;BA.debugLine="Private Sub CheckboxPane_MouseEntered (EventData A";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 222;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEn";
Debug.ShouldStop(536870912);
cfmaterialcheckbox.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MouseEntered"))),(Object)((_eventdata)));
 BA.debugLineNum = 224;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkboxpane_mouseexited(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("CheckboxPane_MouseExited (cfmaterialcheckbox) ","cfmaterialcheckbox",8,__ref.getField(false, "ba"),__ref,226);
if (RapidSub.canDelegate("checkboxpane_mouseexited")) { return __ref.runUserSub(false, "cfmaterialcheckbox","checkboxpane_mouseexited", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 226;BA.debugLine="Private Sub CheckboxPane_MouseExited (EventData As";
Debug.ShouldStop(2);
 BA.debugLineNum = 228;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEx";
Debug.ShouldStop(8);
cfmaterialcheckbox.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MouseExited"))),(Object)((_eventdata)));
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("CheckboxPane_MousePressed (cfmaterialcheckbox) ","cfmaterialcheckbox",8,__ref.getField(false, "ba"),__ref,204);
if (RapidSub.canDelegate("checkboxpane_mousepressed")) { return __ref.runUserSub(false, "cfmaterialcheckbox","checkboxpane_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 204;BA.debugLine="Private Sub CheckboxPane_MousePressed (EventData A";
Debug.ShouldStop(2048);
 BA.debugLineNum = 206;BA.debugLine="CheckboxPane.RequestFocus 'set focus";
Debug.ShouldStop(8192);
__ref.getField(false,"_checkboxpane").runVoidMethod ("RequestFocus");
 BA.debugLineNum = 208;BA.debugLine="If Not(Checked) Or IsIndeterminate Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(".",cfmaterialcheckbox.__c.runMethod(true,"Not",(Object)(__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox.class, "_checked")))) || RemoteObject.solveBoolean(".",__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox.class, "_isindeterminate"))) { 
 BA.debugLineNum = 210;BA.debugLine="setCheckState(CHECKED_STATE)";
Debug.ShouldStop(131072);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox.class, "_setcheckstate",(Object)(__ref.getField(true,"_checked_state")));
 }else {
 BA.debugLineNum = 214;BA.debugLine="setCheckState(UNCHECKED_STATE)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox.class, "_setcheckstate",(Object)(__ref.getField(true,"_unchecked_state")));
 };
 BA.debugLineNum = 218;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Checked (cfmaterialcheckbox) ","cfmaterialcheckbox",8,__ref.getField(false, "ba"),__ref,177);
if (RapidSub.canDelegate("checked")) { return __ref.runUserSub(false, "cfmaterialcheckbox","checked", __ref);}
 BA.debugLineNum = 177;BA.debugLine="Public Sub Checked As Boolean";
Debug.ShouldStop(65536);
 BA.debugLineNum = 179;BA.debugLine="Return CheckedLabel.Visible";
Debug.ShouldStop(262144);
if (true) return __ref.getField(false,"_checkedlabel").runMethod(true,"getVisible");
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(false);
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
cfmaterialcheckbox._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cfmaterialcheckbox._fx);
 //BA.debugLineNum = 30;BA.debugLine="Private mEventName As String 'ignore";
cfmaterialcheckbox._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",cfmaterialcheckbox._meventname);
 //BA.debugLineNum = 31;BA.debugLine="Private mCallBack As Object 'ignore";
cfmaterialcheckbox._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",cfmaterialcheckbox._mcallback);
 //BA.debugLineNum = 32;BA.debugLine="Private mBase As Pane";
cfmaterialcheckbox._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",cfmaterialcheckbox._mbase);
 //BA.debugLineNum = 34;BA.debugLine="Public CheckedLabel As Label";
cfmaterialcheckbox._checkedlabel = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_checkedlabel",cfmaterialcheckbox._checkedlabel);
 //BA.debugLineNum = 35;BA.debugLine="Public CheckboxPane As Pane";
cfmaterialcheckbox._checkboxpane = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_checkboxpane",cfmaterialcheckbox._checkboxpane);
 //BA.debugLineNum = 38;BA.debugLine="Public UNCHECKED_STATE As Int = 0";
cfmaterialcheckbox._unchecked_state = BA.numberCast(int.class, 0);__ref.setField("_unchecked_state",cfmaterialcheckbox._unchecked_state);
 //BA.debugLineNum = 39;BA.debugLine="Public CHECKED_STATE As Int = 1";
cfmaterialcheckbox._checked_state = BA.numberCast(int.class, 1);__ref.setField("_checked_state",cfmaterialcheckbox._checked_state);
 //BA.debugLineNum = 40;BA.debugLine="Public INDETERMINATE_STATE As Int = 2";
cfmaterialcheckbox._indeterminate_state = BA.numberCast(int.class, 2);__ref.setField("_indeterminate_state",cfmaterialcheckbox._indeterminate_state);
 //BA.debugLineNum = 43;BA.debugLine="Private FirstTime As Boolean = False";
cfmaterialcheckbox._firsttime = cfmaterialcheckbox.__c.getField(true,"False");__ref.setField("_firsttime",cfmaterialcheckbox._firsttime);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (cfmaterialcheckbox) ","cfmaterialcheckbox",8,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "cfmaterialcheckbox","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _checkedstate = RemoteObject.createImmutable("");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 52;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="mBase = Base";
Debug.ShouldStop(1048576);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 54;BA.debugLine="mBase.LoadLayout(\"CFMaterialCheckboxUI\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("CFMaterialCheckboxUI")));
 BA.debugLineNum = 56;BA.debugLine="setBorder(CFStyleManager.DefaultTheme.Get(\"divide";
Debug.ShouldStop(8388608);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox.class, "_setborder",(Object)(BA.ObjectToString(cfmaterialcheckbox._cfstylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("divider")))))),(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 57;BA.debugLine="setCheckedColor(CFStyleManager.DefaultTheme.Get(\"";
Debug.ShouldStop(16777216);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox.class, "_setcheckedcolor",(Object)(BA.ObjectToString(cfmaterialcheckbox._cfstylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("primary")))))));
 BA.debugLineNum = 60;BA.debugLine="Dim checkedState As String = Props.Get(\"CheckedSt";
Debug.ShouldStop(134217728);
_checkedstate = BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CheckedState")))));Debug.locals.put("checkedState", _checkedstate);Debug.locals.put("checkedState", _checkedstate);
 BA.debugLineNum = 64;BA.debugLine="If checkedState = \"UNCHECKED\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_checkedstate,BA.ObjectToString("UNCHECKED"))) { 
 BA.debugLineNum = 66;BA.debugLine="setCheckState(UNCHECKED_STATE)";
Debug.ShouldStop(2);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox.class, "_setcheckstate",(Object)(__ref.getField(true,"_unchecked_state")));
 }else 
{ BA.debugLineNum = 68;BA.debugLine="else If checkedState = \"CHECKED\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_checkedstate,BA.ObjectToString("CHECKED"))) { 
 BA.debugLineNum = 70;BA.debugLine="setCheckState(CHECKED_STATE)";
Debug.ShouldStop(32);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox.class, "_setcheckstate",(Object)(__ref.getField(true,"_checked_state")));
 }else 
{ BA.debugLineNum = 72;BA.debugLine="else If checkedState = \"INDETERMINATE\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_checkedstate,BA.ObjectToString("INDETERMINATE"))) { 
 BA.debugLineNum = 74;BA.debugLine="setCheckState(INDETERMINATE_STATE)";
Debug.ShouldStop(512);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox.class, "_setcheckstate",(Object)(__ref.getField(true,"_indeterminate_state")));
 }}}
;
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
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (cfmaterialcheckbox) ","cfmaterialcheckbox",8,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "cfmaterialcheckbox","getbase", __ref);}
 BA.debugLineNum = 93;BA.debugLine="Public Sub GetBase As Pane";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="Return mBase";
Debug.ShouldStop(536870912);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Initialize (cfmaterialcheckbox) ","cfmaterialcheckbox",8,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cfmaterialcheckbox","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 47;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(32768);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 49;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(65536);
__ref.setField ("_mcallback",_callback);
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("IsIndeterminate (cfmaterialcheckbox) ","cfmaterialcheckbox",8,__ref.getField(false, "ba"),__ref,183);
if (RapidSub.canDelegate("isindeterminate")) { return __ref.runUserSub(false, "cfmaterialcheckbox","isindeterminate", __ref);}
 BA.debugLineNum = 183;BA.debugLine="Public Sub IsIndeterminate As Boolean";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 185;BA.debugLine="Return CheckedLabel.Alpha = \"0.6\"";
Debug.ShouldStop(16777216);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(false,"_checkedlabel").runMethod(true,"getAlpha"),BA.numberCast(double.class, "0.6")));
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("RemoveEffects (cfmaterialcheckbox) ","cfmaterialcheckbox",8,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "cfmaterialcheckbox","removeeffects", __ref);}
 BA.debugLineNum = 131;BA.debugLine="Public Sub RemoveEffects()";
Debug.ShouldStop(4);
 BA.debugLineNum = 133;BA.debugLine="CFControlsUtils.RemoveEffect(CheckboxPane)";
Debug.ShouldStop(16);
cfmaterialcheckbox._cfcontrolsutils.runVoidMethod ("_removeeffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_checkboxpane").getObject()));
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("setBg (cfmaterialcheckbox) ","cfmaterialcheckbox",8,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "cfmaterialcheckbox","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 101;BA.debugLine="Public Sub setBg(color As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 103;BA.debugLine="CFControlsUtils.SetBG( CheckboxPane, color)";
Debug.ShouldStop(64);
cfmaterialcheckbox._cfcontrolsutils.runVoidMethod ("_setbg",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_checkboxpane").getObject()),(Object)(_color));
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
public static RemoteObject  _setborder(RemoteObject __ref,RemoteObject _color,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("setBorder (cfmaterialcheckbox) ","cfmaterialcheckbox",8,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "cfmaterialcheckbox","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 113;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(65536);
 BA.debugLineNum = 115;BA.debugLine="CFControlsUtils.SetBorder(CheckboxPane, color, wi";
Debug.ShouldStop(262144);
cfmaterialcheckbox._cfcontrolsutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_checkboxpane").getObject()),(Object)(_color),(Object)(_width));
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
public static RemoteObject  _setborderradius(RemoteObject __ref,RemoteObject _radius) throws Exception{
try {
		Debug.PushSubsStack("setBorderRadius (cfmaterialcheckbox) ","cfmaterialcheckbox",8,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "cfmaterialcheckbox","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 119;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 121;BA.debugLine="CFControlsUtils.SetBorderRadius(CheckboxPane, rad";
Debug.ShouldStop(16777216);
cfmaterialcheckbox._cfcontrolsutils.runVoidMethod ("_setborderradius",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_checkboxpane").getObject()),(Object)(_radius));
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("setCheckedColor (cfmaterialcheckbox) ","cfmaterialcheckbox",8,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("setcheckedcolor")) { return __ref.runUserSub(false, "cfmaterialcheckbox","setcheckedcolor", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 139;BA.debugLine="Public Sub setCheckedColor(color As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 141;BA.debugLine="CFControlsUtils.setBG(CheckedLabel, color)";
Debug.ShouldStop(4096);
cfmaterialcheckbox._cfcontrolsutils.runVoidMethod ("_setbg",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_checkedlabel").getObject()),(Object)(_color));
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
public static RemoteObject  _setcheckstate(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("setCheckState (cfmaterialcheckbox) ","cfmaterialcheckbox",8,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("setcheckstate")) { return __ref.runUserSub(false, "cfmaterialcheckbox","setcheckstate", __ref, _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 145;BA.debugLine="Public Sub setCheckState(value As Int)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 147;BA.debugLine="If value = UNCHECKED_STATE Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_value,BA.numberCast(double.class, __ref.getField(true,"_unchecked_state")))) { 
 BA.debugLineNum = 149;BA.debugLine="CheckedLabel.Visible = False";
Debug.ShouldStop(1048576);
__ref.getField(false,"_checkedlabel").runMethod(true,"setVisible",cfmaterialcheckbox.__c.getField(true,"False"));
 BA.debugLineNum = 150;BA.debugLine="CheckedLabel.SetAlphaAnimated(300, 0 )";
Debug.ShouldStop(2097152);
__ref.getField(false,"_checkedlabel").runVoidMethod ("SetAlphaAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(double.class, 0)));
 }else 
{ BA.debugLineNum = 152;BA.debugLine="Else if value = CHECKED_STATE Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_value,BA.numberCast(double.class, __ref.getField(true,"_checked_state")))) { 
 BA.debugLineNum = 154;BA.debugLine="CheckedLabel.Visible = True";
Debug.ShouldStop(33554432);
__ref.getField(false,"_checkedlabel").runMethod(true,"setVisible",cfmaterialcheckbox.__c.getField(true,"True"));
 BA.debugLineNum = 155;BA.debugLine="CheckedLabel.SetAlphaAnimated(300, 1 )";
Debug.ShouldStop(67108864);
__ref.getField(false,"_checkedlabel").runVoidMethod ("SetAlphaAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(double.class, 1)));
 }else {
 BA.debugLineNum = 159;BA.debugLine="CheckedLabel.SetAlphaAnimated(300, 0.6 )";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_checkedlabel").runVoidMethod ("SetAlphaAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(double.class, 0.6)));
 BA.debugLineNum = 160;BA.debugLine="CheckedLabel.Visible = True";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_checkedlabel").runMethod(true,"setVisible",cfmaterialcheckbox.__c.getField(true,"True"));
 }}
;
 BA.debugLineNum = 164;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(8);
if (__ref.getField(true,"_firsttime").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 167;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checke";
Debug.ShouldStop(64);
cfmaterialcheckbox.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_CheckedChanged"))),(Object)((_value)));
 }else {
 BA.debugLineNum = 171;BA.debugLine="FirstTime = True";
Debug.ShouldStop(1024);
__ref.setField ("_firsttime",cfmaterialcheckbox.__c.getField(true,"True"));
 };
 BA.debugLineNum = 175;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setEffect (cfmaterialcheckbox) ","cfmaterialcheckbox",8,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("seteffect")) { return __ref.runUserSub(false, "cfmaterialcheckbox","seteffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 125;BA.debugLine="Public Sub setEffect(effect As String)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 127;BA.debugLine="CFControlsUtils.SetEffect(CheckboxPane, effect)";
Debug.ShouldStop(1073741824);
cfmaterialcheckbox._cfcontrolsutils.runVoidMethod ("_seteffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_checkboxpane").getObject()),(Object)(_effect));
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("setIcon (cfmaterialcheckbox) ","cfmaterialcheckbox",8,__ref.getField(false, "ba"),__ref,190);
if (RapidSub.canDelegate("seticon")) { return __ref.runUserSub(false, "cfmaterialcheckbox","seticon", __ref, _iconcode);}
Debug.locals.put("iconCode", _iconcode);
 BA.debugLineNum = 190;BA.debugLine="Public Sub setIcon(iconCode As Int)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 192;BA.debugLine="CheckedLabel.Text = Chr(iconCode)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_checkedlabel").runMethod(true,"setText",BA.ObjectToString(cfmaterialcheckbox.__c.runMethod(true,"Chr",(Object)(_iconcode))));
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("setRotation (cfmaterialcheckbox) ","cfmaterialcheckbox",8,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("setrotation")) { return __ref.runUserSub(false, "cfmaterialcheckbox","setrotation", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 107;BA.debugLine="Public Sub setRotation(angle As Float)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 109;BA.debugLine="CFControlsUtils.SetRotation(CheckboxPane, angle)";
Debug.ShouldStop(4096);
cfmaterialcheckbox._cfcontrolsutils.runVoidMethod ("_setrotation",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_checkboxpane").getObject()),(Object)(_angle));
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
}