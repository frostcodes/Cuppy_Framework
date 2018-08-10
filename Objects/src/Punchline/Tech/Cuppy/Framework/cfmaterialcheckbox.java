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
public anywheresoftware.b4j.objects.JFX _vvvvvvvvvvvvvvvv2 = null;
public String _vvvvvvvvvvvvvvvvvvv3 = "";
public Object _vvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _vvvvvvvvvvvvvvvvvvv5 = null;
public anywheresoftware.b4j.objects.LabelWrapper _checkedlabel = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _checkboxpane = null;
public int _unchecked_state = 0;
public int _checked_state = 0;
public int _indeterminate_state = 0;
public b4j.example.cssutils _vvvvvvvvvvvvvvvv3 = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _vvvvvvvvvvvvvvvv4 = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _vvvvvvvvvvvvvvvv5 = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _vvvvvvvvvvvvvvvv6 = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _vvvvvvvvvvvvvvvv7 = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _vvvvvvvvvvvvvvvv0 = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _vvvvvvvvvvvvvvvvv1 = null;
public Punchline.Tech.Cuppy.Framework.cfanimationmanager _vvvvvvvvvvvvvvvvv2 = null;
public Punchline.Tech.Cuppy.Framework.cflicensemanager _vvvvvvvvvvvvvvvvv3 = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _vvvvvvvvvvvvvvvvv4 = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _vvvvvvvvvvvvvvvvv5 = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _vvvvvvvvvvvvvvvvv6 = null;
public Punchline.Tech.Cuppy.Framework.cfhtmlutility _vvvvvvvvvvvvvvvvv7 = null;
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
 //BA.debugLineNum = 168;BA.debugLine="Sub CheckboxPane_MouseEntered (EventData As MouseE";
 //BA.debugLineNum = 170;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEn";
__c.CallSubDelayed2(ba,_vvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvv3+"_MouseEntered",(Object)(_eventdata));
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return "";
}
public String  _checkboxpane_mouseexited(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Sub CheckboxPane_MouseExited (EventData As MouseEv";
 //BA.debugLineNum = 176;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEx";
__c.CallSubDelayed2(ba,_vvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvv3+"_MouseExited",(Object)(_eventdata));
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return "";
}
public String  _checkboxpane_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Private Sub CheckboxPane_MousePressed (EventData A";
 //BA.debugLineNum = 155;BA.debugLine="If Not(checked) Or IsIndeterminate Then";
if (__c.Not(_vvvvvvvvvvvvvvvvv0()) || _vvvvvvvvvvvvvvvvvv2()) { 
 //BA.debugLineNum = 157;BA.debugLine="setCheckState(CHECKED_STATE)";
_setvvvvvvvvvvvvvvvvvv0(_checked_state);
 }else {
 //BA.debugLineNum = 161;BA.debugLine="setCheckState(UNCHECKED_STATE)";
_setvvvvvvvvvvvvvvvvvv0(_unchecked_state);
 };
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return "";
}
public boolean  _vvvvvvvvvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Public Sub checked As Boolean";
 //BA.debugLineNum = 136;BA.debugLine="Return CheckedLabel.Visible";
if (true) return _checkedlabel.getVisible();
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return false;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private fx As JFX";
_vvvvvvvvvvvvvvvv2 = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 16;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvvvvvv3 = "";
 //BA.debugLineNum = 17;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvvvvvv4 = new Object();
 //BA.debugLineNum = 18;BA.debugLine="Private mBase As Pane";
_vvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
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
_vvvvvvvvvvvvvvvvvvv5 = _base;
 //BA.debugLineNum = 37;BA.debugLine="mBase.LoadLayout(\"CFMaterialCheckboxUI\")";
_vvvvvvvvvvvvvvvvvvv5.LoadLayout(ba,"CFMaterialCheckboxUI");
 //BA.debugLineNum = 39;BA.debugLine="setBorder(CFStyleManager.DefaultTheme.Get(\"divide";
_vvvvvvvvvvvvvv0(BA.ObjectToString(_vvvvvvvvvvvvvvvv5._vv5.Get((Object)("divider"))),(int) (2));
 //BA.debugLineNum = 40;BA.debugLine="setCheckedColor(CFStyleManager.DefaultTheme.Get(\"";
_setvvvvvvvvvvvvvvvvvv7(BA.ObjectToString(_vvvvvvvvvvvvvvvv5._vv5.Get((Object)("primary"))));
 //BA.debugLineNum = 43;BA.debugLine="setCheckState(UNCHECKED_STATE) 'set initial value";
_setvvvvvvvvvvvvvvvvvv0(_unchecked_state);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _vvvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 58;BA.debugLine="Return mBase";
if (true) return _vvvvvvvvvvvvvvvvvvv5;
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 30;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 31;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvvvvvv3 = _eventname;
 //BA.debugLineNum = 32;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvvvvvv4 = _callback;
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public boolean  _vvvvvvvvvvvvvvvvvv2() throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Public Sub IsIndeterminate As Boolean";
 //BA.debugLineNum = 142;BA.debugLine="Return CheckedLabel.Alpha = \"0.6\"";
if (true) return _checkedlabel.getAlpha()==(double)(Double.parseDouble("0.6"));
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return false;
}
public String  _vvvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Public Sub removeEffects()";
 //BA.debugLineNum = 97;BA.debugLine="CFControlsUtils.removePaneEffect(CheckboxPane)";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvv5(_checkboxpane);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvv7(String _color) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 67;BA.debugLine="CSSUtils.SetStyleProperty( CheckboxPane, \"-fx-bac";
