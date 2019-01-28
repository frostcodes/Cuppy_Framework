package punchline.tech.cuppy.framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmateriallabel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("punchline.tech.cuppy.framework", "punchline.tech.cuppy.framework.cfmateriallabel", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", punchline.tech.cuppy.framework.cfmateriallabel.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _mbase = null;
public anywheresoftware.b4j.objects.LabelWrapper _innerlabel = null;
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
 //BA.debugLineNum = 45;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 47;BA.debugLine="InnerLabel.PrefWidth = Width";
_innerlabel.setPrefWidth(_width);
 //BA.debugLineNum = 48;BA.debugLine="InnerLabel.PrefHeight =  Height";
_innerlabel.setPrefHeight(_height);
 //BA.debugLineNum = 50;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 14;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 15;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 16;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 17;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Public InnerLabel As Label";
_innerlabel = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 27;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 28;BA.debugLine="mBase.LoadLayout(\"CFMaterialLabelUI\")";
_mbase.LoadLayout(ba,"CFMaterialLabelUI");
 //BA.debugLineNum = 31;BA.debugLine="setTextColor(CFStyleManager.DefaultTheme.Get(\"pri";
_settextcolor(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("primary_text"))));
 //BA.debugLineNum = 32;BA.debugLine="InnerLabel.Font = CFStyleManager.FONT_LIGHT";
_innerlabel.setFont(_cfstylemanager._font_light);
 //BA.debugLineNum = 35;BA.debugLine="setText(Props.Get(\"Text\"))";
_settext(BA.ObjectToString(_props.Get((Object)("Text"))));
 //BA.debugLineNum = 37;BA.debugLine="setTextSize(Lbl.TextSize)";
_settextsize(_lbl.getTextSize());
 //BA.debugLineNum = 38;BA.debugLine="setText(Lbl.Text)";
_settext(_lbl.getText());
 //BA.debugLineNum = 40;BA.debugLine="setTag(Lbl.Tag)";
_settag(_lbl.getTag());
 //BA.debugLineNum = 41;BA.debugLine="setAlpha(Lbl.Alpha)";
_setalpha(_lbl.getAlpha());
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public double  _getalpha() throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Public Sub getAlpha As Double";
 //BA.debugLineNum = 197;BA.debugLine="Return mBase.Alpha";
if (true) return _mbase.getAlpha();
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return 0;
}
public String  _getbackgroundcolor() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Public Sub getBackgroundColor As String";
 //BA.debugLineNum = 70;BA.debugLine="Return CFControlsUtils.GetBackgroundColor(InnerLa";
if (true) return _cfcontrolsutils._getbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerlabel.getObject())));
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 55;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public String  _getbordercolor() throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Public Sub getBorderColor As String";
 //BA.debugLineNum = 100;BA.debugLine="Return CFControlsUtils.GetBorderColor(InnerLabel)";
if (true) return _cfcontrolsutils._getbordercolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerlabel.getObject())));
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public int  _getborderradius() throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Public Sub getBorderRadius As Int";
 //BA.debugLineNum = 112;BA.debugLine="Return CFControlsUtils.GetBorderRadius(InnerLabel";
if (true) return _cfcontrolsutils._getborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerlabel.getObject())));
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return 0;
}
public int  _getborderwidth() throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Public Sub getBorderWidth As Int";
 //BA.debugLineNum = 106;BA.debugLine="Return CFControlsUtils.GetBorderWidth(InnerLabel)";
if (true) return _cfcontrolsutils._getborderwidth((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerlabel.getObject())));
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return 0;
}
public String  _geteffect(String _effect) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Public Sub getEffect(effect As String) As String";
 //BA.debugLineNum = 124;BA.debugLine="Return CFControlsUtils.GetEffect(InnerLabel)";
if (true) return _cfcontrolsutils._geteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerlabel.getObject())));
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
public boolean  _getenabled() throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Public Sub getEnabled As Boolean";
 //BA.debugLineNum = 171;BA.debugLine="Return mBase.Enabled";
if (true) return _mbase.getEnabled();
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return false;
}
public double  _getheight() throws Exception{
 //BA.debugLineNum = 208;BA.debugLine="Public Sub getHeight As Double";
 //BA.debugLineNum = 210;BA.debugLine="Return mBase.PrefHeight";
if (true) return _mbase.getPrefHeight();
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return 0;
}
public double  _getleft() throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Public Sub getLeft As Double";
 //BA.debugLineNum = 252;BA.debugLine="Return mBase.Left";
if (true) return _mbase.getLeft();
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper  _getparent() throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Public Sub getParent As Node";
 //BA.debugLineNum = 231;BA.debugLine="Return mBase.Parent";
if (true) return _mbase.getParent();
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public Object  _gettag() throws Exception{
 //BA.debugLineNum = 237;BA.debugLine="Public Sub getTag As Object";
 //BA.debugLineNum = 239;BA.debugLine="Return mBase.Tag";
if (true) return _mbase.getTag();
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return null;
}
public String  _gettext() throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Public Sub getText() As String";
 //BA.debugLineNum = 162;BA.debugLine="Return InnerLabel.Text";
