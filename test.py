from sys import stdin
import heapq

def createGraph( n):
    global padre,rank
    padre = [x for x in range(n)]
    rank = [0 for x in range(n)]

def find(x):
    
    global padre,rank
    if(padre[x]!=x):
          padre[x]=find(padre[x])
    return padre[x]

def union(x, y):
    
    global padre,rank
    xRaiz = find(x)
    yRaiz = find(y)
    if(xRaiz == yRaiz):       return
    if rank[xRaiz] < rank[yRaiz]:
        padre[xRaiz] = yRaiz
    elif rank[xRaiz] > rank[yRaiz]:
        padre[yRaiz] = xRaiz
        
    else:
        padre[yRaiz] = xRaiz
        rank[xRaiz]+=1
            
def kruskal (n):
    global padre,rank,listaArcos
    
    ans = 0
    padre = list()
    rank = list()
    createGraph(n)
    cantidadDeNodos = n
   
    for edge in listaArcos:
        w , u , v = edge
        if find(u) != find(v):
            union (u,v)
            ans+=w
            cantidadDeNodos -= 1
            if cantidadDeNodos == 1:
               break 
    return ans

def operacion (x, y):
    a = (x[0]-y[0])**2
    b = (x[1]-y[1])**2
    return (a+b)**0.5
    
def main():
    global tupla, grafo , listaArcos
    n = int (stdin.readline().strip())
    flang = 0 
    for i in range (n):
        stdin.readline().strip()
        c = int (stdin.readline().strip())
        grafo = []
        tupla = []
        if(flang):print()
        flang = 1
        for k in range (c):
            l = [float (x) for x in stdin.readline().strip().split()]
            grafo.append(l)

        listaArcos = []
        for p in range (c):
            peca1 = grafo[p]
            for r in range (c):
                peca2 = grafo[r]
                if r == p:
                    continue
                else:
                    listaArcos.append([operacion(peca1,peca2),p,r])
                    
        listaArcos.sort()
    
        print('%.2f'% kruskal(c+1))
main()


