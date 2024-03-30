
def br():
    print('\n',"-"*70,sep="\n")

br()
num = int(input("Enter number : "))+1
br()

list = []
for index in range(1,num):
    list.append([])
    for count in range(1,index+1):
        list[index-1].append(index*count)
      
br()
print(list)
br()
