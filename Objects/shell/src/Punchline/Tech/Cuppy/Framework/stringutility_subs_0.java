package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class stringutility_subs_0 {


public static RemoteObject  _breakstrat(RemoteObject _haystack,RemoteObject _after) throws Exception{
try {
		Debug.PushSubsStack("breakStrAt (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,685);
if (RapidSub.canDelegate("breakstrat")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","breakstrat", _haystack, _after);}
RemoteObject _found = RemoteObject.createImmutable("");
Debug.locals.put("haystack", _haystack);
Debug.locals.put("after", _after);
 BA.debugLineNum = 685;BA.debugLine="Public Sub breakStrAt(haystack As String, after As";
Debug.ShouldStop(4096);
 BA.debugLineNum = 687;BA.debugLine="Dim found As String = \"\"";
Debug.ShouldStop(16384);
_found = BA.ObjectToString("");Debug.locals.put("found", _found);Debug.locals.put("found", _found);
 BA.debugLineNum = 689;BA.debugLine="found= haystack.IndexOf(after)";
Debug.ShouldStop(65536);
_found = BA.NumberToString(_haystack.runMethod(true,"indexOf",(Object)(_after)));Debug.locals.put("found", _found);
 BA.debugLineNum = 691;BA.debugLine="If found = -1 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_found,BA.NumberToString(-(double) (0 + 1)))) { 
 BA.debugLineNum = 693;BA.debugLine="Return False";
Debug.ShouldStop(1048576);
if (true) return (stringutility.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 697;BA.debugLine="Return haystack.SubString(found)";
Debug.ShouldStop(16777216);
if (true) return (_haystack.runMethod(true,"substring",(Object)(BA.numberCast(int.class, _found))));
 };
 BA.debugLineNum = 701;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("camelize (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,424);
if (RapidSub.canDelegate("camelize")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","camelize", _str);}
RemoteObject _firstchar = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable("");
RemoteObject _txt = RemoteObject.createImmutable("");
Debug.locals.put("str", _str);
 BA.debugLineNum = 424;BA.debugLine="Public Sub camelize(str As String)  As String";
Debug.ShouldStop(128);
 BA.debugLineNum = 425;BA.debugLine="Dim firstChar, result As String =\"\"";
Debug.ShouldStop(256);
_firstchar = RemoteObject.createImmutable("");Debug.locals.put("firstChar", _firstchar);
_result = BA.ObjectToString("");Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 427;BA.debugLine="str= str.Replace(\" \", \"_\") 'make all spaces _";
Debug.ShouldStop(1024);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("_")));Debug.locals.put("str", _str);
 BA.debugLineNum = 429;BA.debugLine="firstChar = str.CharAt(0)";
Debug.ShouldStop(4096);
_firstchar = BA.ObjectToString(_str.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("firstChar", _firstchar);
 BA.debugLineNum = 430;BA.debugLine="firstChar = firstChar.ToLowerCase";
Debug.ShouldStop(8192);
_firstchar = _firstchar.runMethod(true,"toLowerCase");Debug.locals.put("firstChar", _firstchar);
 BA.debugLineNum = 432;BA.debugLine="For Each txt As String In explode(\"_\", str)";
Debug.ShouldStop(32768);
{
final RemoteObject group5 = _explode(BA.ObjectToString("_"),_str);
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_txt = BA.ObjectToString(group5.runMethod(false,"Get",index5));Debug.locals.put("txt", _txt);
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 433;BA.debugLine="result = result & ucfirst(txt)";
Debug.ShouldStop(65536);
_result = RemoteObject.concat(_result,_ucfirst(_txt));Debug.locals.put("result", _result);
 }
}Debug.locals.put("txt", _txt);
;
 BA.debugLineNum = 436;BA.debugLine="Return firstChar & result.SubString(1)";
Debug.ShouldStop(524288);
if (true) return RemoteObject.concat(_firstchar,_result.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 438;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("ContainUrl (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,87);
if (RapidSub.canDelegate("containurl")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","containurl", _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 87;BA.debugLine="Public Sub ContainUrl(text As String) As Boolean";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 89;BA.debugLine="text = text.Trim";
Debug.ShouldStop(16777216);
_text = _text.runMethod(true,"trim");Debug.locals.put("text", _text);
 BA.debugLineNum = 91;BA.debugLine="Return text.Contains(\"http://\") Or text.Contains(";
Debug.ShouldStop(67108864);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(".",_text.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("http://")))) || RemoteObject.solveBoolean(".",_text.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("https://")))));
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
public static RemoteObject  _explode(RemoteObject _delimiter,RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("explode (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,353);
if (RapidSub.canDelegate("explode")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","explode", _delimiter, _str);}
Debug.locals.put("delimiter", _delimiter);
Debug.locals.put("str", _str);
 BA.debugLineNum = 353;BA.debugLine="Public Sub explode(delimiter As String ,  str As S";
Debug.ShouldStop(1);
 BA.debugLineNum = 355;BA.debugLine="Return Split(str, delimiter)";
Debug.ShouldStop(4);
if (true) return _split(_str,_delimiter);
 BA.debugLineNum = 357;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("generatePinCode (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,263);
if (RapidSub.canDelegate("generatepincode")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","generatepincode", _pinlength);}
RemoteObject _result = RemoteObject.createImmutable("");
RemoteObject _randomarray = null;
int _i = 0;
Debug.locals.put("PinLength", _pinlength);
 BA.debugLineNum = 263;BA.debugLine="Public Sub generatePinCode(PinLength As Int) As I";
Debug.ShouldStop(64);
 BA.debugLineNum = 265;BA.debugLine="Dim result As String =\"\"";
Debug.ShouldStop(256);
_result = BA.ObjectToString("");Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 266;BA.debugLine="Dim RandomArray() As String = Array As String(1,2";
Debug.ShouldStop(512);
_randomarray = RemoteObject.createNewArray("String",new int[] {10},new Object[] {BA.NumberToString(1),BA.NumberToString(2),BA.NumberToString(3),BA.NumberToString(4),BA.NumberToString(5),BA.NumberToString(6),BA.NumberToString(7),BA.NumberToString(8),BA.NumberToString(9),BA.NumberToString(0)});Debug.locals.put("RandomArray", _randomarray);Debug.locals.put("RandomArray", _randomarray);
 BA.debugLineNum = 268;BA.debugLine="For i = 0 To PinLength - 1";
Debug.ShouldStop(2048);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_pinlength,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 270;BA.debugLine="result = result &  RandomArray( Rnd( 0, Rnd(2, R";
Debug.ShouldStop(8192);
_result = RemoteObject.concat(_result,_randomarray.getArrayElement(true,stringutility.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(stringutility.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 2)),(Object)(RemoteObject.solve(new RemoteObject[] {_randomarray.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1)))))));Debug.locals.put("result", _result);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 274;BA.debugLine="Return  result";
Debug.ShouldStop(131072);
if (true) return BA.numberCast(int.class, _result);
 BA.debugLineNum = 276;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("generateRandomString (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,225);
if (RapidSub.canDelegate("generaterandomstring")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","generaterandomstring", _strlength);}
RemoteObject _rndstring = RemoteObject.createImmutable("");
RemoteObject _rndnumber = RemoteObject.createImmutable(0);
Debug.locals.put("StrLength", _strlength);
 BA.debugLineNum = 225;BA.debugLine="Public Sub generateRandomString(StrLength As Int)";
Debug.ShouldStop(1);
 BA.debugLineNum = 226;BA.debugLine="Dim RndString As String";
Debug.ShouldStop(2);
_rndstring = RemoteObject.createImmutable("");Debug.locals.put("RndString", _rndstring);
 BA.debugLineNum = 227;BA.debugLine="Dim RndNumber As Int";
Debug.ShouldStop(4);
_rndnumber = RemoteObject.createImmutable(0);Debug.locals.put("RndNumber", _rndnumber);
 BA.debugLineNum = 228;BA.debugLine="Do While RndString.Length < StrLength";
Debug.ShouldStop(8);
while (RemoteObject.solveBoolean("<",_rndstring.runMethod(true,"length"),BA.numberCast(double.class, _strlength))) {
 BA.debugLineNum = 229;BA.debugLine="RndNumber = Rnd(48,123) 'Yep, 123, because the l";
Debug.ShouldStop(16);
_rndnumber = stringutility.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 48)),(Object)(BA.numberCast(int.class, 123)));Debug.locals.put("RndNumber", _rndnumber);
 BA.debugLineNum = 230;BA.debugLine="If (RndNumber >= 48 And RndNumber <= 57) Or (Rnd";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_rndnumber,BA.numberCast(double.class, 48)) && RemoteObject.solveBoolean("k",_rndnumber,BA.numberCast(double.class, 57))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_rndnumber,BA.numberCast(double.class, 65)) && RemoteObject.solveBoolean("k",_rndnumber,BA.numberCast(double.class, 90))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_rndnumber,BA.numberCast(double.class, 97)) && RemoteObject.solveBoolean("k",_rndnumber,BA.numberCast(double.class, 112)))))) { 
 BA.debugLineNum = 231;BA.debugLine="RndString = RndString & Chr(RndNumber)";
Debug.ShouldStop(64);
_rndstring = RemoteObject.concat(_rndstring,stringutility.__c.runMethod(true,"Chr",(Object)(_rndnumber)));Debug.locals.put("RndString", _rndstring);
 };
 }
