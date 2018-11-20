package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cfstylemanager_subs_0 {


public static RemoteObject  _exportcurrenttheme(RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("ExportCurrentTheme (cfstylemanager) ","cfstylemanager",10,cfstylemanager.ba,cfstylemanager.mostCurrent,215);
if (RapidSub.canDelegate("exportcurrenttheme")) { return Punchline.Tech.Cuppy.Framework.cfstylemanager.remoteMe.runUserSub(false, "cfstylemanager","exportcurrenttheme", _dir, _filename);}
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 215;BA.debugLine="Public Sub ExportCurrentTheme(Dir As String, FileN";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 217;BA.debugLine="File.WriteMap(Dir, FileName, DefaultTheme)";
Debug.ShouldStop(16777216);
cfstylemanager.__c.getField(false,"File").runVoidMethod ("WriteMap",(Object)(_dir),(Object)(_filename),(Object)(cfstylemanager._defaulttheme));
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _exporttheme(RemoteObject _theme,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("ExportTheme (cfstylemanager) ","cfstylemanager",10,cfstylemanager.ba,cfstylemanager.mostCurrent,197);
if (RapidSub.canDelegate("exporttheme")) { return Punchline.Tech.Cuppy.Framework.cfstylemanager.remoteMe.runUserSub(false, "cfstylemanager","exporttheme", _theme, _dir, _filename);}
Debug.locals.put("theme", _theme);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 197;BA.debugLine="Public Sub ExportTheme(theme As String , Dir As St";
Debug.ShouldStop(16);
 BA.debugLineNum = 199;BA.debugLine="theme = CFStringUtility.ucfirst(theme)";
Debug.ShouldStop(64);
_theme = cfstylemanager._cfstringutility.runMethod(true,"_ucfirst",(Object)(_theme));Debug.locals.put("theme", _theme);
 BA.debugLineNum = 201;BA.debugLine="If AvailableThemes.ThemesList.ContainsKey(theme)";
Debug.ShouldStop(256);
if (cfstylemanager._availablethemes.runClassMethod (Punchline.Tech.Cuppy.Framework.cfthemes.class, "_themeslist").runMethod(true,"ContainsKey",(Object)((_theme))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 203;BA.debugLine="File.WriteMap(Dir, FileName, AvailableThemes.Th";
Debug.ShouldStop(1024);
cfstylemanager.__c.getField(false,"File").runVoidMethod ("WriteMap",(Object)(_dir),(Object)(_filename),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), cfstylemanager._availablethemes.runClassMethod (Punchline.Tech.Cuppy.Framework.cfthemes.class, "_themeslist").runMethod(false,"Get",(Object)((_theme)))));
 }else {
 BA.debugLineNum = 207;BA.debugLine="LogError(\"Could not export theme(\" & theme & \").";
Debug.ShouldStop(16384);
cfstylemanager.__c.runVoidMethod ("LogError",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Could not export theme("),_theme,RemoteObject.createImmutable("). Please check the Theme name!"))));
 BA.debugLineNum = 208;BA.debugLine="ExitApplication";
Debug.ShouldStop(32768);
cfstylemanager.__c.runVoidMethod ("ExitApplication");
 };
 BA.debugLineNum = 212;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fonttypes() throws Exception{
try {
		Debug.PushSubsStack("FontTypes (cfstylemanager) ","cfstylemanager",10,cfstylemanager.ba,cfstylemanager.mostCurrent,63);
if (RapidSub.canDelegate("fonttypes")) { return Punchline.Tech.Cuppy.Framework.cfstylemanager.remoteMe.runUserSub(false, "cfstylemanager","fonttypes");}
RemoteObject _ftypes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 63;BA.debugLine="Private Sub FontTypes As Map";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 65;BA.debugLine="Dim FTypes As Map";
Debug.ShouldStop(1);
_ftypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("FTypes", _ftypes);
 BA.debugLineNum = 66;BA.debugLine="FTypes.Initialize";
Debug.ShouldStop(2);
_ftypes.runVoidMethod ("Initialize");
 BA.debugLineNum = 68;BA.debugLine="FTypes.Put(\"Black\",\"Roboto-Black.ttf\")";
Debug.ShouldStop(8);
_ftypes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Black"))),(Object)((RemoteObject.createImmutable("Roboto-Black.ttf"))));
 BA.debugLineNum = 69;BA.debugLine="FTypes.Put(\"BlackItalic\",\"Roboto-BlackItalic.ttf\"";
Debug.ShouldStop(16);
_ftypes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("BlackItalic"))),(Object)((RemoteObject.createImmutable("Roboto-BlackItalic.ttf"))));
 BA.debugLineNum = 71;BA.debugLine="FTypes.Put(\"Bold\",\"Roboto-Bold.ttf\")";
Debug.ShouldStop(64);
_ftypes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Bold"))),(Object)((RemoteObject.createImmutable("Roboto-Bold.ttf"))));
 BA.debugLineNum = 72;BA.debugLine="FTypes.Put(\"BoldItalic\",\"Roboto-BoldItalic.ttf\")";
Debug.ShouldStop(128);
_ftypes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("BoldItalic"))),(Object)((RemoteObject.createImmutable("Roboto-BoldItalic.ttf"))));
 BA.debugLineNum = 74;BA.debugLine="FTypes.Put(\"Italic\",\"Roboto-Italic.ttf\")";
