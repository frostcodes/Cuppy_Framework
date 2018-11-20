package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cfconfigs_subs_0 {


public static RemoteObject  _donationlink() throws Exception{
try {
		Debug.PushSubsStack("DonationLink (cfconfigs) ","cfconfigs",2,cfconfigs.ba,cfconfigs.mostCurrent,12);
if (RapidSub.canDelegate("donationlink")) { return Punchline.Tech.Cuppy.Framework.cfconfigs.remoteMe.runUserSub(false, "cfconfigs","donationlink");}
 BA.debugLineNum = 12;BA.debugLine="Public Sub DonationLink As String";
Debug.ShouldStop(2048);
 BA.debugLineNum = 14;BA.debugLine="Return \"http://punchlinetech.com/product/cuppy-fr";
Debug.ShouldStop(8192);
if (true) return BA.ObjectToString("http://punchlinetech.com/product/cuppy-framework-free/#FullCuppyFramework");
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fullcuppyrequiredimageurl() throws Exception{
try {
		Debug.PushSubsStack("FullCuppyRequiredImageUrl (cfconfigs) ","cfconfigs",2,cfconfigs.ba,cfconfigs.mostCurrent,19);
if (RapidSub.canDelegate("fullcuppyrequiredimageurl")) { return Punchline.Tech.Cuppy.Framework.cfconfigs.remoteMe.runUserSub(false, "cfconfigs","fullcuppyrequiredimageurl");}
 BA.debugLineNum = 19;BA.debugLine="Public Sub FullCuppyRequiredImageUrl As String";
Debug.ShouldStop(262144);
 BA.debugLineNum = 21;BA.debugLine="Return File.GetUri(File.DirAssets, \"full-cuppy-fr";
Debug.ShouldStop(1048576);
if (true) return cfconfigs.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(cfconfigs.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("full-cuppy-framework-required.png")));
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isfreeversion() throws Exception{
try {
		Debug.PushSubsStack("IsFreeVersion (cfconfigs) ","cfconfigs",2,cfconfigs.ba,cfconfigs.mostCurrent,29);
if (RapidSub.canDelegate("isfreeversion")) { return Punchline.Tech.Cuppy.Framework.cfconfigs.remoteMe.runUserSub(false, "cfconfigs","isfreeversion");}
 BA.debugLineNum = 29;BA.debugLine="Public Sub IsFreeVersion As Boolean";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="Return False";
Debug.ShouldStop(1073741824);
if (true) return cfconfigs.__c.getField(true,"False");
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
public static RemoteObject  _isfullversion() throws Exception{
try {
		Debug.PushSubsStack("IsFullVersion (cfconfigs) ","cfconfigs",2,cfconfigs.ba,cfconfigs.mostCurrent,36);
if (RapidSub.canDelegate("isfullversion")) { return Punchline.Tech.Cuppy.Framework.cfconfigs.remoteMe.runUserSub(false, "cfconfigs","isfullversion");}
 BA.debugLineNum = 36;BA.debugLine="Public Sub IsFullVersion As Boolean";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="Return True";
Debug.ShouldStop(32);
if (true) return cfconfigs.__c.getField(true,"True");
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Public LibraryAuthor As String = \"Punchline Techn";
cfconfigs._libraryauthor = BA.ObjectToString("Punchline Technologies");
 //BA.debugLineNum = 6;BA.debugLine="Public LibraryName As String =  \"Cuppy Framework\"";
cfconfigs._libraryname = BA.ObjectToString("Cuppy Framework");
 //BA.debugLineNum = 7;BA.debugLine="Public LibraryVersion As Double =  1.03";
cfconfigs._libraryversion = BA.numberCast(double.class, 1.03);
 //BA.debugLineNum = 8;BA.debugLine="Public LibraryCopyright As String =  \"Copyright t";
cfconfigs._librarycopyright = BA.ObjectToString("Copyright to Oluwaseyi Aderinkomi < Frost Codes >");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}