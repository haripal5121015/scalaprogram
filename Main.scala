package myproject

object Main {
  //pascal function
  def pascal(a:Int,b:Int):Int=
	{
	  fact(b)/((fact(b-a)*fact(a)))
    
	}
	//factorial function
	def fact(f:Int):Int = {
	if(f==0)  1
	else
	 f*fact(f-1)
     
	}
	//parenthesis matching function
	def balance(chars:List[Char]):Boolean =
	{
	    
	def secondfunction(char:List[Char],count:Int):Boolean=
	     {
	      if(count<0) 
	      false
	      else if(count==0&&char.isEmpty)
	      true
	      else if(count!=0&&char.isEmpty)
	      false
	      else
	      {
	        if(char.head=='(')
	        {
	          
	          secondfunction(char.tail,count+1)
	        }
	        else if(char.head==')')
	        {
	          
	          secondfunction(char.tail,count-1)
	        }
	        else
	          secondfunction(char.tail,count)
	      }
	    
	  }
	if(chars.isEmpty)
	     false
	    else
	    secondfunction(chars,0)
     
    }
	//
	

	  
	  
	
	def  main(agr:Array[String]):Unit={
	  println(pascal(1,2))
	  //Parenthesis matching
	  val exp:String="(if (zero? x) max (/ 1 x))"

	 println(balance(exp.toList))
	}


}