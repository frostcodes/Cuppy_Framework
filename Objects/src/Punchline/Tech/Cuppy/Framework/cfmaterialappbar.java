package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmaterialappbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmaterialappbar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.cfmaterialappbar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _mbase = null;
public anywheresoftware.b4j.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _innerpane = null;
public anywheresoftware.b4j.objects.ButtonWrapper _innerbutton = null;
public anywheresoftware.b4j.objects.LabelWrapper _titlelabel = null;
public b4j.example.cssutils _cssutils = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 50;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 20;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 21;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 22;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 23;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Public InnerPane As Pane";
_innerpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Public InnerButton As Button";
_innerbutton = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Public TitleLabel As Label";
_titlelabel = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 36;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 37;BA.debugLine="mBase.LoadLayout(\"CFMaterialAppBarUI\")";
_mbase.LoadLayout(ba,"CFMaterialAppBarUI");
 //BA.debugLineNum = 40;BA.debugLine="SetBg(CFStyleManager.DefaultTheme.Get(\"primary\"))";
_setbg(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("primary"))));
 //BA.debugLineNum = 42;BA.debugLine="TitleLabel.Font = CFStyleManager.SelectFont(\"Blac";
_titlelabel.setFont(_cfstylemanager._selectfont("Black",14));
 //BA.debugLineNum = 43;BA.debugLine="setTitle(Props.Get(\"Title\"))";
_settitle(BA.ObjectToString(_props.Get((Object)("Title"))));
 //BA.debugLineNum = 44;BA.debugLine="setEnableShadow(Props.Get(\"EnableShadow\"))";
_setenableshadow(BA.ObjectToBoolean(_props.Get((Object)("EnableShadow"))));
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 55;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public String  _geticon() throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Public Sub getIcon As String";
 //BA.debugLineNum = 114;BA.debugLine="Return Label1.Text";
if (true) return _label1.getText();
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public boolean  _getshadowenabled() throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Public Sub getShadowEnabled As Boolean";
 //BA.debugLineNum = 150;BA.debugLine="Return Label1.Visible";
if (true) return _label1.getVisible();
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return false;
}
public String  _gettitle() throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Public Sub getTitle As String";
 //BA.debugLineNum = 120;BA.debugLine="Return TitleLabel.Text";
if (true) return _titlelabel.getText();
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 30;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 31;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 32;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public String  _innerbutton_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Private Sub InnerButton_MousePressed (EventData As";
 //BA.debugLineNum = 156;BA.debugLine="InnerButton.RequestFocus 'set focus";
_innerbutton.RequestFocus();
 //BA.debugLineNum = 158;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MousePr";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MousePressed",(Object)(_eventdata));
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return "";
}
public String  _innerpane_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Private Sub InnerPane_MousePressed (EventData As M";
 //BA.debugLineNum = 164;BA.debugLine="InnerPane.RequestFocus 'set focus";
_innerpane.RequestFocus();
 //BA.debugLineNum = 166;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_PaneMou";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_PaneMousePressed",(Object)(_eventdata));
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 100;BA.debugLine="CFControlsUtils.removeEffect(Label1)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_label1.getObject())));
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public String  _setbg(String _color) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 66;BA.debugLine="CFControlsUtils.SetBG( Label1,  color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_label1.getObject())),_color);
 //BA.debugLineNum = 67;BA.debugLine="CFControlsUtils.SetBG( InnerPane, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerpane.getObject())),_color);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Public Sub SetBorder(color As String , width As In";
 //BA.debugLineNum = 80;BA.debugLine="CFControlsUtils.setBorder(Label1, color, width)";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_label1.getObject())),_color,_width);
 //BA.debugLineNum = 81;BA.debugLine="CFControlsUtils.setBorder(InnerPane, color, width";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerpane.getObject())),_color,_width);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Public Sub SetBorderRadius(radius As Int)";
 //BA.debugLineNum = 87;BA.debugLine="CFControlsUtils.setBorderRadius(Label1, radius)";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_label1.getObject())),_radius);
 //BA.debugLineNum = 88;BA.debugLine="CFControlsUtils.setBorderRadius(InnerPane, radius";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerpane.getObject())),_radius);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(String _effect) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Public Sub SetEffect(effect As String)";
 //BA.debugLineNum = 94;BA.debugLine="CFControlsUtils.setEffect(Label1, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_label1.getObject())),_effect);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public String  _setenableshadow(boolean _boolval) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Public Sub setEnableShadow(BoolVal As Boolean)";
 //BA.debugLineNum = 144;BA.debugLine="Label1.Visible = BoolVal";
_label1.setVisible(_boolval);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public String  _sethideicon(boolean _boolval) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Public Sub setHideIcon(BoolVal As Boolean)";
 //BA.debugLineNum = 138;BA.debugLine="InnerButton.Visible = Not(BoolVal)";
_innerbutton.setVisible(__c.Not(_boolval));
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public String  _sethidetitle(boolean _boolval) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Public Sub setHideTitle(BoolVal As Boolean)";
 //BA.debugLineNum = 132;BA.debugLine="TitleLabel.Visible = Not(BoolVal)";
_titlelabel.setVisible(__c.Not(_boolval));
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return "";
}
public String  _seticon(String _icontext) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Public Sub setIcon(IconText As String)";
 //BA.debugLineNum = 108;BA.debugLine="Label1.Text = IconText";
_label1.setText(_icontext);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public String  _setrotation(float _angle) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Public Sub setRotation(angle As Float)";
 //BA.debugLineNum = 73;BA.debugLine="CFControlsUtils.setRotation(Label1, angle) 'rotat";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_label1.getObject())),_angle);
 //BA.debugLineNum = 74;BA.debugLine="CFControlsUtils.setRotation(InnerPane , angle) 'r";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerpane.getObject())),_angle);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public String  _settitle(String _title) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Public Sub setTitle(Title As String)";
 //BA.debugLineNum = 126;BA.debugLine="TitleLabel.Text = Title";
_titlelabel.setText(_title);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
