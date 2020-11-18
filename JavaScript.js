var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
input = input.replace('\n',' ');
var lines=input.split(' ');
var N = parseInt(lines.shift());
var i,Z;
if(N>5 && N<2000)
{
    for(i=2;i<=N;i=i+2)
    {
     Z = Math.pow(i,2);
     console.log(i+"^2 = "+Z);
    }
}
