package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfbarpreloader extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfbarpreloader", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.cfbarpreloader.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.Timer _timer1 = null;
public anywheresoftware.b4a.objects.Timer _timer2 = null;
public anywheresoftware.b4a.objects.Timer _timer3 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pane1 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pane2 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pane3 = null;
public int _animationtime = 0;
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
public String  _base_resize(Punchline.Tech.Cuppy.Framework.cfbarpreloader __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfbarpreloader";
if (Debug.shouldDelegate(ba, "base_resize"))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,__ref._mcallback,__ref._meventname+"_Resize",(Object)(_width),(Object)(_height));
RDebugUtils.currentLine=9961476;
 //BA.debugLineNum = 9961476;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(Punchline.Tech.Cuppy.Framework.cfbarpreloader __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfbarpreloader";
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=9764869;
 //BA.debugLineNum = 9764869;BA.debugLine="Private timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=9764870;
 //BA.debugLineNum = 9764870;BA.debugLine="Private timer2 As Timer";
_timer2 = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=9764871;
 //BA.debugLineNum = 9764871;BA.debugLine="Private timer3 As Timer";
_timer3 = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=9764873;
 //BA.debugLineNum = 9764873;BA.debugLine="Private Pane1 As Pane";
_pane1 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=9764874;
 //BA.debugLineNum = 9764874;BA.debugLine="Private Pane2 As Pane";
_pane2 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=9764875;
 //BA.debugLineNum = 9764875;BA.debugLine="Private Pane3 As Pane";
_pane3 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=9764876;
 //BA.debugLineNum = 9764876;BA.debugLine="Private AnimationTime As Int = 400";
_animationtime = (int) (400);
RDebugUtils.currentLine=9764878;
 //BA.debugLineNum = 9764878;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Punchline.Tech.Cuppy.Framework.cfbarpreloader __ref,anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfbarpreloader";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="mBase.LoadLayout(\"CFBarPreLoaderUI\")";
__ref._mbase.LoadLayout(ba,"CFBarPreLoaderUI");
RDebugUtils.currentLine=9895944;
 //BA.debugLineNum = 9895944;BA.debugLine="setAnimationTime(Props.get(\"AnimationTime\"))";
__ref._setanimationtime(null,(int)(BA.ObjectToNumber(_props.Get((Object)("AnimationTime")))));
RDebugUtils.currentLine=9895946;
 //BA.debugLineNum = 9895946;BA.debugLine="timer1.Initialize(\"Timer1\", AnimationTime)";
__ref._timer1.Initialize(ba,"Timer1",(long) (__ref._animationtime));
RDebugUtils.currentLine=9895947;
 //BA.debugLineNum = 9895947;BA.debugLine="timer2.Initialize(\"Timer2\", AnimationTime)";
__ref._timer2.Initialize(ba,"Timer2",(long) (__ref._animationtime));
RDebugUtils.currentLine=9895948;
 //BA.debugLineNum = 9895948;BA.debugLine="timer3.Initialize(\"Timer3\", AnimationTime)";
__ref._timer3.Initialize(ba,"Timer3",(long) (__ref._animationtime));
RDebugUtils.currentLine=9895950;
 //BA.debugLineNum = 9895950;BA.debugLine="Start";
__ref._start(null);
RDebugUtils.currentLine=9895952;
 //BA.debugLineNum = 9895952;BA.debugLine="End Sub";
return "";
}
public String  _setanimationtime(Punchline.Tech.Cuppy.Framework.cfbarpreloader __ref,int _timeinms) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfbarpreloader";
if (Debug.shouldDelegate(ba, "setanimationtime"))
	 {return ((String) Debug.delegate(ba, "setanimationtime", new Object[] {_timeinms}));}
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Public Sub setAnimationTime(TimeInMS As Int)";
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="If  TimeInMS > 5000 Or TimeInMS < 100 Then";
if (_timeinms>5000 || _timeinms<100) { 
RDebugUtils.currentLine=10485764;
 //BA.debugLineNum = 10485764;BA.debugLine="LogError($\"Bar Preloader Animation Time can't be";
__c.LogError(("Bar Preloader Animation Time can't be \n"+"		greater than 5000 or less  than 100. Reseting time to 400 MS"));
RDebugUtils.currentLine=10485767;
 //BA.debugLineNum = 10485767;BA.debugLine="AnimationTime = 400";
__ref._animationtime = (int) (400);
 }else {
RDebugUtils.currentLine=10485771;
 //BA.debugLineNum = 10485771;BA.debugLine="AnimationTime = TimeInMS";
__ref._animationtime = _timeinms;
 };
RDebugUtils.currentLine=10485775;
 //BA.debugLineNum = 10485775;BA.debugLine="End Sub";
return "";
}
public String  _start(Punchline.Tech.Cuppy.Framework.cfbarpreloader __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfbarpreloader";
if (Debug.shouldDelegate(ba, "start"))
	 {return ((String) Debug.delegate(ba, "start", null));}
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Public Sub Start()";
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="EnableTimers(True)";
__ref._enabletimers(null,__c.True);
RDebugUtils.currentLine=10354691;
 //BA.debugLineNum = 10354691;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Animatio";
__c.CallSubDelayed(ba,__ref._mcallback,__ref._meventname+"_AnimationStarted");
RDebugUtils.currentLine=10354693;
 //BA.debugLineNum = 10354693;BA.debugLine="End Sub";
return "";
}
public String  _enabletimers(Punchline.Tech.Cuppy.Framework.cfbarpreloader __ref,boolean _enabled) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfbarpreloader";
if (Debug.shouldDelegate(ba, "enabletimers"))
	 {return ((String) Debug.delegate(ba, "enabletimers", new Object[] {_enabled}));}
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Private Sub EnableTimers(enabled As Boolean)";
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="timer1.Enabled =  enabled";
__ref._timer1.setEnabled(_enabled);
RDebugUtils.currentLine=10289155;
 //BA.debugLineNum = 10289155;BA.debugLine="timer2.Enabled =  enabled";
