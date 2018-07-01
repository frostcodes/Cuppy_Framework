package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class cuppyglobals extends Object{
public static cuppyglobals mostCurrent = new cuppyglobals();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cuppyglobals", null);
		ba.loadHtSubs(cuppyglobals.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "Punchline.Tech.Cuppy.Framework.cuppyglobals", ba);
		}
	}
    public static Class<?> getObject() {
		return cuppyglobals.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static b4j.example.cssutils _cssutils = null;
public static Punchline.Tech.Cuppy.Framework.configs _configs = null;
public static Punchline.Tech.Cuppy.Framework.stylemanager _stylemanager = null;
public static Punchline.Tech.Cuppy.Framework.stringutility _stringutility = null;
public static Punchline.Tech.Cuppy.Framework.mathutility _mathutility = null;
public static Punchline.Tech.Cuppy.Framework.datatypeutility _datatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.controlsutils _controlsutils = null;
public static Punchline.Tech.Cuppy.Framework.componentsmanager _componentsmanager = null;
public static Punchline.Tech.Cuppy.Framework.fileutility _fileutility = null;
public static Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public static Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public static Punchline.Tech.Cuppy.Framework.apputility _apputility = null;
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
}
