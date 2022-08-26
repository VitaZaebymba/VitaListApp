package com.example.vitalist.fragments

import androidx.appcompat.app.AppCompatActivity
import com.example.vitalist.R


/*когда в активити будем помещать фрагмент, нам нужно знать, какой
фрагмент сейчас рабочий
 */

object FragmentManager {
    var currentFrag: BaseFragment? = null

    //функция для переключения между фрагментами
    fun setFragment(newFrag: BaseFragment, activity: AppCompatActivity){
        val transaction = activity.supportFragmentManager.beginTransaction() //класс, который переключает фрагменты
        transaction.replace(R.id.placeHolder, newFrag) //место, куда хотим поместить фрагмент на разметке
        transaction.commit()
        currentFrag = newFrag
    }
}