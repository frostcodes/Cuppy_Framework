package punchline.tech.cuppy.framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class cfstringutility extends Object{
public static cfstringutility mostCurrent = new cfstringutility();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("punchline.tech.cuppy.framework", "punchline.tech.cuppy.framework.cfstringutility", null);
		ba.loadHtSubs(cfstringutility.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "punchline.tech.cuppy.framework.cfstringutility", ba);
		}
	}
    public static Class<?> getObject() {
		return cfstringutility.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static b4j.example.cssutils _cssutils = null;
public static punchline.tech.cuppy.framework.cfconfigs _cfconfigs = null;
public static punchline.tech.cuppy.framework.cfcontrolsutils _cfcontrolsutils = null;
public static punchline.tech.cuppy.framework.cfdatageneratorutility _cfdatageneratorutility = null;
public static punchline.tech.cuppy.framework.cfapputility _cfapputility = null;
public static punchline.tech.cuppy.framework.cfmathutility _cfmathutility = null;
public static punchline.tech.cuppy.framework.cfstylemanager _cfstylemanager = null;
public static punchline.tech.cuppy.framework.cffileutility _cffileutility = null;
public static punchline.tech.cuppy.framework.cfdatatypeutility _cfdatatypeutility = null;
public static Object  _breakstrat(String _haystack,String _after) throws Exception{
String _found = "";
 //BA.debugLineNum = 720;BA.debugLine="Public Sub BreakStrAt(haystack As String, after As";
 //BA.debugLineNum = 722;BA.debugLine="Dim found As String = \"\"";
_found = "";
 //BA.debugLineNum = 724;BA.debugLine="found= haystack.IndexOf(after)";
_found = BA.NumberToString(_haystack.indexOf(_after));
 //BA.debugLineNum = 726;BA.debugLine="If found = -1 Then";
if ((_found).equals(BA.NumberToString(-1))) { 
 //BA.debugLineNum = 728;BA.debugLine="Return False";
if (true) return (Object)(anywheresoftware.b4a.keywords.Common.False);
 }else {
 //BA.debugLineNum = 732;BA.debugLine="Return haystack.SubString(found)";
if (true) return (Object)(_haystack.substring((int)(Double.parseDouble(_found))));
 };
 //BA.debugLineNum = 736;BA.debugLine="End Sub";
return null;
}
public static String  _camelize(String _str) throws Exception{
String _firstchar = "";
String _result = "";
String _txt = "";
 //BA.debugLineNum = 455;BA.debugLine="Public Sub Camelize(str As String)  As String";
 //BA.debugLineNum = 456;BA.debugLine="Dim firstChar, result As String =\"\"";
_firstchar = "";
_result = "";
 //BA.debugLineNum = 458;BA.debugLine="str= str.Replace(\" \", \"_\") 'make all spaces _";
_str = _str.replace(" ","_");
 //BA.debugLineNum = 460;BA.debugLine="firstChar = str.CharAt(0)";
_firstchar = BA.ObjectToString(_str.charAt((int) (0)));
 //BA.debugLineNum = 461;BA.debugLine="firstChar = firstChar.ToLowerCase";
_firstchar = _firstchar.toLowerCase();
 //BA.debugLineNum = 463;BA.debugLine="For Each txt As String In Explode(\"_\", str)";
{
final anywheresoftware.b4a.BA.IterableList group5 = _explode("_",_str);
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_txt = BA.ObjectToString(group5.Get(index5));
 //BA.debugLineNum = 464;BA.debugLine="result = result & Ucfirst(txt)";
_result = _result+_ucfirst(_txt);
 }
};
 //BA.debugLineNum = 467;BA.debugLine="Return firstChar & result.SubString(1)";
if (true) return _firstchar+_result.substring((int) (1));
 //BA.debugLineNum = 469;BA.debugLine="End Sub";
return "";
}
public static boolean  _containurl(String _text) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Public Sub ContainUrl(text As String) As Boolean";
 //BA.debugLineNum = 85;BA.debugLine="text = text.Trim";
_text = _text.trim();
 //BA.debugLineNum = 87;BA.debugLine="Return text.Contains(\"http://\") Or text.Contains(";
