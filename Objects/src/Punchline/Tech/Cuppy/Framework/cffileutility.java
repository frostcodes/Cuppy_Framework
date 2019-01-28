package punchline.tech.cuppy.framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class cffileutility extends Object{
public static cffileutility mostCurrent = new cffileutility();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("punchline.tech.cuppy.framework", "punchline.tech.cuppy.framework.cffileutility", null);
		ba.loadHtSubs(cffileutility.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "punchline.tech.cuppy.framework.cffileutility", ba);
		}
	}
    public static Class<?> getObject() {
		return cffileutility.class;
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
public static punchline.tech.cuppy.framework.cfdatatypeutility _cfdatatypeutility = null;
public static String  _bytestofile(String _dir,String _filename,byte[] _data) throws Exception{
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
 //BA.debugLineNum = 94;BA.debugLine="Public Sub BytesToFile (Dir As String, FileName As";
 //BA.debugLineNum = 96;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir, Fi";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(_dir,_filename,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 97;BA.debugLine="out.WriteBytes(Data, 0, Data.Length)";
_out.WriteBytes(_data,(int) (0),_data.length);
 //BA.debugLineNum = 98;BA.debugLine="out.Close";
_out.Close();
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _bytestoimage(byte[] _bytes) throws Exception{
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _bmp = null;
 //BA.debugLineNum = 111;BA.debugLine="Public Sub BytesToImage(bytes() As Byte) As Image";
 //BA.debugLineNum = 113;BA.debugLine="Dim in As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
 //BA.debugLineNum = 114;BA.debugLine="in.InitializeFromBytesArray(bytes,0,bytes.Length)";
_in.InitializeFromBytesArray(_bytes,(int) (0),_bytes.length);
 //BA.debugLineNum = 116;BA.debugLine="Dim bmp As Image";
_bmp = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
 //BA.debugLineNum = 117;BA.debugLine="bmp.Initialize2(in)";
_bmp.Initialize2((java.io.InputStream)(_in.getObject()));
 //BA.debugLineNum = 119;BA.debugLine="Return bmp";
if (true) return _bmp;
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _filesinfolder(String _dir,boolean _includesubdir) throws Exception{
anywheresoftware.b4a.objects.collections.List _files = null;
String _filename = "";
 //BA.debugLineNum = 59;BA.debugLine="Public Sub FilesInFolder(dir As String, IncludeSub";
 //BA.debugLineNum = 61;BA.debugLine="Dim files As List";
_files = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 62;BA.debugLine="files.Initialize";
_files.Initialize();
 //BA.debugLineNum = 64;BA.debugLine="dir = CFStringUtility.Trim_Slashes_Once(dir)";
_dir = _cfstringutility._trim_slashes_once(_dir);
 //BA.debugLineNum = 66;BA.debugLine="For Each filename As String In File.ListFiles(dir";
{
final anywheresoftware.b4a.BA.IterableList group4 = anywheresoftware.b4a.keywords.Common.File.ListFiles(_dir);
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_filename = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 68;BA.debugLine="If File.IsDirectory(dir, filename) = False Then";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_dir,_filename)==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 70;BA.debugLine="files.Add(FixWinPaths(dir & \"\\\" & filename))";
_files.Add((Object)(_fixwinpaths(_dir+"\\"+_filename)));
 }else if(_includesubdir) { 
 //BA.debugLineNum = 74;BA.debugLine="files.AddAll(FilesInFolder(FixWinPaths(dir & \"\\";
_files.AddAll(_filesinfolder(_fixwinpaths(_dir+"\\"+_filename),anywheresoftware.b4a.keywords.Common.True));
 };
 }
};
 //BA.debugLineNum = 80;BA.debugLine="Return files";
if (true) return _files;
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _filesinfolder2(String _dir) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Public Sub FilesInFolder2(dir As String) As List";
 //BA.debugLineNum = 88;BA.debugLine="Return FilesInFolder(dir, True)";
if (true) return _filesinfolder(_dir,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public static byte[]  _filetobytes(String _dir,String _filename) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Public Sub FileToBytes (Dir As String, FileName As";
 //BA.debugLineNum = 106;BA.debugLine="Return Bit.InputStreamToBytes(File.OpenInput(Dir,";
if (true) return anywheresoftware.b4a.keywords.Common.Bit.InputStreamToBytes((java.io.InputStream)(anywheresoftware.b4a.keywords.Common.File.OpenInput(_dir,_filename).getObject()));
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public static String  _fixwinpaths(String _path) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Public Sub FixWinPaths(path As String) As String";
 //BA.debugLineNum = 153;BA.debugLine="Return path.Replace(\"//\", \"/\")";
if (true) return _path.replace("//","/");
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public static String  _formatfilesize(float _bytes) throws Exception{
String[] _unit = null;
double _po = 0;
double _si = 0;
int _i = 0;
 //BA.debugLineNum = 124;BA.debugLine="Public Sub FormatFileSize(Bytes As Float) As Strin";
 //BA.debugLineNum = 126;BA.debugLine="Private Unit() As String = Array As String(\" Byte";
_unit = new String[]{" Byte"," KB"," MB"," GB"," TB"," PB"," EB"," ZB"," YB"};
 //BA.debugLineNum = 128;BA.debugLine="If Bytes = 0 Then";
if (_bytes==0) { 
 //BA.debugLineNum = 130;BA.debugLine="Return \"0 Bytes\"";
if (true) return "0 Bytes";
 }else {
 //BA.debugLineNum = 134;BA.debugLine="Private Po, Si As Double";
_po = 0;
_si = 0;
 //BA.debugLineNum = 135;BA.debugLine="Private I As Int";
_i = 0;
 //BA.debugLineNum = 137;BA.debugLine="Bytes = Abs(Bytes)";
_bytes = (float) (anywheresoftware.b4a.keywords.Common.Abs(_bytes));
 //BA.debugLineNum = 139;BA.debugLine="I = Floor(Logarithm(Bytes, 1024))";
_i = (int) (anywheresoftware.b4a.keywords.Common.Floor(anywheresoftware.b4a.keywords.Common.Logarithm(_bytes,1024)));
 //BA.debugLineNum = 140;BA.debugLine="Po = Power(1024, I)";
_po = anywheresoftware.b4a.keywords.Common.Power(1024,_i);
 //BA.debugLineNum = 141;BA.debugLine="Si = Bytes / Po";
_si = _bytes/(double)_po;
 //BA.debugLineNum = 143;BA.debugLine="Return NumberFormat(Si, 1, 3) & Unit(I)";
if (true) return anywheresoftware.b4a.keywords.Common.NumberFormat(_si,(int) (1),(int) (3))+_unit[_i];
 };
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public static long  _sizeofcurrentfilesinfolder(String _dir) throws Exception{
long _total = 0L;
String _filename = "";
 //BA.debugLineNum = 19;BA.debugLine="Public Sub SizeOfCurrentFilesInFolder(dir As Strin";
 //BA.debugLineNum = 21;BA.debugLine="Dim total As Long";
_total = 0L;
 //BA.debugLineNum = 22;BA.debugLine="dir = CFStringUtility.Trim_Slashes_Once(dir)";
_dir = _cfstringutility._trim_slashes_once(_dir);
 //BA.debugLineNum = 24;BA.debugLine="For Each filename As String In FilesInFolder(dir,";
{
final anywheresoftware.b4a.BA.IterableList group3 = _filesinfolder(_dir,anywheresoftware.b4a.keywords.Common.False);
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_filename = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 26;BA.debugLine="total = total + File.Size(\"\" , filename)";
_total = (long) (_total+anywheresoftware.b4a.keywords.Common.File.Size("",_filename));
 }
};
 //BA.debugLineNum = 30;BA.debugLine="Return total";
if (true) return _total;
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return 0L;
}
public static long  _sizeoffilesinfolder(String _dir) throws Exception{
long _total = 0L;
String _filename = "";
 //BA.debugLineNum = 40;BA.debugLine="Public Sub SizeOfFilesInFolder(dir As String) As L";
 //BA.debugLineNum = 42;BA.debugLine="Dim total As Long";
_total = 0L;
 //BA.debugLineNum = 43;BA.debugLine="dir = CFStringUtility.Trim_Slashes_Once(dir)";
_dir = _cfstringutility._trim_slashes_once(_dir);
 //BA.debugLineNum = 45;BA.debugLine="For Each filename As String In FilesInFolder(dir,";
{
final anywheresoftware.b4a.BA.IterableList group3 = _filesinfolder(_dir,anywheresoftware.b4a.keywords.Common.True);
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_filename = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 47;BA.debugLine="total = total + File.Size(\"\" , filename)";
_total = (long) (_total+anywheresoftware.b4a.keywords.Common.File.Size("",_filename));
 }
};
 //BA.debugLineNum = 51;BA.debugLine="Return total";
if (true) return _total;
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return 0L;
}
}
