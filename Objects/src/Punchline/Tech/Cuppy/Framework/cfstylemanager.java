package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class cfstylemanager extends Object{
public static cfstylemanager mostCurrent = new cfstylemanager();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfstylemanager", null);
		ba.loadHtSubs(cfstylemanager.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "Punchline.Tech.Cuppy.Framework.cfstylemanager", ba);
		}
	}
    public static Class<?> getObject() {
		return cfstylemanager.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static Punchline.Tech.Cuppy.Framework.cfthemes _availablethemes = null;
public static anywheresoftware.b4a.objects.collections.Map _defaulttheme = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _font_black = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _font_black_italic = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _font_bold = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _font_bold_italic = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _font_light = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _font_light_italic = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _font_regular_font = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _font_italic = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _font_medium = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _font_medium_italic = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _font_thin = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _font_thin_italic = null;
public static String _theme_blue = "";
public static String _theme_teal = "";
public static String _theme_gray = "";
public static String _theme_dark = "";
public static String _theme_purple = "";
public static String _theme_pink = "";
public static String _theme_amber = "";
public static b4j.example.cssutils _cssutils = null;
public static Punchline.Tech.Cuppy.Framework.main _main = null;
public static Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public static Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public static Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public static Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public static Punchline.Tech.Cuppy.Framework.cfanimationmanager _cfanimationmanager = null;
public static Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper  _selectfont(String _fontname,double _fontsize) throws Exception{
RDebugUtils.currentModule="cfstylemanager";
if (Debug.shouldDelegate(ba, "selectfont"))
	 {return ((anywheresoftware.b4j.objects.JFX.FontWrapper) Debug.delegate(ba, "selectfont", new Object[] {_fontname,_fontsize}));}
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Public Sub SelectFont(fontName As String,  FontSiz";
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="Return fx.LoadFont(File.DirAssets , FontTypes.Get";
if (true) return _fx.LoadFont(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),BA.ObjectToString(_fonttypes().Get((Object)(_fontname))),_fontsize);
RDebugUtils.currentLine=10747908;
 //BA.debugLineNum = 10747908;BA.debugLine="End Sub";
return null;
}
public static String  _exportcurrenttheme(String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="cfstylemanager";
if (Debug.shouldDelegate(ba, "exportcurrenttheme"))
	 {return ((String) Debug.delegate(ba, "exportcurrenttheme", new Object[] {_dir,_filename}));}
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Public Sub ExportCurrentTheme(Dir As String, FileN";
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="File.WriteMap(Dir, FileName, DefaultTheme)";
anywheresoftware.b4a.keywords.Common.File.WriteMap(_dir,_filename,_defaulttheme);
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="End Sub";
return "";
}
public static String  _exporttheme(String _theme,String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="cfstylemanager";
if (Debug.shouldDelegate(ba, "exporttheme"))
	 {return ((String) Debug.delegate(ba, "exporttheme", new Object[] {_theme,_dir,_filename}));}
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Public Sub ExportTheme(theme As String , Dir As St";
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="theme = CFStringUtility.ucfirst(theme)";
_theme = _cfstringutility._ucfirst(_theme);
RDebugUtils.currentLine=10944516;
 //BA.debugLineNum = 10944516;BA.debugLine="If AvailableThemes.ThemesList.ContainsKey(theme)";
if (_availablethemes._themeslist(null).ContainsKey((Object)(_theme))) { 
RDebugUtils.currentLine=10944518;
 //BA.debugLineNum = 10944518;BA.debugLine="File.WriteMap(Dir, FileName, AvailableThemes.Th";
anywheresoftware.b4a.keywords.Common.File.WriteMap(_dir,_filename,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_availablethemes._themeslist(null).Get((Object)(_theme)))));
 }else {
RDebugUtils.currentLine=10944522;
 //BA.debugLineNum = 10944522;BA.debugLine="LogError(\"Could not export theme(\" & theme & \").";
anywheresoftware.b4a.keywords.Common.LogError("Could not export theme("+_theme+"). Please check the Theme name!");
RDebugUtils.currentLine=10944523;
 //BA.debugLineNum = 10944523;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
RDebugUtils.currentLine=10944527;
 //BA.debugLineNum = 10944527;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _fonttypes() throws Exception{
RDebugUtils.currentModule="cfstylemanager";
if (Debug.shouldDelegate(ba, "fonttypes"))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "fonttypes", null));}
anywheresoftware.b4a.objects.collections.Map _ftypes = null;
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Private Sub FontTypes As Map";
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="Dim FTypes As Map";
_ftypes = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="FTypes.Initialize";
_ftypes.Initialize();
RDebugUtils.currentLine=10682373;
 //BA.debugLineNum = 10682373;BA.debugLine="FTypes.Put(\"Black\",\"Roboto-Black.ttf\")";
