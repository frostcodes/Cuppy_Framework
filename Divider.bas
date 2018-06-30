Type=Class
Version=5.51
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'Custom View class
 
''''#  Designer    Property: Key: thic kness, DisplayName: thick ness, FieldType: Int, DefaultValue: 1, Description: Set how thick the divider should be

#Region Internal Segment

Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
	Public line As Pane
End Sub
'
Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("DividerLayout")
	'set using theme...
	SetBg(StyleManager.DefaultTheme.Get("divider"))
	 
	 
	 'BUG: unable to set thickness from designer...
'	Dim thick As Double =  Props.Get("thickness")
'	line.SetSize(mBase.Width, thick)
'	 
'	 
'	Log("Thick:  " & thick)
'	
'	Log("Thick2:  " & Thickness)
'	
'	 
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
 
	line.PrefWidth = Width
	 
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region
 

#Region Actions and Effects

Public Sub SetBg(color As String)
 
	CSSUtils.SetStyleProperty( line, "-fx-background-color", color)
 
End Sub

Public Sub setRotationX(angle As Float)
	
	ControlsUtils.setPaneRotationX(line, angle) 'rotate
	 
End Sub
  
Public Sub setBorder(color As String , width As Int)
	
	ControlsUtils.setPaneBorder(line, color, width)

End Sub


Public Sub setBorderRadius(radius As Int)
	
	ControlsUtils.setPaneBorderRadius(line, radius)
	
End Sub


Public Sub setPaneEffect(effect As String)
	
	ControlsUtils.setPaneEffect(line, effect)
	 
End Sub

Public Sub removeEffects()
	
	ControlsUtils.removePaneEffect(line)
	 
End Sub

#End Region

#Region Control Properties

Public Sub setSize(sizeX As Int)
	
	line.PrefHeight =  sizeX
	  
End Sub

Public Sub getSize() As Double
	
	Return line.PrefHeight
	
End Sub

#End Region

'TODO: make vertical divider
