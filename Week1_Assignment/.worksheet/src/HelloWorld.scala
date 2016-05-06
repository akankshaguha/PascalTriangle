object HelloWorld {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(232); 



def printtraingle() ={

def f(a:Int):Int = if(a<0) 1 else a*f(a-1)
def bincalculus(n:Int,k:Int):Int = f(n)/f(k)*f(n-k)


for(r <- 0 to 10){
for(c<- 0 to r){
print(bincalculus(r,c) + "")
}
println()
}

   
   };System.out.println("""printtraingle: ()Unit""");$skip(19); 
   printtraingle()}
}
