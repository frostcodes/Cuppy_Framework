package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class cfconfigs extends Object{
public static cfconfigs mostCurrent = new cfconfigs();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfconfigs", null);
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
public static String _libraryauthor = "";
public static String _libraryname = "";
public static double _libraryversion = 0;
public static String _librarycopyright = "";
public static b4j.example.cssutils _cssutils = null;
public static Punchline.Tech.Cuppy.Framework.main _main = null;
public static Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public static Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public static Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public static Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public static Punchline.Tech.Cuppy.Framework.cfanimationmanager _cfanimationmanager = null;
public static Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public static String  _donationlink() throws Exception{
RDebugUtils.currentModule="cfconfigs";
if (Debug.shouldDelegate(ba, "donationlink"))
	 {return ((String) Debug.delegate(ba, "donationlink", null));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Public Sub DonationLink As String";
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="Return \"http://punchlinetech.com/product/cuppy-fr";
if (true) return "http://punchlinetech.com/product/cuppy-framework-free/#FullCuppyFramework";
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="End Sub";
return "";
}
public static String  _fullcuppyrequiredimageurl() throws Exception{
RDebugUtils.currentModule="cfconfigs";
if (Debug.shouldDelegate(ba, "fullcuppyrequiredimageurl"))
	 {return ((String) Debug.delegate(ba, "fullcuppyrequiredimageurl", null));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Public Sub FullCuppyRequiredImageUrl As String";
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="Return File.GetUri(File.DirAssets, \"full-cuppy-fr";
if (true) return anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"full-cuppy-framework-required.png");
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="End Sub";
return "";
}
public static boolean  _isfreeversion() throws Exception{
RDebugUtils.currentModule="cfconfigs";
if (Debug.shouldDelegate(ba, "isfreeversion"))
	 {return ((Boolean) Debug.delegate(ba, "isfreeversion", null));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Public Sub IsFreeVersion As Boolean";
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="End Sub";
return false;
}
public static boolean  _isfullversion() throws Exception{
RDebugUtils.currentModule="cfconfigs";
if (Debug.shouldDelegate(ba, "isfullversion"))
	 {return ((Boolean) Debug.delegate(ba, "isfullversion", null));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Public Sub IsFullVersion As Boolean";
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="End Sub";
return false;
}
}