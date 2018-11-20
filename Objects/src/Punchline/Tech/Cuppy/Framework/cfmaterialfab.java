package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmaterialfab extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmaterialfab", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.cfmaterialfab.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _mbase = null;
public anywheresoftware.b4j.objects.LabelWrapper _fab_btn = null;
public b4j.example.cssutils _cssutils = null;
public Punchline.Tech.Cuppy.Framework.main _main = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public Punchline.Tech.Cuppy.Framework.cfanimationmanager _cfanimationmanager = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public String  _base_resize(Punchline.Tech.Cuppy.Framework.cfmaterialfab __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialfab";
if (Debug.shouldDelegate(ba, "base_resize"))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=17104896;
 //BA.debugLineNum = 17104896;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=17104899;
 //BA.debugLineNum = 17104899;BA.debugLine="FAB_Btn.PrefWidth = Width";
__ref._fab_btn.setPrefWidth(_width);
RDebugUtils.currentLine=17104900;
 //BA.debugLineNum = 17104900;BA.debugLine="FAB_Btn.PrefHeight = Width";
__ref._fab_btn.setPrefHeight(_width);
RDebugUtils.currentLine=17104901;
 //BA.debugLineNum = 17104901;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,__ref._mcallback,__ref._meventname+"_Resize",(Object)(_width),(Object)(_height));
RDebugUtils.currentLine=17104903;
 //BA.debugLineNum = 17104903;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(Punchline.Tech.Cuppy.Framework.cfmaterialfab __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialfab";
RDebugUtils.currentLine=16908288;
 //BA.debugLineNum = 16908288;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=16908289;
 //BA.debugLineNum = 16908289;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=16908290;
 //BA.debugLineNum = 16908290;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=16908291;
 //BA.debugLineNum = 16908291;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=16908292;
 //BA.debugLineNum = 16908292;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=16908293;
 //BA.debugLineNum = 16908293;BA.debugLine="Public FAB_Btn As Label";
_fab_btn = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=16908294;
 //BA.debugLineNum = 16908294;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Punchline.Tech.Cuppy.Framework.cfmaterialfab __ref,anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialfab";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=17039360;
 //BA.debugLineNum = 17039360;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
RDebugUtils.currentLine=17039361;
 //BA.debugLineNum = 17039361;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=17039362;
 //BA.debugLineNum = 17039362;BA.debugLine="mBase.LoadLayout(\"CFMaterialFABUI\")";
__ref._mbase.LoadLayout(ba,"CFMaterialFABUI");
RDebugUtils.currentLine=17039365;
 //BA.debugLineNum = 17039365;BA.debugLine="setBg(CFStyleManager.DefaultTheme.Get(\"accent\"))";
__ref._setbg(null,BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("accent"))));
RDebugUtils.currentLine=17039366;
 //BA.debugLineNum = 17039366;BA.debugLine="FAB_Btn.MouseCursor = fx.Cursors.HAND";
__ref._fab_btn.setMouseCursor(__ref._fx.Cursors.HAND);
RDebugUtils.currentLine=17039368;
 //BA.debugLineNum = 17039368;BA.debugLine="End Sub";
