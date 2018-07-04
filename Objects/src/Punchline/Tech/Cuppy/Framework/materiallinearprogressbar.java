package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class materiallinearprogressbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.materiallinearprogressbar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.materiallinearprogressbar.class).invoke(this, new Object[] {null});
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
public String  _base_resize(Punchline.Tech.Cuppy.Framework.materiallinearprogressbar __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="materiallinearprogressbar";
if (Debug.shouldDelegate(ba, "base_resize"))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=17760256;
 //BA.debugLineNum = 17760256;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=17760258;
 //BA.debugLineNum = 17760258;BA.debugLine="ProgressPane.PrefWidth = Width";
__ref._progresspane.setPrefWidth(_width);
RDebugUtils.currentLine=17760259;
 //BA.debugLineNum = 17760259;BA.debugLine="ProgressPane.PrefHeight = Height";
__ref._progresspane.setPrefHeight(_height);
RDebugUtils.currentLine=17760260;
 //BA.debugLineNum = 17760260;BA.debugLine="ProgressBar.PrefHeight = Height";
__ref._progressbar.setPrefHeight(_height);
RDebugUtils.currentLine=17760262;
 //BA.debugLineNum = 17760262;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(Punchline.Tech.Cuppy.Framework.materiallinearprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="materiallinearprogressbar";
RDebugUtils.currentLine=17563648;
 //BA.debugLineNum = 17563648;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=17563649;
 //BA.debugLineNum = 17563649;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=17563650;
 //BA.debugLineNum = 17563650;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=17563651;
 //BA.debugLineNum = 17563651;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=17563652;
 //BA.debugLineNum = 17563652;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=17563653;
 //BA.debugLineNum = 17563653;BA.debugLine="Public ProgressBar As Pane";
_progressbar = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=17563654;
 //BA.debugLineNum = 17563654;BA.debugLine="Public ProgressPane As Pane";
_progresspane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=17563655;
 //BA.debugLineNum = 17563655;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Punchline.Tech.Cuppy.Framework.materiallinearprogressbar __ref,anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="materiallinearprogressbar";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=17694720;
 //BA.debugLineNum = 17694720;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
RDebugUtils.currentLine=17694721;
 //BA.debugLineNum = 17694721;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=17694722;
 //BA.debugLineNum = 17694722;BA.debugLine="mBase.LoadLayout(\"MaterialLinearProgressBar\")";
__ref._mbase.LoadLayout(ba,"MaterialLinearProgressBar");
RDebugUtils.currentLine=17694724;
 //BA.debugLineNum = 17694724;BA.debugLine="SetBg(StyleManager.DefaultTheme.Get(\"divider\"))";
__ref._setbg(null,BA.ObjectToString(_stylemanager._defaulttheme.Get((Object)("divider"))));
RDebugUtils.currentLine=17694725;
 //BA.debugLineNum = 17694725;BA.debugLine="setProgressColor(StyleManager.DefaultTheme.Get(\"p";
__ref._setprogresscolor(null,BA.ObjectToString(_stylemanager._defaulttheme.Get((Object)("primary"))));
RDebugUtils.currentLine=17694726;
 //BA.debugLineNum = 17694726;BA.debugLine="progress(30) 'set initial value";
__ref._progress(null,(int) (30));
RDebugUtils.currentLine=17694728;
 //BA.debugLineNum = 17694728;BA.debugLine="End Sub";
return "";
}
public String  _setbg(Punchline.Tech.Cuppy.Framework.materiallinearprogressbar __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="materiallinearprogressbar";
if (Debug.shouldDelegate(ba, "setbg"))
	 {return ((String) Debug.delegate(ba, "setbg", new Object[] {_color}));}
RDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Public Sub SetBg(color As String)";
RDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="CSSUtils.SetStyleProperty( ProgressPane, \"-fx-bac";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._progresspane.getObject())),"-fx-background-color",_color);
RDebugUtils.currentLine=17891332;
 //BA.debugLineNum = 17891332;BA.debugLine="End Sub";
