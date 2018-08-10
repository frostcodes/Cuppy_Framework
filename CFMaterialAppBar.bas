B4J=true
Group=Cuppy Framework\Cuppy\Controls
ModulesStructureVersion=1
Type=Class
Version=5.51
@EndOfDesignText@
'Custom View class

#Event: MousePressed (EventData As MouseEvent)
#Event: PaneMousePressed (EventData As MouseEvent)
 
#Region Internal Segment

Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
	Private Label1 As Label
	Public InnerPane As Pane
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("CFMaterialAppBarUI")
	'set using theme...
	SetBg(CFStyleManager.DefaultTheme.Get("primary"))
	
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
	
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region


#Region Actions and Effects


Public Sub SetBg(color As String)
	
	CSSUtils.SetStyleProperty( Label1, "-fx-background-color", color)
	CSSUtils.SetStyleProperty( InnerPane, "-fx-background-color", color)
 
End Sub
 
Public Sub setRotationX(angle As Float)
	
	CFControlsUtils.setRotationX(Label1, angle) 'rotate
	CFControlsUtils.setPaneRotationX(InnerPane , angle) 'rotate
	 
End Sub

Public Sub setBorder(color As String , width As Int)
	
	CFControlsUtils.setBorder(Label1, color, width)
	CFControlsUtils.setPaneBorder(InnerPane, color, width)
	
End Sub

Public Sub setBorderRadius(radius As Int)
	
	CFControlsUtils.setBorderRadius(Label1, radius)
	CFControlsUtils.setPaneBorderRadius(InnerPane, radius)
	
End Sub

Public Sub setPaneEffect(effect As String)
	
	CFControlsUtils.setEffect(Label1, effect)
	
End Sub

Public Sub removeEffects()
	
	CFControlsUtils.removeEffect(Label1)
	
End Sub

#End Region


Public Sub Icon(IconText As String)
	
	Label1.Text = IconText
	 
End Sub

Sub InnerButton_MousePressed (EventData As MouseEvent)
	
	CallSubDelayed2(mCallBack, mEventName & "_MousePressed", EventData) 'ignore
	
End Sub
 
Sub InnerPane_MousePressed (EventData As MouseEvent)
	 
	CallSubDelayed2(mCallBack, mEventName & "_PaneMousePressed", EventData) 'ignore
	 
End Sub