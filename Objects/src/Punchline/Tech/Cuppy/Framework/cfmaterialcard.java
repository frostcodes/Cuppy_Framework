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
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 40;BA.debugLine="InnerCard.PrefWidth = Width";
_innercard.setPrefWidth(_width);
 //BA.debugLineNum = 41;BA.debugLine="InnerCard.PrefHeight = Height";
_innercard.setPrefHeight(_height);
 //BA.debugLineNum = 43;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_Resize",(Object)(_width),(Object)(_height));
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 19;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 20;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 21;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Public InnerCard As Pane";
_innercard = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 31;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 32;BA.debugLine="mBase.LoadLayout(\"CFMaterialCardUI\")";
_mbase.LoadLayout(ba,"CFMaterialCardUI");
 //BA.debugLineNum = 34;BA.debugLine="SetBorder(CFStyleManager.DefaultTheme.Get(\"divide";
_setborder(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("divider"))),(int) (1));
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 48;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 25;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 26;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 27;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _innercard_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Private Sub InnerCard_MouseClicked (EventData As M";
 //BA.debugLineNum = 118;BA.debugLine="InnerCard.RequestFocus 'set focus";
_innercard.RequestFocus();
 //BA.debugLineNum = 119;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseCl";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MouseClicked",(Object)(_eventdata));
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public String  _innercard_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Private Sub InnerCard_MouseEntered (EventData As M";
 //BA.debugLineNum = 106;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEn";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MouseEntered",(Object)(_eventdata));
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public String  _innercard_mouseexited(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Private Sub InnerCard_MouseExited (EventData As Mo";
 //BA.debugLineNum = 112;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEx";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MouseExited",(Object)(_eventdata));
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public String  _innercard_touch(int _action,float _x,float _y) throws Exception{
anywheresoftware.b4a.objects.collections.Map _points = null;
 //BA.debugLineNum = 93;BA.debugLine="Private Sub InnerCard_Touch (Action As Int, X As F";
 //BA.debugLineNum = 95;BA.debugLine="Dim Points As Map";
_points = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 96;BA.debugLine="Points.Initialize";
_points.Initialize();
 //BA.debugLineNum = 97;BA.debugLine="Points.Put(\"X\", X )";
_points.Put((Object)("X"),(Object)(_x));
 //BA.debugLineNum = 98;BA.debugLine="Points.Put(\"Y\", Y )";
_points.Put((Object)("Y"),(Object)(_y));
 //BA.debugLineNum = 100;BA.debugLine="CallSubDelayed3( mCallBack, mEventName & \"_Touch\"";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_Touch",(Object)(_action),(Object)(_points));
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Public Sub RemoveEffects()";
 //BA.debugLineNum = 87;BA.debugLine="CFControlsUtils.removeEffect(InnerCard)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innercard.getObject())));
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public String  _setbg(String _color) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 57;BA.debugLine="CFControlsUtils.SetBG( InnerCard, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innercard.getObject())),_color);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Public Sub SetBorder(color As String , width As In";
 //BA.debugLineNum = 69;BA.debugLine="CFControlsUtils.setBorder(InnerCard, color, width";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innercard.getObject())),_color,_width);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Public Sub SetBorderRadius(radius As Int)";
 //BA.debugLineNum = 75;BA.debugLine="CFControlsUtils.setBorderRadius(InnerCard, radius";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innercard.getObject())),_radius);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public String  _setpaneeffect(String _effect) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Public Sub SetPaneEffect(effect As String)";
 //BA.debugLineNum = 81;BA.debugLine="CFControlsUtils.setEffect(InnerCard, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innercard.getObject())),_effect);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(float _angle) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Public Sub SetRotationX(angle As Float)";
 //BA.debugLineNum = 63;BA.debugLine="CFControlsUtils.setRotation(InnerCard, angle) 'ro";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_innercard.getObject())),_angle);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
