package punchline.tech.cuppy.framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmaterialswitch extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("punchline.tech.cuppy.framework", "punchline.tech.cuppy.framework.cfmaterialswitch", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", punchline.tech.cuppy.framework.cfmaterialswitch.class).invoke(this, new Object[] {null});
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
public boolean _firsttime = false;
public b4j.example.cssutils _cssutils = null;
public punchline.tech.cuppy.framework.cfstylemanager _cfstylemanager = null;
public punchline.tech.cuppy.framework.cfstringutility _cfstringutility = null;
public punchline.tech.cuppy.framework.cfdatageneratorutility _cfdatageneratorutility = null;
public punchline.tech.cuppy.framework.cfconfigs _cfconfigs = null;
public punchline.tech.cuppy.framework.cffileutility _cffileutility = null;
public punchline.tech.cuppy.framework.cfcontrolsutils _cfcontrolsutils = null;
public punchline.tech.cuppy.framework.cfmathutility _cfmathutility = null;
public punchline.tech.cuppy.framework.cfdatatypeutility _cfdatatypeutility = null;
public punchline.tech.cuppy.framework.cfapputility _cfapputility = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 75;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public boolean  _checked() throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Public Sub Checked As Boolean";
 //BA.debugLineNum = 179;BA.debugLine="Return SwitchBtn.Left = 23";
if (true) return _switchbtn.getLeft()==23;
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 20;BA.debugLine="Public SwitchBtn As Pane";
_switchbtn = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Public SwitchPane As Pane";
_switchpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Public UNCHECKED_STATE As Int = 0";
_unchecked_state = (int) (0);
 //BA.debugLineNum = 25;BA.debugLine="Public CHECKED_STATE As Int = 1";
_checked_state = (int) (1);
 //BA.debugLineNum = 26;BA.debugLine="Public INDETERMINATE_STATE As Int = 2";
_indeterminate_state = (int) (2);
 //BA.debugLineNum = 29;BA.debugLine="Private FirstTime As Boolean = False";
_firsttime = __c.False;
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
String _checkedstate = "";
 //BA.debugLineNum = 38;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 39;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 40;BA.debugLine="mBase.LoadLayout(\"CFMaterialSwitchesUI\")";
_mbase.LoadLayout(ba,"CFMaterialSwitchesUI");
 //BA.debugLineNum = 42;BA.debugLine="setCheckedColor(CFStyleManager.DefaultTheme.Get(\"";
_setcheckedcolor(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("primary"))));
 //BA.debugLineNum = 46;BA.debugLine="Dim checkedState As String = Props.Get(\"CheckedSt";
_checkedstate = BA.ObjectToString(_props.Get((Object)("CheckedState")));
 //BA.debugLineNum = 50;BA.debugLine="If checkedState = \"UNCHECKED\" Then";
if ((_checkedstate).equals("UNCHECKED")) { 
 //BA.debugLineNum = 52;BA.debugLine="setCheckState(UNCHECKED_STATE)";
_setcheckstate(_unchecked_state);
 }else if((_checkedstate).equals("CHECKED")) { 
 //BA.debugLineNum = 56;BA.debugLine="setCheckState(CHECKED_STATE)";
_setcheckstate(_checked_state);
 }else if((_checkedstate).equals("INDETERMINATE")) { 
 //BA.debugLineNum = 60;BA.debugLine="setCheckState(INDETERMINATE_STATE)";
_setcheckstate(_indeterminate_state);
 };
 //BA.debugLineNum = 68;BA.debugLine="setTag(Lbl.Tag)";
_settag(_lbl.getTag());
 //BA.debugLineNum = 69;BA.debugLine="setAlpha(Lbl.Alpha)";
_setalpha(_lbl.getAlpha());
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public double  _getalpha() throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Public Sub getAlpha As Double";
 //BA.debugLineNum = 220;BA.debugLine="Return mBase.Alpha";
if (true) return _mbase.getAlpha();
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 80;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public String  _geteffect(String _effect) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Public Sub getEffect(effect As String) As String";
 //BA.debugLineNum = 119;BA.debugLine="Return CFControlsUtils.GetEffect(SwitchPane)";
if (true) return _cfcontrolsutils._geteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchpane.getObject())));
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public boolean  _getenabled() throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Public Sub getEnabled As Boolean";
 //BA.debugLineNum = 194;BA.debugLine="Return mBase.Enabled";
