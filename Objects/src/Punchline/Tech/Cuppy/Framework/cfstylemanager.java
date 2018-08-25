package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class cfstylemanager extends Object{
public static cfstylemanager mostCurrent = new cfstylemanager();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfstylemanager", null);
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
public static anywheresoftware.b4j.objects.JFX.FontWrapper _defaultfont = null;
public static Punchline.Tech.Cuppy.Framework.cfthemes _availablethemes = null;
public static anywheresoftware.b4a.objects.collections.Map _defaulttheme = null;
public static anywheresoftware.b4a.objects.collections.List _activecontrols = null;
public static b4j.example.cssutils _cssutils = null;
public static Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public static Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public static Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public static Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public static Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public static Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public static String  _exportcurrenttheme(String _dir,String _filename) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Public Sub ExportCurrentTheme(Dir As String, FileN";
 //BA.debugLineNum = 147;BA.debugLine="File.WriteMap(Dir, FileName, DefaultTheme)";
anywheresoftware.b4a.keywords.Common.File.WriteMap(_dir,_filename,_defaulttheme);
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return "";
}
public static String  _exporttheme(String _theme,String _dir,String _filename) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Public Sub ExportTheme(theme As String , Dir As St";
 //BA.debugLineNum = 129;BA.debugLine="theme = CFStringUtility.ucfirst(theme)";
_theme = _cfstringutility._ucfirst(_theme);
 //BA.debugLineNum = 131;BA.debugLine="If AvailableThemes.ThemesList.ContainsKey(theme)";
if (_availablethemes._themeslist().ContainsKey((Object)(_theme))) { 
 //BA.debugLineNum = 133;BA.debugLine="File.WriteMap(Dir, FileName, AvailableThemes.Th";
anywheresoftware.b4a.keywords.Common.File.WriteMap(_dir,_filename,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_availablethemes._themeslist().Get((Object)(_theme)))));
 }else {
 //BA.debugLineNum = 137;BA.debugLine="LogError(\"Could not export theme(\" & theme & \").";
anywheresoftware.b4a.keywords.Common.LogError("Could not export theme("+_theme+"). Please check the Theme name!");
 //BA.debugLineNum = 138;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _fonttypes() throws Exception{
anywheresoftware.b4a.objects.collections.Map _ftypes = null;
 //BA.debugLineNum = 18;BA.debugLine="Public Sub FontTypes As Map";
 //BA.debugLineNum = 20;BA.debugLine="Dim FTypes As Map";
_ftypes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 21;BA.debugLine="FTypes.Initialize";
_ftypes.Initialize();
 //BA.debugLineNum = 23;BA.debugLine="FTypes.Put(\"Black\",\"Roboto-Black.ttf\")";
_ftypes.Put((Object)("Black"),(Object)("Roboto-Black.ttf"));
 //BA.debugLineNum = 24;BA.debugLine="FTypes.Put(\"BlackItalic\",\"Roboto-BlackItalic.ttf\"";
_ftypes.Put((Object)("BlackItalic"),(Object)("Roboto-BlackItalic.ttf"));
 //BA.debugLineNum = 26;BA.debugLine="FTypes.Put(\"Bold\",\"Roboto-Bold.ttf\")";
_ftypes.Put((Object)("Bold"),(Object)("Roboto-Bold.ttf"));
 //BA.debugLineNum = 27;BA.debugLine="FTypes.Put(\"BoldItalic\",\"Roboto-BoldItalic.ttf\")";
_ftypes.Put((Object)("BoldItalic"),(Object)("Roboto-BoldItalic.ttf"));
 //BA.debugLineNum = 29;BA.debugLine="FTypes.Put(\"Italic\",\"Roboto-Italic.ttf\")";
_ftypes.Put((Object)("Italic"),(Object)("Roboto-Italic.ttf"));
 //BA.debugLineNum = 30;BA.debugLine="FTypes.Put(\"Light\",\"Roboto-Light.ttf\")";
_ftypes.Put((Object)("Light"),(Object)("Roboto-Light.ttf"));
 //BA.debugLineNum = 32;BA.debugLine="FTypes.Put(\"LightItalic\",\"Roboto-LightItalic.ttf\"";
_ftypes.Put((Object)("LightItalic"),(Object)("Roboto-LightItalic.ttf"));
 //BA.debugLineNum = 33;BA.debugLine="FTypes.Put(\"Medium\",\"Roboto-Medium.ttf\")";
_ftypes.Put((Object)("Medium"),(Object)("Roboto-Medium.ttf"));
 //BA.debugLineNum = 35;BA.debugLine="FTypes.Put(\"MediumItalic\",\"Roboto-MediumItalic.tt";
_ftypes.Put((Object)("MediumItalic"),(Object)("Roboto-MediumItalic.ttf"));
 //BA.debugLineNum = 36;BA.debugLine="FTypes.Put(\"Regular\",\"Roboto-Regular.ttf\")";
_ftypes.Put((Object)("Regular"),(Object)("Roboto-Regular.ttf"));
 //BA.debugLineNum = 38;BA.debugLine="FTypes.Put(\"Thin\",\"Roboto-Thin.ttf\")";
_ftypes.Put((Object)("Thin"),(Object)("Roboto-Thin.ttf"));
 //BA.debugLineNum = 39;BA.debugLine="FTypes.Put(\"ThinItalic\",\"Roboto-ThinItalic.ttf\")";
_ftypes.Put((Object)("ThinItalic"),(Object)("Roboto-ThinItalic.ttf"));
 //BA.debugLineNum = 41;BA.debugLine="Return FTypes";
if (true) return _ftypes;
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _loadthemefile(String _dir,String _filename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mapx = null;
anywheresoftware.b4a.objects.collections.List _checklist = null;
String _keyx = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _errorstr = null;
 //BA.debugLineNum = 79;BA.debugLine="Public Sub LoadThemeFile(Dir As String, FileName A";
 //BA.debugLineNum = 85;BA.debugLine="Dim mapx As Map = File.ReadMap(Dir ,FileName)";
_mapx = new anywheresoftware.b4a.objects.collections.Map();
_mapx = anywheresoftware.b4a.keywords.Common.File.ReadMap(_dir,_filename);
 //BA.debugLineNum = 87;BA.debugLine="Dim checklist As List";
_checklist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 88;BA.debugLine="checklist.Initialize";
_checklist.Initialize();
 //BA.debugLineNum = 90;BA.debugLine="checklist.Add(\"primary\")";
_checklist.Add((Object)("primary"));
 //BA.debugLineNum = 91;BA.debugLine="checklist.Add(\"primary_dark\")";
_checklist.Add((Object)("primary_dark"));
 //BA.debugLineNum = 93;BA.debugLine="checklist.Add(\"primary_light\")";
_checklist.Add((Object)("primary_light"));
 //BA.debugLineNum = 94;BA.debugLine="checklist.Add(\"accent\")";
_checklist.Add((Object)("accent"));
 //BA.debugLineNum = 96;BA.debugLine="checklist.Add(\"primary_text\")";
_checklist.Add((Object)("primary_text"));
 //BA.debugLineNum = 97;BA.debugLine="checklist.Add(\"secondary_text\")";
_checklist.Add((Object)("secondary_text"));
 //BA.debugLineNum = 99;BA.debugLine="checklist.Add(\"icons\")";
_checklist.Add((Object)("icons"));
 //BA.debugLineNum = 100;BA.debugLine="checklist.Add(\"divider\")";
_checklist.Add((Object)("divider"));
 //BA.debugLineNum = 102;BA.debugLine="For Each KeyX As String In checklist";
{
final anywheresoftware.b4a.BA.IterableList group12 = _checklist;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_keyx = BA.ObjectToString(group12.Get(index12));
 //BA.debugLineNum = 105;BA.debugLine="If Not(mapx.ContainsKey(KeyX)) Or CFStringUtilit";
if (anywheresoftware.b4a.keywords.Common.Not(_mapx.ContainsKey((Object)(_keyx))) || _cfstringutility._isempty(BA.ObjectToString(_mapx.Get((Object)(_keyx))))) { 
 //BA.debugLineNum = 107;BA.debugLine="Dim ErrorStr As StringBuilder";
_errorstr = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 108;BA.debugLine="ErrorStr.Initialize";
_errorstr.Initialize();
 //BA.debugLineNum = 110;BA.debugLine="ErrorStr.Append(\"Could not load theme file (\" &";
_errorstr.Append("Could not load theme file ("+_filename+") ");
 //BA.debugLineNum = 111;BA.debugLine="ErrorStr.Append(\"because the theme key (\" & Key";
_errorstr.Append("because the theme key ("+_keyx+") is missing ");
 //BA.debugLineNum = 112;BA.debugLine="ErrorStr.Append(\"or its value is empty!\")";
_errorstr.Append("or its value is empty!");
 //BA.debugLineNum = 114;BA.debugLine="LogError(ErrorStr.ToString)";
anywheresoftware.b4a.keywords.Common.LogError(_errorstr.ToString());
 //BA.debugLineNum = 116;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
 }
};
 //BA.debugLineNum = 122;BA.debugLine="Return mapx";
if (true) return _mapx;
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 6;BA.debugLine="Public DefaultFont As Font = SelectFont(\"Regular\"";
_defaultfont = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_defaultfont = _selectfont("Regular",12);
 //BA.debugLineNum = 7;BA.debugLine="Public AvailableThemes As CFThemes";
_availablethemes = new Punchline.Tech.Cuppy.Framework.cfthemes();
 //BA.debugLineNum = 8;BA.debugLine="Public DefaultTheme As Map = AvailableThemes.Them";
_defaulttheme = new anywheresoftware.b4a.objects.collections.Map();
_defaulttheme.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_availablethemes._themeslist().Get((Object)("Blue"))));
 //BA.debugLineNum = 9;BA.debugLine="Public ActiveControls As List";
