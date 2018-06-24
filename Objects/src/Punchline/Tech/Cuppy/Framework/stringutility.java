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
public static Punchline.Tech.Cuppy.Framework.fileutility _fileutility = null;
public static Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public static Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public static Punchline.Tech.Cuppy.Framework.numbersutility _numbersutility = null;
public static String  _camelize(String _str) throws Exception{
String _firstchar = "";
String _result = "";
String _txt = "";
 //BA.debugLineNum = 413;BA.debugLine="Public Sub camelize(str As String)  As String";
 //BA.debugLineNum = 414;BA.debugLine="Dim firstChar, result As String =\"\"";
_firstchar = "";
_result = "";
 //BA.debugLineNum = 416;BA.debugLine="str= str.Replace(\" \", \"_\") 'make all spaces _";
_str = _str.replace(" ","_");
 //BA.debugLineNum = 418;BA.debugLine="firstChar = str.CharAt(0)";
_firstchar = BA.ObjectToString(_str.charAt((int) (0)));
 //BA.debugLineNum = 419;BA.debugLine="firstChar = firstChar.ToLowerCase";
_firstchar = _firstchar.toLowerCase();
 //BA.debugLineNum = 421;BA.debugLine="For Each txt As String In explode(\"_\", str)";
{
final anywheresoftware.b4a.BA.IterableList group5 = _explode("_",_str);
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_txt = BA.ObjectToString(group5.Get(index5));
 //BA.debugLineNum = 422;BA.debugLine="result = result & ucfirst(txt)";
_result = _result+_ucfirst(_txt);
 }
};
 //BA.debugLineNum = 425;BA.debugLine="Return firstChar & result.SubString(1)";
if (true) return _firstchar+_result.substring((int) (1));
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return "";
}
public static boolean  _containurl(String _text) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Public Sub ContainUrl(text As String) As Boolean";
 //BA.debugLineNum = 80;BA.debugLine="text = text.Trim";
_text = _text.trim();
 //BA.debugLineNum = 82;BA.debugLine="Return text.Contains(\"http://\") Or text.Contains(";
if (true) return _text.contains("http://") || _text.contains("https://");
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return false;
}
public static anywheresoftware.b4a.objects.collections.List  _explode(String _delimiter,String _str) throws Exception{
anywheresoftware.b4a.objects.collections.List _result = null;
int _delimiterindex = 0;
String _leftside = "";
String _rightside = "";
 //BA.debugLineNum = 343;BA.debugLine="Public Sub explode(delimiter As String ,  str As S";
 //BA.debugLineNum = 345;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 346;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 348;BA.debugLine="Dim delimiterIndex As Int";
_delimiterindex = 0;
 //BA.debugLineNum = 349;BA.debugLine="delimiterIndex=str.IndexOf(delimiter)";
_delimiterindex = _str.indexOf(_delimiter);
 //BA.debugLineNum = 351;BA.debugLine="Do While delimiterIndex >-1";
while (_delimiterindex>-1) {
 //BA.debugLineNum = 352;BA.debugLine="Dim LeftSide As String : LeftSide= str.SubString";
_leftside = "";
 //BA.debugLineNum = 352;BA.debugLine="Dim LeftSide As String : LeftSide= str.SubString";
_leftside = _str.substring((int) (0),_delimiterindex);
 //BA.debugLineNum = 353;BA.debugLine="Dim RightSide As String :RightSide= str.SubStrin";
_rightside = "";
 //BA.debugLineNum = 353;BA.debugLine="Dim RightSide As String :RightSide= str.SubStrin";
_rightside = _str.substring((int) (_delimiterindex+1));
 //BA.debugLineNum = 354;BA.debugLine="result.Add(LeftSide)";
_result.Add((Object)(_leftside));
 //BA.debugLineNum = 355;BA.debugLine="str=RightSide";
_str = _rightside;
 //BA.debugLineNum = 356;BA.debugLine="delimiterIndex=str.IndexOf(delimiter)";
_delimiterindex = _str.indexOf(_delimiter);
 }
;
 //BA.debugLineNum = 359;BA.debugLine="result.Add(str)";
_result.Add((Object)(_str));
 //BA.debugLineNum = 361;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 363;BA.debugLine="End Sub";
return null;
}
public static int  _generatepincode(int _pinlength) throws Exception{
String _result = "";
String[] _randomarray = null;
int _i = 0;
 //BA.debugLineNum = 257;BA.debugLine="Public Sub generatePinCode(PinLength As Int) As I";
 //BA.debugLineNum = 259;BA.debugLine="Dim result As String =\"\"";
_result = "";
 //BA.debugLineNum = 260;BA.debugLine="Dim RandomArray() As String = Array As String(1,2";
_randomarray = new String[]{BA.NumberToString(1),BA.NumberToString(2),BA.NumberToString(3),BA.NumberToString(4),BA.NumberToString(5),BA.NumberToString(6),BA.NumberToString(7),BA.NumberToString(8),BA.NumberToString(9),BA.NumberToString(0)};
 //BA.debugLineNum = 262;BA.debugLine="For i = 0 To PinLength - 1";
{
final int step3 = 1;
final int limit3 = (int) (_pinlength-1);
_i = (int) (0) ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
 //BA.debugLineNum = 264;BA.debugLine="result = result &  RandomArray( Rnd( 0, Rnd(2, R";
_result = _result+_randomarray[anywheresoftware.b4a.keywords.Common.Rnd((int) (0),anywheresoftware.b4a.keywords.Common.Rnd((int) (2),(int) (_randomarray.length-1)))];
 }
};
 //BA.debugLineNum = 268;BA.debugLine="Return  result";
