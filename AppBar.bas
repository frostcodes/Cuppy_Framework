B4J=true
Group=Cuppy\Controls\Material UI
ModulesStructureVersion=1
Type=Class
Version=5.51
@EndOfDesignText@
'Custom View class

#Region Internal Segment

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

#End Region


#Region Actions and Effects


Public Sub SetBg(color As String)
	
	CSSUtils.SetStyleProperty( Label1, "-fx-background-color", color)
	CSSUtils.SetStyleProperty( InnerPane, "-fx-background-color", color)
 
End Sub
 
Public Sub setRotationX(angle As Float)
	
	ControlsUtils.setRotationX(Label1, angle) 'rotate
	ControlsUtils.setPaneRotationX(InnerPane , angle) 'rotate
	 
End Sub

Public Sub setBorder(color As String , width As Int)
	
	ControlsUtils.setBorder(Label1, color, width)
 	ControlsUtils.setPaneBorder(InnerPane, color, width)
'	
End Sub

Public Sub setBorderRadius(radius As Int)
	ControlsUtils.setBorderRadius(Label1, radius)
	ControlsUtils.setPaneBorderRadius(InnerPane, radius)
	
End Sub

Public Sub setPaneEffect(effect As String)
	
	ControlsUtils.setEffect(Label1, effect)
	
End Sub

Public Sub removeEffects()
	
	ControlsUtils.removeEffect(Label1)
	
End Sub

#End Region
