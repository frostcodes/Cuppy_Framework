package punchline.tech.cuppy.framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmateriallinearprogressbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("punchline.tech.cuppy.framework", "punchline.tech.cuppy.framework.cfmateriallinearprogressbar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", punchline.tech.cuppy.framework.cfmateriallinearprogressbar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _mbase = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _progressbar = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _progresspane = null;
public anywheresoftware.b4j.objects.LabelWrapper _progresspercentagetext = null;
public String _state_active = "";
public String _state_success = "";
public String _state_warning = "";
public String _state_error = "";
public b4j.example.cssutils _cssutils = null;
public punchline.tech.cuppy.framework.cfcontrolsutils _cfcontrolsutils = null;
public punchline.tech.cuppy.framework.cfstringutility _cfstringutility = null;
public punchline.tech.cuppy.framework.cfdatageneratorutility _cfdatageneratorutility = null;
public punchline.tech.cuppy.framework.cfapputility _cfapputility = null;
public punchline.tech.cuppy.framework.cfmathutility _cfmathutility = null;
public punchline.tech.cuppy.framework.cfstylemanager _cfstylemanager = null;
public punchline.tech.cuppy.framework.cfconfigs _cfconfigs = null;
public punchline.tech.cuppy.framework.cffileutility _cffileutility = null;
public punchline.tech.cuppy.framework.cfdatatypeutility _cfdatatypeutility = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 72;BA.debugLine="ProgressPane.PrefWidth = Width";
_progresspane.setPrefWidth(_width);
 //BA.debugLineNum = 73;BA.debugLine="ProgressPane.PrefHeight = Height";
_progresspane.setPrefHeight(_height);
 //BA.debugLineNum = 74;BA.debugLine="ProgressBar.PrefHeight = Height";
_progressbar.setPrefHeight(_height);
 //BA.debugLineNum = 76;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 29;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 30;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 31;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 32;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Public ProgressBar As Pane";
_progressbar = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Public ProgressPane As Pane";
_progresspane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Public ProgressPercentageText As Label";
_progresspercentagetext = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Public const STATE_ACTIVE As String = \"#888888\"";
_state_active = "#888888";
 //BA.debugLineNum = 40;BA.debugLine="Public const STATE_SUCCESS As String = \"#21BA45\"";
_state_success = "#21BA45";
 //BA.debugLineNum = 42;BA.debugLine="Public const STATE_WARNING As String = \"#F2C037\"";
_state_warning = "#F2C037";
 //BA.debugLineNum = 43;BA.debugLine="Public const STATE_ERROR As String = \"#DB2828\"";
_state_error = "#DB2828";
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 55;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 56;BA.debugLine="mBase.LoadLayout(\"CFMaterialLinearProgressBarUI\")";
_mbase.LoadLayout(ba,"CFMaterialLinearProgressBarUI");
 //BA.debugLineNum = 58;BA.debugLine="setBackgroundColor(CFStyleManager.DefaultTheme.Ge";
_setbackgroundcolor(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("divider"))));
 //BA.debugLineNum = 59;BA.debugLine="setProgressColor(CFStyleManager.DefaultTheme.Get(";
_setprogresscolor(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("primary"))));
 //BA.debugLineNum = 61;BA.debugLine="setProgress(Props.Get(\"Progress\")) 'set initial p";
_setprogress((int)(BA.ObjectToNumber(_props.Get((Object)("Progress")))));
 //BA.debugLineNum = 63;BA.debugLine="setTag(Lbl.Tag)";
_settag(_lbl.getTag());
 //BA.debugLineNum = 64;BA.debugLine="setAlpha(Lbl.Alpha)";
_setalpha(_lbl.getAlpha());
 //BA.debugLineNum = 66;BA.debugLine="ProgressPercentageText.Font = CFStyleManager.FONT";
_progresspercentagetext.setFont(_cfstylemanager._font_bold);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public double  _getalpha() throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="Public Sub getAlpha As Double";
 //BA.debugLineNum = 246;BA.debugLine="Return mBase.Alpha";
if (true) return _mbase.getAlpha();
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return 0;
}
public String  _getbackgroundcolor() throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Public Sub getBackgroundColor As String";
 //BA.debugLineNum = 148;BA.debugLine="Return CFControlsUtils.GetBackgroundColor(Progres";
