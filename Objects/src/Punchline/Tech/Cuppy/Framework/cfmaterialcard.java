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
 //BA.debugLineNum = 31;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 33;BA.debugLine="InnerCard.PrefWidth = Width";
_innercard.setPrefWidth(_width);
 //BA.debugLineNum = 34;BA.debugLine="InnerCard.PrefHeight = Height";
_innercard.setPrefHeight(_height);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 11;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 12;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 13;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 14;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Public InnerCard As Pane";
_innercard = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 24;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 25;BA.debugLine="mBase.LoadLayout(\"CFMaterialCardUI\")";
_mbase.LoadLayout(ba,"CFMaterialCardUI");
 //BA.debugLineNum = 27;BA.debugLine="setBorder(CFStyleManager.DefaultTheme.Get(\"divide";
_setborder(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("divider"))),(int) (1));
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 39;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 19;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 20;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public String  _innercard_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub InnerCard_MouseClicked (EventData As MouseEven";
 //BA.debugLineNum = 109;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseCl";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MouseClicked",(Object)(_eventdata));
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public String  _innercard_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub InnerCard_MouseEntered (EventData As MouseEven";
 //BA.debugLineNum = 97;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEn";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MouseEntered",(Object)(_eventdata));
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public String  _innercard_mouseexited(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub InnerCard_MouseExited (EventData As MouseEvent";
 //BA.debugLineNum = 103;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEx";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MouseExited",(Object)(_eventdata));
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public String  _innercard_touch(int _action,float _x,float _y) throws Exception{
anywheresoftware.b4a.objects.collections.Map _points = null;
 //BA.debugLineNum = 84;BA.debugLine="Sub InnerCard_Touch (Action As Int, X As Float, Y";
 //BA.debugLineNum = 86;BA.debugLine="Dim Points As Map";
_points = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 87;BA.debugLine="Points.Initialize";
_points.Initialize();
 //BA.debugLineNum = 88;BA.debugLine="Points.Put(\"X\", X )";
_points.Put((Object)("X"),(Object)(_x));
 //BA.debugLineNum = 89;BA.debugLine="Points.Put(\"Y\", Y )";
_points.Put((Object)("Y"),(Object)(_y));
 //BA.debugLineNum = 91;BA.debugLine="CallSubDelayed3( mCallBack, mEventName & \"_Touch\"";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_Touch",(Object)(_action),(Object)(_points));
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Public Sub removeEffects()";
 //BA.debugLineNum = 78;BA.debugLine="CFControlsUtils.removePaneEffect(InnerCard)";
_cfcontrolsutils._removepaneeffect(_innercard);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _setbg(String _color) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 48;BA.debugLine="CSSUtils.SetStyleProperty( InnerCard, \"-fx-backgr";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innercard.getObject())),"-fx-background-color",_color);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 60;BA.debugLine="CFControlsUtils.setPaneBorder(InnerCard, color, w";
_cfcontrolsutils._setpaneborder(_innercard,_color,_width);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 66;BA.debugLine="CFControlsUtils.setPaneBorderRadius(InnerCard, ra";
_cfcontrolsutils._setpaneborderradius(_innercard,_radius);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _setpaneeffect(String _effect) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Public Sub setPaneEffect(effect As String)";
 //BA.debugLineNum = 72;BA.debugLine="CFControlsUtils.setPaneEffect(InnerCard, effect)";
_cfcontrolsutils._setpaneeffect(_innercard,_effect);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(float _angle) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Public Sub setRotationX(angle As Float)";
 //BA.debugLineNum = 54;BA.debugLine="CFControlsUtils.setPaneRotationX(InnerCard, angle";
_cfcontrolsutils._setpanerotationx(_innercard,_angle);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
