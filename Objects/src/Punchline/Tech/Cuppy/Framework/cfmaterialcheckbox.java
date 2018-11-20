package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmaterialcheckbox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.LabelWrapper _checkedlabel = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _checkboxpane = null;
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
public String  _addtoparent(Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox __ref,anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _parent,int _left,int _top,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcheckbox";
if (Debug.shouldDelegate(ba, "addtoparent"))
	 {return ((String) Debug.delegate(ba, "addtoparent", new Object[] {_parent,_left,_top,_width,_height}));}
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Public Sub AddToParent(Parent As Pane, Left As Int";
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="mBase.Initialize(\"mBase\")";
__ref._mbase.Initialize(ba,"mBase");
RDebugUtils.currentLine=9502723;
 //BA.debugLineNum = 9502723;BA.debugLine="Parent.AddNode(mBase, Left, Top, Width, Height)";
_parent.AddNode((javafx.scene.Node)(__ref._mbase.getObject()),_left,_top,_width,_height);
RDebugUtils.currentLine=9502725;
 //BA.debugLineNum = 9502725;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcheckbox";
if (Debug.shouldDelegate(ba, "base_resize"))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="CheckboxPane.PrefWidth = Width";
__ref._checkboxpane.setPrefWidth(_width);
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="CheckedLabel.PrefWidth = Width";
__ref._checkedlabel.setPrefWidth(_width);
RDebugUtils.currentLine=8650757;
 //BA.debugLineNum = 8650757;BA.debugLine="CheckboxPane.PrefHeight = Height";
__ref._checkboxpane.setPrefHeight(_height);
RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="CheckedLabel.PrefHeight = Height";
__ref._checkedlabel.setPrefHeight(_height);
RDebugUtils.currentLine=8650760;
 //BA.debugLineNum = 8650760;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,__ref._mcallback,__ref._meventname+"_Resize",(Object)(_width),(Object)(_height));
RDebugUtils.currentLine=8650762;
 //BA.debugLineNum = 8650762;BA.debugLine="End Sub";
return "";
}
public String  _checkboxpane_mouseentered(Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcheckbox";
if (Debug.shouldDelegate(ba, "checkboxpane_mouseentered"))
	 {return ((String) Debug.delegate(ba, "checkboxpane_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Private Sub CheckboxPane_MouseEntered (EventData A";
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEn";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_MouseEntered",(Object)(_eventdata));
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="End Sub";
return "";
}
public String  _checkboxpane_mouseexited(Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcheckbox";
if (Debug.shouldDelegate(ba, "checkboxpane_mouseexited"))
	 {return ((String) Debug.delegate(ba, "checkboxpane_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Private Sub CheckboxPane_MouseExited (EventData As";
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEx";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_MouseExited",(Object)(_eventdata));
RDebugUtils.currentLine=9699332;
 //BA.debugLineNum = 9699332;BA.debugLine="End Sub";
return "";
}
public String  _checkboxpane_mousepressed(Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcheckbox";
if (Debug.shouldDelegate(ba, "checkboxpane_mousepressed"))
	 {return ((String) Debug.delegate(ba, "checkboxpane_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Private Sub CheckboxPane_MousePressed (EventData A";
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="CheckboxPane.RequestFocus 'set focus";
__ref._checkboxpane.RequestFocus();
RDebugUtils.currentLine=9568260;
 //BA.debugLineNum = 9568260;BA.debugLine="If Not(Checked) Or IsIndeterminate Then";
if (__c.Not(__ref._checked(null)) || __ref._isindeterminate(null)) { 
RDebugUtils.currentLine=9568262;
 //BA.debugLineNum = 9568262;BA.debugLine="setCheckState(CHECKED_STATE)";
__ref._setcheckstate(null,__ref._checked_state);
 }else {
RDebugUtils.currentLine=9568266;
 //BA.debugLineNum = 9568266;BA.debugLine="setCheckState(UNCHECKED_STATE)";
__ref._setcheckstate(null,__ref._unchecked_state);
 };
RDebugUtils.currentLine=9568270;
 //BA.debugLineNum = 9568270;BA.debugLine="End Sub";
return "";
}
public boolean  _checked(Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcheckbox";
if (Debug.shouldDelegate(ba, "checked"))
	 {return ((Boolean) Debug.delegate(ba, "checked", null));}
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Public Sub Checked As Boolean";
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="Return CheckedLabel.Visible";
if (true) return __ref._checkedlabel.getVisible();
RDebugUtils.currentLine=9306116;
 //BA.debugLineNum = 9306116;BA.debugLine="End Sub";
return false;
}
public boolean  _isindeterminate(Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcheckbox";
if (Debug.shouldDelegate(ba, "isindeterminate"))
	 {return ((Boolean) Debug.delegate(ba, "isindeterminate", null));}
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Public Sub IsIndeterminate As Boolean";
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="Return CheckedLabel.Alpha = \"0.6\"";
if (true) return __ref._checkedlabel.getAlpha()==(double)(Double.parseDouble("0.6"));
RDebugUtils.currentLine=9371652;
 //BA.debugLineNum = 9371652;BA.debugLine="End Sub";
return false;
}
public String  _setcheckstate(Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcheckbox";
if (Debug.shouldDelegate(ba, "setcheckstate"))
	 {return ((String) Debug.delegate(ba, "setcheckstate", new Object[] {_value}));}
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Public Sub setCheckState(value As Int)";
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="If value = UNCHECKED_STATE Then";
if (_value==__ref._unchecked_state) { 
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="CheckedLabel.Visible = False";
__ref._checkedlabel.setVisible(__c.False);
RDebugUtils.currentLine=9240581;
 //BA.debugLineNum = 9240581;BA.debugLine="CheckedLabel.SetAlphaAnimated(300, 0 )";
__ref._checkedlabel.SetAlphaAnimated((int) (300),0);
 }else 
{RDebugUtils.currentLine=9240583;
 //BA.debugLineNum = 9240583;BA.debugLine="Else if value = CHECKED_STATE Then";
if (_value==__ref._checked_state) { 
RDebugUtils.currentLine=9240585;
 //BA.debugLineNum = 9240585;BA.debugLine="CheckedLabel.Visible = True";
__ref._checkedlabel.setVisible(__c.True);
RDebugUtils.currentLine=9240586;
 //BA.debugLineNum = 9240586;BA.debugLine="CheckedLabel.SetAlphaAnimated(300, 1 )";
__ref._checkedlabel.SetAlphaAnimated((int) (300),1);
 }else {
RDebugUtils.currentLine=9240590;
 //BA.debugLineNum = 9240590;BA.debugLine="CheckedLabel.SetAlphaAnimated(300, 0.6 )";
__ref._checkedlabel.SetAlphaAnimated((int) (300),0.6);
RDebugUtils.currentLine=9240591;
 //BA.debugLineNum = 9240591;BA.debugLine="CheckedLabel.Visible = True";
__ref._checkedlabel.setVisible(__c.True);
 }}
;
RDebugUtils.currentLine=9240595;
 //BA.debugLineNum = 9240595;BA.debugLine="If FirstTime Then";
if (__ref._firsttime) { 
RDebugUtils.currentLine=9240598;
 //BA.debugLineNum = 9240598;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Checke";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_CheckedChanged",(Object)(_value));
 }else {
RDebugUtils.currentLine=9240602;
 //BA.debugLineNum = 9240602;BA.debugLine="FirstTime = True";
__ref._firsttime = __c.True;
 };
RDebugUtils.currentLine=9240606;
 //BA.debugLineNum = 9240606;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcheckbox";
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=8454150;
 //BA.debugLineNum = 8454150;BA.debugLine="Public CheckedLabel As Label";
_checkedlabel = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=8454151;
 //BA.debugLineNum = 8454151;BA.debugLine="Public CheckboxPane As Pane";
_checkboxpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=8454154;
 //BA.debugLineNum = 8454154;BA.debugLine="Public UNCHECKED_STATE As Int = 0";
_unchecked_state = (int) (0);
RDebugUtils.currentLine=8454155;
 //BA.debugLineNum = 8454155;BA.debugLine="Public CHECKED_STATE As Int = 1";
_checked_state = (int) (1);
RDebugUtils.currentLine=8454156;
 //BA.debugLineNum = 8454156;BA.debugLine="Public INDETERMINATE_STATE As Int = 2";
_indeterminate_state = (int) (2);
RDebugUtils.currentLine=8454159;
 //BA.debugLineNum = 8454159;BA.debugLine="Private FirstTime As Boolean = False";
_firsttime = __c.False;
RDebugUtils.currentLine=8454161;
 //BA.debugLineNum = 8454161;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox __ref,anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcheckbox";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
String _checkedstate = "";
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="mBase.LoadLayout(\"CFMaterialCheckboxUI\")";
__ref._mbase.LoadLayout(ba,"CFMaterialCheckboxUI");
RDebugUtils.currentLine=8585220;
 //BA.debugLineNum = 8585220;BA.debugLine="setBorder(CFStyleManager.DefaultTheme.Get(\"divide";
__ref._setborder(null,BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("divider"))),(int) (2));
RDebugUtils.currentLine=8585221;
 //BA.debugLineNum = 8585221;BA.debugLine="setCheckedColor(CFStyleManager.DefaultTheme.Get(\"";
__ref._setcheckedcolor(null,BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("primary"))));
RDebugUtils.currentLine=8585224;
 //BA.debugLineNum = 8585224;BA.debugLine="Dim checkedState As String = Props.Get(\"CheckedSt";
_checkedstate = BA.ObjectToString(_props.Get((Object)("CheckedState")));
RDebugUtils.currentLine=8585228;
 //BA.debugLineNum = 8585228;BA.debugLine="If checkedState = \"UNCHECKED\" Then";
if ((_checkedstate).equals("UNCHECKED")) { 
RDebugUtils.currentLine=8585230;
 //BA.debugLineNum = 8585230;BA.debugLine="setCheckState(UNCHECKED_STATE)";
__ref._setcheckstate(null,__ref._unchecked_state);
 }else 
{RDebugUtils.currentLine=8585232;
 //BA.debugLineNum = 8585232;BA.debugLine="else If checkedState = \"CHECKED\" Then";
if ((_checkedstate).equals("CHECKED")) { 
RDebugUtils.currentLine=8585234;
 //BA.debugLineNum = 8585234;BA.debugLine="setCheckState(CHECKED_STATE)";
__ref._setcheckstate(null,__ref._checked_state);
 }else 
{RDebugUtils.currentLine=8585236;
 //BA.debugLineNum = 8585236;BA.debugLine="else If checkedState = \"INDETERMINATE\" Then";
if ((_checkedstate).equals("INDETERMINATE")) { 
RDebugUtils.currentLine=8585238;
 //BA.debugLineNum = 8585238;BA.debugLine="setCheckState(INDETERMINATE_STATE)";
__ref._setcheckstate(null,__ref._indeterminate_state);
 }}}
;
RDebugUtils.currentLine=8585243;
 //BA.debugLineNum = 8585243;BA.debugLine="End Sub";
return "";
}
public String  _setborder(Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox __ref,String _color,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcheckbox";
if (Debug.shouldDelegate(ba, "setborder"))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_color,_width}));}
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Public Sub setBorder(color As String , width As In";
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="CFControlsUtils.SetBorder(CheckboxPane, color, wi";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._checkboxpane.getObject())),_color,_width);
RDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="End Sub";
return "";
}
public String  _setcheckedcolor(Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcheckbox";
if (Debug.shouldDelegate(ba, "setcheckedcolor"))
	 {return ((String) Debug.delegate(ba, "setcheckedcolor", new Object[] {_color}));}
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Public Sub setCheckedColor(color As String)";
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="CFControlsUtils.setBG(CheckedLabel, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._checkedlabel.getObject())),_color);
RDebugUtils.currentLine=9175044;
 //BA.debugLineNum = 9175044;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase(Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcheckbox";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Public Sub GetBase As Pane";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="End Sub";
return null;
}
public String  _initialize(Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cfmaterialcheckbox";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="mCallBack = Callback";
__ref._mcallback = _callback;
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects(Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcheckbox";
if (Debug.shouldDelegate(ba, "removeeffects"))
	 {return ((String) Debug.delegate(ba, "removeeffects", null));}
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Public Sub RemoveEffects()";
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="CFControlsUtils.RemoveEffect(CheckboxPane)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._checkboxpane.getObject())));
RDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="End Sub";
return "";
}
public String  _setbg(Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcheckbox";
if (Debug.shouldDelegate(ba, "setbg"))
	 {return ((String) Debug.delegate(ba, "setbg", new Object[] {_color}));}
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Public Sub setBg(color As String)";
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="CFControlsUtils.SetBG( CheckboxPane, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._checkboxpane.getObject())),_color);
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox __ref,int _radius) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcheckbox";
if (Debug.shouldDelegate(ba, "setborderradius"))
	 {return ((String) Debug.delegate(ba, "setborderradius", new Object[] {_radius}));}
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="CFControlsUtils.SetBorderRadius(CheckboxPane, rad";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._checkboxpane.getObject())),_radius);
RDebugUtils.currentLine=8978436;
 //BA.debugLineNum = 8978436;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcheckbox";
