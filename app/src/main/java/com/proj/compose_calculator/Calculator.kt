package com.proj.compose_calculator

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Calculator(
    state: CalculatorState,
    buttonSpacing : Dp = 8.dp,
    modifier: Modifier = Modifier
) {
   Box(modifier = modifier){
       Column(
           modifier = Modifier
               .fillMaxWidth()
               .align(Alignment.BottomCenter),
           verticalArrangement = Arrangement.spacedBy(buttonSpacing)
       ) {
          Text(
              text = state.number1 + (state.operation?: "") + state.number2,
              textAlign = TextAlign.End,
              modifier = Modifier
                  .fillMaxWidth()
                  .padding(vertical = 32.dp),
              fontSize = 80.sp,
              fontWeight = FontWeight.Light,
              color = Color.White,
              maxLines = 2
          )
       }
   }
}