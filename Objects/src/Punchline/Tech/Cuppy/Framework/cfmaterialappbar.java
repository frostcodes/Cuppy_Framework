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
public anywheresoftware.b4j.objects.JFX _vvvvvvvvvvvvvvvv2 = null;
public String _vvvvvvvvvvvvvvvvvvv3 = "";
public Object _vvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _vvvvvvvvvvvvvvvvvvv5 = null;
public anywheresoftware.b4j.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _innerpane = null;
public b4j.example.cssutils _vvvvvvvvvvvvvvvv3 = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _vvvvvvvvvvvvvvvv4 = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _vvvvvvvvvvvvvvvv5 = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _vvvvvvvvvvvvvvvv6 = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _vvvvvvvvvvvvvvvv7 = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _vvvvvvvvvvvvvvvv0 = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _vvvvvvvvvvvvvvvvv1 = null;
public Punchline.Tech.Cuppy.Framework.cfanimationmanager _vvvvvvvvvvvvvvvvv2 = null;
public Punchline.Tech.Cuppy.Framework.cflicensemanager _vvvvvvvvvvvvvvvvv3 = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _vvvvvvvvvvvvvvvvv4 = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _vvvvvvvvvvvvvvvvv5 = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _vvvvvvvvvvvvvvvvv6 = null;
public Punchline.Tech.Cuppy.Framework.cfhtmlutility _vvvvvvvvvvvvvvvvv7 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private fx As JFX";
_vvvvvvvvvvvvvvvv2 = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 13;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvvvvvv3 = "";
 //BA.debugLineNum = 14;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvvvvvv4 = new Object();
 //BA.debugLineNum = 15;BA.debugLine="Private mBase As Pane";
_vvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Public InnerPane As Pane";
_innerpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 26;BA.debugLine="mBase = Base";
_vvvvvvvvvvvvvvvvvvv5 = _base;
 //BA.debugLineNum = 27;BA.debugLine="mBase.LoadLayout(\"CFMaterialAppBarUI\")";
_vvvvvvvvvvvvvvvvvvv5.LoadLayout(ba,"CFMaterialAppBarUI");
 //BA.debugLineNum = 29;BA.debugLine="SetBg(CFStyleManager.DefaultTheme.Get(\"primary\"))";
_vvvvvvvvvvvvvv7(BA.ObjectToString(_vvvvvvvvvvvvvvvv5._vv5.Get((Object)("primary"))));
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _vvvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 38;BA.debugLine="Return mBase";
if (true) return _vvvvvvvvvvvvvvvvvvv5;
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvvvvvvvvvvvv0(String _icontext) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Public Sub Icon(IconText As String)";
 //BA.debugLineNum = 92;BA.debugLine="Label1.Text = IconText";
_label1.setText(_icontext);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 21;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvvvvvv3 = _eventname;
 //BA.debugLineNum = 22;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvvvvvv4 = _callback;
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _innerbutton_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub InnerButton_MousePressed (EventData As MouseEv";
 //BA.debugLineNum = 98;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MousePr";
__c.CallSubDelayed2(ba,_vvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvv3+"_MousePressed",(Object)(_eventdata));
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public String  _innerpane_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub InnerPane_MousePressed (EventData As MouseEven";
 //BA.debugLineNum = 104;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_PaneMou";
__c.CallSubDelayed2(ba,_vvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvv3+"_PaneMousePressed",(Object)(_eventdata));
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Public Sub removeEffects()";
 //BA.debugLineNum = 83;BA.debugLine="CFControlsUtils.removeEffect(Label1)";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvv3((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_label1.getObject())));
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvv7(String _color) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 49;BA.debugLine="CSSUtils.SetStyleProperty( Label1, \"-fx-backgroun";
_vvvvvvvvvvvvvvvv3._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_label1.getObject())),"-fx-background-color",_color);
 //BA.debugLineNum = 50;BA.debugLine="CSSUtils.SetStyleProperty( InnerPane, \"-fx-backgr";
_vvvvvvvvvvvvvvvv3._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerpane.getObject())),"-fx-background-color",_color);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvv0(String _color,int _width) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 63;BA.debugLine="CFControlsUtils.setBorder(Label1, color, width)";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvv0((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_label1.getObject())),_color,_width);
 //BA.debugLineNum = 64;BA.debugLine="CFControlsUtils.setPaneBorder(InnerPane, color, w";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvv4(_innerpane,_color,_width);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv6(int _radius) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 70;BA.debugLine="CFControlsUtils.setBorderRadius(Label1, radius)";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvv1((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_label1.getObject())),_radius);
 //BA.debugLineNum = 71;BA.debugLine="CFControlsUtils.setPaneBorderRadius(InnerPane, ra";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvv5(_innerpane,_radius);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv1(String _effect) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Public Sub setPaneEffect(effect As String)";
 //BA.debugLineNum = 77;BA.debugLine="CFControlsUtils.setEffect(Label1, effect)";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvv2((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_label1.getObject())),_effect);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv2(float _angle) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Public Sub setRotationX(angle As Float)";
 //BA.debugLineNum = 56;BA.debugLine="CFControlsUtils.setRotationX(Label1, angle) 'rota";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvv0((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_label1.getObject())),_angle);
 //BA.debugLineNum = 57;BA.debugLine="CFControlsUtils.setPaneRotationX(InnerPane , angl";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvv7(_innerpane,_angle);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
