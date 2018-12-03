package punchline.tech.cuppy.framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmaterialcard extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("punchline.tech.cuppy.framework", "punchline.tech.cuppy.framework.cfmaterialcard", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", punchline.tech.cuppy.framework.cfmaterialcard.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _mbase = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _innercard = null;
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
 //BA.debugLineNum = 40;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 42;BA.debugLine="InnerCard.PrefWidth = Width";
_innercard.setPrefWidth(_width);
 //BA.debugLineNum = 43;BA.debugLine="InnerCard.PrefHeight = Height";
_innercard.setPrefHeight(_height);
 //BA.debugLineNum = 45;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 19;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 20;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 21;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Public InnerCard As Pane";
_innercard = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 31;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 32;BA.debugLine="mBase.LoadLayout(\"CFMaterialCardUI\")";
_mbase.LoadLayout(ba,"CFMaterialCardUI");
 //BA.debugLineNum = 34;BA.debugLine="setTag(Lbl.Tag)";
_settag(_lbl.getTag());
 //BA.debugLineNum = 35;BA.debugLine="setAlpha(Lbl.Alpha)";
_setalpha(_lbl.getAlpha());
 //BA.debugLineNum = 36;BA.debugLine="setBorder(CFStyleManager.DefaultTheme.Get(\"divide";
_setborder(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("divider"))),(int) (1));
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public double  _getalpha() throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Public Sub getAlpha As Double";
 //BA.debugLineNum = 132;BA.debugLine="Return mBase.Alpha";
if (true) return _mbase.getAlpha();
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 50;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public String  _geteffect(String _effect) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Public Sub getEffect(effect As String) As String";
 //BA.debugLineNum = 89;BA.debugLine="Return CFControlsUtils.GetEffect(InnerCard)";
if (true) return _cfcontrolsutils._geteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innercard.getObject())));
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public boolean  _getenabled() throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Public Sub getEnabled As Boolean";
 //BA.debugLineNum = 106;BA.debugLine="Return mBase.Enabled";
if (true) return _mbase.getEnabled();
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return false;
}
public double  _getheight() throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Public Sub getHeight As Double";
 //BA.debugLineNum = 145;BA.debugLine="Return mBase.PrefHeight";
if (true) return _mbase.getPrefHeight();
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return 0;
}
public double  _getleft() throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Public Sub getLeft As Double";
 //BA.debugLineNum = 187;BA.debugLine="Return mBase.Left";
if (true) return _mbase.getLeft();
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper  _getparent() throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Public Sub getParent As Node";
 //BA.debugLineNum = 166;BA.debugLine="Return mBase.Parent";
if (true) return _mbase.getParent();
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return null;
}
public Object  _gettag() throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Public Sub getTag As Object";
 //BA.debugLineNum = 174;BA.debugLine="Return mBase.Tag";
if (true) return _mbase.getTag();
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public double  _gettop() throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Public Sub getTop As Double";
 //BA.debugLineNum = 159;BA.debugLine="Return mBase.Top";
if (true) return _mbase.getTop();
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return 0;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Public Sub getVisible As Boolean";
 //BA.debugLineNum = 119;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return false;
}
public double  _getwidth() throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Public Sub getWidth As Double";
 //BA.debugLineNum = 152;BA.debugLine="Return mBase.PrefWidth";