Debug.ShouldStop(512);
_ftypes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Italic"))),(Object)((RemoteObject.createImmutable("Roboto-Italic.ttf"))));
 BA.debugLineNum = 75;BA.debugLine="FTypes.Put(\"Light\",\"Roboto-Light.ttf\")";
Debug.ShouldStop(1024);
_ftypes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Light"))),(Object)((RemoteObject.createImmutable("Roboto-Light.ttf"))));
 BA.debugLineNum = 77;BA.debugLine="FTypes.Put(\"LightItalic\",\"Roboto-LightItalic.ttf\"";
Debug.ShouldStop(4096);
_ftypes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("LightItalic"))),(Object)((RemoteObject.createImmutable("Roboto-LightItalic.ttf"))));
 BA.debugLineNum = 78;BA.debugLine="FTypes.Put(\"Medium\",\"Roboto-Medium.ttf\")";
Debug.ShouldStop(8192);
_ftypes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Medium"))),(Object)((RemoteObject.createImmutable("Roboto-Medium.ttf"))));
 BA.debugLineNum = 80;BA.debugLine="FTypes.Put(\"MediumItalic\",\"Roboto-MediumItalic.tt";
Debug.ShouldStop(32768);
_ftypes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("MediumItalic"))),(Object)((RemoteObject.createImmutable("Roboto-MediumItalic.ttf"))));
 BA.debugLineNum = 81;BA.debugLine="FTypes.Put(\"Regular\",\"Roboto-Regular.ttf\")";
Debug.ShouldStop(65536);
_ftypes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Regular"))),(Object)((RemoteObject.createImmutable("Roboto-Regular.ttf"))));
 BA.debugLineNum = 83;BA.debugLine="FTypes.Put(\"Thin\",\"Roboto-Thin.ttf\")";
Debug.ShouldStop(262144);
_ftypes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Thin"))),(Object)((RemoteObject.createImmutable("Roboto-Thin.ttf"))));
 BA.debugLineNum = 84;BA.debugLine="FTypes.Put(\"ThinItalic\",\"Roboto-ThinItalic.ttf\")";
Debug.ShouldStop(524288);
_ftypes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ThinItalic"))),(Object)((RemoteObject.createImmutable("Roboto-ThinItalic.ttf"))));
 BA.debugLineNum = 86;BA.debugLine="Return FTypes";
Debug.ShouldStop(2097152);
if (true) return _ftypes;
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadthemefile(RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("LoadThemeFile (cfstylemanager) ","cfstylemanager",10,cfstylemanager.ba,cfstylemanager.mostCurrent,153);
if (RapidSub.canDelegate("loadthemefile")) { return Punchline.Tech.Cuppy.Framework.cfstylemanager.remoteMe.runUserSub(false, "cfstylemanager","loadthemefile", _dir, _filename);}
RemoteObject _mapx = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _checklist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _keyx = RemoteObject.createImmutable("");
RemoteObject _errorstr = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 153;BA.debugLine="Public Sub LoadThemeFile(Dir As String, FileName A";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 155;BA.debugLine="Dim mapx As Map = File.ReadMap(Dir ,FileName)";
Debug.ShouldStop(67108864);
_mapx = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapx = cfstylemanager.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(_dir),(Object)(_filename));Debug.locals.put("mapx", _mapx);Debug.locals.put("mapx", _mapx);
 BA.debugLineNum = 157;BA.debugLine="Dim checklist As List";
