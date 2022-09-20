object caseClass extends App{
    val p1=Point(5,6)
    val p2=Point(2,3)
    val p3=p2.move(p1)
    val p4=p1+p2
    val p5=p1.invert(p2)
    val p6=p1.distance(p2)

    prinln(p4)
    prinln(p3)
    prinln(p6)
    prinln(p5)
    

}

case class Point(x:Int,y:Int){
        def +(p:Point)=Point(this.x+p,this.y+p)
        def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy) // point move in x axis by dx distance and in y axis by dy distance
        def distance(p:Point)=Point(this.x-p,this.y-p)// get the distance between two point
        def invert(that:Point)={
            
            x=var q
            q=that
            y=var r
            r=that
        }
}