if (true) return (int)(Double.parseDouble(_result));
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return 0;
}
public static String  _generaterandomstring(int _strlength) throws Exception{
String _rndstring = "";
int _rndnumber = 0;
 //BA.debugLineNum = 219;BA.debugLine="Public Sub generateRandomString(StrLength As Int)";
 //BA.debugLineNum = 220;BA.debugLine="Dim RndString As String";
_rndstring = "";
 //BA.debugLineNum = 221;BA.debugLine="Dim RndNumber As Int";
_rndnumber = 0;
 //BA.debugLineNum = 222;BA.debugLine="Do While RndString.Length < StrLength";
while (_rndstring.length()<_strlength) {
 //BA.debugLineNum = 223;BA.debugLine="RndNumber = Rnd(48,123) 'Yep, 123, because the l";
_rndnumber = anywheresoftware.b4a.keywords.Common.Rnd((int) (48),(int) (123));
 //BA.debugLineNum = 224;BA.debugLine="If (RndNumber >= 48 And RndNumber <= 57) Or (Rnd";
if ((_rndnumber>=48 && _rndnumber<=57) || (_rndnumber>=65 && _rndnumber<=90) || (_rndnumber>=97 && _rndnumber<=112)) { 
 //BA.debugLineNum = 225;BA.debugLine="RndString = RndString & Chr(RndNumber)";
_rndstring = _rndstring+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr(_rndnumber));
 };
 }
;
 //BA.debugLineNum = 228;BA.debugLine="Return RndString";
