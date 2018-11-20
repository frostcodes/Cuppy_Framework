package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmodal extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmodal", this);
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
public Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public Punchline.Tech.Cuppy.Framework.cfanimationmanager _cfanimationmanager = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public String  _base_resize(Punchline.Tech.Cuppy.Framework.cfmodal __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmodal";
if (Debug.shouldDelegate(ba, "base_resize"))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="ModalBgPane.PrefWidth = Width";
__ref._modalbgpane.setPrefWidth(_width);
RDebugUtils.currentLine=13107203;
 //BA.debugLineNum = 13107203;BA.debugLine="ModalBgPane.PrefHeight =  Height";
__ref._modalbgpane.setPrefHeight(_height);
RDebugUtils.currentLine=13107205;
 //BA.debugLineNum = 13107205;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,__ref._mcallback,__ref._meventname+"_Resize",(Object)(_width),(Object)(_height));
RDebugUtils.currentLine=13107207;
 //BA.debugLineNum = 13107207;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(Punchline.Tech.Cuppy.Framework.cfmodal __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmodal";
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=12910595;
 //BA.debugLineNum = 12910595;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=12910596;
 //BA.debugLineNum = 12910596;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=12910597;
 //BA.debugLineNum = 12910597;BA.debugLine="Public ModalPane As Pane";
_modalpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=12910598;
 //BA.debugLineNum = 12910598;BA.debugLine="Public ModalBgPane As Pane";
_modalbgpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=12910599;
 //BA.debugLineNum = 12910599;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Punchline.Tech.Cuppy.Framework.cfmodal __ref,anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmodal";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="mBase.LoadLayout(\"CFModalUI\")";
__ref._mbase.LoadLayout(ba,"CFModalUI");
RDebugUtils.currentLine=13041668;
 //BA.debugLineNum = 13041668;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase(Punchline.Tech.Cuppy.Framework.cfmodal __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmodal";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Public Sub GetBase As Pane";
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="End Sub";
return null;
}
public void  _hide(Punchline.Tech.Cuppy.Framework.cfmodal __ref) throws Exception{
RDebugUtils.currentModule="cfmodal";
if (Debug.shouldDelegate(ba, "hide"))
	 {Debug.delegate(ba, "hide", null); return;}
ResumableSub_Hide rsub = new ResumableSub_Hide(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Hide extends BA.ResumableSub {
public ResumableSub_Hide(Punchline.Tech.Cuppy.Framework.cfmodal parent,Punchline.Tech.Cuppy.Framework.cfmodal __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
Punchline.Tech.Cuppy.Framework.cfmodal __ref;
Punchline.Tech.Cuppy.Framework.cfmodal parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cfmodal";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="mBase.SetAlphaAnimated(300, 0)";
__ref._mbase.SetAlphaAnimated((int) (300),0);
RDebugUtils.currentLine=13697028;
 //BA.debugLineNum = 13697028;BA.debugLine="Wait For mBase_AnimationCompleted";
parent.__c.WaitFor("mbase_animationcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cfmodal", "hide"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=13697030;
 //BA.debugLineNum = 13697030;BA.debugLine="ModalBgPane.Visible = False";
__ref._modalbgpane.setVisible(parent.__c.False);
RDebugUtils.currentLine=13697031;
 //BA.debugLineNum = 13697031;BA.debugLine="ModalPane.Visible = False";
__ref._modalpane.setVisible(parent.__c.False);
RDebugUtils.currentLine=13697033;
 //BA.debugLineNum = 13697033;BA.debugLine="mBase.SetSize(0, 0)";
__ref._mbase.SetSize(0,0);
RDebugUtils.currentLine=13697034;
 //BA.debugLineNum = 13697034;BA.debugLine="mBase.Enabled = False";
__ref._mbase.setEnabled(parent.__c.False);
RDebugUtils.currentLine=13697036;
 //BA.debugLineNum = 13697036;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(Punchline.Tech.Cuppy.Framework.cfmodal __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cfmodal";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="mCallBack = Callback";
__ref._mcallback = _callback;
RDebugUtils.currentLine=12976131;
 //BA.debugLineNum = 12976131;BA.debugLine="End Sub";
return "";
}
public String  _modalbgpane_mousepressed(Punchline.Tech.Cuppy.Framework.cfmodal __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmodal";
if (Debug.shouldDelegate(ba, "modalbgpane_mousepressed"))
	 {return ((String) Debug.delegate(ba, "modalbgpane_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Private Sub ModalBgPane_MousePressed (EventData As";
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="ModalPane.RequestFocus 'set focus";
__ref._modalpane.RequestFocus();
RDebugUtils.currentLine=13762564;
 //BA.debugLineNum = 13762564;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ModalBG";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_ModalBGPressed",(Object)(_eventdata));
RDebugUtils.currentLine=13762566;
 //BA.debugLineNum = 13762566;BA.debugLine="End Sub";
return "";
}
public String  _modalbgpane_resize(Punchline.Tech.Cuppy.Framework.cfmodal __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmodal";
if (Debug.shouldDelegate(ba, "modalbgpane_resize"))
	 {return ((String) Debug.delegate(ba, "modalbgpane_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Sub ModalBgPane_Resize (Width As Double, Height As";
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_ModalBg";
__c.CallSubDelayed3(ba,__ref._mcallback,__ref._meventname+"_ModalBgPaneResize",(Object)(_width),(Object)(_height));
RDebugUtils.currentLine=13959172;
 //BA.debugLineNum = 13959172;BA.debugLine="End Sub";
return "";
}
public String  _modalpane_mousepressed(Punchline.Tech.Cuppy.Framework.cfmodal __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmodal";
if (Debug.shouldDelegate(ba, "modalpane_mousepressed"))
	 {return ((String) Debug.delegate(ba, "modalpane_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Private Sub ModalPane_MousePressed (EventData As M";
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="ModalPane.RequestFocus 'set focus";
__ref._modalpane.RequestFocus();
RDebugUtils.currentLine=13828100;
 //BA.debugLineNum = 13828100;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ModalPr";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_ModalPressed",(Object)(_eventdata));
RDebugUtils.currentLine=13828102;
 //BA.debugLineNum = 13828102;BA.debugLine="End Sub";
return "";
}
public String  _modalpane_resize(Punchline.Tech.Cuppy.Framework.cfmodal __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmodal";
if (Debug.shouldDelegate(ba, "modalpane_resize"))
	 {return ((String) Debug.delegate(ba, "modalpane_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Sub ModalPane_Resize (Width As Double, Height As D";
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_ModalPa";
__c.CallSubDelayed3(ba,__ref._mcallback,__ref._meventname+"_ModalPaneResize",(Object)(_width),(Object)(_height));
RDebugUtils.currentLine=13893636;
 //BA.debugLineNum = 13893636;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects(Punchline.Tech.Cuppy.Framework.cfmodal __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmodal";
if (Debug.shouldDelegate(ba, "removeeffects"))
	 {return ((String) Debug.delegate(ba, "removeeffects", null));}
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Public Sub RemoveEffects()";
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="CFControlsUtils.RemoveEffect(ModalPane)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._modalpane.getObject())));
RDebugUtils.currentLine=13565956;
 //BA.debugLineNum = 13565956;BA.debugLine="End Sub";
return "";
}
public String  _setbg(Punchline.Tech.Cuppy.Framework.cfmodal __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmodal";
if (Debug.shouldDelegate(ba, "setbg"))
	 {return ((String) Debug.delegate(ba, "setbg", new Object[] {_color}));}
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Public Sub setBg(color As String)";
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="CFControlsUtils.setBG( ModalPane, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._modalpane.getObject())),_color);
RDebugUtils.currentLine=13238276;
 //BA.debugLineNum = 13238276;BA.debugLine="End Sub";
return "";
}
public String  _setborder(Punchline.Tech.Cuppy.Framework.cfmodal __ref,String _color,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmodal";
if (Debug.shouldDelegate(ba, "setborder"))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_color,_width}));}
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Public Sub setBorder(color As String , width As In";
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="CFControlsUtils.setBorder(ModalPane, color, width";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._modalpane.getObject())),_color,_width);
RDebugUtils.currentLine=13369348;
 //BA.debugLineNum = 13369348;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(Punchline.Tech.Cuppy.Framework.cfmodal __ref,int _radius) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmodal";
if (Debug.shouldDelegate(ba, "setborderradius"))
	 {return ((String) Debug.delegate(ba, "setborderradius", new Object[] {_radius}));}
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="CFControlsUtils.setBorderRadius(ModalPane, radius";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._modalpane.getObject())),_radius);
RDebugUtils.currentLine=13434884;
 //BA.debugLineNum = 13434884;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(Punchline.Tech.Cuppy.Framework.cfmodal __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmodal";
if (Debug.shouldDelegate(ba, "seteffect"))
	 {return ((String) Debug.delegate(ba, "seteffect", new Object[] {_effect}));}
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Public Sub setEffect(effect As String)";
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="CFControlsUtils.setEffect(ModalPane, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._modalpane.getObject())),_effect);
RDebugUtils.currentLine=13500420;
 //BA.debugLineNum = 13500420;BA.debugLine="End Sub";
return "";
}
public String  _setrotation(Punchline.Tech.Cuppy.Framework.cfmodal __ref,float _angle) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmodal";
if (Debug.shouldDelegate(ba, "setrotation"))
	 {return ((String) Debug.delegate(ba, "setrotation", new Object[] {_angle}));}
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Public Sub setRotation(angle As Float)";
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="CFControlsUtils.setRotation(ModalPane, angle) 'ro";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._modalpane.getObject())),_angle);
RDebugUtils.currentLine=13303812;
 //BA.debugLineNum = 13303812;BA.debugLine="End Sub";
return "";
}
public String  _show(Punchline.Tech.Cuppy.Framework.cfmodal __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmodal";
if (Debug.shouldDelegate(ba, "show"))
	 {return ((String) Debug.delegate(ba, "show", null));}
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _parent = null;
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Public Sub Show";
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="Dim Parent As Pane = GetBase.Parent";
_parent = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_parent.setObject((javafx.scene.layout.Pane)(__ref._getbase(null).getParent().getObject()));
RDebugUtils.currentLine=13631492;
 //BA.debugLineNum = 13631492;BA.debugLine="mBase.Enabled = True";
__ref._mbase.setEnabled(__c.True);
RDebugUtils.currentLine=13631493;
 //BA.debugLineNum = 13631493;BA.debugLine="mBase.Alpha = 1";
__ref._mbase.setAlpha(1);
RDebugUtils.currentLine=13631495;
 //BA.debugLineNum = 13631495;BA.debugLine="ModalBgPane.Visible = True";
__ref._modalbgpane.setVisible(__c.True);
RDebugUtils.currentLine=13631496;
 //BA.debugLineNum = 13631496;BA.debugLine="ModalPane.Visible = True";
__ref._modalpane.setVisible(__c.True);
RDebugUtils.currentLine=13631498;
 //BA.debugLineNum = 13631498;BA.debugLine="mBase.SetLayoutAnimated(300, 0 , 0,  Parent.Width";
__ref._mbase.SetLayoutAnimated((int) (300),0,0,_parent.getWidth(),_parent.getHeight());
RDebugUtils.currentLine=13631500;
 //BA.debugLineNum = 13631500;BA.debugLine="End Sub";
return "";
}
}