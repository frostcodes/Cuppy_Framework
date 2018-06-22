package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class stringutility extends Object{
public static stringutility mostCurrent = new stringutility();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.stringutility", null);
		ba.loadHtSubs(stringutility.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "Punchline.Tech.Cuppy.Framework.stringutility", ba);
		}
	}
    public static Class<?> getObject() {
		return stringutility.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static b4j.example.cssutils _cssutils = null;
public static Punchline.Tech.Cuppy.Framework.configs _configs = null;
public static Punchline.Tech.Cuppy.Framework.componentsmanager _componentsmanager = null;
public static Punchline.Tech.Cuppy.Framework.stylemanager _stylemanager = null;
public static Punchline.Tech.Cuppy.Framework.controlsutils _controlsutils = null;
public static Punchline.Tech.Cuppy.Framework.cuppyglobals _cuppyglobals = null;
public static Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public static Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public static Punchline.Tech.Cuppy.Framework.fileutility _fileutility = null;
public static String  _camelize(String _str) throws Exception{
String _firstchar = "";
String _result = "";
String _txt = "";
 //BA.debugLineNum = 390;BA.debugLine="Public Sub camelize(str As String)  As String";
 //BA.debugLineNum = 391;BA.debugLine="Dim firstChar, result As String =\"\"";
_firstchar = "";
_result = "";
 //BA.debugLineNum = 393;BA.debugLine="str= str.Replace(\" \", \"_\") 'make all spaces _";
_str = _str.replace(" ","_");
 //BA.debugLineNum = 395;BA.debugLine="firstChar = str.CharAt(0)";
_firstchar = BA.ObjectToString(_str.charAt((int) (0)));
 //BA.debugLineNum = 396;BA.debugLine="firstChar = firstChar.ToLowerCase";
_firstchar = _firstchar.toLowerCase();
 //BA.debugLineNum = 398;BA.debugLine="For Each txt As String In explode(\"_\", str)";
{
final anywheresoftware.b4a.BA.IterableList group5 = _explode("_",_str);
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_txt = BA.ObjectToString(group5.Get(index5));
 //BA.debugLineNum = 399;BA.debugLine="result = result & ucfirst(txt)";
_result = _result+_ucfirst(_txt);
 }
};
 //BA.debugLineNum = 402;BA.debugLine="Return firstChar & result.SubString(1)";
if (true) return _firstchar+_result.substring((int) (1));
 //BA.debugLineNum = 404;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _explode(String _delimiter,String _str) throws Exception{
anywheresoftware.b4a.objects.collections.List _result = null;
int _delimiterindex = 0;
String _leftside = "";
String _rightside = "";
 //BA.debugLineNum = 320;BA.debugLine="Public Sub explode(delimiter As String ,  str As S";
 //BA.debugLineNum = 322;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 323;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 325;BA.debugLine="Dim delimiterIndex As Int";
_delimiterindex = 0;
 //BA.debugLineNum = 326;BA.debugLine="delimiterIndex=str.IndexOf(delimiter)";
_delimiterindex = _str.indexOf(_delimiter);
 //BA.debugLineNum = 328;BA.debugLine="Do While delimiterIndex >-1";
while (_delimiterindex>-1) {
 //BA.debugLineNum = 329;BA.debugLine="Dim LeftSide As String : LeftSide= str.SubString";
_leftside = "";
 //BA.debugLineNum = 329;BA.debugLine="Dim LeftSide As String : LeftSide= str.SubString";
_leftside = _str.substring((int) (0),_delimiterindex);
 //BA.debugLineNum = 330;BA.debugLine="Dim RightSide As String :RightSide= str.SubStrin";
_rightside = "";
 //BA.debugLineNum = 330;BA.debugLine="Dim RightSide As String :RightSide= str.SubStrin";
_rightside = _str.substring((int) (_delimiterindex+1));
 //BA.debugLineNum = 331;BA.debugLine="result.Add(LeftSide)";
_result.Add((Object)(_leftside));
 //BA.debugLineNum = 332;BA.debugLine="str=RightSide";
_str = _rightside;
 //BA.debugLineNum = 333;BA.debugLine="delimiterIndex=str.IndexOf(delimiter)";
_delimiterindex = _str.indexOf(_delimiter);
 }
;
 //BA.debugLineNum = 336;BA.debugLine="result.Add(str)";
_result.Add((Object)(_str));
 //BA.debugLineNum = 338;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return null;
}
public static int  _generatepincode(int _pinlength) throws Exception{
String _result = "";
String[] _randomarray = null;
int _i = 0;
 //BA.debugLineNum = 234;BA.debugLine="Public Sub generatePinCode(PinLength As Int) As I";
 //BA.debugLineNum = 236;BA.debugLine="Dim result As String =\"\"";
_result = "";
 //BA.debugLineNum = 237;BA.debugLine="Dim RandomArray() As String = Array As String(1,2";
_randomarray = new String[]{BA.NumberToString(1),BA.NumberToString(2),BA.NumberToString(3),BA.NumberToString(4),BA.NumberToString(5),BA.NumberToString(6),BA.NumberToString(7),BA.NumberToString(8),BA.NumberToString(9),BA.NumberToString(0)};
 //BA.debugLineNum = 239;BA.debugLine="For i = 0 To PinLength - 1";
{
final int step3 = 1;
final int limit3 = (int) (_pinlength-1);
_i = (int) (0) ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
 //BA.debugLineNum = 241;BA.debugLine="result = result &  RandomArray( Rnd( 0, Rnd(2, R";
_result = _result+_randomarray[anywheresoftware.b4a.keywords.Common.Rnd((int) (0),anywheresoftware.b4a.keywords.Common.Rnd((int) (2),(int) (_randomarray.length-1)))];
 }
};
 //BA.debugLineNum = 245;BA.debugLine="Return  result";
