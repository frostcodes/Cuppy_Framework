package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmaterialradiobox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmaterialradiobox", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.cfmaterialradiobox.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _checkboxpane = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _checkedpane = null;
public int _unchecked_state = 0;
public int _checked_state = 0;
public int _indeterminate_state = 0;
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
public String  _base_resize(Punchline.Tech.Cuppy.Framework.cfmaterialradiobox __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialradiobox";
if (Debug.shouldDelegate(ba, "base_resize"))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=19202048;
 //BA.debugLineNum = 19202048;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=19202050;
 //BA.debugLineNum = 19202050;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize";
__c.CallSubDelayed3(ba,__ref._mcallback,__ref._meventname+"_Resize",(Object)(_width),(Object)(_height));
RDebugUtils.currentLine=19202052;
 //BA.debugLineNum = 19202052;BA.debugLine="End Sub";
return "";
}
public String  _checkboxpane_mousepressed(Punchline.Tech.Cuppy.Framework.cfmaterialradiobox __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialradiobox";
if (Debug.shouldDelegate(ba, "checkboxpane_mousepressed"))
	 {return ((String) Debug.delegate(ba, "checkboxpane_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=19988480;
 //BA.debugLineNum = 19988480;BA.debugLine="Private Sub CheckboxPane_MousePressed (EventData A";
RDebugUtils.currentLine=19988482;
 //BA.debugLineNum = 19988482;BA.debugLine="CheckboxPane.RequestFocus 'set focus";
__ref._checkboxpane.RequestFocus();
RDebugUtils.currentLine=19988484;
 //BA.debugLineNum = 19988484;BA.debugLine="If Not(Checked) Or IsIndeterminate Then";
if (__c.Not(__ref._checked(null)) || __ref._isindeterminate(null)) { 
RDebugUtils.currentLine=19988486;
 //BA.debugLineNum = 19988486;BA.debugLine="SetCheckState(CHECKED_STATE)";
__ref._setcheckstate(null,__ref._checked_state);
 }else {
RDebugUtils.currentLine=19988490;
 //BA.debugLineNum = 19988490;BA.debugLine="SetCheckState(UNCHECKED_STATE)";
__ref._setcheckstate(null,__ref._unchecked_state);
 };
RDebugUtils.currentLine=19988494;
 //BA.debugLineNum = 19988494;BA.debugLine="End Sub";
return "";
}
public boolean  _checked(Punchline.Tech.Cuppy.Framework.cfmaterialradiobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialradiobox";
if (Debug.shouldDelegate(ba, "checked"))
	 {return ((Boolean) Debug.delegate(ba, "checked", null));}
RDebugUtils.currentLine=19857408;
 //BA.debugLineNum = 19857408;BA.debugLine="Public Sub Checked As Boolean";
RDebugUtils.currentLine=19857410;
 //BA.debugLineNum = 19857410;BA.debugLine="Return CheckedPane.Visible";
if (true) return __ref._checkedpane.getVisible();
RDebugUtils.currentLine=19857412;
 //BA.debugLineNum = 19857412;BA.debugLine="End Sub";
return false;
}
public boolean  _isindeterminate(Punchline.Tech.Cuppy.Framework.cfmaterialradiobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialradiobox";
if (Debug.shouldDelegate(ba, "isindeterminate"))
	 {return ((Boolean) Debug.delegate(ba, "isindeterminate", null));}
RDebugUtils.currentLine=19922944;
 //BA.debugLineNum = 19922944;BA.debugLine="Public Sub IsIndeterminate As Boolean";
RDebugUtils.currentLine=19922946;
 //BA.debugLineNum = 19922946;BA.debugLine="Return CheckedPane.Alpha = \"0.6\"";
if (true) return __ref._checkedpane.getAlpha()==(double)(Double.parseDouble("0.6"));
RDebugUtils.currentLine=19922948;
 //BA.debugLineNum = 19922948;BA.debugLine="End Sub";
return false;
}
public String  _setcheckstate(Punchline.Tech.Cuppy.Framework.cfmaterialradiobox __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialradiobox";
if (Debug.shouldDelegate(ba, "setcheckstate"))
	 {return ((String) Debug.delegate(ba, "setcheckstate", new Object[] {_value}));}
RDebugUtils.currentLine=19791872;
 //BA.debugLineNum = 19791872;BA.debugLine="Public Sub setCheckState(value As Int)";
RDebugUtils.currentLine=19791874;
 //BA.debugLineNum = 19791874;BA.debugLine="If value = UNCHECKED_STATE Then";
if (_value==__ref._unchecked_state) { 
RDebugUtils.currentLine=19791876;
 //BA.debugLineNum = 19791876;BA.debugLine="CheckedPane.Visible = False";
__ref._checkedpane.setVisible(__c.False);
RDebugUtils.currentLine=19791877;
 //BA.debugLineNum = 19791877;BA.debugLine="CheckedPane.SetAlphaAnimated(300, 0 )";
__ref._checkedpane.SetAlphaAnimated((int) (300),0);
 }else 
{RDebugUtils.currentLine=19791879;
 //BA.debugLineNum = 19791879;BA.debugLine="Else if value = CHECKED_STATE Then";
if (_value==__ref._checked_state) { 
RDebugUtils.currentLine=19791881;
 //BA.debugLineNum = 19791881;BA.debugLine="CheckedPane.Visible = True";
__ref._checkedpane.setVisible(__c.True);
RDebugUtils.currentLine=19791882;
 //BA.debugLineNum = 19791882;BA.debugLine="CheckedPane.SetAlphaAnimated(300, 1 )";
__ref._checkedpane.SetAlphaAnimated((int) (300),1);
 }else {
RDebugUtils.currentLine=19791886;
 //BA.debugLineNum = 19791886;BA.debugLine="CheckedPane.SetAlphaAnimated(300, 0.6 )";
__ref._checkedpane.SetAlphaAnimated((int) (300),0.6);
RDebugUtils.currentLine=19791887;
 //BA.debugLineNum = 19791887;BA.debugLine="CheckedPane.Visible = True";
__ref._checkedpane.setVisible(__c.True);
 }}
;
RDebugUtils.currentLine=19791891;
 //BA.debugLineNum = 19791891;BA.debugLine="If FirstTime Then";
if (__ref._firsttime) { 
RDebugUtils.currentLine=19791894;
 //BA.debugLineNum = 19791894;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checke";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_CheckedChanged",(Object)(_value));
 }else {
RDebugUtils.currentLine=19791898;
 //BA.debugLineNum = 19791898;BA.debugLine="FirstTime = True";
__ref._firsttime = __c.True;
 };
RDebugUtils.currentLine=19791902;
 //BA.debugLineNum = 19791902;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(Punchline.Tech.Cuppy.Framework.cfmaterialradiobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialradiobox";
RDebugUtils.currentLine=19005440;
 //BA.debugLineNum = 19005440;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=19005441;
 //BA.debugLineNum = 19005441;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=19005442;
 //BA.debugLineNum = 19005442;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=19005443;
 //BA.debugLineNum = 19005443;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=19005444;
 //BA.debugLineNum = 19005444;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=19005446;
 //BA.debugLineNum = 19005446;BA.debugLine="Public CheckboxPane As Pane";
_checkboxpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=19005447;
 //BA.debugLineNum = 19005447;BA.debugLine="Public CheckedPane As Pane";
_checkedpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=19005450;
 //BA.debugLineNum = 19005450;BA.debugLine="Public UNCHECKED_STATE As Int = 0";
_unchecked_state = (int) (0);
RDebugUtils.currentLine=19005451;
 //BA.debugLineNum = 19005451;BA.debugLine="Public CHECKED_STATE As Int = 1";
_checked_state = (int) (1);
RDebugUtils.currentLine=19005452;
 //BA.debugLineNum = 19005452;BA.debugLine="Public INDETERMINATE_STATE As Int = 2";
_indeterminate_state = (int) (2);
RDebugUtils.currentLine=19005455;
 //BA.debugLineNum = 19005455;BA.debugLine="Private FirstTime As Boolean = False";
_firsttime = __c.False;
RDebugUtils.currentLine=19005456;
 //BA.debugLineNum = 19005456;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Punchline.Tech.Cuppy.Framework.cfmaterialradiobox __ref,anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialradiobox";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
String _checkedstate = "";
RDebugUtils.currentLine=19136512;
 //BA.debugLineNum = 19136512;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
RDebugUtils.currentLine=19136513;
 //BA.debugLineNum = 19136513;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=19136514;
 //BA.debugLineNum = 19136514;BA.debugLine="mBase.LoadLayout(\"CFMaterialRadioBoxUI\")";
__ref._mbase.LoadLayout(ba,"CFMaterialRadioBoxUI");
RDebugUtils.currentLine=19136517;
 //BA.debugLineNum = 19136517;BA.debugLine="setBorder(CFStyleManager.DefaultTheme.Get(\"divide";
__ref._setborder(null,BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("divider"))),(int) (2));
RDebugUtils.currentLine=19136519;
 //BA.debugLineNum = 19136519;BA.debugLine="setCheckedColor(CFStyleManager.DefaultTheme.Get(\"";
__ref._setcheckedcolor(null,BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("primary"))));
RDebugUtils.currentLine=19136523;
 //BA.debugLineNum = 19136523;BA.debugLine="Dim checkedState As String = Props.Get(\"CheckedSt";
