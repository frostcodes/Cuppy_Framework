package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class materialradiobox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.materialradiobox", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.materialradiobox.class).invoke(this, new Object[] {null});
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
public int _checked_state = 0;
public int _unchecked_state = 0;
public int _indeterminate_state = 0;
public b4j.example.cssutils _cssutils = null;
public Punchline.Tech.Cuppy.Framework.main _main = null;
public Punchline.Tech.Cuppy.Framework.configs _configs = null;
public Punchline.Tech.Cuppy.Framework.stringutility _stringutility = null;
public Punchline.Tech.Cuppy.Framework.mathutility _mathutility = null;
public Punchline.Tech.Cuppy.Framework.datatypeutility _datatypeutility = null;
public Punchline.Tech.Cuppy.Framework.stylemanager _stylemanager = null;
public Punchline.Tech.Cuppy.Framework.apputility _apputility = null;
public Punchline.Tech.Cuppy.Framework.controlsutils _controlsutils = null;
public Punchline.Tech.Cuppy.Framework.fileutility _fileutility = null;
public Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public String  _base_resize(Punchline.Tech.Cuppy.Framework.materialradiobox __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialradiobox";
if (Debug.shouldDelegate(ba, "base_resize"))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="End Sub";
return "";
}
public String  _checkboxpane_mousepressed(Punchline.Tech.Cuppy.Framework.materialradiobox __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialradiobox";
if (Debug.shouldDelegate(ba, "checkboxpane_mousepressed"))
	 {return ((String) Debug.delegate(ba, "checkboxpane_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=17498112;
 //BA.debugLineNum = 17498112;BA.debugLine="Private Sub CheckboxPane_MousePressed (EventData A";
RDebugUtils.currentLine=17498114;
 //BA.debugLineNum = 17498114;BA.debugLine="If Not(checked) Or IsIndeterminate Then";
if (__c.Not(__ref._checked(null)) || __ref._isindeterminate(null)) { 
RDebugUtils.currentLine=17498116;
 //BA.debugLineNum = 17498116;BA.debugLine="setCheckState(CHECKED_STATE)";
__ref._setcheckstate(null,__ref._checked_state);
 }else {
RDebugUtils.currentLine=17498120;
 //BA.debugLineNum = 17498120;BA.debugLine="setCheckState(UNCHECKED_STATE)";
__ref._setcheckstate(null,__ref._unchecked_state);
 };
RDebugUtils.currentLine=17498125;
 //BA.debugLineNum = 17498125;BA.debugLine="End Sub";
return "";
}
public boolean  _checked(Punchline.Tech.Cuppy.Framework.materialradiobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialradiobox";
if (Debug.shouldDelegate(ba, "checked"))
	 {return ((Boolean) Debug.delegate(ba, "checked", null));}
RDebugUtils.currentLine=17367040;
 //BA.debugLineNum = 17367040;BA.debugLine="Public Sub checked As Boolean";
RDebugUtils.currentLine=17367042;
 //BA.debugLineNum = 17367042;BA.debugLine="Return CheckedPane.Visible";
if (true) return __ref._checkedpane.getVisible();
RDebugUtils.currentLine=17367044;
 //BA.debugLineNum = 17367044;BA.debugLine="End Sub";
return false;
}
public boolean  _isindeterminate(Punchline.Tech.Cuppy.Framework.materialradiobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialradiobox";
if (Debug.shouldDelegate(ba, "isindeterminate"))
	 {return ((Boolean) Debug.delegate(ba, "isindeterminate", null));}
RDebugUtils.currentLine=17432576;
 //BA.debugLineNum = 17432576;BA.debugLine="Public Sub IsIndeterminate As Boolean";
RDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="Return CheckedPane.Alpha = \"0.6\"";
if (true) return __ref._checkedpane.getAlpha()==(double)(Double.parseDouble("0.6"));
RDebugUtils.currentLine=17432580;
 //BA.debugLineNum = 17432580;BA.debugLine="End Sub";
return false;
}
public String  _setcheckstate(Punchline.Tech.Cuppy.Framework.materialradiobox __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialradiobox";
if (Debug.shouldDelegate(ba, "setcheckstate"))
	 {return ((String) Debug.delegate(ba, "setcheckstate", new Object[] {_value}));}
RDebugUtils.currentLine=17301504;
 //BA.debugLineNum = 17301504;BA.debugLine="Public Sub setCheckState(value As Int)";
RDebugUtils.currentLine=17301506;
 //BA.debugLineNum = 17301506;BA.debugLine="If value = UNCHECKED_STATE Then";
if (_value==__ref._unchecked_state) { 
RDebugUtils.currentLine=17301508;
 //BA.debugLineNum = 17301508;BA.debugLine="CheckedPane.Visible = False";
__ref._checkedpane.setVisible(__c.False);
RDebugUtils.currentLine=17301509;
 //BA.debugLineNum = 17301509;BA.debugLine="CheckedPane.SetAlphaAnimated(300, 0 )";
__ref._checkedpane.SetAlphaAnimated((int) (300),0);
 }else 
{RDebugUtils.currentLine=17301513;
 //BA.debugLineNum = 17301513;BA.debugLine="Else if value = CHECKED_STATE Then";
if (_value==__ref._checked_state) { 
RDebugUtils.currentLine=17301515;
 //BA.debugLineNum = 17301515;BA.debugLine="CheckedPane.Visible = True";
__ref._checkedpane.setVisible(__c.True);
RDebugUtils.currentLine=17301516;
 //BA.debugLineNum = 17301516;BA.debugLine="CheckedPane.SetAlphaAnimated(300, 1 )";
__ref._checkedpane.SetAlphaAnimated((int) (300),1);
 }else {
RDebugUtils.currentLine=17301522;
 //BA.debugLineNum = 17301522;BA.debugLine="CheckedPane.SetAlphaAnimated(300, 0.6 )";
__ref._checkedpane.SetAlphaAnimated((int) (300),0.6);
RDebugUtils.currentLine=17301523;
 //BA.debugLineNum = 17301523;BA.debugLine="CheckedPane.Visible = True";
__ref._checkedpane.setVisible(__c.True);
 }}
;
RDebugUtils.currentLine=17301530;
 //BA.debugLineNum = 17301530;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checked";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_CheckedChanged",(Object)(_value));
RDebugUtils.currentLine=17301532;
 //BA.debugLineNum = 17301532;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(Punchline.Tech.Cuppy.Framework.materialradiobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialradiobox";
RDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=16515073;
 //BA.debugLineNum = 16515073;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=16515074;
 //BA.debugLineNum = 16515074;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=16515075;
 //BA.debugLineNum = 16515075;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=16515076;
 //BA.debugLineNum = 16515076;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=16515078;
 //BA.debugLineNum = 16515078;BA.debugLine="Public CheckboxPane As Pane";
_checkboxpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=16515079;
 //BA.debugLineNum = 16515079;BA.debugLine="Public CheckedPane As Pane";
_checkedpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=16515082;
 //BA.debugLineNum = 16515082;BA.debugLine="Public CHECKED_STATE As Int = 0";
_checked_state = (int) (0);
RDebugUtils.currentLine=16515083;
 //BA.debugLineNum = 16515083;BA.debugLine="Public UNCHECKED_STATE As Int = 1";
_unchecked_state = (int) (1);
RDebugUtils.currentLine=16515084;
 //BA.debugLineNum = 16515084;BA.debugLine="Public INDETERMINATE_STATE As Int = 2";
_indeterminate_state = (int) (2);
RDebugUtils.currentLine=16515086;
 //BA.debugLineNum = 16515086;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Punchline.Tech.Cuppy.Framework.materialradiobox __ref,anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialradiobox";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
RDebugUtils.currentLine=16646145;
 //BA.debugLineNum = 16646145;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=16646146;
 //BA.debugLineNum = 16646146;BA.debugLine="mBase.LoadLayout(\"MaterialRadioBoxLayout\")";
__ref._mbase.LoadLayout(ba,"MaterialRadioBoxLayout");
RDebugUtils.currentLine=16646149;
 //BA.debugLineNum = 16646149;BA.debugLine="setBorder(StyleManager.DefaultTheme.Get(\"divider\"";
__ref._setborder(null,BA.ObjectToString(_stylemanager._defaulttheme.Get((Object)("divider"))),(int) (2));
RDebugUtils.currentLine=16646151;
 //BA.debugLineNum = 16646151;BA.debugLine="setCheckedColor(StyleManager.DefaultTheme.Get(\"pr";
__ref._setcheckedcolor(null,BA.ObjectToString(_stylemanager._defaulttheme.Get((Object)("primary"))));
RDebugUtils.currentLine=16646154;
 //BA.debugLineNum = 16646154;BA.debugLine="setCheckState(UNCHECKED_STATE) 'set initial value";
__ref._setcheckstate(null,__ref._unchecked_state);
RDebugUtils.currentLine=16646156;
 //BA.debugLineNum = 16646156;BA.debugLine="End Sub";
return "";
}
public String  _setborder(Punchline.Tech.Cuppy.Framework.materialradiobox __ref,String _color,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialradiobox";
if (Debug.shouldDelegate(ba, "setborder"))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_color,_width}));}
RDebugUtils.currentLine=16973824;
 //BA.debugLineNum = 16973824;BA.debugLine="Public Sub setBorder(color As String , width As In";
