fun main() {
    var yy = 0;

    for (xx in 0..10)
    {
        for (zz in 0..10)
        {
            yy = getY(xx,zz)
            //println("xx = $xx, zz = $zz, yy = $yy")
            println("xx = ${"%2d".format(xx)}, zz = ${"%2d".format(zz)}, yy = ${"%3d".format(yy)}")
        }
    }

}

fun getY(xx: Int, zz: Int): Int {
    return (xx/7 + zz*8)
}