if (true) return _rndstring;
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return "";
}
public static String  _generaterandomstring2(int _strlength) throws Exception{
String[] _randomarray = null;
String _result = "";
 //BA.debugLineNum = 236;BA.debugLine="Public Sub generateRandomString2(StrLength As Int)";
 //BA.debugLineNum = 238;BA.debugLine="Dim RandomArray() As String = Array As String(\"!\"";
_randomarray = new String[]{"!","@","#","$","%"};
 //BA.debugLineNum = 239;BA.debugLine="Dim result As String";
_result = "";
 //BA.debugLineNum = 242;BA.debugLine="result =  StringArray2String(shuffleArray(RandomA";
_result = _stringarray2string(_shufflearray(_randomarray));
 //BA.debugLineNum = 243;BA.debugLine="result = result  & generateRandomString( Floor( S";
_result = _result+_generaterandomstring((int) (anywheresoftware.b4a.keywords.Common.Floor(_strlength/(double)2)));
 //BA.debugLineNum = 244;BA.debugLine="result = result  & StringArray2String(shuffleArra";
_result = _result+_stringarray2string(_shufflearray(_randomarray));
 //BA.debugLineNum = 245;BA.debugLine="result = result  & generateRandomString( Floor( S";
_result = _result+_generaterandomstring((int) (anywheresoftware.b4a.keywords.Common.Floor(_strlength/(double)2)));
 //BA.debugLineNum = 248;BA.debugLine="Return  result.SubString2( result.Length - StrLen";
if (true) return _result.substring((int) (_result.length()-_strlength),_result.length());
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return "";
}
public static String  _humanize(String _str,String _separator) throws Exception{
 //BA.debugLineNum = 439;BA.debugLine="Public Sub humanize(str As String, separator As St";
 //BA.debugLineNum = 441;BA.debugLine="str= str.ToLowerCase";
_str = _str.toLowerCase();
 //BA.debugLineNum = 442;BA.debugLine="Return ucwords(str.Replace(separator, \" \"))";
if (true) return _ucwords(_str.replace(_separator," "));
 //BA.debugLineNum = 444;BA.debugLine="End Sub";
return "";
}
public static String  _implode(String _separator,anywheresoftware.b4a.objects.collections.List _strlist) throws Exception{
String _result = "";
String _str = "";
 //BA.debugLineNum = 366;BA.debugLine="Public Sub implode(separator As String, StrList As";
 //BA.debugLineNum = 367;BA.debugLine="Dim result As String =\"\"";
_result = "";
 //BA.debugLineNum = 369;BA.debugLine="For Each str As String In StrList 'an array";
{
final anywheresoftware.b4a.BA.IterableList group2 = _strlist;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_str = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 370;BA.debugLine="result = result & str & separator";
_result = _result+_str+_separator;
 }
};
 //BA.debugLineNum = 373;BA.debugLine="Return trim_once(result, separator) ' trim separa";
if (true) return _trim_once(_result,_separator);
 //BA.debugLineNum = 375;BA.debugLine="End Sub";
return "";
}
public static String  _increment_string(String _str,String _separator,int _first) throws Exception{
String _parsed_str = "";
String _foundint = "";
int _indexofseperator = 0;
long _foundlong = 0L;
 //BA.debugLineNum = 301;BA.debugLine="Public Sub increment_string(str As String, separat";
 //BA.debugLineNum = 303;BA.debugLine="Dim parsed_str, foundInt As String =\"\"";
_parsed_str = "";
_foundint = "";
 //BA.debugLineNum = 304;BA.debugLine="Dim IndexOfSeperator  As Int = 0";
_indexofseperator = (int) (0);
 //BA.debugLineNum = 306;BA.debugLine="IndexOfSeperator = str.LastIndexOf(separator)  'f";
_indexofseperator = _str.lastIndexOf(_separator);
 //BA.debugLineNum = 308;BA.debugLine="If  IndexOfSeperator <> 0 Then";
if (_indexofseperator!=0) { 
 //BA.debugLineNum = 311;BA.debugLine="foundInt = str.SubString((IndexOfSeperator +1)";
_foundint = _str.substring((int) ((_indexofseperator+1)));
 //BA.debugLineNum = 315;BA.debugLine="If IsNumber(foundInt) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_foundint)) { 
 //BA.debugLineNum = 317;BA.debugLine="parsed_str = str.SubString2(0 , IndexOfSeperato";
_parsed_str = _str.substring((int) (0),_indexofseperator);
 //BA.debugLineNum = 322;BA.debugLine="Dim foundLong As Long = (foundInt + 1)";
_foundlong = (long) (((double)(Double.parseDouble(_foundint))+1));
 //BA.debugLineNum = 324;BA.debugLine="Return parsed_str & separator & foundLong";
if (true) return _parsed_str+_separator+BA.NumberToString(_foundlong);
 }else {
 //BA.debugLineNum = 329;BA.debugLine="Return str & separator & first";
if (true) return _str+_separator+BA.NumberToString(_first);
 };
 }else {
 //BA.debugLineNum = 336;BA.debugLine="Return str & separator & first";
if (true) return _str+_separator+BA.NumberToString(_first);
 };
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
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
public static boolean  _isurl(String _text) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Public Sub isUrl (text As String) As Boolean";
 //BA.debugLineNum = 70;BA.debugLine="text = text.Trim";
