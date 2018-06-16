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



