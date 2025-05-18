# https://leetcode.com/problems/pascals-triangle/description/

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        list = []
        for i in range(1, numRows + 1):
            temp = self.generateRows(i)
            list.append(temp)
        return list
    def generateRows(self, row: int) -> List[int]:
        li = []
        ans = 1
        li.append(ans)
        for i in range(1, row):
            ans *= (row - i)
            ans //= i
            li.append(ans)
        return li
