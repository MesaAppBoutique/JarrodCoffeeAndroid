package artemis.yanez.jarrodcoffee.viewmodel

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.ViewModel

class JarrodViewModel: ViewModel() {

    fun getToasty(context: Context, message: String, toastType: Int){
        Toast.makeText(context, message, toastType).show()
    }


}