Debug.ShouldStop(268435456);
_checklist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("checklist", _checklist);
 BA.debugLineNum = 158;BA.debugLine="checklist.Initialize";
Debug.ShouldStop(536870912);
_checklist.runVoidMethod ("Initialize");
 BA.debugLineNum = 160;BA.debugLine="checklist.Add(\"primary\")";
Debug.ShouldStop(-2147483648);
_checklist.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("primary"))));
 BA.debugLineNum = 161;BA.debugLine="checklist.Add(\"primary_dark\")";
Debug.ShouldStop(1);
_checklist.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("primary_dark"))));
 BA.debugLineNum = 163;BA.debugLine="checklist.Add(\"primary_light\")";
Debug.ShouldStop(4);
_checklist.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("primary_light"))));
 BA.debugLineNum = 164;BA.debugLine="checklist.Add(\"accent\")";
Debug.ShouldStop(8);
_checklist.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("accent"))));
 BA.debugLineNum = 166;BA.debugLine="checklist.Add(\"primary_text\")";
Debug.ShouldStop(32);
_checklist.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("primary_text"))));
 BA.debugLineNum = 167;BA.debugLine="checklist.Add(\"secondary_text\")";
Debug.ShouldStop(64);
_checklist.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("secondary_text"))));
 BA.debugLineNum = 169;BA.debugLine="checklist.Add(\"icons\")";
Debug.ShouldStop(256);
_checklist.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("icons"))));
 BA.debugLineNum = 170;BA.debugLine="checklist.Add(\"divider\")";
Debug.ShouldStop(512);
_checklist.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("divider"))));
 BA.debugLineNum = 172;BA.debugLine="For Each KeyX As String In checklist";
Debug.ShouldStop(2048);
{
final RemoteObject group12 = _checklist;
final int groupLen12 = group12.runMethod(true,"getSize").<Integer>get()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_keyx = BA.ObjectToString(group12.runMethod(false,"Get",index12));Debug.locals.put("KeyX", _keyx);
Debug.locals.put("KeyX", _keyx);
 BA.debugLineNum = 175;BA.debugLine="If Not(mapx.ContainsKey(KeyX)) Or CFStringUtilit";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(".",cfstylemanager.__c.runMethod(true,"Not",(Object)(_mapx.runMethod(true,"ContainsKey",(Object)((_keyx)))))) || RemoteObject.solveBoolean(".",cfstylemanager._cfstringutility.runMethod(true,"_isempty",(Object)(BA.ObjectToString(_mapx.runMethod(false,"Get",(Object)((_keyx)))))))) { 
 BA.debugLineNum = 177;BA.debugLine="Dim ErrorStr As StringBuilder";
Debug.ShouldStop(65536);
_errorstr = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("ErrorStr", _errorstr);
 BA.debugLineNum = 178;BA.debugLine="ErrorStr.Initialize";
Debug.ShouldStop(131072);
_errorstr.runVoidMethod ("Initialize");
 BA.debugLineNum = 180;BA.debugLine="ErrorStr.Append(\"Could not load theme file (\" &";
Debug.ShouldStop(524288);
_errorstr.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Could not load theme file ("),_filename,RemoteObject.createImmutable(") "))));
 BA.debugLineNum = 181;BA.debugLine="ErrorStr.Append(\"because the theme key (\" & Key";
Debug.ShouldStop(1048576);
_errorstr.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("because the theme key ("),_keyx,RemoteObject.createImmutable(") is missing "))));
 BA.debugLineNum = 182;BA.debugLine="ErrorStr.Append(\"or its value is empty!\")";
