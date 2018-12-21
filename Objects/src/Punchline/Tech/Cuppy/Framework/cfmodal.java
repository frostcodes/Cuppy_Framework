package punchline.tech.cuppy.framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmodal extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("punchline.tech.cuppy.framework", "punchline.tech.cuppy.framework.cfmodal", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", punchline.tech.cuppy.framework.cfmodal.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _mbase = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _modalpane = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _modalbgpane = null;
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
 //BA.debugLineNum = 52;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 54;BA.debugLine="ModalBgPane.PrefWidth = Width";
_modalbgpane.setPrefWidth(_width);
 //BA.debugLineNum = 55;BA.debugLine="ModalBgPane.PrefHeight =  Height";
_modalbgpane.setPrefHeight(_height);
 //BA.debugLineNum = 57;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 33;BA.debugLine="Public ModalPane As Pane";
_modalpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Public ModalBgPane As Pane";
_modalbgpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 44;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 45;BA.debugLine="mBase.LoadLayout(\"CFModalUI\")";
_mbase.LoadLayout(ba,"CFModalUI");
 //BA.debugLineNum = 47;BA.debugLine="setTag(Lbl.Tag)";
_settag(_lbl.getTag());
 //BA.debugLineNum = 48;BA.debugLine="setAlpha(Lbl.Alpha)";
_setalpha(_lbl.getAlpha());
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public double  _getalpha() throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Public Sub getAlpha As Double";
 //BA.debugLineNum = 187;BA.debugLine="Return mBase.Alpha";
if (true) return _mbase.getAlpha();
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return 0;
}
public String  _getbackgroundcolor() throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Public Sub getBackgroundColor As String";
 //BA.debugLineNum = 77;BA.debugLine="Return CFControlsUtils.GetBackgroundColor(ModalPa";
if (true) return _cfcontrolsutils._getbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_modalpane.getObject())));
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 62;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public String  _geteffect(String _effect) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Public Sub getEffect(effect As String) As String";
 //BA.debugLineNum = 109;BA.debugLine="Return CFControlsUtils.GetEffect(ModalPane)";
if (true) return _cfcontrolsutils._geteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_modalpane.getObject())));
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public boolean  _getenabled() throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Public Sub getEnabled As Boolean";
 //BA.debugLineNum = 161;BA.debugLine="Return mBase.Enabled";
