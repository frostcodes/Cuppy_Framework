package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class materialcheckbox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.materialcheckbox", this);
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
public Punchline.Tech.Cuppy.Framework.cf_htmlutility _cf_htmlutility = null;
public Punchline.Tech.Cuppy.Framework.cf_datageneratorutility _cf_datageneratorutility = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 43;BA.debugLine="CheckboxPane.PrefWidth = Width";
_checkboxpane.setPrefWidth(_width);
 //BA.debugLineNum = 44;BA.debugLine="CheckedLabel.PrefWidth = Width";
_checkedlabel.setPrefWidth(_width);
 //BA.debugLineNum = 46;BA.debugLine="CheckboxPane.PrefHeight = Height";
_checkboxpane.setPrefHeight(_height);
 //BA.debugLineNum = 47;BA.debugLine="CheckedLabel.PrefHeight = Height";
_checkedlabel.setPrefHeight(_height);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public String  _checkboxpane_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Private Sub CheckboxPane_MousePressed (EventData A";
 //BA.debugLineNum = 148;BA.debugLine="If Not(checked) Or IsIndeterminate Then";
if (__c.Not(_checked()) || _isindeterminate()) { 
 //BA.debugLineNum = 150;BA.debugLine="setCheckState(CHECKED_STATE)";
_setcheckstate(_checked_state);
 }else {
 //BA.debugLineNum = 154;BA.debugLine="setCheckState(UNCHECKED_STATE)";
_setcheckstate(_unchecked_state);
 };
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return "";
}
public boolean  _checked() throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Public Sub checked As Boolean";
 //BA.debugLineNum = 129;BA.debugLine="Return CheckedLabel.Visible";
if (true) return _checkedlabel.getVisible();
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return false;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 10;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 11;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 12;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Public CheckedLabel As Label";
_checkedlabel = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Public CheckboxPane As Pane";
_checkboxpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Public CHECKED_STATE As Int = 0";
_checked_state = (int) (0);
 //BA.debugLineNum = 19;BA.debugLine="Public UNCHECKED_STATE As Int = 1";
_unchecked_state = (int) (1);
 //BA.debugLineNum = 20;BA.debugLine="Public INDETERMINATE_STATE As Int = 2";
_indeterminate_state = (int) (2);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 30;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 31;BA.debugLine="mBase.LoadLayout(\"MaterialCheckboxLayout\")";
_mbase.LoadLayout(ba,"MaterialCheckboxLayout");
 //BA.debugLineNum = 33;BA.debugLine="setBorder(StyleManager.DefaultTheme.Get(\"divider\"";
_setborder(BA.ObjectToString(_stylemanager._defaulttheme.Get((Object)("divider"))),(int) (2));
 //BA.debugLineNum = 34;BA.debugLine="setCheckedColor(StyleManager.DefaultTheme.Get(\"pr";
_setcheckedcolor(BA.ObjectToString(_stylemanager._defaulttheme.Get((Object)("primary"))));
 //BA.debugLineNum = 37;BA.debugLine="setCheckState(UNCHECKED_STATE) 'set initial value";
_setcheckstate(_unchecked_state);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 52;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 25;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 26;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public boolean  _isindeterminate() throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Public Sub IsIndeterminate As Boolean";
 //BA.debugLineNum = 135;BA.debugLine="Return CheckedLabel.Alpha = \"0.6\"";
if (true) return _checkedlabel.getAlpha()==(double)(Double.parseDouble("0.6"));
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return false;
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Public Sub removeEffects()";
 //BA.debugLineNum = 91;BA.debugLine="ControlsUtils.removePaneEffect(CheckboxPane)";
_controlsutils._removepaneeffect(_checkboxpane);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public String  _setbg(String _color) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 61;BA.debugLine="CSSUtils.SetStyleProperty( CheckboxPane, \"-fx-bac";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_checkboxpane.getObject())),"-fx-background-color",_color);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 73;BA.debugLine="ControlsUtils.setPaneBorder(CheckboxPane, color,";
_controlsutils._setpaneborder(_checkboxpane,_color,_width);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 79;BA.debugLine="ControlsUtils.setPaneBorderRadius(CheckboxPane, r";
_controlsutils._setpaneborderradius(_checkboxpane,_radius);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public String  _setcheckedcolor(String _color) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Public Sub setCheckedColor(color As String)";
 //BA.debugLineNum = 99;BA.debugLine="CSSUtils.SetStyleProperty( CheckedLabel, \"-fx-bac";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_checkedlabel.getObject())),"-fx-background-color",_color);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public String  _setcheckstate(int _value) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Public Sub setCheckState(value As Int)";
 //BA.debugLineNum = 105;BA.debugLine="If value = UNCHECKED_STATE Then";
if (_value==_unchecked_state) { 
 //BA.debugLineNum = 107;BA.debugLine="CheckedLabel.Visible = False";
_checkedlabel.setVisible(__c.False);
 //BA.debugLineNum = 108;BA.debugLine="CheckedLabel.SetAlphaAnimated(300, 0 )";
_checkedlabel.SetAlphaAnimated((int) (300),0);
 }else if(_value==_checked_state) { 
 //BA.debugLineNum = 112;BA.debugLine="CheckedLabel.Visible = True";
_checkedlabel.setVisible(__c.True);
 //BA.debugLineNum = 113;BA.debugLine="CheckedLabel.SetAlphaAnimated(300, 1 )";
_checkedlabel.SetAlphaAnimated((int) (300),1);
 }else {
 //BA.debugLineNum = 117;BA.debugLine="CheckedLabel.SetAlphaAnimated(300, 0.6 )";
_checkedlabel.SetAlphaAnimated((int) (300),0.6);
 //BA.debugLineNum = 118;BA.debugLine="CheckedLabel.Visible = True";
_checkedlabel.setVisible(__c.True);
 };
 //BA.debugLineNum = 123;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checke";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_CheckedChanged",(Object)(_value));
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public String  _seticon(int _iconcode) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Public Sub setIcon(iconCode As Int)";
 //BA.debugLineNum = 142;BA.debugLine="CheckedLabel.Text = Chr(iconCode)";
_checkedlabel.setText(BA.ObjectToString(__c.Chr(_iconcode)));
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public String  _setpaneeffect(String _effect) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Public Sub setPaneEffect(effect As String)";
 //BA.debugLineNum = 85;BA.debugLine="ControlsUtils.setPaneEffect(CheckboxPane, effect)";
_controlsutils._setpaneeffect(_checkboxpane,_effect);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(float _angle) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Public Sub setRotationX(angle As Float)";
 //BA.debugLineNum = 67;BA.debugLine="ControlsUtils.setPaneRotationX(CheckboxPane, angl";
_controlsutils._setpanerotationx(_checkboxpane,_angle);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
