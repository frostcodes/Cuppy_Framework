package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (main) ","main",0,main.ba,main.mostCurrent,37);
if (RapidSub.canDelegate("application_error")) { return Punchline.Tech.Cuppy.Framework.main.remoteMe.runUserSub(false, "main","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 37;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="Return True";
Debug.ShouldStop(32);
if (true) return main.__c.getField(true,"True");
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,24);
if (RapidSub.canDelegate("appstart")) { return Punchline.Tech.Cuppy.Framework.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 24;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hidecfpluginrendererui() throws Exception{
try {
		Debug.PushSubsStack("HideCfPluginRendererUI (main) ","main",0,main.ba,main.mostCurrent,47);
if (RapidSub.canDelegate("hidecfpluginrendererui")) { return Punchline.Tech.Cuppy.Framework.main.remoteMe.runUserSub(false, "main","hidecfpluginrendererui");}
RemoteObject _dummypane = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
 BA.debugLineNum = 47;BA.debugLine="Public Sub HideCfPluginRendererUI";
Debug.ShouldStop(16384);
 BA.debugLineNum = 49;BA.debugLine="Dim DummyPane As Pane";
Debug.ShouldStop(65536);
_dummypane = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");Debug.locals.put("DummyPane", _dummypane);
 BA.debugLineNum = 50;BA.debugLine="DummyPane.Initialize(\"DummyPane\")";
Debug.ShouldStop(131072);
_dummypane.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("DummyPane")));
 BA.debugLineNum = 51;BA.debugLine="DummyPane.LoadLayout(\"CFPluginRendererUI\")";
Debug.ShouldStop(262144);
_dummypane.runMethodAndSync(false,"LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("CFPluginRendererUI")));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
cfconfigs_subs_0._process_globals();
cfstringutility_subs_0._process_globals();
cfdatageneratorutility_subs_0._process_globals();
cffileutility_subs_0._process_globals();
cfstylemanager_subs_0._process_globals();
cfcontrolsutils_subs_0._process_globals();
cfanimationmanager_subs_0._process_globals();
cfmathutility_subs_0._process_globals();
cfdatatypeutility_subs_0._process_globals();
cfapputility_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.main");
todos.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.todos");
cfconfigs.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cfconfigs");
cfmaterialappbar.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cfmaterialappbar");
cfstringutility.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cfstringutility");
cfdatageneratorutility.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cfdatageneratorutility");
cfthemes.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cfthemes");
cffileutility.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cffileutility");
cfmaterialcheckbox.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cfmaterialcheckbox");
cfbarpreloader.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cfbarpreloader");
cfstylemanager.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cfstylemanager");
cfmaterialdivider.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cfmaterialdivider");
cfcontrolsutils.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cfcontrolsutils");
cfmodal.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cfmodal");
cfmetrolinklabel.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cfmetrolinklabel");
cfmateriallabel.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cfmateriallabel");
cfmetrotogglebutton.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cfmetrotogglebutton");
cfmaterialfab.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cfmaterialfab");
cfmaterialbutton.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cfmaterialbutton");
cfmaterialradiobox.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cfmaterialradiobox");
cfmaterialsquarefab.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cfmaterialsquarefab");
cfmaterialswitch.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cfmaterialswitch");
cfmetrocircletogglebutton.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cfmetrocircletogglebutton");
cfmateriallinearprogressbar.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cfmateriallinearprogressbar");
cfmaterialcard.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cfmaterialcard");
cfanimationmanager.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cfanimationmanager");
cfmathutility.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cfmathutility");
cfdatatypeutility.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cfdatatypeutility");
cfapputility.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.cfapputility");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}