_ftypes.Put((Object)("Black"),(Object)("Roboto-Black.ttf"));
RDebugUtils.currentLine=10682374;
 //BA.debugLineNum = 10682374;BA.debugLine="FTypes.Put(\"BlackItalic\",\"Roboto-BlackItalic.ttf\"";
_ftypes.Put((Object)("BlackItalic"),(Object)("Roboto-BlackItalic.ttf"));
RDebugUtils.currentLine=10682376;
 //BA.debugLineNum = 10682376;BA.debugLine="FTypes.Put(\"Bold\",\"Roboto-Bold.ttf\")";
_ftypes.Put((Object)("Bold"),(Object)("Roboto-Bold.ttf"));
RDebugUtils.currentLine=10682377;
 //BA.debugLineNum = 10682377;BA.debugLine="FTypes.Put(\"BoldItalic\",\"Roboto-BoldItalic.ttf\")";
_ftypes.Put((Object)("BoldItalic"),(Object)("Roboto-BoldItalic.ttf"));
RDebugUtils.currentLine=10682379;
 //BA.debugLineNum = 10682379;BA.debugLine="FTypes.Put(\"Italic\",\"Roboto-Italic.ttf\")";
_ftypes.Put((Object)("Italic"),(Object)("Roboto-Italic.ttf"));
RDebugUtils.currentLine=10682380;
 //BA.debugLineNum = 10682380;BA.debugLine="FTypes.Put(\"Light\",\"Roboto-Light.ttf\")";
_ftypes.Put((Object)("Light"),(Object)("Roboto-Light.ttf"));
RDebugUtils.currentLine=10682382;
 //BA.debugLineNum = 10682382;BA.debugLine="FTypes.Put(\"LightItalic\",\"Roboto-LightItalic.ttf\"";
_ftypes.Put((Object)("LightItalic"),(Object)("Roboto-LightItalic.ttf"));
RDebugUtils.currentLine=10682383;
 //BA.debugLineNum = 10682383;BA.debugLine="FTypes.Put(\"Medium\",\"Roboto-Medium.ttf\")";
_ftypes.Put((Object)("Medium"),(Object)("Roboto-Medium.ttf"));
RDebugUtils.currentLine=10682385;
 //BA.debugLineNum = 10682385;BA.debugLine="FTypes.Put(\"MediumItalic\",\"Roboto-MediumItalic.tt";
_ftypes.Put((Object)("MediumItalic"),(Object)("Roboto-MediumItalic.ttf"));
RDebugUtils.currentLine=10682386;
 //BA.debugLineNum = 10682386;BA.debugLine="FTypes.Put(\"Regular\",\"Roboto-Regular.ttf\")";
_ftypes.Put((Object)("Regular"),(Object)("Roboto-Regular.ttf"));
RDebugUtils.currentLine=10682388;
 //BA.debugLineNum = 10682388;BA.debugLine="FTypes.Put(\"Thin\",\"Roboto-Thin.ttf\")";
_ftypes.Put((Object)("Thin"),(Object)("Roboto-Thin.ttf"));
RDebugUtils.currentLine=10682389;
 //BA.debugLineNum = 10682389;BA.debugLine="FTypes.Put(\"ThinItalic\",\"Roboto-ThinItalic.ttf\")";
_ftypes.Put((Object)("ThinItalic"),(Object)("Roboto-ThinItalic.ttf"));
RDebugUtils.currentLine=10682391;
 //BA.debugLineNum = 10682391;BA.debugLine="Return FTypes";
