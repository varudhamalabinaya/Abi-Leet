class Solution(object):
    def containsDuplicate(self, nums):
        count1 = {}  
        for i in nums:
            if i in count1:  
                return True  
            count1[i] = 1 
        return False  
        