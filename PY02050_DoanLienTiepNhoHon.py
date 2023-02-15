n = int(input())
for i in range(n):
    m = int(input())
    a = list(map(int,input().split()))
    for j in range(m):
        dem =1
        for k in range(j):
            if a[k]<a[j]:
                dem +=1
        print(dem,end=" ")