if (true) return _cfcontrolsutils._getbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_progresspane.getObject())));
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 81;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public String  _geteffect(String _effect) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Public Sub getEffect(effect As String) As String";
 //BA.debugLineNum = 114;BA.debugLine="Return CFControlsUtils.GetEffect(ProgressPane)";
if (true) return _cfcontrolsutils._geteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_progresspane.getObject())));
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public boolean  _getenabled() throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Public Sub getEnabled As Boolean";
 //BA.debugLineNum = 220;BA.debugLine="Return mBase.Enabled";
if (true) return _mbase.getEnabled();
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return false;
}
public double  _getheight() throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Public Sub getHeight As Double";
 //BA.debugLineNum = 259;BA.debugLine="Return mBase.PrefHeight";
if (true) return _mbase.getPrefHeight();
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return 0;
}
public double  _getleft() throws Exception{
 //BA.debugLineNum = 299;BA.debugLine="Public Sub getLeft As Double";
 //BA.debugLineNum = 301;BA.debugLine="Return mBase.Left";
if (true) return _mbase.getLeft();
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper  _getparent() throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Public Sub getParent As Node";
 //BA.debugLineNum = 280;BA.debugLine="Return mBase.Parent";
if (true) return _mbase.getParent();
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return null;
}
public int  _getprogress() throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Public Sub getProgress()  As Int";
 //BA.debugLineNum = 198;BA.debugLine="Return (ProgressBar.PrefWidth / mBase.PrefWidth )";
if (true) return (int) ((_progressbar.getPrefWidth()/(double)_mbase.getPrefWidth())*100);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return 0;
}
public String  _getprogresscolor() throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Public Sub getProgressColor As String";
 //BA.debugLineNum = 135;BA.debugLine="Return	CFControlsUtils.getBackgroundColor(Progres";
if (true) return _cfcontrolsutils._getbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_progressbar.getObject())));
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public boolean  _getshowprogresspercentagetext() throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Public Sub getShowProgressPercentageText As Boolea";
 //BA.debugLineNum = 211;BA.debugLine="Return ProgressPercentageText.Visible";
if (true) return _progresspercentagetext.getVisible();
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return false;
}
public Object  _gettag() throws Exception{
 //BA.debugLineNum = 286;BA.debugLine="Public Sub getTag As Object";
 //BA.debugLineNum = 288;BA.debugLine="Return mBase.Tag";
if (true) return _mbase.getTag();
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public double  _gettop() throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="Public Sub getTop As Double";
 //BA.debugLineNum = 273;BA.debugLine="Return mBase.Top";
if (true) return _mbase.getTop();
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return 0;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Public Sub getVisible As Boolean";
 //BA.debugLineNum = 233;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return false;
}
public double  _getwidth() throws Exception{
 //BA.debugLineNum = 264;BA.debugLine="Public Sub getWidth As Double";
 //BA.debugLineNum = 266;BA.debugLine="Return mBase.PrefWidth";
if (true) return _mbase.getPrefWidth();
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 49;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 50;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 51;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 120;BA.debugLine="CFControlsUtils.RemoveEffect(ProgressPane)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_progresspane.getObject())));
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return "";
}
public String  _removenodefromparent() throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Public Sub RemoveNodeFromParent";
 //BA.debugLineNum = 310;BA.debugLine="mBase.RemoveNodeFromParent";
_mbase.RemoveNodeFromParent();
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return "";
}
public String  _setalpha(double _alpha) throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Public Sub setAlpha(Alpha As Double)";
 //BA.debugLineNum = 252;BA.debugLine="mBase.Alpha = Alpha";
_mbase.setAlpha(_alpha);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return "";
}
public String  _setbackgroundcolor(String _color) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Public Sub setBackgroundColor(color As String)";
 //BA.debugLineNum = 142;BA.debugLine="CFControlsUtils.setBackgroundColor(ProgressPane,";
_cfcontrolsutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_progresspane.getObject())),_color);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 96;BA.debugLine="CFControlsUtils.SetBorder(ProgressPane, color, wi";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_progresspane.getObject())),_color,_width);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 102;BA.debugLine="CFControlsUtils.SetBorderRadius(ProgressPane, rad";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_progresspane.getObject())),_radius);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(String _effect) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Public Sub setEffect(effect As String)";
 //BA.debugLineNum = 108;BA.debugLine="CFControlsUtils.SetEffect(ProgressPane, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_progresspane.getObject())),_effect);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(boolean _enabled) throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Public Sub setEnabled(Enabled As Boolean)";
 //BA.debugLineNum = 226;BA.debugLine="mBase.Enabled = Enabled";
