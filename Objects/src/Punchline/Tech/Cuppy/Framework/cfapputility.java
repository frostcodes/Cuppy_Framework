package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class cfapputility extends Object{
public static cfapputility mostCurrent = new cfapputility();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfapputility", null);
		ba.loadHtSubs(cfapputility.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "Punchline.Tech.Cuppy.Framework.cfapputility", ba);
		}
	}
    public static Class<?> getObject() {
		return cfapputility.class;
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
public static Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public static Punchline.Tech.Cuppy.Framework.cfanimationmanager _cfanimationmanager = null;
public static Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public static String  _getpackagename(Object _module) throws Exception{
RDebugUtils.currentModule="cfapputility";
if (Debug.shouldDelegate(ba, "getpackagename"))
	 {return ((String) Debug.delegate(ba, "getpackagename", new Object[] {_module}));}
anywheresoftware.b4j.object.JavaObject _modjo = null;
String _mostr = "";
RDebugUtils.currentLine=27394048;
 //BA.debugLineNum = 27394048;BA.debugLine="Public Sub GetPackageName(Module As Object) As Str";
RDebugUtils.currentLine=27394049;
 //BA.debugLineNum = 27394049;BA.debugLine="Dim ModJo As JavaObject = Module";
_modjo = new anywheresoftware.b4j.object.JavaObject();
_modjo.setObject((java.lang.Object)(_module));
RDebugUtils.currentLine=27394050;
 //BA.debugLineNum = 27394050;BA.debugLine="Dim MoStr As String = ModJo.RunMethod(\"toString\",";
_mostr = BA.ObjectToString(_modjo.RunMethod("toString",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=27394051;
 //BA.debugLineNum = 27394051;BA.debugLine="Return MoStr.SubString2(MoStr.LastIndexOf(\" \")+1,";
if (true) return _mostr.substring((int) (_mostr.lastIndexOf(" ")+1),_mostr.lastIndexOf("."));
RDebugUtils.currentLine=27394052;
 //BA.debugLineNum = 27394052;BA.debugLine="End Sub";
return "";
}
}