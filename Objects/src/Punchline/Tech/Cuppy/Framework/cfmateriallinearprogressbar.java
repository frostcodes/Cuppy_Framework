package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmateriallinearprogressbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmateriallinearprogressbar", this);
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
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _progressbar = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _progresspane = null;
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
public String  _base_resize(Punchline.Tech.Cuppy.Framework.cfmateriallinearprogressbar __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmateriallinearprogressbar";
if (Debug.shouldDelegate(ba, "base_resize"))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=23330816;
 //BA.debugLineNum = 23330816;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=23330818;
 //BA.debugLineNum = 23330818;BA.debugLine="ProgressPane.PrefWidth = Width";
__ref._progresspane.setPrefWidth(_width);
RDebugUtils.currentLine=23330819;
 //BA.debugLineNum = 23330819;BA.debugLine="ProgressPane.PrefHeight = Height";
__ref._progresspane.setPrefHeight(_height);
RDebugUtils.currentLine=23330820;
 //BA.debugLineNum = 23330820;BA.debugLine="ProgressBar.PrefHeight = Height";
__ref._progressbar.setPrefHeight(_height);
RDebugUtils.currentLine=23330822;
 //BA.debugLineNum = 23330822;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,__ref._mcallback,__ref._meventname+"_Resize",(Object)(_width),(Object)(_height));
RDebugUtils.currentLine=23330824;
 //BA.debugLineNum = 23330824;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(Punchline.Tech.Cuppy.Framework.cfmateriallinearprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmateriallinearprogressbar";
RDebugUtils.currentLine=23134208;
 //BA.debugLineNum = 23134208;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=23134209;
 //BA.debugLineNum = 23134209;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=23134210;
 //BA.debugLineNum = 23134210;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=23134211;
 //BA.debugLineNum = 23134211;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=23134212;
 //BA.debugLineNum = 23134212;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=23134213;
 //BA.debugLineNum = 23134213;BA.debugLine="Public ProgressBar As Pane";
_progressbar = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=23134214;
 //BA.debugLineNum = 23134214;BA.debugLine="Public ProgressPane As Pane";
_progresspane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=23134215;
 //BA.debugLineNum = 23134215;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Punchline.Tech.Cuppy.Framework.cfmateriallinearprogressbar __ref,anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmateriallinearprogressbar";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=23265280;
 //BA.debugLineNum = 23265280;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
RDebugUtils.currentLine=23265281;
 //BA.debugLineNum = 23265281;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=23265282;
 //BA.debugLineNum = 23265282;BA.debugLine="mBase.LoadLayout(\"CFMaterialLinearProgressBarUI\")";
__ref._mbase.LoadLayout(ba,"CFMaterialLinearProgressBarUI");
RDebugUtils.currentLine=23265284;
 //BA.debugLineNum = 23265284;BA.debugLine="SetBg(CFStyleManager.DefaultTheme.Get(\"divider\"))";
__ref._setbg(null,BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("divider"))));
RDebugUtils.currentLine=23265285;
 //BA.debugLineNum = 23265285;BA.debugLine="setProgressColor(CFStyleManager.DefaultTheme.Get(";
__ref._setprogresscolor(null,BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("primary"))));
RDebugUtils.currentLine=23265287;
 //BA.debugLineNum = 23265287;BA.debugLine="setProgress(Props.Get(\"Progress\")) 'set initial p";
__ref._setprogress(null,(int)(BA.ObjectToNumber(_props.Get((Object)("Progress")))));
RDebugUtils.currentLine=23265289;
 //BA.debugLineNum = 23265289;BA.debugLine="End Sub";
