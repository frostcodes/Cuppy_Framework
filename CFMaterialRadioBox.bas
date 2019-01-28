B4J=true
Group=Cuppy Framework\Cuppy\Controls
ModulesStructureVersion=1
Type=Class
Version=5.51
@EndOfDesignText@
'Custom View class
 
#Event: CheckedChanged(state as int)
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
	Private FirstTimeSetted As Boolean = False
	Private ChoiceControlBinderObj As CFRadioBoxChoiceBinder 'Allows Binding
	Private PrivateCheckState As Int
	
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
	setBorder(CFStyleManager.DefaultTheme.Get("divider"), 2)
	
	setCheckedColor(CFStyleManager.DefaultTheme.Get("primary"))
	
	
'	Set checked state
	Dim checkedState As String = Props.Get("CheckedState")
	
	'set initial value
	
	If checkedState = "UNCHECKED" Then
		
		setCheckState(UNCHECKED_STATE)
	
	else If checkedState = "CHECKED" Then
		
		setCheckState(CHECKED_STATE)
		
	else If checkedState = "INDETERMINATE" Then
		
		setCheckState(INDETERMINATE_STATE)
	 
	End If
	
	
	setTag(Lbl.Tag)
	setAlpha(Lbl.Alpha)
	
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
  
	CallSubDelayed3(mCallBack, mEventName & "_Resize", Width, Height)
 
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region

#Region Actions and Effects

Public Sub setBackgroundColor(color As String)
 
	CFControlsUtils.SetBackgroundColor( CheckboxPane, color)
 
End Sub

Public Sub getBackgroundColor As String
  	
	Return CFControlsUtils.GetBackgroundColor(CheckboxPane)
	
End Sub

Public Sub setRotation(angle As Float)
	
	CFControlsUtils.SetRotation(CheckboxPane, angle) 'rotate
	 
End Sub

Public Sub setBorder(color As String , width As Int)
	
	CFControlsUtils.SetBorder(CheckboxPane, color, width)

End Sub
 
Public Sub setBorderRadius(radius As Int)
	
	CFControlsUtils.SetBorderRadius(CheckboxPane, radius)
	
End Sub
 
Public Sub getBorderColor As String
	
	Return CFControlsUtils.GetBorderColor(CheckboxPane)
	
End Sub

Public Sub getBorderWidth As Int
	
	Return CFControlsUtils.GetBorderWidth(CheckboxPane)
	
End Sub

Public Sub getBorderRadius As Int
	
	Return CFControlsUtils.GetBorderRadius(CheckboxPane)
	
End Sub
 
Public Sub setEffect(effect As String)
	
	CFControlsUtils.SetEffect(CheckboxPane, effect)
	
End Sub
 
Public Sub getEffect(effect As String) As String
	
	Return CFControlsUtils.GetEffect(CheckboxPane)
	
End Sub
 
Public Sub RemoveEffects()
	
	CFControlsUtils.RemoveEffect(CheckboxPane)
	
End Sub

#End Region
  
Public Sub setCheckedColor(color As String)
  	
	CFControlsUtils.setBackgroundColor(CheckedPane, color)
	
End Sub
 
'Get/set the check state
Public Sub setCheckState(state As Int)
	
	If getHasChoiceBinder And ChoiceControlBinderObj.IsControlBinded(Me) Then
	 	
		ChoiceControlBinderObj.TriggerState(Me, state)

	Else
			 
		If state = UNCHECKED_STATE Then
		
			CheckedPane.Visible = False
			CheckedPane.SetAlphaAnimated(300, 0 )
		 
		Else if state = CHECKED_STATE Then
	
			CheckedPane.Visible = True
			CheckedPane.SetAlphaAnimated(300, 1 )
		 
		Else
			
			CheckedPane.SetAlphaAnimated(300, 0.6 )
			CheckedPane.Visible = True
		
		End If
	 
		If FirstTimeSetted Then
		
			'call callback for checked changed status
			CallSubDelayed2(mCallBack, mEventName & "_CheckedChanged" , state)

		Else
			
			FirstTimeSetted = True
		
		End If
	
	End If
	
	PrivateCheckState = state

