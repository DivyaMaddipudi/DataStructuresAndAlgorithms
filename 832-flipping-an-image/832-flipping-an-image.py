class Solution:
    def flipAndInvertImage(self, image: List[List[int]]) -> List[List[int]]:
        p=[]
        for i in image:
            p.append(self.reverse(i))
            
        return p
        
    def reverse(self, list):
        l=0
        r=len(list)-1
        while l<r:
            list[l],list[r]=list[r],list[l]
            if list[l]==0:
                list[l]=1
            else:
                list[l]=0
            if list[r]==0:
                list[r]=1
            else:
                list[r]=0
            l=l+1
            r=r-1
        if len(list)%2==1:
            if list[len(list)//2]==0:
                list[len(list)//2]=1
            else:
                list[len(list)//2]=0
        return list