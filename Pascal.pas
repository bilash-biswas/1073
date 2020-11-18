var
N,Z:int64;
i:integer;
begin
   read(N);
    if((N > 5) and (N < 2000))then
      for i := 2 to N do
      begin
         if((i mod 2) = 0)then
         begin
            Z := i * i;
            writeln(i ,'^2 = ', Z);
         end
      end
end.