if (true) return _innerlabel.getText();
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return "";
}
public double  _gettextsize() throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Public Sub getTextSize() As Double";
 //BA.debugLineNum = 147;BA.debugLine="Return InnerLabel.TextSize";
if (true) return _innerlabel.getTextSize();
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return 0;
}
public double  _gettop() throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Public Sub getTop As Double";
 //BA.debugLineNum = 224;BA.debugLine="Return mBase.Top";
if (true) return _mbase.getTop();
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return 0;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Public Sub getVisible As Boolean";
 //BA.debugLineNum = 184;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return false;
}
public double  _getwidth() throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Public Sub getWidth As Double";
 //BA.debugLineNum = 217;BA.debugLine="Return mBase.PrefWidth";
if (true) return _mbase.getPrefWidth();
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 22;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 23;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _innerlabel_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 285;BA.debugLine="Private Sub InnerLabel_MousePressed (EventData As";
 //BA.debugLineNum = 287;BA.debugLine="InnerLabel.RequestFocus 'set focus";
_innerlabel.RequestFocus();
 //BA.debugLineNum = 288;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MousePr";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MousePressed",(Object)(_eventdata));
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 130;BA.debugLine="CFControlsUtils.removeEffect(InnerLabel)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerlabel.getObject())));
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public String  _removenodefromparent() throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Public Sub RemoveNodeFromParent";
 //BA.debugLineNum = 261;BA.debugLine="mBase.RemoveNodeFromParent";
_mbase.RemoveNodeFromParent();
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return "";
}
public String  _setalpha(double _alpha) throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Public Sub setAlpha(Alpha As Double)";
 //BA.debugLineNum = 203;BA.debugLine="mBase.Alpha = Alpha";
_mbase.setAlpha(_alpha);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return "";
}
public String  _setbackgroundcolor(String _color) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Public Sub setBackgroundColor(color As String)";
 //BA.debugLineNum = 64;BA.debugLine="CFControlsUtils.setBackgroundColor( InnerLabel, c";
_cfcontrolsutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerlabel.getObject())),_color);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 88;BA.debugLine="CFControlsUtils.setBorder(InnerLabel, color, widt";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerlabel.getObject())),_color,_width);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 94;BA.debugLine="CFControlsUtils.setBorderRadius(InnerLabel, radiu";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerlabel.getObject())),_radius);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(String _effect) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Public Sub setEffect(effect As String)";
 //BA.debugLineNum = 118;BA.debugLine="CFControlsUtils.setEffect(InnerLabel, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerlabel.getObject())),_effect);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(boolean _enabled) throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Public Sub setEnabled(Enabled As Boolean)";
 //BA.debugLineNum = 177;BA.debugLine="mBase.Enabled = Enabled";
_mbase.setEnabled(_enabled);
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public String  _setrotation(float _angle) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Public Sub setRotation(angle As Float)";
 //BA.debugLineNum = 82;BA.debugLine="CFControlsUtils.setRotation(InnerLabel, angle) 'r";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerlabel.getObject())),_angle);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public String  _settag(Object _tag) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Public Sub setTag(Tag As Object)";
 //BA.debugLineNum = 245;BA.debugLine="mBase.Tag = Tag";
_mbase.setTag(_tag);
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return "";
}
public String  _settext(String _text) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Public Sub setText(Text As String)";
 //BA.debugLineNum = 156;BA.debugLine="InnerLabel.Text = Text";
_innerlabel.setText(_text);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public String  _settextcolor(String _color) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Public Sub setTextColor(color As String)";
 //BA.debugLineNum = 76;BA.debugLine="CFControlsUtils.setTextColor (InnerLabel, color)";
_cfcontrolsutils._settextcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerlabel.getObject())),_color);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public String  _settextsize(double _textsize) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Public Sub setTextSize(TextSize As Double)";
 //BA.debugLineNum = 141;BA.debugLine="InnerLabel.TextSize = TextSize";
_innerlabel.setTextSize(_textsize);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _visible) throws Exception{
 //BA.debugLineNum = 188;BA.debugLine="Public Sub setVisible(Visible As Boolean)";
 //BA.debugLineNum = 190;BA.debugLine="mBase.Visible = Visible";
_mbase.setVisible(_visible);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _snapshot() throws Exception{
 //BA.debugLineNum = 266;BA.debugLine="Public Sub Snapshot As Image";
 //BA.debugLineNum = 268;BA.debugLine="Return mBase.Snapshot";
if (true) return _mbase.Snapshot();
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _snapshot2(anywheresoftware.b4j.objects.JFX.PaintWrapper _backgroundcolor) throws Exception{
 //BA.debugLineNum = 273;BA.debugLine="Public Sub Snapshot2(BackgroundColor As Paint) As";
 //BA.debugLineNum = 275;BA.debugLine="Return mBase.Snapshot2(BackgroundColor)";
if (true) return _mbase.Snapshot2((javafx.scene.paint.Paint)(_backgroundcolor.getObject()));
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
