package artemis.yanez.jarrodcoffee.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import artemis.yanez.jarrodcoffee.R
import artemis.yanez.jarrodcoffee.databinding.FragmentJarrodMenuBinding


class JarrodMenuFragment : Fragment() {

    //adding the databinding variable
    private var binding: FragmentJarrodMenuBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment with databinding
        val fragmentBinding = FragmentJarrodMenuBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    //this is where the variables are bound to the xml layouts
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    //worry about adding destroy in a little bit

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}