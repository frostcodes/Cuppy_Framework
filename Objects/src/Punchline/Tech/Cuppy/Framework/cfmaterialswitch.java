package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmaterialswitch extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmaterialswitch", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.cfmaterialswitch.class).invoke(this, new Object[] {null});
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
public int _unchecked_state = 0;
public int _checked_state = 0;
public int _indeterminate_state = 0;
public boolean _firsttime = false;
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
public String  _base_resize(Punchline.Tech.Cuppy.Framework.cfmaterialswitch __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialswitch";
if (Debug.shouldDelegate(ba, "base_resize"))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=21299200;
 //BA.debugLineNum = 21299200;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,__ref._mcallback,__ref._meventname+"_Resize",(Object)(_width),(Object)(_height));
RDebugUtils.currentLine=21299204;
 //BA.debugLineNum = 21299204;BA.debugLine="End Sub";
return "";
}
public boolean  _checked(Punchline.Tech.Cuppy.Framework.cfmaterialswitch __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialswitch";
if (Debug.shouldDelegate(ba, "checked"))
	 {return ((Boolean) Debug.delegate(ba, "checked", null));}
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Public Sub Checked As Boolean";
RDebugUtils.currentLine=21954562;
 //BA.debugLineNum = 21954562;BA.debugLine="Return SwitchBtn.Left = 23";
if (true) return __ref._switchbtn.getLeft()==23;
RDebugUtils.currentLine=21954564;
 //BA.debugLineNum = 21954564;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(Punchline.Tech.Cuppy.Framework.cfmaterialswitch __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialswitch";
RDebugUtils.currentLine=21102592;
 //BA.debugLineNum = 21102592;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=21102593;
 //BA.debugLineNum = 21102593;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=21102594;
 //BA.debugLineNum = 21102594;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=21102595;
 //BA.debugLineNum = 21102595;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=21102596;
 //BA.debugLineNum = 21102596;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=21102598;
 //BA.debugLineNum = 21102598;BA.debugLine="Public SwitchBtn As Pane";
_switchbtn = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=21102599;
 //BA.debugLineNum = 21102599;BA.debugLine="Public SwitchPane As Pane";
_switchpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=21102602;
 //BA.debugLineNum = 21102602;BA.debugLine="Public UNCHECKED_STATE As Int = 0";
_unchecked_state = (int) (0);
RDebugUtils.currentLine=21102603;
 //BA.debugLineNum = 21102603;BA.debugLine="Public CHECKED_STATE As Int = 1";
_checked_state = (int) (1);
RDebugUtils.currentLine=21102604;
 //BA.debugLineNum = 21102604;BA.debugLine="Public INDETERMINATE_STATE As Int = 2";
_indeterminate_state = (int) (2);
RDebugUtils.currentLine=21102607;
 //BA.debugLineNum = 21102607;BA.debugLine="Private FirstTime As Boolean = False";
_firsttime = __c.False;
RDebugUtils.currentLine=21102609;
 //BA.debugLineNum = 21102609;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Punchline.Tech.Cuppy.Framework.cfmaterialswitch __ref,anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialswitch";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
String _checkedstate = "";
RDebugUtils.currentLine=21233664;
 //BA.debugLineNum = 21233664;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
RDebugUtils.currentLine=21233665;
 //BA.debugLineNum = 21233665;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=21233666;
 //BA.debugLineNum = 21233666;BA.debugLine="mBase.LoadLayout(\"CFMaterialSwitchesUI\")";
__ref._mbase.LoadLayout(ba,"CFMaterialSwitchesUI");
RDebugUtils.currentLine=21233668;
 //BA.debugLineNum = 21233668;BA.debugLine="setCheckedColor(CFStyleManager.DefaultTheme.Get(\"";
__ref._setcheckedcolor(null,BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("primary"))));
RDebugUtils.currentLine=21233672;
 //BA.debugLineNum = 21233672;BA.debugLine="Dim checkedState As String = Props.Get(\"CheckedSt";
_checkedstate = BA.ObjectToString(_props.Get((Object)("CheckedState")));
RDebugUtils.currentLine=21233676;
 //BA.debugLineNum = 21233676;BA.debugLine="If checkedState = \"UNCHECKED\" Then";