if (true) return (int)(Double.parseDouble(_result));
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return 0;
}
public static String  _generaterandomstring(int _strlength) throws Exception{
String _rndstring = "";
int _rndnumber = 0;
 //BA.debugLineNum = 196;BA.debugLine="Public Sub generateRandomString(StrLength As Int)";
 //BA.debugLineNum = 197;BA.debugLine="Dim RndString As String";
_rndstring = "";
 //BA.debugLineNum = 198;BA.debugLine="Dim RndNumber As Int";
_rndnumber = 0;
 //BA.debugLineNum = 199;BA.debugLine="Do While RndString.Length < StrLength";
while (_rndstring.length()<_strlength) {
 //BA.debugLineNum = 200;BA.debugLine="RndNumber = Rnd(48,123) 'Yep, 123, because the l";
_rndnumber = anywheresoftware.b4a.keywords.Common.Rnd((int) (48),(int) (123));
 //BA.debugLineNum = 201;BA.debugLine="If (RndNumber >= 48 And RndNumber <= 57) Or (Rnd";
if ((_rndnumber>=48 && _rndnumber<=57) || (_rndnumber>=65 && _rndnumber<=90) || (_rndnumber>=97 && _rndnumber<=112)) { 
 //BA.debugLineNum = 202;BA.debugLine="RndString = RndString & Chr(RndNumber)";
_rndstring = _rndstring+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr(_rndnumber));
 };
 }
;
 //BA.debugLineNum = 205;BA.debugLine="Return RndString";