_text = _text.trim();
 //BA.debugLineNum = 72;BA.debugLine="Return text.StartsWith(\"http://\") Or text.StartsW";
if (true) return _text.startsWith("http://") || _text.startsWith("https://");
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 447;BA.debugLine="Public Sub prep_url(str As String)  As String";
 //BA.debugLineNum = 449;BA.debugLine="str= str.Trim";
_str = _str.trim();
 //BA.debugLineNum = 451;BA.debugLine="If isEmpty(str) Or str.EqualsIgnoreCase(\"http://\"";
if (_isempty(_str) || _str.equalsIgnoreCase("http://")) { 
 //BA.debugLineNum = 453;BA.debugLine="Return  \"\"";
if (true) return "";
 }else {
 //BA.debugLineNum = 457;BA.debugLine="If Not(str.StartsWith(\"http://\")) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_str.startsWith("http://"))) { 
 //BA.debugLineNum = 459;BA.debugLine="Return \"http://\" & str";
if (true) return "http://"+_str;
 }else {
 //BA.debugLineNum = 463;BA.debugLine="Return str";
if (true) return _str;
 };
 };
 //BA.debugLineNum = 469;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 157;BA.debugLine="Public Sub quotes_to_entities(str As String) As St";
 //BA.debugLineNum = 159;BA.debugLine="str = str.Replace(\"\\'\", \"&#39;\")";
_str = _str.replace("\\'","&#39;");
 //BA.debugLineNum = 160;BA.debugLine="str = str.Replace(\"\\\"\"\",\"&quot;\")";
_str = _str.replace("\\\"","&quot;");
 //BA.debugLineNum = 162;BA.debugLine="str = str.Replace(\"'\", \"&#39;\")";
_str = _str.replace("'","&#39;");
 //BA.debugLineNum = 163;BA.debugLine="str = str.Replace(\"\"\"\",\"&quot;\")";
_str = _str.replace("\"","&quot;");
 //BA.debugLineNum = 166;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public static String  _reduce_double_slashes(String _str) throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Public Sub reduce_double_slashes(str As String) As";
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
 //BA.debugLineNum = 199;BA.debugLine="Public Sub shuffleArray(StringArray() As String) A";
 //BA.debugLineNum = 201;BA.debugLine="Dim ArrayVal As String";
_arrayval = "";
 //BA.debugLineNum = 202;BA.debugLine="Dim Random As Int";