if (true) return _text.contains("http://") || _text.contains("https://");
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return false;
}
public static String  _dateordinal(int _date) throws Exception{
String[] _sufixes = null;
String _ival = "";
int _val = 0;
 //BA.debugLineNum = 1040;BA.debugLine="Public Sub DateOrdinal(date As Int) As String";
 //BA.debugLineNum = 1042;BA.debugLine="Dim sufixes() As String = Array As String(\"th\", \"";
_sufixes = new String[]{"th","st","nd","rd","th","th","th","th","th","th"};
 //BA.debugLineNum = 1043;BA.debugLine="Dim iVal As String = date";
_ival = BA.NumberToString(_date);
 //BA.debugLineNum = 1044;BA.debugLine="Dim val As Int =  (date Mod 100)";
_val = (int) ((_date%100));
 //BA.debugLineNum = 1045;BA.debugLine="If val = 11 Or val =  12 Or val = 13 Then";
if (_val==11 || _val==12 || _val==13) { 
 //BA.debugLineNum = 1047;BA.debugLine="Return iVal & \"th\"";
if (true) return _ival+"th";
 }else {
 //BA.debugLineNum = 1051;BA.debugLine="Return iVal & sufixes(date Mod 10)";
if (true) return _ival+_sufixes[(int) (_date%10)];
 };
 //BA.debugLineNum = 1055;BA.debugLine="End Sub";
return "";
}
public static String  _escapestring(String _value) throws Exception{
 //BA.debugLineNum = 347;BA.debugLine="Public Sub EscapeString(value As String) As String";
 //BA.debugLineNum = 349;BA.debugLine="Return \"\\\" & value";
if (true) return "\\"+_value;
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _explode(String _delimiter,String _str) throws Exception{
 //BA.debugLineNum = 382;BA.debugLine="Public Sub Explode(delimiter As String ,  str As S";
 //BA.debugLineNum = 384;BA.debugLine="Return Split(str, delimiter)";
if (true) return _split(_str,_delimiter);
 //BA.debugLineNum = 386;BA.debugLine="End Sub";
return null;
}
public static String  _fixdelimiter(String _svalue) throws Exception{
 //BA.debugLineNum = 354;BA.debugLine="Public Sub FixDelimiter(sValue As String) As Strin";
 //BA.debugLineNum = 356;BA.debugLine="If sValue = \"|\" Then sValue = \"\\|\"";
if ((_svalue).equals("|")) { 
_svalue = "\\|";};
 //BA.debugLineNum = 357;BA.debugLine="If sValue = \".\" Then sValue = \"\\.\"";
if ((_svalue).equals(".")) { 
_svalue = "\\.";};
 //BA.debugLineNum = 358;BA.debugLine="If sValue = \"\\\" Then sValue = \"\\\\\"";
if ((_svalue).equals("\\")) { 
_svalue = "\\\\";};
 //BA.debugLineNum = 359;BA.debugLine="If sValue = \"^\" Then sValue = \"\\^\"";
if ((_svalue).equals("^")) { 
_svalue = "\\^";};
 //BA.debugLineNum = 360;BA.debugLine="If sValue = \"$\" Then sValue = \"\\$\"";
if ((_svalue).equals("$")) { 
_svalue = "\\$";};
 //BA.debugLineNum = 361;BA.debugLine="If sValue = \"?\" Then sValue = \"\\?\"";
if ((_svalue).equals("?")) { 
_svalue = "\\?";};
 //BA.debugLineNum = 362;BA.debugLine="If sValue = \"*\" Then sValue = \"\\*\"";
if ((_svalue).equals("*")) { 
_svalue = "\\*";};
 //BA.debugLineNum = 363;BA.debugLine="If sValue = \"+\" Then sValue = \"\\+\"";
if ((_svalue).equals("+")) { 
_svalue = "\\+";};
 //BA.debugLineNum = 364;BA.debugLine="If sValue = \"(\" Then sValue = \"\\(\"";
if ((_svalue).equals("(")) { 
_svalue = "\\(";};
 //BA.debugLineNum = 365;BA.debugLine="If sValue = \")\" Then sValue = \"\\)\"";
if ((_svalue).equals(")")) { 
_svalue = "\\)";};
 //BA.debugLineNum = 366;BA.debugLine="If sValue = \"[\" Then sValue = \"\\[\"";
if ((_svalue).equals("[")) { 
_svalue = "\\[";};
 //BA.debugLineNum = 367;BA.debugLine="If sValue = \"{\" Then sValue = \"\\{\"";
if ((_svalue).equals("{")) { 
_svalue = "\\{";};
 //BA.debugLineNum = 368;BA.debugLine="If sValue = \";\" Then sValue = \"\\;\"";
if ((_svalue).equals(";")) { 
_svalue = "\\;";};
 //BA.debugLineNum = 369;BA.debugLine="Return sValue";
if (true) return _svalue;
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return "";
}
public static int  _generatepincode(int _pinlength) throws Exception{
String _result = "";
String[] _randomarray = null;
int _i = 0;
 //BA.debugLineNum = 264;BA.debugLine="Public Sub GeneratePinCode(PinLength As Int) As In";
 //BA.debugLineNum = 266;BA.debugLine="Dim result As String =\"\"";
_result = "";
 //BA.debugLineNum = 267;BA.debugLine="Dim RandomArray() As String = Array As String(1,2";
_randomarray = new String[]{BA.NumberToString(1),BA.NumberToString(2),BA.NumberToString(3),BA.NumberToString(4),BA.NumberToString(5),BA.NumberToString(6),BA.NumberToString(7),BA.NumberToString(8),BA.NumberToString(9),BA.NumberToString(0)};
 //BA.debugLineNum = 269;BA.debugLine="For i = 0 To PinLength - 1";
{
final int step3 = 1;
final int limit3 = (int) (_pinlength-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 271;BA.debugLine="result = result &  RandomArray( Rnd( 0, Rnd(2, R";
_result = _result+_randomarray[anywheresoftware.b4a.keywords.Common.Rnd((int) (0),anywheresoftware.b4a.keywords.Common.Rnd((int) (2),(int) (_randomarray.length-1)))];
 }
};
 //BA.debugLineNum = 275;BA.debugLine="Return  result";
if (true) return (int)(Double.parseDouble(_result));
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return 0;
}
public static String  _generaterandomstring(int _strlength) throws Exception{
String _rndstring = "";
int _rndnumber = 0;
 //BA.debugLineNum = 226;BA.debugLine="Public Sub GenerateRandomString(StrLength As Int)";
 //BA.debugLineNum = 227;BA.debugLine="Dim RndString As String";
_rndstring = "";
 //BA.debugLineNum = 228;BA.debugLine="Dim RndNumber As Int";
_rndnumber = 0;
 //BA.debugLineNum = 229;BA.debugLine="Do While RndString.Length < StrLength";
while (_rndstring.length()<_strlength) {
 //BA.debugLineNum = 230;BA.debugLine="RndNumber = Rnd(48,123) 'Yep, 123, because the l";
_rndnumber = anywheresoftware.b4a.keywords.Common.Rnd((int) (48),(int) (123));
 //BA.debugLineNum = 231;BA.debugLine="If (RndNumber >= 48 And RndNumber <= 57) Or (Rnd";
if ((_rndnumber>=48 && _rndnumber<=57) || (_rndnumber>=65 && _rndnumber<=90) || (_rndnumber>=97 && _rndnumber<=112)) { 
 //BA.debugLineNum = 232;BA.debugLine="RndString = RndString & Chr(RndNumber)";
_rndstring = _rndstring+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr(_rndnumber));
 };
 }
;
 //BA.debugLineNum = 235;BA.debugLine="Return RndString";
if (true) return _rndstring;
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return "";
}
public static String  _generaterandomstring2(int _strlength) throws Exception{
String[] _randomarray = null;
String _result = "";
 //BA.debugLineNum = 243;BA.debugLine="Public Sub GenerateRandomString2(StrLength As Int)";
 //BA.debugLineNum = 245;BA.debugLine="Dim RandomArray() As String = Array As String(\"!\"";
_randomarray = new String[]{"!","@","#","$","%"};
 //BA.debugLineNum = 246;BA.debugLine="Dim result As String";
_result = "";
 //BA.debugLineNum = 249;BA.debugLine="result =  StringArray2String(ShuffleArray(RandomA";
_result = _stringarray2string(_shufflearray(_randomarray));
 //BA.debugLineNum = 250;BA.debugLine="result = result  & GenerateRandomString( Floor( S";
_result = _result+_generaterandomstring((int) (anywheresoftware.b4a.keywords.Common.Floor(_strlength/(double)2)));
 //BA.debugLineNum = 251;BA.debugLine="result = result  & StringArray2String(ShuffleArra";
_result = _result+_stringarray2string(_shufflearray(_randomarray));
 //BA.debugLineNum = 252;BA.debugLine="result = result  & GenerateRandomString( Floor( S";
_result = _result+_generaterandomstring((int) (anywheresoftware.b4a.keywords.Common.Floor(_strlength/(double)2)));
 //BA.debugLineNum = 255;BA.debugLine="Return  result.SubString2( result.Length - StrLen";
if (true) return _result.substring((int) (_result.length()-_strlength),_result.length());
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return "";
}
public static String  _humanize(String _str,String _separator) throws Exception{
 //BA.debugLineNum = 481;BA.debugLine="Public Sub Humanize(str As String, separator As St";
 //BA.debugLineNum = 483;BA.debugLine="str= str.ToLowerCase";
_str = _str.toLowerCase();
 //BA.debugLineNum = 484;BA.debugLine="Return Ucwords(str.Replace(separator, \" \"))";
if (true) return _ucwords(_str.replace(_separator," "));
 //BA.debugLineNum = 486;BA.debugLine="End Sub";
return "";
}
public static String  _implode(String _separator,anywheresoftware.b4a.objects.collections.List _strlist) throws Exception{
String _result = "";
String _str = "";
 //BA.debugLineNum = 389;BA.debugLine="Public Sub Implode(separator As String, StrList As";
 //BA.debugLineNum = 390;BA.debugLine="Dim result As String =\"\"";
_result = "";
 //BA.debugLineNum = 392;BA.debugLine="For Each str As String In StrList 'an array";
{
final anywheresoftware.b4a.BA.IterableList group2 = _strlist;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_str = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 393;BA.debugLine="result = result & str & separator";
_result = _result+_str+_separator;
 }
};
 //BA.debugLineNum = 396;BA.debugLine="Return Trim_Once(result, separator) ' trim separa";
if (true) return _trim_once(_result,_separator);
 //BA.debugLineNum = 398;BA.debugLine="End Sub";
