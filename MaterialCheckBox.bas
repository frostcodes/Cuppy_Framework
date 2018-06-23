Type=Class
Version=5.51
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'Custom View class
 
#Event: CheckedChanged(value as int)
 
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
	Public CHECKED_STATE As Int = 0 
	Public UNCHECKED_STATE As Int = 1
	Public INDETERMINATE_STATE As Int = 2
	 
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("MaterialCheckboxLayout")
	'set using theme...
	setBorder(StyleManager.DefaultTheme.Get("divider"), 2)
	setCheckedColor(StyleManager.DefaultTheme.Get("primary"))
	
	'TODO: create a designer prorerty for this...
	setCheckState(UNCHECKED_STATE) 'set initial value
	 
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
 
	CSSUtils.SetStyleProperty( CheckboxPane, "-fx-background-color", color)
 
End Sub

Public Sub setRotationX(angle As Float)
	
	ControlsUtils.setPaneRotationX(CheckboxPane, angle) 'rotate
	 
End Sub

Public Sub setBorder(color As String , width As Int)
	
	ControlsUtils.setPaneBorder(CheckboxPane, color, width)

End Sub
 
Public Sub setBorderRadius(radius As Int)
	
	ControlsUtils.setPaneBorderRadius(CheckboxPane, radius)
	
End Sub
 
Public Sub setPaneEffect(effect As String)
	
	ControlsUtils.setPaneEffect(CheckboxPane, effect)
	
End Sub

Public Sub removeEffects()
	
	ControlsUtils.removePaneEffect(CheckboxPane)
	
End Sub

#End Region
  
Public Sub setCheckedColor(color As String)
  	
	CSSUtils.SetStyleProperty( CheckedLabel, "-fx-background-color", color)
	
End Sub
 
Public Sub setCheckState(value As Int)
	 
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

Public Sub checked As Boolean

	Return CheckedLabel.Visible
	 
End Sub

Public Sub IsIndeterminate As Boolean
	
	Return CheckedLabel.Alpha = "0.6"
	
End Sub

'TODO: allow settingicon form designer
Public Sub setIcon(iconCode As Int)
	
	CheckedLabel.Text = Chr(iconCode)
	
End Sub
   
Private Sub CheckboxPane_MousePressed (EventData As MouseEvent)
	 
	If Not(checked) Or IsIndeterminate Then
	
		setCheckState(CHECKED_STATE)
	
	Else
	
 	 setCheckState(UNCHECKED_STATE)
		   
	End If
	
	
End Sub
