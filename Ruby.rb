a = gets().chomp().to_i
for i in (2..a).step(2) do
  printf("%d^%d = %d\n",i,2,i*i);
end
