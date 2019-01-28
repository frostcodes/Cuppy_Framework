package punchline.tech.cuppy.framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmaterialradiobox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("punchline.tech.cuppy.framework", "punchline.tech.cuppy.framework.cfmaterialradiobox", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", punchline.tech.cuppy.framework.cfmaterialradiobox.class).invoke(this, new Object[] {null});
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
public boolean _firsttimesetted = false;
public punchline.tech.cuppy.framework.cfradioboxchoicebinder _choicecontrolbinderobj = null;
public int _privatecheckstate = 0;
public b4j.example.cssutils _cssutils = null;
public punchline.tech.cuppy.framework.cfconfigs _cfconfigs = null;
public punchline.tech.cuppy.framework.cfcontrolsutils _cfcontrolsutils = null;
public punchline.tech.cuppy.framework.cfstringutility _cfstringutility = null;
public punchline.tech.cuppy.framework.cfdatageneratorutility _cfdatageneratorutility = null;
public punchline.tech.cuppy.framework.cfapputility _cfapputility = null;
public punchline.tech.cuppy.framework.cfmathutility _cfmathutility = null;
public punchline.tech.cuppy.framework.cfstylemanager _cfstylemanager = null;
public punchline.tech.cuppy.framework.cffileutility _cffileutility = null;
public punchline.tech.cuppy.framework.cfdatatypeutility _cfdatatypeutility = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 77;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public String  _checkboxpane_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Private Sub CheckboxPane_MousePressed (EventData A";
 //BA.debugLineNum = 226;BA.debugLine="CheckboxPane.RequestFocus 'set focus";
_checkboxpane.RequestFocus();
 //BA.debugLineNum = 228;BA.debugLine="If Not(Checked) Or IsIndeterminate Then";
if (__c.Not(_checked()) || _isindeterminate()) { 
 //BA.debugLineNum = 230;BA.debugLine="setCheckState(CHECKED_STATE)";
_setcheckstate(_checked_state);
 }else {
 //BA.debugLineNum = 234;BA.debugLine="setCheckState(UNCHECKED_STATE)";
_setcheckstate(_unchecked_state);
 };
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return "";
}
public boolean  _checked() throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Public Sub Checked As Boolean";
 //BA.debugLineNum = 214;BA.debugLine="Return CheckedPane.Visible";
if (true) return _checkedpane.getVisible();
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 20;BA.debugLine="Public CheckboxPane As Pane";
_checkboxpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Public CheckedPane As Pane";
_checkedpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Public UNCHECKED_STATE As Int = 0";
_unchecked_state = (int) (0);
 //BA.debugLineNum = 25;BA.debugLine="Public CHECKED_STATE As Int = 1";
_checked_state = (int) (1);
 //BA.debugLineNum = 26;BA.debugLine="Public INDETERMINATE_STATE As Int = 2";
_indeterminate_state = (int) (2);
 //BA.debugLineNum = 29;BA.debugLine="Private FirstTimeSetted As Boolean = False";
_firsttimesetted = __c.False;
 //BA.debugLineNum = 30;BA.debugLine="Private ChoiceControlBinderObj As CFRadioBoxChoic";
_choicecontrolbinderobj = new punchline.tech.cuppy.framework.cfradioboxchoicebinder();
 //BA.debugLineNum = 31;BA.debugLine="Private PrivateCheckState As Int";
_privatecheckstate = 0;
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
String _checkedstate = "";
 //BA.debugLineNum = 40;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 41;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 42;BA.debugLine="mBase.LoadLayout(\"CFMaterialRadioBoxUI\")";
_mbase.LoadLayout(ba,"CFMaterialRadioBoxUI");
 //BA.debugLineNum = 45;BA.debugLine="setBorder(CFStyleManager.DefaultTheme.Get(\"divide";
_setborder(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("divider"))),(int) (2));
 //BA.debugLineNum = 47;BA.debugLine="setCheckedColor(CFStyleManager.DefaultTheme.Get(\"";
_setcheckedcolor(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("primary"))));
 //BA.debugLineNum = 51;BA.debugLine="Dim checkedState As String = Props.Get(\"CheckedSt";
_checkedstate = BA.ObjectToString(_props.Get((Object)("CheckedState")));
 //BA.debugLineNum = 55;BA.debugLine="If checkedState = \"UNCHECKED\" Then";
