package punchline.tech.cuppy.framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfbarpreloader extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("punchline.tech.cuppy.framework", "punchline.tech.cuppy.framework.cfbarpreloader", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", punchline.tech.cuppy.framework.cfbarpreloader.class).invoke(this, new Object[] {null});
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
public punchline.tech.cuppy.framework.cfcontrolsutils _cfcontrolsutils = null;
public punchline.tech.cuppy.framework.cfstringutility _cfstringutility = null;
public punchline.tech.cuppy.framework.cfdatageneratorutility _cfdatageneratorutility = null;
public punchline.tech.cuppy.framework.cfapputility _cfapputility = null;
public punchline.tech.cuppy.framework.cfstylemanager _cfstylemanager = null;
public punchline.tech.cuppy.framework.cfconfigs _cfconfigs = null;
public punchline.tech.cuppy.framework.cffileutility _cffileutility = null;
public punchline.tech.cuppy.framework.cfmathutility _cfmathutility = null;
public punchline.tech.cuppy.framework.cfdatatypeutility _cfdatatypeutility = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 71;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 54;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 55;BA.debugLine="mBase.LoadLayout(\"CFBarPreLoaderUI\")";
_mbase.LoadLayout(ba,"CFBarPreLoaderUI");
 //BA.debugLineNum = 57;BA.debugLine="setTag(Lbl.Tag)";
_settag(_lbl.getTag());
 //BA.debugLineNum = 58;BA.debugLine="setAlpha(Lbl.Alpha)";
_setalpha(_lbl.getAlpha());
 //BA.debugLineNum = 59;BA.debugLine="setAnimationTime(Props.get(\"AnimationTime\"))";
_setanimationtime((int)(BA.ObjectToNumber(_props.Get((Object)("AnimationTime")))));
 //BA.debugLineNum = 61;BA.debugLine="timer1.Initialize(\"Timer1\", AnimationTime)";
_timer1.Initialize(ba,"Timer1",(long) (_animationtime));
 //BA.debugLineNum = 62;BA.debugLine="timer2.Initialize(\"Timer2\", AnimationTime)";
_timer2.Initialize(ba,"Timer2",(long) (_animationtime));
 //BA.debugLineNum = 63;BA.debugLine="timer3.Initialize(\"Timer3\", AnimationTime)";
_timer3.Initialize(ba,"Timer3",(long) (_animationtime));
 //BA.debugLineNum = 65;BA.debugLine="Start";
_start();
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public String  _enabletimers(boolean _enabled) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Private Sub EnableTimers(enabled As Boolean)";
 //BA.debugLineNum = 270;BA.debugLine="timer1.Enabled =  enabled";
_timer1.setEnabled(_enabled);
 //BA.debugLineNum = 271;BA.debugLine="timer2.Enabled =  enabled";
_timer2.setEnabled(_enabled);
 //BA.debugLineNum = 272;BA.debugLine="timer3.Enabled =  enabled";
_timer3.setEnabled(_enabled);
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return "";
}
public double  _getalpha() throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Public Sub getAlpha As Double";
 //BA.debugLineNum = 112;BA.debugLine="Return mBase.Alpha";
if (true) return _mbase.getAlpha();
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return 0;
}
public int  _getanimationtime() throws Exception{
 //BA.debugLineNum = 313;BA.debugLine="Public Sub getAnimationTime As Int";
 //BA.debugLineNum = 315;BA.debugLine="Return AnimationTime";
if (true) return _animationtime;
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 76;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public boolean  _getenabled() throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Public Sub getEnabled As Boolean";
 //BA.debugLineNum = 86;BA.debugLine="Return mBase.Enabled";
if (true) return _mbase.getEnabled();
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return false;
}
public double  _getheight() throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Public Sub getHeight As Double";
 //BA.debugLineNum = 125;BA.debugLine="Return mBase.PrefHeight";
if (true) return _mbase.getPrefHeight();
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return 0;
}
public double  _getleft() throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Public Sub getLeft As Double";
 //BA.debugLineNum = 167;BA.debugLine="Return mBase.Left";
if (true) return _mbase.getLeft();
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper  _getparent() throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Public Sub getParent As Node";
 //BA.debugLineNum = 146;BA.debugLine="Return mBase.Parent";
if (true) return _mbase.getParent();
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public Object  _gettag() throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Public Sub getTag As Object";
 //BA.debugLineNum = 154;BA.debugLine="Return mBase.Tag";
if (true) return _mbase.getTag();
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public double  _gettop() throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Public Sub getTop As Double";
 //BA.debugLineNum = 139;BA.debugLine="Return mBase.Top";
if (true) return _mbase.getTop();
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return 0;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Public Sub getVisible As Boolean";
 //BA.debugLineNum = 99;BA.debugLine="Return mBase.Visible";
if (true) return _mbase.getVisible();
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return false;
}
public double  _getwidth() throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Public Sub getWidth As Double";
 //BA.debugLineNum = 132;BA.debugLine="Return mBase.PrefWidth";
if (true) return _mbase.getPrefWidth();
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return 0;
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
public String  _removenodefromparent() throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Public Sub RemoveNodeFromParent";
 //BA.debugLineNum = 176;BA.debugLine="mBase.RemoveNodeFromParent";
_mbase.RemoveNodeFromParent();
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return "";
}
public String  _setalpha(double _alpha) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Public Sub setAlpha(Alpha As Double)";
 //BA.debugLineNum = 118;BA.debugLine="mBase.Alpha = Alpha";
