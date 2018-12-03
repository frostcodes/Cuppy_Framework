package punchline.tech.cuppy.framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmaterialdivider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("punchline.tech.cuppy.framework", "punchline.tech.cuppy.framework.cfmaterialdivider", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", punchline.tech.cuppy.framework.cfmaterialdivider.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _mbase = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _line = null;
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
 //BA.debugLineNum = 42;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 44;BA.debugLine="line.PrefWidth = Width";
_line.setPrefWidth(_width);
 //BA.debugLineNum = 45;BA.debugLine="line.PrefHeight = Height";
_line.setPrefHeight(_height);
 //BA.debugLineNum = 47;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 13;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 14;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 15;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Public line As Pane";
_line = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 31;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 32;BA.debugLine="mBase.LoadLayout(\"CFMaterialDividerUI\")";
_mbase.LoadLayout(ba,"CFMaterialDividerUI");
 //BA.debugLineNum = 35;BA.debugLine="setBg(CFStyleManager.DefaultTheme.Get(\"divider\"))";
_setbg(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("divider"))));
 //BA.debugLineNum = 36;BA.debugLine="setTag(Lbl.Tag)";
_settag(_lbl.getTag());
 //BA.debugLineNum = 37;BA.debugLine="setAlpha(Lbl.Alpha)";
_setalpha(_lbl.getAlpha());
 //BA.debugLineNum = 40;BA.debugLine="End  Sub";
return "";
}
public double  _getalpha() throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Public Sub getAlpha As Double";
 //BA.debugLineNum = 189;BA.debugLine="Return mBase.Alpha";
if (true) return _mbase.getAlpha();
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 52;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public String  _geteffect(String _effect) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Public Sub getEffect(effect As String) As String";
 //BA.debugLineNum = 93;BA.debugLine="Return CFControlsUtils.GetEffect(line)";
if (true) return _cfcontrolsutils._geteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_line.getObject())));
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public boolean  _getenabled() throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Public Sub getEnabled As Boolean";
 //BA.debugLineNum = 163;BA.debugLine="Return mBase.Enabled";
if (true) return _mbase.getEnabled();
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return false;
}
public double  _getheight() throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Public Sub getHeight As Double";
 //BA.debugLineNum = 202;BA.debugLine="Return mBase.PrefHeight";
if (true) return _mbase.getPrefHeight();
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return 0;
}
public double  _getleft() throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Public Sub getLeft As Double";
 //BA.debugLineNum = 244;BA.debugLine="Return mBase.Left";
if (true) return _mbase.getLeft();
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper  _getparent() throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Public Sub getParent As Node";
 //BA.debugLineNum = 223;BA.debugLine="Return mBase.Parent";
if (true) return _mbase.getParent();
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return null;
}
public Object  _gettag() throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Public Sub getTag As Object";
 //BA.debugLineNum = 231;BA.debugLine="Return mBase.Tag";
if (true) return _mbase.getTag();
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public double  _getthickness() throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Public Sub getThickness() As Double";
 //BA.debugLineNum = 116;BA.debugLine="Return line.PrefHeight";
if (true) return _line.getPrefHeight();
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return 0;
}
public double  _gettop() throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Public Sub getTop As Double";
 //BA.debugLineNum = 216;BA.debugLine="Return mBase.Top";
if (true) return _mbase.getTop();
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return 0;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Public Sub getVisible As Boolean";
 //BA.debugLineNum = 176;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return false;
}
public double  _getwidth() throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Public Sub getWidth As Double";
 //BA.debugLineNum = 209;BA.debugLine="Return mBase.PrefWidth";
if (true) return _mbase.getPrefWidth();
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 25;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 26;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 27;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 99;BA.debugLine="CFControlsUtils.RemoveEffect(line)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_line.getObject())));
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public String  _removenodefromparent() throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Public Sub RemoveNodeFromParent";
 //BA.debugLineNum = 253;BA.debugLine="mBase.RemoveNodeFromParent";
_mbase.RemoveNodeFromParent();
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return "";
}
public String  _setalpha(double _alpha) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Public Sub setAlpha(Alpha As Double)";
 //BA.debugLineNum = 195;BA.debugLine="mBase.Alpha = Alpha";
_mbase.setAlpha(_alpha);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return "";
}
public String  _setbg(String _color) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Public Sub setBg(color As String)";
 //BA.debugLineNum = 62;BA.debugLine="CFControlsUtils.SetBG(line, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_line.getObject())),_color);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 75;BA.debugLine="CFControlsUtils.SetBorder(line, color, width)";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_line.getObject())),_color,_width);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 81;BA.debugLine="CFControlsUtils.SetBorderRadius(line, radius)";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_line.getObject())),_radius);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(String _effect) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Public Sub setEffect(effect As String)";
 //BA.debugLineNum = 87;BA.debugLine="CFControlsUtils.SetEffect(line, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_line.getObject())),_effect);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(boolean _enabled) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Public Sub setEnabled(Enabled As Boolean)";
 //BA.debugLineNum = 169;BA.debugLine="mBase.Enabled = Enabled";
_mbase.setEnabled(_enabled);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return "";
}
public String  _settag(Object _tag) throws Exception{
 //BA.debugLineNum = 235;BA.debugLine="Public Sub setTag(Tag As Object)";
 //BA.debugLineNum = 237;BA.debugLine="mBase.Tag = Tag";
_mbase.setTag(_tag);
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return "";
}
public String  _setthickness(double _size) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Public Sub setThickness(size As Double)";
 //BA.debugLineNum = 110;BA.debugLine="mBase.PrefHeight =  size";
_mbase.setPrefHeight(_size);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _visible) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Public Sub setVisible(Visible As Boolean)";
 //BA.debugLineNum = 182;BA.debugLine="mBase.Visible = Visible";
_mbase.setVisible(_visible);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _snapshot() throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Public Sub Snapshot As Image";
 //BA.debugLineNum = 260;BA.debugLine="Return mBase.Snapshot";
if (true) return _mbase.Snapshot();
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _snapshot2(anywheresoftware.b4j.objects.JFX.PaintWrapper _backgroundcolor) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Public Sub Snapshot2(BackgroundColor As Paint) As";
 //BA.debugLineNum = 267;BA.debugLine="Return mBase.Snapshot2(BackgroundColor)";
if (true) return _mbase.Snapshot2((javafx.scene.paint.Paint)(_backgroundcolor.getObject()));
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
