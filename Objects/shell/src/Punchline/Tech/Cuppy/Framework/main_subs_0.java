package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (main) ","main",0,main.ba,main.mostCurrent,21);
if (RapidSub.canDelegate("application_error")) { return Punchline.Tech.Cuppy.Framework.main.remoteMe.runUserSub(false, "main","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 21;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Return True";
Debug.ShouldStop(2097152);
if (true) return main.__c.getField(true,"True");
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,16);
if (RapidSub.canDelegate("appstart")) { return Punchline.Tech.Cuppy.Framework.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
Debug.locals.put("form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 16;BA.debugLine="Sub AppStart (form1 As Form, Args() As String)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
configs_subs_0._process_globals();
stringutility_subs_0._process_globals();
mathutility_subs_0._process_globals();
datatypeutility_subs_0._process_globals();
stylemanager_subs_0._process_globals();
apputility_subs_0._process_globals();
controlsutils_subs_0._process_globals();
fileutility_subs_0._process_globals();
animationmanager_subs_0._process_globals();
licensemanager_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.main");
configs.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.configs");
todos.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.todos");
themes.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.themes");
stringutility.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.stringutility");
mathutility.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.mathutility");
datatypeutility.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.datatypeutility");
metrocircletogglebutton.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.metrocircletogglebutton");
stylemanager.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.stylemanager");
barpreloader.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.barpreloader");
materiallabel.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.materiallabel");
materialbutton.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.materialbutton");
divider.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.divider");
metrolinklabel.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.metrolinklabel");
modal.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.modal");
apputility.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.apputility");
controlsutils.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.controlsutils");
appbar.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.appbar");
squarefab.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.squarefab");
fileutility.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.fileutility");
materialcheckbox.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.materialcheckbox");
materialradiobox.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.materialradiobox");
materiallinearprogressbar.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.materiallinearprogressbar");
fab.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.fab");
materialcard.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.materialcard");
chips.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.chips");
animationmanager.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.animationmanager");
licensemanager.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.licensemanager");
materialswitch.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.materialswitch");
metrotogglebutton.myClass = BA.getDeviceClass ("Punchline.Tech.Cuppy.Framework.metrotogglebutton");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}