if ((_checkedstate).equals("UNCHECKED")) { 
RDebugUtils.currentLine=21233678;
 //BA.debugLineNum = 21233678;BA.debugLine="setCheckState(UNCHECKED_STATE)";
__ref._setcheckstate(null,__ref._unchecked_state);
 }else 
{RDebugUtils.currentLine=21233680;
 //BA.debugLineNum = 21233680;BA.debugLine="else If checkedState = \"CHECKED\" Then";
if ((_checkedstate).equals("CHECKED")) { 
RDebugUtils.currentLine=21233682;
 //BA.debugLineNum = 21233682;BA.debugLine="setCheckState(CHECKED_STATE)";
__ref._setcheckstate(null,__ref._checked_state);
 }else 
{RDebugUtils.currentLine=21233684;
 //BA.debugLineNum = 21233684;BA.debugLine="else If checkedState = \"INDETERMINATE\" Then";
if ((_checkedstate).equals("INDETERMINATE")) { 
RDebugUtils.currentLine=21233686;
 //BA.debugLineNum = 21233686;BA.debugLine="SetCheckState(INDETERMINATE_STATE)";
__ref._setcheckstate(null,__ref._indeterminate_state);
 }}}
;
RDebugUtils.currentLine=21233696;
 //BA.debugLineNum = 21233696;BA.debugLine="End Sub";
return "";
}
public String  _setcheckedcolor(Punchline.Tech.Cuppy.Framework.cfmaterialswitch __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialswitch";
if (Debug.shouldDelegate(ba, "setcheckedcolor"))
	 {return ((String) Debug.delegate(ba, "setcheckedcolor", new Object[] {_color}));}
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Public Sub setCheckedColor(color As String)";
RDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="CFControlsUtils.SetBG( SwitchBtn, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._switchbtn.getObject())),_color);
RDebugUtils.currentLine=21823492;
 //BA.debugLineNum = 21823492;BA.debugLine="End Sub";
return "";
}
public String  _setcheckstate(Punchline.Tech.Cuppy.Framework.cfmaterialswitch __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialswitch";
if (Debug.shouldDelegate(ba, "setcheckstate"))
	 {return ((String) Debug.delegate(ba, "setcheckstate", new Object[] {_value}));}
RDebugUtils.currentLine=21889024;
 //BA.debugLineNum = 21889024;BA.debugLine="Public Sub setCheckState(value As Int)";
RDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="If value = UNCHECKED_STATE Then";
if (_value==__ref._unchecked_state) { 
RDebugUtils.currentLine=21889028;
 //BA.debugLineNum = 21889028;BA.debugLine="SwitchBtn.SetLayoutAnimated(200 , 10, SwitchBtn.";
__ref._switchbtn.SetLayoutAnimated((int) (200),10,__ref._switchbtn.getTop(),__ref._switchbtn.getPrefWidth(),__ref._switchbtn.getPrefHeight());
RDebugUtils.currentLine=21889029;
 //BA.debugLineNum = 21889029;BA.debugLine="SwitchPane.SetAlphaAnimated(200, 1 )";
__ref._switchpane.SetAlphaAnimated((int) (200),1);
RDebugUtils.currentLine=21889030;
 //BA.debugLineNum = 21889030;BA.debugLine="setBg(CFStyleManager.DefaultTheme.Get(\"divider\")";
__ref._setbg(null,BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("divider"))));
 }else 
{RDebugUtils.currentLine=21889032;
 //BA.debugLineNum = 21889032;BA.debugLine="Else if value = CHECKED_STATE Then";
if (_value==__ref._checked_state) { 
RDebugUtils.currentLine=21889035;
 //BA.debugLineNum = 21889035;BA.debugLine="SwitchPane.SetAlphaAnimated(200, 0.6 )";
__ref._switchpane.SetAlphaAnimated((int) (200),0.6);
RDebugUtils.currentLine=21889036;
 //BA.debugLineNum = 21889036;BA.debugLine="setBg(CFControlsUtils.GetBG(SwitchBtn))";
__ref._setbg(null,_cfcontrolsutils._getbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._switchbtn.getObject()))));
RDebugUtils.currentLine=21889038;
 //BA.debugLineNum = 21889038;BA.debugLine="SwitchBtn.SetLayoutAnimated(200 , 23 , SwitchBtn";
