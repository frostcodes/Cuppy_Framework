package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmodal extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmodal", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.cfmodal.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _vvvvvvvvvvvvvvvvvvv7 = null;
public String _vvvvvvvvvvvvvvvvvvv0 = "";
public Object _vvvvvvvvvvvvvvvvvvvv1 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _vvvvvvvvvvvvvvvvvvvv2 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _modalpane = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _modalbgpane = null;
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
 //BA.debugLineNum = 48;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 50;BA.debugLine="ModalBgPane.PrefWidth = Width";
_modalbgpane.setPrefWidth(_width);
 //BA.debugLineNum = 51;BA.debugLine="ModalBgPane.PrefHeight =  Height";
_modalbgpane.setPrefHeight(_height);
 //BA.debugLineNum = 53;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,_vvvvvvvvvvvvvvvvvvvv1,_vvvvvvvvvvvvvvvvvvv0+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 29;BA.debugLine="Private fx As JFX";
_vvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 30;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvvvvvv0 = "";
 //BA.debugLineNum = 31;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvvvvvvv1 = new Object();
 //BA.debugLineNum = 32;BA.debugLine="Private mBase As Pane";
_vvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Public ModalPane As Pane";
_modalpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Public ModalBgPane As Pane";
_modalbgpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 43;BA.debugLine="mBase = Base";
_vvvvvvvvvvvvvvvvvvvv2 = _base;
 //BA.debugLineNum = 44;BA.debugLine="mBase.LoadLayout(\"CFModalUI\")";
_vvvvvvvvvvvvvvvvvvvv2.LoadLayout(ba,"CFModalUI");
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _vvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 58;BA.debugLine="Return mBase";
if (true) return _vvvvvvvvvvvvvvvvvvvv2;
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public void  _vvvvvvvvvvvvvvvvvvvvvvvvv2() throws Exception{
ResumableSub_Hide rsub = new ResumableSub_Hide(this);
rsub.resume(ba, null);
}
public static class ResumableSub_Hide extends BA.ResumableSub {
public ResumableSub_Hide(Punchline.Tech.Cuppy.Framework.cfmodal parent) {
this.parent = parent;
}
Punchline.Tech.Cuppy.Framework.cfmodal parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 123;BA.debugLine="mBase.SetAlphaAnimated(300, 0)";
parent._vvvvvvvvvvvvvvvvvvvv2.SetAlphaAnimated((int) (300),0);
 //BA.debugLineNum = 125;BA.debugLine="Wait For mBase_AnimationCompleted";
parent.__c.WaitFor("mbase_animationcompleted", ba, this, null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 127;BA.debugLine="ModalBgPane.Visible = False";
parent._modalbgpane.setVisible(parent.__c.False);
 //BA.debugLineNum = 128;BA.debugLine="ModalPane.Visible = False";
parent._modalpane.setVisible(parent.__c.False);
 //BA.debugLineNum = 130;BA.debugLine="mBase.SetSize(0, 0)";
parent._vvvvvvvvvvvvvvvvvvvv2.SetSize(0,0);
 //BA.debugLineNum = 131;BA.debugLine="mBase.Enabled = False";
parent._vvvvvvvvvvvvvvvvvvvv2.setEnabled(parent.__c.False);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
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
_vvvvvvvvvvvvvvvvvvv0 = _eventname;
 //BA.debugLineNum = 39;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvvvvvvv1 = _callback;
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public String  _modalbgpane_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Private Sub ModalBgPane_MousePressed (EventData As";
 //BA.debugLineNum = 139;BA.debugLine="ModalPane.RequestFocus 'set focus";
_modalpane.RequestFocus();
 //BA.debugLineNum = 141;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ModalBG";
__c.CallSubDelayed2(ba,_vvvvvvvvvvvvvvvvvvvv1,_vvvvvvvvvvvvvvvvvvv0+"_ModalBGPressed",(Object)(_eventdata));
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public String  _modalbgpane_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub ModalBgPane_Resize (Width As Double, Height As";
 //BA.debugLineNum = 161;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_ModalBg";
__c.CallSubDelayed3(ba,_vvvvvvvvvvvvvvvvvvvv1,_vvvvvvvvvvvvvvvvvvv0+"_ModalBgPaneResize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return "";
}
public String  _modalpane_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Private Sub ModalPane_MousePressed (EventData As M";
 //BA.debugLineNum = 147;BA.debugLine="ModalPane.RequestFocus 'set focus";
_modalpane.RequestFocus();
 //BA.debugLineNum = 149;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ModalPr";
__c.CallSubDelayed2(ba,_vvvvvvvvvvvvvvvvvvvv1,_vvvvvvvvvvvvvvvvvvv0+"_ModalPressed",(Object)(_eventdata));
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public String  _modalpane_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub ModalPane_Resize (Width As Double, Height As D";
 //BA.debugLineNum = 155;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_ModalPa";
__c.CallSubDelayed3(ba,_vvvvvvvvvvvvvvvvvvvv1,_vvvvvvvvvvvvvvvvvvv0+"_ModalPaneResize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvv7() throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 99;BA.debugLine="CFControlsUtils.RemoveEffect(ModalPane)";
_vvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvv2((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_modalpane.getObject())));
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv0(String _color) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Public Sub setBg(color As String)";
 //BA.debugLineNum = 67;BA.debugLine="CFControlsUtils.setBG( ModalPane, color)";
_vvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvv5((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_modalpane.getObject())),_color);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvv6(String _color,int _width) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 79;BA.debugLine="CFControlsUtils.setBorder(ModalPane, color, width";
_vvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvv6((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_modalpane.getObject())),_color,_width);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv1(int _radius) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 86;BA.debugLine="CFControlsUtils.setBorderRadius(ModalPane, radius";
_vvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvv0((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_modalpane.getObject())),_radius);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv2(String _effect) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Public Sub setEffect(effect As String)";
 //BA.debugLineNum = 93;BA.debugLine="CFControlsUtils.setEffect(ModalPane, effect)";
_vvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvvv2((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_modalpane.getObject())),_effect);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv6(float _angle) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Public Sub setRotation(angle As Float)";
 //BA.debugLineNum = 73;BA.debugLine="CFControlsUtils.setRotation(ModalPane, angle) 'ro";
_vvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvvv3((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_modalpane.getObject())),_angle);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvv3() throws Exception{
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _parent = null;
 //BA.debugLineNum = 107;BA.debugLine="Public Sub Show";
 //BA.debugLineNum = 109;BA.debugLine="Dim Parent As Pane = GetBase.Parent";
_parent = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_parent.setObject((javafx.scene.layout.Pane)(_vvvvvvvvvvvvvvvvv3().getParent().getObject()));
 //BA.debugLineNum = 111;BA.debugLine="mBase.Enabled = True";
_vvvvvvvvvvvvvvvvvvvv2.setEnabled(__c.True);
 //BA.debugLineNum = 112;BA.debugLine="mBase.Alpha = 1";
_vvvvvvvvvvvvvvvvvvvv2.setAlpha(1);
 //BA.debugLineNum = 114;BA.debugLine="ModalBgPane.Visible = True";
_modalbgpane.setVisible(__c.True);
 //BA.debugLineNum = 115;BA.debugLine="ModalPane.Visible = True";
_modalpane.setVisible(__c.True);
 //BA.debugLineNum = 117;BA.debugLine="mBase.SetLayoutAnimated(300, 0 , 0,  Parent.Width";
_vvvvvvvvvvvvvvvvvvvv2.SetLayoutAnimated((int) (300),0,0,_parent.getWidth(),_parent.getHeight());
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
