package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class apputility extends Object{
public static apputility mostCurrent = new apputility();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.apputility", null);
		ba.loadHtSubs(apputility.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "Punchline.Tech.Cuppy.Framework.apputility", ba);
		}
	}
    public static Class<?> getObject() {
		return apputility.class;
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
public static Punchline.Tech.Cuppy.Framework.controlsutils _controlsutils = null;
public static Punchline.Tech.Cuppy.Framework.fileutility _fileutility = null;
public static Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public static Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public static String  _getpackagename(Object _module) throws Exception{
RDebugUtils.currentModule="apputility";
if (Debug.shouldDelegate(ba, "getpackagename"))
	 {return ((String) Debug.delegate(ba, "getpackagename", new Object[] {_module}));}
anywheresoftware.b4j.object.JavaObject _modjo = null;
String _mostr = "";
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Public Sub GetPackageName(Module As Object) As Str";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="Dim ModJo As JavaObject = Module";
_modjo = new anywheresoftware.b4j.object.JavaObject();
_modjo.setObject((java.lang.Object)(_module));
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="Dim MoStr As String = ModJo.RunMethod(\"toString\",";
_mostr = BA.ObjectToString(_modjo.RunMethod("toString",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=11993091;
 //BA.debugLineNum = 11993091;BA.debugLine="Return MoStr.SubString2(MoStr.LastIndexOf(\" \")+1,";
if (true) return _mostr.substring((int) (_mostr.lastIndexOf(" ")+1),_mostr.lastIndexOf("."));
RDebugUtils.currentLine=11993092;
 //BA.debugLineNum = 11993092;BA.debugLine="End Sub";
return "";
}
}