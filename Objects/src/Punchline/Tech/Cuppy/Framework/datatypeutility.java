package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class datatypeutility extends Object{
public static datatypeutility mostCurrent = new datatypeutility();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.datatypeutility", null);
		ba.loadHtSubs(datatypeutility.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "Punchline.Tech.Cuppy.Framework.datatypeutility", ba);
		}
	}
    public static Class<?> getObject() {
		return datatypeutility.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static b4j.example.cssutils _cssutils = null;
public static Punchline.Tech.Cuppy.Framework.configs _configs = null;
public static Punchline.Tech.Cuppy.Framework.stringutility _stringutility = null;
public static Punchline.Tech.Cuppy.Framework.mathutility _mathutility = null;
public static Punchline.Tech.Cuppy.Framework.fileutility _fileutility = null;
public static Punchline.Tech.Cuppy.Framework.cf_datageneratorutility _cf_datageneratorutility = null;
public static Punchline.Tech.Cuppy.Framework.cf_htmlutility _cf_htmlutility = null;
public static Punchline.Tech.Cuppy.Framework.stylemanager _stylemanager = null;
public static Punchline.Tech.Cuppy.Framework.apputility _apputility = null;
public static Punchline.Tech.Cuppy.Framework.controlsutils _controlsutils = null;
public static Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public static Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public static boolean  _boolval(Object _mixedvar) throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Public Sub boolval(mixedVar As Object) As Boolean";
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
public static boolean  _is_scalar(Object _mixedvar) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Public Sub is_scalar (mixedVar As Object) As Boole";
 //BA.debugLineNum = 124;BA.debugLine="Return isString(mixedVar) Or IsNumber(mixedVar) O";
if (true) return _isstring(_mixedvar) || anywheresoftware.b4a.keywords.Common.IsNumber(BA.ObjectToString(_mixedvar)) || _isboolean(_mixedvar);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return false;
}
public static boolean  _isarraylist(Object _obj) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Public Sub isArrayList(obj As Object) As Boolean";
 //BA.debugLineNum = 91;BA.debugLine="Return isTypeOf(obj, \"arraylist\")";
if (true) return _istypeof(_obj,"arraylist");
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return false;
}
public static boolean  _isboolean(Object _obj) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Public Sub isBoolean(obj As Object) As Boolean";
 //BA.debugLineNum = 63;BA.debugLine="Return isTypeOf(obj, \"boolean\")";
if (true) return _istypeof(_obj,"boolean");
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return false;
}
public static boolean  _isdouble(Object _obj) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Public Sub isDouble(obj As Object) As Boolean";
 //BA.debugLineNum = 84;BA.debugLine="Return isTypeOf(obj, \"double\")";
if (true) return _istypeof(_obj,"double");
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return false;
}
public static boolean  _isinteger(Object _obj) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Public Sub isInteger(obj As Object) As Boolean";
 //BA.debugLineNum = 77;BA.debugLine="Return isTypeOf(obj, \"integer\")";
if (true) return _istypeof(_obj,"integer");
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return false;
}
public static boolean  _islist(Object _obj) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Public Sub isList(obj As Object) As Boolean";
 //BA.debugLineNum = 99;BA.debugLine="Return isArrayList(obj)";
if (true) return _isarraylist(_obj);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return false;
}
public static boolean  _isnull(Object _obj) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Public Sub isNull(obj As Object) As Boolean";
 //BA.debugLineNum = 107;BA.debugLine="Return StringUtility.isNull(obj)";
if (true) return _stringutility._isnull(_obj);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return false;
}
public static boolean  _isobject(Object _obj) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Public Sub isObject(obj As Object) As Boolean";
 //BA.debugLineNum = 114;BA.debugLine="Return isTypeOf(obj, \"object\")";
if (true) return _istypeof(_obj,"object");
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return false;
}
public static boolean  _isstring(Object _obj) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Public Sub isString(obj As Object) As Boolean";
 //BA.debugLineNum = 70;BA.debugLine="Return isTypeOf(obj, \"string\")";
if (true) return _istypeof(_obj,"string");
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return false;
}
public static boolean  _istypeof(Object _obj,String _typeof) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Public Sub isTypeOf(obj As Object , TypeOf As Stri";
 //BA.debugLineNum = 56;BA.debugLine="Return strip_java_type(GetType(obj)) = TypeOf.ToL";
if (true) return (_strip_java_type(anywheresoftware.b4a.keywords.Common.GetType(_obj))).equals(_typeof.toLowerCase());
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return false;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public static String  _strip_java_type(String _str) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Private Sub strip_java_type(str As String) As Stri";
 //BA.debugLineNum = 37;BA.debugLine="str = str.Replace(\"java.lang.\",\"\")";
_str = _str.replace("java.lang.","");
 //BA.debugLineNum = 38;BA.debugLine="str = str.Replace(\"java.util.\",\"\")";
_str = _str.replace("java.util.","");
 //BA.debugLineNum = 41;BA.debugLine="If str.Contains(\"$\") Then";
if (_str.contains("$")) { 
 //BA.debugLineNum = 43;BA.debugLine="str = StringUtility.breakStrAt( str, \"$\")";
_str = BA.ObjectToString(_stringutility._breakstrat(_str,"$"));
 //BA.debugLineNum = 44;BA.debugLine="str = StringUtility.trim_left_once(str, \"$\")";
_str = _stringutility._trim_left_once(_str,"$");
 //BA.debugLineNum = 45;BA.debugLine="str = StringUtility.trim_left_once(str, \"_\")";
_str = _stringutility._trim_left_once(_str,"_");
 };
 //BA.debugLineNum = 49;BA.debugLine="Return str.ToLowerCase";
if (true) return _str.toLowerCase();
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
}
