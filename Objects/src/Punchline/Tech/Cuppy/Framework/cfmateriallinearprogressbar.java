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
public anywheresoftware.b4j.objects.JFX _vvvvvvvvvvvvvvvvvvv1 = null;
public String _vvvvvvvvvvvvvvvvvvv2 = "";
public Object _vvvvvvvvvvvvvvvvvvv3 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _vvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _progressbar = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _progresspane = null;
public b4j.example.cssutils _vvvvvvvvvvvvvvvvvvv5 = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _vvvvvvvvvvvvvvvvvvv6 = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _vvvvvvvvvvvvvvvvvvv7 = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _vvvvvvvvvvvvvvvvvvv0 = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _vvvvvvvvvvvvvvvvvvvv1 = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _vvvvvvvvvvvvvvvvvvvv2 = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _vvvvvvvvvvvvvvvvvvvv3 = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _vvvvvvvvvvvvvvvvvvvv5 = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _vvvvvvvvvvvvvvvvvvvv6 = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _vvvvvvvvvvvvvvvvvvvv7 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 55;BA.debugLine="ProgressPane.PrefWidth = Width";
_progresspane.setPrefWidth(_width);
 //BA.debugLineNum = 56;BA.debugLine="ProgressPane.PrefHeight = Height";
_progresspane.setPrefHeight(_height);
 //BA.debugLineNum = 57;BA.debugLine="ProgressBar.PrefHeight = Height";
_progressbar.setPrefHeight(_height);
 //BA.debugLineNum = 59;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,_vvvvvvvvvvvvvvvvvvv3,_vvvvvvvvvvvvvvvvvvv2+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 29;BA.debugLine="Private fx As JFX";
_vvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 30;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvvvvvv2 = "";
 //BA.debugLineNum = 31;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvvvvvv3 = new Object();
 //BA.debugLineNum = 32;BA.debugLine="Private mBase As Pane";
_vvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Public ProgressBar As Pane";
_progressbar = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Public ProgressPane As Pane";
_progresspane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 43;BA.debugLine="mBase = Base";
_vvvvvvvvvvvvvvvvvvv4 = _base;
 //BA.debugLineNum = 44;BA.debugLine="mBase.LoadLayout(\"CFMaterialLinearProgressBarUI\")";
_vvvvvvvvvvvvvvvvvvv4.LoadLayout(ba,"CFMaterialLinearProgressBarUI");
 //BA.debugLineNum = 46;BA.debugLine="SetBg(CFStyleManager.DefaultTheme.Get(\"divider\"))";
_setvvvvvvvvvvvvvvvvvv2(BA.ObjectToString(_vvvvvvvvvvvvvvvvvvvv2._vvvvvvvvv6.Get((Object)("divider"))));
 //BA.debugLineNum = 47;BA.debugLine="setProgressColor(CFStyleManager.DefaultTheme.Get(";
_setvvvvvvvvvvvvvvvvvvvvvvvvvv2(BA.ObjectToString(_vvvvvvvvvvvvvvvvvvvv2._vvvvvvvvv6.Get((Object)("primary"))));
 //BA.debugLineNum = 49;BA.debugLine="setProgress(Props.Get(\"Progress\")) 'set initial p";
_setvvvvvvvvvvvvvvvvvvvvvvvvvv1((int)(BA.ObjectToNumber(_props.Get((Object)("Progress")))));
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _vvvvvvvvvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 64;BA.debugLine="Return mBase";
if (true) return _vvvvvvvvvvvvvvvvvvv4;
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public int  _getvvvvvvvvvvvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Public Sub getProgress()  As Int";
 //BA.debugLineNum = 131;BA.debugLine="Return (ProgressBar.PrefWidth / mBase.PrefWidth )";
if (true) return (int) ((_progressbar.getPrefWidth()/(double)_vvvvvvvvvvvvvvvvvvv4.getPrefWidth())*100);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 37;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 38;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvvvvvv2 = _eventname;
 //BA.debugLineNum = 39;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvvvvvv3 = _callback;
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 103;BA.debugLine="CFControlsUtils.RemoveEffect(ProgressPane)";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvv2((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_progresspane.getObject())));
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv2(String _color) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Public Sub setBg(color As String)";
 //BA.debugLineNum = 73;BA.debugLine="CFControlsUtils.SetBG( ProgressPane, color)";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvv5((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_progresspane.getObject())),_color);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvv6(String _color,int _width) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 85;BA.debugLine="CFControlsUtils.SetBorder(ProgressPane, color, wi";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvv6((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_progresspane.getObject())),_color,_width);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv3(int _radius) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 91;BA.debugLine="CFControlsUtils.SetBorderRadius(ProgressPane, rad";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvv0((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_progresspane.getObject())),_radius);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv4(String _effect) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Public Sub setEffect(effect As String)";
 //BA.debugLineNum = 97;BA.debugLine="CFControlsUtils.SetEffect(ProgressPane, effect)";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvvv2((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_progresspane.getObject())),_effect);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvv1(int _value) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Public Sub setProgress(value As Int)";
 //BA.debugLineNum = 117;BA.debugLine="If value >= 100 Then";
if (_value>=100) { 
 //BA.debugLineNum = 118;BA.debugLine="value = 100";
_value = (int) (100);
 //BA.debugLineNum = 121;BA.debugLine="CallSub(mCallBack, mEventName & \"_ProgressFinish";
__c.CallSubNew(ba,_vvvvvvvvvvvvvvvvvvv3,_vvvvvvvvvvvvvvvvvvv2+"_ProgressFinished");
 };
 //BA.debugLineNum = 125;BA.debugLine="ProgressBar.SetLayoutAnimated(400, 0 ,0 , (value";
_progressbar.SetLayoutAnimated((int) (400),0,0,(_value/(double)100)*_vvvvvvvvvvvvvvvvvvv4.getPrefWidth(),_vvvvvvvvvvvvvvvvvvv4.getPrefHeight());
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvv2(String _color) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Public Sub setProgressColor(color As String)";
 //BA.debugLineNum = 111;BA.debugLine="CFControlsUtils.SetBG( ProgressBar, color)";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvv5((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_progressbar.getObject())),_color);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv0(float _angle) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Public Sub setRotation(angle As Float)";
 //BA.debugLineNum = 79;BA.debugLine="CFControlsUtils.SetRotation(ProgressPane, angle)";
_vvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvvv3((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_progresspane.getObject())),_angle);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
