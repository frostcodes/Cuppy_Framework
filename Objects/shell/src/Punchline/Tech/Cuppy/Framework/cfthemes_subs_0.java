package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cfthemes_subs_0 {


public static RemoteObject  _ambertheme(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AmberTheme (cfthemes) ","cfthemes",6,__ref.getField(false, "ba"),__ref,178);
if (RapidSub.canDelegate("ambertheme")) { return __ref.runUserSub(false, "cfthemes","ambertheme", __ref);}
RemoteObject _colors = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 178;BA.debugLine="Private Sub AmberTheme As Map";
Debug.ShouldStop(131072);
 BA.debugLineNum = 180;BA.debugLine="Private Colors As Map 'use to store the colors we";
Debug.ShouldStop(524288);
_colors = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Colors", _colors);
 BA.debugLineNum = 181;BA.debugLine="Colors.Initialize";
Debug.ShouldStop(1048576);
_colors.runVoidMethod ("Initialize");
 BA.debugLineNum = 184;BA.debugLine="Colors.Put(\"primary\",\"#FFC107\")";
Debug.ShouldStop(8388608);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary"))),(Object)((RemoteObject.createImmutable("#FFC107"))));
 BA.debugLineNum = 185;BA.debugLine="Colors.Put(\"primary_dark\",\"#FFA000\")";
Debug.ShouldStop(16777216);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_dark"))),(Object)((RemoteObject.createImmutable("#FFA000"))));
 BA.debugLineNum = 187;BA.debugLine="Colors.Put(\"primary_light\",\"#FFECB3\")";
Debug.ShouldStop(67108864);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_light"))),(Object)((RemoteObject.createImmutable("#FFECB3"))));
 BA.debugLineNum = 188;BA.debugLine="Colors.Put(\"accent\",\"#03A9F4\")";
Debug.ShouldStop(134217728);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("accent"))),(Object)((RemoteObject.createImmutable("#03A9F4"))));
 BA.debugLineNum = 190;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
Debug.ShouldStop(536870912);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_text"))),(Object)((RemoteObject.createImmutable("#212121"))));
 BA.debugLineNum = 191;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
Debug.ShouldStop(1073741824);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("secondary_text"))),(Object)((RemoteObject.createImmutable("#757575"))));
 BA.debugLineNum = 193;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
Debug.ShouldStop(1);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("icons"))),(Object)((RemoteObject.createImmutable("#FFFFFF"))));
 BA.debugLineNum = 194;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
Debug.ShouldStop(2);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("divider"))),(Object)((RemoteObject.createImmutable("#BDBDBD"))));
 BA.debugLineNum = 196;BA.debugLine="Return Colors";
Debug.ShouldStop(8);
if (true) return _colors;
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bluetheme(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BlueTheme (cfthemes) ","cfthemes",6,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("bluetheme")) { return __ref.runUserSub(false, "cfthemes","bluetheme", __ref);}
RemoteObject _colors = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 42;BA.debugLine="Private Sub BlueTheme As Map";
Debug.ShouldStop(512);
 BA.debugLineNum = 44;BA.debugLine="Private Colors As Map 'use to store the colors we";
Debug.ShouldStop(2048);
_colors = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Colors", _colors);
 BA.debugLineNum = 45;BA.debugLine="Colors.Initialize";
Debug.ShouldStop(4096);
_colors.runVoidMethod ("Initialize");
 BA.debugLineNum = 48;BA.debugLine="Colors.Put(\"primary\",\"#2196F3\")";
Debug.ShouldStop(32768);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary"))),(Object)((RemoteObject.createImmutable("#2196F3"))));
 BA.debugLineNum = 49;BA.debugLine="Colors.Put(\"primary_dark\",\"#1976D2\")";
Debug.ShouldStop(65536);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_dark"))),(Object)((RemoteObject.createImmutable("#1976D2"))));
 BA.debugLineNum = 51;BA.debugLine="Colors.Put(\"primary_light\",\"#BBDEFB\")";
Debug.ShouldStop(262144);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_light"))),(Object)((RemoteObject.createImmutable("#BBDEFB"))));
 BA.debugLineNum = 52;BA.debugLine="Colors.Put(\"accent\",\"#FF4081\")";
Debug.ShouldStop(524288);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("accent"))),(Object)((RemoteObject.createImmutable("#FF4081"))));
 BA.debugLineNum = 54;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
