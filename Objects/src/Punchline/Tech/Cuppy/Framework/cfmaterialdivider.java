package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmaterialdivider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmaterialdivider", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.cfmaterialdivider.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _mbase = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _line = null;
public b4j.example.cssutils _cssutils = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 45;BA.debugLine="line.PrefWidth = Width";
_line.setPrefWidth(_width);
 //BA.debugLineNum = 47;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 13;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 14;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 15;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Public line As Pane";
_line = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 25;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 26;BA.debugLine="mBase.LoadLayout(\"CFMaterialDividerUI\")";
_mbase.LoadLayout(ba,"CFMaterialDividerUI");
 //BA.debugLineNum = 28;BA.debugLine="SetBg(CFStyleManager.DefaultTheme.Get(\"divider\"))";
_setbg(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("divider"))));
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 52;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public double  _getsize() throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Public Sub GetSize() As Double";
 //BA.debugLineNum = 108;BA.debugLine="Return line.PrefHeight";
if (true) return _line.getPrefHeight();
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 20;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 21;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 92;BA.debugLine="CFControlsUtils.removePaneEffect(line)";
_cfcontrolsutils._removepaneeffect(_line);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public String  _setbg(String _color) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 62;BA.debugLine="CFControlsUtils.SetPaneBG(line  , color)";
_cfcontrolsutils._setpanebg(_line,_color);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Public Sub SetBorder(color As String , width As In";
 //BA.debugLineNum = 74;BA.debugLine="CFControlsUtils.setPaneBorder(line, color, width)";
_cfcontrolsutils._setpaneborder(_line,_color,_width);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Public Sub SetBorderRadius(radius As Int)";
 //BA.debugLineNum = 80;BA.debugLine="CFControlsUtils.setPaneBorderRadius(line, radius)";
_cfcontrolsutils._setpaneborderradius(_line,_radius);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public String  _setpaneeffect(String _effect) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Public Sub SetPaneEffect(effect As String)";
 //BA.debugLineNum = 86;BA.debugLine="CFControlsUtils.setPaneEffect(line, effect)";
_cfcontrolsutils._setpaneeffect(_line,_effect);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(float _angle) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Public Sub SetRotationX(angle As Float)";
 //BA.debugLineNum = 68;BA.debugLine="CFControlsUtils.setPaneRotationX(line, angle) 'ro";
_cfcontrolsutils._setpanerotationx(_line,_angle);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public String  _setsize(int _sizex) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Public Sub SetSize(sizeX As Int)";
 //BA.debugLineNum = 102;BA.debugLine="line.PrefHeight =  sizeX";
_line.setPrefHeight(_sizex);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
