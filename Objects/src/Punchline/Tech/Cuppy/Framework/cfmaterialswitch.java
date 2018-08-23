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
 //BA.debugLineNum = 50;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 52;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public boolean  _checked() throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Public Sub Checked As Boolean";
 //BA.debugLineNum = 140;BA.debugLine="Return SwitchBtn.Left = 23";
if (true) return _switchbtn.getLeft()==23;
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return false;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 13;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 14;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 15;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 16;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Public SwitchBtn As Pane";
_switchbtn = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Public SwitchPane As Pane";
_switchpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Public UNCHECKED_STATE As Int = 0";
_unchecked_state = (int) (0);
 //BA.debugLineNum = 23;BA.debugLine="Public CHECKED_STATE As Int = 1";
_checked_state = (int) (1);
 //BA.debugLineNum = 24;BA.debugLine="Public INDETERMINATE_STATE As Int = 2";
_indeterminate_state = (int) (2);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 34;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 35;BA.debugLine="mBase.LoadLayout(\"CFMaterialSwitchesUI\")";
_mbase.LoadLayout(ba,"CFMaterialSwitchesUI");
 //BA.debugLineNum = 37;BA.debugLine="SetCheckedColor(CFStyleManager.DefaultTheme.Get(\"";
_setcheckedcolor(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("primary"))));
 //BA.debugLineNum = 40;BA.debugLine="SetCheckState(UNCHECKED_STATE) 'set initial value";
_setcheckstate(_unchecked_state);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 57;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 28;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 29;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 30;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public boolean  _isindeterminate() throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Public Sub IsIndeterminate As Boolean";
 //BA.debugLineNum = 146;BA.debugLine="Return SwitchBtn.Alpha = \"0.6\"";
if (true) return _switchbtn.getAlpha()==(double)(Double.parseDouble("0.6"));
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return false;
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 96;BA.debugLine="CFControlsUtils.RemoveEffect(SwitchPane)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchpane.getObject())));
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public String  _setbg(String _color) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 66;BA.debugLine="CFControlsUtils.SetBG( SwitchPane, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchpane.getObject())),_color);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Public Sub SetBorder(color As String , width As In";
 //BA.debugLineNum = 78;BA.debugLine="CFControlsUtils.SetBorder(SwitchPane, color, widt";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchpane.getObject())),_color,_width);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Public Sub SetBorderRadius(radius As Int)";
 //BA.debugLineNum = 84;BA.debugLine="CFControlsUtils.SetBorderRadius(SwitchPane, radiu";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchpane.getObject())),_radius);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public String  _setcheckedcolor(String _color) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Public Sub SetCheckedColor(color As String)";
 //BA.debugLineNum = 104;BA.debugLine="CFControlsUtils.SetBG( SwitchBtn, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchbtn.getObject())),_color);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public String  _setcheckstate(int _value) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Public Sub SetCheckState(value As Int)";
 //BA.debugLineNum = 110;BA.debugLine="If value = UNCHECKED_STATE Then";
if (_value==_unchecked_state) { 
 //BA.debugLineNum = 112;BA.debugLine="SwitchBtn.SetLayoutAnimated(200 , 10, SwitchBtn.";
_switchbtn.SetLayoutAnimated((int) (200),10,_switchbtn.getTop(),_switchbtn.getPrefWidth(),_switchbtn.getPrefHeight());
 //BA.debugLineNum = 113;BA.debugLine="SwitchPane.SetAlphaAnimated(200, 1 )";
_switchpane.SetAlphaAnimated((int) (200),1);
 //BA.debugLineNum = 114;BA.debugLine="SetBg(CFStyleManager.DefaultTheme.Get(\"divider\")";
_setbg(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("divider"))));
 }else if(_value==_checked_state) { 
 //BA.debugLineNum = 119;BA.debugLine="SwitchPane.SetAlphaAnimated(200, 0.6 )";
_switchpane.SetAlphaAnimated((int) (200),0.6);
 //BA.debugLineNum = 120;BA.debugLine="SetBg(CFControlsUtils.GetBG(SwitchBtn))";
_setbg(_cfcontrolsutils._getbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchbtn.getObject()))));
 //BA.debugLineNum = 122;BA.debugLine="SwitchBtn.SetLayoutAnimated(200 , 23 , SwitchBtn";
_switchbtn.SetLayoutAnimated((int) (200),23,_switchbtn.getTop(),_switchbtn.getPrefWidth(),_switchbtn.getPrefWidth());
 }else {
 //BA.debugLineNum = 127;BA.debugLine="SwitchBtn.SetLayoutAnimated(200 , 23 , SwitchBtn";
_switchbtn.SetLayoutAnimated((int) (200),23,_switchbtn.getTop(),_switchbtn.getPrefWidth(),_switchbtn.getPrefWidth());
 //BA.debugLineNum = 128;BA.debugLine="SwitchPane.SetAlphaAnimated(200, 1 )";
_switchpane.SetAlphaAnimated((int) (200),1);
 //BA.debugLineNum = 129;BA.debugLine="SetBg(CFStyleManager.DefaultTheme.Get(\"divider\")";
_setbg(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("divider"))));
 };
 //BA.debugLineNum = 134;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checked";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_CheckedChanged",(Object)(_value));
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return "";
}
public String  _setpaneeffect(String _effect) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Public Sub SetPaneEffect(effect As String)";
 //BA.debugLineNum = 90;BA.debugLine="CFControlsUtils.SetEffect(SwitchPane, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchpane.getObject())),_effect);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(float _angle) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Public Sub SetRotationX(angle As Float)";
 //BA.debugLineNum = 72;BA.debugLine="CFControlsUtils.SetRotation(SwitchPane, angle) 'r";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchpane.getObject())),_angle);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public String  _switchbtn_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Private Sub SwitchBtn_MousePressed (EventData As M";
 //BA.debugLineNum = 168;BA.debugLine="CallSub2(Me , \"SwitchPane_MousePressed\", EventDat";
__c.CallSubNew2(ba,this,"SwitchPane_MousePressed",(Object)(_eventdata));
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return "";
}
public String  _switchpane_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Private Sub SwitchPane_MousePressed (EventData As";
 //BA.debugLineNum = 152;BA.debugLine="SwitchBtn.RequestFocus 'set focus";
_switchbtn.RequestFocus();
 //BA.debugLineNum = 154;BA.debugLine="If Not(Checked) Or IsIndeterminate Then";
if (__c.Not(_checked()) || _isindeterminate()) { 
 //BA.debugLineNum = 156;BA.debugLine="SetCheckState(CHECKED_STATE)";
_setcheckstate(_checked_state);
 }else {
 //BA.debugLineNum = 160;BA.debugLine="SetCheckState(UNCHECKED_STATE)";
_setcheckstate(_unchecked_state);
 };
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "SWITCHPANE_MOUSEPRESSED"))
	return _switchpane_mousepressed((anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