Debug.ShouldStop(2097152);
_errorstr.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("or its value is empty!")));
 BA.debugLineNum = 184;BA.debugLine="LogError(ErrorStr.ToString)";
Debug.ShouldStop(8388608);
cfstylemanager.__c.runVoidMethod ("LogError",(Object)(_errorstr.runMethod(true,"ToString")));
 BA.debugLineNum = 186;BA.debugLine="ExitApplication";
Debug.ShouldStop(33554432);
cfstylemanager.__c.runVoidMethod ("ExitApplication");
 };
 }
}Debug.locals.put("KeyX", _keyx);
;
 BA.debugLineNum = 192;BA.debugLine="Return mapx";
Debug.ShouldStop(-2147483648);
if (true) return _mapx;
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
cfstylemanager._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 6;BA.debugLine="Private AvailableThemes As CFThemes";
cfstylemanager._availablethemes = RemoteObject.createNew ("Punchline.Tech.Cuppy.Framework.cfthemes");
 //BA.debugLineNum = 7;BA.debugLine="AvailableThemes.Initialize 'ignore";
cfstylemanager._availablethemes.runClassMethod (Punchline.Tech.Cuppy.Framework.cfthemes.class, "_initialize",cfstylemanager.ba);
 //BA.debugLineNum = 9;BA.debugLine="Public DefaultTheme As Map = AvailableThemes.Them";
cfstylemanager._defaulttheme = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
cfstylemanager._defaulttheme.setObject(cfstylemanager._availablethemes.runClassMethod (Punchline.Tech.Cuppy.Framework.cfthemes.class, "_themeslist").runMethod(false,"Get",(Object)((cfstylemanager._theme_blue))));
 //BA.debugLineNum = 18;BA.debugLine="Public const FONT_BLACK As Font = SelectFont(\"Bla";
cfstylemanager._font_black = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.FontWrapper");
cfstylemanager._font_black = _selectfont(BA.ObjectToString("Black"),BA.numberCast(double.class, 12));
 //BA.debugLineNum = 19;BA.debugLine="Public const FONT_BLACK_ITALIC As Font = SelectFo";
cfstylemanager._font_black_italic = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.FontWrapper");
cfstylemanager._font_black_italic = _selectfont(BA.ObjectToString("BlackItalic"),BA.numberCast(double.class, 12));
 //BA.debugLineNum = 21;BA.debugLine="Public const FONT_BOLD As Font = SelectFont(\"Bold";
cfstylemanager._font_bold = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.FontWrapper");
cfstylemanager._font_bold = _selectfont(BA.ObjectToString("Bold"),BA.numberCast(double.class, 12));
 //BA.debugLineNum = 22;BA.debugLine="Public const FONT_BOLD_ITALIC As Font = SelectFon";
cfstylemanager._font_bold_italic = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.FontWrapper");
cfstylemanager._font_bold_italic = _selectfont(BA.ObjectToString("BoldItalic"),BA.numberCast(double.class, 12));
 //BA.debugLineNum = 24;BA.debugLine="Public const FONT_LIGHT As Font = SelectFont(\"Lig";
cfstylemanager._font_light = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.FontWrapper");
cfstylemanager._font_light = _selectfont(BA.ObjectToString("Light"),BA.numberCast(double.class, 12));
 //BA.debugLineNum = 25;BA.debugLine="Public const FONT_LIGHT_ITALIC As Font = SelectFo";
cfstylemanager._font_light_italic = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.FontWrapper");
cfstylemanager._font_light_italic = _selectfont(BA.ObjectToString("LightItalic"),BA.numberCast(double.class, 12));
 //BA.debugLineNum = 27;BA.debugLine="Public const FONT_REGULAR_FONT As Font = SelectFo";
cfstylemanager._font_regular_font = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.FontWrapper");
cfstylemanager._font_regular_font = _selectfont(BA.ObjectToString("Regular"),BA.numberCast(double.class, 12));
 //BA.debugLineNum = 28;BA.debugLine="Public const FONT_ITALIC As Font = SelectFont(\"It";