if (true) return _rndstring;
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return "";
}
public static String  _generaterandomstring2(int _strlength) throws Exception{
String[] _randomarray = null;
String _result = "";
 //BA.debugLineNum = 213;BA.debugLine="Public Sub generateRandomString2(StrLength As Int)";
 //BA.debugLineNum = 215;BA.debugLine="Dim RandomArray() As String = Array As String(\"!\"";
_randomarray = new String[]{"!","@","#","$","%"};
 //BA.debugLineNum = 216;BA.debugLine="Dim result As String";
_result = "";
 //BA.debugLineNum = 219;BA.debugLine="result =  StringArray2String(shuffleArray(RandomA";
_result = _stringarray2string(_shufflearray(_randomarray));
 //BA.debugLineNum = 220;BA.debugLine="result = result  & generateRandomString( Floor( S";
_result = _result+_generaterandomstring((int) (anywheresoftware.b4a.keywords.Common.Floor(_strlength/(double)2)));
 //BA.debugLineNum = 221;BA.debugLine="result = result  & StringArray2String(shuffleArra";
_result = _result+_stringarray2string(_shufflearray(_randomarray));
 //BA.debugLineNum = 222;BA.debugLine="result = result  & generateRandomString( Floor( S";
_result = _result+_generaterandomstring((int) (anywheresoftware.b4a.keywords.Common.Floor(_strlength/(double)2)));
 //BA.debugLineNum = 225;BA.debugLine="Return  result.SubString2( result.Length - StrLen";
if (true) return _result.substring((int) (_result.length()-_strlength),_result.length());
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return "";
}
public static String  _humanize(String _str,String _separator) throws Exception{
 //BA.debugLineNum = 416;BA.debugLine="Public Sub humanize(str As String, separator As St";
 //BA.debugLineNum = 418;BA.debugLine="str= str.ToLowerCase";
_str = _str.toLowerCase();
 //BA.debugLineNum = 419;BA.debugLine="Return ucwords(str.Replace(separator, \" \"))";
if (true) return _ucwords(_str.replace(_separator," "));
 //BA.debugLineNum = 421;BA.debugLine="End Sub";
return "";
}
public static String  _implode(String _separator,anywheresoftware.b4a.objects.collections.List _strlist) throws Exception{
String _result = "";
String _str = "";
 //BA.debugLineNum = 343;BA.debugLine="Public Sub implode(separator As String, StrList As";
 //BA.debugLineNum = 344;BA.debugLine="Dim result As String =\"\"";
_result = "";
 //BA.debugLineNum = 346;BA.debugLine="For Each str As String In StrList 'an array";
{
final anywheresoftware.b4a.BA.IterableList group2 = _strlist;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_str = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 347;BA.debugLine="result = result & str & separator";
_result = _result+_str+_separator;
 }
};
 //BA.debugLineNum = 350;BA.debugLine="Return trim_once(result, separator) ' trim separa";
if (true) return _trim_once(_result,_separator);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return "";
}
public static String  _increment_string(String _str,String _separator,int _first) throws Exception{
String _parsed_str = "";
String _foundint = "";
int _indexofseperator = 0;
long _foundlong = 0L;
 //BA.debugLineNum = 278;BA.debugLine="Public Sub increment_string(str As String, separat";
 //BA.debugLineNum = 280;BA.debugLine="Dim parsed_str, foundInt As String =\"\"";
_parsed_str = "";
_foundint = "";
 //BA.debugLineNum = 281;BA.debugLine="Dim IndexOfSeperator  As Int = 0";
_indexofseperator = (int) (0);
 //BA.debugLineNum = 283;BA.debugLine="IndexOfSeperator = str.LastIndexOf(separator)  'f";
_indexofseperator = _str.lastIndexOf(_separator);
 //BA.debugLineNum = 285;BA.debugLine="If  IndexOfSeperator <> 0 Then";
if (_indexofseperator!=0) { 
 //BA.debugLineNum = 288;BA.debugLine="foundInt = str.SubString((IndexOfSeperator +1)";
_foundint = _str.substring((int) ((_indexofseperator+1)));
 //BA.debugLineNum = 292;BA.debugLine="If IsNumber(foundInt) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_foundint)) { 
 //BA.debugLineNum = 294;BA.debugLine="parsed_str = str.SubString2(0 , IndexOfSeperato";
_parsed_str = _str.substring((int) (0),_indexofseperator);
 //BA.debugLineNum = 299;BA.debugLine="Dim foundLong As Long = (foundInt + 1)";
_foundlong = (long) (((double)(Double.parseDouble(_foundint))+1));
 //BA.debugLineNum = 301;BA.debugLine="Return parsed_str & separator & foundLong";
if (true) return _parsed_str+_separator+BA.NumberToString(_foundlong);
 }else {
 //BA.debugLineNum = 306;BA.debugLine="Return str & separator & first";
if (true) return _str+_separator+BA.NumberToString(_first);
 };
 }else {
 //BA.debugLineNum = 313;BA.debugLine="Return str & separator & first";
if (true) return _str+_separator+BA.NumberToString(_first);
 };
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return "";
}
public static boolean  _isemail(String _emailaddress) throws Exception{
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matchemail = null;
 //BA.debugLineNum = 19;BA.debugLine="Public Sub IsEmail(EmailAddress As String) As Bool";
 //BA.debugLineNum = 21;BA.debugLine="Dim MatchEmail As Matcher = Regex.Matcher(\"^(?i)[";
_matchemail = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matchemail = anywheresoftware.b4a.keywords.Common.Regex.Matcher("^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$",_emailaddress);
 //BA.debugLineNum = 23;BA.debugLine="If MatchEmail.Find = True Then";
if (_matchemail.Find()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 24;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
 //BA.debugLineNum = 26;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return false;
}
public static boolean  _isempty(String _str) throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Public Sub isEmpty(str As String) As Boolean";
 //BA.debugLineNum = 14;BA.debugLine="Return (str.Trim = \"\")";
if (true) return ((_str.trim()).equals(""));
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return false;
}
public static boolean  _isletter(String _c) throws Exception{
String _pattern = "";
 //BA.debugLineNum = 45;BA.debugLine="Public Sub IsLetter (c As String) As Boolean";
 //BA.debugLineNum = 47;BA.debugLine="Dim pattern As String = \"\\p{Alpha}\"";
_pattern = "\\p{Alpha}";
 //BA.debugLineNum = 48;BA.debugLine="If IsDevTool(\"B4J\") Then pattern = \"(?U)\" & patte";
if (anywheresoftware.b4a.keywords.Common.IsDevTool("B4J")) { 
_pattern = "(?U)"+_pattern;};
 //BA.debugLineNum = 50;BA.debugLine="Return Regex.IsMatch(pattern, c)";
if (true) return anywheresoftware.b4a.keywords.Common.Regex.IsMatch(_pattern,_c);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return false;
}
public static boolean  _isletters(String _text) throws Exception{
String _pattern = "";
 //BA.debugLineNum = 56;BA.debugLine="Public Sub IsLetters (text As String) As Boolean";
 //BA.debugLineNum = 58;BA.debugLine="Dim pattern As String = \"\\p{Alpha}+\"";
_pattern = "\\p{Alpha}+";
 //BA.debugLineNum = 59;BA.debugLine="If IsDevTool(\"B4J\") Then pattern = \"(?U)\" & patte";
if (anywheresoftware.b4a.keywords.Common.IsDevTool("B4J")) { 
_pattern = "(?U)"+_pattern;};
 //BA.debugLineNum = 61;BA.debugLine="Return Regex.IsMatch(pattern, text)";
if (true) return anywheresoftware.b4a.keywords.Common.Regex.IsMatch(_pattern,_text);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return false;
}
public static boolean  _isnull(Object _val) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Public Sub isNull(val As Object) As Boolean";
 //BA.debugLineNum = 9;BA.debugLine="Return (val = Null)";
