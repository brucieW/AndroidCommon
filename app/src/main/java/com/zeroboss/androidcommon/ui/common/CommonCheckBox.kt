package com.zeroboss.androidcommon.ui.common

import Blue800
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.zeroboss.androidcommon.ui.theme.normalText

@Preview
@Composable
fun CommonCheckBox(
    text: String = "Test",
    checkStateChanged: (checked: Boolean) -> Unit = {},
    modifier: Modifier = Modifier,
    checked: Boolean = true,
    checkEndPadding: Dp = 10.dp,
    textStyle: TextStyle = TextStyle.Default,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.SpaceBetween
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = horizontalArrangement,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = text,
            style = textStyle,
            modifier = Modifier.padding(end = 5.dp)
        )

        Checkbox(
            modifier = Modifier
                .padding(top = 10.dp, end = checkEndPadding),
            checked = checked,
            onCheckedChange = {
                checkStateChanged(it)
            },
            colors = CheckboxDefaults.colors(
                checkedColor = Blue800,
                uncheckedColor = Blue800,
                checkmarkColor = Color.White
            )
        )
    }
}