return "";
}
public static String  _increment_string(String _str,String _separator,int _first) throws Exception{
String _parsed_str = "";
String _foundint = "";
int _indexofseperator = 0;
long _foundlong = 0L;
 //BA.debugLineNum = 304;BA.debugLine="Public Sub Increment_String(str As String, separat";
 //BA.debugLineNum = 306;BA.debugLine="Dim parsed_str, foundInt As String =\"\"";
_parsed_str = "";
_foundint = "";
 //BA.debugLineNum = 307;BA.debugLine="Dim IndexOfSeperator  As Int = 0";
_indexofseperator = (int) (0);
 //BA.debugLineNum = 309;BA.debugLine="IndexOfSeperator = str.LastIndexOf(separator)  'f";
_indexofseperator = _str.lastIndexOf(_separator);
 //BA.debugLineNum = 311;BA.debugLine="If  IndexOfSeperator <> 0 Then";
if (_indexofseperator!=0) { 
 //BA.debugLineNum = 314;BA.debugLine="foundInt = str.SubString((IndexOfSeperator +1) )";
_foundint = _str.substring((int) ((_indexofseperator+1)));
 //BA.debugLineNum = 318;BA.debugLine="If IsNumber(foundInt) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_foundint)) { 
 //BA.debugLineNum = 320;BA.debugLine="parsed_str = str.SubString2(0 , IndexOfSeperato";
_parsed_str = _str.substring((int) (0),_indexofseperator);
 //BA.debugLineNum = 325;BA.debugLine="Dim foundLong As Long = (foundInt + 1)";
_foundlong = (long) (((double)(Double.parseDouble(_foundint))+1));
 //BA.debugLineNum = 327;BA.debugLine="Return parsed_str & separator & foundLong";
if (true) return _parsed_str+_separator+BA.NumberToString(_foundlong);
 }else {
 //BA.debugLineNum = 332;BA.debugLine="Return str & separator & first";
if (true) return _str+_separator+BA.NumberToString(_first);
 };
 }else {
 //BA.debugLineNum = 339;BA.debugLine="Return str & separator & first";
if (true) return _str+_separator+BA.NumberToString(_first);
 };
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return "";
}
public static boolean  _isemail(String _emailaddress) throws Exception{
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matchemail = null;
 //BA.debugLineNum = 22;BA.debugLine="Public Sub IsEmail(EmailAddress As String) As Bool";
 //BA.debugLineNum = 24;BA.debugLine="Dim MatchEmail As Matcher = Regex.Matcher(\"^(?i)[";
_matchemail = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matchemail = anywheresoftware.b4a.keywords.Common.Regex.Matcher("^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$",_emailaddress);
 //BA.debugLineNum = 26;BA.debugLine="If MatchEmail.Find = True Then";
if (_matchemail.Find()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 27;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
 //BA.debugLineNum = 29;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return false;
}
public static boolean  _isempty(String _str) throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Public Sub IsEmpty(str As String) As Boolean";
 //BA.debugLineNum = 16;BA.debugLine="Return (str.Trim = \"\")";
if (true) return ((_str.trim()).equals(""));
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return false;
}
public static boolean  _isletter(String _c) throws Exception{
String _pattern = "";
 //BA.debugLineNum = 53;BA.debugLine="Public Sub IsLetter (c As String) As Boolean";
 //BA.debugLineNum = 55;BA.debugLine="Dim pattern As String = \"\\p{Alpha}\"";
_pattern = "\\p{Alpha}";
 //BA.debugLineNum = 56;BA.debugLine="If IsDevTool(\"B4J\") Then pattern = \"(?U)\" & patte";
if (anywheresoftware.b4a.keywords.Common.IsDevTool("B4J")) { 
_pattern = "(?U)"+_pattern;};
 //BA.debugLineNum = 58;BA.debugLine="Return Regex.IsMatch(pattern, c)";
if (true) return anywheresoftware.b4a.keywords.Common.Regex.IsMatch(_pattern,_c);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return false;
}
public static boolean  _isletters(String _text) throws Exception{
String _pattern = "";
 //BA.debugLineNum = 64;BA.debugLine="Public Sub IsLetters (text As String) As Boolean";
 //BA.debugLineNum = 66;BA.debugLine="Dim pattern As String = \"\\p{Alpha}+\"";
_pattern = "\\p{Alpha}+";
 //BA.debugLineNum = 67;BA.debugLine="If IsDevTool(\"B4J\") Then pattern = \"(?U)\" & patte";
if (anywheresoftware.b4a.keywords.Common.IsDevTool("B4J")) { 
_pattern = "(?U)"+_pattern;};
 //BA.debugLineNum = 69;BA.debugLine="Return Regex.IsMatch(pattern, text)";
if (true) return anywheresoftware.b4a.keywords.Common.Regex.IsMatch(_pattern,_text);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return false;
}
public static boolean  _isnull(Object _obj) throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Public Sub IsNull(obj As Object) As Boolean";
 //BA.debugLineNum = 9;BA.debugLine="Return (obj = Null)";
if (true) return (_obj== null);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return false;
}
public static boolean  _isurl(String _text) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Public Sub IsUrl (text As String) As Boolean";
 //BA.debugLineNum = 76;BA.debugLine="text = text.Trim";
_text = _text.trim();
 //BA.debugLineNum = 78;BA.debugLine="Return text.StartsWith(\"http://\") Or text.StartsW";
if (true) return _text.startsWith("http://") || _text.startsWith("https://");
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return false;
}
public static boolean  _isvalidip(String _ip) throws Exception{
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
int _i = 0;
 //BA.debugLineNum = 36;BA.debugLine="Public Sub IsValidIp(ip As String) As Boolean";
 //BA.debugLineNum = 38;BA.debugLine="Dim m As Matcher";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
 //BA.debugLineNum = 39;BA.debugLine="m = Regex.Matcher(\"^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$\",";
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher("^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$",_ip);
 //BA.debugLineNum = 41;BA.debugLine="If m.Find = False Then Return False";
if (_m.Find()==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
 //BA.debugLineNum = 43;BA.debugLine="For i = 1 To 4";
{
final int step4 = 1;
final int limit4 = (int) (4);
_i = (int) (1) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 44;BA.debugLine="If m.Group(i) > 255 Or m.Group(i) < 0 Then Retur";
if ((double)(Double.parseDouble(_m.Group(_i)))>255 || (double)(Double.parseDouble(_m.Group(_i)))<0) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
 }
};
 //BA.debugLineNum = 47;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return false;
}
public static String  _join(anywheresoftware.b4a.objects.collections.List _strlist,String _separator) throws Exception{
 //BA.debugLineNum = 402;BA.debugLine="Public Sub Join(StrList As List,separator As Strin";
 //BA.debugLineNum = 404;BA.debugLine="Return Implode(separator, StrList)";
if (true) return _implode(_separator,_strlist);
 //BA.debugLineNum = 406;BA.debugLine="End Sub";
return "";
}
public static String  _lcfirst(String _str) throws Exception{
String _firstchar = "";
 //BA.debugLineNum = 440;BA.debugLine="Public Sub Lcfirst(str As String) As String";
 //BA.debugLineNum = 442;BA.debugLine="Dim firstChar As String =\"\"";
_firstchar = "";
 //BA.debugLineNum = 443;BA.debugLine="firstChar= str.CharAt(0)";
_firstchar = BA.ObjectToString(_str.charAt((int) (0)));
 //BA.debugLineNum = 444;BA.debugLine="firstChar = firstChar.ToLowerCase";
_firstchar = _firstchar.toLowerCase();
 //BA.debugLineNum = 446;BA.debugLine="Return firstChar & str.SubString(1)";
if (true) return _firstchar+_str.substring((int) (1));
 //BA.debugLineNum = 448;BA.debugLine="End Sub";
return "";
}
public static String  _maptohttprequeststring(anywheresoftware.b4a.objects.collections.Map _map,boolean _appendquestionmark) throws Exception{
 //BA.debugLineNum = 1173;BA.debugLine="Public Sub MapToHttpRequestString(Map As Map, Appe";
 //BA.debugLineNum = 1175;BA.debugLine="Return MapToHttpRequestString2(Map, False)";
if (true) return _maptohttprequeststring2(_map,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 1177;BA.debugLine="End Sub";
return "";
}
public static String  _maptohttprequeststring2(anywheresoftware.b4a.objects.collections.Map _map,boolean _appendquestionmark) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _result = null;
int _i = 0;
 //BA.debugLineNum = 1182;BA.debugLine="Public Sub MapToHttpRequestString2(Map As Map, App";
 //BA.debugLineNum = 1184;BA.debugLine="Dim result As StringBuilder";
_result = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1185;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 1187;BA.debugLine="If AppendQuestionMark Then";
if (_appendquestionmark) { 
 //BA.debugLineNum = 1189;BA.debugLine="result.Append(\"?\")";
_result.Append("?");
 };
 //BA.debugLineNum = 1193;BA.debugLine="For i = 0 To Map.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_map.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 1195;BA.debugLine="result.Append(Map.GetKeyAt(i) & \"=\" & Map.GetVal";
_result.Append(BA.ObjectToString(_map.GetKeyAt(_i))+"="+BA.ObjectToString(_map.GetValueAt(_i))+"&");
 }
};
 //BA.debugLineNum = 1199;BA.debugLine="Return result.ToString.SubString2(0, result.ToStr";
