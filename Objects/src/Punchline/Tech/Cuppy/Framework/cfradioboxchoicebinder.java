package punchline.tech.cuppy.framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfradioboxchoicebinder extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("punchline.tech.cuppy.framework", "punchline.tech.cuppy.framework.cfradioboxchoicebinder", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", punchline.tech.cuppy.framework.cfradioboxchoicebinder.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public anywheresoftware.b4a.objects.collections.List _controls = null;
public punchline.tech.cuppy.framework.cfmaterialradiobox _lastcheckedradiobox = null;
public int _unchecked_state = 0;
public int _checked_state = 0;
public b4j.example.cssutils _cssutils = null;
public punchline.tech.cuppy.framework.cfconfigs _cfconfigs = null;
public punchline.tech.cuppy.framework.cfcontrolsutils _cfcontrolsutils = null;
public punchline.tech.cuppy.framework.cfstringutility _cfstringutility = null;
public punchline.tech.cuppy.framework.cfdatageneratorutility _cfdatageneratorutility = null;
public punchline.tech.cuppy.framework.cfapputility _cfapputility = null;
public punchline.tech.cuppy.framework.cfmathutility _cfmathutility = null;
public punchline.tech.cuppy.framework.cfstylemanager _cfstylemanager = null;
public punchline.tech.cuppy.framework.cffileutility _cffileutility = null;
public punchline.tech.cuppy.framework.cfdatatypeutility _cfdatatypeutility = null;
public boolean  _bindcontrol(punchline.tech.cuppy.framework.cfmaterialradiobox _control) throws Exception{
punchline.tech.cuppy.framework.cfmaterialradiobox _controlobj = null;
 //BA.debugLineNum = 42;BA.debugLine="Public Sub BindControl(Control As CFMaterialRadioB";
 //BA.debugLineNum = 44;BA.debugLine="Controls.Add(Control)";
_controls.Add((Object)(_control));
 //BA.debugLineNum = 45;BA.debugLine="SetRadioboxState(Control, UNCHECKED_STATE) 'Forc";
_setradioboxstate(_control,_unchecked_state);
 //BA.debugLineNum = 50;BA.debugLine="Dim ControlObj As CFMaterialRadioBox = Control";
_controlobj = _control;
 //BA.debugLineNum = 52;BA.debugLine="If Not(ControlObj.ChoiceBinder = Me) Then";
if (__c.Not((_controlobj._getchoicebinder()).equals((punchline.tech.cuppy.framework.cfradioboxchoicebinder)(this)))) { 
 //BA.debugLineNum = 54;BA.debugLine="ControlObj.ChoiceBinder = Me";
_controlobj._setchoicebinder((punchline.tech.cuppy.framework.cfradioboxchoicebinder)(this));
 };
 //BA.debugLineNum = 58;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return false;
}
public String  _bindmultiplecontrols(punchline.tech.cuppy.framework.cfmaterialradiobox[] _cfmaterialradioboxcontrols) throws Exception{
punchline.tech.cuppy.framework.cfmaterialradiobox _control = null;
 //BA.debugLineNum = 63;BA.debugLine="Public Sub BindMultipleControls(CFMaterialRadioBox";
 //BA.debugLineNum = 65;BA.debugLine="For Each Control As CFMaterialRadioBox In CFMater";
{
final punchline.tech.cuppy.framework.cfmaterialradiobox[] group1 = _cfmaterialradioboxcontrols;
final int groupLen1 = group1.length
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_control = group1[index1];
 //BA.debugLineNum = 67;BA.debugLine="BindControl(Control)";
_bindcontrol(_control);
 }
};
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private mEventName As String";
_meventname = "";
 //BA.debugLineNum = 10;BA.debugLine="Private Controls As List";
_controls = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 12;BA.debugLine="Private LastCheckedRadiobox As CFMaterialRadioBox";
_lastcheckedradiobox = new punchline.tech.cuppy.framework.cfmaterialradiobox();
 //BA.debugLineNum = 15;BA.debugLine="Private UNCHECKED_STATE As Int = 0";
_unchecked_state = (int) (0);
 //BA.debugLineNum = 16;BA.debugLine="Private CHECKED_STATE As Int = 1";
_checked_state = (int) (1);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public punchline.tech.cuppy.framework.cfmaterialradiobox  _getselectedradiobox() throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Public Sub getSelectedRadioBox As CFMaterialRadioB";
 //BA.debugLineNum = 153;BA.debugLine="Return LastCheckedRadiobox";
if (true) return _lastcheckedradiobox;
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize(EventName As String)";
 //BA.debugLineNum = 23;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 24;BA.debugLine="Controls.Initialize";
_controls.Initialize();
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public boolean  _iscontrolbinded(punchline.tech.cuppy.framework.cfmaterialradiobox _control) throws Exception{
int _index = 0;
 //BA.debugLineNum = 172;BA.debugLine="Public Sub IsControlBinded(Control As CFMaterialRa";
 //BA.debugLineNum = 174;BA.debugLine="Dim index As Int = Controls.IndexOf(Control)";
_index = _controls.IndexOf((Object)(_control));
 //BA.debugLineNum = 176;BA.debugLine="If index = -1 Then";
if (_index==-1) { 
 //BA.debugLineNum = 178;BA.debugLine="Return False";
if (true) return __c.False;
 }else {
 //BA.debugLineNum = 182;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return false;
}
public String  _setradioboxstate(punchline.tech.cuppy.framework.cfmaterialradiobox _control,int _state) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Private Sub SetRadioboxState(Control As CFMaterial";
 //BA.debugLineNum = 108;BA.debugLine="If State = UNCHECKED_STATE Then";
if (_state==_unchecked_state) { 
 //BA.debugLineNum = 110;BA.debugLine="Control.CheckedPane.Visible = False";
_control._checkedpane.setVisible(__c.False);
 //BA.debugLineNum = 111;BA.debugLine="Control.CheckedPane.SetAlphaAnimated(300, 0 )";
_control._checkedpane.SetAlphaAnimated((int) (300),0);
 }else if(_state==_checked_state) { 
 //BA.debugLineNum = 115;BA.debugLine="Control.CheckedPane.Visible = True";
_control._checkedpane.setVisible(__c.True);
 //BA.debugLineNum = 116;BA.debugLine="Control.CheckedPane.SetAlphaAnimated(300, 1 )";
_control._checkedpane.SetAlphaAnimated((int) (300),1);
 }else {
 //BA.debugLineNum = 120;BA.debugLine="Control.CheckedPane.SetAlphaAnimated(300, 0.6 )";
_control._checkedpane.SetAlphaAnimated((int) (300),0.6);
 //BA.debugLineNum = 121;BA.debugLine="Control.CheckedPane.Visible = True";
_control._checkedpane.setVisible(__c.True);
 };
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public String  _setselectedradiobox(punchline.tech.cuppy.framework.cfmaterialradiobox _selected) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Public Sub setSelectedRadioBox(Selected As CFMater";
 //BA.debugLineNum = 159;BA.debugLine="If IsControlBinded(Selected) Then";
if (_iscontrolbinded(_selected)) { 
 //BA.debugLineNum = 161;BA.debugLine="TriggerState(Selected, CHECKED_STATE)";
_triggerstate(_selected,_checked_state);
 }else {
 //BA.debugLineNum = 165;BA.debugLine="LogDebug(\"CFRadioBoxChoiceBinder ( \" & mEventNam";
__c.LogDebug("CFRadioBoxChoiceBinder ( "+_meventname+" ) cannot set selected radio box to "+_selected._geteventname()+" because it was not binded!");
 };
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return "";
}
public String  _triggerstate(punchline.tech.cuppy.framework.cfmaterialradiobox _currentcontrol,int _state) throws Exception{
punchline.tech.cuppy.framework.cfmaterialradiobox _cntrl = null;
 //BA.debugLineNum = 83;BA.debugLine="Public Sub TriggerState(CurrentControl As CFMateri";
 //BA.debugLineNum = 86;BA.debugLine="If Not(LastCheckedRadiobox = CurrentControl) The";
if (__c.Not((_lastcheckedradiobox).equals(_currentcontrol))) { 
 //BA.debugLineNum = 88;BA.debugLine="For Each cntrl As CFMaterialRadioBox In Control";
{
final anywheresoftware.b4a.BA.IterableList group2 = _controls;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_cntrl = (punchline.tech.cuppy.framework.cfmaterialradiobox)(group2.Get(index2));
 //BA.debugLineNum = 90;BA.debugLine="SetRadioboxState(cntrl, UNCHECKED_STATE)";
_setradioboxstate(_cntrl,_unchecked_state);
 }
};
 //BA.debugLineNum = 94;BA.debugLine="SetRadioboxState(CurrentControl, CHECKED_STATE)";
_setradioboxstate(_currentcontrol,_checked_state);
 //BA.debugLineNum = 95;BA.debugLine="CurrentControl.CheckboxPane.RequestFocus 'set f";
_currentcontrol._checkboxpane.RequestFocus();
 //BA.debugLineNum = 96;BA.debugLine="LastCheckedRadiobox = CurrentControl";
_lastcheckedradiobox = _currentcontrol;
 //BA.debugLineNum = 99;BA.debugLine="CallSubDelayed2(CurrentControl.CallBack, mEvent";
__c.CallSubDelayed2(ba,_currentcontrol._getcallback(),_meventname+"_CheckedControlChanged",(Object)(_currentcontrol));
 };
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public String  _unbindcontrol(punchline.tech.cuppy.framework.cfmaterialradiobox _control) throws Exception{
int _index = 0;
 //BA.debugLineNum = 127;BA.debugLine="Public Sub UnBindControl(Control As CFMaterialRadi";
 //BA.debugLineNum = 129;BA.debugLine="Dim index As Int = Controls.IndexOf(Control)";
_index = _controls.IndexOf((Object)(_control));
 //BA.debugLineNum = 131;BA.debugLine="If Not(index = -1) Then";
if (__c.Not(_index==-1)) { 
 //BA.debugLineNum = 133;BA.debugLine="Controls.RemoveAt(index)";
_controls.RemoveAt(_index);
 };
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public String  _unbindmultiplecontrols(punchline.tech.cuppy.framework.cfmaterialradiobox[] _cfmaterialradioboxcontrols) throws Exception{
punchline.tech.cuppy.framework.cfmaterialradiobox _control = null;
 //BA.debugLineNum = 140;BA.debugLine="Public Sub UnBindMultipleControls(CFMaterialRadioB";
 //BA.debugLineNum = 142;BA.debugLine="For Each Control As CFMaterialRadioBox In CFMater";
{
final punchline.tech.cuppy.framework.cfmaterialradiobox[] group1 = _cfmaterialradioboxcontrols;
final int groupLen1 = group1.length
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_control = group1[index1];
 //BA.debugLineNum = 144;BA.debugLine="UnBindControl(Control)";
_unbindcontrol(_control);
 }
};
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
