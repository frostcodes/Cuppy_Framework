package punchline.tech.cuppy.framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmaterialtoast extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("punchline.tech.cuppy.framework", "punchline.tech.cuppy.framework.cfmaterialtoast", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", punchline.tech.cuppy.framework.cfmaterialtoast.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _mbase = null;
public anywheresoftware.b4j.objects.LabelWrapper _toastactionbutton = null;
public anywheresoftware.b4j.objects.LabelWrapper _toasttextlabel = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pane1 = null;
public String _actionbuttonhovercolor = "";
public anywheresoftware.b4a.objects.Timer _timer1 = null;
public int _display_time_short = 0;
public int _display_time_long = 0;
public String _toast_type_info = "";
public String _toast_type_error = "";
public String _toast_type_warning = "";
public String _toast_type_success = "";
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
 //BA.debugLineNum = 81;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 34;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 35;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 36;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 37;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private ToastActionButton As Label";
_toastactionbutton = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private ToastTextLabel As Label";
_toasttextlabel = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private Pane1 As Pane";
_pane1 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Public ActionButtonHoverColor As String = \"#3E3E3";
_actionbuttonhovercolor = "#3E3E3E";
 //BA.debugLineNum = 44;BA.debugLine="Private timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 47;BA.debugLine="Public DISPLAY_TIME_SHORT As Int = 2500";
_display_time_short = (int) (2500);
 //BA.debugLineNum = 48;BA.debugLine="Public DISPLAY_TIME_LONG As Int = 5000";
_display_time_long = (int) (5000);
 //BA.debugLineNum = 51;BA.debugLine="Public TOAST_TYPE_INFO As String = \"#1565C0\"";
_toast_type_info = "#1565C0";
 //BA.debugLineNum = 52;BA.debugLine="Public TOAST_TYPE_ERROR As String = \"#E53935\"";
_toast_type_error = "#E53935";
 //BA.debugLineNum = 53;BA.debugLine="Public TOAST_TYPE_WARNING As String = \"#EF6C00\"";
_toast_type_warning = "#EF6C00";
 //BA.debugLineNum = 54;BA.debugLine="Public TOAST_TYPE_SUCCESS As String = \"#2E7D32\"";
_toast_type_success = "#2E7D32";
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 65;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 66;BA.debugLine="mBase.LoadLayout(\"CFMaterialToast\")";
_mbase.LoadLayout(ba,"CFMaterialToast");
 //BA.debugLineNum = 68;BA.debugLine="mBase.Visible = False";
_mbase.setVisible(__c.False);
 //BA.debugLineNum = 69;BA.debugLine="mBase.Alpha = 0";
_mbase.setAlpha(0);
 //BA.debugLineNum = 71;BA.debugLine="ToastActionButton.Font = CFStyleManager.ScaleFont";
_toastactionbutton.setFont(_cfstylemanager._scalefont2(_cfstylemanager._font_black.getFamilyName(),14,__c.False,__c.False));
 //BA.debugLineNum = 72;BA.debugLine="ToastTextLabel.Font =  ToastActionButton.Font";
_toasttextlabel.setFont(_toastactionbutton.getFont());
 //BA.debugLineNum = 74;BA.debugLine="timer1.Initialize(\"Timer1\", DISPLAY_TIME_SHORT)";
_timer1.Initialize(ba,"Timer1",(long) (_display_time_short));
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public String  _dimiss() throws Exception{
 //BA.debugLineNum = 468;BA.debugLine="Public Sub Dimiss";
 //BA.debugLineNum = 470;BA.debugLine="Hide";
_hide();
 //BA.debugLineNum = 472;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.JFX.FontWrapper  _getactionbuttonfont() throws Exception{
 //BA.debugLineNum = 336;BA.debugLine="Public Sub getActionButtonFont() As Font";
 //BA.debugLineNum = 338;BA.debugLine="Return ToastActionButton.font";
if (true) return _toastactionbutton.getFont();
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return null;
}
public String  _getactionbuttontext() throws Exception{
 //BA.debugLineNum = 354;BA.debugLine="Public Sub getActionButtonText() As String";
 //BA.debugLineNum = 356;BA.debugLine="Return ToastActionButton.Text";
if (true) return _toastactionbutton.getText();
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.JFX.PaintWrapper  _getactionbuttontextcolor() throws Exception{
 //BA.debugLineNum = 390;BA.debugLine="Public Sub getActionButtonTextColor As Paint";
 //BA.debugLineNum = 392;BA.debugLine="Return ToastActionButton.TextColor";
if (true) return (anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_toastactionbutton.getTextColor()));
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return null;
}
public double  _getactionbuttontextsize() throws Exception{
 //BA.debugLineNum = 378;BA.debugLine="Public Sub getActionButtonTextSize() As Double";
 //BA.debugLineNum = 380;BA.debugLine="Return ToastActionButton.TextSize";
if (true) return _toastactionbutton.getTextSize();
 //BA.debugLineNum = 382;BA.debugLine="End Sub";
return 0;
}
public boolean  _getactionbuttonvisible() throws Exception{
 //BA.debugLineNum = 366;BA.debugLine="Public Sub getActionButtonVisible As Boolean";
 //BA.debugLineNum = 368;BA.debugLine="Return ToastActionButton.Visible";
if (true) return _toastactionbutton.getVisible();
 //BA.debugLineNum = 370;BA.debugLine="End Sub";
return false;
}
public double  _getalpha() throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Public Sub getAlpha As Double";
 //BA.debugLineNum = 187;BA.debugLine="Return mBase.Alpha";
if (true) return _mbase.getAlpha();
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return 0;
}
public String  _getbackgroundcolor() throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Public Sub getBackgroundColor As String";
 //BA.debugLineNum = 101;BA.debugLine="Return CFControlsUtils.GetBackgroundColor(Pane1)";