;
 BA.debugLineNum = 234;BA.debugLine="Return RndString";
Debug.ShouldStop(512);
if (true) return _rndstring;
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("generateRandomString2 (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,242);
if (RapidSub.canDelegate("generaterandomstring2")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","generaterandomstring2", _strlength);}
RemoteObject _randomarray = null;
RemoteObject _result = RemoteObject.createImmutable("");
Debug.locals.put("StrLength", _strlength);
 BA.debugLineNum = 242;BA.debugLine="Public Sub generateRandomString2(StrLength As Int)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 244;BA.debugLine="Dim RandomArray() As String = Array As String(\"!\"";
Debug.ShouldStop(524288);
_randomarray = RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.ObjectToString("!"),BA.ObjectToString("@"),BA.ObjectToString("#"),BA.ObjectToString("$"),RemoteObject.createImmutable("%")});Debug.locals.put("RandomArray", _randomarray);Debug.locals.put("RandomArray", _randomarray);
 BA.debugLineNum = 245;BA.debugLine="Dim result As String";
Debug.ShouldStop(1048576);
_result = RemoteObject.createImmutable("");Debug.locals.put("result", _result);
 BA.debugLineNum = 248;BA.debugLine="result =  StringArray2String(shuffleArray(RandomA";
Debug.ShouldStop(8388608);
_result = _stringarray2string(_shufflearray(_randomarray));Debug.locals.put("result", _result);
 BA.debugLineNum = 249;BA.debugLine="result = result  & generateRandomString( Floor( S";
Debug.ShouldStop(16777216);
_result = RemoteObject.concat(_result,_generaterandomstring(BA.numberCast(int.class, stringutility.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {_strlength,RemoteObject.createImmutable(2)}, "/",0, 0))))));Debug.locals.put("result", _result);
 BA.debugLineNum = 250;BA.debugLine="result = result  & StringArray2String(shuffleArra";
Debug.ShouldStop(33554432);
_result = RemoteObject.concat(_result,_stringarray2string(_shufflearray(_randomarray)));Debug.locals.put("result", _result);
 BA.debugLineNum = 251;BA.debugLine="result = result  & generateRandomString( Floor( S";
Debug.ShouldStop(67108864);
_result = RemoteObject.concat(_result,_generaterandomstring(BA.numberCast(int.class, stringutility.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {_strlength,RemoteObject.createImmutable(2)}, "/",0, 0))))));Debug.locals.put("result", _result);
 BA.debugLineNum = 254;BA.debugLine="Return  result.SubString2( result.Length - StrLen";
