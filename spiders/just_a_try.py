import queue

q=queue.Queue(0)
str='135a'
q.put(str)
q.put('246b')
q.put(str)

while(q.not_empty):
    t=q.get()
    print(t)


