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
public anywheresoftware.b4j.objects.JFX _vvvvvvvvvvvvvvvv2 = null;
public String _vvvvvvvvvvvvvvvvvvv3 = "";
public Object _vvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _vvvvvvvvvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.Timer _vvvvvvvvvvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.Timer _vvvvvvvvvvvvvvvvvvvv6 = null;
public anywheresoftware.b4a.objects.Timer _vvvvvvvvvvvvvvvvvvvv7 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pane1 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pane2 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pane3 = null;
public b4j.example.cssutils _vvvvvvvvvvvvvvvv3 = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _vvvvvvvvvvvvvvvv4 = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _vvvvvvvvvvvvvvvv5 = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _vvvvvvvvvvvvvvvv6 = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _vvvvvvvvvvvvvvvv7 = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _vvvvvvvvvvvvvvvv0 = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _vvvvvvvvvvvvvvvvv1 = null;
public Punchline.Tech.Cuppy.Framework.cfanimationmanager _vvvvvvvvvvvvvvvvv2 = null;
public Punchline.Tech.Cuppy.Framework.cflicensemanager _vvvvvvvvvvvvvvvvv3 = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _vvvvvvvvvvvvvvvvv4 = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _vvvvvvvvvvvvvvvvv5 = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _vvvvvvvvvvvvvvvvv6 = null;
public Punchline.Tech.Cuppy.Framework.cfhtmlutility _vvvvvvvvvvvvvvvvv7 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 11;BA.debugLine="Private fx As JFX";
_vvvvvvvvvvvvvvvv2 = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 12;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvvvvvv3 = "";
 //BA.debugLineNum = 13;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvvvvvv4 = new Object();
 //BA.debugLineNum = 14;BA.debugLine="Private mBase As Pane";
_vvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private timer1 As Timer";
_vvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 16;BA.debugLine="Private timer2 As Timer";
_vvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 17;BA.debugLine="Private timer3 As Timer";
_vvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 19;BA.debugLine="Private Pane1 As Pane";
_pane1 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private Pane2 As Pane";
_pane2 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private Pane3 As Pane";
_pane3 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 32;BA.debugLine="mBase = Base";
_vvvvvvvvvvvvvvvvvvv5 = _base;
 //BA.debugLineNum = 33;BA.debugLine="mBase.LoadLayout(\"CFBarPreLoaderUI\")";
_vvvvvvvvvvvvvvvvvvv5.LoadLayout(ba,"CFBarPreLoaderUI");
 //BA.debugLineNum = 39;BA.debugLine="timer1.Initialize(\"Timer1\", 400)";
_vvvvvvvvvvvvvvvvvvvv5.Initialize(ba,"Timer1",(long) (400));
 //BA.debugLineNum = 40;BA.debugLine="timer1.Enabled = True";
_vvvvvvvvvvvvvvvvvvvv5.setEnabled(__c.True);
 //BA.debugLineNum = 42;BA.debugLine="timer2.Initialize(\"Timer2\", 400)";
_vvvvvvvvvvvvvvvvvvvv6.Initialize(ba,"Timer2",(long) (400));
 //BA.debugLineNum = 43;BA.debugLine="timer2.Enabled = True";
_vvvvvvvvvvvvvvvvvvvv6.setEnabled(__c.True);
 //BA.debugLineNum = 45;BA.debugLine="timer3.Initialize(\"Timer3\", 400)";
_vvvvvvvvvvvvvvvvvvvv7.Initialize(ba,"Timer3",(long) (400));
 //BA.debugLineNum = 46;BA.debugLine="timer3.Enabled = True";
_vvvvvvvvvvvvvvvvvvvv7.setEnabled(__c.True);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvv2(boolean _enabled) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Private Sub EnableTimers(enabled As Boolean)";
 //BA.debugLineNum = 147;BA.debugLine="timer1.Enabled =  enabled";
