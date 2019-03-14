package io.android_architecture.samplebaseapplicationmvp.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.activity_main.*

abstract class BaseFragment : Fragment() {

    val navController by lazy {
        Navigation.findNavController(activity as FragmentActivity, navigation_host.id)
    }

    //Called when Fragment's view created.
    abstract fun createUI(rootView: View, savedInstanceState: Bundle?)

    @LayoutRes
    abstract fun getViewId(): Int

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(getViewId(), container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        createUI(view, savedInstanceState)
    }

    override fun onDetach() {
        super.onDetach()
    }
}