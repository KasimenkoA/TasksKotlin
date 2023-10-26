package Tasks.Tasks250

import java.util.ArrayList

fun main() {
    val arrayList = ArrayList<String>()
    arrayList.add("United States")
    arrayList.add("Canada")
    arrayList.add("United Kingdom")
    arrayList.add("Australia")
    arrayList.add("Japan")

    val listIterator: ListIterator<*> = arrayList.listIterator(arrayList.size)

    while (listIterator.hasPrevious()) {
        println(listIterator.previous())
    }
}