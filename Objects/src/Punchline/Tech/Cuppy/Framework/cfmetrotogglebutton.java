package punchline.tech.cuppy.framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmetrotogglebutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("punchline.tech.cuppy.framework", "punchline.tech.cuppy.framework.cfmetrotogglebutton", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", punchline.tech.cuppy.framework.cfmetrotogglebutton.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _mbase = null;
public int _checked_state = 0;
public int _unchecked_state = 0;
public boolean _checkedstatus = false;
public anywheresoftware.b4j.objects.LabelWrapper _togglebutton = null;
public boolean _firsttimesetted = false;
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
 //BA.debugLineNum = 62;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 64;BA.debugLine="ToggleButton.PrefHeight = Height";
_togglebutton.setPrefHeight(_height);
 //BA.debugLineNum = 65;BA.debugLine="ToggleButton.PrefWidth = Width";
_togglebutton.setPrefWidth(_width);
 //BA.debugLineNum = 67;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public boolean  _checked() throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Public Sub Checked As Boolean";
 //BA.debugLineNum = 195;BA.debugLine="Return CheckedStatus";
if (true) return _checkedstatus;
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 21;BA.debugLine="Public CHECKED_STATE As Int = 1";
_checked_state = (int) (1);
 //BA.debugLineNum = 22;BA.debugLine="Public UNCHECKED_STATE As Int = 0";
_unchecked_state = (int) (0);
 //BA.debugLineNum = 24;BA.debugLine="Private CheckedStatus As Boolean = False";
_checkedstatus = __c.False;
 //BA.debugLineNum = 25;BA.debugLine="Public ToggleButton As Label";
_togglebutton = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private FirstTimeSetted As Boolean = False";
_firsttimesetted = __c.False;
 //BA.debugLineNum = 29;BA.debugLine="Private PrivateCheckState As Int";
_privatecheckstate = 0;
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
String _checkedstate = "";
 //BA.debugLineNum = 38;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 39;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 40;BA.debugLine="mBase.LoadLayout(\"CFMetroToggleButtonUI\")";
_mbase.LoadLayout(ba,"CFMetroToggleButtonUI");
 //BA.debugLineNum = 43;BA.debugLine="Dim checkedState As String = Props.Get(\"CheckedSt";
_checkedstate = BA.ObjectToString(_props.Get((Object)("CheckedState")));
 //BA.debugLineNum = 47;BA.debugLine="If checkedState = \"UNCHECKED\" Then";
if ((_checkedstate).equals("UNCHECKED")) { 
 //BA.debugLineNum = 49;BA.debugLine="setCheckState(UNCHECKED_STATE)";
_setcheckstate(_unchecked_state);
 }else if((_checkedstate).equals("CHECKED")) { 
 //BA.debugLineNum = 53;BA.debugLine="setCheckState(CHECKED_STATE)";
_setcheckstate(_checked_state);
 };
 //BA.debugLineNum = 57;BA.debugLine="setTag(Lbl.Tag)";
_settag(_lbl.getTag());
 //BA.debugLineNum = 58;BA.debugLine="setAlpha(Lbl.Alpha)";
_setalpha(_lbl.getAlpha());
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public double  _getalpha() throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Public Sub getAlpha As Double";
 //BA.debugLineNum = 230;BA.debugLine="Return mBase.Alpha";
if (true) return _mbase.getAlpha();
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return 0;
}
public String  _getbackgroundcolor() throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Public Sub getBackgroundColor As String";
 //BA.debugLineNum = 87;BA.debugLine="Return CFControlsUtils.GetBackgroundColor(ToggleB";
if (true) return _cfcontrolsutils._getbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_togglebutton.getObject())));
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 72;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public String  _getbordercolor() throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Public Sub getBorderColor As String";
 //BA.debugLineNum = 111;BA.debugLine="Return CFControlsUtils.GetBorderColor(ToggleButto";
if (true) return _cfcontrolsutils._getbordercolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_togglebutton.getObject())));
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public int  _getborderradius() throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Public Sub getBorderRadius As Int";
 //BA.debugLineNum = 123;BA.debugLine="Return CFControlsUtils.GetBorderRadius(ToggleButt";
