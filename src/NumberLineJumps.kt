fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    val hasEqualJumps = (x1 - x2) % (v1 - v2) == 0 //we check if both kangaroos would land at same position after certain jumps

    //we want to know if kangaroo 1 is jumping slower than kangaroo 2
    //we also want to know if kangaroo 2 is jumping slower than kangaroo 1
    if((x1 < x2 && v1 <= v2) || (x1> x2 && v1 >= v2)) {
        return  "NO"
    }
    if(hasEqualJumps) return "YES"
    return  "NO"
}