package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class materialswitch extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.materialswitch", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.materialswitch.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _switchbtn = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _switchpane = null;
public int _checked_state = 0;
public int _unchecked_state = 0;
public int _indeterminate_state = 0;
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
public String  _base_resize(Punchline.Tech.Cuppy.Framework.materialswitch __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialswitch";
if (Debug.shouldDelegate(ba, "base_resize"))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=21102592;
 //BA.debugLineNum = 21102592;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=21102596;
 //BA.debugLineNum = 21102596;BA.debugLine="End Sub";
return "";
}
public boolean  _checked(Punchline.Tech.Cuppy.Framework.materialswitch __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialswitch";
if (Debug.shouldDelegate(ba, "checked"))
	 {return ((Boolean) Debug.delegate(ba, "checked", null));}
RDebugUtils.currentLine=21757952;
 //BA.debugLineNum = 21757952;BA.debugLine="Public Sub checked As Boolean";
RDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="Return SwitchBtn.Left = 23";
if (true) return __ref._switchbtn.getLeft()==23;
RDebugUtils.currentLine=21757956;
 //BA.debugLineNum = 21757956;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(Punchline.Tech.Cuppy.Framework.materialswitch __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialswitch";
RDebugUtils.currentLine=20905984;
 //BA.debugLineNum = 20905984;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=20905985;
 //BA.debugLineNum = 20905985;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=20905986;
 //BA.debugLineNum = 20905986;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=20905987;
 //BA.debugLineNum = 20905987;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=20905988;
 //BA.debugLineNum = 20905988;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=20905990;
 //BA.debugLineNum = 20905990;BA.debugLine="Public SwitchBtn As Pane";
_switchbtn = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=20905991;
 //BA.debugLineNum = 20905991;BA.debugLine="Public SwitchPane As Pane";
_switchpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=20905994;
 //BA.debugLineNum = 20905994;BA.debugLine="Public CHECKED_STATE As Int = 0";
_checked_state = (int) (0);
RDebugUtils.currentLine=20905995;
 //BA.debugLineNum = 20905995;BA.debugLine="Public UNCHECKED_STATE As Int = 1";
_unchecked_state = (int) (1);
RDebugUtils.currentLine=20905996;
 //BA.debugLineNum = 20905996;BA.debugLine="Public INDETERMINATE_STATE As Int = 2";
_indeterminate_state = (int) (2);
RDebugUtils.currentLine=20905998;
 //BA.debugLineNum = 20905998;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Punchline.Tech.Cuppy.Framework.materialswitch __ref,anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialswitch";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=21037056;
 //BA.debugLineNum = 21037056;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
RDebugUtils.currentLine=21037057;
 //BA.debugLineNum = 21037057;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=21037058;
 //BA.debugLineNum = 21037058;BA.debugLine="mBase.LoadLayout(\"MaterialSwitchesLayout\")";
__ref._mbase.LoadLayout(ba,"MaterialSwitchesLayout");
RDebugUtils.currentLine=21037060;
 //BA.debugLineNum = 21037060;BA.debugLine="setCheckedColor(StyleManager.DefaultTheme.Get(\"pr";
__ref._setcheckedcolor(null,BA.ObjectToString(_stylemanager._defaulttheme.Get((Object)("primary"))));
RDebugUtils.currentLine=21037063;
 //BA.debugLineNum = 21037063;BA.debugLine="setCheckState(UNCHECKED_STATE) 'set initial value";
__ref._setcheckstate(null,__ref._unchecked_state);
RDebugUtils.currentLine=21037071;
 //BA.debugLineNum = 21037071;BA.debugLine="End Sub";
return "";
}
public String  _setcheckedcolor(Punchline.Tech.Cuppy.Framework.materialswitch __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialswitch";
if (Debug.shouldDelegate(ba, "setcheckedcolor"))
	 {return ((String) Debug.delegate(ba, "setcheckedcolor", new Object[] {_color}));}
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Public Sub setCheckedColor(color As String)";
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="CSSUtils.SetStyleProperty( SwitchBtn, \"-fx-backgr";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._switchbtn.getObject())),"-fx-background-color",_color);
RDebugUtils.currentLine=21626884;
 //BA.debugLineNum = 21626884;BA.debugLine="End Sub";
