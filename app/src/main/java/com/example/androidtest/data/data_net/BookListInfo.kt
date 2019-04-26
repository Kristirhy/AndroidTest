package com.example.androidtest.data.data_net

import com.example.androidtest.data.data_model.Book

class BookListInfo {
    companion object {
        var peopleList = initPeopleList()

        /**
         * add dummy data
         */

        private fun initPeopleList() : MutableList<Book>{
            var po_peoples = mutableListOf<Book>()
            po_peoples.add(
                Book(
                    "11:11",
                    "Fiersa Besari",
                    "MediaKita",
                    "kerjasamafiersa@gmail.com",
                    "fb.me/fiersa",
                    "twitter.com/@FiersaBesari",
                    1))
            po_peoples.add(Book(
                "Malik & Elsa",
                "Boy Chandra",
                "MediaKita",
                "kristirahayu8@gmail.com",
                "fb.me/kristi",
                "twitter.com/@kristirhy",
                2))
            po_peoples.add(Book(
                "Garis Waktu",
                "Fiersa Besari",
                "MediaKita",
                "kristirahayu8@gmail.com",
                "fb.me/kristi",
                "twitter.com/@kristirhy",
                3))
            return po_peoples
        }
    }
}
