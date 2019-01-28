package punchline.tech.cuppy.framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmaterialbutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("punchline.tech.cuppy.framework", "punchline.tech.cuppy.framework.cfmaterialbutton", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", punchline.tech.cuppy.framework.cfmaterialbutton.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _mbase = null;
public anywheresoftware.b4j.objects.ButtonWrapper _innerbutton = null;
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
 //BA.debugLineNum = 47;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 49;BA.debugLine="InnerButton.PrefWidth = Width";
_innerbutton.setPrefWidth(_width);
 //BA.debugLineNum = 50;BA.debugLine="InnerButton.PrefHeight =  Height";
_innerbutton.setPrefHeight(_height);
 //BA.debugLineNum = 52;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
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
 //BA.debugLineNum = 19;BA.debugLine="Public InnerButton As Button";
_innerbutton = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 30;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 31;BA.debugLine="mBase.LoadLayout(\"CFMaterialButtonUI\")";
_mbase.LoadLayout(ba,"CFMaterialButtonUI");
 //BA.debugLineNum = 34;BA.debugLine="setBackgroundColor(CFStyleManager.DefaultTheme.Ge";
_setbackgroundcolor(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("accent"))));
 //BA.debugLineNum = 35;BA.debugLine="InnerButton.Font = CFStyleManager.FONT_REGULAR";
_innerbutton.setFont(_cfstylemanager._font_regular);
 //BA.debugLineNum = 36;BA.debugLine="InnerButton.MouseCursor = fx.Cursors.HAND";
_innerbutton.setMouseCursor(_fx.Cursors.HAND);
 //BA.debugLineNum = 38;BA.debugLine="setTextSize(Lbl.TextSize)";
_settextsize(_lbl.getTextSize());
 //BA.debugLineNum = 39;BA.debugLine="setText(Lbl.Text)";
_settext(_lbl.getText());
 //BA.debugLineNum = 41;BA.debugLine="setTag(Lbl.Tag)";
_settag(_lbl.getTag());
 //BA.debugLineNum = 42;BA.debugLine="setAlpha(Lbl.Alpha)";
_setalpha(_lbl.getAlpha());
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public double  _getalpha() throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Public Sub getAlpha As Double";
 //BA.debugLineNum = 164;BA.debugLine="Return mBase.Alpha";
if (true) return _mbase.getAlpha();
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return 0;
}
public String  _getbackgroundcolor() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Public Sub getBackgroundColor As String";
 //BA.debugLineNum = 72;BA.debugLine="Return CFControlsUtils.GetBackgroundColor(InnerBu";
if (true) return _cfcontrolsutils._getbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerbutton.getObject())));
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 57;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public String  _getbordercolor() throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Public Sub getBorderColor As String";
 //BA.debugLineNum = 97;BA.debugLine="Return CFControlsUtils.GetBorderColor(InnerButton";
if (true) return _cfcontrolsutils._getbordercolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerbutton.getObject())));
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public int  _getborderradius() throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Public Sub getBorderRadius As Int";
 //BA.debugLineNum = 109;BA.debugLine="Return CFControlsUtils.GetBorderRadius(InnerButto";
if (true) return _cfcontrolsutils._getborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerbutton.getObject())));
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return 0;
}
public int  _getborderwidth() throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Public Sub getBorderWidth As Int";
 //BA.debugLineNum = 103;BA.debugLine="Return CFControlsUtils.GetBorderWidth(InnerButton";
if (true) return _cfcontrolsutils._getborderwidth((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerbutton.getObject())));
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return 0;
}
public String  _geteffect(String _effect) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Public Sub getEffect(effect As String) As String";
 //BA.debugLineNum = 121;BA.debugLine="Return CFControlsUtils.GetEffect(InnerButton)";
