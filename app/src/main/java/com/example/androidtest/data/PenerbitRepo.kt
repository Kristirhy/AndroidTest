package com.example.androidtest.data

import android.app.Application
import android.arch.lifecycle.LiveData
import com.example.androidtest.data.data_model.Book
import com.example.androidtest.data.db_only.BookDAO
import com.example.androidtest.data.db_only.BookDb

class PenerbitRepo(application: Application) {
    private val bookDao : BookDAO

    init {
        val bookDatabase = BookDb.getInstance(application)
        bookDao = bookDatabase.bookDao()
    }

    /**
     * menampilkan data tapi secara descending
     */
    fun getAllBook() : LiveData<List<Book>> {
//        val allbook = BookListInfo.bookList
//        return allpeople.reversed()
        return bookDao.getAll()
    }

    fun insertBook(book: Book){
//        PeopleListInfo.peopleList.add(people)
        bookDao.insert(book)
    }

    fun findBook(id : Int): LiveData<Book> {
//        for (people in PeopleListInfo.peopleList){
//            if(people.id == id){
//                return people
//            }
//        }
//        return null
        return bookDao.find(id)
    }

}