if (true) return _result.ToString().substring((int) (0),(int) (_result.ToString().length()-1));
 //BA.debugLineNum = 1201;BA.debugLine="End Sub";
return "";
}
public static String  _nicelyformatteddate() throws Exception{
 //BA.debugLineNum = 1059;BA.debugLine="Public Sub NicelyFormattedDate As String";
 //BA.debugLineNum = 1061;BA.debugLine="DateTime.DateFormat = \"MMMM '\" & DateOrdinal(Date";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("MMMM '"+_dateordinal(anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+"', yyyy");
 //BA.debugLineNum = 1062;BA.debugLine="Return DateTime.Date(DateTime.Now)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 1064;BA.debugLine="End Sub";
return "";
}
public static String  _nl2br(String _text) throws Exception{
 //BA.debugLineNum = 1067;BA.debugLine="Public Sub Nl2Br(text As String) As String";
 //BA.debugLineNum = 1069;BA.debugLine="Return text.Replace(CRLF, \"<br>\")";
if (true) return _text.replace(anywheresoftware.b4a.keywords.Common.CRLF,"<br>");
 //BA.debugLineNum = 1071;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _parsequerystring(String _querystring) throws Exception{
anywheresoftware.b4a.objects.collections.Map _data = null;
anywheresoftware.b4a.objects.collections.List _temp_list = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.List _querylist = null;
 //BA.debugLineNum = 968;BA.debugLine="Public Sub ParseQueryString(QueryString As String)";
 //BA.debugLineNum = 970;BA.debugLine="Dim Data As Map 'total data";
_data = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 971;BA.debugLine="Data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 973;BA.debugLine="Try";
try { //BA.debugLineNum = 976;BA.debugLine="Dim temp_list As List = Split(QueryString, \"&\")";
_temp_list = new anywheresoftware.b4a.objects.collections.List();
_temp_list = _split(_querystring,"&");
 //BA.debugLineNum = 978;BA.debugLine="For i = 0 To temp_list.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_temp_list.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 980;BA.debugLine="Dim QueryList As List = Split(temp_list.Get(i)";
_querylist = new anywheresoftware.b4a.objects.collections.List();
_querylist = _split(BA.ObjectToString(_temp_list.Get(_i)),"=");
 //BA.debugLineNum = 982;BA.debugLine="If Not(Data.ContainsKey(QueryList.Get(0))) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_data.ContainsKey(_querylist.Get((int) (0))))) { 
 //BA.debugLineNum = 984;BA.debugLine="Data.Put(QueryList.Get(0), QueryList.Get(1))";
_data.Put(_querylist.Get((int) (0)),_querylist.Get((int) (1)));
 };
 }
};
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 992;BA.debugLine="LogError(\"The parser for < parseQueryString() >";
anywheresoftware.b4a.keywords.Common.LogError("The parser for < parseQueryString() > got broken. Please check input data");
 };
 //BA.debugLineNum = 996;BA.debugLine="Return Data";
if (true) return _data;
 //BA.debugLineNum = 998;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _parsequerystringurl(String _url) throws Exception{
 //BA.debugLineNum = 1008;BA.debugLine="Public Sub ParseQueryStringUrl(url As String) As M";
 //BA.debugLineNum = 1010;BA.debugLine="url= BreakStrAt(url, \"?\") ' Split URL from Query";
_url = BA.ObjectToString(_breakstrat(_url,"?"));
 //BA.debugLineNum = 1011;BA.debugLine="url =  Trim_Left_Once(url, \"?\")";
_url = _trim_left_once(_url,"?");
 //BA.debugLineNum = 1013;BA.debugLine="Return ParseQueryString(url)";
if (true) return _parsequerystring(_url);
 //BA.debugLineNum = 1015;BA.debugLine="End Sub";
return null;
}
public static String  _plurify(String _text,int _count,String _suffix) throws Exception{
 //BA.debugLineNum = 1087;BA.debugLine="Public Sub Plurify(text As String, count As Int, s";
 //BA.debugLineNum = 1089;BA.debugLine="If count < 2 Then";
if (_count<2) { 
 //BA.debugLineNum = 1091;BA.debugLine="Return text";
if (true) return _text;
 }else {
 //BA.debugLineNum = 1095;BA.debugLine="Return text & suffix";
if (true) return _text+_suffix;
 };
 //BA.debugLineNum = 1099;BA.debugLine="End Sub";
return "";
}
public static String  _prep_url(String _str) throws Exception{
 //BA.debugLineNum = 489;BA.debugLine="Public Sub Prep_url(str As String)  As String";
 //BA.debugLineNum = 491;BA.debugLine="str = str.Trim";
_str = _str.trim();
 //BA.debugLineNum = 493;BA.debugLine="If IsEmpty(str) Or str.EqualsIgnoreCase(\"http://\"";
if (_isempty(_str) || _str.equalsIgnoreCase("http://")) { 
 //BA.debugLineNum = 495;BA.debugLine="Return  \"\"";
if (true) return "";
 }else if(_str.startsWith("#")) { 
 //BA.debugLineNum = 499;BA.debugLine="Return str";
if (true) return _str;
 }else {
 //BA.debugLineNum = 503;BA.debugLine="If Not(str.StartsWith(\"http://\")) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_str.startsWith("http://"))) { 
 //BA.debugLineNum = 505;BA.debugLine="Return \"http://\" & str";
if (true) return "http://"+_str;
 }else {
 //BA.debugLineNum = 509;BA.debugLine="Return str";
if (true) return _str;
 };
 };
 //BA.debugLineNum = 515;BA.debugLine="End Sub";
return "";
}
public static String  _prepend_zero(int _num) throws Exception{
 //BA.debugLineNum = 943;BA.debugLine="Public Sub Prepend_Zero(num As Int) As String";
 //BA.debugLineNum = 945;BA.debugLine="If num < 10 And num > 0 Then";
if (_num<10 && _num>0) { 
 //BA.debugLineNum = 947;BA.debugLine="Return \"0\" & num";
if (true) return "0"+BA.NumberToString(_num);
 }else {
 //BA.debugLineNum = 951;BA.debugLine="Return num";
if (true) return BA.NumberToString(_num);
 };
 //BA.debugLineNum = 955;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
public static String  _quotes_to_entities(String _str) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Public Sub Quotes_To_Entities(str As String) As St";
 //BA.debugLineNum = 160;BA.debugLine="str = str.Replace(\"\\'\", \"&#39;\")";
_str = _str.replace("\\'","&#39;");
 //BA.debugLineNum = 161;BA.debugLine="str = str.Replace(\"\\\"\"\",\"&quot;\")";
_str = _str.replace("\\\"","&quot;");
 //BA.debugLineNum = 163;BA.debugLine="str = str.Replace(\"'\", \"&#39;\")";
_str = _str.replace("'","&#39;");
 //BA.debugLineNum = 164;BA.debugLine="str = str.Replace(\"\"\"\",\"&quot;\")";
_str = _str.replace("\"","&quot;");
 //BA.debugLineNum = 166;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public static Object  _randlistvalue(anywheresoftware.b4a.objects.collections.List _listx) throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Public Sub RandListValue(ListX As List) As Object";
 //BA.debugLineNum = 216;BA.debugLine="Return ListX.Get(Rnd(0, ListX.Size -1))";
if (true) return _listx.Get(anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (_listx.getSize()-1)));
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public static String  _reduce_double_slashes(String _str) throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Public Sub Reduce_Double_Slashes(str As String) As";
 //BA.debugLineNum = 176;BA.debugLine="If str.ToLowerCase.StartsWith(\"http://\") Then";
