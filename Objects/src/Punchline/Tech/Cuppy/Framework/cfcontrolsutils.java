package Punchline.Tech.Cuppy.Framework;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import javafx.scene.control.Tooltip;
import javafx.util.Duration;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class cfcontrolsutils extends Object{
public static cfcontrolsutils mostCurrent = new cfcontrolsutils();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfcontrolsutils", null);
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
public static Punchline.Tech.Cuppy.Framework.main _main = null;
public static Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public static Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public static Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public static Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public static Punchline.Tech.Cuppy.Framework.cfanimationmanager _cfanimationmanager = null;
public static Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public static String  _removeeffect(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj) throws Exception{
RDebugUtils.currentModule="cfcontrolsutils";
if (Debug.shouldDelegate(ba, "removeeffect"))
	 {return ((String) Debug.delegate(ba, "removeeffect", new Object[] {_controlobj}));}
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Public Sub RemoveEffect(controlObj As Node)";
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-effect";
_cssutils._setstyleproperty(_controlobj,"-fx-effect","none");
RDebugUtils.currentLine=12189700;
 //BA.debugLineNum = 12189700;BA.debugLine="End Sub";
return "";
}
public static String  _setbg(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj,String _color) throws Exception{
RDebugUtils.currentModule="cfcontrolsutils";
if (Debug.shouldDelegate(ba, "setbg"))
	 {return ((String) Debug.delegate(ba, "setbg", new Object[] {_controlobj,_color}));}
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Public Sub setBG(controlObj As Node, color As Stri";
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="CSSUtils.SetStyleProperty( controlObj, \"-fx-backg";
_cssutils._setstyleproperty(_controlobj,"-fx-background-color",_color);
RDebugUtils.currentLine=12255236;
 //BA.debugLineNum = 12255236;BA.debugLine="End Sub";
return "";
}
public static String  _setborder(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj,String _color,int _width) throws Exception{
RDebugUtils.currentModule="cfcontrolsutils";
if (Debug.shouldDelegate(ba, "setborder"))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_controlobj,_color,_width}));}
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Public Sub setBorder(controlObj As Node, color As";
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="CSSUtils.SetStyleProperty( controlObj, \"-fx-borde";
_cssutils._setstyleproperty(_controlobj,"-fx-border-color",_color);
RDebugUtils.currentLine=11993091;
 //BA.debugLineNum = 11993091;BA.debugLine="CSSUtils.SetStyleProperty (controlObj, \"-fx-borde";
_cssutils._setstyleproperty(_controlobj,"-fx-border-width",BA.NumberToString(_width));
RDebugUtils.currentLine=11993093;
 //BA.debugLineNum = 11993093;BA.debugLine="End Sub";
return "";
}
public static String  _setborderradius(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj,int _radius) throws Exception{
RDebugUtils.currentModule="cfcontrolsutils";
if (Debug.shouldDelegate(ba, "setborderradius"))
	 {return ((String) Debug.delegate(ba, "setborderradius", new Object[] {_controlobj,_radius}));}
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Public Sub setBorderRadius(controlObj As Node, rad";
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-border";
_cssutils._setstyleproperty(_controlobj,"-fx-border-radius",BA.NumberToString(_radius));
RDebugUtils.currentLine=12058628;
 //BA.debugLineNum = 12058628;BA.debugLine="End Sub";
return "";
}
public static String  _seteffect(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj,String _effect) throws Exception{
RDebugUtils.currentModule="cfcontrolsutils";
if (Debug.shouldDelegate(ba, "seteffect"))
	 {return ((String) Debug.delegate(ba, "seteffect", new Object[] {_controlobj,_effect}));}
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Public Sub setEffect(controlObj As Node, effect As";
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-effect";
_cssutils._setstyleproperty(_controlobj,"-fx-effect",_effect);
RDebugUtils.currentLine=12124164;
 //BA.debugLineNum = 12124164;BA.debugLine="End Sub";
return "";
}
public static String  _setrotation(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj,float _angle) throws Exception{
RDebugUtils.currentModule="cfcontrolsutils";
if (Debug.shouldDelegate(ba, "setrotation"))
	 {return ((String) Debug.delegate(ba, "setrotation", new Object[] {_controlobj,_angle}));}
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Public Sub setRotation(controlObj As Node, Angle A";
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-rotate";
_cssutils._setstyleproperty(_controlobj,"-fx-rotate",BA.NumberToString(_angle));
RDebugUtils.currentLine=11927556;
 //BA.debugLineNum = 11927556;BA.debugLine="End Sub";
return "";
}
public static String  _addcontroltooltip(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj,String _msg) throws Exception{
RDebugUtils.currentModule="cfcontrolsutils";
if (Debug.shouldDelegate(ba, "addcontroltooltip"))
	 {return ((String) Debug.delegate(ba, "addcontroltooltip", new Object[] {_controlobj,_msg}));}
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Public Sub AddControlToolTip(ControlObj As Node, m";
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=12582915;
 //BA.debugLineNum = 12582915;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)(_msg)});
RDebugUtils.currentLine=12582916;
 //BA.debugLineNum = 12582916;BA.debugLine="joToolTip.RunMethod(\"install\", Array(ControlObj,";
_jotooltip.RunMethod("install",new Object[]{(Object)(_controlobj.getObject()),(Object)(_jotooltip2.getObject())});
RDebugUtils.currentLine=12582918;
 //BA.debugLineNum = 12582918;BA.debugLine="End Sub";
return "";
}
public static String  _addimageviewtooltip(anywheresoftware.b4j.objects.ImageViewWrapper _controlobj,String _msg) throws Exception{
RDebugUtils.currentModule="cfcontrolsutils";
if (Debug.shouldDelegate(ba, "addimageviewtooltip"))
	 {return ((String) Debug.delegate(ba, "addimageviewtooltip", new Object[] {_controlobj,_msg}));}
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Public Sub AddImageViewToolTip(ControlObj As Image";
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=12451843;
 //BA.debugLineNum = 12451843;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)(_msg)});
RDebugUtils.currentLine=12451845;
 //BA.debugLineNum = 12451845;BA.debugLine="joToolTip.RunMethod(\"install\", Array(ControlObj,";
_jotooltip.RunMethod("install",new Object[]{(Object)(_controlobj.getObject()),(Object)(_jotooltip2.getObject())});
RDebugUtils.currentLine=12451847;
 //BA.debugLineNum = 12451847;BA.debugLine="End Sub";
return "";
}
public static String  _addpanetooltip(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _panelobj,String _msg) throws Exception{
RDebugUtils.currentModule="cfcontrolsutils";
if (Debug.shouldDelegate(ba, "addpanetooltip"))
	 {return ((String) Debug.delegate(ba, "addpanetooltip", new Object[] {_panelobj,_msg}));}
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Public Sub AddPaneToolTip(PanelObj As Pane, msg As";
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=12713987;
 //BA.debugLineNum = 12713987;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)(_msg)});
RDebugUtils.currentLine=12713988;
 //BA.debugLineNum = 12713988;BA.debugLine="joToolTip.RunMethod(\"install\", Array(PanelObj, jo";
_jotooltip.RunMethod("install",new Object[]{(Object)(_panelobj.getObject()),(Object)(_jotooltip2.getObject())});
RDebugUtils.currentLine=12713990;
 //BA.debugLineNum = 12713990;BA.debugLine="End Sub";
return "";
}
public static String  _configuretooltip(long _opendelay,long _visibleduration,long _closedelay) throws Exception{
RDebugUtils.currentModule="cfcontrolsutils";
if (Debug.shouldDelegate(ba, "configuretooltip"))
	 {return ((String) Debug.delegate(ba, "configuretooltip", new Object[] {_opendelay,_visibleduration,_closedelay}));}
anywheresoftware.b4j.object.JavaObject _mejo = null;
String _classshortname = "";
anywheresoftware.b4j.object.JavaObject _modjo = null;
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Public Sub ConfigureTooltip(OpenDelay As Long,Visi";
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="Dim MEJO As JavaObject = Me";
_mejo = new anywheresoftware.b4j.object.JavaObject();
_mejo.setObject((java.lang.Object)(cfcontrolsutils.getObject()));
RDebugUtils.currentLine=12845059;
 //BA.debugLineNum = 12845059;BA.debugLine="Dim ClassShortName As String = MEJO.RunMethod(\"to";
_classshortname = BA.ObjectToString(_mejo.RunMethod("toString",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=12845060;
 //BA.debugLineNum = 12845060;BA.debugLine="ClassShortName = ClassShortName.SubString(ClassSh";
_classshortname = _classshortname.substring(_classshortname.lastIndexOf("."));
RDebugUtils.currentLine=12845061;
 //BA.debugLineNum = 12845061;BA.debugLine="Dim ModJO As JavaObject";
_modjo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=12845062;
 //BA.debugLineNum = 12845062;BA.debugLine="ModJO.InitializeStatic(CFAppUtility.GetPackageNam";
_modjo.InitializeStatic(_cfapputility._getpackagename(cfcontrolsutils.getObject())+_classshortname);
RDebugUtils.currentLine=12845064;
 //BA.debugLineNum = 12845064;BA.debugLine="If ModJO.RunMethod(\"setTooltipTimers\",Array(OpenD";
if ((_modjo.RunMethod("setTooltipTimers",new Object[]{(Object)(_opendelay),(Object)(_visibleduration),(Object)(_closedelay)})).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
RDebugUtils.currentLine=12845065;
 //BA.debugLineNum = 12845065;BA.debugLine="Log($\"*******${CRLF}Tooltip Configuration failed";
anywheresoftware.b4a.keywords.Common.Log(("*******"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"Tooltip Configuration failed"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"*******"));
 };
RDebugUtils.currentLine=12845068;
 //BA.debugLineNum = 12845068;BA.debugLine="End Sub";
return "";
}
public static String  _getbg(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj) throws Exception{
RDebugUtils.currentModule="cfcontrolsutils";
if (Debug.shouldDelegate(ba, "getbg"))
	 {return ((String) Debug.delegate(ba, "getbg", new Object[] {_controlobj}));}
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Public Sub GetBG(controlObj As Node) As String";
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="Return CSSUtils.GetStyleProperty(controlObj, \"-fx";
if (true) return _cssutils._getstyleproperty(_controlobj,"-fx-background-color");
RDebugUtils.currentLine=12386308;
 //BA.debugLineNum = 12386308;BA.debugLine="End Sub";
return "";
}
public static String  _removecontroltooltip(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj) throws Exception{
RDebugUtils.currentModule="cfcontrolsutils";
if (Debug.shouldDelegate(ba, "removecontroltooltip"))
	 {return ((String) Debug.delegate(ba, "removecontroltooltip", new Object[] {_controlobj}));}
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Public Sub RemoveControlToolTip(ControlObj As Node";
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=12648451;
 //BA.debugLineNum = 12648451;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)("")});
RDebugUtils.currentLine=12648453;
 //BA.debugLineNum = 12648453;BA.debugLine="joToolTip.RunMethod(\"uninstall\", Array(ControlObj";
_jotooltip.RunMethod("uninstall",new Object[]{(Object)(_controlobj.getObject()),(Object)(_jotooltip2.getObject())});
RDebugUtils.currentLine=12648455;
 //BA.debugLineNum = 12648455;BA.debugLine="End Sub";
return "";
}
public static String  _removeimageviewtooltip(anywheresoftware.b4j.objects.ImageViewWrapper _controlobj) throws Exception{
RDebugUtils.currentModule="cfcontrolsutils";
if (Debug.shouldDelegate(ba, "removeimageviewtooltip"))
	 {return ((String) Debug.delegate(ba, "removeimageviewtooltip", new Object[] {_controlobj}));}
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Public Sub RemoveImageViewToolTip(ControlObj As Im";
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=12517379;
 //BA.debugLineNum = 12517379;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initi";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)("")});
RDebugUtils.currentLine=12517380;
 //BA.debugLineNum = 12517380;BA.debugLine="joToolTip.RunMethod(\"uninstall\", Array(ControlObj";
_jotooltip.RunMethod("uninstall",new Object[]{(Object)(_controlobj.getObject()),(Object)(_jotooltip2.getObject())});
RDebugUtils.currentLine=12517382;
 //BA.debugLineNum = 12517382;BA.debugLine="End Sub";
return "";
}
public static String  _removepanetooltip(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _panelobj) throws Exception{
RDebugUtils.currentModule="cfcontrolsutils";
if (Debug.shouldDelegate(ba, "removepanetooltip"))
	 {return ((String) Debug.delegate(ba, "removepanetooltip", new Object[] {_panelobj}));}
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
RDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Public Sub RemovePaneToolTip(PanelObj As Pane)";
RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=12779523;
 //BA.debugLineNum = 12779523;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)("")});
RDebugUtils.currentLine=12779525;
 //BA.debugLineNum = 12779525;BA.debugLine="joToolTip.RunMethod(\"uninstall\", Array(PanelObj,";
_jotooltip.RunMethod("uninstall",new Object[]{(Object)(_panelobj.getObject()),(Object)(_jotooltip2.getObject())});
RDebugUtils.currentLine=12779527;
 //BA.debugLineNum = 12779527;BA.debugLine="End Sub";
return "";
}
public static String  _settextcolor(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj,String _color) throws Exception{
RDebugUtils.currentModule="cfcontrolsutils";
if (Debug.shouldDelegate(ba, "settextcolor"))
	 {return ((String) Debug.delegate(ba, "settextcolor", new Object[] {_controlobj,_color}));}
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Public Sub setTextColor(controlObj As Node, color";
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="CSSUtils.SetStyleProperty(controlObj,\"-fx-text-fi";
_cssutils._setstyleproperty(_controlobj,"-fx-text-fill",_color);
RDebugUtils.currentLine=12320772;
 //BA.debugLineNum = 12320772;BA.debugLine="End Sub";
return "";
}


  /**
   * Returns true if successful.
   * Current defaults are 1000, 5000, 200;
   */
  @SuppressWarnings({ "rawtypes", "unchecked" })
  public static boolean setTooltipTimers(long openDelay, long visibleDuration, long closeDelay)
  {
    try
    {
      Field f = Tooltip.class.getDeclaredField("BEHAVIOR");
      f.setAccessible(true);


      Class[] classes = Tooltip.class.getDeclaredClasses();
      for (Class clazz : classes)
      {
        if (clazz.getName().equals("javafx.scene.control.Tooltip$TooltipBehavior"))
        {
          Constructor ctor = clazz.getDeclaredConstructor(Duration.class, Duration.class, Duration.class, boolean.class);
          ctor.setAccessible(true);
          Object tooltipBehavior = ctor.newInstance(new Duration(openDelay), new Duration(visibleDuration), new Duration(closeDelay), false);
          f.set(null, tooltipBehavior);
          break;
        }
      }
    }
    catch (Exception e)
    {

      return false;
    }
    return true;
  }


}