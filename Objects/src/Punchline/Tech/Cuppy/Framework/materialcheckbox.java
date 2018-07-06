package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class materialcheckbox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.materialcheckbox", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.materialcheckbox.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.LabelWrapper _checkedlabel = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _checkboxpane = null;
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
public String  _base_resize(Punchline.Tech.Cuppy.Framework.materialcheckbox __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialcheckbox";
if (Debug.shouldDelegate(ba, "base_resize"))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=15597568;
 //BA.debugLineNum = 15597568;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=15597570;
 //BA.debugLineNum = 15597570;BA.debugLine="CheckboxPane.PrefWidth = Width";
__ref._checkboxpane.setPrefWidth(_width);
RDebugUtils.currentLine=15597571;
 //BA.debugLineNum = 15597571;BA.debugLine="CheckedLabel.PrefWidth = Width";
__ref._checkedlabel.setPrefWidth(_width);
RDebugUtils.currentLine=15597573;
 //BA.debugLineNum = 15597573;BA.debugLine="CheckboxPane.PrefHeight = Height";
__ref._checkboxpane.setPrefHeight(_height);
RDebugUtils.currentLine=15597574;
 //BA.debugLineNum = 15597574;BA.debugLine="CheckedLabel.PrefHeight = Height";
__ref._checkedlabel.setPrefHeight(_height);
RDebugUtils.currentLine=15597576;
 //BA.debugLineNum = 15597576;BA.debugLine="End Sub";
return "";
}
public String  _checkboxpane_mousepressed(Punchline.Tech.Cuppy.Framework.materialcheckbox __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialcheckbox";
if (Debug.shouldDelegate(ba, "checkboxpane_mousepressed"))
	 {return ((String) Debug.delegate(ba, "checkboxpane_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=16449536;
 //BA.debugLineNum = 16449536;BA.debugLine="Private Sub CheckboxPane_MousePressed (EventData A";
RDebugUtils.currentLine=16449538;
 //BA.debugLineNum = 16449538;BA.debugLine="If Not(checked) Or IsIndeterminate Then";
if (__c.Not(__ref._checked(null)) || __ref._isindeterminate(null)) { 
RDebugUtils.currentLine=16449540;
 //BA.debugLineNum = 16449540;BA.debugLine="setCheckState(CHECKED_STATE)";
__ref._setcheckstate(null,__ref._checked_state);
 }else {
RDebugUtils.currentLine=16449544;
 //BA.debugLineNum = 16449544;BA.debugLine="setCheckState(UNCHECKED_STATE)";
__ref._setcheckstate(null,__ref._unchecked_state);
 };
RDebugUtils.currentLine=16449549;
 //BA.debugLineNum = 16449549;BA.debugLine="End Sub";
return "";
}
public boolean  _checked(Punchline.Tech.Cuppy.Framework.materialcheckbox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialcheckbox";
if (Debug.shouldDelegate(ba, "checked"))
	 {return ((Boolean) Debug.delegate(ba, "checked", null));}
RDebugUtils.currentLine=16252928;
 //BA.debugLineNum = 16252928;BA.debugLine="Public Sub checked As Boolean";
RDebugUtils.currentLine=16252930;
 //BA.debugLineNum = 16252930;BA.debugLine="Return CheckedLabel.Visible";
if (true) return __ref._checkedlabel.getVisible();
RDebugUtils.currentLine=16252932;
 //BA.debugLineNum = 16252932;BA.debugLine="End Sub";
return false;
}
public boolean  _isindeterminate(Punchline.Tech.Cuppy.Framework.materialcheckbox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialcheckbox";
if (Debug.shouldDelegate(ba, "isindeterminate"))
	 {return ((Boolean) Debug.delegate(ba, "isindeterminate", null));}
RDebugUtils.currentLine=16318464;
 //BA.debugLineNum = 16318464;BA.debugLine="Public Sub IsIndeterminate As Boolean";
RDebugUtils.currentLine=16318466;
 //BA.debugLineNum = 16318466;BA.debugLine="Return CheckedLabel.Alpha = \"0.6\"";
if (true) return __ref._checkedlabel.getAlpha()==(double)(Double.parseDouble("0.6"));
RDebugUtils.currentLine=16318468;
 //BA.debugLineNum = 16318468;BA.debugLine="End Sub";
return false;
}
public String  _setcheckstate(Punchline.Tech.Cuppy.Framework.materialcheckbox __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialcheckbox";
if (Debug.shouldDelegate(ba, "setcheckstate"))
	 {return ((String) Debug.delegate(ba, "setcheckstate", new Object[] {_value}));}
RDebugUtils.currentLine=16187392;
 //BA.debugLineNum = 16187392;BA.debugLine="Public Sub setCheckState(value As Int)";
RDebugUtils.currentLine=16187394;
 //BA.debugLineNum = 16187394;BA.debugLine="If value = UNCHECKED_STATE Then";
if (_value==__ref._unchecked_state) { 
RDebugUtils.currentLine=16187396;
 //BA.debugLineNum = 16187396;BA.debugLine="CheckedLabel.Visible = False";
__ref._checkedlabel.setVisible(__c.False);
RDebugUtils.currentLine=16187397;
 //BA.debugLineNum = 16187397;BA.debugLine="CheckedLabel.SetAlphaAnimated(300, 0 )";
__ref._checkedlabel.SetAlphaAnimated((int) (300),0);
 }else 
{RDebugUtils.currentLine=16187399;
 //BA.debugLineNum = 16187399;BA.debugLine="Else if value = CHECKED_STATE Then";
if (_value==__ref._checked_state) { 
RDebugUtils.currentLine=16187401;
 //BA.debugLineNum = 16187401;BA.debugLine="CheckedLabel.Visible = True";
__ref._checkedlabel.setVisible(__c.True);
RDebugUtils.currentLine=16187402;
 //BA.debugLineNum = 16187402;BA.debugLine="CheckedLabel.SetAlphaAnimated(300, 1 )";
__ref._checkedlabel.SetAlphaAnimated((int) (300),1);
 }else {
RDebugUtils.currentLine=16187406;
 //BA.debugLineNum = 16187406;BA.debugLine="CheckedLabel.SetAlphaAnimated(300, 0.6 )";
__ref._checkedlabel.SetAlphaAnimated((int) (300),0.6);
RDebugUtils.currentLine=16187407;
 //BA.debugLineNum = 16187407;BA.debugLine="CheckedLabel.Visible = True";
__ref._checkedlabel.setVisible(__c.True);
 }}
;
RDebugUtils.currentLine=16187412;
 //BA.debugLineNum = 16187412;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checke";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_CheckedChanged",(Object)(_value));
RDebugUtils.currentLine=16187414;
 //BA.debugLineNum = 16187414;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(Punchline.Tech.Cuppy.Framework.materialcheckbox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialcheckbox";
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=15400961;
 //BA.debugLineNum = 15400961;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=15400963;
 //BA.debugLineNum = 15400963;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=15400964;
 //BA.debugLineNum = 15400964;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=15400966;
 //BA.debugLineNum = 15400966;BA.debugLine="Public CheckedLabel As Label";
_checkedlabel = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=15400967;
 //BA.debugLineNum = 15400967;BA.debugLine="Public CheckboxPane As Pane";
_checkboxpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=15400970;
 //BA.debugLineNum = 15400970;BA.debugLine="Public CHECKED_STATE As Int = 0";
_checked_state = (int) (0);
RDebugUtils.currentLine=15400971;
 //BA.debugLineNum = 15400971;BA.debugLine="Public UNCHECKED_STATE As Int = 1";
_unchecked_state = (int) (1);
RDebugUtils.currentLine=15400972;
 //BA.debugLineNum = 15400972;BA.debugLine="Public INDETERMINATE_STATE As Int = 2";
_indeterminate_state = (int) (2);
RDebugUtils.currentLine=15400974;
 //BA.debugLineNum = 15400974;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Punchline.Tech.Cuppy.Framework.materialcheckbox __ref,anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialcheckbox";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=15532032;
 //BA.debugLineNum = 15532032;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
RDebugUtils.currentLine=15532033;
 //BA.debugLineNum = 15532033;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=15532034;
 //BA.debugLineNum = 15532034;BA.debugLine="mBase.LoadLayout(\"MaterialCheckboxLayout\")";
__ref._mbase.LoadLayout(ba,"MaterialCheckboxLayout");
RDebugUtils.currentLine=15532036;
 //BA.debugLineNum = 15532036;BA.debugLine="setBorder(StyleManager.DefaultTheme.Get(\"divider\"";
__ref._setborder(null,BA.ObjectToString(_stylemanager._defaulttheme.Get((Object)("divider"))),(int) (2));
RDebugUtils.currentLine=15532037;
 //BA.debugLineNum = 15532037;BA.debugLine="setCheckedColor(StyleManager.DefaultTheme.Get(\"pr";
__ref._setcheckedcolor(null,BA.ObjectToString(_stylemanager._defaulttheme.Get((Object)("primary"))));
RDebugUtils.currentLine=15532040;
 //BA.debugLineNum = 15532040;BA.debugLine="setCheckState(UNCHECKED_STATE) 'set initial value";
__ref._setcheckstate(null,__ref._unchecked_state);
RDebugUtils.currentLine=15532042;
 //BA.debugLineNum = 15532042;BA.debugLine="End Sub";
return "";
}
public String  _setborder(Punchline.Tech.Cuppy.Framework.materialcheckbox __ref,String _color,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialcheckbox";
if (Debug.shouldDelegate(ba, "setborder"))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_color,_width}));}
RDebugUtils.currentLine=15859712;
 //BA.debugLineNum = 15859712;BA.debugLine="Public Sub setBorder(color As String , width As In";
