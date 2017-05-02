package gabrieljones.interpolators

import contextual.{Interpolator, Prefix}

object dateTimeFormat extends {

  object DateTimeFormatInterpolator extends Interpolator with DateTimeFormatter {
    def contextualize(interpolation: StaticInterpolation) = {
      val lit@Literal(idx, string) = interpolation.parts.head
      ofPattern(string)
      Nil
    }

    def evaluate(interpolation: RuntimeInterpolation) = {
      val lit@Literal(_, string) = interpolation.parts.head
      ofPattern(string)
    }
  }

  implicit class ProtoStringContext(sc: StringContext) { val dateTimeFormat = Prefix(DateTimeFormatInterpolator, sc) }
}
