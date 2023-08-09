package com.example.test.appcomponent

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.test.ui.theme.primary
import com.example.test.ui.theme.tertiary

@Composable
fun AppCheckbox(
    modifier: Modifier = Modifier,
    text: String,
    icon: (@Composable () -> Unit)? = null,
    checked: Boolean,
    onCheckedChange: (it: Boolean) -> Unit
) {
    Row(modifier = modifier.wrapContentWidth(), verticalAlignment = Alignment.CenterVertically) {
        Text(text)
        if (icon != null) icon()
        Checkbox(
            checked = checked,
            onCheckedChange = onCheckedChange,
            colors = CheckboxDefaults.colors(checkedColor = tertiary)
        )
    }
}