__ref._switchbtn.SetLayoutAnimated((int) (200),23,__ref._switchbtn.getTop(),__ref._switchbtn.getPrefWidth(),__ref._switchbtn.getPrefWidth());
 }else {
RDebugUtils.currentLine=21889043;
 //BA.debugLineNum = 21889043;BA.debugLine="SwitchBtn.SetLayoutAnimated(200 , 23 , SwitchBtn";
__ref._switchbtn.SetLayoutAnimated((int) (200),23,__ref._switchbtn.getTop(),__ref._switchbtn.getPrefWidth(),__ref._switchbtn.getPrefWidth());
RDebugUtils.currentLine=21889044;
 //BA.debugLineNum = 21889044;BA.debugLine="SwitchPane.SetAlphaAnimated(200, 1 )";
__ref._switchpane.SetAlphaAnimated((int) (200),1);
RDebugUtils.currentLine=21889045;
 //BA.debugLineNum = 21889045;BA.debugLine="setBg(CFStyleManager.DefaultTheme.Get(\"divider\")";
__ref._setbg(null,BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("divider"))));
 }}
;
RDebugUtils.currentLine=21889049;
 //BA.debugLineNum = 21889049;BA.debugLine="If FirstTime Then";
if (__ref._firsttime) { 
RDebugUtils.currentLine=21889052;
 //BA.debugLineNum = 21889052;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checke";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_CheckedChanged",(Object)(_value));
 }else {
RDebugUtils.currentLine=21889056;
 //BA.debugLineNum = 21889056;BA.debugLine="FirstTime = True";
__ref._firsttime = __c.True;
 };
RDebugUtils.currentLine=21889061;
 //BA.debugLineNum = 21889061;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase(Punchline.Tech.Cuppy.Framework.cfmaterialswitch __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialswitch";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Public Sub GetBase As Pane";
RDebugUtils.currentLine=21364737;
 //BA.debugLineNum = 21364737;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="End Sub";
return null;
}
public String  _initialize(Punchline.Tech.Cuppy.Framework.cfmaterialswitch __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cfmaterialswitch";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=21168128;
 //BA.debugLineNum = 21168128;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=21168129;
 //BA.debugLineNum = 21168129;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=21168130;
 //BA.debugLineNum = 21168130;BA.debugLine="mCallBack = Callback";
__ref._mcallback = _callback;
RDebugUtils.currentLine=21168131;
 //BA.debugLineNum = 21168131;BA.debugLine="End Sub";
return "";
}
public boolean  _isindeterminate(Punchline.Tech.Cuppy.Framework.cfmaterialswitch __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialswitch";
if (Debug.shouldDelegate(ba, "isindeterminate"))
	 {return ((Boolean) Debug.delegate(ba, "isindeterminate", null));}
RDebugUtils.currentLine=22020096;
 //BA.debugLineNum = 22020096;BA.debugLine="Public Sub IsIndeterminate As Boolean";
RDebugUtils.currentLine=22020098;
 //BA.debugLineNum = 22020098;BA.debugLine="Return SwitchBtn.Alpha = \"0.6\"";
if (true) return __ref._switchbtn.getAlpha()==(double)(Double.parseDouble("0.6"));
RDebugUtils.currentLine=22020100;
 //BA.debugLineNum = 22020100;BA.debugLine="End Sub";
return false;
}
public String  _removeeffects(Punchline.Tech.Cuppy.Framework.cfmaterialswitch __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialswitch";
if (Debug.shouldDelegate(ba, "removeeffects"))
	 {return ((String) Debug.delegate(ba, "removeeffects", null));}
RDebugUtils.currentLine=21757952;
 //BA.debugLineNum = 21757952;BA.debugLine="Public Sub RemoveEffects()";
RDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="CFControlsUtils.RemoveEffect(SwitchPane)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._switchpane.getObject())));
RDebugUtils.currentLine=21757956;
 //BA.debugLineNum = 21757956;BA.debugLine="End Sub";
return "";
}
public String  _setbg(Punchline.Tech.Cuppy.Framework.cfmaterialswitch __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialswitch";
if (Debug.shouldDelegate(ba, "setbg"))
	 {return ((String) Debug.delegate(ba, "setbg", new Object[] {_color}));}
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Public Sub setBg(color As String)";
RDebugUtils.currentLine=21430274;
 //BA.debugLineNum = 21430274;BA.debugLine="CFControlsUtils.SetBG( SwitchPane, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._switchpane.getObject())),_color);
RDebugUtils.currentLine=21430276;
 //BA.debugLineNum = 21430276;BA.debugLine="End Sub";
return "";
}
public String  _setborder(Punchline.Tech.Cuppy.Framework.cfmaterialswitch __ref,String _color,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialswitch";
if (Debug.shouldDelegate(ba, "setborder"))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_color,_width}));}
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Public Sub setBorder(color As String , width As In";
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="CFControlsUtils.SetBorder(SwitchPane, color, widt";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._switchpane.getObject())),_color,_width);
RDebugUtils.currentLine=21561348;
 //BA.debugLineNum = 21561348;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(Punchline.Tech.Cuppy.Framework.cfmaterialswitch __ref,int _radius) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialswitch";
