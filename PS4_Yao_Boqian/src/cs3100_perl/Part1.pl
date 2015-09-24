$text="";
# The loop reads all of the file into $text
while (<STDIN>)
{
	$text .= $_;
	$text =~ s!(\s|^)\d{3}-\d{2}-\d{4}(\s|$)!$1###-##-####$2!gs;    
}
print $text;

