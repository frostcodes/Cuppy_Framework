package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmateriallabel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmateriallabel", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.cfmateriallabel.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _vvvvvvvvvvvvvvvvvvv1 = null;
public String _vvvvvvvvvvvvvvvvvvv2 = "";
public Object _vvvvvvvvvvvvvvvvvvv3 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _vvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4j.objects.LabelWrapper _innerlabel = null;
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
 //BA.debugLineNum = 38;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 40;BA.debugLine="InnerLabel.PrefWidth = Width";
_innerlabel.setPrefWidth(_width);
 //BA.debugLineNum = 41;BA.debugLine="InnerLabel.PrefHeight =  Height";
_innerlabel.setPrefHeight(_height);
 //BA.debugLineNum = 43;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,_vvvvvvvvvvvvvvvvvvv3,_vvvvvvvvvvvvvvvvvvv2+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 14;BA.debugLine="Private fx As JFX";
_vvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 15;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvvvvvv2 = "";
 //BA.debugLineNum = 16;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvvvvvv3 = new Object();
 //BA.debugLineNum = 17;BA.debugLine="Private mBase As Pane";
_vvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Public InnerLabel As Label";
_innerlabel = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 27;BA.debugLine="mBase = Base";
_vvvvvvvvvvvvvvvvvvv4 = _base;
 //BA.debugLineNum = 28;BA.debugLine="mBase.LoadLayout(\"CFMaterialLabelUI\")";
_vvvvvvvvvvvvvvvvvvv4.LoadLayout(ba,"CFMaterialLabelUI");
 //BA.debugLineNum = 31;BA.debugLine="SetTextColor(CFStyleManager.DefaultTheme.Get(\"pri";
_setvvvvvvvvvvvvvvvvvvvvvvvvv1(BA.ObjectToString(_vvvvvvvvvvvvvvvvvvvv2._vvvvvvvvv6.Get((Object)("primary_text"))));
 //BA.debugLineNum = 32;BA.debugLine="InnerLabel.Font = CFStyleManager.SelectFont(\"Ligh";
_innerlabel.setFont(_vvvvvvvvvvvvvvvvvvvv2._vvvvvvvvvv4("Light",12));
 //BA.debugLineNum = 35;BA.debugLine="setText(Props.Get(\"Text\"))";
_setvvvvvvvvvvvvvvvvvvvvvvvvv4(BA.ObjectToString(_props.Get((Object)("Text"))));
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _vvvvvvvvvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 48;BA.debugLine="Return mBase";
if (true) return _vvvvvvvvvvvvvvvvvvv4;
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public String  _getvvvvvvvvvvvvvvvvvvvvvvvvv4() throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Public Sub getText() As String";
 //BA.debugLineNum = 109;BA.debugLine="Return InnerLabel.Text";
if (true) return _innerlabel.getText();
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 22;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvvvvvv2 = _eventname;
 //BA.debugLineNum = 23;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvvvvvv3 = _callback;
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _innerlabel_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Private Sub InnerLabel_MousePressed (EventData As";
 //BA.debugLineNum = 116;BA.debugLine="InnerLabel.RequestFocus 'set focus";
_innerlabel.RequestFocus();
 //BA.debugLineNum = 117;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MousePr";
__c.CallSubDelayed2(ba,_vvvvvvvvvvvvvvvvvvv3,_vvvvvvvvvvvvvvvvvvv2+"_MousePressed",(Object)(_eventdata));
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 94;BA.debugLine="CFControlsUtils.removeEffect(InnerLabel)";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvv2((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerlabel.getObject())));
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv2(String _color) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Public Sub setBg(color As String)";
 //BA.debugLineNum = 57;BA.debugLine="CFControlsUtils.SetBg( InnerLabel, color)";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvv5((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerlabel.getObject())),_color);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvv6(String _color,int _width) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 75;BA.debugLine="CFControlsUtils.setBorder(InnerLabel, color, widt";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvv6((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerlabel.getObject())),_color,_width);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv3(int _radius) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 81;BA.debugLine="CFControlsUtils.setBorderRadius(InnerLabel, radiu";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvv0((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerlabel.getObject())),_radius);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv4(String _effect) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Public Sub setEffect(effect As String)";
 //BA.debugLineNum = 88;BA.debugLine="CFControlsUtils.setEffect(InnerLabel, effect)";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvvv2((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerlabel.getObject())),_effect);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv0(float _angle) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Public Sub setRotation(angle As Float)";
 //BA.debugLineNum = 69;BA.debugLine="CFControlsUtils.setRotation(InnerLabel, angle) 'r";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvvv3((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerlabel.getObject())),_angle);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvv4(String _text) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Public Sub setText(Text As String)";
 //BA.debugLineNum = 103;BA.debugLine="InnerLabel.Text = Text";
_innerlabel.setText(_text);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvv1(String _color) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Public Sub setTextColor(color As String)";
 //BA.debugLineNum = 63;BA.debugLine="CFControlsUtils.setTextColor (InnerLabel, color)";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvvv4((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerlabel.getObject())),_color);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
