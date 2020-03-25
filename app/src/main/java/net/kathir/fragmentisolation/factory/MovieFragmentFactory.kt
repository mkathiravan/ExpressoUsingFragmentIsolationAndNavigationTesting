package net.kathir.fragmentisolation.factory
import androidx.fragment.app.FragmentFactory
import net.kathir.fragmentisolation.ui.DirectorsFragment
import net.kathir.fragmentisolation.ui.MovieDetailFragment
import net.kathir.fragmentisolation.ui.StarActorsFragment

class MovieFragmentFactory : FragmentFactory() {

    private val TAG : String = "AppDebug"

    override fun instantiate(classLoader: ClassLoader, className: String) =

        when(className)
        {
            MovieDetailFragment::class.java.name -> {
                MovieDetailFragment()
            }

            DirectorsFragment::class.java.name -> {
                DirectorsFragment()
            }

            StarActorsFragment::class.java.name -> {
                StarActorsFragment()
            }

            else -> {
                super.instantiate(classLoader, className)
            }
        }
}