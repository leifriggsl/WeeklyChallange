import scala.collection.mutable.ArrayBuffer
object WeeklyChallange {
    def main(args:Array[String]): Unit = {
    var    arr1=Array.ofDim[String](5,2)
    arr1(0)(0)="a"
    arr1(0)(1)="d"
    arr1(1)(0)="f"
    arr1(1)(1)="b"
    arr1(2)(0)="b"
    arr1(2)(1)="d"
    arr1(3)(0)="f"
    arr1(3)(1)="a"
    arr1(4)(0)="d"
    arr1(4)(1)="c"
     Depends(arr1)

    } 

  def Depends(arr:Array[Array[String]]) : Unit = {
      
  var m=""
  var x=new ArrayBuffer[String]
  m=arr(0)(0)


  for (k<-0 to 4)
 
          {for (j<-0 to 4)
         
           {if (arr(j)(1)==m)
            { m=arr(j)(0)
               x+=m }
        
        }
          m=arr(k)(0)
        
       
        
  }
        
          
  for(i<-0 to x.length-1)
     {print(x(i))}
           
        
        
        
 }
}
   


      

  