if (true) return _mbase.getEnabled();
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return false;
}
public double  _getheight() throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Public Sub getHeight As Double";
 //BA.debugLineNum = 233;BA.debugLine="Return mBase.PrefHeight";
if (true) return _mbase.getPrefHeight();
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return 0;
}
public double  _getleft() throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Public Sub getLeft As Double";
 //BA.debugLineNum = 275;BA.debugLine="Return mBase.Left";
if (true) return _mbase.getLeft();
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper  _getparent() throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Public Sub getParent As Node";
 //BA.debugLineNum = 254;BA.debugLine="Return mBase.Parent";
if (true) return _mbase.getParent();
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public Object  _gettag() throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Public Sub getTag As Object";
 //BA.debugLineNum = 262;BA.debugLine="Return mBase.Tag";
if (true) return _mbase.getTag();
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public double  _gettop() throws Exception{
 //BA.debugLineNum = 245;BA.debugLine="Public Sub getTop As Double";
 //BA.debugLineNum = 247;BA.debugLine="Return mBase.Top";
if (true) return _mbase.getTop();
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return 0;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Public Sub getVisible As Boolean";
 //BA.debugLineNum = 207;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return false;
}
public double  _getwidth() throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Public Sub getWidth As Double";
 //BA.debugLineNum = 240;BA.debugLine="Return mBase.PrefWidth";
if (true) return _mbase.getPrefWidth();
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 33;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 34;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 35;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public boolean  _isindeterminate() throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Public Sub IsIndeterminate As Boolean";
 //BA.debugLineNum = 185;BA.debugLine="Return SwitchBtn.Alpha = \"0.6\"";
if (true) return _switchbtn.getAlpha()==(double)(Double.parseDouble("0.6"));
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return false;
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 126;BA.debugLine="CFControlsUtils.RemoveEffect(SwitchPane)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchpane.getObject())));
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public String  _removenodefromparent() throws Exception{
 //BA.debugLineNum = 282;BA.debugLine="Public Sub RemoveNodeFromParent";
 //BA.debugLineNum = 284;BA.debugLine="mBase.RemoveNodeFromParent";
_mbase.RemoveNodeFromParent();
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return "";
}
public String  _setalpha(double _alpha) throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Public Sub setAlpha(Alpha As Double)";
 //BA.debugLineNum = 226;BA.debugLine="mBase.Alpha = Alpha";
_mbase.setAlpha(_alpha);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return "";
}
public String  _setbg(String _color) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Public Sub setBg(color As String)";
 //BA.debugLineNum = 89;BA.debugLine="CFControlsUtils.SetBG( SwitchPane, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchpane.getObject())),_color);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 101;BA.debugLine="CFControlsUtils.SetBorder(SwitchPane, color, widt";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchpane.getObject())),_color,_width);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 107;BA.debugLine="CFControlsUtils.SetBorderRadius(SwitchPane, radiu";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchpane.getObject())),_radius);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}
public String  _setcheckedcolor(String _color) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Public Sub setCheckedColor(color As String)";
 //BA.debugLineNum = 134;BA.debugLine="CFControlsUtils.SetBG( SwitchBtn, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchbtn.getObject())),_color);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return "";
}
public String  _setcheckstate(int _value) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Public Sub setCheckState(value As Int)";
 //BA.debugLineNum = 140;BA.debugLine="If value = UNCHECKED_STATE Then";
if (_value==_unchecked_state) { 
 //BA.debugLineNum = 142;BA.debugLine="SwitchBtn.SetLayoutAnimated(200 , 10, SwitchBtn.";
_switchbtn.SetLayoutAnimated((int) (200),10,_switchbtn.getTop(),_switchbtn.getPrefWidth(),_switchbtn.getPrefHeight());
 //BA.debugLineNum = 143;BA.debugLine="SwitchPane.SetAlphaAnimated(200, 1 )";
_switchpane.SetAlphaAnimated((int) (200),1);
 //BA.debugLineNum = 144;BA.debugLine="setBg(CFStyleManager.DefaultTheme.Get(\"divider\")";
_setbg(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("divider"))));
 }else if(_value==_checked_state) { 
 //BA.debugLineNum = 149;BA.debugLine="SwitchPane.SetAlphaAnimated(200, 0.6 )";
_switchpane.SetAlphaAnimated((int) (200),0.6);
 //BA.debugLineNum = 150;BA.debugLine="setBg(CFControlsUtils.GetBG(SwitchBtn))";
_setbg(_cfcontrolsutils._getbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchbtn.getObject()))));
 //BA.debugLineNum = 152;BA.debugLine="SwitchBtn.SetLayoutAnimated(200 , 23 , SwitchBtn";