return "";
}
public String  _setprogresscolor(Punchline.Tech.Cuppy.Framework.materiallinearprogressbar __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="materiallinearprogressbar";
if (Debug.shouldDelegate(ba, "setprogresscolor"))
	 {return ((String) Debug.delegate(ba, "setprogresscolor", new Object[] {_color}));}
RDebugUtils.currentLine=18284544;
 //BA.debugLineNum = 18284544;BA.debugLine="Public Sub setProgressColor(color As String)";
RDebugUtils.currentLine=18284546;
 //BA.debugLineNum = 18284546;BA.debugLine="CSSUtils.SetStyleProperty( ProgressBar, \"-fx-back";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._progressbar.getObject())),"-fx-background-color",_color);
RDebugUtils.currentLine=18284548;
 //BA.debugLineNum = 18284548;BA.debugLine="End Sub";
return "";
}
public String  _progress(Punchline.Tech.Cuppy.Framework.materiallinearprogressbar __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="materiallinearprogressbar";
if (Debug.shouldDelegate(ba, "progress"))
	 {return ((String) Debug.delegate(ba, "progress", new Object[] {_value}));}
RDebugUtils.currentLine=18350080;
 //BA.debugLineNum = 18350080;BA.debugLine="Public Sub progress(value As Int)";
RDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="If value >= 100 Then";
if (_value>=100) { 
RDebugUtils.currentLine=18350083;
 //BA.debugLineNum = 18350083;BA.debugLine="value = 100";
_value = (int) (100);
RDebugUtils.currentLine=18350086;
 //BA.debugLineNum = 18350086;BA.debugLine="CallSub(mCallBack, mEventName & \"_ProgressFinish";
__c.CallSubNew(ba,__ref._mcallback,__ref._meventname+"_ProgressFinished");
 };
RDebugUtils.currentLine=18350090;
 //BA.debugLineNum = 18350090;BA.debugLine="ProgressBar.SetLayoutAnimated(400, 0 ,0 ,(value /";
__ref._progressbar.SetLayoutAnimated((int) (400),0,0,(_value/(double)100)*__ref._mbase.getPrefWidth(),__ref._mbase.getPrefHeight());
RDebugUtils.currentLine=18350092;
 //BA.debugLineNum = 18350092;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase(Punchline.Tech.Cuppy.Framework.materiallinearprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="materiallinearprogressbar";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=17825792;
 //BA.debugLineNum = 17825792;BA.debugLine="Public Sub GetBase As Pane";
RDebugUtils.currentLine=17825793;
 //BA.debugLineNum = 17825793;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=17825794;
 //BA.debugLineNum = 17825794;BA.debugLine="End Sub";
return null;
}
public String  _initialize(Punchline.Tech.Cuppy.Framework.materiallinearprogressbar __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="materiallinearprogressbar";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=17629184;
 //BA.debugLineNum = 17629184;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=17629185;
 //BA.debugLineNum = 17629185;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=17629186;
 //BA.debugLineNum = 17629186;BA.debugLine="mCallBack = Callback";
__ref._mcallback = _callback;
RDebugUtils.currentLine=17629187;
 //BA.debugLineNum = 17629187;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects(Punchline.Tech.Cuppy.Framework.materiallinearprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="materiallinearprogressbar";
if (Debug.shouldDelegate(ba, "removeeffects"))
	 {return ((String) Debug.delegate(ba, "removeeffects", null));}
RDebugUtils.currentLine=18219008;
 //BA.debugLineNum = 18219008;BA.debugLine="Public Sub removeEffects()";
RDebugUtils.currentLine=18219010;
 //BA.debugLineNum = 18219010;BA.debugLine="ControlsUtils.removePaneEffect(ProgressPane)";
_controlsutils._removepaneeffect(__ref._progresspane);
RDebugUtils.currentLine=18219012;
 //BA.debugLineNum = 18219012;BA.debugLine="End Sub";
return "";
}
public String  _setborder(Punchline.Tech.Cuppy.Framework.materiallinearprogressbar __ref,String _color,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="materiallinearprogressbar";
if (Debug.shouldDelegate(ba, "setborder"))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_color,_width}));}
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Public Sub setBorder(color As String , width As In";
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="ControlsUtils.setPaneBorder(ProgressPane, color,";
_controlsutils._setpaneborder(__ref._progresspane,_color,_width);
RDebugUtils.currentLine=18022404;
 //BA.debugLineNum = 18022404;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(Punchline.Tech.Cuppy.Framework.materiallinearprogressbar __ref,int _radius) throws Exception{
__ref = this;
RDebugUtils.currentModule="materiallinearprogressbar";
if (Debug.shouldDelegate(ba, "setborderradius"))
	 {return ((String) Debug.delegate(ba, "setborderradius", new Object[] {_radius}));}
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="ControlsUtils.setPaneBorderRadius(ProgressPane, r";
_controlsutils._setpaneborderradius(__ref._progresspane,_radius);
RDebugUtils.currentLine=18087940;
 //BA.debugLineNum = 18087940;BA.debugLine="End Sub";
return "";
}
public String  _setpaneeffect(Punchline.Tech.Cuppy.Framework.materiallinearprogressbar __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="materiallinearprogressbar";
if (Debug.shouldDelegate(ba, "setpaneeffect"))
	 {return ((String) Debug.delegate(ba, "setpaneeffect", new Object[] {_effect}));}
RDebugUtils.currentLine=18153472;
 //BA.debugLineNum = 18153472;BA.debugLine="Public Sub setPaneEffect(effect As String)";
RDebugUtils.currentLine=18153474;
 //BA.debugLineNum = 18153474;BA.debugLine="ControlsUtils.setPaneEffect(ProgressPane, effect)";
_controlsutils._setpaneeffect(__ref._progresspane,_effect);
RDebugUtils.currentLine=18153476;
 //BA.debugLineNum = 18153476;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(Punchline.Tech.Cuppy.Framework.materiallinearprogressbar __ref,float _angle) throws Exception{
__ref = this;
RDebugUtils.currentModule="materiallinearprogressbar";
if (Debug.shouldDelegate(ba, "setrotationx"))
	 {return ((String) Debug.delegate(ba, "setrotationx", new Object[] {_angle}));}
RDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Public Sub setRotationX(angle As Float)";
RDebugUtils.currentLine=17956866;
 //BA.debugLineNum = 17956866;BA.debugLine="ControlsUtils.setPaneRotationX(ProgressPane, angl";
_controlsutils._setpanerotationx(__ref._progresspane,_angle);
RDebugUtils.currentLine=17956868;
 //BA.debugLineNum = 17956868;BA.debugLine="End Sub";
return "";
}
}