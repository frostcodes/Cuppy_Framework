﻿B4J=true
Group=Cuppy Framework\Cuppy\Controls
ModulesStructureVersion=1
Type=Class
Version=5.51
@EndOfDesignText@
'Custom View class
 
#Event: CheckedChanged(value as int)
#Event: Resize (Width As Double, Height As Double)


#RaisesSynchronousEvents: CheckedChanged
#RaisesSynchronousEvents: Resize
 
 'TODO: make font adjust when resized
#Region Internal Segment

Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
 
	Public CheckboxPane As Pane
	Public CheckedPane As Pane
	
	'Checkbox states
	Public UNCHECKED_STATE As Int = 0
	Public CHECKED_STATE As Int = 1
	Public INDETERMINATE_STATE As Int = 2
	 
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("CFMaterialRadioBoxUI")
	'set using theme...
	'SetBg(StyleManager.DefaultTheme.Get("divider"))
	SetBorder(CFStyleManager.DefaultTheme.Get("divider"), 2)
	
	SetCheckedColor(CFStyleManager.DefaultTheme.Get("primary"))
	
	'TODO: create a designer prorerty for this...
	SetCheckState(UNCHECKED_STATE) 'set initial value
	 
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
  
  CallSubDelayed3(mCallBack, mEventName & "_Resize", Width, Height)
 
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region

#Region Actions and Effects

Public Sub SetBg(color As String)
 
	CFControlsUtils.SetPaneBG( CheckboxPane, color)
 
End Sub

Public Sub SetRotationX(angle As Float)
	
	CFControlsUtils.setPaneRotation(CheckboxPane, angle) 'rotate
	 
End Sub

Public Sub SetBorder(color As String , width As Int)
	
	CFControlsUtils.setPaneBorder(CheckboxPane, color, width)

End Sub
 
Public Sub SetBorderRadius(radius As Int)
	
	CFControlsUtils.setPaneBorderRadius(CheckboxPane, radius)
	
End Sub
 
Public Sub SetPaneEffect(effect As String)
	
	CFControlsUtils.setPaneEffect(CheckboxPane, effect)
	
End Sub

Public Sub RemoveEffects()
	
	CFControlsUtils.removePaneEffect(CheckboxPane)
	
End Sub

#End Region
  
Public Sub SetCheckedColor(color As String)
  	
	CFControlsUtils.SetPaneBG( CheckedPane, color)
	
End Sub
 
Public Sub SetCheckState(value As Int)
	 
	If value = UNCHECKED_STATE Then
		
		CheckedPane.Visible = False
		CheckedPane.SetAlphaAnimated(300, 0 )
		'SetBg(StyleManager.DefaultTheme.Get("divider"))
		
		 
	Else if value = CHECKED_STATE Then
	
		CheckedPane.Visible = True
		CheckedPane.SetAlphaAnimated(300, 1 )
		'SetBg(StyleManager.DefaultTheme.Get("primary"))
		
		 
	Else
			
		CheckedPane.SetAlphaAnimated(300, 0.6 )
		CheckedPane.Visible = True
		'SetBg(StyleManager.DefaultTheme.Get("primary"))
		
		 	
	End If
	 
	'call callback for checked changed status
	CallSubDelayed2(mCallBack, mEventName & "_CheckedChanged" , value)
	  
End Sub

Public Sub Checked As Boolean

	Return CheckedPane.Visible
	 
End Sub

Public Sub IsIndeterminate As Boolean
	
	Return CheckedPane.Alpha = "0.6"
	
End Sub
 
Private Sub CheckboxPane_MousePressed (EventData As MouseEvent)
	 
	CheckboxPane.RequestFocus 'set focus
	
	If Not(Checked) Or IsIndeterminate Then
	
		SetCheckState(CHECKED_STATE)
	
	Else
	
		SetCheckState(UNCHECKED_STATE)
		  
	End If
	
End Sub
