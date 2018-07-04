package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class themes_subs_0 {


public static RemoteObject  _bluetheme(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BlueTheme (themes) ","themes",3,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("bluetheme")) { return __ref.runUserSub(false, "themes","bluetheme", __ref);}
RemoteObject _colors = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 26;BA.debugLine="Public Sub BlueTheme As Map";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 28;BA.debugLine="Private Colors As Map 'use to store the colors we";
Debug.ShouldStop(134217728);
_colors = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Colors", _colors);
 BA.debugLineNum = 29;BA.debugLine="Colors.Initialize";
Debug.ShouldStop(268435456);
_colors.runVoidMethod ("Initialize");
 BA.debugLineNum = 32;BA.debugLine="Colors.Put(\"primary\",\"#2196F3\")";
Debug.ShouldStop(-2147483648);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary"))),(Object)((RemoteObject.createImmutable("#2196F3"))));
 BA.debugLineNum = 33;BA.debugLine="Colors.Put(\"primary_dark\",\"#1976D2\")";
Debug.ShouldStop(1);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_dark"))),(Object)((RemoteObject.createImmutable("#1976D2"))));
 BA.debugLineNum = 35;BA.debugLine="Colors.Put(\"primary_light\",\"#BBDEFB\")";
Debug.ShouldStop(4);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_light"))),(Object)((RemoteObject.createImmutable("#BBDEFB"))));
 BA.debugLineNum = 36;BA.debugLine="Colors.Put(\"accent\",\"#FF4081\")";
Debug.ShouldStop(8);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("accent"))),(Object)((RemoteObject.createImmutable("#FF4081"))));
 BA.debugLineNum = 38;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
Debug.ShouldStop(32);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_text"))),(Object)((RemoteObject.createImmutable("#212121"))));
 BA.debugLineNum = 39;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
Debug.ShouldStop(64);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("secondary_text"))),(Object)((RemoteObject.createImmutable("#757575"))));
 BA.debugLineNum = 41;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
Debug.ShouldStop(256);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("icons"))),(Object)((RemoteObject.createImmutable("#FFFFFF"))));
 BA.debugLineNum = 42;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
Debug.ShouldStop(512);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("divider"))),(Object)((RemoteObject.createImmutable("#BDBDBD"))));
 BA.debugLineNum = 44;BA.debugLine="Return Colors";
Debug.ShouldStop(2048);
if (true) return _colors;
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (themes) ","themes",3,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "themes","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(128);
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selecttheme(RemoteObject __ref,RemoteObject _theme) throws Exception{
try {
		Debug.PushSubsStack("SelectTheme (themes) ","themes",3,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("selecttheme")) { return __ref.runUserSub(false, "themes","selecttheme", __ref, _theme);}
Debug.locals.put("theme", _theme);
 BA.debugLineNum = 73;BA.debugLine="Public Sub SelectTheme(theme As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 75;BA.debugLine="StyleManager.DefaultTheme = ThemesList.Get(theme";
Debug.ShouldStop(1024);
themes._stylemanager._defaulttheme.setObject(__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.themes.class, "_themeslist").runMethod(false,"Get",(Object)((_theme))));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tealtheme(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TealTheme (themes) ","themes",3,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("tealtheme")) { return __ref.runUserSub(false, "themes","tealtheme", __ref);}
RemoteObject _colors = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 48;BA.debugLine="Public Sub TealTheme As Map";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="Private Colors As Map 'use to store the colors we";
Debug.ShouldStop(131072);
_colors = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Colors", _colors);
 BA.debugLineNum = 51;BA.debugLine="Colors.Initialize";
Debug.ShouldStop(262144);
_colors.runVoidMethod ("Initialize");
 BA.debugLineNum = 54;BA.debugLine="Colors.Put(\"primary\",\"#009688\")";
Debug.ShouldStop(2097152);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary"))),(Object)((RemoteObject.createImmutable("#009688"))));
 BA.debugLineNum = 55;BA.debugLine="Colors.Put(\"primary_dark\",\"#00796B\")";
Debug.ShouldStop(4194304);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_dark"))),(Object)((RemoteObject.createImmutable("#00796B"))));
 BA.debugLineNum = 57;BA.debugLine="Colors.Put(\"primary_light\",\"#B2DFDB\")";
Debug.ShouldStop(16777216);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_light"))),(Object)((RemoteObject.createImmutable("#B2DFDB"))));
 BA.debugLineNum = 58;BA.debugLine="Colors.Put(\"accent\",\"#FF5722\")";
Debug.ShouldStop(33554432);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("accent"))),(Object)((RemoteObject.createImmutable("#FF5722"))));
 BA.debugLineNum = 60;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
Debug.ShouldStop(134217728);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_text"))),(Object)((RemoteObject.createImmutable("#212121"))));
 BA.debugLineNum = 61;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
Debug.ShouldStop(268435456);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("secondary_text"))),(Object)((RemoteObject.createImmutable("#757575"))));
 BA.debugLineNum = 63;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
Debug.ShouldStop(1073741824);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("icons"))),(Object)((RemoteObject.createImmutable("#FFFFFF"))));
 BA.debugLineNum = 64;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
Debug.ShouldStop(-2147483648);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("divider"))),(Object)((RemoteObject.createImmutable("#BDBDBD"))));
 BA.debugLineNum = 66;BA.debugLine="Return Colors";
Debug.ShouldStop(2);
if (true) return _colors;
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _themeslist(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ThemesList (themes) ","themes",3,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("themeslist")) { return __ref.runUserSub(false, "themes","themeslist", __ref);}
RemoteObject _availablethemes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 12;BA.debugLine="Public Sub ThemesList() As Map";
Debug.ShouldStop(2048);
 BA.debugLineNum = 16;BA.debugLine="Private AvailableThemes As Map";
Debug.ShouldStop(32768);
_availablethemes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("AvailableThemes", _availablethemes);
 BA.debugLineNum = 17;BA.debugLine="AvailableThemes.Initialize";
Debug.ShouldStop(65536);
_availablethemes.runVoidMethod ("Initialize");
 BA.debugLineNum = 19;BA.debugLine="AvailableThemes.Put(\"Blue\", BlueTheme)";
Debug.ShouldStop(262144);
_availablethemes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Blue"))),(Object)((__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.themes.class, "_bluetheme").getObject())));
 BA.debugLineNum = 20;BA.debugLine="AvailableThemes.Put(\"Teal\", TealTheme)";
Debug.ShouldStop(524288);
_availablethemes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Teal"))),(Object)((__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.themes.class, "_tealtheme").getObject())));
 BA.debugLineNum = 22;BA.debugLine="Return AvailableThemes";
Debug.ShouldStop(2097152);
if (true) return _availablethemes;
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}