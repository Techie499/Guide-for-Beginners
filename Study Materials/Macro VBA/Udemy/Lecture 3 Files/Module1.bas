Attribute VB_Name = "Module1"
Sub EnterLabel()
Attribute EnterLabel.VB_ProcData.VB_Invoke_Func = " \n14"
'
'A comment can be anything you want
'Comments are mainly used to document your code so that it is easier to revise later on
'
'Everything after a single quote is ignored and may be used as a comment
'

    ActiveCell.FormulaR1C1 = "Quarter 1"    'so even lines that contain code can also contain a comment as long as it is at the end
    
    ActiveCell.VerticalAlignment = xlCenter
    ActiveCell.Orientation = 90
    
    

'When the macro recorder *may* be operating on multiple selected cells it uses Selection
'instead of ActiveCell, which produces the code below.
'The With construct simply means we are setting multiple properties of the same object
    
'    With Selection
'        .HorizontalAlignment = xlGeneral
'        .VerticalAlignment = xlCenter
'        .WrapText = False
'        .Orientation = 90
'        .AddIndent = False
'        .IndentLevel = 0
'        .ShrinkToFit = False
'        .ReadingOrder = xlContext
'        .MergeCells = False
'    End With
'
'

'Therefore the above code is exactly the same as this code below, just a slightly shorter way of expressing it


'        Selection.HorizontalAlignment = xlGeneral
'        Selection.VerticalAlignment = xlCenter
'        Selection.WrapText = False
'        Selection.Orientation = 90
'        Selection.AddIndent = False
'        Selection.IndentLevel = 0
'        Selection.ShrinkToFit = False
'        Selection.ReadingOrder = xlContext
'        Selection.MergeCells = False

'The recorder sets all of the properties it was possible to change when we selected Format Cells,
'not just the ones we actually *did* change. So if we were only interested in changing the VerticalAlignment
'and Orientation properties, all we would really need would be...

'        Selection.VerticalAlignment = xlCenter
'        Selection.Orientation = 90

'Because we only have a single cell selected, ActiveCell and Selection refer to the same range, so we could change
'Selection to ActiveCell as we did above so the code appears more consistent.
    
    
End Sub
