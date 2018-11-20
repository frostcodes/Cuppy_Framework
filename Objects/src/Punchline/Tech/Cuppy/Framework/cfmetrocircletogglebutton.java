package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmetrocircletogglebutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _mbase = null;
public int _checked_state = 0;
public int _unchecked_state = 0;
public boolean _checkedstatus = false;
public anywheresoftware.b4j.objects.LabelWrapper _togglebutton = null;
public boolean _firsttime = false;
public b4j.example.cssutils _cssutils = null;
public Punchline.Tech.Cuppy.Framework.main _main = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public Punchline.Tech.Cuppy.Framework.cfanimationmanager _cfanimationmanager = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public String  _base_resize(Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrocircletogglebutton";
if (Debug.shouldDelegate(ba, "base_resize"))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=22413312;
 //BA.debugLineNum = 22413312;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=22413314;
 //BA.debugLineNum = 22413314;BA.debugLine="ToggleButton.PrefHeight = Width";
__ref._togglebutton.setPrefHeight(_width);
RDebugUtils.currentLine=22413315;
 //BA.debugLineNum = 22413315;BA.debugLine="ToggleButton.PrefWidth = Width";
__ref._togglebutton.setPrefWidth(_width);
RDebugUtils.currentLine=22413317;
 //BA.debugLineNum = 22413317;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,__ref._mcallback,__ref._meventname+"_Resize",(Object)(_width),(Object)(_height));
RDebugUtils.currentLine=22413319;
 //BA.debugLineNum = 22413319;BA.debugLine="End Sub";
return "";
}
public boolean  _checked(Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrocircletogglebutton";
if (Debug.shouldDelegate(ba, "checked"))
	 {return ((Boolean) Debug.delegate(ba, "checked", null));}
RDebugUtils.currentLine=23003136;
 //BA.debugLineNum = 23003136;BA.debugLine="Public Sub Checked As Boolean";
RDebugUtils.currentLine=23003138;
 //BA.debugLineNum = 23003138;BA.debugLine="Return CheckedStatus";
if (true) return __ref._checkedstatus;
RDebugUtils.currentLine=23003140;
 //BA.debugLineNum = 23003140;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrocircletogglebutton";
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=22216705;
 //BA.debugLineNum = 22216705;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=22216706;
 //BA.debugLineNum = 22216706;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=22216707;
 //BA.debugLineNum = 22216707;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=22216708;
 //BA.debugLineNum = 22216708;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=22216711;
 //BA.debugLineNum = 22216711;BA.debugLine="Public CHECKED_STATE As Int = 1";
_checked_state = (int) (1);
RDebugUtils.currentLine=22216712;
 //BA.debugLineNum = 22216712;BA.debugLine="Public UNCHECKED_STATE As Int = 0";
_unchecked_state = (int) (0);
RDebugUtils.currentLine=22216714;
 //BA.debugLineNum = 22216714;BA.debugLine="Private CheckedStatus As Boolean = False";
_checkedstatus = __c.False;
RDebugUtils.currentLine=22216715;
 //BA.debugLineNum = 22216715;BA.debugLine="Public ToggleButton As Label";
_togglebutton = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=22216718;
 //BA.debugLineNum = 22216718;BA.debugLine="Private FirstTime As Boolean = False";
_firsttime = __c.False;
RDebugUtils.currentLine=22216720;
 //BA.debugLineNum = 22216720;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton __ref,anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrocircletogglebutton";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
String _checkedstate = "";
RDebugUtils.currentLine=22347776;
 //BA.debugLineNum = 22347776;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
RDebugUtils.currentLine=22347777;
 //BA.debugLineNum = 22347777;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=22347778;
 //BA.debugLineNum = 22347778;BA.debugLine="mBase.LoadLayout(\"CFMetroCircleToggleButtonUI\")";
__ref._mbase.LoadLayout(ba,"CFMetroCircleToggleButtonUI");
RDebugUtils.currentLine=22347782;
 //BA.debugLineNum = 22347782;BA.debugLine="Dim checkedState As String = Props.Get(\"CheckedSt";
_checkedstate = BA.ObjectToString(_props.Get((Object)("CheckedState")));
RDebugUtils.currentLine=22347786;
 //BA.debugLineNum = 22347786;BA.debugLine="If checkedState = \"UNCHECKED\" Then";
if ((_checkedstate).equals("UNCHECKED")) { 
RDebugUtils.currentLine=22347788;
 //BA.debugLineNum = 22347788;BA.debugLine="SetCheckState(UNCHECKED_STATE)";
__ref._setcheckstate(null,__ref._unchecked_state);
 }else 
{RDebugUtils.currentLine=22347790;
 //BA.debugLineNum = 22347790;BA.debugLine="else If checkedState = \"CHECKED\" Then";
if ((_checkedstate).equals("CHECKED")) { 
RDebugUtils.currentLine=22347792;
 //BA.debugLineNum = 22347792;BA.debugLine="SetCheckState(CHECKED_STATE)";
__ref._setcheckstate(null,__ref._checked_state);
 }}
;
RDebugUtils.currentLine=22347796;
 //BA.debugLineNum = 22347796;BA.debugLine="End Sub";
return "";
}
public String  _setcheckstate(Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrocircletogglebutton";
if (Debug.shouldDelegate(ba, "setcheckstate"))
	 {return ((String) Debug.delegate(ba, "setcheckstate", new Object[] {_value}));}
RDebugUtils.currentLine=22937600;
 //BA.debugLineNum = 22937600;BA.debugLine="Public Sub setCheckState(value As Int)";
RDebugUtils.currentLine=22937602;
 //BA.debugLineNum = 22937602;BA.debugLine="If value = UNCHECKED_STATE Then";
if (_value==__ref._unchecked_state) { 
RDebugUtils.currentLine=22937604;
 //BA.debugLineNum = 22937604;BA.debugLine="SetBg(\"white\")";
__ref._setbg(null,"white");
RDebugUtils.currentLine=22937605;
 //BA.debugLineNum = 22937605;BA.debugLine="SetBorder(\"#D6D6D6\", 2)";
__ref._setborder(null,"#D6D6D6",(int) (2));
RDebugUtils.currentLine=22937607;
 //BA.debugLineNum = 22937607;BA.debugLine="ToggleButton.TextColor = fx.Colors.RGB(91, 91, 9";
__ref._togglebutton.setTextColor((javafx.scene.paint.Paint)(__ref._fx.Colors.RGB((int) (91),(int) (91),(int) (91))));
RDebugUtils.currentLine=22937609;
 //BA.debugLineNum = 22937609;BA.debugLine="CheckedStatus = False";
__ref._checkedstatus = __c.False;
 }else 
{RDebugUtils.currentLine=22937611;
 //BA.debugLineNum = 22937611;BA.debugLine="Else if value = CHECKED_STATE Then";
if (_value==__ref._checked_state) { 
RDebugUtils.currentLine=22937614;
 //BA.debugLineNum = 22937614;BA.debugLine="SetBorder(\"#2EA9DE\", 2)";
__ref._setborder(null,"#2EA9DE",(int) (2));
RDebugUtils.currentLine=22937615;
 //BA.debugLineNum = 22937615;BA.debugLine="SetBg(\"rgb(65, 177, 225 )\")";
__ref._setbg(null,"rgb(65, 177, 225 )");
RDebugUtils.currentLine=22937617;
 //BA.debugLineNum = 22937617;BA.debugLine="ToggleButton.TextColor = fx.Colors.White";
__ref._togglebutton.setTextColor(__ref._fx.Colors.White);
RDebugUtils.currentLine=22937619;
 //BA.debugLineNum = 22937619;BA.debugLine="CheckedStatus = True";
__ref._checkedstatus = __c.True;
 }}
;
RDebugUtils.currentLine=22937623;
 //BA.debugLineNum = 22937623;BA.debugLine="If FirstTime Then";
if (__ref._firsttime) { 
RDebugUtils.currentLine=22937626;
 //BA.debugLineNum = 22937626;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checke";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_CheckedChanged",(Object)(_value));
 }else {
RDebugUtils.currentLine=22937630;
 //BA.debugLineNum = 22937630;BA.debugLine="FirstTime = True";
__ref._firsttime = __c.True;
 };
RDebugUtils.currentLine=22937634;
 //BA.debugLineNum = 22937634;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase(Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrocircletogglebutton";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=22478848;
 //BA.debugLineNum = 22478848;BA.debugLine="Public Sub GetBase As Pane";
RDebugUtils.currentLine=22478849;
 //BA.debugLineNum = 22478849;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=22478850;
 //BA.debugLineNum = 22478850;BA.debugLine="End Sub";
return null;
}
public String  _initialize(Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cfmetrocircletogglebutton";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=22282240;
 //BA.debugLineNum = 22282240;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=22282241;
 //BA.debugLineNum = 22282241;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=22282242;
 //BA.debugLineNum = 22282242;BA.debugLine="mCallBack = Callback";
__ref._mcallback = _callback;
RDebugUtils.currentLine=22282243;
 //BA.debugLineNum = 22282243;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects(Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrocircletogglebutton";
if (Debug.shouldDelegate(ba, "removeeffects"))
	 {return ((String) Debug.delegate(ba, "removeeffects", null));}
RDebugUtils.currentLine=22872064;
 //BA.debugLineNum = 22872064;BA.debugLine="Public Sub RemoveEffects()";
RDebugUtils.currentLine=22872066;
 //BA.debugLineNum = 22872066;BA.debugLine="CFControlsUtils.removeEffect(ToggleButton)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._togglebutton.getObject())));
RDebugUtils.currentLine=22872068;
 //BA.debugLineNum = 22872068;BA.debugLine="End Sub";
return "";
}
public String  _setbg(Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrocircletogglebutton";
if (Debug.shouldDelegate(ba, "setbg"))
	 {return ((String) Debug.delegate(ba, "setbg", new Object[] {_color}));}
RDebugUtils.currentLine=22544384;
 //BA.debugLineNum = 22544384;BA.debugLine="Public Sub setBg(color As String)";
RDebugUtils.currentLine=22544386;
 //BA.debugLineNum = 22544386;BA.debugLine="CFControlsUtils.setBG(ToggleButton, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._togglebutton.getObject())),_color);
RDebugUtils.currentLine=22544388;
 //BA.debugLineNum = 22544388;BA.debugLine="End Sub";
return "";
}
public String  _setborder(Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton __ref,String _color,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrocircletogglebutton";
if (Debug.shouldDelegate(ba, "setborder"))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_color,_width}));}
RDebugUtils.currentLine=22675456;
 //BA.debugLineNum = 22675456;BA.debugLine="Public Sub setBorder(color As String , width As In";
