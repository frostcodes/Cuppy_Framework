B4J=true
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
 
#DesignerProperty: Key: CheckedState, DisplayName: Checked State, FieldType: String, DefaultValue: UNCHECKED, List: UNCHECKED|CHECKED|INDETERMINATE
 
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
	
	'This prevents raising checked event when setting designer checked property
	Private FirstTime As Boolean = False
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
	
	
'	Set checked state
	Dim checkedState As String = Props.Get("CheckedState")
	
	'set initial value
	
	If checkedState = "UNCHECKED" Then
		
		SetCheckState(UNCHECKED_STATE)
	
	else If checkedState = "CHECKED" Then
		
		SetCheckState(CHECKED_STATE)
		
	else If checkedState = "INDETERMINATE" Then
		
		SetCheckState(INDETERMINATE_STATE)
	
		
	End If
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
 
	CFControlsUtils.SetBG( CheckboxPane, color)
 
End Sub

Public Sub setRotation(angle As Float)
	
	CFControlsUtils.SetRotation(CheckboxPane, angle) 'rotate
	 
End Sub

Public Sub SetBorder(color As String , width As Int)
	
	CFControlsUtils.SetBorder(CheckboxPane, color, width)

End Sub
 
Public Sub SetBorderRadius(radius As Int)
	
	CFControlsUtils.SetBorderRadius(CheckboxPane, radius)
	
End Sub
 
Public Sub SetEffect(effect As String)
	
	CFControlsUtils.SetEffect(CheckboxPane, effect)
	
End Sub

Public Sub RemoveEffects()
	
	CFControlsUtils.RemoveEffect(CheckboxPane)
	
End Sub

#End Region
  
Public Sub SetCheckedColor(color As String)
  	
	CFControlsUtils.SetBG( CheckedPane, color)
	
End Sub
 
Public Sub SetCheckState(value As Int)
	 
	If value = UNCHECKED_STATE Then
		
		CheckedPane.Visible = False
		CheckedPane.SetAlphaAnimated(300, 0 )
		 
	Else if value = CHECKED_STATE Then
	
		CheckedPane.Visible = True
		CheckedPane.SetAlphaAnimated(300, 1 )
		 
	Else
			
		CheckedPane.SetAlphaAnimated(300, 0.6 )
		CheckedPane.Visible = True
		
	End If
	 
	If FirstTime Then
		
		'call callback for checked changed status
		CallSubDelayed2(mCallBack, mEventName & "_CheckedChanged" , value)

	Else
			
		FirstTime = True
		
	End If
	
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
