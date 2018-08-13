package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmaterialcard extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmaterialcard", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.cfmaterialcard.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _mbase = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _innercard = null;
public b4j.example.cssutils _cssutils = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public Punchline.Tech.Cuppy.Framework.cfanimationmanager _cfanimationmanager = null;
public Punchline.Tech.Cuppy.Framework.cflicensemanager _cflicensemanager = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public Punchline.Tech.Cuppy.Framework.cfhtmlutility _cfhtmlutility = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 38;BA.debugLine="InnerCard.PrefWidth = Width";
_innercard.setPrefWidth(_width);
 //BA.debugLineNum = 39;BA.debugLine="InnerCard.PrefHeight = Height";
_innercard.setPrefHeight(_height);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 17;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 18;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 19;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Public InnerCard As Pane";
_innercard = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 29;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 30;BA.debugLine="mBase.LoadLayout(\"CFMaterialCardUI\")";
_mbase.LoadLayout(ba,"CFMaterialCardUI");
 //BA.debugLineNum = 32;BA.debugLine="SetBorder(CFStyleManager.DefaultTheme.Get(\"divide";
_setborder(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("divider"))),(int) (1));
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 44;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 23;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 24;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 25;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public String  _innercard_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Private Sub InnerCard_MouseClicked (EventData As M";
 //BA.debugLineNum = 114;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseCl";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MouseClicked",(Object)(_eventdata));
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public String  _innercard_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Private Sub InnerCard_MouseEntered (EventData As M";
 //BA.debugLineNum = 102;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEn";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MouseEntered",(Object)(_eventdata));
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public String  _innercard_mouseexited(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Private Sub InnerCard_MouseExited (EventData As Mo";
 //BA.debugLineNum = 108;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEx";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MouseExited",(Object)(_eventdata));
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public String  _innercard_touch(int _action,float _x,float _y) throws Exception{
anywheresoftware.b4a.objects.collections.Map _points = null;
 //BA.debugLineNum = 89;BA.debugLine="Private Sub InnerCard_Touch (Action As Int, X As F";
 //BA.debugLineNum = 91;BA.debugLine="Dim Points As Map";
_points = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 92;BA.debugLine="Points.Initialize";
_points.Initialize();
 //BA.debugLineNum = 93;BA.debugLine="Points.Put(\"X\", X )";
_points.Put((Object)("X"),(Object)(_x));
 //BA.debugLineNum = 94;BA.debugLine="Points.Put(\"Y\", Y )";
_points.Put((Object)("Y"),(Object)(_y));
 //BA.debugLineNum = 96;BA.debugLine="CallSubDelayed3( mCallBack, mEventName & \"_Touch\"";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_Touch",(Object)(_action),(Object)(_points));
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 83;BA.debugLine="CFControlsUtils.removePaneEffect(InnerCard)";
_cfcontrolsutils._removepaneeffect(_innercard);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public String  _setbg(String _color) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 53;BA.debugLine="CFControlsUtils.SetPaneBG( InnerCard, color)";
_cfcontrolsutils._setpanebg(_innercard,_color);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Public Sub SetBorder(color As String , width As In";
 //BA.debugLineNum = 65;BA.debugLine="CFControlsUtils.setPaneBorder(InnerCard, color, w";
_cfcontrolsutils._setpaneborder(_innercard,_color,_width);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Public Sub SetBorderRadius(radius As Int)";
 //BA.debugLineNum = 71;BA.debugLine="CFControlsUtils.setPaneBorderRadius(InnerCard, ra";
_cfcontrolsutils._setpaneborderradius(_innercard,_radius);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public String  _setpaneeffect(String _effect) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Public Sub SetPaneEffect(effect As String)";
 //BA.debugLineNum = 77;BA.debugLine="CFControlsUtils.setPaneEffect(InnerCard, effect)";
_cfcontrolsutils._setpaneeffect(_innercard,_effect);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(float _angle) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Public Sub SetRotationX(angle As Float)";
 //BA.debugLineNum = 59;BA.debugLine="CFControlsUtils.setPaneRotationX(InnerCard, angle";
_cfcontrolsutils._setpanerotationx(_innercard,_angle);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
