package punchline.tech.cuppy.framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class cfdatatypeutility extends Object{
public static cfdatatypeutility mostCurrent = new cfdatatypeutility();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("punchline.tech.cuppy.framework", "punchline.tech.cuppy.framework.cfdatatypeutility", null);
		ba.loadHtSubs(cfdatatypeutility.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "punchline.tech.cuppy.framework.cfdatatypeutility", ba);
		}
	}
    public static Class<?> getObject() {
		return cfdatatypeutility.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static b4j.example.cssutils _cssutils = null;
public static punchline.tech.cuppy.framework.cfconfigs _cfconfigs = null;
public static punchline.tech.cuppy.framework.cfcontrolsutils _cfcontrolsutils = null;
public static punchline.tech.cuppy.framework.cfstringutility _cfstringutility = null;
public static punchline.tech.cuppy.framework.cfdatageneratorutility _cfdatageneratorutility = null;
public static punchline.tech.cuppy.framework.cfapputility _cfapputility = null;
public static punchline.tech.cuppy.framework.cfmathutility _cfmathutility = null;
public static punchline.tech.cuppy.framework.cfstylemanager _cfstylemanager = null;
public static punchline.tech.cuppy.framework.cffileutility _cffileutility = null;
public static boolean  _boolval(Object _mixedvar) throws Exception{
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
public static boolean  _isnull(Object _obj) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Public Sub IsNull(obj As Object) As Boolean";
 //BA.debugLineNum = 61;BA.debugLine="Return CFStringUtility.isNull(obj)";
if (true) return _cfstringutility._isnull(_obj);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return false;
}
public static boolean  _isobject(Object _obj) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Public Sub IsObject(obj As Object) As Boolean";
 //BA.debugLineNum = 68;BA.debugLine="Return IsTypeOf(obj, \"object\")";
if (true) return _istypeof(_obj,"object");
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return false;
}
public static boolean  _isscalar(Object _mixedvar) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Public Sub IsScalar (mixedVar As Object) As Boolea";
 //BA.debugLineNum = 78;BA.debugLine="Return mixedVar Is String Or IsNumber(mixedVar) O";
if (true) return _mixedvar instanceof String || anywheresoftware.b4a.keywords.Common.IsNumber(BA.ObjectToString(_mixedvar)) || _mixedvar instanceof Boolean;
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return false;
}
public static boolean  _istypeof(Object _obj,String _typeof) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Public Sub IsTypeOf(obj As Object , TypeOf As Stri";
 //BA.debugLineNum = 53;BA.debugLine="Return StripJavaType(GetType(obj)) = TypeOf.ToLow";
if (true) return (_stripjavatype(anywheresoftware.b4a.keywords.Common.GetType(_obj))).equals(_typeof.toLowerCase());
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return false;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public static String  _stripjavatype(String _str) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Private Sub StripJavaType(str As String) As String";
 //BA.debugLineNum = 34;BA.debugLine="str = str.Replace(\"java.lang.\",\"\")";
_str = _str.replace("java.lang.","");
 //BA.debugLineNum = 35;BA.debugLine="str = str.Replace(\"java.util.\",\"\")";
_str = _str.replace("java.util.","");
 //BA.debugLineNum = 38;BA.debugLine="If str.Contains(\"$\") Then";
if (_str.contains("$")) { 
 //BA.debugLineNum = 40;BA.debugLine="str = CFStringUtility.breakStrAt( str, \"$\")";
_str = BA.ObjectToString(_cfstringutility._breakstrat(_str,"$"));
 //BA.debugLineNum = 41;BA.debugLine="str = CFStringUtility.trim_left_once(str, \"$\")";
_str = _cfstringutility._trim_left_once(_str,"$");
 //BA.debugLineNum = 42;BA.debugLine="str = CFStringUtility.trim_left_once(str, \"_\")";
_str = _cfstringutility._trim_left_once(_str,"_");
 };
 //BA.debugLineNum = 46;BA.debugLine="Return str.ToLowerCase";
if (true) return _str.toLowerCase();
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
}