_switchbtn.SetLayoutAnimated((int) (200),23,_switchbtn.getTop(),_switchbtn.getPrefWidth(),_switchbtn.getPrefWidth());
 }else {
 //BA.debugLineNum = 157;BA.debugLine="SwitchBtn.SetLayoutAnimated(200 , 23 , SwitchBtn";
_switchbtn.SetLayoutAnimated((int) (200),23,_switchbtn.getTop(),_switchbtn.getPrefWidth(),_switchbtn.getPrefWidth());
 //BA.debugLineNum = 158;BA.debugLine="SwitchPane.SetAlphaAnimated(200, 1 )";
_switchpane.SetAlphaAnimated((int) (200),1);
 //BA.debugLineNum = 159;BA.debugLine="setBg(CFStyleManager.DefaultTheme.Get(\"divider\")";
_setbg(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("divider"))));
 };
 //BA.debugLineNum = 163;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
 //BA.debugLineNum = 166;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checke";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_CheckedChanged",(Object)(_value));
 }else {
 //BA.debugLineNum = 170;BA.debugLine="FirstTime = True";
_firsttime = __c.True;
 };
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(String _effect) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Public Sub setEffect(effect As String)";
 //BA.debugLineNum = 113;BA.debugLine="CFControlsUtils.SetEffect(SwitchPane, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchpane.getObject())),_effect);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(boolean _enabled) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Public Sub setEnabled(Enabled As Boolean)";
 //BA.debugLineNum = 200;BA.debugLine="mBase.Enabled = Enabled";
_mbase.setEnabled(_enabled);
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return "";
}
public String  _setrotation(float _angle) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Public Sub setRotation(angle As Float)";
 //BA.debugLineNum = 95;BA.debugLine="CFControlsUtils.SetRotation(SwitchPane, angle) 'r";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchpane.getObject())),_angle);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public String  _settag(Object _tag) throws Exception{
 //BA.debugLineNum = 266;BA.debugLine="Public Sub setTag(Tag As Object)";
 //BA.debugLineNum = 268;BA.debugLine="mBase.Tag = Tag";
_mbase.setTag(_tag);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _visible) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Public Sub setVisible(Visible As Boolean)";
 //BA.debugLineNum = 213;BA.debugLine="mBase.Visible = Visible";
_mbase.setVisible(_visible);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _snapshot() throws Exception{
 //BA.debugLineNum = 289;BA.debugLine="Public Sub Snapshot As Image";
 //BA.debugLineNum = 291;BA.debugLine="Return mBase.Snapshot";
if (true) return _mbase.Snapshot();
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _snapshot2(anywheresoftware.b4j.objects.JFX.PaintWrapper _backgroundcolor) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Public Sub Snapshot2(BackgroundColor As Paint) As";
 //BA.debugLineNum = 298;BA.debugLine="Return mBase.Snapshot2(BackgroundColor)";
if (true) return _mbase.Snapshot2((javafx.scene.paint.Paint)(_backgroundcolor.getObject()));
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
return null;
}
public String  _switchbtn_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 323;BA.debugLine="Private Sub SwitchBtn_MousePressed (EventData As M";
 //BA.debugLineNum = 325;BA.debugLine="CallSub2(Me , \"SwitchPane_MousePressed\", EventDat";
__c.CallSubNew2(ba,this,"SwitchPane_MousePressed",(Object)(_eventdata));
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return "";
}
public String  _switchpane_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 307;BA.debugLine="Private Sub SwitchPane_MousePressed (EventData As";
 //BA.debugLineNum = 309;BA.debugLine="SwitchBtn.RequestFocus 'set focus";
_switchbtn.RequestFocus();
 //BA.debugLineNum = 311;BA.debugLine="If Not(Checked) Or IsIndeterminate Then";
if (__c.Not(_checked()) || _isindeterminate()) { 
 //BA.debugLineNum = 313;BA.debugLine="setCheckState(CHECKED_STATE)";
_setcheckstate(_checked_state);
 }else {
 //BA.debugLineNum = 317;BA.debugLine="setCheckState(UNCHECKED_STATE)";
_setcheckstate(_unchecked_state);
 };
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "SWITCHPANE_MOUSEPRESSED"))
	return _switchpane_mousepressed((anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
