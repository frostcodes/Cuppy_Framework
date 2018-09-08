package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class cffileutility extends Object{
public static cffileutility mostCurrent = new cffileutility();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cffileutility", null);
		ba.loadHtSubs(cffileutility.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "Punchline.Tech.Cuppy.Framework.cffileutility", ba);
		}
	}
    public static Class<?> getObject() {
		return cffileutility.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static b4j.example.cssutils _cssutils = null;
public static Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public static Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public static Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public static Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public static Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public static Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public static String  _bytestofile(String _dir,String _filename,byte[] _data) throws Exception{
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
 //BA.debugLineNum = 69;BA.debugLine="Public Sub BytesToFile (Dir As String, FileName As";
 //BA.debugLineNum = 71;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir, Fi";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(_dir,_filename,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 72;BA.debugLine="out.WriteBytes(Data, 0, Data.Length)";
_out.WriteBytes(_data,(int) (0),_data.length);
 //BA.debugLineNum = 73;BA.debugLine="out.Close";
_out.Close();
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _bytestoimage(byte[] _bytes) throws Exception{
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _bmp = null;
 //BA.debugLineNum = 86;BA.debugLine="Public Sub BytesToImage(bytes() As Byte) As Image";
 //BA.debugLineNum = 88;BA.debugLine="Dim in As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
 //BA.debugLineNum = 89;BA.debugLine="in.InitializeFromBytesArray(bytes,0,bytes.Length)";
_in.InitializeFromBytesArray(_bytes,(int) (0),_bytes.length);
 //BA.debugLineNum = 91;BA.debugLine="Dim bmp As Image";
_bmp = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
 //BA.debugLineNum = 92;BA.debugLine="bmp.Initialize2(in)";
_bmp.Initialize2((java.io.InputStream)(_in.getObject()));
 //BA.debugLineNum = 94;BA.debugLine="Return bmp";
if (true) return _bmp;
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public static byte[]  _filetobytes(String _dir,String _filename) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Public Sub FileToBytes (Dir As String, FileName As";
 //BA.debugLineNum = 81;BA.debugLine="Return Bit.InputStreamToBytes(File.OpenInput(Dir,";
if (true) return anywheresoftware.b4a.keywords.Common.Bit.InputStreamToBytes((java.io.InputStream)(anywheresoftware.b4a.keywords.Common.File.OpenInput(_dir,_filename).getObject()));
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public static String  _fixwinpaths(String _path) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Public Sub FixWinPaths(path As String) As String";
 //BA.debugLineNum = 128;BA.debugLine="Return path.Replace(\"//\", \"/\")";
if (true) return _path.replace("//","/");
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return "";
}
public static String  _formatfilesize(float _bytes) throws Exception{
String[] _unit = null;
double _po = 0;
double _si = 0;
int _i = 0;
 //BA.debugLineNum = 99;BA.debugLine="Public Sub FormatFileSize(Bytes As Float) As Strin";
 //BA.debugLineNum = 101;BA.debugLine="Private Unit() As String = Array As String(\" Byte";
_unit = new String[]{" Byte"," KB"," MB"," GB"," TB"," PB"," EB"," ZB"," YB"};
 //BA.debugLineNum = 103;BA.debugLine="If Bytes = 0 Then";
if (_bytes==0) { 
 //BA.debugLineNum = 105;BA.debugLine="Return \"0 Bytes\"";
if (true) return "0 Bytes";
 }else {
 //BA.debugLineNum = 109;BA.debugLine="Private Po, Si As Double";
_po = 0;
_si = 0;
 //BA.debugLineNum = 110;BA.debugLine="Private I As Int";
_i = 0;
 //BA.debugLineNum = 112;BA.debugLine="Bytes = Abs(Bytes)";
_bytes = (float) (anywheresoftware.b4a.keywords.Common.Abs(_bytes));
 //BA.debugLineNum = 114;BA.debugLine="I = Floor(Logarithm(Bytes, 1024))";
_i = (int) (anywheresoftware.b4a.keywords.Common.Floor(anywheresoftware.b4a.keywords.Common.Logarithm(_bytes,1024)));
 //BA.debugLineNum = 115;BA.debugLine="Po = Power(1024, I)";
_po = anywheresoftware.b4a.keywords.Common.Power(1024,_i);
 //BA.debugLineNum = 116;BA.debugLine="Si = Bytes / Po";
_si = _bytes/(double)_po;
 //BA.debugLineNum = 118;BA.debugLine="Return NumberFormat(Si, 1, 3) & Unit(I)";
if (true) return anywheresoftware.b4a.keywords.Common.NumberFormat(_si,(int) (1),(int) (3))+_unit[_i];
 };
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 23;BA.debugLine="For Each filename As String In File.ListFiles(dir";
{
final anywheresoftware.b4a.BA.IterableList group2 = anywheresoftware.b4a.keywords.Common.File.ListFiles(_dir);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_filename = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 25;BA.debugLine="If File.IsDirectory(dir, filename) = False Then";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_dir,_filename)==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 27;BA.debugLine="total = total + File.Size(dir , filename)";
_total = (long) (_total+anywheresoftware.b4a.keywords.Common.File.Size(_dir,_filename));
 };
 }
};
 //BA.debugLineNum = 33;BA.debugLine="Return total";
if (true) return _total;
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return 0L;
}
public static long  _sizeoffilesinfolder(String _dir) throws Exception{
long _total = 0L;
String _filename = "";
 //BA.debugLineNum = 43;BA.debugLine="Public Sub SizeOfFilesInFolder(dir As String) As L";
 //BA.debugLineNum = 45;BA.debugLine="Dim total As Long";
_total = 0L;
 //BA.debugLineNum = 47;BA.debugLine="For Each filename As String In File.ListFiles(dir";
{
final anywheresoftware.b4a.BA.IterableList group2 = anywheresoftware.b4a.keywords.Common.File.ListFiles(_dir);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_filename = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 49;BA.debugLine="If File.IsDirectory(dir, filename) = False Then";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_dir,_filename)==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 51;BA.debugLine="total = total + File.Size(dir, filename)";
_total = (long) (_total+anywheresoftware.b4a.keywords.Common.File.Size(_dir,_filename));
 }else {
 //BA.debugLineNum = 55;BA.debugLine="total = total + SizeOfFilesInFolder(dir & \"\\\" &";
_total = (long) (_total+_sizeoffilesinfolder(_dir+"\\"+_filename));
 };
 }
};
 //BA.debugLineNum = 61;BA.debugLine="Return total";
if (true) return _total;
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return 0L;
}
}
