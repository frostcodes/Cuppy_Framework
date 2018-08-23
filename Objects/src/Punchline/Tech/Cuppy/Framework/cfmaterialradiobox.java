package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmaterialradiobox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmaterialradiobox", this);
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
public b4j.example.cssutils _cssutils = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 50;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public String  _checkboxpane_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Private Sub CheckboxPane_MousePressed (EventData A";
 //BA.debugLineNum = 150;BA.debugLine="CheckboxPane.RequestFocus 'set focus";
_checkboxpane.RequestFocus();
 //BA.debugLineNum = 152;BA.debugLine="If Not(Checked) Or IsIndeterminate Then";
if (__c.Not(_checked()) || _isindeterminate()) { 
 //BA.debugLineNum = 154;BA.debugLine="SetCheckState(CHECKED_STATE)";
_setcheckstate(_checked_state);
 }else {
 //BA.debugLineNum = 158;BA.debugLine="SetCheckState(UNCHECKED_STATE)";
_setcheckstate(_unchecked_state);
 };
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return "";
}
public boolean  _checked() throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Public Sub Checked As Boolean";
 //BA.debugLineNum = 138;BA.debugLine="Return CheckedPane.Visible";
if (true) return _checkedpane.getVisible();
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return false;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 14;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 15;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 16;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 17;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Public CheckboxPane As Pane";
_checkboxpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Public CheckedPane As Pane";
_checkedpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Public UNCHECKED_STATE As Int = 0";
_unchecked_state = (int) (0);
 //BA.debugLineNum = 24;BA.debugLine="Public CHECKED_STATE As Int = 1";
_checked_state = (int) (1);
 //BA.debugLineNum = 25;BA.debugLine="Public INDETERMINATE_STATE As Int = 2";
_indeterminate_state = (int) (2);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 35;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 36;BA.debugLine="mBase.LoadLayout(\"CFMaterialRadioBoxUI\")";
_mbase.LoadLayout(ba,"CFMaterialRadioBoxUI");
 //BA.debugLineNum = 39;BA.debugLine="SetBorder(CFStyleManager.DefaultTheme.Get(\"divide";
_setborder(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("divider"))),(int) (2));
 //BA.debugLineNum = 41;BA.debugLine="SetCheckedColor(CFStyleManager.DefaultTheme.Get(\"";
_setcheckedcolor(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("primary"))));
 //BA.debugLineNum = 44;BA.debugLine="SetCheckState(UNCHECKED_STATE) 'set initial value";
_setcheckstate(_unchecked_state);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 55;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 29;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 30;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 31;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public boolean  _isindeterminate() throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Public Sub IsIndeterminate As Boolean";
 //BA.debugLineNum = 144;BA.debugLine="Return CheckedPane.Alpha = \"0.6\"";
if (true) return _checkedpane.getAlpha()==(double)(Double.parseDouble("0.6"));
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return false;
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 94;BA.debugLine="CFControlsUtils.RemoveEffect(CheckboxPane)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_checkboxpane.getObject())));
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public String  _setbg(String _color) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 64;BA.debugLine="CFControlsUtils.SetBG( CheckboxPane, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_checkboxpane.getObject())),_color);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Public Sub SetBorder(color As String , width As In";
 //BA.debugLineNum = 76;BA.debugLine="CFControlsUtils.SetBorder(CheckboxPane, color, wi";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_checkboxpane.getObject())),_color,_width);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Public Sub SetBorderRadius(radius As Int)";
 //BA.debugLineNum = 82;BA.debugLine="CFControlsUtils.SetBorderRadius(CheckboxPane, rad";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_checkboxpane.getObject())),_radius);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public String  _setcheckedcolor(String _color) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Public Sub SetCheckedColor(color As String)";
 //BA.debugLineNum = 102;BA.debugLine="CFControlsUtils.SetBG( CheckedPane, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_checkedpane.getObject())),_color);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public String  _setcheckstate(int _value) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Public Sub SetCheckState(value As Int)";
 //BA.debugLineNum = 108;BA.debugLine="If value = UNCHECKED_STATE Then";
if (_value==_unchecked_state) { 
 //BA.debugLineNum = 110;BA.debugLine="CheckedPane.Visible = False";
_checkedpane.setVisible(__c.False);
 //BA.debugLineNum = 111;BA.debugLine="CheckedPane.SetAlphaAnimated(300, 0 )";
_checkedpane.SetAlphaAnimated((int) (300),0);
 }else if(_value==_checked_state) { 
 //BA.debugLineNum = 117;BA.debugLine="CheckedPane.Visible = True";
_checkedpane.setVisible(__c.True);
 //BA.debugLineNum = 118;BA.debugLine="CheckedPane.SetAlphaAnimated(300, 1 )";
_checkedpane.SetAlphaAnimated((int) (300),1);
 }else {
 //BA.debugLineNum = 124;BA.debugLine="CheckedPane.SetAlphaAnimated(300, 0.6 )";
_checkedpane.SetAlphaAnimated((int) (300),0.6);
 //BA.debugLineNum = 125;BA.debugLine="CheckedPane.Visible = True";
_checkedpane.setVisible(__c.True);
 };
 //BA.debugLineNum = 132;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checked";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_CheckedChanged",(Object)(_value));
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return "";
}
public String  _setpaneeffect(String _effect) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Public Sub SetPaneEffect(effect As String)";
 //BA.debugLineNum = 88;BA.debugLine="CFControlsUtils.SetEffect(CheckboxPane, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_checkboxpane.getObject())),_effect);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _setrotation(float _angle) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Public Sub setRotation(angle As Float)";
 //BA.debugLineNum = 70;BA.debugLine="CFControlsUtils.SetRotation(CheckboxPane, angle)";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_checkboxpane.getObject())),_angle);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
