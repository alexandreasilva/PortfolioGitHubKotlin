package br.com.alexandre.bk.repositories

import android.app.Application
import br.com.alexandre.bk.repositories.data.di.DataModule
import br.com.alexandre.bk.repositories.domain.di.DomainModule
import br.com.alexandre.bk.repositories.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}