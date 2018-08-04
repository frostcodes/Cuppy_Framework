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
public b4j.example.cssutils _cssutils = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public Punchline.Tech.Cuppy.Framework.cfanimationmanager _cfanimationmanager = null;
public Punchline.Tech.Cuppy.Framework.cflicensemanager _cflicensemanager = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public Punchline.Tech.Cuppy.Framework.cfhtmlutility _cfhtmlutility = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 11;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 12;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 13;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 16;BA.debugLine="Private timer2 As Timer";
_timer2 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 17;BA.debugLine="Private timer3 As Timer";
_timer3 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 20;BA.debugLine="Private Pane1 As Pane";
_pane1 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private Pane2 As Pane";
_pane2 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private Pane3 As Pane";
_pane3 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 36;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 37;BA.debugLine="mBase.LoadLayout(\"CFBarPreLoaderUI\")";
_mbase.LoadLayout(ba,"CFBarPreLoaderUI");
 //BA.debugLineNum = 43;BA.debugLine="timer1.Initialize(\"Timer1\", 400)";
_timer1.Initialize(ba,"Timer1",(long) (400));
 //BA.debugLineNum = 44;BA.debugLine="timer1.Enabled = True";
_timer1.setEnabled(__c.True);
 //BA.debugLineNum = 46;BA.debugLine="timer2.Initialize(\"Timer2\", 400)";
_timer2.Initialize(ba,"Timer2",(long) (400));
 //BA.debugLineNum = 47;BA.debugLine="timer2.Enabled = True";
_timer2.setEnabled(__c.True);
 //BA.debugLineNum = 50;BA.debugLine="timer3.Initialize(\"Timer3\", 400)";
_timer3.Initialize(ba,"Timer3",(long) (400));
 //BA.debugLineNum = 51;BA.debugLine="timer3.Enabled = True";
_timer3.setEnabled(__c.True);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 61;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 28;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 29;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Public Sub removeEffects()";
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public String  _setbg(String _color) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(String _effect) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Public Sub setEffect(effect As String)";
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(float _angle) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Public Sub setRotationX(angle As Float)";
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public String  _settextcolor(String _color) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Public Sub setTextColor(color As String)";
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public String  _timer1_tick() throws Exception{
int _height = 0;
 //BA.debugLineNum = 69;BA.debugLine="Private Sub Timer1_Tick";
 //BA.debugLineNum = 72;BA.debugLine="Dim height As Int = ( Rnd(30, 100) / 100 ) *  mBa";
_height = (int) ((__c.Rnd((int) (30),(int) (100))/(double)100)*_mbase.getPrefHeight());
 //BA.debugLineNum = 74;BA.debugLine="Pane1.SetLayoutAnimated( 300 , Pane1.Left, Pane1.";
_pane1.SetLayoutAnimated((int) (300),_pane1.getLeft(),_pane1.getTop(),_pane1.getPrefWidth(),_height);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public String  _timer2_tick() throws Exception{
int _height = 0;
 //BA.debugLineNum = 78;BA.debugLine="Private Sub Timer2_Tick";
 //BA.debugLineNum = 80;BA.debugLine="Dim height As Int = ( Rnd(30, 100) / 100  ) *  mB";
_height = (int) ((__c.Rnd((int) (30),(int) (100))/(double)100)*_mbase.getPrefHeight());
 //BA.debugLineNum = 84;BA.debugLine="Pane2.SetLayoutAnimated(300 , Pane2.Left, Pane2.T";
_pane2.SetLayoutAnimated((int) (300),_pane2.getLeft(),_pane2.getTop(),_pane2.getPrefWidth(),_height);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public String  _timer3_tick() throws Exception{
int _height = 0;
 //BA.debugLineNum = 88;BA.debugLine="Private Sub Timer3_Tick";
 //BA.debugLineNum = 90;BA.debugLine="Dim height As Int =(  Rnd(30, 100) /100 ) *  mBas";
_height = (int) ((__c.Rnd((int) (30),(int) (100))/(double)100)*_mbase.getPrefHeight());
 //BA.debugLineNum = 92;BA.debugLine="Pane3.SetLayoutAnimated(300 , Pane3.Left, Pane3.T";
_pane3.SetLayoutAnimated((int) (300),_pane3.getLeft(),_pane3.getTop(),_pane3.getPrefWidth(),_height);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
