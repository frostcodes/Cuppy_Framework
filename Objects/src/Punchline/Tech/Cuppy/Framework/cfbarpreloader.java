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
public anywheresoftware.b4a.objects.Timer _vvvvvvvvvvvvvvvvvvvv2 = null;
public anywheresoftware.b4a.objects.Timer _vvvvvvvvvvvvvvvvvvvv3 = null;
public anywheresoftware.b4a.objects.Timer _vvvvvvvvvvvvvvvvvvvv4 = null;
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
 //BA.debugLineNum = 51;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 16;BA.debugLine="Private timer1 As Timer";
_vvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 17;BA.debugLine="Private timer2 As Timer";
_vvvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 18;BA.debugLine="Private timer3 As Timer";
_vvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 20;BA.debugLine="Private Pane1 As Pane";
_pane1 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private Pane2 As Pane";
_pane2 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private Pane3 As Pane";
_pane3 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 33;BA.debugLine="mBase = Base";
_vvvvvvvvvvvvvvvvvvv5 = _base;
 //BA.debugLineNum = 34;BA.debugLine="mBase.LoadLayout(\"CFBarPreLoaderUI\")";
_vvvvvvvvvvvvvvvvvvv5.LoadLayout(ba,"CFBarPreLoaderUI");
 //BA.debugLineNum = 40;BA.debugLine="timer1.Initialize(\"Timer1\", 400)";
_vvvvvvvvvvvvvvvvvvvv2.Initialize(ba,"Timer1",(long) (400));
 //BA.debugLineNum = 41;BA.debugLine="timer1.Enabled = True";
_vvvvvvvvvvvvvvvvvvvv2.setEnabled(__c.True);
 //BA.debugLineNum = 43;BA.debugLine="timer2.Initialize(\"Timer2\", 400)";
_vvvvvvvvvvvvvvvvvvvv3.Initialize(ba,"Timer2",(long) (400));
 //BA.debugLineNum = 44;BA.debugLine="timer2.Enabled = True";
_vvvvvvvvvvvvvvvvvvvv3.setEnabled(__c.True);
 //BA.debugLineNum = 46;BA.debugLine="timer3.Initialize(\"Timer3\", 400)";
_vvvvvvvvvvvvvvvvvvvv4.Initialize(ba,"Timer3",(long) (400));
 //BA.debugLineNum = 47;BA.debugLine="timer3.Enabled = True";
_vvvvvvvvvvvvvvvvvvvv4.setEnabled(__c.True);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _vvvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 56;BA.debugLine="Return mBase";
if (true) return _vvvvvvvvvvvvvvvvvvv5;
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 26;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 27;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvvvvvv3 = _eventname;
 //BA.debugLineNum = 28;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvvvvvv4 = _callback;
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Public Sub removeEffects()";
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvv7(String _color) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvv0(String _color,int _width) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv6(int _radius) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv7(String _effect) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Public Sub setEffect(effect As String)";
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv2(float _angle) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Public Sub setRotationX(angle As Float)";
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv0(String _color) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Public Sub setTextColor(color As String)";
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public String  _timer1_tick() throws Exception{
int _height = 0;
 //BA.debugLineNum = 64;BA.debugLine="Private Sub Timer1_Tick";
 //BA.debugLineNum = 67;BA.debugLine="Dim height As Int = ( Rnd(30, 100) / 100 ) *  mBa";
_height = (int) ((__c.Rnd((int) (30),(int) (100))/(double)100)*_vvvvvvvvvvvvvvvvvvv5.getPrefHeight());
 //BA.debugLineNum = 69;BA.debugLine="Pane1.SetLayoutAnimated( 300 , Pane1.Left, Pane1.";
_pane1.SetLayoutAnimated((int) (300),_pane1.getLeft(),_pane1.getTop(),_pane1.getPrefWidth(),_height);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public String  _timer2_tick() throws Exception{
int _height = 0;
 //BA.debugLineNum = 73;BA.debugLine="Private Sub Timer2_Tick";
 //BA.debugLineNum = 75;BA.debugLine="Dim height As Int = ( Rnd(30, 100) / 100  ) *  mB";
_height = (int) ((__c.Rnd((int) (30),(int) (100))/(double)100)*_vvvvvvvvvvvvvvvvvvv5.getPrefHeight());
 //BA.debugLineNum = 77;BA.debugLine="Pane2.SetLayoutAnimated(300 , Pane2.Left, Pane2.T";
_pane2.SetLayoutAnimated((int) (300),_pane2.getLeft(),_pane2.getTop(),_pane2.getPrefWidth(),_height);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public String  _timer3_tick() throws Exception{
int _height = 0;
 //BA.debugLineNum = 81;BA.debugLine="Private Sub Timer3_Tick";
 //BA.debugLineNum = 83;BA.debugLine="Dim height As Int =(  Rnd(30, 100) /100 ) *  mBas";
_height = (int) ((__c.Rnd((int) (30),(int) (100))/(double)100)*_vvvvvvvvvvvvvvvvvvv5.getPrefHeight());
 //BA.debugLineNum = 85;BA.debugLine="Pane3.SetLayoutAnimated(300 , Pane3.Left, Pane3.T";
_pane3.SetLayoutAnimated((int) (300),_pane3.getLeft(),_pane3.getTop(),_pane3.getPrefWidth(),_height);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
