package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class cfapputility extends Object{
public static cfapputility mostCurrent = new cfapputility();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfapputility", null);
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
public static anywheresoftware.b4j.objects.JFX _vvvvvvvvvvvvvvvvvvv7 = null;
public static b4j.example.cssutils _vvvvvvvvvvvvvvvvvvvv3 = null;
public static Punchline.Tech.Cuppy.Framework.cfconfigs _vvvvvvvvvvvvvvvvvvvv4 = null;
public static Punchline.Tech.Cuppy.Framework.cfstringutility _vvvvvvvvvvvvvvvvvvvv5 = null;
public static Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _vvvvvvvvvvvvvvvvvvvv6 = null;
public static Punchline.Tech.Cuppy.Framework.cffileutility _vvvvvvvvvvvvvvvvvvvv7 = null;
public static Punchline.Tech.Cuppy.Framework.cfstylemanager _vvvvvvvvvvvvvvvvvvvv0 = null;
public static Punchline.Tech.Cuppy.Framework.cfcontrolsutils _vvvvvvvvvvvvvvvvvvvvv1 = null;
public static Punchline.Tech.Cuppy.Framework.cfmathutility _vvvvvvvvvvvvvvvvvvvvv3 = null;
public static Punchline.Tech.Cuppy.Framework.cfdatatypeutility _vvvvvvvvvvvvvvvvvvvvv4 = null;
public static String  _vvvvvvvvvvvvvvvvv1(Object _module) throws Exception{
anywheresoftware.b4j.object.JavaObject _modjo = null;
String _mostr = "";
 //BA.debugLineNum = 8;BA.debugLine="Public Sub GetPackageName(Module As Object) As Str";
 //BA.debugLineNum = 9;BA.debugLine="Dim ModJo As JavaObject = Module";
_modjo = new anywheresoftware.b4j.object.JavaObject();
_modjo.setObject((java.lang.Object)(_module));
 //BA.debugLineNum = 10;BA.debugLine="Dim MoStr As String = ModJo.RunMethod(\"toString\",";
_mostr = BA.ObjectToString(_modjo.RunMethod("toString",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 //BA.debugLineNum = 11;BA.debugLine="Return MoStr.SubString2(MoStr.LastIndexOf(\" \")+1,";
if (true) return _mostr.substring((int) (_mostr.lastIndexOf(" ")+1),_mostr.lastIndexOf("."));
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_vvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
}