_vvvvvvvvvvvvvvvv3._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_checkboxpane.getObject())),"-fx-background-color",_color);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvv0(String _color,int _width) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 79;BA.debugLine="CFControlsUtils.setPaneBorder(CheckboxPane, color";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvv4(_checkboxpane,_color,_width);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv6(int _radius) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 85;BA.debugLine="CFControlsUtils.setPaneBorderRadius(CheckboxPane,";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvv5(_checkboxpane,_radius);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv7(String _color) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Public Sub setCheckedColor(color As String)";
 //BA.debugLineNum = 106;BA.debugLine="CFControlsUtils.setBG(CheckedLabel, color)";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvv7((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_checkedlabel.getObject())),_color);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv0(int _value) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Public Sub setCheckState(value As Int)";
 //BA.debugLineNum = 112;BA.debugLine="If value = UNCHECKED_STATE Then";
if (_value==_unchecked_state) { 
 //BA.debugLineNum = 114;BA.debugLine="CheckedLabel.Visible = False";
_checkedlabel.setVisible(__c.False);
 //BA.debugLineNum = 115;BA.debugLine="CheckedLabel.SetAlphaAnimated(300, 0 )";
_checkedlabel.SetAlphaAnimated((int) (300),0);
 }else if(_value==_checked_state) { 
 //BA.debugLineNum = 119;BA.debugLine="CheckedLabel.Visible = True";
_checkedlabel.setVisible(__c.True);
 //BA.debugLineNum = 120;BA.debugLine="CheckedLabel.SetAlphaAnimated(300, 1 )";
_checkedlabel.SetAlphaAnimated((int) (300),1);
 }else {
 //BA.debugLineNum = 124;BA.debugLine="CheckedLabel.SetAlphaAnimated(300, 0.6 )";
_checkedlabel.SetAlphaAnimated((int) (300),0.6);
 //BA.debugLineNum = 125;BA.debugLine="CheckedLabel.Visible = True";
_checkedlabel.setVisible(__c.True);
 };
 //BA.debugLineNum = 130;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checke";
__c.CallSubDelayed2(ba,_vvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvv3+"_CheckedChanged",(Object)(_value));
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvv0(int _iconcode) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Public Sub setIcon(iconCode As Int)";
 //BA.debugLineNum = 149;BA.debugLine="CheckedLabel.Text = Chr(iconCode)";
_checkedlabel.setText(BA.ObjectToString(__c.Chr(_iconcode)));
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv1(String _effect) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Public Sub setPaneEffect(effect As String)";
 //BA.debugLineNum = 91;BA.debugLine="CFControlsUtils.setPaneEffect(CheckboxPane, effec";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvv6(_checkboxpane,_effect);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv2(float _angle) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Public Sub setRotationX(angle As Float)";
 //BA.debugLineNum = 73;BA.debugLine="CFControlsUtils.setPaneRotationX(CheckboxPane, an";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvv7(_checkboxpane,_angle);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
