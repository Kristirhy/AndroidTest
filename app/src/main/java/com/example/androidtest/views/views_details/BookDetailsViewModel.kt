package com.example.androidtest.views.views_details

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Transformations
import com.example.androidtest.StartApp
import com.example.androidtest.data.data_model.Book

class BookDetailsViewModel(application: Application) : AndroidViewModel(application) {
    private val bookRepository = getApplication<StartApp>().getBookRepo()
    private val bookId = MutableLiveData<Int>()

    // Maps people id to people details
    fun getBookDetails(id: Int): LiveData<Book> {
        bookId.value = id
        val bookDetails = Transformations.switchMap<Int, Book>(bookId) { id ->
            bookRepository.findBook(id)
        }
        return bookDetails
    }

}
