package gabrieljones.interpolators

trait DateTimeFormatter {
  def ofPattern(pattern: String) = java.time.format.DateTimeFormatter.ofPattern(pattern)
}