if (true) return _cfcontrolsutils._geteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerbutton.getObject())));
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return "";
}
public boolean  _getenabled() throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Public Sub getEnabled As Boolean";
 //BA.debugLineNum = 138;BA.debugLine="Return mBase.Enabled";
if (true) return _mbase.getEnabled();
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4j.objects.JFX.FontWrapper  _getfont() throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Public Sub getFont() As Font";
 //BA.debugLineNum = 261;BA.debugLine="Return InnerButton.font";
if (true) return _innerbutton.getFont();
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return null;
}
public double  _getheight() throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Public Sub getHeight As Double";
 //BA.debugLineNum = 177;BA.debugLine="Return mBase.PrefHeight";
if (true) return _mbase.getPrefHeight();
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return 0;
}
public double  _getleft() throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Public Sub getLeft As Double";
 //BA.debugLineNum = 219;BA.debugLine="Return mBase.Left";
if (true) return _mbase.getLeft();
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper  _getparent() throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Public Sub getParent As Node";
 //BA.debugLineNum = 198;BA.debugLine="Return mBase.Parent";
if (true) return _mbase.getParent();
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public Object  _gettag() throws Exception{
 //BA.debugLineNum = 204;BA.debugLine="Public Sub getTag As Object";
 //BA.debugLineNum = 206;BA.debugLine="Return mBase.Tag";
if (true) return _mbase.getTag();
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public String  _gettext() throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="Public Sub getText() As String";
 //BA.debugLineNum = 273;BA.debugLine="Return InnerButton.Text";
if (true) return _innerbutton.getText();
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.JFX.PaintWrapper  _gettextcolor() throws Exception{
 //BA.debugLineNum = 295;BA.debugLine="Public Sub getTextColor As Paint";
 //BA.debugLineNum = 297;BA.debugLine="Return InnerButton.TextColor";
if (true) return (anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_innerbutton.getTextColor()));
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public double  _gettextsize() throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="Public Sub getTextSize() As Double";
 //BA.debugLineNum = 285;BA.debugLine="Return InnerButton.TextSize";
if (true) return _innerbutton.getTextSize();
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return 0;
}
public double  _gettop() throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Public Sub getTop As Double";
 //BA.debugLineNum = 191;BA.debugLine="Return mBase.Top";
if (true) return _mbase.getTop();
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return 0;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Public Sub getVisible As Boolean";
 //BA.debugLineNum = 151;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return false;
}
public double  _getwidth() throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Public Sub getWidth As Double";
 //BA.debugLineNum = 184;BA.debugLine="Return mBase.PrefWidth";
if (true) return _mbase.getPrefWidth();
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 23;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 24;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public String  _innerbutton_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 311;BA.debugLine="Private Sub InnerButton_MouseEntered (EventData As";
 //BA.debugLineNum = 313;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEn";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MouseEntered",(Object)(_eventdata));
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return "";
}
public String  _innerbutton_mouseexited(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 317;BA.debugLine="Private Sub InnerButton_MouseExited (EventData As";
 //BA.debugLineNum = 319;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEx";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MouseExited",(Object)(_eventdata));
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return "";
}
public String  _innerbutton_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Private Sub InnerButton_MousePressed (EventData As";
 //BA.debugLineNum = 306;BA.debugLine="InnerButton.RequestFocus 'set focus";
_innerbutton.RequestFocus();
 //BA.debugLineNum = 307;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MousePr";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MousePressed",(Object)(_eventdata));
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 127;BA.debugLine="CFControlsUtils.removeEffect(InnerButton)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerbutton.getObject())));
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return "";
}
public String  _removenodefromparent() throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Public Sub RemoveNodeFromParent";
 //BA.debugLineNum = 228;BA.debugLine="mBase.RemoveNodeFromParent";
_mbase.RemoveNodeFromParent();
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return "";
}
public String  _setalpha(double _alpha) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Public Sub setAlpha(Alpha As Double)";
 //BA.debugLineNum = 170;BA.debugLine="mBase.Alpha = Alpha";