if (_str.toLowerCase().startsWith("http://")) { 
 //BA.debugLineNum = 178;BA.debugLine="str = str.Replace(\"//\" ,\"/\")";
_str = _str.replace("//","/");
 //BA.debugLineNum = 179;BA.debugLine="str =  str.Replace(\"http:/\" ,\"http://\")  'fix ba";
_str = _str.replace("http:/","http://");
 }else {
 //BA.debugLineNum = 183;BA.debugLine="str = str.Replace(\"//\" ,\"/\")";
_str = _str.replace("//","/");
 };
 //BA.debugLineNum = 187;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return "";
}
public static String[]  _shufflearray(String[] _stringarray) throws Exception{
String _arrayval = "";
int _random = 0;
int _i = 0;
 //BA.debugLineNum = 199;BA.debugLine="Public Sub ShuffleArray(StringArray() As String) A";
 //BA.debugLineNum = 201;BA.debugLine="Dim ArrayVal As String";
_arrayval = "";
 //BA.debugLineNum = 202;BA.debugLine="Dim Random As Int";
_random = 0;
 //BA.debugLineNum = 204;BA.debugLine="For i = 0 To StringArray.Length - 1";
{
final int step3 = 1;
final int limit3 = (int) (_stringarray.length-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 205;BA.debugLine="Random = Rnd(i, StringArray.Length)";
_random = anywheresoftware.b4a.keywords.Common.Rnd(_i,_stringarray.length);
 //BA.debugLineNum = 206;BA.debugLine="ArrayVal = StringArray(i)";
_arrayval = _stringarray[_i];
 //BA.debugLineNum = 207;BA.debugLine="StringArray(i) = StringArray(Random)";
_stringarray[_i] = _stringarray[_random];
 //BA.debugLineNum = 208;BA.debugLine="StringArray(Random) = ArrayVal";
_stringarray[_random] = _arrayval;
 }
};
 //BA.debugLineNum = 210;BA.debugLine="Return StringArray";
if (true) return _stringarray;
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _split(String _str,String _delimiter) throws Exception{
anywheresoftware.b4a.objects.collections.List _t = null;
 //BA.debugLineNum = 374;BA.debugLine="Sub Split(str As String, delimiter As String) As L";
 //BA.debugLineNum = 375;BA.debugLine="Dim t As List";
_t = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 376;BA.debugLine="t = Regex.Split(FixDelimiter(delimiter), str)";
_t = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split(_fixdelimiter(_delimiter),_str));
 //BA.debugLineNum = 377;BA.debugLine="Return t";
if (true) return _t;
 //BA.debugLineNum = 378;BA.debugLine="End Sub";
return null;
}
public static String  _sprintf(String _fmt,Object[] _arg) throws Exception{
int _ai = 0;
int _fi = 0;
int _i = 0;
int _exp = 0;
int _wid = 0;
String _stmp = "";
String _ptmp = "";
String _sres = "";
String _c = "";
String _t = "";
boolean _bdone = false;
 //BA.debugLineNum = 532;BA.debugLine="Public Sub Sprintf(fmt As String, arg() As Object)";
 //BA.debugLineNum = 533;BA.debugLine="Dim ai, fi, i As Int";
_ai = 0;
_fi = 0;
_i = 0;
 //BA.debugLineNum = 534;BA.debugLine="Dim exp, wid As Int";
_exp = 0;
_wid = 0;
 //BA.debugLineNum = 535;BA.debugLine="Dim stmp, ptmp, sres, c, t As String";
_stmp = "";
_ptmp = "";
_sres = "";
_c = "";
_t = "";
 //BA.debugLineNum = 536;BA.debugLine="Dim bdone As Boolean";
_bdone = false;
 //BA.debugLineNum = 538;BA.debugLine="ai = 0";
_ai = (int) (0);
 //BA.debugLineNum = 539;BA.debugLine="fi = 0";
_fi = (int) (0);
 //BA.debugLineNum = 540;BA.debugLine="stmp = \"\"";
_stmp = "";
 //BA.debugLineNum = 541;BA.debugLine="sres = \"\"";
_sres = "";
 //BA.debugLineNum = 543;BA.debugLine="Do While (fi < fmt.Length)";
while ((_fi<_fmt.length())) {
 //BA.debugLineNum = 544;BA.debugLine="c = fmt.CharAt(fi)";
_c = BA.ObjectToString(_fmt.charAt(_fi));
 //BA.debugLineNum = 545;BA.debugLine="fi = fi + 1";
_fi = (int) (_fi+1);
 //BA.debugLineNum = 547;BA.debugLine="If (c = \"%\") Then";
if (((_c).equals("%"))) { 
 //BA.debugLineNum = 548;BA.debugLine="stmp = \"\"";
_stmp = "";
 //BA.debugLineNum = 549;BA.debugLine="ptmp = \"\"";
_ptmp = "";
 //BA.debugLineNum = 550;BA.debugLine="bdone = False";
_bdone = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 552;BA.debugLine="Do While ((fi < fmt.Length) And (bdone = False)";
while (((_fi<_fmt.length()) && (_bdone==anywheresoftware.b4a.keywords.Common.False))) {
 //BA.debugLineNum = 553;BA.debugLine="c = fmt.CharAt(fi)";
_c = BA.ObjectToString(_fmt.charAt(_fi));
 //BA.debugLineNum = 554;BA.debugLine="fi = fi + 1";
_fi = (int) (_fi+1);
 //BA.debugLineNum = 556;BA.debugLine="If ((IsNumber(c) = True) Or (c = \".\")) Then";
if (((anywheresoftware.b4a.keywords.Common.IsNumber(_c)==anywheresoftware.b4a.keywords.Common.True) || ((_c).equals(".")))) { 
 //BA.debugLineNum = 557;BA.debugLine="ptmp = ptmp & c";
_ptmp = _ptmp+_c;
 //BA.debugLineNum = 558;BA.debugLine="bdone = False";
_bdone = anywheresoftware.b4a.keywords.Common.False;
 }else if(((_c).equals("s"))) { 
 //BA.debugLineNum = 560;BA.debugLine="stmp = arg(ai)";
_stmp = BA.ObjectToString(_arg[_ai]);
 //BA.debugLineNum = 561;BA.debugLine="ai = ai + 1";
_ai = (int) (_ai+1);
 //BA.debugLineNum = 562;BA.debugLine="sres = sres & stmp";
_sres = _sres+_stmp;
 //BA.debugLineNum = 563;BA.debugLine="bdone = True";
_bdone = anywheresoftware.b4a.keywords.Common.True;
 }else if(((_c).equals("d"))) { 
 //BA.debugLineNum = 565;BA.debugLine="If (ptmp.Length > 0) Then";
if ((_ptmp.length()>0)) { 
 //BA.debugLineNum = 566;BA.debugLine="t = \" \"";
_t = " ";
 //BA.debugLineNum = 567;BA.debugLine="If (ptmp.CharAt(0) = \"0\") Then";
if ((_ptmp.charAt((int) (0))==BA.ObjectToChar("0"))) { 
 //BA.debugLineNum = 568;BA.debugLine="t = \"0\"";
_t = "0";
 //BA.debugLineNum = 569;BA.debugLine="ptmp = ptmp.SubString(1)";
_ptmp = _ptmp.substring((int) (1));
 };
 };
 //BA.debugLineNum = 573;BA.debugLine="If (ptmp.Length > 0) Then wid = ptmp Else wid";
if ((_ptmp.length()>0)) { 
_wid = (int)(Double.parseDouble(_ptmp));}
else {
_wid = (int) (0);};
 //BA.debugLineNum = 575;BA.debugLine="stmp = arg(ai)";
_stmp = BA.ObjectToString(_arg[_ai]);
 //BA.debugLineNum = 577;BA.debugLine="Do While (stmp.Length < wid)";
while ((_stmp.length()<_wid)) {
 //BA.debugLineNum = 578;BA.debugLine="stmp = t & stmp";
_stmp = _t+_stmp;
 }
;
 //BA.debugLineNum = 581;BA.debugLine="ai = ai + 1";
_ai = (int) (_ai+1);
 //BA.debugLineNum = 582;BA.debugLine="sres = sres & stmp";
_sres = _sres+_stmp;
 //BA.debugLineNum = 583;BA.debugLine="bdone = True";
_bdone = anywheresoftware.b4a.keywords.Common.True;
 }else if(((_c).equals("f"))) { 
 //BA.debugLineNum = 585;BA.debugLine="If (ptmp.Length > 0) Then";
if ((_ptmp.length()>0)) { 
 //BA.debugLineNum = 586;BA.debugLine="i = ptmp.IndexOf(\".\")";
_i = _ptmp.indexOf(".");
 //BA.debugLineNum = 587;BA.debugLine="If (i >= 0) Then";
if ((_i>=0)) { 
 //BA.debugLineNum = 588;BA.debugLine="wid = ptmp.SubString2(0, i)";
_wid = (int)(Double.parseDouble(_ptmp.substring((int) (0),_i)));
 //BA.debugLineNum = 589;BA.debugLine="exp = ptmp.SubString(i+1)";
_exp = (int)(Double.parseDouble(_ptmp.substring((int) (_i+1))));
 }else {
 //BA.debugLineNum = 591;BA.debugLine="wid = ptmp";
_wid = (int)(Double.parseDouble(_ptmp));
 //BA.debugLineNum = 592;BA.debugLine="exp = 0";
_exp = (int) (0);
 };
 //BA.debugLineNum = 595;BA.debugLine="stmp = NumberFormat(arg(ai), wid, exp)";
_stmp = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_arg[_ai])),_wid,_exp);
 }else {
 //BA.debugLineNum = 597;BA.debugLine="stmp = arg(ai)";
_stmp = BA.ObjectToString(_arg[_ai]);
 };
 //BA.debugLineNum = 600;BA.debugLine="ai = ai + 1";
_ai = (int) (_ai+1);
 //BA.debugLineNum = 601;BA.debugLine="sres = sres & stmp";
_sres = _sres+_stmp;
 //BA.debugLineNum = 602;BA.debugLine="bdone = True";
_bdone = anywheresoftware.b4a.keywords.Common.True;
 }else {
 //BA.debugLineNum = 604;BA.debugLine="ai = ai + 1";
_ai = (int) (_ai+1);
 };
 }