if (true) return _cfcontrolsutils._getborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_togglebutton.getObject())));
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return 0;
}
public int  _getborderwidth() throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Public Sub getBorderWidth As Int";
 //BA.debugLineNum = 117;BA.debugLine="Return CFControlsUtils.GetBorderWidth(ToggleButto";
if (true) return _cfcontrolsutils._getborderwidth((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_togglebutton.getObject())));
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return 0;
}
public int  _getcheckstate() throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Public Sub getCheckState As Int";
 //BA.debugLineNum = 188;BA.debugLine="Return PrivateCheckState";
if (true) return _privatecheckstate;
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return 0;
}
public String  _geteffect(String _effect) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Public Sub getEffect(effect As String) As String";
 //BA.debugLineNum = 135;BA.debugLine="Return CFControlsUtils.GetEffect(ToggleButton)";
if (true) return _cfcontrolsutils._geteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_togglebutton.getObject())));
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public boolean  _getenabled() throws Exception{
 //BA.debugLineNum = 202;BA.debugLine="Public Sub getEnabled As Boolean";
 //BA.debugLineNum = 204;BA.debugLine="Return mBase.Enabled";
if (true) return _mbase.getEnabled();
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return false;
}
public double  _getheight() throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Public Sub getHeight As Double";
 //BA.debugLineNum = 243;BA.debugLine="Return mBase.PrefHeight";
if (true) return _mbase.getPrefHeight();
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return 0;
}
public double  _getleft() throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="Public Sub getLeft As Double";
 //BA.debugLineNum = 285;BA.debugLine="Return mBase.Left";
if (true) return _mbase.getLeft();
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper  _getparent() throws Exception{
 //BA.debugLineNum = 262;BA.debugLine="Public Sub getParent As Node";
 //BA.debugLineNum = 264;BA.debugLine="Return mBase.Parent";
if (true) return _mbase.getParent();
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return null;
}
public Object  _gettag() throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Public Sub getTag As Object";
 //BA.debugLineNum = 272;BA.debugLine="Return mBase.Tag";
if (true) return _mbase.getTag();
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return null;
}
public double  _gettop() throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Public Sub getTop As Double";
 //BA.debugLineNum = 257;BA.debugLine="Return mBase.Top";
if (true) return _mbase.getTop();
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return 0;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Public Sub getVisible As Boolean";
 //BA.debugLineNum = 217;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return false;
}
public double  _getwidth() throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Public Sub getWidth As Double";
 //BA.debugLineNum = 250;BA.debugLine="Return mBase.PrefWidth";
if (true) return _mbase.getPrefWidth();
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
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
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 141;BA.debugLine="CFControlsUtils.removeEffect(ToggleButton)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_togglebutton.getObject())));
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public String  _removenodefromparent() throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Public Sub RemoveNodeFromParent";
 //BA.debugLineNum = 294;BA.debugLine="mBase.RemoveNodeFromParent";
_mbase.RemoveNodeFromParent();
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return "";
}
public String  _setalpha(double _alpha) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Public Sub setAlpha(Alpha As Double)";
 //BA.debugLineNum = 236;BA.debugLine="mBase.Alpha = Alpha";
_mbase.setAlpha(_alpha);
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return "";
}
public String  _setbackgroundcolor(String _color) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Public Sub setBackgroundColor(color As String)";
 //BA.debugLineNum = 81;BA.debugLine="CFControlsUtils.setBackgroundColor(ToggleButton,";
_cfcontrolsutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_togglebutton.getObject())),_color);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 99;BA.debugLine="CFControlsUtils.setBorder(ToggleButton, color, wi";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_togglebutton.getObject())),_color,_width);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 105;BA.debugLine="CFControlsUtils.setBorderRadius(ToggleButton, rad";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_togglebutton.getObject())),_radius);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public String  _setcheckstate(int _state) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Public Sub setCheckState(state As Int)";
 //BA.debugLineNum = 150;BA.debugLine="If state = UNCHECKED_STATE Then";
