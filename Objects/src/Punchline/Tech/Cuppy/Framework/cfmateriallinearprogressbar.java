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
public anywheresoftware.b4j.objects.JFX _vvvvvvvvvvvvvvvv2 = null;
public String _vvvvvvvvvvvvvvvvvvv3 = "";
public Object _vvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _vvvvvvvvvvvvvvvvvvv5 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _progressbar = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _progresspane = null;
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
 //BA.debugLineNum = 37;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 39;BA.debugLine="ProgressPane.PrefWidth = Width";
_progresspane.setPrefWidth(_width);
 //BA.debugLineNum = 40;BA.debugLine="ProgressPane.PrefHeight = Height";
_progresspane.setPrefHeight(_height);
 //BA.debugLineNum = 41;BA.debugLine="ProgressBar.PrefHeight = Height";
_progressbar.setPrefHeight(_height);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 14;BA.debugLine="Private fx As JFX";
_vvvvvvvvvvvvvvvv2 = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 15;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvvvvvv3 = "";
 //BA.debugLineNum = 16;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvvvvvv4 = new Object();
 //BA.debugLineNum = 17;BA.debugLine="Private mBase As Pane";
_vvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Public ProgressBar As Pane";
_progressbar = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Public ProgressPane As Pane";
_progresspane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 28;BA.debugLine="mBase = Base";
_vvvvvvvvvvvvvvvvvvv5 = _base;
 //BA.debugLineNum = 29;BA.debugLine="mBase.LoadLayout(\"CFMaterialLinearProgressBarUI\")";
_vvvvvvvvvvvvvvvvvvv5.LoadLayout(ba,"CFMaterialLinearProgressBarUI");
 //BA.debugLineNum = 31;BA.debugLine="SetBg(CFStyleManager.DefaultTheme.Get(\"divider\"))";
_vvvvvvvvvvvvvv7(BA.ObjectToString(_vvvvvvvvvvvvvvvv5._vv5.Get((Object)("divider"))));
 //BA.debugLineNum = 32;BA.debugLine="setProgressColor(CFStyleManager.DefaultTheme.Get(";
_setvvvvvvvvvvvvvvvvvvvvvv3(BA.ObjectToString(_vvvvvvvvvvvvvvvv5._vv5.Get((Object)("primary"))));
 //BA.debugLineNum = 33;BA.debugLine="progress(30) 'set initial value";
_vvvvvvvvvvvvvvvvvvvvvv1((int) (30));
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _vvvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 46;BA.debugLine="Return mBase";
if (true) return _vvvvvvvvvvvvvvvvvvv5;
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 23;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvvvvvv3 = _eventname;
 //BA.debugLineNum = 24;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvvvvvv4 = _callback;
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvv1(int _value) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Public Sub progress(value As Int)";
 //BA.debugLineNum = 99;BA.debugLine="If value >= 100 Then";
if (_value>=100) { 
 //BA.debugLineNum = 100;BA.debugLine="value = 100";
_value = (int) (100);
 //BA.debugLineNum = 103;BA.debugLine="CallSub(mCallBack, mEventName & \"_ProgressFinish";
__c.CallSubNew(ba,_vvvvvvvvvvvvvvvvvvv4,_vvvvvvvvvvvvvvvvvvv3+"_ProgressFinished");
 };
 //BA.debugLineNum = 107;BA.debugLine="ProgressBar.SetLayoutAnimated(400, 0 ,0 ,(value /";
_progressbar.SetLayoutAnimated((int) (400),0,0,(_value/(double)100)*_vvvvvvvvvvvvvvvvvvv5.getPrefWidth(),_vvvvvvvvvvvvvvvvvvv5.getPrefHeight());
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Public Sub removeEffects()";
 //BA.debugLineNum = 85;BA.debugLine="CFControlsUtils.removePaneEffect(ProgressPane)";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvv5(_progresspane);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvv7(String _color) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 55;BA.debugLine="CSSUtils.SetStyleProperty( ProgressPane, \"-fx-bac";
_vvvvvvvvvvvvvvvv3._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_progresspane.getObject())),"-fx-background-color",_color);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvv0(String _color,int _width) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 67;BA.debugLine="CFControlsUtils.setPaneBorder(ProgressPane, color";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvv4(_progresspane,_color,_width);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv6(int _radius) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 73;BA.debugLine="CFControlsUtils.setPaneBorderRadius(ProgressPane,";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvv5(_progresspane,_radius);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv1(String _effect) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Public Sub setPaneEffect(effect As String)";
 //BA.debugLineNum = 79;BA.debugLine="CFControlsUtils.setPaneEffect(ProgressPane, effec";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvv6(_progresspane,_effect);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvv3(String _color) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Public Sub setProgressColor(color As String)";
 //BA.debugLineNum = 93;BA.debugLine="CSSUtils.SetStyleProperty( ProgressBar, \"-fx-back";
_vvvvvvvvvvvvvvvv3._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_progressbar.getObject())),"-fx-background-color",_color);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv2(float _angle) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Public Sub setRotationX(angle As Float)";
 //BA.debugLineNum = 61;BA.debugLine="CFControlsUtils.setPaneRotationX(ProgressPane, an";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvv7(_progresspane,_angle);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