return "";
}
public String  _setbg(Punchline.Tech.Cuppy.Framework.cfmateriallinearprogressbar __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmateriallinearprogressbar";
if (Debug.shouldDelegate(ba, "setbg"))
	 {return ((String) Debug.delegate(ba, "setbg", new Object[] {_color}));}
RDebugUtils.currentLine=23461888;
 //BA.debugLineNum = 23461888;BA.debugLine="Public Sub setBg(color As String)";
RDebugUtils.currentLine=23461890;
 //BA.debugLineNum = 23461890;BA.debugLine="CFControlsUtils.SetBG( ProgressPane, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._progresspane.getObject())),_color);
RDebugUtils.currentLine=23461892;
 //BA.debugLineNum = 23461892;BA.debugLine="End Sub";
return "";
}
public String  _setprogresscolor(Punchline.Tech.Cuppy.Framework.cfmateriallinearprogressbar __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmateriallinearprogressbar";
if (Debug.shouldDelegate(ba, "setprogresscolor"))
	 {return ((String) Debug.delegate(ba, "setprogresscolor", new Object[] {_color}));}
RDebugUtils.currentLine=23855104;
 //BA.debugLineNum = 23855104;BA.debugLine="Public Sub setProgressColor(color As String)";
RDebugUtils.currentLine=23855106;
 //BA.debugLineNum = 23855106;BA.debugLine="CFControlsUtils.SetBG( ProgressBar, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._progressbar.getObject())),_color);
RDebugUtils.currentLine=23855108;
 //BA.debugLineNum = 23855108;BA.debugLine="End Sub";
return "";
}
public String  _setprogress(Punchline.Tech.Cuppy.Framework.cfmateriallinearprogressbar __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmateriallinearprogressbar";
if (Debug.shouldDelegate(ba, "setprogress"))
	 {return ((String) Debug.delegate(ba, "setprogress", new Object[] {_value}));}
RDebugUtils.currentLine=23920640;
 //BA.debugLineNum = 23920640;BA.debugLine="Public Sub setProgress(value As Int)";
RDebugUtils.currentLine=23920642;
 //BA.debugLineNum = 23920642;BA.debugLine="If value >= 100 Then";
if (_value>=100) { 
RDebugUtils.currentLine=23920643;
 //BA.debugLineNum = 23920643;BA.debugLine="value = 100";
_value = (int) (100);
RDebugUtils.currentLine=23920646;
 //BA.debugLineNum = 23920646;BA.debugLine="CallSub(mCallBack, mEventName & \"_ProgressFinish";
__c.CallSubNew(ba,__ref._mcallback,__ref._meventname+"_ProgressFinished");
 };
RDebugUtils.currentLine=23920650;
 //BA.debugLineNum = 23920650;BA.debugLine="ProgressBar.SetLayoutAnimated(400, 0 ,0 , (value";
__ref._progressbar.SetLayoutAnimated((int) (400),0,0,(_value/(double)100)*__ref._mbase.getPrefWidth(),__ref._mbase.getPrefHeight());
RDebugUtils.currentLine=23920652;
 //BA.debugLineNum = 23920652;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase(Punchline.Tech.Cuppy.Framework.cfmateriallinearprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmateriallinearprogressbar";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=23396352;
 //BA.debugLineNum = 23396352;BA.debugLine="Public Sub GetBase As Pane";
RDebugUtils.currentLine=23396353;
 //BA.debugLineNum = 23396353;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=23396354;
 //BA.debugLineNum = 23396354;BA.debugLine="End Sub";
return null;
}
public int  _getprogress(Punchline.Tech.Cuppy.Framework.cfmateriallinearprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmateriallinearprogressbar";
if (Debug.shouldDelegate(ba, "getprogress"))
	 {return ((Integer) Debug.delegate(ba, "getprogress", null));}
RDebugUtils.currentLine=23986176;
 //BA.debugLineNum = 23986176;BA.debugLine="Public Sub getProgress()  As Int";
RDebugUtils.currentLine=23986178;
 //BA.debugLineNum = 23986178;BA.debugLine="Return (ProgressBar.PrefWidth / mBase.PrefWidth )";
if (true) return (int) ((__ref._progressbar.getPrefWidth()/(double)__ref._mbase.getPrefWidth())*100);
RDebugUtils.currentLine=23986180;
 //BA.debugLineNum = 23986180;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(Punchline.Tech.Cuppy.Framework.cfmateriallinearprogressbar __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cfmateriallinearprogressbar";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=23199744;
 //BA.debugLineNum = 23199744;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=23199745;
 //BA.debugLineNum = 23199745;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=23199746;
 //BA.debugLineNum = 23199746;BA.debugLine="mCallBack = Callback";
__ref._mcallback = _callback;
RDebugUtils.currentLine=23199747;
 //BA.debugLineNum = 23199747;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects(Punchline.Tech.Cuppy.Framework.cfmateriallinearprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmateriallinearprogressbar";
if (Debug.shouldDelegate(ba, "removeeffects"))
	 {return ((String) Debug.delegate(ba, "removeeffects", null));}
RDebugUtils.currentLine=23789568;
 //BA.debugLineNum = 23789568;BA.debugLine="Public Sub RemoveEffects()";
RDebugUtils.currentLine=23789570;
 //BA.debugLineNum = 23789570;BA.debugLine="CFControlsUtils.RemoveEffect(ProgressPane)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._progresspane.getObject())));
RDebugUtils.currentLine=23789572;
 //BA.debugLineNum = 23789572;BA.debugLine="End Sub";
return "";
}
public String  _setborder(Punchline.Tech.Cuppy.Framework.cfmateriallinearprogressbar __ref,String _color,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmateriallinearprogressbar";
if (Debug.shouldDelegate(ba, "setborder"))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_color,_width}));}
RDebugUtils.currentLine=23592960;
 //BA.debugLineNum = 23592960;BA.debugLine="Public Sub setBorder(color As String , width As In";
