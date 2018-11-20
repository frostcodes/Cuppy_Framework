package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cfstringutility_subs_0 {


public static RemoteObject  _breakstrat(RemoteObject _haystack,RemoteObject _after) throws Exception{
try {
		Debug.PushSubsStack("BreakStrAt (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,700);
if (RapidSub.canDelegate("breakstrat")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","breakstrat", _haystack, _after);}
RemoteObject _found = RemoteObject.createImmutable("");
Debug.locals.put("haystack", _haystack);
Debug.locals.put("after", _after);
 BA.debugLineNum = 700;BA.debugLine="Public Sub BreakStrAt(haystack As String, after As";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 702;BA.debugLine="Dim found As String = \"\"";
Debug.ShouldStop(536870912);
_found = BA.ObjectToString("");Debug.locals.put("found", _found);Debug.locals.put("found", _found);
 BA.debugLineNum = 704;BA.debugLine="found= haystack.IndexOf(after)";
Debug.ShouldStop(-2147483648);
_found = BA.NumberToString(_haystack.runMethod(true,"indexOf",(Object)(_after)));Debug.locals.put("found", _found);
 BA.debugLineNum = 706;BA.debugLine="If found = -1 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_found,BA.NumberToString(-(double) (0 + 1)))) { 
 BA.debugLineNum = 708;BA.debugLine="Return False";
Debug.ShouldStop(8);
if (true) return (cfstringutility.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 712;BA.debugLine="Return haystack.SubString(found)";
Debug.ShouldStop(128);
if (true) return (_haystack.runMethod(true,"substring",(Object)(BA.numberCast(int.class, _found))));
 };
 BA.debugLineNum = 716;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _camelize(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("Camelize (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,435);
if (RapidSub.canDelegate("camelize")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","camelize", _str);}
RemoteObject _firstchar = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable("");
RemoteObject _txt = RemoteObject.createImmutable("");
Debug.locals.put("str", _str);
 BA.debugLineNum = 435;BA.debugLine="Public Sub Camelize(str As String)  As String";
Debug.ShouldStop(262144);
 BA.debugLineNum = 436;BA.debugLine="Dim firstChar, result As String =\"\"";
Debug.ShouldStop(524288);
_firstchar = RemoteObject.createImmutable("");Debug.locals.put("firstChar", _firstchar);
_result = BA.ObjectToString("");Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 438;BA.debugLine="str= str.Replace(\" \", \"_\") 'make all spaces _";
Debug.ShouldStop(2097152);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("_")));Debug.locals.put("str", _str);
 BA.debugLineNum = 440;BA.debugLine="firstChar = str.CharAt(0)";
Debug.ShouldStop(8388608);
_firstchar = BA.ObjectToString(_str.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("firstChar", _firstchar);
 BA.debugLineNum = 441;BA.debugLine="firstChar = firstChar.ToLowerCase";
Debug.ShouldStop(16777216);
_firstchar = _firstchar.runMethod(true,"toLowerCase");Debug.locals.put("firstChar", _firstchar);
 BA.debugLineNum = 443;BA.debugLine="For Each txt As String In Explode(\"_\", str)";
Debug.ShouldStop(67108864);
{
final RemoteObject group5 = _explode(BA.ObjectToString("_"),_str);
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_txt = BA.ObjectToString(group5.runMethod(false,"Get",index5));Debug.locals.put("txt", _txt);
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 444;BA.debugLine="result = result & Ucfirst(txt)";
Debug.ShouldStop(134217728);
_result = RemoteObject.concat(_result,_ucfirst(_txt));Debug.locals.put("result", _result);
 }
}Debug.locals.put("txt", _txt);
;
 BA.debugLineNum = 447;BA.debugLine="Return firstChar & result.SubString(1)";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.concat(_firstchar,_result.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 449;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _containurl(RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("ContainUrl (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,84);
if (RapidSub.canDelegate("containurl")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","containurl", _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 84;BA.debugLine="Public Sub ContainUrl(text As String) As Boolean";
Debug.ShouldStop(524288);
 BA.debugLineNum = 86;BA.debugLine="text = text.Trim";
Debug.ShouldStop(2097152);
_text = _text.runMethod(true,"trim");Debug.locals.put("text", _text);
 BA.debugLineNum = 88;BA.debugLine="Return text.Contains(\"http://\") Or text.Contains(";
Debug.ShouldStop(8388608);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(".",_text.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("http://")))) || RemoteObject.solveBoolean(".",_text.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("https://")))));
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dateordinal(RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("DateOrdinal (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,1020);
if (RapidSub.canDelegate("dateordinal")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","dateordinal", _date);}
RemoteObject _sufixes = null;
RemoteObject _ival = RemoteObject.createImmutable("");
RemoteObject _val = RemoteObject.createImmutable(0);
Debug.locals.put("date", _date);
 BA.debugLineNum = 1020;BA.debugLine="Public Sub DateOrdinal(date As Int) As String";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1022;BA.debugLine="Dim sufixes() As String = Array As String(\"th\", \"";
Debug.ShouldStop(536870912);
_sufixes = RemoteObject.createNewArray("String",new int[] {10},new Object[] {BA.ObjectToString("th"),BA.ObjectToString("st"),BA.ObjectToString("nd"),BA.ObjectToString("rd"),BA.ObjectToString("th"),BA.ObjectToString("th"),BA.ObjectToString("th"),BA.ObjectToString("th"),BA.ObjectToString("th"),RemoteObject.createImmutable("th")});Debug.locals.put("sufixes", _sufixes);Debug.locals.put("sufixes", _sufixes);
 BA.debugLineNum = 1023;BA.debugLine="Dim iVal As String = date";
Debug.ShouldStop(1073741824);
_ival = BA.NumberToString(_date);Debug.locals.put("iVal", _ival);Debug.locals.put("iVal", _ival);
 BA.debugLineNum = 1024;BA.debugLine="Dim val As Int =  (date Mod 100)";
Debug.ShouldStop(-2147483648);
_val = (RemoteObject.solve(new RemoteObject[] {_date,RemoteObject.createImmutable(100)}, "%",0, 1));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 1025;BA.debugLine="If val = 11 Or val =  12 Or val = 13 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_val,BA.numberCast(double.class, 11)) || RemoteObject.solveBoolean("=",_val,BA.numberCast(double.class, 12)) || RemoteObject.solveBoolean("=",_val,BA.numberCast(double.class, 13))) { 
 BA.debugLineNum = 1027;BA.debugLine="Return iVal & \"th\"";
Debug.ShouldStop(4);
if (true) return RemoteObject.concat(_ival,RemoteObject.createImmutable("th"));
 }else {
 BA.debugLineNum = 1031;BA.debugLine="Return iVal & sufixes(date Mod 10)";
Debug.ShouldStop(64);
if (true) return RemoteObject.concat(_ival,_sufixes.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {_date,RemoteObject.createImmutable(10)}, "%",0, 1)));
 };
 BA.debugLineNum = 1035;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _escapestring(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("EscapeString (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,347);
if (RapidSub.canDelegate("escapestring")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","escapestring", _value);}
Debug.locals.put("value", _value);
 BA.debugLineNum = 347;BA.debugLine="Public Sub EscapeString(value As String) As String";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 349;BA.debugLine="Return \"\\\" & value";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("\\"),_value);
 BA.debugLineNum = 351;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _explode(RemoteObject _delimiter,RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("Explode (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,362);
if (RapidSub.canDelegate("explode")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","explode", _delimiter, _str);}
Debug.locals.put("delimiter", _delimiter);
Debug.locals.put("str", _str);
 BA.debugLineNum = 362;BA.debugLine="Public Sub Explode(delimiter As String ,  str As S";
Debug.ShouldStop(512);
 BA.debugLineNum = 364;BA.debugLine="Return Split(str, delimiter)";
Debug.ShouldStop(2048);
if (true) return _split(_str,_delimiter);
 BA.debugLineNum = 366;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _generatepincode(RemoteObject _pinlength) throws Exception{
try {
		Debug.PushSubsStack("GeneratePinCode (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,264);
if (RapidSub.canDelegate("generatepincode")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","generatepincode", _pinlength);}
RemoteObject _result = RemoteObject.createImmutable("");
RemoteObject _randomarray = null;
int _i = 0;
Debug.locals.put("PinLength", _pinlength);
 BA.debugLineNum = 264;BA.debugLine="Public Sub GeneratePinCode(PinLength As Int) As In";
Debug.ShouldStop(128);
 BA.debugLineNum = 266;BA.debugLine="Dim result As String =\"\"";
Debug.ShouldStop(512);
_result = BA.ObjectToString("");Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 267;BA.debugLine="Dim RandomArray() As String = Array As String(1,2";
Debug.ShouldStop(1024);
_randomarray = RemoteObject.createNewArray("String",new int[] {10},new Object[] {BA.NumberToString(1),BA.NumberToString(2),BA.NumberToString(3),BA.NumberToString(4),BA.NumberToString(5),BA.NumberToString(6),BA.NumberToString(7),BA.NumberToString(8),BA.NumberToString(9),BA.NumberToString(0)});Debug.locals.put("RandomArray", _randomarray);Debug.locals.put("RandomArray", _randomarray);
 BA.debugLineNum = 269;BA.debugLine="For i = 0 To PinLength - 1";
Debug.ShouldStop(4096);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_pinlength,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 271;BA.debugLine="result = result &  RandomArray( Rnd( 0, Rnd(2, R";
Debug.ShouldStop(16384);
_result = RemoteObject.concat(_result,_randomarray.getArrayElement(true,cfstringutility.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(cfstringutility.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 2)),(Object)(RemoteObject.solve(new RemoteObject[] {_randomarray.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1)))))));Debug.locals.put("result", _result);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 275;BA.debugLine="Return  result";
Debug.ShouldStop(262144);
if (true) return BA.numberCast(int.class, _result);
 BA.debugLineNum = 277;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _generaterandomstring(RemoteObject _strlength) throws Exception{
try {
		Debug.PushSubsStack("GenerateRandomString (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,226);
if (RapidSub.canDelegate("generaterandomstring")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","generaterandomstring", _strlength);}
RemoteObject _rndstring = RemoteObject.createImmutable("");
RemoteObject _rndnumber = RemoteObject.createImmutable(0);
Debug.locals.put("StrLength", _strlength);
 BA.debugLineNum = 226;BA.debugLine="Public Sub GenerateRandomString(StrLength As Int)";
Debug.ShouldStop(2);
 BA.debugLineNum = 227;BA.debugLine="Dim RndString As String";
Debug.ShouldStop(4);
_rndstring = RemoteObject.createImmutable("");Debug.locals.put("RndString", _rndstring);
 BA.debugLineNum = 228;BA.debugLine="Dim RndNumber As Int";
Debug.ShouldStop(8);
_rndnumber = RemoteObject.createImmutable(0);Debug.locals.put("RndNumber", _rndnumber);
 BA.debugLineNum = 229;BA.debugLine="Do While RndString.Length < StrLength";
Debug.ShouldStop(16);
while (RemoteObject.solveBoolean("<",_rndstring.runMethod(true,"length"),BA.numberCast(double.class, _strlength))) {
 BA.debugLineNum = 230;BA.debugLine="RndNumber = Rnd(48,123) 'Yep, 123, because the l";
Debug.ShouldStop(32);
_rndnumber = cfstringutility.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 48)),(Object)(BA.numberCast(int.class, 123)));Debug.locals.put("RndNumber", _rndnumber);
 BA.debugLineNum = 231;BA.debugLine="If (RndNumber >= 48 And RndNumber <= 57) Or (Rnd";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_rndnumber,BA.numberCast(double.class, 48)) && RemoteObject.solveBoolean("k",_rndnumber,BA.numberCast(double.class, 57))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_rndnumber,BA.numberCast(double.class, 65)) && RemoteObject.solveBoolean("k",_rndnumber,BA.numberCast(double.class, 90))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_rndnumber,BA.numberCast(double.class, 97)) && RemoteObject.solveBoolean("k",_rndnumber,BA.numberCast(double.class, 112)))))) { 
 BA.debugLineNum = 232;BA.debugLine="RndString = RndString & Chr(RndNumber)";
Debug.ShouldStop(128);
_rndstring = RemoteObject.concat(_rndstring,cfstringutility.__c.runMethod(true,"Chr",(Object)(_rndnumber)));Debug.locals.put("RndString", _rndstring);
 };
 }
;
 BA.debugLineNum = 235;BA.debugLine="Return RndString";
Debug.ShouldStop(1024);
if (true) return _rndstring;
 BA.debugLineNum = 236;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _generaterandomstring2(RemoteObject _strlength) throws Exception{
try {
		Debug.PushSubsStack("GenerateRandomString2 (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,243);
if (RapidSub.canDelegate("generaterandomstring2")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","generaterandomstring2", _strlength);}
RemoteObject _randomarray = null;
RemoteObject _result = RemoteObject.createImmutable("");
Debug.locals.put("StrLength", _strlength);
 BA.debugLineNum = 243;BA.debugLine="Public Sub GenerateRandomString2(StrLength As Int)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 245;BA.debugLine="Dim RandomArray() As String = Array As String(\"!\"";
Debug.ShouldStop(1048576);
_randomarray = RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.ObjectToString("!"),BA.ObjectToString("@"),BA.ObjectToString("#"),BA.ObjectToString("$"),RemoteObject.createImmutable("%")});Debug.locals.put("RandomArray", _randomarray);Debug.locals.put("RandomArray", _randomarray);
 BA.debugLineNum = 246;BA.debugLine="Dim result As String";
Debug.ShouldStop(2097152);
_result = RemoteObject.createImmutable("");Debug.locals.put("result", _result);
 BA.debugLineNum = 249;BA.debugLine="result =  StringArray2String(ShuffleArray(RandomA";
Debug.ShouldStop(16777216);
_result = _stringarray2string(_shufflearray(_randomarray));Debug.locals.put("result", _result);
 BA.debugLineNum = 250;BA.debugLine="result = result  & GenerateRandomString( Floor( S";
Debug.ShouldStop(33554432);
_result = RemoteObject.concat(_result,_generaterandomstring(BA.numberCast(int.class, cfstringutility.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {_strlength,RemoteObject.createImmutable(2)}, "/",0, 0))))));Debug.locals.put("result", _result);
 BA.debugLineNum = 251;BA.debugLine="result = result  & StringArray2String(ShuffleArra";
Debug.ShouldStop(67108864);
_result = RemoteObject.concat(_result,_stringarray2string(_shufflearray(_randomarray)));Debug.locals.put("result", _result);
 BA.debugLineNum = 252;BA.debugLine="result = result  & GenerateRandomString( Floor( S";
Debug.ShouldStop(134217728);
_result = RemoteObject.concat(_result,_generaterandomstring(BA.numberCast(int.class, cfstringutility.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {_strlength,RemoteObject.createImmutable(2)}, "/",0, 0))))));Debug.locals.put("result", _result);
 BA.debugLineNum = 255;BA.debugLine="Return  result.SubString2( result.Length - StrLen";
Debug.ShouldStop(1073741824);
if (true) return _result.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_result.runMethod(true,"length"),_strlength}, "-",1, 1)),(Object)(_result.runMethod(true,"length")));
 BA.debugLineNum = 257;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _humanize(RemoteObject _str,RemoteObject _separator) throws Exception{
try {
		Debug.PushSubsStack("Humanize (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,461);
if (RapidSub.canDelegate("humanize")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","humanize", _str, _separator);}
Debug.locals.put("str", _str);
Debug.locals.put("separator", _separator);
 BA.debugLineNum = 461;BA.debugLine="Public Sub Humanize(str As String, separator As St";
Debug.ShouldStop(4096);
 BA.debugLineNum = 463;BA.debugLine="str= str.ToLowerCase";
Debug.ShouldStop(16384);
_str = _str.runMethod(true,"toLowerCase");Debug.locals.put("str", _str);
 BA.debugLineNum = 464;BA.debugLine="Return Ucwords(str.Replace(separator, \" \"))";
Debug.ShouldStop(32768);
if (true) return _ucwords(_str.runMethod(true,"replace",(Object)(_separator),(Object)(RemoteObject.createImmutable(" "))));
 BA.debugLineNum = 466;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _implode(RemoteObject _separator,RemoteObject _strlist) throws Exception{
try {
		Debug.PushSubsStack("Implode (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,369);
if (RapidSub.canDelegate("implode")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","implode", _separator, _strlist);}
RemoteObject _result = RemoteObject.createImmutable("");
RemoteObject _str = RemoteObject.createImmutable("");
Debug.locals.put("separator", _separator);
Debug.locals.put("StrList", _strlist);
 BA.debugLineNum = 369;BA.debugLine="Public Sub Implode(separator As String, StrList As";
Debug.ShouldStop(65536);
 BA.debugLineNum = 370;BA.debugLine="Dim result As String =\"\"";
Debug.ShouldStop(131072);
_result = BA.ObjectToString("");Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 372;BA.debugLine="For Each str As String In StrList 'an array";
Debug.ShouldStop(524288);
{
final RemoteObject group2 = _strlist;
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_str = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("str", _str);
Debug.locals.put("str", _str);
 BA.debugLineNum = 373;BA.debugLine="result = result & str & separator";
Debug.ShouldStop(1048576);
_result = RemoteObject.concat(_result,_str,_separator);Debug.locals.put("result", _result);
 }
}Debug.locals.put("str", _str);
;
 BA.debugLineNum = 376;BA.debugLine="Return Trim_Once(result, separator) ' trim separa";
Debug.ShouldStop(8388608);
if (true) return _trim_once(_result,_separator);
 BA.debugLineNum = 378;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _increment_string(RemoteObject _str,RemoteObject _separator,RemoteObject _first) throws Exception{
try {
		Debug.PushSubsStack("Increment_String (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,304);
if (RapidSub.canDelegate("increment_string")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","increment_string", _str, _separator, _first);}
RemoteObject _parsed_str = RemoteObject.createImmutable("");
RemoteObject _foundint = RemoteObject.createImmutable("");
RemoteObject _indexofseperator = RemoteObject.createImmutable(0);
RemoteObject _foundlong = RemoteObject.createImmutable(0L);
Debug.locals.put("str", _str);
Debug.locals.put("separator", _separator);
Debug.locals.put("first", _first);
 BA.debugLineNum = 304;BA.debugLine="Public Sub Increment_String(str As String, separat";
Debug.ShouldStop(32768);
 BA.debugLineNum = 306;BA.debugLine="Dim parsed_str, foundInt As String =\"\"";
Debug.ShouldStop(131072);
_parsed_str = RemoteObject.createImmutable("");Debug.locals.put("parsed_str", _parsed_str);
_foundint = BA.ObjectToString("");Debug.locals.put("foundInt", _foundint);Debug.locals.put("foundInt", _foundint);
 BA.debugLineNum = 307;BA.debugLine="Dim IndexOfSeperator  As Int = 0";
Debug.ShouldStop(262144);
_indexofseperator = BA.numberCast(int.class, 0);Debug.locals.put("IndexOfSeperator", _indexofseperator);Debug.locals.put("IndexOfSeperator", _indexofseperator);
 BA.debugLineNum = 309;BA.debugLine="IndexOfSeperator = str.LastIndexOf(separator)  'f";
Debug.ShouldStop(1048576);
_indexofseperator = _str.runMethod(true,"lastIndexOf",(Object)(_separator));Debug.locals.put("IndexOfSeperator", _indexofseperator);
 BA.debugLineNum = 311;BA.debugLine="If  IndexOfSeperator <> 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("!",_indexofseperator,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 314;BA.debugLine="foundInt = str.SubString((IndexOfSeperator +1) )";
Debug.ShouldStop(33554432);
_foundint = _str.runMethod(true,"substring",(Object)((RemoteObject.solve(new RemoteObject[] {_indexofseperator,RemoteObject.createImmutable(1)}, "+",1, 1))));Debug.locals.put("foundInt", _foundint);
 BA.debugLineNum = 318;BA.debugLine="If IsNumber(foundInt) Then";
Debug.ShouldStop(536870912);
if (cfstringutility.__c.runMethod(true,"IsNumber",(Object)(_foundint)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 320;BA.debugLine="parsed_str = str.SubString2(0 , IndexOfSeperato";
Debug.ShouldStop(-2147483648);
_parsed_str = _str.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_indexofseperator));Debug.locals.put("parsed_str", _parsed_str);
 BA.debugLineNum = 325;BA.debugLine="Dim foundLong As Long = (foundInt + 1)";
Debug.ShouldStop(16);
_foundlong = BA.numberCast(long.class, (RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _foundint),RemoteObject.createImmutable(1)}, "+",1, 0)));Debug.locals.put("foundLong", _foundlong);Debug.locals.put("foundLong", _foundlong);
 BA.debugLineNum = 327;BA.debugLine="Return parsed_str & separator & foundLong";
Debug.ShouldStop(64);
if (true) return RemoteObject.concat(_parsed_str,_separator,_foundlong);
 }else {
 BA.debugLineNum = 332;BA.debugLine="Return str & separator & first";
Debug.ShouldStop(2048);
if (true) return RemoteObject.concat(_str,_separator,_first);
 };
 }else {
 BA.debugLineNum = 339;BA.debugLine="Return str & separator & first";
Debug.ShouldStop(262144);
if (true) return RemoteObject.concat(_str,_separator,_first);
 };
 BA.debugLineNum = 343;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isemail(RemoteObject _emailaddress) throws Exception{
try {
		Debug.PushSubsStack("IsEmail (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,23);
if (RapidSub.canDelegate("isemail")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","isemail", _emailaddress);}
RemoteObject _matchemail = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
Debug.locals.put("EmailAddress", _emailaddress);
 BA.debugLineNum = 23;BA.debugLine="Public Sub IsEmail(EmailAddress As String) As Bool";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 25;BA.debugLine="Dim MatchEmail As Matcher = Regex.Matcher(\"^(?i)[";
Debug.ShouldStop(16777216);
_matchemail = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
_matchemail = cfstringutility.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$")),(Object)(_emailaddress));Debug.locals.put("MatchEmail", _matchemail);Debug.locals.put("MatchEmail", _matchemail);
 BA.debugLineNum = 27;BA.debugLine="If MatchEmail.Find = True Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_matchemail.runMethod(true,"Find"),cfstringutility.__c.getField(true,"True"))) { 
 BA.debugLineNum = 28;BA.debugLine="Return True";
Debug.ShouldStop(134217728);
if (true) return cfstringutility.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 30;BA.debugLine="Return False";
Debug.ShouldStop(536870912);
if (true) return cfstringutility.__c.getField(true,"False");
 };
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isempty(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("IsEmpty (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,15);
if (RapidSub.canDelegate("isempty")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","isempty", _str);}
Debug.locals.put("str", _str);
 BA.debugLineNum = 15;BA.debugLine="Public Sub IsEmpty(str As String) As Boolean";
Debug.ShouldStop(16384);
 BA.debugLineNum = 17;BA.debugLine="Return (str.Trim = \"\")";
Debug.ShouldStop(65536);
if (true) return BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_str.runMethod(true,"trim"),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isletter(RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("IsLetter (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,54);
if (RapidSub.canDelegate("isletter")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","isletter", _c);}
RemoteObject _pattern = RemoteObject.createImmutable("");
Debug.locals.put("c", _c);
 BA.debugLineNum = 54;BA.debugLine="Public Sub IsLetter (c As String) As Boolean";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 56;BA.debugLine="Dim pattern As String = \"\\p{Alpha}\"";
Debug.ShouldStop(8388608);
_pattern = BA.ObjectToString("\\p{Alpha}");Debug.locals.put("pattern", _pattern);Debug.locals.put("pattern", _pattern);
 BA.debugLineNum = 57;BA.debugLine="If IsDevTool(\"B4J\") Then pattern = \"(?U)\" & patte";
Debug.ShouldStop(16777216);
if (cfstringutility.__c.runMethod(true,"IsDevTool",(Object)(RemoteObject.createImmutable("B4J"))).<Boolean>get().booleanValue()) { 
_pattern = RemoteObject.concat(RemoteObject.createImmutable("(?U)"),_pattern);Debug.locals.put("pattern", _pattern);};
 BA.debugLineNum = 59;BA.debugLine="Return Regex.IsMatch(pattern, c)";
Debug.ShouldStop(67108864);
if (true) return cfstringutility.__c.getField(false,"Regex").runMethod(true,"IsMatch",(Object)(_pattern),(Object)(_c));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isletters(RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("IsLetters (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,65);
if (RapidSub.canDelegate("isletters")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","isletters", _text);}
RemoteObject _pattern = RemoteObject.createImmutable("");
Debug.locals.put("text", _text);
 BA.debugLineNum = 65;BA.debugLine="Public Sub IsLetters (text As String) As Boolean";
Debug.ShouldStop(1);
 BA.debugLineNum = 67;BA.debugLine="Dim pattern As String = \"\\p{Alpha}+\"";
Debug.ShouldStop(4);
_pattern = BA.ObjectToString("\\p{Alpha}+");Debug.locals.put("pattern", _pattern);Debug.locals.put("pattern", _pattern);
 BA.debugLineNum = 68;BA.debugLine="If IsDevTool(\"B4J\") Then pattern = \"(?U)\" & patte";
Debug.ShouldStop(8);
if (cfstringutility.__c.runMethod(true,"IsDevTool",(Object)(RemoteObject.createImmutable("B4J"))).<Boolean>get().booleanValue()) { 
_pattern = RemoteObject.concat(RemoteObject.createImmutable("(?U)"),_pattern);Debug.locals.put("pattern", _pattern);};
 BA.debugLineNum = 70;BA.debugLine="Return Regex.IsMatch(pattern, text)";
Debug.ShouldStop(32);
if (true) return cfstringutility.__c.getField(false,"Regex").runMethod(true,"IsMatch",(Object)(_pattern),(Object)(_text));
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
public static RemoteObject  _isnull(RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("IsNull (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,8);
if (RapidSub.canDelegate("isnull")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","isnull", _obj);}
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 8;BA.debugLine="Public Sub IsNull(obj As Object) As Boolean";
Debug.ShouldStop(128);
 BA.debugLineNum = 10;BA.debugLine="Return (obj = Null)";
Debug.ShouldStop(512);
if (true) return BA.ObjectToBoolean((RemoteObject.solveBoolean("n",_obj)));
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isurl(RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("IsUrl (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,75);
if (RapidSub.canDelegate("isurl")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","isurl", _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 75;BA.debugLine="Public Sub IsUrl (text As String) As Boolean";
Debug.ShouldStop(1024);
 BA.debugLineNum = 77;BA.debugLine="text = text.Trim";
Debug.ShouldStop(4096);
_text = _text.runMethod(true,"trim");Debug.locals.put("text", _text);
 BA.debugLineNum = 79;BA.debugLine="Return text.StartsWith(\"http://\") Or text.StartsW";
Debug.ShouldStop(16384);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(".",_text.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("http://")))) || RemoteObject.solveBoolean(".",_text.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("https://")))));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isvalidip(RemoteObject _ip) throws Exception{
try {
		Debug.PushSubsStack("IsValidIp (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,37);
if (RapidSub.canDelegate("isvalidip")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","isvalidip", _ip);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
int _i = 0;
Debug.locals.put("ip", _ip);
 BA.debugLineNum = 37;BA.debugLine="Public Sub IsValidIp(ip As String) As Boolean";
Debug.ShouldStop(16);
 BA.debugLineNum = 39;BA.debugLine="Dim m As Matcher";
Debug.ShouldStop(64);
_m = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");Debug.locals.put("m", _m);
 BA.debugLineNum = 40;BA.debugLine="m = Regex.Matcher(\"^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$\",";
Debug.ShouldStop(128);
_m = cfstringutility.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$")),(Object)(_ip));Debug.locals.put("m", _m);
 BA.debugLineNum = 42;BA.debugLine="If m.Find = False Then Return False";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_m.runMethod(true,"Find"),cfstringutility.__c.getField(true,"False"))) { 
if (true) return cfstringutility.__c.getField(true,"False");};
 BA.debugLineNum = 44;BA.debugLine="For i = 1 To 4";
Debug.ShouldStop(2048);
{
final int step4 = 1;
final int limit4 = 4;
_i = 1 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 45;BA.debugLine="If m.Group(i) > 255 Or m.Group(i) < 0 Then Retur";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _m.runMethod(true,"Group",(Object)(BA.numberCast(int.class, _i)))),BA.numberCast(double.class, 255)) || RemoteObject.solveBoolean("<",BA.numberCast(double.class, _m.runMethod(true,"Group",(Object)(BA.numberCast(int.class, _i)))),BA.numberCast(double.class, 0))) { 
if (true) return cfstringutility.__c.getField(true,"False");};
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 48;BA.debugLine="Return True";
Debug.ShouldStop(32768);
if (true) return cfstringutility.__c.getField(true,"True");
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _join(RemoteObject _strlist,RemoteObject _separator) throws Exception{
try {
		Debug.PushSubsStack("Join (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,382);
if (RapidSub.canDelegate("join")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","join", _strlist, _separator);}
Debug.locals.put("StrList", _strlist);
Debug.locals.put("separator", _separator);
 BA.debugLineNum = 382;BA.debugLine="Public Sub Join(StrList As List,separator As Strin";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 384;BA.debugLine="Return Implode(separator, StrList)";
Debug.ShouldStop(-2147483648);
if (true) return _implode(_separator,_strlist);
 BA.debugLineNum = 386;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lcfirst(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("Lcfirst (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,420);
if (RapidSub.canDelegate("lcfirst")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","lcfirst", _str);}
RemoteObject _firstchar = RemoteObject.createImmutable("");
Debug.locals.put("str", _str);
 BA.debugLineNum = 420;BA.debugLine="Public Sub Lcfirst(str As String) As String";
Debug.ShouldStop(8);
 BA.debugLineNum = 422;BA.debugLine="Dim firstChar As String =\"\"";
Debug.ShouldStop(32);
_firstchar = BA.ObjectToString("");Debug.locals.put("firstChar", _firstchar);Debug.locals.put("firstChar", _firstchar);
 BA.debugLineNum = 423;BA.debugLine="firstChar= str.CharAt(0)";
Debug.ShouldStop(64);
_firstchar = BA.ObjectToString(_str.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("firstChar", _firstchar);
 BA.debugLineNum = 424;BA.debugLine="firstChar = firstChar.ToLowerCase";
Debug.ShouldStop(128);
_firstchar = _firstchar.runMethod(true,"toLowerCase");Debug.locals.put("firstChar", _firstchar);
 BA.debugLineNum = 426;BA.debugLine="Return firstChar & str.SubString(1)";
Debug.ShouldStop(512);
if (true) return RemoteObject.concat(_firstchar,_str.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 428;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nicelyformatteddate() throws Exception{
try {
		Debug.PushSubsStack("NicelyFormattedDate (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,1039);
if (RapidSub.canDelegate("nicelyformatteddate")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","nicelyformatteddate");}
 BA.debugLineNum = 1039;BA.debugLine="Public Sub NicelyFormattedDate As String";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1041;BA.debugLine="DateTime.DateFormat = \"MMMM '\" & DateOrdinal(Date";
Debug.ShouldStop(65536);
cfstringutility.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",RemoteObject.concat(RemoteObject.createImmutable("MMMM '"),_dateordinal(cfstringutility.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(cfstringutility.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable("', yyyy")));
 BA.debugLineNum = 1042;BA.debugLine="Return DateTime.Date(DateTime.Now)";
Debug.ShouldStop(131072);
if (true) return cfstringutility.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(cfstringutility.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 BA.debugLineNum = 1044;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nl2br(RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("Nl2Br (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,1047);
if (RapidSub.canDelegate("nl2br")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","nl2br", _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 1047;BA.debugLine="Public Sub Nl2Br(text As String) As String";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1049;BA.debugLine="Return text.Replace(CRLF, \"<br>\")";
Debug.ShouldStop(16777216);
if (true) return _text.runMethod(true,"replace",(Object)(cfstringutility.__c.getField(true,"CRLF")),(Object)(RemoteObject.createImmutable("<br>")));
 BA.debugLineNum = 1051;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parsequerystring(RemoteObject _querystring) throws Exception{
try {
		Debug.PushSubsStack("ParseQueryString (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,948);
if (RapidSub.canDelegate("parsequerystring")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","parsequerystring", _querystring);}
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _temp_list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _querylist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("QueryString", _querystring);
 BA.debugLineNum = 948;BA.debugLine="Public Sub ParseQueryString(QueryString As String)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 950;BA.debugLine="Dim Data As Map 'total data";
Debug.ShouldStop(2097152);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Data", _data);
 BA.debugLineNum = 951;BA.debugLine="Data.Initialize";
Debug.ShouldStop(4194304);
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 953;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 956;BA.debugLine="Dim temp_list As List = Split(QueryString, \"&\")";
Debug.ShouldStop(134217728);
_temp_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_temp_list = _split(_querystring,RemoteObject.createImmutable("&"));Debug.locals.put("temp_list", _temp_list);Debug.locals.put("temp_list", _temp_list);
 BA.debugLineNum = 958;BA.debugLine="For i = 0 To temp_list.Size - 1";
Debug.ShouldStop(536870912);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_temp_list.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 960;BA.debugLine="Dim QueryList As List = Split(temp_list.Get(i)";
Debug.ShouldStop(-2147483648);
_querylist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_querylist = _split(BA.ObjectToString(_temp_list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),RemoteObject.createImmutable("="));Debug.locals.put("QueryList", _querylist);Debug.locals.put("QueryList", _querylist);
 BA.debugLineNum = 962;BA.debugLine="If Not(Data.ContainsKey(QueryList.Get(0))) Then";
Debug.ShouldStop(2);
if (cfstringutility.__c.runMethod(true,"Not",(Object)(_data.runMethod(true,"ContainsKey",(Object)(_querylist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 964;BA.debugLine="Data.Put(QueryList.Get(0), QueryList.Get(1))";
Debug.ShouldStop(8);
_data.runVoidMethod ("Put",(Object)(_querylist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))),(Object)(_querylist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1)))));
 };
 }
}Debug.locals.put("i", _i);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",cfstringutility.ba, e12.toString()); BA.debugLineNum = 972;BA.debugLine="LogError(\"The parser for < parseQueryString() >";
Debug.ShouldStop(2048);
cfstringutility.__c.runVoidMethod ("LogError",(Object)(RemoteObject.createImmutable("The parser for < parseQueryString() > got broken. Please check input data")));
 };
 BA.debugLineNum = 976;BA.debugLine="Return Data";
Debug.ShouldStop(32768);
if (true) return _data;
 BA.debugLineNum = 978;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parsequerystringurl(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("ParseQueryStringUrl (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,988);
if (RapidSub.canDelegate("parsequerystringurl")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","parsequerystringurl", _url);}
Debug.locals.put("url", _url);
 BA.debugLineNum = 988;BA.debugLine="Public Sub ParseQueryStringUrl(url As String) As M";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 990;BA.debugLine="url= BreakStrAt(url, \"?\") ' Split URL from Query";
Debug.ShouldStop(536870912);
_url = BA.ObjectToString(_breakstrat(_url,RemoteObject.createImmutable("?")));Debug.locals.put("url", _url);
 BA.debugLineNum = 991;BA.debugLine="url =  Trim_Left_Once(url, \"?\")";
Debug.ShouldStop(1073741824);
_url = _trim_left_once(_url,RemoteObject.createImmutable("?"));Debug.locals.put("url", _url);
 BA.debugLineNum = 993;BA.debugLine="Return ParseQueryString(url)";
Debug.ShouldStop(1);
if (true) return _parsequerystring(_url);
 BA.debugLineNum = 995;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _plurify(RemoteObject _text,RemoteObject _count,RemoteObject _suffix) throws Exception{
try {
		Debug.PushSubsStack("Plurify (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,1067);
if (RapidSub.canDelegate("plurify")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","plurify", _text, _count, _suffix);}
Debug.locals.put("text", _text);
Debug.locals.put("count", _count);
Debug.locals.put("suffix", _suffix);
 BA.debugLineNum = 1067;BA.debugLine="Public Sub Plurify(text As String, count As Int, s";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1069;BA.debugLine="If count < 2 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("<",_count,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 1071;BA.debugLine="Return text";
Debug.ShouldStop(16384);
if (true) return _text;
 }else {
 BA.debugLineNum = 1075;BA.debugLine="Return text & suffix";
Debug.ShouldStop(262144);
if (true) return RemoteObject.concat(_text,_suffix);
 };
 BA.debugLineNum = 1079;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _prep_url(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("Prep_url (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,469);
if (RapidSub.canDelegate("prep_url")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","prep_url", _str);}
Debug.locals.put("str", _str);
 BA.debugLineNum = 469;BA.debugLine="Public Sub Prep_url(str As String)  As String";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 471;BA.debugLine="str = str.Trim";
Debug.ShouldStop(4194304);
_str = _str.runMethod(true,"trim");Debug.locals.put("str", _str);
 BA.debugLineNum = 473;BA.debugLine="If IsEmpty(str) Or str.EqualsIgnoreCase(\"http://\"";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(".",_isempty(_str)) || RemoteObject.solveBoolean(".",_str.runMethod(true,"equalsIgnoreCase",(Object)(RemoteObject.createImmutable("http://"))))) { 
 BA.debugLineNum = 475;BA.debugLine="Return  \"\"";
Debug.ShouldStop(67108864);
if (true) return BA.ObjectToString("");
 }else 
{ BA.debugLineNum = 477;BA.debugLine="Else If str.StartsWith(\"#\") Then";
Debug.ShouldStop(268435456);
if (_str.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("#"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 479;BA.debugLine="Return str";
Debug.ShouldStop(1073741824);
if (true) return _str;
 }else {
 BA.debugLineNum = 483;BA.debugLine="If Not(str.StartsWith(\"http://\")) Then";
Debug.ShouldStop(4);
if (cfstringutility.__c.runMethod(true,"Not",(Object)(_str.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("http://"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 485;BA.debugLine="Return \"http://\" & str";
Debug.ShouldStop(16);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("http://"),_str);
 }else {
 BA.debugLineNum = 489;BA.debugLine="Return str";
Debug.ShouldStop(256);
if (true) return _str;
 };
 }}
;
 BA.debugLineNum = 495;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _prepend_zero(RemoteObject _num) throws Exception{
try {
		Debug.PushSubsStack("Prepend_Zero (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,923);
if (RapidSub.canDelegate("prepend_zero")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","prepend_zero", _num);}
Debug.locals.put("num", _num);
 BA.debugLineNum = 923;BA.debugLine="Public Sub Prepend_Zero(num As Int) As String";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 925;BA.debugLine="If num < 10 And num > 0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("<",_num,BA.numberCast(double.class, 10)) && RemoteObject.solveBoolean(">",_num,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 927;BA.debugLine="Return \"0\" & num";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("0"),_num);
 }else {
 BA.debugLineNum = 931;BA.debugLine="Return num";
Debug.ShouldStop(4);
if (true) return BA.NumberToString(_num);
 };
 BA.debugLineNum = 935;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
cfstringutility._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _quotes_to_entities(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("Quotes_To_Entities (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,159);
if (RapidSub.canDelegate("quotes_to_entities")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","quotes_to_entities", _str);}
Debug.locals.put("str", _str);
 BA.debugLineNum = 159;BA.debugLine="Public Sub Quotes_To_Entities(str As String) As St";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 161;BA.debugLine="str = str.Replace(\"\\'\", \"&#39;\")";
Debug.ShouldStop(1);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString("\\'")),(Object)(RemoteObject.createImmutable("&#39;")));Debug.locals.put("str", _str);
 BA.debugLineNum = 162;BA.debugLine="str = str.Replace(\"\\\"\"\",\"&quot;\")";
Debug.ShouldStop(2);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString("\\\"")),(Object)(RemoteObject.createImmutable("&quot;")));Debug.locals.put("str", _str);
 BA.debugLineNum = 164;BA.debugLine="str = str.Replace(\"'\", \"&#39;\")";
Debug.ShouldStop(8);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString("'")),(Object)(RemoteObject.createImmutable("&#39;")));Debug.locals.put("str", _str);
 BA.debugLineNum = 165;BA.debugLine="str = str.Replace(\"\"\"\",\"&quot;\")";
Debug.ShouldStop(16);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString("\"")),(Object)(RemoteObject.createImmutable("&quot;")));Debug.locals.put("str", _str);
 BA.debugLineNum = 167;BA.debugLine="Return str";
Debug.ShouldStop(64);
if (true) return _str;
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _randlistvalue(RemoteObject _listx) throws Exception{
try {
		Debug.PushSubsStack("RandListValue (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,214);
if (RapidSub.canDelegate("randlistvalue")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","randlistvalue", _listx);}
Debug.locals.put("ListX", _listx);
 BA.debugLineNum = 214;BA.debugLine="Public Sub RandListValue(ListX As List) As Object";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 216;BA.debugLine="Return ListX.Get(Rnd(0, ListX.Size -1))";
Debug.ShouldStop(8388608);
if (true) return _listx.runMethod(false,"Get",(Object)(cfstringutility.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_listx.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))));
 BA.debugLineNum = 218;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _reduce_double_slashes(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("Reduce_Double_Slashes (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,175);
if (RapidSub.canDelegate("reduce_double_slashes")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","reduce_double_slashes", _str);}
Debug.locals.put("str", _str);
 BA.debugLineNum = 175;BA.debugLine="Public Sub Reduce_Double_Slashes(str As String) As";
Debug.ShouldStop(16384);
 BA.debugLineNum = 177;BA.debugLine="If str.ToLowerCase.StartsWith(\"http://\") Then";
Debug.ShouldStop(65536);
if (_str.runMethod(true,"toLowerCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("http://"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 179;BA.debugLine="str = str.Replace(\"//\" ,\"/\")";
Debug.ShouldStop(262144);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString("//")),(Object)(RemoteObject.createImmutable("/")));Debug.locals.put("str", _str);
 BA.debugLineNum = 180;BA.debugLine="str =  str.Replace(\"http:/\" ,\"http://\")  'fix ba";
Debug.ShouldStop(524288);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString("http:/")),(Object)(RemoteObject.createImmutable("http://")));Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 184;BA.debugLine="str = str.Replace(\"//\" ,\"/\")";
Debug.ShouldStop(8388608);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString("//")),(Object)(RemoteObject.createImmutable("/")));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 188;BA.debugLine="Return str";
Debug.ShouldStop(134217728);
if (true) return _str;
 BA.debugLineNum = 190;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _shufflearray(RemoteObject _stringarray) throws Exception{
try {
		Debug.PushSubsStack("ShuffleArray (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,199);
if (RapidSub.canDelegate("shufflearray")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","shufflearray", _stringarray);}
RemoteObject _arrayval = RemoteObject.createImmutable("");
RemoteObject _random = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("StringArray", _stringarray);
 BA.debugLineNum = 199;BA.debugLine="Public Sub ShuffleArray(StringArray() As String) A";
Debug.ShouldStop(64);
 BA.debugLineNum = 201;BA.debugLine="Dim ArrayVal As String";
Debug.ShouldStop(256);
_arrayval = RemoteObject.createImmutable("");Debug.locals.put("ArrayVal", _arrayval);
 BA.debugLineNum = 202;BA.debugLine="Dim Random As Int";
Debug.ShouldStop(512);
_random = RemoteObject.createImmutable(0);Debug.locals.put("Random", _random);
 BA.debugLineNum = 204;BA.debugLine="For i = 0 To StringArray.Length - 1";
Debug.ShouldStop(2048);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_stringarray.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 205;BA.debugLine="Random = Rnd(i, StringArray.Length)";
Debug.ShouldStop(4096);
_random = cfstringutility.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, _i)),(Object)(_stringarray.getField(true,"length")));Debug.locals.put("Random", _random);
 BA.debugLineNum = 206;BA.debugLine="ArrayVal = StringArray(i)";
Debug.ShouldStop(8192);
_arrayval = _stringarray.getArrayElement(true,BA.numberCast(int.class, _i));Debug.locals.put("ArrayVal", _arrayval);
 BA.debugLineNum = 207;BA.debugLine="StringArray(i) = StringArray(Random)";
Debug.ShouldStop(16384);
_stringarray.setArrayElement (_stringarray.getArrayElement(true,_random),BA.numberCast(int.class, _i));
 BA.debugLineNum = 208;BA.debugLine="StringArray(Random) = ArrayVal";
Debug.ShouldStop(32768);
_stringarray.setArrayElement (_arrayval,_random);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 210;BA.debugLine="Return StringArray";
Debug.ShouldStop(131072);
if (true) return _stringarray;
 BA.debugLineNum = 211;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _split(RemoteObject _str,RemoteObject _delimiter) throws Exception{
try {
		Debug.PushSubsStack("Split (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,354);
if (RapidSub.canDelegate("split")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","split", _str, _delimiter);}
RemoteObject _t = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("str", _str);
Debug.locals.put("delimiter", _delimiter);
 BA.debugLineNum = 354;BA.debugLine="Sub Split(str As String, delimiter As String) As L";
Debug.ShouldStop(2);
 BA.debugLineNum = 355;BA.debugLine="Dim t As List";
Debug.ShouldStop(4);
_t = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("t", _t);
 BA.debugLineNum = 356;BA.debugLine="t = Regex.Split(EscapeString(delimiter), str)";
Debug.ShouldStop(8);
_t = cfstringutility.__c.runMethod(false, "ArrayToList", (Object)(cfstringutility.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(_escapestring(_delimiter)),(Object)(_str))));Debug.locals.put("t", _t);
 BA.debugLineNum = 357;BA.debugLine="Return t";
Debug.ShouldStop(16);
if (true) return _t;
 BA.debugLineNum = 358;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sprintf(RemoteObject _fmt,RemoteObject _arg) throws Exception{
try {
		Debug.PushSubsStack("Sprintf (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,512);
if (RapidSub.canDelegate("sprintf")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","sprintf", _fmt, _arg);}
RemoteObject _ai = RemoteObject.createImmutable(0);
RemoteObject _fi = RemoteObject.createImmutable(0);
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _exp = RemoteObject.createImmutable(0);
RemoteObject _wid = RemoteObject.createImmutable(0);
RemoteObject _stmp = RemoteObject.createImmutable("");
RemoteObject _ptmp = RemoteObject.createImmutable("");
RemoteObject _sres = RemoteObject.createImmutable("");
RemoteObject _c = RemoteObject.createImmutable("");
RemoteObject _t = RemoteObject.createImmutable("");
RemoteObject _bdone = RemoteObject.createImmutable(false);
Debug.locals.put("fmt", _fmt);
Debug.locals.put("arg", _arg);
 BA.debugLineNum = 512;BA.debugLine="Public Sub Sprintf(fmt As String, arg() As Object)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 513;BA.debugLine="Dim ai, fi, i As Int";
Debug.ShouldStop(1);
_ai = RemoteObject.createImmutable(0);Debug.locals.put("ai", _ai);
_fi = RemoteObject.createImmutable(0);Debug.locals.put("fi", _fi);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 514;BA.debugLine="Dim exp, wid As Int";
Debug.ShouldStop(2);
_exp = RemoteObject.createImmutable(0);Debug.locals.put("exp", _exp);
_wid = RemoteObject.createImmutable(0);Debug.locals.put("wid", _wid);
 BA.debugLineNum = 515;BA.debugLine="Dim stmp, ptmp, sres, c, t As String";
Debug.ShouldStop(4);
_stmp = RemoteObject.createImmutable("");Debug.locals.put("stmp", _stmp);
_ptmp = RemoteObject.createImmutable("");Debug.locals.put("ptmp", _ptmp);
_sres = RemoteObject.createImmutable("");Debug.locals.put("sres", _sres);
_c = RemoteObject.createImmutable("");Debug.locals.put("c", _c);
_t = RemoteObject.createImmutable("");Debug.locals.put("t", _t);
 BA.debugLineNum = 516;BA.debugLine="Dim bdone As Boolean";
Debug.ShouldStop(8);
_bdone = RemoteObject.createImmutable(false);Debug.locals.put("bdone", _bdone);
 BA.debugLineNum = 518;BA.debugLine="ai = 0";
Debug.ShouldStop(32);
_ai = BA.numberCast(int.class, 0);Debug.locals.put("ai", _ai);
 BA.debugLineNum = 519;BA.debugLine="fi = 0";
Debug.ShouldStop(64);
_fi = BA.numberCast(int.class, 0);Debug.locals.put("fi", _fi);
 BA.debugLineNum = 520;BA.debugLine="stmp = \"\"";
Debug.ShouldStop(128);
_stmp = BA.ObjectToString("");Debug.locals.put("stmp", _stmp);
 BA.debugLineNum = 521;BA.debugLine="sres = \"\"";
Debug.ShouldStop(256);
_sres = BA.ObjectToString("");Debug.locals.put("sres", _sres);
 BA.debugLineNum = 523;BA.debugLine="Do While (fi < fmt.Length)";
Debug.ShouldStop(1024);
while ((RemoteObject.solveBoolean("<",_fi,BA.numberCast(double.class, _fmt.runMethod(true,"length"))))) {
 BA.debugLineNum = 524;BA.debugLine="c = fmt.CharAt(fi)";
Debug.ShouldStop(2048);
_c = BA.ObjectToString(_fmt.runMethod(true,"charAt",(Object)(_fi)));Debug.locals.put("c", _c);
 BA.debugLineNum = 525;BA.debugLine="fi = fi + 1";
Debug.ShouldStop(4096);
_fi = RemoteObject.solve(new RemoteObject[] {_fi,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("fi", _fi);
 BA.debugLineNum = 527;BA.debugLine="If (c = \"%\") Then";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("=",_c,RemoteObject.createImmutable("%")))) { 
 BA.debugLineNum = 528;BA.debugLine="stmp = \"\"";
Debug.ShouldStop(32768);
_stmp = BA.ObjectToString("");Debug.locals.put("stmp", _stmp);
 BA.debugLineNum = 529;BA.debugLine="ptmp = \"\"";
Debug.ShouldStop(65536);
_ptmp = BA.ObjectToString("");Debug.locals.put("ptmp", _ptmp);
 BA.debugLineNum = 530;BA.debugLine="bdone = False";
Debug.ShouldStop(131072);
_bdone = cfstringutility.__c.getField(true,"False");Debug.locals.put("bdone", _bdone);
 BA.debugLineNum = 532;BA.debugLine="Do While ((fi < fmt.Length) And (bdone = False)";
Debug.ShouldStop(524288);
while ((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("<",_fi,BA.numberCast(double.class, _fmt.runMethod(true,"length")))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_bdone,cfstringutility.__c.getField(true,"False"))))))) {
 BA.debugLineNum = 533;BA.debugLine="c = fmt.CharAt(fi)";
Debug.ShouldStop(1048576);
_c = BA.ObjectToString(_fmt.runMethod(true,"charAt",(Object)(_fi)));Debug.locals.put("c", _c);
 BA.debugLineNum = 534;BA.debugLine="fi = fi + 1";
Debug.ShouldStop(2097152);
_fi = RemoteObject.solve(new RemoteObject[] {_fi,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("fi", _fi);
 BA.debugLineNum = 536;BA.debugLine="If ((IsNumber(c) = True) Or (c = \".\")) Then";
Debug.ShouldStop(8388608);
if ((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",cfstringutility.__c.runMethod(true,"IsNumber",(Object)(_c)),cfstringutility.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_c,RemoteObject.createImmutable("."))))))) { 
 BA.debugLineNum = 537;BA.debugLine="ptmp = ptmp & c";
Debug.ShouldStop(16777216);
_ptmp = RemoteObject.concat(_ptmp,_c);Debug.locals.put("ptmp", _ptmp);
 BA.debugLineNum = 538;BA.debugLine="bdone = False";
Debug.ShouldStop(33554432);
_bdone = cfstringutility.__c.getField(true,"False");Debug.locals.put("bdone", _bdone);
 }else 
{ BA.debugLineNum = 539;BA.debugLine="Else If (c = \"s\") Then";
Debug.ShouldStop(67108864);
if ((RemoteObject.solveBoolean("=",_c,RemoteObject.createImmutable("s")))) { 
 BA.debugLineNum = 540;BA.debugLine="stmp = arg(ai)";
Debug.ShouldStop(134217728);
_stmp = BA.ObjectToString(_arg.getArrayElement(false,_ai));Debug.locals.put("stmp", _stmp);
 BA.debugLineNum = 541;BA.debugLine="ai = ai + 1";
Debug.ShouldStop(268435456);
_ai = RemoteObject.solve(new RemoteObject[] {_ai,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ai", _ai);
 BA.debugLineNum = 542;BA.debugLine="sres = sres & stmp";
Debug.ShouldStop(536870912);
_sres = RemoteObject.concat(_sres,_stmp);Debug.locals.put("sres", _sres);
 BA.debugLineNum = 543;BA.debugLine="bdone = True";
Debug.ShouldStop(1073741824);
_bdone = cfstringutility.__c.getField(true,"True");Debug.locals.put("bdone", _bdone);
 }else 
{ BA.debugLineNum = 544;BA.debugLine="Else If (c = \"d\") Then";
Debug.ShouldStop(-2147483648);
if ((RemoteObject.solveBoolean("=",_c,RemoteObject.createImmutable("d")))) { 
 BA.debugLineNum = 545;BA.debugLine="If (ptmp.Length > 0) Then";
Debug.ShouldStop(1);
if ((RemoteObject.solveBoolean(">",_ptmp.runMethod(true,"length"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 546;BA.debugLine="t = \" \"";
Debug.ShouldStop(2);
_t = BA.ObjectToString(" ");Debug.locals.put("t", _t);
 BA.debugLineNum = 547;BA.debugLine="If (ptmp.CharAt(0) = \"0\") Then";
Debug.ShouldStop(4);
if ((RemoteObject.solveBoolean("=",_ptmp.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, 0))),BA.ObjectToChar(RemoteObject.createImmutable("0"))))) { 
 BA.debugLineNum = 548;BA.debugLine="t = \"0\"";
Debug.ShouldStop(8);
_t = BA.ObjectToString("0");Debug.locals.put("t", _t);
 BA.debugLineNum = 549;BA.debugLine="ptmp = ptmp.SubString(1)";
Debug.ShouldStop(16);
_ptmp = _ptmp.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("ptmp", _ptmp);
 };
 };
 BA.debugLineNum = 553;BA.debugLine="If (ptmp.Length > 0) Then wid = ptmp Else wid";
Debug.ShouldStop(256);
if ((RemoteObject.solveBoolean(">",_ptmp.runMethod(true,"length"),BA.numberCast(double.class, 0)))) { 
_wid = BA.numberCast(int.class, _ptmp);Debug.locals.put("wid", _wid);}
else {
_wid = BA.numberCast(int.class, 0);Debug.locals.put("wid", _wid);};
 BA.debugLineNum = 555;BA.debugLine="stmp = arg(ai)";
Debug.ShouldStop(1024);
_stmp = BA.ObjectToString(_arg.getArrayElement(false,_ai));Debug.locals.put("stmp", _stmp);
 BA.debugLineNum = 557;BA.debugLine="Do While (stmp.Length < wid)";
Debug.ShouldStop(4096);
while ((RemoteObject.solveBoolean("<",_stmp.runMethod(true,"length"),BA.numberCast(double.class, _wid)))) {
 BA.debugLineNum = 558;BA.debugLine="stmp = t & stmp";
Debug.ShouldStop(8192);
_stmp = RemoteObject.concat(_t,_stmp);Debug.locals.put("stmp", _stmp);
 }
;
 BA.debugLineNum = 561;BA.debugLine="ai = ai + 1";
Debug.ShouldStop(65536);
_ai = RemoteObject.solve(new RemoteObject[] {_ai,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ai", _ai);
 BA.debugLineNum = 562;BA.debugLine="sres = sres & stmp";
Debug.ShouldStop(131072);
_sres = RemoteObject.concat(_sres,_stmp);Debug.locals.put("sres", _sres);
 BA.debugLineNum = 563;BA.debugLine="bdone = True";
Debug.ShouldStop(262144);
_bdone = cfstringutility.__c.getField(true,"True");Debug.locals.put("bdone", _bdone);
 }else 
{ BA.debugLineNum = 564;BA.debugLine="Else If (c = \"f\") Then";
Debug.ShouldStop(524288);
if ((RemoteObject.solveBoolean("=",_c,RemoteObject.createImmutable("f")))) { 
 BA.debugLineNum = 565;BA.debugLine="If (ptmp.Length > 0) Then";
Debug.ShouldStop(1048576);
if ((RemoteObject.solveBoolean(">",_ptmp.runMethod(true,"length"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 566;BA.debugLine="i = ptmp.IndexOf(\".\")";
Debug.ShouldStop(2097152);
_i = _ptmp.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable(".")));Debug.locals.put("i", _i);
 BA.debugLineNum = 567;BA.debugLine="If (i >= 0) Then";
Debug.ShouldStop(4194304);
if ((RemoteObject.solveBoolean("g",_i,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 568;BA.debugLine="wid = ptmp.SubString2(0, i)";
Debug.ShouldStop(8388608);
_wid = BA.numberCast(int.class, _ptmp.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_i)));Debug.locals.put("wid", _wid);
 BA.debugLineNum = 569;BA.debugLine="exp = ptmp.SubString(i+1)";
Debug.ShouldStop(16777216);
_exp = BA.numberCast(int.class, _ptmp.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1))));Debug.locals.put("exp", _exp);
 }else {
 BA.debugLineNum = 571;BA.debugLine="wid = ptmp";
Debug.ShouldStop(67108864);
_wid = BA.numberCast(int.class, _ptmp);Debug.locals.put("wid", _wid);
 BA.debugLineNum = 572;BA.debugLine="exp = 0";
Debug.ShouldStop(134217728);
_exp = BA.numberCast(int.class, 0);Debug.locals.put("exp", _exp);
 };
 BA.debugLineNum = 575;BA.debugLine="stmp = NumberFormat(arg(ai), wid, exp)";
Debug.ShouldStop(1073741824);
_stmp = cfstringutility.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _arg.getArrayElement(false,_ai))),(Object)(_wid),(Object)(_exp));Debug.locals.put("stmp", _stmp);
 }else {
 BA.debugLineNum = 577;BA.debugLine="stmp = arg(ai)";
Debug.ShouldStop(1);
_stmp = BA.ObjectToString(_arg.getArrayElement(false,_ai));Debug.locals.put("stmp", _stmp);
 };
 BA.debugLineNum = 580;BA.debugLine="ai = ai + 1";
Debug.ShouldStop(8);
_ai = RemoteObject.solve(new RemoteObject[] {_ai,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ai", _ai);
 BA.debugLineNum = 581;BA.debugLine="sres = sres & stmp";
Debug.ShouldStop(16);
_sres = RemoteObject.concat(_sres,_stmp);Debug.locals.put("sres", _sres);
 BA.debugLineNum = 582;BA.debugLine="bdone = True";
Debug.ShouldStop(32);
_bdone = cfstringutility.__c.getField(true,"True");Debug.locals.put("bdone", _bdone);
 }else {
 BA.debugLineNum = 584;BA.debugLine="ai = ai + 1";
Debug.ShouldStop(128);
_ai = RemoteObject.solve(new RemoteObject[] {_ai,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ai", _ai);
 }}}}
;
 }
;
 }else {
 BA.debugLineNum = 589;BA.debugLine="sres = sres & c";
Debug.ShouldStop(4096);
_sres = RemoteObject.concat(_sres,_c);Debug.locals.put("sres", _sres);
 };
 }
;
 BA.debugLineNum = 593;BA.debugLine="Return(sres)";
Debug.ShouldStop(65536);
if (true) return (_sres);
 BA.debugLineNum = 595;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _str_repeat(RemoteObject _input,RemoteObject _multiplier) throws Exception{
try {
		Debug.PushSubsStack("Str_Repeat (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,675);
if (RapidSub.canDelegate("str_repeat")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","str_repeat", _input, _multiplier);}
RemoteObject _result = RemoteObject.createImmutable("");
int _i = 0;
Debug.locals.put("input", _input);
Debug.locals.put("multiplier", _multiplier);
 BA.debugLineNum = 675;BA.debugLine="Sub Str_Repeat(input As String, multiplier As Int)";
Debug.ShouldStop(4);
 BA.debugLineNum = 677;BA.debugLine="If multiplier < 1 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("<",_multiplier,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 679;BA.debugLine="Return \"\"";
Debug.ShouldStop(64);
if (true) return BA.ObjectToString("");
 }else {
 BA.debugLineNum = 683;BA.debugLine="Dim result As String = \"\"";
Debug.ShouldStop(1024);
_result = BA.ObjectToString("");Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 685;BA.debugLine="For i = 0 To multiplier - 1";
Debug.ShouldStop(4096);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_multiplier,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 687;BA.debugLine="result = result & input";
Debug.ShouldStop(16384);
_result = RemoteObject.concat(_result,_input);Debug.locals.put("result", _result);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 691;BA.debugLine="Return result";
Debug.ShouldStop(262144);
if (true) return _result;
 };
 BA.debugLineNum = 695;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _str_split(RemoteObject _str,RemoteObject _splitlength) throws Exception{
try {
		Debug.PushSubsStack("Str_Split (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,757);
if (RapidSub.canDelegate("str_split")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","str_split", _str, _splitlength);}
RemoteObject _chunks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _divval = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _nextval = RemoteObject.createImmutable(0);
Debug.locals.put("str", _str);
Debug.locals.put("splitLength", _splitlength);
 BA.debugLineNum = 757;BA.debugLine="Public Sub Str_Split (str As String, splitLength A";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 759;BA.debugLine="Dim chunks As List";
Debug.ShouldStop(4194304);
_chunks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("chunks", _chunks);
 BA.debugLineNum = 760;BA.debugLine="chunks.Initialize";
Debug.ShouldStop(8388608);
_chunks.runVoidMethod ("Initialize");
 BA.debugLineNum = 762;BA.debugLine="If (IsEmpty(str) Or splitLength < 1)  Then";
Debug.ShouldStop(33554432);
if ((RemoteObject.solveBoolean(".",_isempty(_str)) || RemoteObject.solveBoolean("<",_splitlength,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 764;BA.debugLine="Return chunks 'empty list";
Debug.ShouldStop(134217728);
if (true) return _chunks;
 }else 
{ BA.debugLineNum = 766;BA.debugLine="Else If  splitLength = str.Length Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_splitlength,BA.numberCast(double.class, _str.runMethod(true,"length")))) { 
 BA.debugLineNum = 768;BA.debugLine="chunks.Add(str)";
Debug.ShouldStop(-2147483648);
_chunks.runVoidMethod ("Add",(Object)((_str)));
 BA.debugLineNum = 769;BA.debugLine="Return chunks";
Debug.ShouldStop(1);
if (true) return _chunks;
 }}
;
 BA.debugLineNum = 773;BA.debugLine="Dim DivVal As Int  =  str.Length / splitLength";
Debug.ShouldStop(16);
_divval = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_str.runMethod(true,"length"),_splitlength}, "/",0, 0));Debug.locals.put("DivVal", _divval);Debug.locals.put("DivVal", _divval);
 BA.debugLineNum = 775;BA.debugLine="For i = 0 To DivVal";
Debug.ShouldStop(64);
{
final int step10 = 1;
final int limit10 = _divval.<Integer>get().intValue();
_i = 0 ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 777;BA.debugLine="Dim nextVal As Int = i * splitLength";
Debug.ShouldStop(256);
_nextval = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_splitlength}, "*",0, 1);Debug.locals.put("nextVal", _nextval);Debug.locals.put("nextVal", _nextval);
 BA.debugLineNum = 779;BA.debugLine="If i = DivVal Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, _divval))) { 
 BA.debugLineNum = 782;BA.debugLine="chunks.add( str.SubString( nextVal))";
Debug.ShouldStop(8192);
_chunks.runVoidMethod ("Add",(Object)((_str.runMethod(true,"substring",(Object)(_nextval)))));
 }else {
 BA.debugLineNum = 787;BA.debugLine="chunks.add( str.SubString2( nextVal , nextVal +";
Debug.ShouldStop(262144);
_chunks.runVoidMethod ("Add",(Object)((_str.runMethod(true,"substring",(Object)(_nextval),(Object)(RemoteObject.solve(new RemoteObject[] {_nextval,_splitlength}, "+",1, 1))))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 793;BA.debugLine="Return chunks";
Debug.ShouldStop(16777216);
if (true) return _chunks;
 BA.debugLineNum = 795;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _string2ascii(RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("String2Ascii (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,662);
if (RapidSub.canDelegate("string2ascii")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","string2ascii", _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 662;BA.debugLine="Public Sub String2Ascii(text As String) As String";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 665;BA.debugLine="Return String2AsciiWithSeperator(text, \"\")";
Debug.ShouldStop(16777216);
if (true) return _string2asciiwithseperator(_text,RemoteObject.createImmutable(""));
 BA.debugLineNum = 667;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _string2asciiwithseperator(RemoteObject _text,RemoteObject _seperator) throws Exception{
try {
		Debug.PushSubsStack("String2AsciiWithSeperator (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,646);
if (RapidSub.canDelegate("string2asciiwithseperator")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","string2asciiwithseperator", _text, _seperator);}
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
Debug.locals.put("text", _text);
Debug.locals.put("seperator", _seperator);
 BA.debugLineNum = 646;BA.debugLine="Public Sub String2AsciiWithSeperator(text As Strin";
Debug.ShouldStop(32);
 BA.debugLineNum = 648;BA.debugLine="Dim result As StringBuilder";
Debug.ShouldStop(128);
_result = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("result", _result);
 BA.debugLineNum = 649;BA.debugLine="result.Initialize";
Debug.ShouldStop(256);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 651;BA.debugLine="For i = 0 To text.Length - 1";
Debug.ShouldStop(1024);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_text.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 653;BA.debugLine="result.Append(Asc(text.CharAt(i)) & seperator)";
Debug.ShouldStop(4096);
_result.runVoidMethod ("Append",(Object)(RemoteObject.concat(cfstringutility.__c.runMethod(true,"Asc",(Object)(_text.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _i))))),_seperator)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 657;BA.debugLine="Return result.ToString.Trim";
Debug.ShouldStop(65536);
if (true) return _result.runMethod(true,"ToString").runMethod(true,"trim");
 BA.debugLineNum = 659;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stringarray2string(RemoteObject _strarray) throws Exception{
try {
		Debug.PushSubsStack("StringArray2String (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,284);
if (RapidSub.canDelegate("stringarray2string")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","stringarray2string", _strarray);}
RemoteObject _result = RemoteObject.createImmutable("");
RemoteObject _str = RemoteObject.createImmutable("");
Debug.locals.put("StrArray", _strarray);
 BA.debugLineNum = 284;BA.debugLine="Public Sub StringArray2String(StrArray() As String";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 286;BA.debugLine="Dim result As String =\"\"";
Debug.ShouldStop(536870912);
_result = BA.ObjectToString("");Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 287;BA.debugLine="For Each str As String In StrArray 'an array";
Debug.ShouldStop(1073741824);
{
final RemoteObject group2 = _strarray;
final int groupLen2 = group2.getField(true,"length").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_str = group2.getArrayElement(true,RemoteObject.createImmutable(index2));Debug.locals.put("str", _str);
Debug.locals.put("str", _str);
 BA.debugLineNum = 288;BA.debugLine="result = result & str";
Debug.ShouldStop(-2147483648);
_result = RemoteObject.concat(_result,_str);Debug.locals.put("result", _result);
 }
}Debug.locals.put("str", _str);
;
 BA.debugLineNum = 291;BA.debugLine="Return result";
Debug.ShouldStop(4);
if (true) return _result;
 BA.debugLineNum = 293;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _strip_quotes(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("Strip_Quotes (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,150);
if (RapidSub.canDelegate("strip_quotes")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","strip_quotes", _str);}
Debug.locals.put("str", _str);
 BA.debugLineNum = 150;BA.debugLine="Public Sub Strip_Quotes(str As String) As String";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 152;BA.debugLine="str = str.Replace(\"'\", \"\")";
Debug.ShouldStop(8388608);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString("'")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 BA.debugLineNum = 153;BA.debugLine="str = str.Replace(\"\"\"\",\"\")";
Debug.ShouldStop(16777216);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString("\"")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 BA.debugLineNum = 154;BA.debugLine="Return str";
Debug.ShouldStop(33554432);
if (true) return _str;
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stripos(RemoteObject _haystack,RemoteObject _find) throws Exception{
try {
		Debug.PushSubsStack("Stripos (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,832);
if (RapidSub.canDelegate("stripos")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","stripos", _haystack, _find);}
Debug.locals.put("haystack", _haystack);
Debug.locals.put("find", _find);
 BA.debugLineNum = 832;BA.debugLine="Public Sub Stripos(haystack As String , find As St";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 834;BA.debugLine="haystack = haystack.ToLowerCase";
Debug.ShouldStop(2);
_haystack = _haystack.runMethod(true,"toLowerCase");Debug.locals.put("haystack", _haystack);
 BA.debugLineNum = 835;BA.debugLine="find = find.ToLowerCase";
Debug.ShouldStop(4);
_find = _find.runMethod(true,"toLowerCase");Debug.locals.put("find", _find);
 BA.debugLineNum = 837;BA.debugLine="Return haystack.IndexOf(find)";
Debug.ShouldStop(16);
if (true) return _haystack.runMethod(true,"indexOf",(Object)(_find));
 BA.debugLineNum = 839;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stripos2(RemoteObject _haystack,RemoteObject _find,RemoteObject _start) throws Exception{
try {
		Debug.PushSubsStack("Stripos2 (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,848);
if (RapidSub.canDelegate("stripos2")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","stripos2", _haystack, _find, _start);}
Debug.locals.put("haystack", _haystack);
Debug.locals.put("find", _find);
Debug.locals.put("start", _start);
 BA.debugLineNum = 848;BA.debugLine="Public Sub Stripos2(haystack As String , find As S";
Debug.ShouldStop(32768);
 BA.debugLineNum = 850;BA.debugLine="haystack = haystack.ToLowerCase";
Debug.ShouldStop(131072);
_haystack = _haystack.runMethod(true,"toLowerCase");Debug.locals.put("haystack", _haystack);
 BA.debugLineNum = 851;BA.debugLine="find = find.ToLowerCase";
Debug.ShouldStop(262144);
_find = _find.runMethod(true,"toLowerCase");Debug.locals.put("find", _find);
 BA.debugLineNum = 853;BA.debugLine="Return haystack.IndexOf2(find, start)";
Debug.ShouldStop(1048576);
if (true) return _haystack.runMethod(true,"indexOf",(Object)(_find),(Object)(_start));
 BA.debugLineNum = 855;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _strpbrk(RemoteObject _haystack,RemoteObject _charlist) throws Exception{
try {
		Debug.PushSubsStack("Strpbrk (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,723);
if (RapidSub.canDelegate("strpbrk")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","strpbrk", _haystack, _charlist);}
int _i = 0;
Debug.locals.put("haystack", _haystack);
Debug.locals.put("charList", _charlist);
 BA.debugLineNum = 723;BA.debugLine="Public Sub Strpbrk(haystack As String, charList As";
Debug.ShouldStop(262144);
 BA.debugLineNum = 725;BA.debugLine="For i = 0 To haystack.Length - 1";
Debug.ShouldStop(1048576);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {_haystack.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 727;BA.debugLine="If charList.IndexOf(haystack.CharAt(i)) >= 0 The";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("g",_charlist.runMethod(true,"indexOf",(Object)(BA.ObjectToString(_haystack.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _i)))))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 729;BA.debugLine="Return haystack.SubString(i)";
Debug.ShouldStop(16777216);
if (true) return (_haystack.runMethod(true,"substring",(Object)(BA.numberCast(int.class, _i))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 735;BA.debugLine="Return False";
Debug.ShouldStop(1073741824);
if (true) return (cfstringutility.__c.getField(true,"False"));
 BA.debugLineNum = 737;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _strpos(RemoteObject _haystack,RemoteObject _find) throws Exception{
try {
		Debug.PushSubsStack("Strpos (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,806);
if (RapidSub.canDelegate("strpos")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","strpos", _haystack, _find);}
Debug.locals.put("haystack", _haystack);
Debug.locals.put("find", _find);
 BA.debugLineNum = 806;BA.debugLine="Public Sub Strpos(haystack As String , find As Str";
Debug.ShouldStop(32);
 BA.debugLineNum = 808;BA.debugLine="Return haystack.IndexOf(find)";
Debug.ShouldStop(128);
if (true) return _haystack.runMethod(true,"indexOf",(Object)(_find));
 BA.debugLineNum = 810;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _strpos2(RemoteObject _haystack,RemoteObject _find,RemoteObject _start) throws Exception{
try {
		Debug.PushSubsStack("Strpos2 (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,819);
if (RapidSub.canDelegate("strpos2")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","strpos2", _haystack, _find, _start);}
Debug.locals.put("haystack", _haystack);
Debug.locals.put("find", _find);
Debug.locals.put("start", _start);
 BA.debugLineNum = 819;BA.debugLine="Public Sub Strpos2(haystack As String , find As St";
Debug.ShouldStop(262144);
 BA.debugLineNum = 821;BA.debugLine="Return haystack.IndexOf2(find, start)";
Debug.ShouldStop(1048576);
if (true) return _haystack.runMethod(true,"indexOf",(Object)(_find),(Object)(_start));
 BA.debugLineNum = 823;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _strripos(RemoteObject _haystack,RemoteObject _find) throws Exception{
try {
		Debug.PushSubsStack("Strripos (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,894);
if (RapidSub.canDelegate("strripos")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","strripos", _haystack, _find);}
Debug.locals.put("haystack", _haystack);
Debug.locals.put("find", _find);
 BA.debugLineNum = 894;BA.debugLine="Public Sub Strripos(haystack As String , find As S";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 896;BA.debugLine="haystack = haystack.ToLowerCase";
Debug.ShouldStop(-2147483648);
_haystack = _haystack.runMethod(true,"toLowerCase");Debug.locals.put("haystack", _haystack);
 BA.debugLineNum = 897;BA.debugLine="find = find.ToLowerCase";
Debug.ShouldStop(1);
_find = _find.runMethod(true,"toLowerCase");Debug.locals.put("find", _find);
 BA.debugLineNum = 899;BA.debugLine="Return haystack.LastIndexOf(find)";
Debug.ShouldStop(4);
if (true) return _haystack.runMethod(true,"lastIndexOf",(Object)(_find));
 BA.debugLineNum = 901;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _strripos2(RemoteObject _haystack,RemoteObject _find,RemoteObject _start) throws Exception{
try {
		Debug.PushSubsStack("Strripos2 (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,910);
if (RapidSub.canDelegate("strripos2")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","strripos2", _haystack, _find, _start);}
Debug.locals.put("haystack", _haystack);
Debug.locals.put("find", _find);
Debug.locals.put("start", _start);
 BA.debugLineNum = 910;BA.debugLine="Public Sub Strripos2 (haystack As String , find As";
Debug.ShouldStop(8192);
 BA.debugLineNum = 912;BA.debugLine="haystack = haystack.ToLowerCase";
Debug.ShouldStop(32768);
_haystack = _haystack.runMethod(true,"toLowerCase");Debug.locals.put("haystack", _haystack);
 BA.debugLineNum = 913;BA.debugLine="find = find.ToLowerCase";
Debug.ShouldStop(65536);
_find = _find.runMethod(true,"toLowerCase");Debug.locals.put("find", _find);
 BA.debugLineNum = 915;BA.debugLine="Return haystack.LastIndexOf2(find, start)";
Debug.ShouldStop(262144);
if (true) return _haystack.runMethod(true,"lastIndexOf",(Object)(_find),(Object)(_start));
 BA.debugLineNum = 917;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _strrpos(RemoteObject _haystack,RemoteObject _find) throws Exception{
try {
		Debug.PushSubsStack("Strrpos (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,868);
if (RapidSub.canDelegate("strrpos")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","strrpos", _haystack, _find);}
Debug.locals.put("haystack", _haystack);
Debug.locals.put("find", _find);
 BA.debugLineNum = 868;BA.debugLine="Public Sub Strrpos(haystack As String , find As St";
Debug.ShouldStop(8);
 BA.debugLineNum = 870;BA.debugLine="Return haystack.LastIndexOf(find)";
Debug.ShouldStop(32);
if (true) return _haystack.runMethod(true,"lastIndexOf",(Object)(_find));
 BA.debugLineNum = 872;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _strrpos2(RemoteObject _haystack,RemoteObject _find,RemoteObject _start) throws Exception{
try {
		Debug.PushSubsStack("Strrpos2 (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,881);
if (RapidSub.canDelegate("strrpos2")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","strrpos2", _haystack, _find, _start);}
Debug.locals.put("haystack", _haystack);
Debug.locals.put("find", _find);
Debug.locals.put("start", _start);
 BA.debugLineNum = 881;BA.debugLine="Public Sub Strrpos2(haystack As String , find As S";
Debug.ShouldStop(65536);
 BA.debugLineNum = 883;BA.debugLine="Return haystack.LastIndexOf2(find, start)";
Debug.ShouldStop(262144);
if (true) return _haystack.runMethod(true,"lastIndexOf",(Object)(_find),(Object)(_start));
 BA.debugLineNum = 885;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _strtostrlist(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("StrToStrList (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,741);
if (RapidSub.canDelegate("strtostrlist")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","strtostrlist", _str);}
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
Debug.locals.put("str", _str);
 BA.debugLineNum = 741;BA.debugLine="Public Sub StrToStrList(str As String) As List";
Debug.ShouldStop(16);
 BA.debugLineNum = 743;BA.debugLine="Dim result As List";
Debug.ShouldStop(64);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("result", _result);
 BA.debugLineNum = 744;BA.debugLine="result.Initialize";
Debug.ShouldStop(128);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 746;BA.debugLine="For i = 0 To str.Length - 1";
Debug.ShouldStop(512);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_str.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 748;BA.debugLine="result.Add(str.CharAt(i))";
Debug.ShouldStop(2048);
_result.runVoidMethod ("Add",(Object)((_str.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 752;BA.debugLine="Return result";
Debug.ShouldStop(32768);
if (true) return _result;
 BA.debugLineNum = 754;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _trim_left_once(RemoteObject _str,RemoteObject _character) throws Exception{
try {
		Debug.PushSubsStack("Trim_Left_Once (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,103);
if (RapidSub.canDelegate("trim_left_once")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","trim_left_once", _str, _character);}
Debug.locals.put("str", _str);
Debug.locals.put("character", _character);
 BA.debugLineNum = 103;BA.debugLine="Public Sub Trim_Left_Once(str As String, character";
Debug.ShouldStop(64);
 BA.debugLineNum = 105;BA.debugLine="If IsEmpty(character) Then";
Debug.ShouldStop(256);
if (_isempty(_character).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 107;BA.debugLine="character = \" \" 'empty space";
Debug.ShouldStop(1024);
_character = BA.ObjectToString(" ");Debug.locals.put("character", _character);
 };
 BA.debugLineNum = 111;BA.debugLine="If str.StartsWith(character) Then";
Debug.ShouldStop(16384);
if (_str.runMethod(true,"startsWith",(Object)(_character)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 113;BA.debugLine="str = str.SubString(1)";
Debug.ShouldStop(65536);
_str = _str.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 117;BA.debugLine="Return str";
Debug.ShouldStop(1048576);
if (true) return _str;
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _trim_once(RemoteObject _str,RemoteObject _character) throws Exception{
try {
		Debug.PushSubsStack("Trim_Once (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,93);
if (RapidSub.canDelegate("trim_once")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","trim_once", _str, _character);}
Debug.locals.put("str", _str);
Debug.locals.put("character", _character);
 BA.debugLineNum = 93;BA.debugLine="Public Sub Trim_Once(str As String, character As S";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 95;BA.debugLine="str = Trim_Left_Once(str, character)";
Debug.ShouldStop(1073741824);
_str = _trim_left_once(_str,_character);Debug.locals.put("str", _str);
 BA.debugLineNum = 96;BA.debugLine="str = Trim_Right_Once(str, character)";
Debug.ShouldStop(-2147483648);
_str = _trim_right_once(_str,_character);Debug.locals.put("str", _str);
 BA.debugLineNum = 98;BA.debugLine="Return str";
Debug.ShouldStop(2);
if (true) return _str;
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _trim_right_once(RemoteObject _str,RemoteObject _character) throws Exception{
try {
		Debug.PushSubsStack("Trim_Right_Once (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,122);
if (RapidSub.canDelegate("trim_right_once")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","trim_right_once", _str, _character);}
Debug.locals.put("str", _str);
Debug.locals.put("character", _character);
 BA.debugLineNum = 122;BA.debugLine="Public Sub Trim_Right_Once(str As String, characte";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 124;BA.debugLine="If IsEmpty(character) Then";
Debug.ShouldStop(134217728);
if (_isempty(_character).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 126;BA.debugLine="character = \" \" 'empty space";
Debug.ShouldStop(536870912);
_character = BA.ObjectToString(" ");Debug.locals.put("character", _character);
 };
 BA.debugLineNum = 130;BA.debugLine="If str.EndsWith(character) Then";
Debug.ShouldStop(2);
if (_str.runMethod(true,"endsWith",(Object)(_character)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 132;BA.debugLine="str = str.SubString2(0, str.Length - 1)";
Debug.ShouldStop(8);
_str = _str.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_str.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1)));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 136;BA.debugLine="Return str";
Debug.ShouldStop(128);
if (true) return _str;
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _trim_slashes_once(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("Trim_Slashes_Once (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,143);
if (RapidSub.canDelegate("trim_slashes_once")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","trim_slashes_once", _str);}
Debug.locals.put("str", _str);
 BA.debugLineNum = 143;BA.debugLine="Public Sub Trim_Slashes_Once(str As String) As Str";
Debug.ShouldStop(16384);
 BA.debugLineNum = 145;BA.debugLine="Return Trim_Once( str, \"/\")";
Debug.ShouldStop(65536);
if (true) return _trim_once(_str,RemoteObject.createImmutable("/"));
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _truncate(RemoteObject _txt,RemoteObject _length) throws Exception{
try {
		Debug.PushSubsStack("Truncate (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,1001);
if (RapidSub.canDelegate("truncate")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","truncate", _txt, _length);}
Debug.locals.put("txt", _txt);
Debug.locals.put("length", _length);
 BA.debugLineNum = 1001;BA.debugLine="Public Sub Truncate(txt As String, length As Int)";
Debug.ShouldStop(256);
 BA.debugLineNum = 1006;BA.debugLine="If length > txt.Length Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_length,BA.numberCast(double.class, _txt.runMethod(true,"length")))) { 
 BA.debugLineNum = 1008;BA.debugLine="Return txt";
Debug.ShouldStop(32768);
if (true) return _txt;
 }else {
 BA.debugLineNum = 1012;BA.debugLine="Return txt.Substring2(0, length)";
Debug.ShouldStop(524288);
if (true) return _txt.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_length));
 };
 BA.debugLineNum = 1016;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ucfirst(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("Ucfirst (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,407);
if (RapidSub.canDelegate("ucfirst")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","ucfirst", _str);}
RemoteObject _firstchar = RemoteObject.createImmutable("");
Debug.locals.put("str", _str);
 BA.debugLineNum = 407;BA.debugLine="Public Sub Ucfirst(str As String) As String";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 409;BA.debugLine="str = str.ToLowerCase";
Debug.ShouldStop(16777216);
_str = _str.runMethod(true,"toLowerCase");Debug.locals.put("str", _str);
 BA.debugLineNum = 411;BA.debugLine="Dim firstChar As String =\"\"";
Debug.ShouldStop(67108864);
_firstchar = BA.ObjectToString("");Debug.locals.put("firstChar", _firstchar);Debug.locals.put("firstChar", _firstchar);
 BA.debugLineNum = 412;BA.debugLine="firstChar= str.CharAt(0)";
Debug.ShouldStop(134217728);
_firstchar = BA.ObjectToString(_str.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("firstChar", _firstchar);
 BA.debugLineNum = 413;BA.debugLine="firstChar = firstChar.ToUpperCase";
Debug.ShouldStop(268435456);
_firstchar = _firstchar.runMethod(true,"toUpperCase");Debug.locals.put("firstChar", _firstchar);
 BA.debugLineNum = 415;BA.debugLine="Return firstChar & str.SubString(1)";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.concat(_firstchar,_str.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 417;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ucwords(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("Ucwords (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,389);
if (RapidSub.canDelegate("ucwords")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","ucwords", _str);}
RemoteObject _result = RemoteObject.createImmutable("");
RemoteObject _txt = RemoteObject.createImmutable("");
RemoteObject _firstchar = RemoteObject.createImmutable("");
Debug.locals.put("str", _str);
 BA.debugLineNum = 389;BA.debugLine="Public Sub Ucwords(str As String) As String";
Debug.ShouldStop(16);
 BA.debugLineNum = 391;BA.debugLine="Dim result As String =\"\"";
Debug.ShouldStop(64);
_result = BA.ObjectToString("");Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 393;BA.debugLine="For Each txt As String In Explode(\" \", str.ToLowe";
Debug.ShouldStop(256);
{
final RemoteObject group2 = _explode(BA.ObjectToString(" "),_str.runMethod(true,"toLowerCase"));
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_txt = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("txt", _txt);
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 394;BA.debugLine="Dim firstChar As String =\"\"";
Debug.ShouldStop(512);
_firstchar = BA.ObjectToString("");Debug.locals.put("firstChar", _firstchar);Debug.locals.put("firstChar", _firstchar);
 BA.debugLineNum = 395;BA.debugLine="firstChar= txt.CharAt(0)";
Debug.ShouldStop(1024);
_firstchar = BA.ObjectToString(_txt.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("firstChar", _firstchar);
 BA.debugLineNum = 396;BA.debugLine="firstChar = firstChar.ToUpperCase";
Debug.ShouldStop(2048);
_firstchar = _firstchar.runMethod(true,"toUpperCase");Debug.locals.put("firstChar", _firstchar);
 BA.debugLineNum = 398;BA.debugLine="result = result & firstChar & txt.SubString(1) &";
Debug.ShouldStop(8192);
_result = RemoteObject.concat(_result,_firstchar,_txt.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1))),RemoteObject.createImmutable(" "));Debug.locals.put("result", _result);
 }
}Debug.locals.put("txt", _txt);
;
 BA.debugLineNum = 402;BA.debugLine="Return result";
Debug.ShouldStop(131072);
if (true) return _result;
 BA.debugLineNum = 404;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _underscore(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("Underscore (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,453);
if (RapidSub.canDelegate("underscore")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","underscore", _str);}
Debug.locals.put("str", _str);
 BA.debugLineNum = 453;BA.debugLine="Public Sub Underscore(str As String)  As String";
Debug.ShouldStop(16);
 BA.debugLineNum = 455;BA.debugLine="str= str.ToLowerCase";
Debug.ShouldStop(64);
_str = _str.runMethod(true,"toLowerCase");Debug.locals.put("str", _str);
 BA.debugLineNum = 456;BA.debugLine="Return str.Replace(\" \",  \"_\")";
Debug.ShouldStop(128);
if (true) return _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("_")));
 BA.debugLineNum = 458;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _word_wrap(RemoteObject _str,RemoteObject _limit) throws Exception{
try {
		Debug.PushSubsStack("Word_Wrap (cfstringutility) ","cfstringutility",4,cfstringutility.ba,cfstringutility.mostCurrent,602);
if (RapidSub.canDelegate("word_wrap")) { return Punchline.Tech.Cuppy.Framework.cfstringutility.remoteMe.runUserSub(false, "cfstringutility","word_wrap", _str, _limit);}
RemoteObject _divval = RemoteObject.createImmutable(0);
RemoteObject _stringbuild = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
RemoteObject _nextval = RemoteObject.createImmutable(0);
Debug.locals.put("str", _str);
Debug.locals.put("limit", _limit);
 BA.debugLineNum = 602;BA.debugLine="Sub Word_Wrap(str As String, limit As Int) As Stri";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 604;BA.debugLine="str = str.Trim";
Debug.ShouldStop(134217728);
_str = _str.runMethod(true,"trim");Debug.locals.put("str", _str);
 BA.debugLineNum = 606;BA.debugLine="If str.Length = limit Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_str.runMethod(true,"length"),BA.numberCast(double.class, _limit))) { 
 BA.debugLineNum = 608;BA.debugLine="Return str";
Debug.ShouldStop(-2147483648);
if (true) return _str;
 }else {
 BA.debugLineNum = 612;BA.debugLine="Dim DivVal As Int";
Debug.ShouldStop(8);
_divval = RemoteObject.createImmutable(0);Debug.locals.put("DivVal", _divval);
 BA.debugLineNum = 614;BA.debugLine="Dim stringBuild As StringBuilder";
Debug.ShouldStop(32);
_stringbuild = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("stringBuild", _stringbuild);
 BA.debugLineNum = 615;BA.debugLine="stringBuild.Initialize";
Debug.ShouldStop(64);
_stringbuild.runVoidMethod ("Initialize");
 BA.debugLineNum = 617;BA.debugLine="DivVal =  str.Length / limit";
Debug.ShouldStop(256);
_divval = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_str.runMethod(true,"length"),_limit}, "/",0, 0));Debug.locals.put("DivVal", _divval);
 BA.debugLineNum = 619;BA.debugLine="For i = 0 To DivVal";
Debug.ShouldStop(1024);
{
final int step9 = 1;
final int limit9 = _divval.<Integer>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 621;BA.debugLine="Dim nextVal As Int = i * limit";
Debug.ShouldStop(4096);
_nextval = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_limit}, "*",0, 1);Debug.locals.put("nextVal", _nextval);Debug.locals.put("nextVal", _nextval);
 BA.debugLineNum = 623;BA.debugLine="If i = DivVal Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, _divval))) { 
 BA.debugLineNum = 626;BA.debugLine="stringBuild.Append( str.SubString( nextVal).Tr";
Debug.ShouldStop(131072);
_stringbuild.runVoidMethod ("Append",(Object)(_str.runMethod(true,"substring",(Object)(_nextval)).runMethod(true,"trim")));
 }else {
 BA.debugLineNum = 631;BA.debugLine="stringBuild.Append( str.SubString2( nextVal ,";
Debug.ShouldStop(4194304);
_stringbuild.runVoidMethod ("Append",(Object)(_str.runMethod(true,"substring",(Object)(_nextval),(Object)(RemoteObject.solve(new RemoteObject[] {_nextval,_limit}, "+",1, 1))).runMethod(true,"trim")));
 BA.debugLineNum = 632;BA.debugLine="stringBuild.Append( CRLF)";
Debug.ShouldStop(8388608);
_stringbuild.runVoidMethod ("Append",(Object)(cfstringutility.__c.getField(true,"CRLF")));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 638;BA.debugLine="Return stringBuild.ToString";
Debug.ShouldStop(536870912);
if (true) return _stringbuild.runMethod(true,"ToString");
 };
 BA.debugLineNum = 642;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}