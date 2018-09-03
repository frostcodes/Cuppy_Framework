package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class cfconfigs extends Object{
public static cfconfigs mostCurrent = new cfconfigs();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfconfigs", null);
		ba.loadHtSubs(cfconfigs.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "Punchline.Tech.Cuppy.Framework.cfconfigs", ba);
		}
	}
    public static Class<?> getObject() {
		return cfconfigs.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _v5 = "";
public static String _v6 = "";
public static double _v7 = 0;
public static String _v0 = "";
public static b4j.example.cssutils _vvvvvvvvvvvvvvv5 = null;
public static Punchline.Tech.Cuppy.Framework.cfstylemanager _vvvvvvvvvvvvvvv7 = null;
public static Punchline.Tech.Cuppy.Framework.cfcontrolsutils _vvvvvvvvvvvvvvv0 = null;
public static Punchline.Tech.Cuppy.Framework.cfstringutility _vvvvvvvvvvvvvvvv2 = null;
public static Punchline.Tech.Cuppy.Framework.cffileutility _vvvvvvvvvvvvvvvv3 = null;
public static Punchline.Tech.Cuppy.Framework.cfmathutility _vvvvvvvvvvvvvvvv4 = null;
public static Punchline.Tech.Cuppy.Framework.cfdatatypeutility _vvvvvvvvvvvvvvvv5 = null;
public static Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _vvvvvvvvvvvvvvvv6 = null;
public static Punchline.Tech.Cuppy.Framework.cfapputility _vvvvvvvvvvvvvvvv7 = null;
public static String  _vv1() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Public Sub DonationLink As String";
 //BA.debugLineNum = 15;BA.debugLine="Return \"http://punchlinetech.com/product/cuppy-fr";
if (true) return "http://punchlinetech.com/product/cuppy-framework-free/#FullCuppyFramework";
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public static boolean  _vv2() throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Public Sub IsFreeVersion As Boolean";
 //BA.debugLineNum = 40;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return false;
}
public static boolean  _vv3() throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Public Sub IsFullVersion As Boolean";
 //BA.debugLineNum = 47;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return false;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Public LibraryAuthor As String = \"Punchline Techn";
_v5 = "Punchline Technologies";
 //BA.debugLineNum = 6;BA.debugLine="Public LibraryName As String =  \"Cuppy Framework\"";
_v6 = "Cuppy Framework";
 //BA.debugLineNum = 7;BA.debugLine="Public LibraryVersion As Double =  1.03";
_v7 = 1.03;
 //BA.debugLineNum = 8;BA.debugLine="Public LibraryCopyright As String =  \"Copyright t";
_v0 = "Copyright to Oluwaseyi Aderinkomi < Frost Codes >";
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
}