_random = 0;
 //BA.debugLineNum = 204;BA.debugLine="For i = 0 To StringArray.Length - 1";
{
final int step3 = 1;
final int limit3 = (int) (_stringarray.length-1);
_i = (int) (0) ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
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
 //BA.debugLineNum = 486;BA.debugLine="Public Sub Sprintf(fmt As String, arg() As Object)";
 //BA.debugLineNum = 487;BA.debugLine="Dim ai, fi, i As Int";
_ai = 0;
_fi = 0;
_i = 0;
 //BA.debugLineNum = 488;BA.debugLine="Dim exp, wid As Int";
_exp = 0;
_wid = 0;
 //BA.debugLineNum = 489;BA.debugLine="Dim stmp, ptmp, sres, c, t As String";
_stmp = "";
_ptmp = "";
_sres = "";
_c = "";
_t = "";
 //BA.debugLineNum = 490;BA.debugLine="Dim bdone As Boolean";
_bdone = false;
 //BA.debugLineNum = 492;BA.debugLine="ai = 0";
_ai = (int) (0);
 //BA.debugLineNum = 493;BA.debugLine="fi = 0";
_fi = (int) (0);
 //BA.debugLineNum = 494;BA.debugLine="stmp = \"\"";
_stmp = "";
 //BA.debugLineNum = 495;BA.debugLine="sres = \"\"";
_sres = "";
 //BA.debugLineNum = 497;BA.debugLine="Do While (fi < fmt.Length)";
while ((_fi<_fmt.length())) {
 //BA.debugLineNum = 498;BA.debugLine="c = fmt.CharAt(fi)";
_c = BA.ObjectToString(_fmt.charAt(_fi));
 //BA.debugLineNum = 499;BA.debugLine="fi = fi + 1";
_fi = (int) (_fi+1);
 //BA.debugLineNum = 501;BA.debugLine="If (c = \"%\") Then";
if (((_c).equals("%"))) { 
 //BA.debugLineNum = 502;BA.debugLine="stmp = \"\"";
_stmp = "";
 //BA.debugLineNum = 503;BA.debugLine="ptmp = \"\"";
_ptmp = "";
 //BA.debugLineNum = 504;BA.debugLine="bdone = False";
_bdone = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 506;BA.debugLine="Do While ((fi < fmt.Length) And (bdone = False)";
while (((_fi<_fmt.length()) && (_bdone==anywheresoftware.b4a.keywords.Common.False))) {
 //BA.debugLineNum = 507;BA.debugLine="c = fmt.CharAt(fi)";
_c = BA.ObjectToString(_fmt.charAt(_fi));
 //BA.debugLineNum = 508;BA.debugLine="fi = fi + 1";
_fi = (int) (_fi+1);
 //BA.debugLineNum = 510;BA.debugLine="If ((IsNumber(c) = True) Or (c = \".\")) Then";
if (((anywheresoftware.b4a.keywords.Common.IsNumber(_c)==anywheresoftware.b4a.keywords.Common.True) || ((_c).equals(".")))) { 
 //BA.debugLineNum = 511;BA.debugLine="ptmp = ptmp & c";
_ptmp = _ptmp+_c;
 //BA.debugLineNum = 512;BA.debugLine="bdone = False";
_bdone = anywheresoftware.b4a.keywords.Common.False;
 }else if(((_c).equals("s"))) { 
 //BA.debugLineNum = 514;BA.debugLine="stmp = arg(ai)";
_stmp = BA.ObjectToString(_arg[_ai]);
 //BA.debugLineNum = 515;BA.debugLine="ai = ai + 1";
_ai = (int) (_ai+1);
 //BA.debugLineNum = 516;BA.debugLine="sres = sres & stmp";
_sres = _sres+_stmp;
 //BA.debugLineNum = 517;BA.debugLine="bdone = True";
_bdone = anywheresoftware.b4a.keywords.Common.True;
 }else if(((_c).equals("d"))) { 
 //BA.debugLineNum = 519;BA.debugLine="If (ptmp.Length > 0) Then";
if ((_ptmp.length()>0)) { 
 //BA.debugLineNum = 520;BA.debugLine="t = \" \"";
_t = " ";
 //BA.debugLineNum = 521;BA.debugLine="If (ptmp.CharAt(0) = \"0\") Then";
if ((_ptmp.charAt((int) (0))==BA.ObjectToChar("0"))) { 
 //BA.debugLineNum = 522;BA.debugLine="t = \"0\"";
_t = "0";
 //BA.debugLineNum = 523;BA.debugLine="ptmp = ptmp.SubString(1)";
_ptmp = _ptmp.substring((int) (1));
 };
 };
 //BA.debugLineNum = 527;BA.debugLine="If (ptmp.Length > 0) Then wid = ptmp Else wid";
if ((_ptmp.length()>0)) { 
_wid = (int)(Double.parseDouble(_ptmp));}
else {
_wid = (int) (0);};
 //BA.debugLineNum = 529;BA.debugLine="stmp = arg(ai)";
_stmp = BA.ObjectToString(_arg[_ai]);
 //BA.debugLineNum = 531;BA.debugLine="Do While (stmp.Length < wid)";
while ((_stmp.length()<_wid)) {
 //BA.debugLineNum = 532;BA.debugLine="stmp = t & stmp";
_stmp = _t+_stmp;
 }
;
 //BA.debugLineNum = 535;BA.debugLine="ai = ai + 1";
_ai = (int) (_ai+1);
 //BA.debugLineNum = 536;BA.debugLine="sres = sres & stmp";
_sres = _sres+_stmp;
 //BA.debugLineNum = 537;BA.debugLine="bdone = True";
_bdone = anywheresoftware.b4a.keywords.Common.True;
 }else if(((_c).equals("f"))) { 
 //BA.debugLineNum = 539;BA.debugLine="If (ptmp.Length > 0) Then";
if ((_ptmp.length()>0)) { 
 //BA.debugLineNum = 540;BA.debugLine="i = ptmp.IndexOf(\".\")";
_i = _ptmp.indexOf(".");
 //BA.debugLineNum = 541;BA.debugLine="If (i >= 0) Then";
if ((_i>=0)) { 
 //BA.debugLineNum = 542;BA.debugLine="wid = ptmp.SubString2(0, i)";
_wid = (int)(Double.parseDouble(_ptmp.substring((int) (0),_i)));
 //BA.debugLineNum = 543;BA.debugLine="exp = ptmp.SubString(i+1)";
_exp = (int)(Double.parseDouble(_ptmp.substring((int) (_i+1))));
 }else {
 //BA.debugLineNum = 545;BA.debugLine="wid = ptmp";
_wid = (int)(Double.parseDouble(_ptmp));
 //BA.debugLineNum = 546;BA.debugLine="exp = 0";
_exp = (int) (0);
 };
 //BA.debugLineNum = 549;BA.debugLine="stmp = NumberFormat(arg(ai), wid, exp)";
_stmp = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_arg[_ai])),_wid,_exp);
 }else {
 //BA.debugLineNum = 551;BA.debugLine="stmp = arg(ai)";
_stmp = BA.ObjectToString(_arg[_ai]);
 };
 //BA.debugLineNum = 554;BA.debugLine="ai = ai + 1";
_ai = (int) (_ai+1);
 //BA.debugLineNum = 555;BA.debugLine="sres = sres & stmp";
_sres = _sres+_stmp;
 //BA.debugLineNum = 556;BA.debugLine="bdone = True";
_bdone = anywheresoftware.b4a.keywords.Common.True;
 }else {
 //BA.debugLineNum = 558;BA.debugLine="ai = ai + 1";
_ai = (int) (_ai+1);
 };
 }