if (true) return _cfcontrolsutils._getbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_pane1.getObject())));
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 86;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public String  _getbordercolor() throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Public Sub getBorderColor As String";
 //BA.debugLineNum = 119;BA.debugLine="Return CFControlsUtils.GetBorderColor(Pane1)";
if (true) return _cfcontrolsutils._getbordercolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_pane1.getObject())));
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public int  _getborderradius() throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Public Sub getBorderRadius As Int";
 //BA.debugLineNum = 131;BA.debugLine="Return CFControlsUtils.GetBorderRadius(Pane1)";
if (true) return _cfcontrolsutils._getborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_pane1.getObject())));
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return 0;
}
public int  _getborderwidth() throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Public Sub getBorderWidth As Int";
 //BA.debugLineNum = 125;BA.debugLine="Return CFControlsUtils.GetBorderWidth(Pane1)";
if (true) return _cfcontrolsutils._getborderwidth((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_pane1.getObject())));
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return 0;
}
public String  _geteffect(String _effect) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Public Sub getEffect(effect As String) As String";
 //BA.debugLineNum = 143;BA.debugLine="Return CFControlsUtils.GetEffect(Pane1)";
if (true) return _cfcontrolsutils._geteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_pane1.getObject())));
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public boolean  _getenabled() throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Public Sub getEnabled As Boolean";
 //BA.debugLineNum = 161;BA.debugLine="Return mBase.Enabled";
if (true) return _mbase.getEnabled();
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4j.objects.JFX.FontWrapper  _getfont() throws Exception{
 //BA.debugLineNum = 284;BA.debugLine="Public Sub getFont() As Font";
 //BA.debugLineNum = 286;BA.debugLine="Return ToastTextLabel.font";
if (true) return _toasttextlabel.getFont();
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return null;
}
public double  _getheight() throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Public Sub getHeight As Double";
 //BA.debugLineNum = 200;BA.debugLine="Return mBase.PrefHeight";
if (true) return _mbase.getPrefHeight();
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return 0;
}
public double  _getleft() throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Public Sub getLeft As Double";
 //BA.debugLineNum = 242;BA.debugLine="Return mBase.Left";
if (true) return _mbase.getLeft();
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper  _getparent() throws Exception{
 //BA.debugLineNum = 219;BA.debugLine="Public Sub getParent As Node";
 //BA.debugLineNum = 221;BA.debugLine="Return mBase.Parent";
if (true) return _mbase.getParent();
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public Object  _gettag() throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Public Sub getTag As Object";
 //BA.debugLineNum = 229;BA.debugLine="Return mBase.Tag";
if (true) return _mbase.getTag();
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return null;
}
public String  _gettext() throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Public Sub getText() As String";
 //BA.debugLineNum = 298;BA.debugLine="Return ToastTextLabel.Text";
