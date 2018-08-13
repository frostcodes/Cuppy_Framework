package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmaterialcheckbox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox.class).invoke(this, new Object[] {null});
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
public int _unchecked_state = 0;
public int _checked_state = 0;
public int _indeterminate_state = 0;
public b4j.example.cssutils _cssutils = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public Punchline.Tech.Cuppy.Framework.cflicensemanager _cflicensemanager = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 49;BA.debugLine="CheckboxPane.PrefWidth = Width";
_checkboxpane.setPrefWidth(_width);
 //BA.debugLineNum = 50;BA.debugLine="CheckedLabel.PrefWidth = Width";
_checkedlabel.setPrefWidth(_width);
 //BA.debugLineNum = 52;BA.debugLine="CheckboxPane.PrefHeight = Height";
_checkboxpane.setPrefHeight(_height);
 //BA.debugLineNum = 53;BA.debugLine="CheckedLabel.PrefHeight = Height";
_checkedlabel.setPrefHeight(_height);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _checkboxpane_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Private Sub CheckboxPane_MouseEntered (EventData A";
 //BA.debugLineNum = 169;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEn";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MouseEntered",(Object)(_eventdata));
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return "";
}
public String  _checkboxpane_mouseexited(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Private Sub CheckboxPane_MouseExited (EventData As";
 //BA.debugLineNum = 175;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEx";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MouseExited",(Object)(_eventdata));
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return "";
}
public String  _checkboxpane_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Private Sub CheckboxPane_MousePressed (EventData A";
 //BA.debugLineNum = 154;BA.debugLine="If Not(Checked) Or IsIndeterminate Then";
if (__c.Not(_checked()) || _isindeterminate()) { 
 //BA.debugLineNum = 156;BA.debugLine="SetCheckState(CHECKED_STATE)";
_setcheckstate(_checked_state);
 }else {
 //BA.debugLineNum = 160;BA.debugLine="SetCheckState(UNCHECKED_STATE)";
_setcheckstate(_unchecked_state);
 };
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return "";
}
public boolean  _checked() throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Public Sub Checked As Boolean";
 //BA.debugLineNum = 135;BA.debugLine="Return CheckedLabel.Visible";
if (true) return _checkedlabel.getVisible();
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return false;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 16;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 17;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 18;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Public CheckedLabel As Label";
_checkedlabel = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Public CheckboxPane As Pane";
_checkboxpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Public UNCHECKED_STATE As Int = 0";
_unchecked_state = (int) (0);
 //BA.debugLineNum = 25;BA.debugLine="Public CHECKED_STATE As Int = 1";
_checked_state = (int) (1);
 //BA.debugLineNum = 26;BA.debugLine="Public INDETERMINATE_STATE As Int = 2";
_indeterminate_state = (int) (2);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 36;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 37;BA.debugLine="mBase.LoadLayout(\"CFMaterialCheckboxUI\")";
_mbase.LoadLayout(ba,"CFMaterialCheckboxUI");
 //BA.debugLineNum = 39;BA.debugLine="SetBorder(CFStyleManager.DefaultTheme.Get(\"divide";
_setborder(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("divider"))),(int) (2));
 //BA.debugLineNum = 40;BA.debugLine="SetCheckedColor(CFStyleManager.DefaultTheme.Get(\"";
_setcheckedcolor(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("primary"))));
 //BA.debugLineNum = 43;BA.debugLine="SetCheckState(UNCHECKED_STATE) 'set initial value";
_setcheckstate(_unchecked_state);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 58;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 30;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 31;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 32;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public boolean  _isindeterminate() throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Public Sub IsIndeterminate As Boolean";
 //BA.debugLineNum = 141;BA.debugLine="Return CheckedLabel.Alpha = \"0.6\"";
if (true) return _checkedlabel.getAlpha()==(double)(Double.parseDouble("0.6"));
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return false;
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 97;BA.debugLine="CFControlsUtils.removePaneEffect(CheckboxPane)";
_cfcontrolsutils._removepaneeffect(_checkboxpane);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public String  _setbg(String _color) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 67;BA.debugLine="CFControlsUtils.SetPaneBG( CheckboxPane, color)";
_cfcontrolsutils._setpanebg(_checkboxpane,_color);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Public Sub SetBorder(color As String , width As In";
 //BA.debugLineNum = 79;BA.debugLine="CFControlsUtils.SetPaneBorder(CheckboxPane, color";
_cfcontrolsutils._setpaneborder(_checkboxpane,_color,_width);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Public Sub SetBorderRadius(radius As Int)";
 //BA.debugLineNum = 85;BA.debugLine="CFControlsUtils.setPaneBorderRadius(CheckboxPane,";
_cfcontrolsutils._setpaneborderradius(_checkboxpane,_radius);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public String  _setcheckedcolor(String _color) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Public Sub SetCheckedColor(color As String)";
 //BA.debugLineNum = 105;BA.debugLine="CFControlsUtils.setBG(CheckedLabel, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_checkedlabel.getObject())),_color);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public String  _setcheckstate(int _value) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Public Sub SetCheckState(value As Int)";
 //BA.debugLineNum = 111;BA.debugLine="If value = UNCHECKED_STATE Then";
if (_value==_unchecked_state) { 
 //BA.debugLineNum = 113;BA.debugLine="CheckedLabel.Visible = False";
_checkedlabel.setVisible(__c.False);
 //BA.debugLineNum = 114;BA.debugLine="CheckedLabel.SetAlphaAnimated(300, 0 )";
_checkedlabel.SetAlphaAnimated((int) (300),0);
 }else if(_value==_checked_state) { 
 //BA.debugLineNum = 118;BA.debugLine="CheckedLabel.Visible = True";
_checkedlabel.setVisible(__c.True);
 //BA.debugLineNum = 119;BA.debugLine="CheckedLabel.SetAlphaAnimated(300, 1 )";
_checkedlabel.SetAlphaAnimated((int) (300),1);
 }else {
 //BA.debugLineNum = 123;BA.debugLine="CheckedLabel.SetAlphaAnimated(300, 0.6 )";
_checkedlabel.SetAlphaAnimated((int) (300),0.6);
 //BA.debugLineNum = 124;BA.debugLine="CheckedLabel.Visible = True";
_checkedlabel.setVisible(__c.True);
 };
 //BA.debugLineNum = 129;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checke";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_CheckedChanged",(Object)(_value));
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public String  _seticon(int _iconcode) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Public Sub SetIcon(iconCode As Int)";
 //BA.debugLineNum = 148;BA.debugLine="CheckedLabel.Text = Chr(iconCode)";
_checkedlabel.setText(BA.ObjectToString(__c.Chr(_iconcode)));
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public String  _setpaneeffect(String _effect) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Public Sub SetPaneEffect(effect As String)";
 //BA.debugLineNum = 91;BA.debugLine="CFControlsUtils.setPaneEffect(CheckboxPane, effec";
_cfcontrolsutils._setpaneeffect(_checkboxpane,_effect);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(float _angle) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Public Sub SetRotationX(angle As Float)";
 //BA.debugLineNum = 73;BA.debugLine="CFControlsUtils.SetPaneRotationX(CheckboxPane, an";
_cfcontrolsutils._setpanerotationx(_checkboxpane,_angle);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