End Sub

Public Sub getCheckState As Int
	
	Return PrivateCheckState
	
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
	
		setCheckState(CHECKED_STATE)
	
	Else
	
		setCheckState(UNCHECKED_STATE)
		  
	End If
	
End Sub


#Region General Functions and Properties

'Get or set whether Node is Enabled?
Public Sub getEnabled As Boolean
	
	Return mBase.Enabled
	
End Sub

Public Sub setEnabled(Enabled As Boolean)
	
	mBase.Enabled = Enabled

End Sub
 
'Get or set whether Node is Visible?
Public Sub getVisible As Boolean
	
	Return mBase.Visible
	
End Sub

Public Sub setVisible(Visible As Boolean)
	
	mBase.Visible = Visible

End Sub
 
'Get or set the Node Alpha level: 0 - transparent, 1 - Fully Opaque
Public Sub getAlpha As Double
	
	Return mBase.Alpha
	
End Sub

Public Sub setAlpha(Alpha As Double)
	
	mBase.Alpha = Alpha

End Sub
 
'Get the Node Height
Public Sub getHeight As Double
	
	Return mBase.PrefHeight
	
End Sub
  
'Get the Node Width
Public Sub getWidth As Double
	
	Return mBase.PrefWidth
	
End Sub
 
'Get the top property of the Node (related to its parent)
Public Sub getTop As Double
	
	Return mBase.Top
	
End Sub
  
'Get the Node Parent
Public Sub getParent As Node
	
	Return mBase.Parent
	 
End Sub
  
'Get or set the Node tag.
'This is placeholder for any object you need to tie to the node
Public Sub getTag As Object
	
	Return mBase.Tag
	
End Sub

Public Sub setTag(Tag As Object)
	
	mBase.Tag = Tag

End Sub
 
'Get the Left property of the Node (related to its parent)
Public Sub getLeft As Double
	
	Return mBase.Left
	
End Sub
   
'FUNCTIONS

'Removes the node from its parent
Public Sub RemoveNodeFromParent
	 
	mBase.RemoveNodeFromParent
	
End Sub

'Captures the node appearance and returns the rendered image
Public Sub Snapshot As Image
	
	Return mBase.Snapshot
	
End Sub
 
'Similar to Snapshot. Allow you to set the background color
Public Sub Snapshot2(BackgroundColor As Paint) As Image
	
	Return mBase.Snapshot2(BackgroundColor)
	
End Sub
  
'tooltip
'	

#End Region


#Region Control Binders

'Gets/Sets the Choice Binder
'
'You can handle the binded event like this:
'<code>
'Sub BinderEventName_CheckedControlChanged(Selected As CFMaterialRadioBox)
'	
'	Log(Selected.EventName)
'	
'End Sub
'</code>
Public Sub setChoiceBinder(ControlChoiceBinder As CFRadioBoxChoiceBinder)
	
	ChoiceControlBinderObj = ControlChoiceBinder
	ChoiceControlBinderObj.BindControl(Me)
	
End Sub

Public Sub getChoiceBinder As CFRadioBoxChoiceBinder
	
	Return ChoiceControlBinderObj
	
End Sub

Public Sub getHasChoiceBinder As Boolean
	
	Return ChoiceControlBinderObj.IsInitialized
	
End Sub

'This removes the control from been binded
Public Sub UnBindFromChoiceBinder
	
	If getHasChoiceBinder Then
		
		getChoiceBinder.UnBindControl(Me)
		
	End If
	
	FirstTimeSetted = True
	
End Sub
	
'Control Event Name
Public Sub getEventName As String
	
	Return mEventName
	
End Sub

'Control Call Back
Public Sub getCallBack As Object
	
	Return mCallBack
	
End Sub
 

#End Region