if (Debug.shouldDelegate(ba, "seteffect"))
	 {return ((String) Debug.delegate(ba, "seteffect", new Object[] {_effect}));}
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Public Sub setEffect(effect As String)";
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="CFControlsUtils.SetEffect(CheckboxPane, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._checkboxpane.getObject())),_effect);
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="End Sub";
return "";
}
public String  _seticon(Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox __ref,int _iconcode) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcheckbox";
if (Debug.shouldDelegate(ba, "seticon"))
	 {return ((String) Debug.delegate(ba, "seticon", new Object[] {_iconcode}));}
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Public Sub setIcon(iconCode As Int)";
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="CheckedLabel.Text = Chr(iconCode)";
__ref._checkedlabel.setText(BA.ObjectToString(__c.Chr(_iconcode)));
RDebugUtils.currentLine=9437188;
 //BA.debugLineNum = 9437188;BA.debugLine="End Sub";
return "";
}
public String  _setrotation(Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox __ref,float _angle) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcheckbox";
if (Debug.shouldDelegate(ba, "setrotation"))
	 {return ((String) Debug.delegate(ba, "setrotation", new Object[] {_angle}));}
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Public Sub setRotation(angle As Float)";
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="CFControlsUtils.SetRotation(CheckboxPane, angle)";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._checkboxpane.getObject())),_angle);
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="End Sub";
return "";
}
}