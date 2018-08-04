package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmetrolinklabel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmetrolinklabel", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.cfmetrolinklabel.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _mbase = null;
public anywheresoftware.b4j.objects.LabelWrapper _innerlabel = null;
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
 //BA.debugLineNum = 33;BA.debugLine="InnerLabel.PrefWidth = Width";
_innerlabel.setPrefWidth(_width);
 //BA.debugLineNum = 34;BA.debugLine="InnerLabel.PrefHeight =  Height";
_innerlabel.setPrefHeight(_height);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 9;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 10;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 11;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Public InnerLabel As Label";
_innerlabel = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 21;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 22;BA.debugLine="mBase.LoadLayout(\"CFMetroLinkLabelUI\")";
_mbase.LoadLayout(ba,"CFMetroLinkLabelUI");
 //BA.debugLineNum = 25;BA.debugLine="setTextColor(CFStyleManager.DefaultTheme.Get(\"pri";
_settextcolor(BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("primary_text"))));
 //BA.debugLineNum = 26;BA.debugLine="InnerLabel.Font = CFStyleManager.SelectFont(\"Regu";
_innerlabel.setFont(_cfstylemanager._selectfont("Regular",12));
 //BA.debugLineNum = 27;BA.debugLine="InnerLabel.MouseCursor = fx.Cursors.HAND";
_innerlabel.setMouseCursor(_fx.Cursors.HAND);
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
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 16;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 17;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _innerlabel_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Public Sub InnerLabel_MousePressed (EventData As M";
 //BA.debugLineNum = 95;BA.debugLine="fx.ShowExternalDocument(InnerLabel.Text)";
_fx.ShowExternalDocument(_innerlabel.getText());
 //BA.debugLineNum = 97;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MousePr";
__c.CallSubDelayed2(ba,_mcallback,_meventname+"_MousePressed",(Object)(_eventdata));
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects() throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Public Sub removeEffects()";
 //BA.debugLineNum = 86;BA.debugLine="CFControlsUtils.removeEffect(InnerLabel)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_innerlabel.getObject())));
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public String  _setbg(String _color) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 48;BA.debugLine="CFControlsUtils.SetBg( InnerLabel, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_innerlabel.getObject())),_color);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public String  _setborder(String _color,int _width) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 66;BA.debugLine="CFControlsUtils.setBorder(InnerLabel, color, widt";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_innerlabel.getObject())),_color,_width);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(int _radius) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 73;BA.debugLine="CFControlsUtils.setBorderRadius(InnerLabel, radiu";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_innerlabel.getObject())),_radius);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(String _effect) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Public Sub setEffect(effect As String)";
 //BA.debugLineNum = 80;BA.debugLine="CFControlsUtils.setEffect(InnerLabel, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_innerlabel.getObject())),_effect);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(float _angle) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Public Sub setRotationX(angle As Float)";
 //BA.debugLineNum = 60;BA.debugLine="CFControlsUtils.setRotationX(InnerLabel, angle) '";
_cfcontrolsutils._setrotationx((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_innerlabel.getObject())),_angle);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public String  _settextcolor(String _color) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Public Sub setTextColor(color As String)";
 //BA.debugLineNum = 54;BA.debugLine="CFControlsUtils.setTextColor (InnerLabel, color)";
_cfcontrolsutils._settextcolor((anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_innerlabel.getObject())),_color);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
