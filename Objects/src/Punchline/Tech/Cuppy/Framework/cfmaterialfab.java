package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmaterialfab extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmaterialfab", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.cfmaterialfab.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _vvvvvvvvvvvvvvvvvvv7 = null;
public String _vvvvvvvvvvvvvvvvvvv0 = "";
public Object _vvvvvvvvvvvvvvvvvvvv1 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _vvvvvvvvvvvvvvvvvvvv2 = null;
public anywheresoftware.b4j.objects.LabelWrapper _fab_btn = null;
public b4j.example.cssutils _vvvvvvvvvvvvvvvvvvvv3 = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _vvvvvvvvvvvvvvvvvvvv4 = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _vvvvvvvvvvvvvvvvvvvv5 = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _vvvvvvvvvvvvvvvvvvvv6 = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _vvvvvvvvvvvvvvvvvvvv7 = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _vvvvvvvvvvvvvvvvvvvv0 = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _vvvvvvvvvvvvvvvvvvvvv1 = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _vvvvvvvvvvvvvvvvvvvvv3 = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _vvvvvvvvvvvvvvvvvvvvv4 = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _vvvvvvvvvvvvvvvvvvvvv5 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 43;BA.debugLine="FAB_Btn.PrefWidth = Width";
_fab_btn.setPrefWidth(_width);
 //BA.debugLineNum = 44;BA.debugLine="FAB_Btn.PrefHeight = Width";
_fab_btn.setPrefHeight(_width);
 //BA.debugLineNum = 45;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,_vvvvvvvvvvvvvvvvvvvv1,_vvvvvvvvvvvvvvvvvvv0+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private fx As JFX";
_vvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 19;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvvvvvv0 = "";
 //BA.debugLineNum = 20;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvvvvvvv1 = new Object();
 //BA.debugLineNum = 21;BA.debugLine="Private mBase As Pane";
_vvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Public FAB_Btn As Label";
_fab_btn = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 31;BA.debugLine="mBase = Base";
_vvvvvvvvvvvvvvvvvvvv2 = _base;
 //BA.debugLineNum = 32;BA.debugLine="mBase.LoadLayout(\"CFMaterialFABUI\")";
_vvvvvvvvvvvvvvvvvvvv2.LoadLayout(ba,"CFMaterialFABUI");
 //BA.debugLineNum = 35;BA.debugLine="setBg(CFStyleManager.DefaultTheme.Get(\"accent\"))";
_setvvvvvvvvvvvvvvvvvv0(BA.ObjectToString(_vvvvvvvvvvvvvvvvvvvv0._vvvvvvvvv6.Get((Object)("accent"))));
 //BA.debugLineNum = 36;BA.debugLine="FAB_Btn.MouseCursor = fx.Cursors.HAND";
_fab_btn.setMouseCursor(_vvvvvvvvvvvvvvvvvvv7.Cursors.HAND);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public String  _fab_btn_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Private Sub FAB_Btn_MouseEntered (EventData As Mou";
 //BA.debugLineNum = 124;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEn";
__c.CallSubDelayed2(ba,_vvvvvvvvvvvvvvvvvvvv1,_vvvvvvvvvvvvvvvvvvv0+"_MouseEntered",(Object)(_eventdata));
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
public String  _fab_btn_mouseexited(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Private Sub FAB_Btn_MouseExited (EventData As Mous";
 //BA.debugLineNum = 130;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEx";
__c.CallSubDelayed2(ba,_vvvvvvvvvvvvvvvvvvvv1,_vvvvvvvvvvvvvvvvvvv0+"_MouseExited",(Object)(_eventdata));
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public String  _fab_btn_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Private Sub FAB_Btn_MousePressed (EventData As Mou";
 //BA.debugLineNum = 116;BA.debugLine="FAB_Btn.RequestFocus 'set focus";
_fab_btn.RequestFocus();
 //BA.debugLineNum = 118;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MousePr";
__c.CallSubDelayed2(ba,_vvvvvvvvvvvvvvvvvvvv1,_vvvvvvvvvvvvvvvvvvv0+"_MousePressed",(Object)(_eventdata));
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _vvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 50;BA.debugLine="Return mBase";
if (true) return _vvvvvvvvvvvvvvvvvvvv2;
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public String  _getvvvvvvvvvvvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Public Sub getIcon As String";
 //BA.debugLineNum = 107;BA.debugLine="Return FAB_Btn.Text";
if (true) return _fab_btn.getText();
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 25;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 26;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvvvvvv0 = _eventname;
 //BA.debugLineNum = 27;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvvvvvvv1 = _callback;
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvv7() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 85;BA.debugLine="CFControlsUtils.removeEffect(FAB_Btn)";
_vvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvv2((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_fab_btn.getObject())));
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv0(String _color) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Public Sub setBg(color As String)";
 //BA.debugLineNum = 60;BA.debugLine="CFControlsUtils.SetBG( FAB_Btn, color)";
_vvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvv5((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_fab_btn.getObject())),_color);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvv6(String _color,int _width) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 66;BA.debugLine="CFControlsUtils.setBorder(FAB_Btn, color, width)";
_vvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvv6((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_fab_btn.getObject())),_color,_width);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv1(int _radius) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 72;BA.debugLine="CFControlsUtils.setBorderRadius(FAB_Btn, radius)";
_vvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvv0((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_fab_btn.getObject())),_radius);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv2(String _effect) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Public Sub setEffect(effect As String)";
 //BA.debugLineNum = 79;BA.debugLine="CFControlsUtils.setEffect(FAB_Btn, effect)";
_vvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvvv2((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_fab_btn.getObject())),_effect);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv5(String _icontext) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Public Sub setIcon(IconText As String)";
 //BA.debugLineNum = 101;BA.debugLine="FAB_Btn.Text = IconText";
_fab_btn.setText(_icontext);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv6(float _angle) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Public Sub setRotation(angle As Float)";
 //BA.debugLineNum = 91;BA.debugLine="CFControlsUtils.setRotation(FAB_Btn, angle) 'rota";
_vvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvvv3((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_fab_btn.getObject())),_angle);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
