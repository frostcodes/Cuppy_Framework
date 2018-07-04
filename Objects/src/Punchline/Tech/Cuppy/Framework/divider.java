package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class divider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.divider", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.divider.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _line = null;
public b4j.example.cssutils _cssutils = null;
public Punchline.Tech.Cuppy.Framework.main _main = null;
public Punchline.Tech.Cuppy.Framework.configs _configs = null;
public Punchline.Tech.Cuppy.Framework.stringutility _stringutility = null;
public Punchline.Tech.Cuppy.Framework.mathutility _mathutility = null;
public Punchline.Tech.Cuppy.Framework.datatypeutility _datatypeutility = null;
public Punchline.Tech.Cuppy.Framework.stylemanager _stylemanager = null;
public Punchline.Tech.Cuppy.Framework.apputility _apputility = null;
public Punchline.Tech.Cuppy.Framework.controlsutils _controlsutils = null;
public Punchline.Tech.Cuppy.Framework.fileutility _fileutility = null;
public Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public String  _base_resize(Punchline.Tech.Cuppy.Framework.divider __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="divider";
if (Debug.shouldDelegate(ba, "base_resize"))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="line.PrefWidth = Width";
__ref._line.setPrefWidth(_width);
RDebugUtils.currentLine=9502724;
 //BA.debugLineNum = 9502724;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(Punchline.Tech.Cuppy.Framework.divider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="divider";
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=9306116;
 //BA.debugLineNum = 9306116;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=9306117;
 //BA.debugLineNum = 9306117;BA.debugLine="Public line As Pane";
_line = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=9306118;
 //BA.debugLineNum = 9306118;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Punchline.Tech.Cuppy.Framework.divider __ref,anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="divider";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="mBase.LoadLayout(\"DividerLayout\")";
__ref._mbase.LoadLayout(ba,"DividerLayout");
RDebugUtils.currentLine=9437188;
 //BA.debugLineNum = 9437188;BA.debugLine="SetBg(StyleManager.DefaultTheme.Get(\"divider\"))";
__ref._setbg(null,BA.ObjectToString(_stylemanager._defaulttheme.Get((Object)("divider"))));
RDebugUtils.currentLine=9437201;
 //BA.debugLineNum = 9437201;BA.debugLine="End Sub";
return "";
}
public String  _setbg(Punchline.Tech.Cuppy.Framework.divider __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="divider";
if (Debug.shouldDelegate(ba, "setbg"))
	 {return ((String) Debug.delegate(ba, "setbg", new Object[] {_color}));}
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Public Sub SetBg(color As String)";
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="CSSUtils.SetStyleProperty( line, \"-fx-background-";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._line.getObject())),"-fx-background-color",_color);
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase(Punchline.Tech.Cuppy.Framework.divider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="divider";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Public Sub GetBase As Pane";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="End Sub";
return null;
}
public double  _getsize(Punchline.Tech.Cuppy.Framework.divider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="divider";
if (Debug.shouldDelegate(ba, "getsize"))
	 {return ((Double) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Public Sub getSize() As Double";
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="Return line.PrefHeight";
if (true) return __ref._line.getPrefHeight();
RDebugUtils.currentLine=10092548;
 //BA.debugLineNum = 10092548;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(Punchline.Tech.Cuppy.Framework.divider __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="divider";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="mCallBack = Callback";
__ref._mcallback = _callback;
RDebugUtils.currentLine=9371651;
 //BA.debugLineNum = 9371651;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects(Punchline.Tech.Cuppy.Framework.divider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="divider";
if (Debug.shouldDelegate(ba, "removeeffects"))
	 {return ((String) Debug.delegate(ba, "removeeffects", null));}
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Public Sub removeEffects()";
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="ControlsUtils.removePaneEffect(line)";
_controlsutils._removepaneeffect(__ref._line);
RDebugUtils.currentLine=9961476;
 //BA.debugLineNum = 9961476;BA.debugLine="End Sub";
return "";
}
public String  _setborder(Punchline.Tech.Cuppy.Framework.divider __ref,String _color,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="divider";
if (Debug.shouldDelegate(ba, "setborder"))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_color,_width}));}
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Public Sub setBorder(color As String , width As In";
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="ControlsUtils.setPaneBorder(line, color, width)";
_controlsutils._setpaneborder(__ref._line,_color,_width);
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(Punchline.Tech.Cuppy.Framework.divider __ref,int _radius) throws Exception{
__ref = this;
RDebugUtils.currentModule="divider";
if (Debug.shouldDelegate(ba, "setborderradius"))
	 {return ((String) Debug.delegate(ba, "setborderradius", new Object[] {_radius}));}
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="ControlsUtils.setPaneBorderRadius(line, radius)";
_controlsutils._setpaneborderradius(__ref._line,_radius);
RDebugUtils.currentLine=9830404;
 //BA.debugLineNum = 9830404;BA.debugLine="End Sub";
return "";
}
public String  _setpaneeffect(Punchline.Tech.Cuppy.Framework.divider __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="divider";
if (Debug.shouldDelegate(ba, "setpaneeffect"))
	 {return ((String) Debug.delegate(ba, "setpaneeffect", new Object[] {_effect}));}
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Public Sub setPaneEffect(effect As String)";
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="ControlsUtils.setPaneEffect(line, effect)";
_controlsutils._setpaneeffect(__ref._line,_effect);
RDebugUtils.currentLine=9895940;
 //BA.debugLineNum = 9895940;BA.debugLine="End Sub";
return "";
}
public String  _setrotationx(Punchline.Tech.Cuppy.Framework.divider __ref,float _angle) throws Exception{
__ref = this;
RDebugUtils.currentModule="divider";
if (Debug.shouldDelegate(ba, "setrotationx"))
	 {return ((String) Debug.delegate(ba, "setrotationx", new Object[] {_angle}));}
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Public Sub setRotationX(angle As Float)";
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="ControlsUtils.setPaneRotationX(line, angle) 'rota";
_controlsutils._setpanerotationx(__ref._line,_angle);
RDebugUtils.currentLine=9699332;
 //BA.debugLineNum = 9699332;BA.debugLine="End Sub";
return "";
}
public String  _setsize(Punchline.Tech.Cuppy.Framework.divider __ref,int _sizex) throws Exception{
__ref = this;
RDebugUtils.currentModule="divider";
if (Debug.shouldDelegate(ba, "setsize"))
	 {return ((String) Debug.delegate(ba, "setsize", new Object[] {_sizex}));}
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Public Sub setSize(sizeX As Int)";
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="line.PrefHeight =  sizeX";
__ref._line.setPrefHeight(_sizex);
RDebugUtils.currentLine=10027012;
 //BA.debugLineNum = 10027012;BA.debugLine="End Sub";
return "";
}
}