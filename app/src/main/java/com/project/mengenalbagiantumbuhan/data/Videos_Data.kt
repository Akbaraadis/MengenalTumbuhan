package com.project.mengenalbagiantumbuhan.data

object Videos_Data {
    private val Link = arrayOf(
        "5K1am8rI_zI",
        "ooszIK2HDkM",
        "5AVLWuOZMYI",
        "nNCgAxw-tDg"
    )

    private val Title = arrayOf(
        "Video 1",
        "Video 2",
        "Video 3",
        "Video 4"
    )

    val listdata: ArrayList<Videos>
        get() {
            val list = arrayListOf<Videos>()
            for(position in Videos_Data.Link.indices){
                val materi = Videos()
                materi.link = Videos_Data.Link[position]
                materi.title = Videos_Data.Title[position]
                list.add(materi)
            }
            return list
        }
}