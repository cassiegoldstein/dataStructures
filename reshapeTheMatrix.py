def matrixReshape(mat, r, c):
    flat = sum(mat, [])
    matrix = []
    if len(flat)%r == 0:
        divide = int(len(flat)/r)
        if divide != 0:
            for i in range(0, len(flat), divide):
                matrix.append(flat[i:divide+i])
            return matrix
        else:
            return mat
    else:
        return mat
    



mat = [[1,2,3,4,5,6],[7,8,9,10,11,12],[13,14,15,16,17,18],[19,20,21,22,23,24],[25,26,27,28,29,30]]
r = 22
c = 15

print(matrixReshape(mat,r,c))
