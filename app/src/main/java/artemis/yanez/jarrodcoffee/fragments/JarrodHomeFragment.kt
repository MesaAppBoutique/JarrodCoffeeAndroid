package artemis.yanez.jarrodcoffee.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import artemis.yanez.jarrodcoffee.databinding.FragmentJarrodHomeBinding


class JarrodHomeFragment : Fragment() {

    //binding the layout fragment xml
    private var binding: FragmentJarrodHomeBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       /* // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_jarrod_home, container, false)*/
        val fragmentBinding = FragmentJarrodHomeBinding.inflate(inflater, container, false)
        return fragmentBinding.root

    }

    //this is where the variables are bound to the xml layouts
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }


}