cfstylemanager._font_italic = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.FontWrapper");
cfstylemanager._font_italic = _selectfont(BA.ObjectToString("Italic"),BA.numberCast(double.class, 12));
 //BA.debugLineNum = 30;BA.debugLine="Public const FONT_MEDIUM As Font = SelectFont(\"Me";
cfstylemanager._font_medium = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.FontWrapper");
cfstylemanager._font_medium = _selectfont(BA.ObjectToString("Medium"),BA.numberCast(double.class, 12));
 //BA.debugLineNum = 31;BA.debugLine="Public const FONT_MEDIUM_ITALIC As Font = SelectF";
cfstylemanager._font_medium_italic = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.FontWrapper");
cfstylemanager._font_medium_italic = _selectfont(BA.ObjectToString("MediumItalic"),BA.numberCast(double.class, 12));
 //BA.debugLineNum = 33;BA.debugLine="Public const FONT_THIN As Font = SelectFont(\"Thin";
cfstylemanager._font_thin = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.FontWrapper");
cfstylemanager._font_thin = _selectfont(BA.ObjectToString("Thin"),BA.numberCast(double.class, 12));
 //BA.debugLineNum = 34;BA.debugLine="Public const FONT_THIN_ITALIC As Font = SelectFon";
cfstylemanager._font_thin_italic = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.FontWrapper");
cfstylemanager._font_thin_italic = _selectfont(BA.ObjectToString("ThinItalic"),BA.numberCast(double.class, 12));
 //BA.debugLineNum = 40;BA.debugLine="Public const THEME_BLUE As String = \"Blue\"";
cfstylemanager._theme_blue = BA.ObjectToString("Blue");
 //BA.debugLineNum = 41;BA.debugLine="Public const THEME_TEAL As String = \"Teal\"";
cfstylemanager._theme_teal = BA.ObjectToString("Teal");
 //BA.debugLineNum = 47;BA.debugLine="Public const THEME_GRAY As String = \"Gray\"";
cfstylemanager._theme_gray = BA.ObjectToString("Gray");
 //BA.debugLineNum = 48;BA.debugLine="Public const THEME_DARK As String = \"Dark\"";
cfstylemanager._theme_dark = BA.ObjectToString("Dark");
 //BA.debugLineNum = 49;BA.debugLine="Public const THEME_PURPLE As String = \"Purple\"";
cfstylemanager._theme_purple = BA.ObjectToString("Purple");
 //BA.debugLineNum = 50;BA.debugLine="Public const THEME_PINK As String = \"Pink\"";
cfstylemanager._theme_pink = BA.ObjectToString("Pink");
 //BA.debugLineNum = 51;BA.debugLine="Public const THEME_AMBER As String = \"Amber\"";
