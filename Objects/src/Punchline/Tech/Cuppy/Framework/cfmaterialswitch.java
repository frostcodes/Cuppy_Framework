package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmaterialswitch extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmaterialswitch", this);
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _vvvvvvvvvvvvvvvvvvv7 = null;
public String _vvvvvvvvvvvvvvvvvvv0 = "";
public Object _vvvvvvvvvvvvvvvvvvvv1 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _vvvvvvvvvvvvvvvvvvvv2 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _switchbtn = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _switchpane = null;
public int _unchecked_state = 0;
public int _checked_state = 0;
public int _indeterminate_state = 0;
public boolean _vvvvvvvvvvvvvvvvvvvvvvv5 = false;
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
 //BA.debugLineNum = 72;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 74;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,_vvvvvvvvvvvvvvvvvvvv1,_vvvvvvvvvvvvvvvvvvv0+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public boolean  _vvvvvvvvvvvvvvvvvvvvvv7() throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Public Sub Checked As Boolean";
 //BA.debugLineNum = 171;BA.debugLine="Return SwitchBtn.Left = 23";
if (true) return _switchbtn.getLeft()==23;
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return false;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private fx As JFX";
_vvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 16;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvvvvvv0 = "";
 //BA.debugLineNum = 17;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvvvvvvv1 = new Object();
 //BA.debugLineNum = 18;BA.debugLine="Private mBase As Pane";
_vvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Public SwitchBtn As Pane";
_switchbtn = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Public SwitchPane As Pane";
_switchpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Public UNCHECKED_STATE As Int = 0";
_unchecked_state = (int) (0);
 //BA.debugLineNum = 25;BA.debugLine="Public CHECKED_STATE As Int = 1";
_checked_state = (int) (1);
 //BA.debugLineNum = 26;BA.debugLine="Public INDETERMINATE_STATE As Int = 2";
_indeterminate_state = (int) (2);
 //BA.debugLineNum = 29;BA.debugLine="Private FirstTime As Boolean = False";
_vvvvvvvvvvvvvvvvvvvvvvv5 = __c.False;
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
String _checkedstate = "";
 //BA.debugLineNum = 38;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 39;BA.debugLine="mBase = Base";
_vvvvvvvvvvvvvvvvvvvv2 = _base;
 //BA.debugLineNum = 40;BA.debugLine="mBase.LoadLayout(\"CFMaterialSwitchesUI\")";
_vvvvvvvvvvvvvvvvvvvv2.LoadLayout(ba,"CFMaterialSwitchesUI");
 //BA.debugLineNum = 42;BA.debugLine="setCheckedColor(CFStyleManager.DefaultTheme.Get(\"";
_setvvvvvvvvvvvvvvvvvvvvvvv3(BA.ObjectToString(_vvvvvvvvvvvvvvvvvvvv0._vvvvvvvvv6.Get((Object)("primary"))));
 //BA.debugLineNum = 46;BA.debugLine="Dim checkedState As String = Props.Get(\"CheckedSt";
_checkedstate = BA.ObjectToString(_props.Get((Object)("CheckedState")));
 //BA.debugLineNum = 50;BA.debugLine="If checkedState = \"UNCHECKED\" Then";
if ((_checkedstate).equals("UNCHECKED")) { 
 //BA.debugLineNum = 52;BA.debugLine="setCheckState(UNCHECKED_STATE)";
_setvvvvvvvvvvvvvvvvvvvvvvv4(_unchecked_state);
 }else if((_checkedstate).equals("CHECKED")) { 
 //BA.debugLineNum = 56;BA.debugLine="setCheckState(CHECKED_STATE)";
_setvvvvvvvvvvvvvvvvvvvvvvv4(_checked_state);
 }else if((_checkedstate).equals("INDETERMINATE")) { 
 //BA.debugLineNum = 60;BA.debugLine="SetCheckState(INDETERMINATE_STATE)";
_setvvvvvvvvvvvvvvvvvvvvvvv4(_indeterminate_state);
 };
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _vvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 79;BA.debugLine="Return mBase";
if (true) return _vvvvvvvvvvvvvvvvvvvv2;
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 33;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 34;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvvvvvv0 = _eventname;
 //BA.debugLineNum = 35;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvvvvvvv1 = _callback;
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public boolean  _vvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Public Sub IsIndeterminate As Boolean";
 //BA.debugLineNum = 177;BA.debugLine="Return SwitchBtn.Alpha = \"0.6\"";
if (true) return _switchbtn.getAlpha()==(double)(Double.parseDouble("0.6"));
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return false;
}
public String  _vvvvvvvvvvvvvvvvv7() throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 118;BA.debugLine="CFControlsUtils.RemoveEffect(SwitchPane)";
_vvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvv2((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchpane.getObject())));
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv0(String _color) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Public Sub setBg(color As String)";
 //BA.debugLineNum = 88;BA.debugLine="CFControlsUtils.SetBG( SwitchPane, color)";
_vvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvv5((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchpane.getObject())),_color);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvv6(String _color,int _width) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 100;BA.debugLine="CFControlsUtils.SetBorder(SwitchPane, color, widt";
_vvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvv6((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchpane.getObject())),_color,_width);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv1(int _radius) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 106;BA.debugLine="CFControlsUtils.SetBorderRadius(SwitchPane, radiu";
_vvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvv0((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchpane.getObject())),_radius);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvv3(String _color) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Public Sub setCheckedColor(color As String)";
 //BA.debugLineNum = 126;BA.debugLine="CFControlsUtils.SetBG( SwitchBtn, color)";
_vvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvv5((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchbtn.getObject())),_color);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvv4(int _value) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Public Sub setCheckState(value As Int)";
 //BA.debugLineNum = 132;BA.debugLine="If value = UNCHECKED_STATE Then";
if (_value==_unchecked_state) { 
 //BA.debugLineNum = 134;BA.debugLine="SwitchBtn.SetLayoutAnimated(200 , 10, SwitchBtn.";
_switchbtn.SetLayoutAnimated((int) (200),10,_switchbtn.getTop(),_switchbtn.getPrefWidth(),_switchbtn.getPrefHeight());
 //BA.debugLineNum = 135;BA.debugLine="SwitchPane.SetAlphaAnimated(200, 1 )";
_switchpane.SetAlphaAnimated((int) (200),1);
 //BA.debugLineNum = 136;BA.debugLine="setBg(CFStyleManager.DefaultTheme.Get(\"divider\")";
_setvvvvvvvvvvvvvvvvvv0(BA.ObjectToString(_vvvvvvvvvvvvvvvvvvvv0._vvvvvvvvv6.Get((Object)("divider"))));
 }else if(_value==_checked_state) { 
 //BA.debugLineNum = 141;BA.debugLine="SwitchPane.SetAlphaAnimated(200, 0.6 )";
_switchpane.SetAlphaAnimated((int) (200),0.6);
 //BA.debugLineNum = 142;BA.debugLine="setBg(CFControlsUtils.GetBG(SwitchBtn))";
_setvvvvvvvvvvvvvvvvvv0(_vvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvv2((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchbtn.getObject()))));
 //BA.debugLineNum = 144;BA.debugLine="SwitchBtn.SetLayoutAnimated(200 , 23 , SwitchBtn";
_switchbtn.SetLayoutAnimated((int) (200),23,_switchbtn.getTop(),_switchbtn.getPrefWidth(),_switchbtn.getPrefWidth());
 }else {
 //BA.debugLineNum = 149;BA.debugLine="SwitchBtn.SetLayoutAnimated(200 , 23 , SwitchBtn";
_switchbtn.SetLayoutAnimated((int) (200),23,_switchbtn.getTop(),_switchbtn.getPrefWidth(),_switchbtn.getPrefWidth());
 //BA.debugLineNum = 150;BA.debugLine="SwitchPane.SetAlphaAnimated(200, 1 )";
_switchpane.SetAlphaAnimated((int) (200),1);
 //BA.debugLineNum = 151;BA.debugLine="setBg(CFStyleManager.DefaultTheme.Get(\"divider\")";
_setvvvvvvvvvvvvvvvvvv0(BA.ObjectToString(_vvvvvvvvvvvvvvvvvvvv0._vvvvvvvvv6.Get((Object)("divider"))));
 };
 //BA.debugLineNum = 155;BA.debugLine="If FirstTime Then";
if (_vvvvvvvvvvvvvvvvvvvvvvv5) { 
 //BA.debugLineNum = 158;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checke";
__c.CallSubDelayed2(ba,_vvvvvvvvvvvvvvvvvvvv1,_vvvvvvvvvvvvvvvvvvv0+"_CheckedChanged",(Object)(_value));
 }else {
 //BA.debugLineNum = 162;BA.debugLine="FirstTime = True";
_vvvvvvvvvvvvvvvvvvvvvvv5 = __c.True;
 };
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv2(String _effect) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Public Sub setEffect(effect As String)";
 //BA.debugLineNum = 112;BA.debugLine="CFControlsUtils.SetEffect(SwitchPane, effect)";
_vvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvvv2((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchpane.getObject())),_effect);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv6(float _angle) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Public Sub setRotation(angle As Float)";
 //BA.debugLineNum = 94;BA.debugLine="CFControlsUtils.SetRotation(SwitchPane, angle) 'r";
_vvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvvv3((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_switchpane.getObject())),_angle);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public String  _switchbtn_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Private Sub SwitchBtn_MousePressed (EventData As M";
 //BA.debugLineNum = 199;BA.debugLine="CallSub2(Me , \"SwitchPane_MousePressed\", EventDat";
__c.CallSubNew2(ba,this,"SwitchPane_MousePressed",(Object)(_eventdata));
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return "";
}
public String  _switchpane_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Private Sub SwitchPane_MousePressed (EventData As";
 //BA.debugLineNum = 183;BA.debugLine="SwitchBtn.RequestFocus 'set focus";
_switchbtn.RequestFocus();
 //BA.debugLineNum = 185;BA.debugLine="If Not(Checked) Or IsIndeterminate Then";
if (__c.Not(_vvvvvvvvvvvvvvvvvvvvvv7()) || _vvvvvvvvvvvvvvvvvvvvvv0()) { 
 //BA.debugLineNum = 187;BA.debugLine="SetCheckState(CHECKED_STATE)";
_setvvvvvvvvvvvvvvvvvvvvvvv4(_checked_state);
 }else {
 //BA.debugLineNum = 191;BA.debugLine="SetCheckState(UNCHECKED_STATE)";
_setvvvvvvvvvvvvvvvvvvvvvvv4(_unchecked_state);
 };
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "SWITCHPANE_MOUSEPRESSED"))
	return _switchpane_mousepressed((anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