RDebugUtils.currentLine=15859714;
 //BA.debugLineNum = 15859714;BA.debugLine="ControlsUtils.setPaneBorder(CheckboxPane, color,";
_controlsutils._setpaneborder(__ref._checkboxpane,_color,_width);
RDebugUtils.currentLine=15859716;
 //BA.debugLineNum = 15859716;BA.debugLine="End Sub";
return "";
}
public String  _setcheckedcolor(Punchline.Tech.Cuppy.Framework.materialcheckbox __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialcheckbox";
if (Debug.shouldDelegate(ba, "setcheckedcolor"))
	 {return ((String) Debug.delegate(ba, "setcheckedcolor", new Object[] {_color}));}
RDebugUtils.currentLine=16121856;
 //BA.debugLineNum = 16121856;BA.debugLine="Public Sub setCheckedColor(color As String)";
RDebugUtils.currentLine=16121858;
 //BA.debugLineNum = 16121858;BA.debugLine="CSSUtils.SetStyleProperty( CheckedLabel, \"-fx-bac";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._checkedlabel.getObject())),"-fx-background-color",_color);
RDebugUtils.currentLine=16121860;
 //BA.debugLineNum = 16121860;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase(Punchline.Tech.Cuppy.Framework.materialcheckbox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialcheckbox";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Public Sub GetBase As Pane";
RDebugUtils.currentLine=15663105;
 //BA.debugLineNum = 15663105;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=15663106;
 //BA.debugLineNum = 15663106;BA.debugLine="End Sub";
return null;
}
public String  _initialize(Punchline.Tech.Cuppy.Framework.materialcheckbox __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="materialcheckbox";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="mCallBack = Callback";
__ref._mcallback = _callback;
RDebugUtils.currentLine=15466499;
 //BA.debugLineNum = 15466499;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects(Punchline.Tech.Cuppy.Framework.materialcheckbox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialcheckbox";
if (Debug.shouldDelegate(ba, "removeeffects"))
	 {return ((String) Debug.delegate(ba, "removeeffects", null));}
RDebugUtils.currentLine=16056320;
 //BA.debugLineNum = 16056320;BA.debugLine="Public Sub removeEffects()";
RDebugUtils.currentLine=16056322;
 //BA.debugLineNum = 16056322;BA.debugLine="ControlsUtils.removePaneEffect(CheckboxPane)";
_controlsutils._removepaneeffect(__ref._checkboxpane);
RDebugUtils.currentLine=16056324;
 //BA.debugLineNum = 16056324;BA.debugLine="End Sub";
return "";
}
public String  _setbg(Punchline.Tech.Cuppy.Framework.materialcheckbox __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialcheckbox";
if (Debug.shouldDelegate(ba, "setbg"))
	 {return ((String) Debug.delegate(ba, "setbg", new Object[] {_color}));}
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Public Sub SetBg(color As String)";
RDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="CSSUtils.SetStyleProperty( CheckboxPane, \"-fx-bac";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._checkboxpane.getObject())),"-fx-background-color",_color);
RDebugUtils.currentLine=15728644;
 //BA.debugLineNum = 15728644;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(Punchline.Tech.Cuppy.Framework.materialcheckbox __ref,int _radius) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialcheckbox";
