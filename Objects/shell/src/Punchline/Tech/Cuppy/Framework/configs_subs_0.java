package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class configs_subs_0 {


public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Public LibraryAuthor As String = \"Punchline Techn";
configs._libraryauthor = BA.ObjectToString("Punchline Technologies");
 //BA.debugLineNum = 6;BA.debugLine="Public LibraryName As String =  \"Cuppy Framework\"";
configs._libraryname = BA.ObjectToString("Cuppy Framework");
 //BA.debugLineNum = 7;BA.debugLine="Public LibraryVersion As String =  \"0.9.85\"";
configs._libraryversion = BA.ObjectToString("0.9.85");
 //BA.debugLineNum = 8;BA.debugLine="Public DebugMode As Boolean = True  'are we debug";
configs._debugmode = configs.__c.getField(true,"True");
 //BA.debugLineNum = 12;BA.debugLine="Public AppDir As String = File.DirApp";
configs._appdir = configs.__c.getField(false,"File").runMethod(true,"getDirApp");
 //BA.debugLineNum = 13;BA.debugLine="Public RobotoFontsPath As String =  File.Combine(";
configs._robotofontspath = configs.__c.getField(false,"File").runMethod(true,"Combine",(Object)(configs._appdir),(Object)(RemoteObject.createImmutable("Roboto")));
 //BA.debugLineNum = 19;BA.debugLine="Private LicenseServer As String =\"\" 'ignore";
configs._licenseserver = BA.ObjectToString("");
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}