;
 }else {
 //BA.debugLineNum = 609;BA.debugLine="sres = sres & c";
_sres = _sres+_c;
 };
 }
;
 //BA.debugLineNum = 613;BA.debugLine="Return(sres)";
if (true) return (_sres);
 //BA.debugLineNum = 615;BA.debugLine="End Sub";
return "";
}
public static String  _str_repeat(String _input,int _multiplier) throws Exception{
String _result = "";
int _i = 0;
 //BA.debugLineNum = 695;BA.debugLine="Sub Str_Repeat(input As String, multiplier As Int)";
 //BA.debugLineNum = 697;BA.debugLine="If multiplier < 1 Then";
if (_multiplier<1) { 
 //BA.debugLineNum = 699;BA.debugLine="Return \"\"";
if (true) return "";
 }else {
 //BA.debugLineNum = 703;BA.debugLine="Dim result As String = \"\"";
_result = "";
 //BA.debugLineNum = 705;BA.debugLine="For i = 0 To multiplier - 1";
{
final int step5 = 1;
final int limit5 = (int) (_multiplier-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 707;BA.debugLine="result = result & input";
_result = _result+_input;
 }
};
 //BA.debugLineNum = 711;BA.debugLine="Return result";
if (true) return _result;
 };
 //BA.debugLineNum = 715;BA.debugLine="End Sub";
return "";
}
public static String  _str_rot13(String _str) throws Exception{
String _fromstr = "";
String _tostr = "";
 //BA.debugLineNum = 1119;BA.debugLine="Public Sub Str_Rot13(str As String) As String";
 //BA.debugLineNum = 1121;BA.debugLine="Dim FromStr, ToStr As String";
_fromstr = "";
_tostr = "";
 //BA.debugLineNum = 1123;BA.debugLine="FromStr = \"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKL";
_fromstr = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
 //BA.debugLineNum = 1124;BA.debugLine="ToStr 	= \"nopqrstuvwxyzabcdefghijklmNOPQRSTUVWXYZ";
_tostr = "nopqrstuvwxyzabcdefghijklmNOPQRSTUVWXYZABCDEFGHIJKLM";
 //BA.debugLineNum = 1126;BA.debugLine="Return Strtr(str, FromStr, ToStr)";
if (true) return _strtr(_str,_fromstr,_tostr);
 //BA.debugLineNum = 1128;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _str_split(String _str,int _splitlength) throws Exception{
anywheresoftware.b4a.objects.collections.List _chunks = null;
int _divval = 0;
int _i = 0;
int _nextval = 0;
 //BA.debugLineNum = 777;BA.debugLine="Public Sub Str_Split (str As String, splitLength A";
 //BA.debugLineNum = 779;BA.debugLine="Dim chunks As List";
_chunks = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 780;BA.debugLine="chunks.Initialize";
_chunks.Initialize();
 //BA.debugLineNum = 782;BA.debugLine="If (IsEmpty(str) Or splitLength < 1)  Then";
if ((_isempty(_str) || _splitlength<1)) { 
 //BA.debugLineNum = 784;BA.debugLine="Return chunks 'empty list";
if (true) return _chunks;
 }else if(_splitlength==_str.length()) { 
 //BA.debugLineNum = 788;BA.debugLine="chunks.Add(str)";
_chunks.Add((Object)(_str));
 //BA.debugLineNum = 789;BA.debugLine="Return chunks";
if (true) return _chunks;
 };
 //BA.debugLineNum = 793;BA.debugLine="Dim DivVal As Int  =  str.Length / splitLength";
_divval = (int) (_str.length()/(double)_splitlength);
 //BA.debugLineNum = 795;BA.debugLine="For i = 0 To DivVal";
{
final int step10 = 1;
final int limit10 = _divval;
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
 //BA.debugLineNum = 797;BA.debugLine="Dim nextVal As Int = i * splitLength";
_nextval = (int) (_i*_splitlength);
 //BA.debugLineNum = 799;BA.debugLine="If i = DivVal Then";
if (_i==_divval) { 
 //BA.debugLineNum = 802;BA.debugLine="chunks.add( str.SubString( nextVal))";
_chunks.Add((Object)(_str.substring(_nextval)));
 }else {
 //BA.debugLineNum = 807;BA.debugLine="chunks.add( str.SubString2( nextVal , nextVal +";
_chunks.Add((Object)(_str.substring(_nextval,(int) (_nextval+_splitlength))));
 };
 }
};
 //BA.debugLineNum = 813;BA.debugLine="Return chunks";
if (true) return _chunks;
 //BA.debugLineNum = 815;BA.debugLine="End Sub";
return null;
}
public static String  _string2ascii(String _text) throws Exception{
 //BA.debugLineNum = 682;BA.debugLine="Public Sub String2Ascii(text As String) As String";
 //BA.debugLineNum = 685;BA.debugLine="Return String2AsciiWithSeperator(text, \"\")";
if (true) return _string2asciiwithseperator(_text,"");
 //BA.debugLineNum = 687;BA.debugLine="End Sub";
return "";
}
public static String  _string2asciiwithseperator(String _text,String _seperator) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _result = null;
int _i = 0;
 //BA.debugLineNum = 666;BA.debugLine="Public Sub String2AsciiWithSeperator(text As Strin";
 //BA.debugLineNum = 668;BA.debugLine="Dim result As StringBuilder";
_result = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 669;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 671;BA.debugLine="For i = 0 To text.Length - 1";
{
final int step3 = 1;
final int limit3 = (int) (_text.length()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 673;BA.debugLine="result.Append(Asc(text.CharAt(i)) & seperator)";
_result.Append(BA.NumberToString(anywheresoftware.b4a.keywords.Common.Asc(_text.charAt(_i)))+_seperator);
 }
};
 //BA.debugLineNum = 677;BA.debugLine="Return result.ToString.Trim";
if (true) return _result.ToString().trim();
 //BA.debugLineNum = 679;BA.debugLine="End Sub";
return "";
}
public static String  _stringarray2string(String[] _strarray) throws Exception{
String _result = "";
String _str = "";
 //BA.debugLineNum = 284;BA.debugLine="Public Sub StringArray2String(StrArray() As String";
 //BA.debugLineNum = 286;BA.debugLine="Dim result As String =\"\"";
_result = "";
 //BA.debugLineNum = 287;BA.debugLine="For Each str As String In StrArray 'an array";
{
final String[] group2 = _strarray;
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_str = group2[index2];
 //BA.debugLineNum = 288;BA.debugLine="result = result & str";
_result = _result+_str;
 }
};
 //BA.debugLineNum = 291;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return "";
}
public static String  _strip_quotes(String _str) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Public Sub Strip_Quotes(str As String) As String";
 //BA.debugLineNum = 151;BA.debugLine="str = str.Replace(\"'\", \"\")";
