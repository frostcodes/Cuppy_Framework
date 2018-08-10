package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class cfstringutility extends Object{
public static cfstringutility mostCurrent = new cfstringutility();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfstringutility", null);
		ba.loadHtSubs(cfstringutility.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "Punchline.Tech.Cuppy.Framework.cfstringutility", ba);
		}
	}
    public static Class<?> getObject() {
		return cfstringutility.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _vvvvvvvvvvvvvvvv2 = null;
public static b4j.example.cssutils _vvvvvvvvvvvvvvvv3 = null;
public static Punchline.Tech.Cuppy.Framework.cfconfigs _vvvvvvvvvvvvvvvv4 = null;
public static Punchline.Tech.Cuppy.Framework.cfstylemanager _vvvvvvvvvvvvvvvv5 = null;
public static Punchline.Tech.Cuppy.Framework.cffileutility _vvvvvvvvvvvvvvvv7 = null;
public static Punchline.Tech.Cuppy.Framework.cfmathutility _vvvvvvvvvvvvvvvv0 = null;
public static Punchline.Tech.Cuppy.Framework.cfdatatypeutility _vvvvvvvvvvvvvvvvv1 = null;
public static Punchline.Tech.Cuppy.Framework.cfanimationmanager _vvvvvvvvvvvvvvvvv2 = null;
public static Punchline.Tech.Cuppy.Framework.cflicensemanager _vvvvvvvvvvvvvvvvv3 = null;
public static Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _vvvvvvvvvvvvvvvvv4 = null;
public static Punchline.Tech.Cuppy.Framework.cfapputility _vvvvvvvvvvvvvvvvv5 = null;
public static Punchline.Tech.Cuppy.Framework.cfcontrolsutils _vvvvvvvvvvvvvvvvv6 = null;
public static Punchline.Tech.Cuppy.Framework.cfhtmlutility _vvvvvvvvvvvvvvvvv7 = null;
public static Object  _vvv5(String _haystack,String _after) throws Exception{
String _found = "";
 //BA.debugLineNum = 700;BA.debugLine="Public Sub breakStrAt(haystack As String, after As";
 //BA.debugLineNum = 702;BA.debugLine="Dim found As String = \"\"";
_found = "";
 //BA.debugLineNum = 704;BA.debugLine="found= haystack.IndexOf(after)";
_found = BA.NumberToString(_haystack.indexOf(_after));
 //BA.debugLineNum = 706;BA.debugLine="If found = -1 Then";
if ((_found).equals(BA.NumberToString(-1))) { 
 //BA.debugLineNum = 708;BA.debugLine="Return False";
if (true) return (Object)(anywheresoftware.b4a.keywords.Common.False);
 }else {
 //BA.debugLineNum = 712;BA.debugLine="Return haystack.SubString(found)";
if (true) return (Object)(_haystack.substring((int)(Double.parseDouble(_found))));
 };
 //BA.debugLineNum = 716;BA.debugLine="End Sub";
return null;
}
public static String  _vvv6(String _str) throws Exception{
String _firstchar = "";
String _result = "";
String _txt = "";
 //BA.debugLineNum = 439;BA.debugLine="Public Sub camelize(str As String)  As String";
 //BA.debugLineNum = 440;BA.debugLine="Dim firstChar, result As String =\"\"";
_firstchar = "";
_result = "";
 //BA.debugLineNum = 442;BA.debugLine="str= str.Replace(\" \", \"_\") 'make all spaces _";
_str = _str.replace(" ","_");
 //BA.debugLineNum = 444;BA.debugLine="firstChar = str.CharAt(0)";
_firstchar = BA.ObjectToString(_str.charAt((int) (0)));
 //BA.debugLineNum = 445;BA.debugLine="firstChar = firstChar.ToLowerCase";
_firstchar = _firstchar.toLowerCase();
 //BA.debugLineNum = 447;BA.debugLine="For Each txt As String In explode(\"_\", str)";
{
final anywheresoftware.b4a.BA.IterableList group5 = _vvvv1("_",_str);
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_txt = BA.ObjectToString(group5.Get(index5));
 //BA.debugLineNum = 448;BA.debugLine="result = result & ucfirst(txt)";
_result = _result+_vvvvvvvv4(_txt);
 }
};
 //BA.debugLineNum = 451;BA.debugLine="Return firstChar & result.SubString(1)";
if (true) return _firstchar+_result.substring((int) (1));
 //BA.debugLineNum = 453;BA.debugLine="End Sub";
return "";
}
public static boolean  _vvv7(String _text) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Public Sub ContainUrl(text As String) As Boolean";
 //BA.debugLineNum = 89;BA.debugLine="text = text.Trim";
_text = _text.trim();
 //BA.debugLineNum = 91;BA.debugLine="Return text.Contains(\"http://\") Or text.Contains(";
if (true) return _text.contains("http://") || _text.contains("https://");
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return false;
}
public static String  _vvv0(String _value) throws Exception{
 //BA.debugLineNum = 353;BA.debugLine="Public Sub EscapeString(value As String) As String";
 //BA.debugLineNum = 355;BA.debugLine="Return \"\\\"& value";
if (true) return "\\"+_value;
 //BA.debugLineNum = 357;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _vvvv1(String _delimiter,String _str) throws Exception{
 //BA.debugLineNum = 368;BA.debugLine="Public Sub explode(delimiter As String ,  str As S";
 //BA.debugLineNum = 370;BA.debugLine="Return Split(str, delimiter)";
if (true) return _vvvvvv4(_str,_delimiter);
 //BA.debugLineNum = 372;BA.debugLine="End Sub";
return null;
}
public static int  _vvvv2(int _pinlength) throws Exception{
String _result = "";
String[] _randomarray = null;
int _i = 0;
 //BA.debugLineNum = 270;BA.debugLine="Public Sub generatePinCode(PinLength As Int) As I";
 //BA.debugLineNum = 272;BA.debugLine="Dim result As String =\"\"";
_result = "";
 //BA.debugLineNum = 273;BA.debugLine="Dim RandomArray() As String = Array As String(1,2";
_randomarray = new String[]{BA.NumberToString(1),BA.NumberToString(2),BA.NumberToString(3),BA.NumberToString(4),BA.NumberToString(5),BA.NumberToString(6),BA.NumberToString(7),BA.NumberToString(8),BA.NumberToString(9),BA.NumberToString(0)};
 //BA.debugLineNum = 275;BA.debugLine="For i = 0 To PinLength - 1";
{
final int step3 = 1;
final int limit3 = (int) (_pinlength-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 277;BA.debugLine="result = result &  RandomArray( Rnd( 0, Rnd(2, R";
_result = _result+_randomarray[anywheresoftware.b4a.keywords.Common.Rnd((int) (0),anywheresoftware.b4a.keywords.Common.Rnd((int) (2),(int) (_randomarray.length-1)))];
 }
};
 //BA.debugLineNum = 281;BA.debugLine="Return  result";
if (true) return (int)(Double.parseDouble(_result));
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return 0;
}
public static String  _vvvv3(int _strlength) throws Exception{
String _rndstring = "";
int _rndnumber = 0;
 //BA.debugLineNum = 232;BA.debugLine="Public Sub generateRandomString(StrLength As Int)";
 //BA.debugLineNum = 233;BA.debugLine="Dim RndString As String";
_rndstring = "";
 //BA.debugLineNum = 234;BA.debugLine="Dim RndNumber As Int";
_rndnumber = 0;
 //BA.debugLineNum = 235;BA.debugLine="Do While RndString.Length < StrLength";
while (_rndstring.length()<_strlength) {
 //BA.debugLineNum = 236;BA.debugLine="RndNumber = Rnd(48,123) 'Yep, 123, because the l";
_rndnumber = anywheresoftware.b4a.keywords.Common.Rnd((int) (48),(int) (123));
 //BA.debugLineNum = 237;BA.debugLine="If (RndNumber >= 48 And RndNumber <= 57) Or (Rnd";
if ((_rndnumber>=48 && _rndnumber<=57) || (_rndnumber>=65 && _rndnumber<=90) || (_rndnumber>=97 && _rndnumber<=112)) { 
 //BA.debugLineNum = 238;BA.debugLine="RndString = RndString & Chr(RndNumber)";
_rndstring = _rndstring+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr(_rndnumber));
 };
 }
