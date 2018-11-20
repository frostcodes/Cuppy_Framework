package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmaterialcard extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmaterialcard", this);
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
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _innercard = null;
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
public String  _base_resize(Punchline.Tech.Cuppy.Framework.cfmaterialcard __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcard";
if (Debug.shouldDelegate(ba, "base_resize"))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=24248320;
 //BA.debugLineNum = 24248320;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=24248322;
 //BA.debugLineNum = 24248322;BA.debugLine="InnerCard.PrefWidth = Width";
__ref._innercard.setPrefWidth(_width);
RDebugUtils.currentLine=24248323;
 //BA.debugLineNum = 24248323;BA.debugLine="InnerCard.PrefHeight = Height";
__ref._innercard.setPrefHeight(_height);
RDebugUtils.currentLine=24248325;
 //BA.debugLineNum = 24248325;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,__ref._mcallback,__ref._meventname+"_Resize",(Object)(_width),(Object)(_height));
RDebugUtils.currentLine=24248327;
 //BA.debugLineNum = 24248327;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(Punchline.Tech.Cuppy.Framework.cfmaterialcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcard";
RDebugUtils.currentLine=24051712;
 //BA.debugLineNum = 24051712;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=24051713;
 //BA.debugLineNum = 24051713;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=24051714;
 //BA.debugLineNum = 24051714;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=24051715;
 //BA.debugLineNum = 24051715;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=24051716;
 //BA.debugLineNum = 24051716;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=24051717;
 //BA.debugLineNum = 24051717;BA.debugLine="Public InnerCard As Pane";
_innercard = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=24051718;
 //BA.debugLineNum = 24051718;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Punchline.Tech.Cuppy.Framework.cfmaterialcard __ref,anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcard";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=24182784;
 //BA.debugLineNum = 24182784;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
RDebugUtils.currentLine=24182785;
 //BA.debugLineNum = 24182785;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=24182786;
 //BA.debugLineNum = 24182786;BA.debugLine="mBase.LoadLayout(\"CFMaterialCardUI\")";
__ref._mbase.LoadLayout(ba,"CFMaterialCardUI");
RDebugUtils.currentLine=24182788;
 //BA.debugLineNum = 24182788;BA.debugLine="SetBorder(CFStyleManager.DefaultTheme.Get(\"divide";
__ref._setborder(null,BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("divider"))),(int) (1));
RDebugUtils.currentLine=24182790;
 //BA.debugLineNum = 24182790;BA.debugLine="End Sub";
return "";
}
public String  _setborder(Punchline.Tech.Cuppy.Framework.cfmaterialcard __ref,String _color,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcard";
if (Debug.shouldDelegate(ba, "setborder"))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_color,_width}));}
RDebugUtils.currentLine=24510464;
 //BA.debugLineNum = 24510464;BA.debugLine="Public Sub setBorder(color As String , width As In";
RDebugUtils.currentLine=24510466;
 //BA.debugLineNum = 24510466;BA.debugLine="CFControlsUtils.setBorder(InnerCard, color, width";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._innercard.getObject())),_color,_width);
RDebugUtils.currentLine=24510468;
 //BA.debugLineNum = 24510468;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase(Punchline.Tech.Cuppy.Framework.cfmaterialcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcard";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=24313856;
 //BA.debugLineNum = 24313856;BA.debugLine="Public Sub GetBase As Pane";
RDebugUtils.currentLine=24313857;
 //BA.debugLineNum = 24313857;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=24313858;
 //BA.debugLineNum = 24313858;BA.debugLine="End Sub";