Debug.ShouldStop(2097152);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_text"))),(Object)((RemoteObject.createImmutable("#212121"))));
 BA.debugLineNum = 55;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
Debug.ShouldStop(4194304);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("secondary_text"))),(Object)((RemoteObject.createImmutable("#757575"))));
 BA.debugLineNum = 57;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
Debug.ShouldStop(16777216);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("icons"))),(Object)((RemoteObject.createImmutable("#FFFFFF"))));
 BA.debugLineNum = 58;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
Debug.ShouldStop(33554432);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("divider"))),(Object)((RemoteObject.createImmutable("#BDBDBD"))));
 BA.debugLineNum = 60;BA.debugLine="Return Colors";
Debug.ShouldStop(134217728);
if (true) return _colors;
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Private Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _darktheme(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DarkTheme (cfthemes) ","cfthemes",6,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("darktheme")) { return __ref.runUserSub(false, "cfthemes","darktheme", __ref);}
RemoteObject _colors = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 112;BA.debugLine="Private Sub DarkTheme As Map";
Debug.ShouldStop(32768);
 BA.debugLineNum = 114;BA.debugLine="Private Colors As Map 'use to store the colors we";
Debug.ShouldStop(131072);
_colors = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Colors", _colors);
 BA.debugLineNum = 115;BA.debugLine="Colors.Initialize";
Debug.ShouldStop(262144);
_colors.runVoidMethod ("Initialize");
 BA.debugLineNum = 118;BA.debugLine="Colors.Put(\"primary\",\"#2c3e50\")";
Debug.ShouldStop(2097152);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary"))),(Object)((RemoteObject.createImmutable("#2c3e50"))));
 BA.debugLineNum = 119;BA.debugLine="Colors.Put(\"primary_dark\",\"#1b2732\")";
Debug.ShouldStop(4194304);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_dark"))),(Object)((RemoteObject.createImmutable("#1b2732"))));
 BA.debugLineNum = 121;BA.debugLine="Colors.Put(\"primary_light\",\"#68696a\")";
Debug.ShouldStop(16777216);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_light"))),(Object)((RemoteObject.createImmutable("#68696a"))));
 BA.debugLineNum = 122;BA.debugLine="Colors.Put(\"accent\",\"#95a5a6\")";
Debug.ShouldStop(33554432);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("accent"))),(Object)((RemoteObject.createImmutable("#95a5a6"))));
 BA.debugLineNum = 124;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
Debug.ShouldStop(134217728);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_text"))),(Object)((RemoteObject.createImmutable("#212121"))));
 BA.debugLineNum = 125;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
Debug.ShouldStop(268435456);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("secondary_text"))),(Object)((RemoteObject.createImmutable("#757575"))));
 BA.debugLineNum = 127;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
Debug.ShouldStop(1073741824);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("icons"))),(Object)((RemoteObject.createImmutable("#FFFFFF"))));
 BA.debugLineNum = 128;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
Debug.ShouldStop(-2147483648);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("divider"))),(Object)((RemoteObject.createImmutable("#BDBDBD"))));
 BA.debugLineNum = 130;BA.debugLine="Return Colors";