_activecontrols = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 10;BA.debugLine="ActiveControls.Initialize 'ignore : need this , b";
_activecontrols.Initialize();
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.JFX.FontWrapper  _selectfont(String _fontname,double _fontsize) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Public Sub SelectFont(fontName As String,  FontSiz";
 //BA.debugLineNum = 48;BA.debugLine="Return fx.LoadFont(File.DirAssets , FontTypes.Get";
if (true) return _fx.LoadFont(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),BA.ObjectToString(_fonttypes().Get((Object)(_fontname))),_fontsize);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public static String  _selecttheme(String _theme) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Public Sub SelectTheme(theme As String)";
 //BA.debugLineNum = 58;BA.debugLine="theme = CFStringUtility.ucfirst(theme)";
_theme = _cfstringutility._ucfirst(_theme);
 //BA.debugLineNum = 60;BA.debugLine="If AvailableThemes.ThemesList.ContainsKey(theme)";
if (_availablethemes._themeslist().ContainsKey((Object)(_theme))) { 
 //BA.debugLineNum = 62;BA.debugLine="DefaultTheme = AvailableThemes.ThemesList.Get(t";
_defaulttheme.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_availablethemes._themeslist().Get((Object)(_theme))));
 }else {
 //BA.debugLineNum = 66;BA.debugLine="LogError(\"Could not find the selected theme(\" &";
anywheresoftware.b4a.keywords.Common.LogError("Could not find the selected theme("+_theme+"). Please check the Theme name");
 //BA.debugLineNum = 67;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
}