if ((_checkedstate).equals("UNCHECKED")) { 
 //BA.debugLineNum = 57;BA.debugLine="setCheckState(UNCHECKED_STATE)";
_setcheckstate(_unchecked_state);
 }else if((_checkedstate).equals("CHECKED")) { 
 //BA.debugLineNum = 61;BA.debugLine="setCheckState(CHECKED_STATE)";
_setcheckstate(_checked_state);
 }else if((_checkedstate).equals("INDETERMINATE")) { 
 //BA.debugLineNum = 65;BA.debugLine="setCheckState(INDETERMINATE_STATE)";
_setcheckstate(_indeterminate_state);
 };
 //BA.debugLineNum = 70;BA.debugLine="setTag(Lbl.Tag)";
_settag(_lbl.getTag());
 //BA.debugLineNum = 71;BA.debugLine="setAlpha(Lbl.Alpha)";
_setalpha(_lbl.getAlpha());
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public double  _getalpha() throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Public Sub getAlpha As Double";
 //BA.debugLineNum = 272;BA.debugLine="Return mBase.Alpha";
if (true) return _mbase.getAlpha();
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return 0;
}
public String  _getbackgroundcolor() throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Public Sub getBackgroundColor As String";
 //BA.debugLineNum = 97;BA.debugLine="Return CFControlsUtils.GetBackgroundColor(Checkbo";
if (true) return _cfcontrolsutils._getbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_checkboxpane.getObject())));
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 82;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public String  _getbordercolor() throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Public Sub getBorderColor As String";
 //BA.debugLineNum = 121;BA.debugLine="Return CFControlsUtils.GetBorderColor(CheckboxPan";
if (true) return _cfcontrolsutils._getbordercolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_checkboxpane.getObject())));
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return "";
}
public int  _getborderradius() throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Public Sub getBorderRadius As Int";
 //BA.debugLineNum = 133;BA.debugLine="Return CFControlsUtils.GetBorderRadius(CheckboxPa";
if (true) return _cfcontrolsutils._getborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_checkboxpane.getObject())));
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return 0;
}
public int  _getborderwidth() throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Public Sub getBorderWidth As Int";
 //BA.debugLineNum = 127;BA.debugLine="Return CFControlsUtils.GetBorderWidth(CheckboxPan";
if (true) return _cfcontrolsutils._getborderwidth((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_checkboxpane.getObject())));
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return 0;
}
public Object  _getcallback() throws Exception{
 //BA.debugLineNum = 412;BA.debugLine="Public Sub getCallBack As Object";
 //BA.debugLineNum = 414;BA.debugLine="Return mCallBack";
if (true) return _mcallback;
 //BA.debugLineNum = 416;BA.debugLine="End Sub";
return null;
}
public int  _getcheckstate() throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Public Sub getCheckState As Int";
 //BA.debugLineNum = 208;BA.debugLine="Return PrivateCheckState";
if (true) return _privatecheckstate;
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return 0;
}
public punchline.tech.cuppy.framework.cfradioboxchoicebinder  _getchoicebinder() throws Exception{
 //BA.debugLineNum = 379;BA.debugLine="Public Sub getChoiceBinder As CFRadioBoxChoiceBind";
 //BA.debugLineNum = 381;BA.debugLine="Return ChoiceControlBinderObj";
if (true) return _choicecontrolbinderobj;
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return null;
}
public String  _geteffect(String _effect) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Public Sub getEffect(effect As String) As String";
 //BA.debugLineNum = 145;BA.debugLine="Return CFControlsUtils.GetEffect(CheckboxPane)";
if (true) return _cfcontrolsutils._geteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_checkboxpane.getObject())));
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return "";
}
public boolean  _getenabled() throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="Public Sub getEnabled As Boolean";
 //BA.debugLineNum = 246;BA.debugLine="Return mBase.Enabled";
if (true) return _mbase.getEnabled();
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return false;
}
public String  _geteventname() throws Exception{
 //BA.debugLineNum = 405;BA.debugLine="Public Sub getEventName As String";
 //BA.debugLineNum = 407;BA.debugLine="Return mEventName";
if (true) return _meventname;
 //BA.debugLineNum = 409;BA.debugLine="End Sub";
return "";
}
public boolean  _gethaschoicebinder() throws Exception{
 //BA.debugLineNum = 385;BA.debugLine="Public Sub getHasChoiceBinder As Boolean";
 //BA.debugLineNum = 387;BA.debugLine="Return ChoiceControlBinderObj.IsInitialized";
if (true) return _choicecontrolbinderobj.IsInitialized();
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return false;
}
public double  _getheight() throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="Public Sub getHeight As Double";
 //BA.debugLineNum = 285;BA.debugLine="Return mBase.PrefHeight";