Debug.ShouldStop(2);
if (true) return _colors;
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _graytheme(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GrayTheme (cfthemes) ","cfthemes",6,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("graytheme")) { return __ref.runUserSub(false, "cfthemes","graytheme", __ref);}
RemoteObject _colors = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 90;BA.debugLine="Private Sub GrayTheme As Map";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 92;BA.debugLine="Private Colors As Map 'use to store the colors we";
Debug.ShouldStop(134217728);
_colors = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Colors", _colors);
 BA.debugLineNum = 93;BA.debugLine="Colors.Initialize";
Debug.ShouldStop(268435456);
_colors.runVoidMethod ("Initialize");
 BA.debugLineNum = 96;BA.debugLine="Colors.Put(\"primary\",\"#7f8c8d\")";
Debug.ShouldStop(-2147483648);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary"))),(Object)((RemoteObject.createImmutable("#7f8c8d"))));
 BA.debugLineNum = 97;BA.debugLine="Colors.Put(\"primary_dark\",\"#5c6566\")";
Debug.ShouldStop(1);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_dark"))),(Object)((RemoteObject.createImmutable("#5c6566"))));
 BA.debugLineNum = 99;BA.debugLine="Colors.Put(\"primary_light\",\"#a9a9a9\")";
Debug.ShouldStop(4);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_light"))),(Object)((RemoteObject.createImmutable("#a9a9a9"))));
 BA.debugLineNum = 100;BA.debugLine="Colors.Put(\"accent\",\"#536DFE\")";
Debug.ShouldStop(8);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("accent"))),(Object)((RemoteObject.createImmutable("#536DFE"))));
 BA.debugLineNum = 102;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
Debug.ShouldStop(32);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_text"))),(Object)((RemoteObject.createImmutable("#212121"))));
 BA.debugLineNum = 103;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
Debug.ShouldStop(64);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("secondary_text"))),(Object)((RemoteObject.createImmutable("#757575"))));
 BA.debugLineNum = 105;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
Debug.ShouldStop(256);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("icons"))),(Object)((RemoteObject.createImmutable("#FFFFFF"))));
 BA.debugLineNum = 106;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
Debug.ShouldStop(512);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("divider"))),(Object)((RemoteObject.createImmutable("#BDBDBD"))));
 BA.debugLineNum = 108;BA.debugLine="Return Colors";
Debug.ShouldStop(2048);
if (true) return _colors;
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cfthemes) ","cfthemes",6,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cfthemes","initialize", __ref, _ba);}
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
public static RemoteObject  _pinktheme(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PinkTheme (cfthemes) ","cfthemes",6,__ref.getField(false, "ba"),__ref,156);
if (RapidSub.canDelegate("pinktheme")) { return __ref.runUserSub(false, "cfthemes","pinktheme", __ref);}
RemoteObject _colors = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 156;BA.debugLine="Private Sub PinkTheme As Map";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 158;BA.debugLine="Private Colors As Map 'use to store the colors we";
Debug.ShouldStop(536870912);
_colors = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Colors", _colors);
 BA.debugLineNum = 159;BA.debugLine="Colors.Initialize";
Debug.ShouldStop(1073741824);
_colors.runVoidMethod ("Initialize");
 BA.debugLineNum = 162;BA.debugLine="Colors.Put(\"primary\",\"#E91E63\")";
Debug.ShouldStop(2);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary"))),(Object)((RemoteObject.createImmutable("#E91E63"))));
 BA.debugLineNum = 163;BA.debugLine="Colors.Put(\"primary_dark\",\"#C2185B\")";
Debug.ShouldStop(4);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_dark"))),(Object)((RemoteObject.createImmutable("#C2185B"))));
 BA.debugLineNum = 165;BA.debugLine="Colors.Put(\"primary_light\",\"#F8BBD0\")";
Debug.ShouldStop(16);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_light"))),(Object)((RemoteObject.createImmutable("#F8BBD0"))));
 BA.debugLineNum = 166;BA.debugLine="Colors.Put(\"accent\",\"#FF9800\")";
Debug.ShouldStop(32);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("accent"))),(Object)((RemoteObject.createImmutable("#FF9800"))));
 BA.debugLineNum = 168;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
Debug.ShouldStop(128);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_text"))),(Object)((RemoteObject.createImmutable("#212121"))));
 BA.debugLineNum = 169;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
Debug.ShouldStop(256);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("secondary_text"))),(Object)((RemoteObject.createImmutable("#757575"))));
 BA.debugLineNum = 171;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