if (_state==_unchecked_state) { 
 //BA.debugLineNum = 152;BA.debugLine="setBackgroundColor(\"white\")";
_setbackgroundcolor("white");
 //BA.debugLineNum = 153;BA.debugLine="setBorder(\"#D6D6D6\", 2)";
_setborder("#D6D6D6",(int) (2));
 //BA.debugLineNum = 155;BA.debugLine="ToggleButton.TextColor = fx.Colors.RGB(91, 91, 9";
_togglebutton.setTextColor((javafx.scene.paint.Paint)(_fx.Colors.RGB((int) (91),(int) (91),(int) (91))));
 //BA.debugLineNum = 157;BA.debugLine="CheckedStatus = False";
_checkedstatus = __c.False;
 }else if(_state==_checked_state) { 
 //BA.debugLineNum = 162;BA.debugLine="setBorder(\"#2EA9DE\", 2)";
_setborder("#2EA9DE",(int) (2));
 //BA.debugLineNum = 163;BA.debugLine="setBackgroundColor(\"rgb(65, 177, 225 )\")";
_setbackgroundcolor("rgb(65, 177, 225 )");
 //BA.debugLineNum = 165;BA.debugLine="ToggleButton.TextColor = fx.Colors.White";
_togglebutton.setTextColor(_fx.Colors.White);
 //BA.debugLineNum = 167;BA.debugLine="CheckedStatus = True";
_checkedstatus = __c.True;
 };
 //BA.debugLineNum = 171;BA.debugLine="If FirstTimeSetted Then";
if (_firsttimesetted) { 
 //BA.debugLineNum = 174;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checke";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_CheckedChanged",(Object)(_state));
 }else {
 //BA.debugLineNum = 178;BA.debugLine="FirstTimeSetted = True";
_firsttimesetted = __c.True;
 };
 //BA.debugLineNum = 182;BA.debugLine="PrivateCheckState = state";
_privatecheckstate = _state;
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(String _effect) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Public Sub setEffect(effect As String)";
 //BA.debugLineNum = 129;BA.debugLine="CFControlsUtils.setEffect(ToggleButton, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_togglebutton.getObject())),_effect);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(boolean _enabled) throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Public Sub setEnabled(Enabled As Boolean)";
 //BA.debugLineNum = 210;BA.debugLine="mBase.Enabled = Enabled";
_mbase.setEnabled(_enabled);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return "";
}
public String  _setrotation(float _angle) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Public Sub setRotation(angle As Float)";
 //BA.debugLineNum = 93;BA.debugLine="CFControlsUtils.setRotation(ToggleButton, angle)";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_togglebutton.getObject())),_angle);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public String  _settag(Object _tag) throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Public Sub setTag(Tag As Object)";
 //BA.debugLineNum = 278;BA.debugLine="mBase.Tag = Tag";
_mbase.setTag(_tag);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _visible) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Public Sub setVisible(Visible As Boolean)";
 //BA.debugLineNum = 223;BA.debugLine="mBase.Visible = Visible";
_mbase.setVisible(_visible);
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _snapshot() throws Exception{
 //BA.debugLineNum = 299;BA.debugLine="Public Sub Snapshot As Image";
 //BA.debugLineNum = 301;BA.debugLine="Return mBase.Snapshot";
if (true) return _mbase.Snapshot();
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _snapshot2(anywheresoftware.b4j.objects.JFX.PaintWrapper _backgroundcolor) throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Public Sub Snapshot2(BackgroundColor As Paint) As";
 //BA.debugLineNum = 308;BA.debugLine="Return mBase.Snapshot2(BackgroundColor)";
if (true) return _mbase.Snapshot2((javafx.scene.paint.Paint)(_backgroundcolor.getObject()));
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return null;
}
public String  _togglebutton_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 317;BA.debugLine="Private Sub ToggleButton_MousePressed (EventData A";
 //BA.debugLineNum = 319;BA.debugLine="ToggleButton.RequestFocus 'set focus";
_togglebutton.RequestFocus();
 //BA.debugLineNum = 321;BA.debugLine="If Not(Checked) Then";
if (__c.Not(_checked())) { 
 //BA.debugLineNum = 323;BA.debugLine="setCheckState(CHECKED_STATE)";
_setcheckstate(_checked_state);
 }else {
 //BA.debugLineNum = 327;BA.debugLine="setCheckState(UNCHECKED_STATE)";
_setcheckstate(_unchecked_state);
 };
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