if (true) return _mbase.getPrefHeight();
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return 0;
}
public double  _getleft() throws Exception{
 //BA.debugLineNum = 325;BA.debugLine="Public Sub getLeft As Double";
 //BA.debugLineNum = 327;BA.debugLine="Return mBase.Left";
if (true) return _mbase.getLeft();
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper  _getparent() throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Public Sub getParent As Node";
 //BA.debugLineNum = 306;BA.debugLine="Return mBase.Parent";
if (true) return _mbase.getParent();
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
return null;
}
public Object  _gettag() throws Exception{
 //BA.debugLineNum = 312;BA.debugLine="Public Sub getTag As Object";
 //BA.debugLineNum = 314;BA.debugLine="Return mBase.Tag";
if (true) return _mbase.getTag();
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return null;
}
public double  _gettop() throws Exception{
 //BA.debugLineNum = 297;BA.debugLine="Public Sub getTop As Double";
 //BA.debugLineNum = 299;BA.debugLine="Return mBase.Top";
if (true) return _mbase.getTop();
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return 0;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Public Sub getVisible As Boolean";
 //BA.debugLineNum = 259;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return false;
}
public double  _getwidth() throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Public Sub getWidth As Double";
 //BA.debugLineNum = 292;BA.debugLine="Return mBase.PrefWidth";
if (true) return _mbase.getPrefWidth();
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 35;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 36;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 37;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public boolean  _isindeterminate() throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Public Sub IsIndeterminate As Boolean";
 //BA.debugLineNum = 220;BA.debugLine="Return CheckedPane.Alpha = \"0.6\"";
if (true) return _checkedpane.getAlpha()==(double)(Double.parseDouble("0.6"));
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return false;
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 151;BA.debugLine="CFControlsUtils.RemoveEffect(CheckboxPane)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_checkboxpane.getObject())));
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public String  _removenodefromparent() throws Exception{
 //BA.debugLineNum = 334;BA.debugLine="Public Sub RemoveNodeFromParent";
 //BA.debugLineNum = 336;BA.debugLine="mBase.RemoveNodeFromParent";
_mbase.RemoveNodeFromParent();
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return "";
}
public String  _setalpha(double _alpha) throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Public Sub setAlpha(Alpha As Double)";
 //BA.debugLineNum = 278;BA.debugLine="mBase.Alpha = Alpha";
_mbase.setAlpha(_alpha);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return "";
}
public String  _setbackgroundcolor(String _color) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Public Sub setBackgroundColor(color As String)";
 //BA.debugLineNum = 91;BA.debugLine="CFControlsUtils.SetBackgroundColor( CheckboxPane,";
_cfcontrolsutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_checkboxpane.getObject())),_color);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 109;BA.debugLine="CFControlsUtils.SetBorder(CheckboxPane, color, wi";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_checkboxpane.getObject())),_color,_width);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 115;BA.debugLine="CFControlsUtils.SetBorderRadius(CheckboxPane, rad";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_checkboxpane.getObject())),_radius);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public String  _setcheckedcolor(String _color) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Public Sub setCheckedColor(color As String)";
 //BA.debugLineNum = 159;BA.debugLine="CFControlsUtils.setBackgroundColor(CheckedPane, c";
_cfcontrolsutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_checkedpane.getObject())),_color);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return "";
}
public String  _setcheckstate(int _state) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Public Sub setCheckState(state As Int)";
 //BA.debugLineNum = 166;BA.debugLine="If getHasChoiceBinder And ChoiceControlBinderObj.";
