def fib(n):
    res=[]
    a,b=0,1
    while(b<=n):
        res.append(b)
        a,b=b,b+a
    return res

class FibIter:
    def __init__(self,n):
        self.f0=0
        self.f1=1
        self.n=n
        self.i=0
    def __iter__(self):
        return self
    def __next__(self):
        if self.i>=10:
            raise StopIteration()
        self.f0,self.f1=self.f1,self.f0+self.f1
        self.i+=1
        return self.f0


class RevIter:
    def __init__(self,seq):
        self.seq=seq
        
        self.l=len(self.seq)
    def __iter__(self):
        return self
    def __next__(self):
        if self.l == 0:
            raise StopIteration()
        self.l-=1
        return self.seq[self.l]
