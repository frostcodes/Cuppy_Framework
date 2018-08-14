B4J=true
Group=Cuppy Framework\Cuppy\Controls
ModulesStructureVersion=1
Type=Class
Version=5.51
@EndOfDesignText@
'Custom View class
 
#Event: CheckedChanged(value as int)
#Event: MouseEntered(EventData As MouseEvent)
#Event: MouseExited(EventData As MouseEvent)

#RaisesSynchronousEvents: CheckedChanged
#RaisesSynchronousEvents: MouseEntered
#RaisesSynchronousEvents: MouseExited
 
 'TODO: make font adjust when resized
#Region Internal Segment

Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
 
	Public CheckedLabel As Label
	Public CheckboxPane As Pane
	
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
	mBase.LoadLayout("CFMaterialCheckboxUI")
	'set using theme...
	SetBorder(CFStyleManager.DefaultTheme.Get("divider"), 2)
	SetCheckedColor(CFStyleManager.DefaultTheme.Get("primary"))
	
	'TODO: create a designer prorerty for this...
	SetCheckState(UNCHECKED_STATE) 'set initial value
	 
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
 
	CheckboxPane.PrefWidth = Width
	CheckedLabel.PrefWidth = Width
	
	CheckboxPane.PrefHeight = Height
	CheckedLabel.PrefHeight = Height
	 
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
	
	CFControlsUtils.SetPaneRotationX(CheckboxPane, angle) 'rotate
	 
End Sub

Public Sub SetBorder(color As String , width As Int)
	
	CFControlsUtils.SetPaneBorder(CheckboxPane, color, width)

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
  	
	 CFControlsUtils.setBG(CheckedLabel, color)
	
End Sub
 
Public Sub SetCheckState(value As Int)
	 
	If value = UNCHECKED_STATE Then
		
		CheckedLabel.Visible = False
		CheckedLabel.SetAlphaAnimated(300, 0 )
		 
	Else if value = CHECKED_STATE Then
	
		CheckedLabel.Visible = True
		CheckedLabel.SetAlphaAnimated(300, 1 )
		 
		Else
			
		CheckedLabel.SetAlphaAnimated(300, 0.6 )
		CheckedLabel.Visible = True
		 	
	End If
	 
	'call callback for checked changed status
	 CallSubDelayed2(mCallBack, mEventName & "_CheckedChanged" , value)
	 
End Sub

Public Sub Checked As Boolean

	Return CheckedLabel.Visible
	 
End Sub

Public Sub IsIndeterminate As Boolean
	
	Return CheckedLabel.Alpha = "0.6"
	
End Sub

'TODO: allow setting icon from designer
Public Sub SetIcon(iconCode As Int)
	
	CheckedLabel.Text = Chr(iconCode)
	
End Sub
   
Private Sub CheckboxPane_MousePressed (EventData As MouseEvent)
	
	CheckboxPane.RequestFocus 'set focus
	
	If Not(Checked) Or IsIndeterminate Then
	
		SetCheckState(CHECKED_STATE)
	
	Else
	
		SetCheckState(UNCHECKED_STATE)
		   
	End If
	 
End Sub

Private Sub CheckboxPane_MouseEntered (EventData As MouseEvent)
	
	CallSubDelayed2(mCallBack, mEventName & "_MouseEntered" , EventData)
	
End Sub

Private Sub CheckboxPane_MouseExited (EventData As MouseEvent)
	
	CallSubDelayed2(mCallBack, mEventName & "_MouseExited" , EventData)
	
End Sub
