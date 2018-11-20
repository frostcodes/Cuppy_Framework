B4J=true
Group=Cuppy Framework\Cuppy\Utilities
ModulesStructureVersion=1
Type=StaticCode
Version=5.51
@EndOfDesignText@
'This file contains function that are useful for controls and views
Private Sub Process_Globals
	Private fx As JFX
End Sub

'Rotate a Control
Public Sub setRotation(controlObj As Node, Angle As Float)
	
	CSSUtils.SetStyleProperty(controlObj, "-fx-rotate", Angle)
	
End Sub
  
'Set a Control Border color and width
Public Sub setBorder(controlObj As Node, color As String , width As Int)
	
	CSSUtils.SetStyleProperty( controlObj, "-fx-border-color", color)
	CSSUtils.SetStyleProperty (controlObj, "-fx-border-width", width)
	
End Sub
 
'Set a Control Border radiusNode
Public Sub setBorderRadius(controlObj As Node, radius As Int)
	 
	CSSUtils.SetStyleProperty(controlObj, "-fx-border-radius", radius)
	
End Sub

'Set a Control effect
Public Sub setEffect(controlObj As Node, effect As String)
	 
	CSSUtils.SetStyleProperty(controlObj, "-fx-effect" , effect)
	 
End Sub

'Removes a Control effect
Public Sub RemoveEffect(controlObj As Node)
	 
	CSSUtils.SetStyleProperty(controlObj, "-fx-effect" ,  "none")
	 
End Sub
 
'Sets a Control Background color
Public Sub setBG(controlObj As Node, color As String)
	 
	CSSUtils.SetStyleProperty( controlObj, "-fx-background-color", color)
	 
End Sub

'Sets a Control text color if supported like a label 
Public Sub setTextColor(controlObj As Node, color As String)
	
	CSSUtils.SetStyleProperty(controlObj,"-fx-text-fill",  color)
	 
End Sub





'TODO : make get for all the above...

 

'Get a Control Background color
Public Sub GetBG(controlObj As Node) As String
	 
	Return CSSUtils.GetStyleProperty(controlObj, "-fx-background-color")
	 
End Sub

 #Region Add/remove Tooltip
 
'Add tooltip to an Image View
'JavaFX API Reference: http://download.java.net/jdk8/jfxdocs/javafx/scene/control/Tooltip.html
'FROM: https://www.b4x.com/android/forum/threads/add-a-tooltip-to-an-imageview.65439/
Public Sub AddImageViewToolTip(ControlObj As ImageView, msg As String)
   
	Dim joToolTip As JavaObject
	Dim joToolTip2 As JavaObject = joToolTip.InitializeNewInstance("javafx.scene.control.Tooltip", Array(msg))
   
	joToolTip.RunMethod("install", Array(ControlObj, joToolTip2))
     
End Sub

'Remove tooltip from an Image View
'JavaFX API Reference: http://download.java.net/jdk8/jfxdocs/javafx/scene/control/Tooltip.html
'FROM: https://www.b4x.com/android/forum/threads/add-a-tooltip-to-an-imageview.65439/
Public Sub RemoveImageViewToolTip(ControlObj As ImageView)
   
    Dim joToolTip As JavaObject
    Dim joToolTip2 As JavaObject = joToolTip.InitializeNewInstance("javafx.scene.control.Tooltip", Array(""))
	joToolTip.RunMethod("uninstall", Array(ControlObj, joToolTip2))
	
End Sub
 
'Add tooltip to a Control
'JavaFX API Reference: http://download.java.net/jdk8/jfxdocs/javafx/scene/control/Tooltip.html
'FROM: https://www.b4x.com/android/forum/threads/add-a-tooltip-to-an-imageview.65439/
Public Sub AddControlToolTip(ControlObj As Node, msg As String)
    
	Dim joToolTip As JavaObject
	Dim joToolTip2 As JavaObject = joToolTip.InitializeNewInstance("javafx.scene.control.Tooltip", Array(msg))
	joToolTip.RunMethod("install", Array(ControlObj, joToolTip2))
	 
End Sub
 
'Remove tooltip from a Control
'JavaFX API Reference: http://download.java.net/jdk8/jfxdocs/javafx/scene/control/Tooltip.html
'FROM: https://www.b4x.com/android/forum/threads/add-a-tooltip-to-an-imageview.65439/
Public Sub RemoveControlToolTip(ControlObj As Node)
    
	Dim joToolTip As JavaObject
	Dim joToolTip2 As JavaObject = joToolTip.InitializeNewInstance("javafx.scene.control.Tooltip", Array(""))
    
	joToolTip.RunMethod("uninstall", Array(ControlObj, joToolTip2))
 