Debug.ShouldStop(1024);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("icons"))),(Object)((RemoteObject.createImmutable("#FFFFFF"))));
 BA.debugLineNum = 172;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
Debug.ShouldStop(2048);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("divider"))),(Object)((RemoteObject.createImmutable("#BDBDBD"))));
 BA.debugLineNum = 174;BA.debugLine="Return Colors";
Debug.ShouldStop(8192);
if (true) return _colors;
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _purpletheme(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PurpleTheme (cfthemes) ","cfthemes",6,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("purpletheme")) { return __ref.runUserSub(false, "cfthemes","purpletheme", __ref);}
RemoteObject _colors = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 134;BA.debugLine="Private Sub PurpleTheme As Map";
Debug.ShouldStop(32);
 BA.debugLineNum = 136;BA.debugLine="Private Colors As Map 'use to store the colors we";
Debug.ShouldStop(128);
_colors = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Colors", _colors);
 BA.debugLineNum = 137;BA.debugLine="Colors.Initialize";
Debug.ShouldStop(256);
_colors.runVoidMethod ("Initialize");
 BA.debugLineNum = 140;BA.debugLine="Colors.Put(\"primary\",\"#673AB7\")";
Debug.ShouldStop(2048);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary"))),(Object)((RemoteObject.createImmutable("#673AB7"))));
 BA.debugLineNum = 141;BA.debugLine="Colors.Put(\"primary_dark\",\"#512DA8\")";
Debug.ShouldStop(4096);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_dark"))),(Object)((RemoteObject.createImmutable("#512DA8"))));
 BA.debugLineNum = 143;BA.debugLine="Colors.Put(\"primary_light\",\"#D1C4E9\")";
Debug.ShouldStop(16384);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_light"))),(Object)((RemoteObject.createImmutable("#D1C4E9"))));
 BA.debugLineNum = 144;BA.debugLine="Colors.Put(\"accent\",\"#536DFE\")";
Debug.ShouldStop(32768);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("accent"))),(Object)((RemoteObject.createImmutable("#536DFE"))));
 BA.debugLineNum = 146;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
Debug.ShouldStop(131072);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_text"))),(Object)((RemoteObject.createImmutable("#212121"))));
 BA.debugLineNum = 147;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
Debug.ShouldStop(262144);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("secondary_text"))),(Object)((RemoteObject.createImmutable("#757575"))));
 BA.debugLineNum = 149;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
Debug.ShouldStop(1048576);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("icons"))),(Object)((RemoteObject.createImmutable("#FFFFFF"))));
 BA.debugLineNum = 150;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
Debug.ShouldStop(2097152);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("divider"))),(Object)((RemoteObject.createImmutable("#BDBDBD"))));
 BA.debugLineNum = 152;BA.debugLine="Return Colors";
Debug.ShouldStop(8388608);
if (true) return _colors;
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tealtheme(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TealTheme (cfthemes) ","cfthemes",6,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("tealtheme")) { return __ref.runUserSub(false, "cfthemes","tealtheme", __ref);}
RemoteObject _colors = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 64;BA.debugLine="Private Sub TealTheme As Map";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 66;BA.debugLine="Private Colors As Map 'use to store the colors we";
Debug.ShouldStop(2);
_colors = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Colors", _colors);
 BA.debugLineNum = 67;BA.debugLine="Colors.Initialize";
Debug.ShouldStop(4);
_colors.runVoidMethod ("Initialize");
 BA.debugLineNum = 70;BA.debugLine="Colors.Put(\"primary\",\"#009688\")";
Debug.ShouldStop(32);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary"))),(Object)((RemoteObject.createImmutable("#009688"))));
 BA.debugLineNum = 71;BA.debugLine="Colors.Put(\"primary_dark\",\"#00796B\")";
Debug.ShouldStop(64);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_dark"))),(Object)((RemoteObject.createImmutable("#00796B"))));
 BA.debugLineNum = 73;BA.debugLine="Colors.Put(\"primary_light\",\"#B2DFDB\")";
Debug.ShouldStop(256);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_light"))),(Object)((RemoteObject.createImmutable("#B2DFDB"))));
 BA.debugLineNum = 74;BA.debugLine="Colors.Put(\"accent\",\"#FF5722\")";
Debug.ShouldStop(512);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("accent"))),(Object)((RemoteObject.createImmutable("#FF5722"))));
 BA.debugLineNum = 76;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
