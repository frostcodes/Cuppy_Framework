package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class cfcontrolsutils extends Object{
public static cfcontrolsutils mostCurrent = new cfcontrolsutils();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfcontrolsutils", null);
		ba.loadHtSubs(cfcontrolsutils.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "Punchline.Tech.Cuppy.Framework.cfcontrolsutils", ba);
		}
	}
    public static Class<?> getObject() {
		return cfcontrolsutils.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static b4j.example.cssutils _cssutils = null;
public static Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public static Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public static Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public static Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public static Punchline.Tech.Cuppy.Framework.cfanimationmanager _cfanimationmanager = null;
public static Punchline.Tech.Cuppy.Framework.cflicensemanager _cflicensemanager = null;
public static Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public static Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public static Punchline.Tech.Cuppy.Framework.cfhtmlutility _cfhtmlutility = null;
public static String  _addcontroltooltip(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj,String _msg) throws Exception{
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
 //BA.debugLineNum = 138;BA.debugLine="Public Sub addControlToolTip(ControlObj As Control";
 //BA.debugLineNum = 140;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 141;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)(_msg)});
 //BA.debugLineNum = 142;BA.debugLine="joToolTip.RunMethod(\"install\", Array(ControlOb";
_jotooltip.RunMethod("install",new Object[]{(Object)(_controlobj.getObject()),(Object)(_jotooltip2.getObject())});
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public static String  _addimageviewtooltip(anywheresoftware.b4j.objects.ImageViewWrapper _controlobj,String _msg) throws Exception{
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
 //BA.debugLineNum = 114;BA.debugLine="Public Sub addImageViewToolTip(ControlObj As Image";
 //BA.debugLineNum = 116;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 117;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)(_msg)});
 //BA.debugLineNum = 119;BA.debugLine="joToolTip.RunMethod(\"install\", Array(ControlObj,";
_jotooltip.RunMethod("install",new Object[]{(Object)(_controlobj.getObject()),(Object)(_jotooltip2.getObject())});
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public static String  _addpanetooltip(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _panelobj,String _msg) throws Exception{
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
 //BA.debugLineNum = 161;BA.debugLine="Public Sub addPaneToolTip(PanelObj As Pane, msg As";
 //BA.debugLineNum = 163;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 164;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)(_msg)});
 //BA.debugLineNum = 165;BA.debugLine="joToolTip.RunMethod(\"install\", Array(PanelObj, jo";
_jotooltip.RunMethod("install",new Object[]{(Object)(_panelobj.getObject()),(Object)(_jotooltip2.getObject())});
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return "";
}
public static String  _getbg(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Public Sub getBG(controlObj As Control) As String";
 //BA.debugLineNum = 105;BA.debugLine="Return CSSUtils.GetStyleProperty(controlObj, \"-fx";
if (true) return _cssutils._getstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-background-color");
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public static String  _getpanebg(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Public Sub getPaneBG(PaneObj As Pane) As String";
 //BA.debugLineNum = 99;BA.debugLine="Return CSSUtils.GetStyleProperty(PaneObj, \"-fx-ba";
if (true) return _cssutils._getstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-background-color");
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
public static String  _removecontroltooltip(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj) throws Exception{
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
 //BA.debugLineNum = 149;BA.debugLine="Public Sub removeControlToolTip(ControlObj As Cont";
 //BA.debugLineNum = 151;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 152;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)("")});
 //BA.debugLineNum = 154;BA.debugLine="joToolTip.RunMethod(\"uninstall\", Array(ControlObj";
_jotooltip.RunMethod("uninstall",new Object[]{(Object)(_controlobj.getObject()),(Object)(_jotooltip2.getObject())});
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return "";
}
public static String  _removeeffect(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Public Sub removeEffect(controlObj As Control)";
 //BA.debugLineNum = 64;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-effect";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-effect","none");
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public static String  _removeimageviewtooltip(anywheresoftware.b4j.objects.ImageViewWrapper _controlobj) throws Exception{
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
 //BA.debugLineNum = 126;BA.debugLine="Public Sub removeImageViewToolTip(ControlObj As Im";
 //BA.debugLineNum = 128;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 129;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initi";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)("")});
 //BA.debugLineNum = 131;BA.debugLine="joToolTip.RunMethod(\"uninstall\", Array(ControlOb";
_jotooltip.RunMethod("uninstall",new Object[]{(Object)(_controlobj.getObject()),(Object)(_jotooltip2.getObject())});
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public static String  _removepaneeffect(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Public Sub removePaneEffect(PaneObj As Pane)";
 //BA.debugLineNum = 58;BA.debugLine="CSSUtils.SetStyleProperty(PaneObj, \"-fx-effect\" ,";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-effect","none");
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public static String  _removepanetooltip(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _panelobj) throws Exception{
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
 //BA.debugLineNum = 172;BA.debugLine="Public Sub removePaneToolTip(PanelObj As Pane)";
 //BA.debugLineNum = 174;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 175;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)("")});
 //BA.debugLineNum = 177;BA.debugLine="joToolTip.RunMethod(\"uninstall\", Array(PanelObj,";
_jotooltip.RunMethod("uninstall",new Object[]{(Object)(_panelobj.getObject()),(Object)(_jotooltip2.getObject())});
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public static String  _setbg(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj,String _color) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Public Sub setBG(controlObj As Control, color As S";
 //BA.debugLineNum = 80;BA.debugLine="CSSUtils.SetStyleProperty( controlObj, \"-fx-backg";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-background-color",_color);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public static String  _setborder(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj,String _color,int _width) throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Public Sub setBorder(controlObj As Control, color";
 //BA.debugLineNum = 16;BA.debugLine="CSSUtils.SetStyleProperty( controlObj, \"-fx-borde";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-border-color",_color);
 //BA.debugLineNum = 17;BA.debugLine="CSSUtils.SetStyleProperty (controlObj, \"-fx-borde";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-border-width",BA.NumberToString(_width));
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public static String  _setborderradius(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj,int _radius) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Public Sub setBorderRadius(controlObj As Control,";
 //BA.debugLineNum = 37;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-border";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-border-radius",BA.NumberToString(_radius));
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public static String  _seteffect(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj,String _effect) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Public Sub setEffect(controlObj As Control, effect";
 //BA.debugLineNum = 49;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-effect";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-effect",_effect);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public static String  _setpanebg(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj,String _color) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Public Sub setPaneBG(PaneObj As Pane, color As Str";
 //BA.debugLineNum = 73;BA.debugLine="CSSUtils.SetStyleProperty( PaneObj, \"-fx-backgrou";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-background-color",_color);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public static String  _setpaneborder(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj,String _color,int _width) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Public Sub setPaneBorder(PaneObj As Pane, color As";
 //BA.debugLineNum = 23;BA.debugLine="CSSUtils.SetStyleProperty( PaneObj, \"-fx-border-c";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-border-color",_color);
 //BA.debugLineNum = 24;BA.debugLine="CSSUtils.SetStyleProperty (PaneObj, \"-fx-border-w";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-border-width",BA.NumberToString(_width));
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public static String  _setpaneborderradius(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj,int _radius) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Public Sub setPaneBorderRadius(PaneObj As Pane, ra";
 //BA.debugLineNum = 30;BA.debugLine="CSSUtils.SetStyleProperty(PaneObj,\"-fx-border-rad";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-border-radius",BA.NumberToString(_radius));
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public static String  _setpaneeffect(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj,String _effect) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Public Sub setPaneEffect(PaneObj As Pane, effect A";
 //BA.debugLineNum = 43;BA.debugLine="CSSUtils.SetStyleProperty(PaneObj, \"-fx-effect\" ,";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-effect",_effect);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public static String  _setpanerotationx(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj,float _angle) throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Public Sub setPaneRotationX(PaneObj As Pane, Angle";
 //BA.debugLineNum = 11;BA.debugLine="CSSUtils.SetStyleProperty(PaneObj, \"-fx-rotate\",";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-rotate",BA.NumberToString(_angle));
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public static String  _setrotationx(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj,float _angle) throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Public Sub setRotationX(controlObj As Control, Ang";
 //BA.debugLineNum = 7;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-rotate";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-rotate",BA.NumberToString(_angle));
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public static String  _settextcolor(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj,String _color) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Public Sub setTextColor(controlObj As Control, col";
 //BA.debugLineNum = 87;BA.debugLine="CSSUtils.SetStyleProperty(controlObj,\"-fx-text-fi";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-text-fill",_color);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
}