if (true) return _mbase.getEnabled();
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return false;
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
public void  _hide() throws Exception{
ResumableSub_Hide rsub = new ResumableSub_Hide(this);
rsub.resume(ba, null);
}
public static class ResumableSub_Hide extends BA.ResumableSub {
public ResumableSub_Hide(punchline.tech.cuppy.framework.cfmodal parent) {
this.parent = parent;
}
punchline.tech.cuppy.framework.cfmodal parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 139;BA.debugLine="mBase.SetAlphaAnimated(300, 0)";
parent._mbase.SetAlphaAnimated((int) (300),0);
 //BA.debugLineNum = 141;BA.debugLine="Wait For mBase_AnimationCompleted";
parent.__c.WaitFor("mbase_animationcompleted", ba, this, null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 143;BA.debugLine="ModalBgPane.Visible = False";
parent._modalbgpane.setVisible(parent.__c.False);
 //BA.debugLineNum = 144;BA.debugLine="ModalPane.Visible = False";
parent._modalpane.setVisible(parent.__c.False);
 //BA.debugLineNum = 146;BA.debugLine="mBase.SetSize(0, 0)";
parent._mbase.SetSize(0,0);
 //BA.debugLineNum = 147;BA.debugLine="mBase.Enabled = False";
parent._mbase.setEnabled(parent.__c.False);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _mbase_animationcompleted() throws Exception{
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 37;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 38;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 39;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 40;BA.debugLine="mBase.Initialize(mEventName)";
_mbase.Initialize(ba,_meventname);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _modalbgpane_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 274;BA.debugLine="Private Sub ModalBgPane_MousePressed (EventData As";
 //BA.debugLineNum = 276;BA.debugLine="ModalPane.RequestFocus 'set focus";
_modalpane.RequestFocus();
 //BA.debugLineNum = 278;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ModalBG";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_ModalBGPressed",(Object)(_eventdata));
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return "";
}
public String  _modalbgpane_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub ModalBgPane_Resize (Width As Double, Height As";
 //BA.debugLineNum = 298;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_ModalBg";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_ModalBgPaneResize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
return "";
}
public String  _modalpane_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 282;BA.debugLine="Private Sub ModalPane_MousePressed (EventData As M";
 //BA.debugLineNum = 284;BA.debugLine="ModalPane.RequestFocus 'set focus";
_modalpane.RequestFocus();
 //BA.debugLineNum = 286;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ModalPr";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_ModalPressed",(Object)(_eventdata));
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return "";
}
public String  _modalpane_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Sub ModalPane_Resize (Width As Double, Height As D";
 //BA.debugLineNum = 292;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_ModalPa";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_ModalPaneResize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 115;BA.debugLine="CFControlsUtils.RemoveEffect(ModalPane)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_modalpane.getObject())));
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public String  _removenodefromparent() throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Public Sub RemoveNodeFromParent";
 //BA.debugLineNum = 251;BA.debugLine="mBase.RemoveNodeFromParent";
_mbase.RemoveNodeFromParent();
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 69;BA.debugLine="Public Sub setBackgroundColor(color As String)";
 //BA.debugLineNum = 71;BA.debugLine="CFControlsUtils.SetBackgroundColor( ModalPane, co";
_cfcontrolsutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_modalpane.getObject())),_color);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 89;BA.debugLine="CFControlsUtils.setBorder(ModalPane, color, width";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_modalpane.getObject())),_color,_width);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 96;BA.debugLine="CFControlsUtils.setBorderRadius(ModalPane, radius";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_modalpane.getObject())),_radius);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(String _effect) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Public Sub setEffect(effect As String)";
 //BA.debugLineNum = 103;BA.debugLine="CFControlsUtils.setEffect(ModalPane, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_modalpane.getObject())),_effect);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(boolean _enabled) throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Public Sub setEnabled(Enabled As Boolean)";
 //BA.debugLineNum = 167;BA.debugLine="mBase.Enabled = Enabled";
_mbase.setEnabled(_enabled);
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return "";
}
public String  _setrotation(float _angle) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Public Sub setRotation(angle As Float)";
 //BA.debugLineNum = 83;BA.debugLine="CFControlsUtils.setRotation(ModalPane, angle) 'ro";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_modalpane.getObject())),_angle);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public String  _settag(Object _tag) throws Exception{
 //BA.debugLineNum = 233;BA.debugLine="Public Sub setTag(Tag As Object)";
 //BA.debugLineNum = 235;BA.debugLine="mBase.Tag = Tag";
_mbase.setTag(_tag);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
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
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _parent = null;
 //BA.debugLineNum = 123;BA.debugLine="Public Sub Show";
 //BA.debugLineNum = 125;BA.debugLine="Dim Parent As Pane = GetBase.Parent";
_parent = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_parent.setObject((javafx.scene.layout.Pane)(_getbase().getParent().getObject()));
 //BA.debugLineNum = 127;BA.debugLine="mBase.Enabled = True";
_mbase.setEnabled(__c.True);
 //BA.debugLineNum = 128;BA.debugLine="mBase.Alpha = 1";
_mbase.setAlpha(1);
 //BA.debugLineNum = 130;BA.debugLine="ModalBgPane.Visible = True";
_modalbgpane.setVisible(__c.True);
 //BA.debugLineNum = 131;BA.debugLine="ModalPane.Visible = True";
_modalpane.setVisible(__c.True);
 //BA.debugLineNum = 133;BA.debugLine="mBase.SetLayoutAnimated(300, 0 , 0,  Parent.Width";
_mbase.SetLayoutAnimated((int) (300),0,0,_parent.getWidth(),_parent.getHeight());
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
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
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
