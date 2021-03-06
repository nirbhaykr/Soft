require 'ruble'
require 'ruble/ui'
 
command t(:insert_color) do |cmd|
  cmd.key_binding = 'M1+M2+C'
  cmd.scope = 'source.css'
  cmd.output = :insert_as_text
  cmd.input = :none
  cmd.invoke do |context|
    colour = $stdin.read
    if colour.length > 0 and colour[0] != ?#
      colour.downcase!
      require 'colors'
      # Convert named colours to their hex values
      colour = '#' + COLOURS[colour] if COLOURS.has_key? colour
    end
    
    result = Ruble::UI.request_color(colour)
    result.nil? ? colour : result
  end
end