if (Debug.shouldDelegate(ba, "setborderradius"))
	 {return ((String) Debug.delegate(ba, "setborderradius", new Object[] {_radius}));}
RDebugUtils.currentLine=15925248;
 //BA.debugLineNum = 15925248;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
RDebugUtils.currentLine=15925250;
 //BA.debugLineNum = 15925250;BA.debugLine="ControlsUtils.setPaneBorderRadius(CheckboxPane, r";
_controlsutils._setpaneborderradius(__ref._checkboxpane,_radius);
RDebugUtils.currentLine=15925252;
 //BA.debugLineNum = 15925252;BA.debugLine="End Sub";
return "";
}
public String  _seticon(Punchline.Tech.Cuppy.Framework.materialcheckbox __ref,int _iconcode) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialcheckbox";
if (Debug.shouldDelegate(ba, "seticon"))
	 {return ((String) Debug.delegate(ba, "seticon", new Object[] {_iconcode}));}
RDebugUtils.currentLine=16384000;
 //BA.debugLineNum = 16384000;BA.debugLine="Public Sub setIcon(iconCode As Int)";
RDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="CheckedLabel.Text = Chr(iconCode)";
__ref._checkedlabel.setText(BA.ObjectToString(__c.Chr(_iconcode)));
RDebugUtils.currentLine=16384004;
 //BA.debugLineNum = 16384004;BA.debugLine="End Sub";