;
 }else {
 //BA.debugLineNum = 563;BA.debugLine="sres = sres & c";
_sres = _sres+_c;
 };
 }
;
 //BA.debugLineNum = 567;BA.debugLine="Return(sres)";
if (true) return (_sres);
 //BA.debugLineNum = 568;BA.debugLine="End Sub";
return "";
}
public static String  _stringarray2string(String[] _strarray) throws Exception{
String _result = "";
String _str = "";
 //BA.debugLineNum = 278;BA.debugLine="Public Sub StringArray2String(StrArray() As String";
 //BA.debugLineNum = 280;BA.debugLine="Dim result As String =\"\"";
_result = "";
 //BA.debugLineNum = 281;BA.debugLine="For Each str As String In StrArray 'an array";
{
final String[] group2 = _strarray;
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_str = group2[index2];
 //BA.debugLineNum = 282;BA.debugLine="result = result & str";
_result = _result+_str;
 }
};
 //BA.debugLineNum = 285;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return "";
}
public static String  _strip_quotes(String _str) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Public Sub strip_quotes(str As String) As String";
 //BA.debugLineNum = 150;BA.debugLine="str = str.Replace(\"'\", \"\")";
_str = _str.replace("'","");
 //BA.debugLineNum = 151;BA.debugLine="str = str.Replace(\"\"\"\",\"\")";
_str = _str.replace("\"","");
 //BA.debugLineNum = 152;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}