Debug.ShouldStop(536870912);
if (true) return _result.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_result.runMethod(true,"length"),_strlength}, "-",1, 1)),(Object)(_result.runMethod(true,"length")));
 BA.debugLineNum = 256;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("humanize (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,450);
if (RapidSub.canDelegate("humanize")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","humanize", _str, _separator);}
Debug.locals.put("str", _str);
Debug.locals.put("separator", _separator);
 BA.debugLineNum = 450;BA.debugLine="Public Sub humanize(str As String, separator As St";
Debug.ShouldStop(2);
 BA.debugLineNum = 452;BA.debugLine="str= str.ToLowerCase";
Debug.ShouldStop(8);
_str = _str.runMethod(true,"toLowerCase");Debug.locals.put("str", _str);
 BA.debugLineNum = 453;BA.debugLine="Return ucwords(str.Replace(separator, \" \"))";
Debug.ShouldStop(16);
if (true) return _ucwords(_str.runMethod(true,"replace",(Object)(_separator),(Object)(RemoteObject.createImmutable(" "))));
 BA.debugLineNum = 455;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("implode (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,360);
if (RapidSub.canDelegate("implode")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","implode", _separator, _strlist);}
RemoteObject _result = RemoteObject.createImmutable("");
RemoteObject _str = RemoteObject.createImmutable("");
Debug.locals.put("separator", _separator);
Debug.locals.put("StrList", _strlist);
 BA.debugLineNum = 360;BA.debugLine="Public Sub implode(separator As String, StrList As";
Debug.ShouldStop(128);
 BA.debugLineNum = 361;BA.debugLine="Dim result As String =\"\"";
Debug.ShouldStop(256);
_result = BA.ObjectToString("");Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 363;BA.debugLine="For Each str As String In StrList 'an array";
Debug.ShouldStop(1024);
{
final RemoteObject group2 = _strlist;
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_str = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("str", _str);
Debug.locals.put("str", _str);
 BA.debugLineNum = 364;BA.debugLine="result = result & str & separator";
Debug.ShouldStop(2048);
_result = RemoteObject.concat(_result,_str,_separator);Debug.locals.put("result", _result);
 }
}Debug.locals.put("str", _str);
;
 BA.debugLineNum = 367;BA.debugLine="Return trim_once(result, separator) ' trim separa";
Debug.ShouldStop(16384);
if (true) return _trim_once(_result,_separator);
 BA.debugLineNum = 369;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("increment_string (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,303);
if (RapidSub.canDelegate("increment_string")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","increment_string", _str, _separator, _first);}
RemoteObject _parsed_str = RemoteObject.createImmutable("");
RemoteObject _foundint = RemoteObject.createImmutable("");
RemoteObject _indexofseperator = RemoteObject.createImmutable(0);
RemoteObject _foundlong = RemoteObject.createImmutable(0L);
Debug.locals.put("str", _str);
Debug.locals.put("separator", _separator);
Debug.locals.put("first", _first);
 BA.debugLineNum = 303;BA.debugLine="Public Sub increment_string(str As String, separat";
Debug.ShouldStop(16384);
 BA.debugLineNum = 305;BA.debugLine="Dim parsed_str, foundInt As String =\"\"";
Debug.ShouldStop(65536);
_parsed_str = RemoteObject.createImmutable("");Debug.locals.put("parsed_str", _parsed_str);
_foundint = BA.ObjectToString("");Debug.locals.put("foundInt", _foundint);Debug.locals.put("foundInt", _foundint);
 BA.debugLineNum = 306;BA.debugLine="Dim IndexOfSeperator  As Int = 0";
Debug.ShouldStop(131072);
_indexofseperator = BA.numberCast(int.class, 0);Debug.locals.put("IndexOfSeperator", _indexofseperator);Debug.locals.put("IndexOfSeperator", _indexofseperator);
 BA.debugLineNum = 308;BA.debugLine="IndexOfSeperator = str.LastIndexOf(separator)  'f";
Debug.ShouldStop(524288);
_indexofseperator = _str.runMethod(true,"lastIndexOf",(Object)(_separator));Debug.locals.put("IndexOfSeperator", _indexofseperator);
 BA.debugLineNum = 310;BA.debugLine="If  IndexOfSeperator <> 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("!",_indexofseperator,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 313;BA.debugLine="foundInt = str.SubString((IndexOfSeperator +1)";
Debug.ShouldStop(16777216);
_foundint = _str.runMethod(true,"substring",(Object)((RemoteObject.solve(new RemoteObject[] {_indexofseperator,RemoteObject.createImmutable(1)}, "+",1, 1))));Debug.locals.put("foundInt", _foundint);
 BA.debugLineNum = 317;BA.debugLine="If IsNumber(foundInt) Then";
Debug.ShouldStop(268435456);
if (stringutility.__c.runMethod(true,"IsNumber",(Object)(_foundint)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 319;BA.debugLine="parsed_str = str.SubString2(0 , IndexOfSeperato";
Debug.ShouldStop(1073741824);
_parsed_str = _str.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_indexofseperator));Debug.locals.put("parsed_str", _parsed_str);
 BA.debugLineNum = 324;BA.debugLine="Dim foundLong As Long = (foundInt + 1)";
Debug.ShouldStop(8);
_foundlong = BA.numberCast(long.class, (RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _foundint),RemoteObject.createImmutable(1)}, "+",1, 0)));Debug.locals.put("foundLong", _foundlong);Debug.locals.put("foundLong", _foundlong);
 BA.debugLineNum = 326;BA.debugLine="Return parsed_str & separator & foundLong";
Debug.ShouldStop(32);
if (true) return RemoteObject.concat(_parsed_str,_separator,_foundlong);
 }else {
 BA.debugLineNum = 331;BA.debugLine="Return str & separator & first";
Debug.ShouldStop(1024);
if (true) return RemoteObject.concat(_str,_separator,_first);
 };
 }else {
 BA.debugLineNum = 338;BA.debugLine="Return str & separator & first";
Debug.ShouldStop(131072);
if (true) return RemoteObject.concat(_str,_separator,_first);
 };
 BA.debugLineNum = 342;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("IsEmail (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,23);
if (RapidSub.canDelegate("isemail")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","isemail", _emailaddress);}
RemoteObject _matchemail = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
Debug.locals.put("EmailAddress", _emailaddress);
 BA.debugLineNum = 23;BA.debugLine="Public Sub IsEmail(EmailAddress As String) As Bool";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 25;BA.debugLine="Dim MatchEmail As Matcher = Regex.Matcher(\"^(?i)[";
Debug.ShouldStop(16777216);
_matchemail = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
_matchemail = stringutility.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$")),(Object)(_emailaddress));Debug.locals.put("MatchEmail", _matchemail);Debug.locals.put("MatchEmail", _matchemail);
 BA.debugLineNum = 27;BA.debugLine="If MatchEmail.Find = True Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_matchemail.runMethod(true,"Find"),stringutility.__c.getField(true,"True"))) { 
 BA.debugLineNum = 28;BA.debugLine="Return True";
Debug.ShouldStop(134217728);
if (true) return stringutility.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 30;BA.debugLine="Return False";
Debug.ShouldStop(536870912);
if (true) return stringutility.__c.getField(true,"False");
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
		Debug.PushSubsStack("isEmpty (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,15);
if (RapidSub.canDelegate("isempty")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","isempty", _str);}
Debug.locals.put("str", _str);
 BA.debugLineNum = 15;BA.debugLine="Public Sub isEmpty(str As String) As Boolean";
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
		Debug.PushSubsStack("IsLetter (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,54);
if (RapidSub.canDelegate("isletter")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","isletter", _c);}
RemoteObject _pattern = RemoteObject.createImmutable("");
Debug.locals.put("c", _c);
 BA.debugLineNum = 54;BA.debugLine="Public Sub IsLetter (c As String) As Boolean";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 56;BA.debugLine="Dim pattern As String = \"\\p{Alpha}\"";
Debug.ShouldStop(8388608);
_pattern = BA.ObjectToString("\\p{Alpha}");Debug.locals.put("pattern", _pattern);Debug.locals.put("pattern", _pattern);
 BA.debugLineNum = 57;BA.debugLine="If IsDevTool(\"B4J\") Then pattern = \"(?U)\" & patte";
Debug.ShouldStop(16777216);
if (stringutility.__c.runMethod(true,"IsDevTool",(Object)(RemoteObject.createImmutable("B4J"))).<Boolean>get().booleanValue()) { 
_pattern = RemoteObject.concat(RemoteObject.createImmutable("(?U)"),_pattern);Debug.locals.put("pattern", _pattern);};
 BA.debugLineNum = 59;BA.debugLine="Return Regex.IsMatch(pattern, c)";
Debug.ShouldStop(67108864);
if (true) return stringutility.__c.getField(false,"Regex").runMethod(true,"IsMatch",(Object)(_pattern),(Object)(_c));
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
		Debug.PushSubsStack("IsLetters (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,65);
if (RapidSub.canDelegate("isletters")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","isletters", _text);}
RemoteObject _pattern = RemoteObject.createImmutable("");
Debug.locals.put("text", _text);
 BA.debugLineNum = 65;BA.debugLine="Public Sub IsLetters (text As String) As Boolean";
Debug.ShouldStop(1);
 BA.debugLineNum = 67;BA.debugLine="Dim pattern As String = \"\\p{Alpha}+\"";
Debug.ShouldStop(4);
_pattern = BA.ObjectToString("\\p{Alpha}+");Debug.locals.put("pattern", _pattern);Debug.locals.put("pattern", _pattern);
 BA.debugLineNum = 68;BA.debugLine="If IsDevTool(\"B4J\") Then pattern = \"(?U)\" & patte";
Debug.ShouldStop(8);
if (stringutility.__c.runMethod(true,"IsDevTool",(Object)(RemoteObject.createImmutable("B4J"))).<Boolean>get().booleanValue()) { 
_pattern = RemoteObject.concat(RemoteObject.createImmutable("(?U)"),_pattern);Debug.locals.put("pattern", _pattern);};
 BA.debugLineNum = 70;BA.debugLine="Return Regex.IsMatch(pattern, text)";
Debug.ShouldStop(32);
if (true) return stringutility.__c.getField(false,"Regex").runMethod(true,"IsMatch",(Object)(_pattern),(Object)(_text));
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
		Debug.PushSubsStack("isNull (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,8);
if (RapidSub.canDelegate("isnull")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","isnull", _obj);}
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 8;BA.debugLine="Public Sub isNull(obj As Object) As Boolean";
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
		Debug.PushSubsStack("isUrl (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,77);
if (RapidSub.canDelegate("isurl")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","isurl", _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 77;BA.debugLine="Public Sub isUrl (text As String) As Boolean";
Debug.ShouldStop(4096);
 BA.debugLineNum = 79;BA.debugLine="text = text.Trim";
Debug.ShouldStop(16384);
_text = _text.runMethod(true,"trim");Debug.locals.put("text", _text);
 BA.debugLineNum = 81;BA.debugLine="Return text.StartsWith(\"http://\") Or text.StartsW";
Debug.ShouldStop(65536);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(".",_text.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("http://")))) || RemoteObject.solveBoolean(".",_text.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("https://")))));
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("IsValidIp (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,37);
if (RapidSub.canDelegate("isvalidip")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","isvalidip", _ip);}
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
_m = stringutility.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$")),(Object)(_ip));Debug.locals.put("m", _m);
 BA.debugLineNum = 42;BA.debugLine="If m.Find = False Then Return False";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_m.runMethod(true,"Find"),stringutility.__c.getField(true,"False"))) { 
if (true) return stringutility.__c.getField(true,"False");};
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
if (true) return stringutility.__c.getField(true,"False");};
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 48;BA.debugLine="Return True";
Debug.ShouldStop(32768);
if (true) return stringutility.__c.getField(true,"True");
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
		Debug.PushSubsStack("join (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,373);
if (RapidSub.canDelegate("join")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","join", _strlist, _separator);}
Debug.locals.put("StrList", _strlist);
Debug.locals.put("separator", _separator);
 BA.debugLineNum = 373;BA.debugLine="Public Sub join(StrList As List,separator As Strin";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 375;BA.debugLine="Return implode(separator, StrList)";
Debug.ShouldStop(4194304);
if (true) return _implode(_separator,_strlist);
 BA.debugLineNum = 377;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("lcfirst (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,409);
if (RapidSub.canDelegate("lcfirst")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","lcfirst", _str);}
RemoteObject _firstchar = RemoteObject.createImmutable("");
Debug.locals.put("str", _str);
 BA.debugLineNum = 409;BA.debugLine="Public Sub lcfirst(str As String) As String";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 411;BA.debugLine="Dim firstChar As String =\"\"";
Debug.ShouldStop(67108864);
_firstchar = BA.ObjectToString("");Debug.locals.put("firstChar", _firstchar);Debug.locals.put("firstChar", _firstchar);
 BA.debugLineNum = 412;BA.debugLine="firstChar= str.CharAt(0)";
Debug.ShouldStop(134217728);
_firstchar = BA.ObjectToString(_str.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("firstChar", _firstchar);
 BA.debugLineNum = 413;BA.debugLine="firstChar = firstChar.ToLowerCase";
Debug.ShouldStop(268435456);
_firstchar = _firstchar.runMethod(true,"toLowerCase");Debug.locals.put("firstChar", _firstchar);
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
public static RemoteObject  _prep_url(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("prep_url (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,458);
if (RapidSub.canDelegate("prep_url")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","prep_url", _str);}
Debug.locals.put("str", _str);
 BA.debugLineNum = 458;BA.debugLine="Public Sub prep_url(str As String)  As String";
Debug.ShouldStop(512);
 BA.debugLineNum = 460;BA.debugLine="str= str.Trim";
Debug.ShouldStop(2048);
_str = _str.runMethod(true,"trim");Debug.locals.put("str", _str);
 BA.debugLineNum = 462;BA.debugLine="If isEmpty(str) Or str.EqualsIgnoreCase(\"http://\"";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(".",_isempty(_str)) || RemoteObject.solveBoolean(".",_str.runMethod(true,"equalsIgnoreCase",(Object)(RemoteObject.createImmutable("http://"))))) { 
 BA.debugLineNum = 464;BA.debugLine="Return  \"\"";
Debug.ShouldStop(32768);
if (true) return BA.ObjectToString("");
 }else {
 BA.debugLineNum = 468;BA.debugLine="If Not(str.StartsWith(\"http://\")) Then";
Debug.ShouldStop(524288);
if (stringutility.__c.runMethod(true,"Not",(Object)(_str.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("http://"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 470;BA.debugLine="Return \"http://\" & str";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("http://"),_str);
 }else {
 BA.debugLineNum = 474;BA.debugLine="Return str";
Debug.ShouldStop(33554432);
if (true) return _str;
 };
 };
 BA.debugLineNum = 480;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
stringutility._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _quotes_to_entities(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("quotes_to_entities (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,164);
if (RapidSub.canDelegate("quotes_to_entities")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","quotes_to_entities", _str);}
Debug.locals.put("str", _str);
 BA.debugLineNum = 164;BA.debugLine="Public Sub quotes_to_entities(str As String) As St";
Debug.ShouldStop(8);
 BA.debugLineNum = 166;BA.debugLine="str = str.Replace(\"\\'\", \"&#39;\")";
Debug.ShouldStop(32);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString("\\'")),(Object)(RemoteObject.createImmutable("&#39;")));Debug.locals.put("str", _str);
 BA.debugLineNum = 167;BA.debugLine="str = str.Replace(\"\\\"\"\",\"&quot;\")";
Debug.ShouldStop(64);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString("\\\"")),(Object)(RemoteObject.createImmutable("&quot;")));Debug.locals.put("str", _str);
 BA.debugLineNum = 169;BA.debugLine="str = str.Replace(\"'\", \"&#39;\")";
Debug.ShouldStop(256);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString("'")),(Object)(RemoteObject.createImmutable("&#39;")));Debug.locals.put("str", _str);
 BA.debugLineNum = 170;BA.debugLine="str = str.Replace(\"\"\"\",\"&quot;\")";
Debug.ShouldStop(512);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString("\"")),(Object)(RemoteObject.createImmutable("&quot;")));Debug.locals.put("str", _str);
 BA.debugLineNum = 173;BA.debugLine="Return str";
Debug.ShouldStop(4096);
if (true) return _str;
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _reduce_double_slashes(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("reduce_double_slashes (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,181);
if (RapidSub.canDelegate("reduce_double_slashes")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","reduce_double_slashes", _str);}
Debug.locals.put("str", _str);
 BA.debugLineNum = 181;BA.debugLine="Public Sub reduce_double_slashes(str As String) As";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 183;BA.debugLine="If str.ToLowerCase.StartsWith(\"http://\") Then";
Debug.ShouldStop(4194304);
if (_str.runMethod(true,"toLowerCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("http://"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 185;BA.debugLine="str = str.Replace(\"//\" ,\"/\")";
Debug.ShouldStop(16777216);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString("//")),(Object)(RemoteObject.createImmutable("/")));Debug.locals.put("str", _str);
 BA.debugLineNum = 186;BA.debugLine="str =  str.Replace(\"http:/\" ,\"http://\")  'fix ba";
Debug.ShouldStop(33554432);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString("http:/")),(Object)(RemoteObject.createImmutable("http://")));Debug.locals.put("str", _str);
 }else {
 BA.debugLineNum = 190;BA.debugLine="str = str.Replace(\"//\" ,\"/\")";
Debug.ShouldStop(536870912);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString("//")),(Object)(RemoteObject.createImmutable("/")));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 194;BA.debugLine="Return str";
Debug.ShouldStop(2);
if (true) return _str;
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("shuffleArray (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,205);
if (RapidSub.canDelegate("shufflearray")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","shufflearray", _stringarray);}
RemoteObject _arrayval = RemoteObject.createImmutable("");
RemoteObject _random = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("StringArray", _stringarray);
 BA.debugLineNum = 205;BA.debugLine="Public Sub shuffleArray(StringArray() As String) A";
Debug.ShouldStop(4096);
 BA.debugLineNum = 207;BA.debugLine="Dim ArrayVal As String";
Debug.ShouldStop(16384);
_arrayval = RemoteObject.createImmutable("");Debug.locals.put("ArrayVal", _arrayval);
 BA.debugLineNum = 208;BA.debugLine="Dim Random As Int";
Debug.ShouldStop(32768);
_random = RemoteObject.createImmutable(0);Debug.locals.put("Random", _random);
 BA.debugLineNum = 210;BA.debugLine="For i = 0 To StringArray.Length - 1";
Debug.ShouldStop(131072);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_stringarray.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 211;BA.debugLine="Random = Rnd(i, StringArray.Length)";
Debug.ShouldStop(262144);
_random = stringutility.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, _i)),(Object)(_stringarray.getField(true,"length")));Debug.locals.put("Random", _random);
 BA.debugLineNum = 212;BA.debugLine="ArrayVal = StringArray(i)";
Debug.ShouldStop(524288);
_arrayval = _stringarray.getArrayElement(true,BA.numberCast(int.class, _i));Debug.locals.put("ArrayVal", _arrayval);
 BA.debugLineNum = 213;BA.debugLine="StringArray(i) = StringArray(Random)";
Debug.ShouldStop(1048576);
_stringarray.setArrayElement (_stringarray.getArrayElement(true,_random),BA.numberCast(int.class, _i));
 BA.debugLineNum = 214;BA.debugLine="StringArray(Random) = ArrayVal";
Debug.ShouldStop(2097152);
_stringarray.setArrayElement (_arrayval,_random);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 216;BA.debugLine="Return StringArray";
Debug.ShouldStop(8388608);
if (true) return _stringarray;
 BA.debugLineNum = 217;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Split (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,345);
if (RapidSub.canDelegate("split")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","split", _str, _delimiter);}
RemoteObject _t = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("str", _str);
Debug.locals.put("delimiter", _delimiter);
 BA.debugLineNum = 345;BA.debugLine="Sub Split(str As String, delimiter As String) As L";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 346;BA.debugLine="Dim t As List";
Debug.ShouldStop(33554432);
_t = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("t", _t);
 BA.debugLineNum = 347;BA.debugLine="t = Regex.Split(delimiter, str)";
Debug.ShouldStop(67108864);
_t = stringutility.__c.runMethod(false, "ArrayToList", (Object)(stringutility.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(_delimiter),(Object)(_str))));Debug.locals.put("t", _t);
 BA.debugLineNum = 348;BA.debugLine="Return t";
Debug.ShouldStop(134217728);
if (true) return _t;
 BA.debugLineNum = 349;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Sprintf (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,497);
if (RapidSub.canDelegate("sprintf")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","sprintf", _fmt, _arg);}
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
 BA.debugLineNum = 497;BA.debugLine="Public Sub Sprintf(fmt As String, arg() As Object)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 498;BA.debugLine="Dim ai, fi, i As Int";
Debug.ShouldStop(131072);
_ai = RemoteObject.createImmutable(0);Debug.locals.put("ai", _ai);
_fi = RemoteObject.createImmutable(0);Debug.locals.put("fi", _fi);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 499;BA.debugLine="Dim exp, wid As Int";
Debug.ShouldStop(262144);
_exp = RemoteObject.createImmutable(0);Debug.locals.put("exp", _exp);
_wid = RemoteObject.createImmutable(0);Debug.locals.put("wid", _wid);
 BA.debugLineNum = 500;BA.debugLine="Dim stmp, ptmp, sres, c, t As String";
Debug.ShouldStop(524288);
_stmp = RemoteObject.createImmutable("");Debug.locals.put("stmp", _stmp);
_ptmp = RemoteObject.createImmutable("");Debug.locals.put("ptmp", _ptmp);
_sres = RemoteObject.createImmutable("");Debug.locals.put("sres", _sres);
_c = RemoteObject.createImmutable("");Debug.locals.put("c", _c);
_t = RemoteObject.createImmutable("");Debug.locals.put("t", _t);
 BA.debugLineNum = 501;BA.debugLine="Dim bdone As Boolean";
Debug.ShouldStop(1048576);
_bdone = RemoteObject.createImmutable(false);Debug.locals.put("bdone", _bdone);
 BA.debugLineNum = 503;BA.debugLine="ai = 0";
Debug.ShouldStop(4194304);
_ai = BA.numberCast(int.class, 0);Debug.locals.put("ai", _ai);
 BA.debugLineNum = 504;BA.debugLine="fi = 0";
Debug.ShouldStop(8388608);
_fi = BA.numberCast(int.class, 0);Debug.locals.put("fi", _fi);
 BA.debugLineNum = 505;BA.debugLine="stmp = \"\"";
Debug.ShouldStop(16777216);
_stmp = BA.ObjectToString("");Debug.locals.put("stmp", _stmp);
 BA.debugLineNum = 506;BA.debugLine="sres = \"\"";
Debug.ShouldStop(33554432);
_sres = BA.ObjectToString("");Debug.locals.put("sres", _sres);
 BA.debugLineNum = 508;BA.debugLine="Do While (fi < fmt.Length)";
Debug.ShouldStop(134217728);
while ((RemoteObject.solveBoolean("<",_fi,BA.numberCast(double.class, _fmt.runMethod(true,"length"))))) {
 BA.debugLineNum = 509;BA.debugLine="c = fmt.CharAt(fi)";
Debug.ShouldStop(268435456);
_c = BA.ObjectToString(_fmt.runMethod(true,"charAt",(Object)(_fi)));Debug.locals.put("c", _c);
 BA.debugLineNum = 510;BA.debugLine="fi = fi + 1";
Debug.ShouldStop(536870912);
_fi = RemoteObject.solve(new RemoteObject[] {_fi,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("fi", _fi);
 BA.debugLineNum = 512;BA.debugLine="If (c = \"%\") Then";
Debug.ShouldStop(-2147483648);
if ((RemoteObject.solveBoolean("=",_c,RemoteObject.createImmutable("%")))) { 
 BA.debugLineNum = 513;BA.debugLine="stmp = \"\"";
Debug.ShouldStop(1);
_stmp = BA.ObjectToString("");Debug.locals.put("stmp", _stmp);
 BA.debugLineNum = 514;BA.debugLine="ptmp = \"\"";
Debug.ShouldStop(2);
_ptmp = BA.ObjectToString("");Debug.locals.put("ptmp", _ptmp);
 BA.debugLineNum = 515;BA.debugLine="bdone = False";
Debug.ShouldStop(4);
_bdone = stringutility.__c.getField(true,"False");Debug.locals.put("bdone", _bdone);
 BA.debugLineNum = 517;BA.debugLine="Do While ((fi < fmt.Length) And (bdone = False)";
Debug.ShouldStop(16);
while ((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("<",_fi,BA.numberCast(double.class, _fmt.runMethod(true,"length")))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_bdone,stringutility.__c.getField(true,"False"))))))) {
 BA.debugLineNum = 518;BA.debugLine="c = fmt.CharAt(fi)";
Debug.ShouldStop(32);
_c = BA.ObjectToString(_fmt.runMethod(true,"charAt",(Object)(_fi)));Debug.locals.put("c", _c);
 BA.debugLineNum = 519;BA.debugLine="fi = fi + 1";
Debug.ShouldStop(64);
_fi = RemoteObject.solve(new RemoteObject[] {_fi,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("fi", _fi);
 BA.debugLineNum = 521;BA.debugLine="If ((IsNumber(c) = True) Or (c = \".\")) Then";
Debug.ShouldStop(256);
if ((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",stringutility.__c.runMethod(true,"IsNumber",(Object)(_c)),stringutility.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_c,RemoteObject.createImmutable("."))))))) { 
 BA.debugLineNum = 522;BA.debugLine="ptmp = ptmp & c";
Debug.ShouldStop(512);
_ptmp = RemoteObject.concat(_ptmp,_c);Debug.locals.put("ptmp", _ptmp);
 BA.debugLineNum = 523;BA.debugLine="bdone = False";
Debug.ShouldStop(1024);
_bdone = stringutility.__c.getField(true,"False");Debug.locals.put("bdone", _bdone);
 }else 
{ BA.debugLineNum = 524;BA.debugLine="Else If (c = \"s\") Then";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean("=",_c,RemoteObject.createImmutable("s")))) { 
 BA.debugLineNum = 525;BA.debugLine="stmp = arg(ai)";
Debug.ShouldStop(4096);
_stmp = BA.ObjectToString(_arg.getArrayElement(false,_ai));Debug.locals.put("stmp", _stmp);
 BA.debugLineNum = 526;BA.debugLine="ai = ai + 1";
Debug.ShouldStop(8192);
_ai = RemoteObject.solve(new RemoteObject[] {_ai,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ai", _ai);
 BA.debugLineNum = 527;BA.debugLine="sres = sres & stmp";
Debug.ShouldStop(16384);
_sres = RemoteObject.concat(_sres,_stmp);Debug.locals.put("sres", _sres);
 BA.debugLineNum = 528;BA.debugLine="bdone = True";
Debug.ShouldStop(32768);
_bdone = stringutility.__c.getField(true,"True");Debug.locals.put("bdone", _bdone);
 }else 
{ BA.debugLineNum = 529;BA.debugLine="Else If (c = \"d\") Then";
Debug.ShouldStop(65536);
if ((RemoteObject.solveBoolean("=",_c,RemoteObject.createImmutable("d")))) { 
 BA.debugLineNum = 530;BA.debugLine="If (ptmp.Length > 0) Then";
Debug.ShouldStop(131072);
if ((RemoteObject.solveBoolean(">",_ptmp.runMethod(true,"length"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 531;BA.debugLine="t = \" \"";
Debug.ShouldStop(262144);
_t = BA.ObjectToString(" ");Debug.locals.put("t", _t);
 BA.debugLineNum = 532;BA.debugLine="If (ptmp.CharAt(0) = \"0\") Then";
Debug.ShouldStop(524288);
if ((RemoteObject.solveBoolean("=",_ptmp.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, 0))),BA.ObjectToChar(RemoteObject.createImmutable("0"))))) { 
 BA.debugLineNum = 533;BA.debugLine="t = \"0\"";
Debug.ShouldStop(1048576);
_t = BA.ObjectToString("0");Debug.locals.put("t", _t);
 BA.debugLineNum = 534;BA.debugLine="ptmp = ptmp.SubString(1)";
Debug.ShouldStop(2097152);
_ptmp = _ptmp.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("ptmp", _ptmp);
 };
 };
 BA.debugLineNum = 538;BA.debugLine="If (ptmp.Length > 0) Then wid = ptmp Else wid";
Debug.ShouldStop(33554432);
if ((RemoteObject.solveBoolean(">",_ptmp.runMethod(true,"length"),BA.numberCast(double.class, 0)))) { 
_wid = BA.numberCast(int.class, _ptmp);Debug.locals.put("wid", _wid);}
else {
_wid = BA.numberCast(int.class, 0);Debug.locals.put("wid", _wid);};
 BA.debugLineNum = 540;BA.debugLine="stmp = arg(ai)";
Debug.ShouldStop(134217728);
_stmp = BA.ObjectToString(_arg.getArrayElement(false,_ai));Debug.locals.put("stmp", _stmp);
 BA.debugLineNum = 542;BA.debugLine="Do While (stmp.Length < wid)";
Debug.ShouldStop(536870912);
while ((RemoteObject.solveBoolean("<",_stmp.runMethod(true,"length"),BA.numberCast(double.class, _wid)))) {
 BA.debugLineNum = 543;BA.debugLine="stmp = t & stmp";
Debug.ShouldStop(1073741824);
_stmp = RemoteObject.concat(_t,_stmp);Debug.locals.put("stmp", _stmp);
 }
;
 BA.debugLineNum = 546;BA.debugLine="ai = ai + 1";
Debug.ShouldStop(2);
_ai = RemoteObject.solve(new RemoteObject[] {_ai,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ai", _ai);
 BA.debugLineNum = 547;BA.debugLine="sres = sres & stmp";
Debug.ShouldStop(4);
_sres = RemoteObject.concat(_sres,_stmp);Debug.locals.put("sres", _sres);
 BA.debugLineNum = 548;BA.debugLine="bdone = True";
Debug.ShouldStop(8);
_bdone = stringutility.__c.getField(true,"True");Debug.locals.put("bdone", _bdone);
 }else 
{ BA.debugLineNum = 549;BA.debugLine="Else If (c = \"f\") Then";
Debug.ShouldStop(16);
if ((RemoteObject.solveBoolean("=",_c,RemoteObject.createImmutable("f")))) { 
 BA.debugLineNum = 550;BA.debugLine="If (ptmp.Length > 0) Then";
Debug.ShouldStop(32);
if ((RemoteObject.solveBoolean(">",_ptmp.runMethod(true,"length"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 551;BA.debugLine="i = ptmp.IndexOf(\".\")";
Debug.ShouldStop(64);
_i = _ptmp.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable(".")));Debug.locals.put("i", _i);
 BA.debugLineNum = 552;BA.debugLine="If (i >= 0) Then";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean("g",_i,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 553;BA.debugLine="wid = ptmp.SubString2(0, i)";
Debug.ShouldStop(256);
_wid = BA.numberCast(int.class, _ptmp.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_i)));Debug.locals.put("wid", _wid);
 BA.debugLineNum = 554;BA.debugLine="exp = ptmp.SubString(i+1)";
Debug.ShouldStop(512);
_exp = BA.numberCast(int.class, _ptmp.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1))));Debug.locals.put("exp", _exp);
 }else {
 BA.debugLineNum = 556;BA.debugLine="wid = ptmp";
Debug.ShouldStop(2048);
_wid = BA.numberCast(int.class, _ptmp);Debug.locals.put("wid", _wid);
 BA.debugLineNum = 557;BA.debugLine="exp = 0";
Debug.ShouldStop(4096);
_exp = BA.numberCast(int.class, 0);Debug.locals.put("exp", _exp);
 };
 BA.debugLineNum = 560;BA.debugLine="stmp = NumberFormat(arg(ai), wid, exp)";
Debug.ShouldStop(32768);
_stmp = stringutility.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _arg.getArrayElement(false,_ai))),(Object)(_wid),(Object)(_exp));Debug.locals.put("stmp", _stmp);
 }else {
 BA.debugLineNum = 562;BA.debugLine="stmp = arg(ai)";
Debug.ShouldStop(131072);
_stmp = BA.ObjectToString(_arg.getArrayElement(false,_ai));Debug.locals.put("stmp", _stmp);
 };
 BA.debugLineNum = 565;BA.debugLine="ai = ai + 1";
Debug.ShouldStop(1048576);
_ai = RemoteObject.solve(new RemoteObject[] {_ai,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ai", _ai);
 BA.debugLineNum = 566;BA.debugLine="sres = sres & stmp";
Debug.ShouldStop(2097152);
_sres = RemoteObject.concat(_sres,_stmp);Debug.locals.put("sres", _sres);
 BA.debugLineNum = 567;BA.debugLine="bdone = True";
Debug.ShouldStop(4194304);
_bdone = stringutility.__c.getField(true,"True");Debug.locals.put("bdone", _bdone);
 }else {
 BA.debugLineNum = 569;BA.debugLine="ai = ai + 1";
Debug.ShouldStop(16777216);
_ai = RemoteObject.solve(new RemoteObject[] {_ai,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ai", _ai);
 }}}}
;
 }
;
 }else {
 BA.debugLineNum = 574;BA.debugLine="sres = sres & c";
Debug.ShouldStop(536870912);
_sres = RemoteObject.concat(_sres,_c);Debug.locals.put("sres", _sres);
 };
 }
;
 BA.debugLineNum = 578;BA.debugLine="Return(sres)";
Debug.ShouldStop(2);
if (true) return (_sres);
 BA.debugLineNum = 580;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("str_repeat (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,660);
if (RapidSub.canDelegate("str_repeat")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","str_repeat", _input, _multiplier);}
RemoteObject _result = RemoteObject.createImmutable("");
int _i = 0;
Debug.locals.put("input", _input);
Debug.locals.put("multiplier", _multiplier);
 BA.debugLineNum = 660;BA.debugLine="Sub str_repeat(input As String, multiplier As Int)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 662;BA.debugLine="If multiplier < 1 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("<",_multiplier,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 664;BA.debugLine="Return \"\"";
Debug.ShouldStop(8388608);
if (true) return BA.ObjectToString("");
 }else {
 BA.debugLineNum = 668;BA.debugLine="Dim result As String = \"\"";
Debug.ShouldStop(134217728);
_result = BA.ObjectToString("");Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 670;BA.debugLine="For i = 0 To multiplier - 1";
Debug.ShouldStop(536870912);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_multiplier,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 672;BA.debugLine="result = result & input";
Debug.ShouldStop(-2147483648);
_result = RemoteObject.concat(_result,_input);Debug.locals.put("result", _result);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 676;BA.debugLine="Return result";
Debug.ShouldStop(8);
if (true) return _result;
 };
 BA.debugLineNum = 680;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("str_split (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,738);
if (RapidSub.canDelegate("str_split")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","str_split", _str, _splitlength);}
RemoteObject _chunks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _divval = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _nextval = RemoteObject.createImmutable(0);
Debug.locals.put("str", _str);
Debug.locals.put("splitLength", _splitlength);
 BA.debugLineNum = 738;BA.debugLine="Public Sub str_split (str As String, splitLength A";
Debug.ShouldStop(2);
 BA.debugLineNum = 740;BA.debugLine="Dim chunks As List";
Debug.ShouldStop(8);
_chunks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("chunks", _chunks);
 BA.debugLineNum = 741;BA.debugLine="chunks.Initialize";
Debug.ShouldStop(16);
_chunks.runVoidMethod ("Initialize");
 BA.debugLineNum = 743;BA.debugLine="If (isEmpty(str) Or splitLength < 1)  Then";
Debug.ShouldStop(64);
if ((RemoteObject.solveBoolean(".",_isempty(_str)) || RemoteObject.solveBoolean("<",_splitlength,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 745;BA.debugLine="Return chunks 'empty list";
Debug.ShouldStop(256);
if (true) return _chunks;
 }else 
{ BA.debugLineNum = 747;BA.debugLine="Else If  splitLength = str.Length Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_splitlength,BA.numberCast(double.class, _str.runMethod(true,"length")))) { 
 BA.debugLineNum = 749;BA.debugLine="chunks.Add(str)";
Debug.ShouldStop(4096);
_chunks.runVoidMethod ("Add",(Object)((_str)));
 BA.debugLineNum = 750;BA.debugLine="Return chunks";
Debug.ShouldStop(8192);
if (true) return _chunks;
 }}
;
 BA.debugLineNum = 754;BA.debugLine="Dim DivVal As Int  =  str.Length / splitLength";
Debug.ShouldStop(131072);
_divval = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_str.runMethod(true,"length"),_splitlength}, "/",0, 0));Debug.locals.put("DivVal", _divval);Debug.locals.put("DivVal", _divval);
 BA.debugLineNum = 756;BA.debugLine="For i = 0 To DivVal";
Debug.ShouldStop(524288);
{
final int step10 = 1;
final int limit10 = _divval.<Integer>get().intValue();
_i = 0 ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 758;BA.debugLine="Dim nextVal As Int = i * splitLength";
Debug.ShouldStop(2097152);
_nextval = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_splitlength}, "*",0, 1);Debug.locals.put("nextVal", _nextval);Debug.locals.put("nextVal", _nextval);
 BA.debugLineNum = 760;BA.debugLine="If i = DivVal Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, _divval))) { 
 BA.debugLineNum = 763;BA.debugLine="chunks.add( str.SubString( nextVal))";
Debug.ShouldStop(67108864);
_chunks.runVoidMethod ("Add",(Object)((_str.runMethod(true,"substring",(Object)(_nextval)))));
 }else {
 BA.debugLineNum = 768;BA.debugLine="chunks.add( str.SubString2( nextVal , nextVal +";
Debug.ShouldStop(-2147483648);
_chunks.runVoidMethod ("Add",(Object)((_str.runMethod(true,"substring",(Object)(_nextval),(Object)(RemoteObject.solve(new RemoteObject[] {_nextval,_splitlength}, "+",1, 1))))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 774;BA.debugLine="Return chunks";
Debug.ShouldStop(32);
if (true) return _chunks;
 BA.debugLineNum = 776;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("String2Ascii (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,647);
if (RapidSub.canDelegate("string2ascii")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","string2ascii", _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 647;BA.debugLine="Public Sub String2Ascii(text As String) As String";
Debug.ShouldStop(64);
 BA.debugLineNum = 650;BA.debugLine="Return String2AsciiWithSeperator(text, \"\")";
Debug.ShouldStop(512);
if (true) return _string2asciiwithseperator(_text,RemoteObject.createImmutable(""));
 BA.debugLineNum = 652;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("String2AsciiWithSeperator (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,631);
if (RapidSub.canDelegate("string2asciiwithseperator")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","string2asciiwithseperator", _text, _seperator);}
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
Debug.locals.put("text", _text);
Debug.locals.put("seperator", _seperator);
 BA.debugLineNum = 631;BA.debugLine="Public Sub String2AsciiWithSeperator(text As Strin";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 633;BA.debugLine="Dim result As StringBuilder";
Debug.ShouldStop(16777216);
_result = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("result", _result);
 BA.debugLineNum = 634;BA.debugLine="result.Initialize";
Debug.ShouldStop(33554432);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 636;BA.debugLine="For i = 0 To text.Length - 1";
Debug.ShouldStop(134217728);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_text.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 638;BA.debugLine="result.Append(Asc(text.CharAt(i)) & seperator)";
Debug.ShouldStop(536870912);
_result.runVoidMethod ("Append",(Object)(RemoteObject.concat(stringutility.__c.runMethod(true,"Asc",(Object)(_text.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _i))))),_seperator)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 642;BA.debugLine="Return result.ToString.Trim";
Debug.ShouldStop(2);
if (true) return _result.runMethod(true,"ToString").runMethod(true,"trim");
 BA.debugLineNum = 644;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("StringArray2String (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,283);
if (RapidSub.canDelegate("stringarray2string")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","stringarray2string", _strarray);}
RemoteObject _result = RemoteObject.createImmutable("");
RemoteObject _str = RemoteObject.createImmutable("");
Debug.locals.put("StrArray", _strarray);
 BA.debugLineNum = 283;BA.debugLine="Public Sub StringArray2String(StrArray() As String";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 285;BA.debugLine="Dim result As String =\"\"";
Debug.ShouldStop(268435456);
_result = BA.ObjectToString("");Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 286;BA.debugLine="For Each str As String In StrArray 'an array";
Debug.ShouldStop(536870912);
{
final RemoteObject group2 = _strarray;
final int groupLen2 = group2.getField(true,"length").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_str = group2.getArrayElement(true,RemoteObject.createImmutable(index2));Debug.locals.put("str", _str);
Debug.locals.put("str", _str);
 BA.debugLineNum = 287;BA.debugLine="result = result & str";
Debug.ShouldStop(1073741824);
_result = RemoteObject.concat(_result,_str);Debug.locals.put("result", _result);
 }
}Debug.locals.put("str", _str);
;
 BA.debugLineNum = 290;BA.debugLine="Return result";
Debug.ShouldStop(2);
if (true) return _result;
 BA.debugLineNum = 292;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("strip_quotes (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,155);
if (RapidSub.canDelegate("strip_quotes")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","strip_quotes", _str);}
Debug.locals.put("str", _str);
 BA.debugLineNum = 155;BA.debugLine="Public Sub strip_quotes(str As String) As String";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 157;BA.debugLine="str = str.Replace(\"'\", \"\")";
Debug.ShouldStop(268435456);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString("'")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 BA.debugLineNum = 158;BA.debugLine="str = str.Replace(\"\"\"\",\"\")";
Debug.ShouldStop(536870912);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString("\"")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 BA.debugLineNum = 159;BA.debugLine="Return str";
Debug.ShouldStop(1073741824);
if (true) return _str;
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _strpbrk(RemoteObject _haystack,RemoteObject _charlist) throws Exception{
try {
		Debug.PushSubsStack("strpbrk (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,703);
if (RapidSub.canDelegate("strpbrk")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","strpbrk", _haystack, _charlist);}
int _i = 0;
Debug.locals.put("haystack", _haystack);
Debug.locals.put("charList", _charlist);
 BA.debugLineNum = 703;BA.debugLine="Public Sub strpbrk(haystack As String, charList As";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 705;BA.debugLine="For i = 0 To haystack.Length - 1";
Debug.ShouldStop(1);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {_haystack.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 707;BA.debugLine="If charList.IndexOf(haystack.CharAt(i)) >= 0 Th";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("g",_charlist.runMethod(true,"indexOf",(Object)(BA.ObjectToString(_haystack.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _i)))))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 709;BA.debugLine="Return haystack.SubString(i)";
Debug.ShouldStop(16);
if (true) return (_haystack.runMethod(true,"substring",(Object)(BA.numberCast(int.class, _i))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 715;BA.debugLine="Return False";
Debug.ShouldStop(1024);
if (true) return (stringutility.__c.getField(true,"False"));
 BA.debugLineNum = 717;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _strtostrlist(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("strToStrList (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,721);
if (RapidSub.canDelegate("strtostrlist")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","strtostrlist", _str);}
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
Debug.locals.put("str", _str);
 BA.debugLineNum = 721;BA.debugLine="Public Sub strToStrList(str As String) As List";
Debug.ShouldStop(65536);
 BA.debugLineNum = 723;BA.debugLine="Dim result As List";
Debug.ShouldStop(262144);
_result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("result", _result);
 BA.debugLineNum = 724;BA.debugLine="result.Initialize";
Debug.ShouldStop(524288);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 726;BA.debugLine="For i = 0 To str.Length - 1";
Debug.ShouldStop(2097152);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_str.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 728;BA.debugLine="result.Add(str.CharAt(i))";
Debug.ShouldStop(8388608);
_result.runVoidMethod ("Add",(Object)((_str.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 732;BA.debugLine="Return result";
Debug.ShouldStop(134217728);
if (true) return _result;
 BA.debugLineNum = 734;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("trim_left_once (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,108);
if (RapidSub.canDelegate("trim_left_once")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","trim_left_once", _str, _character);}
Debug.locals.put("str", _str);
Debug.locals.put("character", _character);
 BA.debugLineNum = 108;BA.debugLine="Public Sub trim_left_once(str As String, character";
Debug.ShouldStop(2048);
 BA.debugLineNum = 110;BA.debugLine="If isEmpty(character) Then";
Debug.ShouldStop(8192);
if (_isempty(_character).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 112;BA.debugLine="character = \" \" 'empty space";
Debug.ShouldStop(32768);
_character = BA.ObjectToString(" ");Debug.locals.put("character", _character);
 };
 BA.debugLineNum = 116;BA.debugLine="If str.StartsWith(character) Then";
Debug.ShouldStop(524288);
if (_str.runMethod(true,"startsWith",(Object)(_character)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 118;BA.debugLine="str = str.SubString(1)";
Debug.ShouldStop(2097152);
_str = _str.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 122;BA.debugLine="Return str";
Debug.ShouldStop(33554432);
if (true) return _str;
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("trim_once (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,98);
if (RapidSub.canDelegate("trim_once")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","trim_once", _str, _character);}
Debug.locals.put("str", _str);
Debug.locals.put("character", _character);
 BA.debugLineNum = 98;BA.debugLine="Public Sub trim_once(str As String, character As S";
Debug.ShouldStop(2);
 BA.debugLineNum = 100;BA.debugLine="str = trim_left_once(str, character)";
Debug.ShouldStop(8);
_str = _trim_left_once(_str,_character);Debug.locals.put("str", _str);
 BA.debugLineNum = 101;BA.debugLine="str = trim_right_once(str, character)";
Debug.ShouldStop(16);
_str = _trim_right_once(_str,_character);Debug.locals.put("str", _str);
 BA.debugLineNum = 103;BA.debugLine="Return str";
Debug.ShouldStop(64);
if (true) return _str;
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("trim_right_once (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,127);
if (RapidSub.canDelegate("trim_right_once")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","trim_right_once", _str, _character);}
Debug.locals.put("str", _str);
Debug.locals.put("character", _character);
 BA.debugLineNum = 127;BA.debugLine="Public Sub trim_right_once(str As String, characte";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 129;BA.debugLine="If isEmpty(character) Then";
Debug.ShouldStop(1);
if (_isempty(_character).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 131;BA.debugLine="character = \" \" 'empty space";
Debug.ShouldStop(4);
_character = BA.ObjectToString(" ");Debug.locals.put("character", _character);
 };
 BA.debugLineNum = 135;BA.debugLine="If str.EndsWith(character) Then";
Debug.ShouldStop(64);
if (_str.runMethod(true,"endsWith",(Object)(_character)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 137;BA.debugLine="str = str.SubString2(0, str.Length - 1)";
Debug.ShouldStop(256);
_str = _str.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_str.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1)));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 141;BA.debugLine="Return str";
Debug.ShouldStop(4096);
if (true) return _str;
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("trim_slashes_once (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,148);
if (RapidSub.canDelegate("trim_slashes_once")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","trim_slashes_once", _str);}
Debug.locals.put("str", _str);
 BA.debugLineNum = 148;BA.debugLine="Public Sub trim_slashes_once(str As String) As Str";
Debug.ShouldStop(524288);
 BA.debugLineNum = 150;BA.debugLine="Return trim_once( str, \"/\")";
Debug.ShouldStop(2097152);
if (true) return _trim_once(_str,RemoteObject.createImmutable("/"));
 BA.debugLineNum = 152;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ucfirst (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,398);
if (RapidSub.canDelegate("ucfirst")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","ucfirst", _str);}
RemoteObject _firstchar = RemoteObject.createImmutable("");
Debug.locals.put("str", _str);
 BA.debugLineNum = 398;BA.debugLine="Public Sub ucfirst(str As String) As String";
Debug.ShouldStop(8192);
 BA.debugLineNum = 400;BA.debugLine="Dim firstChar As String =\"\"";
Debug.ShouldStop(32768);
_firstchar = BA.ObjectToString("");Debug.locals.put("firstChar", _firstchar);Debug.locals.put("firstChar", _firstchar);
 BA.debugLineNum = 401;BA.debugLine="firstChar= str.CharAt(0)";
Debug.ShouldStop(65536);
_firstchar = BA.ObjectToString(_str.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("firstChar", _firstchar);
 BA.debugLineNum = 402;BA.debugLine="firstChar = firstChar.ToUpperCase";
Debug.ShouldStop(131072);
_firstchar = _firstchar.runMethod(true,"toUpperCase");Debug.locals.put("firstChar", _firstchar);
 BA.debugLineNum = 404;BA.debugLine="Return firstChar & str.SubString(1)";
Debug.ShouldStop(524288);
if (true) return RemoteObject.concat(_firstchar,_str.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 406;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("ucwords (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,381);
if (RapidSub.canDelegate("ucwords")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","ucwords", _str);}
RemoteObject _result = RemoteObject.createImmutable("");
RemoteObject _txt = RemoteObject.createImmutable("");
RemoteObject _firstchar = RemoteObject.createImmutable("");
Debug.locals.put("str", _str);
 BA.debugLineNum = 381;BA.debugLine="Public Sub ucwords(str As String) As String";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 383;BA.debugLine="Dim result As String =\"\"";
Debug.ShouldStop(1073741824);
_result = BA.ObjectToString("");Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 385;BA.debugLine="For Each txt As String In explode(\" \", str)";
Debug.ShouldStop(1);
{
final RemoteObject group2 = _explode(BA.ObjectToString(" "),_str);
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_txt = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("txt", _txt);
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 386;BA.debugLine="Dim firstChar As String =\"\"";
Debug.ShouldStop(2);
_firstchar = BA.ObjectToString("");Debug.locals.put("firstChar", _firstchar);Debug.locals.put("firstChar", _firstchar);
 BA.debugLineNum = 387;BA.debugLine="firstChar= txt.CharAt(0)";
Debug.ShouldStop(4);
_firstchar = BA.ObjectToString(_txt.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("firstChar", _firstchar);
 BA.debugLineNum = 388;BA.debugLine="firstChar = firstChar.ToUpperCase";
Debug.ShouldStop(8);
_firstchar = _firstchar.runMethod(true,"toUpperCase");Debug.locals.put("firstChar", _firstchar);
 BA.debugLineNum = 390;BA.debugLine="result = result & firstChar & txt.SubString(1) &";
Debug.ShouldStop(32);
_result = RemoteObject.concat(_result,_firstchar,_txt.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1))),RemoteObject.createImmutable(" "));Debug.locals.put("result", _result);
 }
}Debug.locals.put("txt", _txt);
;
 BA.debugLineNum = 393;BA.debugLine="Return result";
Debug.ShouldStop(256);
if (true) return _result;
 BA.debugLineNum = 395;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("underscore (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,442);
if (RapidSub.canDelegate("underscore")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","underscore", _str);}
Debug.locals.put("str", _str);
 BA.debugLineNum = 442;BA.debugLine="Public Sub underscore(str As String)  As String";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 444;BA.debugLine="str= str.ToLowerCase";
Debug.ShouldStop(134217728);
_str = _str.runMethod(true,"toLowerCase");Debug.locals.put("str", _str);
 BA.debugLineNum = 445;BA.debugLine="Return str.Replace(\" \",  \"_\")";
Debug.ShouldStop(268435456);
if (true) return _str.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("_")));
 BA.debugLineNum = 447;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("word_wrap (stringutility) ","stringutility",4,stringutility.ba,stringutility.mostCurrent,587);
if (RapidSub.canDelegate("word_wrap")) { return Punchline.Tech.Cuppy.Framework.stringutility.remoteMe.runUserSub(false, "stringutility","word_wrap", _str, _limit);}
RemoteObject _divval = RemoteObject.createImmutable(0);
RemoteObject _stringbuild = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
RemoteObject _nextval = RemoteObject.createImmutable(0);
Debug.locals.put("str", _str);
Debug.locals.put("limit", _limit);
 BA.debugLineNum = 587;BA.debugLine="Sub word_wrap(str As String, limit As Int) As Stri";
Debug.ShouldStop(1024);
 BA.debugLineNum = 589;BA.debugLine="str = str.Trim";
Debug.ShouldStop(4096);
_str = _str.runMethod(true,"trim");Debug.locals.put("str", _str);
 BA.debugLineNum = 591;BA.debugLine="If str.Length = limit Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_str.runMethod(true,"length"),BA.numberCast(double.class, _limit))) { 
 BA.debugLineNum = 593;BA.debugLine="Return str";
Debug.ShouldStop(65536);
if (true) return _str;
 }else {
 BA.debugLineNum = 597;BA.debugLine="Dim DivVal As Int";
Debug.ShouldStop(1048576);
_divval = RemoteObject.createImmutable(0);Debug.locals.put("DivVal", _divval);
 BA.debugLineNum = 599;BA.debugLine="Dim stringBuild As StringBuilder";
Debug.ShouldStop(4194304);
_stringbuild = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("stringBuild", _stringbuild);
 BA.debugLineNum = 600;BA.debugLine="stringBuild.Initialize";
Debug.ShouldStop(8388608);
_stringbuild.runVoidMethod ("Initialize");
 BA.debugLineNum = 602;BA.debugLine="DivVal =  str.Length / limit";
Debug.ShouldStop(33554432);
_divval = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_str.runMethod(true,"length"),_limit}, "/",0, 0));Debug.locals.put("DivVal", _divval);
 BA.debugLineNum = 604;BA.debugLine="For i = 0 To DivVal";
Debug.ShouldStop(134217728);
{
final int step9 = 1;
final int limit9 = _divval.<Integer>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 606;BA.debugLine="Dim nextVal As Int = i * limit";
Debug.ShouldStop(536870912);
_nextval = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_limit}, "*",0, 1);Debug.locals.put("nextVal", _nextval);Debug.locals.put("nextVal", _nextval);
 BA.debugLineNum = 608;BA.debugLine="If i = DivVal Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, _divval))) { 
 BA.debugLineNum = 611;BA.debugLine="stringBuild.Append( str.SubString( nextVal).Tr";
Debug.ShouldStop(4);
_stringbuild.runVoidMethod ("Append",(Object)(_str.runMethod(true,"substring",(Object)(_nextval)).runMethod(true,"trim")));
 }else {
 BA.debugLineNum = 616;BA.debugLine="stringBuild.Append( str.SubString2( nextVal ,";
Debug.ShouldStop(128);
_stringbuild.runVoidMethod ("Append",(Object)(_str.runMethod(true,"substring",(Object)(_nextval),(Object)(RemoteObject.solve(new RemoteObject[] {_nextval,_limit}, "+",1, 1))).runMethod(true,"trim")));
 BA.debugLineNum = 617;BA.debugLine="stringBuild.Append( CRLF)";
Debug.ShouldStop(256);
_stringbuild.runVoidMethod ("Append",(Object)(stringutility.__c.getField(true,"CRLF")));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 623;BA.debugLine="Return stringBuild.ToString";
Debug.ShouldStop(16384);
if (true) return _stringbuild.runMethod(true,"ToString");
 };
 BA.debugLineNum = 627;BA.debugLine="End Sub";
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