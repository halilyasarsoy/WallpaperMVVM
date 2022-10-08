package com.halil.wallpapermvvm.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.halil.wallpapermvvm.Repository.RepositoryWallpaper

@Suppress("UNCHECKED_CAST")
class WallpaperViewModel (private val wallpaperRepository: RepositoryWallpaper) : ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return com.halil.wallpapermvvm.ViewModel.ViewModel(wallpaperRepository) as T
    }

}