RDebugUtils.currentLine=16973826;
 //BA.debugLineNum = 16973826;BA.debugLine="ControlsUtils.setPaneBorder(CheckboxPane, color,";
_controlsutils._setpaneborder(__ref._checkboxpane,_color,_width);
RDebugUtils.currentLine=16973828;
 //BA.debugLineNum = 16973828;BA.debugLine="End Sub";
return "";
}
public String  _setcheckedcolor(Punchline.Tech.Cuppy.Framework.materialradiobox __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialradiobox";
if (Debug.shouldDelegate(ba, "setcheckedcolor"))
	 {return ((String) Debug.delegate(ba, "setcheckedcolor", new Object[] {_color}));}
RDebugUtils.currentLine=17235968;
 //BA.debugLineNum = 17235968;BA.debugLine="Public Sub setCheckedColor(color As String)";
RDebugUtils.currentLine=17235970;
 //BA.debugLineNum = 17235970;BA.debugLine="CSSUtils.SetStyleProperty( CheckedPane, \"-fx-back";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._checkedpane.getObject())),"-fx-background-color",_color);
RDebugUtils.currentLine=17235972;
 //BA.debugLineNum = 17235972;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase(Punchline.Tech.Cuppy.Framework.materialradiobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialradiobox";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Public Sub GetBase As Pane";
RDebugUtils.currentLine=16777217;
 //BA.debugLineNum = 16777217;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=16777218;
 //BA.debugLineNum = 16777218;BA.debugLine="End Sub";
return null;
}
public String  _initialize(Punchline.Tech.Cuppy.Framework.materialradiobox __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="materialradiobox";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=16580609;
 //BA.debugLineNum = 16580609;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=16580610;
 //BA.debugLineNum = 16580610;BA.debugLine="mCallBack = Callback";
__ref._mcallback = _callback;
RDebugUtils.currentLine=16580611;
 //BA.debugLineNum = 16580611;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects(Punchline.Tech.Cuppy.Framework.materialradiobox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialradiobox";
if (Debug.shouldDelegate(ba, "removeeffects"))
	 {return ((String) Debug.delegate(ba, "removeeffects", null));}
RDebugUtils.currentLine=17170432;
 //BA.debugLineNum = 17170432;BA.debugLine="Public Sub removeEffects()";
RDebugUtils.currentLine=17170434;
 //BA.debugLineNum = 17170434;BA.debugLine="ControlsUtils.removePaneEffect(CheckboxPane)";
_controlsutils._removepaneeffect(__ref._checkboxpane);
RDebugUtils.currentLine=17170436;
 //BA.debugLineNum = 17170436;BA.debugLine="End Sub";
return "";
}
public String  _setbg(Punchline.Tech.Cuppy.Framework.materialradiobox __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialradiobox";
if (Debug.shouldDelegate(ba, "setbg"))
	 {return ((String) Debug.delegate(ba, "setbg", new Object[] {_color}));}
RDebugUtils.currentLine=16842752;
 //BA.debugLineNum = 16842752;BA.debugLine="Public Sub SetBg(color As String)";
RDebugUtils.currentLine=16842754;
 //BA.debugLineNum = 16842754;BA.debugLine="CSSUtils.SetStyleProperty( CheckboxPane, \"-fx-bac";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._checkboxpane.getObject())),"-fx-background-color",_color);
RDebugUtils.currentLine=16842756;
 //BA.debugLineNum = 16842756;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(Punchline.Tech.Cuppy.Framework.materialradiobox __ref,int _radius) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialradiobox";
if (Debug.shouldDelegate(ba, "setborderradius"))
	 {return ((String) Debug.delegate(ba, "setborderradius", new Object[] {_radius}));}
RDebugUtils.currentLine=17039360;
 //BA.debugLineNum = 17039360;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
RDebugUtils.currentLine=17039362;
 //BA.debugLineNum = 17039362;BA.debugLine="ControlsUtils.setPaneBorderRadius(CheckboxPane, r";
_controlsutils._setpaneborderradius(__ref._checkboxpane,_radius);
RDebugUtils.currentLine=17039364;
 //BA.debugLineNum = 17039364;BA.debugLine="End Sub";
return "";
}
public String  _setpaneeffect(Punchline.Tech.Cuppy.Framework.materialradiobox __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialradiobox";
if (Debug.shouldDelegate(ba, "setpaneeffect"))
	 {return ((String) Debug.delegate(ba, "setpaneeffect", new Object[] {_effect}));}
RDebugUtils.currentLine=17104896;
 //BA.debugLineNum = 17104896;BA.debugLine="Public Sub setPaneEffect(effect As String)";
RDebugUtils.currentLine=17104898;
 //BA.debugLineNum = 17104898;BA.debugLine="ControlsUtils.setPaneEffect(CheckboxPane, effect)";
_controlsutils._setpaneeffect(__ref._checkboxpane,_effect);
RDebugUtils.currentLine=17104900;
 //BA.debugLineNum = 17104900;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(Punchline.Tech.Cuppy.Framework.materialradiobox __ref,float _angle) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialradiobox";
if (Debug.shouldDelegate(ba, "setrotationx"))
	 {return ((String) Debug.delegate(ba, "setrotationx", new Object[] {_angle}));}
RDebugUtils.currentLine=16908288;
 //BA.debugLineNum = 16908288;BA.debugLine="Public Sub setRotationX(angle As Float)";
RDebugUtils.currentLine=16908290;
 //BA.debugLineNum = 16908290;BA.debugLine="ControlsUtils.setPaneRotationX(CheckboxPane, angl";
_controlsutils._setpanerotationx(__ref._checkboxpane,_angle);
RDebugUtils.currentLine=16908292;
 //BA.debugLineNum = 16908292;BA.debugLine="End Sub";
return "";
}
}