_mbase.setAlpha(_alpha);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return "";
}
public String  _setbackgroundcolor(String _color) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Public Sub setBackgroundColor(color As String)";
 //BA.debugLineNum = 66;BA.debugLine="CFControlsUtils.SetBackgroundColor( InnerButton,";
_cfcontrolsutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerbutton.getObject())),_color);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 84;BA.debugLine="CFControlsUtils.setBorder(InnerButton, color, wid";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerbutton.getObject())),_color,_width);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 90;BA.debugLine="CFControlsUtils.setBorderRadius(InnerButton, radi";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerbutton.getObject())),_radius);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(String _effect) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Public Sub setEffect(effect As String)";
 //BA.debugLineNum = 115;BA.debugLine="CFControlsUtils.setEffect(InnerButton, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerbutton.getObject())),_effect);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(boolean _enabled) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Public Sub setEnabled(Enabled As Boolean)";
 //BA.debugLineNum = 144;BA.debugLine="mBase.Enabled = Enabled";
_mbase.setEnabled(_enabled);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public String  _setfont(anywheresoftware.b4j.objects.JFX.FontWrapper _font) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Public Sub setFont(font As Font)";
 //BA.debugLineNum = 255;BA.debugLine="InnerButton.Font = font";
_innerbutton.setFont(_font);
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return "";
}
public String  _setrotation(float _angle) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Public Sub setRotation(angle As Float)";
 //BA.debugLineNum = 78;BA.debugLine="CFControlsUtils.setRotation(InnerButton, angle) '";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerbutton.getObject())),_angle);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _settag(Object _tag) throws Exception{
 //BA.debugLineNum = 210;BA.debugLine="Public Sub setTag(Tag As Object)";
 //BA.debugLineNum = 212;BA.debugLine="mBase.Tag = Tag";
_mbase.setTag(_tag);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return "";
}
public String  _settext(String _text) throws Exception{
 //BA.debugLineNum = 265;BA.debugLine="Public Sub setText(text As String)";
 //BA.debugLineNum = 267;BA.debugLine="InnerButton.Text = text";
_innerbutton.setText(_text);
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return "";
}
public String  _settextcolor(anywheresoftware.b4j.objects.JFX.PaintWrapper _textcolor) throws Exception{
 //BA.debugLineNum = 289;BA.debugLine="Public Sub setTextColor(TextColor As Paint)";
 //BA.debugLineNum = 291;BA.debugLine="InnerButton.TextColor = TextColor";
_innerbutton.setTextColor((javafx.scene.paint.Paint)(_textcolor.getObject()));
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return "";
}
public String  _settextsize(double _textsize) throws Exception{
 //BA.debugLineNum = 277;BA.debugLine="Public Sub setTextSize(TextSize As Double)";
 //BA.debugLineNum = 279;BA.debugLine="InnerButton.TextSize = TextSize";
_innerbutton.setTextSize(_textsize);
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _visible) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Public Sub setVisible(Visible As Boolean)";
 //BA.debugLineNum = 157;BA.debugLine="mBase.Visible = Visible";
_mbase.setVisible(_visible);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _snapshot() throws Exception{
 //BA.debugLineNum = 233;BA.debugLine="Public Sub Snapshot As Image";
 //BA.debugLineNum = 235;BA.debugLine="Return mBase.Snapshot";
if (true) return _mbase.Snapshot();
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _snapshot2(anywheresoftware.b4j.objects.JFX.PaintWrapper _backgroundcolor) throws Exception{
 //BA.debugLineNum = 240;BA.debugLine="Public Sub Snapshot2(BackgroundColor As Paint) As";
 //BA.debugLineNum = 242;BA.debugLine="Return mBase.Snapshot2(BackgroundColor)";
if (true) return _mbase.Snapshot2((javafx.scene.paint.Paint)(_backgroundcolor.getObject()));
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