return null;
}
public String  _initialize(Punchline.Tech.Cuppy.Framework.cfmaterialcard __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cfmaterialcard";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=24117248;
 //BA.debugLineNum = 24117248;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=24117249;
 //BA.debugLineNum = 24117249;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=24117250;
 //BA.debugLineNum = 24117250;BA.debugLine="mCallBack = Callback";
__ref._mcallback = _callback;
RDebugUtils.currentLine=24117251;
 //BA.debugLineNum = 24117251;BA.debugLine="End Sub";
return "";
}
public String  _innercard_mouseclicked(Punchline.Tech.Cuppy.Framework.cfmaterialcard __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcard";
if (Debug.shouldDelegate(ba, "innercard_mouseclicked"))
	 {return ((String) Debug.delegate(ba, "innercard_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=24969216;
 //BA.debugLineNum = 24969216;BA.debugLine="Private Sub InnerCard_MouseClicked (EventData As M";
RDebugUtils.currentLine=24969218;
 //BA.debugLineNum = 24969218;BA.debugLine="InnerCard.RequestFocus 'set focus";
__ref._innercard.RequestFocus();
RDebugUtils.currentLine=24969219;
 //BA.debugLineNum = 24969219;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseCl";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_MouseClicked",(Object)(_eventdata));
RDebugUtils.currentLine=24969221;
 //BA.debugLineNum = 24969221;BA.debugLine="End Sub";
return "";
}
public String  _innercard_mouseentered(Punchline.Tech.Cuppy.Framework.cfmaterialcard __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcard";
if (Debug.shouldDelegate(ba, "innercard_mouseentered"))
	 {return ((String) Debug.delegate(ba, "innercard_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=24838144;
 //BA.debugLineNum = 24838144;BA.debugLine="Private Sub InnerCard_MouseEntered (EventData As M";
RDebugUtils.currentLine=24838146;
 //BA.debugLineNum = 24838146;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEn";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_MouseEntered",(Object)(_eventdata));
RDebugUtils.currentLine=24838148;
 //BA.debugLineNum = 24838148;BA.debugLine="End Sub";
return "";
}
public String  _innercard_mouseexited(Punchline.Tech.Cuppy.Framework.cfmaterialcard __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcard";
if (Debug.shouldDelegate(ba, "innercard_mouseexited"))
	 {return ((String) Debug.delegate(ba, "innercard_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=24903680;
 //BA.debugLineNum = 24903680;BA.debugLine="Private Sub InnerCard_MouseExited (EventData As Mo";
RDebugUtils.currentLine=24903682;
 //BA.debugLineNum = 24903682;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEx";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_MouseExited",(Object)(_eventdata));
RDebugUtils.currentLine=24903684;
 //BA.debugLineNum = 24903684;BA.debugLine="End Sub";
return "";
}
public String  _innercard_touch(Punchline.Tech.Cuppy.Framework.cfmaterialcard __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcard";
if (Debug.shouldDelegate(ba, "innercard_touch"))
	 {return ((String) Debug.delegate(ba, "innercard_touch", new Object[] {_action,_x,_y}));}
anywheresoftware.b4a.objects.collections.Map _points = null;
RDebugUtils.currentLine=24772608;
 //BA.debugLineNum = 24772608;BA.debugLine="Private Sub InnerCard_Touch (Action As Int, X As F";
RDebugUtils.currentLine=24772610;
 //BA.debugLineNum = 24772610;BA.debugLine="Dim Points As Map";
_points = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24772611;
 //BA.debugLineNum = 24772611;BA.debugLine="Points.Initialize";
_points.Initialize();
RDebugUtils.currentLine=24772612;
 //BA.debugLineNum = 24772612;BA.debugLine="Points.Put(\"X\", X )";
_points.Put((Object)("X"),(Object)(_x));
RDebugUtils.currentLine=24772613;
 //BA.debugLineNum = 24772613;BA.debugLine="Points.Put(\"Y\", Y )";
_points.Put((Object)("Y"),(Object)(_y));
RDebugUtils.currentLine=24772615;
 //BA.debugLineNum = 24772615;BA.debugLine="CallSubDelayed3( mCallBack, mEventName & \"_Touch\"";
__c.CallSubDelayed3(ba,__ref._mcallback,__ref._meventname+"_Touch",(Object)(_action),(Object)(_points));
RDebugUtils.currentLine=24772617;
 //BA.debugLineNum = 24772617;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects(Punchline.Tech.Cuppy.Framework.cfmaterialcard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcard";
if (Debug.shouldDelegate(ba, "removeeffects"))
	 {return ((String) Debug.delegate(ba, "removeeffects", null));}
RDebugUtils.currentLine=24707072;
 //BA.debugLineNum = 24707072;BA.debugLine="Public Sub RemoveEffects()";
RDebugUtils.currentLine=24707074;
 //BA.debugLineNum = 24707074;BA.debugLine="CFControlsUtils.removeEffect(InnerCard)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._innercard.getObject())));
RDebugUtils.currentLine=24707076;
 //BA.debugLineNum = 24707076;BA.debugLine="End Sub";
return "";
}
public String  _setbg(Punchline.Tech.Cuppy.Framework.cfmaterialcard __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcard";
if (Debug.shouldDelegate(ba, "setbg"))
	 {return ((String) Debug.delegate(ba, "setbg", new Object[] {_color}));}
RDebugUtils.currentLine=24379392;
 //BA.debugLineNum = 24379392;BA.debugLine="Public Sub setBg(color As String)";
RDebugUtils.currentLine=24379394;
 //BA.debugLineNum = 24379394;BA.debugLine="CFControlsUtils.SetBG( InnerCard, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._innercard.getObject())),_color);
RDebugUtils.currentLine=24379396;
 //BA.debugLineNum = 24379396;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(Punchline.Tech.Cuppy.Framework.cfmaterialcard __ref,int _radius) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcard";
if (Debug.shouldDelegate(ba, "setborderradius"))
	 {return ((String) Debug.delegate(ba, "setborderradius", new Object[] {_radius}));}
RDebugUtils.currentLine=24576000;
 //BA.debugLineNum = 24576000;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
RDebugUtils.currentLine=24576002;
 //BA.debugLineNum = 24576002;BA.debugLine="CFControlsUtils.setBorderRadius(InnerCard, radius";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._innercard.getObject())),_radius);
RDebugUtils.currentLine=24576004;
 //BA.debugLineNum = 24576004;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(Punchline.Tech.Cuppy.Framework.cfmaterialcard __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcard";
if (Debug.shouldDelegate(ba, "seteffect"))
	 {return ((String) Debug.delegate(ba, "seteffect", new Object[] {_effect}));}
RDebugUtils.currentLine=24641536;
 //BA.debugLineNum = 24641536;BA.debugLine="Public Sub setEffect(effect As String)";
RDebugUtils.currentLine=24641538;
 //BA.debugLineNum = 24641538;BA.debugLine="CFControlsUtils.setEffect(InnerCard, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._innercard.getObject())),_effect);
RDebugUtils.currentLine=24641540;
 //BA.debugLineNum = 24641540;BA.debugLine="End Sub";
return "";
}
public String  _setrotation(Punchline.Tech.Cuppy.Framework.cfmaterialcard __ref,float _angle) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialcard";
if (Debug.shouldDelegate(ba, "setrotation"))
	 {return ((String) Debug.delegate(ba, "setrotation", new Object[] {_angle}));}
RDebugUtils.currentLine=24444928;
 //BA.debugLineNum = 24444928;BA.debugLine="Public Sub setRotation(angle As Float)";
RDebugUtils.currentLine=24444930;
 //BA.debugLineNum = 24444930;BA.debugLine="CFControlsUtils.setRotation(InnerCard, angle) 'ro";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._innercard.getObject())),_angle);
RDebugUtils.currentLine=24444932;
 //BA.debugLineNum = 24444932;BA.debugLine="End Sub";
return "";
}
}