_mbase.setEnabled(_enabled);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return "";
}
public String  _setinvertbackground(boolean _boolval) throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Public Sub setInvertBackground(BoolVal As Boolean)";
 //BA.debugLineNum = 162;BA.debugLine="If BoolVal Then";
if (_boolval) { 
 //BA.debugLineNum = 164;BA.debugLine="CFControlsUtils.setBackgroundColor(ProgressPane,";
_cfcontrolsutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_progresspane.getObject())),"#2D2E2F");
 };
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public String  _setprogress(int _value) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Public Sub setProgress(value As Int)";
 //BA.debugLineNum = 183;BA.debugLine="If value >= 100 Then";
if (_value>=100) { 
 //BA.debugLineNum = 184;BA.debugLine="value = 100";
_value = (int) (100);
 //BA.debugLineNum = 187;BA.debugLine="CallSub(mCallBack, mEventName & \"_ProgressFinish";
__c.CallSubNew(ba,_mcallback,_meventname+"_ProgressFinished");
 };
 //BA.debugLineNum = 191;BA.debugLine="ProgressBar.SetLayoutAnimated(300, 0 ,0 , (value";
_progressbar.SetLayoutAnimated((int) (300),0,0,(_value/(double)100)*_mbase.getPrefWidth(),_mbase.getPrefHeight());
 //BA.debugLineNum = 192;BA.debugLine="ProgressPercentageText.Left = ProgressBar.PrefWid";
_progresspercentagetext.setLeft(_progressbar.getPrefWidth()-8);
 //BA.debugLineNum = 193;BA.debugLine="Log(ProgressBar.PrefWidth - 8)";
__c.Log(BA.NumberToString(_progressbar.getPrefWidth()-8));
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return "";
}
public String  _setprogresscolor(String _color) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Public Sub setProgressColor(color As String)";
 //BA.debugLineNum = 129;BA.debugLine="CFControlsUtils.setBackgroundColor(ProgressBar, c";
_cfcontrolsutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_progressbar.getObject())),_color);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public String  _setprogressstate(String _state) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Public Sub setProgressState(State As String)";
 //BA.debugLineNum = 155;BA.debugLine="setProgressColor(State)";
_setprogresscolor(_state);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
public String  _setrotation(float _angle) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Public Sub setRotation(angle As Float)";
 //BA.debugLineNum = 90;BA.debugLine="CFControlsUtils.SetRotation(ProgressPane, angle)";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_progresspane.getObject())),_angle);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public String  _setshowprogresspercentagetext(boolean _boolval) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Public Sub setShowProgressPercentageText(BoolVal A";
 //BA.debugLineNum = 205;BA.debugLine="ProgressPercentageText.Visible = BoolVal";
_progresspercentagetext.setVisible(_boolval);
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return "";
}
public String  _settag(Object _tag) throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Public Sub setTag(Tag As Object)";
 //BA.debugLineNum = 294;BA.debugLine="mBase.Tag = Tag";
_mbase.setTag(_tag);
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
return "";
}
public String  _setuselightbackground(boolean _boolval) throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Public Sub setUseLightBackground(BoolVal As Boolea";
 //BA.debugLineNum = 173;BA.debugLine="If BoolVal Then";
if (_boolval) { 
 //BA.debugLineNum = 175;BA.debugLine="CFControlsUtils.setBackgroundColor(ProgressPane,";
_cfcontrolsutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_progresspane.getObject())),"#E5E5E5");
 };
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _visible) throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Public Sub setVisible(Visible As Boolean)";
 //BA.debugLineNum = 239;BA.debugLine="mBase.Visible = Visible";
_mbase.setVisible(_visible);
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _snapshot() throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="Public Sub Snapshot As Image";
 //BA.debugLineNum = 317;BA.debugLine="Return mBase.Snapshot";
if (true) return _mbase.Snapshot();
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _snapshot2(anywheresoftware.b4j.objects.JFX.PaintWrapper _backgroundcolor) throws Exception{
 //BA.debugLineNum = 322;BA.debugLine="Public Sub Snapshot2(BackgroundColor As Paint) As";
 //BA.debugLineNum = 324;BA.debugLine="Return mBase.Snapshot2(BackgroundColor)";
if (true) return _mbase.Snapshot2((javafx.scene.paint.Paint)(_backgroundcolor.getObject()));
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
