
# Consider one line at a time; store it in $_
while (<STDIN>)
{
    # Increment $count for each match found
    #  Option g = global (consider all matches)   
	while (m/(^|\s)\(\d{3}\)\s?\d{3}-\d{4}($|\s)/g)
	{
		$count++;
	}
}

print $count;