;
 //BA.debugLineNum = 241;BA.debugLine="Return RndString";
if (true) return _rndstring;
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return "";
}
public static String  _vvvv4(int _strlength) throws Exception{
String[] _randomarray = null;
String _result = "";
 //BA.debugLineNum = 249;BA.debugLine="Public Sub generateRandomString2(StrLength As Int)";
 //BA.debugLineNum = 251;BA.debugLine="Dim RandomArray() As String = Array As String(\"!\"";
_randomarray = new String[]{"!","@","#","$","%"};
 //BA.debugLineNum = 252;BA.debugLine="Dim result As String";
_result = "";
 //BA.debugLineNum = 255;BA.debugLine="result =  StringArray2String(shuffleArray(RandomA";
_result = _vvvvvv0(_vvvvvv3(_randomarray));
 //BA.debugLineNum = 256;BA.debugLine="result = result  & generateRandomString( Floor( S";
_result = _result+_vvvv3((int) (anywheresoftware.b4a.keywords.Common.Floor(_strlength/(double)2)));
 //BA.debugLineNum = 257;BA.debugLine="result = result  & StringArray2String(shuffleArra";
_result = _result+_vvvvvv0(_vvvvvv3(_randomarray));
 //BA.debugLineNum = 258;BA.debugLine="result = result  & generateRandomString( Floor( S";
_result = _result+_vvvv3((int) (anywheresoftware.b4a.keywords.Common.Floor(_strlength/(double)2)));
 //BA.debugLineNum = 261;BA.debugLine="Return  result.SubString2( result.Length - StrLen";
if (true) return _result.substring((int) (_result.length()-_strlength),_result.length());
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return "";
}
public static String  _vvvv5(String _str,String _separator) throws Exception{
 //BA.debugLineNum = 465;BA.debugLine="Public Sub humanize(str As String, separator As St";
 //BA.debugLineNum = 467;BA.debugLine="str= str.ToLowerCase";
_str = _str.toLowerCase();
 //BA.debugLineNum = 468;BA.debugLine="Return ucwords(str.Replace(separator, \" \"))";
if (true) return _vvvvvvvv5(_str.replace(_separator," "));
 //BA.debugLineNum = 470;BA.debugLine="End Sub";
return "";
}
public static String  _vvvv6(String _separator,anywheresoftware.b4a.objects.collections.List _strlist) throws Exception{
String _result = "";
String _str = "";
 //BA.debugLineNum = 375;BA.debugLine="Public Sub implode(separator As String, StrList As";
 //BA.debugLineNum = 376;BA.debugLine="Dim result As String =\"\"";
_result = "";
 //BA.debugLineNum = 378;BA.debugLine="For Each str As String In StrList 'an array";
{
final anywheresoftware.b4a.BA.IterableList group2 = _strlist;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_str = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 379;BA.debugLine="result = result & str & separator";
_result = _result+_str+_separator;
 }
};
 //BA.debugLineNum = 382;BA.debugLine="Return trim_once(result, separator) ' trim separa";
if (true) return _trim_once(_result,_separator);
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return "";
}
public static String  _increment_string(String _str,String _separator,int _first) throws Exception{
String _parsed_str = "";
String _foundint = "";
int _indexofseperator = 0;
long _foundlong = 0L;
 //BA.debugLineNum = 310;BA.debugLine="Public Sub increment_string(str As String, separat";
 //BA.debugLineNum = 312;BA.debugLine="Dim parsed_str, foundInt As String =\"\"";
_parsed_str = "";
_foundint = "";
 //BA.debugLineNum = 313;BA.debugLine="Dim IndexOfSeperator  As Int = 0";
_indexofseperator = (int) (0);
 //BA.debugLineNum = 315;BA.debugLine="IndexOfSeperator = str.LastIndexOf(separator)  'f";
_indexofseperator = _str.lastIndexOf(_separator);
 //BA.debugLineNum = 317;BA.debugLine="If  IndexOfSeperator <> 0 Then";
if (_indexofseperator!=0) { 
 //BA.debugLineNum = 320;BA.debugLine="foundInt = str.SubString((IndexOfSeperator +1)";
_foundint = _str.substring((int) ((_indexofseperator+1)));
 //BA.debugLineNum = 324;BA.debugLine="If IsNumber(foundInt) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_foundint)) { 
 //BA.debugLineNum = 326;BA.debugLine="parsed_str = str.SubString2(0 , IndexOfSeperato";
_parsed_str = _str.substring((int) (0),_indexofseperator);
 //BA.debugLineNum = 331;BA.debugLine="Dim foundLong As Long = (foundInt + 1)";
_foundlong = (long) (((double)(Double.parseDouble(_foundint))+1));
 //BA.debugLineNum = 333;BA.debugLine="Return parsed_str & separator & foundLong";
if (true) return _parsed_str+_separator+BA.NumberToString(_foundlong);
 }else {
 //BA.debugLineNum = 338;BA.debugLine="Return str & separator & first";
if (true) return _str+_separator+BA.NumberToString(_first);
 };
 }else {
 //BA.debugLineNum = 345;BA.debugLine="Return str & separator & first";
if (true) return _str+_separator+BA.NumberToString(_first);
 };
 //BA.debugLineNum = 349;BA.debugLine="End Sub";