return "";
}
public String  _setpaneeffect(Punchline.Tech.Cuppy.Framework.materialcheckbox __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialcheckbox";
if (Debug.shouldDelegate(ba, "setpaneeffect"))
	 {return ((String) Debug.delegate(ba, "setpaneeffect", new Object[] {_effect}));}
RDebugUtils.currentLine=15990784;
 //BA.debugLineNum = 15990784;BA.debugLine="Public Sub setPaneEffect(effect As String)";
RDebugUtils.currentLine=15990786;
 //BA.debugLineNum = 15990786;BA.debugLine="ControlsUtils.setPaneEffect(CheckboxPane, effect)";
_controlsutils._setpaneeffect(__ref._checkboxpane,_effect);
RDebugUtils.currentLine=15990788;
 //BA.debugLineNum = 15990788;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(Punchline.Tech.Cuppy.Framework.materialcheckbox __ref,float _angle) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialcheckbox";
if (Debug.shouldDelegate(ba, "setrotationx"))
	 {return ((String) Debug.delegate(ba, "setrotationx", new Object[] {_angle}));}
RDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Public Sub setRotationX(angle As Float)";
RDebugUtils.currentLine=15794178;
 //BA.debugLineNum = 15794178;BA.debugLine="ControlsUtils.setPaneRotationX(CheckboxPane, angl";
_controlsutils._setpanerotationx(__ref._checkboxpane,_angle);
RDebugUtils.currentLine=15794180;
 //BA.debugLineNum = 15794180;BA.debugLine="End Sub";
return "";
}
}