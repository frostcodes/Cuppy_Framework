package punchline.tech.cuppy.framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmaterialsquarefab extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("punchline.tech.cuppy.framework", "punchline.tech.cuppy.framework.cfmaterialsquarefab", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", punchline.tech.cuppy.framework.cfmaterialsquarefab.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _mbase = null;
public anywheresoftware.b4j.objects.LabelWrapper _fab_btn = null;
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
 //BA.debugLineNum = 41;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 44;BA.debugLine="FAB_Btn.PrefWidth = Width";
_fab_btn.setPrefWidth(_width);
 //BA.debugLineNum = 45;BA.debugLine="FAB_Btn.PrefHeight = Width";
_fab_btn.setPrefHeight(_width);
 //BA.debugLineNum = 47;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 18;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 19;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 20;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Public FAB_Btn As Label";
_fab_btn = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 30;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 31;BA.debugLine="mBase.LoadLayout(\"CFMaterialSquareFABUI\")";
_mbase.LoadLayout(ba,"CFMaterialSquareFABUI");
 //BA.debugLineNum = 33;BA.debugLine="setBackgroundColor(CFStyleManager.DefaultTheme.Ge";
_setbackgroundcolor(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("accent"))));
 //BA.debugLineNum = 34;BA.debugLine="setRotation(135) 'rotate by default";
_setrotation((float) (135));
 //BA.debugLineNum = 36;BA.debugLine="setTag(Lbl.Tag)";
_settag(_lbl.getTag());
 //BA.debugLineNum = 37;BA.debugLine="setAlpha(Lbl.Alpha)";
_setalpha(_lbl.getAlpha());
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public String  _fab_btn_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 267;BA.debugLine="Private Sub FAB_Btn_MouseEntered (EventData As Mou";
 //BA.debugLineNum = 269;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEn";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MouseEntered",(Object)(_eventdata));
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return "";
}
public String  _fab_btn_mouseexited(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Private Sub FAB_Btn_MouseExited (EventData As Mous";
 //BA.debugLineNum = 275;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEx";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MouseExited",(Object)(_eventdata));
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return "";
}
public String  _fab_btn_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Private Sub FAB_Btn_MousePressed (EventData As Mou";
 //BA.debugLineNum = 261;BA.debugLine="FAB_Btn.RequestFocus 'set focus";
_fab_btn.RequestFocus();
 //BA.debugLineNum = 263;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MousePr";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MousePressed",(Object)(_eventdata));
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return "";
}
public double  _getalpha() throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Public Sub getAlpha As Double";
 //BA.debugLineNum = 172;BA.debugLine="Return mBase.Alpha";
if (true) return _mbase.getAlpha();
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return 0;
}
public String  _getbackgroundcolor() throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Public Sub getBackgroundColor As String";
 //BA.debugLineNum = 67;BA.debugLine="Return CFControlsUtils.GetBackgroundColor(FAB_Btn";
if (true) return _cfcontrolsutils._getbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_fab_btn.getObject())));
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 52;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public String  _getbordercolor() throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Public Sub getBorderColor As String";
 //BA.debugLineNum = 92;BA.debugLine="Return CFControlsUtils.GetBorderColor(FAB_Btn)";
if (true) return _cfcontrolsutils._getbordercolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_fab_btn.getObject())));
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public int  _getborderradius() throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Public Sub getBorderRadius As Int";
 //BA.debugLineNum = 104;BA.debugLine="Return CFControlsUtils.GetBorderRadius(FAB_Btn)";
if (true) return _cfcontrolsutils._getborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_fab_btn.getObject())));
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return 0;
}
public int  _getborderwidth() throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Public Sub getBorderWidth As Int";
 //BA.debugLineNum = 98;BA.debugLine="Return CFControlsUtils.GetBorderWidth(FAB_Btn)";
if (true) return _cfcontrolsutils._getborderwidth((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_fab_btn.getObject())));
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return 0;
}
public String  _geteffect(String _effect) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Public Sub getEffect(effect As String) As String";
 //BA.debugLineNum = 116;BA.debugLine="Return CFControlsUtils.GetEffect(FAB_Btn)";
if (true) return _cfcontrolsutils._geteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_fab_btn.getObject())));
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public boolean  _getenabled() throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Public Sub getEnabled As Boolean";
 //BA.debugLineNum = 146;BA.debugLine="Return mBase.Enabled";
if (true) return _mbase.getEnabled();
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return false;
}
public double  _getheight() throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Public Sub getHeight As Double";
 //BA.debugLineNum = 185;BA.debugLine="Return mBase.PrefHeight";
