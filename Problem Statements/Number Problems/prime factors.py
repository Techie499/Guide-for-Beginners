n=int(input("Enter a number"))
for i in range(2,n+1):
    if ((n%i)==0):
        isp=1
        for j in range(2,(i//2)+1):
            if ((i%j)==0):
                isp=0
                break
        if (isp==1):
            print(i,end=" ")
