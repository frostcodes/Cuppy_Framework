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
public anywheresoftware.b4j.objects.JFX _vvvvvvvvvvvvvvvvvvv1 = null;
public String _vvvvvvvvvvvvvvvvvvv2 = "";
public Object _vvvvvvvvvvvvvvvvvvv3 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _vvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4j.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _innerpane = null;
public anywheresoftware.b4j.objects.ButtonWrapper _innerbutton = null;
public anywheresoftware.b4j.objects.LabelWrapper _titlelabel = null;
public b4j.example.cssutils _vvvvvvvvvvvvvvvvvvv5 = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _vvvvvvvvvvvvvvvvvvv6 = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _vvvvvvvvvvvvvvvvvvv7 = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _vvvvvvvvvvvvvvvvvvv0 = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _vvvvvvvvvvvvvvvvvvvv1 = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _vvvvvvvvvvvvvvvvvvvv2 = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _vvvvvvvvvvvvvvvvvvvv3 = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _vvvvvvvvvvvvvvvvvvvv5 = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _vvvvvvvvvvvvvvvvvvvv6 = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _vvvvvvvvvvvvvvvvvvvv7 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 53;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,_vvvvvvvvvvvvvvvvvvv3,_vvvvvvvvvvvvvvvvvvv2+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 20;BA.debugLine="Private fx As JFX";
_vvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 21;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvvvvvv2 = "";
 //BA.debugLineNum = 22;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvvvvvv3 = new Object();
 //BA.debugLineNum = 23;BA.debugLine="Private mBase As Pane";
_vvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
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
_vvvvvvvvvvvvvvvvvvv4 = _base;
 //BA.debugLineNum = 37;BA.debugLine="mBase.LoadLayout(\"CFMaterialAppBarUI\")";
_vvvvvvvvvvvvvvvvvvv4.LoadLayout(ba,"CFMaterialAppBarUI");
 //BA.debugLineNum = 40;BA.debugLine="setBg(CFStyleManager.DefaultTheme.Get(\"primary\"))";
_setvvvvvvvvvvvvvvvvvv2(BA.ObjectToString(_vvvvvvvvvvvvvvvvvvvv2._vvvvvvvvv6.Get((Object)("primary"))));
 //BA.debugLineNum = 41;BA.debugLine="TitleLabel.Font = CFStyleManager.SelectFont(\"Blac";
_titlelabel.setFont(_vvvvvvvvvvvvvvvvvvvv2._vvvvvvvvvv4("Black",14));
 //BA.debugLineNum = 43;BA.debugLine="setTitle(Props.Get(\"Title\"))";
_setvvvvvvvvvvvvvvvvvv1(BA.ObjectToString(_props.Get((Object)("Title"))));
 //BA.debugLineNum = 44;BA.debugLine="setEnableShadow(Props.Get(\"EnableShadow\"))";
_setvvvvvvvvvvvvvvvvvv5(BA.ObjectToBoolean(_props.Get((Object)("EnableShadow"))));
 //BA.debugLineNum = 46;BA.debugLine="setHideIcon(Props.Get(\"HideIcon\"))";
_setvvvvvvvvvvvvvvvvvv6(BA.ObjectToBoolean(_props.Get((Object)("HideIcon"))));
 //BA.debugLineNum = 47;BA.debugLine="setHideTitle(Props.Get(\"HideTitle\"))";
_setvvvvvvvvvvvvvvvvvv7(BA.ObjectToBoolean(_props.Get((Object)("HideTitle"))));
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _vvvvvvvvvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 58;BA.debugLine="Return mBase";
if (true) return _vvvvvvvvvvvvvvvvvvv4;
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public String  _getvvvvvvvvvvvvvvvvv7() throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Public Sub getIcon As String";
 //BA.debugLineNum = 119;BA.debugLine="Return InnerButton.Text";
if (true) return _innerbutton.getText();
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public boolean  _getvvvvvvvvvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Public Sub getShadowEnabled As Boolean";
 //BA.debugLineNum = 155;BA.debugLine="Return Label1.Visible";
if (true) return _label1.getVisible();
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return false;
}
public String  _getvvvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Public Sub getTitle As String";
 //BA.debugLineNum = 125;BA.debugLine="Return TitleLabel.Text";