if (_gethaschoicebinder() && _choicecontrolbinderobj._iscontrolbinded((punchline.tech.cuppy.framework.cfmaterialradiobox)(this))) { 
 //BA.debugLineNum = 168;BA.debugLine="ChoiceControlBinderObj.TriggerState(Me, state)";
_choicecontrolbinderobj._triggerstate((punchline.tech.cuppy.framework.cfmaterialradiobox)(this),_state);
 }else {
 //BA.debugLineNum = 172;BA.debugLine="If state = UNCHECKED_STATE Then";
if (_state==_unchecked_state) { 
 //BA.debugLineNum = 174;BA.debugLine="CheckedPane.Visible = False";
_checkedpane.setVisible(__c.False);
 //BA.debugLineNum = 175;BA.debugLine="CheckedPane.SetAlphaAnimated(300, 0 )";
_checkedpane.SetAlphaAnimated((int) (300),0);
 }else if(_state==_checked_state) { 
 //BA.debugLineNum = 179;BA.debugLine="CheckedPane.Visible = True";
_checkedpane.setVisible(__c.True);
 //BA.debugLineNum = 180;BA.debugLine="CheckedPane.SetAlphaAnimated(300, 1 )";
_checkedpane.SetAlphaAnimated((int) (300),1);
 }else {
 //BA.debugLineNum = 184;BA.debugLine="CheckedPane.SetAlphaAnimated(300, 0.6 )";
_checkedpane.SetAlphaAnimated((int) (300),0.6);
 //BA.debugLineNum = 185;BA.debugLine="CheckedPane.Visible = True";
_checkedpane.setVisible(__c.True);
 };
 //BA.debugLineNum = 189;BA.debugLine="If FirstTimeSetted Then";
if (_firsttimesetted) { 
 //BA.debugLineNum = 192;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Check";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_CheckedChanged",(Object)(_state));
 }else {
 //BA.debugLineNum = 196;BA.debugLine="FirstTimeSetted = True";
_firsttimesetted = __c.True;
 };
 };
 //BA.debugLineNum = 202;BA.debugLine="PrivateCheckState = state";
_privatecheckstate = _state;
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return "";
}
public String  _setchoicebinder(punchline.tech.cuppy.framework.cfradioboxchoicebinder _controlchoicebinder) throws Exception{
 //BA.debugLineNum = 372;BA.debugLine="Public Sub setChoiceBinder(ControlChoiceBinder As";
 //BA.debugLineNum = 374;BA.debugLine="ChoiceControlBinderObj = ControlChoiceBinder";
_choicecontrolbinderobj = _controlchoicebinder;
 //BA.debugLineNum = 375;BA.debugLine="ChoiceControlBinderObj.BindControl(Me)";
_choicecontrolbinderobj._bindcontrol((punchline.tech.cuppy.framework.cfmaterialradiobox)(this));
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(String _effect) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Public Sub setEffect(effect As String)";
 //BA.debugLineNum = 139;BA.debugLine="CFControlsUtils.SetEffect(CheckboxPane, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_checkboxpane.getObject())),_effect);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(boolean _enabled) throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Public Sub setEnabled(Enabled As Boolean)";
 //BA.debugLineNum = 252;BA.debugLine="mBase.Enabled = Enabled";
_mbase.setEnabled(_enabled);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return "";
}
public String  _setrotation(float _angle) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Public Sub setRotation(angle As Float)";
 //BA.debugLineNum = 103;BA.debugLine="CFControlsUtils.SetRotation(CheckboxPane, angle)";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_checkboxpane.getObject())),_angle);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public String  _settag(Object _tag) throws Exception{
 //BA.debugLineNum = 318;BA.debugLine="Public Sub setTag(Tag As Object)";
 //BA.debugLineNum = 320;BA.debugLine="mBase.Tag = Tag";
_mbase.setTag(_tag);
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _visible) throws Exception{
 //BA.debugLineNum = 263;BA.debugLine="Public Sub setVisible(Visible As Boolean)";
 //BA.debugLineNum = 265;BA.debugLine="mBase.Visible = Visible";
_mbase.setVisible(_visible);
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _snapshot() throws Exception{
 //BA.debugLineNum = 341;BA.debugLine="Public Sub Snapshot As Image";
 //BA.debugLineNum = 343;BA.debugLine="Return mBase.Snapshot";
if (true) return _mbase.Snapshot();
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _snapshot2(anywheresoftware.b4j.objects.JFX.PaintWrapper _backgroundcolor) throws Exception{
 //BA.debugLineNum = 348;BA.debugLine="Public Sub Snapshot2(BackgroundColor As Paint) As";
 //BA.debugLineNum = 350;BA.debugLine="Return mBase.Snapshot2(BackgroundColor)";
if (true) return _mbase.Snapshot2((javafx.scene.paint.Paint)(_backgroundcolor.getObject()));
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public String  _unbindfromchoicebinder() throws Exception{
 //BA.debugLineNum = 392;BA.debugLine="Public Sub UnBindFromChoiceBinder";
 //BA.debugLineNum = 394;BA.debugLine="If getHasChoiceBinder Then";
if (_gethaschoicebinder()) { 
 //BA.debugLineNum = 396;BA.debugLine="getChoiceBinder.UnBindControl(Me)";
_getchoicebinder()._unbindcontrol((punchline.tech.cuppy.framework.cfmaterialradiobox)(this));
 };
 //BA.debugLineNum = 400;BA.debugLine="FirstTimeSetted = True";
_firsttimesetted = __c.True;
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