if (true) return _toasttextlabel.getText();
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.JFX.PaintWrapper  _gettextcolor() throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Public Sub getTextColor As Paint";
 //BA.debugLineNum = 322;BA.debugLine="Return ToastTextLabel.TextColor";
if (true) return (anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_toasttextlabel.getTextColor()));
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
return null;
}
public double  _gettextsize() throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Public Sub getTextSize() As Double";
 //BA.debugLineNum = 310;BA.debugLine="Return ToastTextLabel.TextSize";
if (true) return _toasttextlabel.getTextSize();
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return 0;
}
public int  _gettoastclosetime() throws Exception{
 //BA.debugLineNum = 405;BA.debugLine="Public Sub getToastCloseTime As Int";
 //BA.debugLineNum = 407;BA.debugLine="Return timer1.Interval";
if (true) return (int) (_timer1.getInterval());
 //BA.debugLineNum = 409;BA.debugLine="End Sub";
return 0;
}
public double  _gettop() throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Public Sub getTop As Double";
 //BA.debugLineNum = 214;BA.debugLine="Return mBase.Top";
if (true) return _mbase.getTop();
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return 0;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Public Sub getVisible As Boolean";
 //BA.debugLineNum = 174;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return false;
}
public double  _getwidth() throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Public Sub getWidth As Double";
 //BA.debugLineNum = 207;BA.debugLine="Return mBase.PrefWidth";
if (true) return _mbase.getPrefWidth();
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return 0;
}
public String  _hide() throws Exception{
 //BA.debugLineNum = 460;BA.debugLine="Public Sub Hide";
 //BA.debugLineNum = 462;BA.debugLine="mBase.SetAlphaAnimated(300, 0)";
_mbase.SetAlphaAnimated((int) (300),0);
 //BA.debugLineNum = 463;BA.debugLine="mBase.Visible = False";
_mbase.setVisible(__c.False);
 //BA.debugLineNum = 464;BA.debugLine="timer1.Enabled = False";
_timer1.setEnabled(__c.False);
 //BA.debugLineNum = 466;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 58;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 59;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 60;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 149;BA.debugLine="CFControlsUtils.RemoveEffect(Pane1)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_pane1.getObject())));
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public String  _removenodefromparent() throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Public Sub RemoveNodeFromParent";
 //BA.debugLineNum = 251;BA.debugLine="mBase.RemoveNodeFromParent";
_mbase.RemoveNodeFromParent();
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return "";
}
public String  _setactionbuttonfont(anywheresoftware.b4j.objects.JFX.FontWrapper _font) throws Exception{
 //BA.debugLineNum = 330;BA.debugLine="Public Sub setActionButtonFont(font As Font)";
 //BA.debugLineNum = 332;BA.debugLine="ToastActionButton.Font = font";
_toastactionbutton.setFont(_font);
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return "";
}
public String  _setactionbuttontext(String _text) throws Exception{
 //BA.debugLineNum = 342;BA.debugLine="Public Sub setActionButtonText(text As String)";
 //BA.debugLineNum = 344;BA.debugLine="If CFStringUtility.IsEmpty(text) Then";
if (_cfstringutility._isempty(_text)) { 
 //BA.debugLineNum = 346;BA.debugLine="ToastActionButton.Visible =False";
_toastactionbutton.setVisible(__c.False);
 };
 //BA.debugLineNum = 350;BA.debugLine="ToastActionButton.Text = text";
_toastactionbutton.setText(_text);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return "";
}
public String  _setactionbuttontextcolor(anywheresoftware.b4j.objects.JFX.PaintWrapper _textcolor) throws Exception{
 //BA.debugLineNum = 384;BA.debugLine="Public Sub setActionButtonTextColor(TextColor As P";
 //BA.debugLineNum = 386;BA.debugLine="ToastActionButton.TextColor = TextColor";
_toastactionbutton.setTextColor((javafx.scene.paint.Paint)(_textcolor.getObject()));
 //BA.debugLineNum = 388;BA.debugLine="End Sub";
return "";
}
public String  _setactionbuttontextsize(double _textsize) throws Exception{
 //BA.debugLineNum = 372;BA.debugLine="Public Sub setActionButtonTextSize(TextSize As Dou";
 //BA.debugLineNum = 374;BA.debugLine="ToastActionButton.TextSize = TextSize";
_toastactionbutton.setTextSize(_textsize);
 //BA.debugLineNum = 376;BA.debugLine="End Sub";
return "";
}
public String  _setactionbuttonvisible(boolean _visible) throws Exception{
 //BA.debugLineNum = 360;BA.debugLine="Public Sub setActionButtonVisible(visible As Boole";
 //BA.debugLineNum = 362;BA.debugLine="ToastActionButton.Visible = visible";
_toastactionbutton.setVisible(_visible);
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return "";
}
public String  _setalpha(double _alpha) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Public Sub setAlpha(Alpha As Double)";
 //BA.debugLineNum = 193;BA.debugLine="mBase.Alpha = Alpha";
