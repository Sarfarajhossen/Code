import System
public class lenearsearch {
    Module Program
Sub Main(args As String())
Dim MyArray(9) As Integer
Dim Index, MaxIndex, SearchItem As Integer
Dim Found As Boolean

MyArray(0) = 25
MyArray(1) = 67
MyArray(2) = 91
MyArray(3) = 54
MyArray(4) = 11
MyArray(5) = 43
MyArray(6) = 77
MyArray(7) = 86
MyArray(8) = 29
MyArray(9) = 98
Index = -1
Found = False
MaxIndex = 9
Console.Write(&quot;Enter search value: &quot;)
SearchItem = Console.ReadLine()
Do
Index = Index + 1
If MyArray(Index) = SearchItem Then
Found = True
End If
Loop Until Found = True Or Index = 9
If Found = True Then
Console.WriteLine(&quot;Data has been found&quot;)
Else

Course Code: CSE 0613-107 Course Title: Object Oriented Programming Lab

Page: 2

Console.WriteLine(&quot;Data not found&quot;)
End If
End Sub
End Module
}
