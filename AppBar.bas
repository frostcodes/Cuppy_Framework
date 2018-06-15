Type=Class
Version=5.51
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'Custom View class
Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
	Private Label1 As Label
	Public InnerPane As Pane
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("AppBarLayout")
	'set using theme...
	SetBg(StyleManager.DefaultTheme.Get("primary"))
	
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
	
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

Public Sub SetBg(color As String)
	
	CSSUtils.SetStyleProperty( Label1, "-fx-background-color", color)
	CSSUtils.SetStyleProperty( InnerPane, "-fx-background-color", color)
 
End Sub


Public Sub setRotationX(angle As Float)
	
	ControlsUtils.setRotationX(Label1, angle) 'rotate
	ControlsUtils.setPaneRotationX(InnerPane , angle) 'rotate
	 
End Sub
