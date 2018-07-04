package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class materialbutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.materialbutton", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.materialbutton.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _mbase = null;
public anywheresoftware.b4j.objects.ButtonWrapper _innerbutton = null;
public b4j.example.cssutils _cssutils = null;
public Punchline.Tech.Cuppy.Framework.main _main = null;
public Punchline.Tech.Cuppy.Framework.configs _configs = null;
public Punchline.Tech.Cuppy.Framework.stringutility _stringutility = null;
public Punchline.Tech.Cuppy.Framework.mathutility _mathutility = null;
public Punchline.Tech.Cuppy.Framework.datatypeutility _datatypeutility = null;
public Punchline.Tech.Cuppy.Framework.stylemanager _stylemanager = null;
public Punchline.Tech.Cuppy.Framework.apputility _apputility = null;
public Punchline.Tech.Cuppy.Framework.controlsutils _controlsutils = null;
public Punchline.Tech.Cuppy.Framework.fileutility _fileutility = null;
public Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public String  _base_resize(Punchline.Tech.Cuppy.Framework.materialbutton __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialbutton";
if (Debug.shouldDelegate(ba, "base_resize"))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="InnerButton.PrefWidth = Width";
__ref._innerbutton.setPrefWidth(_width);
RDebugUtils.currentLine=8716291;
 //BA.debugLineNum = 8716291;BA.debugLine="InnerButton.PrefHeight =  Height";
__ref._innerbutton.setPrefHeight(_height);
RDebugUtils.currentLine=8716293;
 //BA.debugLineNum = 8716293;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(Punchline.Tech.Cuppy.Framework.materialbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialbutton";
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=8519685;
 //BA.debugLineNum = 8519685;BA.debugLine="Public InnerButton As Button";
_innerbutton = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=8519686;
 //BA.debugLineNum = 8519686;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Punchline.Tech.Cuppy.Framework.materialbutton __ref,anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialbutton";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="mBase.LoadLayout(\"MaterialButtonLayout\")";
__ref._mbase.LoadLayout(ba,"MaterialButtonLayout");
RDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="SetBg(StyleManager.DefaultTheme.Get(\"accent\"))";
__ref._setbg(null,BA.ObjectToString(_stylemanager._defaulttheme.Get((Object)("accent"))));
RDebugUtils.currentLine=8650757;
 //BA.debugLineNum = 8650757;BA.debugLine="InnerButton.Font = StyleManager.DefaultFont";
__ref._innerbutton.setFont(_stylemanager._defaultfont);
RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="End Sub";
return "";
}
public String  _setbg(Punchline.Tech.Cuppy.Framework.materialbutton __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialbutton";
if (Debug.shouldDelegate(ba, "setbg"))
	 {return ((String) Debug.delegate(ba, "setbg", new Object[] {_color}));}
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Public Sub SetBg(color As String)";
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="CSSUtils.SetStyleProperty( InnerButton, \"-fx-back";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._innerbutton.getObject())),"-fx-background-color",_color);
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase(Punchline.Tech.Cuppy.Framework.materialbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialbutton";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Public Sub GetBase As Pane";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="End Sub";
return null;
}
public String  _initialize(Punchline.Tech.Cuppy.Framework.materialbutton __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="materialbutton";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="mCallBack = Callback";
__ref._mcallback = _callback;
RDebugUtils.currentLine=8585219;
 //BA.debugLineNum = 8585219;BA.debugLine="End Sub";
return "";
}
public String  _innerbutton_mousepressed(Punchline.Tech.Cuppy.Framework.materialbutton __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialbutton";
if (Debug.shouldDelegate(ba, "innerbutton_mousepressed"))
	 {return ((String) Debug.delegate(ba, "innerbutton_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Public Sub InnerButton_MousePressed (EventData As";
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MousePr";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_MousePressed",(Object)(_eventdata));
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects(Punchline.Tech.Cuppy.Framework.materialbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialbutton";
if (Debug.shouldDelegate(ba, "removeeffects"))
	 {return ((String) Debug.delegate(ba, "removeeffects", null));}
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Public Sub removeEffects()";
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="ControlsUtils.removeEffect(InnerButton)";
_controlsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(__ref._innerbutton.getObject())));
RDebugUtils.currentLine=9175044;
 //BA.debugLineNum = 9175044;BA.debugLine="End Sub";
return "";
}
public String  _setborder(Punchline.Tech.Cuppy.Framework.materialbutton __ref,String _color,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialbutton";
if (Debug.shouldDelegate(ba, "setborder"))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_color,_width}));}
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Public Sub setBorder(color As String , width As In";
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="ControlsUtils.setBorder(InnerButton, color, width";
_controlsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(__ref._innerbutton.getObject())),_color,_width);
RDebugUtils.currentLine=8978436;
 //BA.debugLineNum = 8978436;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(Punchline.Tech.Cuppy.Framework.materialbutton __ref,int _radius) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialbutton";
if (Debug.shouldDelegate(ba, "setborderradius"))
	 {return ((String) Debug.delegate(ba, "setborderradius", new Object[] {_radius}));}
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="ControlsUtils.setBorderRadius(InnerButton, radius";
_controlsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(__ref._innerbutton.getObject())),_radius);
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(Punchline.Tech.Cuppy.Framework.materialbutton __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialbutton";
if (Debug.shouldDelegate(ba, "seteffect"))
	 {return ((String) Debug.delegate(ba, "seteffect", new Object[] {_effect}));}
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Public Sub setEffect(effect As String)";
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="ControlsUtils.setEffect(InnerButton, effect)";
_controlsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(__ref._innerbutton.getObject())),_effect);
RDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(Punchline.Tech.Cuppy.Framework.materialbutton __ref,float _angle) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialbutton";
if (Debug.shouldDelegate(ba, "setrotationx"))
	 {return ((String) Debug.delegate(ba, "setrotationx", new Object[] {_angle}));}
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Public Sub setRotationX(angle As Float)";
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="ControlsUtils.setRotationX(InnerButton, angle) 'r";
_controlsutils._setrotationx((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(__ref._innerbutton.getObject())),_angle);
RDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="End Sub";
return "";
}
}