_mbase.setAlpha(_alpha);
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return "";
}
public String  _setbackgroundcolor(String _color) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Public Sub setBackgroundColor(color As String)";
 //BA.debugLineNum = 94;BA.debugLine="CFControlsUtils.setBackgroundColor(Pane1, color)";
_cfcontrolsutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_pane1.getObject())),_color);
 //BA.debugLineNum = 95;BA.debugLine="CFControlsUtils.setBackgroundColor(ToastActionBut";
_cfcontrolsutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_toastactionbutton.getObject())),_color);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 107;BA.debugLine="CFControlsUtils.SetBorder(Pane1, color, width)";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_pane1.getObject())),_color,_width);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 113;BA.debugLine="CFControlsUtils.SetBorderRadius(Pane1, radius)";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_pane1.getObject())),_radius);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(String _effect) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Public Sub setEffect(effect As String)";
 //BA.debugLineNum = 137;BA.debugLine="CFControlsUtils.SetEffect(Pane1, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_pane1.getObject())),_effect);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(boolean _enabled) throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Public Sub setEnabled(Enabled As Boolean)";
 //BA.debugLineNum = 167;BA.debugLine="mBase.Enabled = Enabled";
_mbase.setEnabled(_enabled);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return "";
}
public String  _setfont(anywheresoftware.b4j.objects.JFX.FontWrapper _font) throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Public Sub setFont(font As Font)";
 //BA.debugLineNum = 280;BA.debugLine="ToastTextLabel.Font = font";
_toasttextlabel.setFont(_font);
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return "";
}
public String  _settag(Object _tag) throws Exception{
 //BA.debugLineNum = 233;BA.debugLine="Public Sub setTag(Tag As Object)";
 //BA.debugLineNum = 235;BA.debugLine="mBase.Tag = Tag";
_mbase.setTag(_tag);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return "";
}
public String  _settext(String _text) throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Public Sub setText(text As String)";
 //BA.debugLineNum = 292;BA.debugLine="ToastTextLabel.Text = text";