cfstylemanager._theme_amber = BA.ObjectToString("Amber");
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _scalefont(RemoteObject _familyname,RemoteObject _size) throws Exception{
try {
		Debug.PushSubsStack("ScaleFont (cfstylemanager) ","cfstylemanager",10,cfstylemanager.ba,cfstylemanager.mostCurrent,98);
if (RapidSub.canDelegate("scalefont")) { return Punchline.Tech.Cuppy.Framework.cfstylemanager.remoteMe.runUserSub(false, "cfstylemanager","scalefont", _familyname, _size);}
Debug.locals.put("FamilyName", _familyname);
Debug.locals.put("Size", _size);
 BA.debugLineNum = 98;BA.debugLine="Public Sub ScaleFont(FamilyName As String,Size As";
Debug.ShouldStop(2);
 BA.debugLineNum = 100;BA.debugLine="Return fx.CreateFont(FamilyName, Size, False, Fal";
Debug.ShouldStop(8);
if (true) return cfstylemanager._fx.runMethod(false,"CreateFont",(Object)(_familyname),(Object)(_size),(Object)(cfstylemanager.__c.getField(true,"False")),(Object)(cfstylemanager.__c.getField(true,"False")));
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scalefont2(RemoteObject _familyname,RemoteObject _size,RemoteObject _bold,RemoteObject _italic) throws Exception{
try {
		Debug.PushSubsStack("ScaleFont2 (cfstylemanager) ","cfstylemanager",10,cfstylemanager.ba,cfstylemanager.mostCurrent,105);
if (RapidSub.canDelegate("scalefont2")) { return Punchline.Tech.Cuppy.Framework.cfstylemanager.remoteMe.runUserSub(false, "cfstylemanager","scalefont2", _familyname, _size, _bold, _italic);}
Debug.locals.put("FamilyName", _familyname);
Debug.locals.put("Size", _size);
Debug.locals.put("Bold", _bold);
Debug.locals.put("Italic", _italic);
 BA.debugLineNum = 105;BA.debugLine="Public Sub ScaleFont2(FamilyName As String,Size As";
Debug.ShouldStop(256);
 BA.debugLineNum = 107;BA.debugLine="Return fx.CreateFont(FamilyName , Size, Bold, Ita";
Debug.ShouldStop(1024);
if (true) return cfstylemanager._fx.runMethod(false,"CreateFont",(Object)(_familyname),(Object)(_size),(Object)(_bold),(Object)(_italic));
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selectfont(RemoteObject _fontname,RemoteObject _fontsize) throws Exception{
try {
		Debug.PushSubsStack("SelectFont (cfstylemanager) ","cfstylemanager",10,cfstylemanager.ba,cfstylemanager.mostCurrent,91);
if (RapidSub.canDelegate("selectfont")) { return Punchline.Tech.Cuppy.Framework.cfstylemanager.remoteMe.runUserSub(false, "cfstylemanager","selectfont", _fontname, _fontsize);}
Debug.locals.put("fontName", _fontname);
Debug.locals.put("FontSize", _fontsize);
 BA.debugLineNum = 91;BA.debugLine="Public Sub SelectFont(fontName As String,  FontSiz";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 93;BA.debugLine="Return fx.LoadFont(File.DirAssets , FontTypes.Get";
Debug.ShouldStop(268435456);
if (true) return cfstylemanager._fx.runMethod(false,"LoadFont",(Object)(cfstylemanager.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString(_fonttypes().runMethod(false,"Get",(Object)((_fontname))))),(Object)(_fontsize));
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selecttheme(RemoteObject _theme) throws Exception{
try {
		Debug.PushSubsStack("SelectTheme (cfstylemanager) ","cfstylemanager",10,cfstylemanager.ba,cfstylemanager.mostCurrent,115);
if (RapidSub.canDelegate("selecttheme")) { return Punchline.Tech.Cuppy.Framework.cfstylemanager.remoteMe.runUserSub(false, "cfstylemanager","selecttheme", _theme);}
Debug.locals.put("Theme", _theme);
 BA.debugLineNum = 115;BA.debugLine="Public Sub SelectTheme(Theme As String)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 127;BA.debugLine="Theme = CFStringUtility.ucfirst(Theme)";
Debug.ShouldStop(1073741824);
_theme = cfstylemanager._cfstringutility.runMethod(true,"_ucfirst",(Object)(_theme));Debug.locals.put("Theme", _theme);
 BA.debugLineNum = 129;BA.debugLine="If AvailableThemes.ThemesList.ContainsKey(Theme)";
Debug.ShouldStop(1);
if (cfstylemanager._availablethemes.runClassMethod (Punchline.Tech.Cuppy.Framework.cfthemes.class, "_themeslist").runMethod(true,"ContainsKey",(Object)((_theme))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 131;BA.debugLine="DefaultTheme = AvailableThemes.ThemesList.Get(Th";
Debug.ShouldStop(4);
cfstylemanager._defaulttheme.setObject(cfstylemanager._availablethemes.runClassMethod (Punchline.Tech.Cuppy.Framework.cfthemes.class, "_themeslist").runMethod(false,"Get",(Object)((_theme))));
 }else {
 BA.debugLineNum = 135;BA.debugLine="LogError(\"Could not find the selected theme(\" &";
Debug.ShouldStop(64);
cfstylemanager.__c.runVoidMethod ("LogError",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Could not find the selected theme("),_theme,RemoteObject.createImmutable("). Please check the Theme name"))));
 BA.debugLineNum = 136;BA.debugLine="ExitApplication";
Debug.ShouldStop(128);
cfstylemanager.__c.runVoidMethod ("ExitApplication");
 };
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}