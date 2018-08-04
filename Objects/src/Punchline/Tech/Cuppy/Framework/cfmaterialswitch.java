package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmaterialswitch extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmaterialswitch", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.cfmaterialswitch.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _mbase = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _switchbtn = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _switchpane = null;
public int _checked_state = 0;
public int _unchecked_state = 0;
public int _indeterminate_state = 0;
public b4j.example.cssutils _cssutils = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public Punchline.Tech.Cuppy.Framework.cfanimationmanager _cfanimationmanager = null;
public Punchline.Tech.Cuppy.Framework.cflicensemanager _cflicensemanager = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public Punchline.Tech.Cuppy.Framework.cfhtmlutility _cfhtmlutility = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public boolean  _checked() throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Public Sub checked As Boolean";
 //BA.debugLineNum = 136;BA.debugLine="Return SwitchBtn.Left = 23";
if (true) return _switchbtn.getLeft()==23;
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 14;BA.debugLine="Public SwitchBtn As Pane";
_switchbtn = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Public SwitchPane As Pane";
_switchpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
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
 //BA.debugLineNum = 31;BA.debugLine="mBase.LoadLayout(\"CFMaterialSwitchesUI\")";
_mbase.LoadLayout(ba,"CFMaterialSwitchesUI");
 //BA.debugLineNum = 33;BA.debugLine="setCheckedColor(CFStyleManager.DefaultTheme.Get(\"";
_setcheckedcolor(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("primary"))));
 //BA.debugLineNum = 36;BA.debugLine="setCheckState(UNCHECKED_STATE) 'set initial value";
_setcheckstate(_unchecked_state);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 53;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 140;BA.debugLine="Public Sub IsIndeterminate As Boolean";
 //BA.debugLineNum = 142;BA.debugLine="Return SwitchBtn.Alpha = \"0.6\"";
if (true) return _switchbtn.getAlpha()==(double)(Double.parseDouble("0.6"));
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return false;
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Public Sub removeEffects()";
 //BA.debugLineNum = 92;BA.debugLine="CFControlsUtils.removePaneEffect(SwitchPane)";
_cfcontrolsutils._removepaneeffect(_switchpane);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public String  _setbg(String _color) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 62;BA.debugLine="CSSUtils.SetStyleProperty( SwitchPane, \"-fx-backg";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchpane.getObject())),"-fx-background-color",_color);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 74;BA.debugLine="CFControlsUtils.setPaneBorder(SwitchPane, color,";
_cfcontrolsutils._setpaneborder(_switchpane,_color,_width);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 80;BA.debugLine="CFControlsUtils.setPaneBorderRadius(SwitchPane, r";
_cfcontrolsutils._setpaneborderradius(_switchpane,_radius);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public String  _setcheckedcolor(String _color) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Public Sub setCheckedColor(color As String)";
 //BA.debugLineNum = 100;BA.debugLine="CSSUtils.SetStyleProperty( SwitchBtn, \"-fx-backgr";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchbtn.getObject())),"-fx-background-color",_color);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public String  _setcheckstate(int _value) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Public Sub setCheckState(value As Int)";
 //BA.debugLineNum = 106;BA.debugLine="If value = UNCHECKED_STATE Then";
if (_value==_unchecked_state) { 
 //BA.debugLineNum = 108;BA.debugLine="SwitchBtn.SetLayoutAnimated(200 , 10, SwitchBtn";
_switchbtn.SetLayoutAnimated((int) (200),10,_switchbtn.getTop(),_switchbtn.getPrefWidth(),_switchbtn.getPrefHeight());
 //BA.debugLineNum = 109;BA.debugLine="SwitchPane.SetAlphaAnimated(200, 1 )";
_switchpane.SetAlphaAnimated((int) (200),1);
 //BA.debugLineNum = 110;BA.debugLine="SetBg(CFStyleManager.DefaultTheme.Get(\"divider\")";
_setbg(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("divider"))));
 }else if(_value==_checked_state) { 
 //BA.debugLineNum = 115;BA.debugLine="SwitchPane.SetAlphaAnimated(200, 0.6 )";
_switchpane.SetAlphaAnimated((int) (200),0.6);
 //BA.debugLineNum = 116;BA.debugLine="SetBg(CFControlsUtils.getPaneBG(SwitchBtn))";
_setbg(_cfcontrolsutils._getpanebg(_switchbtn));
 //BA.debugLineNum = 118;BA.debugLine="SwitchBtn.SetLayoutAnimated(200 , 23 , SwitchBtn";
_switchbtn.SetLayoutAnimated((int) (200),23,_switchbtn.getTop(),_switchbtn.getPrefWidth(),_switchbtn.getPrefWidth());
 }else {
 //BA.debugLineNum = 123;BA.debugLine="SwitchBtn.SetLayoutAnimated(200 , 23 , SwitchBtn";
_switchbtn.SetLayoutAnimated((int) (200),23,_switchbtn.getTop(),_switchbtn.getPrefWidth(),_switchbtn.getPrefWidth());
 //BA.debugLineNum = 124;BA.debugLine="SwitchPane.SetAlphaAnimated(200, 1 )";
_switchpane.SetAlphaAnimated((int) (200),1);
 //BA.debugLineNum = 125;BA.debugLine="SetBg(CFStyleManager.DefaultTheme.Get(\"divider\")";
_setbg(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("divider"))));
 };
 //BA.debugLineNum = 130;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checked";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_CheckedChanged",(Object)(_value));
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public String  _setpaneeffect(String _effect) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Public Sub setPaneEffect(effect As String)";
 //BA.debugLineNum = 86;BA.debugLine="CFControlsUtils.setPaneEffect(SwitchPane, effect)";
_cfcontrolsutils._setpaneeffect(_switchpane,_effect);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(float _angle) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Public Sub setRotationX(angle As Float)";
 //BA.debugLineNum = 68;BA.debugLine="CFControlsUtils.setPaneRotationX(SwitchPane, angl";
_cfcontrolsutils._setpanerotationx(_switchpane,_angle);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public String  _switchbtn_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Sub SwitchBtn_MousePressed (EventData As MouseEven";
 //BA.debugLineNum = 163;BA.debugLine="CallSub2(Me , \"SwitchPane_MousePressed\", EventDat";
__c.CallSubNew2(ba,this,"SwitchPane_MousePressed",(Object)(_eventdata));
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return "";
}
public String  _switchpane_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Private Sub SwitchPane_MousePressed (EventData As";
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
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "SWITCHPANE_MOUSEPRESSED"))
	return _switchpane_mousepressed((anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
