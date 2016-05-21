with open('/home/lisa/Documents/3TC/ELP/TD/TD12_python/species-intro.txt') as f :
    d=dict()
    for line in f:
        words=[word.lower() for word in line.split()] 
        for word in words:
            for c in ".:,;?!()'\"{}":
                if c in word :
                    word= word.replace(c,'')

            if word not in d:
                d[word]=1
            else :
                d[word]+=1

    for k, v in d.items():
        print(k,"=",v)
         
    
            