return "";
}
public static boolean  _vvvv7(String _emailaddress) throws Exception{
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matchemail = null;
 //BA.debugLineNum = 23;BA.debugLine="Public Sub IsEmail(EmailAddress As String) As Bool";
 //BA.debugLineNum = 25;BA.debugLine="Dim MatchEmail As Matcher = Regex.Matcher(\"^(?i)[";
_matchemail = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matchemail = anywheresoftware.b4a.keywords.Common.Regex.Matcher("^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$",_emailaddress);
 //BA.debugLineNum = 27;BA.debugLine="If MatchEmail.Find = True Then";
if (_matchemail.Find()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 28;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
 //BA.debugLineNum = 30;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return false;
}
public static boolean  _vvvv0(String _str) throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Public Sub isEmpty(str As String) As Boolean";
 //BA.debugLineNum = 17;BA.debugLine="Return (str.Trim = \"\")";
if (true) return ((_str.trim()).equals(""));
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return false;
}
public static boolean  _vvvvv1(String _c) throws Exception{
String _pattern = "";
 //BA.debugLineNum = 54;BA.debugLine="Public Sub IsLetter (c As String) As Boolean";
 //BA.debugLineNum = 56;BA.debugLine="Dim pattern As String = \"\\p{Alpha}\"";
_pattern = "\\p{Alpha}";
 //BA.debugLineNum = 57;BA.debugLine="If IsDevTool(\"B4J\") Then pattern = \"(?U)\" & patte";
if (anywheresoftware.b4a.keywords.Common.IsDevTool("B4J")) { 
_pattern = "(?U)"+_pattern;};
 //BA.debugLineNum = 59;BA.debugLine="Return Regex.IsMatch(pattern, c)";
if (true) return anywheresoftware.b4a.keywords.Common.Regex.IsMatch(_pattern,_c);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return false;
}
public static boolean  _vvvvv2(String _text) throws Exception{
String _pattern = "";
 //BA.debugLineNum = 65;BA.debugLine="Public Sub IsLetters (text As String) As Boolean";
 //BA.debugLineNum = 67;BA.debugLine="Dim pattern As String = \"\\p{Alpha}+\"";
_pattern = "\\p{Alpha}+";
 //BA.debugLineNum = 68;BA.debugLine="If IsDevTool(\"B4J\") Then pattern = \"(?U)\" & patte";
if (anywheresoftware.b4a.keywords.Common.IsDevTool("B4J")) { 
_pattern = "(?U)"+_pattern;};
 //BA.debugLineNum = 70;BA.debugLine="Return Regex.IsMatch(pattern, text)";
if (true) return anywheresoftware.b4a.keywords.Common.Regex.IsMatch(_pattern,_text);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return false;
}
public static boolean  _vvvvv3(Object _obj) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Public Sub isNull(obj As Object) As Boolean";
 //BA.debugLineNum = 10;BA.debugLine="Return (obj = Null)";
if (true) return (_obj== null);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return false;
}
public static boolean  _vvvvv4(String _text) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Public Sub isUrl (text As String) As Boolean";
 //BA.debugLineNum = 79;BA.debugLine="text = text.Trim";
_text = _text.trim();
 //BA.debugLineNum = 81;BA.debugLine="Return text.StartsWith(\"http://\") Or text.StartsW";
if (true) return _text.startsWith("http://") || _text.startsWith("https://");
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return false;
}
public static boolean  _vvvvv5(String _ip) throws Exception{
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
int _i = 0;
 //BA.debugLineNum = 37;BA.debugLine="Public Sub IsValidIp(ip As String) As Boolean";
 //BA.debugLineNum = 39;BA.debugLine="Dim m As Matcher";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
 //BA.debugLineNum = 40;BA.debugLine="m = Regex.Matcher(\"^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$\",";
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher("^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$",_ip);
 //BA.debugLineNum = 42;BA.debugLine="If m.Find = False Then Return False";
if (_m.Find()==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
 //BA.debugLineNum = 44;BA.debugLine="For i = 1 To 4";
{
final int step4 = 1;
final int limit4 = (int) (4);
_i = (int) (1) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 45;BA.debugLine="If m.Group(i) > 255 Or m.Group(i) < 0 Then Retur";
if ((double)(Double.parseDouble(_m.Group(_i)))>255 || (double)(Double.parseDouble(_m.Group(_i)))<0) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
 }
};
 //BA.debugLineNum = 48;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return false;
}
public static String  _vvvvv6(anywheresoftware.b4a.objects.collections.List _strlist,String _separator) throws Exception{
 //BA.debugLineNum = 388;BA.debugLine="Public Sub join(StrList As List,separator As Strin";
 //BA.debugLineNum = 390;BA.debugLine="Return implode(separator, StrList)";
if (true) return _vvvv6(_separator,_strlist);
 //BA.debugLineNum = 392;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvv7(String _str) throws Exception{
String _firstchar = "";
 //BA.debugLineNum = 424;BA.debugLine="Public Sub lcfirst(str As String) As String";
 //BA.debugLineNum = 426;BA.debugLine="Dim firstChar As String =\"\"";
_firstchar = "";
 //BA.debugLineNum = 427;BA.debugLine="firstChar= str.CharAt(0)";
_firstchar = BA.ObjectToString(_str.charAt((int) (0)));
 //BA.debugLineNum = 428;BA.debugLine="firstChar = firstChar.ToLowerCase";
_firstchar = _firstchar.toLowerCase();
 //BA.debugLineNum = 430;BA.debugLine="Return firstChar & str.SubString(1)";
if (true) return _firstchar+_str.substring((int) (1));
 //BA.debugLineNum = 432;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _vvvvv0(String _querystring) throws Exception{
anywheresoftware.b4a.objects.collections.Map _data = null;
anywheresoftware.b4a.objects.collections.List _temp_list = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.List _querylist = null;
 //BA.debugLineNum = 943;BA.debugLine="Public Sub parseQueryString(QueryString As String)";
 //BA.debugLineNum = 945;BA.debugLine="Dim Data As Map 'total data";
_data = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 946;BA.debugLine="Data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 948;BA.debugLine="Try";
try { //BA.debugLineNum = 951;BA.debugLine="Dim temp_list As List = Split(QueryString, \"&\")";
_temp_list = new anywheresoftware.b4a.objects.collections.List();
_temp_list = _vvvvvv4(_querystring,"&");
 //BA.debugLineNum = 953;BA.debugLine="For i = 0 To temp_list.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_temp_list.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 955;BA.debugLine="Dim QueryList As List = Split(temp_list.Get(i)";
_querylist = new anywheresoftware.b4a.objects.collections.List();
_querylist = _vvvvvv4(BA.ObjectToString(_temp_list.Get(_i)),"=");
 //BA.debugLineNum = 957;BA.debugLine="If Not(Data.ContainsKey(QueryList.Get(0))) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_data.ContainsKey(_querylist.Get((int) (0))))) { 
 //BA.debugLineNum = 959;BA.debugLine="Data.Put(QueryList.Get(0), QueryList.Get(1))";
_data.Put(_querylist.Get((int) (0)),_querylist.Get((int) (1)));
 };
 }
};
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 967;BA.debugLine="LogError(\"The parser for < parseQueryString() >";
anywheresoftware.b4a.keywords.Common.LogError("The parser for < parseQueryString() > got broken. Please check input data");
 };
 //BA.debugLineNum = 971;BA.debugLine="Return Data";
