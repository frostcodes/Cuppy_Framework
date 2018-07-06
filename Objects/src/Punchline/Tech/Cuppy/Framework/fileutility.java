package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class fileutility extends Object{
public static fileutility mostCurrent = new fileutility();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.fileutility", null);
		ba.loadHtSubs(fileutility.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "Punchline.Tech.Cuppy.Framework.fileutility", ba);
		}
	}
    public static Class<?> getObject() {
		return fileutility.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static b4j.example.cssutils _cssutils = null;
public static Punchline.Tech.Cuppy.Framework.main _main = null;
public static Punchline.Tech.Cuppy.Framework.configs _configs = null;
public static Punchline.Tech.Cuppy.Framework.stringutility _stringutility = null;
public static Punchline.Tech.Cuppy.Framework.mathutility _mathutility = null;
public static Punchline.Tech.Cuppy.Framework.datatypeutility _datatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.stylemanager _stylemanager = null;
public static Punchline.Tech.Cuppy.Framework.apputility _apputility = null;
public static Punchline.Tech.Cuppy.Framework.controlsutils _controlsutils = null;
public static Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public static Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public static String  _bytestofile(String _dir,String _filename,byte[] _data) throws Exception{
RDebugUtils.currentModule="fileutility";
if (Debug.shouldDelegate(ba, "bytestofile"))
	 {return ((String) Debug.delegate(ba, "bytestofile", new Object[] {_dir,_filename,_data}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Public Sub BytesToFile (Dir As String, FileName As";
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir, Fi";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(_dir,_filename,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=15138819;
 //BA.debugLineNum = 15138819;BA.debugLine="out.WriteBytes(Data, 0, Data.Length)";
_out.WriteBytes(_data,(int) (0),_data.length);
RDebugUtils.currentLine=15138820;
 //BA.debugLineNum = 15138820;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=15138822;
 //BA.debugLineNum = 15138822;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _bytestoimage(byte[] _bytes) throws Exception{
RDebugUtils.currentModule="fileutility";
if (Debug.shouldDelegate(ba, "bytestoimage"))
	 {return ((anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) Debug.delegate(ba, "bytestoimage", new Object[] {_bytes}));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _bmp = null;
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Public Sub BytesToImage(bytes() As Byte) As Image";
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="Dim in As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=15269891;
 //BA.debugLineNum = 15269891;BA.debugLine="in.InitializeFromBytesArray(bytes,0,bytes.Length)";
_in.InitializeFromBytesArray(_bytes,(int) (0),_bytes.length);
RDebugUtils.currentLine=15269893;
 //BA.debugLineNum = 15269893;BA.debugLine="Dim bmp As Image";
_bmp = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
RDebugUtils.currentLine=15269894;
 //BA.debugLineNum = 15269894;BA.debugLine="bmp.Initialize2(in)";
_bmp.Initialize2((java.io.InputStream)(_in.getObject()));
RDebugUtils.currentLine=15269896;
 //BA.debugLineNum = 15269896;BA.debugLine="Return bmp";
if (true) return _bmp;
RDebugUtils.currentLine=15269898;
 //BA.debugLineNum = 15269898;BA.debugLine="End Sub";
return null;
}
public static byte[]  _filetobytes(String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="fileutility";
if (Debug.shouldDelegate(ba, "filetobytes"))
	 {return ((byte[]) Debug.delegate(ba, "filetobytes", new Object[] {_dir,_filename}));}
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Public Sub FileToBytes (Dir As String, FileName As";
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="Return Bit.InputStreamToBytes(File.OpenInput(Dir,";
if (true) return anywheresoftware.b4a.keywords.Common.Bit.InputStreamToBytes((java.io.InputStream)(anywheresoftware.b4a.keywords.Common.File.OpenInput(_dir,_filename).getObject()));
RDebugUtils.currentLine=15204356;
 //BA.debugLineNum = 15204356;BA.debugLine="End Sub";
return null;
}
public static String  _formatfilesize(float _bytes) throws Exception{
RDebugUtils.currentModule="fileutility";
if (Debug.shouldDelegate(ba, "formatfilesize"))
	 {return ((String) Debug.delegate(ba, "formatfilesize", new Object[] {_bytes}));}
String[] _unit = null;
double _po = 0;
double _si = 0;
int _i = 0;
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Public Sub FormatFileSize(Bytes As Float) As Strin";
RDebugUtils.currentLine=15335426;
 //BA.debugLineNum = 15335426;BA.debugLine="Private Unit() As String = Array As String(\" Byte";
_unit = new String[]{" Byte"," KB"," MB"," GB"," TB"," PB"," EB"," ZB"," YB"};
RDebugUtils.currentLine=15335428;
 //BA.debugLineNum = 15335428;BA.debugLine="If Bytes = 0 Then";
if (_bytes==0) { 
RDebugUtils.currentLine=15335430;
 //BA.debugLineNum = 15335430;BA.debugLine="Return \"0 Bytes\"";
if (true) return "0 Bytes";
 }else {
RDebugUtils.currentLine=15335434;
 //BA.debugLineNum = 15335434;BA.debugLine="Private Po, Si As Double";
_po = 0;
_si = 0;
RDebugUtils.currentLine=15335435;
 //BA.debugLineNum = 15335435;BA.debugLine="Private I As Int";
_i = 0;
RDebugUtils.currentLine=15335437;
 //BA.debugLineNum = 15335437;BA.debugLine="Bytes = Abs(Bytes)";
_bytes = (float) (anywheresoftware.b4a.keywords.Common.Abs(_bytes));
RDebugUtils.currentLine=15335439;
 //BA.debugLineNum = 15335439;BA.debugLine="I = Floor(Logarithm(Bytes, 1024))";
_i = (int) (anywheresoftware.b4a.keywords.Common.Floor(anywheresoftware.b4a.keywords.Common.Logarithm(_bytes,1024)));
RDebugUtils.currentLine=15335440;
 //BA.debugLineNum = 15335440;BA.debugLine="Po = Power(1024, I)";
_po = anywheresoftware.b4a.keywords.Common.Power(1024,_i);
RDebugUtils.currentLine=15335441;
 //BA.debugLineNum = 15335441;BA.debugLine="Si = Bytes / Po";
_si = _bytes/(double)_po;
RDebugUtils.currentLine=15335443;
 //BA.debugLineNum = 15335443;BA.debugLine="Return NumberFormat(Si, 1, 3) & Unit(I)";
if (true) return anywheresoftware.b4a.keywords.Common.NumberFormat(_si,(int) (1),(int) (3))+_unit[_i];
 };
RDebugUtils.currentLine=15335448;
 //BA.debugLineNum = 15335448;BA.debugLine="End Sub";
return "";
}
public static long  _sizeofcurrentfilesinfolder(String _dir) throws Exception{
RDebugUtils.currentModule="fileutility";
if (Debug.shouldDelegate(ba, "sizeofcurrentfilesinfolder"))
	 {return ((Long) Debug.delegate(ba, "sizeofcurrentfilesinfolder", new Object[] {_dir}));}
long _total = 0L;
String _filename = "";
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Public Sub SizeOfCurrentFilesInFolder(dir As Strin";
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="Dim total As Long";
_total = 0L;
RDebugUtils.currentLine=15007748;
 //BA.debugLineNum = 15007748;BA.debugLine="For Each filename As String In File.ListFiles(dir";
{
final anywheresoftware.b4a.BA.IterableList group2 = anywheresoftware.b4a.keywords.Common.File.ListFiles(_dir);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_filename = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=15007750;
 //BA.debugLineNum = 15007750;BA.debugLine="If File.IsDirectory(dir, filename) = False Then";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_dir,_filename)==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=15007752;
 //BA.debugLineNum = 15007752;BA.debugLine="total = total + File.Size(dir , filename)";
_total = (long) (_total+anywheresoftware.b4a.keywords.Common.File.Size(_dir,_filename));
 };
 }
};
RDebugUtils.currentLine=15007758;
 //BA.debugLineNum = 15007758;BA.debugLine="Return total";
if (true) return _total;
RDebugUtils.currentLine=15007760;
 //BA.debugLineNum = 15007760;BA.debugLine="End Sub";
return 0L;
}
public static long  _sizeoffilesinfolder(String _dir) throws Exception{
RDebugUtils.currentModule="fileutility";
if (Debug.shouldDelegate(ba, "sizeoffilesinfolder"))
	 {return ((Long) Debug.delegate(ba, "sizeoffilesinfolder", new Object[] {_dir}));}
long _total = 0L;
String _filename = "";
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Public Sub SizeOfFilesInFolder(dir As String) As L";
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="Dim total As Long";
_total = 0L;
RDebugUtils.currentLine=15073284;
 //BA.debugLineNum = 15073284;BA.debugLine="For Each filename As String In File.ListFiles(dir";
{
final anywheresoftware.b4a.BA.IterableList group2 = anywheresoftware.b4a.keywords.Common.File.ListFiles(_dir);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_filename = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=15073286;
 //BA.debugLineNum = 15073286;BA.debugLine="If File.IsDirectory(dir, filename) = False Then";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_dir,_filename)==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=15073288;
 //BA.debugLineNum = 15073288;BA.debugLine="total = total + File.Size(dir, filename)";
_total = (long) (_total+anywheresoftware.b4a.keywords.Common.File.Size(_dir,_filename));
 }else {
RDebugUtils.currentLine=15073292;
 //BA.debugLineNum = 15073292;BA.debugLine="total = total + SizeOfFilesInFolder(dir & \"\\\" &";
_total = (long) (_total+_sizeoffilesinfolder(_dir+"\\"+_filename));
 };
 }
};
RDebugUtils.currentLine=15073298;
 //BA.debugLineNum = 15073298;BA.debugLine="Return total";
if (true) return _total;
RDebugUtils.currentLine=15073300;
 //BA.debugLineNum = 15073300;BA.debugLine="End Sub";
return 0L;
}
}