if (true) return (_val== null);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return false;
}
public static boolean  _isvalidip(String _ip) throws Exception{
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
int _i = 0;
 //BA.debugLineNum = 33;BA.debugLine="Public Sub IsValidIp(ip As String) As Boolean";
 //BA.debugLineNum = 34;BA.debugLine="Dim m As Matcher";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
 //BA.debugLineNum = 35;BA.debugLine="m = Regex.Matcher(\"^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$\",";
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher("^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$",_ip);
 //BA.debugLineNum = 36;BA.debugLine="If m.Find = False Then Return False";
if (_m.Find()==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
 //BA.debugLineNum = 37;BA.debugLine="For i = 1 To 4";
{
final int step4 = 1;
final int limit4 = (int) (4);
_i = (int) (1) ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
 //BA.debugLineNum = 38;BA.debugLine="If m.Group(i) > 255 Or m.Group(i) < 0 Then Retur";
if ((double)(Double.parseDouble(_m.Group(_i)))>255 || (double)(Double.parseDouble(_m.Group(_i)))<0) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
 }
};
 //BA.debugLineNum = 40;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return false;
}
public static String  _prep_url(String _str) throws Exception{
 //BA.debugLineNum = 424;BA.debugLine="Public Sub prep_url(str As String)  As String";
 //BA.debugLineNum = 426;BA.debugLine="str= str.Trim";
_str = _str.trim();
 //BA.debugLineNum = 428;BA.debugLine="If isEmpty(str) Or str.EqualsIgnoreCase(\"http://\"";
if (_isempty(_str) || _str.equalsIgnoreCase("http://")) { 
 //BA.debugLineNum = 430;BA.debugLine="Return  \"\"";
if (true) return "";
 }else {
 //BA.debugLineNum = 434;BA.debugLine="If Not(str.StartsWith(\"http://\")) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_str.startsWith("http://"))) { 
 //BA.debugLineNum = 436;BA.debugLine="Return \"http://\" & str";
if (true) return "http://"+_str;
 }else {
 //BA.debugLineNum = 440;BA.debugLine="Return str";
if (true) return _str;
 };
 };
 //BA.debugLineNum = 446;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public static String  _quotes_to_entities(String _str) throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Public Sub quotes_to_entities(str As String) As St";
 //BA.debugLineNum = 136;BA.debugLine="str = str.Replace(\"\\'\", \"&#39;\")";
