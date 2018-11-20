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
public static anywheresoftware.b4j.objects.JFX _vvvvvvvvvvvvvvvvvvv7 = null;
public static b4j.example.cssutils _vvvvvvvvvvvvvvvvvvvv3 = null;
public static Punchline.Tech.Cuppy.Framework.cfconfigs _vvvvvvvvvvvvvvvvvvvv4 = null;
public static Punchline.Tech.Cuppy.Framework.cfstringutility _vvvvvvvvvvvvvvvvvvvv5 = null;
public static Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _vvvvvvvvvvvvvvvvvvvv6 = null;
public static Punchline.Tech.Cuppy.Framework.cffileutility _vvvvvvvvvvvvvvvvvvvv7 = null;
public static Punchline.Tech.Cuppy.Framework.cfstylemanager _vvvvvvvvvvvvvvvvvvvv0 = null;
public static Punchline.Tech.Cuppy.Framework.cfmathutility _vvvvvvvvvvvvvvvvvvvvv3 = null;
public static Punchline.Tech.Cuppy.Framework.cfdatatypeutility _vvvvvvvvvvvvvvvvvvvvv4 = null;
public static Punchline.Tech.Cuppy.Framework.cfapputility _vvvvvvvvvvvvvvvvvvvvv5 = null;
public static String  _vvvvvvvvvv6(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj,String _msg) throws Exception{
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
 //BA.debugLineNum = 149;BA.debugLine="Public Sub AddControlToolTip(ControlObj As Node, m";
 //BA.debugLineNum = 151;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 152;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)(_msg)});
 //BA.debugLineNum = 153;BA.debugLine="joToolTip.RunMethod(\"install\", Array(ControlObj,";
_jotooltip.RunMethod("install",new Object[]{(Object)(_controlobj.getObject()),(Object)(_jotooltip2.getObject())});
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvv7(anywheresoftware.b4j.objects.ImageViewWrapper _controlobj,String _msg) throws Exception{
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
 //BA.debugLineNum = 126;BA.debugLine="Public Sub AddImageViewToolTip(ControlObj As Image";
 //BA.debugLineNum = 128;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 129;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)(_msg)});
 //BA.debugLineNum = 131;BA.debugLine="joToolTip.RunMethod(\"install\", Array(ControlObj,";
_jotooltip.RunMethod("install",new Object[]{(Object)(_controlobj.getObject()),(Object)(_jotooltip2.getObject())});
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvv0(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _panelobj,String _msg) throws Exception{
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
 //BA.debugLineNum = 172;BA.debugLine="Public Sub AddPaneToolTip(PanelObj As Pane, msg As";
 //BA.debugLineNum = 174;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 175;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)(_msg)});
 //BA.debugLineNum = 176;BA.debugLine="joToolTip.RunMethod(\"install\", Array(PanelObj, jo";
_jotooltip.RunMethod("install",new Object[]{(Object)(_panelobj.getObject()),(Object)(_jotooltip2.getObject())});
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvv1(long _opendelay,long _visibleduration,long _closedelay) throws Exception{
anywheresoftware.b4j.object.JavaObject _mejo = null;
String _classshortname = "";
anywheresoftware.b4j.object.JavaObject _modjo = null;
 //BA.debugLineNum = 211;BA.debugLine="Public Sub ConfigureTooltip(OpenDelay As Long,Visi";
 //BA.debugLineNum = 213;BA.debugLine="Dim MEJO As JavaObject = Me";
_mejo = new anywheresoftware.b4j.object.JavaObject();
_mejo.setObject((java.lang.Object)(cfcontrolsutils.getObject()));
 //BA.debugLineNum = 214;BA.debugLine="Dim ClassShortName As String = MEJO.RunMethod(\"to";
_classshortname = BA.ObjectToString(_mejo.RunMethod("toString",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 215;BA.debugLine="ClassShortName = ClassShortName.SubString(ClassSh";
_classshortname = _classshortname.substring(_classshortname.lastIndexOf("."));
 //BA.debugLineNum = 216;BA.debugLine="Dim ModJO As JavaObject";
_modjo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 217;BA.debugLine="ModJO.InitializeStatic(CFAppUtility.GetPackageNam";
_modjo.InitializeStatic(_vvvvvvvvvvvvvvvvvvvvv5._vvvvvvvvvvvvvvvvv1(cfcontrolsutils.getObject())+_classshortname);
 //BA.debugLineNum = 219;BA.debugLine="If ModJO.RunMethod(\"setTooltipTimers\",Array(OpenD";
if ((_modjo.RunMethod("setTooltipTimers",new Object[]{(Object)(_opendelay),(Object)(_visibleduration),(Object)(_closedelay)})).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
 //BA.debugLineNum = 220;BA.debugLine="Log($\"*******${CRLF}Tooltip Configuration failed";
anywheresoftware.b4a.keywords.Common.Log(("*******"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"Tooltip Configuration failed"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"*******"));
 };
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvv2(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Public Sub GetBG(controlObj As Node) As String";
 //BA.debugLineNum = 30;BA.debugLine="Return CSSUtils.GetStyleProperty(controlObj, \"-fx";
if (true) return _vvvvvvvvvvvvvvvvvvvv3._getstyleproperty(_controlobj,"-fx-background-color");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvv3(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Public Sub GetBorderColor(controlObj As Node) As S";
 //BA.debugLineNum = 44;BA.debugLine="Return CSSUtils.GetStyleProperty( controlObj, \"-f";
if (true) return _vvvvvvvvvvvvvvvvvvvv3._getstyleproperty(_controlobj,"-fx-border-color");
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public static int  _vvvvvvvvvvv4(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Public Sub GetBorderRadius(controlObj As Node) As";
 //BA.debugLineNum = 80;BA.debugLine="Return CSSUtils.GetStyleProperty(controlObj, \"-fx";
if (true) return (int)(Double.parseDouble(_vvvvvvvvvvvvvvvvvvvv3._getstyleproperty(_controlobj,"-fx-border-radius")));
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return 0;
}
public static int  _vvvvvvvvvvv5(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Public Sub GetBorderWidth(controlObj As Node) As I";
 //BA.debugLineNum = 58;BA.debugLine="Return CSSUtils.GetStyleProperty (controlObj, \"-f";
if (true) return (int)(Double.parseDouble(_vvvvvvvvvvvvvvvvvvvv3._getstyleproperty(_controlobj,"-fx-border-width")));
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return 0;
}
public static String  _vvvvvvvvvvv6(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Public Sub GetEffect(controlObj As Node) As String";
 //BA.debugLineNum = 94;BA.debugLine="Return CSSUtils.GetStyleProperty(controlObj, \"-fx";
if (true) return _vvvvvvvvvvvvvvvvvvvv3._getstyleproperty(_controlobj,"-fx-effect");
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public static float  _vvvvvvvvvvv7(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj) throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Public Sub GetRotation(controlObj As Node) As Floa";
 //BA.debugLineNum = 16;BA.debugLine="Return CSSUtils.GetStyleProperty(controlObj, \"-fx";
if (true) return (float)(Double.parseDouble(_vvvvvvvvvvvvvvvvvvvv3._getstyleproperty(_controlobj,"-fx-rotate")));
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return 0f;
}
public static String  _vvvvvvvvvvv0(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Public Sub GetTextColor(controlObj As Node) As Str";
 //BA.debugLineNum = 116;BA.debugLine="Return CSSUtils.GetStyleProperty(controlObj, \"-fx";
if (true) return _vvvvvvvvvvvvvvvvvvvv3._getstyleproperty(_controlobj,"-fx-text-fill");
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_vvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvvv1(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj) throws Exception{
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
 //BA.debugLineNum = 160;BA.debugLine="Public Sub RemoveControlToolTip(ControlObj As Node";
 //BA.debugLineNum = 162;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 163;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)("")});
 //BA.debugLineNum = 165;BA.debugLine="joToolTip.RunMethod(\"uninstall\", Array(ControlObj";
_jotooltip.RunMethod("uninstall",new Object[]{(Object)(_controlobj.getObject()),(Object)(_jotooltip2.getObject())});
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvvv2(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Public Sub RemoveEffect(controlObj As Node)";
 //BA.debugLineNum = 101;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-effect";
_vvvvvvvvvvvvvvvvvvvv3._setstyleproperty(_controlobj,"-fx-effect","none");
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvvv3(anywheresoftware.b4j.objects.ImageViewWrapper _controlobj) throws Exception{
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
 //BA.debugLineNum = 138;BA.debugLine="Public Sub RemoveImageViewToolTip(ControlObj As Im";
 //BA.debugLineNum = 140;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 141;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initi";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)("")});
 //BA.debugLineNum = 142;BA.debugLine="joToolTip.RunMethod(\"uninstall\", Array(ControlObj";
_jotooltip.RunMethod("uninstall",new Object[]{(Object)(_controlobj.getObject()),(Object)(_jotooltip2.getObject())});
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvvv4(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _panelobj) throws Exception{
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
 //BA.debugLineNum = 183;BA.debugLine="Public Sub RemovePaneToolTip(PanelObj As Pane)";
 //BA.debugLineNum = 185;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 186;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)("")});
 //BA.debugLineNum = 188;BA.debugLine="joToolTip.RunMethod(\"uninstall\", Array(PanelObj,";
_jotooltip.RunMethod("uninstall",new Object[]{(Object)(_panelobj.getObject()),(Object)(_jotooltip2.getObject())});
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvvv5(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj,String _color) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Public Sub SetBG(controlObj As Node, color As Stri";
 //BA.debugLineNum = 23;BA.debugLine="CSSUtils.SetStyleProperty( controlObj, \"-fx-backg";
_vvvvvvvvvvvvvvvvvvvv3._setstyleproperty(_controlobj,"-fx-background-color",_color);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvvv6(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj,String _color,int _width) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Public Sub SetBorder(controlObj As Node, color As";
 //BA.debugLineNum = 65;BA.debugLine="SetBorderColor( controlObj, color)";
_vvvvvvvvvvvv7(_controlobj,_color);
 //BA.debugLineNum = 66;BA.debugLine="SetBorderWidth(controlObj, width)";
_vvvvvvvvvvvvv1(_controlobj,_width);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvvv7(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj,String _color) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Public Sub SetBorderColor(controlObj As Node, colo";
 //BA.debugLineNum = 37;BA.debugLine="CSSUtils.SetStyleProperty( controlObj, \"-fx-borde";
_vvvvvvvvvvvvvvvvvvvv3._setstyleproperty(_controlobj,"-fx-border-color",_color);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvvv0(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj,int _radius) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Public Sub SetBorderRadius(controlObj As Node, rad";
 //BA.debugLineNum = 73;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-border";
_vvvvvvvvvvvvvvvvvvvv3._setstyleproperty(_controlobj,"-fx-border-radius",BA.NumberToString(_radius));
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvvvv1(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj,int _width) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Public Sub SetBorderWidth(controlObj As Node, widt";
 //BA.debugLineNum = 51;BA.debugLine="CSSUtils.SetStyleProperty (controlObj, \"-fx-borde";
_vvvvvvvvvvvvvvvvvvvv3._setstyleproperty(_controlobj,"-fx-border-width",BA.NumberToString(_width));
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvvvv2(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj,String _effect) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Public Sub SetEffect(controlObj As Node, effect As";
 //BA.debugLineNum = 87;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-effect";
_vvvvvvvvvvvvvvvvvvvv3._setstyleproperty(_controlobj,"-fx-effect",_effect);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvvvv3(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj,float _angle) throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Public Sub SetRotation(controlObj As Node, Angle A";
 //BA.debugLineNum = 9;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-rotate";
_vvvvvvvvvvvvvvvvvvvv3._setstyleproperty(_controlobj,"-fx-rotate",BA.NumberToString(_angle));
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvvvv4(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj,String _color) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Public Sub SetTextColor(controlObj As Node, color";
 //BA.debugLineNum = 109;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-text-f";
_vvvvvvvvvvvvvvvvvvvv3._setstyleproperty(_controlobj,"-fx-text-fill",_color);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
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
