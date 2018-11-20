package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cfdatatypeutility_subs_0 {


public static RemoteObject  _boolval(RemoteObject _mixedvar) throws Exception{
try {
		Debug.PushSubsStack("BoolVal (cfdatatypeutility) ","cfdatatypeutility",27,cfdatatypeutility.ba,cfdatatypeutility.mostCurrent,12);
if (RapidSub.canDelegate("boolval")) { return Punchline.Tech.Cuppy.Framework.cfdatatypeutility.remoteMe.runUserSub(false, "cfdatatypeutility","boolval", _mixedvar);}
Debug.locals.put("mixedVar", _mixedvar);
 BA.debugLineNum = 12;BA.debugLine="Public Sub BoolVal(mixedVar As Object) As Boolean";
Debug.ShouldStop(2048);
 BA.debugLineNum = 14;BA.debugLine="If mixedVar = False Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_mixedvar,(cfdatatypeutility.__c.getField(true,"False")))) { 
 BA.debugLineNum = 15;BA.debugLine="Return False";
Debug.ShouldStop(16384);
if (true) return cfdatatypeutility.__c.getField(true,"False");
 };
 BA.debugLineNum = 18;BA.debugLine="If mixedVar = 0  Or mixedVar = 0.0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_mixedvar,RemoteObject.createImmutable((0))) || RemoteObject.solveBoolean("=",_mixedvar,RemoteObject.createImmutable((0.0)))) { 
 BA.debugLineNum = 19;BA.debugLine="Return False";
Debug.ShouldStop(262144);
if (true) return cfdatatypeutility.__c.getField(true,"False");
 };
 BA.debugLineNum = 22;BA.debugLine="If mixedVar = \"\" Or mixedVar = \"0\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_mixedvar,RemoteObject.createImmutable((""))) || RemoteObject.solveBoolean("=",_mixedvar,RemoteObject.createImmutable(("0")))) { 
 BA.debugLineNum = 23;BA.debugLine="Return False";
Debug.ShouldStop(4194304);
if (true) return cfdatatypeutility.__c.getField(true,"False");
 };
 BA.debugLineNum = 26;BA.debugLine="If mixedVar = Null  Or mixedVar = \"undefined\" The";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("n",_mixedvar) || RemoteObject.solveBoolean("=",_mixedvar,RemoteObject.createImmutable(("undefined")))) { 
 BA.debugLineNum = 27;BA.debugLine="Return False";
Debug.ShouldStop(67108864);
if (true) return cfdatatypeutility.__c.getField(true,"False");
 };
 BA.debugLineNum = 30;BA.debugLine="Return True";
