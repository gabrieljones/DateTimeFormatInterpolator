package gabrieljones.interpolators

trait DateTimeFormatter {
  def ofPattern(pattern: String) = org.threeten.bp.format.DateTimeFormatter.ofPattern(pattern)
}
