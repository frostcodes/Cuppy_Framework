package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmateriallinearprogressbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmateriallinearprogressbar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.cfmateriallinearprogressbar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _mbase = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _progressbar = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _progresspane = null;
public b4j.example.cssutils _cssutils = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 42;BA.debugLine="ProgressPane.PrefWidth = Width";
_progresspane.setPrefWidth(_width);
 //BA.debugLineNum = 43;BA.debugLine="ProgressPane.PrefHeight = Height";
_progresspane.setPrefHeight(_height);
 //BA.debugLineNum = 44;BA.debugLine="ProgressBar.PrefHeight = Height";
_progressbar.setPrefHeight(_height);
 //BA.debugLineNum = 46;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 18;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 19;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 20;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Public ProgressBar As Pane";
_progressbar = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Public ProgressPane As Pane";
_progresspane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 31;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 32;BA.debugLine="mBase.LoadLayout(\"CFMaterialLinearProgressBarUI\")";
_mbase.LoadLayout(ba,"CFMaterialLinearProgressBarUI");
 //BA.debugLineNum = 34;BA.debugLine="SetBg(CFStyleManager.DefaultTheme.Get(\"divider\"))";
_setbg(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("divider"))));
 //BA.debugLineNum = 35;BA.debugLine="SetProgressColor(CFStyleManager.DefaultTheme.Get(";
_setprogresscolor(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("primary"))));
 //BA.debugLineNum = 36;BA.debugLine="Progress(30) 'set initial value";
_progress((int) (30));
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 51;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 25;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 26;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 27;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _progress(int _value) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Public Sub Progress(value As Int)";
 //BA.debugLineNum = 104;BA.debugLine="If value >= 100 Then";
if (_value>=100) { 
 //BA.debugLineNum = 105;BA.debugLine="value = 100";
_value = (int) (100);
 //BA.debugLineNum = 108;BA.debugLine="CallSub(mCallBack, mEventName & \"_ProgressFinish";
__c.CallSubNew(ba,_mcallback,_meventname+"_ProgressFinished");
 };
 //BA.debugLineNum = 112;BA.debugLine="ProgressBar.SetLayoutAnimated(400, 0 ,0 ,(value /";
_progressbar.SetLayoutAnimated((int) (400),0,0,(_value/(double)100)*_mbase.getPrefWidth(),_mbase.getPrefHeight());
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 90;BA.debugLine="CFControlsUtils.removePaneEffect(ProgressPane)";
_cfcontrolsutils._removepaneeffect(_progresspane);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public String  _setbg(String _color) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 60;BA.debugLine="CFControlsUtils.SetPaneBG( ProgressPane, color)";
_cfcontrolsutils._setpanebg(_progresspane,_color);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Public Sub SetBorder(color As String , width As In";
 //BA.debugLineNum = 72;BA.debugLine="CFControlsUtils.setPaneBorder(ProgressPane, color";
_cfcontrolsutils._setpaneborder(_progresspane,_color,_width);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Public Sub SetBorderRadius(radius As Int)";
 //BA.debugLineNum = 78;BA.debugLine="CFControlsUtils.setPaneBorderRadius(ProgressPane,";
_cfcontrolsutils._setpaneborderradius(_progresspane,_radius);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _setpaneeffect(String _effect) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Public Sub SetPaneEffect(effect As String)";
 //BA.debugLineNum = 84;BA.debugLine="CFControlsUtils.setPaneEffect(ProgressPane, effec";
_cfcontrolsutils._setpaneeffect(_progresspane,_effect);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public String  _setprogresscolor(String _color) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Public Sub SetProgressColor(color As String)";
 //BA.debugLineNum = 98;BA.debugLine="CFControlsUtils.SetPaneBG( ProgressBar, color)";
_cfcontrolsutils._setpanebg(_progressbar,_color);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(float _angle) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Public Sub SetRotationX(angle As Float)";
 //BA.debugLineNum = 66;BA.debugLine="CFControlsUtils.setPaneRotationX(ProgressPane, an";
_cfcontrolsutils._setpanerotationx(_progresspane,_angle);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
