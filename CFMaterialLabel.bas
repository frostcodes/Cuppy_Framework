B4J=true
Group=Cuppy Framework\Cuppy\Controls
ModulesStructureVersion=1
Type=Class
Version=5.51
@EndOfDesignText@
'Custom View class

#Event: MousePressed (EventData As MouseEvent)
#Event: Resize (Width As Double, Height As Double)

#RaisesSynchronousEvents: MousePressed
#RaisesSynchronousEvents: Resize

#DesignerProperty: Key: Text, DisplayName: Text, FieldType: String, DefaultValue: text
 
#Region Internal Segment

Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
	Public InnerLabel As Label
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("CFMaterialLabelUI")
	'set using theme...
 
	setTextColor(CFStyleManager.DefaultTheme.Get("primary_text"))
	InnerLabel.Font = CFStyleManager.FONT_LIGHT
	
	'set text from designer
	setText(Props.Get("Text"))
	
	setTextSize(Lbl.TextSize)
	setText(Lbl.Text)
	
	setTag(Lbl.Tag)
	setAlpha(Lbl.Alpha)
	
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
 
	InnerLabel.PrefWidth = Width
	InnerLabel.PrefHeight =  Height
	
	CallSubDelayed3(mCallBack, mEventName & "_Resize", Width, Height)
	 
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region

#Region Actions and Effects
 
Public Sub setBackgroundColor(color As String)
 
	CFControlsUtils.setBackgroundColor( InnerLabel, color)
 
End Sub

Public Sub getBackgroundColor As String
  	
	Return CFControlsUtils.GetBackgroundColor(InnerLabel)
	
End Sub

Public Sub setTextColor(color As String)
 
	CFControlsUtils.setTextColor (InnerLabel, color)
 
End Sub

Public Sub setRotation(angle As Float)
	
	CFControlsUtils.setRotation(InnerLabel, angle) 'rotate
	 
End Sub
  
Public Sub setBorder(color As String , width As Int)
	
	CFControlsUtils.setBorder(InnerLabel, color, width)

End Sub

Public Sub setBorderRadius(radius As Int)
	
	CFControlsUtils.setBorderRadius(InnerLabel, radius)
	
End Sub

Public Sub getBorderColor As String
	
	Return CFControlsUtils.GetBorderColor(InnerLabel)
	
End Sub

Public Sub getBorderWidth As Int
	
	Return CFControlsUtils.GetBorderWidth(InnerLabel)
	
End Sub

Public Sub getBorderRadius As Int
	
	Return CFControlsUtils.GetBorderRadius(InnerLabel)
	
End Sub

Public Sub setEffect(effect As String)
	
	CFControlsUtils.setEffect(InnerLabel, effect)
	
End Sub

Public Sub getEffect(effect As String) As String
	
	Return CFControlsUtils.GetEffect(InnerLabel)
	
End Sub

Public Sub RemoveEffects()
	
	CFControlsUtils.removeEffect(InnerLabel)
	
End Sub

#End Region


#Region Control Specific
 
Public Sub setTextSize(TextSize As Double)
	
	InnerLabel.TextSize = TextSize
	
End Sub

Public Sub getTextSize() As Double
	
	Return InnerLabel.TextSize
	
End Sub
 

#End Region

Public Sub setText(Text As String)
	
	InnerLabel.Text = Text
	
End Sub

Public Sub getText() As String
	
	Return InnerLabel.Text
	
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


Private Sub InnerLabel_MousePressed (EventData As MouseEvent)
	  
	InnerLabel.RequestFocus 'set focus
	CallSubDelayed2(mCallBack, mEventName & "_MousePressed", EventData)
	 
End Sub
 