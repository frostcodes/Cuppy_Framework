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
public Punchline.Tech.Cuppy.Framework.cfanimationmanager _cfanimationmanager = null;
public Punchline.Tech.Cuppy.Framework.cflicensemanager _cflicensemanager = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public Punchline.Tech.Cuppy.Framework.cfhtmlutility _cfhtmlutility = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 35;BA.debugLine="ModalBgPane.PrefWidth = Width";
_modalbgpane.setPrefWidth(_width);
 //BA.debugLineNum = 36;BA.debugLine="ModalBgPane.PrefHeight =  Height";
_modalbgpane.setPrefHeight(_height);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 13;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 14;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 15;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Public ModalPane As Pane";
_modalpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Public ModalBgPane As Pane";
_modalbgpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 26;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 27;BA.debugLine="mBase.LoadLayout(\"CFModalUI\")";
_mbase.LoadLayout(ba,"CFModalUI");
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 41;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 21;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 22;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _modalbgpane_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Private Sub ModalBgPane_MousePressed (EventData As";
 //BA.debugLineNum = 105;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ModalBG";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_ModalBGPressed",(Object)(_eventdata));
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public String  _modalpane_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Private Sub ModalPane_MousePressed (EventData As M";
 //BA.debugLineNum = 111;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ModalPr";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_ModalPressed",(Object)(_eventdata));
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 82;BA.debugLine="CFControlsUtils.removePaneEffect(ModalPane)";
_cfcontrolsutils._removepaneeffect(_modalpane);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public String  _setbg(String _color) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 50;BA.debugLine="CFControlsUtils.setPaneBG( ModalPane, color)";
_cfcontrolsutils._setpanebg(_modalpane,_color);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Public Sub SetBorder(color As String , width As In";
 //BA.debugLineNum = 62;BA.debugLine="CFControlsUtils.setPaneBorder(ModalPane, color, w";
_cfcontrolsutils._setpaneborder(_modalpane,_color,_width);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Public Sub SetBorderRadius(radius As Int)";
 //BA.debugLineNum = 69;BA.debugLine="CFControlsUtils.setPaneBorderRadius(ModalPane, ra";
_cfcontrolsutils._setpaneborderradius(_modalpane,_radius);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(String _effect) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Public Sub SetEffect(effect As String)";
 //BA.debugLineNum = 76;BA.debugLine="CFControlsUtils.setPaneEffect(ModalPane, effect)";
_cfcontrolsutils._setpaneeffect(_modalpane,_effect);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(float _angle) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Public Sub SetRotationX(angle As Float)";
 //BA.debugLineNum = 56;BA.debugLine="CFControlsUtils.setPaneRotationX(ModalPane, angle";
_cfcontrolsutils._setpanerotationx(_modalpane,_angle);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _show() throws Exception{
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _parent = null;
 //BA.debugLineNum = 90;BA.debugLine="Public Sub Show";
 //BA.debugLineNum = 92;BA.debugLine="Dim Parent As Pane = GetBase.Parent";
_parent = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_parent.setObject((javafx.scene.layout.Pane)(_getbase().getParent().getObject()));
 //BA.debugLineNum = 94;BA.debugLine="ModalBgPane.Visible = True";
_modalbgpane.setVisible(__c.True);
 //BA.debugLineNum = 95;BA.debugLine="ModalPane.Visible = True";
_modalpane.setVisible(__c.True);
 //BA.debugLineNum = 97;BA.debugLine="mBase.SetLayoutAnimated(300, 0 , 0,  Parent.Width";
_mbase.SetLayoutAnimated((int) (300),0,0,_parent.getWidth(),_parent.getHeight());
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
