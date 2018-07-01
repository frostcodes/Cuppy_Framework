package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class modal extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.modal", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.modal.class).invoke(this, new Object[] {null});
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
public Punchline.Tech.Cuppy.Framework.configs _configs = null;
public Punchline.Tech.Cuppy.Framework.stylemanager _stylemanager = null;
public Punchline.Tech.Cuppy.Framework.cuppyglobals _cuppyglobals = null;
public Punchline.Tech.Cuppy.Framework.stringutility _stringutility = null;
public Punchline.Tech.Cuppy.Framework.mathutility _mathutility = null;
public Punchline.Tech.Cuppy.Framework.datatypeutility _datatypeutility = null;
public Punchline.Tech.Cuppy.Framework.controlsutils _controlsutils = null;
public Punchline.Tech.Cuppy.Framework.componentsmanager _componentsmanager = null;
public Punchline.Tech.Cuppy.Framework.fileutility _fileutility = null;
public Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public Punchline.Tech.Cuppy.Framework.apputility _apputility = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 33;BA.debugLine="ModalBgPane.PrefWidth = Width";
_modalbgpane.setPrefWidth(_width);
 //BA.debugLineNum = 34;BA.debugLine="ModalBgPane.PrefHeight =  Height";
_modalbgpane.setPrefHeight(_height);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 11;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 12;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 13;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Public ModalPane As Pane";
_modalpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Public ModalBgPane As Pane";
_modalbgpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 24;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 25;BA.debugLine="mBase.LoadLayout(\"ModalLayout\")";
_mbase.LoadLayout(ba,"ModalLayout");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 39;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 19;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 20;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public String  _innerlabel_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Public Sub InnerLabel_MousePressed (EventData As M";
 //BA.debugLineNum = 101;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MousePr";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MousePressed",(Object)(_eventdata));
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public String  _modalbgpane_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub ModalBgPane_MousePressed (EventData As MouseEv";
 //BA.debugLineNum = 109;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ModalBG";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_ModalBGPressed",(Object)(_eventdata));
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public String  _modalpane_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub ModalPane_MousePressed (EventData As MouseEven";
 //BA.debugLineNum = 115;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ModalPr";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_ModalPressed",(Object)(_eventdata));
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Public Sub removeEffects()";
 //BA.debugLineNum = 80;BA.debugLine="ControlsUtils.removePaneEffect(ModalPane)";
_controlsutils._removepaneeffect(_modalpane);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public String  _setbg(String _color) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 48;BA.debugLine="ControlsUtils.setPaneBG( ModalPane, color)";
_controlsutils._setpanebg(_modalpane,_color);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 60;BA.debugLine="ControlsUtils.setPaneBorder(ModalPane, color, wid";
_controlsutils._setpaneborder(_modalpane,_color,_width);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 67;BA.debugLine="ControlsUtils.setPaneBorderRadius(ModalPane, radi";
_controlsutils._setpaneborderradius(_modalpane,_radius);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(String _effect) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Public Sub setEffect(effect As String)";
 //BA.debugLineNum = 74;BA.debugLine="ControlsUtils.setPaneEffect(ModalPane, effect)";
_controlsutils._setpaneeffect(_modalpane,_effect);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(float _angle) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Public Sub setRotationX(angle As Float)";
 //BA.debugLineNum = 54;BA.debugLine="ControlsUtils.setPaneRotationX(ModalPane, angle)";
_controlsutils._setpanerotationx(_modalpane,_angle);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public String  _show() throws Exception{
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _parent = null;
 //BA.debugLineNum = 89;BA.debugLine="Public Sub show";
 //BA.debugLineNum = 91;BA.debugLine="Dim Parent As Pane = mBase.Parent";
_parent = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_parent.setObject((javafx.scene.layout.Pane)(_mbase.getParent().getObject()));
 //BA.debugLineNum = 92;BA.debugLine="mBase.SetLayoutAnimated(300, 0 , 0,  Parent.PrefW";
_mbase.SetLayoutAnimated((int) (300),0,0,_parent.getPrefWidth(),_parent.getPrefHeight());
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
