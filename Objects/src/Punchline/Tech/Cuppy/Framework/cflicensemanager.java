package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class cflicensemanager extends Object{
public static cflicensemanager mostCurrent = new cflicensemanager();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cflicensemanager", null);
		ba.loadHtSubs(cflicensemanager.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "Punchline.Tech.Cuppy.Framework.cflicensemanager", ba);
		}
	}
    public static Class<?> getObject() {
		return cflicensemanager.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _licensekey = "";
public static b4j.example.cssutils _cssutils = null;
public static Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public static Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public static Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public static Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public static Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.cfanimationmanager _cfanimationmanager = null;
public static Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public static Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public static Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public static Punchline.Tech.Cuppy.Framework.cfhtmlutility _cfhtmlutility = null;
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Public LicenseKey As String = \"\"";
_licensekey = "";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
}