public static String  _trim_left_once(String _str,String _character) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Public Sub trim_left_once(str As String, character";
 //BA.debugLineNum = 101;BA.debugLine="If isEmpty(character) Then";
if (_isempty(_character)) { 
 //BA.debugLineNum = 103;BA.debugLine="character = \" \" 'empty space";
_character = " ";
 };
 //BA.debugLineNum = 107;BA.debugLine="If str.StartsWith(character) Then";
if (_str.startsWith(_character)) { 
 //BA.debugLineNum = 109;BA.debugLine="str = str.SubString(1)";
_str = _str.substring((int) (1));
 };
 //BA.debugLineNum = 113;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public static String  _trim_once(String _str,String _character) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Public Sub trim_once(str As String, character As S";
 //BA.debugLineNum = 91;BA.debugLine="str = trim_left_once(str, character)";
_str = _trim_left_once(_str,_character);
 //BA.debugLineNum = 92;BA.debugLine="str = trim_right_once(str, character)";
_str = _trim_right_once(_str,_character);
 //BA.debugLineNum = 94;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public static String  _trim_right_once(String _str,String _character) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Public Sub trim_right_once(str As String, characte";
 //BA.debugLineNum = 120;BA.debugLine="If isEmpty(character) Then";
if (_isempty(_character)) { 
 //BA.debugLineNum = 122;BA.debugLine="character = \" \" 'empty space";
_character = " ";
 };
 //BA.debugLineNum = 126;BA.debugLine="If str.EndsWith(character) Then";
if (_str.endsWith(_character)) { 
 //BA.debugLineNum = 128;BA.debugLine="str = str.SubString2(0, str.Length - 1)";
_str = _str.substring((int) (0),(int) (_str.length()-1));
 };
 //BA.debugLineNum = 132;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return "";
}
public static String  _trim_slashes_once(String _str) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Public Sub trim_slashes_once(str As String) As Str";
 //BA.debugLineNum = 143;BA.debugLine="Return trim_once( str, \"/\")";
if (true) return _trim_once(_str,"/");
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public static String  _ucfirst(String _str) throws Exception{
String _firstchar = "";
 //BA.debugLineNum = 397;BA.debugLine="Public Sub ucfirst(str As String) As String";
 //BA.debugLineNum = 399;BA.debugLine="Dim firstChar As String =\"\"";
_firstchar = "";
 //BA.debugLineNum = 400;BA.debugLine="firstChar= str.CharAt(0)";
_firstchar = BA.ObjectToString(_str.charAt((int) (0)));
 //BA.debugLineNum = 401;BA.debugLine="firstChar = firstChar.ToUpperCase";
_firstchar = _firstchar.toUpperCase();
 //BA.debugLineNum = 403;BA.debugLine="Return firstChar & str.SubString(1)";
if (true) return _firstchar+_str.substring((int) (1));
 //BA.debugLineNum = 406;BA.debugLine="End Sub";
return "";
}
public static String  _ucwords(String _str) throws Exception{
String _result = "";
String _txt = "";
String _firstchar = "";
 //BA.debugLineNum = 379;BA.debugLine="Public Sub ucwords(str As String) As String";
 //BA.debugLineNum = 381;BA.debugLine="Dim result As String =\"\"";
_result = "";
 //BA.debugLineNum = 383;BA.debugLine="For Each txt As String In explode(\" \", str)";
{
final anywheresoftware.b4a.BA.IterableList group2 = _explode(" ",_str);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_txt = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 384;BA.debugLine="Dim firstChar As String =\"\"";
_firstchar = "";
 //BA.debugLineNum = 385;BA.debugLine="firstChar= txt.CharAt(0)";
_firstchar = BA.ObjectToString(_txt.charAt((int) (0)));
 //BA.debugLineNum = 386;BA.debugLine="firstChar = firstChar.ToUpperCase";
_firstchar = _firstchar.toUpperCase();
 //BA.debugLineNum = 388;BA.debugLine="result = result & firstChar & txt.SubString(1) &";
_result = _result+_firstchar+_txt.substring((int) (1))+" ";
 }
};
 //BA.debugLineNum = 391;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 393;BA.debugLine="End Sub";
