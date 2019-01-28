B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=6.51
@EndOfDesignText@

#Event: MousePressed (EventData As MouseEvent)
#Event: ActionButtonMouseEntered (EventData As MouseEvent)
#Event: ActionButtonMouseExited (EventData As MouseEvent)
#Event: ActionButtonMouseClicked (EventData As MouseEvent)

#RaisesSynchronousEvents: MousePressed
#RaisesSynchronousEvents: ActionButtonMouseEntered
#RaisesSynchronousEvents: ActionButtonMouseExited
#RaisesSynchronousEvents: ActionButtonMouseClicked



#DesignerProperty: Key: duration, DisplayName: Toast Duration, FieldType: String, DefaultValue: DISPLAY_TIME_SHORT, List: DISPLAY_TIME_SHORT|DISPLAY_TIME_LONG



#DesignerProperty: Key: IntExample, DisplayName: Int Example, FieldType: Int, DefaultValue: 10, MinRange: 0, MaxRange: 100, Description: Note that MinRange and MaxRange are optional.
#DesignerProperty: Key: StringWithListExample, DisplayName: String With List, FieldType: String, DefaultValue: Sunday, List: Sunday|Monday|Tuesday|Wednesday|Thursday|Friday|Saturday
#DesignerProperty: Key: StringExample, DisplayName: String Example, FieldType: String, DefaultValue: Text
#DesignerProperty: Key: ColorExample, DisplayName: Color Example, FieldType: Color, DefaultValue: 0xFFCFDCDC, Description: You can use the built-in color picker to find the color values.
#DesignerProperty: Key: DefaultColorExample, DisplayName: Default Color Example, FieldType: Color, DefaultValue: Null, Description: Setting the default value to Null means that a nullable field will be displayed.





'enable or disable auto-dimiss toast
'
'duration	5000	Determines the toast display duration (in milliseconds).
 



Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
	
	Private ToastActionButton As Label
	Private ToastTextLabel As Label
	Private Pane1 As Pane
	
	Public ActionButtonHoverColor As String = "#3E3E3E"
	Private timer1 As Timer
	
	'DISPLAY TIME
	Public DISPLAY_TIME_SHORT As Int = 2500
	Public DISPLAY_TIME_LONG As Int = 5000
	
	'TOAST TYPE COLORS
	Public TOAST_TYPE_INFO As String = "#1565C0"
	Public TOAST_TYPE_ERROR As String = "#E53935"
	Public TOAST_TYPE_WARNING As String = "#EF6C00"
	Public TOAST_TYPE_SUCCESS As String = "#2E7D32"
	
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	
	mBase = Base
	mBase.LoadLayout("CFMaterialToast")
	 
	mBase.Visible = False
	mBase.Alpha = 0
	 
	ToastActionButton.Font = CFStyleManager.ScaleFont2(CFStyleManager.FONT_BLACK.FamilyName, 14,  False, False)
	ToastTextLabel.Font =  ToastActionButton.Font
	
	If Props.GetDefault("duration", DISPLAY_TIME_SHORT) = "DISPLAY_TIME_SHORT" Then
		timer1.Initialize("Timer1", DISPLAY_TIME_SHORT)
	Else
		timer1.Initialize("Timer1", DISPLAY_TIME_LONG)
	End If
	 
	
'	order/// bg
	'type///
	
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)

End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

 
 #Region Actions and Effects

Public Sub setBackgroundColor(color As String)
 
	CFControlsUtils.setBackgroundColor(Pane1, color)
	CFControlsUtils.setBackgroundColor(ToastActionButton, color)
 
End Sub

Public Sub getBackgroundColor As String
  	
	Return CFControlsUtils.GetBackgroundColor(Pane1)
	
End Sub
 
Public Sub setBorder(color As String , width As Int)
	
	CFControlsUtils.SetBorder(Pane1, color, width)

End Sub

Public Sub setBorderRadius(radius As Int)
	
	CFControlsUtils.SetBorderRadius(Pane1, radius)

End Sub

Public Sub getBorderColor As String
	
	Return CFControlsUtils.GetBorderColor(Pane1)
	
End Sub

Public Sub getBorderWidth As Int
	
	Return CFControlsUtils.GetBorderWidth(Pane1)
	
End Sub

Public Sub getBorderRadius As Int
	
	Return CFControlsUtils.GetBorderRadius(Pane1)
	
End Sub

Public Sub setEffect(effect As String)
	
	CFControlsUtils.SetEffect(Pane1, effect)
	 
End Sub
 
Public Sub getEffect(effect As String) As String
	
	Return CFControlsUtils.GetEffect(Pane1)
	
End Sub
 
Public Sub RemoveEffects()
	
	CFControlsUtils.RemoveEffect(Pane1)
	 
End Sub

#End Region


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
  

#End Region
 
 'TODO: click to dimiss?
 'set toast default position
 
#Region Control Properties

#Region ToastTextLabel
Public Sub setFont(font As Font)
	
	ToastTextLabel.Font = font
	