if (true) return _data;
 //BA.debugLineNum = 973;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _vvvvvv1(String _url) throws Exception{
 //BA.debugLineNum = 983;BA.debugLine="Public Sub parseQueryStringUrl(url As String) As M";
 //BA.debugLineNum = 985;BA.debugLine="url= breakStrAt(url, \"?\") ' Split URL from Query";
_url = BA.ObjectToString(_vvv5(_url,"?"));
 //BA.debugLineNum = 986;BA.debugLine="url =  trim_left_once(url, \"?\")";
_url = _trim_left_once(_url,"?");
 //BA.debugLineNum = 988;BA.debugLine="Return parseQueryString(url)";
if (true) return _vvvvv0(_url);
 //BA.debugLineNum = 990;BA.debugLine="End Sub";
return null;
}
public static String  _prep_url(String _str) throws Exception{
 //BA.debugLineNum = 473;BA.debugLine="Public Sub prep_url(str As String)  As String";
 //BA.debugLineNum = 475;BA.debugLine="str= str.Trim";
_str = _str.trim();
 //BA.debugLineNum = 477;BA.debugLine="If isEmpty(str) Or str.EqualsIgnoreCase(\"http://\"";
if (_vvvv0(_str) || _str.equalsIgnoreCase("http://")) { 
 //BA.debugLineNum = 479;BA.debugLine="Return  \"\"";
if (true) return "";
 }else {
 //BA.debugLineNum = 483;BA.debugLine="If Not(str.StartsWith(\"http://\")) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_str.startsWith("http://"))) { 
 //BA.debugLineNum = 485;BA.debugLine="Return \"http://\" & str";
if (true) return "http://"+_str;
 }else {
 //BA.debugLineNum = 489;BA.debugLine="Return str";
if (true) return _str;
 };
 };
 //BA.debugLineNum = 495;BA.debugLine="End Sub";
return "";
}
public static String  _prepend_zero(int _num) throws Exception{
 //BA.debugLineNum = 918;BA.debugLine="Public Sub prepend_zero(num As Int) As String";
 //BA.debugLineNum = 920;BA.debugLine="If num < 10 And num > 0 Then";
if (_num<10 && _num>0) { 
 //BA.debugLineNum = 922;BA.debugLine="Return \"0\" & num";
if (true) return "0"+BA.NumberToString(_num);
 }else {
 //BA.debugLineNum = 926;BA.debugLine="Return num";
if (true) return BA.NumberToString(_num);
 };
 //BA.debugLineNum = 930;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
_vvvvvvvvvvvvvvvv2 = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public static String  _quotes_to_entities(String _str) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Public Sub quotes_to_entities(str As String) As St";
 //BA.debugLineNum = 166;BA.debugLine="str = str.Replace(\"\\'\", \"&#39;\")";
_str = _str.replace("\\'","&#39;");
 //BA.debugLineNum = 167;BA.debugLine="str = str.Replace(\"\\\"\"\",\"&quot;\")";
_str = _str.replace("\\\"","&quot;");
 //BA.debugLineNum = 169;BA.debugLine="str = str.Replace(\"'\", \"&#39;\")";
_str = _str.replace("'","&#39;");
 //BA.debugLineNum = 170;BA.debugLine="str = str.Replace(\"\"\"\",\"&quot;\")";
_str = _str.replace("\"","&quot;");
 //BA.debugLineNum = 173;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return "";
}
public static Object  _vvvvvv2(anywheresoftware.b4a.objects.collections.List _listx) throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Public Sub RandListValue(ListX As List) As Object";
 //BA.debugLineNum = 222;BA.debugLine="Return ListX.Get(Rnd(0, ListX.Size -1))";
if (true) return _listx.Get(anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (_listx.getSize()-1)));
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public static String  _reduce_double_slashes(String _str) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Public Sub reduce_double_slashes(str As String) As";
 //BA.debugLineNum = 183;BA.debugLine="If str.ToLowerCase.StartsWith(\"http://\") Then";