return "";
}
public static String  _underscore(String _str) throws Exception{
 //BA.debugLineNum = 431;BA.debugLine="Public Sub underscore(str As String)  As String";
 //BA.debugLineNum = 433;BA.debugLine="str= str.ToLowerCase";
_str = _str.toLowerCase();
 //BA.debugLineNum = 434;BA.debugLine="Return str.Replace(\" \",  \"_\")";
if (true) return _str.replace(" ","_");
 //BA.debugLineNum = 436;BA.debugLine="End Sub";
return "";
}
public static String  _word_wrap(String _str,int _limit) throws Exception{
int _lastindex = 0;
int _divval = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _stringbuild = null;
int _i = 0;
int _nextval = 0;
 //BA.debugLineNum = 577;BA.debugLine="Sub word_wrap(str As String, limit As Int) As Stri";
 //BA.debugLineNum = 579;BA.debugLine="str = str.Trim";
_str = _str.trim();
 //BA.debugLineNum = 581;BA.debugLine="If str.Length = limit Then";
if (_str.length()==_limit) { 
 //BA.debugLineNum = 583;BA.debugLine="Log(86734535)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(86734535));
 //BA.debugLineNum = 585;BA.debugLine="Return str";
if (true) return _str;
 }else {
 //BA.debugLineNum = 589;BA.debugLine="Dim lastIndex, DivVal As Int";
_lastindex = 0;
_divval = 0;
 //BA.debugLineNum = 591;BA.debugLine="Dim stringBuild As StringBuilder";
_stringbuild = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 592;BA.debugLine="stringBuild.Initialize";
_stringbuild.Initialize();
 //BA.debugLineNum = 595;BA.debugLine="DivVal =  str.Length / limit";
_divval = (int) (_str.length()/(double)_limit);
 //BA.debugLineNum = 598;BA.debugLine="Log(\"DivVal :: \"  & DivVal  )";
anywheresoftware.b4a.keywords.Common.Log("DivVal :: "+BA.NumberToString(_divval));
 //BA.debugLineNum = 600;BA.debugLine="Log(\"Mod :: \"  &  (str.Length Mod limit ) )";
anywheresoftware.b4a.keywords.Common.Log("Mod :: "+BA.NumberToString((_str.length()%_limit)));
 //BA.debugLineNum = 605;BA.debugLine="For i = 0 To DivVal";
{
final int step12 = 1;
final int limit12 = _divval;
_i = (int) (0) ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
 //BA.debugLineNum = 607;BA.debugLine="Dim nextVal As Int = i * limit";
_nextval = (int) (_i*_limit);
 //BA.debugLineNum = 609;BA.debugLine="If i = DivVal Then";
if (_i==_divval) { 
 //BA.debugLineNum = 613;BA.debugLine="stringBuild.Append( str.SubString( nextVal).Tr";
_stringbuild.Append(_str.substring(_nextval).trim());
 //BA.debugLineNum = 616;BA.debugLine="Log(\"Lats :: \"  & str.SubString( nextVal)  )";
anywheresoftware.b4a.keywords.Common.Log("Lats :: "+_str.substring(_nextval));
 //BA.debugLineNum = 617;BA.debugLine="Log(\"Lats nextVal :: \"  &  nextVal  )";
anywheresoftware.b4a.keywords.Common.Log("Lats nextVal :: "+BA.NumberToString(_nextval));
 }else {
 //BA.debugLineNum = 623;BA.debugLine="stringBuild.Append( str.SubString2( nextVal ,";
_stringbuild.Append(_str.substring(_nextval,(int) (_nextval+_limit)).trim());
 //BA.debugLineNum = 624;BA.debugLine="stringBuild.Append( CRLF)";
_stringbuild.Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 627;BA.debugLine="Log(\"Nor :: \"  & str.SubString2( nextVal , nex";
anywheresoftware.b4a.keywords.Common.Log("Nor :: "+_str.substring(_nextval,(int) (_nextval+_limit)));
 //BA.debugLineNum = 628;BA.debugLine="Log(\"Nor nextVal :: \"  &  nextVal  )";
anywheresoftware.b4a.keywords.Common.Log("Nor nextVal :: "+BA.NumberToString(_nextval));
 //BA.debugLineNum = 630;BA.debugLine="Log(\"Nor Limit next :: \"  &   (nextVal + limit";
anywheresoftware.b4a.keywords.Common.Log("Nor Limit next :: "+BA.NumberToString((_nextval+_limit)));
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
