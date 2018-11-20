package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmetrotogglebutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmetrotogglebutton", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.cfmetrotogglebutton.class).invoke(this, new Object[] {null});
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
public String  _base_resize(Punchline.Tech.Cuppy.Framework.cfmetrotogglebutton __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrotogglebutton";
if (Debug.shouldDelegate(ba, "base_resize"))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=16187392;
 //BA.debugLineNum = 16187392;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=16187394;
 //BA.debugLineNum = 16187394;BA.debugLine="ToggleButton.PrefHeight = Height";
__ref._togglebutton.setPrefHeight(_height);
RDebugUtils.currentLine=16187395;
 //BA.debugLineNum = 16187395;BA.debugLine="ToggleButton.PrefWidth = Width";
__ref._togglebutton.setPrefWidth(_width);
RDebugUtils.currentLine=16187397;
 //BA.debugLineNum = 16187397;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,__ref._mcallback,__ref._meventname+"_Resize",(Object)(_width),(Object)(_height));
RDebugUtils.currentLine=16187399;
 //BA.debugLineNum = 16187399;BA.debugLine="End Sub";
return "";
}
public boolean  _checked(Punchline.Tech.Cuppy.Framework.cfmetrotogglebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrotogglebutton";
if (Debug.shouldDelegate(ba, "checked"))
	 {return ((Boolean) Debug.delegate(ba, "checked", null));}
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Public Sub Checked As Boolean";
RDebugUtils.currentLine=16777218;
 //BA.debugLineNum = 16777218;BA.debugLine="Return CheckedStatus";
if (true) return __ref._checkedstatus;
RDebugUtils.currentLine=16777220;
 //BA.debugLineNum = 16777220;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(Punchline.Tech.Cuppy.Framework.cfmetrotogglebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrotogglebutton";
RDebugUtils.currentLine=15990784;
 //BA.debugLineNum = 15990784;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=15990785;
 //BA.debugLineNum = 15990785;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=15990786;
 //BA.debugLineNum = 15990786;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=15990787;
 //BA.debugLineNum = 15990787;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=15990788;
 //BA.debugLineNum = 15990788;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=15990791;
 //BA.debugLineNum = 15990791;BA.debugLine="Public CHECKED_STATE As Int = 1";
_checked_state = (int) (1);
RDebugUtils.currentLine=15990792;
 //BA.debugLineNum = 15990792;BA.debugLine="Public UNCHECKED_STATE As Int = 0";
_unchecked_state = (int) (0);
RDebugUtils.currentLine=15990794;
 //BA.debugLineNum = 15990794;BA.debugLine="Private CheckedStatus As Boolean = False";
_checkedstatus = __c.False;
RDebugUtils.currentLine=15990795;
 //BA.debugLineNum = 15990795;BA.debugLine="Public ToggleButton As Label";
_togglebutton = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=15990798;
 //BA.debugLineNum = 15990798;BA.debugLine="Private FirstTime As Boolean = False";
_firsttime = __c.False;
RDebugUtils.currentLine=15990800;
 //BA.debugLineNum = 15990800;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Punchline.Tech.Cuppy.Framework.cfmetrotogglebutton __ref,anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrotogglebutton";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
String _checkedstate = "";
RDebugUtils.currentLine=16121856;
 //BA.debugLineNum = 16121856;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
RDebugUtils.currentLine=16121857;
 //BA.debugLineNum = 16121857;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=16121858;
 //BA.debugLineNum = 16121858;BA.debugLine="mBase.LoadLayout(\"CFMetroToggleButtonUI\")";
__ref._mbase.LoadLayout(ba,"CFMetroToggleButtonUI");
RDebugUtils.currentLine=16121861;
 //BA.debugLineNum = 16121861;BA.debugLine="SetCheckState(UNCHECKED_STATE) 'set initial value";
__ref._setcheckstate(null,__ref._unchecked_state);
RDebugUtils.currentLine=16121864;
 //BA.debugLineNum = 16121864;BA.debugLine="Dim checkedState As String = Props.Get(\"CheckedSt";
_checkedstate = BA.ObjectToString(_props.Get((Object)("CheckedState")));
RDebugUtils.currentLine=16121868;
 //BA.debugLineNum = 16121868;BA.debugLine="If checkedState = \"UNCHECKED\" Then";
if ((_checkedstate).equals("UNCHECKED")) { 
RDebugUtils.currentLine=16121870;
 //BA.debugLineNum = 16121870;BA.debugLine="SetCheckState(UNCHECKED_STATE)";
__ref._setcheckstate(null,__ref._unchecked_state);
 }else 
{RDebugUtils.currentLine=16121872;
 //BA.debugLineNum = 16121872;BA.debugLine="else If checkedState = \"CHECKED\" Then";
if ((_checkedstate).equals("CHECKED")) { 
RDebugUtils.currentLine=16121874;
 //BA.debugLineNum = 16121874;BA.debugLine="SetCheckState(CHECKED_STATE)";
__ref._setcheckstate(null,__ref._checked_state);
 }}
;
RDebugUtils.currentLine=16121878;
 //BA.debugLineNum = 16121878;BA.debugLine="End Sub";
return "";
}
public String  _setcheckstate(Punchline.Tech.Cuppy.Framework.cfmetrotogglebutton __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrotogglebutton";
if (Debug.shouldDelegate(ba, "setcheckstate"))
	 {return ((String) Debug.delegate(ba, "setcheckstate", new Object[] {_value}));}
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Public Sub setCheckState(value As Int)";
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="If value = UNCHECKED_STATE Then";
if (_value==__ref._unchecked_state) { 
RDebugUtils.currentLine=16711684;
 //BA.debugLineNum = 16711684;BA.debugLine="SetBg(\"white\")";
__ref._setbg(null,"white");
RDebugUtils.currentLine=16711685;
 //BA.debugLineNum = 16711685;BA.debugLine="SetBorder(\"#D6D6D6\", 2)";
__ref._setborder(null,"#D6D6D6",(int) (2));
RDebugUtils.currentLine=16711687;
 //BA.debugLineNum = 16711687;BA.debugLine="ToggleButton.TextColor = fx.Colors.RGB(91, 91, 9";
__ref._togglebutton.setTextColor((javafx.scene.paint.Paint)(__ref._fx.Colors.RGB((int) (91),(int) (91),(int) (91))));
RDebugUtils.currentLine=16711689;
 //BA.debugLineNum = 16711689;BA.debugLine="CheckedStatus = False";
__ref._checkedstatus = __c.False;
 }else 
{RDebugUtils.currentLine=16711691;
 //BA.debugLineNum = 16711691;BA.debugLine="Else if value = CHECKED_STATE Then";
if (_value==__ref._checked_state) { 
RDebugUtils.currentLine=16711694;
 //BA.debugLineNum = 16711694;BA.debugLine="SetBorder(\"#2EA9DE\", 2)";
__ref._setborder(null,"#2EA9DE",(int) (2));
RDebugUtils.currentLine=16711695;
 //BA.debugLineNum = 16711695;BA.debugLine="SetBg(\"rgb(65, 177, 225 )\")";
__ref._setbg(null,"rgb(65, 177, 225 )");
RDebugUtils.currentLine=16711697;
 //BA.debugLineNum = 16711697;BA.debugLine="ToggleButton.TextColor = fx.Colors.White";
__ref._togglebutton.setTextColor(__ref._fx.Colors.White);
RDebugUtils.currentLine=16711699;
 //BA.debugLineNum = 16711699;BA.debugLine="CheckedStatus = True";
__ref._checkedstatus = __c.True;
 }}
;
RDebugUtils.currentLine=16711703;
 //BA.debugLineNum = 16711703;BA.debugLine="If FirstTime Then";
if (__ref._firsttime) { 
RDebugUtils.currentLine=16711706;
 //BA.debugLineNum = 16711706;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checke";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_CheckedChanged",(Object)(_value));
 }else {
RDebugUtils.currentLine=16711710;
 //BA.debugLineNum = 16711710;BA.debugLine="FirstTime = True";
__ref._firsttime = __c.True;
 };
RDebugUtils.currentLine=16711713;
 //BA.debugLineNum = 16711713;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase(Punchline.Tech.Cuppy.Framework.cfmetrotogglebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrotogglebutton";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=16252928;
 //BA.debugLineNum = 16252928;BA.debugLine="Public Sub GetBase As Pane";
RDebugUtils.currentLine=16252929;
 //BA.debugLineNum = 16252929;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=16252930;
 //BA.debugLineNum = 16252930;BA.debugLine="End Sub";
return null;
}
public String  _initialize(Punchline.Tech.Cuppy.Framework.cfmetrotogglebutton __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cfmetrotogglebutton";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=16056320;
 //BA.debugLineNum = 16056320;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=16056321;
 //BA.debugLineNum = 16056321;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=16056322;
 //BA.debugLineNum = 16056322;BA.debugLine="mCallBack = Callback";
__ref._mcallback = _callback;
RDebugUtils.currentLine=16056323;
 //BA.debugLineNum = 16056323;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects(Punchline.Tech.Cuppy.Framework.cfmetrotogglebutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrotogglebutton";
if (Debug.shouldDelegate(ba, "removeeffects"))
	 {return ((String) Debug.delegate(ba, "removeeffects", null));}
RDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Public Sub RemoveEffects()";
RDebugUtils.currentLine=16646146;
 //BA.debugLineNum = 16646146;BA.debugLine="CFControlsUtils.removeEffect(ToggleButton)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._togglebutton.getObject())));
RDebugUtils.currentLine=16646148;
 //BA.debugLineNum = 16646148;BA.debugLine="End Sub";
return "";
}
public String  _setbg(Punchline.Tech.Cuppy.Framework.cfmetrotogglebutton __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrotogglebutton";
if (Debug.shouldDelegate(ba, "setbg"))
	 {return ((String) Debug.delegate(ba, "setbg", new Object[] {_color}));}
RDebugUtils.currentLine=16318464;
 //BA.debugLineNum = 16318464;BA.debugLine="Public Sub setBg(color As String)";
RDebugUtils.currentLine=16318466;
 //BA.debugLineNum = 16318466;BA.debugLine="CFControlsUtils.setBG(ToggleButton, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._togglebutton.getObject())),_color);
RDebugUtils.currentLine=16318468;
 //BA.debugLineNum = 16318468;BA.debugLine="End Sub";
return "";
}
public String  _setborder(Punchline.Tech.Cuppy.Framework.cfmetrotogglebutton __ref,String _color,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrotogglebutton";
if (Debug.shouldDelegate(ba, "setborder"))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_color,_width}));}
RDebugUtils.currentLine=16449536;
 //BA.debugLineNum = 16449536;BA.debugLine="Public Sub setBorder(color As String , width As In";
