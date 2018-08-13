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
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static b4j.example.cssutils _cssutils = null;
public static Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public static Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public static Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public static Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public static Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.cflicensemanager _cflicensemanager = null;
public static Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public static Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public static String  _addcontroltooltip(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj,String _msg) throws Exception{
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
 //BA.debugLineNum = 133;BA.debugLine="Public Sub AddControlToolTip(ControlObj As Control";
 //BA.debugLineNum = 135;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 136;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)(_msg)});
 //BA.debugLineNum = 137;BA.debugLine="joToolTip.RunMethod(\"install\", Array(ControlObj,";
_jotooltip.RunMethod("install",new Object[]{(Object)(_controlobj.getObject()),(Object)(_jotooltip2.getObject())});
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public static String  _addimageviewtooltip(anywheresoftware.b4j.objects.ImageViewWrapper _controlobj,String _msg) throws Exception{
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
 //BA.debugLineNum = 110;BA.debugLine="Public Sub AddImageViewToolTip(ControlObj As Image";
 //BA.debugLineNum = 112;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 113;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)(_msg)});
 //BA.debugLineNum = 115;BA.debugLine="joToolTip.RunMethod(\"install\", Array(ControlObj,";
_jotooltip.RunMethod("install",new Object[]{(Object)(_controlobj.getObject()),(Object)(_jotooltip2.getObject())});
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public static String  _addpanetooltip(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _panelobj,String _msg) throws Exception{
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
 //BA.debugLineNum = 156;BA.debugLine="Public Sub AddPaneToolTip(PanelObj As Pane, msg As";
 //BA.debugLineNum = 158;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 159;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)(_msg)});
 //BA.debugLineNum = 160;BA.debugLine="joToolTip.RunMethod(\"install\", Array(PanelObj, jo";
_jotooltip.RunMethod("install",new Object[]{(Object)(_panelobj.getObject()),(Object)(_jotooltip2.getObject())});
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return "";
}
public static String  _configuretooltip(long _opendelay,long _visibleduration,long _closedelay) throws Exception{
anywheresoftware.b4j.object.JavaObject _mejo = null;
String _classshortname = "";
anywheresoftware.b4j.object.JavaObject _modjo = null;
 //BA.debugLineNum = 195;BA.debugLine="Public Sub ConfigureTooltip(OpenDelay As Long,Visi";
 //BA.debugLineNum = 197;BA.debugLine="Dim MEJO As JavaObject = Me";
_mejo = new anywheresoftware.b4j.object.JavaObject();
_mejo.setObject((java.lang.Object)(cfcontrolsutils.getObject()));
 //BA.debugLineNum = 198;BA.debugLine="Dim ClassShortName As String = MEJO.RunMethod(\"to";
_classshortname = BA.ObjectToString(_mejo.RunMethod("toString",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 199;BA.debugLine="ClassShortName = ClassShortName.SubString(ClassSh";
_classshortname = _classshortname.substring(_classshortname.lastIndexOf("."));
 //BA.debugLineNum = 200;BA.debugLine="Dim ModJO As JavaObject";
_modjo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 201;BA.debugLine="ModJO.InitializeStatic(CFAppUtility.GetPackageNam";
_modjo.InitializeStatic(_cfapputility._getpackagename(cfcontrolsutils.getObject())+_classshortname);
 //BA.debugLineNum = 203;BA.debugLine="If ModJO.RunMethod(\"setTooltipTimers\",Array(OpenD";
if ((_modjo.RunMethod("setTooltipTimers",new Object[]{(Object)(_opendelay),(Object)(_visibleduration),(Object)(_closedelay)})).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
 //BA.debugLineNum = 204;BA.debugLine="Log($\"*******${CRLF}Tooltip Configuration failed";
anywheresoftware.b4a.keywords.Common.Log(("*******"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"Tooltip Configuration failed"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"*******"));
 };
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return "";
}
public static String  _getbg(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Public Sub GetBG(controlObj As Control) As String";
 //BA.debugLineNum = 101;BA.debugLine="Return CSSUtils.GetStyleProperty(controlObj, \"-fx";
if (true) return _cssutils._getstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-background-color");
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public static String  _getpanebg(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Public Sub GetPaneBG(PaneObj As Pane) As String";
 //BA.debugLineNum = 95;BA.debugLine="Return CSSUtils.GetStyleProperty(PaneObj, \"-fx-ba";
if (true) return _cssutils._getstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-background-color");
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 144;BA.debugLine="Public Sub RemoveControlToolTip(ControlObj As Cont";
 //BA.debugLineNum = 146;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 147;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)("")});
 //BA.debugLineNum = 149;BA.debugLine="joToolTip.RunMethod(\"uninstall\", Array(ControlObj";
_jotooltip.RunMethod("uninstall",new Object[]{(Object)(_controlobj.getObject()),(Object)(_jotooltip2.getObject())});
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public static String  _removeeffect(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Public Sub RemoveEffect(controlObj As Control)";
 //BA.debugLineNum = 62;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-effect";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-effect","none");
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public static String  _removeimageviewtooltip(anywheresoftware.b4j.objects.ImageViewWrapper _controlobj) throws Exception{
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
 //BA.debugLineNum = 122;BA.debugLine="Public Sub RemoveImageViewToolTip(ControlObj As Im";
 //BA.debugLineNum = 124;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 125;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initi";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)("")});
 //BA.debugLineNum = 126;BA.debugLine="joToolTip.RunMethod(\"uninstall\", Array(ControlObj";
_jotooltip.RunMethod("uninstall",new Object[]{(Object)(_controlobj.getObject()),(Object)(_jotooltip2.getObject())});
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public static String  _removepaneeffect(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Public Sub RemovePaneEffect(PaneObj As Pane)";
 //BA.debugLineNum = 56;BA.debugLine="CSSUtils.SetStyleProperty(PaneObj, \"-fx-effect\" ,";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-effect","none");
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public static String  _removepanetooltip(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _panelobj) throws Exception{
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
 //BA.debugLineNum = 167;BA.debugLine="Public Sub RemovePaneToolTip(PanelObj As Pane)";
 //BA.debugLineNum = 169;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 170;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)("")});
 //BA.debugLineNum = 172;BA.debugLine="joToolTip.RunMethod(\"uninstall\", Array(PanelObj,";
_jotooltip.RunMethod("uninstall",new Object[]{(Object)(_panelobj.getObject()),(Object)(_jotooltip2.getObject())});
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return "";
}
public static String  _setbg(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj,String _color) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Public Sub SetBG(controlObj As Control, color As S";
 //BA.debugLineNum = 76;BA.debugLine="CSSUtils.SetStyleProperty( controlObj, \"-fx-backg";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-background-color",_color);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public static String  _setborder(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj,String _color,int _width) throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Public Sub SetBorder(controlObj As Control, color";
 //BA.debugLineNum = 16;BA.debugLine="CSSUtils.SetStyleProperty( controlObj, \"-fx-borde";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-border-color",_color);
 //BA.debugLineNum = 17;BA.debugLine="CSSUtils.SetStyleProperty (controlObj, \"-fx-borde";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-border-width",BA.NumberToString(_width));
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public static String  _setborderradius(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj,int _radius) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Public Sub SetBorderRadius(controlObj As Control,";
 //BA.debugLineNum = 37;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-border";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-border-radius",BA.NumberToString(_radius));
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public static String  _seteffect(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj,String _effect) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Public Sub SetEffect(controlObj As Control, effect";
 //BA.debugLineNum = 49;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-effect";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-effect",_effect);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public static String  _setpanebg(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj,String _color) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Public Sub SetPaneBG(PaneObj As Pane, color As Str";
 //BA.debugLineNum = 69;BA.debugLine="CSSUtils.SetStyleProperty( PaneObj, \"-fx-backgrou";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-background-color",_color);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public static String  _setpaneborder(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj,String _color,int _width) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Public Sub SetPaneBorder(PaneObj As Pane, color As";
 //BA.debugLineNum = 23;BA.debugLine="CSSUtils.SetStyleProperty( PaneObj, \"-fx-border-c";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-border-color",_color);
 //BA.debugLineNum = 24;BA.debugLine="CSSUtils.SetStyleProperty (PaneObj, \"-fx-border-w";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-border-width",BA.NumberToString(_width));
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public static String  _setpaneborderradius(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj,int _radius) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Public Sub SetPaneBorderRadius(PaneObj As Pane, ra";
 //BA.debugLineNum = 30;BA.debugLine="CSSUtils.SetStyleProperty(PaneObj,\"-fx-border-rad";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-border-radius",BA.NumberToString(_radius));
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public static String  _setpaneeffect(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj,String _effect) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Public Sub SetPaneEffect(PaneObj As Pane, effect A";
 //BA.debugLineNum = 43;BA.debugLine="CSSUtils.SetStyleProperty(PaneObj, \"-fx-effect\" ,";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-effect",_effect);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public static String  _setpanerotationx(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneobj,float _angle) throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Public Sub SetPaneRotationX(PaneObj As Pane, Angle";
 //BA.debugLineNum = 11;BA.debugLine="CSSUtils.SetStyleProperty(PaneObj, \"-fx-rotate\",";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_paneobj.getObject())),"-fx-rotate",BA.NumberToString(_angle));
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public static String  _setrotationx(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj,float _angle) throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Public Sub SetRotationX(controlObj As Control, Ang";
 //BA.debugLineNum = 7;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-rotate";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-rotate",BA.NumberToString(_angle));
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public static String  _settextcolor(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _controlobj,String _color) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Public Sub SetTextColor(controlObj As Control, col";
 //BA.debugLineNum = 83;BA.debugLine="CSSUtils.SetStyleProperty(controlObj,\"-fx-text-fi";
_cssutils._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_controlobj.getObject())),"-fx-text-fill",_color);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
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
