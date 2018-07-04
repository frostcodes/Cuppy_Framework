package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class controlsutils extends Object{
public static controlsutils mostCurrent = new controlsutils();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.controlsutils", null);
		ba.loadHtSubs(controlsutils.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "Punchline.Tech.Cuppy.Framework.controlsutils", ba);
		}
	}
    public static Class<?> getObject() {
		return controlsutils.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static b4j.example.cssutils _cssutils = null;
public static Punchline.Tech.Cuppy.Framework.main _main = null;
public static Punchline.Tech.Cuppy.Framework.configs _configs = null;
public static Punchline.Tech.Cuppy.Framework.stringutility _stringutility = null;
public static Punchline.Tech.Cuppy.Framework.mathutility _mathutility = null;
public static Punchline.Tech.Cuppy.Framework.datatypeutility _datatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.stylemanager _stylemanager = null;
public static Punchline.Tech.Cuppy.Framework.apputility _apputility = null;
public static Punchline.Tech.Cuppy.Framework.fileutility _fileutility = null;
public static Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public static Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public static String  _removeeffect(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj) throws Exception{
RDebugUtils.currentModule="controlsutils";
if (Debug.shouldDelegate(ba, "removeeffect"))
	 {return ((String) Debug.delegate(ba, "removeeffect", new Object[] {_controlobj}));}
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Public Sub removeEffect(controlObj As Control)";
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-effect";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-effect","none");
RDebugUtils.currentLine=12713989;
 //BA.debugLineNum = 12713989;BA.debugLine="End Sub";
return "";
}
public static String  _setbg(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj,String _color) throws Exception{
RDebugUtils.currentModule="controlsutils";
if (Debug.shouldDelegate(ba, "setbg"))
	 {return ((String) Debug.delegate(ba, "setbg", new Object[] {_controlobj,_color}));}
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Public Sub setBG(controlObj As Control, color As S";
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="CSSUtils.SetStyleProperty( controlObj, \"-fx-backg";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-background-color",_color);
RDebugUtils.currentLine=12845060;
 //BA.debugLineNum = 12845060;BA.debugLine="End Sub";
return "";
}
public static String  _setborder(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj,String _color,int _width) throws Exception{
RDebugUtils.currentModule="controlsutils";
if (Debug.shouldDelegate(ba, "setborder"))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_controlobj,_color,_width}));}
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Public Sub setBorder(controlObj As Control, color";
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="CSSUtils.SetStyleProperty( controlObj, \"-fx-borde";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-border-color",_color);
RDebugUtils.currentLine=12255235;
 //BA.debugLineNum = 12255235;BA.debugLine="CSSUtils.SetStyleProperty (controlObj, \"-fx-borde";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-border-width",BA.NumberToString(_width));
RDebugUtils.currentLine=12255237;
 //BA.debugLineNum = 12255237;BA.debugLine="End Sub";
return "";
}
public static String  _setborderradius(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj,int _radius) throws Exception{
RDebugUtils.currentModule="controlsutils";
if (Debug.shouldDelegate(ba, "setborderradius"))
	 {return ((String) Debug.delegate(ba, "setborderradius", new Object[] {_controlobj,_radius}));}
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Public Sub setBorderRadius(controlObj As Control,";
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-border";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-border-radius",BA.NumberToString(_radius));
RDebugUtils.currentLine=12451844;
 //BA.debugLineNum = 12451844;BA.debugLine="End Sub";
return "";
}
public static String  _seteffect(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj,String _effect) throws Exception{
RDebugUtils.currentModule="controlsutils";
if (Debug.shouldDelegate(ba, "seteffect"))
	 {return ((String) Debug.delegate(ba, "seteffect", new Object[] {_controlobj,_effect}));}
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Public Sub setEffect(controlObj As Control, effect";
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-effect";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-effect",_effect);
RDebugUtils.currentLine=12582917;
 //BA.debugLineNum = 12582917;BA.debugLine="End Sub";
return "";
}
public static String  _setrotationx(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj,float _angle) throws Exception{
RDebugUtils.currentModule="controlsutils";
if (Debug.shouldDelegate(ba, "setrotationx"))
	 {return ((String) Debug.delegate(ba, "setrotationx", new Object[] {_controlobj,_angle}));}
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Public Sub setRotationX(controlObj As Control, Ang";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-rotate";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-rotate",BA.NumberToString(_angle));
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="End Sub";
return "";
}
public static String  _settextcolor(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj,String _color) throws Exception{
RDebugUtils.currentModule="controlsutils";
if (Debug.shouldDelegate(ba, "settextcolor"))
	 {return ((String) Debug.delegate(ba, "settextcolor", new Object[] {_controlobj,_color}));}
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Public Sub setTextColor(controlObj As Control, col";
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="CSSUtils.SetStyleProperty(controlObj,\"-fx-text-fi";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-text-fill",_color);
RDebugUtils.currentLine=12910596;
 //BA.debugLineNum = 12910596;BA.debugLine="End Sub";
return "";
}
public static String  _removepaneeffect(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj) throws Exception{
RDebugUtils.currentModule="controlsutils";
if (Debug.shouldDelegate(ba, "removepaneeffect"))
	 {return ((String) Debug.delegate(ba, "removepaneeffect", new Object[] {_paneobj}));}
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Public Sub removePaneEffect(PaneObj As Pane)";
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="CSSUtils.SetStyleProperty(PaneObj, \"-fx-effect\" ,";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-effect","none");
RDebugUtils.currentLine=12648452;
 //BA.debugLineNum = 12648452;BA.debugLine="End Sub";
return "";
}
public static String  _setpaneborder(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj,String _color,int _width) throws Exception{
RDebugUtils.currentModule="controlsutils";
if (Debug.shouldDelegate(ba, "setpaneborder"))
	 {return ((String) Debug.delegate(ba, "setpaneborder", new Object[] {_paneobj,_color,_width}));}
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Public Sub setPaneBorder(PaneObj As Pane, color As";
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="CSSUtils.SetStyleProperty( PaneObj, \"-fx-border-c";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-border-color",_color);
RDebugUtils.currentLine=12320771;
 //BA.debugLineNum = 12320771;BA.debugLine="CSSUtils.SetStyleProperty (PaneObj, \"-fx-border-w";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-border-width",BA.NumberToString(_width));
RDebugUtils.currentLine=12320773;
 //BA.debugLineNum = 12320773;BA.debugLine="End Sub";
return "";
}
public static String  _setpaneborderradius(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj,int _radius) throws Exception{
RDebugUtils.currentModule="controlsutils";
if (Debug.shouldDelegate(ba, "setpaneborderradius"))
	 {return ((String) Debug.delegate(ba, "setpaneborderradius", new Object[] {_paneobj,_radius}));}
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Public Sub setPaneBorderRadius(PaneObj As Pane, ra";
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="CSSUtils.SetStyleProperty(PaneObj,\"-fx-border-rad";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-border-radius",BA.NumberToString(_radius));
RDebugUtils.currentLine=12386308;
 //BA.debugLineNum = 12386308;BA.debugLine="End Sub";
return "";
}
public static String  _setpaneeffect(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj,String _effect) throws Exception{
RDebugUtils.currentModule="controlsutils";
if (Debug.shouldDelegate(ba, "setpaneeffect"))
	 {return ((String) Debug.delegate(ba, "setpaneeffect", new Object[] {_paneobj,_effect}));}
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Public Sub setPaneEffect(PaneObj As Pane, effect A";
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="CSSUtils.SetStyleProperty(PaneObj, \"-fx-effect\" ,";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-effect",_effect);
RDebugUtils.currentLine=12517380;
 //BA.debugLineNum = 12517380;BA.debugLine="End Sub";
return "";
}
public static String  _setpanerotationx(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj,float _angle) throws Exception{
RDebugUtils.currentModule="controlsutils";
if (Debug.shouldDelegate(ba, "setpanerotationx"))
	 {return ((String) Debug.delegate(ba, "setpanerotationx", new Object[] {_paneobj,_angle}));}
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Public Sub setPaneRotationX(PaneObj As Pane, Angle";
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="CSSUtils.SetStyleProperty(PaneObj, \"-fx-rotate\",";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-rotate",BA.NumberToString(_angle));
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="End Sub";
return "";
}
public static String  _setpanebg(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj,String _color) throws Exception{
RDebugUtils.currentModule="controlsutils";
if (Debug.shouldDelegate(ba, "setpanebg"))
	 {return ((String) Debug.delegate(ba, "setpanebg", new Object[] {_paneobj,_color}));}
RDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Public Sub setPaneBG(PaneObj As Pane, color As Str";
RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="CSSUtils.SetStyleProperty( PaneObj, \"-fx-backgrou";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-background-color",_color);
RDebugUtils.currentLine=12779525;
 //BA.debugLineNum = 12779525;BA.debugLine="End Sub";
return "";
}
public static String  _addcontroltooltip(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj,String _msg) throws Exception{
RDebugUtils.currentModule="controlsutils";
if (Debug.shouldDelegate(ba, "addcontroltooltip"))
	 {return ((String) Debug.delegate(ba, "addcontroltooltip", new Object[] {_controlobj,_msg}));}
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Public Sub addControlToolTip(ControlObj As Control";
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)(_msg)});
RDebugUtils.currentLine=13238276;
 //BA.debugLineNum = 13238276;BA.debugLine="joToolTip.RunMethod(\"install\", Array(ControlOb";
_jotooltip.RunMethod("install",new Object[]{(Object)(_controlobj.getObject()),(Object)(_jotooltip2.getObject())});
RDebugUtils.currentLine=13238278;
 //BA.debugLineNum = 13238278;BA.debugLine="End Sub";
return "";
}
public static String  _addimageviewtooltip(anywheresoftware.b4j.objects.ImageViewWrapper _controlobj,String _msg) throws Exception{
RDebugUtils.currentModule="controlsutils";
if (Debug.shouldDelegate(ba, "addimageviewtooltip"))
	 {return ((String) Debug.delegate(ba, "addimageviewtooltip", new Object[] {_controlobj,_msg}));}
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Public Sub addImageViewToolTip(ControlObj As Image";
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=13107203;
 //BA.debugLineNum = 13107203;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)(_msg)});
RDebugUtils.currentLine=13107205;
 //BA.debugLineNum = 13107205;BA.debugLine="joToolTip.RunMethod(\"install\", Array(ControlObj,";
_jotooltip.RunMethod("install",new Object[]{(Object)(_controlobj.getObject()),(Object)(_jotooltip2.getObject())});
RDebugUtils.currentLine=13107207;
 //BA.debugLineNum = 13107207;BA.debugLine="End Sub";
return "";
}
public static String  _addpanetooltip(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _panelobj,String _msg) throws Exception{
RDebugUtils.currentModule="controlsutils";
if (Debug.shouldDelegate(ba, "addpanetooltip"))
	 {return ((String) Debug.delegate(ba, "addpanetooltip", new Object[] {_panelobj,_msg}));}
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Public Sub addPaneToolTip(PanelObj As Pane, msg As";
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=13369347;
 //BA.debugLineNum = 13369347;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)(_msg)});
RDebugUtils.currentLine=13369348;
 //BA.debugLineNum = 13369348;BA.debugLine="joToolTip.RunMethod(\"install\", Array(PanelObj, jo";
_jotooltip.RunMethod("install",new Object[]{(Object)(_panelobj.getObject()),(Object)(_jotooltip2.getObject())});
RDebugUtils.currentLine=13369350;
 //BA.debugLineNum = 13369350;BA.debugLine="End Sub";
return "";
}
public static String  _getbg(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj) throws Exception{
RDebugUtils.currentModule="controlsutils";
if (Debug.shouldDelegate(ba, "getbg"))
	 {return ((String) Debug.delegate(ba, "getbg", new Object[] {_controlobj}));}
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Public Sub getBG(controlObj As Control) As String";
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="Return CSSUtils.GetStyleProperty(controlObj, \"-fx";
if (true) return _cssutils._getstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-background-color");
RDebugUtils.currentLine=13041668;
 //BA.debugLineNum = 13041668;BA.debugLine="End Sub";
return "";
}
public static String  _getpanebg(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj) throws Exception{
RDebugUtils.currentModule="controlsutils";
if (Debug.shouldDelegate(ba, "getpanebg"))
	 {return ((String) Debug.delegate(ba, "getpanebg", new Object[] {_paneobj}));}
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Public Sub getPaneBG(PaneObj As Pane) As String";
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="Return CSSUtils.GetStyleProperty(PaneObj, \"-fx-ba";
if (true) return _cssutils._getstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-background-color");
RDebugUtils.currentLine=12976132;
 //BA.debugLineNum = 12976132;BA.debugLine="End Sub";
return "";
}
public static String  _removecontroltooltip(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj) throws Exception{
RDebugUtils.currentModule="controlsutils";
if (Debug.shouldDelegate(ba, "removecontroltooltip"))
	 {return ((String) Debug.delegate(ba, "removecontroltooltip", new Object[] {_controlobj}));}
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Public Sub removeControlToolTip(ControlObj As Cont";
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=13303811;
 //BA.debugLineNum = 13303811;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)("")});
RDebugUtils.currentLine=13303813;
 //BA.debugLineNum = 13303813;BA.debugLine="joToolTip.RunMethod(\"uninstall\", Array(ControlObj";
_jotooltip.RunMethod("uninstall",new Object[]{(Object)(_controlobj.getObject()),(Object)(_jotooltip2.getObject())});
RDebugUtils.currentLine=13303815;
 //BA.debugLineNum = 13303815;BA.debugLine="End Sub";
return "";
}
public static String  _removeimageviewtooltip(anywheresoftware.b4j.objects.ImageViewWrapper _controlobj) throws Exception{
RDebugUtils.currentModule="controlsutils";
if (Debug.shouldDelegate(ba, "removeimageviewtooltip"))
	 {return ((String) Debug.delegate(ba, "removeimageviewtooltip", new Object[] {_controlobj}));}
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Public Sub removeImageViewToolTip(ControlObj As Im";
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=13172739;
 //BA.debugLineNum = 13172739;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initi";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)("")});
RDebugUtils.currentLine=13172741;
 //BA.debugLineNum = 13172741;BA.debugLine="joToolTip.RunMethod(\"uninstall\", Array(ControlOb";
_jotooltip.RunMethod("uninstall",new Object[]{(Object)(_controlobj.getObject()),(Object)(_jotooltip2.getObject())});
RDebugUtils.currentLine=13172743;
 //BA.debugLineNum = 13172743;BA.debugLine="End Sub";
return "";
}
public static String  _removepanetooltip(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _panelobj) throws Exception{
RDebugUtils.currentModule="controlsutils";
if (Debug.shouldDelegate(ba, "removepanetooltip"))
	 {return ((String) Debug.delegate(ba, "removepanetooltip", new Object[] {_panelobj}));}
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Public Sub removePaneToolTip(PanelObj As Pane)";
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=13434883;
 //BA.debugLineNum = 13434883;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)("")});
RDebugUtils.currentLine=13434885;
 //BA.debugLineNum = 13434885;BA.debugLine="joToolTip.RunMethod(\"uninstall\", Array(PanelObj,";
_jotooltip.RunMethod("uninstall",new Object[]{(Object)(_panelobj.getObject()),(Object)(_jotooltip2.getObject())});
RDebugUtils.currentLine=13434887;
 //BA.debugLineNum = 13434887;BA.debugLine="End Sub";
return "";
}
}