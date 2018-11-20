package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cfmetrolinklabel_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (cfmetrolinklabel) ","cfmetrolinklabel",14,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "cfmetrolinklabel","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 40;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(128);
 BA.debugLineNum = 42;BA.debugLine="InnerLabel.PrefWidth = Width";
Debug.ShouldStop(512);
__ref.getField(false,"_innerlabel").runMethod(true,"setPrefWidth",_width);
 BA.debugLineNum = 43;BA.debugLine="InnerLabel.PrefHeight =  Height";
Debug.ShouldStop(1024);
__ref.getField(false,"_innerlabel").runMethod(true,"setPrefHeight",_height);
 BA.debugLineNum = 45;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
Debug.ShouldStop(4096);
cfmetrolinklabel.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_Resize"))),(Object)((_width)),(Object)((_height)));
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
 //BA.debugLineNum = 13;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 14;BA.debugLine="Private fx As JFX";
cfmetrolinklabel._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cfmetrolinklabel._fx);
 //BA.debugLineNum = 15;BA.debugLine="Private mEventName As String 'ignore";
cfmetrolinklabel._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",cfmetrolinklabel._meventname);
 //BA.debugLineNum = 16;BA.debugLine="Private mCallBack As Object 'ignore";
cfmetrolinklabel._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",cfmetrolinklabel._mcallback);
 //BA.debugLineNum = 17;BA.debugLine="Private mBase As Pane";
cfmetrolinklabel._mbase = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_mbase",cfmetrolinklabel._mbase);
 //BA.debugLineNum = 18;BA.debugLine="Public InnerLabel As Label";
cfmetrolinklabel._innerlabel = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_innerlabel",cfmetrolinklabel._innerlabel);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (cfmetrolinklabel) ","cfmetrolinklabel",14,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "cfmetrolinklabel","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 26;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="mBase = Base";
Debug.ShouldStop(67108864);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 28;BA.debugLine="mBase.LoadLayout(\"CFMetroLinkLabelUI\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_mbase").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("CFMetroLinkLabelUI")));
 BA.debugLineNum = 31;BA.debugLine="setTextColor(CFStyleManager.DefaultTheme.Get(\"pri";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmetrolinklabel.class, "_settextcolor",(Object)(BA.ObjectToString(cfmetrolinklabel._cfstylemanager._defaulttheme.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("primary_text")))))));
 BA.debugLineNum = 32;BA.debugLine="InnerLabel.Font = CFStyleManager.SelectFont(\"Regu";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_innerlabel").runMethod(false,"setFont",cfmetrolinklabel._cfstylemanager.runMethod(false,"_selectfont",(Object)(BA.ObjectToString("Regular")),(Object)(BA.numberCast(double.class, 12))));
 BA.debugLineNum = 33;BA.debugLine="InnerLabel.MouseCursor = fx.Cursors.HAND";
Debug.ShouldStop(1);
__ref.getField(false,"_innerlabel").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx").getField(false,"Cursors").getField(false,"HAND"));
 BA.debugLineNum = 36;BA.debugLine="setLink(Props.Get(\"Link\"))";