RDebugUtils.currentLine=16449538;
 //BA.debugLineNum = 16449538;BA.debugLine="CFControlsUtils.setBorder(ToggleButton, color, wi";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._togglebutton.getObject())),_color,_width);
RDebugUtils.currentLine=16449540;
 //BA.debugLineNum = 16449540;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(Punchline.Tech.Cuppy.Framework.cfmetrotogglebutton __ref,int _radius) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrotogglebutton";
if (Debug.shouldDelegate(ba, "setborderradius"))
	 {return ((String) Debug.delegate(ba, "setborderradius", new Object[] {_radius}));}
RDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
RDebugUtils.currentLine=16515074;
 //BA.debugLineNum = 16515074;BA.debugLine="CFControlsUtils.setBorderRadius(ToggleButton, rad";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._togglebutton.getObject())),_radius);
RDebugUtils.currentLine=16515076;
 //BA.debugLineNum = 16515076;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(Punchline.Tech.Cuppy.Framework.cfmetrotogglebutton __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrotogglebutton";
if (Debug.shouldDelegate(ba, "seteffect"))
	 {return ((String) Debug.delegate(ba, "seteffect", new Object[] {_effect}));}
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Public Sub setEffect(effect As String)";
RDebugUtils.currentLine=16580610;
 //BA.debugLineNum = 16580610;BA.debugLine="CFControlsUtils.setEffect(ToggleButton, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._togglebutton.getObject())),_effect);
