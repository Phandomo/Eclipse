open STDIN, "../files/Part1.txt";

# Store successive lines into $_
while (<STDIN>)
{
    # Loop over matches in $_
    #  Option g = global (all matches)
    while (m/(\d{3}-\d{2}-\d{4})/g)
    {
        # Print the capture groups
        print "$1\n";
    }
}