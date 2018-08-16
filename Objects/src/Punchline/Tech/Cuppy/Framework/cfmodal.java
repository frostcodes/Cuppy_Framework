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
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _mbase = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _modalpane = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _modalbgpane = null;
public b4j.example.cssutils _cssutils = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 39;BA.debugLine="ModalBgPane.PrefWidth = Width";
_modalbgpane.setPrefWidth(_width);
 //BA.debugLineNum = 40;BA.debugLine="ModalBgPane.PrefHeight =  Height";
_modalbgpane.setPrefHeight(_height);
 //BA.debugLineNum = 42;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 19;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 20;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 21;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Public ModalPane As Pane";
_modalpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Public ModalBgPane As Pane";
_modalbgpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 32;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 33;BA.debugLine="mBase.LoadLayout(\"CFModalUI\")";
_mbase.LoadLayout(ba,"CFModalUI");
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 47;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public void  _hide() throws Exception{
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
 //BA.debugLineNum = 112;BA.debugLine="mBase.SetAlphaAnimated(300, 0)";
parent._mbase.SetAlphaAnimated((int) (300),0);
 //BA.debugLineNum = 114;BA.debugLine="Wait For mBase_AnimationCompleted";
parent.__c.WaitFor("mbase_animationcompleted", ba, this, null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 116;BA.debugLine="ModalBgPane.Visible = False";
parent._modalbgpane.setVisible(parent.__c.False);
 //BA.debugLineNum = 117;BA.debugLine="ModalPane.Visible = False";
parent._modalpane.setVisible(parent.__c.False);
 //BA.debugLineNum = 119;BA.debugLine="mBase.SetSize(0, 0)";
parent._mbase.SetSize(0,0);
 //BA.debugLineNum = 120;BA.debugLine="mBase.Enabled = False";
parent._mbase.setEnabled(parent.__c.False);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _mbase_animationcompleted() throws Exception{
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 26;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 27;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 28;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _modalbgpane_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Private Sub ModalBgPane_MousePressed (EventData As";
 //BA.debugLineNum = 128;BA.debugLine="ModalPane.RequestFocus 'set focus";
_modalpane.RequestFocus();
 //BA.debugLineNum = 130;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ModalBG";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_ModalBGPressed",(Object)(_eventdata));
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public String  _modalbgpane_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub ModalBgPane_Resize (Width As Double, Height As";
 //BA.debugLineNum = 150;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_ModalBg";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_ModalBgPaneResize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return "";
}
public String  _modalpane_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Private Sub ModalPane_MousePressed (EventData As M";
 //BA.debugLineNum = 136;BA.debugLine="ModalPane.RequestFocus 'set focus";
_modalpane.RequestFocus();
 //BA.debugLineNum = 138;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ModalPr";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_ModalPressed",(Object)(_eventdata));
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public String  _modalpane_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub ModalPane_Resize (Width As Double, Height As D";
 //BA.debugLineNum = 144;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_ModalPa";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_ModalPaneResize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 88;BA.debugLine="CFControlsUtils.removePaneEffect(ModalPane)";
_cfcontrolsutils._removepaneeffect(_modalpane);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _setbg(String _color) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 56;BA.debugLine="CFControlsUtils.setPaneBG( ModalPane, color)";
_cfcontrolsutils._setpanebg(_modalpane,_color);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Public Sub SetBorder(color As String , width As In";
 //BA.debugLineNum = 68;BA.debugLine="CFControlsUtils.setPaneBorder(ModalPane, color, w";
_cfcontrolsutils._setpaneborder(_modalpane,_color,_width);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Public Sub SetBorderRadius(radius As Int)";
 //BA.debugLineNum = 75;BA.debugLine="CFControlsUtils.setPaneBorderRadius(ModalPane, ra";
_cfcontrolsutils._setpaneborderradius(_modalpane,_radius);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(String _effect) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Public Sub SetEffect(effect As String)";
 //BA.debugLineNum = 82;BA.debugLine="CFControlsUtils.setPaneEffect(ModalPane, effect)";
_cfcontrolsutils._setpaneeffect(_modalpane,_effect);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(float _angle) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Public Sub SetRotationX(angle As Float)";
 //BA.debugLineNum = 62;BA.debugLine="CFControlsUtils.setPaneRotationX(ModalPane, angle";
_cfcontrolsutils._setpanerotationx(_modalpane,_angle);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public String  _show() throws Exception{
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _parent = null;
 //BA.debugLineNum = 96;BA.debugLine="Public Sub Show";
 //BA.debugLineNum = 98;BA.debugLine="Dim Parent As Pane = GetBase.Parent";
_parent = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_parent.setObject((javafx.scene.layout.Pane)(_getbase().getParent().getObject()));
 //BA.debugLineNum = 100;BA.debugLine="mBase.Enabled = True";
_mbase.setEnabled(__c.True);
 //BA.debugLineNum = 101;BA.debugLine="mBase.Alpha = 1";
_mbase.setAlpha(1);
 //BA.debugLineNum = 103;BA.debugLine="ModalBgPane.Visible = True";
_modalbgpane.setVisible(__c.True);
 //BA.debugLineNum = 104;BA.debugLine="ModalPane.Visible = True";
_modalpane.setVisible(__c.True);
 //BA.debugLineNum = 106;BA.debugLine="mBase.SetLayoutAnimated(300, 0 , 0,  Parent.Width";
_mbase.SetLayoutAnimated((int) (300),0,0,_parent.getWidth(),_parent.getHeight());
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