_toasttextlabel.setText(_text);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return "";
}
public String  _settextcolor(anywheresoftware.b4j.objects.JFX.PaintWrapper _textcolor) throws Exception{
 //BA.debugLineNum = 314;BA.debugLine="Public Sub setTextColor(TextColor As Paint)";
 //BA.debugLineNum = 316;BA.debugLine="ToastTextLabel.TextColor = TextColor";
_toasttextlabel.setTextColor((javafx.scene.paint.Paint)(_textcolor.getObject()));
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return "";
}
public String  _settextsize(double _textsize) throws Exception{
 //BA.debugLineNum = 302;BA.debugLine="Public Sub setTextSize(TextSize As Double)";
 //BA.debugLineNum = 304;BA.debugLine="ToastTextLabel.TextSize = TextSize";
_toasttextlabel.setTextSize(_textsize);
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return "";
}
public String  _settoastclosetime(int _timeinms) throws Exception{
 //BA.debugLineNum = 399;BA.debugLine="Public Sub setToastCloseTime(TimeInMs As Int)";
 //BA.debugLineNum = 401;BA.debugLine="timer1.Interval = TimeInMs";
_timer1.setInterval((long) (_timeinms));
 //BA.debugLineNum = 403;BA.debugLine="End Sub";
return "";
}
public String  _settoasttype(String _toasttype) throws Exception{
 //BA.debugLineNum = 481;BA.debugLine="Public Sub setToastType(ToastType As String)";
 //BA.debugLineNum = 483;BA.debugLine="setBackgroundColor(ToastType)";
_setbackgroundcolor(_toasttype);
 //BA.debugLineNum = 485;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _visible) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Public Sub setVisible(Visible As Boolean)";
 //BA.debugLineNum = 180;BA.debugLine="mBase.Visible = Visible";
_mbase.setVisible(_visible);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return "";
}
public String  _show() throws Exception{
 //BA.debugLineNum = 449;BA.debugLine="Public Sub Show";
 //BA.debugLineNum = 451;BA.debugLine="timer1.Enabled = True";
_timer1.setEnabled(__c.True);
 //BA.debugLineNum = 453;BA.debugLine="mBase.Visible = True";
_mbase.setVisible(__c.True);
 //BA.debugLineNum = 454;BA.debugLine="mBase.Top = mBase.Top - 20dip";
_mbase.setTop(_mbase.getTop()-__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 455;BA.debugLine="mBase.SetAlphaAnimated(300, 1)";
_mbase.SetAlphaAnimated((int) (300),1);
 //BA.debugLineNum = 456;BA.debugLine="mBase.SetLayoutAnimated(300, mBase.Left, mBase.To";
_mbase.SetLayoutAnimated((int) (300),_mbase.getLeft(),_mbase.getTop()+__c.DipToCurrent((int) (20)),_mbase.getPrefWidth(),_mbase.getPrefHeight());
 //BA.debugLineNum = 458;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _snapshot() throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="Public Sub Snapshot As Image";
 //BA.debugLineNum = 258;BA.debugLine="Return mBase.Snapshot";
if (true) return _mbase.Snapshot();
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _snapshot2(anywheresoftware.b4j.objects.JFX.PaintWrapper _backgroundcolor) throws Exception{
 //BA.debugLineNum = 263;BA.debugLine="Public Sub Snapshot2(BackgroundColor As Paint) As";
 //BA.debugLineNum = 265;BA.debugLine="Return mBase.Snapshot2(BackgroundColor)";
if (true) return _mbase.Snapshot2((javafx.scene.paint.Paint)(_backgroundcolor.getObject()));
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public String  _timer1_tick() throws Exception{
 //BA.debugLineNum = 474;BA.debugLine="Private Sub Timer1_Tick";
 //BA.debugLineNum = 476;BA.debugLine="Hide";
_hide();
 //BA.debugLineNum = 478;BA.debugLine="End Sub";
return "";
}
public String  _toastactionbutton_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 510;BA.debugLine="Private Sub ToastActionButton_MouseClicked (EventD";
 //BA.debugLineNum = 512;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ActionB";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_ActionButtonMouseClicked",(Object)(_eventdata));
 //BA.debugLineNum = 514;BA.debugLine="End Sub";
return "";
}
public String  _toastactionbutton_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 496;BA.debugLine="Private Sub ToastActionButton_MouseEntered (EventD";
 //BA.debugLineNum = 498;BA.debugLine="CFControlsUtils.SetBackgroundColor(ToastActionBut";
_cfcontrolsutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_toastactionbutton.getObject())),_actionbuttonhovercolor);
 //BA.debugLineNum = 499;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ActionB";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_ActionButtonMouseEntered",(Object)(_eventdata));
 //BA.debugLineNum = 501;BA.debugLine="End Sub";
return "";
}
public String  _toastactionbutton_mouseexited(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 503;BA.debugLine="Private Sub ToastActionButton_MouseExited (EventDa";
 //BA.debugLineNum = 505;BA.debugLine="CFControlsUtils.SetBackgroundColor(ToastActionBut";
_cfcontrolsutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_toastactionbutton.getObject())),_cfcontrolsutils._getbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_toasttextlabel.getObject()))));
 //BA.debugLineNum = 506;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ActionB";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_ActionButtonMouseExited",(Object)(_eventdata));
 //BA.debugLineNum = 508;BA.debugLine="End Sub";
return "";
}
public String  _toasttextlabel_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 489;BA.debugLine="Private Sub ToastTextLabel_MousePressed (EventData";
 //BA.debugLineNum = 491;BA.debugLine="mBase.Visible = False";
_mbase.setVisible(__c.False);
 //BA.debugLineNum = 492;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MousePr";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MousePressed",(Object)(_eventdata));
 //BA.debugLineNum = 494;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