_checkedstate = BA.ObjectToString(_props.Get((Object)("CheckedState")));
RDebugUtils.currentLine=19136527;
 //BA.debugLineNum = 19136527;BA.debugLine="If checkedState = \"UNCHECKED\" Then";
if ((_checkedstate).equals("UNCHECKED")) { 
RDebugUtils.currentLine=19136529;
 //BA.debugLineNum = 19136529;BA.debugLine="setCheckState(UNCHECKED_STATE)";
__ref._setcheckstate(null,__ref._unchecked_state);
 }else 
{RDebugUtils.currentLine=19136531;
 //BA.debugLineNum = 19136531;BA.debugLine="else If checkedState = \"CHECKED\" Then";
if ((_checkedstate).equals("CHECKED")) { 
RDebugUtils.currentLine=19136533;
 //BA.debugLineNum = 19136533;BA.debugLine="setCheckState(CHECKED_STATE)";
__ref._setcheckstate(null,__ref._checked_state);
 }else 
{RDebugUtils.currentLine=19136535;
 //BA.debugLineNum = 19136535;BA.debugLine="else If checkedState = \"INDETERMINATE\" Then";
if ((_checkedstate).equals("INDETERMINATE")) { 
RDebugUtils.currentLine=19136537;
 //BA.debugLineNum = 19136537;BA.debugLine="setCheckState(INDETERMINATE_STATE)";
__ref._setcheckstate(null,__ref._indeterminate_state);
 }}}
