package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cfmaterialappbar_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (cfmaterialappbar) ","cfmaterialappbar",3,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "cfmaterialappbar","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 51;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(262144);
 BA.debugLineNum = 53;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
Debug.ShouldStop(1048576);
cfmaterialappbar.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_Resize"))),(Object)((_width)),(Object)((_height)));
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
 //BA.debugLineNum = 19;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 20;BA.debugLine="Private fx As JFX";
cfmaterialappbar._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cfmaterialappbar._fx);
 //BA.debugLineNum = 21;BA.debugLine="Private mEventName As String 'ignore";
cfmaterialappbar._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",cfmaterialappbar._meventname);
 //BA.debugLineNum = 22;BA.debugLine="Private mCallBack As Object 'ignore";
cfmaterialappbar._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",cfmaterialappbar._mcallback);
 //BA.debugLineNum = 23;BA.debugLine="Private mBase As Pane";
cfmaterialappbar._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",cfmaterialappbar._mbase);
 //BA.debugLineNum = 24;BA.debugLine="Private Label1 As Label";
cfmaterialappbar._label1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_label1",cfmaterialappbar._label1);
 //BA.debugLineNum = 25;BA.debugLine="Public InnerPane As Pane";
cfmaterialappbar._innerpane = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_innerpane",cfmaterialappbar._innerpane);
 //BA.debugLineNum = 26;BA.debugLine="Public InnerButton As Button";
cfmaterialappbar._innerbutton = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_innerbutton",cfmaterialappbar._innerbutton);
 //BA.debugLineNum = 27;BA.debugLine="Public TitleLabel As Label";
cfmaterialappbar._titlelabel = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_titlelabel",cfmaterialappbar._titlelabel);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (cfmaterialappbar) ","cfmaterialappbar",3,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "cfmaterialappbar","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 35;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="mBase = Base";
Debug.ShouldStop(8);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 37;BA.debugLine="mBase.LoadLayout(\"CFMaterialAppBarUI\")";
Debug.ShouldStop(16);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("CFMaterialAppBarUI")));
 BA.debugLineNum = 40;BA.debugLine="setBg(CFStyleManager.DefaultTheme.Get(\"primary\"))";
Debug.ShouldStop(128);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialappbar.class, "_setbg",(Object)(BA.ObjectToString(cfmaterialappbar._cfstylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("primary")))))));
 BA.debugLineNum = 41;BA.debugLine="TitleLabel.Font = CFStyleManager.SelectFont(\"Blac";
Debug.ShouldStop(256);
__ref.getField(false,"_titlelabel").runMethod(false,"setFont",cfmaterialappbar._cfstylemanager.runMethod(false,"_selectfont",(Object)(BA.ObjectToString("Black")),(Object)(BA.numberCast(double.class, 14))));
 BA.debugLineNum = 43;BA.debugLine="setTitle(Props.Get(\"Title\"))";
Debug.ShouldStop(1024);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialappbar.class, "_settitle",(Object)(BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Title")))))));
 BA.debugLineNum = 44;BA.debugLine="setEnableShadow(Props.Get(\"EnableShadow\"))";
Debug.ShouldStop(2048);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialappbar.class, "_setenableshadow",(Object)(BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EnableShadow")))))));
 BA.debugLineNum = 46;BA.debugLine="setHideIcon(Props.Get(\"HideIcon\"))";
Debug.ShouldStop(8192);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialappbar.class, "_sethideicon",(Object)(BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("HideIcon")))))));
 BA.debugLineNum = 47;BA.debugLine="setHideTitle(Props.Get(\"HideTitle\"))";
