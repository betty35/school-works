import queue
from zhihu import ZhihuClient
import pymysql
import time


q=queue.Queue(maxsize=0)
q.put('http://www.zhihu.com/people/fluoricia')
s=set()
already=set()



try:
# 获取一个数据库连接，注意如果是UTF-8类型的，需要制定数据库
    conn=pymysql.connect(host='127.0.0.1',
                       user='root',
                       passwd='',
                       db='zhihu',
                       port=3306,
                       charset='utf8')

    cur=conn.cursor()#获取一个游标
    sql="INSERT INTO `person` (`id`, `name`,`followers`,`business`,`education`,`gender`) VALUES (%s, %s,%s,%s,%s,%s)"


    Cookies_File = 'zhihucookie.json'
    client = ZhihuClient(Cookies_File)
    i=1
    while(q.not_empty):
        url=q.get()
        if(i>500):
            break
        if(url not in s):
            s.add(url)
            time.sleep(1)
            author = client.author(url)
            print(author.name)
            for followee in author.followees:
                if(followee.follower_num>100000):
                    new_url=followee.url
                    if((new_url not in s) & (followee.id not in already)):
                        q.put(new_url)
                        i=i+1
                        id=followee.id
                        name=followee.name
                        business=followee.business
                        education=followee.education
                        gender=followee.gender
                        followers=str(followee.follower_num)
                        cur.execute(sql,(id,name,followers,business,education,gender))
                        conn.commit()
                        already.add(followee.id)
finally:
    conn.close()
    print('干完啦~')