return "";
}
public String  _setbg(Punchline.Tech.Cuppy.Framework.cfmaterialfab __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialfab";
if (Debug.shouldDelegate(ba, "setbg"))
	 {return ((String) Debug.delegate(ba, "setbg", new Object[] {_color}));}
RDebugUtils.currentLine=17235968;
 //BA.debugLineNum = 17235968;BA.debugLine="Public Sub setBg(color As String)";
RDebugUtils.currentLine=17235970;
 //BA.debugLineNum = 17235970;BA.debugLine="CFControlsUtils.SetBG( FAB_Btn, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._fab_btn.getObject())),_color);
RDebugUtils.currentLine=17235972;
 //BA.debugLineNum = 17235972;BA.debugLine="End Sub";
return "";
}
public String  _fab_btn_mouseentered(Punchline.Tech.Cuppy.Framework.cfmaterialfab __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialfab";
if (Debug.shouldDelegate(ba, "fab_btn_mouseentered"))
	 {return ((String) Debug.delegate(ba, "fab_btn_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=17825792;
 //BA.debugLineNum = 17825792;BA.debugLine="Private Sub FAB_Btn_MouseEntered (EventData As Mou";
RDebugUtils.currentLine=17825794;
 //BA.debugLineNum = 17825794;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEn";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_MouseEntered",(Object)(_eventdata));
RDebugUtils.currentLine=17825796;
 //BA.debugLineNum = 17825796;BA.debugLine="End Sub";
return "";
}
public String  _fab_btn_mouseexited(Punchline.Tech.Cuppy.Framework.cfmaterialfab __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialfab";
if (Debug.shouldDelegate(ba, "fab_btn_mouseexited"))
	 {return ((String) Debug.delegate(ba, "fab_btn_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Private Sub FAB_Btn_MouseExited (EventData As Mous";
RDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEx";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_MouseExited",(Object)(_eventdata));
RDebugUtils.currentLine=17891332;
 //BA.debugLineNum = 17891332;BA.debugLine="End Sub";
return "";
}
public String  _fab_btn_mousepressed(Punchline.Tech.Cuppy.Framework.cfmaterialfab __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialfab";
if (Debug.shouldDelegate(ba, "fab_btn_mousepressed"))
	 {return ((String) Debug.delegate(ba, "fab_btn_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=17760256;
 //BA.debugLineNum = 17760256;BA.debugLine="Private Sub FAB_Btn_MousePressed (EventData As Mou";
RDebugUtils.currentLine=17760258;
 //BA.debugLineNum = 17760258;BA.debugLine="FAB_Btn.RequestFocus 'set focus";
__ref._fab_btn.RequestFocus();
RDebugUtils.currentLine=17760260;
 //BA.debugLineNum = 17760260;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MousePr";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_MousePressed",(Object)(_eventdata));
RDebugUtils.currentLine=17760262;
 //BA.debugLineNum = 17760262;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase(Punchline.Tech.Cuppy.Framework.cfmaterialfab __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialfab";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=17170432;
 //BA.debugLineNum = 17170432;BA.debugLine="Public Sub GetBase As Pane";
RDebugUtils.currentLine=17170433;
 //BA.debugLineNum = 17170433;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=17170434;
 //BA.debugLineNum = 17170434;BA.debugLine="End Sub";
return null;
}
public String  _geticon(Punchline.Tech.Cuppy.Framework.cfmaterialfab __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialfab";
if (Debug.shouldDelegate(ba, "geticon"))
	 {return ((String) Debug.delegate(ba, "geticon", null));}
RDebugUtils.currentLine=17694720;
 //BA.debugLineNum = 17694720;BA.debugLine="Public Sub getIcon As String";
RDebugUtils.currentLine=17694722;
 //BA.debugLineNum = 17694722;BA.debugLine="Return FAB_Btn.Text";
if (true) return __ref._fab_btn.getText();
RDebugUtils.currentLine=17694724;
 //BA.debugLineNum = 17694724;BA.debugLine="End Sub";
return "";
}
public String  _initialize(Punchline.Tech.Cuppy.Framework.cfmaterialfab __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cfmaterialfab";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=16973824;
 //BA.debugLineNum = 16973824;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=16973825;
 //BA.debugLineNum = 16973825;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=16973826;
 //BA.debugLineNum = 16973826;BA.debugLine="mCallBack = Callback";
__ref._mcallback = _callback;
RDebugUtils.currentLine=16973827;
 //BA.debugLineNum = 16973827;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects(Punchline.Tech.Cuppy.Framework.cfmaterialfab __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialfab";
if (Debug.shouldDelegate(ba, "removeeffects"))
	 {return ((String) Debug.delegate(ba, "removeeffects", null));}
RDebugUtils.currentLine=17498112;
 //BA.debugLineNum = 17498112;BA.debugLine="Public Sub RemoveEffects()";
RDebugUtils.currentLine=17498114;
 //BA.debugLineNum = 17498114;BA.debugLine="CFControlsUtils.removeEffect(FAB_Btn)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._fab_btn.getObject())));
RDebugUtils.currentLine=17498116;
 //BA.debugLineNum = 17498116;BA.debugLine="End Sub";
return "";
}
public String  _setborder(Punchline.Tech.Cuppy.Framework.cfmaterialfab __ref,String _color,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialfab";
if (Debug.shouldDelegate(ba, "setborder"))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_color,_width}));}
RDebugUtils.currentLine=17301504;
 //BA.debugLineNum = 17301504;BA.debugLine="Public Sub setBorder(color As String , width As In";
RDebugUtils.currentLine=17301506;
 //BA.debugLineNum = 17301506;BA.debugLine="CFControlsUtils.setBorder(FAB_Btn, color, width)";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._fab_btn.getObject())),_color,_width);
RDebugUtils.currentLine=17301508;
 //BA.debugLineNum = 17301508;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(Punchline.Tech.Cuppy.Framework.cfmaterialfab __ref,int _radius) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialfab";
if (Debug.shouldDelegate(ba, "setborderradius"))
	 {return ((String) Debug.delegate(ba, "setborderradius", new Object[] {_radius}));}
RDebugUtils.currentLine=17367040;
 //BA.debugLineNum = 17367040;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
RDebugUtils.currentLine=17367042;
 //BA.debugLineNum = 17367042;BA.debugLine="CFControlsUtils.setBorderRadius(FAB_Btn, radius)";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._fab_btn.getObject())),_radius);
RDebugUtils.currentLine=17367044;
 //BA.debugLineNum = 17367044;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(Punchline.Tech.Cuppy.Framework.cfmaterialfab __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialfab";
if (Debug.shouldDelegate(ba, "seteffect"))
	 {return ((String) Debug.delegate(ba, "seteffect", new Object[] {_effect}));}
RDebugUtils.currentLine=17432576;
 //BA.debugLineNum = 17432576;BA.debugLine="Public Sub setEffect(effect As String)";
RDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="CFControlsUtils.setEffect(FAB_Btn, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._fab_btn.getObject())),_effect);
RDebugUtils.currentLine=17432580;
 //BA.debugLineNum = 17432580;BA.debugLine="End Sub";
return "";
}
public String  _seticon(Punchline.Tech.Cuppy.Framework.cfmaterialfab __ref,String _icontext) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialfab";
if (Debug.shouldDelegate(ba, "seticon"))
	 {return ((String) Debug.delegate(ba, "seticon", new Object[] {_icontext}));}
RDebugUtils.currentLine=17629184;
 //BA.debugLineNum = 17629184;BA.debugLine="Public Sub setIcon(IconText As String)";
RDebugUtils.currentLine=17629186;
 //BA.debugLineNum = 17629186;BA.debugLine="FAB_Btn.Text = IconText";
__ref._fab_btn.setText(_icontext);
RDebugUtils.currentLine=17629188;
 //BA.debugLineNum = 17629188;BA.debugLine="End Sub";
return "";
}
public String  _setrotation(Punchline.Tech.Cuppy.Framework.cfmaterialfab __ref,float _angle) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialfab";
if (Debug.shouldDelegate(ba, "setrotation"))
	 {return ((String) Debug.delegate(ba, "setrotation", new Object[] {_angle}));}
RDebugUtils.currentLine=17563648;
 //BA.debugLineNum = 17563648;BA.debugLine="Public Sub setRotation(angle As Float)";
RDebugUtils.currentLine=17563650;
 //BA.debugLineNum = 17563650;BA.debugLine="CFControlsUtils.setRotation(FAB_Btn, angle) 'rota";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._fab_btn.getObject())),_angle);
RDebugUtils.currentLine=17563652;
 //BA.debugLineNum = 17563652;BA.debugLine="End Sub";
return "";
}
}