__ref._timer2.setEnabled(_enabled);
RDebugUtils.currentLine=10289156;
 //BA.debugLineNum = 10289156;BA.debugLine="timer3.Enabled =  enabled";
__ref._timer3.setEnabled(_enabled);
RDebugUtils.currentLine=10289158;
 //BA.debugLineNum = 10289158;BA.debugLine="End Sub";
return "";
}
public int  _getanimationtime(Punchline.Tech.Cuppy.Framework.cfbarpreloader __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfbarpreloader";
if (Debug.shouldDelegate(ba, "getanimationtime"))
	 {return ((Integer) Debug.delegate(ba, "getanimationtime", null));}
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Public Sub getAnimationTime As Int";
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="Return AnimationTime";
if (true) return __ref._animationtime;
RDebugUtils.currentLine=10551300;
 //BA.debugLineNum = 10551300;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase(Punchline.Tech.Cuppy.Framework.cfbarpreloader __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfbarpreloader";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Public Sub GetBase As Pane";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="End Sub";
return null;
}
public String  _initialize(Punchline.Tech.Cuppy.Framework.cfbarpreloader __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cfbarpreloader";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="mCallBack = Callback";
__ref._mcallback = _callback;
RDebugUtils.currentLine=9830405;
 //BA.debugLineNum = 9830405;BA.debugLine="End Sub";
return "";
}
public String  _stop(Punchline.Tech.Cuppy.Framework.cfbarpreloader __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfbarpreloader";
if (Debug.shouldDelegate(ba, "stop"))
	 {return ((String) Debug.delegate(ba, "stop", null));}
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Public Sub Stop()";
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="EnableTimers(False)";
__ref._enabletimers(null,__c.False);
RDebugUtils.currentLine=10420227;
 //BA.debugLineNum = 10420227;BA.debugLine="CallSubDelayed( mCallBack, mEventName & \"_Animati";
__c.CallSubDelayed(ba,__ref._mcallback,__ref._meventname+"_AnimationStopped");
RDebugUtils.currentLine=10420229;
 //BA.debugLineNum = 10420229;BA.debugLine="End Sub";
return "";
}
public String  _timer1_tick(Punchline.Tech.Cuppy.Framework.cfbarpreloader __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfbarpreloader";
if (Debug.shouldDelegate(ba, "timer1_tick"))
	 {return ((String) Debug.delegate(ba, "timer1_tick", null));}
int _height = 0;
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Private Sub Timer1_Tick";
RDebugUtils.currentLine=10092547;
 //BA.debugLineNum = 10092547;BA.debugLine="Dim height As Int = (Rnd(30, 100) / 100 ) *  mBas";
_height = (int) ((__c.Rnd((int) (30),(int) (100))/(double)100)*__ref._mbase.getPrefHeight());
RDebugUtils.currentLine=10092549;
 //BA.debugLineNum = 10092549;BA.debugLine="Pane1.SetLayoutAnimated( 300 , Pane1.Left, Pane1.";
__ref._pane1.SetLayoutAnimated((int) (300),__ref._pane1.getLeft(),__ref._pane1.getTop(),__ref._pane1.getPrefWidth(),_height);
RDebugUtils.currentLine=10092551;
 //BA.debugLineNum = 10092551;BA.debugLine="End Sub";
return "";
}
public String  _timer2_tick(Punchline.Tech.Cuppy.Framework.cfbarpreloader __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfbarpreloader";
if (Debug.shouldDelegate(ba, "timer2_tick"))
	 {return ((String) Debug.delegate(ba, "timer2_tick", null));}
int _height = 0;
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Private Sub Timer2_Tick";
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="Dim height As Int = (Rnd(30, 100) / 100  ) *  mBa";
_height = (int) ((__c.Rnd((int) (30),(int) (100))/(double)100)*__ref._mbase.getPrefHeight());
RDebugUtils.currentLine=10158084;
 //BA.debugLineNum = 10158084;BA.debugLine="Pane2.SetLayoutAnimated(300 , Pane2.Left, Pane2.T";
__ref._pane2.SetLayoutAnimated((int) (300),__ref._pane2.getLeft(),__ref._pane2.getTop(),__ref._pane2.getPrefWidth(),_height);
RDebugUtils.currentLine=10158086;
 //BA.debugLineNum = 10158086;BA.debugLine="End Sub";
return "";
}
public String  _timer3_tick(Punchline.Tech.Cuppy.Framework.cfbarpreloader __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfbarpreloader";
if (Debug.shouldDelegate(ba, "timer3_tick"))
	 {return ((String) Debug.delegate(ba, "timer3_tick", null));}
int _height = 0;
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Private Sub Timer3_Tick";
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="Dim height As Int = (Rnd(30, 100) /100 ) *  mBase";
_height = (int) ((__c.Rnd((int) (30),(int) (100))/(double)100)*__ref._mbase.getPrefHeight());
RDebugUtils.currentLine=10223620;
 //BA.debugLineNum = 10223620;BA.debugLine="Pane3.SetLayoutAnimated(300 , Pane3.Left, Pane3.T";
__ref._pane3.SetLayoutAnimated((int) (300),__ref._pane3.getLeft(),__ref._pane3.getTop(),__ref._pane3.getPrefWidth(),_height);
RDebugUtils.currentLine=10223622;
 //BA.debugLineNum = 10223622;BA.debugLine="End Sub";
return "";
}
}