RDebugUtils.currentLine=16580612;
 //BA.debugLineNum = 16580612;BA.debugLine="End Sub";
return "";
}
public String  _setrotation(Punchline.Tech.Cuppy.Framework.cfmetrotogglebutton __ref,float _angle) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrotogglebutton";
if (Debug.shouldDelegate(ba, "setrotation"))
	 {return ((String) Debug.delegate(ba, "setrotation", new Object[] {_angle}));}
RDebugUtils.currentLine=16384000;
 //BA.debugLineNum = 16384000;BA.debugLine="Public Sub setRotation(angle As Float)";
RDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="CFControlsUtils.setRotation(ToggleButton, angle)";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._togglebutton.getObject())),_angle);
RDebugUtils.currentLine=16384004;
 //BA.debugLineNum = 16384004;BA.debugLine="End Sub";
return "";
}
public String  _togglebutton_mousepressed(Punchline.Tech.Cuppy.Framework.cfmetrotogglebutton __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrotogglebutton";
if (Debug.shouldDelegate(ba, "togglebutton_mousepressed"))
	 {return ((String) Debug.delegate(ba, "togglebutton_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=16842752;
 //BA.debugLineNum = 16842752;BA.debugLine="Private Sub ToggleButton_MousePressed (EventData A";
RDebugUtils.currentLine=16842754;
 //BA.debugLineNum = 16842754;BA.debugLine="ToggleButton.RequestFocus 'set focus";
__ref._togglebutton.RequestFocus();
RDebugUtils.currentLine=16842756;
 //BA.debugLineNum = 16842756;BA.debugLine="If Not(Checked) Then";
if (__c.Not(__ref._checked(null))) { 
RDebugUtils.currentLine=16842758;
 //BA.debugLineNum = 16842758;BA.debugLine="SetCheckState(CHECKED_STATE)";
__ref._setcheckstate(null,__ref._checked_state);
 }else {
RDebugUtils.currentLine=16842762;
 //BA.debugLineNum = 16842762;BA.debugLine="SetCheckState(UNCHECKED_STATE)";
__ref._setcheckstate(null,__ref._unchecked_state);
 };
RDebugUtils.currentLine=16842766;
 //BA.debugLineNum = 16842766;BA.debugLine="End Sub";
return "";
}
}