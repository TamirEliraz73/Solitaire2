# 📝 StyledText – Custom Text Rendering for Jetpack Compose

A simple and flexible wrapper for Jetpack Compose's `Text` component, offering intuitive configuration of font, alignment, max lines, overflow behavior, and optional container styling — all in a clean Kotlin DSL.

---

## 🚀 Features

- ✅ Fluent DSL via `TextProps` builder
- 🎨 Integrated layout styling (`padding`, `margin`, `background`, etc.) via `StyleProps`
- 🌍 Support for string resources using `IRString`
- 🧼 Clean overloads with sensible defaults
- 🧩 Easy to extend or integrate into any design system

---

## ⚙️ Usage

### Minimal example

```kotlin
StyledText("Hello Compose")
```

### Custom text styling with DSL

```kotlin
StyledText("Hello!") {
    fontSize = 18
    color = Color.Blue
    fontWeight = FontWeight.Bold
    textAlign = TextAlign.Center
}
```

### Localized string resource

```kotlin
StyledText(IRString(R.string.welcome_message)) {
    fontSize = 20
    style = StyleProps(
        padding = SpacingStyle(all = 12),
        backgroundColor = Color(0xFFEFEFEF),
        cornerRadius = 8
    )
}
```

---

## 💡 API Reference

### @Composable StyledText(...)

Overloads:

```kotlin
StyledText(text: String)
StyledText(text: String, build: TextProps.() -> Unit)
StyledText(text: String, props: TextProps)

StyledText(text: IRString)
StyledText(text: IRString, build: TextProps.() -> Unit)
StyledText(text: IRString, props: TextProps)
```

### 📦 `TextProps`

Used to define how text is rendered.

```kotlin
class TextProps {
    var fontSize: Int? = null // in sp
    var color: Color = Color.Unspecified
    var fontWeight: FontWeight? = null
    var textAlign: TextAlign? = null
    var maxLines: Int = Int.MAX_VALUE
    var overflow: TextOverflow = TextOverflow.Clip
    var style: StyleProps? = null
}
```

### 📐 `StyleProps`

Optional container styling for the text box.

```kotlin
data class StyleProps(
    val padding: SpacingStyle? = null,
    val margin: SpacingStyle? = null,
    val backgroundColor: Color? = null,
    val border: BorderStyle? = null,
    val cornerRadius: CornerRadius? = null,
    val shadow: ShadowStyle? = null
)
```

### 🔲 `SpacingStyle`

```kotlin
data class SpacingStyle(
    val all: Int? = null,
    val horizontal: Int? = null,
    val vertical: Int? = null,
    val start: Int? = null,
    val end: Int? = null,
    val top: Int? = null,
    val bottom: Int? = null
)
```

### 🎯 `BorderStyle`

```kotlin
data class BorderStyle(
    val width: Int,
    val color: Color
)
```

### 🌫️ `ShadowStyle`

```kotlin
data class ShadowStyle(
    val elevation: Int,
    val color: Color = Color.Black
)
```

### 🟦 `CornerRadius`

```kotlin
typealias CornerRadius = Int // In pixels
```

---

## 🧠 Design Philosophy

This component is designed with three main goals:

1. **Clean DSL** – Build `TextProps` the same way you build `Modifier`.
2. **Visual hierarchy** – Let you embed layout styling (padding, background) in the same place.
3. **Minimal friction** – Smart defaults + overloads reduce boilerplate.

---

## 📎 License

MIT (or customize as needed)

---

## 🔗 Related

- [`Text`](https://developer.android.com/reference/kotlin/androidx/compose/material/Text)
- [`stringResource`](https://developer.android.com/jetpack/compose/resources#string)