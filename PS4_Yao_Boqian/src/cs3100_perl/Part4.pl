$text = "";
while (<STDIN>)
{        
   while (m/(((["'])((\\{2})*|(.*?[^\\](\\{2})*)))\3)/g)
    { 
    	$text.="$1"."\n";
    }        
}
print $text;