_str = _str.replace("'","");
 //BA.debugLineNum = 152;BA.debugLine="str = str.Replace(\"\"\"\",\"\")";
_str = _str.replace("\"","");
 //BA.debugLineNum = 153;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public static int  _stripos(String _haystack,String _find) throws Exception{
 //BA.debugLineNum = 852;BA.debugLine="Public Sub Stripos(haystack As String , find As St";
 //BA.debugLineNum = 854;BA.debugLine="haystack = haystack.ToLowerCase";
_haystack = _haystack.toLowerCase();
 //BA.debugLineNum = 855;BA.debugLine="find = find.ToLowerCase";
_find = _find.toLowerCase();
 //BA.debugLineNum = 857;BA.debugLine="Return haystack.IndexOf(find)";
if (true) return _haystack.indexOf(_find);
 //BA.debugLineNum = 859;BA.debugLine="End Sub";
return 0;
}
public static int  _stripos2(String _haystack,String _find,int _start) throws Exception{
 //BA.debugLineNum = 868;BA.debugLine="Public Sub Stripos2(haystack As String , find As S";
 //BA.debugLineNum = 870;BA.debugLine="haystack = haystack.ToLowerCase";
_haystack = _haystack.toLowerCase();
 //BA.debugLineNum = 871;BA.debugLine="find = find.ToLowerCase";
_find = _find.toLowerCase();
 //BA.debugLineNum = 873;BA.debugLine="Return haystack.IndexOf2(find, start)";
if (true) return _haystack.indexOf(_find,_start);
 //BA.debugLineNum = 875;BA.debugLine="End Sub";
return 0;
}
public static Object  _strpbrk(String _haystack,String _charlist) throws Exception{
int _i = 0;
 //BA.debugLineNum = 743;BA.debugLine="Public Sub Strpbrk(haystack As String, charList As";
 //BA.debugLineNum = 745;BA.debugLine="For i = 0 To haystack.Length - 1";
{
final int step1 = 1;
final int limit1 = (int) (_haystack.length()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 747;BA.debugLine="If charList.IndexOf(haystack.CharAt(i)) >= 0 The";
if (_charlist.indexOf(BA.ObjectToString(_haystack.charAt(_i)))>=0) { 
 //BA.debugLineNum = 749;BA.debugLine="Return haystack.SubString(i)";
if (true) return (Object)(_haystack.substring(_i));
 };
 }
};
 //BA.debugLineNum = 755;BA.debugLine="Return False";
if (true) return (Object)(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 757;BA.debugLine="End Sub";
return null;
}
public static int  _strpos(String _haystack,String _find) throws Exception{
 //BA.debugLineNum = 826;BA.debugLine="Public Sub Strpos(haystack As String , find As Str";
 //BA.debugLineNum = 828;BA.debugLine="Return haystack.IndexOf(find)";
if (true) return _haystack.indexOf(_find);
 //BA.debugLineNum = 830;BA.debugLine="End Sub";
return 0;
}
public static int  _strpos2(String _haystack,String _find,int _start) throws Exception{
 //BA.debugLineNum = 839;BA.debugLine="Public Sub Strpos2(haystack As String , find As St";
 //BA.debugLineNum = 841;BA.debugLine="Return haystack.IndexOf2(find, start)";
if (true) return _haystack.indexOf(_find,_start);
 //BA.debugLineNum = 843;BA.debugLine="End Sub";
return 0;
}
public static int  _strripos(String _haystack,String _find) throws Exception{
 //BA.debugLineNum = 914;BA.debugLine="Public Sub Strripos(haystack As String , find As S";
 //BA.debugLineNum = 916;BA.debugLine="haystack = haystack.ToLowerCase";
_haystack = _haystack.toLowerCase();
 //BA.debugLineNum = 917;BA.debugLine="find = find.ToLowerCase";
_find = _find.toLowerCase();
 //BA.debugLineNum = 919;BA.debugLine="Return haystack.LastIndexOf(find)";
if (true) return _haystack.lastIndexOf(_find);
 //BA.debugLineNum = 921;BA.debugLine="End Sub";
return 0;
}
public static int  _strripos2(String _haystack,String _find,int _start) throws Exception{
 //BA.debugLineNum = 930;BA.debugLine="Public Sub Strripos2 (haystack As String , find As";
 //BA.debugLineNum = 932;BA.debugLine="haystack = haystack.ToLowerCase";
_haystack = _haystack.toLowerCase();
 //BA.debugLineNum = 933;BA.debugLine="find = find.ToLowerCase";
_find = _find.toLowerCase();
 //BA.debugLineNum = 935;BA.debugLine="Return haystack.LastIndexOf2(find, start)";
if (true) return _haystack.lastIndexOf(_find,_start);
 //BA.debugLineNum = 937;BA.debugLine="End Sub";
return 0;
}
public static int  _strrpos(String _haystack,String _find) throws Exception{
 //BA.debugLineNum = 888;BA.debugLine="Public Sub Strrpos(haystack As String , find As St";
 //BA.debugLineNum = 890;BA.debugLine="Return haystack.LastIndexOf(find)";
if (true) return _haystack.lastIndexOf(_find);
 //BA.debugLineNum = 892;BA.debugLine="End Sub";
return 0;
}
public static int  _strrpos2(String _haystack,String _find,int _start) throws Exception{
 //BA.debugLineNum = 901;BA.debugLine="Public Sub Strrpos2(haystack As String , find As S";
 //BA.debugLineNum = 903;BA.debugLine="Return haystack.LastIndexOf2(find, start)";
if (true) return _haystack.lastIndexOf(_find,_start);
 //BA.debugLineNum = 905;BA.debugLine="End Sub";
return 0;
}
public static anywheresoftware.b4a.objects.collections.List  _strtostrlist(String _str) throws Exception{
anywheresoftware.b4a.objects.collections.List _result = null;
int _i = 0;
 //BA.debugLineNum = 761;BA.debugLine="Public Sub StrToStrList(str As String) As List";
 //BA.debugLineNum = 763;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 764;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 766;BA.debugLine="For i = 0 To str.Length - 1";
{
final int step3 = 1;
final int limit3 = (int) (_str.length()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 768;BA.debugLine="result.Add(str.CharAt(i))";
_result.Add((Object)(_str.charAt(_i)));
 }
};
 //BA.debugLineNum = 772;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 774;BA.debugLine="End Sub";
return null;
}
public static String  _strtr(String _str,String _fromstringlist,String _tostringlist) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _result = null;
int _count = 0;
int _i = 0;
char _currentchar = '\0';
 //BA.debugLineNum = 1143;BA.debugLine="Public Sub Strtr(Str As String, FromStringList As";
 //BA.debugLineNum = 1145;BA.debugLine="Dim result As StringBuilder";
_result = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1146;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 1148;BA.debugLine="Dim count As Int = Str.Length -1";
_count = (int) (_str.length()-1);
 //BA.debugLineNum = 1150;BA.debugLine="For i = 0 To count";
{
final int step4 = 1;
final int limit4 = _count;
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 1152;BA.debugLine="Dim CurrentChar As Char = Str.CharAt(i)";
_currentchar = _str.charAt(_i);
 //BA.debugLineNum = 1154;BA.debugLine="If FromStringList.Contains(CurrentChar) Then";
if (_fromstringlist.contains(BA.ObjectToString(_currentchar))) { 
 //BA.debugLineNum = 1156;BA.debugLine="result.Append(ToStringList.CharAt(FromStringLis";
_result.Append(BA.ObjectToString(_tostringlist.charAt(_fromstringlist.indexOf(BA.ObjectToString(_currentchar)))));
 }else {
 //BA.debugLineNum = 1160;BA.debugLine="result.Append(CurrentChar)";
_result.Append(BA.ObjectToString(_currentchar));
 };
 }
};
 //BA.debugLineNum = 1166;BA.debugLine="Return result.ToString";
