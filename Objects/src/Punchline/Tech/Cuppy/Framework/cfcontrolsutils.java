package punchline.tech.cuppy.framework;

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
		ba = new  anywheresoftware.b4j.objects.FxBA("punchline.tech.cuppy.framework", "punchline.tech.cuppy.framework.cfcontrolsutils", null);
		ba.loadHtSubs(cfcontrolsutils.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "punchline.tech.cuppy.framework.cfcontrolsutils", ba);
		}
	}
    public static Class<?> getObject() {
		return cfcontrolsutils.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static b4j.example.cssutils _cssutils = null;
public static punchline.tech.cuppy.framework.cfstringutility _cfstringutility = null;
public static punchline.tech.cuppy.framework.cfdatageneratorutility _cfdatageneratorutility = null;
public static punchline.tech.cuppy.framework.cfapputility _cfapputility = null;
public static punchline.tech.cuppy.framework.cfmathutility _cfmathutility = null;
public static punchline.tech.cuppy.framework.cfstylemanager _cfstylemanager = null;
public static punchline.tech.cuppy.framework.cfconfigs _cfconfigs = null;
public static punchline.tech.cuppy.framework.cffileutility _cffileutility = null;
public static punchline.tech.cuppy.framework.cfdatatypeutility _cfdatatypeutility = null;
public static class _textmetric{
public boolean IsInitialized;
public double Width;
public double Height;
public void Initialize() {
IsInitialized = true;
Width = 0;
Height = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static String  _addcontroltooltip(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj,String _msg) throws Exception{
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
 //BA.debugLineNum = 151;BA.debugLine="Public Sub AddControlToolTip(ControlObj As Node, m";
 //BA.debugLineNum = 153;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 154;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)(_msg)});
 //BA.debugLineNum = 155;BA.debugLine="joToolTip.RunMethod(\"install\", Array(ControlObj,";
_jotooltip.RunMethod("install",new Object[]{(Object)(_controlobj.getObject()),(Object)(_jotooltip2.getObject())});
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
public static String  _addimageviewtooltip(anywheresoftware.b4j.objects.ImageViewWrapper _controlobj,String _msg) throws Exception{
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
 //BA.debugLineNum = 128;BA.debugLine="Public Sub AddImageViewToolTip(ControlObj As Image";
 //BA.debugLineNum = 130;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 131;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)(_msg)});
 //BA.debugLineNum = 133;BA.debugLine="joToolTip.RunMethod(\"install\", Array(ControlObj,";
_jotooltip.RunMethod("install",new Object[]{(Object)(_controlobj.getObject()),(Object)(_jotooltip2.getObject())});
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public static String  _addpanetooltip(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _panelobj,String _msg) throws Exception{
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
 //BA.debugLineNum = 174;BA.debugLine="Public Sub AddPaneToolTip(PanelObj As Pane, msg As";
 //BA.debugLineNum = 176;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 177;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)(_msg)});
 //BA.debugLineNum = 178;BA.debugLine="joToolTip.RunMethod(\"install\", Array(PanelObj, jo";
_jotooltip.RunMethod("install",new Object[]{(Object)(_panelobj.getObject()),(Object)(_jotooltip2.getObject())});
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public static String  _configuretooltip(long _opendelay,long _visibleduration,long _closedelay) throws Exception{
anywheresoftware.b4j.object.JavaObject _mejo = null;
String _classshortname = "";
anywheresoftware.b4j.object.JavaObject _modjo = null;
 //BA.debugLineNum = 213;BA.debugLine="Public Sub ConfigureTooltip(OpenDelay As Long,Visi";
 //BA.debugLineNum = 215;BA.debugLine="Dim MEJO As JavaObject = Me";
_mejo = new anywheresoftware.b4j.object.JavaObject();
_mejo.setObject((java.lang.Object)(cfcontrolsutils.getObject()));
 //BA.debugLineNum = 216;BA.debugLine="Dim ClassShortName As String = MEJO.RunMethod(\"to";
_classshortname = BA.ObjectToString(_mejo.RunMethod("toString",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 217;BA.debugLine="ClassShortName = ClassShortName.SubString(ClassSh";
_classshortname = _classshortname.substring(_classshortname.lastIndexOf("."));
 //BA.debugLineNum = 218;BA.debugLine="Dim ModJO As JavaObject";
_modjo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 219;BA.debugLine="ModJO.InitializeStatic(CFAppUtility.GetPackageNam";
_modjo.InitializeStatic(_cfapputility._getpackagename(cfcontrolsutils.getObject())+_classshortname);
 //BA.debugLineNum = 221;BA.debugLine="If ModJO.RunMethod(\"setTooltipTimers\",Array(OpenD";
if ((_modjo.RunMethod("setTooltipTimers",new Object[]{(Object)(_opendelay),(Object)(_visibleduration),(Object)(_closedelay)})).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
 //BA.debugLineNum = 222;BA.debugLine="Log($\"*******${CRLF}Tooltip Configuration failed";
anywheresoftware.b4a.keywords.Common.Log(("*******"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"Tooltip Configuration failed"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"*******"));
 };
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return "";
}
public static String  _getbackgroundcolor(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Public Sub GetBackgroundColor(controlObj As Node)";
 //BA.debugLineNum = 32;BA.debugLine="Return CSSUtils.GetStyleProperty(controlObj, \"-fx";
if (true) return _cssutils._getstyleproperty(_controlobj,"-fx-background-color");
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public static String  _getbordercolor(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Public Sub GetBorderColor(controlObj As Node) As S";
 //BA.debugLineNum = 46;BA.debugLine="Return CSSUtils.GetStyleProperty( controlObj, \"-f";
if (true) return _cssutils._getstyleproperty(_controlobj,"-fx-border-color");
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public static int  _getborderradius(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Public Sub GetBorderRadius(controlObj As Node) As";
 //BA.debugLineNum = 82;BA.debugLine="Return CSSUtils.GetStyleProperty(controlObj, \"-fx";
if (true) return (int)(Double.parseDouble(_cssutils._getstyleproperty(_controlobj,"-fx-border-radius")));
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return 0;
}
public static int  _getborderwidth(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Public Sub GetBorderWidth(controlObj As Node) As I";
 //BA.debugLineNum = 60;BA.debugLine="Return CSSUtils.GetStyleProperty (controlObj, \"-f";
if (true) return (int)(Double.parseDouble(_cssutils._getstyleproperty(_controlobj,"-fx-border-width")));
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return 0;
}
public static String  _geteffect(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Public Sub GetEffect(controlObj As Node) As String";
 //BA.debugLineNum = 96;BA.debugLine="Return CSSUtils.GetStyleProperty(controlObj, \"-fx";
if (true) return _cssutils._getstyleproperty(_controlobj,"-fx-effect");
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public static float  _getrotation(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj) throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Public Sub GetRotation(controlObj As Node) As Floa";
 //BA.debugLineNum = 18;BA.debugLine="Return CSSUtils.GetStyleProperty(controlObj, \"-fx";
if (true) return (float)(Double.parseDouble(_cssutils._getstyleproperty(_controlobj,"-fx-rotate")));
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return 0f;
}
public static String  _gettextcolor(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Public Sub GetTextColor(controlObj As Node) As Str";
 //BA.debugLineNum = 118;BA.debugLine="Return CSSUtils.GetStyleProperty(controlObj, \"-fx";
if (true) return _cssutils._getstyleproperty(_controlobj,"-fx-text-fill");
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public static punchline.tech.cuppy.framework.cfcontrolsutils._textmetric  _measuretext(String _text,anywheresoftware.b4j.objects.JFX.FontWrapper _tfont) throws Exception{
punchline.tech.cuppy.framework.cfcontrolsutils._textmetric _tm = null;
anywheresoftware.b4j.object.JavaObject _t = null;
 //BA.debugLineNum = 228;BA.debugLine="Public Sub MeasureText(Text As String,TFont As Fon";
 //BA.debugLineNum = 230;BA.debugLine="Dim TM As TextMetric";
_tm = new punchline.tech.cuppy.framework.cfcontrolsutils._textmetric();
 //BA.debugLineNum = 231;BA.debugLine="TM.Initialize";
_tm.Initialize();
 //BA.debugLineNum = 233;BA.debugLine="Dim T As JavaObject";
_t = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 235;BA.debugLine="T.InitializeNewInstance(\"javafx.scene.text.Text\",";
_t.InitializeNewInstance("javafx.scene.text.Text",new Object[]{(Object)(_text)});
 //BA.debugLineNum = 236;BA.debugLine="T.RunMethod(\"setFont\",Array(TFont))";
_t.RunMethod("setFont",new Object[]{(Object)(_tfont.getObject())});
 //BA.debugLineNum = 238;BA.debugLine="TM.Width = T.RunMethod(\"prefWidth\",Array(-1.0))";
_tm.Width = (double)(BA.ObjectToNumber(_t.RunMethod("prefWidth",new Object[]{(Object)(-1.0)})));
 //BA.debugLineNum = 239;BA.debugLine="TM.Height = T.RunMethod(\"prefHeight\",Array(TM.Wid";
_tm.Height = (double)(BA.ObjectToNumber(_t.RunMethod("prefHeight",new Object[]{(Object)(_tm.Width)})));
 //BA.debugLineNum = 241;BA.debugLine="Return TM";
if (true) return _tm;
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Type TextMetric(Width As Double, Height As Double";
;
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public static String  _removecontroltooltip(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj) throws Exception{
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
 //BA.debugLineNum = 162;BA.debugLine="Public Sub RemoveControlToolTip(ControlObj As Node";
 //BA.debugLineNum = 164;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 165;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)("")});
 //BA.debugLineNum = 167;BA.debugLine="joToolTip.RunMethod(\"uninstall\", Array(ControlObj";
_jotooltip.RunMethod("uninstall",new Object[]{(Object)(_controlobj.getObject()),(Object)(_jotooltip2.getObject())});
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return "";
}
public static String  _removeeffect(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Public Sub RemoveEffect(controlObj As Node)";
 //BA.debugLineNum = 103;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-effect";
_cssutils._setstyleproperty(_controlobj,"-fx-effect","none");
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public static String  _removeimageviewtooltip(anywheresoftware.b4j.objects.ImageViewWrapper _controlobj) throws Exception{
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
 //BA.debugLineNum = 140;BA.debugLine="Public Sub RemoveImageViewToolTip(ControlObj As Im";
 //BA.debugLineNum = 142;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 143;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initi";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)("")});
 //BA.debugLineNum = 144;BA.debugLine="joToolTip.RunMethod(\"uninstall\", Array(ControlObj";
_jotooltip.RunMethod("uninstall",new Object[]{(Object)(_controlobj.getObject()),(Object)(_jotooltip2.getObject())});
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public static String  _removepanetooltip(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _panelobj) throws Exception{
anywheresoftware.b4j.object.JavaObject _jotooltip = null;
anywheresoftware.b4j.object.JavaObject _jotooltip2 = null;
 //BA.debugLineNum = 185;BA.debugLine="Public Sub RemovePaneToolTip(PanelObj As Pane)";
 //BA.debugLineNum = 187;BA.debugLine="Dim joToolTip As JavaObject";
_jotooltip = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 188;BA.debugLine="Dim joToolTip2 As JavaObject = joToolTip.Initiali";
_jotooltip2 = new anywheresoftware.b4j.object.JavaObject();
_jotooltip2 = _jotooltip.InitializeNewInstance("javafx.scene.control.Tooltip",new Object[]{(Object)("")});
 //BA.debugLineNum = 190;BA.debugLine="joToolTip.RunMethod(\"uninstall\", Array(PanelObj,";
_jotooltip.RunMethod("uninstall",new Object[]{(Object)(_panelobj.getObject()),(Object)(_jotooltip2.getObject())});
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return "";
}
public static String  _setbackgroundcolor(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj,String _color) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Public Sub SetBackgroundColor(controlObj As Node,";
 //BA.debugLineNum = 25;BA.debugLine="CSSUtils.SetStyleProperty( controlObj, \"-fx-backg";
_cssutils._setstyleproperty(_controlobj,"-fx-background-color",_color);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public static String  _setborder(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj,String _color,int _width) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Public Sub SetBorder(controlObj As Node, color As";
 //BA.debugLineNum = 67;BA.debugLine="SetBorderColor( controlObj, color)";
_setbordercolor(_controlobj,_color);
 //BA.debugLineNum = 68;BA.debugLine="SetBorderWidth(controlObj, width)";
_setborderwidth(_controlobj,_width);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public static String  _setbordercolor(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj,String _color) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Public Sub SetBorderColor(controlObj As Node, colo";
 //BA.debugLineNum = 39;BA.debugLine="CSSUtils.SetStyleProperty( controlObj, \"-fx-borde";
_cssutils._setstyleproperty(_controlobj,"-fx-border-color",_color);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public static String  _setborderradius(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj,int _radius) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Public Sub SetBorderRadius(controlObj As Node, rad";
 //BA.debugLineNum = 75;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-border";
_cssutils._setstyleproperty(_controlobj,"-fx-border-radius",BA.NumberToString(_radius));
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public static String  _setborderwidth(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj,int _width) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Public Sub SetBorderWidth(controlObj As Node, widt";
 //BA.debugLineNum = 53;BA.debugLine="CSSUtils.SetStyleProperty (controlObj, \"-fx-borde";
_cssutils._setstyleproperty(_controlobj,"-fx-border-width",BA.NumberToString(_width));
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public static String  _seteffect(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj,String _effect) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Public Sub SetEffect(controlObj As Node, effect As";
 //BA.debugLineNum = 89;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-effect";
_cssutils._setstyleproperty(_controlobj,"-fx-effect",_effect);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public static String  _setrotation(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj,float _angle) throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Public Sub SetRotation(controlObj As Node, Angle A";
 //BA.debugLineNum = 11;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-rotate";
_cssutils._setstyleproperty(_controlobj,"-fx-rotate",BA.NumberToString(_angle));
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public static String  _settextcolor(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _controlobj,String _color) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Public Sub SetTextColor(controlObj As Node, color";
 //BA.debugLineNum = 111;BA.debugLine="CSSUtils.SetStyleProperty(controlObj, \"-fx-text-f";
_cssutils._setstyleproperty(_controlobj,"-fx-text-fill",_color);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
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
