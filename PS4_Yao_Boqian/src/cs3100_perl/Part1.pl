
# The loop reads all of the file into $text
$text="";
while (<STDIN>)
{
	$text .= $_;
}

# Replace each comment with "COMMENT"
#  Option g = global (replace all matches)
#  Option s = let . match newlines
$text =~ s!(\s\d{3}-\d{2}-\d{4}\s)! ###-##-#### !gm;
print $text;