End Sub
 
'Add tooltip to a Pane
'JavaFX API Reference: http://download.java.net/jdk8/jfxdocs/javafx/scene/control/Tooltip.html
'FROM: https://www.b4x.com/android/forum/threads/add-a-tooltip-to-an-imageview.65439/
Public Sub AddPaneToolTip(PanelObj As Pane, msg As String)
    
	Dim joToolTip As JavaObject
	Dim joToolTip2 As JavaObject = joToolTip.InitializeNewInstance("javafx.scene.control.Tooltip", Array(msg))
	joToolTip.RunMethod("install", Array(PanelObj, joToolTip2))
	 
End Sub
 
'Remove tooltip from a Pane
'JavaFX API Reference: http://download.java.net/jdk8/jfxdocs/javafx/scene/control/Tooltip.html
'FROM: https://www.b4x.com/android/forum/threads/add-a-tooltip-to-an-imageview.65439/
Public Sub RemovePaneToolTip(PanelObj As Pane)
    
	Dim joToolTip As JavaObject
	Dim joToolTip2 As JavaObject = joToolTip.InitializeNewInstance("javafx.scene.control.Tooltip", Array(""))
    
	joToolTip.RunMethod("uninstall", Array(PanelObj, joToolTip2))
 
End Sub
 
'Configure tooltip behaviour
'Call it before showing the MainForm in your Main module,
'it will apply to all tooltips in the application.
' 
'Code:
'<code>
'Sub AppStart (Form1 As Form, Args() As String)
'
'	'Call it before Showing the Main form
'	CFControlsUtils.ConfigureTooltip(200,5000,500)
'
'	MainForm = Form1
'	MainForm.RootPane.LoadLayout("1") 'Load the layout file.
'	MainForm.Show
'
'End Sub
'</code>
'
'FROM: https://www.b4x.com/android/forum/threads/configure-tooltip-timings.76298/
Public Sub ConfigureTooltip(OpenDelay As Long,VisibleDuration As Long,CloseDelay As Long)

	Dim MEJO As JavaObject = Me
	Dim ClassShortName As String = MEJO.RunMethod("toString",Null)
	ClassShortName = ClassShortName.SubString(ClassShortName.LastIndexOf("."))
	Dim ModJO As JavaObject
	ModJO.InitializeStatic(CFAppUtility.GetPackageName(Me) & ClassShortName)

	If ModJO.RunMethod("setTooltipTimers",Array(OpenDelay, VisibleDuration, CloseDelay)) = False  Then
		Log($"*******${CRLF}Tooltip Configuration failed${CRLF}*******"$)
	End If

End Sub


#if java

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import javafx.scene.control.Tooltip;
import javafx.util.Duration;

  /**
   * Returns true if successful.
   * Current defaults are 1000, 5000, 200;
   */
  @SuppressWarnings({ "rawtypes", "unchecked" })
  public static boolean setTooltipTimers(long openDelay, long visibleDuration, long closeDelay)
  {
    try
    {
      Field f = Tooltip.class.getDeclaredField("BEHAVIOR");
      f.setAccessible(true);


      Class[] classes = Tooltip.class.getDeclaredClasses();
      for (Class clazz : classes)
      {
        if (clazz.getName().equals("javafx.scene.control.Tooltip$TooltipBehavior"))
        {
          Constructor ctor = clazz.getDeclaredConstructor(Duration.class, Duration.class, Duration.class, boolean.class);
          ctor.setAccessible(true);
          Object tooltipBehavior = ctor.newInstance(new Duration(openDelay), new Duration(visibleDuration), new Duration(closeDelay), false);
          f.set(null, tooltipBehavior);
          break;
        }
      }
    }
    catch (Exception e)
    {

      return false;
    }
    return true;
  }


#end if

#End Region

'
'.tooltip {
'    -fx-background-radius: 2 2 2 2;
'    -fx-background-color: linear-gradient(#FFFF99, #FFFF99);
'    -fx-text-fill: black;
'    -fx-font-size: 12px;
'}

'
'
'	-fx-rotate: 3;
'	-fx-translate-y: -2;
'	-fx-background-insets: 20 10 15 80;
'	-fx-background-color: -fx-app-background;
'
'
'
'	-fx-effect: dropshadow(three-pass-box, grey, 10, 0, 0, 15);
'	 