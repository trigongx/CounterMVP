package com.example.countermvp

import android.graphics.Color
import com.example.countermvp.model.CounterModel
import com.example.countermvp.view.CounterView

class Presenter(var counterView: CounterView){

    private val model = CounterModel()

    fun increment(){
        model.increment()
        counterView.showCount(model.number)

        if (model.number == 10){
            counterView.showToast("Поздравляем")
        }

        if (model.number == 15){
            counterView.setTextColor(Color.GREEN)
        }
    }

    fun decrement(){
        model.decrement()
        counterView.showCount(model.number)

        if (model.number <= 14){
            counterView.resetTextColor(Color.BLACK)
        }
    }


}