RDebugUtils.currentLine=23592962;
 //BA.debugLineNum = 23592962;BA.debugLine="CFControlsUtils.SetBorder(ProgressPane, color, wi";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._progresspane.getObject())),_color,_width);
RDebugUtils.currentLine=23592964;
 //BA.debugLineNum = 23592964;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(Punchline.Tech.Cuppy.Framework.cfmateriallinearprogressbar __ref,int _radius) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmateriallinearprogressbar";
if (Debug.shouldDelegate(ba, "setborderradius"))
	 {return ((String) Debug.delegate(ba, "setborderradius", new Object[] {_radius}));}
RDebugUtils.currentLine=23658496;
 //BA.debugLineNum = 23658496;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
RDebugUtils.currentLine=23658498;
 //BA.debugLineNum = 23658498;BA.debugLine="CFControlsUtils.SetBorderRadius(ProgressPane, rad";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._progresspane.getObject())),_radius);
RDebugUtils.currentLine=23658500;
 //BA.debugLineNum = 23658500;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(Punchline.Tech.Cuppy.Framework.cfmateriallinearprogressbar __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmateriallinearprogressbar";
if (Debug.shouldDelegate(ba, "seteffect"))
	 {return ((String) Debug.delegate(ba, "seteffect", new Object[] {_effect}));}
RDebugUtils.currentLine=23724032;
 //BA.debugLineNum = 23724032;BA.debugLine="Public Sub setEffect(effect As String)";
RDebugUtils.currentLine=23724034;
 //BA.debugLineNum = 23724034;BA.debugLine="CFControlsUtils.SetEffect(ProgressPane, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._progresspane.getObject())),_effect);
RDebugUtils.currentLine=23724036;
 //BA.debugLineNum = 23724036;BA.debugLine="End Sub";
return "";
}
public String  _setrotation(Punchline.Tech.Cuppy.Framework.cfmateriallinearprogressbar __ref,float _angle) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmateriallinearprogressbar";
if (Debug.shouldDelegate(ba, "setrotation"))
	 {return ((String) Debug.delegate(ba, "setrotation", new Object[] {_angle}));}
RDebugUtils.currentLine=23527424;
 //BA.debugLineNum = 23527424;BA.debugLine="Public Sub setRotation(angle As Float)";
RDebugUtils.currentLine=23527426;
 //BA.debugLineNum = 23527426;BA.debugLine="CFControlsUtils.SetRotation(ProgressPane, angle)";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._progresspane.getObject())),_angle);
RDebugUtils.currentLine=23527428;
 //BA.debugLineNum = 23527428;BA.debugLine="End Sub";
return "";
}
}