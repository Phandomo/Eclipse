open STDIN, "../files/Part2.txt";

# The loop reads all of the file into $text
while (<STDIN>)
{
	$text .= $_;
}

# Replace each comment with "COMMENT"
#  Option g = global (replace all matches)
#  Option s = let . match newlines
$text =~ s!(//\s*[\D|\d|\s]*?.*?)!COMMENT!gs;
print $text;