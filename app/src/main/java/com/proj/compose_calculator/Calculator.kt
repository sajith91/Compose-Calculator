package com.proj.compose_calculator

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun Calculator(
    state: CalculatorState,
    modifier: Modifier = Modifier
) {
   Box(modifier = modifier){
       Column(
           modifier = Modifier
               .fillMaxWidth()
               .align(Alignment.BottomCenter)
       ) {
          Text(text = state.number1 + (state.operation?: "") + state.number2)
       }
   }
}