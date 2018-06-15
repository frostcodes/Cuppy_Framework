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
 