RDebugUtils.currentLine=22675458;
 //BA.debugLineNum = 22675458;BA.debugLine="CFControlsUtils.setBorder(ToggleButton, color, wi";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._togglebutton.getObject())),_color,_width);
RDebugUtils.currentLine=22675460;
 //BA.debugLineNum = 22675460;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton __ref,int _radius) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrocircletogglebutton";
if (Debug.shouldDelegate(ba, "setborderradius"))
	 {return ((String) Debug.delegate(ba, "setborderradius", new Object[] {_radius}));}
RDebugUtils.currentLine=22740992;
 //BA.debugLineNum = 22740992;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
RDebugUtils.currentLine=22740994;
 //BA.debugLineNum = 22740994;BA.debugLine="CFControlsUtils.setBorderRadius(ToggleButton, rad";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._togglebutton.getObject())),_radius);
RDebugUtils.currentLine=22740996;
 //BA.debugLineNum = 22740996;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrocircletogglebutton";
if (Debug.shouldDelegate(ba, "seteffect"))
	 {return ((String) Debug.delegate(ba, "seteffect", new Object[] {_effect}));}
RDebugUtils.currentLine=22806528;
 //BA.debugLineNum = 22806528;BA.debugLine="Public Sub setEffect(effect As String)";
RDebugUtils.currentLine=22806530;
 //BA.debugLineNum = 22806530;BA.debugLine="CFControlsUtils.setEffect(ToggleButton, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._togglebutton.getObject())),_effect);
