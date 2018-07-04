package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class modal extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.modal", this);
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
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _modalpane = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _modalbgpane = null;
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
public String  _base_resize(Punchline.Tech.Cuppy.Framework.modal __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="modal";
if (Debug.shouldDelegate(ba, "base_resize"))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="ModalBgPane.PrefWidth = Width";
__ref._modalbgpane.setPrefWidth(_width);
RDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="ModalBgPane.PrefHeight =  Height";
__ref._modalbgpane.setPrefHeight(_height);
RDebugUtils.currentLine=11206661;
 //BA.debugLineNum = 11206661;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(Punchline.Tech.Cuppy.Framework.modal __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="modal";
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=11010051;
 //BA.debugLineNum = 11010051;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=11010053;
 //BA.debugLineNum = 11010053;BA.debugLine="Public ModalPane As Pane";
_modalpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=11010054;
 //BA.debugLineNum = 11010054;BA.debugLine="Public ModalBgPane As Pane";
_modalbgpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=11010055;
 //BA.debugLineNum = 11010055;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Punchline.Tech.Cuppy.Framework.modal __ref,anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="modal";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="mBase.LoadLayout(\"ModalLayout\")";
__ref._mbase.LoadLayout(ba,"ModalLayout");
RDebugUtils.currentLine=11141126;
 //BA.debugLineNum = 11141126;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase(Punchline.Tech.Cuppy.Framework.modal __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="modal";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Public Sub GetBase As Pane";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="End Sub";
return null;
}
public String  _initialize(Punchline.Tech.Cuppy.Framework.modal __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="modal";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=11075585;
 //BA.debugLineNum = 11075585;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="mCallBack = Callback";
__ref._mcallback = _callback;
RDebugUtils.currentLine=11075587;
 //BA.debugLineNum = 11075587;BA.debugLine="End Sub";
return "";
}
public String  _modalbgpane_mousepressed(Punchline.Tech.Cuppy.Framework.modal __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="modal";
if (Debug.shouldDelegate(ba, "modalbgpane_mousepressed"))
	 {return ((String) Debug.delegate(ba, "modalbgpane_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Sub ModalBgPane_MousePressed (EventData As MouseEv";
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ModalBG";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_ModalBGPressed",(Object)(_eventdata));
RDebugUtils.currentLine=11796484;
 //BA.debugLineNum = 11796484;BA.debugLine="End Sub";
return "";
}
public String  _modalpane_mousepressed(Punchline.Tech.Cuppy.Framework.modal __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="modal";
if (Debug.shouldDelegate(ba, "modalpane_mousepressed"))
	 {return ((String) Debug.delegate(ba, "modalpane_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Sub ModalPane_MousePressed (EventData As MouseEven";
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ModalPr";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_ModalPressed",(Object)(_eventdata));
RDebugUtils.currentLine=11862020;
 //BA.debugLineNum = 11862020;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects(Punchline.Tech.Cuppy.Framework.modal __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="modal";
if (Debug.shouldDelegate(ba, "removeeffects"))
	 {return ((String) Debug.delegate(ba, "removeeffects", null));}
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Public Sub removeEffects()";
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="ControlsUtils.removePaneEffect(ModalPane)";
_controlsutils._removepaneeffect(__ref._modalpane);
RDebugUtils.currentLine=11665412;
 //BA.debugLineNum = 11665412;BA.debugLine="End Sub";
return "";
}
public String  _setbg(Punchline.Tech.Cuppy.Framework.modal __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="modal";
if (Debug.shouldDelegate(ba, "setbg"))
	 {return ((String) Debug.delegate(ba, "setbg", new Object[] {_color}));}
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Public Sub SetBg(color As String)";
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="ControlsUtils.setPaneBG( ModalPane, color)";
_controlsutils._setpanebg(__ref._modalpane,_color);
RDebugUtils.currentLine=11337732;
 //BA.debugLineNum = 11337732;BA.debugLine="End Sub";
return "";
}
public String  _setborder(Punchline.Tech.Cuppy.Framework.modal __ref,String _color,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="modal";
if (Debug.shouldDelegate(ba, "setborder"))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_color,_width}));}
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Public Sub setBorder(color As String , width As In";
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="ControlsUtils.setPaneBorder(ModalPane, color, wid";
_controlsutils._setpaneborder(__ref._modalpane,_color,_width);
RDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(Punchline.Tech.Cuppy.Framework.modal __ref,int _radius) throws Exception{
__ref = this;
RDebugUtils.currentModule="modal";
if (Debug.shouldDelegate(ba, "setborderradius"))
	 {return ((String) Debug.delegate(ba, "setborderradius", new Object[] {_radius}));}
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="ControlsUtils.setPaneBorderRadius(ModalPane, radi";
_controlsutils._setpaneborderradius(__ref._modalpane,_radius);
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(Punchline.Tech.Cuppy.Framework.modal __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="modal";
if (Debug.shouldDelegate(ba, "seteffect"))
	 {return ((String) Debug.delegate(ba, "seteffect", new Object[] {_effect}));}
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Public Sub setEffect(effect As String)";
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="ControlsUtils.setPaneEffect(ModalPane, effect)";
_controlsutils._setpaneeffect(__ref._modalpane,_effect);
RDebugUtils.currentLine=11599876;
 //BA.debugLineNum = 11599876;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(Punchline.Tech.Cuppy.Framework.modal __ref,float _angle) throws Exception{
__ref = this;
RDebugUtils.currentModule="modal";
if (Debug.shouldDelegate(ba, "setrotationx"))
	 {return ((String) Debug.delegate(ba, "setrotationx", new Object[] {_angle}));}
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Public Sub setRotationX(angle As Float)";
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="ControlsUtils.setPaneRotationX(ModalPane, angle)";
_controlsutils._setpanerotationx(__ref._modalpane,_angle);
RDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="End Sub";
return "";
}
public String  _show(Punchline.Tech.Cuppy.Framework.modal __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="modal";
if (Debug.shouldDelegate(ba, "show"))
	 {return ((String) Debug.delegate(ba, "show", null));}
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _parent = null;
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Public Sub show";
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="Dim Parent As Pane = GetBase.Parent";
_parent = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_parent.setObject((javafx.scene.layout.Pane)(__ref._getbase(null).getParent().getObject()));
RDebugUtils.currentLine=11730948;
 //BA.debugLineNum = 11730948;BA.debugLine="ModalBgPane.Visible = True";
__ref._modalbgpane.setVisible(__c.True);
RDebugUtils.currentLine=11730949;
 //BA.debugLineNum = 11730949;BA.debugLine="ModalPane.Visible = True";
__ref._modalpane.setVisible(__c.True);
RDebugUtils.currentLine=11730951;
 //BA.debugLineNum = 11730951;BA.debugLine="mBase.SetLayoutAnimated(300, 0 , 0,  Parent.Width";
__ref._mbase.SetLayoutAnimated((int) (300),0,0,_parent.getWidth(),_parent.getHeight());
RDebugUtils.currentLine=11730953;
 //BA.debugLineNum = 11730953;BA.debugLine="End Sub";
return "";
}
}