End Sub

Public Sub getFont() As Font
	
	Return ToastTextLabel.font
	
End Sub

Public Sub setText(text As String)
	
	ToastTextLabel.Text = text
	
End Sub

Public Sub getText() As String
	
	Return ToastTextLabel.Text
	
End Sub

Public Sub setTextSize(TextSize As Double)
	
	ToastTextLabel.TextSize = TextSize
	
End Sub

Public Sub getTextSize() As Double
	
	Return ToastTextLabel.TextSize
	
End Sub

Public Sub setTextColor(TextColor As Paint)
	
	ToastTextLabel.TextColor = TextColor
	
End Sub

Public Sub getTextColor As Paint
	
	Return ToastTextLabel.TextColor
	
End Sub
 
#End Region

#Region ToastActionButton

Public Sub setActionButtonFont(font As Font)
	
	ToastActionButton.Font = font
	
End Sub

Public Sub getActionButtonFont() As Font
	
	Return ToastActionButton.font
	
End Sub

Public Sub setActionButtonText(text As String)
	
	If CFStringUtility.IsEmpty(text) Then
		
		ToastActionButton.Visible =False
	
	End If
	
	ToastActionButton.Text = text
	
End Sub

Public Sub getActionButtonText As String
	
	Return ToastActionButton.Text
	
End Sub

Public Sub setActionButtonVisible(visible As Boolean)
	
	ToastActionButton.Visible = visible
	
End Sub

Public Sub getActionButtonVisible As Boolean
	
	Return ToastActionButton.Visible
	
End Sub

Public Sub setActionButtonTextSize(TextSize As Double)
	
	ToastActionButton.TextSize = TextSize
	
End Sub

Public Sub getActionButtonTextSize() As Double
	
	Return ToastActionButton.TextSize
	
End Sub

Public Sub setActionButtonTextColor(TextColor As Paint)
	
	ToastActionButton.TextColor = TextColor
	
End Sub

Public Sub getActionButtonTextColor As Paint
	
	Return ToastActionButton.TextColor
	
End Sub

#End Region

'Get/Set time in milliseconds that the toast would show for
Public Sub setToastCloseTime(TimeInMs As Int)
	
	timer1.Interval = TimeInMs
	
End Sub

Public Sub getToastCloseTime As Int
	
	Return timer1.Interval
	
End Sub



'
''Get/Set if the toast should be rounded
''or look like a snackbar toast
'Public Sub setRoundedToastStyle(rounded As Boolean)
'	
'	If rounded Then
'		
'		setBorderRadius(100)
'		CFControlsUtils.SetBorderRadius(Pane1, 100)
'		CFControlsUtils.SetBorderRadius(ToastTextLabel, 100)
'		CFControlsUtils.SetBorderRadius(ToastActionButton, 100)
'		
'		Else
'			
'		setBorderRadius(2)
'			
'	End If
'	
'End Sub
'
'Public Sub getRoundedToastStyle As Boolean
'	
'	If getBorderRadius = 100 Then
'		
'		Return True
'		
'	Else
'			
'		Return False
'			
'	End If
'	
'End Sub



Public Sub Show
 
	timer1.Enabled = True
 
	mBase.Visible = True
	mBase.Top = mBase.Top - 20dip
	mBase.SetAlphaAnimated(300, 1)
	mBase.SetLayoutAnimated(300, mBase.Left, mBase.Top + 20dip, mBase.PrefWidth, mBase.PrefHeight)

End Sub

Public Sub Hide 
	
	mBase.SetAlphaAnimated(300, 0)
	mBase.Visible = False
	timer1.Enabled = False
	
End Sub

Public Sub Dimiss 
	
	Hide
	
End Sub

Private Sub Timer1_Tick
	 
	 Hide
	 
End Sub

'Sets the background to a special toast type color
Public Sub setToastType(ToastType As String)
	 
	setBackgroundColor(ToastType)
	
End Sub

#End Region

Private Sub ToastTextLabel_MousePressed (EventData As MouseEvent)
	
	mBase.Visible = False
	CallSubDelayed2(mCallBack, mEventName & "_MousePressed", EventData)
	
End Sub

Private Sub ToastActionButton_MouseEntered (EventData As MouseEvent)
	
	CFControlsUtils.SetBackgroundColor(ToastActionButton, ActionButtonHoverColor)
	CallSubDelayed2(mCallBack, mEventName & "_ActionButtonMouseEntered", EventData)

End Sub

Private Sub ToastActionButton_MouseExited (EventData As MouseEvent)
	
	CFControlsUtils.SetBackgroundColor(ToastActionButton, CFControlsUtils.GetBackgroundColor(ToastTextLabel))
	CallSubDelayed2(mCallBack, mEventName & "_ActionButtonMouseExited", EventData)
	
End Sub

Private Sub ToastActionButton_MouseClicked (EventData As MouseEvent)
	
	CallSubDelayed2(mCallBack, mEventName & "_ActionButtonMouseClicked", EventData)
	
End Sub
  