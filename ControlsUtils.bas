Type=StaticCode
Version=5.51
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'Static code module
Private Sub Process_Globals
	Private fx As JFX
End Sub

Sub setRotationX(controlObj As Control, Angle As Float)
	CSSUtils.SetStyleProperty(controlObj, "-fx-rotate", Angle)
End Sub
 
Sub setPaneRotationX(PaneObj As Pane, Angle As Float)
	CSSUtils.SetStyleProperty(PaneObj, "-fx-rotate", Angle)
End Sub
 
Sub setBorder(controlObj As Control, color As String , width As Int)
	
	CSSUtils.SetStyleProperty( controlObj, "-fx-border-color", color)
	CSSUtils.SetStyleProperty (controlObj, "-fx-border-width", width)
	
End Sub
	 
Sub setPaneBorder(PaneObj As Pane, color As String , width As Int)
	
	CSSUtils.SetStyleProperty( PaneObj, "-fx-border-color", color)
	CSSUtils.SetStyleProperty (PaneObj, "-fx-border-width", width)
	
End Sub
	
Sub setPaneBorderRadius(PaneObj As Pane, radius As Int)
	 
	CSSUtils.SetStyleProperty(PaneObj,"-fx-border-radius", radius)
	
End Sub


Sub setBorderRadius(controlObj As Control, radius As Int)
	 
	CSSUtils.SetStyleProperty(controlObj, "-fx-border-radius", radius)
	
End Sub

Sub setPaneEffect(PaneObj As Pane, effect As String)
	 
	CSSUtils.SetStyleProperty(PaneObj, " -fx-effect" , effect)
	
End Sub
 
Sub setEffect(controlObj As Control, effect As String)
	 
	CSSUtils.SetStyleProperty(controlObj, " -fx-effect" , effect)
	
	
End Sub



Sub removePaneEffect(PaneObj As Pane)
	 
	CSSUtils.SetStyleProperty(PaneObj, " -fx-effect" , "none")
	
End Sub
 
Sub removeEffect(controlObj As Control)
	 
	CSSUtils.SetStyleProperty(controlObj, " -fx-effect" ,  "none")
	
	
End Sub



Sub setPaneBG(PaneObj As Pane, color As String)
	 
	CSSUtils.SetStyleProperty( PaneObj, "-fx-background-color", color)
	
	
End Sub
 
Public Sub setBG(controlObj As Control, color As String)
	 
	CSSUtils.SetStyleProperty( controlObj, "-fx-background-color", color)
	 
End Sub







'TODO : make get for all the above...

Sub getPaneBG(PaneObj As Pane) As String
	 
	Return CSSUtils.GetStyleProperty(PaneObj, "-fx-background-color")
	 
End Sub
 
Sub getBG(controlObj As Control) As String
	 
	Return CSSUtils.GetStyleProperty(controlObj, "-fx-background-color")
	 
End Sub
