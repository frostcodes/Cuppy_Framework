B4J=true
Group=Cuppy Framework\Binders\Controls
ModulesStructureVersion=1
Type=Class
Version=6.51
@EndOfDesignText@
'This is allows you to bind and restrict
'selected choices of a group of radio boxes
'to a single choice

#Event: CheckedControlChanged(Selected As CFMaterialRadioBox)

Sub Class_Globals
	
	Private mEventName As String
	Private Controls As List
	
	Private LastCheckedRadiobox As CFMaterialRadioBox
	 
	'States
	Private UNCHECKED_STATE As Int = 0
	Private CHECKED_STATE As Int = 1
	
End Sub

'Initializes the object.
Public Sub Initialize(EventName As String)
	
	mEventName = EventName
	Controls.Initialize
	
End Sub
 

'This allows you to bind a radio box
'
'If you binded from the control,
'there is no need to rebind here
'
'You can handle the binded event like this:
'<code>
'Sub BinderEventName_CheckedControlChanged(Selected As CFMaterialRadioBox)
'	
'	Log(Selected.EventName)
'	
'End Sub
'</code>
Public Sub BindControl(Control As CFMaterialRadioBox) As Boolean
   
		Controls.Add(Control)
		SetRadioboxState(Control, UNCHECKED_STATE) 'Force any newly binded control to be unchecked
		
		'just in case we are not automatically binding from the radio box
		'we bind manually here
		
		Dim ControlObj As CFMaterialRadioBox = Control
		
		If Not(ControlObj.ChoiceBinder = Me) Then
		
			ControlObj.ChoiceBinder = Me
			
		End If
		 
		Return True
		 
End Sub

'This allows you to bind multiple radio box
Public Sub BindMultipleControls(CFMaterialRadioBoxControls() As CFMaterialRadioBox)
	
	For Each Control As CFMaterialRadioBox In CFMaterialRadioBoxControls
		
		BindControl(Control)

	Next
End Sub

'Do not call yourself. This is used internally when a control is binded
'you can handle the selected value with a Sub like:
'
'You can handle the binded event like this:
'<code>
'Sub BinderEventName_CheckedControlChanged(Selected As CFMaterialRadioBox)
'	
'	Log(Selected.EventName)
'	
'End Sub
'</code>
Public Sub TriggerState(CurrentControl As CFMaterialRadioBox, State As Int)
 
		'we do not raise or change state if control is already in that state
		If Not(LastCheckedRadiobox = CurrentControl) Then
		 
			For Each cntrl As CFMaterialRadioBox In Controls
		 
				SetRadioboxState(cntrl, UNCHECKED_STATE)
		 
			Next
	
			SetRadioboxState(CurrentControl, CHECKED_STATE)
			CurrentControl.CheckboxPane.RequestFocus 'set focus
			LastCheckedRadiobox = CurrentControl
		
			'call callback for checked changed status
			CallSubDelayed2(CurrentControl.CallBack, mEventName & "_CheckedControlChanged", CurrentControl)
		 
		End If
		
End Sub

'Set the control current state
Private Sub SetRadioboxState(Control As CFMaterialRadioBox, State As Int)
	  	
	If State = UNCHECKED_STATE Then
		
		Control.CheckedPane.Visible = False
		Control.CheckedPane.SetAlphaAnimated(300, 0 )
		 
	Else if State = CHECKED_STATE Then
	
		Control.CheckedPane.Visible = True
		Control.CheckedPane.SetAlphaAnimated(300, 1 )
		 
	Else
			
		Control.CheckedPane.SetAlphaAnimated(300, 0.6 )
		Control.CheckedPane.Visible = True
		
	End If
 	 
End Sub

Public Sub UnBindControl(Control As CFMaterialRadioBox)
	
	Dim index As Int = Controls.IndexOf(Control)
	
	If Not(index = -1) Then
		
		Controls.RemoveAt(index)
		 
	End If
	
End Sub

'This removes controls from been binded
Public Sub UnBindMultipleControls(CFMaterialRadioBoxControls() As CFMaterialRadioBox)
	
	For Each Control As CFMaterialRadioBox In CFMaterialRadioBoxControls
		
		UnBindControl(Control)

	Next
	
End Sub

'Gets/sets the selected Radio Box
Public Sub getSelectedRadioBox As CFMaterialRadioBox
	
	Return LastCheckedRadiobox
	
End Sub

Public Sub setSelectedRadioBox(Selected As CFMaterialRadioBox)
	
	If IsControlBinded(Selected) Then
		
		TriggerState(Selected, CHECKED_STATE)
		
		Else
			
		LogDebug("CFRadioBoxChoiceBinder ( " & mEventName  & " ) cannot set selected radio box to " & Selected.EventName & " because it was not binded!")
		
	End If

End Sub

'This checks if the control is binded
Public Sub IsControlBinded(Control As CFMaterialRadioBox) As Boolean
	
	Dim index As Int = Controls.IndexOf(Control)

	If index = -1 Then
		
		Return False
		
	Else
			
		Return True
		
	End If
	
End Sub

 