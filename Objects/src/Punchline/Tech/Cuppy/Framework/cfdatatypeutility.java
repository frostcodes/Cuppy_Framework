package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class cfdatatypeutility extends Object{
public static cfdatatypeutility mostCurrent = new cfdatatypeutility();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfdatatypeutility", null);
		ba.loadHtSubs(cfdatatypeutility.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "Punchline.Tech.Cuppy.Framework.cfdatatypeutility", ba);
		}
	}
    public static Class<?> getObject() {
		return cfdatatypeutility.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _vvvvvvvvvvvvvvvvvvv1 = null;
public static b4j.example.cssutils _vvvvvvvvvvvvvvvvvvv5 = null;
public static Punchline.Tech.Cuppy.Framework.cfconfigs _vvvvvvvvvvvvvvvvvvv6 = null;
public static Punchline.Tech.Cuppy.Framework.cfstringutility _vvvvvvvvvvvvvvvvvvv7 = null;
public static Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _vvvvvvvvvvvvvvvvvvv0 = null;
public static Punchline.Tech.Cuppy.Framework.cffileutility _vvvvvvvvvvvvvvvvvvvv1 = null;
public static Punchline.Tech.Cuppy.Framework.cfstylemanager _vvvvvvvvvvvvvvvvvvvv2 = null;
public static Punchline.Tech.Cuppy.Framework.cfcontrolsutils _vvvvvvvvvvvvvvvvvvvv3 = null;
public static Punchline.Tech.Cuppy.Framework.cfmathutility _vvvvvvvvvvvvvvvvvvvv5 = null;
public static Punchline.Tech.Cuppy.Framework.cfapputility _vvvvvvvvvvvvvvvvvvvv7 = null;
public static boolean  _vvvvvvvvvvvvvvv7(Object _mixedvar) throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Public Sub BoolVal(mixedVar As Object) As Boolean";
 //BA.debugLineNum = 11;BA.debugLine="If mixedVar = False Then";
if ((_mixedvar).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
 //BA.debugLineNum = 12;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 15;BA.debugLine="If mixedVar = 0  Or mixedVar = 0.0 Then";
if ((_mixedvar).equals((Object)(0)) || (_mixedvar).equals((Object)(0.0))) { 
 //BA.debugLineNum = 16;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 19;BA.debugLine="If mixedVar = \"\" Or mixedVar = \"0\" Then";
if ((_mixedvar).equals((Object)("")) || (_mixedvar).equals((Object)("0"))) { 
 //BA.debugLineNum = 20;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 23;BA.debugLine="If mixedVar = Null  Or mixedVar = \"undefined\" The";
if (_mixedvar== null || (_mixedvar).equals((Object)("undefined"))) { 
 //BA.debugLineNum = 24;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 27;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return false;
}
public static boolean  _vvvv4(Object _obj) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Public Sub IsNull(obj As Object) As Boolean";
 //BA.debugLineNum = 61;BA.debugLine="Return CFStringUtility.isNull(obj)";
if (true) return _vvvvvvvvvvvvvvvvvvv7._vvvv4(_obj);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return false;
}
public static boolean  _vvvvvvvvvvvvvvv0(Object _obj) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Public Sub IsObject(obj As Object) As Boolean";
 //BA.debugLineNum = 68;BA.debugLine="Return IsTypeOf(obj, \"object\")";
if (true) return _vvvvvvvvvvvvvvvv2(_obj,"object");
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return false;
}
public static boolean  _vvvvvvvvvvvvvvvv1(Object _mixedvar) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Public Sub IsScalar (mixedVar As Object) As Boolea";
 //BA.debugLineNum = 78;BA.debugLine="Return mixedVar Is String Or IsNumber(mixedVar) O";
if (true) return _mixedvar instanceof String || anywheresoftware.b4a.keywords.Common.IsNumber(BA.ObjectToString(_mixedvar)) || _mixedvar instanceof Boolean;
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return false;
}
public static boolean  _vvvvvvvvvvvvvvvv2(Object _obj,String _typeof) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Public Sub IsTypeOf(obj As Object , TypeOf As Stri";
 //BA.debugLineNum = 53;BA.debugLine="Return StripJavaType(GetType(obj)) = TypeOf.ToLow";
if (true) return (_vvvvvvvvvvvvvvvvvvvvvvvvvv5(anywheresoftware.b4a.keywords.Common.GetType(_obj))).equals(_typeof.toLowerCase());
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return false;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
_vvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvvvvvvvvvvvvvvvvv5(String _str) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Private Sub StripJavaType(str As String) As String";
 //BA.debugLineNum = 34;BA.debugLine="str = str.Replace(\"java.lang.\",\"\")";
_str = _str.replace("java.lang.","");
 //BA.debugLineNum = 35;BA.debugLine="str = str.Replace(\"java.util.\",\"\")";
_str = _str.replace("java.util.","");
 //BA.debugLineNum = 38;BA.debugLine="If str.Contains(\"$\") Then";
if (_str.contains("$")) { 
 //BA.debugLineNum = 40;BA.debugLine="str = CFStringUtility.breakStrAt( str, \"$\")";
_str = BA.ObjectToString(_vvvvvvvvvvvvvvvvvvv7._vv5(_str,"$"));
 //BA.debugLineNum = 41;BA.debugLine="str = CFStringUtility.trim_left_once(str, \"$\")";
_str = _vvvvvvvvvvvvvvvvvvv7._trim_left_once(_str,"$");
 //BA.debugLineNum = 42;BA.debugLine="str = CFStringUtility.trim_left_once(str, \"_\")";
_str = _vvvvvvvvvvvvvvvvvvv7._trim_left_once(_str,"_");
 };
 //BA.debugLineNum = 46;BA.debugLine="Return str.ToLowerCase";
if (true) return _str.toLowerCase();
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
}
