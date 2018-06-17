Type=Class
Version=5.51
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'Custom View class
#Region Internal Segment

Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
	Public FAB_Btn As Label
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("FABLayout")
	'set using theme...
	SetBg(StyleManager.DefaultTheme.Get("accent"))
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
	 
	'maintain aspect ratio
	FAB_Btn.PrefWidth = Width
	FAB_Btn.PrefHeight = Width
	 
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region

#Region Actions and Effects


Public Sub SetBg(color As String)
 
 CSSUtils.SetStyleProperty( FAB_Btn, "-fx-background-color", color)
 
End Sub

Public Sub setBorder(color As String , width As Int)
	
	ControlsUtils.setBorder(FAB_Btn, color, width)

End Sub

Sub setBorderRadius(radius As Int)
	
	ControlsUtils.setBorderRadius(FAB_Btn, radius)
	
End Sub


Public Sub setPaneEffect(effect As String)
	
	ControlsUtils.setEffect(FAB_Btn, effect)
	
End Sub

Public Sub removeEffects()
	
	ControlsUtils.removeEffect(FAB_Btn)
	
End Sub
 
Public Sub setRotationX(angle As Float)
	
	ControlsUtils.setRotationX(FAB_Btn, angle) 'rotate
	 
End Sub


#End Region


'hover effect
Sub FAB_Btn_MouseMoved (EventData As MouseEvent)
	
	'FAB_Btn.SetAlphaAnimated(300, 0.8)
 
End Sub
 
Sub FAB_Btn_MouseReleased (EventData As MouseEvent)
 
	'	FAB_Btn.SetAlphaAnimated(300, 0.9)
	'
	'	If  EventData.PrimaryButtonDown Then
	'
	''		FAB_Btn.SetAlphaAnimated(300, 0.9)
	'		Log(11147687)
	'		FAB_Btn.SetAlphaAnimated(200,1)
	'
	'
	'	Else
	'
	'		Log(9447687)
	'	'	FAB_Btn.SetAlphaAnimated(300, 0.9)
	'
	' 	FAB_Btn.SetAlphaAnimated(200,1)
	'
	'	End If
	
	
End Sub

Sub FAB_Btn_FocusChanged (HasFocus As Boolean)
	'
	'	If Not(HasFocus) Then
	'
	'		Log(65447687)
	'		FAB_Btn.SetAlphaAnimated(200,1)
	'
	'	End If
	
End Sub
