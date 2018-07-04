package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class barpreloader extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.barpreloader", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.barpreloader.class).invoke(this, new Object[] {null});
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
public String  _base_resize(Punchline.Tech.Cuppy.Framework.barpreloader __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="barpreloader";
if (Debug.shouldDelegate(ba, "base_resize"))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(Punchline.Tech.Cuppy.Framework.barpreloader __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="barpreloader";
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=6684678;
 //BA.debugLineNum = 6684678;BA.debugLine="Private timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=6684679;
 //BA.debugLineNum = 6684679;BA.debugLine="Private timer2 As Timer";
_timer2 = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=6684680;
 //BA.debugLineNum = 6684680;BA.debugLine="Private timer3 As Timer";
_timer3 = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=6684683;
 //BA.debugLineNum = 6684683;BA.debugLine="Private Pane1 As Pane";
_pane1 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=6684684;
 //BA.debugLineNum = 6684684;BA.debugLine="Private Pane2 As Pane";
_pane2 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=6684685;
 //BA.debugLineNum = 6684685;BA.debugLine="Private Pane3 As Pane";
_pane3 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=6684688;
 //BA.debugLineNum = 6684688;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Punchline.Tech.Cuppy.Framework.barpreloader __ref,anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="barpreloader";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="mBase.LoadLayout(\"BarPreLoaderUI\")";
__ref._mbase.LoadLayout(ba,"BarPreLoaderUI");
RDebugUtils.currentLine=6815752;
 //BA.debugLineNum = 6815752;BA.debugLine="timer1.Initialize(\"Timer1\", 400)";
__ref._timer1.Initialize(ba,"Timer1",(long) (400));
RDebugUtils.currentLine=6815753;
 //BA.debugLineNum = 6815753;BA.debugLine="timer1.Enabled = True";
__ref._timer1.setEnabled(__c.True);
RDebugUtils.currentLine=6815755;
 //BA.debugLineNum = 6815755;BA.debugLine="timer2.Initialize(\"Timer2\", 400)";
__ref._timer2.Initialize(ba,"Timer2",(long) (400));
RDebugUtils.currentLine=6815756;
 //BA.debugLineNum = 6815756;BA.debugLine="timer2.Enabled = True";
__ref._timer2.setEnabled(__c.True);
RDebugUtils.currentLine=6815759;
 //BA.debugLineNum = 6815759;BA.debugLine="timer3.Initialize(\"Timer3\", 400)";
__ref._timer3.Initialize(ba,"Timer3",(long) (400));
RDebugUtils.currentLine=6815760;
 //BA.debugLineNum = 6815760;BA.debugLine="timer3.Enabled = True";
__ref._timer3.setEnabled(__c.True);
RDebugUtils.currentLine=6815763;
 //BA.debugLineNum = 6815763;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase(Punchline.Tech.Cuppy.Framework.barpreloader __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="barpreloader";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Public Sub GetBase As Pane";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="End Sub";
return null;
}
public String  _initialize(Punchline.Tech.Cuppy.Framework.barpreloader __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="barpreloader";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="mCallBack = Callback";
__ref._mcallback = _callback;
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects(Punchline.Tech.Cuppy.Framework.barpreloader __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="barpreloader";
if (Debug.shouldDelegate(ba, "removeeffects"))
	 {return ((String) Debug.delegate(ba, "removeeffects", null));}
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Public Sub removeEffects()";
RDebugUtils.currentLine=7602180;
 //BA.debugLineNum = 7602180;BA.debugLine="End Sub";
return "";
}
public String  _setbg(Punchline.Tech.Cuppy.Framework.barpreloader __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="barpreloader";
if (Debug.shouldDelegate(ba, "setbg"))
	 {return ((String) Debug.delegate(ba, "setbg", new Object[] {_color}));}
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Public Sub SetBg(color As String)";
RDebugUtils.currentLine=7208964;
 //BA.debugLineNum = 7208964;BA.debugLine="End Sub";
return "";
}
public String  _setborder(Punchline.Tech.Cuppy.Framework.barpreloader __ref,String _color,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="barpreloader";
if (Debug.shouldDelegate(ba, "setborder"))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_color,_width}));}
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Public Sub setBorder(color As String , width As In";
RDebugUtils.currentLine=7405572;
 //BA.debugLineNum = 7405572;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(Punchline.Tech.Cuppy.Framework.barpreloader __ref,int _radius) throws Exception{
__ref = this;
RDebugUtils.currentModule="barpreloader";
if (Debug.shouldDelegate(ba, "setborderradius"))
	 {return ((String) Debug.delegate(ba, "setborderradius", new Object[] {_radius}));}
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
RDebugUtils.currentLine=7471108;
 //BA.debugLineNum = 7471108;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(Punchline.Tech.Cuppy.Framework.barpreloader __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="barpreloader";
if (Debug.shouldDelegate(ba, "seteffect"))
	 {return ((String) Debug.delegate(ba, "seteffect", new Object[] {_effect}));}
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Public Sub setEffect(effect As String)";
RDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(Punchline.Tech.Cuppy.Framework.barpreloader __ref,float _angle) throws Exception{
__ref = this;
RDebugUtils.currentModule="barpreloader";
if (Debug.shouldDelegate(ba, "setrotationx"))
	 {return ((String) Debug.delegate(ba, "setrotationx", new Object[] {_angle}));}
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Public Sub setRotationX(angle As Float)";
RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="End Sub";
return "";
}
public String  _settextcolor(Punchline.Tech.Cuppy.Framework.barpreloader __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="barpreloader";
if (Debug.shouldDelegate(ba, "settextcolor"))
	 {return ((String) Debug.delegate(ba, "settextcolor", new Object[] {_color}));}
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Public Sub setTextColor(color As String)";
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="End Sub";
return "";
}
public String  _timer1_tick(Punchline.Tech.Cuppy.Framework.barpreloader __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="barpreloader";
if (Debug.shouldDelegate(ba, "timer1_tick"))
	 {return ((String) Debug.delegate(ba, "timer1_tick", null));}
int _height = 0;
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Sub Timer1_Tick";
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="Dim height As Int = ( Rnd(30, 100) / 100 ) *  mBa";
_height = (int) ((__c.Rnd((int) (30),(int) (100))/(double)100)*__ref._mbase.getPrefHeight());
RDebugUtils.currentLine=7012357;
 //BA.debugLineNum = 7012357;BA.debugLine="Pane1.SetLayoutAnimated( 300 , Pane1.Left, Pane1.";
__ref._pane1.SetLayoutAnimated((int) (300),__ref._pane1.getLeft(),__ref._pane1.getTop(),__ref._pane1.getPrefWidth(),_height);
RDebugUtils.currentLine=7012359;
 //BA.debugLineNum = 7012359;BA.debugLine="End Sub";
return "";
}
public String  _timer2_tick(Punchline.Tech.Cuppy.Framework.barpreloader __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="barpreloader";
if (Debug.shouldDelegate(ba, "timer2_tick"))
	 {return ((String) Debug.delegate(ba, "timer2_tick", null));}
int _height = 0;
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Sub Timer2_Tick";
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="Dim height As Int = ( Rnd(30, 100) / 100  ) *  mB";
_height = (int) ((__c.Rnd((int) (30),(int) (100))/(double)100)*__ref._mbase.getPrefHeight());
RDebugUtils.currentLine=7077894;
 //BA.debugLineNum = 7077894;BA.debugLine="Pane2.SetLayoutAnimated(300 , Pane2.Left, Pane2.T";
__ref._pane2.SetLayoutAnimated((int) (300),__ref._pane2.getLeft(),__ref._pane2.getTop(),__ref._pane2.getPrefWidth(),_height);
RDebugUtils.currentLine=7077896;
 //BA.debugLineNum = 7077896;BA.debugLine="End Sub";
return "";
}
public String  _timer3_tick(Punchline.Tech.Cuppy.Framework.barpreloader __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="barpreloader";
if (Debug.shouldDelegate(ba, "timer3_tick"))
	 {return ((String) Debug.delegate(ba, "timer3_tick", null));}
int _height = 0;
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Sub Timer3_Tick";
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="Dim height As Int =(  Rnd(30, 100) /100 ) *  mBas";
_height = (int) ((__c.Rnd((int) (30),(int) (100))/(double)100)*__ref._mbase.getPrefHeight());
RDebugUtils.currentLine=7143428;
 //BA.debugLineNum = 7143428;BA.debugLine="Pane3.SetLayoutAnimated(300 , Pane3.Left, Pane3.T";
__ref._pane3.SetLayoutAnimated((int) (300),__ref._pane3.getLeft(),__ref._pane3.getTop(),__ref._pane3.getPrefWidth(),_height);
RDebugUtils.currentLine=7143430;
 //BA.debugLineNum = 7143430;BA.debugLine="End Sub";
return "";
}
}