if (true) return _titlelabel.getText();
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 30;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 31;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvvvvvv2 = _eventname;
 //BA.debugLineNum = 32;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvvvvvv3 = _callback;
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public String  _innerbutton_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Private Sub InnerButton_MousePressed (EventData As";
 //BA.debugLineNum = 161;BA.debugLine="InnerButton.RequestFocus 'set focus";
_innerbutton.RequestFocus();
 //BA.debugLineNum = 163;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MousePr";
__c.CallSubDelayed2(ba,_vvvvvvvvvvvvvvvvvvv3,_vvvvvvvvvvvvvvvvvvv2+"_MousePressed",(Object)(_eventdata));
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return "";
}
public String  _innerpane_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 167;BA.debugLine="Private Sub InnerPane_MousePressed (EventData As M";
 //BA.debugLineNum = 169;BA.debugLine="InnerPane.RequestFocus 'set focus";
_innerpane.RequestFocus();
 //BA.debugLineNum = 171;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_PaneMou";
__c.CallSubDelayed2(ba,_vvvvvvvvvvvvvvvvvvv3,_vvvvvvvvvvvvvvvvvvv2+"_PaneMousePressed",(Object)(_eventdata));
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 103;BA.debugLine="CFControlsUtils.removeEffect(Label1)";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvv2((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_label1.getObject())));
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv2(String _color) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Public Sub setBg(color As String)";
 //BA.debugLineNum = 69;BA.debugLine="CFControlsUtils.SetBG( Label1,  color)";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvv5((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_label1.getObject())),_color);
 //BA.debugLineNum = 70;BA.debugLine="CFControlsUtils.SetBG( InnerPane, color)";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvv5((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerpane.getObject())),_color);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvv6(String _color,int _width) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 83;BA.debugLine="CFControlsUtils.setBorder(Label1, color, width)";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvv6((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_label1.getObject())),_color,_width);
 //BA.debugLineNum = 84;BA.debugLine="CFControlsUtils.setBorder(InnerPane, color, width";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvv6((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerpane.getObject())),_color,_width);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv3(int _radius) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 90;BA.debugLine="CFControlsUtils.setBorderRadius(Label1, radius)";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvv0((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_label1.getObject())),_radius);
 //BA.debugLineNum = 91;BA.debugLine="CFControlsUtils.setBorderRadius(InnerPane, radius";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvv0((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerpane.getObject())),_radius);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv4(String _effect) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Public Sub setEffect(effect As String)";
 //BA.debugLineNum = 97;BA.debugLine="CFControlsUtils.setEffect(Label1, effect)";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvvv2((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_label1.getObject())),_effect);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv5(boolean _boolval) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Public Sub setEnableShadow(BoolVal As Boolean)";
 //BA.debugLineNum = 149;BA.debugLine="Label1.Visible = BoolVal";
_label1.setVisible(_boolval);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv6(boolean _boolval) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Public Sub setHideIcon(BoolVal As Boolean)";
 //BA.debugLineNum = 143;BA.debugLine="InnerButton.Visible = Not(BoolVal)";
_innerbutton.setVisible(__c.Not(_boolval));
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv7(boolean _boolval) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Public Sub setHideTitle(BoolVal As Boolean)";
 //BA.debugLineNum = 137;BA.debugLine="TitleLabel.Visible = Not(BoolVal)";
_titlelabel.setVisible(__c.Not(_boolval));
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvv7(String _icontext) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Public Sub setIcon(IconText As String)";
 //BA.debugLineNum = 112;BA.debugLine="InnerButton.Text = IconText";
_innerbutton.setText(_icontext);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv0(float _angle) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Public Sub setRotation(angle As Float)";
 //BA.debugLineNum = 76;BA.debugLine="CFControlsUtils.setRotation(Label1, angle) 'rotat";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvvv3((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_label1.getObject())),_angle);
 //BA.debugLineNum = 77;BA.debugLine="CFControlsUtils.setRotation(InnerPane , angle) 'r";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvvv3((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerpane.getObject())),_angle);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv1(String _title) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Public Sub setTitle(Title As String)";
 //BA.debugLineNum = 131;BA.debugLine="TitleLabel.Text = Title";
_titlelabel.setText(_title);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
