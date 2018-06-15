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
public static Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public static Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
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
