package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class stylemanager_subs_0 {


public static RemoteObject  _fonttypes() throws Exception{
try {
		Debug.PushSubsStack("FontTypes (stylemanager) ","stylemanager",8,stylemanager.ba,stylemanager.mostCurrent,15);
if (RapidSub.canDelegate("fonttypes")) { return Punchline.Tech.Cuppy.Framework.stylemanager.remoteMe.runUserSub(false, "stylemanager","fonttypes");}
RemoteObject _ftypes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 15;BA.debugLine="Public Sub FontTypes As Map";
Debug.ShouldStop(16384);
 BA.debugLineNum = 17;BA.debugLine="Dim FTypes As Map";
Debug.ShouldStop(65536);
_ftypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("FTypes", _ftypes);
 BA.debugLineNum = 18;BA.debugLine="FTypes.Initialize";
Debug.ShouldStop(131072);
_ftypes.runVoidMethod ("Initialize");
 BA.debugLineNum = 20;BA.debugLine="FTypes.Put(\"Black\",\"Roboto-Black.ttf\")";
Debug.ShouldStop(524288);
_ftypes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Black"))),(Object)((RemoteObject.createImmutable("Roboto-Black.ttf"))));
 BA.debugLineNum = 21;BA.debugLine="FTypes.Put(\"BlackItalic\",\"Roboto-BlackItalic.ttf\"";
Debug.ShouldStop(1048576);
_ftypes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("BlackItalic"))),(Object)((RemoteObject.createImmutable("Roboto-BlackItalic.ttf"))));
 BA.debugLineNum = 23;BA.debugLine="FTypes.Put(\"Bold\",\"Roboto-Bold.ttf\")";
Debug.ShouldStop(4194304);
_ftypes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Bold"))),(Object)((RemoteObject.createImmutable("Roboto-Bold.ttf"))));
 BA.debugLineNum = 24;BA.debugLine="FTypes.Put(\"BoldItalic\",\"Roboto-BoldItalic.ttf\")";
Debug.ShouldStop(8388608);
_ftypes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("BoldItalic"))),(Object)((RemoteObject.createImmutable("Roboto-BoldItalic.ttf"))));
 BA.debugLineNum = 26;BA.debugLine="FTypes.Put(\"Italic\",\"Roboto-Italic.ttf\")";
Debug.ShouldStop(33554432);
_ftypes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Italic"))),(Object)((RemoteObject.createImmutable("Roboto-Italic.ttf"))));
 BA.debugLineNum = 27;BA.debugLine="FTypes.Put(\"Light\",\"Roboto-Light.ttf\")";
Debug.ShouldStop(67108864);
_ftypes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Light"))),(Object)((RemoteObject.createImmutable("Roboto-Light.ttf"))));
 BA.debugLineNum = 29;BA.debugLine="FTypes.Put(\"LightItalic\",\"Roboto-LightItalic.ttf\"";
Debug.ShouldStop(268435456);
_ftypes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("LightItalic"))),(Object)((RemoteObject.createImmutable("Roboto-LightItalic.ttf"))));
 BA.debugLineNum = 30;BA.debugLine="FTypes.Put(\"Medium\",\"Roboto-Medium.ttf\")";
Debug.ShouldStop(536870912);
_ftypes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Medium"))),(Object)((RemoteObject.createImmutable("Roboto-Medium.ttf"))));
 BA.debugLineNum = 32;BA.debugLine="FTypes.Put(\"MediumItalic\",\"Roboto-MediumItalic.tt";
Debug.ShouldStop(-2147483648);
_ftypes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("MediumItalic"))),(Object)((RemoteObject.createImmutable("Roboto-MediumItalic.ttf"))));
 BA.debugLineNum = 33;BA.debugLine="FTypes.Put(\"Regular\",\"Roboto-Regular.ttf\")";
Debug.ShouldStop(1);
_ftypes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Regular"))),(Object)((RemoteObject.createImmutable("Roboto-Regular.ttf"))));
 BA.debugLineNum = 35;BA.debugLine="FTypes.Put(\"Thin\",\"Roboto-Thin.ttf\")";
Debug.ShouldStop(4);
_ftypes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Thin"))),(Object)((RemoteObject.createImmutable("Roboto-Thin.ttf"))));
 BA.debugLineNum = 36;BA.debugLine="FTypes.Put(\"ThinItalic\",\"Roboto-ThinItalic.ttf\")";
Debug.ShouldStop(8);
_ftypes.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ThinItalic"))),(Object)((RemoteObject.createImmutable("Roboto-ThinItalic.ttf"))));
 BA.debugLineNum = 38;BA.debugLine="Return FTypes";
Debug.ShouldStop(32);
if (true) return _ftypes;
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
stylemanager._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 6;BA.debugLine="Public DefaultFont As Font = SelectFont(\"Regular\"";
stylemanager._defaultfont = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX.FontWrapper");
stylemanager._defaultfont = _selectfont(BA.ObjectToString("Regular"),BA.numberCast(double.class, 12));
 //BA.debugLineNum = 7;BA.debugLine="Public AvailableThemes As Themes";
stylemanager._availablethemes = RemoteObject.createNew ("Punchline.Tech.Cuppy.Framework.themes");
 //BA.debugLineNum = 8;BA.debugLine="Public DefaultTheme As Map = AvailableThemes.The";
stylemanager._defaulttheme = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
stylemanager._defaulttheme.setObject(stylemanager._availablethemes.runClassMethod (Punchline.Tech.Cuppy.Framework.themes.class, "_themeslist").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Blue")))));
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _selectfont(RemoteObject _font,RemoteObject _fontsize) throws Exception{
try {
		Debug.PushSubsStack("SelectFont (stylemanager) ","stylemanager",8,stylemanager.ba,stylemanager.mostCurrent,43);
if (RapidSub.canDelegate("selectfont")) { return Punchline.Tech.Cuppy.Framework.stylemanager.remoteMe.runUserSub(false, "stylemanager","selectfont", _font, _fontsize);}
Debug.locals.put("font", _font);
Debug.locals.put("FontSize", _fontsize);
 BA.debugLineNum = 43;BA.debugLine="Public Sub SelectFont(font As String,  FontSize As";
Debug.ShouldStop(1024);
 BA.debugLineNum = 46;BA.debugLine="Return  fx.LoadFont(Configs.RobotoFontsPath , Fon";
Debug.ShouldStop(8192);
if (true) return stylemanager._fx.runMethod(false,"LoadFont",(Object)(stylemanager._configs._robotofontspath),(Object)(BA.ObjectToString(_fonttypes().runMethod(false,"Get",(Object)((_font))))),(Object)(_fontsize));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}