_vvvvvvvvvvvvvvvvvvvv5.setEnabled(_enabled);
 //BA.debugLineNum = 148;BA.debugLine="timer2.Enabled =  enabled";
_vvvvvvvvvvvvvvvvvvvv6.setEnabled(_enabled);
 //BA.debugLineNum = 149;BA.debugLine="timer3.Enabled =  enabled";
_vvvvvvvvvvvvvvvvvvvv7.setEnabled(_enabled);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _vvvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 55;BA.debugLine="Return mBase";
if (true) return _vvvvvvvvvvvvvvvvvvv5;
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 25;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 26;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvvvvvv3 = _eventname;
 //BA.debugLineNum = 27;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvvvvvv4 = _callback;
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Public Sub removeEffects()";
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvv7(String _color) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvv0(String _color,int _width) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv6(int _radius) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv7(String _effect) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Public Sub setEffect(effect As String)";
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv2(float _angle) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Public Sub setRotationX(angle As Float)";
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv0(String _color) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Public Sub setTextColor(color As String)";
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Public Sub Start()";
 //BA.debugLineNum = 156;BA.debugLine="EnableTimers(True)";
_vvvvvvvvvvvvvvvvvvvv2(__c.True);
 //BA.debugLineNum = 157;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Animatio";
__c.CallSubDelayed(ba,_vvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvv3+"_AnimationStarted");
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvv4() throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Public Sub Stop()";
 //BA.debugLineNum = 164;BA.debugLine="EnableTimers(False)";
_vvvvvvvvvvvvvvvvvvvv2(__c.False);
 //BA.debugLineNum = 165;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Animatio";
__c.CallSubDelayed(ba,_vvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvv3+"_AnimationStopped");
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return "";
}
public String  _timer1_tick() throws Exception{
int _height = 0;
 //BA.debugLineNum = 63;BA.debugLine="Private Sub Timer1_Tick";
 //BA.debugLineNum = 66;BA.debugLine="Dim height As Int = ( Rnd(30, 100) / 100 ) *  mBa";
_height = (int) ((__c.Rnd((int) (30),(int) (100))/(double)100)*_vvvvvvvvvvvvvvvvvvv5.getPrefHeight());
 //BA.debugLineNum = 68;BA.debugLine="Pane1.SetLayoutAnimated( 300 , Pane1.Left, Pane1.";
_pane1.SetLayoutAnimated((int) (300),_pane1.getLeft(),_pane1.getTop(),_pane1.getPrefWidth(),_height);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public String  _timer2_tick() throws Exception{
int _height = 0;
 //BA.debugLineNum = 72;BA.debugLine="Private Sub Timer2_Tick";
 //BA.debugLineNum = 74;BA.debugLine="Dim height As Int = ( Rnd(30, 100) / 100  ) *  mB";
_height = (int) ((__c.Rnd((int) (30),(int) (100))/(double)100)*_vvvvvvvvvvvvvvvvvvv5.getPrefHeight());
 //BA.debugLineNum = 76;BA.debugLine="Pane2.SetLayoutAnimated(300 , Pane2.Left, Pane2.T";
_pane2.SetLayoutAnimated((int) (300),_pane2.getLeft(),_pane2.getTop(),_pane2.getPrefWidth(),_height);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public String  _timer3_tick() throws Exception{
int _height = 0;
 //BA.debugLineNum = 80;BA.debugLine="Private Sub Timer3_Tick";
 //BA.debugLineNum = 82;BA.debugLine="Dim height As Int =(  Rnd(30, 100) /100 ) *  mBas";
_height = (int) ((__c.Rnd((int) (30),(int) (100))/(double)100)*_vvvvvvvvvvvvvvvvvvv5.getPrefHeight());
 //BA.debugLineNum = 84;BA.debugLine="Pane3.SetLayoutAnimated(300 , Pane3.Left, Pane3.T";
_pane3.SetLayoutAnimated((int) (300),_pane3.getLeft(),_pane3.getTop(),_pane3.getPrefWidth(),_height);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
