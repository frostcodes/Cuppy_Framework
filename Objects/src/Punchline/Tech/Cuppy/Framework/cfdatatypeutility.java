package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class cfdatatypeutility extends Object{
public static cfdatatypeutility mostCurrent = new cfdatatypeutility();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfdatatypeutility", null);
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
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static b4j.example.cssutils _cssutils = null;
public static Punchline.Tech.Cuppy.Framework.main _main = null;
public static Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public static Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public static Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public static Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public static Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public static Punchline.Tech.Cuppy.Framework.cfanimationmanager _cfanimationmanager = null;
public static Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public static Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public static boolean  _boolval(Object _mixedvar) throws Exception{
RDebugUtils.currentModule="cfdatatypeutility";
if (Debug.shouldDelegate(ba, "boolval"))
	 {return ((Boolean) Debug.delegate(ba, "boolval", new Object[] {_mixedvar}));}
RDebugUtils.currentLine=26542080;
 //BA.debugLineNum = 26542080;BA.debugLine="Public Sub BoolVal(mixedVar As Object) As Boolean";
RDebugUtils.currentLine=26542082;
 //BA.debugLineNum = 26542082;BA.debugLine="If mixedVar = False Then";
if ((_mixedvar).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
RDebugUtils.currentLine=26542083;
 //BA.debugLineNum = 26542083;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=26542086;
 //BA.debugLineNum = 26542086;BA.debugLine="If mixedVar = 0  Or mixedVar = 0.0 Then";
if ((_mixedvar).equals((Object)(0)) || (_mixedvar).equals((Object)(0.0))) { 
RDebugUtils.currentLine=26542087;
 //BA.debugLineNum = 26542087;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=26542090;
 //BA.debugLineNum = 26542090;BA.debugLine="If mixedVar = \"\" Or mixedVar = \"0\" Then";
if ((_mixedvar).equals((Object)("")) || (_mixedvar).equals((Object)("0"))) { 
RDebugUtils.currentLine=26542091;
 //BA.debugLineNum = 26542091;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=26542094;
 //BA.debugLineNum = 26542094;BA.debugLine="If mixedVar = Null  Or mixedVar = \"undefined\" The";
if (_mixedvar== null || (_mixedvar).equals((Object)("undefined"))) { 
RDebugUtils.currentLine=26542095;
 //BA.debugLineNum = 26542095;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=26542098;
 //BA.debugLineNum = 26542098;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=26542100;
 //BA.debugLineNum = 26542100;BA.debugLine="End Sub";
return false;
}
public static boolean  _isarraylist(Object _obj) throws Exception{
RDebugUtils.currentModule="cfdatatypeutility";
if (Debug.shouldDelegate(ba, "isarraylist"))
	 {return ((Boolean) Debug.delegate(ba, "isarraylist", new Object[] {_obj}));}
RDebugUtils.currentLine=27000832;
 //BA.debugLineNum = 27000832;BA.debugLine="Public Sub IsArrayList(obj As Object) As Boolean";
RDebugUtils.currentLine=27000834;
 //BA.debugLineNum = 27000834;BA.debugLine="Return IsTypeOf(obj, \"arraylist\")";
if (true) return _istypeof(_obj,"arraylist");
RDebugUtils.currentLine=27000836;
 //BA.debugLineNum = 27000836;BA.debugLine="End Sub";
return false;
}
public static boolean  _istypeof(Object _obj,String _typeof) throws Exception{
RDebugUtils.currentModule="cfdatatypeutility";
if (Debug.shouldDelegate(ba, "istypeof"))
	 {return ((Boolean) Debug.delegate(ba, "istypeof", new Object[] {_obj,_typeof}));}
RDebugUtils.currentLine=26673152;
 //BA.debugLineNum = 26673152;BA.debugLine="Public Sub IsTypeOf(obj As Object , TypeOf As Stri";
RDebugUtils.currentLine=26673154;
 //BA.debugLineNum = 26673154;BA.debugLine="Return StripJavaType(GetType(obj)) = TypeOf.ToLow";
if (true) return (_stripjavatype(anywheresoftware.b4a.keywords.Common.GetType(_obj))).equals(_typeof.toLowerCase());
RDebugUtils.currentLine=26673156;
 //BA.debugLineNum = 26673156;BA.debugLine="End Sub";
return false;
}
public static boolean  _isboolean(Object _obj) throws Exception{
RDebugUtils.currentModule="cfdatatypeutility";
if (Debug.shouldDelegate(ba, "isboolean"))
	 {return ((Boolean) Debug.delegate(ba, "isboolean", new Object[] {_obj}));}
RDebugUtils.currentLine=26738688;
 //BA.debugLineNum = 26738688;BA.debugLine="Public Sub IsBoolean(obj As Object) As Boolean";
RDebugUtils.currentLine=26738690;
 //BA.debugLineNum = 26738690;BA.debugLine="Return IsTypeOf(obj, \"boolean\")";
if (true) return _istypeof(_obj,"boolean");
RDebugUtils.currentLine=26738692;
 //BA.debugLineNum = 26738692;BA.debugLine="End Sub";
return false;
}
public static boolean  _isdouble(Object _obj) throws Exception{
RDebugUtils.currentModule="cfdatatypeutility";
if (Debug.shouldDelegate(ba, "isdouble"))
	 {return ((Boolean) Debug.delegate(ba, "isdouble", new Object[] {_obj}));}
RDebugUtils.currentLine=26935296;
 //BA.debugLineNum = 26935296;BA.debugLine="Public Sub IsDouble(obj As Object) As Boolean";
RDebugUtils.currentLine=26935298;
 //BA.debugLineNum = 26935298;BA.debugLine="Return IsTypeOf(obj, \"double\")";
if (true) return _istypeof(_obj,"double");
RDebugUtils.currentLine=26935300;
 //BA.debugLineNum = 26935300;BA.debugLine="End Sub";
return false;
}
public static boolean  _isinteger(Object _obj) throws Exception{
RDebugUtils.currentModule="cfdatatypeutility";
if (Debug.shouldDelegate(ba, "isinteger"))
	 {return ((Boolean) Debug.delegate(ba, "isinteger", new Object[] {_obj}));}
RDebugUtils.currentLine=26869760;
 //BA.debugLineNum = 26869760;BA.debugLine="Public Sub IsInteger(obj As Object) As Boolean";
RDebugUtils.currentLine=26869762;
 //BA.debugLineNum = 26869762;BA.debugLine="Return IsTypeOf(obj, \"integer\")";
if (true) return _istypeof(_obj,"integer");
RDebugUtils.currentLine=26869764;
 //BA.debugLineNum = 26869764;BA.debugLine="End Sub";
return false;
}
public static boolean  _islist(Object _obj) throws Exception{
RDebugUtils.currentModule="cfdatatypeutility";
if (Debug.shouldDelegate(ba, "islist"))
	 {return ((Boolean) Debug.delegate(ba, "islist", new Object[] {_obj}));}
RDebugUtils.currentLine=27066368;
 //BA.debugLineNum = 27066368;BA.debugLine="Public Sub IsList(obj As Object) As Boolean";
RDebugUtils.currentLine=27066370;
 //BA.debugLineNum = 27066370;BA.debugLine="Return IsArrayList(obj)";
if (true) return _isarraylist(_obj);
RDebugUtils.currentLine=27066372;
 //BA.debugLineNum = 27066372;BA.debugLine="End Sub";
return false;
}
public static boolean  _isnull(Object _obj) throws Exception{
RDebugUtils.currentModule="cfdatatypeutility";
if (Debug.shouldDelegate(ba, "isnull"))
	 {return ((Boolean) Debug.delegate(ba, "isnull", new Object[] {_obj}));}
RDebugUtils.currentLine=27131904;
 //BA.debugLineNum = 27131904;BA.debugLine="Public Sub IsNull(obj As Object) As Boolean";
RDebugUtils.currentLine=27131906;
 //BA.debugLineNum = 27131906;BA.debugLine="Return CFStringUtility.isNull(obj)";
if (true) return _cfstringutility._isnull(_obj);
RDebugUtils.currentLine=27131908;
 //BA.debugLineNum = 27131908;BA.debugLine="End Sub";
return false;
}
public static boolean  _isobject(Object _obj) throws Exception{
RDebugUtils.currentModule="cfdatatypeutility";
if (Debug.shouldDelegate(ba, "isobject"))
	 {return ((Boolean) Debug.delegate(ba, "isobject", new Object[] {_obj}));}
RDebugUtils.currentLine=27197440;
 //BA.debugLineNum = 27197440;BA.debugLine="Public Sub IsObject(obj As Object) As Boolean";
RDebugUtils.currentLine=27197442;
 //BA.debugLineNum = 27197442;BA.debugLine="Return IsTypeOf(obj, \"object\")";
if (true) return _istypeof(_obj,"object");
RDebugUtils.currentLine=27197444;
 //BA.debugLineNum = 27197444;BA.debugLine="End Sub";
return false;
}
public static boolean  _isscalar(Object _mixedvar) throws Exception{
RDebugUtils.currentModule="cfdatatypeutility";
if (Debug.shouldDelegate(ba, "isscalar"))
	 {return ((Boolean) Debug.delegate(ba, "isscalar", new Object[] {_mixedvar}));}
RDebugUtils.currentLine=27262976;
 //BA.debugLineNum = 27262976;BA.debugLine="Public Sub IsScalar (mixedVar As Object) As Boolea";
RDebugUtils.currentLine=27262978;
 //BA.debugLineNum = 27262978;BA.debugLine="Return IsString(mixedVar) Or IsNumber(mixedVar) O";
if (true) return _isstring(_mixedvar) || anywheresoftware.b4a.keywords.Common.IsNumber(BA.ObjectToString(_mixedvar)) || _isboolean(_mixedvar);
RDebugUtils.currentLine=27262980;
 //BA.debugLineNum = 27262980;BA.debugLine="End Sub";
return false;
}
public static boolean  _isstring(Object _obj) throws Exception{
RDebugUtils.currentModule="cfdatatypeutility";
if (Debug.shouldDelegate(ba, "isstring"))
	 {return ((Boolean) Debug.delegate(ba, "isstring", new Object[] {_obj}));}
RDebugUtils.currentLine=26804224;
 //BA.debugLineNum = 26804224;BA.debugLine="Public Sub IsString(obj As Object) As Boolean";
RDebugUtils.currentLine=26804226;
 //BA.debugLineNum = 26804226;BA.debugLine="Return IsTypeOf(obj, \"string\")";
if (true) return _istypeof(_obj,"string");
RDebugUtils.currentLine=26804228;
 //BA.debugLineNum = 26804228;BA.debugLine="End Sub";
return false;
}
public static String  _stripjavatype(String _str) throws Exception{
RDebugUtils.currentModule="cfdatatypeutility";
if (Debug.shouldDelegate(ba, "stripjavatype"))
	 {return ((String) Debug.delegate(ba, "stripjavatype", new Object[] {_str}));}
RDebugUtils.currentLine=26607616;
 //BA.debugLineNum = 26607616;BA.debugLine="Private Sub StripJavaType(str As String) As String";
RDebugUtils.currentLine=26607618;
 //BA.debugLineNum = 26607618;BA.debugLine="str = str.Replace(\"java.lang.\",\"\")";
_str = _str.replace("java.lang.","");
RDebugUtils.currentLine=26607619;
 //BA.debugLineNum = 26607619;BA.debugLine="str = str.Replace(\"java.util.\",\"\")";
_str = _str.replace("java.util.","");
RDebugUtils.currentLine=26607622;
 //BA.debugLineNum = 26607622;BA.debugLine="If str.Contains(\"$\") Then";
if (_str.contains("$")) { 
RDebugUtils.currentLine=26607624;
 //BA.debugLineNum = 26607624;BA.debugLine="str = CFStringUtility.breakStrAt( str, \"$\")";
_str = BA.ObjectToString(_cfstringutility._breakstrat(_str,"$"));
RDebugUtils.currentLine=26607625;
 //BA.debugLineNum = 26607625;BA.debugLine="str = CFStringUtility.trim_left_once(str, \"$\")";
_str = _cfstringutility._trim_left_once(_str,"$");
RDebugUtils.currentLine=26607626;
 //BA.debugLineNum = 26607626;BA.debugLine="str = CFStringUtility.trim_left_once(str, \"_\")";
_str = _cfstringutility._trim_left_once(_str,"_");
 };
RDebugUtils.currentLine=26607630;
 //BA.debugLineNum = 26607630;BA.debugLine="Return str.ToLowerCase";
if (true) return _str.toLowerCase();
RDebugUtils.currentLine=26607632;
 //BA.debugLineNum = 26607632;BA.debugLine="End Sub";
return "";
}
}