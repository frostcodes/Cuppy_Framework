B4J=true
Group=Cuppy\Utilities
ModulesStructureVersion=1
Type=StaticCode
Version=5.51
@EndOfDesignText@
'This file contains function that are useful for controls and views
Private Sub Process_Globals
	Private fx As JFX
End Sub

Public Sub setRotationX(controlObj As Control, Angle As Float)
	CSSUtils.SetStyleProperty(controlObj, "-fx-rotate", Angle)
End Sub
 
Public Sub setPaneRotationX(PaneObj As Pane, Angle As Float)
	CSSUtils.SetStyleProperty(PaneObj, "-fx-rotate", Angle)
End Sub
 
Public Sub setBorder(controlObj As Control, color As String , width As Int)
	
	CSSUtils.SetStyleProperty( controlObj, "-fx-border-color", color)
	CSSUtils.SetStyleProperty (controlObj, "-fx-border-width", width)
	
End Sub
	 
Public Sub setPaneBorder(PaneObj As Pane, color As String , width As Int)
	
	CSSUtils.SetStyleProperty( PaneObj, "-fx-border-color", color)
	CSSUtils.SetStyleProperty (PaneObj, "-fx-border-width", width)
	
End Sub
	
Public Sub setPaneBorderRadius(PaneObj As Pane, radius As Int)
	 
	CSSUtils.SetStyleProperty(PaneObj,"-fx-border-radius", radius)
	
End Sub


Public Sub setBorderRadius(controlObj As Control, radius As Int)
	 
	CSSUtils.SetStyleProperty(controlObj, "-fx-border-radius", radius)
	
End Sub

Public Sub setPaneEffect(PaneObj As Pane, effect As String)
	 
	CSSUtils.SetStyleProperty(PaneObj, "-fx-effect" , effect)
	
End Sub
 
Public Sub setEffect(controlObj As Control, effect As String)
	 
	CSSUtils.SetStyleProperty(controlObj, "-fx-effect" , effect)
	
	
End Sub



Public Sub removePaneEffect(PaneObj As Pane)
	 
	CSSUtils.SetStyleProperty(PaneObj, "-fx-effect" , "none")
	
End Sub
 
Public Sub removeEffect(controlObj As Control)
	 
	CSSUtils.SetStyleProperty(controlObj, "-fx-effect" ,  "none")
	
	
End Sub



Public Sub setPaneBG(PaneObj As Pane, color As String)
	 
	CSSUtils.SetStyleProperty( PaneObj, "-fx-background-color", color)
	
	
End Sub
 
Public Sub setBG(controlObj As Control, color As String)
	 
	CSSUtils.SetStyleProperty( controlObj, "-fx-background-color", color)
	 
End Sub


Public Sub setTextColor(controlObj As Control, color As String)
	
	CSSUtils.SetStyleProperty(controlObj,"-fx-text-fill",  color)
	 
End Sub





'TODO : make get for all the above...

Public Sub getPaneBG(PaneObj As Pane) As String
	 
	Return CSSUtils.GetStyleProperty(PaneObj, "-fx-background-color")
	 
End Sub
 
Public Sub getBG(controlObj As Control) As String
	 
	Return CSSUtils.GetStyleProperty(controlObj, "-fx-background-color")
	 
End Sub

 #Region Add/remove Tooltip
 
'Add tooltip to an Image View
'JavaFX API Reference: http://download.java.net/jdk8/jfxdocs/javafx/scene/control/Tooltip.html
'FROM: https://www.b4x.com/android/forum/threads/add-a-tooltip-to-an-imageview.65439/
Public Sub addImageViewToolTip(ControlObj As ImageView, msg As String)
   
	Dim joToolTip As JavaObject
	Dim joToolTip2 As JavaObject = joToolTip.InitializeNewInstance("javafx.scene.control.Tooltip", Array(msg))
   
	joToolTip.RunMethod("install", Array(ControlObj, joToolTip2))
     
End Sub

'Remove tooltip from an Image View
'JavaFX API Reference: http://download.java.net/jdk8/jfxdocs/javafx/scene/control/Tooltip.html
'FROM: https://www.b4x.com/android/forum/threads/add-a-tooltip-to-an-imageview.65439/
Public Sub removeImageViewToolTip(ControlObj As ImageView)
   
    Dim joToolTip As JavaObject
    Dim joToolTip2 As JavaObject = joToolTip.InitializeNewInstance("javafx.scene.control.Tooltip", Array(""))
    
		joToolTip.RunMethod("uninstall", Array(ControlObj, joToolTip2))
	
End Sub
 
'Add tooltip to a Control
'JavaFX API Reference: http://download.java.net/jdk8/jfxdocs/javafx/scene/control/Tooltip.html
'FROM: https://www.b4x.com/android/forum/threads/add-a-tooltip-to-an-imageview.65439/
Public Sub addControlToolTip(ControlObj As Control, msg As String)
    
	Dim joToolTip As JavaObject
	Dim joToolTip2 As JavaObject = joToolTip.InitializeNewInstance("javafx.scene.control.Tooltip", Array(msg))
    joToolTip.RunMethod("install", Array(ControlObj, joToolTip2))
	 
End Sub
 
'Remove tooltip from a Control
'JavaFX API Reference: http://download.java.net/jdk8/jfxdocs/javafx/scene/control/Tooltip.html
'FROM: https://www.b4x.com/android/forum/threads/add-a-tooltip-to-an-imageview.65439/
Public Sub removeControlToolTip(ControlObj As Control)
    
	Dim joToolTip As JavaObject
	Dim joToolTip2 As JavaObject = joToolTip.InitializeNewInstance("javafx.scene.control.Tooltip", Array(""))
    
	joToolTip.RunMethod("uninstall", Array(ControlObj, joToolTip2))
 
End Sub
 
'Add tooltip to a Pane
'JavaFX API Reference: http://download.java.net/jdk8/jfxdocs/javafx/scene/control/Tooltip.html
'FROM: https://www.b4x.com/android/forum/threads/add-a-tooltip-to-an-imageview.65439/
Public Sub addPaneToolTip(PanelObj As Pane, msg As String)
    
	Dim joToolTip As JavaObject
	Dim joToolTip2 As JavaObject = joToolTip.InitializeNewInstance("javafx.scene.control.Tooltip", Array(msg))
	joToolTip.RunMethod("install", Array(PanelObj, joToolTip2))
	 
End Sub
 
'Remove tooltip from a Pane
'JavaFX API Reference: http://download.java.net/jdk8/jfxdocs/javafx/scene/control/Tooltip.html
'FROM: https://www.b4x.com/android/forum/threads/add-a-tooltip-to-an-imageview.65439/
Public Sub removePaneToolTip(PanelObj As Pane)
    
	Dim joToolTip As JavaObject
	Dim joToolTip2 As JavaObject = joToolTip.InitializeNewInstance("javafx.scene.control.Tooltip", Array(""))
    
	joToolTip.RunMethod("uninstall", Array(PanelObj, joToolTip2))
 
End Sub

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