_str = _str.replace("\\'","&#39;");
 //BA.debugLineNum = 137;BA.debugLine="str = str.Replace(\"\\\"\"\",\"&quot;\")";
_str = _str.replace("\\\"","&quot;");
 //BA.debugLineNum = 139;BA.debugLine="str = str.Replace(\"'\", \"&#39;\")";
_str = _str.replace("'","&#39;");
 //BA.debugLineNum = 140;BA.debugLine="str = str.Replace(\"\"\"\",\"&quot;\")";
_str = _str.replace("\"","&quot;");
 //BA.debugLineNum = 143;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public static String  _reduce_double_slashes(String _str) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Public Sub reduce_double_slashes(str As String) As";
 //BA.debugLineNum = 153;BA.debugLine="If str.ToLowerCase.StartsWith(\"http://\") Then";
if (_str.toLowerCase().startsWith("http://")) { 
 //BA.debugLineNum = 155;BA.debugLine="str = str.Replace(\"//\" ,\"/\")";
_str = _str.replace("//","/");
 //BA.debugLineNum = 156;BA.debugLine="str =  str.Replace(\"http:/\" ,\"http://\")  'fix ba";
_str = _str.replace("http:/","http://");
 }else {
 //BA.debugLineNum = 160;BA.debugLine="str = str.Replace(\"//\" ,\"/\")";
_str = _str.replace("//","/");
 };
 //BA.debugLineNum = 164;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return "";
}
public static String[]  _shufflearray(String[] _stringarray) throws Exception{
String _arrayval = "";
int _random = 0;
int _i = 0;
 //BA.debugLineNum = 176;BA.debugLine="Public Sub shuffleArray(StringArray() As String) A";
 //BA.debugLineNum = 178;BA.debugLine="Dim ArrayVal As String";
_arrayval = "";
 //BA.debugLineNum = 179;BA.debugLine="Dim Random As Int";
_random = 0;
 //BA.debugLineNum = 181;BA.debugLine="For i = 0 To StringArray.Length - 1";
{
final int step3 = 1;
final int limit3 = (int) (_stringarray.length-1);
_i = (int) (0) ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
 //BA.debugLineNum = 182;BA.debugLine="Random = Rnd(i, StringArray.Length)";
_random = anywheresoftware.b4a.keywords.Common.Rnd(_i,_stringarray.length);
 //BA.debugLineNum = 183;BA.debugLine="ArrayVal = StringArray(i)";
_arrayval = _stringarray[_i];
 //BA.debugLineNum = 184;BA.debugLine="StringArray(i) = StringArray(Random)";
_stringarray[_i] = _stringarray[_random];
 //BA.debugLineNum = 185;BA.debugLine="StringArray(Random) = ArrayVal";
_stringarray[_random] = _arrayval;
 }
};
 //BA.debugLineNum = 187;BA.debugLine="Return StringArray";
if (true) return _stringarray;
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public static String  _stringarray2string(String[] _strarray) throws Exception{
String _result = "";
String _str = "";
 //BA.debugLineNum = 255;BA.debugLine="Public Sub StringArray2String(StrArray() As String";
 //BA.debugLineNum = 257;BA.debugLine="Dim result As String =\"\"";
_result = "";
 //BA.debugLineNum = 258;BA.debugLine="For Each str As String In StrArray 'an array";
{
final String[] group2 = _strarray;
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_str = group2[index2];
 //BA.debugLineNum = 259;BA.debugLine="result = result & str";
_result = _result+_str;
 }
};
 //BA.debugLineNum = 262;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return "";
}
public static String  _strip_quotes(String _str) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Public Sub strip_quotes(str As String) As String";
 //BA.debugLineNum = 127;BA.debugLine="str = str.Replace(\"'\", \"\")";
_str = _str.replace("'","");
 //BA.debugLineNum = 128;BA.debugLine="str = str.Replace(\"\"\"\",\"\")";
_str = _str.replace("\"","");
 //BA.debugLineNum = 129;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public static String  _trim_left_once(String _str,String _character) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Public Sub trim_left_once(str As String, character";
 //BA.debugLineNum = 78;BA.debugLine="If isEmpty(character) Then";
