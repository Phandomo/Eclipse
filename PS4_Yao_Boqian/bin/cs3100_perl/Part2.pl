
# The loop reads all of the file into $text
while (<STDIN>)
{
	$text .= $_;
}

# Replace each comment with ""
#  Option g = global (replace all matches)
$text =~ s!(//.*)!!g;
print $text;