Debug.ShouldStop(2048);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("primary_text"))),(Object)((RemoteObject.createImmutable("#212121"))));
 BA.debugLineNum = 77;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
Debug.ShouldStop(4096);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("secondary_text"))),(Object)((RemoteObject.createImmutable("#757575"))));
 BA.debugLineNum = 79;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
Debug.ShouldStop(16384);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("icons"))),(Object)((RemoteObject.createImmutable("#FFFFFF"))));
 BA.debugLineNum = 80;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
Debug.ShouldStop(32768);
_colors.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("divider"))),(Object)((RemoteObject.createImmutable("#BDBDBD"))));
 BA.debugLineNum = 82;BA.debugLine="Return Colors";
Debug.ShouldStop(131072);
if (true) return _colors;
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("ThemesList (cfthemes) ","cfthemes",6,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("themeslist")) { return __ref.runUserSub(false, "cfthemes","themeslist", __ref);}
RemoteObject _availablethemes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 13;BA.debugLine="Public Sub ThemesList() As Map";
Debug.ShouldStop(4096);
 BA.debugLineNum = 15;BA.debugLine="Private AvailableThemes As Map";
Debug.ShouldStop(16384);
_availablethemes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("AvailableThemes", _availablethemes);
 BA.debugLineNum = 16;BA.debugLine="AvailableThemes.Initialize";
Debug.ShouldStop(32768);
_availablethemes.runVoidMethod ("Initialize");
 BA.debugLineNum = 18;BA.debugLine="AvailableThemes.Put(\"Blue\", BlueTheme)";
Debug.ShouldStop(131072);
_availablethemes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Blue"))),(Object)((__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfthemes.class, "_bluetheme").getObject())));
 BA.debugLineNum = 19;BA.debugLine="AvailableThemes.Put(\"Teal\", TealTheme)";
Debug.ShouldStop(262144);
_availablethemes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Teal"))),(Object)((__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfthemes.class, "_tealtheme").getObject())));
 BA.debugLineNum = 26;BA.debugLine="AvailableThemes.Put(\"Gray\", GrayTheme)";
Debug.ShouldStop(33554432);
_availablethemes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Gray"))),(Object)((__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfthemes.class, "_graytheme").getObject())));
 BA.debugLineNum = 27;BA.debugLine="AvailableThemes.Put(\"Dark\", DarkTheme)";
Debug.ShouldStop(67108864);
_availablethemes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Dark"))),(Object)((__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfthemes.class, "_darktheme").getObject())));
 BA.debugLineNum = 29;BA.debugLine="AvailableThemes.Put(\"Purple\", PurpleTheme)";
Debug.ShouldStop(268435456);
_availablethemes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Purple"))),(Object)((__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfthemes.class, "_purpletheme").getObject())));
 BA.debugLineNum = 30;BA.debugLine="AvailableThemes.Put(\"Pink\", PinkTheme)";
Debug.ShouldStop(536870912);
_availablethemes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Pink"))),(Object)((__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfthemes.class, "_pinktheme").getObject())));
 BA.debugLineNum = 32;BA.debugLine="AvailableThemes.Put(\"Amber\", AmberTheme)";
Debug.ShouldStop(-2147483648);
_availablethemes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Amber"))),(Object)((__ref.runClassMethod (Punchline.Tech.Cuppy.Framework.cfthemes.class, "_ambertheme").getObject())));
 BA.debugLineNum = 36;BA.debugLine="Return AvailableThemes";
Debug.ShouldStop(8);
if (true) return _availablethemes;
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}