if (Debug.shouldDelegate(ba, "setborderradius"))
	 {return ((String) Debug.delegate(ba, "setborderradius", new Object[] {_radius}));}
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="CFControlsUtils.SetBorderRadius(SwitchPane, radiu";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._switchpane.getObject())),_radius);
RDebugUtils.currentLine=21626884;
 //BA.debugLineNum = 21626884;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(Punchline.Tech.Cuppy.Framework.cfmaterialswitch __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialswitch";
if (Debug.shouldDelegate(ba, "seteffect"))
	 {return ((String) Debug.delegate(ba, "seteffect", new Object[] {_effect}));}
RDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Public Sub setEffect(effect As String)";
RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="CFControlsUtils.SetEffect(SwitchPane, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._switchpane.getObject())),_effect);
RDebugUtils.currentLine=21692420;
 //BA.debugLineNum = 21692420;BA.debugLine="End Sub";
return "";
}
public String  _setrotation(Punchline.Tech.Cuppy.Framework.cfmaterialswitch __ref,float _angle) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialswitch";
if (Debug.shouldDelegate(ba, "setrotation"))
	 {return ((String) Debug.delegate(ba, "setrotation", new Object[] {_angle}));}
RDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Public Sub setRotation(angle As Float)";
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="CFControlsUtils.SetRotation(SwitchPane, angle) 'r";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._switchpane.getObject())),_angle);
RDebugUtils.currentLine=21495812;
 //BA.debugLineNum = 21495812;BA.debugLine="End Sub";
return "";
}
public String  _switchbtn_mousepressed(Punchline.Tech.Cuppy.Framework.cfmaterialswitch __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialswitch";
if (Debug.shouldDelegate(ba, "switchbtn_mousepressed"))
	 {return ((String) Debug.delegate(ba, "switchbtn_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Private Sub SwitchBtn_MousePressed (EventData As M";
RDebugUtils.currentLine=22151170;
 //BA.debugLineNum = 22151170;BA.debugLine="CallSub2(Me , \"SwitchPane_MousePressed\", EventDat";
__c.CallSubDebug2(ba,this,"SwitchPane_MousePressed",(Object)(_eventdata));
RDebugUtils.currentLine=22151172;
 //BA.debugLineNum = 22151172;BA.debugLine="End Sub";
return "";
}
public String  _switchpane_mousepressed(Punchline.Tech.Cuppy.Framework.cfmaterialswitch __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialswitch";
if (Debug.shouldDelegate(ba, "switchpane_mousepressed"))
	 {return ((String) Debug.delegate(ba, "switchpane_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=22085632;
 //BA.debugLineNum = 22085632;BA.debugLine="Private Sub SwitchPane_MousePressed (EventData As";
RDebugUtils.currentLine=22085634;
 //BA.debugLineNum = 22085634;BA.debugLine="SwitchBtn.RequestFocus 'set focus";
__ref._switchbtn.RequestFocus();
RDebugUtils.currentLine=22085636;
 //BA.debugLineNum = 22085636;BA.debugLine="If Not(Checked) Or IsIndeterminate Then";
if (__c.Not(__ref._checked(null)) || __ref._isindeterminate(null)) { 
RDebugUtils.currentLine=22085638;
 //BA.debugLineNum = 22085638;BA.debugLine="SetCheckState(CHECKED_STATE)";
__ref._setcheckstate(null,__ref._checked_state);
 }else {
RDebugUtils.currentLine=22085642;
 //BA.debugLineNum = 22085642;BA.debugLine="SetCheckState(UNCHECKED_STATE)";
__ref._setcheckstate(null,__ref._unchecked_state);
 };
RDebugUtils.currentLine=22085646;
 //BA.debugLineNum = 22085646;BA.debugLine="End Sub";
return "";
}
}