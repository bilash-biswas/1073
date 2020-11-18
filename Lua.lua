a = io.read("*n")
for i = 2,a,2 do
    print(i.."^2 = "..math.floor( (math.pow(i,2))))
end