if (true) return _result.ToString();
 //BA.debugLineNum = 1168;BA.debugLine="End Sub";
return "";
}
public static String  _trim_left_once(String _str,String _character) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Public Sub Trim_Left_Once(str As String, character";
 //BA.debugLineNum = 104;BA.debugLine="If IsEmpty(character) Then";
if (_isempty(_character)) { 
 //BA.debugLineNum = 106;BA.debugLine="character = \" \" 'empty space";
_character = " ";
 };
 //BA.debugLineNum = 110;BA.debugLine="If str.StartsWith(character) Then";
if (_str.startsWith(_character)) { 
 //BA.debugLineNum = 112;BA.debugLine="str = str.SubString(1)";
_str = _str.substring((int) (1));
 };
 //BA.debugLineNum = 116;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public static String  _trim_once(String _str,String _character) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Public Sub Trim_Once(str As String, character As S";
 //BA.debugLineNum = 94;BA.debugLine="str = Trim_Left_Once(str, character)";
_str = _trim_left_once(_str,_character);
 //BA.debugLineNum = 95;BA.debugLine="str = Trim_Right_Once(str, character)";
_str = _trim_right_once(_str,_character);
 //BA.debugLineNum = 97;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public static String  _trim_right_once(String _str,String _character) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Public Sub Trim_Right_Once(str As String, characte";
 //BA.debugLineNum = 123;BA.debugLine="If IsEmpty(character) Then";
if (_isempty(_character)) { 
 //BA.debugLineNum = 125;BA.debugLine="character = \" \" 'empty space";
_character = " ";
 };
 //BA.debugLineNum = 129;BA.debugLine="If str.EndsWith(character) Then";
if (_str.endsWith(_character)) { 
 //BA.debugLineNum = 131;BA.debugLine="str = str.SubString2(0, str.Length - 1)";
_str = _str.substring((int) (0),(int) (_str.length()-1));
 };
 //BA.debugLineNum = 135;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public static String  _trim_slashes_once(String _str) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Public Sub Trim_Slashes_Once(str As String) As Str";
 //BA.debugLineNum = 144;BA.debugLine="Return Trim_Once( str, \"/\")";
if (true) return _trim_once(_str,"/");
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public static String  _truncate(String _txt,int _length) throws Exception{
 //BA.debugLineNum = 1021;BA.debugLine="Public Sub Truncate(txt As String, length As Int)";
 //BA.debugLineNum = 1026;BA.debugLine="If length > txt.Length Then";
if (_length>_txt.length()) { 
 //BA.debugLineNum = 1028;BA.debugLine="Return txt";
if (true) return _txt;
 }else {
 //BA.debugLineNum = 1032;BA.debugLine="Return txt.Substring2(0, length)";
if (true) return _txt.substring((int) (0),_length);
 };
 //BA.debugLineNum = 1036;BA.debugLine="End Sub";
return "";
}
public static String  _ucfirst(String _str) throws Exception{
String _firstchar = "";
 //BA.debugLineNum = 427;BA.debugLine="Public Sub Ucfirst(str As String) As String";
 //BA.debugLineNum = 429;BA.debugLine="str = str.ToLowerCase";
_str = _str.toLowerCase();
 //BA.debugLineNum = 431;BA.debugLine="Dim firstChar As String =\"\"";
_firstchar = "";
 //BA.debugLineNum = 432;BA.debugLine="firstChar= str.CharAt(0)";
_firstchar = BA.ObjectToString(_str.charAt((int) (0)));
 //BA.debugLineNum = 433;BA.debugLine="firstChar = firstChar.ToUpperCase";
_firstchar = _firstchar.toUpperCase();
 //BA.debugLineNum = 435;BA.debugLine="Return firstChar & str.SubString(1)";
if (true) return _firstchar+_str.substring((int) (1));
 //BA.debugLineNum = 437;BA.debugLine="End Sub";
return "";
}
public static String  _ucwords(String _str) throws Exception{
String _result = "";
String _txt = "";
String _firstchar = "";
 //BA.debugLineNum = 409;BA.debugLine="Public Sub Ucwords(str As String) As String";
 //BA.debugLineNum = 411;BA.debugLine="Dim result As String =\"\"";
_result = "";
 //BA.debugLineNum = 413;BA.debugLine="For Each txt As String In Explode(\" \", str.ToLowe";
{
final anywheresoftware.b4a.BA.IterableList group2 = _explode(" ",_str.toLowerCase());
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_txt = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 414;BA.debugLine="Dim firstChar As String =\"\"";
_firstchar = "";
 //BA.debugLineNum = 415;BA.debugLine="firstChar= txt.CharAt(0)";
_firstchar = BA.ObjectToString(_txt.charAt((int) (0)));
 //BA.debugLineNum = 416;BA.debugLine="firstChar = firstChar.ToUpperCase";
_firstchar = _firstchar.toUpperCase();
 //BA.debugLineNum = 418;BA.debugLine="result = result & firstChar & txt.SubString(1) &";
_result = _result+_firstchar+_txt.substring((int) (1))+" ";
 }
};
 //BA.debugLineNum = 422;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 424;BA.debugLine="End Sub";
return "";
}
public static String  _underscore(String _str) throws Exception{
 //BA.debugLineNum = 473;BA.debugLine="Public Sub Underscore(str As String)  As String";
 //BA.debugLineNum = 475;BA.debugLine="str= str.ToLowerCase";
_str = _str.toLowerCase();
 //BA.debugLineNum = 476;BA.debugLine="Return str.Replace(\" \",  \"_\")";
if (true) return _str.replace(" ","_");
 //BA.debugLineNum = 478;BA.debugLine="End Sub";
return "";
}
public static String  _word_wrap(String _str,int _limit) throws Exception{
int _divval = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _stringbuild = null;
int _i = 0;
int _nextval = 0;
 //BA.debugLineNum = 622;BA.debugLine="Sub Word_Wrap(str As String, limit As Int) As Stri";
 //BA.debugLineNum = 624;BA.debugLine="str = str.Trim";
_str = _str.trim();
 //BA.debugLineNum = 626;BA.debugLine="If str.Length = limit Then";
if (_str.length()==_limit) { 
 //BA.debugLineNum = 628;BA.debugLine="Return str";
if (true) return _str;
 }else {
 //BA.debugLineNum = 632;BA.debugLine="Dim DivVal As Int";
_divval = 0;
 //BA.debugLineNum = 634;BA.debugLine="Dim stringBuild As StringBuilder";
_stringbuild = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 635;BA.debugLine="stringBuild.Initialize";
_stringbuild.Initialize();
 //BA.debugLineNum = 637;BA.debugLine="DivVal =  str.Length / limit";
_divval = (int) (_str.length()/(double)_limit);
 //BA.debugLineNum = 639;BA.debugLine="For i = 0 To DivVal";
{
final int step9 = 1;
final int limit9 = _divval;
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 641;BA.debugLine="Dim nextVal As Int = i * limit";
_nextval = (int) (_i*_limit);
 //BA.debugLineNum = 643;BA.debugLine="If i = DivVal Then";
if (_i==_divval) { 
 //BA.debugLineNum = 646;BA.debugLine="stringBuild.Append( str.SubString( nextVal).Tr";
_stringbuild.Append(_str.substring(_nextval).trim());
 }else {
 //BA.debugLineNum = 651;BA.debugLine="stringBuild.Append( str.SubString2( nextVal ,";
_stringbuild.Append(_str.substring(_nextval,(int) (_nextval+_limit)).trim());
 //BA.debugLineNum = 652;BA.debugLine="stringBuild.Append( CRLF)";
_stringbuild.Append(anywheresoftware.b4a.keywords.Common.CRLF);
 };
 }
};
 //BA.debugLineNum = 658;BA.debugLine="Return stringBuild.ToString";
if (true) return _stringbuild.ToString();
 };
 //BA.debugLineNum = 662;BA.debugLine="End Sub";
return "";
}
}
