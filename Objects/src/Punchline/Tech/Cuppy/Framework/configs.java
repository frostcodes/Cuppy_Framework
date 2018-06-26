package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class configs extends Object{
public static configs mostCurrent = new configs();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.configs", null);
		ba.loadHtSubs(configs.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "Punchline.Tech.Cuppy.Framework.configs", ba);
		}
	}
    public static Class<?> getObject() {
		return configs.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _libraryauthor = "";
public static String _libraryname = "";
public static String _libraryversion = "";
public static boolean _debugmode = false;
public static String _appdir = "";
public static String _robotofontspath = "";
public static String _licenseserver = "";
public static b4j.example.cssutils _cssutils = null;
public static Punchline.Tech.Cuppy.Framework.componentsmanager _componentsmanager = null;
public static Punchline.Tech.Cuppy.Framework.stylemanager _stylemanager = null;
public static Punchline.Tech.Cuppy.Framework.controlsutils _controlsutils = null;
public static Punchline.Tech.Cuppy.Framework.cuppyglobals _cuppyglobals = null;
public static Punchline.Tech.Cuppy.Framework.numbersutility _numbersutility = null;
public static Punchline.Tech.Cuppy.Framework.stringutility _stringutility = null;
public static Punchline.Tech.Cuppy.Framework.mathutility _mathutility = null;
public static Punchline.Tech.Cuppy.Framework.fileutility _fileutility = null;
public static Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public static Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public static Punchline.Tech.Cuppy.Framework.datatypeutility _datatypeutility = null;
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Public LibraryAuthor As String = \"Punchline Techn";
_libraryauthor = "Punchline Technologies";
 //BA.debugLineNum = 6;BA.debugLine="Public LibraryName As String =  \"Cuppy Framework\"";
_libraryname = "Cuppy Framework";
 //BA.debugLineNum = 7;BA.debugLine="Public LibraryVersion As String =  \"0.9.1\"";
_libraryversion = "0.9.1";
 //BA.debugLineNum = 8;BA.debugLine="Public DebugMode As Boolean = True  'are we debug";
_debugmode = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 12;BA.debugLine="Public AppDir As String = File.DirApp";
_appdir = anywheresoftware.b4a.keywords.Common.File.getDirApp();
 //BA.debugLineNum = 13;BA.debugLine="Public RobotoFontsPath As String =  File.Combine(";
_robotofontspath = anywheresoftware.b4a.keywords.Common.File.Combine(_appdir,"Roboto");
 //BA.debugLineNum = 19;BA.debugLine="Private LicenseServer As String =\"\"";
_licenseserver = "";
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
}
