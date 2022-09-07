onmessage = getMessage

function getMessage(event)
{
    console.log(event.data)
    sumofnos(event.data)
}

function sumofnos(num)
{
    console.log('calculationg');
    var sum = 0, i =1;
    for(;i<=num;i++)
    {
        sum+=i;
    }
    console.log(sum)
    postMessage(sum)
}