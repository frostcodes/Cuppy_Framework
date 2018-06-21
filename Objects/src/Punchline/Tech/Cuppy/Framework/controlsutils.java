package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class controlsutils extends Object{
public static controlsutils mostCurrent = new controlsutils();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.controlsutils", null);
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
public static Punchline.Tech.Cuppy.Framework.configs _configs = null;
public static Punchline.Tech.Cuppy.Framework.componentsmanager _componentsmanager = null;
public static Punchline.Tech.Cuppy.Framework.stylemanager _stylemanager = null;
public static Punchline.Tech.Cuppy.Framework.stringutility _stringutility = null;
public static Punchline.Tech.Cuppy.Framework.cuppyglobals _cuppyglobals = null;
public static Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public static Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public static String  _getbg(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub getBG(controlObj As Control) As String";
 //BA.debugLineNum = 100;BA.debugLine="Return CSSUtils.GetStyleProperty(controlObj, \"-fx";
if (true) return _cssutils._getstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-background-color");
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public static String  _getpanebg(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub getPaneBG(PaneObj As Pane) As String";
 //BA.debugLineNum = 94;BA.debugLine="Return CSSUtils.GetStyleProperty(PaneObj, \"-fx-ba";
if (true) return _cssutils._getstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-background-color");
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
public static String  _removeeffect(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub removeEffect(controlObj As Control)";
 //BA.debugLineNum = 64;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \" -fx-effec";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject()))," -fx-effect","none");
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public static String  _removepaneeffect(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub removePaneEffect(PaneObj As Pane)";
 //BA.debugLineNum = 58;BA.debugLine="CSSUtils.SetStyleProperty(PaneObj, \" -fx-effect\"";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject()))," -fx-effect","none");
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 14;BA.debugLine="Sub setBorder(controlObj As Control, color As Stri";
 //BA.debugLineNum = 16;BA.debugLine="CSSUtils.SetStyleProperty( controlObj, \"-fx-borde";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-border-color",_color);
 //BA.debugLineNum = 17;BA.debugLine="CSSUtils.SetStyleProperty (controlObj, \"-fx-borde";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-border-width",BA.NumberToString(_width));
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public static String  _setborderradius(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj,int _radius) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub setBorderRadius(controlObj As Control, radius";
 //BA.debugLineNum = 37;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-border";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-border-radius",BA.NumberToString(_radius));
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public static String  _seteffect(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj,String _effect) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub setEffect(controlObj As Control, effect As Str";
 //BA.debugLineNum = 49;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \" -fx-effec";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject()))," -fx-effect",_effect);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public static String  _setpanebg(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj,String _color) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub setPaneBG(PaneObj As Pane, color As String)";
 //BA.debugLineNum = 73;BA.debugLine="CSSUtils.SetStyleProperty( PaneObj, \"-fx-backgrou";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-background-color",_color);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public static String  _setpaneborder(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj,String _color,int _width) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub setPaneBorder(PaneObj As Pane, color As String";
 //BA.debugLineNum = 23;BA.debugLine="CSSUtils.SetStyleProperty( PaneObj, \"-fx-border-c";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-border-color",_color);
 //BA.debugLineNum = 24;BA.debugLine="CSSUtils.SetStyleProperty (PaneObj, \"-fx-border-w";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-border-width",BA.NumberToString(_width));
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public static String  _setpaneborderradius(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj,int _radius) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub setPaneBorderRadius(PaneObj As Pane, radius As";
 //BA.debugLineNum = 30;BA.debugLine="CSSUtils.SetStyleProperty(PaneObj,\"-fx-border-rad";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-border-radius",BA.NumberToString(_radius));
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public static String  _setpaneeffect(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj,String _effect) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub setPaneEffect(PaneObj As Pane, effect As Strin";
 //BA.debugLineNum = 43;BA.debugLine="CSSUtils.SetStyleProperty(PaneObj, \" -fx-effect\"";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject()))," -fx-effect",_effect);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public static String  _setpanerotationx(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj,float _angle) throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub setPaneRotationX(PaneObj As Pane, Angle As Flo";
 //BA.debugLineNum = 11;BA.debugLine="CSSUtils.SetStyleProperty(PaneObj, \"-fx-rotate\",";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-rotate",BA.NumberToString(_angle));
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public static String  _setrotationx(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj,float _angle) throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub setRotationX(controlObj As Control, Angle As F";
 //BA.debugLineNum = 7;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-rotate";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-rotate",BA.NumberToString(_angle));
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
}
