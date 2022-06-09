package artemis.yanez.jarrodcoffee.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import artemis.yanez.jarrodcoffee.R
import artemis.yanez.jarrodcoffee.databinding.FragmentJarrodInnerMenuBinding


class JarrodInnerMenuFragment : Fragment() {

    private var binding: FragmentJarrodInnerMenuBinding? =  null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val fragmentBinding = FragmentJarrodInnerMenuBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    
}