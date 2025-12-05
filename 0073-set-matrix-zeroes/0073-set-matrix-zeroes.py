class Solution:
    def make(self, matrix: List[List[int]], row: int, col: int) -> None:
        for i in range(0, len(matrix)):
            if matrix[i][col]!=0:
                matrix[i][col]=float("inf")
        for j in range(0, len(matrix[0])):
            if matrix[row][j]!=0:
                matrix[row][j]=float("inf")

                
    def setZeroes(self, matrix: List[List[int]]) -> None:
        # for i in range(0, len(matrix)):
        #     for j in range(0, len(matrix[0])):
        #         if matrix[i][j]==0:
        #             self.make(matrix, i, j);
        
        # for i in range(0, len(matrix)):
        #     for j in range(0, len(matrix[0])):
        #         if matrix[i][j]==float("inf"):
        #             matrix[i][j]=0;

        n = len(matrix)
        m = len(matrix[0])

        rows= [False for _ in range(0, n)]
        cols=[False for _ in range(0,m)]
        
        for i in range(0, n):
            for j in range(0, m):
                if matrix[i][j]==0:
                    rows[i]=True
                    cols[j]=True
        
        for i in range(0, n):
            for j in range(0, m):
                if rows[i] or cols[j]:
                    matrix[i][j]=0