_mbase.setAlpha(_alpha);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public String  _setanimationtime(int _timeinms) throws Exception{
 //BA.debugLineNum = 294;BA.debugLine="Public Sub setAnimationTime(TimeInMS As Int)";
 //BA.debugLineNum = 296;BA.debugLine="If  TimeInMS > 5000 Or TimeInMS < 100 Then";
if (_timeinms>5000 || _timeinms<100) { 
 //BA.debugLineNum = 298;BA.debugLine="LogError($\"Bar Preloader Animation Time can't be";
__c.LogError(("Bar Preloader Animation Time can't be \n"+"		greater than 5000 or less  than 100. Reseting time to 400 MS"));
 //BA.debugLineNum = 301;BA.debugLine="AnimationTime = 400";
_animationtime = (int) (400);
 }else {
 //BA.debugLineNum = 305;BA.debugLine="AnimationTime = TimeInMS";
_animationtime = _timeinms;
 };
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(boolean _enabled) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Public Sub setEnabled(Enabled As Boolean)";
 //BA.debugLineNum = 92;BA.debugLine="mBase.Enabled = Enabled";
_mbase.setEnabled(_enabled);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public String  _settag(Object _tag) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Public Sub setTag(Tag As Object)";
 //BA.debugLineNum = 160;BA.debugLine="mBase.Tag = Tag";
_mbase.setTag(_tag);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _visible) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Public Sub setVisible(Visible As Boolean)";
 //BA.debugLineNum = 105;BA.debugLine="mBase.Visible = Visible";
_mbase.setVisible(_visible);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _snapshot() throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Public Sub Snapshot As Image";
 //BA.debugLineNum = 183;BA.debugLine="Return mBase.Snapshot";
if (true) return _mbase.Snapshot();
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _snapshot2(anywheresoftware.b4j.objects.JFX.PaintWrapper _backgroundcolor) throws Exception{
 //BA.debugLineNum = 188;BA.debugLine="Public Sub Snapshot2(BackgroundColor As Paint) As";
 //BA.debugLineNum = 190;BA.debugLine="Return mBase.Snapshot2(BackgroundColor)";
if (true) return _mbase.Snapshot2((javafx.scene.paint.Paint)(_backgroundcolor.getObject()));
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public String  _start() throws Exception{
 //BA.debugLineNum = 277;BA.debugLine="Public Sub Start()";
 //BA.debugLineNum = 279;BA.debugLine="EnableTimers(True)";
_enabletimers(__c.True);
 //BA.debugLineNum = 280;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Animatio";
__c.CallSubDelayed(ba,_mcallback,_meventname+"_AnimationStarted");
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return "";
}
public String  _stop() throws Exception{
 //BA.debugLineNum = 285;BA.debugLine="Public Sub Stop()";
 //BA.debugLineNum = 287;BA.debugLine="EnableTimers(False)";
_enabletimers(__c.False);
 //BA.debugLineNum = 288;BA.debugLine="CallSubDelayed( mCallBack, mEventName & \"_Animati";
__c.CallSubDelayed(ba,_mcallback,_meventname+"_AnimationStopped");
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return "";
}
public String  _timer1_tick() throws Exception{
int _height = 0;
 //BA.debugLineNum = 199;BA.debugLine="Private Sub Timer1_Tick";
 //BA.debugLineNum = 202;BA.debugLine="Dim height As Int = (Rnd(30, 100) / 100 ) *  mBas";
_height = (int) ((__c.Rnd((int) (30),(int) (100))/(double)100)*_mbase.getPrefHeight());
 //BA.debugLineNum = 204;BA.debugLine="Pane1.SetLayoutAnimated( 300 , Pane1.Left, Pane1.";
_pane1.SetLayoutAnimated((int) (300),_pane1.getLeft(),_pane1.getTop(),_pane1.getPrefWidth(),_height);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return "";
}
public String  _timer2_tick() throws Exception{
int _height = 0;
 //BA.debugLineNum = 208;BA.debugLine="Private Sub Timer2_Tick";
 //BA.debugLineNum = 210;BA.debugLine="Dim height As Int = (Rnd(30, 100) / 100  ) *  mBa";
_height = (int) ((__c.Rnd((int) (30),(int) (100))/(double)100)*_mbase.getPrefHeight());
 //BA.debugLineNum = 212;BA.debugLine="Pane2.SetLayoutAnimated(300 , Pane2.Left, Pane2.T";
_pane2.SetLayoutAnimated((int) (300),_pane2.getLeft(),_pane2.getTop(),_pane2.getPrefWidth(),_height);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return "";
}
public String  _timer3_tick() throws Exception{
int _height = 0;
 //BA.debugLineNum = 216;BA.debugLine="Private Sub Timer3_Tick";
 //BA.debugLineNum = 218;BA.debugLine="Dim height As Int = (Rnd(30, 100) /100 ) *  mBase";
_height = (int) ((__c.Rnd((int) (30),(int) (100))/(double)100)*_mbase.getPrefHeight());
 //BA.debugLineNum = 220;BA.debugLine="Pane3.SetLayoutAnimated(300 , Pane3.Left, Pane3.T";
_pane3.SetLayoutAnimated((int) (300),_pane3.getLeft(),_pane3.getTop(),_pane3.getPrefWidth(),_height);
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
