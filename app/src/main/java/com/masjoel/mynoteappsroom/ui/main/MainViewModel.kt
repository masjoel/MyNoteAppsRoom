package com.masjoel.mynoteappsroom.ui.main

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.masjoel.mynoteappsroom.database.Note
import com.masjoel.mynoteappsroom.repository.NoteRepository

class MainViewModel(application: Application) : ViewModel() {
    private val mNoteRepository: NoteRepository = NoteRepository(application)
    fun getAllNotes(): LiveData<List<Note>> = mNoteRepository.getAllNotes()
}