if (_str.toLowerCase().startsWith("http://")) { 
 //BA.debugLineNum = 185;BA.debugLine="str = str.Replace(\"//\" ,\"/\")";
_str = _str.replace("//","/");
 //BA.debugLineNum = 186;BA.debugLine="str =  str.Replace(\"http:/\" ,\"http://\")  'fix ba";
_str = _str.replace("http:/","http://");
 }else {
 //BA.debugLineNum = 190;BA.debugLine="str = str.Replace(\"//\" ,\"/\")";
_str = _str.replace("//","/");
 };
 //BA.debugLineNum = 194;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return "";
}
public static String[]  _vvvvvv3(String[] _stringarray) throws Exception{
String _arrayval = "";
int _random = 0;
int _i = 0;
 //BA.debugLineNum = 205;BA.debugLine="Public Sub shuffleArray(StringArray() As String) A";
 //BA.debugLineNum = 207;BA.debugLine="Dim ArrayVal As String";
_arrayval = "";
 //BA.debugLineNum = 208;BA.debugLine="Dim Random As Int";
_random = 0;
 //BA.debugLineNum = 210;BA.debugLine="For i = 0 To StringArray.Length - 1";
{
final int step3 = 1;
final int limit3 = (int) (_stringarray.length-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 211;BA.debugLine="Random = Rnd(i, StringArray.Length)";
_random = anywheresoftware.b4a.keywords.Common.Rnd(_i,_stringarray.length);
 //BA.debugLineNum = 212;BA.debugLine="ArrayVal = StringArray(i)";
_arrayval = _stringarray[_i];
 //BA.debugLineNum = 213;BA.debugLine="StringArray(i) = StringArray(Random)";
_stringarray[_i] = _stringarray[_random];
 //BA.debugLineNum = 214;BA.debugLine="StringArray(Random) = ArrayVal";
_stringarray[_random] = _arrayval;
 }
};
 //BA.debugLineNum = 216;BA.debugLine="Return StringArray";
if (true) return _stringarray;
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _vvvvvv4(String _str,String _delimiter) throws Exception{
anywheresoftware.b4a.objects.collections.List _t = null;
 //BA.debugLineNum = 360;BA.debugLine="Sub Split(str As String, delimiter As String) As L";
 //BA.debugLineNum = 361;BA.debugLine="Dim t As List";
_t = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 362;BA.debugLine="t = Regex.Split(EscapeString(delimiter), str)";
_t = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split(_vvv0(_delimiter),_str));
 //BA.debugLineNum = 363;BA.debugLine="Return t";
if (true) return _t;
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return null;
}
public static String  _vvvvvv5(String _fmt,Object[] _arg) throws Exception{
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
 //BA.debugLineNum = 512;BA.debugLine="Public Sub Sprintf(fmt As String, arg() As Object)";
 //BA.debugLineNum = 513;BA.debugLine="Dim ai, fi, i As Int";
_ai = 0;
_fi = 0;
_i = 0;
 //BA.debugLineNum = 514;BA.debugLine="Dim exp, wid As Int";
_exp = 0;
_wid = 0;
 //BA.debugLineNum = 515;BA.debugLine="Dim stmp, ptmp, sres, c, t As String";
_stmp = "";
_ptmp = "";
_sres = "";
_c = "";
_t = "";
 //BA.debugLineNum = 516;BA.debugLine="Dim bdone As Boolean";
_bdone = false;
 //BA.debugLineNum = 518;BA.debugLine="ai = 0";
_ai = (int) (0);
 //BA.debugLineNum = 519;BA.debugLine="fi = 0";
_fi = (int) (0);
 //BA.debugLineNum = 520;BA.debugLine="stmp = \"\"";
_stmp = "";
 //BA.debugLineNum = 521;BA.debugLine="sres = \"\"";
_sres = "";
 //BA.debugLineNum = 523;BA.debugLine="Do While (fi < fmt.Length)";
while ((_fi<_fmt.length())) {
 //BA.debugLineNum = 524;BA.debugLine="c = fmt.CharAt(fi)";
_c = BA.ObjectToString(_fmt.charAt(_fi));
 //BA.debugLineNum = 525;BA.debugLine="fi = fi + 1";
_fi = (int) (_fi+1);
 //BA.debugLineNum = 527;BA.debugLine="If (c = \"%\") Then";
if (((_c).equals("%"))) { 
 //BA.debugLineNum = 528;BA.debugLine="stmp = \"\"";
_stmp = "";
 //BA.debugLineNum = 529;BA.debugLine="ptmp = \"\"";
_ptmp = "";
 //BA.debugLineNum = 530;BA.debugLine="bdone = False";
_bdone = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 532;BA.debugLine="Do While ((fi < fmt.Length) And (bdone = False)";
while (((_fi<_fmt.length()) && (_bdone==anywheresoftware.b4a.keywords.Common.False))) {
 //BA.debugLineNum = 533;BA.debugLine="c = fmt.CharAt(fi)";
_c = BA.ObjectToString(_fmt.charAt(_fi));
 //BA.debugLineNum = 534;BA.debugLine="fi = fi + 1";
_fi = (int) (_fi+1);
 //BA.debugLineNum = 536;BA.debugLine="If ((IsNumber(c) = True) Or (c = \".\")) Then";
if (((anywheresoftware.b4a.keywords.Common.IsNumber(_c)==anywheresoftware.b4a.keywords.Common.True) || ((_c).equals(".")))) { 
 //BA.debugLineNum = 537;BA.debugLine="ptmp = ptmp & c";
_ptmp = _ptmp+_c;
 //BA.debugLineNum = 538;BA.debugLine="bdone = False";
_bdone = anywheresoftware.b4a.keywords.Common.False;
 }else if(((_c).equals("s"))) { 
 //BA.debugLineNum = 540;BA.debugLine="stmp = arg(ai)";
_stmp = BA.ObjectToString(_arg[_ai]);
 //BA.debugLineNum = 541;BA.debugLine="ai = ai + 1";
_ai = (int) (_ai+1);
 //BA.debugLineNum = 542;BA.debugLine="sres = sres & stmp";
_sres = _sres+_stmp;
 //BA.debugLineNum = 543;BA.debugLine="bdone = True";
_bdone = anywheresoftware.b4a.keywords.Common.True;
 }else if(((_c).equals("d"))) { 
 //BA.debugLineNum = 545;BA.debugLine="If (ptmp.Length > 0) Then";
if ((_ptmp.length()>0)) { 
 //BA.debugLineNum = 546;BA.debugLine="t = \" \"";
_t = " ";
 //BA.debugLineNum = 547;BA.debugLine="If (ptmp.CharAt(0) = \"0\") Then";
if ((_ptmp.charAt((int) (0))==BA.ObjectToChar("0"))) { 
 //BA.debugLineNum = 548;BA.debugLine="t = \"0\"";
_t = "0";
 //BA.debugLineNum = 549;BA.debugLine="ptmp = ptmp.SubString(1)";
_ptmp = _ptmp.substring((int) (1));
 };
 };
 //BA.debugLineNum = 553;BA.debugLine="If (ptmp.Length > 0) Then wid = ptmp Else wid";
if ((_ptmp.length()>0)) { 
_wid = (int)(Double.parseDouble(_ptmp));}
else {
_wid = (int) (0);};
 //BA.debugLineNum = 555;BA.debugLine="stmp = arg(ai)";
_stmp = BA.ObjectToString(_arg[_ai]);
 //BA.debugLineNum = 557;BA.debugLine="Do While (stmp.Length < wid)";
while ((_stmp.length()<_wid)) {
 //BA.debugLineNum = 558;BA.debugLine="stmp = t & stmp";
_stmp = _t+_stmp;
 }
;
 //BA.debugLineNum = 561;BA.debugLine="ai = ai + 1";
_ai = (int) (_ai+1);
 //BA.debugLineNum = 562;BA.debugLine="sres = sres & stmp";
_sres = _sres+_stmp;
 //BA.debugLineNum = 563;BA.debugLine="bdone = True";
_bdone = anywheresoftware.b4a.keywords.Common.True;
 }else if(((_c).equals("f"))) { 
 //BA.debugLineNum = 565;BA.debugLine="If (ptmp.Length > 0) Then";
if ((_ptmp.length()>0)) { 
 //BA.debugLineNum = 566;BA.debugLine="i = ptmp.IndexOf(\".\")";
_i = _ptmp.indexOf(".");
 //BA.debugLineNum = 567;BA.debugLine="If (i >= 0) Then";
if ((_i>=0)) { 
 //BA.debugLineNum = 568;BA.debugLine="wid = ptmp.SubString2(0, i)";
_wid = (int)(Double.parseDouble(_ptmp.substring((int) (0),_i)));
 //BA.debugLineNum = 569;BA.debugLine="exp = ptmp.SubString(i+1)";
_exp = (int)(Double.parseDouble(_ptmp.substring((int) (_i+1))));
 }else {
 //BA.debugLineNum = 571;BA.debugLine="wid = ptmp";
_wid = (int)(Double.parseDouble(_ptmp));
 //BA.debugLineNum = 572;BA.debugLine="exp = 0";
_exp = (int) (0);
 };
 //BA.debugLineNum = 575;BA.debugLine="stmp = NumberFormat(arg(ai), wid, exp)";
_stmp = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_arg[_ai])),_wid,_exp);
 }else {
 //BA.debugLineNum = 577;BA.debugLine="stmp = arg(ai)";
_stmp = BA.ObjectToString(_arg[_ai]);
 };
 //BA.debugLineNum = 580;BA.debugLine="ai = ai + 1";
_ai = (int) (_ai+1);
 //BA.debugLineNum = 581;BA.debugLine="sres = sres & stmp";
_sres = _sres+_stmp;
 //BA.debugLineNum = 582;BA.debugLine="bdone = True";
_bdone = anywheresoftware.b4a.keywords.Common.True;
 }else {
 //BA.debugLineNum = 584;BA.debugLine="ai = ai + 1";
_ai = (int) (_ai+1);
 };
 }