Debug.ShouldStop(8);
__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfmetrolinklabel.class, "_setlink",(Object)(BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Link")))))));
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
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (cfmetrolinklabel) ","cfmetrolinklabel",14,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "cfmetrolinklabel","getbase", __ref);}
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
public static RemoteObject  _getlink(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getLink (cfmetrolinklabel) ","cfmetrolinklabel",14,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("getlink")) { return __ref.runUserSub(false, "cfmetrolinklabel","getlink", __ref);}
 BA.debugLineNum = 107;BA.debugLine="Public Sub getLink() As String";
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
		Debug.PushSubsStack("Initialize (cfmetrolinklabel) ","cfmetrolinklabel",14,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cfmetrolinklabel","initialize", __ref, _ba, _callback, _eventname);}
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
		Debug.PushSubsStack("InnerLabel_MousePressed (cfmetrolinklabel) ","cfmetrolinklabel",14,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("innerlabel_mousepressed")) { return __ref.runUserSub(false, "cfmetrolinklabel","innerlabel_mousepressed", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 113;BA.debugLine="Private Sub InnerLabel_MousePressed (EventData As";
Debug.ShouldStop(65536);
 BA.debugLineNum = 115;BA.debugLine="InnerLabel.RequestFocus 'set focus";
Debug.ShouldStop(262144);
__ref.getField(false,"_innerlabel").runVoidMethod ("RequestFocus");
 BA.debugLineNum = 117;BA.debugLine="fx.ShowExternalDocument(InnerLabel.Text)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_fx").runVoidMethod ("ShowExternalDocument",(Object)(__ref.getField(false,"_innerlabel").runMethod(true,"getText")));
 BA.debugLineNum = 119;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MousePr";
Debug.ShouldStop(4194304);
cfmetrolinklabel.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback")),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname"),RemoteObject.createImmutable("_MousePressed"))),(Object)((_eventdata)));
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
public static RemoteObject  _removeeffects(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RemoveEffects (cfmetrolinklabel) ","cfmetrolinklabel",14,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("removeeffects")) { return __ref.runUserSub(false, "cfmetrolinklabel","removeeffects", __ref);}
 BA.debugLineNum = 93;BA.debugLine="Public Sub RemoveEffects()";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 95;BA.debugLine="CFControlsUtils.removeEffect(InnerLabel)";
Debug.ShouldStop(1073741824);
cfmetrolinklabel._cfcontrolsutils.runVoidMethod ("_removeeffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerlabel").getObject()));
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
		Debug.PushSubsStack("setBg (cfmetrolinklabel) ","cfmetrolinklabel",14,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("setbg")) { return __ref.runUserSub(false, "cfmetrolinklabel","setbg", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 57;BA.debugLine="Public Sub setBg(color As String)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 59;BA.debugLine="CFControlsUtils.SetBg( InnerLabel, color)";
Debug.ShouldStop(67108864);
cfmetrolinklabel._cfcontrolsutils.runVoidMethod ("_setbg",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerlabel").getObject()),(Object)(_color));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("setBorder (cfmetrolinklabel) ","cfmetrolinklabel",14,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "cfmetrolinklabel","setborder", __ref, _color, _width);}
Debug.locals.put("color", _color);
Debug.locals.put("width", _width);
 BA.debugLineNum = 75;BA.debugLine="Public Sub setBorder(color As String , width As In";
Debug.ShouldStop(1024);
 BA.debugLineNum = 77;BA.debugLine="CFControlsUtils.setBorder(InnerLabel, color, widt";
Debug.ShouldStop(4096);
cfmetrolinklabel._cfcontrolsutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerlabel").getObject()),(Object)(_color),(Object)(_width));
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
public static RemoteObject  _setborderradius(RemoteObject __ref,RemoteObject _radius) throws Exception{
try {
		Debug.PushSubsStack("setBorderRadius (cfmetrolinklabel) ","cfmetrolinklabel",14,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("setborderradius")) { return __ref.runUserSub(false, "cfmetrolinklabel","setborderradius", __ref, _radius);}
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 81;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 83;BA.debugLine="CFControlsUtils.setBorderRadius(InnerLabel, radiu";
Debug.ShouldStop(262144);
cfmetrolinklabel._cfcontrolsutils.runVoidMethod ("_setborderradius",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerlabel").getObject()),(Object)(_radius));
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("setEffect (cfmetrolinklabel) ","cfmetrolinklabel",14,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("seteffect")) { return __ref.runUserSub(false, "cfmetrolinklabel","seteffect", __ref, _effect);}
Debug.locals.put("effect", _effect);
 BA.debugLineNum = 87;BA.debugLine="Public Sub setEffect(effect As String)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 89;BA.debugLine="CFControlsUtils.setEffect(InnerLabel, effect)";
Debug.ShouldStop(16777216);
cfmetrolinklabel._cfcontrolsutils.runVoidMethod ("_seteffect",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerlabel").getObject()),(Object)(_effect));
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
public static RemoteObject  _setlink(RemoteObject __ref,RemoteObject _link) throws Exception{
try {
		Debug.PushSubsStack("setLink (cfmetrolinklabel) ","cfmetrolinklabel",14,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("setlink")) { return __ref.runUserSub(false, "cfmetrolinklabel","setlink", __ref, _link);}
Debug.locals.put("link", _link);
 BA.debugLineNum = 101;BA.debugLine="Public Sub setLink(link As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 103;BA.debugLine="InnerLabel.Text = link";
Debug.ShouldStop(64);
__ref.getField(false,"_innerlabel").runMethod(true,"setText",_link);
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
public static RemoteObject  _setrotation(RemoteObject __ref,RemoteObject _angle) throws Exception{
try {
		Debug.PushSubsStack("setRotation (cfmetrolinklabel) ","cfmetrolinklabel",14,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("setrotation")) { return __ref.runUserSub(false, "cfmetrolinklabel","setrotation", __ref, _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 69;BA.debugLine="Public Sub setRotation(angle As Float)";
Debug.ShouldStop(16);
 BA.debugLineNum = 71;BA.debugLine="CFControlsUtils.setRotation(InnerLabel, angle) 'r";
Debug.ShouldStop(64);
cfmetrolinklabel._cfcontrolsutils.runVoidMethod ("_setrotation",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerlabel").getObject()),(Object)(_angle));
 BA.debugLineNum = 73;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("setTextColor (cfmetrolinklabel) ","cfmetrolinklabel",14,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("settextcolor")) { return __ref.runUserSub(false, "cfmetrolinklabel","settextcolor", __ref, _color);}
Debug.locals.put("color", _color);
 BA.debugLineNum = 63;BA.debugLine="Public Sub setTextColor(color As String)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 65;BA.debugLine="CFControlsUtils.setTextColor (InnerLabel, color)";
Debug.ShouldStop(1);
cfmetrolinklabel._cfcontrolsutils.runVoidMethod ("_settextcolor",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), __ref.getField(false,"_innerlabel").getObject()),(Object)(_color));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}