Debug.ShouldStop(536870912);
if (true) return cfdatatypeutility.__c.getField(true,"True");
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isarraylist(RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("IsArrayList (cfdatatypeutility) ","cfdatatypeutility",27,cfdatatypeutility.ba,cfdatatypeutility.mostCurrent,89);
if (RapidSub.canDelegate("isarraylist")) { return Punchline.Tech.Cuppy.Framework.cfdatatypeutility.remoteMe.runUserSub(false, "cfdatatypeutility","isarraylist", _obj);}
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 89;BA.debugLine="Public Sub IsArrayList(obj As Object) As Boolean";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 91;BA.debugLine="Return IsTypeOf(obj, \"arraylist\")";
Debug.ShouldStop(67108864);
if (true) return _istypeof(_obj,RemoteObject.createImmutable("arraylist"));
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isboolean(RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("IsBoolean (cfdatatypeutility) ","cfdatatypeutility",27,cfdatatypeutility.ba,cfdatatypeutility.mostCurrent,61);
if (RapidSub.canDelegate("isboolean")) { return Punchline.Tech.Cuppy.Framework.cfdatatypeutility.remoteMe.runUserSub(false, "cfdatatypeutility","isboolean", _obj);}
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 61;BA.debugLine="Public Sub IsBoolean(obj As Object) As Boolean";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 63;BA.debugLine="Return IsTypeOf(obj, \"boolean\")";
Debug.ShouldStop(1073741824);
if (true) return _istypeof(_obj,RemoteObject.createImmutable("boolean"));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isdouble(RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("IsDouble (cfdatatypeutility) ","cfdatatypeutility",27,cfdatatypeutility.ba,cfdatatypeutility.mostCurrent,82);
if (RapidSub.canDelegate("isdouble")) { return Punchline.Tech.Cuppy.Framework.cfdatatypeutility.remoteMe.runUserSub(false, "cfdatatypeutility","isdouble", _obj);}
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 82;BA.debugLine="Public Sub IsDouble(obj As Object) As Boolean";
Debug.ShouldStop(131072);
 BA.debugLineNum = 84;BA.debugLine="Return IsTypeOf(obj, \"double\")";
Debug.ShouldStop(524288);
if (true) return _istypeof(_obj,RemoteObject.createImmutable("double"));
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isinteger(RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("IsInteger (cfdatatypeutility) ","cfdatatypeutility",27,cfdatatypeutility.ba,cfdatatypeutility.mostCurrent,75);
if (RapidSub.canDelegate("isinteger")) { return Punchline.Tech.Cuppy.Framework.cfdatatypeutility.remoteMe.runUserSub(false, "cfdatatypeutility","isinteger", _obj);}
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 75;BA.debugLine="Public Sub IsInteger(obj As Object) As Boolean";
Debug.ShouldStop(1024);
 BA.debugLineNum = 77;BA.debugLine="Return IsTypeOf(obj, \"integer\")";
Debug.ShouldStop(4096);
if (true) return _istypeof(_obj,RemoteObject.createImmutable("integer"));
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _islist(RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("IsList (cfdatatypeutility) ","cfdatatypeutility",27,cfdatatypeutility.ba,cfdatatypeutility.mostCurrent,97);
if (RapidSub.canDelegate("islist")) { return Punchline.Tech.Cuppy.Framework.cfdatatypeutility.remoteMe.runUserSub(false, "cfdatatypeutility","islist", _obj);}
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 97;BA.debugLine="Public Sub IsList(obj As Object) As Boolean";
Debug.ShouldStop(1);
 BA.debugLineNum = 99;BA.debugLine="Return IsArrayList(obj)";
Debug.ShouldStop(4);
if (true) return _isarraylist(_obj);
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isnull(RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("IsNull (cfdatatypeutility) ","cfdatatypeutility",27,cfdatatypeutility.ba,cfdatatypeutility.mostCurrent,105);
if (RapidSub.canDelegate("isnull")) { return Punchline.Tech.Cuppy.Framework.cfdatatypeutility.remoteMe.runUserSub(false, "cfdatatypeutility","isnull", _obj);}
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 105;BA.debugLine="Public Sub IsNull(obj As Object) As Boolean";
Debug.ShouldStop(256);
 BA.debugLineNum = 107;BA.debugLine="Return CFStringUtility.isNull(obj)";
Debug.ShouldStop(1024);
if (true) return cfdatatypeutility._cfstringutility.runMethod(true,"_isnull",(Object)(_obj));
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isobject(RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("IsObject (cfdatatypeutility) ","cfdatatypeutility",27,cfdatatypeutility.ba,cfdatatypeutility.mostCurrent,112);
if (RapidSub.canDelegate("isobject")) { return Punchline.Tech.Cuppy.Framework.cfdatatypeutility.remoteMe.runUserSub(false, "cfdatatypeutility","isobject", _obj);}
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 112;BA.debugLine="Public Sub IsObject(obj As Object) As Boolean";
Debug.ShouldStop(32768);
 BA.debugLineNum = 114;BA.debugLine="Return IsTypeOf(obj, \"object\")";
Debug.ShouldStop(131072);
if (true) return _istypeof(_obj,RemoteObject.createImmutable("object"));
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isscalar(RemoteObject _mixedvar) throws Exception{
try {
		Debug.PushSubsStack("IsScalar (cfdatatypeutility) ","cfdatatypeutility",27,cfdatatypeutility.ba,cfdatatypeutility.mostCurrent,122);
if (RapidSub.canDelegate("isscalar")) { return Punchline.Tech.Cuppy.Framework.cfdatatypeutility.remoteMe.runUserSub(false, "cfdatatypeutility","isscalar", _mixedvar);}
Debug.locals.put("mixedVar", _mixedvar);
 BA.debugLineNum = 122;BA.debugLine="Public Sub IsScalar (mixedVar As Object) As Boolea";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 124;BA.debugLine="Return IsString(mixedVar) Or IsNumber(mixedVar) O";
Debug.ShouldStop(134217728);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(".",_isstring(_mixedvar)) || RemoteObject.solveBoolean(".",cfdatatypeutility.__c.runMethod(true,"IsNumber",(Object)(BA.ObjectToString(_mixedvar)))) || RemoteObject.solveBoolean(".",_isboolean(_mixedvar)));
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isstring(RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("IsString (cfdatatypeutility) ","cfdatatypeutility",27,cfdatatypeutility.ba,cfdatatypeutility.mostCurrent,68);
if (RapidSub.canDelegate("isstring")) { return Punchline.Tech.Cuppy.Framework.cfdatatypeutility.remoteMe.runUserSub(false, "cfdatatypeutility","isstring", _obj);}
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 68;BA.debugLine="Public Sub IsString(obj As Object) As Boolean";
Debug.ShouldStop(8);
 BA.debugLineNum = 70;BA.debugLine="Return IsTypeOf(obj, \"string\")";
Debug.ShouldStop(32);
if (true) return _istypeof(_obj,RemoteObject.createImmutable("string"));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _istypeof(RemoteObject _obj,RemoteObject _typeof) throws Exception{
try {
		Debug.PushSubsStack("IsTypeOf (cfdatatypeutility) ","cfdatatypeutility",27,cfdatatypeutility.ba,cfdatatypeutility.mostCurrent,54);
if (RapidSub.canDelegate("istypeof")) { return Punchline.Tech.Cuppy.Framework.cfdatatypeutility.remoteMe.runUserSub(false, "cfdatatypeutility","istypeof", _obj, _typeof);}
Debug.locals.put("obj", _obj);
Debug.locals.put("TypeOf", _typeof);
 BA.debugLineNum = 54;BA.debugLine="Public Sub IsTypeOf(obj As Object , TypeOf As Stri";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 56;BA.debugLine="Return StripJavaType(GetType(obj)) = TypeOf.ToLow";
Debug.ShouldStop(8388608);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_stripjavatype(cfdatatypeutility.__c.runMethod(true,"GetType",(Object)(_obj))),_typeof.runMethod(true,"toLowerCase")));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
cfdatatypeutility._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _stripjavatype(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("StripJavaType (cfdatatypeutility) ","cfdatatypeutility",27,cfdatatypeutility.ba,cfdatatypeutility.mostCurrent,35);
if (RapidSub.canDelegate("stripjavatype")) { return Punchline.Tech.Cuppy.Framework.cfdatatypeutility.remoteMe.runUserSub(false, "cfdatatypeutility","stripjavatype", _str);}
Debug.locals.put("str", _str);
 BA.debugLineNum = 35;BA.debugLine="Private Sub StripJavaType(str As String) As String";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="str = str.Replace(\"java.lang.\",\"\")";
Debug.ShouldStop(16);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString("java.lang.")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 BA.debugLineNum = 38;BA.debugLine="str = str.Replace(\"java.util.\",\"\")";
Debug.ShouldStop(32);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString("java.util.")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 BA.debugLineNum = 41;BA.debugLine="If str.Contains(\"$\") Then";
Debug.ShouldStop(256);
if (_str.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("$"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 43;BA.debugLine="str = CFStringUtility.breakStrAt( str, \"$\")";
Debug.ShouldStop(1024);
_str = BA.ObjectToString(cfdatatypeutility._cfstringutility.runMethod(false,"_breakstrat",(Object)(_str),(Object)(RemoteObject.createImmutable("$"))));Debug.locals.put("str", _str);
 BA.debugLineNum = 44;BA.debugLine="str = CFStringUtility.trim_left_once(str, \"$\")";
Debug.ShouldStop(2048);
_str = cfdatatypeutility._cfstringutility.runMethod(true,"_trim_left_once",(Object)(_str),(Object)(RemoteObject.createImmutable("$")));Debug.locals.put("str", _str);
 BA.debugLineNum = 45;BA.debugLine="str = CFStringUtility.trim_left_once(str, \"_\")";
Debug.ShouldStop(4096);
_str = cfdatatypeutility._cfstringutility.runMethod(true,"_trim_left_once",(Object)(_str),(Object)(RemoteObject.createImmutable("_")));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 49;BA.debugLine="Return str.ToLowerCase";
Debug.ShouldStop(65536);
if (true) return _str.runMethod(true,"toLowerCase");
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}