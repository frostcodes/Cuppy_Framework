Type=StaticCode
Version=5.51
ModulesStructureVersion=1
B4J=true
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
	 
	CSSUtils.SetStyleProperty(PaneObj, " -fx-effect" , effect)
	
End Sub
 
Public Sub setEffect(controlObj As Control, effect As String)
	 
	CSSUtils.SetStyleProperty(controlObj, " -fx-effect" , effect)
	
	
End Sub



Public Sub removePaneEffect(PaneObj As Pane)
	 
	CSSUtils.SetStyleProperty(PaneObj, " -fx-effect" , "none")
	
End Sub
 
Public Sub removeEffect(controlObj As Control)
	 
	CSSUtils.SetStyleProperty(controlObj, " -fx-effect" ,  "none")
	
	
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