if (true) return _mbase.getPrefHeight();
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return 0;
}
public String  _geticon() throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Public Sub getIcon As String";
 //BA.debugLineNum = 136;BA.debugLine="Return FAB_Btn.Text";
if (true) return _fab_btn.getText();
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return "";
}
public double  _getleft() throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="Public Sub getLeft As Double";
 //BA.debugLineNum = 227;BA.debugLine="Return mBase.Left";
if (true) return _mbase.getLeft();
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper  _getparent() throws Exception{
 //BA.debugLineNum = 204;BA.debugLine="Public Sub getParent As Node";
 //BA.debugLineNum = 206;BA.debugLine="Return mBase.Parent";
if (true) return _mbase.getParent();
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public Object  _gettag() throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Public Sub getTag As Object";
 //BA.debugLineNum = 214;BA.debugLine="Return mBase.Tag";
if (true) return _mbase.getTag();
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return null;
}
public double  _gettop() throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Public Sub getTop As Double";
 //BA.debugLineNum = 199;BA.debugLine="Return mBase.Top";
if (true) return _mbase.getTop();
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return 0;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Public Sub getVisible As Boolean";
 //BA.debugLineNum = 159;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return false;
}
public double  _getwidth() throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Public Sub getWidth As Double";
 //BA.debugLineNum = 192;BA.debugLine="Return mBase.PrefWidth";
if (true) return _mbase.getPrefWidth();
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return 0;
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
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 122;BA.debugLine="CFControlsUtils.removeEffect(FAB_Btn)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_fab_btn.getObject())));
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public String  _removenodefromparent() throws Exception{
 //BA.debugLineNum = 234;BA.debugLine="Public Sub RemoveNodeFromParent";
 //BA.debugLineNum = 236;BA.debugLine="mBase.RemoveNodeFromParent";
_mbase.RemoveNodeFromParent();
 //BA.debugLineNum = 238;BA.debugLine="End Sub";
return "";
}
public String  _setalpha(double _alpha) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Public Sub setAlpha(Alpha As Double)";
 //BA.debugLineNum = 178;BA.debugLine="mBase.Alpha = Alpha";
_mbase.setAlpha(_alpha);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public String  _setbackgroundcolor(String _color) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Public Sub setBackgroundColor(color As String)";
 //BA.debugLineNum = 61;BA.debugLine="CFControlsUtils.setBackgroundColor(FAB_Btn, color";
_cfcontrolsutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_fab_btn.getObject())),_color);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 79;BA.debugLine="CFControlsUtils.setBorder(FAB_Btn, color, width)";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_fab_btn.getObject())),_color,_width);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 86;BA.debugLine="CFControlsUtils.setBorderRadius(FAB_Btn, radius)";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_fab_btn.getObject())),_radius);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(String _effect) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Public Sub setEffect(effect As String)";
 //BA.debugLineNum = 110;BA.debugLine="CFControlsUtils.setEffect(FAB_Btn, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_fab_btn.getObject())),_effect);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(boolean _enabled) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Public Sub setEnabled(Enabled As Boolean)";
 //BA.debugLineNum = 152;BA.debugLine="mBase.Enabled = Enabled";
_mbase.setEnabled(_enabled);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}
public String  _seticon(String _icontext) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Public Sub setIcon(IconText As String)";
 //BA.debugLineNum = 130;BA.debugLine="FAB_Btn.Text = IconText";
_fab_btn.setText(_icontext);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public String  _setrotation(float _angle) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Public Sub setRotation(angle As Float)";
 //BA.debugLineNum = 73;BA.debugLine="CFControlsUtils.setRotation(FAB_Btn, angle) 'rota";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_fab_btn.getObject())),_angle);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public String  _settag(Object _tag) throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Public Sub setTag(Tag As Object)";
 //BA.debugLineNum = 220;BA.debugLine="mBase.Tag = Tag";
_mbase.setTag(_tag);
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _visible) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Public Sub setVisible(Visible As Boolean)";
 //BA.debugLineNum = 165;BA.debugLine="mBase.Visible = Visible";
_mbase.setVisible(_visible);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _snapshot() throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Public Sub Snapshot As Image";
 //BA.debugLineNum = 243;BA.debugLine="Return mBase.Snapshot";
if (true) return _mbase.Snapshot();
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _snapshot2(anywheresoftware.b4j.objects.JFX.PaintWrapper _backgroundcolor) throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Public Sub Snapshot2(BackgroundColor As Paint) As";
 //BA.debugLineNum = 250;BA.debugLine="Return mBase.Snapshot2(BackgroundColor)";
if (true) return _mbase.Snapshot2((javafx.scene.paint.Paint)(_backgroundcolor.getObject()));
 //BA.debugLineNum = 252;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
