package punchline.tech.cuppy.framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class cfconfigs extends Object{
public static cfconfigs mostCurrent = new cfconfigs();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("punchline.tech.cuppy.framework", "punchline.tech.cuppy.framework.cfconfigs", null);
		ba.loadHtSubs(cfconfigs.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "punchline.tech.cuppy.framework.cfconfigs", ba);
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
public static punchline.tech.cuppy.framework.cfcontrolsutils _cfcontrolsutils = null;
public static punchline.tech.cuppy.framework.cfstringutility _cfstringutility = null;
public static punchline.tech.cuppy.framework.cfdatageneratorutility _cfdatageneratorutility = null;
public static punchline.tech.cuppy.framework.cfapputility _cfapputility = null;
public static punchline.tech.cuppy.framework.cfstylemanager _cfstylemanager = null;
public static punchline.tech.cuppy.framework.cffileutility _cffileutility = null;
public static punchline.tech.cuppy.framework.cfmathutility _cfmathutility = null;
public static punchline.tech.cuppy.framework.cfdatatypeutility _cfdatatypeutility = null;
public static String  _donationlink() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Public Sub DonationLink As String";
 //BA.debugLineNum = 14;BA.debugLine="Return \"http://punchlinetech.com/product/cuppy-fr";
if (true) return "http://punchlinetech.com/product/cuppy-framework-free/#FullCuppyFramework";
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public static String  _fullcuppyrequiredimageurl() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Public Sub FullCuppyRequiredImageUrl As String";
 //BA.debugLineNum = 21;BA.debugLine="Return File.GetUri(File.DirAssets, \"full-cuppy-fr";
if (true) return anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"full-cuppy-framework-required.png");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public static boolean  _isfreeversion() throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Public Sub IsFreeVersion As Boolean";
 //BA.debugLineNum = 31;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return false;
}
public static boolean  _isfullversion() throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Public Sub IsFullVersion As Boolean";
 //BA.debugLineNum = 38;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return false;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Public LibraryAuthor As String = \"Punchline Techn";
_libraryauthor = "Punchline Technologies";
 //BA.debugLineNum = 6;BA.debugLine="Public LibraryName As String =  \"Cuppy Framework\"";
_libraryname = "Cuppy Framework";
 //BA.debugLineNum = 7;BA.debugLine="Public LibraryVersion As Double =  1.03";
_libraryversion = 1.03;
 //BA.debugLineNum = 8;BA.debugLine="Public LibraryCopyright As String =  \"Copyright t";
_librarycopyright = "Copyright to Oluwaseyi Aderinkomi < Frost Codes >";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
}
