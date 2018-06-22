package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class fileutility extends Object{
public static fileutility mostCurrent = new fileutility();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.fileutility", null);
		ba.loadHtSubs(fileutility.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "Punchline.Tech.Cuppy.Framework.fileutility", ba);
		}
	}
    public static Class<?> getObject() {
		return fileutility.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static b4j.example.cssutils _cssutils = null;
public static Punchline.Tech.Cuppy.Framework.configs _configs = null;
public static Punchline.Tech.Cuppy.Framework.componentsmanager _componentsmanager = null;
public static Punchline.Tech.Cuppy.Framework.stylemanager _stylemanager = null;
public static Punchline.Tech.Cuppy.Framework.controlsutils _controlsutils = null;
public static Punchline.Tech.Cuppy.Framework.stringutility _stringutility = null;
public static Punchline.Tech.Cuppy.Framework.cuppyglobals _cuppyglobals = null;
public static Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public static Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static long  _sizeofcurrentfilesinfolder(String _dir) throws Exception{
long _total = 0L;
String _filename = "";
 //BA.debugLineNum = 19;BA.debugLine="Public Sub SizeOfCurrentFilesInFolder(dir As Strin";
 //BA.debugLineNum = 21;BA.debugLine="Dim total As Long";
_total = 0L;
 //BA.debugLineNum = 23;BA.debugLine="For Each filename As String In File.ListFiles(dir";
{
final anywheresoftware.b4a.BA.IterableList group2 = anywheresoftware.b4a.keywords.Common.File.ListFiles(_dir);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_filename = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 25;BA.debugLine="If File.IsDirectory(dir, filename) = False Then";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_dir,_filename)==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 27;BA.debugLine="total = total + File.Size(dir , filename)";
_total = (long) (_total+anywheresoftware.b4a.keywords.Common.File.Size(_dir,_filename));
 };
 }
};
 //BA.debugLineNum = 33;BA.debugLine="Return total";
if (true) return _total;
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return 0L;
}
public static long  _sizeoffilesinfolder(String _dir) throws Exception{
long _total = 0L;
String _filename = "";
 //BA.debugLineNum = 43;BA.debugLine="Sub SizeOfFilesInFolder(dir As String) As Long";
 //BA.debugLineNum = 45;BA.debugLine="Dim total As Long";
_total = 0L;
 //BA.debugLineNum = 47;BA.debugLine="For Each filename As String In File.ListFiles(dir";
{
final anywheresoftware.b4a.BA.IterableList group2 = anywheresoftware.b4a.keywords.Common.File.ListFiles(_dir);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_filename = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 49;BA.debugLine="If File.IsDirectory(dir, filename) = False Then";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_dir,_filename)==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 51;BA.debugLine="total = total + File.Size(dir, filename)";
_total = (long) (_total+anywheresoftware.b4a.keywords.Common.File.Size(_dir,_filename));
 }else {
 //BA.debugLineNum = 55;BA.debugLine="total = total + SizeOfFilesInFolder(dir & \"\\\" &";
_total = (long) (_total+_sizeoffilesinfolder(_dir+"\\"+_filename));
 };
 }
};
 //BA.debugLineNum = 61;BA.debugLine="Return total";
if (true) return _total;
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return 0L;
}
}