;
RDebugUtils.currentLine=19136541;
 //BA.debugLineNum = 19136541;BA.debugLine="End Sub";
return "";
}
public String  _setborder(Punchline.Tech.Cuppy.Framework.cfmaterialradiobox __ref,String _color,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialradiobox";
if (Debug.shouldDelegate(ba, "setborder"))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_color,_width}));}
RDebugUtils.currentLine=19464192;
 //BA.debugLineNum = 19464192;BA.debugLine="Public Sub setBorder(color As String , width As In";
RDebugUtils.currentLine=19464194;
 //BA.debugLineNum = 19464194;BA.debugLine="CFControlsUtils.SetBorder(CheckboxPane, color, wi";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._checkboxpane.getObject())),_color,_width);
RDebugUtils.currentLine=19464196;
 //BA.debugLineNum = 19464196;BA.debugLine="End Sub";
return "";
}
public String  _setcheckedcolor(Punchline.Tech.Cuppy.Framework.cfmaterialradiobox __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialradiobox";
if (Debug.shouldDelegate(ba, "setcheckedcolor"))
	 {return ((String) Debug.delegate(ba, "setcheckedcolor", new Object[] {_color}));}
RDebugUtils.currentLine=19726336;
 //BA.debugLineNum = 19726336;BA.debugLine="Public Sub setCheckedColor(color As String)";
RDebugUtils.currentLine=19726338;
 //BA.debugLineNum = 19726338;BA.debugLine="CFControlsUtils.SetBG( CheckedPane, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._checkedpane.getObject())),_color);
RDebugUtils.currentLine=19726340;
 //BA.debugLineNum = 19726340;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase(Punchline.Tech.Cuppy.Framework.cfmaterialradiobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialradiobox";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=19267584;
 //BA.debugLineNum = 19267584;BA.debugLine="Public Sub GetBase As Pane";
RDebugUtils.currentLine=19267585;
 //BA.debugLineNum = 19267585;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=19267586;
 //BA.debugLineNum = 19267586;BA.debugLine="End Sub";
return null;
}
public String  _initialize(Punchline.Tech.Cuppy.Framework.cfmaterialradiobox __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cfmaterialradiobox";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=19070976;
 //BA.debugLineNum = 19070976;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=19070977;
 //BA.debugLineNum = 19070977;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=19070978;
 //BA.debugLineNum = 19070978;BA.debugLine="mCallBack = Callback";
__ref._mcallback = _callback;
RDebugUtils.currentLine=19070979;
 //BA.debugLineNum = 19070979;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects(Punchline.Tech.Cuppy.Framework.cfmaterialradiobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialradiobox";
if (Debug.shouldDelegate(ba, "removeeffects"))
	 {return ((String) Debug.delegate(ba, "removeeffects", null));}
RDebugUtils.currentLine=19660800;
 //BA.debugLineNum = 19660800;BA.debugLine="Public Sub RemoveEffects()";
RDebugUtils.currentLine=19660802;
 //BA.debugLineNum = 19660802;BA.debugLine="CFControlsUtils.RemoveEffect(CheckboxPane)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._checkboxpane.getObject())));
RDebugUtils.currentLine=19660804;
 //BA.debugLineNum = 19660804;BA.debugLine="End Sub";
return "";
}
public String  _setbg(Punchline.Tech.Cuppy.Framework.cfmaterialradiobox __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialradiobox";
if (Debug.shouldDelegate(ba, "setbg"))
	 {return ((String) Debug.delegate(ba, "setbg", new Object[] {_color}));}
RDebugUtils.currentLine=19333120;
 //BA.debugLineNum = 19333120;BA.debugLine="Public Sub setBg(color As String)";
RDebugUtils.currentLine=19333122;
 //BA.debugLineNum = 19333122;BA.debugLine="CFControlsUtils.SetBG( CheckboxPane, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._checkboxpane.getObject())),_color);
RDebugUtils.currentLine=19333124;
 //BA.debugLineNum = 19333124;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(Punchline.Tech.Cuppy.Framework.cfmaterialradiobox __ref,int _radius) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialradiobox";
if (Debug.shouldDelegate(ba, "setborderradius"))
	 {return ((String) Debug.delegate(ba, "setborderradius", new Object[] {_radius}));}
RDebugUtils.currentLine=19529728;
 //BA.debugLineNum = 19529728;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
RDebugUtils.currentLine=19529730;
 //BA.debugLineNum = 19529730;BA.debugLine="CFControlsUtils.SetBorderRadius(CheckboxPane, rad";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._checkboxpane.getObject())),_radius);
RDebugUtils.currentLine=19529732;
 //BA.debugLineNum = 19529732;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(Punchline.Tech.Cuppy.Framework.cfmaterialradiobox __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialradiobox";
if (Debug.shouldDelegate(ba, "seteffect"))
	 {return ((String) Debug.delegate(ba, "seteffect", new Object[] {_effect}));}
RDebugUtils.currentLine=19595264;
 //BA.debugLineNum = 19595264;BA.debugLine="Public Sub setEffect(effect As String)";
RDebugUtils.currentLine=19595266;
 //BA.debugLineNum = 19595266;BA.debugLine="CFControlsUtils.SetEffect(CheckboxPane, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._checkboxpane.getObject())),_effect);
RDebugUtils.currentLine=19595268;
 //BA.debugLineNum = 19595268;BA.debugLine="End Sub";
return "";
}
public String  _setrotation(Punchline.Tech.Cuppy.Framework.cfmaterialradiobox __ref,float _angle) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialradiobox";
if (Debug.shouldDelegate(ba, "setrotation"))
	 {return ((String) Debug.delegate(ba, "setrotation", new Object[] {_angle}));}
RDebugUtils.currentLine=19398656;
 //BA.debugLineNum = 19398656;BA.debugLine="Public Sub setRotation(angle As Float)";
RDebugUtils.currentLine=19398658;
 //BA.debugLineNum = 19398658;BA.debugLine="CFControlsUtils.SetRotation(CheckboxPane, angle)";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._checkboxpane.getObject())),_angle);
RDebugUtils.currentLine=19398660;
 //BA.debugLineNum = 19398660;BA.debugLine="End Sub";
return "";
}
}