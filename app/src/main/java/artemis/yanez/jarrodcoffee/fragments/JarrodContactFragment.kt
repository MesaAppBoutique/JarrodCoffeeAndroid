package artemis.yanez.jarrodcoffee.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import artemis.yanez.jarrodcoffee.R
import artemis.yanez.jarrodcoffee.databinding.FragmentJarrodContactBinding


class JarrodContactFragment : Fragment() {

    private var binding: FragmentJarrodContactBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val fragmentBinding = FragmentJarrodContactBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

}