if (true) return _mbase.getPrefWidth();
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
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
public String  _innercard_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Private Sub InnerCard_MouseClicked (EventData As M";
 //BA.debugLineNum = 242;BA.debugLine="InnerCard.RequestFocus 'set focus";
_innercard.RequestFocus();
 //BA.debugLineNum = 243;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseCl";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MouseClicked",(Object)(_eventdata));
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return "";
}
public String  _innercard_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Private Sub InnerCard_MouseEntered (EventData As M";
 //BA.debugLineNum = 230;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEn";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MouseEntered",(Object)(_eventdata));
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return "";
}
public String  _innercard_mouseexited(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Private Sub InnerCard_MouseExited (EventData As Mo";
 //BA.debugLineNum = 236;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEx";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MouseExited",(Object)(_eventdata));
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return "";
}
public String  _innercard_touch(int _action,float _x,float _y) throws Exception{
anywheresoftware.b4a.objects.collections.Map _points = null;
 //BA.debugLineNum = 217;BA.debugLine="Private Sub InnerCard_Touch (Action As Int, X As F";
 //BA.debugLineNum = 219;BA.debugLine="Dim Points As Map";
_points = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 220;BA.debugLine="Points.Initialize";
_points.Initialize();
 //BA.debugLineNum = 221;BA.debugLine="Points.Put(\"X\", X )";
_points.Put((Object)("X"),(Object)(_x));
 //BA.debugLineNum = 222;BA.debugLine="Points.Put(\"Y\", Y )";
_points.Put((Object)("Y"),(Object)(_y));
 //BA.debugLineNum = 224;BA.debugLine="CallSubDelayed3( mCallBack, mEventName & \"_Touch\"";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_Touch",(Object)(_action),(Object)(_points));
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 95;BA.debugLine="CFControlsUtils.removeEffect(InnerCard)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innercard.getObject())));
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public String  _removenodefromparent() throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Public Sub RemoveNodeFromParent";
 //BA.debugLineNum = 196;BA.debugLine="mBase.RemoveNodeFromParent";
_mbase.RemoveNodeFromParent();
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return "";
}
public String  _setalpha(double _alpha) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Public Sub setAlpha(Alpha As Double)";
 //BA.debugLineNum = 138;BA.debugLine="mBase.Alpha = Alpha";
_mbase.setAlpha(_alpha);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public String  _setbg(String _color) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Public Sub setBg(color As String)";
 //BA.debugLineNum = 59;BA.debugLine="CFControlsUtils.SetBG( InnerCard, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innercard.getObject())),_color);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 71;BA.debugLine="CFControlsUtils.setBorder(InnerCard, color, width";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innercard.getObject())),_color,_width);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 77;BA.debugLine="CFControlsUtils.setBorderRadius(InnerCard, radius";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innercard.getObject())),_radius);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(String _effect) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Public Sub setEffect(effect As String)";
 //BA.debugLineNum = 83;BA.debugLine="CFControlsUtils.setEffect(InnerCard, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innercard.getObject())),_effect);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(boolean _enabled) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Public Sub setEnabled(Enabled As Boolean)";
 //BA.debugLineNum = 112;BA.debugLine="mBase.Enabled = Enabled";
_mbase.setEnabled(_enabled);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public String  _setrotation(float _angle) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Public Sub setRotation(angle As Float)";
 //BA.debugLineNum = 65;BA.debugLine="CFControlsUtils.setRotation(InnerCard, angle) 'ro";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innercard.getObject())),_angle);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public String  _settag(Object _tag) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Public Sub setTag(Tag As Object)";
 //BA.debugLineNum = 180;BA.debugLine="mBase.Tag = Tag";
_mbase.setTag(_tag);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _visible) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Public Sub setVisible(Visible As Boolean)";
 //BA.debugLineNum = 125;BA.debugLine="mBase.Visible = Visible";
_mbase.setVisible(_visible);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _snapshot() throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Public Sub Snapshot As Image";
 //BA.debugLineNum = 203;BA.debugLine="Return mBase.Snapshot";
if (true) return _mbase.Snapshot();
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _snapshot2(anywheresoftware.b4j.objects.JFX.PaintWrapper _backgroundcolor) throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Public Sub Snapshot2(BackgroundColor As Paint) As";
 //BA.debugLineNum = 210;BA.debugLine="Return mBase.Snapshot2(BackgroundColor)";
if (true) return _mbase.Snapshot2((javafx.scene.paint.Paint)(_backgroundcolor.getObject()));
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