if (true) return _ftypes;
RDebugUtils.currentLine=10682393;
 //BA.debugLineNum = 10682393;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _loadthemefile(String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="cfstylemanager";
if (Debug.shouldDelegate(ba, "loadthemefile"))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "loadthemefile", new Object[] {_dir,_filename}));}
anywheresoftware.b4a.objects.collections.Map _mapx = null;
anywheresoftware.b4a.objects.collections.List _checklist = null;
String _keyx = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _errorstr = null;
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Public Sub LoadThemeFile(Dir As String, FileName A";
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="Dim mapx As Map = File.ReadMap(Dir ,FileName)";
_mapx = new anywheresoftware.b4a.objects.collections.Map();
_mapx = anywheresoftware.b4a.keywords.Common.File.ReadMap(_dir,_filename);
RDebugUtils.currentLine=10878980;
 //BA.debugLineNum = 10878980;BA.debugLine="Dim checklist As List";
_checklist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10878981;
 //BA.debugLineNum = 10878981;BA.debugLine="checklist.Initialize";
_checklist.Initialize();
RDebugUtils.currentLine=10878983;
 //BA.debugLineNum = 10878983;BA.debugLine="checklist.Add(\"primary\")";
_checklist.Add((Object)("primary"));
RDebugUtils.currentLine=10878984;
 //BA.debugLineNum = 10878984;BA.debugLine="checklist.Add(\"primary_dark\")";
_checklist.Add((Object)("primary_dark"));
RDebugUtils.currentLine=10878986;
 //BA.debugLineNum = 10878986;BA.debugLine="checklist.Add(\"primary_light\")";
_checklist.Add((Object)("primary_light"));
RDebugUtils.currentLine=10878987;
 //BA.debugLineNum = 10878987;BA.debugLine="checklist.Add(\"accent\")";
_checklist.Add((Object)("accent"));
RDebugUtils.currentLine=10878989;
 //BA.debugLineNum = 10878989;BA.debugLine="checklist.Add(\"primary_text\")";
_checklist.Add((Object)("primary_text"));
RDebugUtils.currentLine=10878990;
 //BA.debugLineNum = 10878990;BA.debugLine="checklist.Add(\"secondary_text\")";
_checklist.Add((Object)("secondary_text"));
RDebugUtils.currentLine=10878992;
 //BA.debugLineNum = 10878992;BA.debugLine="checklist.Add(\"icons\")";
_checklist.Add((Object)("icons"));
RDebugUtils.currentLine=10878993;
 //BA.debugLineNum = 10878993;BA.debugLine="checklist.Add(\"divider\")";
_checklist.Add((Object)("divider"));
RDebugUtils.currentLine=10878995;
 //BA.debugLineNum = 10878995;BA.debugLine="For Each KeyX As String In checklist";
{
final anywheresoftware.b4a.BA.IterableList group12 = _checklist;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_keyx = BA.ObjectToString(group12.Get(index12));
RDebugUtils.currentLine=10878998;
 //BA.debugLineNum = 10878998;BA.debugLine="If Not(mapx.ContainsKey(KeyX)) Or CFStringUtilit";
if (anywheresoftware.b4a.keywords.Common.Not(_mapx.ContainsKey((Object)(_keyx))) || _cfstringutility._isempty(BA.ObjectToString(_mapx.Get((Object)(_keyx))))) { 
RDebugUtils.currentLine=10879000;
 //BA.debugLineNum = 10879000;BA.debugLine="Dim ErrorStr As StringBuilder";
_errorstr = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=10879001;
 //BA.debugLineNum = 10879001;BA.debugLine="ErrorStr.Initialize";
_errorstr.Initialize();
RDebugUtils.currentLine=10879003;
 //BA.debugLineNum = 10879003;BA.debugLine="ErrorStr.Append(\"Could not load theme file (\" &";
_errorstr.Append("Could not load theme file ("+_filename+") ");
RDebugUtils.currentLine=10879004;
 //BA.debugLineNum = 10879004;BA.debugLine="ErrorStr.Append(\"because the theme key (\" & Key";
_errorstr.Append("because the theme key ("+_keyx+") is missing ");
RDebugUtils.currentLine=10879005;
 //BA.debugLineNum = 10879005;BA.debugLine="ErrorStr.Append(\"or its value is empty!\")";
_errorstr.Append("or its value is empty!");
RDebugUtils.currentLine=10879007;
 //BA.debugLineNum = 10879007;BA.debugLine="LogError(ErrorStr.ToString)";
anywheresoftware.b4a.keywords.Common.LogError(_errorstr.ToString());
RDebugUtils.currentLine=10879009;
 //BA.debugLineNum = 10879009;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
 }
};
RDebugUtils.currentLine=10879015;
 //BA.debugLineNum = 10879015;BA.debugLine="Return mapx";
if (true) return _mapx;
RDebugUtils.currentLine=10879017;
 //BA.debugLineNum = 10879017;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4j.objects.JFX.FontWrapper  _scalefont(String _familyname,double _size) throws Exception{
RDebugUtils.currentModule="cfstylemanager";
if (Debug.shouldDelegate(ba, "scalefont"))
	 {return ((anywheresoftware.b4j.objects.JFX.FontWrapper) Debug.delegate(ba, "scalefont", new Object[] {_familyname,_size}));}
RDebugUtils.currentLine=28114944;
 //BA.debugLineNum = 28114944;BA.debugLine="Public Sub ScaleFont(FamilyName As String,Size As";
RDebugUtils.currentLine=28114946;
 //BA.debugLineNum = 28114946;BA.debugLine="Return fx.CreateFont(FamilyName, Size, False, Fal";
if (true) return _fx.CreateFont(_familyname,_size,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28114948;
 //BA.debugLineNum = 28114948;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4j.objects.JFX.FontWrapper  _scalefont2(String _familyname,double _size,boolean _bold,boolean _italic) throws Exception{
RDebugUtils.currentModule="cfstylemanager";
if (Debug.shouldDelegate(ba, "scalefont2"))
	 {return ((anywheresoftware.b4j.objects.JFX.FontWrapper) Debug.delegate(ba, "scalefont2", new Object[] {_familyname,_size,_bold,_italic}));}
RDebugUtils.currentLine=28180480;
 //BA.debugLineNum = 28180480;BA.debugLine="Public Sub ScaleFont2(FamilyName As String,Size As";
RDebugUtils.currentLine=28180482;
 //BA.debugLineNum = 28180482;BA.debugLine="Return fx.CreateFont(FamilyName , Size, Bold, Ita";
if (true) return _fx.CreateFont(_familyname,_size,_bold,_italic);
RDebugUtils.currentLine=28180484;
 //BA.debugLineNum = 28180484;BA.debugLine="End Sub";
return null;
}
public static String  _selecttheme(String _theme) throws Exception{
RDebugUtils.currentModule="cfstylemanager";
if (Debug.shouldDelegate(ba, "selecttheme"))
	 {return ((String) Debug.delegate(ba, "selecttheme", new Object[] {_theme}));}
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Public Sub SelectTheme(Theme As String)";
RDebugUtils.currentLine=10813452;
 //BA.debugLineNum = 10813452;BA.debugLine="Theme = CFStringUtility.ucfirst(Theme)";
_theme = _cfstringutility._ucfirst(_theme);
RDebugUtils.currentLine=10813454;
 //BA.debugLineNum = 10813454;BA.debugLine="If AvailableThemes.ThemesList.ContainsKey(Theme)";
if (_availablethemes._themeslist(null).ContainsKey((Object)(_theme))) { 
RDebugUtils.currentLine=10813456;
 //BA.debugLineNum = 10813456;BA.debugLine="DefaultTheme = AvailableThemes.ThemesList.Get(Th";
_defaulttheme.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_availablethemes._themeslist(null).Get((Object)(_theme))));
 }else {
RDebugUtils.currentLine=10813460;
 //BA.debugLineNum = 10813460;BA.debugLine="LogError(\"Could not find the selected theme(\" &";
anywheresoftware.b4a.keywords.Common.LogError("Could not find the selected theme("+_theme+"). Please check the Theme name");
RDebugUtils.currentLine=10813461;
 //BA.debugLineNum = 10813461;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
RDebugUtils.currentLine=10813465;
 //BA.debugLineNum = 10813465;BA.debugLine="End Sub";
return "";
}
}