RDebugUtils.currentLine=22806532;
 //BA.debugLineNum = 22806532;BA.debugLine="End Sub";
return "";
}
public String  _setrotation(Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton __ref,float _angle) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrocircletogglebutton";
if (Debug.shouldDelegate(ba, "setrotation"))
	 {return ((String) Debug.delegate(ba, "setrotation", new Object[] {_angle}));}
RDebugUtils.currentLine=22609920;
 //BA.debugLineNum = 22609920;BA.debugLine="Public Sub setRotation(angle As Float)";
RDebugUtils.currentLine=22609922;
 //BA.debugLineNum = 22609922;BA.debugLine="CFControlsUtils.setRotation(ToggleButton, angle)";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._togglebutton.getObject())),_angle);
RDebugUtils.currentLine=22609924;
 //BA.debugLineNum = 22609924;BA.debugLine="End Sub";
return "";
}
public String  _togglebutton_mousepressed(Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrocircletogglebutton";
if (Debug.shouldDelegate(ba, "togglebutton_mousepressed"))
	 {return ((String) Debug.delegate(ba, "togglebutton_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=23068672;
 //BA.debugLineNum = 23068672;BA.debugLine="Private Sub ToggleButton_MousePressed (EventData A";
RDebugUtils.currentLine=23068674;
 //BA.debugLineNum = 23068674;BA.debugLine="ToggleButton.RequestFocus 'set focus";
__ref._togglebutton.RequestFocus();
RDebugUtils.currentLine=23068676;
 //BA.debugLineNum = 23068676;BA.debugLine="If Not(Checked) Then";
if (__c.Not(__ref._checked(null))) { 
RDebugUtils.currentLine=23068678;
 //BA.debugLineNum = 23068678;BA.debugLine="SetCheckState(CHECKED_STATE)";
__ref._setcheckstate(null,__ref._checked_state);
 }else {
RDebugUtils.currentLine=23068682;
 //BA.debugLineNum = 23068682;BA.debugLine="SetCheckState(UNCHECKED_STATE)";
__ref._setcheckstate(null,__ref._unchecked_state);
 };
RDebugUtils.currentLine=23068686;
 //BA.debugLineNum = 23068686;BA.debugLine="End Sub";
return "";
}
}