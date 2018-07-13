package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class apputility extends Object{
public static apputility mostCurrent = new apputility();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.apputility", null);
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
public static Punchline.Tech.Cuppy.Framework.configs _configs = null;
public static Punchline.Tech.Cuppy.Framework.stringutility _stringutility = null;
public static Punchline.Tech.Cuppy.Framework.mathutility _mathutility = null;
public static Punchline.Tech.Cuppy.Framework.datatypeutility _datatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.stylemanager _stylemanager = null;
public static Punchline.Tech.Cuppy.Framework.controlsutils _controlsutils = null;
public static Punchline.Tech.Cuppy.Framework.fileutility _fileutility = null;
public static Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public static Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public static Punchline.Tech.Cuppy.Framework.cf_htmlutility _cf_htmlutility = null;
public static Punchline.Tech.Cuppy.Framework.cf_datageneratorutility _cf_datageneratorutility = null;
public static String  _getpackagename(Object _module) throws Exception{
anywheresoftware.b4j.object.JavaObject _modjo = null;
String _mostr = "";
 //BA.debugLineNum = 10;BA.debugLine="Public Sub GetPackageName(Module As Object) As Str";
 //BA.debugLineNum = 11;BA.debugLine="Dim ModJo As JavaObject = Module";
_modjo = new anywheresoftware.b4j.object.JavaObject();
_modjo.setObject((java.lang.Object)(_module));
 //BA.debugLineNum = 12;BA.debugLine="Dim MoStr As String = ModJo.RunMethod(\"toString\",";
_mostr = BA.ObjectToString(_modjo.RunMethod("toString",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 13;BA.debugLine="Return MoStr.SubString2(MoStr.LastIndexOf(\" \")+1,";
if (true) return _mostr.substring((int) (_mostr.lastIndexOf(" ")+1),_mostr.lastIndexOf("."));
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
}
