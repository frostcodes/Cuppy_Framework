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
public static anywheresoftware.b4j.objects.JFX _vvvvvvvvvvvvvvvvvvv7 = null;
public static b4j.example.cssutils _vvvvvvvvvvvvvvvvvvvv3 = null;
public static Punchline.Tech.Cuppy.Framework.cfconfigs _vvvvvvvvvvvvvvvvvvvv4 = null;
public static Punchline.Tech.Cuppy.Framework.cfstringutility _vvvvvvvvvvvvvvvvvvvv5 = null;
public static Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _vvvvvvvvvvvvvvvvvvvv6 = null;
public static Punchline.Tech.Cuppy.Framework.cffileutility _vvvvvvvvvvvvvvvvvvvv7 = null;
public static Punchline.Tech.Cuppy.Framework.cfstylemanager _vvvvvvvvvvvvvvvvvvvv0 = null;
public static Punchline.Tech.Cuppy.Framework.cfcontrolsutils _vvvvvvvvvvvvvvvvvvvvv1 = null;
public static Punchline.Tech.Cuppy.Framework.cfmathutility _vvvvvvvvvvvvvvvvvvvvv3 = null;
public static Punchline.Tech.Cuppy.Framework.cfapputility _vvvvvvvvvvvvvvvvvvvvv5 = null;
public static boolean  _vvvvvvvvvvvvvvv7(Object _mixedvar) throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Public Sub BoolVal(mixedVar As Object) As Boolean";
 //BA.debugLineNum = 14;BA.debugLine="If mixedVar = False Then";
if ((_mixedvar).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
 //BA.debugLineNum = 15;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 18;BA.debugLine="If mixedVar = 0  Or mixedVar = 0.0 Then";
if ((_mixedvar).equals((Object)(0)) || (_mixedvar).equals((Object)(0.0))) { 
 //BA.debugLineNum = 19;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 22;BA.debugLine="If mixedVar = \"\" Or mixedVar = \"0\" Then";
if ((_mixedvar).equals((Object)("")) || (_mixedvar).equals((Object)("0"))) { 
 //BA.debugLineNum = 23;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 26;BA.debugLine="If mixedVar = Null  Or mixedVar = \"undefined\" The";
if (_mixedvar== null || (_mixedvar).equals((Object)("undefined"))) { 
 //BA.debugLineNum = 27;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 30;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return false;
}
public static boolean  _vvvvvvvvvvvvvvv0(Object _obj) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Public Sub IsArrayList(obj As Object) As Boolean";
 //BA.debugLineNum = 91;BA.debugLine="Return IsTypeOf(obj, \"arraylist\")";
if (true) return _vvvvvvvvvvvvvvvv0(_obj,"arraylist");
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return false;
}
public static boolean  _vvvvvvvvvvvvvvvv1(Object _obj) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Public Sub IsBoolean(obj As Object) As Boolean";
 //BA.debugLineNum = 63;BA.debugLine="Return IsTypeOf(obj, \"boolean\")";
if (true) return _vvvvvvvvvvvvvvvv0(_obj,"boolean");
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return false;
}
public static boolean  _vvvvvvvvvvvvvvvv2(Object _obj) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Public Sub IsDouble(obj As Object) As Boolean";
 //BA.debugLineNum = 84;BA.debugLine="Return IsTypeOf(obj, \"double\")";
if (true) return _vvvvvvvvvvvvvvvv0(_obj,"double");
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return false;
}
public static boolean  _vvvvvvvvvvvvvvvv3(Object _obj) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Public Sub IsInteger(obj As Object) As Boolean";
 //BA.debugLineNum = 77;BA.debugLine="Return IsTypeOf(obj, \"integer\")";
if (true) return _vvvvvvvvvvvvvvvv0(_obj,"integer");
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return false;
}
public static boolean  _vvvvvvvvvvvvvvvv4(Object _obj) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Public Sub IsList(obj As Object) As Boolean";
 //BA.debugLineNum = 99;BA.debugLine="Return IsArrayList(obj)";
if (true) return _vvvvvvvvvvvvvvv0(_obj);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return false;
}
public static boolean  _vvvv4(Object _obj) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Public Sub IsNull(obj As Object) As Boolean";
 //BA.debugLineNum = 107;BA.debugLine="Return CFStringUtility.isNull(obj)";
if (true) return _vvvvvvvvvvvvvvvvvvvv5._vvvv4(_obj);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return false;
}
public static boolean  _vvvvvvvvvvvvvvvv5(Object _obj) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Public Sub IsObject(obj As Object) As Boolean";
 //BA.debugLineNum = 114;BA.debugLine="Return IsTypeOf(obj, \"object\")";
if (true) return _vvvvvvvvvvvvvvvv0(_obj,"object");
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return false;
}
public static boolean  _vvvvvvvvvvvvvvvv6(Object _mixedvar) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Public Sub IsScalar (mixedVar As Object) As Boolea";
 //BA.debugLineNum = 124;BA.debugLine="Return IsString(mixedVar) Or IsNumber(mixedVar) O";
if (true) return _vvvvvvvvvvvvvvvv7(_mixedvar) || anywheresoftware.b4a.keywords.Common.IsNumber(BA.ObjectToString(_mixedvar)) || _vvvvvvvvvvvvvvvv1(_mixedvar);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return false;
}
public static boolean  _vvvvvvvvvvvvvvvv7(Object _obj) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Public Sub IsString(obj As Object) As Boolean";
 //BA.debugLineNum = 70;BA.debugLine="Return IsTypeOf(obj, \"string\")";
if (true) return _vvvvvvvvvvvvvvvv0(_obj,"string");
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return false;
}
public static boolean  _vvvvvvvvvvvvvvvv0(Object _obj,String _typeof) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Public Sub IsTypeOf(obj As Object , TypeOf As Stri";
 //BA.debugLineNum = 56;BA.debugLine="Return StripJavaType(GetType(obj)) = TypeOf.ToLow";
if (true) return (_vvvvvvvvvvvvvvvvvvvvvvvvvvv3(anywheresoftware.b4a.keywords.Common.GetType(_obj))).equals(_typeof.toLowerCase());
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return false;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
_vvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvvvvvvvvvvvvvvvvvv3(String _str) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Private Sub StripJavaType(str As String) As String";
 //BA.debugLineNum = 37;BA.debugLine="str = str.Replace(\"java.lang.\",\"\")";
_str = _str.replace("java.lang.","");
 //BA.debugLineNum = 38;BA.debugLine="str = str.Replace(\"java.util.\",\"\")";
_str = _str.replace("java.util.","");
 //BA.debugLineNum = 41;BA.debugLine="If str.Contains(\"$\") Then";
if (_str.contains("$")) { 
 //BA.debugLineNum = 43;BA.debugLine="str = CFStringUtility.breakStrAt( str, \"$\")";
_str = BA.ObjectToString(_vvvvvvvvvvvvvvvvvvvv5._vv5(_str,"$"));
 //BA.debugLineNum = 44;BA.debugLine="str = CFStringUtility.trim_left_once(str, \"$\")";
_str = _vvvvvvvvvvvvvvvvvvvv5._trim_left_once(_str,"$");
 //BA.debugLineNum = 45;BA.debugLine="str = CFStringUtility.trim_left_once(str, \"_\")";
_str = _vvvvvvvvvvvvvvvvvvvv5._trim_left_once(_str,"_");
 };
 //BA.debugLineNum = 49;BA.debugLine="Return str.ToLowerCase";
if (true) return _str.toLowerCase();
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
}