return "";
}
public String  _setcheckstate(Punchline.Tech.Cuppy.Framework.materialswitch __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialswitch";
if (Debug.shouldDelegate(ba, "setcheckstate"))
	 {return ((String) Debug.delegate(ba, "setcheckstate", new Object[] {_value}));}
RDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Public Sub setCheckState(value As Int)";
RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="If value = UNCHECKED_STATE Then";
if (_value==__ref._unchecked_state) { 
RDebugUtils.currentLine=21692420;
 //BA.debugLineNum = 21692420;BA.debugLine="SwitchBtn.SetLayoutAnimated(200 , 10, SwitchBtn";
__ref._switchbtn.SetLayoutAnimated((int) (200),10,__ref._switchbtn.getTop(),__ref._switchbtn.getPrefWidth(),__ref._switchbtn.getPrefHeight());
RDebugUtils.currentLine=21692421;
 //BA.debugLineNum = 21692421;BA.debugLine="SwitchPane.SetAlphaAnimated(200, 1 )";
__ref._switchpane.SetAlphaAnimated((int) (200),1);
RDebugUtils.currentLine=21692422;
 //BA.debugLineNum = 21692422;BA.debugLine="SetBg(StyleManager.DefaultTheme.Get(\"divider\"))";
__ref._setbg(null,BA.ObjectToString(_stylemanager._defaulttheme.Get((Object)("divider"))));
 }else 
{RDebugUtils.currentLine=21692424;
 //BA.debugLineNum = 21692424;BA.debugLine="Else if value = CHECKED_STATE Then";
if (_value==__ref._checked_state) { 
RDebugUtils.currentLine=21692427;
 //BA.debugLineNum = 21692427;BA.debugLine="SwitchPane.SetAlphaAnimated(200, 0.6 )";
__ref._switchpane.SetAlphaAnimated((int) (200),0.6);
RDebugUtils.currentLine=21692428;
 //BA.debugLineNum = 21692428;BA.debugLine="SetBg(ControlsUtils.getPaneBG(SwitchBtn))";
__ref._setbg(null,_controlsutils._getpanebg(__ref._switchbtn));
RDebugUtils.currentLine=21692430;
 //BA.debugLineNum = 21692430;BA.debugLine="SwitchBtn.SetLayoutAnimated(200 , 23 , SwitchBtn";
__ref._switchbtn.SetLayoutAnimated((int) (200),23,__ref._switchbtn.getTop(),__ref._switchbtn.getPrefWidth(),__ref._switchbtn.getPrefWidth());
 }else {
RDebugUtils.currentLine=21692435;
 //BA.debugLineNum = 21692435;BA.debugLine="SwitchBtn.SetLayoutAnimated(200 , 23 , SwitchBtn";
__ref._switchbtn.SetLayoutAnimated((int) (200),23,__ref._switchbtn.getTop(),__ref._switchbtn.getPrefWidth(),__ref._switchbtn.getPrefWidth());
RDebugUtils.currentLine=21692436;
 //BA.debugLineNum = 21692436;BA.debugLine="SwitchPane.SetAlphaAnimated(200, 1 )";
__ref._switchpane.SetAlphaAnimated((int) (200),1);
RDebugUtils.currentLine=21692437;
 //BA.debugLineNum = 21692437;BA.debugLine="SetBg(StyleManager.DefaultTheme.Get(\"divider\"))";
__ref._setbg(null,BA.ObjectToString(_stylemanager._defaulttheme.Get((Object)("divider"))));
 }}
;
RDebugUtils.currentLine=21692442;
 //BA.debugLineNum = 21692442;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checked";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_CheckedChanged",(Object)(_value));
RDebugUtils.currentLine=21692444;
 //BA.debugLineNum = 21692444;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase(Punchline.Tech.Cuppy.Framework.materialswitch __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialswitch";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=21168128;
 //BA.debugLineNum = 21168128;BA.debugLine="Public Sub GetBase As Pane";
RDebugUtils.currentLine=21168129;
 //BA.debugLineNum = 21168129;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=21168130;
 //BA.debugLineNum = 21168130;BA.debugLine="End Sub";
return null;
}
public String  _initialize(Punchline.Tech.Cuppy.Framework.materialswitch __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="materialswitch";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=20971520;
 //BA.debugLineNum = 20971520;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=20971521;
 //BA.debugLineNum = 20971521;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=20971522;
 //BA.debugLineNum = 20971522;BA.debugLine="mCallBack = Callback";
__ref._mcallback = _callback;
RDebugUtils.currentLine=20971523;
 //BA.debugLineNum = 20971523;BA.debugLine="End Sub";
return "";
}
public boolean  _isindeterminate(Punchline.Tech.Cuppy.Framework.materialswitch __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialswitch";
if (Debug.shouldDelegate(ba, "isindeterminate"))
	 {return ((Boolean) Debug.delegate(ba, "isindeterminate", null));}
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Public Sub IsIndeterminate As Boolean";
RDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="Return SwitchBtn.Alpha = \"0.6\"";
if (true) return __ref._switchbtn.getAlpha()==(double)(Double.parseDouble("0.6"));
RDebugUtils.currentLine=21823492;
 //BA.debugLineNum = 21823492;BA.debugLine="End Sub";
return false;
}
public String  _removeeffects(Punchline.Tech.Cuppy.Framework.materialswitch __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialswitch";
if (Debug.shouldDelegate(ba, "removeeffects"))
	 {return ((String) Debug.delegate(ba, "removeeffects", null));}
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Public Sub removeEffects()";
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="ControlsUtils.removePaneEffect(SwitchPane)";
_controlsutils._removepaneeffect(__ref._switchpane);
RDebugUtils.currentLine=21561348;
 //BA.debugLineNum = 21561348;BA.debugLine="End Sub";
return "";
}
public String  _setbg(Punchline.Tech.Cuppy.Framework.materialswitch __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialswitch";
if (Debug.shouldDelegate(ba, "setbg"))
	 {return ((String) Debug.delegate(ba, "setbg", new Object[] {_color}));}
RDebugUtils.currentLine=21233664;
 //BA.debugLineNum = 21233664;BA.debugLine="Public Sub SetBg(color As String)";
RDebugUtils.currentLine=21233666;
 //BA.debugLineNum = 21233666;BA.debugLine="CSSUtils.SetStyleProperty( SwitchPane, \"-fx-backg";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._switchpane.getObject())),"-fx-background-color",_color);
RDebugUtils.currentLine=21233668;
 //BA.debugLineNum = 21233668;BA.debugLine="End Sub";
return "";
}
public String  _setborder(Punchline.Tech.Cuppy.Framework.materialswitch __ref,String _color,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialswitch";
if (Debug.shouldDelegate(ba, "setborder"))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_color,_width}));}
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Public Sub setBorder(color As String , width As In";
RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="ControlsUtils.setPaneBorder(SwitchPane, color, wi";
_controlsutils._setpaneborder(__ref._switchpane,_color,_width);
RDebugUtils.currentLine=21364740;
 //BA.debugLineNum = 21364740;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(Punchline.Tech.Cuppy.Framework.materialswitch __ref,int _radius) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialswitch";
if (Debug.shouldDelegate(ba, "setborderradius"))
	 {return ((String) Debug.delegate(ba, "setborderradius", new Object[] {_radius}));}
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
RDebugUtils.currentLine=21430274;
 //BA.debugLineNum = 21430274;BA.debugLine="ControlsUtils.setPaneBorderRadius(SwitchPane, rad";
_controlsutils._setpaneborderradius(__ref._switchpane,_radius);
RDebugUtils.currentLine=21430276;
 //BA.debugLineNum = 21430276;BA.debugLine="End Sub";
return "";
}
public String  _setpaneeffect(Punchline.Tech.Cuppy.Framework.materialswitch __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialswitch";
if (Debug.shouldDelegate(ba, "setpaneeffect"))
	 {return ((String) Debug.delegate(ba, "setpaneeffect", new Object[] {_effect}));}
RDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Public Sub setPaneEffect(effect As String)";
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="ControlsUtils.setPaneEffect(SwitchPane, effect)";
_controlsutils._setpaneeffect(__ref._switchpane,_effect);
RDebugUtils.currentLine=21495812;
 //BA.debugLineNum = 21495812;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(Punchline.Tech.Cuppy.Framework.materialswitch __ref,float _angle) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialswitch";
if (Debug.shouldDelegate(ba, "setrotationx"))
	 {return ((String) Debug.delegate(ba, "setrotationx", new Object[] {_angle}));}
RDebugUtils.currentLine=21299200;
 //BA.debugLineNum = 21299200;BA.debugLine="Public Sub setRotationX(angle As Float)";
RDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="ControlsUtils.setPaneRotationX(SwitchPane, angle)";
_controlsutils._setpanerotationx(__ref._switchpane,_angle);
RDebugUtils.currentLine=21299204;
 //BA.debugLineNum = 21299204;BA.debugLine="End Sub";
return "";
}
public String  _switchbtn_mousepressed(Punchline.Tech.Cuppy.Framework.materialswitch __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialswitch";
if (Debug.shouldDelegate(ba, "switchbtn_mousepressed"))
	 {return ((String) Debug.delegate(ba, "switchbtn_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Sub SwitchBtn_MousePressed (EventData As MouseEven";
RDebugUtils.currentLine=21954562;
 //BA.debugLineNum = 21954562;BA.debugLine="CallSub2(Me , \"SwitchPane_MousePressed\", EventDat";
__c.CallSubDebug2(ba,this,"SwitchPane_MousePressed",(Object)(_eventdata));
RDebugUtils.currentLine=21954564;
 //BA.debugLineNum = 21954564;BA.debugLine="End Sub";
return "";
}
public String  _switchpane_mousepressed(Punchline.Tech.Cuppy.Framework.materialswitch __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="materialswitch";
if (Debug.shouldDelegate(ba, "switchpane_mousepressed"))
	 {return ((String) Debug.delegate(ba, "switchpane_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=21889024;
 //BA.debugLineNum = 21889024;BA.debugLine="Private Sub SwitchPane_MousePressed (EventData As";
RDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="If Not(checked) Or IsIndeterminate Then";
if (__c.Not(__ref._checked(null)) || __ref._isindeterminate(null)) { 
RDebugUtils.currentLine=21889028;
 //BA.debugLineNum = 21889028;BA.debugLine="setCheckState(CHECKED_STATE)";
__ref._setcheckstate(null,__ref._checked_state);
 }else {
RDebugUtils.currentLine=21889032;
 //BA.debugLineNum = 21889032;BA.debugLine="setCheckState(UNCHECKED_STATE)";
__ref._setcheckstate(null,__ref._unchecked_state);
 };
RDebugUtils.currentLine=21889037;
 //BA.debugLineNum = 21889037;BA.debugLine="End Sub";
return "";
}
}