;
 }else {
 //BA.debugLineNum = 589;BA.debugLine="sres = sres & c";
_sres = _sres+_c;
 };
 }
;
 //BA.debugLineNum = 593;BA.debugLine="Return(sres)";
if (true) return (_sres);
 //BA.debugLineNum = 595;BA.debugLine="End Sub";
return "";
}
public static String  _str_repeat(String _input,int _multiplier) throws Exception{
String _result = "";
int _i = 0;
 //BA.debugLineNum = 675;BA.debugLine="Sub str_repeat(input As String, multiplier As Int)";
 //BA.debugLineNum = 677;BA.debugLine="If multiplier < 1 Then";
if (_multiplier<1) { 
 //BA.debugLineNum = 679;BA.debugLine="Return \"\"";
if (true) return "";
 }else {
 //BA.debugLineNum = 683;BA.debugLine="Dim result As String = \"\"";
_result = "";
 //BA.debugLineNum = 685;BA.debugLine="For i = 0 To multiplier - 1";
{
final int step5 = 1;
final int limit5 = (int) (_multiplier-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 687;BA.debugLine="result = result & input";
_result = _result+_input;
 }
};
 //BA.debugLineNum = 691;BA.debugLine="Return result";
if (true) return _result;
 };
 //BA.debugLineNum = 695;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _str_split(String _str,int _splitlength) throws Exception{
anywheresoftware.b4a.objects.collections.List _chunks = null;
int _divval = 0;
int _i = 0;
int _nextval = 0;
 //BA.debugLineNum = 752;BA.debugLine="Public Sub str_split (str As String, splitLength A";
 //BA.debugLineNum = 754;BA.debugLine="Dim chunks As List";
_chunks = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 755;BA.debugLine="chunks.Initialize";
_chunks.Initialize();
 //BA.debugLineNum = 757;BA.debugLine="If (isEmpty(str) Or splitLength < 1)  Then";
if ((_vvvv0(_str) || _splitlength<1)) { 
 //BA.debugLineNum = 759;BA.debugLine="Return chunks 'empty list";
if (true) return _chunks;
 }else if(_splitlength==_str.length()) { 
 //BA.debugLineNum = 763;BA.debugLine="chunks.Add(str)";
_chunks.Add((Object)(_str));
 //BA.debugLineNum = 764;BA.debugLine="Return chunks";
if (true) return _chunks;
 };
 //BA.debugLineNum = 768;BA.debugLine="Dim DivVal As Int  =  str.Length / splitLength";
_divval = (int) (_str.length()/(double)_splitlength);
 //BA.debugLineNum = 770;BA.debugLine="For i = 0 To DivVal";
{
final int step10 = 1;
final int limit10 = _divval;
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
 //BA.debugLineNum = 772;BA.debugLine="Dim nextVal As Int = i * splitLength";
_nextval = (int) (_i*_splitlength);
 //BA.debugLineNum = 774;BA.debugLine="If i = DivVal Then";
if (_i==_divval) { 
 //BA.debugLineNum = 777;BA.debugLine="chunks.add( str.SubString( nextVal))";
_chunks.Add((Object)(_str.substring(_nextval)));
 }else {
 //BA.debugLineNum = 782;BA.debugLine="chunks.add( str.SubString2( nextVal , nextVal +";
_chunks.Add((Object)(_str.substring(_nextval,(int) (_nextval+_splitlength))));
 };
 }
};
 //BA.debugLineNum = 788;BA.debugLine="Return chunks";
if (true) return _chunks;
 //BA.debugLineNum = 790;BA.debugLine="End Sub";
return null;
}
public static String  _vvvvvv6(String _text) throws Exception{
 //BA.debugLineNum = 662;BA.debugLine="Public Sub String2Ascii(text As String) As String";
 //BA.debugLineNum = 665;BA.debugLine="Return String2AsciiWithSeperator(text, \"\")";
if (true) return _vvvvvv7(_text,"");
 //BA.debugLineNum = 667;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvv7(String _text,String _seperator) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _result = null;
int _i = 0;
 //BA.debugLineNum = 646;BA.debugLine="Public Sub String2AsciiWithSeperator(text As Strin";
 //BA.debugLineNum = 648;BA.debugLine="Dim result As StringBuilder";
_result = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 649;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 651;BA.debugLine="For i = 0 To text.Length - 1";
{
final int step3 = 1;
final int limit3 = (int) (_text.length()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 653;BA.debugLine="result.Append(Asc(text.CharAt(i)) & seperator)";
_result.Append(BA.NumberToString(anywheresoftware.b4a.keywords.Common.Asc(_text.charAt(_i)))+_seperator);
 }
};
 //BA.debugLineNum = 657;BA.debugLine="Return result.ToString.Trim";
if (true) return _result.ToString().trim();
 //BA.debugLineNum = 659;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvv0(String[] _strarray) throws Exception{
String _result = "";
String _str = "";
 //BA.debugLineNum = 290;BA.debugLine="Public Sub StringArray2String(StrArray() As String";
 //BA.debugLineNum = 292;BA.debugLine="Dim result As String =\"\"";
_result = "";
 //BA.debugLineNum = 293;BA.debugLine="For Each str As String In StrArray 'an array";
{
final String[] group2 = _strarray;
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_str = group2[index2];
 //BA.debugLineNum = 294;BA.debugLine="result = result & str";
_result = _result+_str;
 }
};
 //BA.debugLineNum = 297;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return "";
}
public static String  _strip_quotes(String _str) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Public Sub strip_quotes(str As String) As String";
 //BA.debugLineNum = 157;BA.debugLine="str = str.Replace(\"'\", \"\")";
_str = _str.replace("'","");
 //BA.debugLineNum = 158;BA.debugLine="str = str.Replace(\"\"\"\",\"\")";