if (_isempty(_character)) { 
 //BA.debugLineNum = 80;BA.debugLine="character = \" \" 'empty space";
_character = " ";
 };
 //BA.debugLineNum = 84;BA.debugLine="If str.StartsWith(character) Then";
if (_str.startsWith(_character)) { 
 //BA.debugLineNum = 86;BA.debugLine="str = str.SubString(1)";
_str = _str.substring((int) (1));
 };
 //BA.debugLineNum = 90;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public static String  _trim_once(String _str,String _character) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Public Sub trim_once(str As String, character As S";
 //BA.debugLineNum = 68;BA.debugLine="str = trim_left_once(str, character)";
_str = _trim_left_once(_str,_character);
 //BA.debugLineNum = 69;BA.debugLine="str = trim_right_once(str, character)";
_str = _trim_right_once(_str,_character);
 //BA.debugLineNum = 71;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public static String  _trim_right_once(String _str,String _character) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Public Sub trim_right_once(str As String, characte";
 //BA.debugLineNum = 97;BA.debugLine="If isEmpty(character) Then";
if (_isempty(_character)) { 
 //BA.debugLineNum = 99;BA.debugLine="character = \" \" 'empty space";
_character = " ";
 };
 //BA.debugLineNum = 103;BA.debugLine="If str.EndsWith(character) Then";
if (_str.endsWith(_character)) { 
 //BA.debugLineNum = 105;BA.debugLine="str = str.SubString2(0, str.Length - 1)";
_str = _str.substring((int) (0),(int) (_str.length()-1));
 };
 //BA.debugLineNum = 109;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public static String  _trim_slashes_once(String _str) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Public Sub trim_slashes_once(str As String) As Str";
 //BA.debugLineNum = 120;BA.debugLine="Return trim_once( str, \"/\")";
if (true) return _trim_once(_str,"/");
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return "";
}
public static String  _ucfirst(String _str) throws Exception{
String _firstchar = "";
 //BA.debugLineNum = 374;BA.debugLine="Public Sub ucfirst(str As String) As String";
 //BA.debugLineNum = 376;BA.debugLine="Dim firstChar As String =\"\"";
_firstchar = "";
 //BA.debugLineNum = 377;BA.debugLine="firstChar= str.CharAt(0)";
_firstchar = BA.ObjectToString(_str.charAt((int) (0)));
 //BA.debugLineNum = 378;BA.debugLine="firstChar = firstChar.ToUpperCase";
_firstchar = _firstchar.toUpperCase();
 //BA.debugLineNum = 380;BA.debugLine="Return firstChar & str.SubString(1)";
if (true) return _firstchar+_str.substring((int) (1));
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return "";
}
public static String  _ucwords(String _str) throws Exception{
String _result = "";
String _txt = "";
String _firstchar = "";
 //BA.debugLineNum = 356;BA.debugLine="Public Sub ucwords(str As String) As String";
 //BA.debugLineNum = 358;BA.debugLine="Dim result As String =\"\"";
_result = "";
 //BA.debugLineNum = 360;BA.debugLine="For Each txt As String In explode(\" \", str)";
{
final anywheresoftware.b4a.BA.IterableList group2 = _explode(" ",_str);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_txt = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 361;BA.debugLine="Dim firstChar As String =\"\"";
_firstchar = "";
 //BA.debugLineNum = 362;BA.debugLine="firstChar= txt.CharAt(0)";
_firstchar = BA.ObjectToString(_txt.charAt((int) (0)));
 //BA.debugLineNum = 363;BA.debugLine="firstChar = firstChar.ToUpperCase";
_firstchar = _firstchar.toUpperCase();
 //BA.debugLineNum = 365;BA.debugLine="result = result & firstChar & txt.SubString(1) &";
_result = _result+_firstchar+_txt.substring((int) (1))+" ";
 }
};
 //BA.debugLineNum = 368;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 370;BA.debugLine="End Sub";
return "";
}
public static String  _underscore(String _str) throws Exception{
 //BA.debugLineNum = 408;BA.debugLine="Public Sub underscore(str As String)  As String";
 //BA.debugLineNum = 410;BA.debugLine="str= str.ToLowerCase";
_str = _str.toLowerCase();
 //BA.debugLineNum = 411;BA.debugLine="Return str.Replace(\" \",  \"_\")";
if (true) return _str.replace(" ","_");
 //BA.debugLineNum = 413;BA.debugLine="End Sub";
return "";
}
}
