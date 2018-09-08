package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfbarpreloader extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfbarpreloader", this);
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
public Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 72;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 30;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 31;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 32;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 33;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 35;BA.debugLine="Private timer2 As Timer";
_timer2 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 36;BA.debugLine="Private timer3 As Timer";
_timer3 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 38;BA.debugLine="Private Pane1 As Pane";
_pane1 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private Pane2 As Pane";
_pane2 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private Pane3 As Pane";
_pane3 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private AnimationTime As Int = 400";
_animationtime = (int) (400);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 53;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 54;BA.debugLine="mBase.LoadLayout(\"CFBarPreLoaderUI\")";
_mbase.LoadLayout(ba,"CFBarPreLoaderUI");
 //BA.debugLineNum = 60;BA.debugLine="setAnimationTime(Props.get(\"AnimationTime\"))";
_setanimationtime((int)(BA.ObjectToNumber(_props.Get((Object)("AnimationTime")))));
 //BA.debugLineNum = 62;BA.debugLine="timer1.Initialize(\"Timer1\", AnimationTime)";
_timer1.Initialize(ba,"Timer1",(long) (_animationtime));
 //BA.debugLineNum = 63;BA.debugLine="timer2.Initialize(\"Timer2\", AnimationTime)";
_timer2.Initialize(ba,"Timer2",(long) (_animationtime));
 //BA.debugLineNum = 64;BA.debugLine="timer3.Initialize(\"Timer3\", AnimationTime)";
_timer3.Initialize(ba,"Timer3",(long) (_animationtime));
 //BA.debugLineNum = 66;BA.debugLine="Start";
_start();
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _enabletimers(boolean _enabled) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Private Sub EnableTimers(enabled As Boolean)";
 //BA.debugLineNum = 153;BA.debugLine="timer1.Enabled =  enabled";
_timer1.setEnabled(_enabled);
 //BA.debugLineNum = 154;BA.debugLine="timer2.Enabled =  enabled";
_timer2.setEnabled(_enabled);
 //BA.debugLineNum = 155;BA.debugLine="timer3.Enabled =  enabled";
_timer3.setEnabled(_enabled);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
public int  _getanimationtime() throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Public Sub getAnimationTime As Int";
 //BA.debugLineNum = 198;BA.debugLine="Return AnimationTime";
if (true) return _animationtime;
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 77;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 45;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 47;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 48;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public String  _setanimationtime(int _timeinms) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Public Sub setAnimationTime(TimeInMS As Int)";
 //BA.debugLineNum = 179;BA.debugLine="If  TimeInMS > 5000 Or TimeInMS < 100 Then";
if (_timeinms>5000 || _timeinms<100) { 
 //BA.debugLineNum = 181;BA.debugLine="LogError($\"Bar Preloader Animation Time can't be";
__c.LogError(("Bar Preloader Animation Time can't be \n"+"		greater than 5000 or less  than 100. Reseting time to 400 MS"));
 //BA.debugLineNum = 184;BA.debugLine="AnimationTime = 400";
_animationtime = (int) (400);
 }else {
 //BA.debugLineNum = 188;BA.debugLine="AnimationTime = TimeInMS";
_animationtime = _timeinms;
 };
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return "";
}
public String  _start() throws Exception{
 //BA.debugLineNum = 160;BA.debugLine="Public Sub Start()";
 //BA.debugLineNum = 162;BA.debugLine="EnableTimers(True)";
_enabletimers(__c.True);
 //BA.debugLineNum = 163;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Animatio";
__c.CallSubDelayed(ba,_mcallback,_meventname+"_AnimationStarted");
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return "";
}
public String  _stop() throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Public Sub Stop()";
 //BA.debugLineNum = 170;BA.debugLine="EnableTimers(False)";
_enabletimers(__c.False);
 //BA.debugLineNum = 171;BA.debugLine="CallSubDelayed( mCallBack, mEventName & \"_Animati";
__c.CallSubDelayed(ba,_mcallback,_meventname+"_AnimationStopped");
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public String  _timer1_tick() throws Exception{
int _height = 0;
 //BA.debugLineNum = 82;BA.debugLine="Private Sub Timer1_Tick";
 //BA.debugLineNum = 85;BA.debugLine="Dim height As Int = (Rnd(30, 100) / 100 ) *  mBas";
_height = (int) ((__c.Rnd((int) (30),(int) (100))/(double)100)*_mbase.getPrefHeight());
 //BA.debugLineNum = 87;BA.debugLine="Pane1.SetLayoutAnimated( 300 , Pane1.Left, Pane1.";
_pane1.SetLayoutAnimated((int) (300),_pane1.getLeft(),_pane1.getTop(),_pane1.getPrefWidth(),_height);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public String  _timer2_tick() throws Exception{
int _height = 0;
 //BA.debugLineNum = 91;BA.debugLine="Private Sub Timer2_Tick";
 //BA.debugLineNum = 93;BA.debugLine="Dim height As Int = (Rnd(30, 100) / 100  ) *  mBa";
_height = (int) ((__c.Rnd((int) (30),(int) (100))/(double)100)*_mbase.getPrefHeight());
 //BA.debugLineNum = 95;BA.debugLine="Pane2.SetLayoutAnimated(300 , Pane2.Left, Pane2.T";
_pane2.SetLayoutAnimated((int) (300),_pane2.getLeft(),_pane2.getTop(),_pane2.getPrefWidth(),_height);
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public String  _timer3_tick() throws Exception{
int _height = 0;
 //BA.debugLineNum = 99;BA.debugLine="Private Sub Timer3_Tick";
 //BA.debugLineNum = 101;BA.debugLine="Dim height As Int = (Rnd(30, 100) /100 ) *  mBase";
_height = (int) ((__c.Rnd((int) (30),(int) (100))/(double)100)*_mbase.getPrefHeight());
 //BA.debugLineNum = 103;BA.debugLine="Pane3.SetLayoutAnimated(300 , Pane3.Left, Pane3.T";
_pane3.SetLayoutAnimated((int) (300),_pane3.getLeft(),_pane3.getTop(),_pane3.getPrefWidth(),_height);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