Debug.ShouldStop(16384);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmaterialappbar.class, "_sethidetitle",(Object)(BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("HideTitle")))))));
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
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (cfmaterialappbar) ","cfmaterialappbar",3,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "cfmaterialappbar","getbase", __ref);}
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
public static RemoteObject  _geticon(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getIcon (cfmaterialappbar) ","cfmaterialappbar",3,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("geticon")) { return __ref.runUserSub(false, "cfmaterialappbar","geticon", __ref);}
 BA.debugLineNum = 117;BA.debugLine="Public Sub getIcon As String";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 119;BA.debugLine="Return InnerButton.Text";
Debug.ShouldStop(4194304);
if (true) return __ref.getField(false,"_innerbutton").runMethod(true,"getText");
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getshadowenabled(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getShadowEnabled (cfmaterialappbar) ","cfmaterialappbar",3,__ref.getField(false, "ba"),__ref,153);
if (RapidSub.canDelegate("getshadowenabled")) { return __ref.runUserSub(false, "cfmaterialappbar","getshadowenabled", __ref);}
 BA.debugLineNum = 153;BA.debugLine="Public Sub getShadowEnabled As Boolean";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 155;BA.debugLine="Return Label1.Visible";
Debug.ShouldStop(67108864);
if (true) return __ref.getField(false,"_label1").runMethod(true,"getVisible");
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettitle(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTitle (cfmaterialappbar) ","cfmaterialappbar",3,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("gettitle")) { return __ref.runUserSub(false, "cfmaterialappbar","gettitle", __ref);}
 BA.debugLineNum = 123;BA.debugLine="Public Sub getTitle As String";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 125;BA.debugLine="Return TitleLabel.Text";
Debug.ShouldStop(268435456);
if (true) return __ref.getField(false,"_titlelabel").runMethod(true,"getText");
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Initialize (cfmaterialappbar) ","cfmaterialappbar",3,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cfmaterialappbar","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 30;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(1073741824);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 32;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(-2147483648);
__ref.setField ("_mcallback",_callback);
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
public static RemoteObject  _innerbutton_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("InnerButton_MousePressed (cfmaterialappbar) ","cfmaterialappbar",3,__ref.getField(false, "ba"),__ref,159);
if (RapidSub.canDelegate("innerbutton_mousepressed")) { return __ref.runUserSub(false, "cfmaterialappbar","innerbutton_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 159;BA.debugLine="Private Sub InnerButton_MousePressed (EventData As";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 161;BA.debugLine="InnerButton.RequestFocus 'set focus";
Debug.ShouldStop(1);
__ref.getField(false,"_innerbutton").runVoidMethod ("RequestFocus");
 BA.debugLineNum = 163;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MousePr";
Debug.ShouldStop(4);
cfmaterialappbar.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MousePressed"))),(Object)((_eventdata)));
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _innerpane_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("InnerPane_MousePressed (cfmaterialappbar) ","cfmaterialappbar",3,__ref.getField(false, "ba"),__ref,167);
if (RapidSub.canDelegate("innerpane_mousepressed")) { return __ref.runUserSub(false, "cfmaterialappbar","innerpane_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 167;BA.debugLine="Private Sub InnerPane_MousePressed (EventData As M";
Debug.ShouldStop(64);
 BA.debugLineNum = 169;BA.debugLine="InnerPane.RequestFocus 'set focus";
Debug.ShouldStop(256);
__ref.getField(false,"_innerpane").runVoidMethod ("RequestFocus");
 BA.debugLineNum = 171;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_PaneMou";
Debug.ShouldStop(1024);
cfmaterialappbar.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_PaneMousePressed"))),(Object)((_eventdata)));
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
public static RemoteObject  _removeeffects(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RemoveEffects (cfmaterialappbar) ","cfmaterialappbar",3,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "cfmaterialappbar","removeeffects", __ref);}
 BA.debugLineNum = 101;BA.debugLine="Public Sub RemoveEffects()";
Debug.ShouldStop(16);
 BA.debugLineNum = 103;BA.debugLine="CFControlsUtils.removeEffect(Label1)";
Debug.ShouldStop(64);
cfmaterialappbar._cfcontrolsutils.runVoidMethod ("_removeeffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_label1").getObject()));
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
public static RemoteObject  _setbg(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setBg (cfmaterialappbar) ","cfmaterialappbar",3,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "cfmaterialappbar","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 67;BA.debugLine="Public Sub setBg(color As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 69;BA.debugLine="CFControlsUtils.SetBG( Label1,  color)";
Debug.ShouldStop(16);
cfmaterialappbar._cfcontrolsutils.runVoidMethod ("_setbg",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_label1").getObject()),(Object)(_color));
 BA.debugLineNum = 70;BA.debugLine="CFControlsUtils.SetBG( InnerPane, color)";
Debug.ShouldStop(32);
cfmaterialappbar._cfcontrolsutils.runVoidMethod ("_setbg",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerpane").getObject()),(Object)(_color));
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
public static RemoteObject  _setborder(RemoteObject __ref,RemoteObject _color,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("setBorder (cfmaterialappbar) ","cfmaterialappbar",3,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "cfmaterialappbar","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 81;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(65536);
 BA.debugLineNum = 83;BA.debugLine="CFControlsUtils.setBorder(Label1, color, width)";
Debug.ShouldStop(262144);
cfmaterialappbar._cfcontrolsutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_label1").getObject()),(Object)(_color),(Object)(_width));
 BA.debugLineNum = 84;BA.debugLine="CFControlsUtils.setBorder(InnerPane, color, width";
Debug.ShouldStop(524288);
cfmaterialappbar._cfcontrolsutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerpane").getObject()),(Object)(_color),(Object)(_width));
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
public static RemoteObject  _setborderradius(RemoteObject __ref,RemoteObject _radius) throws Exception{
try {
		Debug.PushSubsStack("setBorderRadius (cfmaterialappbar) ","cfmaterialappbar",3,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "cfmaterialappbar","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 88;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 90;BA.debugLine="CFControlsUtils.setBorderRadius(Label1, radius)";
Debug.ShouldStop(33554432);
cfmaterialappbar._cfcontrolsutils.runVoidMethod ("_setborderradius",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_label1").getObject()),(Object)(_radius));
 BA.debugLineNum = 91;BA.debugLine="CFControlsUtils.setBorderRadius(InnerPane, radius";
Debug.ShouldStop(67108864);
cfmaterialappbar._cfcontrolsutils.runVoidMethod ("_setborderradius",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerpane").getObject()),(Object)(_radius));
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
public static RemoteObject  _seteffect(RemoteObject __ref,RemoteObject _effect) throws Exception{
try {
		Debug.PushSubsStack("setEffect (cfmaterialappbar) ","cfmaterialappbar",3,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("seteffect")) { return __ref.runUserSub(false, "cfmaterialappbar","seteffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 95;BA.debugLine="Public Sub setEffect(effect As String)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 97;BA.debugLine="CFControlsUtils.setEffect(Label1, effect)";
Debug.ShouldStop(1);
cfmaterialappbar._cfcontrolsutils.runVoidMethod ("_seteffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_label1").getObject()),(Object)(_effect));
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setenableshadow(RemoteObject __ref,RemoteObject _boolval) throws Exception{
try {
		Debug.PushSubsStack("setEnableShadow (cfmaterialappbar) ","cfmaterialappbar",3,__ref.getField(false, "ba"),__ref,147);
if (RapidSub.canDelegate("setenableshadow")) { return __ref.runUserSub(false, "cfmaterialappbar","setenableshadow", __ref, _boolval);}
Debug.locals.put("BoolVal", _boolval);
 BA.debugLineNum = 147;BA.debugLine="Public Sub setEnableShadow(BoolVal As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 149;BA.debugLine="Label1.Visible = BoolVal";
Debug.ShouldStop(1048576);
__ref.getField(false,"_label1").runMethod(true,"setVisible",_boolval);
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
public static RemoteObject  _sethideicon(RemoteObject __ref,RemoteObject _boolval) throws Exception{
try {
		Debug.PushSubsStack("setHideIcon (cfmaterialappbar) ","cfmaterialappbar",3,__ref.getField(false, "ba"),__ref,141);
if (RapidSub.canDelegate("sethideicon")) { return __ref.runUserSub(false, "cfmaterialappbar","sethideicon", __ref, _boolval);}
Debug.locals.put("BoolVal", _boolval);
 BA.debugLineNum = 141;BA.debugLine="Public Sub setHideIcon(BoolVal As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 143;BA.debugLine="InnerButton.Visible = Not(BoolVal)";
Debug.ShouldStop(16384);
__ref.getField(false,"_innerbutton").runMethod(true,"setVisible",cfmaterialappbar.__c.runMethod(true,"Not",(Object)(_boolval)));
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sethidetitle(RemoteObject __ref,RemoteObject _boolval) throws Exception{
try {
		Debug.PushSubsStack("setHideTitle (cfmaterialappbar) ","cfmaterialappbar",3,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("sethidetitle")) { return __ref.runUserSub(false, "cfmaterialappbar","sethidetitle", __ref, _boolval);}
Debug.locals.put("BoolVal", _boolval);
 BA.debugLineNum = 135;BA.debugLine="Public Sub setHideTitle(BoolVal As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 137;BA.debugLine="TitleLabel.Visible = Not(BoolVal)";
Debug.ShouldStop(256);
__ref.getField(false,"_titlelabel").runMethod(true,"setVisible",cfmaterialappbar.__c.runMethod(true,"Not",(Object)(_boolval)));
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("setIcon (cfmaterialappbar) ","cfmaterialappbar",3,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("seticon")) { return __ref.runUserSub(false, "cfmaterialappbar","seticon", __ref, _icontext);}
Debug.locals.put("IconText", _icontext);
 BA.debugLineNum = 110;BA.debugLine="Public Sub setIcon(IconText As String)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 112;BA.debugLine="InnerButton.Text = IconText";
Debug.ShouldStop(32768);
__ref.getField(false,"_innerbutton").runMethod(true,"setText",_icontext);
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
public static RemoteObject  _setrotation(RemoteObject __ref,RemoteObject _angle) throws Exception{
try {
		Debug.PushSubsStack("setRotation (cfmaterialappbar) ","cfmaterialappbar",3,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("setrotation")) { return __ref.runUserSub(false, "cfmaterialappbar","setrotation", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 74;BA.debugLine="Public Sub setRotation(angle As Float)";
Debug.ShouldStop(512);
 BA.debugLineNum = 76;BA.debugLine="CFControlsUtils.setRotation(Label1, angle) 'rotat";
Debug.ShouldStop(2048);
cfmaterialappbar._cfcontrolsutils.runVoidMethod ("_setrotation",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_label1").getObject()),(Object)(_angle));
 BA.debugLineNum = 77;BA.debugLine="CFControlsUtils.setRotation(InnerPane , angle) 'r";
Debug.ShouldStop(4096);
cfmaterialappbar._cfcontrolsutils.runVoidMethod ("_setrotation",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerpane").getObject()),(Object)(_angle));
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
public static RemoteObject  _settitle(RemoteObject __ref,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("setTitle (cfmaterialappbar) ","cfmaterialappbar",3,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("settitle")) { return __ref.runUserSub(false, "cfmaterialappbar","settitle", __ref, _title);}
Debug.locals.put("Title", _title);
 BA.debugLineNum = 129;BA.debugLine="Public Sub setTitle(Title As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 131;BA.debugLine="TitleLabel.Text = Title";
Debug.ShouldStop(4);
__ref.getField(false,"_titlelabel").runMethod(true,"setText",_title);
 BA.debugLineNum = 133;BA.debugLine="End Sub";
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