_str = _str.replace("\"","");
 //BA.debugLineNum = 159;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return "";
}
public static int  _vvvvvvv1(String _haystack,String _find) throws Exception{
 //BA.debugLineNum = 827;BA.debugLine="Public Sub stripos(haystack As String , find As St";
 //BA.debugLineNum = 829;BA.debugLine="haystack = haystack.ToLowerCase";
_haystack = _haystack.toLowerCase();
 //BA.debugLineNum = 830;BA.debugLine="find = find.ToLowerCase";
_find = _find.toLowerCase();
 //BA.debugLineNum = 832;BA.debugLine="Return haystack.IndexOf(find)";
if (true) return _haystack.indexOf(_find);
 //BA.debugLineNum = 834;BA.debugLine="End Sub";
return 0;
}
public static int  _vvvvvvv2(String _haystack,String _find,int _start) throws Exception{
 //BA.debugLineNum = 843;BA.debugLine="Public Sub stripos2(haystack As String , find As S";
 //BA.debugLineNum = 845;BA.debugLine="haystack = haystack.ToLowerCase";
_haystack = _haystack.toLowerCase();
 //BA.debugLineNum = 846;BA.debugLine="find = find.ToLowerCase";
_find = _find.toLowerCase();
 //BA.debugLineNum = 848;BA.debugLine="Return haystack.IndexOf2(find, start)";
if (true) return _haystack.indexOf(_find,_start);
 //BA.debugLineNum = 850;BA.debugLine="End Sub";
return 0;
}
public static Object  _vvvvvvv3(String _haystack,String _charlist) throws Exception{
int _i = 0;
 //BA.debugLineNum = 718;BA.debugLine="Public Sub strpbrk(haystack As String, charList As";
 //BA.debugLineNum = 720;BA.debugLine="For i = 0 To haystack.Length - 1";
{
final int step1 = 1;
final int limit1 = (int) (_haystack.length()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 722;BA.debugLine="If charList.IndexOf(haystack.CharAt(i)) >= 0 Th";
if (_charlist.indexOf(BA.ObjectToString(_haystack.charAt(_i)))>=0) { 
 //BA.debugLineNum = 724;BA.debugLine="Return haystack.SubString(i)";
if (true) return (Object)(_haystack.substring(_i));
 };
 }
};
 //BA.debugLineNum = 730;BA.debugLine="Return False";
if (true) return (Object)(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 732;BA.debugLine="End Sub";
return null;
}
public static int  _vvvvvvv4(String _haystack,String _find) throws Exception{
 //BA.debugLineNum = 801;BA.debugLine="Public Sub strpos(haystack As String , find As Str";
 //BA.debugLineNum = 803;BA.debugLine="Return haystack.IndexOf(find)";
if (true) return _haystack.indexOf(_find);
 //BA.debugLineNum = 805;BA.debugLine="End Sub";
return 0;
}
public static int  _vvvvvvv5(String _haystack,String _find,int _start) throws Exception{
 //BA.debugLineNum = 814;BA.debugLine="Public Sub strpos2(haystack As String , find As St";
 //BA.debugLineNum = 816;BA.debugLine="Return haystack.IndexOf2(find, start)";
if (true) return _haystack.indexOf(_find,_start);
 //BA.debugLineNum = 818;BA.debugLine="End Sub";
return 0;
}
public static int  _vvvvvvv6(String _haystack,String _find) throws Exception{
 //BA.debugLineNum = 889;BA.debugLine="Public Sub strripos(haystack As String , find As S";
 //BA.debugLineNum = 891;BA.debugLine="haystack = haystack.ToLowerCase";
_haystack = _haystack.toLowerCase();
 //BA.debugLineNum = 892;BA.debugLine="find = find.ToLowerCase";
_find = _find.toLowerCase();
 //BA.debugLineNum = 894;BA.debugLine="Return haystack.LastIndexOf(find)";
if (true) return _haystack.lastIndexOf(_find);
 //BA.debugLineNum = 896;BA.debugLine="End Sub";
return 0;
}
public static int  _vvvvvvv7(String _haystack,String _find,int _start) throws Exception{
 //BA.debugLineNum = 905;BA.debugLine="Public Sub strripos2 (haystack As String , find As";
 //BA.debugLineNum = 907;BA.debugLine="haystack = haystack.ToLowerCase";
_haystack = _haystack.toLowerCase();
 //BA.debugLineNum = 908;BA.debugLine="find = find.ToLowerCase";
_find = _find.toLowerCase();
 //BA.debugLineNum = 910;BA.debugLine="Return haystack.LastIndexOf2(find, start)";
if (true) return _haystack.lastIndexOf(_find,_start);
 //BA.debugLineNum = 912;BA.debugLine="End Sub";
return 0;
}
public static int  _vvvvvvv0(String _haystack,String _find) throws Exception{
 //BA.debugLineNum = 863;BA.debugLine="Public Sub strrpos(haystack As String , find As St";
 //BA.debugLineNum = 865;BA.debugLine="Return haystack.LastIndexOf(find)";
if (true) return _haystack.lastIndexOf(_find);
 //BA.debugLineNum = 867;BA.debugLine="End Sub";
return 0;
}
public static int  _vvvvvvvv1(String _haystack,String _find,int _start) throws Exception{
 //BA.debugLineNum = 876;BA.debugLine="Public Sub strrpos2(haystack As String , find As S";
 //BA.debugLineNum = 878;BA.debugLine="Return haystack.LastIndexOf2(find, start)";
if (true) return _haystack.lastIndexOf(_find,_start);
 //BA.debugLineNum = 880;BA.debugLine="End Sub";
return 0;
}
public static anywheresoftware.b4a.objects.collections.List  _vvvvvvvv2(String _str) throws Exception{
anywheresoftware.b4a.objects.collections.List _result = null;
int _i = 0;
 //BA.debugLineNum = 736;BA.debugLine="Public Sub strToStrList(str As String) As List";
 //BA.debugLineNum = 738;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 739;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 741;BA.debugLine="For i = 0 To str.Length - 1";
{
final int step3 = 1;
final int limit3 = (int) (_str.length()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 743;BA.debugLine="result.Add(str.CharAt(i))";
_result.Add((Object)(_str.charAt(_i)));
 }
};
 //BA.debugLineNum = 747;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 749;BA.debugLine="End Sub";
return null;
}
public static String  _trim_left_once(String _str,String _character) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Public Sub trim_left_once(str As String, character";
 //BA.debugLineNum = 110;BA.debugLine="If isEmpty(character) Then";
if (_vvvv0(_character)) { 
 //BA.debugLineNum = 112;BA.debugLine="character = \" \" 'empty space";
_character = " ";
 };
 //BA.debugLineNum = 116;BA.debugLine="If str.StartsWith(character) Then";
if (_str.startsWith(_character)) { 
 //BA.debugLineNum = 118;BA.debugLine="str = str.SubString(1)";
_str = _str.substring((int) (1));
 };
 //BA.debugLineNum = 122;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public static String  _trim_once(String _str,String _character) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Public Sub trim_once(str As String, character As S";
 //BA.debugLineNum = 100;BA.debugLine="str = trim_left_once(str, character)";
_str = _trim_left_once(_str,_character);
 //BA.debugLineNum = 101;BA.debugLine="str = trim_right_once(str, character)";
_str = _trim_right_once(_str,_character);
 //BA.debugLineNum = 103;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public static String  _trim_right_once(String _str,String _character) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Public Sub trim_right_once(str As String, characte";
 //BA.debugLineNum = 129;BA.debugLine="If isEmpty(character) Then";
if (_vvvv0(_character)) { 
 //BA.debugLineNum = 131;BA.debugLine="character = \" \" 'empty space";
_character = " ";
 };
 //BA.debugLineNum = 135;BA.debugLine="If str.EndsWith(character) Then";
if (_str.endsWith(_character)) { 
 //BA.debugLineNum = 137;BA.debugLine="str = str.SubString2(0, str.Length - 1)";
_str = _str.substring((int) (0),(int) (_str.length()-1));
 };
 //BA.debugLineNum = 141;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public static String  _trim_slashes_once(String _str) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Public Sub trim_slashes_once(str As String) As Str";
 //BA.debugLineNum = 150;BA.debugLine="Return trim_once( str, \"/\")";
if (true) return _trim_once(_str,"/");
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvv3(String _txt,int _length) throws Exception{
 //BA.debugLineNum = 996;BA.debugLine="Public Sub Truncate(txt As String, length As Int)";
 //BA.debugLineNum = 1001;BA.debugLine="If length > txt.Length Then";
if (_length>_txt.length()) { 
 //BA.debugLineNum = 1003;BA.debugLine="Return txt";
if (true) return _txt;
 }else {
 //BA.debugLineNum = 1007;BA.debugLine="Return txt.Substring2(0, length)";
if (true) return _txt.substring((int) (0),_length);
 };
 //BA.debugLineNum = 1011;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvv4(String _str) throws Exception{
String _firstchar = "";
 //BA.debugLineNum = 413;BA.debugLine="Public Sub ucfirst(str As String) As String";
 //BA.debugLineNum = 415;BA.debugLine="Dim firstChar As String =\"\"";
_firstchar = "";
 //BA.debugLineNum = 416;BA.debugLine="firstChar= str.CharAt(0)";
_firstchar = BA.ObjectToString(_str.charAt((int) (0)));
 //BA.debugLineNum = 417;BA.debugLine="firstChar = firstChar.ToUpperCase";
_firstchar = _firstchar.toUpperCase();
 //BA.debugLineNum = 419;BA.debugLine="Return firstChar & str.SubString(1)";
if (true) return _firstchar+_str.substring((int) (1));
 //BA.debugLineNum = 421;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvv5(String _str) throws Exception{
String _result = "";
String _txt = "";
String _firstchar = "";
 //BA.debugLineNum = 396;BA.debugLine="Public Sub ucwords(str As String) As String";
 //BA.debugLineNum = 398;BA.debugLine="Dim result As String =\"\"";
_result = "";
 //BA.debugLineNum = 400;BA.debugLine="For Each txt As String In explode(\" \", str)";
{
final anywheresoftware.b4a.BA.IterableList group2 = _vvvv1(" ",_str);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_txt = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 401;BA.debugLine="Dim firstChar As String =\"\"";
_firstchar = "";
 //BA.debugLineNum = 402;BA.debugLine="firstChar= txt.CharAt(0)";
_firstchar = BA.ObjectToString(_txt.charAt((int) (0)));
 //BA.debugLineNum = 403;BA.debugLine="firstChar = firstChar.ToUpperCase";
_firstchar = _firstchar.toUpperCase();
 //BA.debugLineNum = 405;BA.debugLine="result = result & firstChar & txt.SubString(1) &";
_result = _result+_firstchar+_txt.substring((int) (1))+" ";
 }
};
 //BA.debugLineNum = 408;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 410;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvv6(String _str) throws Exception{
 //BA.debugLineNum = 457;BA.debugLine="Public Sub underscore(str As String)  As String";
 //BA.debugLineNum = 459;BA.debugLine="str= str.ToLowerCase";
_str = _str.toLowerCase();
 //BA.debugLineNum = 460;BA.debugLine="Return str.Replace(\" \",  \"_\")";
if (true) return _str.replace(" ","_");
 //BA.debugLineNum = 462;BA.debugLine="End Sub";
return "";
}
public static String  _word_wrap(String _str,int _limit) throws Exception{
int _divval = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _stringbuild = null;
int _i = 0;
int _nextval = 0;
 //BA.debugLineNum = 602;BA.debugLine="Sub word_wrap(str As String, limit As Int) As Stri";
 //BA.debugLineNum = 604;BA.debugLine="str = str.Trim";
_str = _str.trim();
 //BA.debugLineNum = 606;BA.debugLine="If str.Length = limit Then";
if (_str.length()==_limit) { 
 //BA.debugLineNum = 608;BA.debugLine="Return str";
if (true) return _str;
 }else {
 //BA.debugLineNum = 612;BA.debugLine="Dim DivVal As Int";
_divval = 0;
 //BA.debugLineNum = 614;BA.debugLine="Dim stringBuild As StringBuilder";
_stringbuild = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 615;BA.debugLine="stringBuild.Initialize";
_stringbuild.Initialize();
 //BA.debugLineNum = 617;BA.debugLine="DivVal =  str.Length / limit";
_divval = (int) (_str.length()/(double)_limit);
 //BA.debugLineNum = 619;BA.debugLine="For i = 0 To DivVal";
{
final int step9 = 1;
final int limit9 = _divval;
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 621;BA.debugLine="Dim nextVal As Int = i * limit";
_nextval = (int) (_i*_limit);
 //BA.debugLineNum = 623;BA.debugLine="If i = DivVal Then";
if (_i==_divval) { 
 //BA.debugLineNum = 626;BA.debugLine="stringBuild.Append( str.SubString( nextVal).Tr";
_stringbuild.Append(_str.substring(_nextval).trim());
 }else {
 //BA.debugLineNum = 631;BA.debugLine="stringBuild.Append( str.SubString2( nextVal ,";
_stringbuild.Append(_str.substring(_nextval,(int) (_nextval+_limit)).trim());
 //BA.debugLineNum = 632;BA.debugLine="stringBuild.Append( CRLF)";
_stringbuild.Append(anywheresoftware.b4a.keywords.Common.CRLF);
 };
 }
};
 //BA.debugLineNum = 638;BA.debugLine="Return stringBuild.ToString";
if (true) return _stringbuild.ToString();
 };
 //BA.debugLineNum = 642;BA.debugLine="End Sub";
return "";
}
}
