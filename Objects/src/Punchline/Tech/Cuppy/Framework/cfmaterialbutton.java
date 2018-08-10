package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmaterialbutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmaterialbutton", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.cfmaterialbutton.class).invoke(this, new Object[] {null});
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
 //BA.debugLineNum = 38;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 40;BA.debugLine="InnerButton.PrefWidth = Width";
_innerbutton.setPrefWidth(_width);
 //BA.debugLineNum = 41;BA.debugLine="InnerButton.PrefHeight =  Height";
_innerbutton.setPrefHeight(_height);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 14;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 15;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 16;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 17;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Public InnerButton As Button";
_innerbutton = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 29;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 30;BA.debugLine="mBase.LoadLayout(\"CFMaterialButtonUI\")";
_mbase.LoadLayout(ba,"CFMaterialButtonUI");
 //BA.debugLineNum = 32;BA.debugLine="SetBg(CFStyleManager.DefaultTheme.Get(\"accent\"))";
_setbg(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("accent"))));
 //BA.debugLineNum = 33;BA.debugLine="InnerButton.Font = CFStyleManager.DefaultFont";
_innerbutton.setFont(_cfstylemanager._defaultfont);
 //BA.debugLineNum = 34;BA.debugLine="InnerButton.MouseCursor = fx.Cursors.HAND";
_innerbutton.setMouseCursor(_fx.Cursors.HAND);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 46;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 22;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 23;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 24;BA.debugLine="CFStyleManager.ActiveControls.add(Me)";
_cfstylemanager._activecontrols.Add(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _innerbutton_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub InnerButton_MouseEntered (EventData As MouseEv";
 //BA.debugLineNum = 102;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEn";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MouseEntered",(Object)(_eventdata));
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public String  _innerbutton_mouseexited(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub InnerButton_MouseExited (EventData As MouseEve";
 //BA.debugLineNum = 108;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEx";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MouseExited",(Object)(_eventdata));
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public String  _innerbutton_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Public Sub InnerButton_MousePressed (EventData As";
 //BA.debugLineNum = 96;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MousePr";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MousePressed",(Object)(_eventdata));
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Public Sub removeEffects()";
 //BA.debugLineNum = 87;BA.debugLine="CFControlsUtils.removeEffect(InnerButton)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_innerbutton.getObject())));
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public String  _setbg(String _color) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 55;BA.debugLine="CSSUtils.SetStyleProperty( InnerButton, \"-fx-back";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innerbutton.getObject())),"-fx-background-color",_color);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 67;BA.debugLine="CFControlsUtils.setBorder(InnerButton, color, wid";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_innerbutton.getObject())),_color,_width);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 74;BA.debugLine="CFControlsUtils.setBorderRadius(InnerButton, radi";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_innerbutton.getObject())),_radius);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(String _effect) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Public Sub setEffect(effect As String)";
 //BA.debugLineNum = 81;BA.debugLine="CFControlsUtils.setEffect(InnerButton, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_innerbutton.getObject())),_effect);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(float _angle) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Public Sub setRotationX(angle As Float)";
 //BA.debugLineNum = 61;BA.debugLine="CFControlsUtils.setRotationX(InnerButton, angle)";
_cfcontrolsutils._setrotationx((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_innerbutton.getObject())),_angle);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
